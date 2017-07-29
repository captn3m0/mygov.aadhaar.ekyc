package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.b.qi;

@qi
public abstract class i
{
  protected boolean a;
  protected boolean b;
  protected Bundle c = new Bundle();
  protected View d;
  
  public final void a()
  {
    a = true;
  }
  
  public void a(View paramView) {}
  
  public final void b()
  {
    b = true;
  }
  
  public final boolean c()
  {
    return a;
  }
  
  public final boolean d()
  {
    return b;
  }
  
  public final Bundle e()
  {
    return c;
  }
  
  public final View f()
  {
    return d;
  }
}


/* Location:              com/google/android/gms/ads/mediation/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */