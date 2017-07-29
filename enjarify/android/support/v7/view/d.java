package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.a.a.i;
import android.view.LayoutInflater;

public final class d
  extends ContextWrapper
{
  public int a;
  private Resources.Theme b;
  private LayoutInflater c;
  
  public d(Context paramContext, int paramInt)
  {
    super(paramContext);
    a = paramInt;
  }
  
  private void a()
  {
    boolean bool1 = true;
    Resources.Theme localTheme1 = b;
    boolean bool2;
    if (localTheme1 == null) {
      bool2 = bool1;
    }
    for (;;)
    {
      if (bool2)
      {
        localTheme1 = getResources().newTheme();
        b = localTheme1;
        localTheme1 = getBaseContext().getTheme();
        if (localTheme1 != null)
        {
          Resources.Theme localTheme2 = b;
          localTheme2.setTo(localTheme1);
        }
      }
      localTheme1 = b;
      int i = a;
      localTheme1.applyStyle(i, bool1);
      return;
      bool2 = false;
      localTheme1 = null;
    }
  }
  
  public final AssetManager getAssets()
  {
    return getResources().getAssets();
  }
  
  public final Object getSystemService(String paramString)
  {
    Object localObject = "layout_inflater";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = c;
      if (localObject == null)
      {
        localObject = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        c = ((LayoutInflater)localObject);
      }
    }
    for (localObject = c;; localObject = getBaseContext().getSystemService(paramString)) {
      return localObject;
    }
  }
  
  public final Resources.Theme getTheme()
  {
    Resources.Theme localTheme = b;
    if (localTheme != null) {}
    for (localTheme = b;; localTheme = b)
    {
      return localTheme;
      int i = a;
      if (i == 0)
      {
        i = a.i.Theme_AppCompat_Light;
        a = i;
      }
      a();
    }
  }
  
  public final void setTheme(int paramInt)
  {
    int i = a;
    if (i != paramInt)
    {
      a = paramInt;
      a();
    }
  }
}


/* Location:              android/support/v7/view/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */