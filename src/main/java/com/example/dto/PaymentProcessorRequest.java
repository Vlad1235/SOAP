package com.example.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorRequest") // jaxb annotation
@XmlAccessorType(XmlAccessType.FIELD) // jaxb
public class PaymentProcessorRequest {

  @XmlElement(name = "creditCardInfo", required = true) // jaxb
  private CreditCardInfo creditCardInfo;
  @XmlElement(name = "amount") // jaxb
  private Double amount;

  public CreditCardInfo getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

}
