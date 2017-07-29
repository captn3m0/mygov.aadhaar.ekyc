package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.b;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ss
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator CREATOR;
  public final String a;
  public final int b;
  
  static
  {
    st localst = new com/google/android/gms/b/st;
    localst.<init>();
    CREATOR = localst;
  }
  
  public ss(com.google.android.gms.ads.d.a parama)
  {
    this(str, i);
  }
  
  public ss(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public static ss a(String paramString)
  {
    ss localss = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return localss;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        localss = a(localJSONArray);
      }
      catch (JSONException localJSONException) {}
    }
  }
  
  public static ss a(JSONArray paramJSONArray)
  {
    String str1 = null;
    int i;
    ss localss;
    if (paramJSONArray != null)
    {
      i = paramJSONArray.length();
      if (i != 0) {}
    }
    else
    {
      i = 0;
      localss = null;
    }
    for (;;)
    {
      return localss;
      localss = new com/google/android/gms/b/ss;
      String str2 = paramJSONArray.getJSONObject(0).optString("rb_type");
      JSONObject localJSONObject = paramJSONArray.getJSONObject(0);
      str1 = "rb_amount";
      int j = localJSONObject.optInt(str1);
      localss.<init>(str2, j);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject != null)
    {
      bool2 = paramObject instanceof ss;
      if (bool2) {
        break label17;
      }
    }
    for (;;)
    {
      return bool1;
      label17:
      paramObject = (ss)paramObject;
      Object localObject1 = a;
      Object localObject2 = a;
      bool2 = b.a(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = Integer.valueOf(b);
        int i = b;
        localObject2 = Integer.valueOf(i);
        bool2 = b.a(localObject1, localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = a;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(b);
    arrayOfObject[1] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    st.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/ss.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */