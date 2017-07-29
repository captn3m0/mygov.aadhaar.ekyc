package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.b.tp;

public final class h$a
  extends SQLiteOpenHelper
{
  public h$a(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 4);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    String str = h.d();
    paramSQLiteDatabase.execSQL(str);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    tp.d("Database updated from version " + paramInt1 + " to version " + paramInt2);
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */