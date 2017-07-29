package com.google.android.gms.b;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

final class bj$a
  implements Runnable
{
  public final void run()
  {
    Object localObject1 = "MD5";
    try
    {
      localObject1 = MessageDigest.getInstance((String)localObject1);
      bj.a((MessageDigest)localObject1);
      localObject1 = bj.b;
      ((CountDownLatch)localObject1).countDown();
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        CountDownLatch localCountDownLatch = bj.b;
        localCountDownLatch.countDown();
      }
    }
    finally
    {
      bj.b.countDown();
    }
  }
}


/* Location:              com/google/android/gms/b/bj$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */