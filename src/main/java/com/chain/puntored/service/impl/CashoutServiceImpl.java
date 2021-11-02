package com.chain.puntored.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.chain.puntored.dto.AmountDTO;
import com.chain.puntored.dto.ApiResponseDTO;
import com.chain.puntored.dto.CashoutResponseDTO;
import com.chain.puntored.service.CashoutService;
import com.chain.puntored.util.CashoutUtil;

@Service
public class CashoutServiceImpl implements CashoutService{

	@Override
	public ApiResponseDTO<CashoutResponseDTO> cashout(AmountDTO amount) {
		Map<Integer, Integer> cashoutResult = new HashMap();
		ApiResponseDTO<CashoutResponseDTO> response = null;
		CashoutResponseDTO dataResponse = null;
//		if() {
//			
//		}
//		CashoutUtil.accountBalance.forEach((k, v)->{
//			System.out.println("Key: " + k + ": Value: " + v);
//			if(amount.getAmount() == k) {
//				CashoutUtil.accountBalance.put(k, CashoutUtil.accountBalance.get(k)-1);
//				cashoutResult.put(k, v)
//			}
//		});
		System.out.println(CashoutUtil.getBalance());
		return response;
	}

}
