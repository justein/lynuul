package com.nova.lyn.lynuul.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName PreFilter
 * @Description 前置过滤器，封装请求参数等
 * @Author Lyn
 * @Date 2019/3/27 0027 下午 3:56
 * @Version 1.0
 */
public class PreFilter extends LynuulFilter {

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
