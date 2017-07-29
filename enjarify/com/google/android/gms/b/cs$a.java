package com.google.android.gms.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;

final class cs$a
  extends SQLiteOpenHelper
{
  cs$a(cs paramcs, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    try
    {
      localSQLiteDatabase = super.getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException1)
    {
      for (;;)
      {
        SQLiteDatabase localSQLiteDatabase;
        int i = Build.VERSION.SDK_INT;
        int j = 11;
        if (i >= j)
        {
          bool = localSQLiteException1 instanceof SQLiteDatabaseLockedException;
          if (bool) {
            throw ((Throwable)localSQLiteException1);
          }
        }
        a.u().a.a("Opening the local database failed, dropping and recreating it");
        Object localObject1 = cf.U();
        Object localObject3 = a.n().getDatabasePath((String)localObject1);
        boolean bool = ((File)localObject3).delete();
        String str;
        if (!bool)
        {
          localObject3 = a.u().a;
          str = "Failed to delete corrupted local db file";
          ((cu.a)localObject3).a(str, localObject1);
        }
        try
        {
          localObject1 = super.getWritableDatabase();
        }
        catch (SQLiteException localSQLiteException2)
        {
          localObject3 = a.u().a;
          str = "Failed to open local database. Events will bypass local storage";
          ((cu.a)localObject3).a(str, localSQLiteException2);
          Object localObject2 = null;
        }
      }
    }
    return localSQLiteDatabase;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    cg.a(a.u(), paramSQLiteDatabase);
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    Object localObject1;
    if (i < j) {
      localObject1 = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    try
    {
      ((Cursor)localObject1).moveToFirst();
      ((Cursor)localObject1).close();
      localObject1 = a.u();
      SQLiteDatabase localSQLiteDatabase = paramSQLiteDatabase;
      cg.a((cu)localObject1, paramSQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
      return;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              com/google/android/gms/b/cs$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */