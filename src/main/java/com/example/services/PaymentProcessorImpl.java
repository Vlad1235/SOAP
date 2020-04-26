package com.example.services;


import com.example.dto.PaymentProcessorRequest;
import com.example.dto.PaymentProcessorResponse;

/**
 * Класс реализации непосредственной логики для сервиса(сервисов)
 *  не нужно аннотаций, так как на интерфейсе уже установлены
 */
public class PaymentProcessorImpl implements PaymentProcessor {

	public PaymentProcessorResponse processPayment(PaymentProcessorRequest request) {
		PaymentProcessorResponse response = new PaymentProcessorResponse();
		// TODO some process logic
		response.setResult(true);
		return response;
	}

}
