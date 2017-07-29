package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class n
  extends Dialog
  implements f
{
  private g a;
  
  public n(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    a().a(null);
    a().k();
  }
  
  public final g a()
  {
    g localg = a;
    if (localg == null)
    {
      localg = g.a(this, this);
      a = localg;
    }
    return a;
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a().b(paramView, paramLayoutParams);
  }
  
  public View findViewById(int paramInt)
  {
    return a().a(paramInt);
  }
  
  public void invalidateOptionsMenu()
  {
    a().g();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    a().j();
    super.onCreate(paramBundle);
    a().a(paramBundle);
  }
  
  protected void onStop()
  {
    super.onStop();
    a().e();
  }
  
  public void setContentView(int paramInt)
  {
    a().b(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    a().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a().a(paramView, paramLayoutParams);
  }
  
  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    g localg = a();
    String str = getContext().getString(paramInt);
    localg.a(str);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    a().a(paramCharSequence);
  }
}


/* Location:              android/support/v7/app/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */