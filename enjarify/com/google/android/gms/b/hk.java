package com.google.android.gms.b;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class hk
{
  private static MessageDigest b = null;
  protected Object a;
  
  public hk()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  protected final MessageDigest a()
  {
    synchronized (a)
    {
      MessageDigest localMessageDigest = b;
      if (localMessageDigest != null)
      {
        localMessageDigest = b;
        return localMessageDigest;
      }
      int i = 0;
      localMessageDigest = null;
      for (;;)
      {
        int j = 2;
        if (i >= j) {
          break;
        }
        Object localObject3 = "MD5";
        try
        {
          localObject3 = MessageDigest.getInstance((String)localObject3);
          b = (MessageDigest)localObject3;
        }
        catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
        {
          for (;;) {}
        }
        i += 1;
      }
      localMessageDigest = b;
    }
  }
  
  abstract byte[] a(String paramString);
}


/* Location:              com/google/android/gms/b/hk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */