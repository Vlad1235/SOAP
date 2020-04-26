package com.example.config;

import com.example.services.PaymentProcessorImpl;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

  @Autowired
  private Bus bus;

  /*
  создаем webservice
   */
  @Bean
  public Endpoint endpoint() {
    Endpoint endpoint = new EndpointImpl(bus, new PaymentProcessorImpl());
    endpoint.publish("/paymentProcessor");
    return endpoint;
  }
}
