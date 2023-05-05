package com.itheima.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Brian
 * @version 1.0
 */
//@WebFilter(urlPatterns = "/*")
public class AbcFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Abc 拦截到了请求...放行前逻辑");
        // 放行
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("Abc 拦截到了请求...放行后逻辑");
    }
}
