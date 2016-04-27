/*
 * Copyright (c) 2016 chenchi.me. All Rights Reserved.
 */
package common.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author chichen  Date: 16-4-27 Time: 下午2:34
 */
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Empty
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Empty
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Empty
    }
}
