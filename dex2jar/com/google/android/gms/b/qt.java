package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class qt
  extends a
{
  public static final Parcelable.Creator<qt> CREATOR = new qu();
  public final boolean a;
  public final List<String> b;
  
  public qt()
  {
    this(false, Collections.emptyList());
  }
  
  public qt(byte paramByte)
  {
    this(false, Collections.emptyList());
  }
  
  public qt(boolean paramBoolean, List<String> paramList)
  {
    a = paramBoolean;
    b = paramList;
  }
  
  public static qt a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return new qt();
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("reporting_urls");
    ArrayList localArrayList = new ArrayList();
    if (localJSONArray != null)
    {
      int i = 0;
      for (;;)
      {
        if (i < localJSONArray.length()) {
          try
          {
            localArrayList.add(localJSONArray.getString(i));
            i += 1;
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              tp.c("Error grabbing url from json.", localJSONException);
            }
          }
        }
      }
    }
    return new qt(paramJSONObject.optBoolean("enable_protection"), localArrayList);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    qu.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/qt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */