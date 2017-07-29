package com.google.android.gms.b;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@qi
public final class hl
{
  private final int a;
  private final int b;
  private final int c;
  private final hk d = new hn();
  
  public hl(int paramInt)
  {
    b = paramInt;
    a = 6;
    c = 0;
  }
  
  private String a(String paramString)
  {
    Object localObject1 = paramString.split("\n");
    if (localObject1.length == 0) {
      return "";
    }
    paramString = new a();
    Object localObject2 = new PriorityQueue(b, new Comparator() {});
    int i = 0;
    while (i < localObject1.length)
    {
      String[] arrayOfString = hm.a(localObject1[i], false);
      if (arrayOfString.length != 0) {
        ho.a(arrayOfString, b, a, (PriorityQueue)localObject2);
      }
      i += 1;
    }
    localObject1 = ((PriorityQueue)localObject2).iterator();
    for (;;)
    {
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ho.a)((Iterator)localObject1).next();
        try
        {
          paramString.a(d.a(b));
        }
        catch (IOException localIOException)
        {
          tp.b("Error while writing hash to byteStream", localIOException);
        }
      }
    }
    return paramString.toString();
  }
  
  public final String a(ArrayList<String> paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      localStringBuffer.append(((String)paramArrayList.next()).toLowerCase(Locale.US));
      localStringBuffer.append('\n');
    }
    return a(localStringBuffer.toString());
  }
  
  static final class a
  {
    ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
    Base64OutputStream b = new Base64OutputStream(a, 10);
    
    public final void a(byte[] paramArrayOfByte)
    {
      b.write(paramArrayOfByte);
    }
    
    public final String toString()
    {
      try
      {
        b.close();
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          try
          {
            a.close();
            String str = a.toString();
            return str;
          }
          catch (IOException localIOException2)
          {
            tp.b("HashManager: Unable to convert to Base64.", localIOException2);
            return "";
          }
          finally
          {
            a = null;
            b = null;
          }
          localIOException1 = localIOException1;
          tp.b("HashManager: Unable to convert to Base64.", localIOException1);
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/hl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */