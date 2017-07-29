package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Iterator;
import java.util.Set;

public final class cl
  extends a
  implements Iterable<String>
{
  public static final Parcelable.Creator<cl> CREATOR = new cm();
  final Bundle a;
  
  cl(Bundle paramBundle)
  {
    a = paramBundle;
  }
  
  public final Bundle a()
  {
    return new Bundle(a);
  }
  
  final Object a(String paramString)
  {
    return a.get(paramString);
  }
  
  public final Iterator<String> iterator()
  {
    new Iterator()
    {
      Iterator<String> a = cl.a(cl.this).keySet().iterator();
      
      public final boolean hasNext()
      {
        return a.hasNext();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException("Remove not supported");
      }
    };
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    cm.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */