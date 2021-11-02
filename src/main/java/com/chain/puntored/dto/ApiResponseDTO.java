package com.chain.puntored.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseDTO<T> implements Serializable {

	
	private String message = null;
	private Boolean state = false;
	private Integer balance;
	private T data = null;
	
	public void setSuccesTrasaction(T data, Integer balance) {
		this.setMessage("Transaccion Exitosa");
		this.setState(Boolean.TRUE);
		this.setBalance(balance);
		this.setData(data);
	}
	
	public void setFailTrasaction(T data, Integer balance) {
		this.setMessage("Transaccion No Exitosa");
		this.setState(Boolean.FALSE);
		this.setBalance(balance);
		this.setData(data);
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6471455283901530460L;
}
