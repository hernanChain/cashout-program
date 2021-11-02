package com.chain.puntored.util;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;

import com.chain.puntored.dto.ApiResponseDTO;

public class CashoutUtil {
	public static final Map<Integer, Integer> accountBalance = new TreeMap<Integer, Integer>(Collections.reverseOrder()) {
	{
		put(100000, 2);
		put(50000, 10);
		put(20000, 20);
	    put(10000, 20);
	}
	private static final long serialVersionUID = 3839464259273336870L;
	};

	public static int getBalance() {
		AtomicInteger balance = new AtomicInteger(0);
		accountBalance.forEach((k,v)->{
			balance.addAndGet(k * v);
		});
		return balance.get();
	}
	
	public static HttpStatus findHttpStatusResponse(ApiResponseDTO<?> response) {
		// TODO Auto-generated method stub
		if(!response.getState()) {
			return HttpStatus.FORBIDDEN;
		}
		return HttpStatus.OK;
	}
}
