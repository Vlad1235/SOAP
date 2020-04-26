package com.example.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 * конфигурация User Name Token Profile Authentication
 */
public class UTPasswordCallback implements CallbackHandler {

  private Map<String, String> passwords = new HashMap<>(); // в реальном приложении заменить на базу данных

  public UTPasswordCallback() {
    passwords.put("client1", "12345");
    passwords.put("client2", "1357");
  }

  @Override
  public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
    for (Callback callback : callbacks) {
      WSPasswordCallback passwordCallback = (WSPasswordCallback) callback;
      String password = passwords.get(passwordCallback.getIdentifier());
      if (password != null) {
        passwordCallback.setPassword(password);
        return;
      }
    }
  }
}
