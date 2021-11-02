package com.chain.puntored.service;

import com.chain.puntored.dto.AmountDTO;
import com.chain.puntored.dto.ApiResponseDTO;
import com.chain.puntored.dto.CashoutResponseDTO;

public interface CashoutService {

	public ApiResponseDTO<CashoutResponseDTO> cashout(AmountDTO amount);
	
}
