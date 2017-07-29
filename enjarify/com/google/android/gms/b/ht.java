package com.google.android.gms.b;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ht
  extends a
{
  public static final Parcelable.Creator CREATOR;
  private ParcelFileDescriptor a;
  
  static
  {
    hu localhu = new com/google/android/gms/b/hu;
    localhu.<init>();
    CREATOR = localhu;
  }
  
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
    //   3: getfield 22	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: aconst_null
    //   20: astore_1
    //   21: goto -8 -> 13
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	ht
    //   6	15	1	localParcelFileDescriptor	ParcelFileDescriptor
    //   24	4	1	localObject	Object
    //   12	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	24	finally
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
    //   5: getfield 22	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: new 25	android/os/ParcelFileDescriptor$AutoCloseInputStream
    //   20: astore_1
    //   21: aload_0
    //   22: getfield 22	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   25: astore_2
    //   26: aload_1
    //   27: aload_2
    //   28: invokespecial 26	android/os/ParcelFileDescriptor$AutoCloseInputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
    //   31: aconst_null
    //   32: astore_2
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 22	com/google/android/gms/b/ht:a	Landroid/os/ParcelFileDescriptor;
    //   38: goto -25 -> 13
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	this	ht
    //   1	26	1	localObject1	Object
    //   41	4	1	localObject2	Object
    //   8	25	2	localParcelFileDescriptor	ParcelFileDescriptor
    // Exception table:
    //   from	to	target	type
    //   4	8	41	finally
    //   17	20	41	finally
    //   21	25	41	finally
    //   27	31	41	finally
    //   34	38	41	finally
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */