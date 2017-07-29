package com.google.android.gms.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.g.a;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class cg
  extends df
{
  private static final Map a;
  private static final Map b;
  private static final Map c;
  private static final Map d;
  private static final Map e;
  private final cg.c f;
  private final dm g;
  
  static
  {
    int i = 1;
    a locala = new android/support/v4/g/a;
    locala.<init>(i);
    a = locala;
    locala.put("origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;");
    locala = new android/support/v4/g/a;
    locala.<init>(18);
    b = locala;
    locala.put("app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;");
    b.put("app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;");
    b.put("gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;");
    b.put("dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;");
    b.put("measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;");
    b.put("last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;");
    b.put("day", "ALTER TABLE apps ADD COLUMN day INTEGER;");
    b.put("daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;");
    b.put("daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;");
    b.put("daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;");
    b.put("remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;");
    b.put("config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;");
    b.put("failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;");
    b.put("app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;");
    b.put("firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;");
    b.put("daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;");
    b.put("daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;");
    b.put("health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;");
    b.put("android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;");
    locala = new android/support/v4/g/a;
    locala.<init>(i);
    c = locala;
    locala.put("realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;");
    locala = new android/support/v4/g/a;
    locala.<init>(i);
    d = locala;
    locala.put("has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;");
    locala = new android/support/v4/g/a;
    locala.<init>(i);
    e = locala;
    locala.put("previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;");
  }
  
  cg(dc paramdc)
  {
    super(paramdc);
    Object localObject1 = new com/google/android/gms/b/dm;
    Object localObject2 = m();
    ((dm)localObject1).<init>((com.google.android.gms.common.util.c)localObject2);
    g = ((dm)localObject1);
    localObject1 = cf.T();
    localObject2 = new com/google/android/gms/b/cg$c;
    Context localContext = n();
    ((cg.c)localObject2).<init>(this, localContext, (String)localObject1);
    f = ((cg.c)localObject2);
  }
  
  private SQLiteDatabase L()
  {
    e();
    try
    {
      cg.c localc = f;
      return localc.getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException)
    {
      uc.a("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  private boolean M()
  {
    Context localContext = n();
    String str = cf.T();
    return localContext.getDatabasePath(str).exists();
  }
  
  private Object a(Cursor paramCursor, int paramInt)
  {
    Object localObject1 = null;
    int i = Build.VERSION.SDK_INT;
    i = paramCursor.getType(paramInt);
    Object localObject2;
    Object localObject3;
    switch (i)
    {
    default: 
      localObject2 = ua;
      String str = "Loaded invalid unknown value type, ignoring it";
      localObject3 = Integer.valueOf(i);
      ((cu.a)localObject2).a(str, localObject3);
    }
    for (;;)
    {
      return localObject1;
      localObject3 = ua;
      localObject2 = "Loaded invalid null value from database";
      ((cu.a)localObject3).a((String)localObject2);
      continue;
      long l = paramCursor.getLong(paramInt);
      localObject1 = Long.valueOf(l);
      continue;
      double d1 = paramCursor.getDouble(paramInt);
      localObject1 = Double.valueOf(d1);
      continue;
      localObject1 = paramCursor.getString(paramInt);
      continue;
      localObject3 = ua;
      localObject2 = "Loaded invalid blob type value, ignoring it";
      ((cu.a)localObject3).a((String)localObject2);
    }
  }
  
  private static Set a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    int i = String.valueOf(paramString).length() + 22;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>(i);
    Object localObject3 = "SELECT * FROM " + paramString + " LIMIT 0";
    localObject2 = null;
    localObject3 = paramSQLiteDatabase.rawQuery((String)localObject3, null);
    try
    {
      localObject2 = ((Cursor)localObject3).getColumnNames();
      Collections.addAll(localHashSet, (Object[])localObject2);
      return localHashSet;
    }
    finally
    {
      ((Cursor)localObject3).close();
    }
  }
  
  private static void a(ContentValues paramContentValues, String paramString, Object paramObject)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    com.google.android.gms.common.internal.c.a(paramObject);
    boolean bool = paramObject instanceof String;
    if (bool)
    {
      paramObject = (String)paramObject;
      paramContentValues.put(paramString, (String)paramObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Long;
      if (bool)
      {
        paramObject = (Long)paramObject;
        paramContentValues.put(paramString, (Long)paramObject);
      }
      else
      {
        bool = paramObject instanceof Double;
        if (!bool) {
          break;
        }
        paramObject = (Double)paramObject;
        paramContentValues.put(paramString, (Double)paramObject);
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Invalid value type");
    throw localIllegalArgumentException;
  }
  
  static void a(cu paramcu, SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = true;
    if (paramcu == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Monitor must not be null");
      throw ((Throwable)localObject1);
    }
    int i = Build.VERSION.SDK_INT;
    Object localObject1 = new java/io/File;
    Object localObject2 = paramSQLiteDatabase.getPath();
    ((File)localObject1).<init>((String)localObject2);
    boolean bool3 = ((File)localObject1).setReadable(false, false);
    String str;
    if (!bool3)
    {
      localObject2 = c;
      str = "Failed to turn off database read permission";
      ((cu.a)localObject2).a(str);
    }
    bool3 = ((File)localObject1).setWritable(false, false);
    if (!bool3)
    {
      localObject2 = c;
      str = "Failed to turn off database write permission";
      ((cu.a)localObject2).a(str);
    }
    bool3 = ((File)localObject1).setReadable(bool1, bool1);
    if (!bool3)
    {
      localObject2 = c;
      str = "Failed to turn on database read permission for owner";
      ((cu.a)localObject2).a(str);
    }
    boolean bool2 = ((File)localObject1).setWritable(bool1, bool1);
    if (!bool2)
    {
      localObject1 = c;
      localObject2 = "Failed to turn on database write permission for owner";
      ((cu.a)localObject1).a((String)localObject2);
    }
  }
  
  static void a(cu paramcu, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, Map paramMap)
  {
    if (paramcu == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Monitor must not be null");
      throw localIllegalArgumentException;
    }
    boolean bool = a(paramcu, paramSQLiteDatabase, paramString1);
    if (!bool) {
      paramSQLiteDatabase.execSQL(paramString2);
    }
    try
    {
      a(paramcu, paramSQLiteDatabase, paramString1, paramString3, paramMap);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      a.a("Failed to verify columns on table that was just created", paramString1);
      throw localSQLiteException;
    }
  }
  
  private static void a(cu paramcu, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, Map paramMap)
  {
    if (paramcu == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Monitor must not be null");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = a(paramSQLiteDatabase, paramString1);
    Object localObject3 = paramString2.split(",");
    int i = localObject3.length;
    int j = 0;
    Object localObject1 = null;
    while (j < i)
    {
      Object localObject4 = localObject3[j];
      boolean bool3 = ((Set)localObject2).remove(localObject4);
      if (!bool3)
      {
        localObject1 = new android/database/sqlite/SQLiteException;
        int k = String.valueOf(paramString1).length() + 35;
        int m = String.valueOf(localObject4).length();
        k += m;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(k);
        localObject2 = "Table " + paramString1 + " is missing required column: " + (String)localObject4;
        ((SQLiteException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      j += 1;
    }
    Object localObject5;
    if (paramMap != null)
    {
      localObject1 = paramMap.entrySet();
      localObject3 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        localObject5 = ((Map.Entry)localObject1).getKey();
        boolean bool1 = ((Set)localObject2).remove(localObject5);
        if (!bool1)
        {
          localObject1 = (String)((Map.Entry)localObject1).getValue();
          paramSQLiteDatabase.execSQL((String)localObject1);
        }
      }
    }
    boolean bool2 = ((Set)localObject2).isEmpty();
    if (!bool2)
    {
      localObject1 = c;
      localObject3 = "Table has extra columns. table, columns";
      localObject5 = ", ";
      localObject2 = TextUtils.join((CharSequence)localObject5, (Iterable)localObject2);
      ((cu.a)localObject1).a((String)localObject3, paramString1, localObject2);
    }
  }
  
  /* Error */
  private static boolean a(cu paramcu, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ifnonnull +19 -> 22
    //   6: new 316	java/lang/IllegalArgumentException
    //   9: astore 4
    //   11: aload 4
    //   13: ldc_w 322
    //   16: invokespecial 320	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   19: aload 4
    //   21: athrow
    //   22: ldc_w 415
    //   25: astore 5
    //   27: iconst_1
    //   28: istore 6
    //   30: iload 6
    //   32: anewarray 255	java/lang/String
    //   35: astore 7
    //   37: iconst_0
    //   38: istore 6
    //   40: aconst_null
    //   41: astore 4
    //   43: ldc_w 417
    //   46: astore 8
    //   48: aload 7
    //   50: iconst_0
    //   51: aload 8
    //   53: aastore
    //   54: ldc_w 419
    //   57: astore 8
    //   59: iconst_1
    //   60: istore 6
    //   62: iload 6
    //   64: anewarray 255	java/lang/String
    //   67: astore 9
    //   69: iconst_0
    //   70: istore 6
    //   72: aconst_null
    //   73: astore 4
    //   75: aload 9
    //   77: iconst_0
    //   78: aload_2
    //   79: aastore
    //   80: aload_1
    //   81: astore 4
    //   83: aload_1
    //   84: aload 5
    //   86: aload 7
    //   88: aload 8
    //   90: aload 9
    //   92: aconst_null
    //   93: aconst_null
    //   94: aconst_null
    //   95: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   98: astore 5
    //   100: aload 5
    //   102: invokeinterface 426 1 0
    //   107: istore 6
    //   109: aload 5
    //   111: ifnull +10 -> 121
    //   114: aload 5
    //   116: invokeinterface 295 1 0
    //   121: iload 6
    //   123: ireturn
    //   124: astore 4
    //   126: aconst_null
    //   127: astore 5
    //   129: aload_0
    //   130: getfield 177	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   133: astore 7
    //   135: ldc_w 428
    //   138: astore 8
    //   140: aload 7
    //   142: aload 8
    //   144: aload_2
    //   145: aload 4
    //   147: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   150: aload 5
    //   152: ifnull +10 -> 162
    //   155: aload 5
    //   157: invokeinterface 295 1 0
    //   162: iconst_0
    //   163: istore 6
    //   165: aconst_null
    //   166: astore 4
    //   168: goto -47 -> 121
    //   171: astore 4
    //   173: aload_3
    //   174: ifnull +9 -> 183
    //   177: aload_3
    //   178: invokeinterface 295 1 0
    //   183: aload 4
    //   185: athrow
    //   186: astore 4
    //   188: aload 5
    //   190: astore_3
    //   191: goto -18 -> 173
    //   194: astore 4
    //   196: goto -67 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	paramcu	cu
    //   0	199	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	199	2	paramString	String
    //   1	190	3	localObject1	Object
    //   9	73	4	localObject2	Object
    //   124	22	4	localSQLiteException1	SQLiteException
    //   166	1	4	localObject3	Object
    //   171	13	4	localObject4	Object
    //   186	1	4	localObject5	Object
    //   194	1	4	localSQLiteException2	SQLiteException
    //   25	164	5	localObject6	Object
    //   28	136	6	bool	boolean
    //   35	106	7	localObject7	Object
    //   46	97	8	str	String
    //   67	24	9	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   30	35	124	android/database/sqlite/SQLiteException
    //   51	54	124	android/database/sqlite/SQLiteException
    //   62	67	124	android/database/sqlite/SQLiteException
    //   78	80	124	android/database/sqlite/SQLiteException
    //   94	98	124	android/database/sqlite/SQLiteException
    //   30	35	171	finally
    //   51	54	171	finally
    //   62	67	171	finally
    //   78	80	171	finally
    //   94	98	171	finally
    //   100	107	186	finally
    //   129	133	186	finally
    //   145	150	186	finally
    //   100	107	194	android/database/sqlite/SQLiteException
  }
  
  private boolean a(String paramString, int paramInt, ds.b paramb)
  {
    boolean bool1 = false;
    J();
    e();
    com.google.android.gms.common.internal.c.a(paramString);
    com.google.android.gms.common.internal.c.a(paramb);
    Object localObject1 = b;
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool2)
    {
      localObject1 = uc;
      localObject2 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId";
      localObject3 = cu.a(paramString);
      localObject4 = Integer.valueOf(paramInt);
      String str = String.valueOf(a);
      ((cu.a)localObject1).a((String)localObject2, localObject3, localObject4, str);
    }
    for (;;)
    {
      return bool1;
      try
      {
        int i = paramb.f();
        localObject1 = new byte[i];
        int j = localObject1.length;
        localObject2 = fu.a((byte[])localObject1, j);
        paramb.a((fu)localObject2);
        ((fu)localObject2).a();
        localObject2 = new android/content/ContentValues;
        ((ContentValues)localObject2).<init>();
        ((ContentValues)localObject2).put("app_id", paramString);
        localObject4 = Integer.valueOf(paramInt);
        ((ContentValues)localObject2).put("audience_id", (Integer)localObject4);
        localObject4 = a;
        ((ContentValues)localObject2).put("filter_id", (Integer)localObject4);
        localObject4 = b;
        ((ContentValues)localObject2).put("event_name", (String)localObject4);
        localObject3 = "data";
        ((ContentValues)localObject2).put((String)localObject3, (byte[])localObject1);
      }
      catch (IOException localIOException)
      {
        try
        {
          localObject1 = L();
          localObject3 = "event_filters";
          localObject4 = null;
          int k = 5;
          long l1 = ((SQLiteDatabase)localObject1).insertWithOnConflict((String)localObject3, null, (ContentValues)localObject2, k);
          long l2 = -1;
          boolean bool3 = l1 < l2;
          if (!bool3)
          {
            localObject1 = u();
            localObject1 = a;
            localObject2 = "Failed to insert event filter (got -1). appId";
            localObject3 = cu.a(paramString);
            ((cu.a)localObject1).a((String)localObject2, localObject3);
          }
          bool1 = true;
        }
        catch (SQLiteException localSQLiteException)
        {
          localObject2 = ua;
          localObject3 = "Error storing event filter. appId";
          localObject4 = cu.a(paramString);
          ((cu.a)localObject2).a((String)localObject3, localObject4, localSQLiteException);
        }
        localIOException = localIOException;
        localObject2 = ua;
        localObject3 = "Configuration loss. Failed to serialize event filter. appId";
        localObject4 = cu.a(paramString);
        ((cu.a)localObject2).a((String)localObject3, localObject4, localIOException);
      }
    }
  }
  
  private boolean a(String paramString, int paramInt, ds.e parame)
  {
    boolean bool1 = false;
    J();
    e();
    com.google.android.gms.common.internal.c.a(paramString);
    com.google.android.gms.common.internal.c.a(parame);
    Object localObject1 = b;
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool2)
    {
      localObject1 = uc;
      localObject2 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId";
      localObject3 = cu.a(paramString);
      localObject4 = Integer.valueOf(paramInt);
      String str = String.valueOf(a);
      ((cu.a)localObject1).a((String)localObject2, localObject3, localObject4, str);
    }
    for (;;)
    {
      return bool1;
      try
      {
        int i = parame.f();
        localObject1 = new byte[i];
        int j = localObject1.length;
        localObject2 = fu.a((byte[])localObject1, j);
        parame.a((fu)localObject2);
        ((fu)localObject2).a();
        localObject2 = new android/content/ContentValues;
        ((ContentValues)localObject2).<init>();
        ((ContentValues)localObject2).put("app_id", paramString);
        localObject4 = Integer.valueOf(paramInt);
        ((ContentValues)localObject2).put("audience_id", (Integer)localObject4);
        localObject4 = a;
        ((ContentValues)localObject2).put("filter_id", (Integer)localObject4);
        localObject4 = b;
        ((ContentValues)localObject2).put("property_name", (String)localObject4);
        localObject3 = "data";
        ((ContentValues)localObject2).put((String)localObject3, (byte[])localObject1);
        try
        {
          localObject1 = L();
          localObject3 = "property_filters";
          localObject4 = null;
          int k = 5;
          long l1 = ((SQLiteDatabase)localObject1).insertWithOnConflict((String)localObject3, null, (ContentValues)localObject2, k);
          long l2 = -1;
          boolean bool3 = l1 < l2;
          if (bool3) {
            break label363;
          }
          localObject1 = u();
          localObject1 = a;
          localObject2 = "Failed to insert property filter (got -1). appId";
          localObject3 = cu.a(paramString);
          ((cu.a)localObject1).a((String)localObject2, localObject3);
        }
        catch (SQLiteException localSQLiteException)
        {
          localObject2 = ua;
          localObject3 = "Error storing property filter. appId";
          localObject4 = cu.a(paramString);
          ((cu.a)localObject2).a((String)localObject3, localObject4, localSQLiteException);
        }
      }
      catch (IOException localIOException)
      {
        localObject2 = ua;
        localObject3 = "Configuration loss. Failed to serialize property filter. appId";
        localObject4 = cu.a(paramString);
        ((cu.a)localObject2).a((String)localObject3, localObject4, localIOException);
      }
      continue;
      label363:
      bool1 = true;
    }
  }
  
  private boolean a(String paramString, List paramList)
  {
    bool1 = true;
    bool2 = false;
    com.google.android.gms.common.internal.c.a(paramString);
    J();
    e();
    localObject1 = L();
    String str1 = "select count(1) from audience_filter_values where app_id=?";
    i = 1;
    try
    {
      localObject3 = new String[i];
      j = 0;
      localObject4 = null;
      localObject3[0] = paramString;
      long l1 = a(str1, (String[])localObject3);
      localObject4 = w();
      localObject5 = cp.L;
      j = ((cf)localObject4).b(paramString, (cp.a)localObject5);
      k = 2000;
      j = Math.min(k, j);
      j = Math.max(0, j);
      long l2 = j;
      boolean bool3 = l1 < l2;
      if (bool3) {
        break label159;
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        int j;
        Object localObject3 = ua;
        String str2 = "Database error querying filters. appId";
        localObject1 = cu.a(paramString);
        ((cu.a)localObject3).a(str2, localObject1, localSQLiteException);
        continue;
        Object localObject5 = new java/util/ArrayList;
        ((ArrayList)localObject5).<init>();
        i = 0;
        localObject3 = null;
        for (;;)
        {
          m = paramList.size();
          if (i >= m) {
            break label256;
          }
          localObject2 = (Integer)paramList.get(i);
          if (localObject2 == null) {
            break;
          }
          boolean bool4 = localObject2 instanceof Integer;
          if (!bool4) {
            break;
          }
          localObject2 = Integer.toString(((Integer)localObject2).intValue());
          ((List)localObject5).add(localObject2);
          m = i + 1;
          i = m;
        }
        Object localObject2 = String.valueOf(TextUtils.join(",", (Iterable)localObject5));
        i = String.valueOf(localObject2).length() + 2;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>(i);
        localObject2 = "(" + (String)localObject2 + ")";
        localObject3 = "audience_filter_values";
        int k = String.valueOf(localObject2).length() + 140;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(k);
        localObject2 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + (String)localObject2 + " order by rowid desc limit -1 offset ?)";
        k = 2;
        localObject5 = new String[k];
        localObject5[0] = paramString;
        Object localObject4 = Integer.toString(j);
        localObject5[bool1] = localObject4;
        int m = ((SQLiteDatabase)localObject1).delete((String)localObject3, (String)localObject2, (String[])localObject5);
        if (m > 0) {
          bool2 = bool1;
        }
      }
    }
    return bool2;
  }
  
  /* Error */
  private List b(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   4: aload_0
    //   5: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   8: new 546	java/util/ArrayList
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 547	java/util/ArrayList:<init>	()V
    //   16: iconst_0
    //   17: istore 4
    //   19: aload_0
    //   20: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: astore 5
    //   25: ldc_w 581
    //   28: astore 6
    //   30: bipush 13
    //   32: istore 7
    //   34: iload 7
    //   36: anewarray 255	java/lang/String
    //   39: astore 8
    //   41: iconst_0
    //   42: istore 9
    //   44: aconst_null
    //   45: astore 10
    //   47: ldc_w 465
    //   50: astore 11
    //   52: aload 8
    //   54: iconst_0
    //   55: aload 11
    //   57: aastore
    //   58: iconst_1
    //   59: istore 9
    //   61: ldc 25
    //   63: astore 11
    //   65: aload 8
    //   67: iload 9
    //   69: aload 11
    //   71: aastore
    //   72: iconst_2
    //   73: istore 9
    //   75: ldc_w 417
    //   78: astore 11
    //   80: aload 8
    //   82: iload 9
    //   84: aload 11
    //   86: aastore
    //   87: iconst_3
    //   88: istore 9
    //   90: ldc_w 585
    //   93: astore 11
    //   95: aload 8
    //   97: iload 9
    //   99: aload 11
    //   101: aastore
    //   102: iconst_4
    //   103: istore 9
    //   105: ldc_w 588
    //   108: astore 11
    //   110: aload 8
    //   112: iload 9
    //   114: aload 11
    //   116: aastore
    //   117: iconst_5
    //   118: istore 9
    //   120: ldc_w 590
    //   123: astore 11
    //   125: aload 8
    //   127: iload 9
    //   129: aload 11
    //   131: aastore
    //   132: bipush 6
    //   134: istore 9
    //   136: ldc_w 593
    //   139: astore 11
    //   141: aload 8
    //   143: iload 9
    //   145: aload 11
    //   147: aastore
    //   148: bipush 7
    //   150: istore 9
    //   152: ldc_w 596
    //   155: astore 11
    //   157: aload 8
    //   159: iload 9
    //   161: aload 11
    //   163: aastore
    //   164: bipush 8
    //   166: istore 9
    //   168: ldc_w 599
    //   171: astore 11
    //   173: aload 8
    //   175: iload 9
    //   177: aload 11
    //   179: aastore
    //   180: bipush 9
    //   182: istore 9
    //   184: ldc_w 602
    //   187: astore 11
    //   189: aload 8
    //   191: iload 9
    //   193: aload 11
    //   195: aastore
    //   196: bipush 10
    //   198: istore 9
    //   200: ldc_w 605
    //   203: astore 11
    //   205: aload 8
    //   207: iload 9
    //   209: aload 11
    //   211: aastore
    //   212: bipush 11
    //   214: istore 9
    //   216: ldc_w 608
    //   219: astore 11
    //   221: aload 8
    //   223: iload 9
    //   225: aload 11
    //   227: aastore
    //   228: bipush 12
    //   230: istore 9
    //   232: ldc_w 611
    //   235: astore 11
    //   237: aload 8
    //   239: iload 9
    //   241: aload 11
    //   243: aastore
    //   244: aconst_null
    //   245: astore 12
    //   247: aconst_null
    //   248: astore 13
    //   250: ldc_w 613
    //   253: astore 14
    //   255: invokestatic 616	com/google/android/gms/b/cf:M	()I
    //   258: pop
    //   259: ldc_w 618
    //   262: astore 15
    //   264: aload_1
    //   265: astore 10
    //   267: aload_2
    //   268: astore 11
    //   270: aload 5
    //   272: aload 6
    //   274: aload 8
    //   276: aload_1
    //   277: aload_2
    //   278: aconst_null
    //   279: aconst_null
    //   280: aload 14
    //   282: aload 15
    //   284: invokevirtual 621	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   287: astore 16
    //   289: aload 16
    //   291: invokeinterface 426 1 0
    //   296: istore 17
    //   298: iload 17
    //   300: ifne +21 -> 321
    //   303: aload 16
    //   305: ifnull +10 -> 315
    //   308: aload 16
    //   310: invokeinterface 295 1 0
    //   315: aload_3
    //   316: astore 5
    //   318: aload 5
    //   320: areturn
    //   321: aload_3
    //   322: invokeinterface 552 1 0
    //   327: istore 17
    //   329: invokestatic 616	com/google/android/gms/b/cf:M	()I
    //   332: istore 18
    //   334: iload 17
    //   336: iload 18
    //   338: if_icmplt +60 -> 398
    //   341: aload_0
    //   342: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   345: astore 5
    //   347: aload 5
    //   349: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   352: astore 5
    //   354: ldc_w 623
    //   357: astore 6
    //   359: invokestatic 616	com/google/android/gms/b/cf:M	()I
    //   362: istore 7
    //   364: iload 7
    //   366: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   369: astore 8
    //   371: aload 5
    //   373: aload 6
    //   375: aload 8
    //   377: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   380: aload 16
    //   382: ifnull +10 -> 392
    //   385: aload 16
    //   387: invokeinterface 295 1 0
    //   392: aload_3
    //   393: astore 5
    //   395: goto -77 -> 318
    //   398: iconst_0
    //   399: istore 17
    //   401: aconst_null
    //   402: astore 5
    //   404: aload 16
    //   406: iconst_0
    //   407: invokeinterface 247 2 0
    //   412: astore 13
    //   414: iconst_1
    //   415: istore 17
    //   417: aload 16
    //   419: iload 17
    //   421: invokeinterface 247 2 0
    //   426: astore 12
    //   428: iconst_2
    //   429: istore 17
    //   431: aload 16
    //   433: iload 17
    //   435: invokeinterface 247 2 0
    //   440: astore 6
    //   442: iconst_3
    //   443: istore 17
    //   445: aload_0
    //   446: aload 16
    //   448: iload 17
    //   450: invokespecial 626	com/google/android/gms/b/cg:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   453: astore 11
    //   455: iconst_4
    //   456: istore 17
    //   458: aload 16
    //   460: iload 17
    //   462: invokeinterface 629 2 0
    //   467: istore 17
    //   469: iload 17
    //   471: ifeq +296 -> 767
    //   474: iconst_1
    //   475: istore 4
    //   477: iconst_5
    //   478: istore 17
    //   480: aload 16
    //   482: iload 17
    //   484: invokeinterface 247 2 0
    //   489: astore 19
    //   491: bipush 6
    //   493: istore 17
    //   495: aload 16
    //   497: iload 17
    //   499: invokeinterface 229 2 0
    //   504: lstore 20
    //   506: aload_0
    //   507: invokevirtual 633	com/google/android/gms/b/cg:q	()Lcom/google/android/gms/b/dr;
    //   510: astore 5
    //   512: bipush 7
    //   514: istore 7
    //   516: aload 16
    //   518: iload 7
    //   520: invokeinterface 637 2 0
    //   525: astore 8
    //   527: getstatic 643	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   530: astore 10
    //   532: aload 5
    //   534: aload 8
    //   536: aload 10
    //   538: invokevirtual 648	com/google/android/gms/b/dr:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   541: astore 22
    //   543: aload 22
    //   545: checkcast 639	com/google/android/gms/b/cn
    //   548: astore 22
    //   550: bipush 8
    //   552: istore 17
    //   554: aload 16
    //   556: iload 17
    //   558: invokeinterface 229 2 0
    //   563: lstore 23
    //   565: aload_0
    //   566: invokevirtual 633	com/google/android/gms/b/cg:q	()Lcom/google/android/gms/b/dr;
    //   569: astore 5
    //   571: bipush 9
    //   573: istore 7
    //   575: aload 16
    //   577: iload 7
    //   579: invokeinterface 637 2 0
    //   584: astore 8
    //   586: getstatic 643	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   589: astore 10
    //   591: aload 5
    //   593: aload 8
    //   595: aload 10
    //   597: invokevirtual 648	com/google/android/gms/b/dr:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   600: astore 25
    //   602: aload 25
    //   604: checkcast 639	com/google/android/gms/b/cn
    //   607: astore 25
    //   609: bipush 10
    //   611: istore 17
    //   613: aload 16
    //   615: iload 17
    //   617: invokeinterface 229 2 0
    //   622: lstore 26
    //   624: bipush 11
    //   626: istore 17
    //   628: aload 16
    //   630: iload 17
    //   632: invokeinterface 229 2 0
    //   637: lstore 28
    //   639: aload_0
    //   640: invokevirtual 633	com/google/android/gms/b/cg:q	()Lcom/google/android/gms/b/dr;
    //   643: astore 5
    //   645: bipush 12
    //   647: istore 30
    //   649: aload 16
    //   651: iload 30
    //   653: invokeinterface 637 2 0
    //   658: astore 31
    //   660: getstatic 643	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   663: astore 32
    //   665: aload 5
    //   667: aload 31
    //   669: aload 32
    //   671: invokevirtual 648	com/google/android/gms/b/dr:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   674: astore 31
    //   676: aload 31
    //   678: checkcast 639	com/google/android/gms/b/cn
    //   681: astore 31
    //   683: new 650	com/google/android/gms/b/do
    //   686: astore 5
    //   688: aload 5
    //   690: aload 6
    //   692: lload 26
    //   694: aload 11
    //   696: aload 12
    //   698: invokespecial 653	com/google/android/gms/b/do:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   701: new 655	com/google/android/gms/b/cd
    //   704: astore 10
    //   706: aload 13
    //   708: astore 11
    //   710: aload 5
    //   712: astore 13
    //   714: aload 10
    //   716: aload 11
    //   718: aload 12
    //   720: aload 5
    //   722: lload 23
    //   724: iload 4
    //   726: aload 19
    //   728: aload 22
    //   730: lload 20
    //   732: aload 25
    //   734: lload 28
    //   736: aload 31
    //   738: invokespecial 658	com/google/android/gms/b/cd:<init>	(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/do;JZLjava/lang/String;Lcom/google/android/gms/b/cn;JLcom/google/android/gms/b/cn;JLcom/google/android/gms/b/cn;)V
    //   741: aload_3
    //   742: aload 10
    //   744: invokeinterface 564 2 0
    //   749: pop
    //   750: aload 16
    //   752: invokeinterface 661 1 0
    //   757: istore 17
    //   759: iload 17
    //   761: ifne -440 -> 321
    //   764: goto -384 -> 380
    //   767: iconst_0
    //   768: istore 4
    //   770: goto -293 -> 477
    //   773: astore 5
    //   775: iconst_0
    //   776: istore 18
    //   778: aconst_null
    //   779: astore 6
    //   781: aload_0
    //   782: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   785: astore 8
    //   787: aload 8
    //   789: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   792: astore 8
    //   794: ldc_w 663
    //   797: astore 10
    //   799: aload 8
    //   801: aload 10
    //   803: aload 5
    //   805: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   808: invokestatic 667	java/util/Collections:emptyList	()Ljava/util/List;
    //   811: astore 5
    //   813: aload 6
    //   815: ifnull -497 -> 318
    //   818: aload 6
    //   820: invokeinterface 295 1 0
    //   825: goto -507 -> 318
    //   828: astore 5
    //   830: aconst_null
    //   831: astore 16
    //   833: aload 16
    //   835: ifnull +10 -> 845
    //   838: aload 16
    //   840: invokeinterface 295 1 0
    //   845: aload 5
    //   847: athrow
    //   848: astore 5
    //   850: goto -17 -> 833
    //   853: astore 5
    //   855: aload 6
    //   857: astore 16
    //   859: goto -26 -> 833
    //   862: astore 5
    //   864: aload 16
    //   866: astore 6
    //   868: goto -87 -> 781
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	871	0	this	cg
    //   0	871	1	paramString	String
    //   0	871	2	paramArrayOfString	String[]
    //   11	731	3	localArrayList	ArrayList
    //   17	752	4	bool1	boolean
    //   23	698	5	localObject1	Object
    //   773	31	5	localSQLiteException1	SQLiteException
    //   811	1	5	localList	List
    //   828	18	5	localObject2	Object
    //   848	1	5	localObject3	Object
    //   853	1	5	localObject4	Object
    //   862	1	5	localSQLiteException2	SQLiteException
    //   28	839	6	localObject5	Object
    //   32	546	7	i	int
    //   39	761	8	localObject6	Object
    //   42	198	9	j	int
    //   45	757	10	localObject7	Object
    //   50	667	11	localObject8	Object
    //   245	474	12	str1	String
    //   248	465	13	localObject9	Object
    //   253	28	14	str2	String
    //   262	21	15	str3	String
    //   287	578	16	localObject10	Object
    //   296	3	17	bool2	boolean
    //   327	304	17	k	int
    //   757	3	17	bool3	boolean
    //   332	445	18	m	int
    //   489	238	19	str4	String
    //   504	227	20	l1	long
    //   541	188	22	localObject11	Object
    //   563	160	23	l2	long
    //   600	133	25	localObject12	Object
    //   622	71	26	l3	long
    //   637	98	28	l4	long
    //   647	5	30	n	int
    //   658	79	31	localObject13	Object
    //   663	7	32	localCreator	android.os.Parcelable.Creator
    // Exception table:
    //   from	to	target	type
    //   19	23	773	android/database/sqlite/SQLiteException
    //   34	39	773	android/database/sqlite/SQLiteException
    //   55	58	773	android/database/sqlite/SQLiteException
    //   69	72	773	android/database/sqlite/SQLiteException
    //   84	87	773	android/database/sqlite/SQLiteException
    //   99	102	773	android/database/sqlite/SQLiteException
    //   114	117	773	android/database/sqlite/SQLiteException
    //   129	132	773	android/database/sqlite/SQLiteException
    //   145	148	773	android/database/sqlite/SQLiteException
    //   161	164	773	android/database/sqlite/SQLiteException
    //   177	180	773	android/database/sqlite/SQLiteException
    //   193	196	773	android/database/sqlite/SQLiteException
    //   209	212	773	android/database/sqlite/SQLiteException
    //   225	228	773	android/database/sqlite/SQLiteException
    //   241	244	773	android/database/sqlite/SQLiteException
    //   255	259	773	android/database/sqlite/SQLiteException
    //   282	287	773	android/database/sqlite/SQLiteException
    //   19	23	828	finally
    //   34	39	828	finally
    //   55	58	828	finally
    //   69	72	828	finally
    //   84	87	828	finally
    //   99	102	828	finally
    //   114	117	828	finally
    //   129	132	828	finally
    //   145	148	828	finally
    //   161	164	828	finally
    //   177	180	828	finally
    //   193	196	828	finally
    //   209	212	828	finally
    //   225	228	828	finally
    //   241	244	828	finally
    //   255	259	828	finally
    //   282	287	828	finally
    //   289	296	848	finally
    //   321	327	848	finally
    //   329	332	848	finally
    //   341	345	848	finally
    //   347	352	848	finally
    //   359	362	848	finally
    //   364	369	848	finally
    //   375	380	848	finally
    //   406	412	848	finally
    //   419	426	848	finally
    //   433	440	848	finally
    //   448	453	848	finally
    //   460	467	848	finally
    //   482	489	848	finally
    //   497	504	848	finally
    //   506	510	848	finally
    //   518	525	848	finally
    //   527	530	848	finally
    //   536	541	848	finally
    //   543	548	848	finally
    //   556	563	848	finally
    //   565	569	848	finally
    //   577	584	848	finally
    //   586	589	848	finally
    //   595	600	848	finally
    //   602	607	848	finally
    //   615	622	848	finally
    //   630	637	848	finally
    //   639	643	848	finally
    //   651	658	848	finally
    //   660	663	848	finally
    //   669	674	848	finally
    //   676	681	848	finally
    //   683	686	848	finally
    //   696	701	848	finally
    //   701	704	848	finally
    //   736	741	848	finally
    //   742	750	848	finally
    //   750	757	848	finally
    //   781	785	853	finally
    //   787	792	853	finally
    //   803	808	853	finally
    //   808	811	853	finally
    //   289	296	862	android/database/sqlite/SQLiteException
    //   321	327	862	android/database/sqlite/SQLiteException
    //   329	332	862	android/database/sqlite/SQLiteException
    //   341	345	862	android/database/sqlite/SQLiteException
    //   347	352	862	android/database/sqlite/SQLiteException
    //   359	362	862	android/database/sqlite/SQLiteException
    //   364	369	862	android/database/sqlite/SQLiteException
    //   375	380	862	android/database/sqlite/SQLiteException
    //   406	412	862	android/database/sqlite/SQLiteException
    //   419	426	862	android/database/sqlite/SQLiteException
    //   433	440	862	android/database/sqlite/SQLiteException
    //   448	453	862	android/database/sqlite/SQLiteException
    //   460	467	862	android/database/sqlite/SQLiteException
    //   482	489	862	android/database/sqlite/SQLiteException
    //   497	504	862	android/database/sqlite/SQLiteException
    //   506	510	862	android/database/sqlite/SQLiteException
    //   518	525	862	android/database/sqlite/SQLiteException
    //   527	530	862	android/database/sqlite/SQLiteException
    //   536	541	862	android/database/sqlite/SQLiteException
    //   543	548	862	android/database/sqlite/SQLiteException
    //   556	563	862	android/database/sqlite/SQLiteException
    //   565	569	862	android/database/sqlite/SQLiteException
    //   577	584	862	android/database/sqlite/SQLiteException
    //   586	589	862	android/database/sqlite/SQLiteException
    //   595	600	862	android/database/sqlite/SQLiteException
    //   602	607	862	android/database/sqlite/SQLiteException
    //   615	622	862	android/database/sqlite/SQLiteException
    //   630	637	862	android/database/sqlite/SQLiteException
    //   639	643	862	android/database/sqlite/SQLiteException
    //   651	658	862	android/database/sqlite/SQLiteException
    //   660	663	862	android/database/sqlite/SQLiteException
    //   669	674	862	android/database/sqlite/SQLiteException
    //   676	681	862	android/database/sqlite/SQLiteException
    //   683	686	862	android/database/sqlite/SQLiteException
    //   696	701	862	android/database/sqlite/SQLiteException
    //   701	704	862	android/database/sqlite/SQLiteException
    //   736	741	862	android/database/sqlite/SQLiteException
    //   742	750	862	android/database/sqlite/SQLiteException
    //   750	757	862	android/database/sqlite/SQLiteException
  }
  
  private long h(String paramString1, String paramString2)
  {
    l1 = 0L;
    l2 = -1;
    com.google.android.gms.common.internal.c.a(paramString1);
    com.google.android.gms.common.internal.c.a(paramString2);
    e();
    J();
    localSQLiteDatabase = L();
    localSQLiteDatabase.beginTransaction();
    try
    {
      Object localObject1 = String.valueOf(paramString2);
      int i = ((String)localObject1).length() + 32;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(i);
      localObject1 = "select ";
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject1 = ((StringBuilder)localObject1).append(paramString2);
      localObject3 = " from app2 where app_id=?";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      int j = 1;
      localObject3 = new String[j];
      boolean bool2 = false;
      localObject4 = null;
      localObject3[0] = paramString1;
      l3 = -1;
      l4 = a((String)localObject1, (String[])localObject3, l3);
      bool2 = l4 < l2;
      if (bool2) {
        break label318;
      }
      localObject1 = new android/content/ContentValues;
      ((ContentValues)localObject1).<init>();
      localObject3 = "app_id";
      ((ContentValues)localObject1).put((String)localObject3, paramString1);
      localObject3 = "first_open_count";
      bool2 = false;
      localObject4 = null;
      localObject4 = Integer.valueOf(0);
      ((ContentValues)localObject1).put((String)localObject3, (Integer)localObject4);
      localObject3 = "previous_install_count";
      bool2 = false;
      localObject4 = null;
      localObject4 = Integer.valueOf(0);
      ((ContentValues)localObject1).put((String)localObject3, (Integer)localObject4);
      localObject3 = "app2";
      bool2 = false;
      localObject4 = null;
      int m = 5;
      l4 = localSQLiteDatabase.insertWithOnConflict((String)localObject3, null, (ContentValues)localObject1, m);
      boolean bool1 = l4 < l2;
      if (bool1) {
        break label315;
      }
      localObject1 = u();
      localObject1 = a;
      localObject3 = "Failed to insert column (got -1). appId";
      localObject4 = cu.a(paramString1);
      ((cu.a)localObject1).a((String)localObject3, localObject4, paramString2);
      localSQLiteDatabase.endTransaction();
      l4 = l2;
    }
    catch (SQLiteException localSQLiteException1)
    {
      for (;;)
      {
        Object localObject4;
        long l3;
        label315:
        Object localObject5;
        String str;
        int n;
        String[] arrayOfString;
        int k;
        boolean bool3;
        localSQLiteException1 = localSQLiteException1;
        SQLiteException localSQLiteException2 = localSQLiteException1;
        long l4 = l1;
        Object localObject8 = u();
        localObject8 = a;
        Object localObject6 = "Error inserting column. appId";
        Object localObject7 = cu.a(paramString1);
        ((cu.a)localObject8).a((String)localObject6, localObject7, paramString2, localSQLiteException2);
        localSQLiteDatabase.endTransaction();
      }
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
    return l4;
    l4 = l1;
  }
  
  /* Error */
  public final String A()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_2
    //   7: ldc_w 703
    //   10: astore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: aload_2
    //   15: aload_3
    //   16: aconst_null
    //   17: invokevirtual 282	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   20: astore_3
    //   21: aload_3
    //   22: invokeinterface 426 1 0
    //   27: istore 5
    //   29: iload 5
    //   31: ifeq +28 -> 59
    //   34: iconst_0
    //   35: istore 5
    //   37: aconst_null
    //   38: astore_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 247 2 0
    //   46: astore_1
    //   47: aload_3
    //   48: ifnull +9 -> 57
    //   51: aload_3
    //   52: invokeinterface 295 1 0
    //   57: aload_1
    //   58: areturn
    //   59: aload_3
    //   60: ifnull -3 -> 57
    //   63: aload_3
    //   64: invokeinterface 295 1 0
    //   69: goto -12 -> 57
    //   72: astore_2
    //   73: aconst_null
    //   74: astore_3
    //   75: aload_0
    //   76: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   79: astore 4
    //   81: aload 4
    //   83: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   86: astore 4
    //   88: ldc_w 705
    //   91: astore 6
    //   93: aload 4
    //   95: aload 6
    //   97: aload_2
    //   98: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   101: aload_3
    //   102: ifnull -45 -> 57
    //   105: aload_3
    //   106: invokeinterface 295 1 0
    //   111: goto -54 -> 57
    //   114: astore_2
    //   115: aconst_null
    //   116: astore_3
    //   117: aload_2
    //   118: astore_1
    //   119: aload_3
    //   120: ifnull +9 -> 129
    //   123: aload_3
    //   124: invokeinterface 295 1 0
    //   129: aload_1
    //   130: athrow
    //   131: astore_1
    //   132: goto -13 -> 119
    //   135: astore_2
    //   136: goto -61 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	cg
    //   1	129	1	localObject1	Object
    //   131	1	1	localObject2	Object
    //   6	33	2	localSQLiteDatabase	SQLiteDatabase
    //   72	26	2	localSQLiteException1	SQLiteException
    //   114	4	2	localObject3	Object
    //   135	1	2	localSQLiteException2	SQLiteException
    //   10	114	3	localObject4	Object
    //   12	82	4	localObject5	Object
    //   27	9	5	bool	boolean
    //   91	5	6	str	String
    // Exception table:
    //   from	to	target	type
    //   16	20	72	android/database/sqlite/SQLiteException
    //   16	20	114	finally
    //   21	27	131	finally
    //   40	46	131	finally
    //   75	79	131	finally
    //   81	86	131	finally
    //   97	101	131	finally
    //   21	27	135	android/database/sqlite/SQLiteException
    //   40	46	135	android/database/sqlite/SQLiteException
  }
  
  final void B()
  {
    e();
    J();
    boolean bool = M();
    if (!bool) {}
    for (;;)
    {
      return;
      Object localObject1 = vf;
      long l1 = ((cy.b)localObject1).a();
      Object localObject2 = m();
      long l2 = ((com.google.android.gms.common.util.c)localObject2).b();
      l1 = Math.abs(l2 - l1);
      long l3 = cf.ab();
      bool = l1 < l3;
      if (bool)
      {
        localObject1 = vf;
        ((cy.b)localObject1).a(l2);
        e();
        J();
        bool = M();
        if (bool)
        {
          localObject1 = L();
          int j = 2;
          Object localObject3 = new String[j];
          String str = String.valueOf(m().a());
          localObject3[0] = str;
          int k = 1;
          l3 = cf.aa();
          str = String.valueOf(l3);
          localObject3[k] = str;
          localObject2 = "queue";
          str = "abs(bundle_end_timestamp - ?) > cast(? as integer)";
          int i = ((SQLiteDatabase)localObject1).delete((String)localObject2, str, (String[])localObject3);
          if (i > 0)
          {
            localObject3 = ug;
            localObject2 = "Deleted stale rows. rowsDeleted";
            localObject1 = Integer.valueOf(i);
            ((cu.a)localObject3).a((String)localObject2, localObject1);
          }
        }
      }
    }
  }
  
  public final long C()
  {
    long l = -1;
    localCursor = null;
    for (;;)
    {
      try
      {
        localSQLiteDatabase = L();
        localObject1 = "select rowid from raw_events order by rowid desc limit 1;";
        str = null;
        localCursor = localSQLiteDatabase.rawQuery((String)localObject1, null);
        bool = localCursor.moveToFirst();
        if (bool) {
          continue;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        SQLiteDatabase localSQLiteDatabase;
        boolean bool;
        Object localObject1 = u();
        localObject1 = a;
        String str = "Error querying raw events";
        ((cu.a)localObject1).a(str, localSQLiteException);
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
        continue;
      }
      finally
      {
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
      }
      return l;
      bool = false;
      localSQLiteDatabase = null;
      l = localCursor.getLong(0);
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  public final long a(du.e parame)
  {
    e();
    J();
    com.google.android.gms.common.internal.c.a(parame);
    Object localObject1 = o;
    com.google.android.gms.common.internal.c.a((String)localObject1);
    for (;;)
    {
      try
      {
        int i = parame.f();
        Object localObject2 = new byte[i];
        i = localObject2.length;
        localObject1 = fu.a((byte[])localObject2, i);
        parame.a((fu)localObject1);
        ((fu)localObject1).a();
        localObject1 = q();
        com.google.android.gms.common.internal.c.a(localObject2);
        ((dr)localObject1).e();
        localObject3 = dr.g("MD5");
        Object localObject5;
        String str;
        if (localObject3 == null)
        {
          localObject1 = ua;
          localObject3 = "Failed to get MD5";
          ((cu.a)localObject1).a((String)localObject3);
          l = 0L;
          localObject4 = new android/content/ContentValues;
          ((ContentValues)localObject4).<init>();
          localObject5 = o;
          ((ContentValues)localObject4).put("app_id", (String)localObject5);
          localObject5 = Long.valueOf(l);
          ((ContentValues)localObject4).put("metadata_fingerprint", (Long)localObject5);
          str = "metadata";
          ((ContentValues)localObject4).put(str, (byte[])localObject2);
        }
        int j;
        arrayOfByte = ((MessageDigest)localObject3).digest((byte[])localObject2);
      }
      catch (IOException localIOException)
      {
        try
        {
          localObject2 = L();
          str = "raw_events_metadata";
          localObject5 = null;
          j = 4;
          ((SQLiteDatabase)localObject2).insertWithOnConflict(str, null, (ContentValues)localObject4, j);
          return l;
        }
        catch (SQLiteException localSQLiteException)
        {
          long l;
          byte[] arrayOfByte;
          Object localObject3 = ua;
          Object localObject4 = cu.a(o);
          ((cu.a)localObject3).a("Error storing raw event metadata. appId", localObject4, localSQLiteException);
          throw localSQLiteException;
        }
        localIOException = localIOException;
        localObject3 = ua;
        localObject4 = cu.a(o);
        ((cu.a)localObject3).a("Data loss. Failed to serialize event metadata. appId", localObject4, localIOException);
        throw localIOException;
      }
      l = dr.c(arrayOfByte);
    }
  }
  
  final long a(String paramString, String[] paramArrayOfString)
  {
    Object localObject1 = L();
    Cursor localCursor = null;
    try
    {
      localCursor = ((SQLiteDatabase)localObject1).rawQuery(paramString, paramArrayOfString);
      boolean bool = localCursor.moveToFirst();
      if (bool)
      {
        bool = false;
        localObject1 = null;
        long l = localCursor.getLong(0);
        return l;
      }
      localObject1 = new android/database/sqlite/SQLiteException;
      localObject3 = "Database returned empty set";
      ((SQLiteException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    catch (SQLiteException localSQLiteException)
    {
      Object localObject3 = u();
      localObject3 = a;
      String str = "Database error";
      ((cu.a)localObject3).a(str, paramString, localSQLiteException);
      throw localSQLiteException;
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  /* Error */
  final long a(String paramString, String[] paramArrayOfString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: aload 5
    //   11: aload_1
    //   12: aload_2
    //   13: invokevirtual 282	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   16: astore 6
    //   18: aload 6
    //   20: invokeinterface 426 1 0
    //   25: istore 7
    //   27: iload 7
    //   29: ifeq +32 -> 61
    //   32: iconst_0
    //   33: istore 7
    //   35: aconst_null
    //   36: astore 5
    //   38: aload 6
    //   40: iconst_0
    //   41: invokeinterface 229 2 0
    //   46: lstore_3
    //   47: aload 6
    //   49: ifnull +10 -> 59
    //   52: aload 6
    //   54: invokeinterface 295 1 0
    //   59: lload_3
    //   60: lreturn
    //   61: aload 6
    //   63: ifnull -4 -> 59
    //   66: aload 6
    //   68: invokeinterface 295 1 0
    //   73: goto -14 -> 59
    //   76: astore 5
    //   78: aload_0
    //   79: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   82: astore 8
    //   84: aload 8
    //   86: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   89: astore 8
    //   91: ldc_w 793
    //   94: astore 9
    //   96: aload 8
    //   98: aload 9
    //   100: aload_1
    //   101: aload 5
    //   103: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   106: aload 5
    //   108: athrow
    //   109: astore 5
    //   111: aload 6
    //   113: ifnull +10 -> 123
    //   116: aload 6
    //   118: invokeinterface 295 1 0
    //   123: aload 5
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	cg
    //   0	126	1	paramString	String
    //   0	126	2	paramArrayOfString	String[]
    //   0	126	3	paramLong	long
    //   4	33	5	localSQLiteDatabase	SQLiteDatabase
    //   76	31	5	localSQLiteException	SQLiteException
    //   109	15	5	localObject1	Object
    //   7	110	6	localCursor	Cursor
    //   25	9	7	bool	boolean
    //   82	15	8	localObject2	Object
    //   94	5	9	str	String
    // Exception table:
    //   from	to	target	type
    //   12	16	76	android/database/sqlite/SQLiteException
    //   18	25	76	android/database/sqlite/SQLiteException
    //   40	46	76	android/database/sqlite/SQLiteException
    //   12	16	109	finally
    //   18	25	109	finally
    //   40	46	109	finally
    //   78	82	109	finally
    //   84	89	109	finally
    //   101	106	109	finally
    //   106	109	109	finally
  }
  
  /* Error */
  public final cg.a a(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   9: aload_0
    //   10: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   13: iconst_1
    //   14: anewarray 255	java/lang/String
    //   17: astore 9
    //   19: aconst_null
    //   20: astore 10
    //   22: aload 9
    //   24: iconst_0
    //   25: aload_3
    //   26: aastore
    //   27: new 795	com/google/android/gms/b/cg$a
    //   30: astore 11
    //   32: aload 11
    //   34: invokespecial 796	com/google/android/gms/b/cg$a:<init>	()V
    //   37: aload_0
    //   38: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 10
    //   43: ldc_w 798
    //   46: astore 12
    //   48: bipush 6
    //   50: istore 13
    //   52: iload 13
    //   54: anewarray 255	java/lang/String
    //   57: astore 14
    //   59: iconst_0
    //   60: istore 15
    //   62: aconst_null
    //   63: astore 16
    //   65: ldc 62
    //   67: astore 17
    //   69: aload 14
    //   71: iconst_0
    //   72: aload 17
    //   74: aastore
    //   75: iconst_1
    //   76: istore 15
    //   78: ldc 70
    //   80: astore 17
    //   82: aload 14
    //   84: iload 15
    //   86: aload 17
    //   88: aastore
    //   89: iconst_2
    //   90: istore 15
    //   92: ldc 66
    //   94: astore 17
    //   96: aload 14
    //   98: iload 15
    //   100: aload 17
    //   102: aastore
    //   103: iconst_3
    //   104: istore 15
    //   106: ldc 74
    //   108: astore 17
    //   110: aload 14
    //   112: iload 15
    //   114: aload 17
    //   116: aastore
    //   117: iconst_4
    //   118: istore 15
    //   120: ldc 98
    //   122: astore 17
    //   124: aload 14
    //   126: iload 15
    //   128: aload 17
    //   130: aastore
    //   131: iconst_5
    //   132: istore 15
    //   134: ldc 102
    //   136: astore 17
    //   138: aload 14
    //   140: iload 15
    //   142: aload 17
    //   144: aastore
    //   145: ldc_w 800
    //   148: astore 16
    //   150: iconst_1
    //   151: istore 18
    //   153: iload 18
    //   155: anewarray 255	java/lang/String
    //   158: astore 17
    //   160: aload 17
    //   162: iconst_0
    //   163: aload_3
    //   164: aastore
    //   165: aload 10
    //   167: aload 12
    //   169: aload 14
    //   171: aload 16
    //   173: aload 17
    //   175: aconst_null
    //   176: aconst_null
    //   177: aconst_null
    //   178: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   181: astore 12
    //   183: aload 12
    //   185: invokeinterface 426 1 0
    //   190: istore 13
    //   192: iload 13
    //   194: ifne +55 -> 249
    //   197: aload_0
    //   198: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   201: astore 10
    //   203: aload 10
    //   205: getfield 177	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   208: astore 10
    //   210: ldc_w 802
    //   213: astore 14
    //   215: aload_3
    //   216: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   219: astore 16
    //   221: aload 10
    //   223: aload 14
    //   225: aload 16
    //   227: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   230: aload 12
    //   232: ifnull +10 -> 242
    //   235: aload 12
    //   237: invokeinterface 295 1 0
    //   242: aload 11
    //   244: astore 10
    //   246: aload 10
    //   248: areturn
    //   249: iconst_0
    //   250: istore 13
    //   252: aconst_null
    //   253: astore 14
    //   255: aload 12
    //   257: iconst_0
    //   258: invokeinterface 229 2 0
    //   263: lstore 19
    //   265: lload 19
    //   267: lload_1
    //   268: lcmp
    //   269: istore 13
    //   271: iload 13
    //   273: ifne +108 -> 381
    //   276: iconst_1
    //   277: istore 13
    //   279: aload 12
    //   281: iload 13
    //   283: invokeinterface 229 2 0
    //   288: lstore 19
    //   290: aload 11
    //   292: lload 19
    //   294: putfield 804	com/google/android/gms/b/cg$a:b	J
    //   297: iconst_2
    //   298: istore 13
    //   300: aload 12
    //   302: iload 13
    //   304: invokeinterface 229 2 0
    //   309: lstore 19
    //   311: aload 11
    //   313: lload 19
    //   315: putfield 806	com/google/android/gms/b/cg$a:a	J
    //   318: iconst_3
    //   319: istore 13
    //   321: aload 12
    //   323: iload 13
    //   325: invokeinterface 229 2 0
    //   330: lstore 19
    //   332: aload 11
    //   334: lload 19
    //   336: putfield 808	com/google/android/gms/b/cg$a:c	J
    //   339: iconst_4
    //   340: istore 13
    //   342: aload 12
    //   344: iload 13
    //   346: invokeinterface 229 2 0
    //   351: lstore 19
    //   353: aload 11
    //   355: lload 19
    //   357: putfield 810	com/google/android/gms/b/cg$a:d	J
    //   360: iconst_5
    //   361: istore 13
    //   363: aload 12
    //   365: iload 13
    //   367: invokeinterface 229 2 0
    //   372: lstore 19
    //   374: aload 11
    //   376: lload 19
    //   378: putfield 812	com/google/android/gms/b/cg$a:e	J
    //   381: iload 4
    //   383: ifeq +27 -> 410
    //   386: aload 11
    //   388: getfield 804	com/google/android/gms/b/cg$a:b	J
    //   391: lstore 19
    //   393: lconst_1
    //   394: lstore 21
    //   396: lload 19
    //   398: lload 21
    //   400: ladd
    //   401: lstore 19
    //   403: aload 11
    //   405: lload 19
    //   407: putfield 804	com/google/android/gms/b/cg$a:b	J
    //   410: iload 5
    //   412: ifeq +27 -> 439
    //   415: aload 11
    //   417: getfield 806	com/google/android/gms/b/cg$a:a	J
    //   420: lstore 19
    //   422: lconst_1
    //   423: lstore 21
    //   425: lload 19
    //   427: lload 21
    //   429: ladd
    //   430: lstore 19
    //   432: aload 11
    //   434: lload 19
    //   436: putfield 806	com/google/android/gms/b/cg$a:a	J
    //   439: iload 6
    //   441: ifeq +27 -> 468
    //   444: aload 11
    //   446: getfield 808	com/google/android/gms/b/cg$a:c	J
    //   449: lstore 19
    //   451: lconst_1
    //   452: lstore 21
    //   454: lload 19
    //   456: lload 21
    //   458: ladd
    //   459: lstore 19
    //   461: aload 11
    //   463: lload 19
    //   465: putfield 808	com/google/android/gms/b/cg$a:c	J
    //   468: iload 7
    //   470: ifeq +27 -> 497
    //   473: aload 11
    //   475: getfield 810	com/google/android/gms/b/cg$a:d	J
    //   478: lstore 19
    //   480: lconst_1
    //   481: lstore 21
    //   483: lload 19
    //   485: lload 21
    //   487: ladd
    //   488: lstore 19
    //   490: aload 11
    //   492: lload 19
    //   494: putfield 810	com/google/android/gms/b/cg$a:d	J
    //   497: iload 8
    //   499: ifeq +27 -> 526
    //   502: aload 11
    //   504: getfield 812	com/google/android/gms/b/cg$a:e	J
    //   507: lstore 19
    //   509: lconst_1
    //   510: lstore 21
    //   512: lload 19
    //   514: lload 21
    //   516: ladd
    //   517: lstore 19
    //   519: aload 11
    //   521: lload 19
    //   523: putfield 812	com/google/android/gms/b/cg$a:e	J
    //   526: new 305	android/content/ContentValues
    //   529: astore 14
    //   531: aload 14
    //   533: invokespecial 463	android/content/ContentValues:<init>	()V
    //   536: ldc 62
    //   538: astore 16
    //   540: lload_1
    //   541: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   544: astore 17
    //   546: aload 14
    //   548: aload 16
    //   550: aload 17
    //   552: invokevirtual 311	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   555: ldc 66
    //   557: astore 16
    //   559: aload 11
    //   561: getfield 806	com/google/android/gms/b/cg$a:a	J
    //   564: lstore 21
    //   566: lload 21
    //   568: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   571: astore 17
    //   573: aload 14
    //   575: aload 16
    //   577: aload 17
    //   579: invokevirtual 311	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   582: ldc 70
    //   584: astore 16
    //   586: aload 11
    //   588: getfield 804	com/google/android/gms/b/cg$a:b	J
    //   591: lstore 21
    //   593: lload 21
    //   595: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   598: astore 17
    //   600: aload 14
    //   602: aload 16
    //   604: aload 17
    //   606: invokevirtual 311	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   609: ldc 74
    //   611: astore 16
    //   613: aload 11
    //   615: getfield 808	com/google/android/gms/b/cg$a:c	J
    //   618: lstore 21
    //   620: lload 21
    //   622: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   625: astore 17
    //   627: aload 14
    //   629: aload 16
    //   631: aload 17
    //   633: invokevirtual 311	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   636: ldc 98
    //   638: astore 16
    //   640: aload 11
    //   642: getfield 810	com/google/android/gms/b/cg$a:d	J
    //   645: lstore 21
    //   647: lload 21
    //   649: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   652: astore 17
    //   654: aload 14
    //   656: aload 16
    //   658: aload 17
    //   660: invokevirtual 311	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   663: ldc 102
    //   665: astore 16
    //   667: aload 11
    //   669: getfield 812	com/google/android/gms/b/cg$a:e	J
    //   672: lstore 21
    //   674: lload 21
    //   676: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   679: astore 17
    //   681: aload 14
    //   683: aload 16
    //   685: aload 17
    //   687: invokevirtual 311	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   690: ldc_w 798
    //   693: astore 16
    //   695: ldc_w 800
    //   698: astore 17
    //   700: aload 10
    //   702: aload 16
    //   704: aload 14
    //   706: aload 17
    //   708: aload 9
    //   710: invokevirtual 694	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   713: pop
    //   714: aload 12
    //   716: ifnull +10 -> 726
    //   719: aload 12
    //   721: invokeinterface 295 1 0
    //   726: aload 11
    //   728: astore 10
    //   730: goto -484 -> 246
    //   733: astore 10
    //   735: aconst_null
    //   736: astore 12
    //   738: aload_0
    //   739: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   742: astore 14
    //   744: aload 14
    //   746: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   749: astore 14
    //   751: ldc_w 814
    //   754: astore 16
    //   756: aload_3
    //   757: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   760: astore 17
    //   762: aload 14
    //   764: aload 16
    //   766: aload 17
    //   768: aload 10
    //   770: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   773: aload 12
    //   775: ifnull +10 -> 785
    //   778: aload 12
    //   780: invokeinterface 295 1 0
    //   785: aload 11
    //   787: astore 10
    //   789: goto -543 -> 246
    //   792: astore 10
    //   794: aconst_null
    //   795: astore 12
    //   797: aload 12
    //   799: ifnull +10 -> 809
    //   802: aload 12
    //   804: invokeinterface 295 1 0
    //   809: aload 10
    //   811: athrow
    //   812: astore 10
    //   814: goto -17 -> 797
    //   817: astore 10
    //   819: goto -81 -> 738
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	822	0	this	cg
    //   0	822	1	paramLong	long
    //   0	822	3	paramString	String
    //   0	822	4	paramBoolean1	boolean
    //   0	822	5	paramBoolean2	boolean
    //   0	822	6	paramBoolean3	boolean
    //   0	822	7	paramBoolean4	boolean
    //   0	822	8	paramBoolean5	boolean
    //   17	692	9	arrayOfString	String[]
    //   20	709	10	localObject1	Object
    //   733	36	10	localSQLiteException1	SQLiteException
    //   787	1	10	localObject2	Object
    //   792	18	10	localObject3	Object
    //   812	1	10	localObject4	Object
    //   817	1	10	localSQLiteException2	SQLiteException
    //   30	756	11	locala	cg.a
    //   46	757	12	localObject5	Object
    //   50	3	13	i	int
    //   190	92	13	j	int
    //   298	68	13	k	int
    //   57	706	14	localObject6	Object
    //   60	81	15	m	int
    //   63	702	16	localObject7	Object
    //   67	700	17	localObject8	Object
    //   151	3	18	n	int
    //   263	259	19	l1	long
    //   394	281	21	l2	long
    // Exception table:
    //   from	to	target	type
    //   37	41	733	android/database/sqlite/SQLiteException
    //   52	57	733	android/database/sqlite/SQLiteException
    //   72	75	733	android/database/sqlite/SQLiteException
    //   86	89	733	android/database/sqlite/SQLiteException
    //   100	103	733	android/database/sqlite/SQLiteException
    //   114	117	733	android/database/sqlite/SQLiteException
    //   128	131	733	android/database/sqlite/SQLiteException
    //   142	145	733	android/database/sqlite/SQLiteException
    //   153	158	733	android/database/sqlite/SQLiteException
    //   163	165	733	android/database/sqlite/SQLiteException
    //   177	181	733	android/database/sqlite/SQLiteException
    //   37	41	792	finally
    //   52	57	792	finally
    //   72	75	792	finally
    //   86	89	792	finally
    //   100	103	792	finally
    //   114	117	792	finally
    //   128	131	792	finally
    //   142	145	792	finally
    //   153	158	792	finally
    //   163	165	792	finally
    //   177	181	792	finally
    //   183	190	812	finally
    //   197	201	812	finally
    //   203	208	812	finally
    //   215	219	812	finally
    //   225	230	812	finally
    //   257	263	812	finally
    //   281	288	812	finally
    //   292	297	812	finally
    //   302	309	812	finally
    //   313	318	812	finally
    //   323	330	812	finally
    //   334	339	812	finally
    //   344	351	812	finally
    //   355	360	812	finally
    //   365	372	812	finally
    //   376	381	812	finally
    //   386	391	812	finally
    //   405	410	812	finally
    //   415	420	812	finally
    //   434	439	812	finally
    //   444	449	812	finally
    //   463	468	812	finally
    //   473	478	812	finally
    //   492	497	812	finally
    //   502	507	812	finally
    //   521	526	812	finally
    //   526	529	812	finally
    //   531	536	812	finally
    //   540	544	812	finally
    //   550	555	812	finally
    //   559	564	812	finally
    //   566	571	812	finally
    //   577	582	812	finally
    //   586	591	812	finally
    //   593	598	812	finally
    //   604	609	812	finally
    //   613	618	812	finally
    //   620	625	812	finally
    //   631	636	812	finally
    //   640	645	812	finally
    //   647	652	812	finally
    //   658	663	812	finally
    //   667	672	812	finally
    //   674	679	812	finally
    //   685	690	812	finally
    //   708	714	812	finally
    //   738	742	812	finally
    //   744	749	812	finally
    //   756	760	812	finally
    //   768	773	812	finally
    //   183	190	817	android/database/sqlite/SQLiteException
    //   197	201	817	android/database/sqlite/SQLiteException
    //   203	208	817	android/database/sqlite/SQLiteException
    //   215	219	817	android/database/sqlite/SQLiteException
    //   225	230	817	android/database/sqlite/SQLiteException
    //   257	263	817	android/database/sqlite/SQLiteException
    //   281	288	817	android/database/sqlite/SQLiteException
    //   292	297	817	android/database/sqlite/SQLiteException
    //   302	309	817	android/database/sqlite/SQLiteException
    //   313	318	817	android/database/sqlite/SQLiteException
    //   323	330	817	android/database/sqlite/SQLiteException
    //   334	339	817	android/database/sqlite/SQLiteException
    //   344	351	817	android/database/sqlite/SQLiteException
    //   355	360	817	android/database/sqlite/SQLiteException
    //   365	372	817	android/database/sqlite/SQLiteException
    //   376	381	817	android/database/sqlite/SQLiteException
    //   386	391	817	android/database/sqlite/SQLiteException
    //   405	410	817	android/database/sqlite/SQLiteException
    //   415	420	817	android/database/sqlite/SQLiteException
    //   434	439	817	android/database/sqlite/SQLiteException
    //   444	449	817	android/database/sqlite/SQLiteException
    //   463	468	817	android/database/sqlite/SQLiteException
    //   473	478	817	android/database/sqlite/SQLiteException
    //   492	497	817	android/database/sqlite/SQLiteException
    //   502	507	817	android/database/sqlite/SQLiteException
    //   521	526	817	android/database/sqlite/SQLiteException
    //   526	529	817	android/database/sqlite/SQLiteException
    //   531	536	817	android/database/sqlite/SQLiteException
    //   540	544	817	android/database/sqlite/SQLiteException
    //   550	555	817	android/database/sqlite/SQLiteException
    //   559	564	817	android/database/sqlite/SQLiteException
    //   566	571	817	android/database/sqlite/SQLiteException
    //   577	582	817	android/database/sqlite/SQLiteException
    //   586	591	817	android/database/sqlite/SQLiteException
    //   593	598	817	android/database/sqlite/SQLiteException
    //   604	609	817	android/database/sqlite/SQLiteException
    //   613	618	817	android/database/sqlite/SQLiteException
    //   620	625	817	android/database/sqlite/SQLiteException
    //   631	636	817	android/database/sqlite/SQLiteException
    //   640	645	817	android/database/sqlite/SQLiteException
    //   647	652	817	android/database/sqlite/SQLiteException
    //   658	663	817	android/database/sqlite/SQLiteException
    //   667	672	817	android/database/sqlite/SQLiteException
    //   674	679	817	android/database/sqlite/SQLiteException
    //   685	690	817	android/database/sqlite/SQLiteException
    //   708	714	817	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final ck a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   16: aload_0
    //   17: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   20: aload_0
    //   21: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore 4
    //   26: ldc_w 816
    //   29: astore 5
    //   31: iconst_3
    //   32: istore 6
    //   34: iload 6
    //   36: anewarray 255	java/lang/String
    //   39: astore 7
    //   41: iconst_0
    //   42: istore 8
    //   44: aconst_null
    //   45: astore 9
    //   47: ldc_w 818
    //   50: astore 10
    //   52: aload 7
    //   54: iconst_0
    //   55: aload 10
    //   57: aastore
    //   58: iconst_1
    //   59: istore 8
    //   61: ldc_w 820
    //   64: astore 10
    //   66: aload 7
    //   68: iload 8
    //   70: aload 10
    //   72: aastore
    //   73: iconst_2
    //   74: istore 8
    //   76: ldc_w 822
    //   79: astore 10
    //   81: aload 7
    //   83: iload 8
    //   85: aload 10
    //   87: aastore
    //   88: ldc_w 824
    //   91: astore 9
    //   93: iconst_2
    //   94: istore 11
    //   96: iload 11
    //   98: anewarray 255	java/lang/String
    //   101: astore 10
    //   103: iconst_0
    //   104: istore 12
    //   106: aload 10
    //   108: iconst_0
    //   109: aload_1
    //   110: aastore
    //   111: iconst_1
    //   112: istore 12
    //   114: aload 10
    //   116: iload 12
    //   118: aload_2
    //   119: aastore
    //   120: iconst_0
    //   121: istore 12
    //   123: aload 4
    //   125: aload 5
    //   127: aload 7
    //   129: aload 9
    //   131: aload 10
    //   133: aconst_null
    //   134: aconst_null
    //   135: aconst_null
    //   136: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   139: astore 13
    //   141: aload 13
    //   143: invokeinterface 426 1 0
    //   148: istore 14
    //   150: iload 14
    //   152: ifne +21 -> 173
    //   155: aload 13
    //   157: ifnull +10 -> 167
    //   160: aload 13
    //   162: invokeinterface 295 1 0
    //   167: aconst_null
    //   168: astore 5
    //   170: aload 5
    //   172: areturn
    //   173: iconst_0
    //   174: istore 14
    //   176: aconst_null
    //   177: astore 4
    //   179: aload 13
    //   181: iconst_0
    //   182: invokeinterface 229 2 0
    //   187: lstore 15
    //   189: iconst_1
    //   190: istore 14
    //   192: aload 13
    //   194: iload 14
    //   196: invokeinterface 229 2 0
    //   201: lstore 17
    //   203: iconst_2
    //   204: istore 14
    //   206: aload 13
    //   208: iload 14
    //   210: invokeinterface 229 2 0
    //   215: lstore 19
    //   217: new 826	com/google/android/gms/b/ck
    //   220: astore 5
    //   222: aload_1
    //   223: astore 7
    //   225: aload_2
    //   226: astore 9
    //   228: aload 5
    //   230: aload_1
    //   231: aload_2
    //   232: lload 15
    //   234: lload 17
    //   236: lload 19
    //   238: invokespecial 829	com/google/android/gms/b/ck:<init>	(Ljava/lang/String;Ljava/lang/String;JJJ)V
    //   241: aload 13
    //   243: invokeinterface 661 1 0
    //   248: istore 14
    //   250: iload 14
    //   252: ifeq +36 -> 288
    //   255: aload_0
    //   256: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   259: astore 4
    //   261: aload 4
    //   263: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   266: astore 4
    //   268: ldc_w 831
    //   271: astore 7
    //   273: aload_1
    //   274: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   277: astore 9
    //   279: aload 4
    //   281: aload 7
    //   283: aload 9
    //   285: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   288: aload 13
    //   290: ifnull -120 -> 170
    //   293: aload 13
    //   295: invokeinterface 295 1 0
    //   300: goto -130 -> 170
    //   303: astore 4
    //   305: aconst_null
    //   306: astore 5
    //   308: aload_0
    //   309: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   312: astore 7
    //   314: aload 7
    //   316: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   319: astore 7
    //   321: ldc_w 833
    //   324: astore 9
    //   326: aload_1
    //   327: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   330: astore 10
    //   332: aload 7
    //   334: aload 9
    //   336: aload 10
    //   338: aload_2
    //   339: aload 4
    //   341: invokevirtual 450	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   344: aload 5
    //   346: ifnull +10 -> 356
    //   349: aload 5
    //   351: invokeinterface 295 1 0
    //   356: aconst_null
    //   357: astore 5
    //   359: goto -189 -> 170
    //   362: astore 4
    //   364: aload_3
    //   365: ifnull +9 -> 374
    //   368: aload_3
    //   369: invokeinterface 295 1 0
    //   374: aload 4
    //   376: athrow
    //   377: astore 4
    //   379: aload 13
    //   381: astore_3
    //   382: goto -18 -> 364
    //   385: astore 4
    //   387: aload 5
    //   389: astore_3
    //   390: goto -26 -> 364
    //   393: astore 4
    //   395: aload 13
    //   397: astore 5
    //   399: goto -91 -> 308
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	402	0	this	cg
    //   0	402	1	paramString1	String
    //   0	402	2	paramString2	String
    //   1	389	3	localObject1	Object
    //   24	256	4	localObject2	Object
    //   303	37	4	localSQLiteException1	SQLiteException
    //   362	13	4	localObject3	Object
    //   377	1	4	localObject4	Object
    //   385	1	4	localObject5	Object
    //   393	1	4	localSQLiteException2	SQLiteException
    //   29	369	5	localObject6	Object
    //   32	3	6	i	int
    //   39	294	7	localObject7	Object
    //   42	42	8	j	int
    //   45	290	9	localObject8	Object
    //   50	287	10	localObject9	Object
    //   94	3	11	k	int
    //   104	18	12	m	int
    //   139	257	13	localCursor	Cursor
    //   148	47	14	n	int
    //   204	5	14	i1	int
    //   248	3	14	bool	boolean
    //   187	46	15	l1	long
    //   201	34	17	l2	long
    //   215	22	19	l3	long
    // Exception table:
    //   from	to	target	type
    //   20	24	303	android/database/sqlite/SQLiteException
    //   34	39	303	android/database/sqlite/SQLiteException
    //   55	58	303	android/database/sqlite/SQLiteException
    //   70	73	303	android/database/sqlite/SQLiteException
    //   85	88	303	android/database/sqlite/SQLiteException
    //   96	101	303	android/database/sqlite/SQLiteException
    //   109	111	303	android/database/sqlite/SQLiteException
    //   118	120	303	android/database/sqlite/SQLiteException
    //   135	139	303	android/database/sqlite/SQLiteException
    //   20	24	362	finally
    //   34	39	362	finally
    //   55	58	362	finally
    //   70	73	362	finally
    //   85	88	362	finally
    //   96	101	362	finally
    //   109	111	362	finally
    //   118	120	362	finally
    //   135	139	362	finally
    //   141	148	377	finally
    //   181	187	377	finally
    //   194	201	377	finally
    //   208	215	377	finally
    //   217	220	377	finally
    //   236	241	377	finally
    //   241	248	377	finally
    //   255	259	377	finally
    //   261	266	377	finally
    //   273	277	377	finally
    //   283	288	377	finally
    //   308	312	385	finally
    //   314	319	385	finally
    //   326	330	385	finally
    //   339	344	385	finally
    //   141	148	393	android/database/sqlite/SQLiteException
    //   181	187	393	android/database/sqlite/SQLiteException
    //   194	201	393	android/database/sqlite/SQLiteException
    //   208	215	393	android/database/sqlite/SQLiteException
    //   217	220	393	android/database/sqlite/SQLiteException
    //   236	241	393	android/database/sqlite/SQLiteException
    //   241	248	393	android/database/sqlite/SQLiteException
    //   255	259	393	android/database/sqlite/SQLiteException
    //   261	266	393	android/database/sqlite/SQLiteException
    //   273	277	393	android/database/sqlite/SQLiteException
    //   283	288	393	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final List a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   6: pop
    //   7: aload_0
    //   8: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   11: aload_0
    //   12: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   15: new 546	java/util/ArrayList
    //   18: astore_3
    //   19: aload_3
    //   20: invokespecial 547	java/util/ArrayList:<init>	()V
    //   23: aload_0
    //   24: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore 4
    //   29: ldc_w 835
    //   32: astore 5
    //   34: iconst_4
    //   35: istore 6
    //   37: iload 6
    //   39: anewarray 255	java/lang/String
    //   42: astore 7
    //   44: iconst_0
    //   45: istore 8
    //   47: aconst_null
    //   48: astore 9
    //   50: ldc_w 417
    //   53: astore 10
    //   55: aload 7
    //   57: iconst_0
    //   58: aload 10
    //   60: aastore
    //   61: iconst_1
    //   62: istore 8
    //   64: ldc 25
    //   66: astore 10
    //   68: aload 7
    //   70: iload 8
    //   72: aload 10
    //   74: aastore
    //   75: iconst_2
    //   76: istore 8
    //   78: ldc_w 605
    //   81: astore 10
    //   83: aload 7
    //   85: iload 8
    //   87: aload 10
    //   89: aastore
    //   90: iconst_3
    //   91: istore 8
    //   93: ldc_w 585
    //   96: astore 10
    //   98: aload 7
    //   100: iload 8
    //   102: aload 10
    //   104: aastore
    //   105: ldc_w 800
    //   108: astore 9
    //   110: iconst_1
    //   111: istore 11
    //   113: iload 11
    //   115: anewarray 255	java/lang/String
    //   118: astore 10
    //   120: aload 10
    //   122: iconst_0
    //   123: aload_1
    //   124: aastore
    //   125: aconst_null
    //   126: astore 12
    //   128: ldc_w 613
    //   131: astore 13
    //   133: invokestatic 838	com/google/android/gms/b/cf:K	()I
    //   136: istore 14
    //   138: iload 14
    //   140: invokestatic 840	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   143: astore 15
    //   145: aload 4
    //   147: aload 5
    //   149: aload 7
    //   151: aload 9
    //   153: aload 10
    //   155: aconst_null
    //   156: aconst_null
    //   157: aload 13
    //   159: aload 15
    //   161: invokevirtual 621	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   164: astore 13
    //   166: aload 13
    //   168: invokeinterface 426 1 0
    //   173: istore 16
    //   175: iload 16
    //   177: ifne +21 -> 198
    //   180: aload 13
    //   182: ifnull +10 -> 192
    //   185: aload 13
    //   187: invokeinterface 295 1 0
    //   192: aload_3
    //   193: astore 4
    //   195: aload 4
    //   197: areturn
    //   198: iconst_0
    //   199: istore 16
    //   201: aconst_null
    //   202: astore 4
    //   204: aload 13
    //   206: iconst_0
    //   207: invokeinterface 247 2 0
    //   212: astore 9
    //   214: iconst_1
    //   215: istore 16
    //   217: aload 13
    //   219: iload 16
    //   221: invokeinterface 247 2 0
    //   226: astore 7
    //   228: aload 7
    //   230: ifnonnull +8 -> 238
    //   233: ldc_w 842
    //   236: astore 7
    //   238: iconst_2
    //   239: istore 16
    //   241: aload 13
    //   243: iload 16
    //   245: invokeinterface 229 2 0
    //   250: lstore 17
    //   252: iconst_3
    //   253: istore 16
    //   255: aload_0
    //   256: aload 13
    //   258: iload 16
    //   260: invokespecial 626	com/google/android/gms/b/cg:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   263: astore 12
    //   265: aload 12
    //   267: ifnonnull +68 -> 335
    //   270: aload_0
    //   271: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   274: astore 4
    //   276: aload 4
    //   278: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   281: astore 4
    //   283: ldc_w 844
    //   286: astore 5
    //   288: aload_1
    //   289: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   292: astore 7
    //   294: aload 4
    //   296: aload 5
    //   298: aload 7
    //   300: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   303: aload 13
    //   305: invokeinterface 661 1 0
    //   310: istore 16
    //   312: iload 16
    //   314: ifne -116 -> 198
    //   317: aload 13
    //   319: ifnull +10 -> 329
    //   322: aload 13
    //   324: invokeinterface 295 1 0
    //   329: aload_3
    //   330: astore 4
    //   332: goto -137 -> 195
    //   335: new 846	com/google/android/gms/b/dq
    //   338: astore 4
    //   340: aload_1
    //   341: astore 5
    //   343: aload 4
    //   345: aload_1
    //   346: aload 7
    //   348: aload 9
    //   350: lload 17
    //   352: aload 12
    //   354: invokespecial 849	com/google/android/gms/b/dq:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   357: aload_3
    //   358: aload 4
    //   360: invokeinterface 564 2 0
    //   365: pop
    //   366: goto -63 -> 303
    //   369: astore 4
    //   371: aload 13
    //   373: astore 5
    //   375: aload_0
    //   376: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   379: astore 7
    //   381: aload 7
    //   383: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   386: astore 7
    //   388: ldc_w 851
    //   391: astore 9
    //   393: aload_1
    //   394: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   397: astore 10
    //   399: aload 7
    //   401: aload 9
    //   403: aload 10
    //   405: aload 4
    //   407: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   410: aload 5
    //   412: ifnull +10 -> 422
    //   415: aload 5
    //   417: invokeinterface 295 1 0
    //   422: iconst_0
    //   423: istore 16
    //   425: aconst_null
    //   426: astore 4
    //   428: goto -233 -> 195
    //   431: astore 4
    //   433: aload_2
    //   434: ifnull +9 -> 443
    //   437: aload_2
    //   438: invokeinterface 295 1 0
    //   443: aload 4
    //   445: athrow
    //   446: astore 4
    //   448: aload 13
    //   450: astore_2
    //   451: goto -18 -> 433
    //   454: astore 4
    //   456: aload 5
    //   458: astore_2
    //   459: goto -26 -> 433
    //   462: astore 4
    //   464: aconst_null
    //   465: astore 5
    //   467: goto -92 -> 375
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	470	0	this	cg
    //   0	470	1	paramString	String
    //   1	458	2	localObject1	Object
    //   18	340	3	localArrayList	ArrayList
    //   27	332	4	localObject2	Object
    //   369	37	4	localSQLiteException1	SQLiteException
    //   426	1	4	localObject3	Object
    //   431	13	4	localObject4	Object
    //   446	1	4	localObject5	Object
    //   454	1	4	localObject6	Object
    //   462	1	4	localSQLiteException2	SQLiteException
    //   32	434	5	localObject7	Object
    //   35	3	6	i	int
    //   42	358	7	localObject8	Object
    //   45	56	8	j	int
    //   48	354	9	str1	String
    //   53	351	10	localObject9	Object
    //   111	3	11	k	int
    //   126	227	12	localObject10	Object
    //   131	318	13	localObject11	Object
    //   136	3	14	m	int
    //   143	17	15	str2	String
    //   173	47	16	n	int
    //   239	20	16	i1	int
    //   310	114	16	bool	boolean
    //   250	101	17	l	long
    // Exception table:
    //   from	to	target	type
    //   166	173	369	android/database/sqlite/SQLiteException
    //   206	212	369	android/database/sqlite/SQLiteException
    //   219	226	369	android/database/sqlite/SQLiteException
    //   243	250	369	android/database/sqlite/SQLiteException
    //   258	263	369	android/database/sqlite/SQLiteException
    //   270	274	369	android/database/sqlite/SQLiteException
    //   276	281	369	android/database/sqlite/SQLiteException
    //   288	292	369	android/database/sqlite/SQLiteException
    //   298	303	369	android/database/sqlite/SQLiteException
    //   303	310	369	android/database/sqlite/SQLiteException
    //   335	338	369	android/database/sqlite/SQLiteException
    //   352	357	369	android/database/sqlite/SQLiteException
    //   358	366	369	android/database/sqlite/SQLiteException
    //   23	27	431	finally
    //   37	42	431	finally
    //   58	61	431	finally
    //   72	75	431	finally
    //   87	90	431	finally
    //   102	105	431	finally
    //   113	118	431	finally
    //   123	125	431	finally
    //   133	136	431	finally
    //   138	143	431	finally
    //   159	164	431	finally
    //   166	173	446	finally
    //   206	212	446	finally
    //   219	226	446	finally
    //   243	250	446	finally
    //   258	263	446	finally
    //   270	274	446	finally
    //   276	281	446	finally
    //   288	292	446	finally
    //   298	303	446	finally
    //   303	310	446	finally
    //   335	338	446	finally
    //   352	357	446	finally
    //   358	366	446	finally
    //   375	379	454	finally
    //   381	386	454	finally
    //   393	397	454	finally
    //   405	410	454	finally
    //   23	27	462	android/database/sqlite/SQLiteException
    //   37	42	462	android/database/sqlite/SQLiteException
    //   58	61	462	android/database/sqlite/SQLiteException
    //   72	75	462	android/database/sqlite/SQLiteException
    //   87	90	462	android/database/sqlite/SQLiteException
    //   102	105	462	android/database/sqlite/SQLiteException
    //   113	118	462	android/database/sqlite/SQLiteException
    //   123	125	462	android/database/sqlite/SQLiteException
    //   133	136	462	android/database/sqlite/SQLiteException
    //   138	143	462	android/database/sqlite/SQLiteException
    //   159	164	462	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final List a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   7: aload_0
    //   8: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   11: iload_2
    //   12: ifle +177 -> 189
    //   15: iload 4
    //   17: istore 5
    //   19: iload 5
    //   21: invokestatic 854	com/google/android/gms/common/internal/c:b	(Z)V
    //   24: iload_3
    //   25: ifle +173 -> 198
    //   28: iload 4
    //   30: invokestatic 854	com/google/android/gms/common/internal/c:b	(Z)V
    //   33: aload_1
    //   34: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   37: pop
    //   38: aload_0
    //   39: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   42: astore 6
    //   44: ldc_w 744
    //   47: astore 7
    //   49: iconst_2
    //   50: istore 8
    //   52: iload 8
    //   54: anewarray 255	java/lang/String
    //   57: astore 9
    //   59: iconst_0
    //   60: istore 10
    //   62: aconst_null
    //   63: astore 11
    //   65: ldc_w 613
    //   68: astore 12
    //   70: aload 9
    //   72: iconst_0
    //   73: aload 12
    //   75: aastore
    //   76: iconst_1
    //   77: istore 10
    //   79: ldc_w 476
    //   82: astore 12
    //   84: aload 9
    //   86: iload 10
    //   88: aload 12
    //   90: aastore
    //   91: ldc_w 800
    //   94: astore 11
    //   96: iconst_1
    //   97: istore 13
    //   99: iload 13
    //   101: anewarray 255	java/lang/String
    //   104: astore 12
    //   106: aconst_null
    //   107: astore 14
    //   109: aload 12
    //   111: iconst_0
    //   112: aload_1
    //   113: aastore
    //   114: aconst_null
    //   115: astore 14
    //   117: iconst_0
    //   118: istore 15
    //   120: aconst_null
    //   121: astore 16
    //   123: ldc_w 613
    //   126: astore 17
    //   128: iload_2
    //   129: invokestatic 840	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   132: astore 18
    //   134: aload 6
    //   136: aload 7
    //   138: aload 9
    //   140: aload 11
    //   142: aload 12
    //   144: aconst_null
    //   145: aconst_null
    //   146: aload 17
    //   148: aload 18
    //   150: invokevirtual 621	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   153: astore 9
    //   155: aload 9
    //   157: invokeinterface 426 1 0
    //   162: istore 5
    //   164: iload 5
    //   166: ifne +41 -> 207
    //   169: invokestatic 667	java/util/Collections:emptyList	()Ljava/util/List;
    //   172: astore 6
    //   174: aload 9
    //   176: ifnull +10 -> 186
    //   179: aload 9
    //   181: invokeinterface 295 1 0
    //   186: aload 6
    //   188: areturn
    //   189: iconst_0
    //   190: istore 5
    //   192: aconst_null
    //   193: astore 6
    //   195: goto -176 -> 19
    //   198: iconst_0
    //   199: istore 4
    //   201: aconst_null
    //   202: astore 7
    //   204: goto -176 -> 28
    //   207: new 546	java/util/ArrayList
    //   210: astore 6
    //   212: aload 6
    //   214: invokespecial 547	java/util/ArrayList:<init>	()V
    //   217: iconst_0
    //   218: istore 10
    //   220: aconst_null
    //   221: astore 11
    //   223: iconst_0
    //   224: istore 4
    //   226: aconst_null
    //   227: astore 7
    //   229: aload 9
    //   231: iconst_0
    //   232: invokeinterface 229 2 0
    //   237: lstore 19
    //   239: iconst_1
    //   240: istore 4
    //   242: aload 9
    //   244: iload 4
    //   246: invokeinterface 637 2 0
    //   251: astore 7
    //   253: aload_0
    //   254: invokevirtual 633	com/google/android/gms/b/cg:q	()Lcom/google/android/gms/b/dr;
    //   257: astore 16
    //   259: aload 16
    //   261: aload 7
    //   263: invokevirtual 856	com/google/android/gms/b/dr:b	([B)[B
    //   266: astore 7
    //   268: aload 6
    //   270: invokeinterface 857 1 0
    //   275: istore 15
    //   277: iload 15
    //   279: ifne +17 -> 296
    //   282: aload 7
    //   284: arraylength
    //   285: iload 10
    //   287: iadd
    //   288: istore 15
    //   290: iload 15
    //   292: iload_3
    //   293: if_icmpgt +89 -> 382
    //   296: aload 7
    //   298: arraylength
    //   299: istore 15
    //   301: aload 7
    //   303: iload 15
    //   305: invokestatic 862	com/google/android/gms/b/ft:a	([BI)Lcom/google/android/gms/b/ft;
    //   308: astore 16
    //   310: new 756	com/google/android/gms/b/du$e
    //   313: astore 17
    //   315: aload 17
    //   317: invokespecial 863	com/google/android/gms/b/du$e:<init>	()V
    //   320: aload 17
    //   322: aload 16
    //   324: invokevirtual 866	com/google/android/gms/b/du$e:a	(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/gb;
    //   327: pop
    //   328: aload 7
    //   330: arraylength
    //   331: iload 10
    //   333: iadd
    //   334: istore 4
    //   336: lload 19
    //   338: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   341: astore 11
    //   343: aload 17
    //   345: aload 11
    //   347: invokestatic 872	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   350: astore 11
    //   352: aload 6
    //   354: aload 11
    //   356: invokeinterface 564 2 0
    //   361: pop
    //   362: aload 9
    //   364: invokeinterface 661 1 0
    //   369: istore 10
    //   371: iload 10
    //   373: ifeq +9 -> 382
    //   376: iload 4
    //   378: iload_3
    //   379: if_icmple +215 -> 594
    //   382: aload 9
    //   384: ifnull -198 -> 186
    //   387: aload 9
    //   389: invokeinterface 295 1 0
    //   394: goto -208 -> 186
    //   397: astore 7
    //   399: aload_0
    //   400: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   403: astore 12
    //   405: aload 12
    //   407: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   410: astore 12
    //   412: ldc_w 874
    //   415: astore 14
    //   417: aload_1
    //   418: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   421: astore 16
    //   423: aload 12
    //   425: aload 14
    //   427: aload 16
    //   429: aload 7
    //   431: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   434: iload 10
    //   436: istore 4
    //   438: goto -76 -> 362
    //   441: astore 7
    //   443: aload_0
    //   444: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   447: astore 12
    //   449: aload 12
    //   451: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   454: astore 12
    //   456: ldc_w 876
    //   459: astore 14
    //   461: aload_1
    //   462: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   465: astore 16
    //   467: aload 12
    //   469: aload 14
    //   471: aload 16
    //   473: aload 7
    //   475: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   478: iload 10
    //   480: istore 4
    //   482: goto -120 -> 362
    //   485: astore 6
    //   487: iconst_0
    //   488: istore 4
    //   490: aconst_null
    //   491: astore 7
    //   493: aload_0
    //   494: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   497: astore 9
    //   499: aload 9
    //   501: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   504: astore 9
    //   506: ldc_w 878
    //   509: astore 11
    //   511: aload_1
    //   512: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   515: astore 12
    //   517: aload 9
    //   519: aload 11
    //   521: aload 12
    //   523: aload 6
    //   525: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   528: invokestatic 667	java/util/Collections:emptyList	()Ljava/util/List;
    //   531: astore 6
    //   533: aload 7
    //   535: ifnull -349 -> 186
    //   538: aload 7
    //   540: invokeinterface 295 1 0
    //   545: goto -359 -> 186
    //   548: astore 6
    //   550: iconst_0
    //   551: istore 8
    //   553: aconst_null
    //   554: astore 9
    //   556: aload 9
    //   558: ifnull +10 -> 568
    //   561: aload 9
    //   563: invokeinterface 295 1 0
    //   568: aload 6
    //   570: athrow
    //   571: astore 6
    //   573: goto -17 -> 556
    //   576: astore 6
    //   578: aload 7
    //   580: astore 9
    //   582: goto -26 -> 556
    //   585: astore 6
    //   587: aload 9
    //   589: astore 7
    //   591: goto -98 -> 493
    //   594: iload 4
    //   596: istore 10
    //   598: goto -375 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	601	0	this	cg
    //   0	601	1	paramString	String
    //   0	601	2	paramInt1	int
    //   0	601	3	paramInt2	int
    //   1	244	4	i	int
    //   334	261	4	j	int
    //   17	3	5	k	int
    //   162	29	5	bool1	boolean
    //   42	311	6	localObject1	Object
    //   485	39	6	localSQLiteException1	SQLiteException
    //   531	1	6	localList	List
    //   548	21	6	localObject2	Object
    //   571	1	6	localObject3	Object
    //   576	1	6	localObject4	Object
    //   585	1	6	localSQLiteException2	SQLiteException
    //   47	282	7	localObject5	Object
    //   397	33	7	localIOException1	IOException
    //   441	33	7	localIOException2	IOException
    //   491	99	7	localObject6	Object
    //   50	502	8	m	int
    //   57	531	9	localObject7	Object
    //   60	274	10	n	int
    //   369	110	10	i1	int
    //   596	1	10	i2	int
    //   63	457	11	localObject8	Object
    //   68	454	12	localObject9	Object
    //   97	3	13	i3	int
    //   107	363	14	str1	String
    //   118	160	15	bool2	boolean
    //   288	16	15	i4	int
    //   121	351	16	localObject10	Object
    //   126	218	17	localObject11	Object
    //   132	17	18	str2	String
    //   237	100	19	l	long
    // Exception table:
    //   from	to	target	type
    //   244	251	397	java/io/IOException
    //   253	257	397	java/io/IOException
    //   261	266	397	java/io/IOException
    //   322	328	441	java/io/IOException
    //   38	42	485	android/database/sqlite/SQLiteException
    //   52	57	485	android/database/sqlite/SQLiteException
    //   73	76	485	android/database/sqlite/SQLiteException
    //   88	91	485	android/database/sqlite/SQLiteException
    //   99	104	485	android/database/sqlite/SQLiteException
    //   112	114	485	android/database/sqlite/SQLiteException
    //   128	132	485	android/database/sqlite/SQLiteException
    //   148	153	485	android/database/sqlite/SQLiteException
    //   38	42	548	finally
    //   52	57	548	finally
    //   73	76	548	finally
    //   88	91	548	finally
    //   99	104	548	finally
    //   112	114	548	finally
    //   128	132	548	finally
    //   148	153	548	finally
    //   155	162	571	finally
    //   169	172	571	finally
    //   207	210	571	finally
    //   212	217	571	finally
    //   231	237	571	finally
    //   244	251	571	finally
    //   253	257	571	finally
    //   261	266	571	finally
    //   268	275	571	finally
    //   282	285	571	finally
    //   296	299	571	finally
    //   303	308	571	finally
    //   310	313	571	finally
    //   315	320	571	finally
    //   322	328	571	finally
    //   328	331	571	finally
    //   336	341	571	finally
    //   345	350	571	finally
    //   354	362	571	finally
    //   362	369	571	finally
    //   399	403	571	finally
    //   405	410	571	finally
    //   417	421	571	finally
    //   429	434	571	finally
    //   443	447	571	finally
    //   449	454	571	finally
    //   461	465	571	finally
    //   473	478	571	finally
    //   493	497	576	finally
    //   499	504	576	finally
    //   511	515	576	finally
    //   523	528	576	finally
    //   528	531	576	finally
    //   155	162	585	android/database/sqlite/SQLiteException
    //   169	172	585	android/database/sqlite/SQLiteException
    //   207	210	585	android/database/sqlite/SQLiteException
    //   212	217	585	android/database/sqlite/SQLiteException
    //   231	237	585	android/database/sqlite/SQLiteException
    //   244	251	585	android/database/sqlite/SQLiteException
    //   253	257	585	android/database/sqlite/SQLiteException
    //   261	266	585	android/database/sqlite/SQLiteException
    //   268	275	585	android/database/sqlite/SQLiteException
    //   282	285	585	android/database/sqlite/SQLiteException
    //   296	299	585	android/database/sqlite/SQLiteException
    //   303	308	585	android/database/sqlite/SQLiteException
    //   310	313	585	android/database/sqlite/SQLiteException
    //   315	320	585	android/database/sqlite/SQLiteException
    //   322	328	585	android/database/sqlite/SQLiteException
    //   328	331	585	android/database/sqlite/SQLiteException
    //   336	341	585	android/database/sqlite/SQLiteException
    //   345	350	585	android/database/sqlite/SQLiteException
    //   354	362	585	android/database/sqlite/SQLiteException
    //   362	369	585	android/database/sqlite/SQLiteException
    //   399	403	585	android/database/sqlite/SQLiteException
    //   405	410	585	android/database/sqlite/SQLiteException
    //   417	421	585	android/database/sqlite/SQLiteException
    //   429	434	585	android/database/sqlite/SQLiteException
    //   443	447	585	android/database/sqlite/SQLiteException
    //   449	454	585	android/database/sqlite/SQLiteException
    //   461	465	585	android/database/sqlite/SQLiteException
    //   473	478	585	android/database/sqlite/SQLiteException
  }
  
  public final List a(String paramString, long paramLong)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    e();
    J();
    long l = 0L;
    boolean bool = paramLong < l;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool)
    {
      localObject1 = uc;
      localObject2 = "Invalid time querying timed out conditional properties";
      localObject3 = cu.a(paramString);
      localObject4 = Long.valueOf(paramLong);
      ((cu.a)localObject1).a((String)localObject2, localObject3, localObject4);
    }
    for (Object localObject1 = Collections.emptyList();; localObject1 = b("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", (String[])localObject2))
    {
      return (List)localObject1;
      int i = 2;
      localObject2 = new String[i];
      localObject3 = null;
      localObject2[0] = paramString;
      int j = 1;
      localObject4 = String.valueOf(paramLong);
      localObject2[j] = localObject4;
    }
  }
  
  public final List a(String paramString1, String paramString2, long paramLong)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    com.google.android.gms.common.internal.c.a(paramString2);
    e();
    J();
    long l = 0L;
    boolean bool = paramLong < l;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool)
    {
      localObject1 = uc;
      localObject2 = "Invalid time querying triggered conditional properties";
      localObject3 = cu.a(paramString1);
      localObject4 = Long.valueOf(paramLong);
      ((cu.a)localObject1).a((String)localObject2, localObject3, paramString2, localObject4);
    }
    for (Object localObject1 = Collections.emptyList();; localObject1 = b("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", (String[])localObject2))
    {
      return (List)localObject1;
      int i = 3;
      localObject2 = new String[i];
      localObject3 = null;
      localObject2[0] = paramString1;
      localObject2[1] = paramString2;
      int j = 2;
      localObject4 = String.valueOf(paramLong);
      localObject2[j] = localObject4;
    }
  }
  
  /* Error */
  public final List a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_1
    //   4: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   7: pop
    //   8: aload_0
    //   9: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   12: aload_0
    //   13: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   16: new 546	java/util/ArrayList
    //   19: astore 5
    //   21: aload 5
    //   23: invokespecial 547	java/util/ArrayList:<init>	()V
    //   26: new 546	java/util/ArrayList
    //   29: astore 6
    //   31: iconst_3
    //   32: istore 7
    //   34: aload 6
    //   36: iload 7
    //   38: invokespecial 890	java/util/ArrayList:<init>	(I)V
    //   41: aload 6
    //   43: aload_1
    //   44: invokeinterface 564 2 0
    //   49: pop
    //   50: new 264	java/lang/StringBuilder
    //   53: astore 8
    //   55: ldc_w 800
    //   58: astore 9
    //   60: aload 8
    //   62: aload 9
    //   64: invokespecial 891	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: aload_2
    //   68: invokestatic 439	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   71: istore 7
    //   73: iload 7
    //   75: ifne +25 -> 100
    //   78: aload 6
    //   80: aload_2
    //   81: invokeinterface 564 2 0
    //   86: pop
    //   87: ldc_w 893
    //   90: astore 9
    //   92: aload 8
    //   94: aload 9
    //   96: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_3
    //   101: invokestatic 439	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   104: istore 7
    //   106: iload 7
    //   108: ifne +46 -> 154
    //   111: aload_3
    //   112: invokestatic 258	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   115: astore 9
    //   117: ldc_w 895
    //   120: astore 10
    //   122: aload 9
    //   124: aload 10
    //   126: invokevirtual 898	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   129: astore 9
    //   131: aload 6
    //   133: aload 9
    //   135: invokeinterface 564 2 0
    //   140: pop
    //   141: ldc_w 900
    //   144: astore 9
    //   146: aload 8
    //   148: aload 9
    //   150: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload 6
    //   156: invokeinterface 552 1 0
    //   161: istore 7
    //   163: iload 7
    //   165: anewarray 255	java/lang/String
    //   168: astore 9
    //   170: aload 6
    //   172: aload 9
    //   174: invokeinterface 904 2 0
    //   179: astore 11
    //   181: aload 11
    //   183: checkcast 906	[Ljava/lang/String;
    //   186: astore 11
    //   188: aload_0
    //   189: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   192: astore 6
    //   194: ldc_w 835
    //   197: astore 9
    //   199: iconst_4
    //   200: istore 12
    //   202: iload 12
    //   204: anewarray 255	java/lang/String
    //   207: astore 10
    //   209: iconst_0
    //   210: istore 13
    //   212: ldc_w 417
    //   215: astore 14
    //   217: aload 10
    //   219: iconst_0
    //   220: aload 14
    //   222: aastore
    //   223: iconst_1
    //   224: istore 13
    //   226: ldc_w 605
    //   229: astore 14
    //   231: aload 10
    //   233: iload 13
    //   235: aload 14
    //   237: aastore
    //   238: iconst_2
    //   239: istore 13
    //   241: ldc_w 585
    //   244: astore 14
    //   246: aload 10
    //   248: iload 13
    //   250: aload 14
    //   252: aastore
    //   253: iconst_3
    //   254: istore 13
    //   256: ldc 25
    //   258: astore 14
    //   260: aload 10
    //   262: iload 13
    //   264: aload 14
    //   266: aastore
    //   267: aload 8
    //   269: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: astore 8
    //   274: iconst_0
    //   275: istore 13
    //   277: aconst_null
    //   278: astore 14
    //   280: ldc_w 613
    //   283: astore 15
    //   285: invokestatic 838	com/google/android/gms/b/cf:K	()I
    //   288: pop
    //   289: ldc_w 618
    //   292: astore 16
    //   294: aload 6
    //   296: aload 9
    //   298: aload 10
    //   300: aload 8
    //   302: aload 11
    //   304: aconst_null
    //   305: aconst_null
    //   306: aload 15
    //   308: aload 16
    //   310: invokevirtual 621	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   313: astore 15
    //   315: aload 15
    //   317: invokeinterface 426 1 0
    //   322: istore 17
    //   324: iload 17
    //   326: ifne +25 -> 351
    //   329: aload 15
    //   331: ifnull +10 -> 341
    //   334: aload 15
    //   336: invokeinterface 295 1 0
    //   341: aload 5
    //   343: astore 6
    //   345: aload 6
    //   347: areturn
    //   348: aload 10
    //   350: astore_2
    //   351: aload 5
    //   353: invokeinterface 552 1 0
    //   358: istore 17
    //   360: invokestatic 838	com/google/android/gms/b/cf:K	()I
    //   363: istore 7
    //   365: iload 17
    //   367: iload 7
    //   369: if_icmplt +61 -> 430
    //   372: aload_0
    //   373: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   376: astore 6
    //   378: aload 6
    //   380: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   383: astore 6
    //   385: ldc_w 908
    //   388: astore 9
    //   390: invokestatic 838	com/google/android/gms/b/cf:K	()I
    //   393: istore 12
    //   395: iload 12
    //   397: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   400: astore 10
    //   402: aload 6
    //   404: aload 9
    //   406: aload 10
    //   408: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   411: aload 15
    //   413: ifnull +10 -> 423
    //   416: aload 15
    //   418: invokeinterface 295 1 0
    //   423: aload 5
    //   425: astore 6
    //   427: goto -82 -> 345
    //   430: iconst_0
    //   431: istore 17
    //   433: aconst_null
    //   434: astore 6
    //   436: aload 15
    //   438: iconst_0
    //   439: invokeinterface 247 2 0
    //   444: astore 8
    //   446: iconst_1
    //   447: istore 17
    //   449: aload 15
    //   451: iload 17
    //   453: invokeinterface 229 2 0
    //   458: lstore 18
    //   460: iconst_2
    //   461: istore 17
    //   463: aload_0
    //   464: aload 15
    //   466: iload 17
    //   468: invokespecial 626	com/google/android/gms/b/cg:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   471: astore 14
    //   473: iconst_3
    //   474: istore 17
    //   476: aload 15
    //   478: iload 17
    //   480: invokeinterface 247 2 0
    //   485: astore 10
    //   487: aload 14
    //   489: ifnonnull +56 -> 545
    //   492: aload_0
    //   493: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   496: astore 6
    //   498: aload 6
    //   500: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   503: astore 6
    //   505: ldc_w 910
    //   508: astore 9
    //   510: aload_1
    //   511: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   514: astore 8
    //   516: aload 6
    //   518: aload 9
    //   520: aload 8
    //   522: aload 10
    //   524: aload_3
    //   525: invokevirtual 450	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   528: aload 15
    //   530: invokeinterface 661 1 0
    //   535: istore 17
    //   537: iload 17
    //   539: ifne -191 -> 348
    //   542: goto -131 -> 411
    //   545: new 846	com/google/android/gms/b/dq
    //   548: astore 6
    //   550: aload_1
    //   551: astore 9
    //   553: aload 6
    //   555: aload_1
    //   556: aload 10
    //   558: aload 8
    //   560: lload 18
    //   562: aload 14
    //   564: invokespecial 849	com/google/android/gms/b/dq:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   567: aload 5
    //   569: aload 6
    //   571: invokeinterface 564 2 0
    //   576: pop
    //   577: goto -49 -> 528
    //   580: astore 6
    //   582: aload 15
    //   584: astore 9
    //   586: aload 10
    //   588: astore_2
    //   589: aload_0
    //   590: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   593: astore 10
    //   595: aload 10
    //   597: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   600: astore 10
    //   602: ldc_w 912
    //   605: astore 8
    //   607: aload_1
    //   608: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   611: astore 11
    //   613: aload 10
    //   615: aload 8
    //   617: aload 11
    //   619: aload_2
    //   620: aload 6
    //   622: invokevirtual 450	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   625: aload 9
    //   627: ifnull +10 -> 637
    //   630: aload 9
    //   632: invokeinterface 295 1 0
    //   637: iconst_0
    //   638: istore 17
    //   640: aconst_null
    //   641: astore 6
    //   643: goto -298 -> 345
    //   646: astore 6
    //   648: aload 4
    //   650: ifnull +10 -> 660
    //   653: aload 4
    //   655: invokeinterface 295 1 0
    //   660: aload 6
    //   662: athrow
    //   663: astore 6
    //   665: aload 15
    //   667: astore 4
    //   669: goto -21 -> 648
    //   672: astore 6
    //   674: aload 9
    //   676: astore 4
    //   678: goto -30 -> 648
    //   681: astore 6
    //   683: iconst_0
    //   684: istore 7
    //   686: aconst_null
    //   687: astore 9
    //   689: goto -100 -> 589
    //   692: astore 6
    //   694: aload 15
    //   696: astore 9
    //   698: goto -109 -> 589
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	701	0	this	cg
    //   0	701	1	paramString1	String
    //   0	701	2	paramString2	String
    //   0	701	3	paramString3	String
    //   1	676	4	localObject1	Object
    //   19	549	5	localArrayList	ArrayList
    //   29	541	6	localObject2	Object
    //   580	41	6	localSQLiteException1	SQLiteException
    //   641	1	6	localObject3	Object
    //   646	15	6	localObject4	Object
    //   663	1	6	localObject5	Object
    //   672	1	6	localObject6	Object
    //   681	1	6	localSQLiteException2	SQLiteException
    //   692	1	6	localSQLiteException3	SQLiteException
    //   32	5	7	i	int
    //   71	36	7	bool1	boolean
    //   161	524	7	j	int
    //   53	563	8	localObject7	Object
    //   58	639	9	localObject8	Object
    //   120	494	10	localObject9	Object
    //   179	439	11	localObject10	Object
    //   200	196	12	k	int
    //   210	66	13	m	int
    //   215	348	14	localObject11	Object
    //   283	412	15	localObject12	Object
    //   292	17	16	str	String
    //   322	3	17	bool2	boolean
    //   358	121	17	n	int
    //   535	104	17	bool3	boolean
    //   458	103	18	l	long
    // Exception table:
    //   from	to	target	type
    //   492	496	580	android/database/sqlite/SQLiteException
    //   498	503	580	android/database/sqlite/SQLiteException
    //   510	514	580	android/database/sqlite/SQLiteException
    //   524	528	580	android/database/sqlite/SQLiteException
    //   528	535	580	android/database/sqlite/SQLiteException
    //   545	548	580	android/database/sqlite/SQLiteException
    //   562	567	580	android/database/sqlite/SQLiteException
    //   569	577	580	android/database/sqlite/SQLiteException
    //   26	29	646	finally
    //   36	41	646	finally
    //   43	50	646	finally
    //   50	53	646	finally
    //   62	67	646	finally
    //   67	71	646	finally
    //   80	87	646	finally
    //   94	100	646	finally
    //   100	104	646	finally
    //   111	115	646	finally
    //   124	129	646	finally
    //   133	141	646	finally
    //   148	154	646	finally
    //   154	161	646	finally
    //   163	168	646	finally
    //   172	179	646	finally
    //   181	186	646	finally
    //   188	192	646	finally
    //   202	207	646	finally
    //   220	223	646	finally
    //   235	238	646	finally
    //   250	253	646	finally
    //   264	267	646	finally
    //   267	272	646	finally
    //   285	289	646	finally
    //   308	313	646	finally
    //   315	322	663	finally
    //   351	358	663	finally
    //   360	363	663	finally
    //   372	376	663	finally
    //   378	383	663	finally
    //   390	393	663	finally
    //   395	400	663	finally
    //   406	411	663	finally
    //   438	444	663	finally
    //   451	458	663	finally
    //   466	471	663	finally
    //   478	485	663	finally
    //   492	496	663	finally
    //   498	503	663	finally
    //   510	514	663	finally
    //   524	528	663	finally
    //   528	535	663	finally
    //   545	548	663	finally
    //   562	567	663	finally
    //   569	577	663	finally
    //   589	593	672	finally
    //   595	600	672	finally
    //   607	611	672	finally
    //   620	625	672	finally
    //   26	29	681	android/database/sqlite/SQLiteException
    //   36	41	681	android/database/sqlite/SQLiteException
    //   43	50	681	android/database/sqlite/SQLiteException
    //   50	53	681	android/database/sqlite/SQLiteException
    //   62	67	681	android/database/sqlite/SQLiteException
    //   67	71	681	android/database/sqlite/SQLiteException
    //   80	87	681	android/database/sqlite/SQLiteException
    //   94	100	681	android/database/sqlite/SQLiteException
    //   100	104	681	android/database/sqlite/SQLiteException
    //   111	115	681	android/database/sqlite/SQLiteException
    //   124	129	681	android/database/sqlite/SQLiteException
    //   133	141	681	android/database/sqlite/SQLiteException
    //   148	154	681	android/database/sqlite/SQLiteException
    //   154	161	681	android/database/sqlite/SQLiteException
    //   163	168	681	android/database/sqlite/SQLiteException
    //   172	179	681	android/database/sqlite/SQLiteException
    //   181	186	681	android/database/sqlite/SQLiteException
    //   188	192	681	android/database/sqlite/SQLiteException
    //   202	207	681	android/database/sqlite/SQLiteException
    //   220	223	681	android/database/sqlite/SQLiteException
    //   235	238	681	android/database/sqlite/SQLiteException
    //   250	253	681	android/database/sqlite/SQLiteException
    //   264	267	681	android/database/sqlite/SQLiteException
    //   267	272	681	android/database/sqlite/SQLiteException
    //   285	289	681	android/database/sqlite/SQLiteException
    //   308	313	681	android/database/sqlite/SQLiteException
    //   315	322	692	android/database/sqlite/SQLiteException
    //   351	358	692	android/database/sqlite/SQLiteException
    //   360	363	692	android/database/sqlite/SQLiteException
    //   372	376	692	android/database/sqlite/SQLiteException
    //   378	383	692	android/database/sqlite/SQLiteException
    //   390	393	692	android/database/sqlite/SQLiteException
    //   395	400	692	android/database/sqlite/SQLiteException
    //   406	411	692	android/database/sqlite/SQLiteException
    //   438	444	692	android/database/sqlite/SQLiteException
    //   451	458	692	android/database/sqlite/SQLiteException
    //   466	471	692	android/database/sqlite/SQLiteException
    //   478	485	692	android/database/sqlite/SQLiteException
  }
  
  protected final void a() {}
  
  public final void a(long paramLong)
  {
    int i = 1;
    e();
    J();
    Object localObject1 = L();
    Object localObject2 = new String[i];
    String str1 = String.valueOf(paramLong);
    localObject2[0] = str1;
    String str2 = "queue";
    str1 = "rowid=?";
    try
    {
      int j = ((SQLiteDatabase)localObject1).delete(str2, str1, (String[])localObject2);
      if (j != i)
      {
        localObject1 = new android/database/sqlite/SQLiteException;
        localObject2 = "Deleted fewer rows from queue than expected";
        ((SQLiteException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      ua.a("Failed to delete a bundle in a queue table", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  public final void a(bz parambz)
  {
    com.google.android.gms.common.internal.c.a(parambz);
    e();
    J();
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    Object localObject2 = parambz.a();
    ((ContentValues)localObject1).put("app_id", (String)localObject2);
    localObject2 = parambz.b();
    ((ContentValues)localObject1).put("app_instance_id", (String)localObject2);
    localObject2 = parambz.c();
    ((ContentValues)localObject1).put("gmp_app_id", (String)localObject2);
    localObject2 = parambz.d();
    ((ContentValues)localObject1).put("resettable_device_id_hash", (String)localObject2);
    localObject2 = Long.valueOf(parambz.n());
    ((ContentValues)localObject1).put("last_bundle_index", (Long)localObject2);
    localObject2 = Long.valueOf(parambz.f());
    ((ContentValues)localObject1).put("last_bundle_start_timestamp", (Long)localObject2);
    localObject2 = Long.valueOf(parambz.g());
    ((ContentValues)localObject1).put("last_bundle_end_timestamp", (Long)localObject2);
    localObject2 = parambz.h();
    ((ContentValues)localObject1).put("app_version", (String)localObject2);
    localObject2 = parambz.j();
    ((ContentValues)localObject1).put("app_store", (String)localObject2);
    localObject2 = Long.valueOf(parambz.k());
    ((ContentValues)localObject1).put("gmp_version", (Long)localObject2);
    localObject2 = Long.valueOf(parambz.l());
    ((ContentValues)localObject1).put("dev_cert_hash", (Long)localObject2);
    boolean bool1 = parambz.m();
    localObject2 = Boolean.valueOf(bool1);
    ((ContentValues)localObject1).put("measurement_enabled", (Boolean)localObject2);
    a.f().e();
    localObject2 = Long.valueOf(b);
    ((ContentValues)localObject1).put("day", (Long)localObject2);
    a.f().e();
    localObject2 = Long.valueOf(c);
    ((ContentValues)localObject1).put("daily_public_events_count", (Long)localObject2);
    a.f().e();
    localObject2 = Long.valueOf(d);
    ((ContentValues)localObject1).put("daily_events_count", (Long)localObject2);
    a.f().e();
    localObject2 = Long.valueOf(e);
    ((ContentValues)localObject1).put("daily_conversions_count", (Long)localObject2);
    localObject2 = Long.valueOf(parambz.o());
    ((ContentValues)localObject1).put("config_fetched_time", (Long)localObject2);
    localObject2 = Long.valueOf(parambz.p());
    ((ContentValues)localObject1).put("failed_config_fetch_time", (Long)localObject2);
    localObject2 = Long.valueOf(parambz.i());
    ((ContentValues)localObject1).put("app_version_int", (Long)localObject2);
    localObject2 = parambz.e();
    ((ContentValues)localObject1).put("firebase_instance_id", (String)localObject2);
    a.f().e();
    localObject2 = Long.valueOf(f);
    ((ContentValues)localObject1).put("daily_error_events_count", (Long)localObject2);
    a.f().e();
    localObject2 = Long.valueOf(g);
    ((ContentValues)localObject1).put("daily_realtime_events_count", (Long)localObject2);
    localObject2 = parambz.r();
    ((ContentValues)localObject1).put("health_monitor_sample", (String)localObject2);
    Object localObject3 = "android_id";
    long l1 = parambz.s();
    localObject2 = Long.valueOf(l1);
    ((ContentValues)localObject1).put((String)localObject3, (Long)localObject2);
    try
    {
      localObject3 = L();
      localObject2 = "apps";
      localObject4 = "app_id = ?";
      int i = 1;
      String[] arrayOfString = new String[i];
      String str = parambz.a();
      arrayOfString[0] = str;
      l1 = ((SQLiteDatabase)localObject3).update((String)localObject2, (ContentValues)localObject1, (String)localObject4, arrayOfString);
      long l2 = 0L;
      bool1 = l1 < l2;
      if (!bool1)
      {
        localObject2 = "apps";
        localObject4 = null;
        i = 5;
        long l3 = ((SQLiteDatabase)localObject3).insertWithOnConflict((String)localObject2, null, (ContentValues)localObject1, i);
        l1 = -1;
        boolean bool2 = l3 < l1;
        if (!bool2)
        {
          localObject1 = u();
          localObject1 = a;
          localObject3 = "Failed to insert/update app (got -1). appId";
          localObject2 = parambz.a();
          localObject2 = cu.a((String)localObject2);
          ((cu.a)localObject1).a((String)localObject3, localObject2);
        }
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        localObject3 = ua;
        localObject2 = "Error storing app. appId";
        Object localObject4 = cu.a(parambz.a());
        ((cu.a)localObject3).a((String)localObject2, localObject4, localSQLiteException);
      }
    }
  }
  
  public final void a(ck paramck)
  {
    com.google.android.gms.common.internal.c.a(paramck);
    e();
    J();
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    Object localObject2 = a;
    ((ContentValues)localObject1).put("app_id", (String)localObject2);
    localObject2 = b;
    ((ContentValues)localObject1).put("name", (String)localObject2);
    localObject2 = Long.valueOf(c);
    ((ContentValues)localObject1).put("lifetime_count", (Long)localObject2);
    localObject2 = Long.valueOf(d);
    ((ContentValues)localObject1).put("current_bundle_count", (Long)localObject2);
    Object localObject3 = "last_fire_timestamp";
    long l1 = e;
    localObject2 = Long.valueOf(l1);
    ((ContentValues)localObject1).put((String)localObject3, (Long)localObject2);
    try
    {
      localObject3 = L();
      localObject2 = "events";
      localObject4 = null;
      int i = 5;
      long l2 = ((SQLiteDatabase)localObject3).insertWithOnConflict((String)localObject2, null, (ContentValues)localObject1, i);
      l1 = -1;
      boolean bool = l2 < l1;
      if (!bool)
      {
        localObject1 = u();
        localObject1 = a;
        localObject3 = "Failed to insert/update event aggregates (got -1). appId";
        localObject2 = a;
        localObject2 = cu.a((String)localObject2);
        ((cu.a)localObject1).a((String)localObject3, localObject2);
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        localObject3 = ua;
        localObject2 = "Error storing event aggregates. appId";
        Object localObject4 = cu.a(a);
        ((cu.a)localObject3).a((String)localObject2, localObject4, localSQLiteException);
      }
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    e();
    J();
    try
    {
      SQLiteDatabase localSQLiteDatabase = L();
      localObject1 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by triggered_timestamp desc limit ?,10);";
      int i = 3;
      localObject2 = new String[i];
      int j = 0;
      localObject3 = null;
      localObject2[0] = paramString;
      j = 1;
      localObject2[j] = paramString;
      j = 2;
      String str = String.valueOf(paramInt);
      localObject2[j] = str;
      localSQLiteDatabase.execSQL((String)localObject1, (Object[])localObject2);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject1 = ua;
        Object localObject2 = "Error pruning currencies. appId";
        Object localObject3 = cu.a(paramString);
        ((cu.a)localObject1).a((String)localObject2, localObject3, localSQLiteException);
      }
    }
  }
  
  /* Error */
  final void a(String paramString, int paramInt, du.f paramf)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   4: aload_0
    //   5: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   8: aload_1
    //   9: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_3
    //   14: invokestatic 303	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   17: pop
    //   18: aload_3
    //   19: invokevirtual 1025	com/google/android/gms/b/du$f:f	()I
    //   22: istore 4
    //   24: iload 4
    //   26: newarray <illegal type>
    //   28: astore 5
    //   30: aload 5
    //   32: arraylength
    //   33: istore 6
    //   35: aload 5
    //   37: iload 6
    //   39: invokestatic 457	com/google/android/gms/b/fu:a	([BI)Lcom/google/android/gms/b/fu;
    //   42: astore 7
    //   44: aload_3
    //   45: aload 7
    //   47: invokevirtual 1026	com/google/android/gms/b/du$f:a	(Lcom/google/android/gms/b/fu;)V
    //   50: aload 7
    //   52: invokevirtual 462	com/google/android/gms/b/fu:a	()V
    //   55: new 305	android/content/ContentValues
    //   58: astore 7
    //   60: aload 7
    //   62: invokespecial 463	android/content/ContentValues:<init>	()V
    //   65: aload 7
    //   67: ldc_w 465
    //   70: aload_1
    //   71: invokevirtual 308	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: iload_2
    //   75: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: astore 8
    //   80: aload 7
    //   82: ldc_w 467
    //   85: aload 8
    //   87: invokevirtual 470	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   90: ldc_w 1028
    //   93: astore 9
    //   95: aload 7
    //   97: aload 9
    //   99: aload 5
    //   101: invokevirtual 479	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   104: aload_0
    //   105: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   108: astore 5
    //   110: ldc_w 570
    //   113: astore 9
    //   115: aconst_null
    //   116: astore 8
    //   118: iconst_5
    //   119: istore 10
    //   121: aload 5
    //   123: aload 9
    //   125: aconst_null
    //   126: aload 7
    //   128: iload 10
    //   130: invokevirtual 489	android/database/sqlite/SQLiteDatabase:insertWithOnConflict	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    //   133: lstore 11
    //   135: iconst_m1
    //   136: i2l
    //   137: lstore 13
    //   139: lload 11
    //   141: lload 13
    //   143: lcmp
    //   144: istore 4
    //   146: iload 4
    //   148: ifne +36 -> 184
    //   151: aload_0
    //   152: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   155: astore 5
    //   157: aload 5
    //   159: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   162: astore 5
    //   164: ldc_w 1030
    //   167: astore 7
    //   169: aload_1
    //   170: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   173: astore 9
    //   175: aload 5
    //   177: aload 7
    //   179: aload 9
    //   181: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   184: return
    //   185: astore 5
    //   187: aload_0
    //   188: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   191: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   194: astore 7
    //   196: ldc_w 1032
    //   199: astore 9
    //   201: aload_1
    //   202: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   205: astore 8
    //   207: aload 7
    //   209: aload 9
    //   211: aload 8
    //   213: aload 5
    //   215: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   218: goto -34 -> 184
    //   221: astore 5
    //   223: aload_0
    //   224: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   227: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   230: astore 7
    //   232: ldc_w 1034
    //   235: astore 9
    //   237: aload_1
    //   238: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   241: astore 8
    //   243: aload 7
    //   245: aload 9
    //   247: aload 8
    //   249: aload 5
    //   251: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   254: goto -70 -> 184
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	cg
    //   0	257	1	paramString	String
    //   0	257	2	paramInt	int
    //   0	257	3	paramf	du.f
    //   22	3	4	i	int
    //   144	3	4	bool	boolean
    //   28	148	5	localObject1	Object
    //   185	29	5	localIOException	IOException
    //   221	29	5	localSQLiteException	SQLiteException
    //   33	5	6	j	int
    //   42	202	7	localObject2	Object
    //   78	170	8	localObject3	Object
    //   93	153	9	localObject4	Object
    //   119	10	10	k	int
    //   133	7	11	l1	long
    //   137	5	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   18	22	185	java/io/IOException
    //   24	28	185	java/io/IOException
    //   30	33	185	java/io/IOException
    //   37	42	185	java/io/IOException
    //   45	50	185	java/io/IOException
    //   50	55	185	java/io/IOException
    //   104	108	221	android/database/sqlite/SQLiteException
    //   128	133	221	android/database/sqlite/SQLiteException
    //   151	155	221	android/database/sqlite/SQLiteException
    //   157	162	221	android/database/sqlite/SQLiteException
    //   169	173	221	android/database/sqlite/SQLiteException
    //   179	184	221	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final void a(String paramString, long paramLong1, long paramLong2, cg.b paramb)
  {
    // Byte code:
    //   0: aload 6
    //   2: invokestatic 303	com/google/android/gms/common/internal/c:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   5: pop
    //   6: aload_0
    //   7: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   10: aload_0
    //   11: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   14: iconst_0
    //   15: istore 7
    //   17: aconst_null
    //   18: astore 8
    //   20: aload_0
    //   21: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore 9
    //   26: iconst_0
    //   27: istore 10
    //   29: aconst_null
    //   30: astore 11
    //   32: aconst_null
    //   33: invokestatic 439	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   36: istore 10
    //   38: iload 10
    //   40: ifeq +458 -> 498
    //   43: iconst_m1
    //   44: i2l
    //   45: lstore 12
    //   47: lload 4
    //   49: lload 12
    //   51: lcmp
    //   52: istore 10
    //   54: iload 10
    //   56: ifeq +185 -> 241
    //   59: iconst_2
    //   60: istore 10
    //   62: iload 10
    //   64: anewarray 255	java/lang/String
    //   67: astore 11
    //   69: iconst_0
    //   70: istore 14
    //   72: aconst_null
    //   73: astore 15
    //   75: lload 4
    //   77: invokestatic 739	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   80: astore 16
    //   82: aload 11
    //   84: iconst_0
    //   85: aload 16
    //   87: aastore
    //   88: iconst_1
    //   89: istore 14
    //   91: lload_2
    //   92: invokestatic 739	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   95: astore 16
    //   97: aload 11
    //   99: iload 14
    //   101: aload 16
    //   103: aastore
    //   104: aload 11
    //   106: astore 15
    //   108: iconst_m1
    //   109: i2l
    //   110: lstore 17
    //   112: lload 4
    //   114: lload 17
    //   116: lcmp
    //   117: istore 10
    //   119: iload 10
    //   121: ifeq +155 -> 276
    //   124: ldc_w 1036
    //   127: astore 11
    //   129: aload 11
    //   131: invokestatic 258	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   134: astore 16
    //   136: aload 16
    //   138: invokevirtual 262	java/lang/String:length	()I
    //   141: sipush 148
    //   144: iadd
    //   145: istore 19
    //   147: new 264	java/lang/StringBuilder
    //   150: astore 20
    //   152: aload 20
    //   154: iload 19
    //   156: invokespecial 265	java/lang/StringBuilder:<init>	(I)V
    //   159: ldc_w 1038
    //   162: astore 16
    //   164: aload 20
    //   166: aload 16
    //   168: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: astore 16
    //   173: aload 16
    //   175: aload 11
    //   177: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: astore 11
    //   182: ldc_w 1040
    //   185: astore 16
    //   187: aload 11
    //   189: aload 16
    //   191: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: astore 11
    //   196: aload 11
    //   198: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: astore 11
    //   203: aload 9
    //   205: aload 11
    //   207: aload 15
    //   209: invokevirtual 282	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   212: astore 8
    //   214: aload 8
    //   216: invokeinterface 426 1 0
    //   221: istore 10
    //   223: iload 10
    //   225: ifne +59 -> 284
    //   228: aload 8
    //   230: ifnull +10 -> 240
    //   233: aload 8
    //   235: invokeinterface 295 1 0
    //   240: return
    //   241: iconst_1
    //   242: istore 10
    //   244: iload 10
    //   246: anewarray 255	java/lang/String
    //   249: astore 11
    //   251: iconst_0
    //   252: istore 14
    //   254: aconst_null
    //   255: astore 15
    //   257: lload_2
    //   258: invokestatic 739	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   261: astore 16
    //   263: aload 11
    //   265: iconst_0
    //   266: aload 16
    //   268: aastore
    //   269: aload 11
    //   271: astore 15
    //   273: goto -165 -> 108
    //   276: ldc_w 842
    //   279: astore 11
    //   281: goto -152 -> 129
    //   284: iconst_0
    //   285: istore 10
    //   287: aconst_null
    //   288: astore 11
    //   290: aload 8
    //   292: iconst_0
    //   293: invokeinterface 247 2 0
    //   298: astore_1
    //   299: iconst_1
    //   300: istore 10
    //   302: aload 8
    //   304: iload 10
    //   306: invokeinterface 247 2 0
    //   311: astore 11
    //   313: aload 8
    //   315: invokeinterface 295 1 0
    //   320: aload 8
    //   322: astore 21
    //   324: aload 11
    //   326: astore 22
    //   328: ldc_w 776
    //   331: astore 8
    //   333: iconst_1
    //   334: istore 10
    //   336: iload 10
    //   338: anewarray 255	java/lang/String
    //   341: astore 11
    //   343: iconst_0
    //   344: istore 14
    //   346: aconst_null
    //   347: astore 15
    //   349: ldc_w 774
    //   352: astore 16
    //   354: aload 11
    //   356: iconst_0
    //   357: aload 16
    //   359: aastore
    //   360: ldc_w 1042
    //   363: astore 15
    //   365: iconst_2
    //   366: istore 19
    //   368: iload 19
    //   370: anewarray 255	java/lang/String
    //   373: astore 16
    //   375: iconst_0
    //   376: istore 23
    //   378: aconst_null
    //   379: astore 20
    //   381: aload 16
    //   383: iconst_0
    //   384: aload_1
    //   385: aastore
    //   386: iconst_1
    //   387: istore 23
    //   389: aload 16
    //   391: iload 23
    //   393: aload 22
    //   395: aastore
    //   396: iconst_0
    //   397: istore 23
    //   399: aconst_null
    //   400: astore 20
    //   402: aconst_null
    //   403: astore 24
    //   405: ldc_w 613
    //   408: astore 25
    //   410: ldc_w 1044
    //   413: astore 26
    //   415: aload 9
    //   417: aload 8
    //   419: aload 11
    //   421: aload 15
    //   423: aload 16
    //   425: aconst_null
    //   426: aconst_null
    //   427: aload 25
    //   429: aload 26
    //   431: invokevirtual 621	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   434: astore 21
    //   436: aload 21
    //   438: invokeinterface 426 1 0
    //   443: istore 7
    //   445: iload 7
    //   447: ifne +325 -> 772
    //   450: aload_0
    //   451: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   454: astore 9
    //   456: aload 9
    //   458: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   461: astore 9
    //   463: ldc_w 1046
    //   466: astore 8
    //   468: aload_1
    //   469: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   472: astore 11
    //   474: aload 9
    //   476: aload 8
    //   478: aload 11
    //   480: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   483: aload 21
    //   485: ifnull -245 -> 240
    //   488: aload 21
    //   490: invokeinterface 295 1 0
    //   495: goto -255 -> 240
    //   498: iconst_m1
    //   499: i2l
    //   500: lstore 12
    //   502: lload 4
    //   504: lload 12
    //   506: lcmp
    //   507: istore 10
    //   509: iload 10
    //   511: ifeq +185 -> 696
    //   514: iconst_2
    //   515: istore 10
    //   517: iload 10
    //   519: anewarray 255	java/lang/String
    //   522: astore 11
    //   524: iconst_0
    //   525: istore 14
    //   527: aconst_null
    //   528: astore 15
    //   530: iconst_0
    //   531: istore 19
    //   533: aconst_null
    //   534: astore 16
    //   536: aload 11
    //   538: iconst_0
    //   539: aconst_null
    //   540: aastore
    //   541: iconst_1
    //   542: istore 14
    //   544: lload 4
    //   546: invokestatic 739	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   549: astore 16
    //   551: aload 11
    //   553: iload 14
    //   555: aload 16
    //   557: aastore
    //   558: aload 11
    //   560: astore 15
    //   562: iconst_m1
    //   563: i2l
    //   564: lstore 17
    //   566: lload 4
    //   568: lload 17
    //   570: lcmp
    //   571: istore 10
    //   573: iload 10
    //   575: ifeq +155 -> 730
    //   578: ldc_w 1048
    //   581: astore 11
    //   583: aload 11
    //   585: invokestatic 258	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   588: astore 16
    //   590: aload 16
    //   592: invokevirtual 262	java/lang/String:length	()I
    //   595: bipush 84
    //   597: iadd
    //   598: istore 19
    //   600: new 264	java/lang/StringBuilder
    //   603: astore 20
    //   605: aload 20
    //   607: iload 19
    //   609: invokespecial 265	java/lang/StringBuilder:<init>	(I)V
    //   612: ldc_w 1050
    //   615: astore 16
    //   617: aload 20
    //   619: aload 16
    //   621: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   624: astore 16
    //   626: aload 16
    //   628: aload 11
    //   630: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: astore 11
    //   635: ldc_w 1052
    //   638: astore 16
    //   640: aload 11
    //   642: aload 16
    //   644: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: astore 11
    //   649: aload 11
    //   651: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   654: astore 11
    //   656: aload 9
    //   658: aload 11
    //   660: aload 15
    //   662: invokevirtual 282	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   665: astore 8
    //   667: aload 8
    //   669: invokeinterface 426 1 0
    //   674: istore 10
    //   676: iload 10
    //   678: ifne +60 -> 738
    //   681: aload 8
    //   683: ifnull -443 -> 240
    //   686: aload 8
    //   688: invokeinterface 295 1 0
    //   693: goto -453 -> 240
    //   696: iconst_1
    //   697: istore 10
    //   699: iload 10
    //   701: anewarray 255	java/lang/String
    //   704: astore 11
    //   706: iconst_0
    //   707: istore 14
    //   709: aconst_null
    //   710: astore 15
    //   712: iconst_0
    //   713: istore 19
    //   715: aconst_null
    //   716: astore 16
    //   718: aload 11
    //   720: iconst_0
    //   721: aconst_null
    //   722: aastore
    //   723: aload 11
    //   725: astore 15
    //   727: goto -165 -> 562
    //   730: ldc_w 842
    //   733: astore 11
    //   735: goto -152 -> 583
    //   738: iconst_0
    //   739: istore 10
    //   741: aconst_null
    //   742: astore 11
    //   744: aload 8
    //   746: iconst_0
    //   747: invokeinterface 247 2 0
    //   752: astore 11
    //   754: aload 8
    //   756: invokeinterface 295 1 0
    //   761: aload 8
    //   763: astore 21
    //   765: aload 11
    //   767: astore 22
    //   769: goto -441 -> 328
    //   772: iconst_0
    //   773: istore 7
    //   775: aconst_null
    //   776: astore 8
    //   778: aload 21
    //   780: iconst_0
    //   781: invokeinterface 637 2 0
    //   786: astore 8
    //   788: aload 8
    //   790: arraylength
    //   791: istore 10
    //   793: aload 8
    //   795: iload 10
    //   797: invokestatic 862	com/google/android/gms/b/ft:a	([BI)Lcom/google/android/gms/b/ft;
    //   800: astore 8
    //   802: new 756	com/google/android/gms/b/du$e
    //   805: astore 11
    //   807: aload 11
    //   809: invokespecial 863	com/google/android/gms/b/du$e:<init>	()V
    //   812: aload 11
    //   814: aload 8
    //   816: invokevirtual 866	com/google/android/gms/b/du$e:a	(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/gb;
    //   819: pop
    //   820: aload 21
    //   822: invokeinterface 661 1 0
    //   827: istore 7
    //   829: iload 7
    //   831: ifeq +36 -> 867
    //   834: aload_0
    //   835: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   838: astore 8
    //   840: aload 8
    //   842: getfield 177	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   845: astore 8
    //   847: ldc_w 1054
    //   850: astore 15
    //   852: aload_1
    //   853: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   856: astore 16
    //   858: aload 8
    //   860: aload 15
    //   862: aload 16
    //   864: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   867: aload 21
    //   869: invokeinterface 295 1 0
    //   874: aload 6
    //   876: aload 11
    //   878: invokeinterface 1059 2 0
    //   883: iconst_m1
    //   884: i2l
    //   885: lstore 12
    //   887: lload 4
    //   889: lload 12
    //   891: lcmp
    //   892: istore 7
    //   894: iload 7
    //   896: ifeq +284 -> 1180
    //   899: ldc_w 1061
    //   902: astore 15
    //   904: iconst_3
    //   905: istore 7
    //   907: iload 7
    //   909: anewarray 255	java/lang/String
    //   912: astore 16
    //   914: iconst_0
    //   915: istore 7
    //   917: aconst_null
    //   918: astore 8
    //   920: aload 16
    //   922: iconst_0
    //   923: aload_1
    //   924: aastore
    //   925: iconst_1
    //   926: istore 7
    //   928: aload 16
    //   930: iload 7
    //   932: aload 22
    //   934: aastore
    //   935: iconst_2
    //   936: istore 7
    //   938: lload 4
    //   940: invokestatic 739	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   943: astore 11
    //   945: aload 16
    //   947: iload 7
    //   949: aload 11
    //   951: aastore
    //   952: ldc_w 1063
    //   955: astore 8
    //   957: iconst_4
    //   958: istore 10
    //   960: iload 10
    //   962: anewarray 255	java/lang/String
    //   965: astore 11
    //   967: iconst_0
    //   968: istore 23
    //   970: aconst_null
    //   971: astore 20
    //   973: ldc_w 613
    //   976: astore 24
    //   978: aload 11
    //   980: iconst_0
    //   981: aload 24
    //   983: aastore
    //   984: iconst_1
    //   985: istore 23
    //   987: ldc_w 417
    //   990: astore 24
    //   992: aload 11
    //   994: iload 23
    //   996: aload 24
    //   998: aastore
    //   999: iconst_2
    //   1000: istore 23
    //   1002: ldc_w 1065
    //   1005: astore 24
    //   1007: aload 11
    //   1009: iload 23
    //   1011: aload 24
    //   1013: aastore
    //   1014: iconst_3
    //   1015: istore 23
    //   1017: ldc_w 476
    //   1020: astore 24
    //   1022: aload 11
    //   1024: iload 23
    //   1026: aload 24
    //   1028: aastore
    //   1029: iconst_0
    //   1030: istore 23
    //   1032: aconst_null
    //   1033: astore 20
    //   1035: aconst_null
    //   1036: astore 24
    //   1038: ldc_w 613
    //   1041: astore 25
    //   1043: aconst_null
    //   1044: astore 26
    //   1046: aload 9
    //   1048: aload 8
    //   1050: aload 11
    //   1052: aload 15
    //   1054: aload 16
    //   1056: aconst_null
    //   1057: aconst_null
    //   1058: aload 25
    //   1060: aconst_null
    //   1061: invokevirtual 621	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   1064: astore 8
    //   1066: aload 8
    //   1068: invokeinterface 426 1 0
    //   1073: istore 27
    //   1075: iload 27
    //   1077: ifne +198 -> 1275
    //   1080: aload_0
    //   1081: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   1084: astore 9
    //   1086: aload 9
    //   1088: getfield 177	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   1091: astore 9
    //   1093: ldc_w 1067
    //   1096: astore 11
    //   1098: aload_1
    //   1099: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1102: astore 15
    //   1104: aload 9
    //   1106: aload 11
    //   1108: aload 15
    //   1110: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1113: aload 8
    //   1115: ifnull -875 -> 240
    //   1118: aload 8
    //   1120: invokeinterface 295 1 0
    //   1125: goto -885 -> 240
    //   1128: astore 9
    //   1130: aload_0
    //   1131: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   1134: astore 8
    //   1136: aload 8
    //   1138: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   1141: astore 8
    //   1143: ldc_w 1069
    //   1146: astore 11
    //   1148: aload_1
    //   1149: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1152: astore 15
    //   1154: aload 8
    //   1156: aload 11
    //   1158: aload 15
    //   1160: aload 9
    //   1162: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1165: aload 21
    //   1167: ifnull -927 -> 240
    //   1170: aload 21
    //   1172: invokeinterface 295 1 0
    //   1177: goto -937 -> 240
    //   1180: ldc_w 1042
    //   1183: astore 15
    //   1185: iconst_2
    //   1186: istore 7
    //   1188: iload 7
    //   1190: anewarray 255	java/lang/String
    //   1193: astore 16
    //   1195: iconst_0
    //   1196: istore 7
    //   1198: aconst_null
    //   1199: astore 8
    //   1201: aload 16
    //   1203: iconst_0
    //   1204: aload_1
    //   1205: aastore
    //   1206: iconst_1
    //   1207: istore 7
    //   1209: aload 16
    //   1211: iload 7
    //   1213: aload 22
    //   1215: aastore
    //   1216: goto -264 -> 952
    //   1219: astore 9
    //   1221: aload 21
    //   1223: astore 8
    //   1225: aload_0
    //   1226: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   1229: astore 11
    //   1231: aload 11
    //   1233: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   1236: astore 11
    //   1238: ldc_w 1071
    //   1241: astore 15
    //   1243: aload_1
    //   1244: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1247: astore 16
    //   1249: aload 11
    //   1251: aload 15
    //   1253: aload 16
    //   1255: aload 9
    //   1257: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1260: aload 8
    //   1262: ifnull -1022 -> 240
    //   1265: aload 8
    //   1267: invokeinterface 295 1 0
    //   1272: goto -1032 -> 240
    //   1275: iconst_0
    //   1276: istore 27
    //   1278: aconst_null
    //   1279: astore 9
    //   1281: aload 8
    //   1283: iconst_0
    //   1284: invokeinterface 229 2 0
    //   1289: lstore 12
    //   1291: iconst_3
    //   1292: istore 27
    //   1294: aload 8
    //   1296: iload 27
    //   1298: invokeinterface 637 2 0
    //   1303: astore 9
    //   1305: aload 9
    //   1307: arraylength
    //   1308: istore 19
    //   1310: aload 9
    //   1312: iload 19
    //   1314: invokestatic 862	com/google/android/gms/b/ft:a	([BI)Lcom/google/android/gms/b/ft;
    //   1317: astore 9
    //   1319: new 1073	com/google/android/gms/b/du$b
    //   1322: astore 16
    //   1324: aload 16
    //   1326: invokespecial 1074	com/google/android/gms/b/du$b:<init>	()V
    //   1329: aload 16
    //   1331: aload 9
    //   1333: invokevirtual 1075	com/google/android/gms/b/du$b:a	(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/gb;
    //   1336: pop
    //   1337: iconst_1
    //   1338: istore 27
    //   1340: aload 8
    //   1342: iload 27
    //   1344: invokeinterface 247 2 0
    //   1349: astore 9
    //   1351: aload 16
    //   1353: aload 9
    //   1355: putfield 1076	com/google/android/gms/b/du$b:b	Ljava/lang/String;
    //   1358: iconst_2
    //   1359: istore 27
    //   1361: aload 8
    //   1363: iload 27
    //   1365: invokeinterface 229 2 0
    //   1370: lstore 28
    //   1372: lload 28
    //   1374: invokestatic 234	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1377: astore 9
    //   1379: aload 16
    //   1381: aload 9
    //   1383: putfield 1079	com/google/android/gms/b/du$b:c	Ljava/lang/Long;
    //   1386: aload 6
    //   1388: lload 12
    //   1390: aload 16
    //   1392: invokeinterface 1082 4 0
    //   1397: istore 27
    //   1399: iload 27
    //   1401: ifne +55 -> 1456
    //   1404: aload 8
    //   1406: ifnull -1166 -> 240
    //   1409: aload 8
    //   1411: invokeinterface 295 1 0
    //   1416: goto -1176 -> 240
    //   1419: astore 9
    //   1421: aload_0
    //   1422: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   1425: astore 11
    //   1427: aload 11
    //   1429: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   1432: astore 11
    //   1434: ldc_w 1084
    //   1437: astore 15
    //   1439: aload_1
    //   1440: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1443: astore 16
    //   1445: aload 11
    //   1447: aload 15
    //   1449: aload 16
    //   1451: aload 9
    //   1453: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1456: aload 8
    //   1458: invokeinterface 661 1 0
    //   1463: istore 27
    //   1465: iload 27
    //   1467: ifne -192 -> 1275
    //   1470: aload 8
    //   1472: ifnull -1232 -> 240
    //   1475: aload 8
    //   1477: invokeinterface 295 1 0
    //   1482: goto -1242 -> 240
    //   1485: astore 9
    //   1487: aload 8
    //   1489: ifnull +10 -> 1499
    //   1492: aload 8
    //   1494: invokeinterface 295 1 0
    //   1499: aload 9
    //   1501: athrow
    //   1502: astore 9
    //   1504: aload 21
    //   1506: astore 8
    //   1508: goto -21 -> 1487
    //   1511: astore 9
    //   1513: goto -288 -> 1225
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1516	0	this	cg
    //   0	1516	1	paramString	String
    //   0	1516	2	paramLong1	long
    //   0	1516	4	paramLong2	long
    //   0	1516	6	paramb	cg.b
    //   15	880	7	bool1	boolean
    //   905	307	7	i	int
    //   18	1489	8	localObject1	Object
    //   24	1081	9	localObject2	Object
    //   1128	33	9	localIOException1	IOException
    //   1219	37	9	localSQLiteException1	SQLiteException
    //   1279	103	9	localObject3	Object
    //   1419	33	9	localIOException2	IOException
    //   1485	15	9	localObject4	Object
    //   1502	1	9	localObject5	Object
    //   1511	1	9	localSQLiteException2	SQLiteException
    //   27	28	10	bool2	boolean
    //   60	3	10	j	int
    //   117	188	10	k	int
    //   334	176	10	bool3	boolean
    //   515	3	10	m	int
    //   571	169	10	bool4	boolean
    //   791	170	10	n	int
    //   30	1416	11	localObject6	Object
    //   45	1344	12	l1	long
    //   70	638	14	i1	int
    //   73	1375	15	localObject7	Object
    //   80	1370	16	localObject8	Object
    //   110	459	17	l2	long
    //   145	1168	19	i2	int
    //   150	884	20	localStringBuilder	StringBuilder
    //   322	1183	21	localObject9	Object
    //   326	888	22	localObject10	Object
    //   376	655	23	i3	int
    //   403	634	24	str1	String
    //   408	651	25	str2	String
    //   413	632	26	str3	String
    //   1073	204	27	bool5	boolean
    //   1292	72	27	i4	int
    //   1397	69	27	bool6	boolean
    //   1370	3	28	l3	long
    // Exception table:
    //   from	to	target	type
    //   814	820	1128	java/io/IOException
    //   336	341	1219	android/database/sqlite/SQLiteException
    //   357	360	1219	android/database/sqlite/SQLiteException
    //   368	373	1219	android/database/sqlite/SQLiteException
    //   384	386	1219	android/database/sqlite/SQLiteException
    //   393	396	1219	android/database/sqlite/SQLiteException
    //   429	434	1219	android/database/sqlite/SQLiteException
    //   436	443	1219	android/database/sqlite/SQLiteException
    //   450	454	1219	android/database/sqlite/SQLiteException
    //   456	461	1219	android/database/sqlite/SQLiteException
    //   468	472	1219	android/database/sqlite/SQLiteException
    //   478	483	1219	android/database/sqlite/SQLiteException
    //   780	786	1219	android/database/sqlite/SQLiteException
    //   788	791	1219	android/database/sqlite/SQLiteException
    //   795	800	1219	android/database/sqlite/SQLiteException
    //   802	805	1219	android/database/sqlite/SQLiteException
    //   807	812	1219	android/database/sqlite/SQLiteException
    //   814	820	1219	android/database/sqlite/SQLiteException
    //   820	827	1219	android/database/sqlite/SQLiteException
    //   834	838	1219	android/database/sqlite/SQLiteException
    //   840	845	1219	android/database/sqlite/SQLiteException
    //   852	856	1219	android/database/sqlite/SQLiteException
    //   862	867	1219	android/database/sqlite/SQLiteException
    //   867	874	1219	android/database/sqlite/SQLiteException
    //   876	883	1219	android/database/sqlite/SQLiteException
    //   907	912	1219	android/database/sqlite/SQLiteException
    //   923	925	1219	android/database/sqlite/SQLiteException
    //   932	935	1219	android/database/sqlite/SQLiteException
    //   938	943	1219	android/database/sqlite/SQLiteException
    //   949	952	1219	android/database/sqlite/SQLiteException
    //   960	965	1219	android/database/sqlite/SQLiteException
    //   981	984	1219	android/database/sqlite/SQLiteException
    //   996	999	1219	android/database/sqlite/SQLiteException
    //   1011	1014	1219	android/database/sqlite/SQLiteException
    //   1026	1029	1219	android/database/sqlite/SQLiteException
    //   1060	1064	1219	android/database/sqlite/SQLiteException
    //   1130	1134	1219	android/database/sqlite/SQLiteException
    //   1136	1141	1219	android/database/sqlite/SQLiteException
    //   1148	1152	1219	android/database/sqlite/SQLiteException
    //   1160	1165	1219	android/database/sqlite/SQLiteException
    //   1188	1193	1219	android/database/sqlite/SQLiteException
    //   1204	1206	1219	android/database/sqlite/SQLiteException
    //   1213	1216	1219	android/database/sqlite/SQLiteException
    //   1331	1337	1419	java/io/IOException
    //   20	24	1485	finally
    //   32	36	1485	finally
    //   62	67	1485	finally
    //   75	80	1485	finally
    //   85	88	1485	finally
    //   91	95	1485	finally
    //   101	104	1485	finally
    //   129	134	1485	finally
    //   136	141	1485	finally
    //   147	150	1485	finally
    //   154	159	1485	finally
    //   166	171	1485	finally
    //   175	180	1485	finally
    //   189	194	1485	finally
    //   196	201	1485	finally
    //   207	212	1485	finally
    //   214	221	1485	finally
    //   244	249	1485	finally
    //   257	261	1485	finally
    //   266	269	1485	finally
    //   292	298	1485	finally
    //   304	311	1485	finally
    //   313	320	1485	finally
    //   517	522	1485	finally
    //   539	541	1485	finally
    //   544	549	1485	finally
    //   555	558	1485	finally
    //   583	588	1485	finally
    //   590	595	1485	finally
    //   600	603	1485	finally
    //   607	612	1485	finally
    //   619	624	1485	finally
    //   628	633	1485	finally
    //   642	647	1485	finally
    //   649	654	1485	finally
    //   660	665	1485	finally
    //   667	674	1485	finally
    //   699	704	1485	finally
    //   721	723	1485	finally
    //   746	752	1485	finally
    //   754	761	1485	finally
    //   1066	1073	1485	finally
    //   1080	1084	1485	finally
    //   1086	1091	1485	finally
    //   1098	1102	1485	finally
    //   1108	1113	1485	finally
    //   1225	1229	1485	finally
    //   1231	1236	1485	finally
    //   1243	1247	1485	finally
    //   1255	1260	1485	finally
    //   1283	1289	1485	finally
    //   1296	1303	1485	finally
    //   1305	1308	1485	finally
    //   1312	1317	1485	finally
    //   1319	1322	1485	finally
    //   1324	1329	1485	finally
    //   1331	1337	1485	finally
    //   1342	1349	1485	finally
    //   1353	1358	1485	finally
    //   1363	1370	1485	finally
    //   1372	1377	1485	finally
    //   1381	1386	1485	finally
    //   1390	1397	1485	finally
    //   1421	1425	1485	finally
    //   1427	1432	1485	finally
    //   1439	1443	1485	finally
    //   1451	1456	1485	finally
    //   1456	1463	1485	finally
    //   336	341	1502	finally
    //   357	360	1502	finally
    //   368	373	1502	finally
    //   384	386	1502	finally
    //   393	396	1502	finally
    //   429	434	1502	finally
    //   436	443	1502	finally
    //   450	454	1502	finally
    //   456	461	1502	finally
    //   468	472	1502	finally
    //   478	483	1502	finally
    //   780	786	1502	finally
    //   788	791	1502	finally
    //   795	800	1502	finally
    //   802	805	1502	finally
    //   807	812	1502	finally
    //   814	820	1502	finally
    //   820	827	1502	finally
    //   834	838	1502	finally
    //   840	845	1502	finally
    //   852	856	1502	finally
    //   862	867	1502	finally
    //   867	874	1502	finally
    //   876	883	1502	finally
    //   907	912	1502	finally
    //   923	925	1502	finally
    //   932	935	1502	finally
    //   938	943	1502	finally
    //   949	952	1502	finally
    //   960	965	1502	finally
    //   981	984	1502	finally
    //   996	999	1502	finally
    //   1011	1014	1502	finally
    //   1026	1029	1502	finally
    //   1060	1064	1502	finally
    //   1130	1134	1502	finally
    //   1136	1141	1502	finally
    //   1148	1152	1502	finally
    //   1160	1165	1502	finally
    //   1188	1193	1502	finally
    //   1204	1206	1502	finally
    //   1213	1216	1502	finally
    //   20	24	1511	android/database/sqlite/SQLiteException
    //   32	36	1511	android/database/sqlite/SQLiteException
    //   62	67	1511	android/database/sqlite/SQLiteException
    //   75	80	1511	android/database/sqlite/SQLiteException
    //   85	88	1511	android/database/sqlite/SQLiteException
    //   91	95	1511	android/database/sqlite/SQLiteException
    //   101	104	1511	android/database/sqlite/SQLiteException
    //   129	134	1511	android/database/sqlite/SQLiteException
    //   136	141	1511	android/database/sqlite/SQLiteException
    //   147	150	1511	android/database/sqlite/SQLiteException
    //   154	159	1511	android/database/sqlite/SQLiteException
    //   166	171	1511	android/database/sqlite/SQLiteException
    //   175	180	1511	android/database/sqlite/SQLiteException
    //   189	194	1511	android/database/sqlite/SQLiteException
    //   196	201	1511	android/database/sqlite/SQLiteException
    //   207	212	1511	android/database/sqlite/SQLiteException
    //   214	221	1511	android/database/sqlite/SQLiteException
    //   244	249	1511	android/database/sqlite/SQLiteException
    //   257	261	1511	android/database/sqlite/SQLiteException
    //   266	269	1511	android/database/sqlite/SQLiteException
    //   292	298	1511	android/database/sqlite/SQLiteException
    //   304	311	1511	android/database/sqlite/SQLiteException
    //   313	320	1511	android/database/sqlite/SQLiteException
    //   517	522	1511	android/database/sqlite/SQLiteException
    //   539	541	1511	android/database/sqlite/SQLiteException
    //   544	549	1511	android/database/sqlite/SQLiteException
    //   555	558	1511	android/database/sqlite/SQLiteException
    //   583	588	1511	android/database/sqlite/SQLiteException
    //   590	595	1511	android/database/sqlite/SQLiteException
    //   600	603	1511	android/database/sqlite/SQLiteException
    //   607	612	1511	android/database/sqlite/SQLiteException
    //   619	624	1511	android/database/sqlite/SQLiteException
    //   628	633	1511	android/database/sqlite/SQLiteException
    //   642	647	1511	android/database/sqlite/SQLiteException
    //   649	654	1511	android/database/sqlite/SQLiteException
    //   660	665	1511	android/database/sqlite/SQLiteException
    //   667	674	1511	android/database/sqlite/SQLiteException
    //   699	704	1511	android/database/sqlite/SQLiteException
    //   721	723	1511	android/database/sqlite/SQLiteException
    //   746	752	1511	android/database/sqlite/SQLiteException
    //   754	761	1511	android/database/sqlite/SQLiteException
    //   1066	1073	1511	android/database/sqlite/SQLiteException
    //   1080	1084	1511	android/database/sqlite/SQLiteException
    //   1086	1091	1511	android/database/sqlite/SQLiteException
    //   1098	1102	1511	android/database/sqlite/SQLiteException
    //   1108	1113	1511	android/database/sqlite/SQLiteException
    //   1283	1289	1511	android/database/sqlite/SQLiteException
    //   1296	1303	1511	android/database/sqlite/SQLiteException
    //   1305	1308	1511	android/database/sqlite/SQLiteException
    //   1312	1317	1511	android/database/sqlite/SQLiteException
    //   1319	1322	1511	android/database/sqlite/SQLiteException
    //   1324	1329	1511	android/database/sqlite/SQLiteException
    //   1331	1337	1511	android/database/sqlite/SQLiteException
    //   1342	1349	1511	android/database/sqlite/SQLiteException
    //   1353	1358	1511	android/database/sqlite/SQLiteException
    //   1363	1370	1511	android/database/sqlite/SQLiteException
    //   1372	1377	1511	android/database/sqlite/SQLiteException
    //   1381	1386	1511	android/database/sqlite/SQLiteException
    //   1390	1397	1511	android/database/sqlite/SQLiteException
    //   1421	1425	1511	android/database/sqlite/SQLiteException
    //   1427	1432	1511	android/database/sqlite/SQLiteException
    //   1439	1443	1511	android/database/sqlite/SQLiteException
    //   1451	1456	1511	android/database/sqlite/SQLiteException
    //   1456	1463	1511	android/database/sqlite/SQLiteException
  }
  
  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    e();
    J();
    Object localObject1 = new android/content/ContentValues;
    ((ContentValues)localObject1).<init>();
    Object localObject2 = "remote_config";
    ((ContentValues)localObject1).put((String)localObject2, paramArrayOfByte);
    try
    {
      localObject2 = L();
      localObject3 = "apps";
      localObject4 = "app_id = ?";
      int i = 1;
      String[] arrayOfString = new String[i];
      arrayOfString[0] = paramString;
      long l1 = ((SQLiteDatabase)localObject2).update((String)localObject3, (ContentValues)localObject1, (String)localObject4, arrayOfString);
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (!bool)
      {
        localObject1 = u();
        localObject1 = a;
        localObject2 = "Failed to update remote config (got 0). appId";
        localObject3 = cu.a(paramString);
        ((cu.a)localObject1).a((String)localObject2, localObject3);
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        localObject2 = ua;
        Object localObject3 = "Error storing remote config. appId";
        Object localObject4 = cu.a(paramString);
        ((cu.a)localObject2).a((String)localObject3, localObject4, localSQLiteException);
      }
    }
  }
  
  final void a(String paramString, ds.a[] paramArrayOfa)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    J();
    e();
    com.google.android.gms.common.internal.c.a(paramString);
    com.google.android.gms.common.internal.c.a(paramArrayOfa);
    SQLiteDatabase localSQLiteDatabase = L();
    localSQLiteDatabase.beginTransaction();
    Object localObject3;
    Object localObject5;
    int m;
    Object localObject6;
    Integer localInteger;
    for (;;)
    {
      try
      {
        J();
        e();
        com.google.android.gms.common.internal.c.a(paramString);
        localObject3 = L();
        localObject4 = "property_filters";
        localObject5 = "app_id=?";
        int k = 1;
        String[] arrayOfString1 = new String[k];
        m = 0;
        localObject6 = null;
        arrayOfString1[0] = paramString;
        ((SQLiteDatabase)localObject3).delete((String)localObject4, (String)localObject5, arrayOfString1);
        localObject4 = "event_filters";
        localObject5 = "app_id=?";
        k = 1;
        arrayOfString1 = new String[k];
        m = 0;
        localObject6 = null;
        arrayOfString1[0] = paramString;
        ((SQLiteDatabase)localObject3).delete((String)localObject4, (String)localObject5, arrayOfString1);
        k = paramArrayOfa.length;
        int n = 0;
        localObject3 = null;
        if (n >= k) {
          break label762;
        }
        localObject5 = paramArrayOfa[n];
        J();
        e();
        com.google.android.gms.common.internal.c.a(paramString);
        com.google.android.gms.common.internal.c.a(localObject5);
        localObject4 = c;
        com.google.android.gms.common.internal.c.a(localObject4);
        localObject4 = b;
        com.google.android.gms.common.internal.c.a(localObject4);
        localObject4 = a;
        if (localObject4 == null)
        {
          localObject4 = u();
          localObject4 = c;
          localObject5 = "Audience with no ID. appId";
          localObject6 = cu.a(paramString);
          ((cu.a)localObject4).a((String)localObject5, localObject6);
          n += 1;
        }
        else
        {
          localObject4 = a;
          m = ((Integer)localObject4).intValue();
          localObject7 = c;
          i1 = localObject7.length;
          i2 = 0;
          localObject4 = null;
          if (i2 >= i1) {
            break;
          }
          localInteger = localObject7[i2];
          localInteger = a;
          if (localInteger == null)
          {
            localObject4 = u();
            localObject4 = c;
            localObject6 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
            localObject7 = cu.a(paramString);
            localObject5 = a;
            ((cu.a)localObject4).a((String)localObject6, localObject7, localObject5);
          }
          else
          {
            i2 += 1;
          }
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
    }
    Object localObject7 = b;
    int i1 = localObject7.length;
    int i2 = 0;
    Object localObject4 = null;
    for (;;)
    {
      if (i2 >= i1) {
        break label484;
      }
      localInteger = localObject7[i2];
      localInteger = a;
      if (localInteger == null)
      {
        localObject4 = u();
        localObject4 = c;
        localObject6 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        localObject7 = cu.a(paramString);
        localObject5 = a;
        ((cu.a)localObject4).a((String)localObject6, localObject7, localObject5);
        break;
      }
      i2 += 1;
    }
    label484:
    localObject7 = c;
    i1 = localObject7.length;
    i2 = 0;
    localObject4 = null;
    label502:
    boolean bool;
    if (i2 < i1)
    {
      localInteger = localObject7[i2];
      bool = a(paramString, m, localInteger);
      if (!bool)
      {
        i2 = 0;
        localObject4 = null;
      }
    }
    for (;;)
    {
      int i3;
      if (i2 != 0)
      {
        localObject7 = b;
        i1 = localObject7.length;
        i3 = 0;
        localObject5 = null;
      }
      for (;;)
      {
        if (i3 < i1)
        {
          localInteger = localObject7[i3];
          bool = a(paramString, m, localInteger);
          if (!bool)
          {
            i2 = 0;
            localObject4 = null;
          }
        }
        else
        {
          if (i2 != 0) {
            break;
          }
          J();
          e();
          com.google.android.gms.common.internal.c.a(paramString);
          localObject4 = L();
          localObject5 = "property_filters";
          localObject7 = "app_id=? and audience_id=?";
          i1 = 2;
          String[] arrayOfString2 = new String[i1];
          bool = false;
          localInteger = null;
          arrayOfString2[0] = paramString;
          bool = true;
          String str = String.valueOf(m);
          arrayOfString2[bool] = str;
          ((SQLiteDatabase)localObject4).delete((String)localObject5, (String)localObject7, arrayOfString2);
          localObject5 = "event_filters";
          localObject7 = "app_id=? and audience_id=?";
          i1 = 2;
          arrayOfString2 = new String[i1];
          bool = false;
          localInteger = null;
          arrayOfString2[0] = paramString;
          bool = true;
          localObject6 = String.valueOf(m);
          arrayOfString2[bool] = localObject6;
          ((SQLiteDatabase)localObject4).delete((String)localObject5, (String)localObject7, arrayOfString2);
          break;
          i2 += 1;
          break label502;
        }
        i3 += 1;
      }
      label762:
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      i2 = paramArrayOfa.length;
      while (j < i2)
      {
        localObject5 = paramArrayOfa[j];
        localObject5 = a;
        ((List)localObject3).add(localObject5);
        j += 1;
      }
      a(paramString, (List)localObject3);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      return;
      i2 = i;
    }
  }
  
  public final void a(List paramList)
  {
    com.google.android.gms.common.internal.c.a(paramList);
    e();
    J();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("rowid in (");
    int i = 0;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
    for (;;)
    {
      i = paramList.size();
      if (j >= i) {
        break;
      }
      if (j != 0)
      {
        localObject2 = ",";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      localObject2 = (Long)paramList.get(j);
      long l = ((Long)localObject2).longValue();
      ((StringBuilder)localObject1).append(l);
      i = j + 1;
      j = i;
    }
    ((StringBuilder)localObject1).append(")");
    localObject2 = L();
    localObject3 = "raw_events";
    localObject1 = ((StringBuilder)localObject1).toString();
    int k = 0;
    Integer localInteger = null;
    i = ((SQLiteDatabase)localObject2).delete((String)localObject3, (String)localObject1, null);
    j = paramList.size();
    if (i != j)
    {
      localObject3 = ua;
      localObject1 = "Deleted fewer rows from raw events table than expected";
      localObject2 = Integer.valueOf(i);
      k = paramList.size();
      localInteger = Integer.valueOf(k);
      ((cu.a)localObject3).a((String)localObject1, localObject2, localInteger);
    }
  }
  
  public final boolean a(cd paramcd)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    com.google.android.gms.common.internal.c.a(paramcd);
    e();
    J();
    localObject2 = b;
    localObject3 = d.b;
    localObject2 = c((String)localObject2, (String)localObject3);
    long l1;
    long l2;
    if (localObject2 == null)
    {
      localObject2 = "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?";
      localObject3 = new String[bool1];
      localObject4 = b;
      localObject3[0] = localObject4;
      l1 = a((String)localObject2, (String[])localObject3);
      cf.M();
      l2 = 1000L;
      boolean bool3 = l1 < l2;
      if (bool3) {}
    }
    for (;;)
    {
      return bool2;
      localObject1 = new android/content/ContentValues;
      ((ContentValues)localObject1).<init>();
      localObject3 = b;
      ((ContentValues)localObject1).put("app_id", (String)localObject3);
      localObject3 = c;
      ((ContentValues)localObject1).put("origin", (String)localObject3);
      localObject3 = d.b;
      ((ContentValues)localObject1).put("name", (String)localObject3);
      localObject3 = d.a();
      a((ContentValues)localObject1, "value", localObject3);
      boolean bool4 = f;
      localObject3 = Boolean.valueOf(bool4);
      ((ContentValues)localObject1).put("active", (Boolean)localObject3);
      localObject3 = g;
      ((ContentValues)localObject1).put("trigger_event_name", (String)localObject3);
      localObject3 = Long.valueOf(i);
      ((ContentValues)localObject1).put("trigger_timeout", (Long)localObject3);
      q();
      localObject3 = dr.a(h);
      ((ContentValues)localObject1).put("timed_out_event", (byte[])localObject3);
      localObject3 = Long.valueOf(e);
      ((ContentValues)localObject1).put("creation_timestamp", (Long)localObject3);
      q();
      localObject3 = dr.a(j);
      ((ContentValues)localObject1).put("triggered_event", (byte[])localObject3);
      localObject3 = Long.valueOf(d.c);
      ((ContentValues)localObject1).put("triggered_timestamp", (Long)localObject3);
      l2 = k;
      localObject3 = Long.valueOf(l2);
      ((ContentValues)localObject1).put("time_to_live", (Long)localObject3);
      localObject2 = "expired_event";
      q();
      localObject3 = dr.a(l);
      ((ContentValues)localObject1).put((String)localObject2, (byte[])localObject3);
      try
      {
        localObject2 = L();
        localObject3 = "conditional_properties";
        localObject4 = null;
        int i = 5;
        l1 = ((SQLiteDatabase)localObject2).insertWithOnConflict((String)localObject3, null, (ContentValues)localObject1, i);
        l2 = -1;
        bool2 = l1 < l2;
        if (!bool2)
        {
          localObject1 = u();
          localObject1 = a;
          localObject2 = "Failed to insert/update conditional user property (got -1)";
          localObject3 = b;
          localObject3 = cu.a((String)localObject3);
          ((cu.a)localObject1).a((String)localObject2, localObject3);
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          localObject2 = ua;
          localObject3 = "Error storing conditional user property";
          localObject4 = cu.a(b);
          ((cu.a)localObject2).a((String)localObject3, localObject4, localSQLiteException);
        }
      }
      bool2 = bool1;
    }
  }
  
  public final boolean a(cj paramcj, long paramLong, boolean paramBoolean)
  {
    i = 1;
    bool1 = false;
    e();
    J();
    com.google.android.gms.common.internal.c.a(paramcj);
    com.google.android.gms.common.internal.c.a(a);
    Object localObject1 = new com/google/android/gms/b/du$b;
    ((du.b)localObject1).<init>();
    long l1 = e;
    Object localObject2 = Long.valueOf(l1);
    d = ((Long)localObject2);
    int j = f.a.size();
    localObject2 = new du.c[j];
    a = ((du.c[])localObject2);
    localObject2 = f;
    Object localObject4 = ((cl)localObject2).iterator();
    int m = 0;
    localObject5 = null;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject4).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (String)((Iterator)localObject4).next();
      du.c localc = new com/google/android/gms/b/du$c;
      localc.<init>();
      du.c[] arrayOfc = a;
      int n = m + 1;
      arrayOfc[m] = localc;
      a = ((String)localObject2);
      localObject2 = f.a((String)localObject2);
      localObject5 = q();
      ((dr)localObject5).a(localc, localObject2);
      m = n;
    }
    try
    {
      k = ((du.b)localObject1).f();
      localObject2 = new byte[k];
      m = localObject2.length;
      localObject5 = fu.a((byte[])localObject2, m);
      ((du.b)localObject1).a((fu)localObject5);
      ((fu)localObject5).a();
      localObject5 = ug;
      localObject1 = b;
      int i1 = localObject2.length;
      localObject4 = Integer.valueOf(i1);
      ((cu.a)localObject5).a("Saving event, name, data size", localObject1, localObject4);
      localObject5 = new android/content/ContentValues;
      ((ContentValues)localObject5).<init>();
      localObject1 = a;
      ((ContentValues)localObject5).put("app_id", (String)localObject1);
      localObject1 = b;
      ((ContentValues)localObject5).put("name", (String)localObject1);
      l2 = d;
      localObject1 = Long.valueOf(l2);
      ((ContentValues)localObject5).put("timestamp", (Long)localObject1);
      localObject1 = Long.valueOf(paramLong);
      ((ContentValues)localObject5).put("metadata_fingerprint", (Long)localObject1);
      ((ContentValues)localObject5).put("data", (byte[])localObject2);
      localObject6 = "realtime";
      if (!paramBoolean) {
        break label520;
      }
      k = i;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int k;
        long l2;
        localObject5 = ua;
        localObject6 = "Data loss. Failed to serialize event params/data. appId";
        localObject7 = cu.a(a);
        ((cu.a)localObject5).a((String)localObject6, localObject7, localIOException);
        continue;
        bool3 = false;
        localObject3 = null;
      }
    }
    localObject2 = Integer.valueOf(k);
    ((ContentValues)localObject5).put((String)localObject6, (Integer)localObject2);
    try
    {
      localObject2 = L();
      localObject6 = "raw_events";
      localObject1 = null;
      l1 = ((SQLiteDatabase)localObject2).insert((String)localObject6, null, (ContentValues)localObject5);
      l2 = -1;
      bool3 = l1 < l2;
      if (bool3) {
        break label568;
      }
      localObject2 = u();
      localObject2 = a;
      localObject5 = "Failed to insert raw event (got -1). appId";
      localObject6 = a;
      localObject6 = cu.a((String)localObject6);
      ((cu.a)localObject2).a((String)localObject5, localObject6);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        boolean bool3;
        Object localObject3;
        localObject5 = ua;
        localObject6 = "Error storing raw event. appId";
        Object localObject7 = cu.a(a);
        ((cu.a)localObject5).a((String)localObject6, localObject7, localSQLiteException);
        continue;
        bool1 = i;
      }
    }
    return bool1;
  }
  
  public final boolean a(dq paramdq)
  {
    long l1 = 25;
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    com.google.android.gms.common.internal.c.a(paramdq);
    e();
    J();
    localObject2 = a;
    localObject3 = c;
    localObject2 = c((String)localObject2, (String)localObject3);
    boolean bool3;
    long l2;
    if (localObject2 == null)
    {
      localObject2 = c;
      bool3 = dr.a((String)localObject2);
      if (bool3)
      {
        localObject2 = "select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'";
        localObject3 = new String[bool1];
        localObject4 = a;
        localObject3[0] = localObject4;
        l2 = a((String)localObject2, (String[])localObject3);
        cf.J();
        bool3 = l2 < l1;
        if (bool3) {
          break label188;
        }
      }
    }
    for (;;)
    {
      return bool2;
      localObject2 = "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'";
      int i = 2;
      localObject3 = new String[i];
      localObject4 = a;
      localObject3[0] = localObject4;
      localObject4 = b;
      localObject3[bool1] = localObject4;
      l2 = a((String)localObject2, (String[])localObject3);
      cf.L();
      bool3 = l2 < l1;
      label188:
      long l3;
      if (bool3)
      {
        localObject1 = new android/content/ContentValues;
        ((ContentValues)localObject1).<init>();
        localObject3 = a;
        ((ContentValues)localObject1).put("app_id", (String)localObject3);
        localObject3 = b;
        ((ContentValues)localObject1).put("origin", (String)localObject3);
        localObject3 = c;
        ((ContentValues)localObject1).put("name", (String)localObject3);
        l3 = d;
        localObject3 = Long.valueOf(l3);
        ((ContentValues)localObject1).put("triggered_timestamp", (Long)localObject3);
        localObject2 = "value";
        localObject3 = e;
        a((ContentValues)localObject1, (String)localObject2, localObject3);
      }
      try
      {
        localObject2 = L();
        localObject3 = "user_attributes";
        localObject4 = null;
        int j = 5;
        l2 = ((SQLiteDatabase)localObject2).insertWithOnConflict((String)localObject3, null, (ContentValues)localObject1, j);
        l3 = -1;
        bool2 = l2 < l3;
        if (!bool2)
        {
          localObject1 = u();
          localObject1 = a;
          localObject2 = "Failed to insert/update user property (got -1). appId";
          localObject3 = a;
          localObject3 = cu.a((String)localObject3);
          ((cu.a)localObject1).a((String)localObject2, localObject3);
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          localObject2 = ua;
          localObject3 = "Error storing user property. appId";
          localObject4 = cu.a(a);
          ((cu.a)localObject2).a((String)localObject3, localObject4, localSQLiteException);
        }
      }
      bool2 = bool1;
    }
  }
  
  public final boolean a(du.e parame, boolean paramBoolean)
  {
    i = 1;
    bool1 = false;
    e();
    J();
    com.google.android.gms.common.internal.c.a(parame);
    com.google.android.gms.common.internal.c.a(o);
    com.google.android.gms.common.internal.c.a(f);
    B();
    long l1 = m().a();
    Object localObject1 = f;
    long l2 = ((Long)localObject1).longValue();
    long l3 = cf.aa();
    l3 = l1 - l3;
    boolean bool2 = l2 < l3;
    Object localObject6;
    if (!bool2)
    {
      localObject1 = f;
      l2 = ((Long)localObject1).longValue();
      l3 = cf.aa() + l1;
      bool2 = l2 < l3;
      if (!bool2) {}
    }
    else
    {
      localObject1 = uc;
      localObject3 = "Storing bundle outside of the max uploading time span. appId, now, timestamp";
      Object localObject4 = cu.a(o);
      localObject5 = Long.valueOf(l1);
      localObject6 = f;
      ((cu.a)localObject1).a((String)localObject3, localObject4, localObject5, localObject6);
    }
    try
    {
      j = parame.f();
      localObject1 = new byte[j];
      int k = localObject1.length;
      localObject3 = fu.a((byte[])localObject1, k);
      parame.a((fu)localObject3);
      ((fu)localObject3).a();
      localObject3 = q();
      localObject1 = ((dr)localObject3).a((byte[])localObject1);
      localObject3 = ug;
      m = localObject1.length;
      localObject6 = Integer.valueOf(m);
      ((cu.a)localObject3).a("Saving bundle, size", localObject6);
      localObject3 = new android/content/ContentValues;
      ((ContentValues)localObject3).<init>();
      localObject6 = o;
      ((ContentValues)localObject3).put("app_id", (String)localObject6);
      localObject6 = f;
      ((ContentValues)localObject3).put("bundle_end_timestamp", (Long)localObject6);
      ((ContentValues)localObject3).put("data", (byte[])localObject1);
      localObject5 = "has_realtime";
      if (!paramBoolean) {
        break label457;
      }
      j = i;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int j;
        int m;
        localObject7 = ua;
        localObject3 = "Data loss. Failed to serialize bundle. appId";
        localObject5 = cu.a(o);
        ((cu.a)localObject7).a((String)localObject3, localObject5, localIOException);
        continue;
        bool3 = false;
        localObject2 = null;
      }
    }
    localObject1 = Integer.valueOf(j);
    ((ContentValues)localObject3).put((String)localObject5, (Integer)localObject1);
    try
    {
      localObject1 = L();
      localObject5 = "queue";
      m = 0;
      localObject6 = null;
      l1 = ((SQLiteDatabase)localObject1).insert((String)localObject5, null, (ContentValues)localObject3);
      l2 = -1;
      bool3 = l1 < l2;
      if (bool3) {
        break label505;
      }
      localObject1 = u();
      localObject1 = a;
      localObject7 = "Failed to insert bundle (got -1). appId";
      localObject3 = o;
      localObject3 = cu.a((String)localObject3);
      ((cu.a)localObject1).a((String)localObject7, localObject3);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        boolean bool3;
        Object localObject2;
        Object localObject7 = ua;
        localObject3 = "Error storing bundle. appId";
        localObject5 = cu.a(o);
        ((cu.a)localObject7).a((String)localObject3, localObject5, localSQLiteException);
        continue;
        bool1 = i;
      }
    }
    return bool1;
  }
  
  /* Error */
  public final bz b(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_1
    //   3: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   6: pop
    //   7: aload_0
    //   8: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   11: aload_0
    //   12: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   15: aload_0
    //   16: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   19: astore_3
    //   20: ldc_w 798
    //   23: astore 4
    //   25: bipush 23
    //   27: istore 5
    //   29: iload 5
    //   31: anewarray 255	java/lang/String
    //   34: astore 6
    //   36: iconst_0
    //   37: istore 7
    //   39: aconst_null
    //   40: astore 8
    //   42: ldc_w 924
    //   45: astore 9
    //   47: aload 6
    //   49: iconst_0
    //   50: aload 9
    //   52: aastore
    //   53: iconst_1
    //   54: istore 7
    //   56: ldc_w 928
    //   59: astore 9
    //   61: aload 6
    //   63: iload 7
    //   65: aload 9
    //   67: aastore
    //   68: iconst_2
    //   69: istore 7
    //   71: ldc_w 932
    //   74: astore 9
    //   76: aload 6
    //   78: iload 7
    //   80: aload 9
    //   82: aastore
    //   83: iconst_3
    //   84: istore 7
    //   86: ldc_w 936
    //   89: astore 9
    //   91: aload 6
    //   93: iload 7
    //   95: aload 9
    //   97: aastore
    //   98: iconst_4
    //   99: istore 7
    //   101: ldc 58
    //   103: astore 9
    //   105: aload 6
    //   107: iload 7
    //   109: aload 9
    //   111: aastore
    //   112: iconst_5
    //   113: istore 7
    //   115: ldc_w 942
    //   118: astore 9
    //   120: aload 6
    //   122: iload 7
    //   124: aload 9
    //   126: aastore
    //   127: bipush 6
    //   129: istore 7
    //   131: ldc 38
    //   133: astore 9
    //   135: aload 6
    //   137: iload 7
    //   139: aload 9
    //   141: aastore
    //   142: bipush 7
    //   144: istore 7
    //   146: ldc 42
    //   148: astore 9
    //   150: aload 6
    //   152: iload 7
    //   154: aload 9
    //   156: aastore
    //   157: bipush 8
    //   159: istore 7
    //   161: ldc 46
    //   163: astore 9
    //   165: aload 6
    //   167: iload 7
    //   169: aload 9
    //   171: aastore
    //   172: bipush 9
    //   174: istore 7
    //   176: ldc 50
    //   178: astore 9
    //   180: aload 6
    //   182: iload 7
    //   184: aload 9
    //   186: aastore
    //   187: bipush 10
    //   189: istore 7
    //   191: ldc 54
    //   193: astore 9
    //   195: aload 6
    //   197: iload 7
    //   199: aload 9
    //   201: aastore
    //   202: bipush 11
    //   204: istore 7
    //   206: ldc 62
    //   208: astore 9
    //   210: aload 6
    //   212: iload 7
    //   214: aload 9
    //   216: aastore
    //   217: bipush 12
    //   219: istore 7
    //   221: ldc 66
    //   223: astore 9
    //   225: aload 6
    //   227: iload 7
    //   229: aload 9
    //   231: aastore
    //   232: bipush 13
    //   234: istore 7
    //   236: ldc 70
    //   238: astore 9
    //   240: aload 6
    //   242: iload 7
    //   244: aload 9
    //   246: aastore
    //   247: bipush 14
    //   249: istore 7
    //   251: ldc 74
    //   253: astore 9
    //   255: aload 6
    //   257: iload 7
    //   259: aload 9
    //   261: aastore
    //   262: bipush 15
    //   264: istore 7
    //   266: ldc 82
    //   268: astore 9
    //   270: aload 6
    //   272: iload 7
    //   274: aload 9
    //   276: aastore
    //   277: bipush 16
    //   279: istore 7
    //   281: ldc 86
    //   283: astore 9
    //   285: aload 6
    //   287: iload 7
    //   289: aload 9
    //   291: aastore
    //   292: bipush 17
    //   294: istore 7
    //   296: ldc 90
    //   298: astore 9
    //   300: aload 6
    //   302: iload 7
    //   304: aload 9
    //   306: aastore
    //   307: bipush 18
    //   309: istore 7
    //   311: ldc 94
    //   313: astore 9
    //   315: aload 6
    //   317: iload 7
    //   319: aload 9
    //   321: aastore
    //   322: bipush 19
    //   324: istore 7
    //   326: ldc 98
    //   328: astore 9
    //   330: aload 6
    //   332: iload 7
    //   334: aload 9
    //   336: aastore
    //   337: bipush 20
    //   339: istore 7
    //   341: ldc 102
    //   343: astore 9
    //   345: aload 6
    //   347: iload 7
    //   349: aload 9
    //   351: aastore
    //   352: bipush 21
    //   354: istore 7
    //   356: ldc 106
    //   358: astore 9
    //   360: aload 6
    //   362: iload 7
    //   364: aload 9
    //   366: aastore
    //   367: bipush 22
    //   369: istore 7
    //   371: ldc 110
    //   373: astore 9
    //   375: aload 6
    //   377: iload 7
    //   379: aload 9
    //   381: aastore
    //   382: ldc_w 800
    //   385: astore 8
    //   387: iconst_1
    //   388: istore 10
    //   390: iload 10
    //   392: anewarray 255	java/lang/String
    //   395: astore 9
    //   397: aload 9
    //   399: iconst_0
    //   400: aload_1
    //   401: aastore
    //   402: aload_3
    //   403: aload 4
    //   405: aload 6
    //   407: aload 8
    //   409: aload 9
    //   411: aconst_null
    //   412: aconst_null
    //   413: aconst_null
    //   414: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   417: astore 4
    //   419: aload 4
    //   421: invokeinterface 426 1 0
    //   426: istore 11
    //   428: iload 11
    //   430: ifne +22 -> 452
    //   433: aload 4
    //   435: ifnull +10 -> 445
    //   438: aload 4
    //   440: invokeinterface 295 1 0
    //   445: iconst_0
    //   446: istore 11
    //   448: aconst_null
    //   449: astore_3
    //   450: aload_3
    //   451: areturn
    //   452: new 920	com/google/android/gms/b/bz
    //   455: astore_3
    //   456: aload_0
    //   457: getfield 1269	com/google/android/gms/b/cg:q	Lcom/google/android/gms/b/dc;
    //   460: astore 6
    //   462: aload_3
    //   463: aload 6
    //   465: aload_1
    //   466: invokespecial 1272	com/google/android/gms/b/bz:<init>	(Lcom/google/android/gms/b/dc;Ljava/lang/String;)V
    //   469: iconst_0
    //   470: istore 5
    //   472: aconst_null
    //   473: astore 6
    //   475: aload 4
    //   477: iconst_0
    //   478: invokeinterface 247 2 0
    //   483: astore 6
    //   485: aload_3
    //   486: aload 6
    //   488: invokevirtual 1273	com/google/android/gms/b/bz:a	(Ljava/lang/String;)V
    //   491: iconst_1
    //   492: istore 5
    //   494: aload 4
    //   496: iload 5
    //   498: invokeinterface 247 2 0
    //   503: astore 6
    //   505: aload_3
    //   506: aload 6
    //   508: invokevirtual 1275	com/google/android/gms/b/bz:b	(Ljava/lang/String;)V
    //   511: iconst_2
    //   512: istore 5
    //   514: aload 4
    //   516: iload 5
    //   518: invokeinterface 247 2 0
    //   523: astore 6
    //   525: aload_3
    //   526: aload 6
    //   528: invokevirtual 1277	com/google/android/gms/b/bz:c	(Ljava/lang/String;)V
    //   531: iconst_3
    //   532: istore 5
    //   534: aload 4
    //   536: iload 5
    //   538: invokeinterface 229 2 0
    //   543: lstore 12
    //   545: aload_3
    //   546: lload 12
    //   548: invokevirtual 1279	com/google/android/gms/b/bz:f	(J)V
    //   551: iconst_4
    //   552: istore 5
    //   554: aload 4
    //   556: iload 5
    //   558: invokeinterface 229 2 0
    //   563: lstore 12
    //   565: aload_3
    //   566: lload 12
    //   568: invokevirtual 1280	com/google/android/gms/b/bz:a	(J)V
    //   571: iconst_5
    //   572: istore 5
    //   574: aload 4
    //   576: iload 5
    //   578: invokeinterface 229 2 0
    //   583: lstore 12
    //   585: aload_3
    //   586: lload 12
    //   588: invokevirtual 1282	com/google/android/gms/b/bz:b	(J)V
    //   591: bipush 6
    //   593: istore 5
    //   595: aload 4
    //   597: iload 5
    //   599: invokeinterface 247 2 0
    //   604: astore 6
    //   606: aload_3
    //   607: aload 6
    //   609: invokevirtual 1284	com/google/android/gms/b/bz:e	(Ljava/lang/String;)V
    //   612: bipush 7
    //   614: istore 5
    //   616: aload 4
    //   618: iload 5
    //   620: invokeinterface 247 2 0
    //   625: astore 6
    //   627: aload_3
    //   628: aload 6
    //   630: invokevirtual 1286	com/google/android/gms/b/bz:f	(Ljava/lang/String;)V
    //   633: bipush 8
    //   635: istore 5
    //   637: aload 4
    //   639: iload 5
    //   641: invokeinterface 229 2 0
    //   646: lstore 12
    //   648: aload_3
    //   649: lload 12
    //   651: invokevirtual 1288	com/google/android/gms/b/bz:d	(J)V
    //   654: bipush 9
    //   656: istore 5
    //   658: aload 4
    //   660: iload 5
    //   662: invokeinterface 229 2 0
    //   667: lstore 12
    //   669: aload_3
    //   670: lload 12
    //   672: invokevirtual 1290	com/google/android/gms/b/bz:e	(J)V
    //   675: bipush 10
    //   677: istore 5
    //   679: aload 4
    //   681: iload 5
    //   683: invokeinterface 1294 2 0
    //   688: istore 5
    //   690: iload 5
    //   692: ifeq +729 -> 1421
    //   695: iload_2
    //   696: istore 5
    //   698: iload 5
    //   700: ifeq +739 -> 1439
    //   703: iload_2
    //   704: istore 5
    //   706: aload_3
    //   707: iload 5
    //   709: invokevirtual 1296	com/google/android/gms/b/bz:a	(Z)V
    //   712: bipush 11
    //   714: istore 5
    //   716: aload 4
    //   718: iload 5
    //   720: invokeinterface 229 2 0
    //   725: lstore 14
    //   727: aload_3
    //   728: getfield 969	com/google/android/gms/b/bz:a	Lcom/google/android/gms/b/dc;
    //   731: astore 6
    //   733: aload 6
    //   735: invokevirtual 974	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   738: astore 6
    //   740: aload 6
    //   742: invokevirtual 977	com/google/android/gms/b/db:e	()V
    //   745: aload_3
    //   746: getfield 1298	com/google/android/gms/b/bz:i	Z
    //   749: istore 7
    //   751: aload_3
    //   752: getfield 978	com/google/android/gms/b/bz:b	J
    //   755: lstore 16
    //   757: lload 16
    //   759: lload 14
    //   761: lcmp
    //   762: istore 5
    //   764: iload 5
    //   766: ifeq +682 -> 1448
    //   769: iload_2
    //   770: istore 5
    //   772: iload 5
    //   774: iload 7
    //   776: ior
    //   777: istore 5
    //   779: aload_3
    //   780: iload 5
    //   782: putfield 1298	com/google/android/gms/b/bz:i	Z
    //   785: aload_3
    //   786: lload 14
    //   788: putfield 978	com/google/android/gms/b/bz:b	J
    //   791: bipush 12
    //   793: istore 5
    //   795: aload 4
    //   797: iload 5
    //   799: invokeinterface 229 2 0
    //   804: lstore 14
    //   806: aload_3
    //   807: getfield 969	com/google/android/gms/b/bz:a	Lcom/google/android/gms/b/dc;
    //   810: astore 6
    //   812: aload 6
    //   814: invokevirtual 974	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   817: astore 6
    //   819: aload 6
    //   821: invokevirtual 977	com/google/android/gms/b/db:e	()V
    //   824: aload_3
    //   825: getfield 1298	com/google/android/gms/b/bz:i	Z
    //   828: istore 7
    //   830: aload_3
    //   831: getfield 979	com/google/android/gms/b/bz:c	J
    //   834: lstore 16
    //   836: lload 16
    //   838: lload 14
    //   840: lcmp
    //   841: istore 5
    //   843: iload 5
    //   845: ifeq +612 -> 1457
    //   848: iload_2
    //   849: istore 5
    //   851: iload 5
    //   853: iload 7
    //   855: ior
    //   856: istore 5
    //   858: aload_3
    //   859: iload 5
    //   861: putfield 1298	com/google/android/gms/b/bz:i	Z
    //   864: aload_3
    //   865: lload 14
    //   867: putfield 979	com/google/android/gms/b/bz:c	J
    //   870: bipush 13
    //   872: istore 5
    //   874: aload 4
    //   876: iload 5
    //   878: invokeinterface 229 2 0
    //   883: lstore 14
    //   885: aload_3
    //   886: getfield 969	com/google/android/gms/b/bz:a	Lcom/google/android/gms/b/dc;
    //   889: astore 6
    //   891: aload 6
    //   893: invokevirtual 974	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   896: astore 6
    //   898: aload 6
    //   900: invokevirtual 977	com/google/android/gms/b/db:e	()V
    //   903: aload_3
    //   904: getfield 1298	com/google/android/gms/b/bz:i	Z
    //   907: istore 7
    //   909: aload_3
    //   910: getfield 980	com/google/android/gms/b/bz:d	J
    //   913: lstore 16
    //   915: lload 16
    //   917: lload 14
    //   919: lcmp
    //   920: istore 5
    //   922: iload 5
    //   924: ifeq +542 -> 1466
    //   927: iload_2
    //   928: istore 5
    //   930: iload 5
    //   932: iload 7
    //   934: ior
    //   935: istore 5
    //   937: aload_3
    //   938: iload 5
    //   940: putfield 1298	com/google/android/gms/b/bz:i	Z
    //   943: aload_3
    //   944: lload 14
    //   946: putfield 980	com/google/android/gms/b/bz:d	J
    //   949: bipush 14
    //   951: istore 5
    //   953: aload 4
    //   955: iload 5
    //   957: invokeinterface 229 2 0
    //   962: lstore 14
    //   964: aload_3
    //   965: getfield 969	com/google/android/gms/b/bz:a	Lcom/google/android/gms/b/dc;
    //   968: astore 6
    //   970: aload 6
    //   972: invokevirtual 974	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   975: astore 6
    //   977: aload 6
    //   979: invokevirtual 977	com/google/android/gms/b/db:e	()V
    //   982: aload_3
    //   983: getfield 1298	com/google/android/gms/b/bz:i	Z
    //   986: istore 7
    //   988: aload_3
    //   989: getfield 981	com/google/android/gms/b/bz:e	J
    //   992: lstore 16
    //   994: lload 16
    //   996: lload 14
    //   998: lcmp
    //   999: istore 5
    //   1001: iload 5
    //   1003: ifeq +472 -> 1475
    //   1006: iload_2
    //   1007: istore 5
    //   1009: iload 5
    //   1011: iload 7
    //   1013: ior
    //   1014: istore 5
    //   1016: aload_3
    //   1017: iload 5
    //   1019: putfield 1298	com/google/android/gms/b/bz:i	Z
    //   1022: aload_3
    //   1023: lload 14
    //   1025: putfield 981	com/google/android/gms/b/bz:e	J
    //   1028: bipush 15
    //   1030: istore 5
    //   1032: aload 4
    //   1034: iload 5
    //   1036: invokeinterface 229 2 0
    //   1041: lstore 12
    //   1043: aload_3
    //   1044: lload 12
    //   1046: invokevirtual 1300	com/google/android/gms/b/bz:g	(J)V
    //   1049: bipush 16
    //   1051: istore 5
    //   1053: aload 4
    //   1055: iload 5
    //   1057: invokeinterface 229 2 0
    //   1062: lstore 12
    //   1064: aload_3
    //   1065: lload 12
    //   1067: invokevirtual 1302	com/google/android/gms/b/bz:h	(J)V
    //   1070: bipush 17
    //   1072: istore 5
    //   1074: aload 4
    //   1076: iload 5
    //   1078: invokeinterface 1294 2 0
    //   1083: istore 5
    //   1085: iload 5
    //   1087: ifeq +397 -> 1484
    //   1090: ldc2_w 1303
    //   1093: lstore 12
    //   1095: aload_3
    //   1096: lload 12
    //   1098: invokevirtual 1308	com/google/android/gms/b/bz:c	(J)V
    //   1101: bipush 18
    //   1103: istore 5
    //   1105: aload 4
    //   1107: iload 5
    //   1109: invokeinterface 247 2 0
    //   1114: astore 6
    //   1116: aload_3
    //   1117: aload 6
    //   1119: invokevirtual 1310	com/google/android/gms/b/bz:d	(Ljava/lang/String;)V
    //   1122: bipush 19
    //   1124: istore 5
    //   1126: aload 4
    //   1128: iload 5
    //   1130: invokeinterface 229 2 0
    //   1135: lstore 14
    //   1137: aload_3
    //   1138: getfield 969	com/google/android/gms/b/bz:a	Lcom/google/android/gms/b/dc;
    //   1141: astore 6
    //   1143: aload 6
    //   1145: invokevirtual 974	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   1148: astore 6
    //   1150: aload 6
    //   1152: invokevirtual 977	com/google/android/gms/b/db:e	()V
    //   1155: aload_3
    //   1156: getfield 1298	com/google/android/gms/b/bz:i	Z
    //   1159: istore 7
    //   1161: aload_3
    //   1162: getfield 993	com/google/android/gms/b/bz:f	J
    //   1165: lstore 16
    //   1167: lload 16
    //   1169: lload 14
    //   1171: lcmp
    //   1172: istore 5
    //   1174: iload 5
    //   1176: ifeq +331 -> 1507
    //   1179: iload_2
    //   1180: istore 5
    //   1182: iload 5
    //   1184: iload 7
    //   1186: ior
    //   1187: istore 5
    //   1189: aload_3
    //   1190: iload 5
    //   1192: putfield 1298	com/google/android/gms/b/bz:i	Z
    //   1195: aload_3
    //   1196: lload 14
    //   1198: putfield 993	com/google/android/gms/b/bz:f	J
    //   1201: bipush 20
    //   1203: istore 5
    //   1205: aload 4
    //   1207: iload 5
    //   1209: invokeinterface 229 2 0
    //   1214: lstore 14
    //   1216: aload_3
    //   1217: getfield 969	com/google/android/gms/b/bz:a	Lcom/google/android/gms/b/dc;
    //   1220: astore 6
    //   1222: aload 6
    //   1224: invokevirtual 974	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   1227: astore 6
    //   1229: aload 6
    //   1231: invokevirtual 977	com/google/android/gms/b/db:e	()V
    //   1234: aload_3
    //   1235: getfield 1298	com/google/android/gms/b/bz:i	Z
    //   1238: istore 7
    //   1240: aload_3
    //   1241: getfield 995	com/google/android/gms/b/bz:g	J
    //   1244: lstore 16
    //   1246: lload 16
    //   1248: lload 14
    //   1250: lcmp
    //   1251: istore 5
    //   1253: iload 5
    //   1255: ifeq +261 -> 1516
    //   1258: iload_2
    //   1259: istore 5
    //   1261: iload 5
    //   1263: iload 7
    //   1265: ior
    //   1266: istore 5
    //   1268: aload_3
    //   1269: iload 5
    //   1271: putfield 1298	com/google/android/gms/b/bz:i	Z
    //   1274: aload_3
    //   1275: lload 14
    //   1277: putfield 995	com/google/android/gms/b/bz:g	J
    //   1280: bipush 21
    //   1282: istore 5
    //   1284: aload 4
    //   1286: iload 5
    //   1288: invokeinterface 247 2 0
    //   1293: astore 6
    //   1295: aload_3
    //   1296: aload 6
    //   1298: invokevirtual 1312	com/google/android/gms/b/bz:g	(Ljava/lang/String;)V
    //   1301: bipush 22
    //   1303: istore 5
    //   1305: aload 4
    //   1307: iload 5
    //   1309: invokeinterface 1294 2 0
    //   1314: istore 5
    //   1316: iload 5
    //   1318: ifeq +207 -> 1525
    //   1321: lconst_0
    //   1322: lstore 12
    //   1324: aload_3
    //   1325: lload 12
    //   1327: invokevirtual 1314	com/google/android/gms/b/bz:i	(J)V
    //   1330: aload_3
    //   1331: getfield 969	com/google/android/gms/b/bz:a	Lcom/google/android/gms/b/dc;
    //   1334: astore 6
    //   1336: aload 6
    //   1338: invokevirtual 974	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   1341: astore 6
    //   1343: aload 6
    //   1345: invokevirtual 977	com/google/android/gms/b/db:e	()V
    //   1348: iconst_0
    //   1349: istore 5
    //   1351: aconst_null
    //   1352: astore 6
    //   1354: aload_3
    //   1355: iconst_0
    //   1356: putfield 1298	com/google/android/gms/b/bz:i	Z
    //   1359: aload 4
    //   1361: invokeinterface 661 1 0
    //   1366: istore 5
    //   1368: iload 5
    //   1370: ifeq +36 -> 1406
    //   1373: aload_0
    //   1374: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   1377: astore 6
    //   1379: aload 6
    //   1381: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   1384: astore 6
    //   1386: ldc_w 1316
    //   1389: astore 8
    //   1391: aload_1
    //   1392: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1395: astore 9
    //   1397: aload 6
    //   1399: aload 8
    //   1401: aload 9
    //   1403: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1406: aload 4
    //   1408: ifnull -958 -> 450
    //   1411: aload 4
    //   1413: invokeinterface 295 1 0
    //   1418: goto -968 -> 450
    //   1421: bipush 10
    //   1423: istore 5
    //   1425: aload 4
    //   1427: iload 5
    //   1429: invokeinterface 629 2 0
    //   1434: istore 5
    //   1436: goto -738 -> 698
    //   1439: iconst_0
    //   1440: istore 5
    //   1442: aconst_null
    //   1443: astore 6
    //   1445: goto -739 -> 706
    //   1448: iconst_0
    //   1449: istore 5
    //   1451: aconst_null
    //   1452: astore 6
    //   1454: goto -682 -> 772
    //   1457: iconst_0
    //   1458: istore 5
    //   1460: aconst_null
    //   1461: astore 6
    //   1463: goto -612 -> 851
    //   1466: iconst_0
    //   1467: istore 5
    //   1469: aconst_null
    //   1470: astore 6
    //   1472: goto -542 -> 930
    //   1475: iconst_0
    //   1476: istore 5
    //   1478: aconst_null
    //   1479: astore 6
    //   1481: goto -472 -> 1009
    //   1484: bipush 17
    //   1486: istore 5
    //   1488: aload 4
    //   1490: iload 5
    //   1492: invokeinterface 629 2 0
    //   1497: istore 5
    //   1499: iload 5
    //   1501: i2l
    //   1502: lstore 12
    //   1504: goto -409 -> 1095
    //   1507: iconst_0
    //   1508: istore 5
    //   1510: aconst_null
    //   1511: astore 6
    //   1513: goto -331 -> 1182
    //   1516: iconst_0
    //   1517: istore 5
    //   1519: aconst_null
    //   1520: astore 6
    //   1522: goto -261 -> 1261
    //   1525: bipush 22
    //   1527: istore 5
    //   1529: aload 4
    //   1531: iload 5
    //   1533: invokeinterface 229 2 0
    //   1538: lstore 12
    //   1540: goto -216 -> 1324
    //   1543: astore_3
    //   1544: aconst_null
    //   1545: astore 4
    //   1547: aload_0
    //   1548: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   1551: astore 6
    //   1553: aload 6
    //   1555: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   1558: astore 6
    //   1560: ldc_w 1318
    //   1563: astore 8
    //   1565: aload_1
    //   1566: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1569: astore 9
    //   1571: aload 6
    //   1573: aload 8
    //   1575: aload 9
    //   1577: aload_3
    //   1578: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1581: aload 4
    //   1583: ifnull +10 -> 1593
    //   1586: aload 4
    //   1588: invokeinterface 295 1 0
    //   1593: iconst_0
    //   1594: istore 11
    //   1596: aconst_null
    //   1597: astore_3
    //   1598: goto -1148 -> 450
    //   1601: astore_3
    //   1602: aconst_null
    //   1603: astore 4
    //   1605: aload 4
    //   1607: ifnull +10 -> 1617
    //   1610: aload 4
    //   1612: invokeinterface 295 1 0
    //   1617: aload_3
    //   1618: athrow
    //   1619: astore_3
    //   1620: goto -15 -> 1605
    //   1623: astore_3
    //   1624: goto -77 -> 1547
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1627	0	this	cg
    //   0	1627	1	paramString	String
    //   1	1258	2	bool1	boolean
    //   19	1336	3	localObject1	Object
    //   1543	35	3	localSQLiteException1	SQLiteException
    //   1597	1	3	localObject2	Object
    //   1601	17	3	localObject3	Object
    //   1619	1	3	localObject4	Object
    //   1623	1	3	localSQLiteException2	SQLiteException
    //   23	1588	4	localObject5	Object
    //   27	655	5	i	int
    //   688	20	5	bool2	boolean
    //   714	5	5	j	int
    //   762	19	5	bool3	boolean
    //   793	5	5	k	int
    //   841	19	5	bool4	boolean
    //   872	5	5	m	int
    //   920	19	5	bool5	boolean
    //   951	5	5	n	int
    //   999	19	5	bool6	boolean
    //   1030	47	5	i1	int
    //   1083	3	5	bool7	boolean
    //   1103	26	5	i2	int
    //   1172	19	5	bool8	boolean
    //   1203	5	5	i3	int
    //   1251	19	5	bool9	boolean
    //   1282	26	5	i4	int
    //   1314	55	5	bool10	boolean
    //   1423	109	5	i5	int
    //   34	1538	6	localObject6	Object
    //   37	341	7	i6	int
    //   749	517	7	bool11	boolean
    //   40	1534	8	str	String
    //   45	1531	9	localObject7	Object
    //   388	3	10	i7	int
    //   426	1169	11	bool12	boolean
    //   543	996	12	l1	long
    //   725	551	14	l2	long
    //   755	492	16	l3	long
    // Exception table:
    //   from	to	target	type
    //   15	19	1543	android/database/sqlite/SQLiteException
    //   29	34	1543	android/database/sqlite/SQLiteException
    //   50	53	1543	android/database/sqlite/SQLiteException
    //   65	68	1543	android/database/sqlite/SQLiteException
    //   80	83	1543	android/database/sqlite/SQLiteException
    //   95	98	1543	android/database/sqlite/SQLiteException
    //   109	112	1543	android/database/sqlite/SQLiteException
    //   124	127	1543	android/database/sqlite/SQLiteException
    //   139	142	1543	android/database/sqlite/SQLiteException
    //   154	157	1543	android/database/sqlite/SQLiteException
    //   169	172	1543	android/database/sqlite/SQLiteException
    //   184	187	1543	android/database/sqlite/SQLiteException
    //   199	202	1543	android/database/sqlite/SQLiteException
    //   214	217	1543	android/database/sqlite/SQLiteException
    //   229	232	1543	android/database/sqlite/SQLiteException
    //   244	247	1543	android/database/sqlite/SQLiteException
    //   259	262	1543	android/database/sqlite/SQLiteException
    //   274	277	1543	android/database/sqlite/SQLiteException
    //   289	292	1543	android/database/sqlite/SQLiteException
    //   304	307	1543	android/database/sqlite/SQLiteException
    //   319	322	1543	android/database/sqlite/SQLiteException
    //   334	337	1543	android/database/sqlite/SQLiteException
    //   349	352	1543	android/database/sqlite/SQLiteException
    //   364	367	1543	android/database/sqlite/SQLiteException
    //   379	382	1543	android/database/sqlite/SQLiteException
    //   390	395	1543	android/database/sqlite/SQLiteException
    //   400	402	1543	android/database/sqlite/SQLiteException
    //   413	417	1543	android/database/sqlite/SQLiteException
    //   15	19	1601	finally
    //   29	34	1601	finally
    //   50	53	1601	finally
    //   65	68	1601	finally
    //   80	83	1601	finally
    //   95	98	1601	finally
    //   109	112	1601	finally
    //   124	127	1601	finally
    //   139	142	1601	finally
    //   154	157	1601	finally
    //   169	172	1601	finally
    //   184	187	1601	finally
    //   199	202	1601	finally
    //   214	217	1601	finally
    //   229	232	1601	finally
    //   244	247	1601	finally
    //   259	262	1601	finally
    //   274	277	1601	finally
    //   289	292	1601	finally
    //   304	307	1601	finally
    //   319	322	1601	finally
    //   334	337	1601	finally
    //   349	352	1601	finally
    //   364	367	1601	finally
    //   379	382	1601	finally
    //   390	395	1601	finally
    //   400	402	1601	finally
    //   413	417	1601	finally
    //   419	426	1619	finally
    //   452	455	1619	finally
    //   456	460	1619	finally
    //   465	469	1619	finally
    //   477	483	1619	finally
    //   486	491	1619	finally
    //   496	503	1619	finally
    //   506	511	1619	finally
    //   516	523	1619	finally
    //   526	531	1619	finally
    //   536	543	1619	finally
    //   546	551	1619	finally
    //   556	563	1619	finally
    //   566	571	1619	finally
    //   576	583	1619	finally
    //   586	591	1619	finally
    //   597	604	1619	finally
    //   607	612	1619	finally
    //   618	625	1619	finally
    //   628	633	1619	finally
    //   639	646	1619	finally
    //   649	654	1619	finally
    //   660	667	1619	finally
    //   670	675	1619	finally
    //   681	688	1619	finally
    //   707	712	1619	finally
    //   718	725	1619	finally
    //   727	731	1619	finally
    //   733	738	1619	finally
    //   740	745	1619	finally
    //   745	749	1619	finally
    //   751	755	1619	finally
    //   780	785	1619	finally
    //   786	791	1619	finally
    //   797	804	1619	finally
    //   806	810	1619	finally
    //   812	817	1619	finally
    //   819	824	1619	finally
    //   824	828	1619	finally
    //   830	834	1619	finally
    //   859	864	1619	finally
    //   865	870	1619	finally
    //   876	883	1619	finally
    //   885	889	1619	finally
    //   891	896	1619	finally
    //   898	903	1619	finally
    //   903	907	1619	finally
    //   909	913	1619	finally
    //   938	943	1619	finally
    //   944	949	1619	finally
    //   955	962	1619	finally
    //   964	968	1619	finally
    //   970	975	1619	finally
    //   977	982	1619	finally
    //   982	986	1619	finally
    //   988	992	1619	finally
    //   1017	1022	1619	finally
    //   1023	1028	1619	finally
    //   1034	1041	1619	finally
    //   1044	1049	1619	finally
    //   1055	1062	1619	finally
    //   1065	1070	1619	finally
    //   1076	1083	1619	finally
    //   1096	1101	1619	finally
    //   1107	1114	1619	finally
    //   1117	1122	1619	finally
    //   1128	1135	1619	finally
    //   1137	1141	1619	finally
    //   1143	1148	1619	finally
    //   1150	1155	1619	finally
    //   1155	1159	1619	finally
    //   1161	1165	1619	finally
    //   1190	1195	1619	finally
    //   1196	1201	1619	finally
    //   1207	1214	1619	finally
    //   1216	1220	1619	finally
    //   1222	1227	1619	finally
    //   1229	1234	1619	finally
    //   1234	1238	1619	finally
    //   1240	1244	1619	finally
    //   1269	1274	1619	finally
    //   1275	1280	1619	finally
    //   1286	1293	1619	finally
    //   1296	1301	1619	finally
    //   1307	1314	1619	finally
    //   1325	1330	1619	finally
    //   1330	1334	1619	finally
    //   1336	1341	1619	finally
    //   1343	1348	1619	finally
    //   1355	1359	1619	finally
    //   1359	1366	1619	finally
    //   1373	1377	1619	finally
    //   1379	1384	1619	finally
    //   1391	1395	1619	finally
    //   1401	1406	1619	finally
    //   1427	1434	1619	finally
    //   1490	1497	1619	finally
    //   1531	1538	1619	finally
    //   1547	1551	1619	finally
    //   1553	1558	1619	finally
    //   1565	1569	1619	finally
    //   1577	1581	1619	finally
    //   419	426	1623	android/database/sqlite/SQLiteException
    //   452	455	1623	android/database/sqlite/SQLiteException
    //   456	460	1623	android/database/sqlite/SQLiteException
    //   465	469	1623	android/database/sqlite/SQLiteException
    //   477	483	1623	android/database/sqlite/SQLiteException
    //   486	491	1623	android/database/sqlite/SQLiteException
    //   496	503	1623	android/database/sqlite/SQLiteException
    //   506	511	1623	android/database/sqlite/SQLiteException
    //   516	523	1623	android/database/sqlite/SQLiteException
    //   526	531	1623	android/database/sqlite/SQLiteException
    //   536	543	1623	android/database/sqlite/SQLiteException
    //   546	551	1623	android/database/sqlite/SQLiteException
    //   556	563	1623	android/database/sqlite/SQLiteException
    //   566	571	1623	android/database/sqlite/SQLiteException
    //   576	583	1623	android/database/sqlite/SQLiteException
    //   586	591	1623	android/database/sqlite/SQLiteException
    //   597	604	1623	android/database/sqlite/SQLiteException
    //   607	612	1623	android/database/sqlite/SQLiteException
    //   618	625	1623	android/database/sqlite/SQLiteException
    //   628	633	1623	android/database/sqlite/SQLiteException
    //   639	646	1623	android/database/sqlite/SQLiteException
    //   649	654	1623	android/database/sqlite/SQLiteException
    //   660	667	1623	android/database/sqlite/SQLiteException
    //   670	675	1623	android/database/sqlite/SQLiteException
    //   681	688	1623	android/database/sqlite/SQLiteException
    //   707	712	1623	android/database/sqlite/SQLiteException
    //   718	725	1623	android/database/sqlite/SQLiteException
    //   727	731	1623	android/database/sqlite/SQLiteException
    //   733	738	1623	android/database/sqlite/SQLiteException
    //   740	745	1623	android/database/sqlite/SQLiteException
    //   745	749	1623	android/database/sqlite/SQLiteException
    //   751	755	1623	android/database/sqlite/SQLiteException
    //   780	785	1623	android/database/sqlite/SQLiteException
    //   786	791	1623	android/database/sqlite/SQLiteException
    //   797	804	1623	android/database/sqlite/SQLiteException
    //   806	810	1623	android/database/sqlite/SQLiteException
    //   812	817	1623	android/database/sqlite/SQLiteException
    //   819	824	1623	android/database/sqlite/SQLiteException
    //   824	828	1623	android/database/sqlite/SQLiteException
    //   830	834	1623	android/database/sqlite/SQLiteException
    //   859	864	1623	android/database/sqlite/SQLiteException
    //   865	870	1623	android/database/sqlite/SQLiteException
    //   876	883	1623	android/database/sqlite/SQLiteException
    //   885	889	1623	android/database/sqlite/SQLiteException
    //   891	896	1623	android/database/sqlite/SQLiteException
    //   898	903	1623	android/database/sqlite/SQLiteException
    //   903	907	1623	android/database/sqlite/SQLiteException
    //   909	913	1623	android/database/sqlite/SQLiteException
    //   938	943	1623	android/database/sqlite/SQLiteException
    //   944	949	1623	android/database/sqlite/SQLiteException
    //   955	962	1623	android/database/sqlite/SQLiteException
    //   964	968	1623	android/database/sqlite/SQLiteException
    //   970	975	1623	android/database/sqlite/SQLiteException
    //   977	982	1623	android/database/sqlite/SQLiteException
    //   982	986	1623	android/database/sqlite/SQLiteException
    //   988	992	1623	android/database/sqlite/SQLiteException
    //   1017	1022	1623	android/database/sqlite/SQLiteException
    //   1023	1028	1623	android/database/sqlite/SQLiteException
    //   1034	1041	1623	android/database/sqlite/SQLiteException
    //   1044	1049	1623	android/database/sqlite/SQLiteException
    //   1055	1062	1623	android/database/sqlite/SQLiteException
    //   1065	1070	1623	android/database/sqlite/SQLiteException
    //   1076	1083	1623	android/database/sqlite/SQLiteException
    //   1096	1101	1623	android/database/sqlite/SQLiteException
    //   1107	1114	1623	android/database/sqlite/SQLiteException
    //   1117	1122	1623	android/database/sqlite/SQLiteException
    //   1128	1135	1623	android/database/sqlite/SQLiteException
    //   1137	1141	1623	android/database/sqlite/SQLiteException
    //   1143	1148	1623	android/database/sqlite/SQLiteException
    //   1150	1155	1623	android/database/sqlite/SQLiteException
    //   1155	1159	1623	android/database/sqlite/SQLiteException
    //   1161	1165	1623	android/database/sqlite/SQLiteException
    //   1190	1195	1623	android/database/sqlite/SQLiteException
    //   1196	1201	1623	android/database/sqlite/SQLiteException
    //   1207	1214	1623	android/database/sqlite/SQLiteException
    //   1216	1220	1623	android/database/sqlite/SQLiteException
    //   1222	1227	1623	android/database/sqlite/SQLiteException
    //   1229	1234	1623	android/database/sqlite/SQLiteException
    //   1234	1238	1623	android/database/sqlite/SQLiteException
    //   1240	1244	1623	android/database/sqlite/SQLiteException
    //   1269	1274	1623	android/database/sqlite/SQLiteException
    //   1275	1280	1623	android/database/sqlite/SQLiteException
    //   1286	1293	1623	android/database/sqlite/SQLiteException
    //   1296	1301	1623	android/database/sqlite/SQLiteException
    //   1307	1314	1623	android/database/sqlite/SQLiteException
    //   1325	1330	1623	android/database/sqlite/SQLiteException
    //   1330	1334	1623	android/database/sqlite/SQLiteException
    //   1336	1341	1623	android/database/sqlite/SQLiteException
    //   1343	1348	1623	android/database/sqlite/SQLiteException
    //   1355	1359	1623	android/database/sqlite/SQLiteException
    //   1359	1366	1623	android/database/sqlite/SQLiteException
    //   1373	1377	1623	android/database/sqlite/SQLiteException
    //   1379	1384	1623	android/database/sqlite/SQLiteException
    //   1391	1395	1623	android/database/sqlite/SQLiteException
    //   1401	1406	1623	android/database/sqlite/SQLiteException
    //   1427	1434	1623	android/database/sqlite/SQLiteException
    //   1490	1497	1623	android/database/sqlite/SQLiteException
    //   1531	1538	1623	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final String b(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   6: aload_0
    //   7: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   10: aload_0
    //   11: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore 4
    //   16: ldc_w 1320
    //   19: astore 5
    //   21: iconst_1
    //   22: istore 6
    //   24: iload 6
    //   26: anewarray 255	java/lang/String
    //   29: astore 7
    //   31: aconst_null
    //   32: astore 8
    //   34: lload_1
    //   35: invokestatic 739	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   38: astore 9
    //   40: aload 7
    //   42: iconst_0
    //   43: aload 9
    //   45: aastore
    //   46: aload 4
    //   48: aload 5
    //   50: aload 7
    //   52: invokevirtual 282	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore 5
    //   57: aload 5
    //   59: invokeinterface 426 1 0
    //   64: istore 10
    //   66: iload 10
    //   68: ifne +42 -> 110
    //   71: aload_0
    //   72: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   75: astore 4
    //   77: aload 4
    //   79: getfield 748	com/google/android/gms/b/cu:g	Lcom/google/android/gms/b/cu$a;
    //   82: astore 4
    //   84: ldc_w 1322
    //   87: astore 7
    //   89: aload 4
    //   91: aload 7
    //   93: invokevirtual 225	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   96: aload 5
    //   98: ifnull +10 -> 108
    //   101: aload 5
    //   103: invokeinterface 295 1 0
    //   108: aload_3
    //   109: areturn
    //   110: iconst_0
    //   111: istore 10
    //   113: aconst_null
    //   114: astore 4
    //   116: aload 5
    //   118: iconst_0
    //   119: invokeinterface 247 2 0
    //   124: astore_3
    //   125: aload 5
    //   127: ifnull -19 -> 108
    //   130: aload 5
    //   132: invokeinterface 295 1 0
    //   137: goto -29 -> 108
    //   140: astore 4
    //   142: aconst_null
    //   143: astore 5
    //   145: aload_0
    //   146: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   149: astore 7
    //   151: aload 7
    //   153: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   156: astore 7
    //   158: ldc_w 1324
    //   161: astore 8
    //   163: aload 7
    //   165: aload 8
    //   167: aload 4
    //   169: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   172: aload 5
    //   174: ifnull -66 -> 108
    //   177: aload 5
    //   179: invokeinterface 295 1 0
    //   184: goto -76 -> 108
    //   187: astore 4
    //   189: aconst_null
    //   190: astore 5
    //   192: aload 4
    //   194: astore_3
    //   195: aload 5
    //   197: ifnull +10 -> 207
    //   200: aload 5
    //   202: invokeinterface 295 1 0
    //   207: aload_3
    //   208: athrow
    //   209: astore_3
    //   210: goto -15 -> 195
    //   213: astore 4
    //   215: goto -70 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	cg
    //   0	218	1	paramLong	long
    //   1	207	3	localObject1	Object
    //   209	1	3	localObject2	Object
    //   14	101	4	localObject3	Object
    //   140	28	4	localSQLiteException1	SQLiteException
    //   187	6	4	localObject4	Object
    //   213	1	4	localSQLiteException2	SQLiteException
    //   19	182	5	localObject5	Object
    //   22	3	6	i	int
    //   29	135	7	localObject6	Object
    //   32	134	8	str1	String
    //   38	6	9	str2	String
    //   64	48	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   10	14	140	android/database/sqlite/SQLiteException
    //   24	29	140	android/database/sqlite/SQLiteException
    //   34	38	140	android/database/sqlite/SQLiteException
    //   43	46	140	android/database/sqlite/SQLiteException
    //   50	55	140	android/database/sqlite/SQLiteException
    //   10	14	187	finally
    //   24	29	187	finally
    //   34	38	187	finally
    //   43	46	187	finally
    //   50	55	187	finally
    //   57	64	209	finally
    //   71	75	209	finally
    //   77	82	209	finally
    //   91	96	209	finally
    //   118	124	209	finally
    //   145	149	209	finally
    //   151	156	209	finally
    //   167	172	209	finally
    //   57	64	213	android/database/sqlite/SQLiteException
    //   71	75	213	android/database/sqlite/SQLiteException
    //   77	82	213	android/database/sqlite/SQLiteException
    //   91	96	213	android/database/sqlite/SQLiteException
    //   118	124	213	android/database/sqlite/SQLiteException
  }
  
  public final List b(String paramString, long paramLong)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    e();
    J();
    long l = 0L;
    boolean bool = paramLong < l;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool)
    {
      localObject1 = uc;
      localObject2 = "Invalid time querying expired conditional properties";
      localObject3 = cu.a(paramString);
      localObject4 = Long.valueOf(paramLong);
      ((cu.a)localObject1).a((String)localObject2, localObject3, localObject4);
    }
    for (Object localObject1 = Collections.emptyList();; localObject1 = b("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", (String[])localObject2))
    {
      return (List)localObject1;
      int i = 2;
      localObject2 = new String[i];
      localObject3 = null;
      localObject2[0] = paramString;
      int j = 1;
      localObject4 = String.valueOf(paramLong);
      localObject2[j] = localObject4;
    }
  }
  
  public final List b(String paramString1, String paramString2, String paramString3)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    e();
    J();
    Object localObject1 = new java/util/ArrayList;
    int i = 3;
    ((ArrayList)localObject1).<init>(i);
    ((List)localObject1).add(paramString1);
    Object localObject2 = new java/lang/StringBuilder;
    Object localObject3 = "app_id=?";
    ((StringBuilder)localObject2).<init>((String)localObject3);
    boolean bool = TextUtils.isEmpty(paramString2);
    if (!bool)
    {
      ((List)localObject1).add(paramString2);
      localObject3 = " and origin=?";
      ((StringBuilder)localObject2).append((String)localObject3);
    }
    bool = TextUtils.isEmpty(paramString3);
    if (!bool)
    {
      localObject3 = String.valueOf(paramString3);
      String str = "*";
      localObject3 = ((String)localObject3).concat(str);
      ((List)localObject1).add(localObject3);
      localObject3 = " and name glob ?";
      ((StringBuilder)localObject2).append((String)localObject3);
    }
    localObject3 = new String[((List)localObject1).size()];
    localObject1 = (String[])((List)localObject1).toArray((Object[])localObject3);
    localObject2 = ((StringBuilder)localObject2).toString();
    return b((String)localObject2, (String[])localObject1);
  }
  
  public final void b(String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.c.a(paramString1);
    com.google.android.gms.common.internal.c.a(paramString2);
    e();
    J();
    try
    {
      Object localObject1 = L();
      localObject2 = "user_attributes";
      str = "app_id=? and name=?";
      int i = 2;
      localObject3 = new String[i];
      int j = 0;
      localObject3[0] = paramString1;
      j = 1;
      localObject3[j] = paramString2;
      int k = ((SQLiteDatabase)localObject1).delete((String)localObject2, str, (String[])localObject3);
      localObject2 = u();
      localObject2 = g;
      str = "Deleted user attribute rows";
      localObject1 = Integer.valueOf(k);
      ((cu.a)localObject2).a(str, localObject1);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject2 = ua;
        String str = "Error deleting user attribute. appId";
        Object localObject3 = cu.a(paramString1);
        ((cu.a)localObject2).a(str, localObject3, paramString2, localSQLiteException);
      }
    }
  }
  
  public final long c(String paramString)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    e();
    J();
    try
    {
      SQLiteDatabase localSQLiteDatabase = L();
      localObject1 = w();
      localObject2 = cp.v;
      int i = ((cf)localObject1).b(paramString, (cp.a)localObject2);
      int j = 1000000;
      i = Math.min(j, i);
      j = 0;
      localObject2 = null;
      i = Math.max(0, i);
      localObject1 = String.valueOf(i);
      localObject2 = "raw_events";
      localObject3 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)";
      int k = 2;
      String[] arrayOfString = new String[k];
      int m = 0;
      arrayOfString[0] = paramString;
      m = 1;
      arrayOfString[m] = localObject1;
      int n = localSQLiteDatabase.delete((String)localObject2, (String)localObject3, arrayOfString);
      l = n;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject1 = ua;
        Object localObject2 = "Error deleting over the limit events. appId";
        Object localObject3 = cu.a(paramString);
        ((cu.a)localObject1).a((String)localObject2, localObject3, localSQLiteException);
        long l = 0L;
      }
    }
    return l;
  }
  
  /* Error */
  public final dq c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   16: aload_0
    //   17: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   20: aload_0
    //   21: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore 4
    //   26: ldc_w 835
    //   29: astore 5
    //   31: iconst_3
    //   32: istore 6
    //   34: iload 6
    //   36: anewarray 255	java/lang/String
    //   39: astore 7
    //   41: iconst_0
    //   42: istore 8
    //   44: aconst_null
    //   45: astore 9
    //   47: ldc_w 605
    //   50: astore 10
    //   52: aload 7
    //   54: iconst_0
    //   55: aload 10
    //   57: aastore
    //   58: iconst_1
    //   59: istore 8
    //   61: ldc_w 585
    //   64: astore 10
    //   66: aload 7
    //   68: iload 8
    //   70: aload 10
    //   72: aastore
    //   73: iconst_2
    //   74: istore 8
    //   76: ldc 25
    //   78: astore 10
    //   80: aload 7
    //   82: iload 8
    //   84: aload 10
    //   86: aastore
    //   87: ldc_w 824
    //   90: astore 9
    //   92: iconst_2
    //   93: istore 11
    //   95: iload 11
    //   97: anewarray 255	java/lang/String
    //   100: astore 10
    //   102: iconst_0
    //   103: istore 12
    //   105: aload 10
    //   107: iconst_0
    //   108: aload_1
    //   109: aastore
    //   110: iconst_1
    //   111: istore 12
    //   113: aload 10
    //   115: iload 12
    //   117: aload_2
    //   118: aastore
    //   119: iconst_0
    //   120: istore 12
    //   122: aconst_null
    //   123: astore 13
    //   125: aconst_null
    //   126: astore 14
    //   128: aload 4
    //   130: aload 5
    //   132: aload 7
    //   134: aload 9
    //   136: aload 10
    //   138: aconst_null
    //   139: aconst_null
    //   140: aconst_null
    //   141: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   144: astore 14
    //   146: aload 14
    //   148: invokeinterface 426 1 0
    //   153: istore 15
    //   155: iload 15
    //   157: ifne +24 -> 181
    //   160: aload 14
    //   162: ifnull +10 -> 172
    //   165: aload 14
    //   167: invokeinterface 295 1 0
    //   172: iconst_0
    //   173: istore 15
    //   175: aconst_null
    //   176: astore 4
    //   178: aload 4
    //   180: areturn
    //   181: iconst_0
    //   182: istore 15
    //   184: aconst_null
    //   185: astore 4
    //   187: aload 14
    //   189: iconst_0
    //   190: invokeinterface 229 2 0
    //   195: lstore 16
    //   197: iconst_1
    //   198: istore 15
    //   200: aload_0
    //   201: aload 14
    //   203: iload 15
    //   205: invokespecial 626	com/google/android/gms/b/cg:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   208: astore 13
    //   210: iconst_2
    //   211: istore 15
    //   213: aload 14
    //   215: iload 15
    //   217: invokeinterface 247 2 0
    //   222: astore 7
    //   224: new 846	com/google/android/gms/b/dq
    //   227: astore 4
    //   229: aload_1
    //   230: astore 5
    //   232: aload_2
    //   233: astore 9
    //   235: aload 4
    //   237: aload_1
    //   238: aload 7
    //   240: aload_2
    //   241: lload 16
    //   243: aload 13
    //   245: invokespecial 849	com/google/android/gms/b/dq:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    //   248: aload 14
    //   250: invokeinterface 661 1 0
    //   255: istore 18
    //   257: iload 18
    //   259: ifeq +36 -> 295
    //   262: aload_0
    //   263: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   266: astore 5
    //   268: aload 5
    //   270: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   273: astore 5
    //   275: ldc_w 1342
    //   278: astore 7
    //   280: aload_1
    //   281: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   284: astore 9
    //   286: aload 5
    //   288: aload 7
    //   290: aload 9
    //   292: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   295: aload 14
    //   297: ifnull -119 -> 178
    //   300: aload 14
    //   302: invokeinterface 295 1 0
    //   307: goto -129 -> 178
    //   310: astore 4
    //   312: iconst_0
    //   313: istore 18
    //   315: aconst_null
    //   316: astore 5
    //   318: aload_0
    //   319: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   322: astore 7
    //   324: aload 7
    //   326: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   329: astore 7
    //   331: ldc_w 1344
    //   334: astore 9
    //   336: aload_1
    //   337: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   340: astore 10
    //   342: aload 7
    //   344: aload 9
    //   346: aload 10
    //   348: aload_2
    //   349: aload 4
    //   351: invokevirtual 450	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   354: aload 5
    //   356: ifnull +10 -> 366
    //   359: aload 5
    //   361: invokeinterface 295 1 0
    //   366: iconst_0
    //   367: istore 15
    //   369: aconst_null
    //   370: astore 4
    //   372: goto -194 -> 178
    //   375: astore 4
    //   377: aload_3
    //   378: ifnull +9 -> 387
    //   381: aload_3
    //   382: invokeinterface 295 1 0
    //   387: aload 4
    //   389: athrow
    //   390: astore 4
    //   392: aload 14
    //   394: astore_3
    //   395: goto -18 -> 377
    //   398: astore 4
    //   400: aload 5
    //   402: astore_3
    //   403: goto -26 -> 377
    //   406: astore 4
    //   408: aload 14
    //   410: astore 5
    //   412: goto -94 -> 318
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	415	0	this	cg
    //   0	415	1	paramString1	String
    //   0	415	2	paramString2	String
    //   1	402	3	localObject1	Object
    //   24	212	4	localObject2	Object
    //   310	40	4	localSQLiteException1	SQLiteException
    //   370	1	4	localObject3	Object
    //   375	13	4	localObject4	Object
    //   390	1	4	localObject5	Object
    //   398	1	4	localObject6	Object
    //   406	1	4	localSQLiteException2	SQLiteException
    //   29	382	5	localObject7	Object
    //   32	3	6	i	int
    //   39	304	7	localObject8	Object
    //   42	41	8	j	int
    //   45	300	9	localObject9	Object
    //   50	297	10	localObject10	Object
    //   93	3	11	k	int
    //   103	18	12	m	int
    //   123	121	13	localObject11	Object
    //   126	283	14	localCursor	Cursor
    //   153	51	15	n	int
    //   211	157	15	i1	int
    //   195	47	16	l	long
    //   255	59	18	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   20	24	310	android/database/sqlite/SQLiteException
    //   34	39	310	android/database/sqlite/SQLiteException
    //   55	58	310	android/database/sqlite/SQLiteException
    //   70	73	310	android/database/sqlite/SQLiteException
    //   84	87	310	android/database/sqlite/SQLiteException
    //   95	100	310	android/database/sqlite/SQLiteException
    //   108	110	310	android/database/sqlite/SQLiteException
    //   117	119	310	android/database/sqlite/SQLiteException
    //   140	144	310	android/database/sqlite/SQLiteException
    //   20	24	375	finally
    //   34	39	375	finally
    //   55	58	375	finally
    //   70	73	375	finally
    //   84	87	375	finally
    //   95	100	375	finally
    //   108	110	375	finally
    //   117	119	375	finally
    //   140	144	375	finally
    //   146	153	390	finally
    //   189	195	390	finally
    //   203	208	390	finally
    //   215	222	390	finally
    //   224	227	390	finally
    //   243	248	390	finally
    //   248	255	390	finally
    //   262	266	390	finally
    //   268	273	390	finally
    //   280	284	390	finally
    //   290	295	390	finally
    //   318	322	398	finally
    //   324	329	398	finally
    //   336	340	398	finally
    //   349	354	398	finally
    //   146	153	406	android/database/sqlite/SQLiteException
    //   189	195	406	android/database/sqlite/SQLiteException
    //   203	208	406	android/database/sqlite/SQLiteException
    //   215	222	406	android/database/sqlite/SQLiteException
    //   224	227	406	android/database/sqlite/SQLiteException
    //   243	248	406	android/database/sqlite/SQLiteException
    //   248	255	406	android/database/sqlite/SQLiteException
    //   262	266	406	android/database/sqlite/SQLiteException
    //   268	273	406	android/database/sqlite/SQLiteException
    //   280	284	406	android/database/sqlite/SQLiteException
    //   290	295	406	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final cd d(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   9: pop
    //   10: aload_0
    //   11: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   14: aload_0
    //   15: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   18: aload_0
    //   19: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   22: astore_3
    //   23: ldc_w 581
    //   26: astore 4
    //   28: bipush 11
    //   30: istore 5
    //   32: iload 5
    //   34: anewarray 255	java/lang/String
    //   37: astore 6
    //   39: iconst_0
    //   40: istore 7
    //   42: aconst_null
    //   43: astore 8
    //   45: ldc 25
    //   47: astore 9
    //   49: aload 6
    //   51: iconst_0
    //   52: aload 9
    //   54: aastore
    //   55: iconst_1
    //   56: istore 7
    //   58: ldc_w 585
    //   61: astore 9
    //   63: aload 6
    //   65: iload 7
    //   67: aload 9
    //   69: aastore
    //   70: iconst_2
    //   71: istore 7
    //   73: ldc_w 588
    //   76: astore 9
    //   78: aload 6
    //   80: iload 7
    //   82: aload 9
    //   84: aastore
    //   85: iconst_3
    //   86: istore 7
    //   88: ldc_w 590
    //   91: astore 9
    //   93: aload 6
    //   95: iload 7
    //   97: aload 9
    //   99: aastore
    //   100: iconst_4
    //   101: istore 7
    //   103: ldc_w 593
    //   106: astore 9
    //   108: aload 6
    //   110: iload 7
    //   112: aload 9
    //   114: aastore
    //   115: iconst_5
    //   116: istore 7
    //   118: ldc_w 596
    //   121: astore 9
    //   123: aload 6
    //   125: iload 7
    //   127: aload 9
    //   129: aastore
    //   130: bipush 6
    //   132: istore 7
    //   134: ldc_w 599
    //   137: astore 9
    //   139: aload 6
    //   141: iload 7
    //   143: aload 9
    //   145: aastore
    //   146: bipush 7
    //   148: istore 7
    //   150: ldc_w 602
    //   153: astore 9
    //   155: aload 6
    //   157: iload 7
    //   159: aload 9
    //   161: aastore
    //   162: bipush 8
    //   164: istore 7
    //   166: ldc_w 605
    //   169: astore 9
    //   171: aload 6
    //   173: iload 7
    //   175: aload 9
    //   177: aastore
    //   178: bipush 9
    //   180: istore 7
    //   182: ldc_w 608
    //   185: astore 9
    //   187: aload 6
    //   189: iload 7
    //   191: aload 9
    //   193: aastore
    //   194: bipush 10
    //   196: istore 7
    //   198: ldc_w 611
    //   201: astore 9
    //   203: aload 6
    //   205: iload 7
    //   207: aload 9
    //   209: aastore
    //   210: ldc_w 824
    //   213: astore 8
    //   215: iconst_2
    //   216: istore 10
    //   218: iload 10
    //   220: anewarray 255	java/lang/String
    //   223: astore 9
    //   225: iconst_0
    //   226: istore 11
    //   228: aconst_null
    //   229: astore 12
    //   231: aload 9
    //   233: iconst_0
    //   234: aload_1
    //   235: aastore
    //   236: iconst_1
    //   237: istore 11
    //   239: aload 9
    //   241: iload 11
    //   243: aload_2
    //   244: aastore
    //   245: iconst_0
    //   246: istore 11
    //   248: aconst_null
    //   249: astore 12
    //   251: aconst_null
    //   252: astore 13
    //   254: aload_3
    //   255: aload 4
    //   257: aload 6
    //   259: aload 8
    //   261: aload 9
    //   263: aconst_null
    //   264: aconst_null
    //   265: aconst_null
    //   266: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   269: astore 14
    //   271: aload 14
    //   273: invokeinterface 426 1 0
    //   278: istore 15
    //   280: iload 15
    //   282: ifne +24 -> 306
    //   285: aload 14
    //   287: ifnull +10 -> 297
    //   290: aload 14
    //   292: invokeinterface 295 1 0
    //   297: iconst_0
    //   298: istore 7
    //   300: aconst_null
    //   301: astore 8
    //   303: aload 8
    //   305: areturn
    //   306: iconst_0
    //   307: istore 15
    //   309: aconst_null
    //   310: astore_3
    //   311: aload 14
    //   313: iconst_0
    //   314: invokeinterface 247 2 0
    //   319: astore 12
    //   321: iconst_1
    //   322: istore 15
    //   324: aload_0
    //   325: aload 14
    //   327: iload 15
    //   329: invokespecial 626	com/google/android/gms/b/cg:a	(Landroid/database/Cursor;I)Ljava/lang/Object;
    //   332: astore 9
    //   334: iconst_2
    //   335: istore 15
    //   337: aload 14
    //   339: iload 15
    //   341: invokeinterface 629 2 0
    //   346: istore 15
    //   348: iload 15
    //   350: ifeq +317 -> 667
    //   353: iconst_1
    //   354: istore 16
    //   356: iconst_3
    //   357: istore 15
    //   359: aload 14
    //   361: iload 15
    //   363: invokeinterface 247 2 0
    //   368: astore 17
    //   370: iconst_4
    //   371: istore 15
    //   373: aload 14
    //   375: iload 15
    //   377: invokeinterface 229 2 0
    //   382: lstore 18
    //   384: aload_0
    //   385: invokevirtual 633	com/google/android/gms/b/cg:q	()Lcom/google/android/gms/b/dr;
    //   388: astore_3
    //   389: iconst_5
    //   390: istore 20
    //   392: aload 14
    //   394: iload 20
    //   396: invokeinterface 637 2 0
    //   401: astore 4
    //   403: getstatic 643	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   406: astore 6
    //   408: aload_3
    //   409: aload 4
    //   411: aload 6
    //   413: invokevirtual 648	com/google/android/gms/b/dr:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   416: astore 21
    //   418: aload 21
    //   420: checkcast 639	com/google/android/gms/b/cn
    //   423: astore 21
    //   425: bipush 6
    //   427: istore 15
    //   429: aload 14
    //   431: iload 15
    //   433: invokeinterface 229 2 0
    //   438: lstore 22
    //   440: aload_0
    //   441: invokevirtual 633	com/google/android/gms/b/cg:q	()Lcom/google/android/gms/b/dr;
    //   444: astore_3
    //   445: bipush 7
    //   447: istore 20
    //   449: aload 14
    //   451: iload 20
    //   453: invokeinterface 637 2 0
    //   458: astore 4
    //   460: getstatic 643	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   463: astore 6
    //   465: aload_3
    //   466: aload 4
    //   468: aload 6
    //   470: invokevirtual 648	com/google/android/gms/b/dr:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   473: astore 24
    //   475: aload 24
    //   477: checkcast 639	com/google/android/gms/b/cn
    //   480: astore 24
    //   482: bipush 8
    //   484: istore 15
    //   486: aload 14
    //   488: iload 15
    //   490: invokeinterface 229 2 0
    //   495: lstore 25
    //   497: bipush 9
    //   499: istore 15
    //   501: aload 14
    //   503: iload 15
    //   505: invokeinterface 229 2 0
    //   510: lstore 27
    //   512: aload_0
    //   513: invokevirtual 633	com/google/android/gms/b/cg:q	()Lcom/google/android/gms/b/dr;
    //   516: astore_3
    //   517: bipush 10
    //   519: istore 20
    //   521: aload 14
    //   523: iload 20
    //   525: invokeinterface 637 2 0
    //   530: astore 4
    //   532: getstatic 643	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   535: astore 13
    //   537: aload_3
    //   538: aload 4
    //   540: aload 13
    //   542: invokevirtual 648	com/google/android/gms/b/dr:a	([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   545: astore 29
    //   547: aload 29
    //   549: checkcast 639	com/google/android/gms/b/cn
    //   552: astore 29
    //   554: new 650	com/google/android/gms/b/do
    //   557: astore_3
    //   558: aload_2
    //   559: astore 4
    //   561: aload_3
    //   562: aload_2
    //   563: lload 25
    //   565: aload 9
    //   567: aload 12
    //   569: invokespecial 653	com/google/android/gms/b/do:<init>	(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    //   572: new 655	com/google/android/gms/b/cd
    //   575: astore 8
    //   577: aload_1
    //   578: astore 9
    //   580: aload_3
    //   581: astore 13
    //   583: aload 8
    //   585: aload_1
    //   586: aload 12
    //   588: aload_3
    //   589: lload 22
    //   591: iload 16
    //   593: aload 17
    //   595: aload 21
    //   597: lload 18
    //   599: aload 24
    //   601: lload 27
    //   603: aload 29
    //   605: invokespecial 658	com/google/android/gms/b/cd:<init>	(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/b/do;JZLjava/lang/String;Lcom/google/android/gms/b/cn;JLcom/google/android/gms/b/cn;JLcom/google/android/gms/b/cn;)V
    //   608: aload 14
    //   610: invokeinterface 661 1 0
    //   615: istore 15
    //   617: iload 15
    //   619: ifeq +33 -> 652
    //   622: aload_0
    //   623: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   626: astore_3
    //   627: aload_3
    //   628: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   631: astore_3
    //   632: ldc_w 1346
    //   635: astore 4
    //   637: aload_1
    //   638: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   641: astore 6
    //   643: aload_3
    //   644: aload 4
    //   646: aload 6
    //   648: aload_2
    //   649: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   652: aload 14
    //   654: ifnull -351 -> 303
    //   657: aload 14
    //   659: invokeinterface 295 1 0
    //   664: goto -361 -> 303
    //   667: iconst_0
    //   668: istore 16
    //   670: goto -314 -> 356
    //   673: astore_3
    //   674: iconst_0
    //   675: istore 20
    //   677: aconst_null
    //   678: astore 4
    //   680: aload_0
    //   681: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   684: astore 6
    //   686: aload 6
    //   688: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   691: astore 6
    //   693: ldc_w 1348
    //   696: astore 8
    //   698: aload_1
    //   699: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   702: astore 9
    //   704: aload 6
    //   706: aload 8
    //   708: aload 9
    //   710: aload_2
    //   711: aload_3
    //   712: invokevirtual 450	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   715: aload 4
    //   717: ifnull +10 -> 727
    //   720: aload 4
    //   722: invokeinterface 295 1 0
    //   727: iconst_0
    //   728: istore 7
    //   730: aconst_null
    //   731: astore 8
    //   733: goto -430 -> 303
    //   736: astore_3
    //   737: aconst_null
    //   738: astore 14
    //   740: aload 14
    //   742: ifnull +10 -> 752
    //   745: aload 14
    //   747: invokeinterface 295 1 0
    //   752: aload_3
    //   753: athrow
    //   754: astore_3
    //   755: goto -15 -> 740
    //   758: astore_3
    //   759: aload 4
    //   761: astore 14
    //   763: goto -23 -> 740
    //   766: astore_3
    //   767: aload 14
    //   769: astore 4
    //   771: goto -91 -> 680
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	774	0	this	cg
    //   0	774	1	paramString1	String
    //   0	774	2	paramString2	String
    //   22	622	3	localObject1	Object
    //   673	39	3	localSQLiteException1	SQLiteException
    //   736	17	3	localObject2	Object
    //   754	1	3	localObject3	Object
    //   758	1	3	localObject4	Object
    //   766	1	3	localSQLiteException2	SQLiteException
    //   26	744	4	localObject5	Object
    //   30	3	5	i	int
    //   37	668	6	localObject6	Object
    //   40	689	7	j	int
    //   43	689	8	localObject7	Object
    //   47	662	9	localObject8	Object
    //   216	3	10	k	int
    //   226	21	11	m	int
    //   229	358	12	str1	String
    //   252	330	13	localObject9	Object
    //   269	499	14	localObject10	Object
    //   278	50	15	n	int
    //   335	169	15	i1	int
    //   615	3	15	bool1	boolean
    //   354	315	16	bool2	boolean
    //   368	226	17	str2	String
    //   382	216	18	l1	long
    //   390	286	20	i2	int
    //   416	180	21	localObject11	Object
    //   438	152	22	l2	long
    //   473	127	24	localObject12	Object
    //   495	69	25	l3	long
    //   510	92	27	l4	long
    //   545	59	29	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   18	22	673	android/database/sqlite/SQLiteException
    //   32	37	673	android/database/sqlite/SQLiteException
    //   52	55	673	android/database/sqlite/SQLiteException
    //   67	70	673	android/database/sqlite/SQLiteException
    //   82	85	673	android/database/sqlite/SQLiteException
    //   97	100	673	android/database/sqlite/SQLiteException
    //   112	115	673	android/database/sqlite/SQLiteException
    //   127	130	673	android/database/sqlite/SQLiteException
    //   143	146	673	android/database/sqlite/SQLiteException
    //   159	162	673	android/database/sqlite/SQLiteException
    //   175	178	673	android/database/sqlite/SQLiteException
    //   191	194	673	android/database/sqlite/SQLiteException
    //   207	210	673	android/database/sqlite/SQLiteException
    //   218	223	673	android/database/sqlite/SQLiteException
    //   234	236	673	android/database/sqlite/SQLiteException
    //   243	245	673	android/database/sqlite/SQLiteException
    //   265	269	673	android/database/sqlite/SQLiteException
    //   18	22	736	finally
    //   32	37	736	finally
    //   52	55	736	finally
    //   67	70	736	finally
    //   82	85	736	finally
    //   97	100	736	finally
    //   112	115	736	finally
    //   127	130	736	finally
    //   143	146	736	finally
    //   159	162	736	finally
    //   175	178	736	finally
    //   191	194	736	finally
    //   207	210	736	finally
    //   218	223	736	finally
    //   234	236	736	finally
    //   243	245	736	finally
    //   265	269	736	finally
    //   271	278	754	finally
    //   313	319	754	finally
    //   327	332	754	finally
    //   339	346	754	finally
    //   361	368	754	finally
    //   375	382	754	finally
    //   384	388	754	finally
    //   394	401	754	finally
    //   403	406	754	finally
    //   411	416	754	finally
    //   418	423	754	finally
    //   431	438	754	finally
    //   440	444	754	finally
    //   451	458	754	finally
    //   460	463	754	finally
    //   468	473	754	finally
    //   475	480	754	finally
    //   488	495	754	finally
    //   503	510	754	finally
    //   512	516	754	finally
    //   523	530	754	finally
    //   532	535	754	finally
    //   540	545	754	finally
    //   547	552	754	finally
    //   554	557	754	finally
    //   567	572	754	finally
    //   572	575	754	finally
    //   603	608	754	finally
    //   608	615	754	finally
    //   622	626	754	finally
    //   627	631	754	finally
    //   637	641	754	finally
    //   648	652	754	finally
    //   680	684	758	finally
    //   686	691	758	finally
    //   698	702	758	finally
    //   711	715	758	finally
    //   271	278	766	android/database/sqlite/SQLiteException
    //   313	319	766	android/database/sqlite/SQLiteException
    //   327	332	766	android/database/sqlite/SQLiteException
    //   339	346	766	android/database/sqlite/SQLiteException
    //   361	368	766	android/database/sqlite/SQLiteException
    //   375	382	766	android/database/sqlite/SQLiteException
    //   384	388	766	android/database/sqlite/SQLiteException
    //   394	401	766	android/database/sqlite/SQLiteException
    //   403	406	766	android/database/sqlite/SQLiteException
    //   411	416	766	android/database/sqlite/SQLiteException
    //   418	423	766	android/database/sqlite/SQLiteException
    //   431	438	766	android/database/sqlite/SQLiteException
    //   440	444	766	android/database/sqlite/SQLiteException
    //   451	458	766	android/database/sqlite/SQLiteException
    //   460	463	766	android/database/sqlite/SQLiteException
    //   468	473	766	android/database/sqlite/SQLiteException
    //   475	480	766	android/database/sqlite/SQLiteException
    //   488	495	766	android/database/sqlite/SQLiteException
    //   503	510	766	android/database/sqlite/SQLiteException
    //   512	516	766	android/database/sqlite/SQLiteException
    //   523	530	766	android/database/sqlite/SQLiteException
    //   532	535	766	android/database/sqlite/SQLiteException
    //   540	545	766	android/database/sqlite/SQLiteException
    //   547	552	766	android/database/sqlite/SQLiteException
    //   554	557	766	android/database/sqlite/SQLiteException
    //   567	572	766	android/database/sqlite/SQLiteException
    //   572	575	766	android/database/sqlite/SQLiteException
    //   603	608	766	android/database/sqlite/SQLiteException
    //   608	615	766	android/database/sqlite/SQLiteException
    //   622	626	766	android/database/sqlite/SQLiteException
    //   627	631	766	android/database/sqlite/SQLiteException
    //   637	641	766	android/database/sqlite/SQLiteException
    //   648	652	766	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final byte[] d(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   4: pop
    //   5: aload_0
    //   6: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   9: aload_0
    //   10: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   13: aload_0
    //   14: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore_2
    //   18: ldc_w 798
    //   21: astore_3
    //   22: iconst_1
    //   23: istore 4
    //   25: iload 4
    //   27: anewarray 255	java/lang/String
    //   30: astore 5
    //   32: aconst_null
    //   33: astore 6
    //   35: ldc 78
    //   37: astore 7
    //   39: aload 5
    //   41: iconst_0
    //   42: aload 7
    //   44: aastore
    //   45: ldc_w 800
    //   48: astore 6
    //   50: iconst_1
    //   51: istore 8
    //   53: iload 8
    //   55: anewarray 255	java/lang/String
    //   58: astore 7
    //   60: aload 7
    //   62: iconst_0
    //   63: aload_1
    //   64: aastore
    //   65: aload_2
    //   66: aload_3
    //   67: aload 5
    //   69: aload 6
    //   71: aload 7
    //   73: aconst_null
    //   74: aconst_null
    //   75: aconst_null
    //   76: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   79: astore_3
    //   80: aload_3
    //   81: invokeinterface 426 1 0
    //   86: istore 9
    //   88: iload 9
    //   90: ifne +20 -> 110
    //   93: aload_3
    //   94: ifnull +9 -> 103
    //   97: aload_3
    //   98: invokeinterface 295 1 0
    //   103: iconst_0
    //   104: istore 9
    //   106: aconst_null
    //   107: astore_2
    //   108: aload_2
    //   109: areturn
    //   110: iconst_0
    //   111: istore 9
    //   113: aconst_null
    //   114: astore_2
    //   115: aload_3
    //   116: iconst_0
    //   117: invokeinterface 637 2 0
    //   122: astore_2
    //   123: aload_3
    //   124: invokeinterface 661 1 0
    //   129: istore 4
    //   131: iload 4
    //   133: ifeq +36 -> 169
    //   136: aload_0
    //   137: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   140: astore 5
    //   142: aload 5
    //   144: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   147: astore 5
    //   149: ldc_w 1350
    //   152: astore 6
    //   154: aload_1
    //   155: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   158: astore 7
    //   160: aload 5
    //   162: aload 6
    //   164: aload 7
    //   166: invokevirtual 184	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   169: aload_3
    //   170: ifnull -62 -> 108
    //   173: aload_3
    //   174: invokeinterface 295 1 0
    //   179: goto -71 -> 108
    //   182: astore_2
    //   183: aconst_null
    //   184: astore_3
    //   185: aload_0
    //   186: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   189: astore 5
    //   191: aload 5
    //   193: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   196: astore 5
    //   198: ldc_w 1352
    //   201: astore 6
    //   203: aload_1
    //   204: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   207: astore 7
    //   209: aload 5
    //   211: aload 6
    //   213: aload 7
    //   215: aload_2
    //   216: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   219: aload_3
    //   220: ifnull +9 -> 229
    //   223: aload_3
    //   224: invokeinterface 295 1 0
    //   229: iconst_0
    //   230: istore 9
    //   232: aconst_null
    //   233: astore_2
    //   234: goto -126 -> 108
    //   237: astore_2
    //   238: aconst_null
    //   239: astore_3
    //   240: aload_3
    //   241: ifnull +9 -> 250
    //   244: aload_3
    //   245: invokeinterface 295 1 0
    //   250: aload_2
    //   251: athrow
    //   252: astore_2
    //   253: goto -13 -> 240
    //   256: astore_2
    //   257: goto -72 -> 185
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	this	cg
    //   0	260	1	paramString	String
    //   17	106	2	localObject1	Object
    //   182	34	2	localSQLiteException1	SQLiteException
    //   233	1	2	localObject2	Object
    //   237	14	2	localObject3	Object
    //   252	1	2	localObject4	Object
    //   256	1	2	localSQLiteException2	SQLiteException
    //   21	224	3	localObject5	Object
    //   23	109	4	bool1	boolean
    //   30	180	5	localObject6	Object
    //   33	179	6	str	String
    //   37	177	7	localObject7	Object
    //   51	3	8	i	int
    //   86	145	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   13	17	182	android/database/sqlite/SQLiteException
    //   25	30	182	android/database/sqlite/SQLiteException
    //   42	45	182	android/database/sqlite/SQLiteException
    //   53	58	182	android/database/sqlite/SQLiteException
    //   63	65	182	android/database/sqlite/SQLiteException
    //   75	79	182	android/database/sqlite/SQLiteException
    //   13	17	237	finally
    //   25	30	237	finally
    //   42	45	237	finally
    //   53	58	237	finally
    //   63	65	237	finally
    //   75	79	237	finally
    //   80	86	252	finally
    //   116	122	252	finally
    //   123	129	252	finally
    //   136	140	252	finally
    //   142	147	252	finally
    //   154	158	252	finally
    //   164	169	252	finally
    //   185	189	252	finally
    //   191	196	252	finally
    //   203	207	252	finally
    //   215	219	252	finally
    //   80	86	256	android/database/sqlite/SQLiteException
    //   116	122	256	android/database/sqlite/SQLiteException
    //   123	129	256	android/database/sqlite/SQLiteException
    //   136	140	256	android/database/sqlite/SQLiteException
    //   142	147	256	android/database/sqlite/SQLiteException
    //   154	158	256	android/database/sqlite/SQLiteException
    //   164	169	256	android/database/sqlite/SQLiteException
  }
  
  public final int e(String paramString1, String paramString2)
  {
    int i = 0;
    com.google.android.gms.common.internal.c.a(paramString1);
    com.google.android.gms.common.internal.c.a(paramString2);
    e();
    J();
    try
    {
      SQLiteDatabase localSQLiteDatabase = L();
      localObject1 = "conditional_properties";
      str = "app_id=? and name=?";
      int j = 2;
      localObject2 = new String[j];
      int k = 0;
      localObject2[0] = paramString1;
      k = 1;
      localObject2[k] = paramString2;
      i = localSQLiteDatabase.delete((String)localObject1, str, (String[])localObject2);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject1 = ua;
        String str = "Error deleting conditional property";
        Object localObject2 = cu.a(paramString1);
        ((cu.a)localObject1).a(str, localObject2, paramString2, localSQLiteException);
      }
    }
    return i;
  }
  
  /* Error */
  final Map e(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   4: aload_0
    //   5: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   8: aload_1
    //   9: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_0
    //   14: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore_2
    //   18: ldc_w 570
    //   21: astore_3
    //   22: iconst_2
    //   23: istore 4
    //   25: iload 4
    //   27: anewarray 255	java/lang/String
    //   30: astore 5
    //   32: iconst_0
    //   33: istore 6
    //   35: aconst_null
    //   36: astore 7
    //   38: ldc_w 467
    //   41: astore 8
    //   43: aload 5
    //   45: iconst_0
    //   46: aload 8
    //   48: aastore
    //   49: iconst_1
    //   50: istore 6
    //   52: ldc_w 1028
    //   55: astore 8
    //   57: aload 5
    //   59: iload 6
    //   61: aload 8
    //   63: aastore
    //   64: ldc_w 800
    //   67: astore 7
    //   69: iconst_1
    //   70: istore 9
    //   72: iload 9
    //   74: anewarray 255	java/lang/String
    //   77: astore 8
    //   79: aconst_null
    //   80: astore 10
    //   82: aload 8
    //   84: iconst_0
    //   85: aload_1
    //   86: aastore
    //   87: aconst_null
    //   88: astore 10
    //   90: aconst_null
    //   91: astore 11
    //   93: aload_2
    //   94: aload_3
    //   95: aload 5
    //   97: aload 7
    //   99: aload 8
    //   101: aconst_null
    //   102: aconst_null
    //   103: aconst_null
    //   104: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   107: astore_3
    //   108: aload_3
    //   109: invokeinterface 426 1 0
    //   114: istore 12
    //   116: iload 12
    //   118: ifne +20 -> 138
    //   121: aload_3
    //   122: ifnull +9 -> 131
    //   125: aload_3
    //   126: invokeinterface 295 1 0
    //   131: iconst_0
    //   132: istore 12
    //   134: aconst_null
    //   135: astore_2
    //   136: aload_2
    //   137: areturn
    //   138: new 17	android/support/v4/g/a
    //   141: astore_2
    //   142: aload_2
    //   143: invokespecial 1355	android/support/v4/g/a:<init>	()V
    //   146: iconst_0
    //   147: istore 4
    //   149: aconst_null
    //   150: astore 5
    //   152: aload_3
    //   153: iconst_0
    //   154: invokeinterface 629 2 0
    //   159: istore 4
    //   161: iconst_1
    //   162: istore 6
    //   164: aload_3
    //   165: iload 6
    //   167: invokeinterface 637 2 0
    //   172: astore 7
    //   174: aload 7
    //   176: arraylength
    //   177: istore 9
    //   179: aload 7
    //   181: iload 9
    //   183: invokestatic 862	com/google/android/gms/b/ft:a	([BI)Lcom/google/android/gms/b/ft;
    //   186: astore 7
    //   188: new 1024	com/google/android/gms/b/du$f
    //   191: astore 8
    //   193: aload 8
    //   195: invokespecial 1356	com/google/android/gms/b/du$f:<init>	()V
    //   198: aload 8
    //   200: aload 7
    //   202: invokevirtual 1357	com/google/android/gms/b/du$f:a	(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/gb;
    //   205: pop
    //   206: iload 4
    //   208: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   211: astore 5
    //   213: aload_2
    //   214: aload 5
    //   216: aload 8
    //   218: invokeinterface 33 3 0
    //   223: pop
    //   224: aload_3
    //   225: invokeinterface 661 1 0
    //   230: istore 4
    //   232: iload 4
    //   234: ifne -88 -> 146
    //   237: aload_3
    //   238: ifnull -102 -> 136
    //   241: aload_3
    //   242: invokeinterface 295 1 0
    //   247: goto -111 -> 136
    //   250: astore 7
    //   252: aload_0
    //   253: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   256: astore 8
    //   258: aload 8
    //   260: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   263: astore 8
    //   265: ldc_w 1359
    //   268: astore 10
    //   270: aload_1
    //   271: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   274: astore 11
    //   276: iload 4
    //   278: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   281: astore 5
    //   283: aload 8
    //   285: aload 10
    //   287: aload 11
    //   289: aload 5
    //   291: aload 7
    //   293: invokevirtual 450	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   296: goto -72 -> 224
    //   299: astore_2
    //   300: aload_0
    //   301: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   304: astore 5
    //   306: aload 5
    //   308: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   311: astore 5
    //   313: ldc_w 1361
    //   316: astore 7
    //   318: aload_1
    //   319: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   322: astore 8
    //   324: aload 5
    //   326: aload 7
    //   328: aload 8
    //   330: aload_2
    //   331: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   334: aload_3
    //   335: ifnull +9 -> 344
    //   338: aload_3
    //   339: invokeinterface 295 1 0
    //   344: iconst_0
    //   345: istore 12
    //   347: aconst_null
    //   348: astore_2
    //   349: goto -213 -> 136
    //   352: astore_2
    //   353: aconst_null
    //   354: astore_3
    //   355: aload_3
    //   356: ifnull +9 -> 365
    //   359: aload_3
    //   360: invokeinterface 295 1 0
    //   365: aload_2
    //   366: athrow
    //   367: astore_2
    //   368: goto -13 -> 355
    //   371: astore_2
    //   372: aconst_null
    //   373: astore_3
    //   374: goto -74 -> 300
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	377	0	this	cg
    //   0	377	1	paramString	String
    //   17	197	2	localObject1	Object
    //   299	32	2	localSQLiteException1	SQLiteException
    //   348	1	2	localObject2	Object
    //   352	14	2	localObject3	Object
    //   367	1	2	localObject4	Object
    //   371	1	2	localSQLiteException2	SQLiteException
    //   21	353	3	localObject5	Object
    //   23	184	4	i	int
    //   230	47	4	j	int
    //   30	295	5	localObject6	Object
    //   33	133	6	k	int
    //   36	165	7	localObject7	Object
    //   250	42	7	localIOException	IOException
    //   316	11	7	str1	String
    //   41	288	8	localObject8	Object
    //   70	112	9	m	int
    //   80	206	10	str2	String
    //   91	197	11	localObject9	Object
    //   114	232	12	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   200	206	250	java/io/IOException
    //   108	114	299	android/database/sqlite/SQLiteException
    //   138	141	299	android/database/sqlite/SQLiteException
    //   142	146	299	android/database/sqlite/SQLiteException
    //   153	159	299	android/database/sqlite/SQLiteException
    //   165	172	299	android/database/sqlite/SQLiteException
    //   174	177	299	android/database/sqlite/SQLiteException
    //   181	186	299	android/database/sqlite/SQLiteException
    //   188	191	299	android/database/sqlite/SQLiteException
    //   193	198	299	android/database/sqlite/SQLiteException
    //   200	206	299	android/database/sqlite/SQLiteException
    //   206	211	299	android/database/sqlite/SQLiteException
    //   216	224	299	android/database/sqlite/SQLiteException
    //   224	230	299	android/database/sqlite/SQLiteException
    //   252	256	299	android/database/sqlite/SQLiteException
    //   258	263	299	android/database/sqlite/SQLiteException
    //   270	274	299	android/database/sqlite/SQLiteException
    //   276	281	299	android/database/sqlite/SQLiteException
    //   291	296	299	android/database/sqlite/SQLiteException
    //   25	30	352	finally
    //   46	49	352	finally
    //   61	64	352	finally
    //   72	77	352	finally
    //   85	87	352	finally
    //   103	107	352	finally
    //   108	114	367	finally
    //   138	141	367	finally
    //   142	146	367	finally
    //   153	159	367	finally
    //   165	172	367	finally
    //   174	177	367	finally
    //   181	186	367	finally
    //   188	191	367	finally
    //   193	198	367	finally
    //   200	206	367	finally
    //   206	211	367	finally
    //   216	224	367	finally
    //   224	230	367	finally
    //   252	256	367	finally
    //   258	263	367	finally
    //   270	274	367	finally
    //   276	281	367	finally
    //   291	296	367	finally
    //   300	304	367	finally
    //   306	311	367	finally
    //   318	322	367	finally
    //   330	334	367	finally
    //   25	30	371	android/database/sqlite/SQLiteException
    //   46	49	371	android/database/sqlite/SQLiteException
    //   61	64	371	android/database/sqlite/SQLiteException
    //   72	77	371	android/database/sqlite/SQLiteException
    //   85	87	371	android/database/sqlite/SQLiteException
    //   103	107	371	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  final Map f(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   4: aload_0
    //   5: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   8: aload_1
    //   9: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 17	android/support/v4/g/a
    //   21: astore_3
    //   22: aload_3
    //   23: invokespecial 1355	android/support/v4/g/a:<init>	()V
    //   26: aload_0
    //   27: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 4
    //   32: ldc_w 484
    //   35: astore 5
    //   37: iconst_2
    //   38: istore 6
    //   40: iload 6
    //   42: anewarray 255	java/lang/String
    //   45: astore 7
    //   47: iconst_0
    //   48: istore 8
    //   50: aconst_null
    //   51: astore 9
    //   53: ldc_w 467
    //   56: astore 10
    //   58: aload 7
    //   60: iconst_0
    //   61: aload 10
    //   63: aastore
    //   64: iconst_1
    //   65: istore 8
    //   67: ldc_w 476
    //   70: astore 10
    //   72: aload 7
    //   74: iload 8
    //   76: aload 10
    //   78: aastore
    //   79: ldc_w 1363
    //   82: astore 9
    //   84: iconst_2
    //   85: istore 11
    //   87: iload 11
    //   89: anewarray 255	java/lang/String
    //   92: astore 10
    //   94: iconst_0
    //   95: istore 12
    //   97: aload 10
    //   99: iconst_0
    //   100: aload_1
    //   101: aastore
    //   102: iconst_1
    //   103: istore 12
    //   105: aload 10
    //   107: iload 12
    //   109: aload_2
    //   110: aastore
    //   111: iconst_0
    //   112: istore 12
    //   114: aload 4
    //   116: aload 5
    //   118: aload 7
    //   120: aload 9
    //   122: aload 10
    //   124: aconst_null
    //   125: aconst_null
    //   126: aconst_null
    //   127: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   130: astore 5
    //   132: aload 5
    //   134: invokeinterface 426 1 0
    //   139: istore 13
    //   141: iload 13
    //   143: ifne +23 -> 166
    //   146: invokestatic 1367	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   149: astore 4
    //   151: aload 5
    //   153: ifnull +10 -> 163
    //   156: aload 5
    //   158: invokeinterface 295 1 0
    //   163: aload 4
    //   165: areturn
    //   166: iconst_1
    //   167: istore 13
    //   169: aload 5
    //   171: iload 13
    //   173: invokeinterface 637 2 0
    //   178: astore 4
    //   180: aload 4
    //   182: arraylength
    //   183: istore 6
    //   185: aload 4
    //   187: iload 6
    //   189: invokestatic 862	com/google/android/gms/b/ft:a	([BI)Lcom/google/android/gms/b/ft;
    //   192: astore 4
    //   194: new 433	com/google/android/gms/b/ds$b
    //   197: astore 7
    //   199: aload 7
    //   201: invokespecial 1368	com/google/android/gms/b/ds$b:<init>	()V
    //   204: aload 7
    //   206: aload 4
    //   208: invokevirtual 1369	com/google/android/gms/b/ds$b:a	(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/gb;
    //   211: pop
    //   212: iconst_0
    //   213: istore 13
    //   215: aconst_null
    //   216: astore 4
    //   218: aload 5
    //   220: iconst_0
    //   221: invokeinterface 629 2 0
    //   226: istore 8
    //   228: iload 8
    //   230: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   233: astore 4
    //   235: aload_3
    //   236: aload 4
    //   238: invokeinterface 1371 2 0
    //   243: astore 4
    //   245: aload 4
    //   247: checkcast 549	java/util/List
    //   250: astore 4
    //   252: aload 4
    //   254: ifnonnull +31 -> 285
    //   257: new 546	java/util/ArrayList
    //   260: astore 4
    //   262: aload 4
    //   264: invokespecial 547	java/util/ArrayList:<init>	()V
    //   267: iload 8
    //   269: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: astore 9
    //   274: aload_3
    //   275: aload 9
    //   277: aload 4
    //   279: invokeinterface 33 3 0
    //   284: pop
    //   285: aload 4
    //   287: aload 7
    //   289: invokeinterface 564 2 0
    //   294: pop
    //   295: aload 5
    //   297: invokeinterface 661 1 0
    //   302: istore 13
    //   304: iload 13
    //   306: ifne -140 -> 166
    //   309: aload 5
    //   311: ifnull +10 -> 321
    //   314: aload 5
    //   316: invokeinterface 295 1 0
    //   321: aload_3
    //   322: astore 4
    //   324: goto -161 -> 163
    //   327: astore 4
    //   329: aload_0
    //   330: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   333: astore 7
    //   335: aload 7
    //   337: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   340: astore 7
    //   342: ldc_w 1373
    //   345: astore 9
    //   347: aload_1
    //   348: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   351: astore 10
    //   353: aload 7
    //   355: aload 9
    //   357: aload 10
    //   359: aload 4
    //   361: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   364: goto -69 -> 295
    //   367: astore 4
    //   369: aload_0
    //   370: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   373: astore 7
    //   375: aload 7
    //   377: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   380: astore 7
    //   382: ldc_w 544
    //   385: astore 9
    //   387: aload_1
    //   388: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   391: astore 10
    //   393: aload 7
    //   395: aload 9
    //   397: aload 10
    //   399: aload 4
    //   401: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   404: aload 5
    //   406: ifnull +10 -> 416
    //   409: aload 5
    //   411: invokeinterface 295 1 0
    //   416: iconst_0
    //   417: istore 13
    //   419: aconst_null
    //   420: astore 4
    //   422: goto -259 -> 163
    //   425: astore 4
    //   427: aconst_null
    //   428: astore 5
    //   430: aload 5
    //   432: ifnull +10 -> 442
    //   435: aload 5
    //   437: invokeinterface 295 1 0
    //   442: aload 4
    //   444: athrow
    //   445: astore 4
    //   447: goto -17 -> 430
    //   450: astore 4
    //   452: aconst_null
    //   453: astore 5
    //   455: goto -86 -> 369
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	458	0	this	cg
    //   0	458	1	paramString1	String
    //   0	458	2	paramString2	String
    //   21	301	3	locala	a
    //   30	293	4	localObject1	Object
    //   327	33	4	localIOException	IOException
    //   367	33	4	localSQLiteException1	SQLiteException
    //   420	1	4	localObject2	Object
    //   425	18	4	localObject3	Object
    //   445	1	4	localObject4	Object
    //   450	1	4	localSQLiteException2	SQLiteException
    //   35	419	5	localObject5	Object
    //   38	150	6	i	int
    //   45	349	7	localObject6	Object
    //   48	220	8	j	int
    //   51	345	9	localObject7	Object
    //   56	342	10	localObject8	Object
    //   85	3	11	k	int
    //   95	18	12	m	int
    //   139	33	13	n	int
    //   213	205	13	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   206	212	327	java/io/IOException
    //   132	139	367	android/database/sqlite/SQLiteException
    //   146	149	367	android/database/sqlite/SQLiteException
    //   171	178	367	android/database/sqlite/SQLiteException
    //   180	183	367	android/database/sqlite/SQLiteException
    //   187	192	367	android/database/sqlite/SQLiteException
    //   194	197	367	android/database/sqlite/SQLiteException
    //   199	204	367	android/database/sqlite/SQLiteException
    //   206	212	367	android/database/sqlite/SQLiteException
    //   220	226	367	android/database/sqlite/SQLiteException
    //   228	233	367	android/database/sqlite/SQLiteException
    //   236	243	367	android/database/sqlite/SQLiteException
    //   245	250	367	android/database/sqlite/SQLiteException
    //   257	260	367	android/database/sqlite/SQLiteException
    //   262	267	367	android/database/sqlite/SQLiteException
    //   267	272	367	android/database/sqlite/SQLiteException
    //   277	285	367	android/database/sqlite/SQLiteException
    //   287	295	367	android/database/sqlite/SQLiteException
    //   295	302	367	android/database/sqlite/SQLiteException
    //   329	333	367	android/database/sqlite/SQLiteException
    //   335	340	367	android/database/sqlite/SQLiteException
    //   347	351	367	android/database/sqlite/SQLiteException
    //   359	364	367	android/database/sqlite/SQLiteException
    //   40	45	425	finally
    //   61	64	425	finally
    //   76	79	425	finally
    //   87	92	425	finally
    //   100	102	425	finally
    //   109	111	425	finally
    //   126	130	425	finally
    //   132	139	445	finally
    //   146	149	445	finally
    //   171	178	445	finally
    //   180	183	445	finally
    //   187	192	445	finally
    //   194	197	445	finally
    //   199	204	445	finally
    //   206	212	445	finally
    //   220	226	445	finally
    //   228	233	445	finally
    //   236	243	445	finally
    //   245	250	445	finally
    //   257	260	445	finally
    //   262	267	445	finally
    //   267	272	445	finally
    //   277	285	445	finally
    //   287	295	445	finally
    //   295	302	445	finally
    //   329	333	445	finally
    //   335	340	445	finally
    //   347	351	445	finally
    //   359	364	445	finally
    //   369	373	445	finally
    //   375	380	445	finally
    //   387	391	445	finally
    //   399	404	445	finally
    //   40	45	450	android/database/sqlite/SQLiteException
    //   61	64	450	android/database/sqlite/SQLiteException
    //   76	79	450	android/database/sqlite/SQLiteException
    //   87	92	450	android/database/sqlite/SQLiteException
    //   100	102	450	android/database/sqlite/SQLiteException
    //   109	111	450	android/database/sqlite/SQLiteException
    //   126	130	450	android/database/sqlite/SQLiteException
  }
  
  final void f(String paramString)
  {
    J();
    e();
    com.google.android.gms.common.internal.c.a(paramString);
    try
    {
      Object localObject1 = L();
      int i = 1;
      localObject2 = new String[i];
      int j = 0;
      str1 = null;
      localObject2[0] = paramString;
      str1 = "events";
      localObject3 = "app_id=?";
      j = ((SQLiteDatabase)localObject1).delete(str1, (String)localObject3, (String[])localObject2) + 0;
      localObject3 = "user_attributes";
      String str2 = "app_id=?";
      int k = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2);
      j += k;
      localObject3 = "conditional_properties";
      str2 = "app_id=?";
      k = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2);
      j += k;
      localObject3 = "apps";
      str2 = "app_id=?";
      k = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2);
      j += k;
      localObject3 = "raw_events";
      str2 = "app_id=?";
      k = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2);
      j += k;
      localObject3 = "raw_events_metadata";
      str2 = "app_id=?";
      k = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2);
      j += k;
      localObject3 = "event_filters";
      str2 = "app_id=?";
      k = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2);
      j += k;
      localObject3 = "property_filters";
      str2 = "app_id=?";
      k = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2);
      j += k;
      localObject3 = "audience_filter_values";
      str2 = "app_id=?";
      int m = ((SQLiteDatabase)localObject1).delete((String)localObject3, str2, (String[])localObject2) + j;
      if (m > 0)
      {
        localObject2 = u();
        localObject2 = g;
        str1 = "Deleted application data. app, records";
        localObject1 = Integer.valueOf(m);
        ((cu.a)localObject2).a(str1, paramString, localObject1);
      }
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject2 = ua;
        String str1 = "Error deleting application data. appId, error";
        Object localObject3 = cu.a(paramString);
        ((cu.a)localObject2).a(str1, localObject3, localSQLiteException);
      }
    }
  }
  
  public final long g(String paramString)
  {
    com.google.android.gms.common.internal.c.a(paramString);
    e();
    J();
    return h(paramString, "first_open_count");
  }
  
  /* Error */
  final Map g(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 431	com/google/android/gms/b/cg:J	()V
    //   4: aload_0
    //   5: invokevirtual 164	com/google/android/gms/b/cg:e	()V
    //   8: aload_1
    //   9: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: invokestatic 300	com/google/android/gms/common/internal/c:a	(Ljava/lang/String;)Ljava/lang/String;
    //   17: pop
    //   18: new 17	android/support/v4/g/a
    //   21: astore_3
    //   22: aload_3
    //   23: invokespecial 1355	android/support/v4/g/a:<init>	()V
    //   26: aload_0
    //   27: invokespecial 482	com/google/android/gms/b/cg:L	()Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 4
    //   32: ldc_w 509
    //   35: astore 5
    //   37: iconst_2
    //   38: istore 6
    //   40: iload 6
    //   42: anewarray 255	java/lang/String
    //   45: astore 7
    //   47: iconst_0
    //   48: istore 8
    //   50: aconst_null
    //   51: astore 9
    //   53: ldc_w 467
    //   56: astore 10
    //   58: aload 7
    //   60: iconst_0
    //   61: aload 10
    //   63: aastore
    //   64: iconst_1
    //   65: istore 8
    //   67: ldc_w 476
    //   70: astore 10
    //   72: aload 7
    //   74: iload 8
    //   76: aload 10
    //   78: aastore
    //   79: ldc_w 1382
    //   82: astore 9
    //   84: iconst_2
    //   85: istore 11
    //   87: iload 11
    //   89: anewarray 255	java/lang/String
    //   92: astore 10
    //   94: iconst_0
    //   95: istore 12
    //   97: aload 10
    //   99: iconst_0
    //   100: aload_1
    //   101: aastore
    //   102: iconst_1
    //   103: istore 12
    //   105: aload 10
    //   107: iload 12
    //   109: aload_2
    //   110: aastore
    //   111: iconst_0
    //   112: istore 12
    //   114: aload 4
    //   116: aload 5
    //   118: aload 7
    //   120: aload 9
    //   122: aload 10
    //   124: aconst_null
    //   125: aconst_null
    //   126: aconst_null
    //   127: invokevirtual 423	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   130: astore 5
    //   132: aload 5
    //   134: invokeinterface 426 1 0
    //   139: istore 13
    //   141: iload 13
    //   143: ifne +23 -> 166
    //   146: invokestatic 1367	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   149: astore 4
    //   151: aload 5
    //   153: ifnull +10 -> 163
    //   156: aload 5
    //   158: invokeinterface 295 1 0
    //   163: aload 4
    //   165: areturn
    //   166: iconst_1
    //   167: istore 13
    //   169: aload 5
    //   171: iload 13
    //   173: invokeinterface 637 2 0
    //   178: astore 4
    //   180: aload 4
    //   182: arraylength
    //   183: istore 6
    //   185: aload 4
    //   187: iload 6
    //   189: invokestatic 862	com/google/android/gms/b/ft:a	([BI)Lcom/google/android/gms/b/ft;
    //   192: astore 4
    //   194: new 499	com/google/android/gms/b/ds$e
    //   197: astore 7
    //   199: aload 7
    //   201: invokespecial 1383	com/google/android/gms/b/ds$e:<init>	()V
    //   204: aload 7
    //   206: aload 4
    //   208: invokevirtual 1384	com/google/android/gms/b/ds$e:a	(Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/gb;
    //   211: pop
    //   212: iconst_0
    //   213: istore 13
    //   215: aconst_null
    //   216: astore 4
    //   218: aload 5
    //   220: iconst_0
    //   221: invokeinterface 629 2 0
    //   226: istore 8
    //   228: iload 8
    //   230: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   233: astore 4
    //   235: aload_3
    //   236: aload 4
    //   238: invokeinterface 1371 2 0
    //   243: astore 4
    //   245: aload 4
    //   247: checkcast 549	java/util/List
    //   250: astore 4
    //   252: aload 4
    //   254: ifnonnull +31 -> 285
    //   257: new 546	java/util/ArrayList
    //   260: astore 4
    //   262: aload 4
    //   264: invokespecial 547	java/util/ArrayList:<init>	()V
    //   267: iload 8
    //   269: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   272: astore 9
    //   274: aload_3
    //   275: aload 9
    //   277: aload 4
    //   279: invokeinterface 33 3 0
    //   284: pop
    //   285: aload 4
    //   287: aload 7
    //   289: invokeinterface 564 2 0
    //   294: pop
    //   295: aload 5
    //   297: invokeinterface 661 1 0
    //   302: istore 13
    //   304: iload 13
    //   306: ifne -140 -> 166
    //   309: aload 5
    //   311: ifnull +10 -> 321
    //   314: aload 5
    //   316: invokeinterface 295 1 0
    //   321: aload_3
    //   322: astore 4
    //   324: goto -161 -> 163
    //   327: astore 4
    //   329: aload_0
    //   330: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   333: astore 7
    //   335: aload 7
    //   337: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   340: astore 7
    //   342: ldc_w 1386
    //   345: astore 9
    //   347: aload_1
    //   348: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   351: astore 10
    //   353: aload 7
    //   355: aload 9
    //   357: aload 10
    //   359: aload 4
    //   361: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   364: goto -69 -> 295
    //   367: astore 4
    //   369: aload_0
    //   370: invokevirtual 172	com/google/android/gms/b/cg:u	()Lcom/google/android/gms/b/cu;
    //   373: astore 7
    //   375: aload 7
    //   377: getfield 212	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   380: astore 7
    //   382: ldc_w 544
    //   385: astore 9
    //   387: aload_1
    //   388: invokestatic 444	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   391: astore 10
    //   393: aload 7
    //   395: aload 9
    //   397: aload 10
    //   399: aload 4
    //   401: invokevirtual 413	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   404: aload 5
    //   406: ifnull +10 -> 416
    //   409: aload 5
    //   411: invokeinterface 295 1 0
    //   416: iconst_0
    //   417: istore 13
    //   419: aconst_null
    //   420: astore 4
    //   422: goto -259 -> 163
    //   425: astore 4
    //   427: aconst_null
    //   428: astore 5
    //   430: aload 5
    //   432: ifnull +10 -> 442
    //   435: aload 5
    //   437: invokeinterface 295 1 0
    //   442: aload 4
    //   444: athrow
    //   445: astore 4
    //   447: goto -17 -> 430
    //   450: astore 4
    //   452: aconst_null
    //   453: astore 5
    //   455: goto -86 -> 369
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	458	0	this	cg
    //   0	458	1	paramString1	String
    //   0	458	2	paramString2	String
    //   21	301	3	locala	a
    //   30	293	4	localObject1	Object
    //   327	33	4	localIOException	IOException
    //   367	33	4	localSQLiteException1	SQLiteException
    //   420	1	4	localObject2	Object
    //   425	18	4	localObject3	Object
    //   445	1	4	localObject4	Object
    //   450	1	4	localSQLiteException2	SQLiteException
    //   35	419	5	localObject5	Object
    //   38	150	6	i	int
    //   45	349	7	localObject6	Object
    //   48	220	8	j	int
    //   51	345	9	localObject7	Object
    //   56	342	10	localObject8	Object
    //   85	3	11	k	int
    //   95	18	12	m	int
    //   139	33	13	n	int
    //   213	205	13	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   206	212	327	java/io/IOException
    //   132	139	367	android/database/sqlite/SQLiteException
    //   146	149	367	android/database/sqlite/SQLiteException
    //   171	178	367	android/database/sqlite/SQLiteException
    //   180	183	367	android/database/sqlite/SQLiteException
    //   187	192	367	android/database/sqlite/SQLiteException
    //   194	197	367	android/database/sqlite/SQLiteException
    //   199	204	367	android/database/sqlite/SQLiteException
    //   206	212	367	android/database/sqlite/SQLiteException
    //   220	226	367	android/database/sqlite/SQLiteException
    //   228	233	367	android/database/sqlite/SQLiteException
    //   236	243	367	android/database/sqlite/SQLiteException
    //   245	250	367	android/database/sqlite/SQLiteException
    //   257	260	367	android/database/sqlite/SQLiteException
    //   262	267	367	android/database/sqlite/SQLiteException
    //   267	272	367	android/database/sqlite/SQLiteException
    //   277	285	367	android/database/sqlite/SQLiteException
    //   287	295	367	android/database/sqlite/SQLiteException
    //   295	302	367	android/database/sqlite/SQLiteException
    //   329	333	367	android/database/sqlite/SQLiteException
    //   335	340	367	android/database/sqlite/SQLiteException
    //   347	351	367	android/database/sqlite/SQLiteException
    //   359	364	367	android/database/sqlite/SQLiteException
    //   40	45	425	finally
    //   61	64	425	finally
    //   76	79	425	finally
    //   87	92	425	finally
    //   100	102	425	finally
    //   109	111	425	finally
    //   126	130	425	finally
    //   132	139	445	finally
    //   146	149	445	finally
    //   171	178	445	finally
    //   180	183	445	finally
    //   187	192	445	finally
    //   194	197	445	finally
    //   199	204	445	finally
    //   206	212	445	finally
    //   220	226	445	finally
    //   228	233	445	finally
    //   236	243	445	finally
    //   245	250	445	finally
    //   257	260	445	finally
    //   262	267	445	finally
    //   267	272	445	finally
    //   277	285	445	finally
    //   287	295	445	finally
    //   295	302	445	finally
    //   329	333	445	finally
    //   335	340	445	finally
    //   347	351	445	finally
    //   359	364	445	finally
    //   369	373	445	finally
    //   375	380	445	finally
    //   387	391	445	finally
    //   399	404	445	finally
    //   40	45	450	android/database/sqlite/SQLiteException
    //   61	64	450	android/database/sqlite/SQLiteException
    //   76	79	450	android/database/sqlite/SQLiteException
    //   87	92	450	android/database/sqlite/SQLiteException
    //   100	102	450	android/database/sqlite/SQLiteException
    //   109	111	450	android/database/sqlite/SQLiteException
    //   126	130	450	android/database/sqlite/SQLiteException
  }
  
  public final void h(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = L();
    Object localObject1 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)";
    int i = 2;
    try
    {
      localObject2 = new String[i];
      int j = 0;
      localObject3 = null;
      localObject2[0] = paramString;
      j = 1;
      localObject2[j] = paramString;
      localSQLiteDatabase.execSQL((String)localObject1, (Object[])localObject2);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        localObject1 = ua;
        Object localObject2 = "Failed to remove unused event metadata. appId";
        Object localObject3 = cu.a(paramString);
        ((cu.a)localObject1).a((String)localObject2, localObject3, localSQLiteException);
      }
    }
  }
  
  public final void x()
  {
    J();
    L().beginTransaction();
  }
  
  public final void y()
  {
    J();
    L().setTransactionSuccessful();
  }
  
  public final void z()
  {
    J();
    L().endTransaction();
  }
}


/* Location:              com/google/android/gms/b/cg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */