package com.kh.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Controller {
	public ModelAndView handle(HttpServletRequest request,HttpServletResponse response) throws Exception;
}