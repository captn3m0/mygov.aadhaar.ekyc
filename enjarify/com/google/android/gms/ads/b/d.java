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
      localObject1 = b;
      localObject1 = ((lj)localObject1).a(paramString);
      if (localObject1 == null) {
        break label38;
      }
      localObject1 = com.google.android.gms.a.b.a((com.google.android.gms.a.a)localObject1);
      localObject1 = (View)localObject1;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Unable to call getAssetView on delegate";
        ul.b(str, localRemoteException);
        label38:
        Object localObject2 = null;
      }
    }
    return (View)localObject1;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    FrameLayout localFrameLayout = a;
    super.bringChildToFront(localFrameLayout);
  }
  
  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    FrameLayout localFrameLayout = a;
    if (localFrameLayout != paramView)
    {
      localFrameLayout = a;
      super.bringChildToFront(localFrameLayout);
    }
  }
  
  public a getAdChoicesView()
  {
    Object localObject = a("1098");
    boolean bool = localObject instanceof a;
    if (bool) {}
    for (localObject = (a)localObject;; localObject = null) {
      return (a)localObject;
    }
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    lj locallj = b;
    if (locallj != null) {}
    try
    {
      locallj = b;
      localObject = com.google.android.gms.a.b.a(paramView);
      locallj.a((com.google.android.gms.a.a)localObject, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Unable to call onVisibilityChanged on delegate";
        ul.b((String)localObject, localRemoteException);
      }
    }
  }
  
  public void removeAllViews()
  {
    super.removeAllViews();
    FrameLayout localFrameLayout = a;
    super.addView(localFrameLayout);
  }
  
  public void removeView(View paramView)
  {
    FrameLayout localFrameLayout = a;
    if (localFrameLayout == paramView) {}
    for (;;)
    {
      return;
      super.removeView(paramView);
    }
  }
  
  public void setAdChoicesView(a parama)
  {
    String str = "1098";
    try
    {
      localObject = b;
      com.google.android.gms.a.a locala = com.google.android.gms.a.b.a(parama);
      ((lj)localObject).a(str, locala);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject = "Unable to call setAssetView on delegate";
        ul.b((String)localObject, localRemoteException);
      }
    }
  }
  
  public void setNativeAd(b paramb)
  {
    try
    {
      localObject1 = b;
      Object localObject2 = paramb.a();
      localObject2 = (com.google.android.gms.a.a)localObject2;
      ((lj)localObject1).a((com.google.android.gms.a.a)localObject2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1 = "Unable to call setNativeAd on delegate";
        ul.b((String)localObject1, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/b/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */