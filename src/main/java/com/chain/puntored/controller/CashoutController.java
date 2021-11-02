package com.chain.puntored.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chain.puntored.dto.AmountDTO;
import com.chain.puntored.dto.ApiResponseDTO;
import com.chain.puntored.dto.CashoutResponseDTO;
import com.chain.puntored.service.CashoutService;
import com.chain.puntored.util.CashoutUtil;

@RestController
public class CashoutController {

	@Autowired
	CashoutService cashoutService;
	
	@PostMapping(value = "/cashout",consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<ApiResponseDTO<CashoutResponseDTO>> cashout(@Valid @RequestBody AmountDTO amount) {
		ApiResponseDTO<CashoutResponseDTO> response;
		response = cashoutService.cashout(amount);
		return new ResponseEntity<>(response, CashoutUtil.findHttpStatusResponse(response));
	}
	
}
