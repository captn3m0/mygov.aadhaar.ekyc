package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class h
{
  private static final c b = new a();
  private Object a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      b = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      b = new b();
      return;
    }
  }
  
  public h(Context paramContext)
  {
    a = b.a(paramContext);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    b.a(a, paramInt1, paramInt2);
  }
  
  public final boolean a()
  {
    return b.a(a);
  }
  
  public final boolean a(float paramFloat1, float paramFloat2)
  {
    return b.a(a, paramFloat1, paramFloat2);
  }
  
  public final boolean a(int paramInt)
  {
    return b.a(a, paramInt);
  }
  
  public final boolean a(Canvas paramCanvas)
  {
    return b.a(a, paramCanvas);
  }
  
  public final boolean b()
  {
    return b.b(a);
  }
  
  static final class a
    implements h.c
  {
    public final Object a(Context paramContext)
    {
      return null;
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2) {}
    
    public final boolean a(Object paramObject)
    {
      return true;
    }
    
    public final boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    public final boolean a(Object paramObject, int paramInt)
    {
      return false;
    }
    
    public final boolean a(Object paramObject, Canvas paramCanvas)
    {
      return false;
    }
    
    public final boolean b(Object paramObject)
    {
      return false;
    }
  }
  
  static class b
    implements h.c
  {
    public final Object a(Context paramContext)
    {
      return new EdgeEffect(paramContext);
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2)
    {
      ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
    }
    
    public final boolean a(Object paramObject)
    {
      return ((EdgeEffect)paramObject).isFinished();
    }
    
    public boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      ((EdgeEffect)paramObject).onPull(paramFloat1);
      return true;
    }
    
    public final boolean a(Object paramObject, int paramInt)
    {
      ((EdgeEffect)paramObject).onAbsorb(paramInt);
      return true;
    }
    
    public final boolean a(Object paramObject, Canvas paramCanvas)
    {
      return ((EdgeEffect)paramObject).draw(paramCanvas);
    }
    
    public final boolean b(Object paramObject)
    {
      paramObject = (EdgeEffect)paramObject;
      ((EdgeEffect)paramObject).onRelease();
      return ((EdgeEffect)paramObject).isFinished();
    }
  }
  
  static abstract interface c
  {
    public abstract Object a(Context paramContext);
    
    public abstract void a(Object paramObject, int paramInt1, int paramInt2);
    
    public abstract boolean a(Object paramObject);
    
    public abstract boolean a(Object paramObject, float paramFloat1, float paramFloat2);
    
    public abstract boolean a(Object paramObject, int paramInt);
    
    public abstract boolean a(Object paramObject, Canvas paramCanvas);
    
    public abstract boolean b(Object paramObject);
  }
  
  static final class d
    extends h.b
  {
    public final boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      ((EdgeEffect)paramObject).onPull(paramFloat1, paramFloat2);
      return true;
    }
  }
}


/* Location:              android/support/v4/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */