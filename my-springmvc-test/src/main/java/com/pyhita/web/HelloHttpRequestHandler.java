package com.pyhita.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;

import java.io.IOException;

@Controller("/helloReq")
public class HelloHttpRequestHandler implements HttpRequestHandler {
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("hello HttpRequestHandler .....");
	}
}
