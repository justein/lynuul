package com.nova.lyn.lynuul.http;

import com.nova.lyn.lynuul.context.RequestContext;
import com.nova.lyn.lynuul.filter.LynuulFilter;
import com.nova.lyn.lynuul.filter.PostFilter;
import com.nova.lyn.lynuul.filter.PreFilter;
import com.nova.lyn.lynuul.filter.RouteFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName LynuulRunner
 * @Description 网关具体的执行器，加载配置，执行具体逻辑
 * @Author Lyn
 * @Date 2019/3/27 0027 下午 4:39
 * @Version 1.0
 */
public class LynuulRunner {

    /**
     * 过滤器初始化操作
     */
    private ConcurrentHashMap<String, List<LynuulFilter>> filterMaps = new ConcurrentHashMap<String, List<LynuulFilter>>() {
        {
            put("pre", new ArrayList<LynuulFilter>() {
                        {
                            add(new PreFilter());
                        }
                    }
            );
        }

        {
            put("route", new ArrayList<LynuulFilter>() {
                {
                    add(new RouteFilter());
                }
            });
        }

        {
            put("post", new ArrayList<LynuulFilter>() {
                {
                    add(new PostFilter());
                }
            });
        }
    };
// TODO Command 扩展
//    public void invokeFilterByCommand() {
//
//    }
    public void invokePreFilter(){
        invokeFilter("pre");
    }

    public void invokeRouteFilter(){
        invokeFilter("route");
    }

    public void invokePostFilter(){
        invokeFilter("post");
    }

    public void init(HttpServletRequest request, HttpServletResponse response) {
        RequestContext requestContext = RequestContext.getCurrentContext();
        requestContext.setRequest(request);
        requestContext.setResponse(response);
    }

    public void invokeFilter(String filterType) {
        List<LynuulFilter> filterList = this.filterMaps.get(filterType);
        filterList.stream().forEach(LynuulFilter::run);
    }


}
