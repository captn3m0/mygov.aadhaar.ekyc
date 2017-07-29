package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract interface ae
  extends IInterface
{
  public abstract a a();
  
  public abstract boolean a(String paramString, a parama);
  
  public abstract a b();
  
  public abstract boolean b(String paramString, a parama);
  
  public static abstract class a
    extends Binder
    implements ae
  {
    public static ae a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      if ((localIInterface != null) && ((localIInterface instanceof ae))) {
        return (ae)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      a locala2 = null;
      a locala1 = null;
      int i = 0;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        locala2 = a();
        paramParcel2.writeNoException();
        paramParcel1 = locala1;
        if (locala2 != null) {
          paramParcel1 = locala2.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        locala1 = b();
        paramParcel2.writeNoException();
        paramParcel1 = locala2;
        if (locala1 != null) {
          paramParcel1 = locala1.asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        bool = a(paramParcel1.readString(), a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (bool) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          paramParcel2.writeInt(paramInt1);
          return true;
        }
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
      boolean bool = b(paramParcel1.readString(), a.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    
    private static final class a
      implements ae
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final a a()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
          a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          a locala = a.a.a(localParcel2.readStrongBinder());
          return locala;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean a(String paramString, a parama)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 4
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload 5
        //   22: aload_1
        //   23: invokevirtual 56	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   26: aload_2
        //   27: ifnull +63 -> 90
        //   30: aload_2
        //   31: invokeinterface 61 1 0
        //   36: astore_1
        //   37: aload 5
        //   39: aload_1
        //   40: invokevirtual 64	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   43: aload_0
        //   44: getfield 17	com/google/android/gms/common/internal/ae$a$a:a	Landroid/os/IBinder;
        //   47: iconst_3
        //   48: aload 5
        //   50: aload 6
        //   52: iconst_0
        //   53: invokeinterface 37 5 0
        //   58: pop
        //   59: aload 6
        //   61: invokevirtual 40	android/os/Parcel:readException	()V
        //   64: aload 6
        //   66: invokevirtual 68	android/os/Parcel:readInt	()I
        //   69: istore_3
        //   70: iload_3
        //   71: ifeq +6 -> 77
        //   74: iconst_1
        //   75: istore 4
        //   77: aload 6
        //   79: invokevirtual 52	android/os/Parcel:recycle	()V
        //   82: aload 5
        //   84: invokevirtual 52	android/os/Parcel:recycle	()V
        //   87: iload 4
        //   89: ireturn
        //   90: aconst_null
        //   91: astore_1
        //   92: goto -55 -> 37
        //   95: astore_1
        //   96: aload 6
        //   98: invokevirtual 52	android/os/Parcel:recycle	()V
        //   101: aload 5
        //   103: invokevirtual 52	android/os/Parcel:recycle	()V
        //   106: aload_1
        //   107: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	108	0	this	a
        //   0	108	1	paramString	String
        //   0	108	2	parama	a
        //   69	2	3	i	int
        //   1	87	4	bool	boolean
        //   6	96	5	localParcel1	Parcel
        //   11	86	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	26	95	finally
        //   30	37	95	finally
        //   37	70	95	finally
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
      
      public final a b()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGoogleCertificatesApi");
          a.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          a locala = a.a.a(localParcel2.readStrongBinder());
          return locala;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean b(String paramString, a parama)
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 4
        //   3: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 27
        //   17: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload 5
        //   22: aload_1
        //   23: invokevirtual 56	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   26: aload_2
        //   27: ifnull +63 -> 90
        //   30: aload_2
        //   31: invokeinterface 61 1 0
        //   36: astore_1
        //   37: aload 5
        //   39: aload_1
        //   40: invokevirtual 64	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   43: aload_0
        //   44: getfield 17	com/google/android/gms/common/internal/ae$a$a:a	Landroid/os/IBinder;
        //   47: iconst_4
        //   48: aload 5
        //   50: aload 6
        //   52: iconst_0
        //   53: invokeinterface 37 5 0
        //   58: pop
        //   59: aload 6
        //   61: invokevirtual 40	android/os/Parcel:readException	()V
        //   64: aload 6
        //   66: invokevirtual 68	android/os/Parcel:readInt	()I
        //   69: istore_3
        //   70: iload_3
        //   71: ifeq +6 -> 77
        //   74: iconst_1
        //   75: istore 4
        //   77: aload 6
        //   79: invokevirtual 52	android/os/Parcel:recycle	()V
        //   82: aload 5
        //   84: invokevirtual 52	android/os/Parcel:recycle	()V
        //   87: iload 4
        //   89: ireturn
        //   90: aconst_null
        //   91: astore_1
        //   92: goto -55 -> 37
        //   95: astore_1
        //   96: aload 6
        //   98: invokevirtual 52	android/os/Parcel:recycle	()V
        //   101: aload 5
        //   103: invokevirtual 52	android/os/Parcel:recycle	()V
        //   106: aload_1
        //   107: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	108	0	this	a
        //   0	108	1	paramString	String
        //   0	108	2	parama	a
        //   69	2	3	i	int
        //   1	87	4	bool	boolean
        //   6	96	5	localParcel1	Parcel
        //   11	86	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	26	95	finally
        //   30	37	95	finally
        //   37	70	95	finally
      }
    }
  }
}


/* Location:              com/google/android/gms/common/internal/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */