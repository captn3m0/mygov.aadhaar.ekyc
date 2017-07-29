package com.google.android.gms.ads.e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.b.jk;
import com.google.android.gms.b.ul;

public final class b
  extends ViewGroup
{
  private final jk a;
  
  public final a getAdListener()
  {
    return a.e;
  }
  
  public final d getAdSize()
  {
    return a.a();
  }
  
  public final String getAdUnitId()
  {
    return a.n;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if (localView != null)
    {
      int i = localView.getVisibility();
      int j = 8;
      if (i != j)
      {
        i = localView.getMeasuredWidth();
        j = localView.getMeasuredHeight();
        int k = (paramInt3 - paramInt1 - i) / 2;
        int m = (paramInt4 - paramInt2 - j) / 2;
        i += k;
        j += m;
        localView.layout(k, m, i, j);
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Context localContext = null;
    Object localObject1 = getChildAt(0);
    int j;
    if (localObject1 != null)
    {
      j = ((View)localObject1).getVisibility();
      int k = 8;
      if (j != k)
      {
        measureChild((View)localObject1, paramInt1, paramInt2);
        j = ((View)localObject1).getMeasuredWidth();
        i = ((View)localObject1).getMeasuredHeight();
      }
    }
    int m;
    d locald;
    for (;;)
    {
      m = getSuggestedMinimumWidth();
      j = Math.max(j, m);
      m = getSuggestedMinimumHeight();
      i = Math.max(i, m);
      j = View.resolveSize(j, paramInt1);
      i = View.resolveSize(i, paramInt2);
      setMeasuredDimension(j, i);
      return;
      j = 0;
      locald = null;
      try
      {
        locald = getAdSize();
        localObject1 = locald;
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          String str = "Unable to retrieve ad size.";
          ul.b(str, localNullPointerException);
          m = 0;
          Object localObject2 = null;
        }
        j = 0;
        locald = null;
      }
      if (localObject1 != null)
      {
        localContext = getContext();
        j = ((d)localObject1).b(localContext);
        i = ((d)localObject1).a(localContext);
      }
    }
  }
  
  public final void setAdListener(a parama)
  {
    a.a(parama);
  }
  
  public final void setAdSize(d paramd)
  {
    jk localjk = a;
    d[] arrayOfd = new d[1];
    arrayOfd[0] = paramd;
    localjk.a(arrayOfd);
  }
  
  public final void setAdUnitId(String paramString)
  {
    a.a(paramString);
  }
}


/* Location:              com/google/android/gms/ads/e/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */