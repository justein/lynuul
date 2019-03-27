package com.nova.lyn.lynuul.filter;

/**
 * @ClassName LynuulFilter
 * @Description 网关过滤器的抽象实现
 * @Author Lyn
 * @Date 2019/3/27 0027 下午 4:40
 * @Version 1.0
 */
public abstract class LynuulFilter {
    //过滤器类型
    public abstract String filterType();
    //过滤器顺序
    public abstract int filterOrder();
    //执行逻辑
    public abstract void run();
}
