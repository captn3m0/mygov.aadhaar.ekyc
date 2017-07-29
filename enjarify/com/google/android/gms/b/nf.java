package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.ads.internal.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

final class nf
{
  final ih a;
  final String b;
  final int c;
  
  private nf(ih paramih, String paramString, int paramInt)
  {
    a = paramih;
    b = paramString;
    c = paramInt;
  }
  
  nf(nc paramnc)
  {
    this(localih, str, i);
  }
  
  static nf a(String paramString)
  {
    Object localObject1 = paramString.split("\000");
    int i = localObject1.length;
    int j = 3;
    if (i != j)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Incorrect field count for QueueSeed.");
      throw ((Throwable)localObject1);
    }
    Parcel localParcel = Parcel.obtain();
    j = 0;
    Object localObject3 = null;
    try
    {
      localObject3 = localObject1[0];
      str = null;
      localObject3 = Base64.decode((String)localObject3, 0);
      str = new java/lang/String;
      Object localObject4 = "UTF-8";
      str.<init>((byte[])localObject3, (String)localObject4);
      j = 1;
      localObject3 = localObject1[j];
      j = Integer.parseInt((String)localObject3);
      int k = 2;
      localObject1 = localObject1[k];
      k = 0;
      localObject4 = null;
      localObject1 = Base64.decode((String)localObject1, 0);
      k = 0;
      localObject4 = null;
      int m = localObject1.length;
      localParcel.unmarshall((byte[])localObject1, 0, m);
      localObject1 = null;
      localParcel.setDataPosition(0);
      localObject1 = ih.CREATOR;
      localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel);
      localObject1 = (ih)localObject1;
      localObject4 = new com/google/android/gms/b/nf;
      ((nf)localObject4).<init>((ih)localObject1, str, j);
      localParcel.recycle();
      return (nf)localObject4;
    }
    finally
    {
      try
      {
        localObject3 = w.i();
        String str = "QueueSeed.decode";
        ((tj)localObject3).a(localThrowable, str);
        localObject3 = new java/io/IOException;
        str = "Malformed QueueSeed encoding.";
        ((IOException)localObject3).<init>(str, localThrowable);
        throw ((Throwable)localObject3);
      }
      finally
      {
        localParcel.recycle();
      }
    }
  }
  
  final String a()
  {
    localParcel = Parcel.obtain();
    try
    {
      localObject1 = b;
      String str2 = "UTF-8";
      localObject1 = ((String)localObject1).getBytes(str2);
      int i = 0;
      str2 = null;
      localObject1 = Base64.encodeToString((byte[])localObject1, 0);
      i = c;
      str2 = Integer.toString(i);
      Object localObject3 = a;
      int j = 0;
      String str3 = null;
      ((ih)localObject3).writeToParcel(localParcel, 0);
      localObject3 = localParcel.marshall();
      j = 0;
      str3 = null;
      localObject3 = Base64.encodeToString((byte[])localObject3, 0);
      str3 = String.valueOf(localObject1);
      j = str3.length() + 2;
      Object localObject4 = String.valueOf(str2);
      int k = ((String)localObject4).length();
      j += k;
      localObject4 = String.valueOf(localObject3);
      k = ((String)localObject4).length();
      j += k;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>(j);
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      str3 = "\000";
      localObject1 = ((StringBuilder)localObject1).append(str3);
      localObject1 = ((StringBuilder)localObject1).append(str2);
      str2 = "\000";
      localObject1 = ((StringBuilder)localObject1).append(str2);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "QueueSeed encode failed because UTF-8 is not available.";
        tp.c(str1);
        localParcel.recycle();
        str1 = "";
      }
    }
    finally
    {
      localParcel.recycle();
    }
    return (String)localObject1;
  }
}


/* Location:              com/google/android/gms/b/nf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */