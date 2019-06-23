package com.pradeip.app.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/secure")
public class AppFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("Inside destroy-------->");
		
	}

	@Override
	public void doFilter(ServletRequest var1, ServletResponse var2, FilterChain var3)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig var1) throws ServletException {
		System.out.println("Inside init-------->");
		
	}

}
