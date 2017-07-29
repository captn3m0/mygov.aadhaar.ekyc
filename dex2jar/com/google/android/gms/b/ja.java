package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract interface ja
  extends IInterface
{
  public abstract iv createAdLoaderBuilder(a parama, String paramString, oc paramoc, int paramInt);
  
  public abstract pb createAdOverlay(a parama);
  
  public abstract ix createBannerAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt);
  
  public abstract pi createInAppPurchaseManager(a parama);
  
  public abstract ix createInterstitialAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt);
  
  public abstract lj createNativeAdViewDelegate(a parama1, a parama2);
  
  public abstract rz createRewardedVideoAd(a parama, oc paramoc, int paramInt);
  
  public abstract ix createSearchAdManager(a parama, il paramil, String paramString, int paramInt);
  
  public abstract jc getMobileAdsSettingsManager(a parama);
  
  public abstract jc getMobileAdsSettingsManagerWithClientJarVersion(a parama, int paramInt);
  
  public static abstract class a
    extends Binder
    implements ja
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }
    
    public static ja asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
      if ((localIInterface != null) && ((localIInterface instanceof ja))) {
        return (ja)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      a locala = null;
      Object localObject1 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      Object localObject6 = null;
      Object localObject7 = null;
      Object localObject8 = null;
      Object localObject9 = null;
      Object localObject3 = null;
      Object localObject2 = null;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.ads.internal.client.IClientApi");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        locala = a.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {}
        for (localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          localObject1 = createBannerAdManager(locala, (il)localObject1, paramParcel1.readString(), oc.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramParcel1 = (Parcel)localObject2;
          if (localObject1 != null) {
            paramParcel1 = ((ix)localObject1).asBinder();
          }
          paramParcel2.writeStrongBinder(paramParcel1);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject2 = a.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0) {}
        for (localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
        {
          localObject1 = createInterstitialAdManager((a)localObject2, (il)localObject1, paramParcel1.readString(), oc.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
          paramParcel2.writeNoException();
          paramParcel1 = locala;
          if (localObject1 != null) {
            paramParcel1 = ((ix)localObject1).asBinder();
          }
          paramParcel2.writeStrongBinder(paramParcel1);
          return true;
        }
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject2 = createAdLoaderBuilder(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), oc.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject1;
        if (localObject2 != null) {
          paramParcel1 = ((iv)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = getMobileAdsSettingsManager(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject4;
        if (localObject1 != null) {
          paramParcel1 = ((jc)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = createNativeAdViewDelegate(a.a.a(paramParcel1.readStrongBinder()), a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject5;
        if (localObject1 != null) {
          paramParcel1 = ((lj)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = createRewardedVideoAd(a.a.a(paramParcel1.readStrongBinder()), oc.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject6;
        if (localObject1 != null) {
          paramParcel1 = ((rz)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = createInAppPurchaseManager(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject7;
        if (localObject1 != null) {
          paramParcel1 = ((pi)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = createAdOverlay(a.a.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject8;
        if (localObject1 != null) {
          paramParcel1 = ((pb)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
        localObject1 = getMobileAdsSettingsManagerWithClientJarVersion(a.a.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject9;
        if (localObject1 != null) {
          paramParcel1 = ((jc)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IClientApi");
      localObject2 = a.a.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject1 = createSearchAdManager((a)localObject2, (il)localObject1, paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        paramParcel1 = (Parcel)localObject3;
        if (localObject1 != null) {
          paramParcel1 = ((ix)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder(paramParcel1);
        return true;
      }
    }
    
    private static final class a
      implements ja
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
      public final iv createAdLoaderBuilder(a parama, String paramString, oc paramoc, int paramInt)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 5
        //   3: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 30
        //   17: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +91 -> 112
        //   24: aload_1
        //   25: invokeinterface 38 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: aload_2
        //   40: invokevirtual 44	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 5
        //   45: astore_1
        //   46: aload_3
        //   47: ifnull +10 -> 57
        //   50: aload_3
        //   51: invokeinterface 47 1 0
        //   56: astore_1
        //   57: aload 6
        //   59: aload_1
        //   60: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   63: aload 6
        //   65: iload 4
        //   67: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   70: aload_0
        //   71: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   74: iconst_3
        //   75: aload 6
        //   77: aload 7
        //   79: iconst_0
        //   80: invokeinterface 57 5 0
        //   85: pop
        //   86: aload 7
        //   88: invokevirtual 60	android/os/Parcel:readException	()V
        //   91: aload 7
        //   93: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   96: invokestatic 68	com/google/android/gms/b/iv$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/iv;
        //   99: astore_1
        //   100: aload 7
        //   102: invokevirtual 71	android/os/Parcel:recycle	()V
        //   105: aload 6
        //   107: invokevirtual 71	android/os/Parcel:recycle	()V
        //   110: aload_1
        //   111: areturn
        //   112: aconst_null
        //   113: astore_1
        //   114: goto -83 -> 31
        //   117: astore_1
        //   118: aload 7
        //   120: invokevirtual 71	android/os/Parcel:recycle	()V
        //   123: aload 6
        //   125: invokevirtual 71	android/os/Parcel:recycle	()V
        //   128: aload_1
        //   129: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	130	0	this	a
        //   0	130	1	parama	a
        //   0	130	2	paramString	String
        //   0	130	3	paramoc	oc
        //   0	130	4	paramInt	int
        //   1	43	5	localObject	Object
        //   6	118	6	localParcel1	Parcel
        //   11	108	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	117	finally
        //   24	31	117	finally
        //   31	43	117	finally
        //   50	57	117	finally
        //   57	100	117	finally
      }
      
      /* Error */
      public final pb createAdOverlay(a parama)
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
        //   15: ifnull +52 -> 67
        //   18: aload_1
        //   19: invokeinterface 38 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   34: bipush 8
        //   36: aload_2
        //   37: aload_3
        //   38: iconst_0
        //   39: invokeinterface 57 5 0
        //   44: pop
        //   45: aload_3
        //   46: invokevirtual 60	android/os/Parcel:readException	()V
        //   49: aload_3
        //   50: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   53: invokestatic 78	com/google/android/gms/b/pb$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/pb;
        //   56: astore_1
        //   57: aload_3
        //   58: invokevirtual 71	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 71	android/os/Parcel:recycle	()V
        //   65: aload_1
        //   66: areturn
        //   67: aconst_null
        //   68: astore_1
        //   69: goto -44 -> 25
        //   72: astore_1
        //   73: aload_3
        //   74: invokevirtual 71	android/os/Parcel:recycle	()V
        //   77: aload_2
        //   78: invokevirtual 71	android/os/Parcel:recycle	()V
        //   81: aload_1
        //   82: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	83	0	this	a
        //   0	83	1	parama	a
        //   3	75	2	localParcel1	Parcel
        //   7	67	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	72	finally
        //   18	25	72	finally
        //   25	57	72	finally
      }
      
      /* Error */
      public final ix createBannerAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 6
        //   3: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 30
        //   17: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +110 -> 131
        //   24: aload_1
        //   25: invokeinterface 38 1 0
        //   30: astore_1
        //   31: aload 7
        //   33: aload_1
        //   34: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload_2
        //   38: ifnull +98 -> 136
        //   41: aload 7
        //   43: iconst_1
        //   44: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   47: aload_2
        //   48: aload 7
        //   50: iconst_0
        //   51: invokevirtual 86	com/google/android/gms/b/il:writeToParcel	(Landroid/os/Parcel;I)V
        //   54: aload 7
        //   56: aload_3
        //   57: invokevirtual 44	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   60: aload 6
        //   62: astore_1
        //   63: aload 4
        //   65: ifnull +11 -> 76
        //   68: aload 4
        //   70: invokeinterface 47 1 0
        //   75: astore_1
        //   76: aload 7
        //   78: aload_1
        //   79: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   82: aload 7
        //   84: iload 5
        //   86: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   89: aload_0
        //   90: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   93: iconst_1
        //   94: aload 7
        //   96: aload 8
        //   98: iconst_0
        //   99: invokeinterface 57 5 0
        //   104: pop
        //   105: aload 8
        //   107: invokevirtual 60	android/os/Parcel:readException	()V
        //   110: aload 8
        //   112: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   115: invokestatic 91	com/google/android/gms/b/ix$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/ix;
        //   118: astore_1
        //   119: aload 8
        //   121: invokevirtual 71	android/os/Parcel:recycle	()V
        //   124: aload 7
        //   126: invokevirtual 71	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: areturn
        //   131: aconst_null
        //   132: astore_1
        //   133: goto -102 -> 31
        //   136: aload 7
        //   138: iconst_0
        //   139: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   142: goto -88 -> 54
        //   145: astore_1
        //   146: aload 8
        //   148: invokevirtual 71	android/os/Parcel:recycle	()V
        //   151: aload 7
        //   153: invokevirtual 71	android/os/Parcel:recycle	()V
        //   156: aload_1
        //   157: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	158	0	this	a
        //   0	158	1	parama	a
        //   0	158	2	paramil	il
        //   0	158	3	paramString	String
        //   0	158	4	paramoc	oc
        //   0	158	5	paramInt	int
        //   1	60	6	localObject	Object
        //   6	146	7	localParcel1	Parcel
        //   11	136	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	145	finally
        //   24	31	145	finally
        //   31	37	145	finally
        //   41	54	145	finally
        //   54	60	145	finally
        //   68	76	145	finally
        //   76	119	145	finally
        //   136	142	145	finally
      }
      
      /* Error */
      public final pi createInAppPurchaseManager(a parama)
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
        //   15: ifnull +52 -> 67
        //   18: aload_1
        //   19: invokeinterface 38 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   34: bipush 7
        //   36: aload_2
        //   37: aload_3
        //   38: iconst_0
        //   39: invokeinterface 57 5 0
        //   44: pop
        //   45: aload_3
        //   46: invokevirtual 60	android/os/Parcel:readException	()V
        //   49: aload_3
        //   50: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   53: invokestatic 98	com/google/android/gms/b/pi$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/pi;
        //   56: astore_1
        //   57: aload_3
        //   58: invokevirtual 71	android/os/Parcel:recycle	()V
        //   61: aload_2
        //   62: invokevirtual 71	android/os/Parcel:recycle	()V
        //   65: aload_1
        //   66: areturn
        //   67: aconst_null
        //   68: astore_1
        //   69: goto -44 -> 25
        //   72: astore_1
        //   73: aload_3
        //   74: invokevirtual 71	android/os/Parcel:recycle	()V
        //   77: aload_2
        //   78: invokevirtual 71	android/os/Parcel:recycle	()V
        //   81: aload_1
        //   82: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	83	0	this	a
        //   0	83	1	parama	a
        //   3	75	2	localParcel1	Parcel
        //   7	67	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	72	finally
        //   18	25	72	finally
        //   25	57	72	finally
      }
      
      /* Error */
      public final ix createInterstitialAdManager(a parama, il paramil, String paramString, oc paramoc, int paramInt)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 6
        //   3: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 30
        //   17: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +110 -> 131
        //   24: aload_1
        //   25: invokeinterface 38 1 0
        //   30: astore_1
        //   31: aload 7
        //   33: aload_1
        //   34: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload_2
        //   38: ifnull +98 -> 136
        //   41: aload 7
        //   43: iconst_1
        //   44: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   47: aload_2
        //   48: aload 7
        //   50: iconst_0
        //   51: invokevirtual 86	com/google/android/gms/b/il:writeToParcel	(Landroid/os/Parcel;I)V
        //   54: aload 7
        //   56: aload_3
        //   57: invokevirtual 44	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   60: aload 6
        //   62: astore_1
        //   63: aload 4
        //   65: ifnull +11 -> 76
        //   68: aload 4
        //   70: invokeinterface 47 1 0
        //   75: astore_1
        //   76: aload 7
        //   78: aload_1
        //   79: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   82: aload 7
        //   84: iload 5
        //   86: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   89: aload_0
        //   90: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   93: iconst_2
        //   94: aload 7
        //   96: aload 8
        //   98: iconst_0
        //   99: invokeinterface 57 5 0
        //   104: pop
        //   105: aload 8
        //   107: invokevirtual 60	android/os/Parcel:readException	()V
        //   110: aload 8
        //   112: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   115: invokestatic 91	com/google/android/gms/b/ix$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/ix;
        //   118: astore_1
        //   119: aload 8
        //   121: invokevirtual 71	android/os/Parcel:recycle	()V
        //   124: aload 7
        //   126: invokevirtual 71	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: areturn
        //   131: aconst_null
        //   132: astore_1
        //   133: goto -102 -> 31
        //   136: aload 7
        //   138: iconst_0
        //   139: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   142: goto -88 -> 54
        //   145: astore_1
        //   146: aload 8
        //   148: invokevirtual 71	android/os/Parcel:recycle	()V
        //   151: aload 7
        //   153: invokevirtual 71	android/os/Parcel:recycle	()V
        //   156: aload_1
        //   157: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	158	0	this	a
        //   0	158	1	parama	a
        //   0	158	2	paramil	il
        //   0	158	3	paramString	String
        //   0	158	4	paramoc	oc
        //   0	158	5	paramInt	int
        //   1	60	6	localObject	Object
        //   6	146	7	localParcel1	Parcel
        //   11	136	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	145	finally
        //   24	31	145	finally
        //   31	37	145	finally
        //   41	54	145	finally
        //   54	60	145	finally
        //   68	76	145	finally
        //   76	119	145	finally
        //   136	142	145	finally
      }
      
      /* Error */
      public final lj createNativeAdViewDelegate(a parama1, a parama2)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore 4
        //   7: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   10: astore 5
        //   12: aload 4
        //   14: ldc 30
        //   16: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   19: aload_1
        //   20: ifnull +77 -> 97
        //   23: aload_1
        //   24: invokeinterface 38 1 0
        //   29: astore_1
        //   30: aload 4
        //   32: aload_1
        //   33: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload_3
        //   37: astore_1
        //   38: aload_2
        //   39: ifnull +10 -> 49
        //   42: aload_2
        //   43: invokeinterface 38 1 0
        //   48: astore_1
        //   49: aload 4
        //   51: aload_1
        //   52: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   55: aload_0
        //   56: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   59: iconst_5
        //   60: aload 4
        //   62: aload 5
        //   64: iconst_0
        //   65: invokeinterface 57 5 0
        //   70: pop
        //   71: aload 5
        //   73: invokevirtual 60	android/os/Parcel:readException	()V
        //   76: aload 5
        //   78: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   81: invokestatic 106	com/google/android/gms/b/lj$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/lj;
        //   84: astore_1
        //   85: aload 5
        //   87: invokevirtual 71	android/os/Parcel:recycle	()V
        //   90: aload 4
        //   92: invokevirtual 71	android/os/Parcel:recycle	()V
        //   95: aload_1
        //   96: areturn
        //   97: aconst_null
        //   98: astore_1
        //   99: goto -69 -> 30
        //   102: astore_1
        //   103: aload 5
        //   105: invokevirtual 71	android/os/Parcel:recycle	()V
        //   108: aload 4
        //   110: invokevirtual 71	android/os/Parcel:recycle	()V
        //   113: aload_1
        //   114: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	115	0	this	a
        //   0	115	1	parama1	a
        //   0	115	2	parama2	a
        //   1	36	3	localObject	Object
        //   5	104	4	localParcel1	Parcel
        //   10	94	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   12	19	102	finally
        //   23	30	102	finally
        //   30	36	102	finally
        //   42	49	102	finally
        //   49	85	102	finally
      }
      
      /* Error */
      public final rz createRewardedVideoAd(a parama, oc paramoc, int paramInt)
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore 4
        //   3: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 30
        //   17: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +85 -> 106
        //   24: aload_1
        //   25: invokeinterface 38 1 0
        //   30: astore_1
        //   31: aload 5
        //   33: aload_1
        //   34: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 4
        //   39: astore_1
        //   40: aload_2
        //   41: ifnull +10 -> 51
        //   44: aload_2
        //   45: invokeinterface 47 1 0
        //   50: astore_1
        //   51: aload 5
        //   53: aload_1
        //   54: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   57: aload 5
        //   59: iload_3
        //   60: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   63: aload_0
        //   64: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   67: bipush 6
        //   69: aload 5
        //   71: aload 6
        //   73: iconst_0
        //   74: invokeinterface 57 5 0
        //   79: pop
        //   80: aload 6
        //   82: invokevirtual 60	android/os/Parcel:readException	()V
        //   85: aload 6
        //   87: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   90: invokestatic 113	com/google/android/gms/b/rz$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/rz;
        //   93: astore_1
        //   94: aload 6
        //   96: invokevirtual 71	android/os/Parcel:recycle	()V
        //   99: aload 5
        //   101: invokevirtual 71	android/os/Parcel:recycle	()V
        //   104: aload_1
        //   105: areturn
        //   106: aconst_null
        //   107: astore_1
        //   108: goto -77 -> 31
        //   111: astore_1
        //   112: aload 6
        //   114: invokevirtual 71	android/os/Parcel:recycle	()V
        //   117: aload 5
        //   119: invokevirtual 71	android/os/Parcel:recycle	()V
        //   122: aload_1
        //   123: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	124	0	this	a
        //   0	124	1	parama	a
        //   0	124	2	paramoc	oc
        //   0	124	3	paramInt	int
        //   1	37	4	localObject	Object
        //   6	112	5	localParcel1	Parcel
        //   11	102	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	111	finally
        //   24	31	111	finally
        //   31	37	111	finally
        //   44	51	111	finally
        //   51	94	111	finally
      }
      
      /* Error */
      public final ix createSearchAdManager(a parama, il paramil, String paramString, int paramInt)
      {
        // Byte code:
        //   0: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 5
        //   5: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 6
        //   10: aload 5
        //   12: ldc 30
        //   14: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +89 -> 107
        //   21: aload_1
        //   22: invokeinterface 38 1 0
        //   27: astore_1
        //   28: aload 5
        //   30: aload_1
        //   31: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload_2
        //   35: ifnull +77 -> 112
        //   38: aload 5
        //   40: iconst_1
        //   41: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   44: aload_2
        //   45: aload 5
        //   47: iconst_0
        //   48: invokevirtual 86	com/google/android/gms/b/il:writeToParcel	(Landroid/os/Parcel;I)V
        //   51: aload 5
        //   53: aload_3
        //   54: invokevirtual 44	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   57: aload 5
        //   59: iload 4
        //   61: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   64: aload_0
        //   65: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   68: bipush 10
        //   70: aload 5
        //   72: aload 6
        //   74: iconst_0
        //   75: invokeinterface 57 5 0
        //   80: pop
        //   81: aload 6
        //   83: invokevirtual 60	android/os/Parcel:readException	()V
        //   86: aload 6
        //   88: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   91: invokestatic 91	com/google/android/gms/b/ix$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/ix;
        //   94: astore_1
        //   95: aload 6
        //   97: invokevirtual 71	android/os/Parcel:recycle	()V
        //   100: aload 5
        //   102: invokevirtual 71	android/os/Parcel:recycle	()V
        //   105: aload_1
        //   106: areturn
        //   107: aconst_null
        //   108: astore_1
        //   109: goto -81 -> 28
        //   112: aload 5
        //   114: iconst_0
        //   115: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   118: goto -67 -> 51
        //   121: astore_1
        //   122: aload 6
        //   124: invokevirtual 71	android/os/Parcel:recycle	()V
        //   127: aload 5
        //   129: invokevirtual 71	android/os/Parcel:recycle	()V
        //   132: aload_1
        //   133: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	134	0	this	a
        //   0	134	1	parama	a
        //   0	134	2	paramil	il
        //   0	134	3	paramString	String
        //   0	134	4	paramInt	int
        //   3	125	5	localParcel1	Parcel
        //   8	115	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	121	finally
        //   21	28	121	finally
        //   28	34	121	finally
        //   38	51	121	finally
        //   51	95	121	finally
        //   112	118	121	finally
      }
      
      /* Error */
      public final jc getMobileAdsSettingsManager(a parama)
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
        //   15: ifnull +51 -> 66
        //   18: aload_1
        //   19: invokeinterface 38 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   34: iconst_4
        //   35: aload_2
        //   36: aload_3
        //   37: iconst_0
        //   38: invokeinterface 57 5 0
        //   43: pop
        //   44: aload_3
        //   45: invokevirtual 60	android/os/Parcel:readException	()V
        //   48: aload_3
        //   49: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   52: invokestatic 122	com/google/android/gms/b/jc$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/jc;
        //   55: astore_1
        //   56: aload_3
        //   57: invokevirtual 71	android/os/Parcel:recycle	()V
        //   60: aload_2
        //   61: invokevirtual 71	android/os/Parcel:recycle	()V
        //   64: aload_1
        //   65: areturn
        //   66: aconst_null
        //   67: astore_1
        //   68: goto -43 -> 25
        //   71: astore_1
        //   72: aload_3
        //   73: invokevirtual 71	android/os/Parcel:recycle	()V
        //   76: aload_2
        //   77: invokevirtual 71	android/os/Parcel:recycle	()V
        //   80: aload_1
        //   81: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	82	0	this	a
        //   0	82	1	parama	a
        //   3	74	2	localParcel1	Parcel
        //   7	66	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	71	finally
        //   18	25	71	finally
        //   25	56	71	finally
      }
      
      /* Error */
      public final jc getMobileAdsSettingsManagerWithClientJarVersion(a parama, int paramInt)
      {
        // Byte code:
        //   0: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 30
        //   12: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +61 -> 77
        //   19: aload_1
        //   20: invokeinterface 38 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: iload_2
        //   33: invokevirtual 51	android/os/Parcel:writeInt	(I)V
        //   36: aload_0
        //   37: getfield 17	com/google/android/gms/b/ja$a$a:a	Landroid/os/IBinder;
        //   40: bipush 9
        //   42: aload_3
        //   43: aload 4
        //   45: iconst_0
        //   46: invokeinterface 57 5 0
        //   51: pop
        //   52: aload 4
        //   54: invokevirtual 60	android/os/Parcel:readException	()V
        //   57: aload 4
        //   59: invokevirtual 63	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
        //   62: invokestatic 122	com/google/android/gms/b/jc$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/b/jc;
        //   65: astore_1
        //   66: aload 4
        //   68: invokevirtual 71	android/os/Parcel:recycle	()V
        //   71: aload_3
        //   72: invokevirtual 71	android/os/Parcel:recycle	()V
        //   75: aload_1
        //   76: areturn
        //   77: aconst_null
        //   78: astore_1
        //   79: goto -53 -> 26
        //   82: astore_1
        //   83: aload 4
        //   85: invokevirtual 71	android/os/Parcel:recycle	()V
        //   88: aload_3
        //   89: invokevirtual 71	android/os/Parcel:recycle	()V
        //   92: aload_1
        //   93: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	94	0	this	a
        //   0	94	1	parama	a
        //   0	94	2	paramInt	int
        //   3	86	3	localParcel1	Parcel
        //   7	77	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	82	finally
        //   19	26	82	finally
        //   26	66	82	finally
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */