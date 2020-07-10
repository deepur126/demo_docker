/**
 * Demo spring web dependency
 */
package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Deepak
 *
 */
public class TestController {
	@RequestMapping("/index")
	public ModelAndView firstPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}
}
