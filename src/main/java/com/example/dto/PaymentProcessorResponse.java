package com.example.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorResponse") // jaxb annotation
public class PaymentProcessorResponse {

  private boolean result;

  public boolean isResult() {
    return result;
  }

  public void setResult(boolean result) {
    this.result = result;
  }
}
