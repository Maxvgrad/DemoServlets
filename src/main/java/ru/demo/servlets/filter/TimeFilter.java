package ru.demo.servlets.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * Filter for measuring requests duration
 */
@WebFilter("/index")
public class TimeFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = System.nanoTime();
        chain.doFilter(request, response);
        System.out.println("Request duration: " +
                (System.nanoTime() - start));
    }
}
