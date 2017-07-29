package com.google.android.gms.b;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.util.h;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class qz
  extends a
{
  public static final Parcelable.Creator CREATOR;
  ParcelFileDescriptor a;
  private Parcelable b;
  private boolean c;
  
  static
  {
    ra localra = new com/google/android/gms/b/ra;
    localra.<init>();
    CREATOR = localra;
  }
  
  qz(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    a = paramParcelFileDescriptor;
    b = null;
    c = true;
  }
  
  public qz(SafeParcelable paramSafeParcelable)
  {
    a = null;
    b = paramSafeParcelable;
    c = false;
  }
  
  private static ParcelFileDescriptor a(byte[] paramArrayOfByte)
  {
    ParcelFileDescriptor localParcelFileDescriptor = null;
    for (;;)
    {
      try
      {
        ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
        int i = 1;
        localObject1 = arrayOfParcelFileDescriptor[i];
        localAutoCloseOutputStream = new android/os/ParcelFileDescriptor$AutoCloseOutputStream;
        localAutoCloseOutputStream.<init>((ParcelFileDescriptor)localObject1);
        tp.b("Error transporting the ad response", localIOException1);
      }
      catch (IOException localIOException1)
      {
        try
        {
          localObject1 = new com/google/android/gms/b/qz$1;
          ((qz.1)localObject1).<init>(localAutoCloseOutputStream, paramArrayOfByte);
          localObject2 = new java/lang/Thread;
          ((Thread)localObject2).<init>((Runnable)localObject1);
          ((Thread)localObject2).start();
          localObject1 = null;
          localParcelFileDescriptor = arrayOfParcelFileDescriptor[0];
          return localParcelFileDescriptor;
        }
        catch (IOException localIOException2)
        {
          Object localObject1;
          ParcelFileDescriptor.AutoCloseOutputStream localAutoCloseOutputStream;
          Object localObject2;
          for (;;) {}
        }
        localIOException1 = localIOException1;
        i = 0;
        localAutoCloseOutputStream = null;
      }
      localObject1 = w.i();
      localObject2 = "LargeParcelTeleporter.pipeData.2";
      ((tj)localObject1).a(localIOException1, (String)localObject2);
      h.a(localAutoCloseOutputStream);
    }
  }
  
  public final SafeParcelable a(Parcelable.Creator paramCreator)
  {
    boolean bool = c;
    Object localObject1;
    if (bool)
    {
      localObject1 = a;
      if (localObject1 == null)
      {
        tp.c("File descriptor is empty, returning null.");
        bool = false;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return (SafeParcelable)localObject1;
      localObject4 = new java/io/DataInputStream;
      localObject1 = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
      Object localObject5 = a;
      ((ParcelFileDescriptor.AutoCloseInputStream)localObject1).<init>((ParcelFileDescriptor)localObject5);
      ((DataInputStream)localObject4).<init>((InputStream)localObject1);
      try
      {
        i = ((DataInputStream)localObject4).readInt();
        localObject1 = new byte[i];
        localObject5 = null;
        j = localObject1.length;
        ((DataInputStream)localObject4).readFully((byte[])localObject1, 0, j);
        h.a((Closeable)localObject4);
        localObject4 = Parcel.obtain();
        localObject5 = null;
      }
      catch (IOException localIOException)
      {
        int i;
        int j;
        localIOException = localIOException;
        localObject5 = new java/lang/IllegalStateException;
        String str = "Could not read from parcel file descriptor";
        ((IllegalStateException)localObject5).<init>(str, localIOException);
        throw ((Throwable)localObject5);
      }
      finally
      {
        h.a((Closeable)localObject4);
      }
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = a;
    Parcel localParcel;
    if (localObject1 == null) {
      localParcel = Parcel.obtain();
    }
    try
    {
      localObject1 = b;
      ((Parcelable)localObject1).writeToParcel(localParcel, 0);
      localObject1 = localParcel.marshall();
      localParcel.recycle();
      localObject1 = a((byte[])localObject1);
      a = ((ParcelFileDescriptor)localObject1);
      ra.a(this, paramParcel, paramInt);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              com/google/android/gms/b/qz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */