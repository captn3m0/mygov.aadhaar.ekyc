package com.google.firebase.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public final class a
{
  public static KeyPair a()
  {
    Object localObject = "RSA";
    try
    {
      localObject = KeyPairGenerator.getInstance((String)localObject);
      int i = 2048;
      ((KeyPairGenerator)localObject).initialize(i);
      return ((KeyPairGenerator)localObject).generateKeyPair();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localNoSuchAlgorithmException);
      throw localAssertionError;
    }
  }
}


/* Location:              com/google/firebase/iid/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */