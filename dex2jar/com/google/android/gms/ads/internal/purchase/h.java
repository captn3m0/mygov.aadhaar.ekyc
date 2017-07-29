package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import java.util.Locale;

@qi
public final class h
{
  static final Object a = new Object();
  private static final String b = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] { "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time" });
  private static h d;
  private final a c;
  
  private h(Context paramContext)
  {
    c = new a(paramContext, "google_inapp_purchase.db");
  }
  
  static f a(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return null;
    }
    return new f(paramCursor.getLong(0), paramCursor.getString(1), paramCursor.getString(2));
  }
  
  public static h a(Context paramContext)
  {
    synchronized (a)
    {
      if (d == null) {
        d = new h(paramContext);
      }
      paramContext = d;
      return paramContext;
    }
  }
  
  public final SQLiteDatabase a()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = c.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      tp.e("Error opening writable conversion tracking database");
    }
    return null;
  }
  
  public final void a(f paramf)
  {
    if (paramf == null) {
      return;
    }
    SQLiteDatabase localSQLiteDatabase;
    synchronized (a)
    {
      localSQLiteDatabase = a();
      if (localSQLiteDatabase == null) {
        return;
      }
    }
    localSQLiteDatabase.delete("InAppPurchase", String.format(Locale.US, "%s = %d", new Object[] { "purchase_id", Long.valueOf(a) }), null);
  }
  
  /* Error */
  public final java.util.List<f> b()
  {
    // Byte code:
    //   0: getstatic 48	com/google/android/gms/ads/internal/purchase/h:a	Ljava/lang/Object;
    //   3: astore 5
    //   5: aload 5
    //   7: monitorenter
    //   8: new 116	java/util/LinkedList
    //   11: dup
    //   12: invokespecial 117	java/util/LinkedList:<init>	()V
    //   15: astore 6
    //   17: ldc2_w 118
    //   20: lconst_0
    //   21: lcmp
    //   22: ifgt +9 -> 31
    //   25: aload 5
    //   27: monitorexit
    //   28: aload 6
    //   30: areturn
    //   31: aload_0
    //   32: invokevirtual 96	com/google/android/gms/ads/internal/purchase/h:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   35: astore_2
    //   36: aload_2
    //   37: ifnonnull +9 -> 46
    //   40: aload 5
    //   42: monitorexit
    //   43: aload 6
    //   45: areturn
    //   46: aload_2
    //   47: ldc 27
    //   49: aconst_null
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: ldc 121
    //   56: ldc 123
    //   58: invokevirtual 127	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   61: astore_3
    //   62: aload_3
    //   63: astore_2
    //   64: aload_3
    //   65: invokeinterface 131 1 0
    //   70: ifeq +30 -> 100
    //   73: aload_3
    //   74: astore_2
    //   75: aload 6
    //   77: aload_3
    //   78: invokestatic 133	com/google/android/gms/ads/internal/purchase/h:a	(Landroid/database/Cursor;)Lcom/google/android/gms/ads/internal/purchase/f;
    //   81: invokeinterface 139 2 0
    //   86: pop
    //   87: aload_3
    //   88: astore_2
    //   89: aload_3
    //   90: invokeinterface 142 1 0
    //   95: istore_1
    //   96: iload_1
    //   97: ifne -24 -> 73
    //   100: aload_3
    //   101: ifnull +9 -> 110
    //   104: aload_3
    //   105: invokeinterface 145 1 0
    //   110: aload 5
    //   112: monitorexit
    //   113: aload 6
    //   115: areturn
    //   116: astore 4
    //   118: aconst_null
    //   119: astore_3
    //   120: aload_3
    //   121: astore_2
    //   122: aload 4
    //   124: invokevirtual 148	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   127: invokestatic 151	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   130: astore 4
    //   132: aload_3
    //   133: astore_2
    //   134: aload 4
    //   136: invokevirtual 155	java/lang/String:length	()I
    //   139: ifeq +40 -> 179
    //   142: aload_3
    //   143: astore_2
    //   144: ldc -99
    //   146: aload 4
    //   148: invokevirtual 161	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   151: astore 4
    //   153: aload_3
    //   154: astore_2
    //   155: aload 4
    //   157: invokestatic 93	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   160: aload_3
    //   161: ifnull -51 -> 110
    //   164: aload_3
    //   165: invokeinterface 145 1 0
    //   170: goto -60 -> 110
    //   173: astore_2
    //   174: aload 5
    //   176: monitorexit
    //   177: aload_2
    //   178: athrow
    //   179: aload_3
    //   180: astore_2
    //   181: new 37	java/lang/String
    //   184: dup
    //   185: ldc -99
    //   187: invokespecial 163	java/lang/String:<init>	(Ljava/lang/String;)V
    //   190: astore 4
    //   192: goto -39 -> 153
    //   195: astore 4
    //   197: aload_2
    //   198: astore_3
    //   199: aload 4
    //   201: astore_2
    //   202: aload_3
    //   203: ifnull +9 -> 212
    //   206: aload_3
    //   207: invokeinterface 145 1 0
    //   212: aload_2
    //   213: athrow
    //   214: astore_2
    //   215: aconst_null
    //   216: astore_3
    //   217: goto -15 -> 202
    //   220: astore 4
    //   222: goto -102 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	225	0	this	h
    //   95	2	1	bool	boolean
    //   35	120	2	localObject1	Object
    //   173	5	2	localObject2	Object
    //   180	33	2	localObject3	Object
    //   214	1	2	localObject4	Object
    //   61	156	3	localObject5	Object
    //   116	7	4	localSQLiteException1	SQLiteException
    //   130	61	4	str	String
    //   195	5	4	localObject6	Object
    //   220	1	4	localSQLiteException2	SQLiteException
    //   3	172	5	localObject7	Object
    //   15	99	6	localLinkedList	java.util.LinkedList
    // Exception table:
    //   from	to	target	type
    //   46	62	116	android/database/sqlite/SQLiteException
    //   8	17	173	finally
    //   25	28	173	finally
    //   31	36	173	finally
    //   40	43	173	finally
    //   104	110	173	finally
    //   110	113	173	finally
    //   164	170	173	finally
    //   174	177	173	finally
    //   206	212	173	finally
    //   212	214	173	finally
    //   64	73	195	finally
    //   75	87	195	finally
    //   89	96	195	finally
    //   122	132	195	finally
    //   134	142	195	finally
    //   144	153	195	finally
    //   155	160	195	finally
    //   181	192	195	finally
    //   46	62	214	finally
    //   64	73	220	android/database/sqlite/SQLiteException
    //   75	87	220	android/database/sqlite/SQLiteException
    //   89	96	220	android/database/sqlite/SQLiteException
  }
  
  public final int c()
  {
    localObject4 = null;
    Object localObject1 = null;
    Object localObject5;
    synchronized (a)
    {
      localObject5 = a();
      if (localObject5 == null) {
        return 0;
      }
    }
    try
    {
      localObject5 = ((SQLiteDatabase)localObject5).rawQuery("select count(*) from InAppPurchase", null);
      localObject1 = localObject5;
      localObject4 = localObject5;
      if (((Cursor)localObject5).moveToFirst())
      {
        localObject1 = localObject5;
        localObject4 = localObject5;
        int i = ((Cursor)localObject5).getInt(0);
        if (localObject5 != null) {
          ((Cursor)localObject5).close();
        }
        return i;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      localObject4 = localObject2;
      String str = String.valueOf(localSQLiteException.getMessage());
      localObject4 = localObject2;
      if (str.length() == 0) {
        break label164;
      }
      localObject4 = localObject2;
      for (str = "Error getting record count".concat(str);; str = new String("Error getting record count"))
      {
        localObject4 = localObject2;
        tp.e(str);
        if (localObject2 == null) {
          break;
        }
        ((Cursor)localObject2).close();
        break;
        localObject4 = localObject2;
      }
    }
    finally
    {
      if (localObject4 == null) {
        break label191;
      }
      ((Cursor)localObject4).close();
    }
    return 0;
  }
  
  public final class a
    extends SQLiteOpenHelper
  {
    public a(String paramString)
    {
      super(paramString, null, 4);
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase.execSQL(h.d());
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      tp.d(64 + "Database updated from version " + paramInt1 + " to version " + paramInt2);
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
      onCreate(paramSQLiteDatabase);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */