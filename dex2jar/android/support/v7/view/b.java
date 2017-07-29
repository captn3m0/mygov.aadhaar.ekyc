package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b
{
  Object b;
  boolean c;
  
  public abstract MenuInflater a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(View paramView);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public void a(boolean paramBoolean)
  {
    c = paramBoolean;
  }
  
  public abstract Menu b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(CharSequence paramCharSequence);
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract CharSequence f();
  
  public abstract CharSequence g();
  
  public boolean h()
  {
    return false;
  }
  
  public abstract View i();
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
    
    public abstract boolean a(b paramb, Menu paramMenu);
    
    public abstract boolean a(b paramb, MenuItem paramMenuItem);
    
    public abstract boolean b(b paramb, Menu paramMenu);
  }
}


/* Location:              android/support/v7/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */