/**
 * 
 */
package com.cloudswagger.source.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manoj Fernando A
 *
 */
@RestController
@RequestMapping("/api")
public class BaseController {
	
	//Testing for GIT change
	@RequestMapping("/getTest")
	public String test() {
		return "success";
	}

}
