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
public class CashoutServiceImpl implements CashoutService {

	@Override
	public ApiResponseDTO<CashoutResponseDTO> cashout(AmountDTO amount) {
		Map<Integer, Integer> cashoutResult = new HashMap<Integer, Integer>();
		ApiResponseDTO<CashoutResponseDTO> response = new ApiResponseDTO<>();
		CashoutResponseDTO dataResponse = new CashoutResponseDTO();
		// Validate amount requested
		if (amount.getAmount() % 10000 != 0 || amount.getAmount() > CashoutUtil.getBalance() || CashoutUtil.getBalance() == 0) {
			response.setFailTrasaction(dataResponse, CashoutUtil.getBalance());
			return response;
		}

		CashoutUtil.accountBalance.forEach((k, v) -> {
			if (amount.getAmount() > 0) {
				int withdrawed = Math.floorDiv(amount.getAmount(), k);
				if (withdrawed >= 1) {
					if(withdrawed > v) {
						withdrawed = v;
					}
					cashoutResult.put(k, withdrawed);
					CashoutUtil.accountBalance.put(k, CashoutUtil.accountBalance.get(k) - withdrawed);
					amount.setAmount(amount.getAmount() - k * withdrawed);
				}
			}

		});
		dataResponse.setCashoutResult(cashoutResult);
		response.setSuccesTrasaction(dataResponse, CashoutUtil.getBalance());
		return response;
	}

}
