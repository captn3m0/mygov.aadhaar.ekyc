package com.google.android.gms.ads.e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.b.jk;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.ul;

@qi
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
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = getChildAt(0);
    int j;
    if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8))
    {
      measureChild((View)localObject1, paramInt1, paramInt2);
      j = ((View)localObject1).getMeasuredWidth();
      i = ((View)localObject1).getMeasuredHeight();
    }
    for (;;)
    {
      j = Math.max(j, getSuggestedMinimumWidth());
      i = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSize(j, paramInt1), View.resolveSize(i, paramInt2));
      return;
      try
      {
        localObject1 = getAdSize();
        if (localObject1 != null)
        {
          Context localContext = getContext();
          j = ((d)localObject1).b(localContext);
          i = ((d)localObject1).a(localContext);
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          ul.b("Unable to retrieve ad size.", localNullPointerException);
          Object localObject2 = null;
        }
        j = 0;
      }
    }
  }
  
  public final void setAdListener(a parama)
  {
    a.a(parama);
  }
  
  public final void setAdSize(d paramd)
  {
    a.a(new d[] { paramd });
  }
  
  public final void setAdUnitId(String paramString)
  {
    a.a(paramString);
  }
}


/* Location:              com/google/android/gms/ads/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */