package com.google.android.gms.b;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

public abstract class bg<K, V>
{
  private static final String a = bg.class.getSimpleName();
  
  protected static <K, V> HashMap<K, V> b(String paramString)
  {
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        paramString = (HashMap)new ObjectInputStream(new ByteArrayInputStream(Base64.decode(paramString.getBytes(), 0))).readObject();
        return paramString;
      }
    }
    catch (ClassNotFoundException paramString)
    {
      Log.d(a, "decode object failure");
      return null;
    }
    catch (IOException paramString)
    {
      for (;;) {}
    }
  }
  
  protected abstract HashMap<K, V> a();
  
  protected abstract void a(String paramString);
  
  public String toString()
  {
    try
    {
      Object localObject = new ByteArrayOutputStream();
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream((OutputStream)localObject);
      localObjectOutputStream.writeObject(a());
      localObjectOutputStream.close();
      localObject = Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 0);
      return (String)localObject;
    }
    catch (IOException localIOException) {}
    return null;
  }
}


/* Location:              com/google/android/gms/b/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */