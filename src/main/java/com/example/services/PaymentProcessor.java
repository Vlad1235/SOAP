package com.example.services;


import com.example.dto.PaymentProcessorRequest;
import com.example.dto.PaymentProcessorResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "PaymentProcessor") // теперь это станет web service
public interface PaymentProcessor {

  @WebMethod
  @WebResult(name = "PaymentProcessorResponse") PaymentProcessorResponse processPayment(@WebParam(name = "paymentProcessorRequest") PaymentProcessorRequest request);
}
