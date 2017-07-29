package com.google.android.gms.b;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class ht
  extends a
{
  public static final Parcelable.Creator<ht> CREATOR = new hu();
  private ParcelFileDescriptor a;
  
  public ht()
  {
    this(null);
  }
  
  public ht(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    a = paramParcelFileDescriptor;
  }
  
  /* Error */
  public final boolean a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 26	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	ht
    //   12	7	1	bool	boolean
    //   6	2	2	localParcelFileDescriptor	ParcelFileDescriptor
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  /* Error */
  public final java.io.InputStream b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 26	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: new 31	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   20: dup
    //   21: aload_0
    //   22: getfield 26	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   25: invokespecial 32	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   28: astore_1
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 26	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   34: goto -21 -> 13
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	ht
    //   1	28	1	localObject1	Object
    //   37	4	1	localObject2	Object
    //   8	2	2	localParcelFileDescriptor	ParcelFileDescriptor
    // Exception table:
    //   from	to	target	type
    //   4	9	37	finally
    //   17	34	37	finally
  }
  
  final ParcelFileDescriptor c()
  {
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = a;
      return localParcelFileDescriptor;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hu.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/ht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */