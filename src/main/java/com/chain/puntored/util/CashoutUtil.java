package com.chain.puntored.util;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;

import com.chain.puntored.dto.ApiResponseDTO;

public class CashoutUtil {
	public static final Map<Integer, Integer> accountBalance = new HashMap<Integer, Integer>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
	    put(10000, 20);
	    put(20000, 20);
	    put(50000, 10);
	    put(100000, 2);
	}};

	public static int getBalance() {
		AtomicInteger balance = new AtomicInteger(0);
		accountBalance.forEach((k,v)->{
			balance.addAndGet(k * v);
		});
		return balance.get();
	}
	
	public static HttpStatus findHttpStatusResponse(ApiResponseDTO<?> response) {
		// TODO Auto-generated method stub
		return HttpStatus.OK;
	}
}
