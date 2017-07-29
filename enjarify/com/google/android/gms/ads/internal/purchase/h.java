package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.b.tp;
import java.util.Locale;

public final class h
{
  static final Object a;
  private static final String b;
  private static h d;
  private final h.a c;
  
  static
  {
    Object localObject = Locale.US;
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = "InAppPurchase";
    arrayOfObject[1] = "purchase_id";
    arrayOfObject[2] = "product_id";
    arrayOfObject[3] = "developer_payload";
    arrayOfObject[4] = "record_time";
    b = String.format((Locale)localObject, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", arrayOfObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private h(Context paramContext)
  {
    h.a locala = new com/google/android/gms/ads/internal/purchase/h$a;
    locala.<init>(paramContext, "google_inapp_purchase.db");
    c = locala;
  }
  
  static f a(Cursor paramCursor)
  {
    f localf;
    if (paramCursor == null) {
      localf = null;
    }
    for (;;)
    {
      return localf;
      localf = new com/google/android/gms/ads/internal/purchase/f;
      long l = paramCursor.getLong(0);
      int i = 1;
      String str1 = paramCursor.getString(i);
      int j = 2;
      String str2 = paramCursor.getString(j);
      localf.<init>(l, str1, str2);
    }
  }
  
  public static h a(Context paramContext)
  {
    synchronized (a)
    {
      h localh = d;
      if (localh == null)
      {
        localh = new com/google/android/gms/ads/internal/purchase/h;
        localh.<init>(paramContext);
        d = localh;
      }
      localh = d;
      return localh;
    }
  }
  
  public final SQLiteDatabase a()
  {
    try
    {
      localObject1 = c;
      localObject1 = ((h.a)localObject1).getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject1;
        tp.e("Error opening writable conversion tracking database");
        Object localObject2 = null;
      }
    }
    return (SQLiteDatabase)localObject1;
  }
  
  public final void a(f paramf)
  {
    if (paramf == null) {}
    for (;;)
    {
      return;
      synchronized (a)
      {
        SQLiteDatabase localSQLiteDatabase = a();
        if (localSQLiteDatabase != null) {}
      }
      Object localObject3 = Locale.US;
      String str = "%s = %d";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      Object localObject4 = "purchase_id";
      arrayOfObject[0] = localObject4;
      j = 1;
      long l = a;
      localObject4 = Long.valueOf(l);
      arrayOfObject[j] = localObject4;
      localObject3 = String.format((Locale)localObject3, str, arrayOfObject);
      str = "InAppPurchase";
      i = 0;
      arrayOfObject = null;
      ((SQLiteDatabase)localObject2).delete(str, (String)localObject3, null);
    }
  }
  
  /* Error */
  public final java.util.List b()
  {
    // Byte code:
    //   0: getstatic 49	com/google/android/gms/ads/internal/purchase/h:a	Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: new 113	java/util/LinkedList
    //   9: astore_2
    //   10: aload_2
    //   11: invokespecial 114	java/util/LinkedList:<init>	()V
    //   14: bipush 10
    //   16: i2l
    //   17: lstore_3
    //   18: lconst_0
    //   19: lstore 5
    //   21: lload_3
    //   22: lload 5
    //   24: lcmp
    //   25: istore 7
    //   27: iload 7
    //   29: ifgt +11 -> 40
    //   32: aload_1
    //   33: monitorexit
    //   34: aload_2
    //   35: astore 8
    //   37: aload 8
    //   39: areturn
    //   40: aload_0
    //   41: invokevirtual 94	com/google/android/gms/ads/internal/purchase/h:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   44: astore 8
    //   46: aload 8
    //   48: ifnonnull +11 -> 59
    //   51: aload_1
    //   52: monitorexit
    //   53: aload_2
    //   54: astore 8
    //   56: goto -19 -> 37
    //   59: ldc 118
    //   61: astore 9
    //   63: ldc 23
    //   65: astore 10
    //   67: aconst_null
    //   68: astore 11
    //   70: iconst_0
    //   71: istore 12
    //   73: ldc 120
    //   75: astore 13
    //   77: aload 8
    //   79: aload 10
    //   81: aconst_null
    //   82: aconst_null
    //   83: aconst_null
    //   84: aconst_null
    //   85: aconst_null
    //   86: aload 9
    //   88: aload 13
    //   90: invokevirtual 124	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   93: astore 10
    //   95: aload 10
    //   97: invokeinterface 128 1 0
    //   102: istore 7
    //   104: iload 7
    //   106: ifeq +33 -> 139
    //   109: aload 10
    //   111: invokestatic 131	com/google/android/gms/ads/internal/purchase/h:a	(Landroid/database/Cursor;)Lcom/google/android/gms/ads/internal/purchase/f;
    //   114: astore 8
    //   116: aload_2
    //   117: aload 8
    //   119: invokeinterface 137 2 0
    //   124: pop
    //   125: aload 10
    //   127: invokeinterface 140 1 0
    //   132: istore 7
    //   134: iload 7
    //   136: ifne -27 -> 109
    //   139: aload 10
    //   141: ifnull +10 -> 151
    //   144: aload 10
    //   146: invokeinterface 143 1 0
    //   151: aload_1
    //   152: monitorexit
    //   153: aload_2
    //   154: astore 8
    //   156: goto -119 -> 37
    //   159: astore 8
    //   161: aconst_null
    //   162: astore 10
    //   164: ldc -111
    //   166: astore 11
    //   168: aload 8
    //   170: invokevirtual 149	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   173: astore 8
    //   175: aload 8
    //   177: invokestatic 152	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   180: astore 8
    //   182: aload 8
    //   184: invokevirtual 156	java/lang/String:length	()I
    //   187: istore 12
    //   189: iload 12
    //   191: ifeq +39 -> 230
    //   194: aload 11
    //   196: aload 8
    //   198: invokevirtual 160	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   201: astore 8
    //   203: aload 8
    //   205: invokestatic 90	com/google/android/gms/b/tp:e	(Ljava/lang/String;)V
    //   208: aload 10
    //   210: ifnull -59 -> 151
    //   213: aload 10
    //   215: invokeinterface 143 1 0
    //   220: goto -69 -> 151
    //   223: astore 8
    //   225: aload_1
    //   226: monitorexit
    //   227: aload 8
    //   229: athrow
    //   230: new 37	java/lang/String
    //   233: astore 8
    //   235: aload 8
    //   237: aload 11
    //   239: invokespecial 162	java/lang/String:<init>	(Ljava/lang/String;)V
    //   242: goto -39 -> 203
    //   245: astore 8
    //   247: aload 10
    //   249: ifnull +10 -> 259
    //   252: aload 10
    //   254: invokeinterface 143 1 0
    //   259: aload 8
    //   261: athrow
    //   262: astore 8
    //   264: aconst_null
    //   265: astore 10
    //   267: goto -20 -> 247
    //   270: astore 8
    //   272: goto -108 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	this	h
    //   3	223	1	localObject1	Object
    //   9	145	2	localLinkedList	java.util.LinkedList
    //   17	5	3	l1	long
    //   19	4	5	l2	long
    //   25	110	7	bool	boolean
    //   35	120	8	localObject2	Object
    //   159	10	8	localSQLiteException1	SQLiteException
    //   173	31	8	str1	String
    //   223	5	8	localObject3	Object
    //   233	3	8	str2	String
    //   245	15	8	localObject4	Object
    //   262	1	8	localObject5	Object
    //   270	1	8	localSQLiteException2	SQLiteException
    //   61	26	9	str3	String
    //   65	201	10	localObject6	Object
    //   68	170	11	str4	String
    //   71	119	12	i	int
    //   75	14	13	str5	String
    // Exception table:
    //   from	to	target	type
    //   88	93	159	android/database/sqlite/SQLiteException
    //   6	9	223	finally
    //   10	14	223	finally
    //   32	34	223	finally
    //   40	44	223	finally
    //   51	53	223	finally
    //   144	151	223	finally
    //   151	153	223	finally
    //   213	220	223	finally
    //   225	227	223	finally
    //   252	259	223	finally
    //   259	262	223	finally
    //   95	102	245	finally
    //   109	114	245	finally
    //   117	125	245	finally
    //   125	132	245	finally
    //   168	173	245	finally
    //   175	180	245	finally
    //   182	187	245	finally
    //   196	201	245	finally
    //   203	208	245	finally
    //   230	233	245	finally
    //   237	242	245	finally
    //   88	93	262	finally
    //   95	102	270	android/database/sqlite/SQLiteException
    //   109	114	270	android/database/sqlite/SQLiteException
    //   117	125	270	android/database/sqlite/SQLiteException
    //   125	132	270	android/database/sqlite/SQLiteException
  }
  
  public final int c()
  {
    localCursor = null;
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      SQLiteDatabase localSQLiteDatabase;
      String str2;
      int j;
      synchronized (a)
      {
        localSQLiteDatabase = a();
        if (localSQLiteDatabase == null) {
          return i;
        }
        str2 = "select count(*) from InAppPurchase";
        j = 0;
      }
      try
      {
        localCursor = localSQLiteDatabase.rawQuery(str2, null);
        boolean bool = localCursor.moveToFirst();
        if (bool)
        {
          bool = false;
          localSQLiteDatabase = null;
          i = localCursor.getInt(0);
          if (localCursor != null) {
            localCursor.close();
          }
          continue;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        str2 = "Error getting record count";
        String str1 = localSQLiteException.getMessage();
        str1 = String.valueOf(str1);
        j = str1.length();
        if (j == 0) {
          break label170;
        }
        str1 = str2.concat(str1);
        for (;;)
        {
          tp.e(str1);
          if (localCursor == null) {
            break;
          }
          localCursor.close();
          break;
          str1 = new java/lang/String;
          str1.<init>(str2);
        }
      }
      finally
      {
        if (localCursor == null) {
          break label196;
        }
        localCursor.close();
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */