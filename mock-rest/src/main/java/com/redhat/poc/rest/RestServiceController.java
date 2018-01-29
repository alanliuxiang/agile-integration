package com.redhat.poc.rest;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.redhat.poc.rest.model.Success;

/**
 * 
 * @author kylin
 *
 */
@RestController
public class RestServiceController {
	
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/rest/mock/ping")
    public Success greeting() {
        return new Success(counter.getAndIncrement(), "Success!");
    }
	
	@RequestMapping("/rest/mock/placeHolder")
	public Object addTransaction(@RequestParam(value="fundNumber") Integer fundNumber
			                     , @RequestParam(value="balance", defaultValue="50000") Integer balance
			                     , @RequestParam(value="denied", defaultValue="false") Boolean denied
			                     , @RequestParam(value="deniedCause", defaultValue="none") String deniedCause
			                     , @RequestParam(value="transactionType") String transactionType
			                     , @RequestParam(value="fundName") String fundName
			                     , @RequestParam(value="fundType", defaultValue="Currency") String fundType
			                     , @RequestParam(value="fundStatus", defaultValue="Inactive") String fundStatus) throws Exception {
		
		return "placeHolder";
	}
	
	@RequestMapping("/quickies/greeting/hi/{name}")
	public String sayHi(@PathVariable("name")String name) {
		return "Hi " + name + "!";
	}
	
	@RequestMapping("/quickies/greeting/getTime")
	public String getTime() {
		return new Date().toString();
	}


	
	
}
