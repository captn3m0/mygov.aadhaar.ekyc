package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract interface bm
  extends IInterface
{
  public abstract boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt);
  
  public abstract int getIntFlagValue(String paramString, int paramInt1, int paramInt2);
  
  public abstract long getLongFlagValue(String paramString, long paramLong, int paramInt);
  
  public abstract String getStringFlagValue(String paramString1, String paramString2, int paramInt);
  
  public abstract void init(a parama);
  
  public static abstract class a
    extends Binder
    implements bm
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }
    
    public static bm asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
      if ((localIInterface != null) && ((localIInterface instanceof bm))) {
        return (bm)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int i = 0;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.flags.IFlagProvider");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
        init(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
        String str = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (boolean bool = true;; bool = false)
        {
          bool = getBooleanFlagValue(str, bool, paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramInt1 = i;
          if (bool) {
            paramInt1 = 1;
          }
          paramParcel2.writeInt(paramInt1);
          return true;
        }
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
        paramInt1 = getIntFlagValue(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
        long l = getLongFlagValue(paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeLong(l);
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.flags.IFlagProvider");
      paramParcel1 = getStringFlagValue(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    }
    
    private static final class a
      implements bm
    {
      private IBinder a;
      
      a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
      
      /* Error */
      public final boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 30
        //   17: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload 6
        //   22: aload_1
        //   23: invokevirtual 37	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   26: iload_2
        //   27: ifeq +65 -> 92
        //   30: iconst_1
        //   31: istore 4
        //   33: aload 6
        //   35: iload 4
        //   37: invokevirtual 41	android/os/Parcel:writeInt	(I)V
        //   40: aload 6
        //   42: iload_3
        //   43: invokevirtual 41	android/os/Parcel:writeInt	(I)V
        //   46: aload_0
        //   47: getfield 17	com/google/android/gms/b/bm$a$a:a	Landroid/os/IBinder;
        //   50: iconst_2
        //   51: aload 6
        //   53: aload 7
        //   55: iconst_0
        //   56: invokeinterface 47 5 0
        //   61: pop
        //   62: aload 7
        //   64: invokevirtual 50	android/os/Parcel:readException	()V
        //   67: aload 7
        //   69: invokevirtual 54	android/os/Parcel:readInt	()I
        //   72: istore_3
        //   73: iload_3
        //   74: ifeq +24 -> 98
        //   77: iload 5
        //   79: istore_2
        //   80: aload 7
        //   82: invokevirtual 57	android/os/Parcel:recycle	()V
        //   85: aload 6
        //   87: invokevirtual 57	android/os/Parcel:recycle	()V
        //   90: iload_2
        //   91: ireturn
        //   92: iconst_0
        //   93: istore 4
        //   95: goto -62 -> 33
        //   98: iconst_0
        //   99: istore_2
        //   100: goto -20 -> 80
        //   103: astore_1
        //   104: aload 7
        //   106: invokevirtual 57	android/os/Parcel:recycle	()V
        //   109: aload 6
        //   111: invokevirtual 57	android/os/Parcel:recycle	()V
        //   114: aload_1
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	paramString	String
        //   0	116	2	paramBoolean	boolean
        //   0	116	3	paramInt	int
        //   31	63	4	i	int
        //   1	77	5	bool	boolean
        //   6	104	6	localParcel1	Parcel
        //   11	94	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	26	103	finally
        //   33	73	103	finally
      }
      
      public final int getIntFlagValue(String paramString, int paramInt1, int paramInt2)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          a.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramInt1 = localParcel2.readInt();
          return paramInt1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final long getLongFlagValue(String paramString, long paramLong, int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
          localParcel1.writeString(paramString);
          localParcel1.writeLong(paramLong);
          localParcel1.writeInt(paramInt);
          a.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramLong = localParcel2.readLong();
          return paramLong;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getStringFlagValue(String paramString1, String paramString2, int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.flags.IFlagProvider");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeInt(paramInt);
          a.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString1 = localParcel2.readString();
          return paramString1;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final void init(a parama)
      {
        // Byte code:
        //   0: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 30
        //   11: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +42 -> 57
        //   18: aload_1
        //   19: invokeinterface 81 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 84	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/bm$a$a:a	Landroid/os/IBinder;
        //   34: iconst_1
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 47 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 50	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 57	android/os/Parcel:recycle	()V
        //   52: aload_2
        //   53: invokevirtual 57	android/os/Parcel:recycle	()V
        //   56: return
        //   57: aconst_null
        //   58: astore_1
        //   59: goto -34 -> 25
        //   62: astore_1
        //   63: aload_3
        //   64: invokevirtual 57	android/os/Parcel:recycle	()V
        //   67: aload_2
        //   68: invokevirtual 57	android/os/Parcel:recycle	()V
        //   71: aload_1
        //   72: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	a
        //   0	73	1	parama	a
        //   3	65	2	localParcel1	Parcel
        //   7	57	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	62	finally
        //   18	25	62	finally
        //   25	48	62	finally
      }
    }
  }
}


/* Location:              com/google/android/gms/b/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */