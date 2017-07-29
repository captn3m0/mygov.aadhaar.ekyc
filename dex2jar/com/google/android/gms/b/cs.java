package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.SystemClock;
import java.io.File;

public final class cs
  extends df
{
  private final a a = new a(super.n(), cf.U());
  private boolean b;
  
  cs(dc paramdc)
  {
    super(paramdc);
  }
  
  @TargetApi(11)
  private boolean a(int paramInt, byte[] paramArrayOfByte)
  {
    super.c();
    super.e();
    if (b) {
      return false;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("type", Integer.valueOf(paramInt));
    localContentValues.put("entry", paramArrayOfByte);
    cf.ah();
    int i = 0;
    paramInt = 5;
    while (i < 5)
    {
      Object localObject3 = null;
      paramArrayOfByte = null;
      Object localObject1 = null;
      try
      {
        SQLiteDatabase localSQLiteDatabase = y();
        if (localSQLiteDatabase == null)
        {
          localObject1 = localSQLiteDatabase;
          localObject3 = localSQLiteDatabase;
          paramArrayOfByte = localSQLiteDatabase;
          b = true;
          return false;
        }
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        paramArrayOfByte = localSQLiteDatabase;
        localSQLiteDatabase.beginTransaction();
        long l2 = 0L;
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        paramArrayOfByte = localSQLiteDatabase;
        Cursor localCursor = localSQLiteDatabase.rawQuery("select count(1) from messages", null);
        long l1 = l2;
        if (localCursor != null)
        {
          l1 = l2;
          localObject1 = localSQLiteDatabase;
          localObject3 = localSQLiteDatabase;
          paramArrayOfByte = localSQLiteDatabase;
          if (localCursor.moveToFirst())
          {
            localObject1 = localSQLiteDatabase;
            localObject3 = localSQLiteDatabase;
            paramArrayOfByte = localSQLiteDatabase;
            l1 = localCursor.getLong(0);
          }
        }
        if (l1 >= 100000L)
        {
          localObject1 = localSQLiteDatabase;
          localObject3 = localSQLiteDatabase;
          paramArrayOfByte = localSQLiteDatabase;
          ua.a("Data loss, local db full");
          l1 = 100000L - l1 + 1L;
          localObject1 = localSQLiteDatabase;
          localObject3 = localSQLiteDatabase;
          paramArrayOfByte = localSQLiteDatabase;
          l2 = localSQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[] { Long.toString(l1) });
          if (l2 != l1)
          {
            localObject1 = localSQLiteDatabase;
            localObject3 = localSQLiteDatabase;
            paramArrayOfByte = localSQLiteDatabase;
            ua.a("Different delete count than expected in local db. expected, received, difference", Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l1 - l2));
          }
        }
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        paramArrayOfByte = localSQLiteDatabase;
        localSQLiteDatabase.insertOrThrow("messages", null, localContentValues);
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        paramArrayOfByte = localSQLiteDatabase;
        localSQLiteDatabase.setTransactionSuccessful();
        localObject1 = localSQLiteDatabase;
        localObject3 = localSQLiteDatabase;
        paramArrayOfByte = localSQLiteDatabase;
        localSQLiteDatabase.endTransaction();
        return true;
      }
      catch (SQLiteFullException localSQLiteFullException)
      {
        paramArrayOfByte = (byte[])localObject1;
        ua.a("Error writing entry to local database", localSQLiteFullException);
        paramArrayOfByte = (byte[])localObject1;
        b = true;
        j = paramInt;
        if (localObject1 != null)
        {
          ((SQLiteDatabase)localObject1).close();
          j = paramInt;
        }
        i += 1;
        paramInt = j;
      }
      catch (SQLiteException localSQLiteException)
      {
        int j;
        paramArrayOfByte = localSQLiteFullException;
        if (Build.VERSION.SDK_INT >= 11)
        {
          paramArrayOfByte = localSQLiteFullException;
          if ((localSQLiteException instanceof SQLiteDatabaseLockedException))
          {
            paramArrayOfByte = localSQLiteFullException;
            SystemClock.sleep(paramInt);
            paramInt += 20;
          }
        }
        for (;;)
        {
          j = paramInt;
          if (localSQLiteFullException == null) {
            break;
          }
          localSQLiteFullException.close();
          j = paramInt;
          break;
          if (localSQLiteFullException != null)
          {
            paramArrayOfByte = localSQLiteFullException;
            if (localSQLiteFullException.inTransaction())
            {
              paramArrayOfByte = localSQLiteFullException;
              localSQLiteFullException.endTransaction();
            }
          }
          paramArrayOfByte = localSQLiteFullException;
          ua.a("Error writing entry to local database", localSQLiteException);
          paramArrayOfByte = localSQLiteFullException;
          b = true;
        }
      }
      finally
      {
        if (paramArrayOfByte != null) {
          paramArrayOfByte.close();
        }
      }
    }
    uc.a("Failed to write entry to local database");
    return false;
  }
  
  private SQLiteDatabase y()
  {
    int i = Build.VERSION.SDK_INT;
    if (b) {
      return null;
    }
    SQLiteDatabase localSQLiteDatabase = a.getWritableDatabase();
    if (localSQLiteDatabase == null)
    {
      b = true;
      return null;
    }
    return localSQLiteDatabase;
  }
  
  protected final void a() {}
  
  public final boolean a(cd paramcd)
  {
    int i = Build.VERSION.SDK_INT;
    super.q();
    paramcd = dr.a(paramcd);
    if (paramcd.length > 131072)
    {
      uc.a("Conditional user property too long for local database. Sending directly to service");
      return false;
    }
    return a(2, paramcd);
  }
  
  public final boolean a(cn paramcn)
  {
    int i = Build.VERSION.SDK_INT;
    Parcel localParcel = Parcel.obtain();
    paramcn.writeToParcel(localParcel, 0);
    paramcn = localParcel.marshall();
    localParcel.recycle();
    if (paramcn.length > 131072)
    {
      uc.a("Event is too long for local database. Sending event directly to service");
      return false;
    }
    return a(0, paramcn);
  }
  
  public final boolean a(do paramdo)
  {
    int i = Build.VERSION.SDK_INT;
    Parcel localParcel = Parcel.obtain();
    paramdo.writeToParcel(localParcel, 0);
    paramdo = localParcel.marshall();
    localParcel.recycle();
    if (paramdo.length > 131072)
    {
      uc.a("User property too long for local database. Sending directly to service");
      return false;
    }
    return a(1, paramdo);
  }
  
  /* Error */
  @TargetApi(11)
  public final java.util.List<com.google.android.gms.common.internal.safeparcel.a> x()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 45	com/google/android/gms/b/df:e	()V
    //   4: aload_0
    //   5: invokespecial 42	com/google/android/gms/b/df:c	()V
    //   8: getstatic 163	android/os/Build$VERSION:SDK_INT	I
    //   11: istore_1
    //   12: aload_0
    //   13: getfield 47	com/google/android/gms/b/cs:b	Z
    //   16: ifeq +5 -> 21
    //   19: aconst_null
    //   20: areturn
    //   21: new 296	java/util/ArrayList
    //   24: dup
    //   25: invokespecial 297	java/util/ArrayList:<init>	()V
    //   28: astore 11
    //   30: aload_0
    //   31: invokespecial 18	com/google/android/gms/b/df:n	()Landroid/content/Context;
    //   34: invokestatic 24	com/google/android/gms/b/cf:U	()Ljava/lang/String;
    //   37: invokevirtual 303	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   40: invokevirtual 308	java/io/File:exists	()Z
    //   43: ifne +6 -> 49
    //   46: aload 11
    //   48: areturn
    //   49: iconst_5
    //   50: istore_1
    //   51: iconst_0
    //   52: istore_3
    //   53: iload_3
    //   54: iconst_5
    //   55: if_icmpge +710 -> 765
    //   58: aconst_null
    //   59: astore 10
    //   61: aconst_null
    //   62: astore 6
    //   64: aconst_null
    //   65: astore 9
    //   67: aload_0
    //   68: invokespecial 76	com/google/android/gms/b/cs:y	()Landroid/database/sqlite/SQLiteDatabase;
    //   71: astore 7
    //   73: aload 7
    //   75: ifnonnull +20 -> 95
    //   78: aload_0
    //   79: iconst_1
    //   80: putfield 47	com/google/android/gms/b/cs:b	Z
    //   83: aload 7
    //   85: ifnull +8 -> 93
    //   88: aload 7
    //   90: invokevirtual 81	android/database/sqlite/SQLiteDatabase:close	()V
    //   93: aconst_null
    //   94: areturn
    //   95: aload 7
    //   97: invokevirtual 84	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   100: bipush 100
    //   102: invokestatic 311	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   105: astore 6
    //   107: aload 7
    //   109: ldc 120
    //   111: iconst_3
    //   112: anewarray 124	java/lang/String
    //   115: dup
    //   116: iconst_0
    //   117: ldc_w 313
    //   120: aastore
    //   121: dup
    //   122: iconst_1
    //   123: ldc 53
    //   125: aastore
    //   126: dup
    //   127: iconst_2
    //   128: ldc 65
    //   130: aastore
    //   131: aconst_null
    //   132: aconst_null
    //   133: aconst_null
    //   134: aconst_null
    //   135: ldc_w 315
    //   138: aload 6
    //   140: invokevirtual 319	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   143: astore 8
    //   145: ldc2_w 320
    //   148: lstore 4
    //   150: aload 8
    //   152: invokeinterface 324 1 0
    //   157: ifeq +474 -> 631
    //   160: aload 8
    //   162: iconst_0
    //   163: invokeinterface 100 2 0
    //   168: lstore 4
    //   170: aload 8
    //   172: iconst_1
    //   173: invokeinterface 328 2 0
    //   178: istore_2
    //   179: aload 8
    //   181: iconst_2
    //   182: invokeinterface 332 2 0
    //   187: astore 10
    //   189: iload_2
    //   190: ifne +143 -> 333
    //   193: invokestatic 204	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   196: astore 6
    //   198: aload 6
    //   200: aload 10
    //   202: iconst_0
    //   203: aload 10
    //   205: arraylength
    //   206: invokevirtual 336	android/os/Parcel:unmarshall	([BII)V
    //   209: aload 6
    //   211: iconst_0
    //   212: invokevirtual 340	android/os/Parcel:setDataPosition	(I)V
    //   215: getstatic 344	com/google/android/gms/b/cn:CREATOR	Landroid/os/Parcelable$Creator;
    //   218: aload 6
    //   220: invokeinterface 350 2 0
    //   225: checkcast 206	com/google/android/gms/b/cn
    //   228: astore 9
    //   230: aload 6
    //   232: invokevirtual 217	android/os/Parcel:recycle	()V
    //   235: aload 9
    //   237: ifnull +13 -> 250
    //   240: aload 11
    //   242: aload 9
    //   244: invokeinterface 356 2 0
    //   249: pop
    //   250: goto -100 -> 150
    //   253: astore 9
    //   255: aload_0
    //   256: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   259: getfield 111	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   262: ldc_w 358
    //   265: invokevirtual 118	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   268: aload 6
    //   270: invokevirtual 217	android/os/Parcel:recycle	()V
    //   273: goto -123 -> 150
    //   276: astore 8
    //   278: aload 6
    //   280: invokevirtual 217	android/os/Parcel:recycle	()V
    //   283: aload 8
    //   285: athrow
    //   286: astore 8
    //   288: aload 7
    //   290: astore 6
    //   292: aload_0
    //   293: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   296: getfield 111	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   299: ldc_w 360
    //   302: aload 8
    //   304: invokevirtual 157	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   307: aload 7
    //   309: astore 6
    //   311: aload_0
    //   312: iconst_1
    //   313: putfield 47	com/google/android/gms/b/cs:b	Z
    //   316: aload 7
    //   318: ifnull +489 -> 807
    //   321: aload 7
    //   323: invokevirtual 81	android/database/sqlite/SQLiteDatabase:close	()V
    //   326: iload_3
    //   327: iconst_1
    //   328: iadd
    //   329: istore_3
    //   330: goto -277 -> 53
    //   333: iload_2
    //   334: iconst_1
    //   335: if_icmpne +156 -> 491
    //   338: invokestatic 204	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   341: astore 9
    //   343: aload 9
    //   345: aload 10
    //   347: iconst_0
    //   348: aload 10
    //   350: arraylength
    //   351: invokevirtual 336	android/os/Parcel:unmarshall	([BII)V
    //   354: aload 9
    //   356: iconst_0
    //   357: invokevirtual 340	android/os/Parcel:setDataPosition	(I)V
    //   360: getstatic 361	com/google/android/gms/b/do:CREATOR	Landroid/os/Parcelable$Creator;
    //   363: aload 9
    //   365: invokeinterface 350 2 0
    //   370: checkcast 222	com/google/android/gms/b/do
    //   373: astore 6
    //   375: aload 9
    //   377: invokevirtual 217	android/os/Parcel:recycle	()V
    //   380: aload 6
    //   382: ifnull +13 -> 395
    //   385: aload 11
    //   387: aload 6
    //   389: invokeinterface 356 2 0
    //   394: pop
    //   395: goto -245 -> 150
    //   398: astore 6
    //   400: aload_0
    //   401: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   404: getfield 111	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   407: ldc_w 363
    //   410: invokevirtual 118	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   413: aload 9
    //   415: invokevirtual 217	android/os/Parcel:recycle	()V
    //   418: aconst_null
    //   419: astore 6
    //   421: goto -41 -> 380
    //   424: astore 6
    //   426: aload 9
    //   428: invokevirtual 217	android/os/Parcel:recycle	()V
    //   431: aload 6
    //   433: athrow
    //   434: astore 8
    //   436: aload 7
    //   438: astore 6
    //   440: getstatic 163	android/os/Build$VERSION:SDK_INT	I
    //   443: bipush 11
    //   445: if_icmplt +261 -> 706
    //   448: aload 7
    //   450: astore 6
    //   452: aload 8
    //   454: instanceof 165
    //   457: ifeq +249 -> 706
    //   460: aload 7
    //   462: astore 6
    //   464: iload_1
    //   465: i2l
    //   466: invokestatic 171	android/os/SystemClock:sleep	(J)V
    //   469: iload_1
    //   470: bipush 20
    //   472: iadd
    //   473: istore_2
    //   474: iload_2
    //   475: istore_1
    //   476: aload 7
    //   478: ifnull -152 -> 326
    //   481: aload 7
    //   483: invokevirtual 81	android/database/sqlite/SQLiteDatabase:close	()V
    //   486: iload_2
    //   487: istore_1
    //   488: goto -162 -> 326
    //   491: iload_2
    //   492: iconst_2
    //   493: if_icmpne +122 -> 615
    //   496: invokestatic 204	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   499: astore 9
    //   501: aload 9
    //   503: aload 10
    //   505: iconst_0
    //   506: aload 10
    //   508: arraylength
    //   509: invokevirtual 336	android/os/Parcel:unmarshall	([BII)V
    //   512: aload 9
    //   514: iconst_0
    //   515: invokevirtual 340	android/os/Parcel:setDataPosition	(I)V
    //   518: getstatic 366	com/google/android/gms/b/cd:CREATOR	Landroid/os/Parcelable$Creator;
    //   521: aload 9
    //   523: invokeinterface 350 2 0
    //   528: checkcast 365	com/google/android/gms/b/cd
    //   531: astore 6
    //   533: aload 9
    //   535: invokevirtual 217	android/os/Parcel:recycle	()V
    //   538: aload 6
    //   540: ifnull +13 -> 553
    //   543: aload 11
    //   545: aload 6
    //   547: invokeinterface 356 2 0
    //   552: pop
    //   553: goto -403 -> 150
    //   556: astore 6
    //   558: aload_0
    //   559: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   562: getfield 111	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   565: ldc_w 363
    //   568: invokevirtual 118	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   571: aload 9
    //   573: invokevirtual 217	android/os/Parcel:recycle	()V
    //   576: aconst_null
    //   577: astore 6
    //   579: goto -41 -> 538
    //   582: astore 6
    //   584: aload 9
    //   586: invokevirtual 217	android/os/Parcel:recycle	()V
    //   589: aload 6
    //   591: athrow
    //   592: astore 6
    //   594: aload 7
    //   596: astore 8
    //   598: aload 6
    //   600: astore 7
    //   602: aload 8
    //   604: ifnull +8 -> 612
    //   607: aload 8
    //   609: invokevirtual 81	android/database/sqlite/SQLiteDatabase:close	()V
    //   612: aload 7
    //   614: athrow
    //   615: aload_0
    //   616: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   619: getfield 111	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   622: ldc_w 368
    //   625: invokevirtual 118	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   628: goto -478 -> 150
    //   631: aload 8
    //   633: invokeinterface 369 1 0
    //   638: aload 7
    //   640: ldc 120
    //   642: ldc_w 371
    //   645: iconst_1
    //   646: anewarray 124	java/lang/String
    //   649: dup
    //   650: iconst_0
    //   651: lload 4
    //   653: invokestatic 130	java/lang/Long:toString	(J)Ljava/lang/String;
    //   656: aastore
    //   657: invokevirtual 134	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   660: aload 11
    //   662: invokeinterface 374 1 0
    //   667: if_icmpge +16 -> 683
    //   670: aload_0
    //   671: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   674: getfield 111	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   677: ldc_w 376
    //   680: invokevirtual 118	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   683: aload 7
    //   685: invokevirtual 149	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   688: aload 7
    //   690: invokevirtual 152	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   693: aload 7
    //   695: ifnull +8 -> 703
    //   698: aload 7
    //   700: invokevirtual 81	android/database/sqlite/SQLiteDatabase:close	()V
    //   703: aload 11
    //   705: areturn
    //   706: aload 7
    //   708: ifnull +24 -> 732
    //   711: aload 7
    //   713: astore 6
    //   715: aload 7
    //   717: invokevirtual 174	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   720: ifeq +12 -> 732
    //   723: aload 7
    //   725: astore 6
    //   727: aload 7
    //   729: invokevirtual 152	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   732: aload 7
    //   734: astore 6
    //   736: aload_0
    //   737: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   740: getfield 111	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   743: ldc_w 360
    //   746: aload 8
    //   748: invokevirtual 157	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   751: aload 7
    //   753: astore 6
    //   755: aload_0
    //   756: iconst_1
    //   757: putfield 47	com/google/android/gms/b/cs:b	Z
    //   760: iload_1
    //   761: istore_2
    //   762: goto -288 -> 474
    //   765: aload_0
    //   766: invokespecial 106	com/google/android/gms/b/df:u	()Lcom/google/android/gms/b/cu;
    //   769: getfield 176	com/google/android/gms/b/cu:c	Lcom/google/android/gms/b/cu$a;
    //   772: ldc_w 378
    //   775: invokevirtual 118	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;)V
    //   778: aconst_null
    //   779: areturn
    //   780: astore 7
    //   782: aload 6
    //   784: astore 8
    //   786: goto -184 -> 602
    //   789: astore 8
    //   791: aload 10
    //   793: astore 7
    //   795: goto -359 -> 436
    //   798: astore 8
    //   800: aload 9
    //   802: astore 7
    //   804: goto -516 -> 288
    //   807: goto -481 -> 326
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	810	0	this	cs
    //   11	750	1	i	int
    //   178	584	2	j	int
    //   52	278	3	k	int
    //   148	504	4	l	long
    //   62	326	6	localObject1	Object
    //   398	1	6	locala1	com.google.android.gms.common.internal.safeparcel.b.a
    //   419	1	6	localObject2	Object
    //   424	8	6	localObject3	Object
    //   438	108	6	localObject4	Object
    //   556	1	6	locala2	com.google.android.gms.common.internal.safeparcel.b.a
    //   577	1	6	localObject5	Object
    //   582	8	6	localObject6	Object
    //   592	7	6	localObject7	Object
    //   713	70	6	localObject8	Object
    //   71	681	7	localObject9	Object
    //   780	1	7	localObject10	Object
    //   793	10	7	localObject11	Object
    //   143	37	8	localCursor	Cursor
    //   276	8	8	localObject12	Object
    //   286	17	8	localSQLiteFullException1	SQLiteFullException
    //   434	19	8	localSQLiteException1	SQLiteException
    //   596	189	8	localObject13	Object
    //   789	1	8	localSQLiteException2	SQLiteException
    //   798	1	8	localSQLiteFullException2	SQLiteFullException
    //   65	178	9	localcn	cn
    //   253	1	9	locala3	com.google.android.gms.common.internal.safeparcel.b.a
    //   341	460	9	localParcel	Parcel
    //   59	733	10	arrayOfByte	byte[]
    //   28	676	11	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   198	230	253	com/google/android/gms/common/internal/safeparcel/b$a
    //   198	230	276	finally
    //   255	268	276	finally
    //   78	83	286	android/database/sqlite/SQLiteFullException
    //   95	145	286	android/database/sqlite/SQLiteFullException
    //   150	189	286	android/database/sqlite/SQLiteFullException
    //   193	198	286	android/database/sqlite/SQLiteFullException
    //   230	235	286	android/database/sqlite/SQLiteFullException
    //   240	250	286	android/database/sqlite/SQLiteFullException
    //   268	273	286	android/database/sqlite/SQLiteFullException
    //   278	286	286	android/database/sqlite/SQLiteFullException
    //   338	343	286	android/database/sqlite/SQLiteFullException
    //   375	380	286	android/database/sqlite/SQLiteFullException
    //   385	395	286	android/database/sqlite/SQLiteFullException
    //   413	418	286	android/database/sqlite/SQLiteFullException
    //   426	434	286	android/database/sqlite/SQLiteFullException
    //   496	501	286	android/database/sqlite/SQLiteFullException
    //   533	538	286	android/database/sqlite/SQLiteFullException
    //   543	553	286	android/database/sqlite/SQLiteFullException
    //   571	576	286	android/database/sqlite/SQLiteFullException
    //   584	592	286	android/database/sqlite/SQLiteFullException
    //   615	628	286	android/database/sqlite/SQLiteFullException
    //   631	683	286	android/database/sqlite/SQLiteFullException
    //   683	693	286	android/database/sqlite/SQLiteFullException
    //   343	375	398	com/google/android/gms/common/internal/safeparcel/b$a
    //   343	375	424	finally
    //   400	413	424	finally
    //   78	83	434	android/database/sqlite/SQLiteException
    //   95	145	434	android/database/sqlite/SQLiteException
    //   150	189	434	android/database/sqlite/SQLiteException
    //   193	198	434	android/database/sqlite/SQLiteException
    //   230	235	434	android/database/sqlite/SQLiteException
    //   240	250	434	android/database/sqlite/SQLiteException
    //   268	273	434	android/database/sqlite/SQLiteException
    //   278	286	434	android/database/sqlite/SQLiteException
    //   338	343	434	android/database/sqlite/SQLiteException
    //   375	380	434	android/database/sqlite/SQLiteException
    //   385	395	434	android/database/sqlite/SQLiteException
    //   413	418	434	android/database/sqlite/SQLiteException
    //   426	434	434	android/database/sqlite/SQLiteException
    //   496	501	434	android/database/sqlite/SQLiteException
    //   533	538	434	android/database/sqlite/SQLiteException
    //   543	553	434	android/database/sqlite/SQLiteException
    //   571	576	434	android/database/sqlite/SQLiteException
    //   584	592	434	android/database/sqlite/SQLiteException
    //   615	628	434	android/database/sqlite/SQLiteException
    //   631	683	434	android/database/sqlite/SQLiteException
    //   683	693	434	android/database/sqlite/SQLiteException
    //   501	533	556	com/google/android/gms/common/internal/safeparcel/b$a
    //   501	533	582	finally
    //   558	571	582	finally
    //   78	83	592	finally
    //   95	145	592	finally
    //   150	189	592	finally
    //   193	198	592	finally
    //   230	235	592	finally
    //   240	250	592	finally
    //   268	273	592	finally
    //   278	286	592	finally
    //   338	343	592	finally
    //   375	380	592	finally
    //   385	395	592	finally
    //   413	418	592	finally
    //   426	434	592	finally
    //   496	501	592	finally
    //   533	538	592	finally
    //   543	553	592	finally
    //   571	576	592	finally
    //   584	592	592	finally
    //   615	628	592	finally
    //   631	683	592	finally
    //   683	693	592	finally
    //   67	73	780	finally
    //   292	307	780	finally
    //   311	316	780	finally
    //   440	448	780	finally
    //   452	460	780	finally
    //   464	469	780	finally
    //   715	723	780	finally
    //   727	732	780	finally
    //   736	751	780	finally
    //   755	760	780	finally
    //   67	73	789	android/database/sqlite/SQLiteException
    //   67	73	798	android/database/sqlite/SQLiteFullException
  }
  
  @TargetApi(11)
  private final class a
    extends SQLiteOpenHelper
  {
    a(Context paramContext, String paramString)
    {
      super(paramString, null, 1);
    }
    
    public final SQLiteDatabase getWritableDatabase()
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = super.getWritableDatabase();
        return localSQLiteDatabase;
      }
      catch (SQLiteException localSQLiteException1)
      {
        if ((Build.VERSION.SDK_INT >= 11) && ((localSQLiteException1 instanceof SQLiteDatabaseLockedException))) {
          throw localSQLiteException1;
        }
        u().a.a("Opening the local database failed, dropping and recreating it");
        Object localObject = cf.U();
        if (!n().getDatabasePath((String)localObject).delete()) {
          u().a.a("Failed to delete corrupted local db file", localObject);
        }
        try
        {
          localObject = super.getWritableDatabase();
          return (SQLiteDatabase)localObject;
        }
        catch (SQLiteException localSQLiteException2)
        {
          u().a.a("Failed to open local database. Events will bypass local storage", localSQLiteException2);
        }
      }
      return null;
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      cg.a(u(), paramSQLiteDatabase);
    }
    
    public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
    {
      Cursor localCursor;
      if (Build.VERSION.SDK_INT < 15) {
        localCursor = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
      }
      try
      {
        localCursor.moveToFirst();
        localCursor.close();
        cg.a(u(), paramSQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
        return;
      }
      finally
      {
        localCursor.close();
      }
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  }
}


/* Location:              com/google/android/gms/b/cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */