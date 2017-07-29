package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.ads.internal.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@qi
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
    this(b, c, d);
  }
  
  static nf a(String paramString)
  {
    Object localObject3 = paramString.split("\000");
    if (localObject3.length != 3) {
      throw new IOException("Incorrect field count for QueueSeed.");
    }
    paramString = Parcel.obtain();
    try
    {
      Object localObject1 = new String(Base64.decode(localObject3[0], 0), "UTF-8");
      int i = Integer.parseInt(localObject3[1]);
      localObject3 = Base64.decode(localObject3[2], 0);
      paramString.unmarshall((byte[])localObject3, 0, localObject3.length);
      paramString.setDataPosition(0);
      localObject1 = new nf((ih)ih.CREATOR.createFromParcel(paramString), (String)localObject1, i);
      return (nf)localObject1;
    }
    catch (Throwable localThrowable)
    {
      w.i().a(localThrowable, "QueueSeed.decode");
      throw new IOException("Malformed QueueSeed encoding.", localThrowable);
    }
    finally
    {
      paramString.recycle();
    }
  }
  
  final String a()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      String str1 = Base64.encodeToString(b.getBytes("UTF-8"), 0);
      String str2 = Integer.toString(c);
      a.writeToParcel(localParcel, 0);
      String str3 = Base64.encodeToString(localParcel.marshall(), 0);
      str1 = String.valueOf(str1).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + "\000" + str2 + "\000" + str3;
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      tp.c("QueueSeed encode failed because UTF-8 is not available.");
      return "";
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              com/google/android/gms/b/nf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */