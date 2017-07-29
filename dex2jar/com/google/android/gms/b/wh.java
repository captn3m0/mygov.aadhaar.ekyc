package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface wh
  extends IInterface
{
  public abstract void a(wg paramwg);
  
  public abstract void a(wg paramwg, wb paramwb);
  
  public abstract void b(wg paramwg);
  
  public abstract void c(wg paramwg);
  
  public abstract void d(wg paramwg);
  
  public static abstract class a
    extends Binder
    implements wh
  {
    public static wh a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      if ((localIInterface != null) && ((localIInterface instanceof wh))) {
        return (wh)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        paramParcel2 = wg.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (wb)wb.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a(paramParcel2, paramParcel1);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        a(wg.a.a(paramParcel1.readStrongBinder()));
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        b(wg.a.a(paramParcel1.readStrongBinder()));
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        c(wg.a.a(paramParcel1.readStrongBinder()));
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
      d(wg.a.a(paramParcel1.readStrongBinder()));
      return true;
    }
    
    private static final class a
      implements wh
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final void a(wg paramwg)
      {
        IBinder localIBinder = null;
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
          if (paramwg != null) {
            localIBinder = paramwg.asBinder();
          }
          localParcel.writeStrongBinder(localIBinder);
          a.transact(2, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      /* Error */
      public final void a(wg paramwg, wb paramwb)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore 4
        //   7: aload 4
        //   9: ldc 27
        //   11: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +10 -> 25
        //   18: aload_1
        //   19: invokeinterface 37 1 0
        //   24: astore_3
        //   25: aload 4
        //   27: aload_3
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_2
        //   32: ifnull +37 -> 69
        //   35: aload 4
        //   37: iconst_1
        //   38: invokevirtual 54	android/os/Parcel:writeInt	(I)V
        //   41: aload_2
        //   42: aload 4
        //   44: iconst_0
        //   45: invokevirtual 60	com/google/android/gms/b/wb:writeToParcel	(Landroid/os/Parcel;I)V
        //   48: aload_0
        //   49: getfield 17	com/google/android/gms/b/wh$a$a:a	Landroid/os/IBinder;
        //   52: iconst_1
        //   53: aload 4
        //   55: aconst_null
        //   56: iconst_1
        //   57: invokeinterface 46 5 0
        //   62: pop
        //   63: aload 4
        //   65: invokevirtual 49	android/os/Parcel:recycle	()V
        //   68: return
        //   69: aload 4
        //   71: iconst_0
        //   72: invokevirtual 54	android/os/Parcel:writeInt	(I)V
        //   75: goto -27 -> 48
        //   78: astore_1
        //   79: aload 4
        //   81: invokevirtual 49	android/os/Parcel:recycle	()V
        //   84: aload_1
        //   85: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	86	0	this	a
        //   0	86	1	paramwg	wg
        //   0	86	2	paramwb	wb
        //   1	27	3	localIBinder	IBinder
        //   5	75	4	localParcel	Parcel
        // Exception table:
        //   from	to	target	type
        //   7	14	78	finally
        //   18	25	78	finally
        //   25	31	78	finally
        //   35	48	78	finally
        //   48	63	78	finally
        //   69	75	78	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
      
      public final void b(wg paramwg)
      {
        IBinder localIBinder = null;
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
          if (paramwg != null) {
            localIBinder = paramwg.asBinder();
          }
          localParcel.writeStrongBinder(localIBinder);
          a.transact(3, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public final void c(wg paramwg)
      {
        IBinder localIBinder = null;
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
          if (paramwg != null) {
            localIBinder = paramwg.asBinder();
          }
          localParcel.writeStrongBinder(localIBinder);
          a.transact(4, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public final void d(wg paramwg)
      {
        IBinder localIBinder = null;
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
          if (paramwg != null) {
            localIBinder = paramwg.asBinder();
          }
          localParcel.writeStrongBinder(localIBinder);
          a.transact(5, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/wh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */