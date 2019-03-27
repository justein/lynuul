package com.nova.lyn.lynuul.filter;

/**
 * @ClassName PreFilter
 * @Description 后置过滤器
 * @Author Lyn
 * @Date 2019/3/27 0027 下午 3:56
 * @Version 1.0
 */
public class PostFilter extends LynuulFilter {

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public void run() {

    }
}
