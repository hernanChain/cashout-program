package com.chain.puntored.controller.copy2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CashoutController {

	@PostMapping("/cashout")
	public void cashout() {
		System.out.println("Hola");
	}
	
}
