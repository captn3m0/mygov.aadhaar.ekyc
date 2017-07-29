package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.b;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class ss
  extends com.google.android.gms.common.internal.safeparcel.a
{
  public static final Parcelable.Creator<ss> CREATOR = new st();
  public final String a;
  public final int b;
  
  public ss(com.google.android.gms.ads.d.a parama)
  {
    this(parama.a(), parama.b());
  }
  
  public ss(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public static ss a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      paramString = a(new JSONArray(paramString));
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  public static ss a(JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0)) {
      return null;
    }
    return new ss(paramJSONArray.getJSONObject(0).optString("rb_type"), paramJSONArray.getJSONObject(0).optInt("rb_amount"));
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof ss))) {}
    do
    {
      return false;
      paramObject = (ss)paramObject;
    } while ((!b.a(a, a)) || (!b.a(Integer.valueOf(b), Integer.valueOf(b))));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, Integer.valueOf(b) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    st.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/ss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */