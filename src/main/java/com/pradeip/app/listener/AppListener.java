package com.pradeip.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class AppListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent event) {/*
		HttpServletRequest request = (HttpServletRequest) event.getServletRequest();
		if (!request.getServletPath().equals("/counter")) {
			ServletContext context = event.getServletContext();
			context.setAttribute("counter", (int) context.getAttribute("counter") + 1);
		}
	*/}

	@Override
	public void requestInitialized(ServletRequestEvent var1) {
		// TODO Auto-generated method stub

	}

}
