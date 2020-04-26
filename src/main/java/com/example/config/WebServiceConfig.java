package com.example.config;

import com.example.services.PaymentProcessorImpl;
import java.util.HashMap;
import java.util.Map;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.common.ConfigurationConstants;
import org.apache.wss4j.dom.WSConstants;
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
    EndpointImpl endpoint = new EndpointImpl(bus, new PaymentProcessorImpl());
    endpoint.publish("/paymentProcessor");
    Map<String, Object> configs = new HashMap<>();
    configs.put(ConfigurationConstants.ACTION,ConfigurationConstants.USERNAME_TOKEN);
    configs.put(ConfigurationConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
    configs.put(ConfigurationConstants.PW_CALLBACK_CLASS,UTPasswordCallback.class.getName());
    WSS4JInInterceptor wssIn = new WSS4JInInterceptor(configs); // перехват входящих сообщений для исполенения нужной логики
    endpoint.getInInterceptors().add(wssIn);
    return endpoint;
  }
}
