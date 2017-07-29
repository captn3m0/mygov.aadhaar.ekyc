package com.google.android.gms.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.c;
import java.io.File;
import java.util.Map;

final class cg$c
  extends SQLiteOpenHelper
{
  cg$c(cg paramcg, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    long l1 = 0L;
    int i = 1;
    localObject1 = cg.a(a);
    cf.P();
    l2 = b;
    boolean bool1 = l2 < l1;
    if (!bool1) {}
    Object localObject2;
    while (i == 0)
    {
      localObject2 = new android/database/sqlite/SQLiteException;
      ((SQLiteException)localObject2).<init>("Database open failed");
      throw ((Throwable)localObject2);
      localObject4 = a;
      l2 = ((c)localObject4).b();
      l1 = b;
      l2 -= l1;
      l1 = 3600000L;
      bool2 = l2 < l1;
      if (bool2)
      {
        i = 0;
        localObject2 = null;
      }
    }
    try
    {
      localObject2 = super.getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException1)
    {
      for (;;)
      {
        cg.a(a).a();
        a.u().a.a("Opening the database failed, dropping and recreating it");
        Object localObject3 = cf.T();
        localObject1 = a.n().getDatabasePath((String)localObject3);
        bool2 = ((File)localObject1).delete();
        if (bool2) {
          break label197;
        }
        localObject1 = a.u().a;
        localObject4 = "Failed to delete corrupted db file";
        ((cu.a)localObject1).a((String)localObject4, localObject3);
        try
        {
          localObject3 = super.getWritableDatabase();
          localObject1 = a;
          localObject1 = cg.a((cg)localObject1);
          l2 = 0L;
          b = l2;
        }
        catch (SQLiteException localSQLiteException2)
        {
          a.u().a.a("Failed to open freshly created database", localSQLiteException2);
          throw localSQLiteException2;
        }
      }
    }
    return (SQLiteDatabase)localObject2;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    cg.a(a.u(), paramSQLiteDatabase);
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    Map localMap1 = null;
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
      cg.a((cu)localObject1, paramSQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
      cg.a(a.u(), paramSQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
      cu localcu = a.u();
      Map localMap2 = cg.D();
      cg.a(localcu, paramSQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, triggered_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,triggered_timestamp,value", localMap2);
      localcu = a.u();
      localMap2 = cg.E();
      cg.a(localcu, paramSQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", localMap2);
      localcu = a.u();
      localMap2 = cg.F();
      cg.a(localcu, paramSQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", localMap2);
      cg.a(a.u(), paramSQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
      localcu = a.u();
      localMap2 = cg.G();
      cg.a(localcu, paramSQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", localMap2);
      cg.a(a.u(), paramSQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
      cg.a(a.u(), paramSQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
      cg.a(a.u(), paramSQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
      localObject1 = a.u();
      localMap1 = cg.H();
      cg.a((cu)localObject1, paramSQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", localMap1);
      return;
    }
    finally
    {
      ((Cursor)localObject1).close();
    }
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              com/google/android/gms/b/cg$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */