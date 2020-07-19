/**
 * Demo spring web dependency
 */
package com.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.ModelAndView;

/**
 * @author Deepak
 *
 */

@RestController
public class TestController implements ErrorController {
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}

	@GetMapping("/error")
	public String customError() {
		return "The link you followed may be broken, or the page may have been removed.";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
