package com.example.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CreditCardInfo") // jaxb
public class CreditCardInfo {

  /*
  по умолчанию, можно не ставить аннотации
   */
  String cardNumber;
  private Date expiryDate;
  String firstName;
  String lastName;
  String secCode;
  String Address;

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSecCode() {
    return secCode;
  }

  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }

}
