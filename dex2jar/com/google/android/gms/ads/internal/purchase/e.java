package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.pg;
import com.google.android.gms.b.pi.a;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tu;
import com.google.android.gms.common.a.a;

@qi
public final class e
  extends pi.a
  implements ServiceConnection
{
  h a;
  private final Activity b;
  private Context c;
  private pg d;
  private b e;
  private f f;
  private j g;
  private k h;
  private String i = null;
  
  public e(Activity paramActivity)
  {
    b = paramActivity;
    a = h.a(b.getApplicationContext());
  }
  
  private void a(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent)
  {
    if (g != null) {
      g.a(paramString, paramBoolean, paramInt, paramIntent, f);
    }
  }
  
  public final void a()
  {
    Object localObject = GInAppPurchaseManagerInfoParcel.a(b.getIntent());
    g = d;
    h = a;
    d = b;
    e = new b(b.getApplicationContext());
    c = c;
    if (b.getResources().getConfiguration().orientation == 2) {
      b.setRequestedOrientation(w.g().a());
    }
    for (;;)
    {
      localObject = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      ((Intent)localObject).setPackage("com.android.vending");
      a.a();
      a.b(b, (Intent)localObject, this, 1);
      return;
      b.setRequestedOrientation(w.g().b());
    }
  }
  
  /* Error */
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: iload_1
    //   1: sipush 1001
    //   4: if_icmpne +85 -> 89
    //   7: iconst_0
    //   8: istore 4
    //   10: invokestatic 147	com/google/android/gms/ads/internal/w:s	()Lcom/google/android/gms/ads/internal/purchase/i;
    //   13: pop
    //   14: aload_3
    //   15: invokestatic 152	com/google/android/gms/ads/internal/purchase/i:a	(Landroid/content/Intent;)I
    //   18: istore_1
    //   19: iload_2
    //   20: iconst_m1
    //   21: if_icmpne +69 -> 90
    //   24: invokestatic 147	com/google/android/gms/ads/internal/w:s	()Lcom/google/android/gms/ads/internal/purchase/i;
    //   27: pop
    //   28: iload_1
    //   29: ifne +61 -> 90
    //   32: aload_0
    //   33: getfield 73	com/google/android/gms/ads/internal/purchase/e:h	Lcom/google/android/gms/ads/internal/purchase/k;
    //   36: aload_0
    //   37: getfield 32	com/google/android/gms/ads/internal/purchase/e:i	Ljava/lang/String;
    //   40: aload_3
    //   41: invokevirtual 157	com/google/android/gms/ads/internal/purchase/k:a	(Ljava/lang/String;Landroid/content/Intent;)Z
    //   44: ifeq +6 -> 50
    //   47: iconst_1
    //   48: istore 4
    //   50: aload_0
    //   51: getfield 77	com/google/android/gms/ads/internal/purchase/e:d	Lcom/google/android/gms/b/pg;
    //   54: iload_1
    //   55: invokeinterface 161 2 0
    //   60: aload_0
    //   61: getfield 34	com/google/android/gms/ads/internal/purchase/e:b	Landroid/app/Activity;
    //   64: invokevirtual 164	android/app/Activity:finish	()V
    //   67: aload_0
    //   68: aload_0
    //   69: getfield 77	com/google/android/gms/ads/internal/purchase/e:d	Lcom/google/android/gms/b/pg;
    //   72: invokeinterface 167 1 0
    //   77: iload 4
    //   79: iload_2
    //   80: aload_3
    //   81: invokespecial 169	com/google/android/gms/ads/internal/purchase/e:a	(Ljava/lang/String;ZILandroid/content/Intent;)V
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 32	com/google/android/gms/ads/internal/purchase/e:i	Ljava/lang/String;
    //   89: return
    //   90: aload_0
    //   91: getfield 47	com/google/android/gms/ads/internal/purchase/e:a	Lcom/google/android/gms/ads/internal/purchase/h;
    //   94: aload_0
    //   95: getfield 53	com/google/android/gms/ads/internal/purchase/e:f	Lcom/google/android/gms/ads/internal/purchase/f;
    //   98: invokevirtual 172	com/google/android/gms/ads/internal/purchase/h:a	(Lcom/google/android/gms/ads/internal/purchase/f;)V
    //   101: goto -51 -> 50
    //   104: astore_3
    //   105: ldc -82
    //   107: invokestatic 178	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   110: aload_0
    //   111: getfield 34	com/google/android/gms/ads/internal/purchase/e:b	Landroid/app/Activity;
    //   114: invokevirtual 164	android/app/Activity:finish	()V
    //   117: aload_0
    //   118: aconst_null
    //   119: putfield 32	com/google/android/gms/ads/internal/purchase/e:i	Ljava/lang/String;
    //   122: return
    //   123: astore_3
    //   124: aload_0
    //   125: aconst_null
    //   126: putfield 32	com/google/android/gms/ads/internal/purchase/e:i	Ljava/lang/String;
    //   129: aload_3
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	e
    //   0	131	1	paramInt1	int
    //   0	131	2	paramInt2	int
    //   0	131	3	paramIntent	Intent
    //   8	70	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   10	19	104	android/os/RemoteException
    //   24	28	104	android/os/RemoteException
    //   32	47	104	android/os/RemoteException
    //   50	84	104	android/os/RemoteException
    //   90	101	104	android/os/RemoteException
    //   10	19	123	finally
    //   24	28	123	finally
    //   32	47	123	finally
    //   50	84	123	finally
    //   90	101	123	finally
    //   105	117	123	finally
  }
  
  public final void b()
  {
    a.a();
    a.a(b, this);
    e.a = null;
  }
  
  /* Error */
  public final void onServiceConnected(ComponentName paramComponentName, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 84	com/google/android/gms/ads/internal/purchase/e:e	Lcom/google/android/gms/ads/internal/purchase/b;
    //   4: aload_2
    //   5: invokevirtual 193	com/google/android/gms/ads/internal/purchase/b:a	(Landroid/os/IBinder;)V
    //   8: invokestatic 196	com/google/android/gms/ads/internal/w:e	()Lcom/google/android/gms/b/tt;
    //   11: pop
    //   12: aload_0
    //   13: invokestatic 200	com/google/android/gms/b/tt:b	()Ljava/lang/String;
    //   16: putfield 32	com/google/android/gms/ads/internal/purchase/e:i	Ljava/lang/String;
    //   19: aload_0
    //   20: getfield 84	com/google/android/gms/ads/internal/purchase/e:e	Lcom/google/android/gms/ads/internal/purchase/b;
    //   23: aload_0
    //   24: getfield 34	com/google/android/gms/ads/internal/purchase/e:b	Landroid/app/Activity;
    //   27: invokevirtual 203	android/app/Activity:getPackageName	()Ljava/lang/String;
    //   30: aload_0
    //   31: getfield 77	com/google/android/gms/ads/internal/purchase/e:d	Lcom/google/android/gms/b/pg;
    //   34: invokeinterface 167 1 0
    //   39: aload_0
    //   40: getfield 32	com/google/android/gms/ads/internal/purchase/e:i	Ljava/lang/String;
    //   43: invokevirtual 206	com/google/android/gms/ads/internal/purchase/b:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    //   46: astore_1
    //   47: aload_1
    //   48: ldc -48
    //   50: invokevirtual 214	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   53: checkcast 216	android/app/PendingIntent
    //   56: astore 7
    //   58: aload 7
    //   60: ifnonnull +46 -> 106
    //   63: invokestatic 147	com/google/android/gms/ads/internal/w:s	()Lcom/google/android/gms/ads/internal/purchase/i;
    //   66: pop
    //   67: aload_1
    //   68: invokestatic 219	com/google/android/gms/ads/internal/purchase/i:a	(Landroid/os/Bundle;)I
    //   71: istore_3
    //   72: aload_0
    //   73: getfield 77	com/google/android/gms/ads/internal/purchase/e:d	Lcom/google/android/gms/b/pg;
    //   76: iload_3
    //   77: invokeinterface 161 2 0
    //   82: aload_0
    //   83: aload_0
    //   84: getfield 77	com/google/android/gms/ads/internal/purchase/e:d	Lcom/google/android/gms/b/pg;
    //   87: invokeinterface 167 1 0
    //   92: iconst_0
    //   93: iload_3
    //   94: aconst_null
    //   95: invokespecial 169	com/google/android/gms/ads/internal/purchase/e:a	(Ljava/lang/String;ZILandroid/content/Intent;)V
    //   98: aload_0
    //   99: getfield 34	com/google/android/gms/ads/internal/purchase/e:b	Landroid/app/Activity;
    //   102: invokevirtual 164	android/app/Activity:finish	()V
    //   105: return
    //   106: aload_0
    //   107: new 221	com/google/android/gms/ads/internal/purchase/f
    //   110: dup
    //   111: aload_0
    //   112: getfield 77	com/google/android/gms/ads/internal/purchase/e:d	Lcom/google/android/gms/b/pg;
    //   115: invokeinterface 167 1 0
    //   120: aload_0
    //   121: getfield 32	com/google/android/gms/ads/internal/purchase/e:i	Ljava/lang/String;
    //   124: invokespecial 224	com/google/android/gms/ads/internal/purchase/f:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: putfield 53	com/google/android/gms/ads/internal/purchase/e:f	Lcom/google/android/gms/ads/internal/purchase/f;
    //   130: aload_0
    //   131: getfield 47	com/google/android/gms/ads/internal/purchase/e:a	Lcom/google/android/gms/ads/internal/purchase/h;
    //   134: astore 4
    //   136: aload_0
    //   137: getfield 53	com/google/android/gms/ads/internal/purchase/e:f	Lcom/google/android/gms/ads/internal/purchase/f;
    //   140: astore_1
    //   141: aload_1
    //   142: ifnull +24 -> 166
    //   145: getstatic 225	com/google/android/gms/ads/internal/purchase/h:a	Ljava/lang/Object;
    //   148: astore 5
    //   150: aload 5
    //   152: monitorenter
    //   153: aload 4
    //   155: invokevirtual 228	com/google/android/gms/ads/internal/purchase/h:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   158: astore_2
    //   159: aload_2
    //   160: ifnonnull +65 -> 225
    //   163: aload 5
    //   165: monitorexit
    //   166: aload_0
    //   167: getfield 34	com/google/android/gms/ads/internal/purchase/e:b	Landroid/app/Activity;
    //   170: aload 7
    //   172: invokevirtual 232	android/app/PendingIntent:getIntentSender	()Landroid/content/IntentSender;
    //   175: sipush 1001
    //   178: new 119	android/content/Intent
    //   181: dup
    //   182: invokespecial 233	android/content/Intent:<init>	()V
    //   185: iconst_0
    //   186: invokestatic 239	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: invokevirtual 242	java/lang/Integer:intValue	()I
    //   192: iconst_0
    //   193: invokestatic 239	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   196: invokevirtual 242	java/lang/Integer:intValue	()I
    //   199: iconst_0
    //   200: invokestatic 239	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: invokevirtual 242	java/lang/Integer:intValue	()I
    //   206: invokevirtual 246	android/app/Activity:startIntentSenderForResult	(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    //   209: return
    //   210: astore_1
    //   211: ldc -8
    //   213: aload_1
    //   214: invokestatic 251	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   217: aload_0
    //   218: getfield 34	com/google/android/gms/ads/internal/purchase/e:b	Landroid/app/Activity;
    //   221: invokevirtual 164	android/app/Activity:finish	()V
    //   224: return
    //   225: new 253	android/content/ContentValues
    //   228: dup
    //   229: invokespecial 254	android/content/ContentValues:<init>	()V
    //   232: astore 6
    //   234: aload 6
    //   236: ldc_w 256
    //   239: aload_1
    //   240: getfield 258	com/google/android/gms/ads/internal/purchase/f:c	Ljava/lang/String;
    //   243: invokevirtual 261	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: aload 6
    //   248: ldc_w 263
    //   251: aload_1
    //   252: getfield 265	com/google/android/gms/ads/internal/purchase/f:b	Ljava/lang/String;
    //   255: invokevirtual 261	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   258: aload 6
    //   260: ldc_w 267
    //   263: invokestatic 273	android/os/SystemClock:elapsedRealtime	()J
    //   266: invokestatic 278	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   269: invokevirtual 281	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   272: aload_1
    //   273: aload_2
    //   274: ldc_w 283
    //   277: aconst_null
    //   278: aload 6
    //   280: invokevirtual 289	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   283: putfield 292	com/google/android/gms/ads/internal/purchase/f:a	J
    //   286: aload 4
    //   288: invokevirtual 294	com/google/android/gms/ads/internal/purchase/h:c	()I
    //   291: i2l
    //   292: ldc2_w 295
    //   295: lcmp
    //   296: ifle +24 -> 320
    //   299: getstatic 225	com/google/android/gms/ads/internal/purchase/h:a	Ljava/lang/Object;
    //   302: astore 6
    //   304: aload 6
    //   306: monitorenter
    //   307: aload 4
    //   309: invokevirtual 228	com/google/android/gms/ads/internal/purchase/h:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   312: astore_1
    //   313: aload_1
    //   314: ifnonnull +22 -> 336
    //   317: aload 6
    //   319: monitorexit
    //   320: aload 5
    //   322: monitorexit
    //   323: goto -157 -> 166
    //   326: astore_1
    //   327: aload 5
    //   329: monitorexit
    //   330: aload_1
    //   331: athrow
    //   332: astore_1
    //   333: goto -122 -> 211
    //   336: aload_1
    //   337: ldc_w 283
    //   340: aconst_null
    //   341: aconst_null
    //   342: aconst_null
    //   343: aconst_null
    //   344: aconst_null
    //   345: ldc_w 298
    //   348: ldc_w 300
    //   351: invokevirtual 304	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   354: astore_2
    //   355: aload_2
    //   356: ifnull +25 -> 381
    //   359: aload_2
    //   360: astore_1
    //   361: aload_2
    //   362: invokeinterface 310 1 0
    //   367: ifeq +14 -> 381
    //   370: aload_2
    //   371: astore_1
    //   372: aload 4
    //   374: aload_2
    //   375: invokestatic 313	com/google/android/gms/ads/internal/purchase/h:a	(Landroid/database/Cursor;)Lcom/google/android/gms/ads/internal/purchase/f;
    //   378: invokevirtual 172	com/google/android/gms/ads/internal/purchase/h:a	(Lcom/google/android/gms/ads/internal/purchase/f;)V
    //   381: aload_2
    //   382: ifnull +9 -> 391
    //   385: aload_2
    //   386: invokeinterface 316 1 0
    //   391: aload 6
    //   393: monitorexit
    //   394: goto -74 -> 320
    //   397: astore_1
    //   398: aload 6
    //   400: monitorexit
    //   401: aload_1
    //   402: athrow
    //   403: astore 4
    //   405: aconst_null
    //   406: astore_2
    //   407: aload_2
    //   408: astore_1
    //   409: aload 4
    //   411: invokevirtual 319	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   414: invokestatic 324	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   417: astore 4
    //   419: aload_2
    //   420: astore_1
    //   421: aload 4
    //   423: invokevirtual 327	java/lang/String:length	()I
    //   426: ifeq +35 -> 461
    //   429: aload_2
    //   430: astore_1
    //   431: ldc_w 329
    //   434: aload 4
    //   436: invokevirtual 333	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   439: astore 4
    //   441: aload_2
    //   442: astore_1
    //   443: aload 4
    //   445: invokestatic 178	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   448: aload_2
    //   449: ifnull -58 -> 391
    //   452: aload_2
    //   453: invokeinterface 316 1 0
    //   458: goto -67 -> 391
    //   461: aload_2
    //   462: astore_1
    //   463: new 321	java/lang/String
    //   466: dup
    //   467: ldc_w 329
    //   470: invokespecial 334	java/lang/String:<init>	(Ljava/lang/String;)V
    //   473: astore 4
    //   475: goto -34 -> 441
    //   478: astore 4
    //   480: aload_1
    //   481: astore_2
    //   482: aload 4
    //   484: astore_1
    //   485: aload_2
    //   486: ifnull +9 -> 495
    //   489: aload_2
    //   490: invokeinterface 316 1 0
    //   495: aload_1
    //   496: athrow
    //   497: astore_1
    //   498: aconst_null
    //   499: astore_2
    //   500: goto -15 -> 485
    //   503: astore 4
    //   505: goto -98 -> 407
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	508	0	this	e
    //   0	508	1	paramComponentName	ComponentName
    //   0	508	2	paramIBinder	android.os.IBinder
    //   71	23	3	j	int
    //   134	239	4	localh	h
    //   403	7	4	localSQLiteException1	android.database.sqlite.SQLiteException
    //   417	57	4	str	String
    //   478	5	4	localObject1	Object
    //   503	1	4	localSQLiteException2	android.database.sqlite.SQLiteException
    //   148	180	5	localObject2	Object
    //   232	167	6	localObject3	Object
    //   56	115	7	localPendingIntent	android.app.PendingIntent
    // Exception table:
    //   from	to	target	type
    //   8	58	210	android/os/RemoteException
    //   63	105	210	android/os/RemoteException
    //   106	141	210	android/os/RemoteException
    //   145	153	210	android/os/RemoteException
    //   166	209	210	android/os/RemoteException
    //   330	332	210	android/os/RemoteException
    //   153	159	326	finally
    //   163	166	326	finally
    //   225	307	326	finally
    //   320	323	326	finally
    //   327	330	326	finally
    //   401	403	326	finally
    //   8	58	332	android/content/IntentSender$SendIntentException
    //   63	105	332	android/content/IntentSender$SendIntentException
    //   106	141	332	android/content/IntentSender$SendIntentException
    //   145	153	332	android/content/IntentSender$SendIntentException
    //   166	209	332	android/content/IntentSender$SendIntentException
    //   330	332	332	android/content/IntentSender$SendIntentException
    //   307	313	397	finally
    //   317	320	397	finally
    //   385	391	397	finally
    //   391	394	397	finally
    //   398	401	397	finally
    //   452	458	397	finally
    //   489	495	397	finally
    //   495	497	397	finally
    //   336	355	403	android/database/sqlite/SQLiteException
    //   361	370	478	finally
    //   372	381	478	finally
    //   409	419	478	finally
    //   421	429	478	finally
    //   431	441	478	finally
    //   443	448	478	finally
    //   463	475	478	finally
    //   336	355	497	finally
    //   361	370	503	android/database/sqlite/SQLiteException
    //   372	381	503	android/database/sqlite/SQLiteException
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    tp.d("In-app billing service disconnected.");
    e.a = null;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */