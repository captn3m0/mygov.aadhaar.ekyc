package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface ad
  extends IInterface
{
  public abstract void a(ac paramac, s params);
  
  public static abstract class a
    extends Binder
    implements ad
  {
    public static ad a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if ((localIInterface != null) && ((localIInterface instanceof ad))) {
        return (ad)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 > 16777215) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      Object localObject = paramParcel1.readStrongBinder();
      if (localObject == null)
      {
        localObject = null;
        if (paramInt1 != 46) {
          break label123;
        }
        if (paramParcel1.readInt() == 0) {
          break label540;
        }
      }
      label123:
      label540:
      for (paramParcel1 = (s)s.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a((ac)localObject, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface = ((IBinder)localObject).queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
        if ((localIInterface != null) && ((localIInterface instanceof ac)))
        {
          localObject = (ac)localIInterface;
          break;
        }
        localObject = new ac.a.a((IBinder)localObject);
        break;
        if (paramInt1 == 47)
        {
          if (paramParcel1.readInt() != 0) {
            j.CREATOR.createFromParcel(paramParcel1);
          }
          throw new UnsupportedOperationException();
        }
        paramParcel1.readInt();
        if (paramInt1 != 4) {
          paramParcel1.readString();
        }
        switch (paramInt1)
        {
        }
        for (;;)
        {
          throw new UnsupportedOperationException();
          paramParcel1.readStrongBinder();
          if (paramParcel1.readInt() != 0)
          {
            Bundle.CREATOR.createFromParcel(paramParcel1);
            continue;
            paramParcel1.readString();
            paramParcel1.createStringArray();
            paramParcel1.readString();
            if (paramParcel1.readInt() != 0)
            {
              Bundle.CREATOR.createFromParcel(paramParcel1);
              continue;
              paramParcel1.readString();
              paramParcel1.createStringArray();
              paramParcel1.readString();
              paramParcel1.readStrongBinder();
              paramParcel1.readString();
              if (paramParcel1.readInt() != 0)
              {
                Bundle.CREATOR.createFromParcel(paramParcel1);
                continue;
                paramParcel1.createStringArray();
                paramParcel1.readString();
                if (paramParcel1.readInt() != 0)
                {
                  Bundle.CREATOR.createFromParcel(paramParcel1);
                  continue;
                  paramParcel1.readString();
                  paramParcel1.createStringArray();
                  continue;
                  paramParcel1.readString();
                  continue;
                  if (paramParcel1.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(paramParcel1);
                  }
                }
              }
            }
          }
        }
      }
    }
    
    private static final class a
      implements ad
    {
      private final IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      /* Error */
      public final void a(ac paramac, s params)
      {
        // Byte code:
        //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 27
        //   12: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +61 -> 77
        //   19: aload_1
        //   20: invokeinterface 37 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 40	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_2
        //   32: ifnull +50 -> 82
        //   35: aload_3
        //   36: iconst_1
        //   37: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   40: aload_2
        //   41: aload_3
        //   42: iconst_0
        //   43: invokevirtual 50	com/google/android/gms/common/internal/s:writeToParcel	(Landroid/os/Parcel;I)V
        //   46: aload_0
        //   47: getfield 17	com/google/android/gms/common/internal/ad$a$a:a	Landroid/os/IBinder;
        //   50: bipush 46
        //   52: aload_3
        //   53: aload 4
        //   55: iconst_0
        //   56: invokeinterface 56 5 0
        //   61: pop
        //   62: aload 4
        //   64: invokevirtual 59	android/os/Parcel:readException	()V
        //   67: aload 4
        //   69: invokevirtual 62	android/os/Parcel:recycle	()V
        //   72: aload_3
        //   73: invokevirtual 62	android/os/Parcel:recycle	()V
        //   76: return
        //   77: aconst_null
        //   78: astore_1
        //   79: goto -53 -> 26
        //   82: aload_3
        //   83: iconst_0
        //   84: invokevirtual 44	android/os/Parcel:writeInt	(I)V
        //   87: goto -41 -> 46
        //   90: astore_1
        //   91: aload 4
        //   93: invokevirtual 62	android/os/Parcel:recycle	()V
        //   96: aload_3
        //   97: invokevirtual 62	android/os/Parcel:recycle	()V
        //   100: aload_1
        //   101: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	102	0	this	a
        //   0	102	1	paramac	ac
        //   0	102	2	params	s
        //   3	94	3	localParcel1	Parcel
        //   7	85	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	90	finally
        //   19	26	90	finally
        //   26	31	90	finally
        //   35	46	90	finally
        //   46	67	90	finally
        //   82	87	90	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */