package com.google.android.gms.b;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

public abstract class bg
{
  private static final String a = bg.class.getSimpleName();
  
  protected static HashMap b(String paramString)
  {
    try
    {
      bool = TextUtils.isEmpty(paramString);
      if (bool) {
        break label64;
      }
      localObject1 = new java/io/ByteArrayInputStream;
      localObject2 = paramString.getBytes();
      localObject2 = Base64.decode((byte[])localObject2, 0);
      ((ByteArrayInputStream)localObject1).<init>((byte[])localObject2);
      localObject2 = new java/io/ObjectInputStream;
      ((ObjectInputStream)localObject2).<init>((InputStream)localObject1);
      localObject1 = ((ObjectInputStream)localObject2).readObject();
      localObject1 = (HashMap)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        String str = a;
        Object localObject2 = "decode object failure";
        Log.d(str, (String)localObject2);
        boolean bool = false;
        str = null;
      }
    }
    catch (IOException localIOException)
    {
      label64:
      for (;;) {}
    }
    return (HashMap)localObject1;
  }
  
  protected abstract HashMap a();
  
  protected abstract void a(String paramString);
  
  public String toString()
  {
    try
    {
      localObject1 = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject1).<init>();
      ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
      localObjectOutputStream.<init>((OutputStream)localObject1);
      HashMap localHashMap = a();
      localObjectOutputStream.writeObject(localHashMap);
      localObjectOutputStream.close();
      localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
      localObjectOutputStream = null;
      localObject1 = Base64.encodeToString((byte[])localObject1, 0);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
}


/* Location:              com/google/android/gms/b/bg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */