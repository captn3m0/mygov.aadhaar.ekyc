package com.google.android.gms.ads.b;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.b.lj;
import com.google.android.gms.b.ul;

public abstract class d
  extends FrameLayout
{
  private final FrameLayout a;
  private final lj b;
  
  private View a(String paramString)
  {
    try
    {
      paramString = b.a(paramString);
      if (paramString != null)
      {
        paramString = (View)com.google.android.gms.a.b.a(paramString);
        return paramString;
      }
    }
    catch (RemoteException paramString)
    {
      ul.b("Unable to call getAssetView on delegate", paramString);
    }
    return null;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(a);
  }
  
  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    if (a != paramView) {
      super.bringChildToFront(a);
    }
  }
  
  public a getAdChoicesView()
  {
    View localView = a("1098");
    if ((localView instanceof a)) {
      return (a)localView;
    }
    return null;
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (b != null) {}
    try
    {
      b.a(com.google.android.gms.a.b.a(paramView), paramInt);
      return;
    }
    catch (RemoteException paramView)
    {
      ul.b("Unable to call onVisibilityChanged on delegate", paramView);
    }
  }
  
  public void removeAllViews()
  {
    super.removeAllViews();
    super.addView(a);
  }
  
  public void removeView(View paramView)
  {
    if (a == paramView) {
      return;
    }
    super.removeView(paramView);
  }
  
  public void setAdChoicesView(a parama)
  {
    try
    {
      b.a("1098", com.google.android.gms.a.b.a(parama));
      return;
    }
    catch (RemoteException parama)
    {
      ul.b("Unable to call setAssetView on delegate", parama);
    }
  }
  
  public void setNativeAd(b paramb)
  {
    try
    {
      b.a((com.google.android.gms.a.a)paramb.a());
      return;
    }
    catch (RemoteException paramb)
    {
      ul.b("Unable to call setNativeAd on delegate", paramb);
    }
  }
}


/* Location:              com/google/android/gms/ads/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */