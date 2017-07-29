package com.google.android.gms.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.SystemClock;

public final class cs
  extends df
{
  private final cs.a a;
  private boolean b;
  
  cs(dc paramdc)
  {
    super(paramdc);
    cs.a locala = new com/google/android/gms/b/cs$a;
    Context localContext = super.n();
    String str = cf.U();
    locala.<init>(this, localContext, str);
    a = locala;
  }
  
  private boolean a(int paramInt, byte[] paramArrayOfByte)
  {
    super.c();
    super.e();
    boolean bool1 = b;
    if (bool1) {
      bool1 = false;
    }
    label73:
    cu.a locala;
    for (Object localObject1 = null;; locala = null)
    {
      for (;;)
      {
        return bool1;
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        Object localObject3 = Integer.valueOf(paramInt);
        localContentValues.put("type", (Integer)localObject3);
        localContentValues.put("entry", paramArrayOfByte);
        int j = 5;
        cf.ah();
        localObject1 = null;
        int m = 0;
        bool1 = j;
        j = 5;
        if (m < j)
        {
          SQLiteDatabase localSQLiteDatabase = null;
          try
          {
            localSQLiteDatabase = y();
            if (localSQLiteDatabase == null)
            {
              j = 1;
              b = j;
              if (localSQLiteDatabase != null) {
                localSQLiteDatabase.close();
              }
              bool1 = false;
              localObject1 = null;
            }
            else
            {
              localSQLiteDatabase.beginTransaction();
              l1 = 0L;
              localObject3 = "select count(1) from messages";
              boolean bool3 = false;
              String str2 = null;
              localObject3 = localSQLiteDatabase.rawQuery((String)localObject3, null);
              if (localObject3 != null)
              {
                bool3 = ((Cursor)localObject3).moveToFirst();
                if (bool3)
                {
                  n = 0;
                  localObject4 = null;
                  l1 = ((Cursor)localObject3).getLong(0);
                }
              }
              long l2 = 100000L;
              bool2 = l1 < l2;
              if (!bool2)
              {
                localObject3 = super.u();
                localObject3 = a;
                str2 = "Data loss, local db full";
                ((cu.a)localObject3).a(str2);
                l1 = 100000L - l1;
                l2 = 1L;
                l1 += l2;
                localObject3 = "messages";
                str2 = "rowid in (select rowid from messages order by rowid asc limit ?)";
                int i1 = 1;
                String[] arrayOfString = new String[i1];
                Object localObject5 = Long.toString(l1);
                arrayOfString[0] = localObject5;
                l2 = localSQLiteDatabase.delete((String)localObject3, str2, arrayOfString);
                bool2 = l2 < l1;
                if (bool2)
                {
                  localObject3 = super.u();
                  localObject3 = a;
                  str2 = "Different delete count than expected in local db. expected, received, difference";
                  localObject5 = Long.valueOf(l1);
                  Long localLong = Long.valueOf(l2);
                  l1 -= l2;
                  localObject4 = Long.valueOf(l1);
                  ((cu.a)localObject3).a(str2, localObject5, localLong, localObject4);
                }
              }
              localObject3 = "messages";
              n = 0;
              localObject4 = null;
              localSQLiteDatabase.insertOrThrow((String)localObject3, null, localContentValues);
              localSQLiteDatabase.setTransactionSuccessful();
              localSQLiteDatabase.endTransaction();
              if (localSQLiteDatabase != null) {
                localSQLiteDatabase.close();
              }
              bool1 = true;
            }
          }
          catch (SQLiteFullException localSQLiteFullException)
          {
            localObject4 = super.u();
            localObject4 = a;
            str3 = "Error writing entry to local database";
            ((cu.a)localObject4).a(str3, localSQLiteFullException);
            boolean bool2 = true;
            b = bool2;
            if (localSQLiteDatabase != null) {
              localSQLiteDatabase.close();
            }
            k = m + 1;
            m = k;
            break label73;
          }
          catch (SQLiteException localSQLiteException)
          {
            long l1;
            Object localObject4;
            String str3;
            int k;
            int n = Build.VERSION.SDK_INT;
            int i2 = 11;
            boolean bool4;
            if (n >= i2)
            {
              bool4 = localSQLiteException instanceof SQLiteDatabaseLockedException;
              if (bool4)
              {
                l1 = bool1;
                SystemClock.sleep(l1);
                bool1 += true;
              }
            }
            while (localSQLiteDatabase != null)
            {
              localSQLiteDatabase.close();
              break;
              if (localSQLiteDatabase != null)
              {
                bool4 = localSQLiteDatabase.inTransaction();
                if (bool4) {
                  localSQLiteDatabase.endTransaction();
                }
              }
              localObject4 = super.u();
              localObject4 = a;
              str3 = "Error writing entry to local database";
              ((cu.a)localObject4).a(str3, localSQLiteException);
              k = 1;
              b = k;
            }
          }
          finally
          {
            if (localSQLiteDatabase != null) {
              localSQLiteDatabase.close();
            }
          }
        }
      }
      locala = uc;
      String str1 = "Failed to write entry to local database";
      locala.a(str1);
      int i = 0;
    }
  }
  
  private SQLiteDatabase y()
  {
    Object localObject = null;
    int i = Build.VERSION.SDK_INT;
    boolean bool = b;
    if (bool) {}
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      SQLiteDatabase localSQLiteDatabase = a.getWritableDatabase();
      if (localSQLiteDatabase == null)
      {
        bool = true;
        b = bool;
      }
      else
      {
        localObject = localSQLiteDatabase;
      }
    }
  }
  
  protected final void a() {}
  
  public final boolean a(cd paramcd)
  {
    int i = Build.VERSION.SDK_INT;
    super.q();
    Object localObject = dr.a(paramcd);
    int j = localObject.length;
    int k = 131072;
    if (j > k)
    {
      localObject = uc;
      String str = "Conditional user property too long for local database. Sending directly to service";
      ((cu.a)localObject).a(str);
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      j = 2;
      boolean bool = a(j, (byte[])localObject);
    }
  }
  
  public final boolean a(cn paramcn)
  {
    boolean bool = false;
    int i = Build.VERSION.SDK_INT;
    Object localObject1 = Parcel.obtain();
    paramcn.writeToParcel((Parcel)localObject1, 0);
    Object localObject2 = ((Parcel)localObject1).marshall();
    ((Parcel)localObject1).recycle();
    i = localObject2.length;
    int j = 131072;
    if (i > j)
    {
      localObject1 = uc;
      localObject2 = "Event is too long for local database. Sending event directly to service";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return bool;
      bool = a(0, (byte[])localObject2);
    }
  }
  
  public final boolean a(do paramdo)
  {
    boolean bool = false;
    int i = Build.VERSION.SDK_INT;
    Object localObject1 = Parcel.obtain();
    paramdo.writeToParcel((Parcel)localObject1, 0);
    Object localObject2 = ((Parcel)localObject1).marshall();
    ((Parcel)localObject1).recycle();
    i = localObject2.length;
    int j = 131072;
    if (i > j)
    {
      localObject1 = uc;
      localObject2 = "User property too long for local database. Sending directly to service";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return bool;
      bool = a(1, (byte[])localObject2);
    }
  }
  
  /* Error */
  public final java.util.List x()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 36	com/google/android/gms/b/df:e	()V
    //   4: aload_0
    //   5: invokespecial 33	com/google/android/gms/b/df:c	()V
    //   8: getstatic 160	android/os/Build$VERSION:SDK_INT	I
    //   11: istore_1
    //   12: aload_0
    //   13: getfield 38	com/google/android/gms/b/cs:b	Z
    //   16: istore_1
    //   17: iload_1
    //   18: ifeq +9 -> 27
    //   21: iconst_0
    //   22: istore_1
    //   23: aconst_null
    //   24: astore_2
    //   25: aload_2
    //   26: areturn
    //   27: new 293	java/util/ArrayList
    //   30: astore_3
    //   31: aload_3
    //   32: invokespecial 294	java/util/ArrayList:<init>	()V
    //   35: aload_0
    //   36: invokespecial 18	com/google/android/gms/b/df:n	()Landroid/content/Context;
    //   39: astore_2
    //   40: invokestatic 24	com/google/android/gms/b/cf:U	()Ljava/lang/String;
    //   43: astore 4
    //   45: aload_2
    //   46: aload 4
    //   48: invokevirtual 300	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 305	java/io/File:exists	()Z
    //   56: istore_1
    //   57: iload_1
    //   58: ifne +8 -> 66
    //   61: aload_3
    //   62: astore_2
    //   63: goto -38 -> 25
    //   66: iconst_5
    //   67: istore 5
    //   69: iconst_0
    //   70: istore_1
    //   71: aconst_null
    //   72: astore_2
    //   73: iconst_0
    //   74: istore 6
    //   76: iconst_5
    //   77: istore_1
    //   78: iload 6
    //   80: iload_1
    //   81: if_icmpge +1030 -> 1111
    //   84: iconst_0
    //   85: istore 7
    //   87: aconst_null
    //   88: astore 4
    //   90: aload_0
    //   91: invokespecial 68	com/google/android/gms/b/cs:y	()Landroid/database/sqlite/SQLiteDatabase;
    //   94: astore_2
    //   95: aload_2
    //   96: ifnonnull +27 -> 123
    //   99: iconst_1
    //   100: istore 7
    //   102: aload_0
    //   103: iload 7
    //   105: putfield 38	com/google/android/gms/b/cs:b	Z
    //   108: aload_2
    //   109: ifnull +7 -> 116
    //   112: aload_2
    //   113: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   116: iconst_0
    //   117: istore_1
    //   118: aconst_null
    //   119: astore_2
    //   120: goto -95 -> 25
    //   123: aload_2
    //   124: invokevirtual 77	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   127: ldc 117
    //   129: astore 4
    //   131: iconst_3
    //   132: istore 8
    //   134: iload 8
    //   136: anewarray 121	java/lang/String
    //   139: astore 9
    //   141: iconst_0
    //   142: istore 10
    //   144: aconst_null
    //   145: astore 11
    //   147: ldc_w 308
    //   150: astore 12
    //   152: aload 9
    //   154: iconst_0
    //   155: aload 12
    //   157: aastore
    //   158: iconst_1
    //   159: istore 10
    //   161: ldc 44
    //   163: astore 12
    //   165: aload 9
    //   167: iload 10
    //   169: aload 12
    //   171: aastore
    //   172: iconst_2
    //   173: istore 10
    //   175: ldc 56
    //   177: astore 12
    //   179: aload 9
    //   181: iload 10
    //   183: aload 12
    //   185: aastore
    //   186: iconst_0
    //   187: istore 10
    //   189: aconst_null
    //   190: astore 11
    //   192: aconst_null
    //   193: astore 12
    //   195: iconst_0
    //   196: istore 13
    //   198: aconst_null
    //   199: astore 14
    //   201: aconst_null
    //   202: astore 15
    //   204: ldc_w 310
    //   207: astore 16
    //   209: bipush 100
    //   211: istore 17
    //   213: iload 17
    //   215: invokestatic 314	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   218: astore 18
    //   220: aload_2
    //   221: aload 4
    //   223: aload 9
    //   225: aconst_null
    //   226: aconst_null
    //   227: aconst_null
    //   228: aconst_null
    //   229: aload 16
    //   231: aload 18
    //   233: invokevirtual 318	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   236: astore 15
    //   238: iconst_m1
    //   239: i2l
    //   240: lstore 19
    //   242: aload 15
    //   244: invokeinterface 321 1 0
    //   249: istore 7
    //   251: iload 7
    //   253: ifeq +682 -> 935
    //   256: iconst_0
    //   257: istore 7
    //   259: aconst_null
    //   260: astore 4
    //   262: aload 15
    //   264: iconst_0
    //   265: invokeinterface 93 2 0
    //   270: lstore 21
    //   272: iconst_1
    //   273: istore 7
    //   275: aload 15
    //   277: iload 7
    //   279: invokeinterface 325 2 0
    //   284: istore 7
    //   286: iconst_2
    //   287: istore 8
    //   289: aload 15
    //   291: iload 8
    //   293: invokeinterface 329 2 0
    //   298: astore 11
    //   300: iload 7
    //   302: ifne +209 -> 511
    //   305: invokestatic 206	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   308: astore 9
    //   310: iconst_0
    //   311: istore 7
    //   313: aconst_null
    //   314: astore 4
    //   316: aload 11
    //   318: arraylength
    //   319: istore 23
    //   321: aload 9
    //   323: aload 11
    //   325: iconst_0
    //   326: iload 23
    //   328: invokevirtual 333	android/os/Parcel:unmarshall	([BII)V
    //   331: iconst_0
    //   332: istore 7
    //   334: aconst_null
    //   335: astore 4
    //   337: aload 9
    //   339: iconst_0
    //   340: invokevirtual 337	android/os/Parcel:setDataPosition	(I)V
    //   343: getstatic 341	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   346: astore 4
    //   348: aload 4
    //   350: aload 9
    //   352: invokeinterface 347 2 0
    //   357: astore 4
    //   359: aload 4
    //   361: checkcast 208	com/google/android/gms/b/cn
    //   364: astore 4
    //   366: aload 9
    //   368: invokevirtual 219	android/os/Parcel:recycle	()V
    //   371: aload 4
    //   373: ifnull +12 -> 385
    //   376: aload_3
    //   377: aload 4
    //   379: invokeinterface 353 2 0
    //   384: pop
    //   385: lload 21
    //   387: lstore 19
    //   389: goto -147 -> 242
    //   392: astore 4
    //   394: aload_0
    //   395: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   398: astore 4
    //   400: aload 4
    //   402: getfield 106	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   405: astore 4
    //   407: ldc_w 355
    //   410: astore 11
    //   412: aload 4
    //   414: aload 11
    //   416: invokevirtual 113	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   419: aload 9
    //   421: invokevirtual 219	android/os/Parcel:recycle	()V
    //   424: lload 21
    //   426: lstore 19
    //   428: goto -186 -> 242
    //   431: astore 4
    //   433: aload 9
    //   435: invokevirtual 219	android/os/Parcel:recycle	()V
    //   438: aload 4
    //   440: athrow
    //   441: astore 24
    //   443: aload_2
    //   444: astore 4
    //   446: aload 24
    //   448: astore_2
    //   449: aload_0
    //   450: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   453: astore 9
    //   455: aload 9
    //   457: getfield 106	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   460: astore 9
    //   462: ldc_w 357
    //   465: astore 11
    //   467: aload 9
    //   469: aload 11
    //   471: aload_2
    //   472: invokevirtual 154	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   475: iconst_1
    //   476: istore_1
    //   477: aload_0
    //   478: iload_1
    //   479: putfield 38	com/google/android/gms/b/cs:b	Z
    //   482: aload 4
    //   484: ifnull +665 -> 1149
    //   487: aload 4
    //   489: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   492: iload 5
    //   494: istore_1
    //   495: iload 6
    //   497: iconst_1
    //   498: iadd
    //   499: istore 7
    //   501: iload 7
    //   503: istore 6
    //   505: iload_1
    //   506: istore 5
    //   508: goto -432 -> 76
    //   511: iconst_1
    //   512: istore 8
    //   514: iload 7
    //   516: iload 8
    //   518: if_icmpne +211 -> 729
    //   521: invokestatic 206	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   524: astore 16
    //   526: iconst_0
    //   527: istore 8
    //   529: aconst_null
    //   530: astore 9
    //   532: iconst_0
    //   533: istore 7
    //   535: aconst_null
    //   536: astore 4
    //   538: aload 11
    //   540: arraylength
    //   541: istore 17
    //   543: aload 16
    //   545: aload 11
    //   547: iconst_0
    //   548: iload 17
    //   550: invokevirtual 333	android/os/Parcel:unmarshall	([BII)V
    //   553: iconst_0
    //   554: istore 7
    //   556: aconst_null
    //   557: astore 4
    //   559: aload 16
    //   561: iconst_0
    //   562: invokevirtual 337	android/os/Parcel:setDataPosition	(I)V
    //   565: getstatic 358	com/google/android/gms/b/do:CREATOR	Landroid/os/Parcelable$Creator;
    //   568: astore 4
    //   570: aload 4
    //   572: aload 16
    //   574: invokeinterface 347 2 0
    //   579: astore 4
    //   581: aload 4
    //   583: checkcast 223	com/google/android/gms/b/do
    //   586: astore 4
    //   588: aload 16
    //   590: invokevirtual 219	android/os/Parcel:recycle	()V
    //   593: aload 4
    //   595: ifnull +12 -> 607
    //   598: aload_3
    //   599: aload 4
    //   601: invokeinterface 353 2 0
    //   606: pop
    //   607: lload 21
    //   609: lstore 19
    //   611: goto -369 -> 242
    //   614: astore 4
    //   616: aload_0
    //   617: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   620: astore 4
    //   622: aload 4
    //   624: getfield 106	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   627: astore 4
    //   629: ldc_w 360
    //   632: astore 11
    //   634: aload 4
    //   636: aload 11
    //   638: invokevirtual 113	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   641: aload 16
    //   643: invokevirtual 219	android/os/Parcel:recycle	()V
    //   646: iconst_0
    //   647: istore 7
    //   649: aconst_null
    //   650: astore 4
    //   652: goto -59 -> 593
    //   655: astore 4
    //   657: aload 16
    //   659: invokevirtual 219	android/os/Parcel:recycle	()V
    //   662: aload 4
    //   664: athrow
    //   665: astore 24
    //   667: aload_2
    //   668: astore 4
    //   670: aload 24
    //   672: astore_2
    //   673: getstatic 160	android/os/Build$VERSION:SDK_INT	I
    //   676: istore 8
    //   678: bipush 11
    //   680: istore 10
    //   682: iload 8
    //   684: iload 10
    //   686: if_icmplt +364 -> 1050
    //   689: aload_2
    //   690: instanceof 163
    //   693: istore 8
    //   695: iload 8
    //   697: ifeq +353 -> 1050
    //   700: iload 5
    //   702: i2l
    //   703: lstore 19
    //   705: lload 19
    //   707: invokestatic 169	android/os/SystemClock:sleep	(J)V
    //   710: iload 5
    //   712: bipush 20
    //   714: iadd
    //   715: istore_1
    //   716: aload 4
    //   718: ifnull -223 -> 495
    //   721: aload 4
    //   723: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   726: goto -231 -> 495
    //   729: iconst_2
    //   730: istore 8
    //   732: iload 7
    //   734: iload 8
    //   736: if_icmpne +167 -> 903
    //   739: invokestatic 206	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   742: astore 16
    //   744: iconst_0
    //   745: istore 8
    //   747: aconst_null
    //   748: astore 9
    //   750: iconst_0
    //   751: istore 7
    //   753: aconst_null
    //   754: astore 4
    //   756: aload 11
    //   758: arraylength
    //   759: istore 17
    //   761: aload 16
    //   763: aload 11
    //   765: iconst_0
    //   766: iload 17
    //   768: invokevirtual 333	android/os/Parcel:unmarshall	([BII)V
    //   771: iconst_0
    //   772: istore 7
    //   774: aconst_null
    //   775: astore 4
    //   777: aload 16
    //   779: iconst_0
    //   780: invokevirtual 337	android/os/Parcel:setDataPosition	(I)V
    //   783: getstatic 363	com/google/android/gms/b/cd:CREATOR	Landroid/os/Parcelable$Creator;
    //   786: astore 4
    //   788: aload 4
    //   790: aload 16
    //   792: invokeinterface 347 2 0
    //   797: astore 4
    //   799: aload 4
    //   801: checkcast 362	com/google/android/gms/b/cd
    //   804: astore 4
    //   806: aload 16
    //   808: invokevirtual 219	android/os/Parcel:recycle	()V
    //   811: aload 4
    //   813: ifnull +12 -> 825
    //   816: aload_3
    //   817: aload 4
    //   819: invokeinterface 353 2 0
    //   824: pop
    //   825: lload 21
    //   827: lstore 19
    //   829: goto -587 -> 242
    //   832: astore 4
    //   834: aload_0
    //   835: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   838: astore 4
    //   840: aload 4
    //   842: getfield 106	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   845: astore 4
    //   847: ldc_w 360
    //   850: astore 11
    //   852: aload 4
    //   854: aload 11
    //   856: invokevirtual 113	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   859: aload 16
    //   861: invokevirtual 219	android/os/Parcel:recycle	()V
    //   864: iconst_0
    //   865: istore 7
    //   867: aconst_null
    //   868: astore 4
    //   870: goto -59 -> 811
    //   873: astore 4
    //   875: aload 16
    //   877: invokevirtual 219	android/os/Parcel:recycle	()V
    //   880: aload 4
    //   882: athrow
    //   883: astore 24
    //   885: aload_2
    //   886: astore 4
    //   888: aload 24
    //   890: astore_2
    //   891: aload 4
    //   893: ifnull +8 -> 901
    //   896: aload 4
    //   898: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   901: aload_2
    //   902: athrow
    //   903: aload_0
    //   904: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   907: astore 4
    //   909: aload 4
    //   911: getfield 106	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   914: astore 4
    //   916: ldc_w 365
    //   919: astore 9
    //   921: aload 4
    //   923: aload 9
    //   925: invokevirtual 113	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   928: lload 21
    //   930: lstore 19
    //   932: goto -690 -> 242
    //   935: aload 15
    //   937: invokeinterface 366 1 0
    //   942: ldc 117
    //   944: astore 4
    //   946: ldc_w 368
    //   949: astore 12
    //   951: iconst_1
    //   952: istore 13
    //   954: iload 13
    //   956: anewarray 121	java/lang/String
    //   959: astore 14
    //   961: aconst_null
    //   962: astore 15
    //   964: lload 19
    //   966: invokestatic 127	java/lang/Long:toString	(J)Ljava/lang/String;
    //   969: astore 9
    //   971: aload 14
    //   973: iconst_0
    //   974: aload 9
    //   976: aastore
    //   977: aload_2
    //   978: aload 4
    //   980: aload 12
    //   982: aload 14
    //   984: invokevirtual 131	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   987: istore 7
    //   989: aload_3
    //   990: invokeinterface 371 1 0
    //   995: istore 8
    //   997: iload 7
    //   999: iload 8
    //   1001: if_icmpge +28 -> 1029
    //   1004: aload_0
    //   1005: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   1008: astore 4
    //   1010: aload 4
    //   1012: getfield 106	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   1015: astore 4
    //   1017: ldc_w 373
    //   1020: astore 9
    //   1022: aload 4
    //   1024: aload 9
    //   1026: invokevirtual 113	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   1029: aload_2
    //   1030: invokevirtual 146	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   1033: aload_2
    //   1034: invokevirtual 149	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   1037: aload_2
    //   1038: ifnull +7 -> 1045
    //   1041: aload_2
    //   1042: invokevirtual 74	android/database/sqlite/SQLiteDatabase:close	()V
    //   1045: aload_3
    //   1046: astore_2
    //   1047: goto -1022 -> 25
    //   1050: aload 4
    //   1052: ifnull +20 -> 1072
    //   1055: aload 4
    //   1057: invokevirtual 172	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   1060: istore 8
    //   1062: iload 8
    //   1064: ifeq +8 -> 1072
    //   1067: aload 4
    //   1069: invokevirtual 149	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   1072: aload_0
    //   1073: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   1076: astore 9
    //   1078: aload 9
    //   1080: getfield 106	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   1083: astore 9
    //   1085: ldc_w 357
    //   1088: astore 11
    //   1090: aload 9
    //   1092: aload 11
    //   1094: aload_2
    //   1095: invokevirtual 154	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   1098: iconst_1
    //   1099: istore_1
    //   1100: aload_0
    //   1101: iload_1
    //   1102: putfield 38	com/google/android/gms/b/cs:b	Z
    //   1105: iload 5
    //   1107: istore_1
    //   1108: goto -392 -> 716
    //   1111: aload_0
    //   1112: invokespecial 101	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   1115: getfield 174	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   1118: astore_2
    //   1119: ldc_w 375
    //   1122: astore 4
    //   1124: aload_2
    //   1125: aload 4
    //   1127: invokevirtual 113	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   1130: iconst_0
    //   1131: istore_1
    //   1132: aconst_null
    //   1133: astore_2
    //   1134: goto -1109 -> 25
    //   1137: astore_2
    //   1138: goto -247 -> 891
    //   1141: astore_2
    //   1142: goto -469 -> 673
    //   1145: astore_2
    //   1146: goto -697 -> 449
    //   1149: iload 5
    //   1151: istore_1
    //   1152: goto -657 -> 495
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1155	0	this	cs
    //   11	1	1	i	int
    //   16	55	1	bool1	boolean
    //   77	1075	1	j	int
    //   24	1110	2	localObject1	Object
    //   1137	1	2	localObject2	Object
    //   1141	1	2	localSQLiteException1	SQLiteException
    //   1145	1	2	localSQLiteFullException1	SQLiteFullException
    //   30	1016	3	localArrayList	java.util.ArrayList
    //   43	335	4	localObject3	Object
    //   392	1	4	locala1	com.google.android.gms.common.internal.safeparcel.b.a
    //   398	15	4	localObject4	Object
    //   431	8	4	localObject5	Object
    //   444	156	4	localObject6	Object
    //   614	1	4	locala2	com.google.android.gms.common.internal.safeparcel.b.a
    //   620	31	4	localObject7	Object
    //   655	8	4	localObject8	Object
    //   668	150	4	localObject9	Object
    //   832	1	4	locala3	com.google.android.gms.common.internal.safeparcel.b.a
    //   838	31	4	localObject10	Object
    //   873	8	4	localObject11	Object
    //   886	240	4	localObject12	Object
    //   67	1083	5	k	int
    //   74	430	6	m	int
    //   85	193	7	n	int
    //   284	718	7	i1	int
    //   132	555	8	i2	int
    //   693	3	8	bool2	boolean
    //   730	272	8	i3	int
    //   1060	3	8	bool3	boolean
    //   139	952	9	localObject13	Object
    //   142	545	10	i4	int
    //   145	948	11	localObject14	Object
    //   150	831	12	str1	String
    //   196	759	13	i5	int
    //   199	784	14	arrayOfString	String[]
    //   202	761	15	localCursor	Cursor
    //   207	669	16	localObject15	Object
    //   211	556	17	i6	int
    //   218	14	18	str2	String
    //   240	725	19	l1	long
    //   270	659	21	l2	long
    //   319	8	23	i7	int
    //   441	6	24	localSQLiteFullException2	SQLiteFullException
    //   665	6	24	localSQLiteException2	SQLiteException
    //   883	6	24	localObject16	Object
    // Exception table:
    //   from	to	target	type
    //   316	319	392	com/google/android/gms/common/internal/safeparcel/b$a
    //   326	331	392	com/google/android/gms/common/internal/safeparcel/b$a
    //   339	343	392	com/google/android/gms/common/internal/safeparcel/b$a
    //   343	346	392	com/google/android/gms/common/internal/safeparcel/b$a
    //   350	357	392	com/google/android/gms/common/internal/safeparcel/b$a
    //   359	364	392	com/google/android/gms/common/internal/safeparcel/b$a
    //   316	319	431	finally
    //   326	331	431	finally
    //   339	343	431	finally
    //   343	346	431	finally
    //   350	357	431	finally
    //   359	364	431	finally
    //   394	398	431	finally
    //   400	405	431	finally
    //   414	419	431	finally
    //   103	108	441	android/database/sqlite/SQLiteFullException
    //   123	127	441	android/database/sqlite/SQLiteFullException
    //   134	139	441	android/database/sqlite/SQLiteFullException
    //   155	158	441	android/database/sqlite/SQLiteFullException
    //   169	172	441	android/database/sqlite/SQLiteFullException
    //   183	186	441	android/database/sqlite/SQLiteFullException
    //   213	218	441	android/database/sqlite/SQLiteFullException
    //   231	236	441	android/database/sqlite/SQLiteFullException
    //   242	249	441	android/database/sqlite/SQLiteFullException
    //   264	270	441	android/database/sqlite/SQLiteFullException
    //   277	284	441	android/database/sqlite/SQLiteFullException
    //   291	298	441	android/database/sqlite/SQLiteFullException
    //   305	308	441	android/database/sqlite/SQLiteFullException
    //   366	371	441	android/database/sqlite/SQLiteFullException
    //   377	385	441	android/database/sqlite/SQLiteFullException
    //   419	424	441	android/database/sqlite/SQLiteFullException
    //   433	438	441	android/database/sqlite/SQLiteFullException
    //   438	441	441	android/database/sqlite/SQLiteFullException
    //   521	524	441	android/database/sqlite/SQLiteFullException
    //   588	593	441	android/database/sqlite/SQLiteFullException
    //   599	607	441	android/database/sqlite/SQLiteFullException
    //   641	646	441	android/database/sqlite/SQLiteFullException
    //   657	662	441	android/database/sqlite/SQLiteFullException
    //   662	665	441	android/database/sqlite/SQLiteFullException
    //   739	742	441	android/database/sqlite/SQLiteFullException
    //   806	811	441	android/database/sqlite/SQLiteFullException
    //   817	825	441	android/database/sqlite/SQLiteFullException
    //   859	864	441	android/database/sqlite/SQLiteFullException
    //   875	880	441	android/database/sqlite/SQLiteFullException
    //   880	883	441	android/database/sqlite/SQLiteFullException
    //   903	907	441	android/database/sqlite/SQLiteFullException
    //   909	914	441	android/database/sqlite/SQLiteFullException
    //   923	928	441	android/database/sqlite/SQLiteFullException
    //   935	942	441	android/database/sqlite/SQLiteFullException
    //   954	959	441	android/database/sqlite/SQLiteFullException
    //   964	969	441	android/database/sqlite/SQLiteFullException
    //   974	977	441	android/database/sqlite/SQLiteFullException
    //   982	987	441	android/database/sqlite/SQLiteFullException
    //   989	995	441	android/database/sqlite/SQLiteFullException
    //   1004	1008	441	android/database/sqlite/SQLiteFullException
    //   1010	1015	441	android/database/sqlite/SQLiteFullException
    //   1024	1029	441	android/database/sqlite/SQLiteFullException
    //   1029	1033	441	android/database/sqlite/SQLiteFullException
    //   1033	1037	441	android/database/sqlite/SQLiteFullException
    //   538	541	614	com/google/android/gms/common/internal/safeparcel/b$a
    //   548	553	614	com/google/android/gms/common/internal/safeparcel/b$a
    //   561	565	614	com/google/android/gms/common/internal/safeparcel/b$a
    //   565	568	614	com/google/android/gms/common/internal/safeparcel/b$a
    //   572	579	614	com/google/android/gms/common/internal/safeparcel/b$a
    //   581	586	614	com/google/android/gms/common/internal/safeparcel/b$a
    //   538	541	655	finally
    //   548	553	655	finally
    //   561	565	655	finally
    //   565	568	655	finally
    //   572	579	655	finally
    //   581	586	655	finally
    //   616	620	655	finally
    //   622	627	655	finally
    //   636	641	655	finally
    //   103	108	665	android/database/sqlite/SQLiteException
    //   123	127	665	android/database/sqlite/SQLiteException
    //   134	139	665	android/database/sqlite/SQLiteException
    //   155	158	665	android/database/sqlite/SQLiteException
    //   169	172	665	android/database/sqlite/SQLiteException
    //   183	186	665	android/database/sqlite/SQLiteException
    //   213	218	665	android/database/sqlite/SQLiteException
    //   231	236	665	android/database/sqlite/SQLiteException
    //   242	249	665	android/database/sqlite/SQLiteException
    //   264	270	665	android/database/sqlite/SQLiteException
    //   277	284	665	android/database/sqlite/SQLiteException
    //   291	298	665	android/database/sqlite/SQLiteException
    //   305	308	665	android/database/sqlite/SQLiteException
    //   366	371	665	android/database/sqlite/SQLiteException
    //   377	385	665	android/database/sqlite/SQLiteException
    //   419	424	665	android/database/sqlite/SQLiteException
    //   433	438	665	android/database/sqlite/SQLiteException
    //   438	441	665	android/database/sqlite/SQLiteException
    //   521	524	665	android/database/sqlite/SQLiteException
    //   588	593	665	android/database/sqlite/SQLiteException
    //   599	607	665	android/database/sqlite/SQLiteException
    //   641	646	665	android/database/sqlite/SQLiteException
    //   657	662	665	android/database/sqlite/SQLiteException
    //   662	665	665	android/database/sqlite/SQLiteException
    //   739	742	665	android/database/sqlite/SQLiteException
    //   806	811	665	android/database/sqlite/SQLiteException
    //   817	825	665	android/database/sqlite/SQLiteException
    //   859	864	665	android/database/sqlite/SQLiteException
    //   875	880	665	android/database/sqlite/SQLiteException
    //   880	883	665	android/database/sqlite/SQLiteException
    //   903	907	665	android/database/sqlite/SQLiteException
    //   909	914	665	android/database/sqlite/SQLiteException
    //   923	928	665	android/database/sqlite/SQLiteException
    //   935	942	665	android/database/sqlite/SQLiteException
    //   954	959	665	android/database/sqlite/SQLiteException
    //   964	969	665	android/database/sqlite/SQLiteException
    //   974	977	665	android/database/sqlite/SQLiteException
    //   982	987	665	android/database/sqlite/SQLiteException
    //   989	995	665	android/database/sqlite/SQLiteException
    //   1004	1008	665	android/database/sqlite/SQLiteException
    //   1010	1015	665	android/database/sqlite/SQLiteException
    //   1024	1029	665	android/database/sqlite/SQLiteException
    //   1029	1033	665	android/database/sqlite/SQLiteException
    //   1033	1037	665	android/database/sqlite/SQLiteException
    //   756	759	832	com/google/android/gms/common/internal/safeparcel/b$a
    //   766	771	832	com/google/android/gms/common/internal/safeparcel/b$a
    //   779	783	832	com/google/android/gms/common/internal/safeparcel/b$a
    //   783	786	832	com/google/android/gms/common/internal/safeparcel/b$a
    //   790	797	832	com/google/android/gms/common/internal/safeparcel/b$a
    //   799	804	832	com/google/android/gms/common/internal/safeparcel/b$a
    //   756	759	873	finally
    //   766	771	873	finally
    //   779	783	873	finally
    //   783	786	873	finally
    //   790	797	873	finally
    //   799	804	873	finally
    //   834	838	873	finally
    //   840	845	873	finally
    //   854	859	873	finally
    //   103	108	883	finally
    //   123	127	883	finally
    //   134	139	883	finally
    //   155	158	883	finally
    //   169	172	883	finally
    //   183	186	883	finally
    //   213	218	883	finally
    //   231	236	883	finally
    //   242	249	883	finally
    //   264	270	883	finally
    //   277	284	883	finally
    //   291	298	883	finally
    //   305	308	883	finally
    //   366	371	883	finally
    //   377	385	883	finally
    //   419	424	883	finally
    //   433	438	883	finally
    //   438	441	883	finally
    //   521	524	883	finally
    //   588	593	883	finally
    //   599	607	883	finally
    //   641	646	883	finally
    //   657	662	883	finally
    //   662	665	883	finally
    //   739	742	883	finally
    //   806	811	883	finally
    //   817	825	883	finally
    //   859	864	883	finally
    //   875	880	883	finally
    //   880	883	883	finally
    //   903	907	883	finally
    //   909	914	883	finally
    //   923	928	883	finally
    //   935	942	883	finally
    //   954	959	883	finally
    //   964	969	883	finally
    //   974	977	883	finally
    //   982	987	883	finally
    //   989	995	883	finally
    //   1004	1008	883	finally
    //   1010	1015	883	finally
    //   1024	1029	883	finally
    //   1029	1033	883	finally
    //   1033	1037	883	finally
    //   90	94	1137	finally
    //   449	453	1137	finally
    //   455	460	1137	finally
    //   471	475	1137	finally
    //   478	482	1137	finally
    //   673	676	1137	finally
    //   705	710	1137	finally
    //   1055	1060	1137	finally
    //   1067	1072	1137	finally
    //   1072	1076	1137	finally
    //   1078	1083	1137	finally
    //   1094	1098	1137	finally
    //   1101	1105	1137	finally
    //   90	94	1141	android/database/sqlite/SQLiteException
    //   90	94	1145	android/database/sqlite/SQLiteFullException
  }
}


/* Location:              com/google/android/gms/b/cs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */