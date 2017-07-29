package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public abstract interface wg
  extends IInterface
{
  public abstract void a(Status paramStatus);
  
  public abstract void a(Status paramStatus, long paramLong);
  
  public abstract void b(Status paramStatus);
  
  public abstract void b(Status paramStatus, long paramLong);
  
  public abstract void c(Status paramStatus);
  
  public static abstract class a
    extends Binder
    implements wg
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }
    
    public static wg a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof wg))) {
        return (wg)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject2 = null;
      Object localObject3 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      Object localObject1 = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        paramParcel2 = (Parcel)localObject1;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        }
        a(paramParcel2);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        paramParcel2 = (Parcel)localObject2;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        }
        b(paramParcel2);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        paramParcel2 = (Parcel)localObject3;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        }
        a(paramParcel2, paramParcel1.readLong());
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        paramParcel2 = (Parcel)localObject4;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        }
        c(paramParcel2);
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
      paramParcel2 = (Parcel)localObject5;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      b(paramParcel2, paramParcel1.readLong());
      return true;
    }
    
    private static final class a
      implements wg
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      /* Error */
      public final void a(Status paramStatus)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 27
        //   7: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +33 -> 44
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 41	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 17	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
        //   29: iconst_1
        //   30: aload_2
        //   31: aconst_null
        //   32: iconst_1
        //   33: invokeinterface 47 5 0
        //   38: pop
        //   39: aload_2
        //   40: invokevirtual 50	android/os/Parcel:recycle	()V
        //   43: return
        //   44: aload_2
        //   45: iconst_0
        //   46: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   49: goto -24 -> 25
        //   52: astore_1
        //   53: aload_2
        //   54: invokevirtual 50	android/os/Parcel:recycle	()V
        //   57: aload_1
        //   58: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	59	0	this	a
        //   0	59	1	paramStatus	Status
        //   3	51	2	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   4	10	52	finally
        //   14	25	52	finally
        //   25	39	52	finally
        //   44	49	52	finally
      }
      
      /* Error */
      public final void a(Status paramStatus, long paramLong)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: aload 4
        //   7: ldc 27
        //   9: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   12: aload_1
        //   13: ifnull +43 -> 56
        //   16: aload 4
        //   18: iconst_1
        //   19: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   22: aload_1
        //   23: aload 4
        //   25: iconst_0
        //   26: invokevirtual 41	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload 4
        //   31: lload_2
        //   32: invokevirtual 55	android/os/Parcel:writeLong	(J)V
        //   35: aload_0
        //   36: getfield 17	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
        //   39: iconst_3
        //   40: aload 4
        //   42: aconst_null
        //   43: iconst_1
        //   44: invokeinterface 47 5 0
        //   49: pop
        //   50: aload 4
        //   52: invokevirtual 50	android/os/Parcel:recycle	()V
        //   55: return
        //   56: aload 4
        //   58: iconst_0
        //   59: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   62: goto -33 -> 29
        //   65: astore_1
        //   66: aload 4
        //   68: invokevirtual 50	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	paramStatus	Status
        //   0	73	2	paramLong	long
        //   3	64	4	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   5	12	65	finally
        //   16	29	65	finally
        //   29	50	65	finally
        //   56	62	65	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
      
      /* Error */
      public final void b(Status paramStatus)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 27
        //   7: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +33 -> 44
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 41	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 17	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
        //   29: iconst_2
        //   30: aload_2
        //   31: aconst_null
        //   32: iconst_1
        //   33: invokeinterface 47 5 0
        //   38: pop
        //   39: aload_2
        //   40: invokevirtual 50	android/os/Parcel:recycle	()V
        //   43: return
        //   44: aload_2
        //   45: iconst_0
        //   46: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   49: goto -24 -> 25
        //   52: astore_1
        //   53: aload_2
        //   54: invokevirtual 50	android/os/Parcel:recycle	()V
        //   57: aload_1
        //   58: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	59	0	this	a
        //   0	59	1	paramStatus	Status
        //   3	51	2	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   4	10	52	finally
        //   14	25	52	finally
        //   25	39	52	finally
        //   44	49	52	finally
      }
      
      /* Error */
      public final void b(Status paramStatus, long paramLong)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: aload 4
        //   7: ldc 27
        //   9: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   12: aload_1
        //   13: ifnull +43 -> 56
        //   16: aload 4
        //   18: iconst_1
        //   19: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   22: aload_1
        //   23: aload 4
        //   25: iconst_0
        //   26: invokevirtual 41	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
        //   29: aload 4
        //   31: lload_2
        //   32: invokevirtual 55	android/os/Parcel:writeLong	(J)V
        //   35: aload_0
        //   36: getfield 17	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
        //   39: iconst_5
        //   40: aload 4
        //   42: aconst_null
        //   43: iconst_1
        //   44: invokeinterface 47 5 0
        //   49: pop
        //   50: aload 4
        //   52: invokevirtual 50	android/os/Parcel:recycle	()V
        //   55: return
        //   56: aload 4
        //   58: iconst_0
        //   59: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   62: goto -33 -> 29
        //   65: astore_1
        //   66: aload 4
        //   68: invokevirtual 50	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	paramStatus	Status
        //   0	73	2	paramLong	long
        //   3	64	4	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   5	12	65	finally
        //   16	29	65	finally
        //   29	50	65	finally
        //   56	62	65	finally
      }
      
      /* Error */
      public final void c(Status paramStatus)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: aload_2
        //   5: ldc 27
        //   7: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   10: aload_1
        //   11: ifnull +33 -> 44
        //   14: aload_2
        //   15: iconst_1
        //   16: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   19: aload_1
        //   20: aload_2
        //   21: iconst_0
        //   22: invokevirtual 41	com/google/android/gms/common/api/Status:writeToParcel	(Landroid/os/Parcel;I)V
        //   25: aload_0
        //   26: getfield 17	com/google/android/gms/b/wg$a$a:a	Landroid/os/IBinder;
        //   29: iconst_4
        //   30: aload_2
        //   31: aconst_null
        //   32: iconst_1
        //   33: invokeinterface 47 5 0
        //   38: pop
        //   39: aload_2
        //   40: invokevirtual 50	android/os/Parcel:recycle	()V
        //   43: return
        //   44: aload_2
        //   45: iconst_0
        //   46: invokevirtual 35	android/os/Parcel:writeInt	(I)V
        //   49: goto -24 -> 25
        //   52: astore_1
        //   53: aload_2
        //   54: invokevirtual 50	android/os/Parcel:recycle	()V
        //   57: aload_1
        //   58: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	59	0	this	a
        //   0	59	1	paramStatus	Status
        //   3	51	2	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   4	10	52	finally
        //   14	25	52	finally
        //   25	39	52	finally
        //   44	49	52	finally
      }
    }
  }
}


/* Location:              com/google/android/gms/b/wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */