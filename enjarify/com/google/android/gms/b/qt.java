package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class qt
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final boolean a;
  public final List b;
  
  static
  {
    qu localqu = new com/google/android/gms/b/qu;
    localqu.<init>();
    CREATOR = localqu;
  }
  
  public qt()
  {
    this(false, localList);
  }
  
  public qt(byte paramByte)
  {
    this(false, localList);
  }
  
  public qt(boolean paramBoolean, List paramList)
  {
    a = paramBoolean;
    b = paramList;
  }
  
  public static qt a(JSONObject paramJSONObject)
  {
    Object localObject;
    if (paramJSONObject == null)
    {
      localObject = new com/google/android/gms/b/qt;
      ((qt)localObject).<init>();
    }
    for (;;)
    {
      return (qt)localObject;
      localObject = "reporting_urls";
      JSONArray localJSONArray = paramJSONObject.optJSONArray((String)localObject);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (localJSONArray != null)
      {
        int i = 0;
        localObject = null;
        for (;;)
        {
          int j = localJSONArray.length();
          if (i >= j) {
            break label93;
          }
          try
          {
            String str1 = localJSONArray.getString(i);
            localArrayList.add(str1);
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              String str3 = "Error grabbing url from json.";
              tp.c(str3, localJSONException);
            }
          }
          i += 1;
        }
      }
      label93:
      localObject = new com/google/android/gms/b/qt;
      String str2 = "enable_protection";
      boolean bool = paramJSONObject.optBoolean(str2);
      ((qt)localObject).<init>(bool, localArrayList);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    qu.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/qt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */