package com.chain.puntored.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseDTO<T> implements Serializable {

	
	private String message = null;
	private Boolean state = null;
	private T data = null;
	
	public void setSuccesTrasaction(T data) {
		this.setMessage("Transaccion Exitosa");
		this.setState(Boolean.TRUE);
		this.setData(data);
	}
	
	public void setFailTrasaction(T data) {
		this.setMessage("Transaccion No Exitosa");
		this.setState(Boolean.FALSE);
		this.setData(data);
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6471455283901530460L;
}
