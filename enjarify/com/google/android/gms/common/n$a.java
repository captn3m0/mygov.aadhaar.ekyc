package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ab.a;
import com.google.android.gms.common.internal.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class n$a
  extends ab.a
{
  private int a;
  
  protected n$a(byte[] paramArrayOfByte)
  {
    int k = paramArrayOfByte.length;
    String str1;
    int m;
    int n;
    int i1;
    if (k != i)
    {
      str1 = "GoogleCertificates";
      m = paramArrayOfByte.length;
      n = paramArrayOfByte.length;
      if (paramArrayOfByte != null)
      {
        k = paramArrayOfByte.length;
        if ((k != 0) && (n > 0))
        {
          k = n + 0;
          i1 = paramArrayOfByte.length;
          if (k <= i1) {
            break label241;
          }
        }
      }
      k = 0;
    }
    label241:
    StringBuilder localStringBuilder2;
    for (Object localObject1 = null;; localObject1 = localStringBuilder2.toString())
    {
      localObject1 = String.valueOf(localObject1);
      i1 = String.valueOf(localObject1).length() + 51;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>(i1);
      Object localObject3 = ((StringBuilder)localObject2).append("Cert hash data has incorrect length (").append(m);
      localObject2 = "):\n";
      localObject1 = (String)localObject2 + (String)localObject1;
      localObject3 = new java/lang/Exception;
      ((Exception)localObject3).<init>();
      Log.wtf(str1, (String)localObject1, (Throwable)localObject3);
      paramArrayOfByte = Arrays.copyOfRange(paramArrayOfByte, 0, i);
      k = paramArrayOfByte.length;
      if (k == i) {
        bool = j;
      }
      k = paramArrayOfByte.length;
      j = 55;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(j);
      StringBuilder localStringBuilder1 = ((StringBuilder)localObject3).append("cert hash data has incorrect length. length=");
      localObject1 = k;
      c.b(bool, localObject1);
      k = Arrays.hashCode(paramArrayOfByte);
      a = k;
      return;
      k = (n + 16 + -1) / 16 * 57;
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>(k);
      i1 = 0;
      localObject3 = null;
      k = n;
      int i2 = 0;
      if (k > 0)
      {
        int i3;
        Object[] arrayOfObject;
        Integer localInteger;
        String str2;
        if (i2 == 0)
        {
          i3 = 65536;
          if (n < i3)
          {
            arrayOfObject = new Object[j];
            localInteger = Integer.valueOf(i1);
            arrayOfObject[0] = localInteger;
            str2 = String.format("%04X:", arrayOfObject);
            localStringBuilder2.append(str2);
          }
        }
        for (;;)
        {
          arrayOfObject = new Object[j];
          int i4 = paramArrayOfByte[i1] & 0xFF;
          localInteger = Integer.valueOf(i4);
          arrayOfObject[0] = localInteger;
          str2 = String.format(" %02X", arrayOfObject);
          localStringBuilder2.append(str2);
          i3 = k + -1;
          k = i2 + 1;
          i2 = 16;
          if ((k == i2) || (i3 == 0))
          {
            localStringBuilder2.append('\n');
            k = 0;
            localObject1 = null;
          }
          i1 += 1;
          i2 = k;
          k = i3;
          break;
          arrayOfObject = new Object[j];
          localInteger = Integer.valueOf(i1);
          arrayOfObject[0] = localInteger;
          str2 = String.format("%08X:", arrayOfObject);
          localStringBuilder2.append(str2);
          continue;
          i3 = 8;
          if (i2 == i3)
          {
            str2 = " -";
            localStringBuilder2.append(str2);
          }
        }
      }
    }
  }
  
  protected static byte[] a(String paramString)
  {
    String str = "ISO-8859-1";
    try
    {
      return paramString.getBytes(str);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      AssertionError localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>(localUnsupportedEncodingException);
      throw localAssertionError;
    }
  }
  
  public final a a()
  {
    return b.a(c());
  }
  
  public final int b()
  {
    return hashCode();
  }
  
  abstract byte[] c();
  
  public boolean equals(Object paramObject)
  {
    boolean bool1;
    Object localObject1;
    if (paramObject != null)
    {
      bool1 = paramObject instanceof ab;
      if (bool1) {}
    }
    else
    {
      bool1 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool1;
      try
      {
        paramObject = (ab)paramObject;
        int i = ((ab)paramObject).b();
        int j = hashCode();
        if (i != j)
        {
          i = 0;
          localObject1 = null;
        }
        else
        {
          localObject1 = ((ab)paramObject).a();
          if (localObject1 == null)
          {
            i = 0;
            localObject1 = null;
          }
          else
          {
            localObject1 = b.a((a)localObject1);
            localObject1 = (byte[])localObject1;
            localObject3 = c();
            bool2 = Arrays.equals((byte[])localObject3, (byte[])localObject1);
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject3 = "GoogleCertificates";
        String str = "Failed to get Google certificates from remote";
        Log.e((String)localObject3, str, localRemoteException);
        boolean bool2 = false;
        Object localObject2 = null;
      }
    }
  }
  
  public int hashCode()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/common/n$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */