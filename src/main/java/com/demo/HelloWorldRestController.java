/**
 *
 */
package com.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vullanki
 *
 */
@RestController
public class HelloWorldRestController {

@GetMapping("/hello")
public String sayHello(@RequestParam String msg) {
	return "Hello " + msg;
}


@GetMapping(path = "/calculate/sum/{v1}/{v2}", produces = "application/json")
	public ResponseEntity<Integer> calculateSun(@PathVariable("v1") String v1, @PathVariable("v2") String v2) {

	Integer total = Integer.sum(Integer.parseInt(v1), Integer.parseInt(v2));
	return ResponseEntity.ok(total);
}
}
