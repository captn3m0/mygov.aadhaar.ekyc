package android.support.v4.h;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

class ae$a
  implements ae.g
{
  WeakHashMap a = null;
  
  private void d(ae paramae, View paramView)
  {
    Object localObject = null;
    WeakHashMap localWeakHashMap = a;
    if (localWeakHashMap != null) {
      localObject = (Runnable)a.get(paramView);
    }
    if (localObject == null)
    {
      localObject = new android/support/v4/h/ae$a$a;
      ((ae.a.a)localObject).<init>(this, paramae, paramView);
      localWeakHashMap = a;
      if (localWeakHashMap == null)
      {
        localWeakHashMap = new java/util/WeakHashMap;
        localWeakHashMap.<init>();
        a = localWeakHashMap;
      }
      localWeakHashMap = a;
      localWeakHashMap.put(paramView, localObject);
    }
    paramView.removeCallbacks((Runnable)localObject);
    paramView.post((Runnable)localObject);
  }
  
  public long a(View paramView)
  {
    return 0L;
  }
  
  public void a(ae paramae, View paramView)
  {
    d(paramae, paramView);
  }
  
  public void a(ae paramae, View paramView, float paramFloat)
  {
    d(paramae, paramView);
  }
  
  public void a(ae paramae, View paramView, ai paramai)
  {
    paramView.setTag(2113929216, paramai);
  }
  
  public void a(View paramView, long paramLong) {}
  
  public void a(View paramView, ak paramak) {}
  
  public void a(View paramView, Interpolator paramInterpolator) {}
  
  public void b(ae paramae, View paramView)
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = (Runnable)a.get(paramView);
      if (localObject != null) {
        paramView.removeCallbacks((Runnable)localObject);
      }
    }
    c(paramae, paramView);
  }
  
  public void b(ae paramae, View paramView, float paramFloat)
  {
    d(paramae, paramView);
  }
  
  public void b(View paramView, long paramLong) {}
  
  final void c(ae paramae, View paramView)
  {
    int i = 2113929216;
    Object localObject = paramView.getTag(i);
    boolean bool = localObject instanceof ai;
    if (bool) {}
    for (localObject = (ai)localObject;; localObject = null)
    {
      Runnable localRunnable1 = b;
      Runnable localRunnable2 = c;
      b = null;
      c = null;
      if (localRunnable1 != null) {
        localRunnable1.run();
      }
      if (localObject != null)
      {
        ((ai)localObject).a(paramView);
        ((ai)localObject).b(paramView);
      }
      if (localRunnable2 != null) {
        localRunnable2.run();
      }
      localObject = a;
      if (localObject != null)
      {
        localObject = a;
        ((WeakHashMap)localObject).remove(paramView);
      }
      return;
      i = 0;
    }
  }
  
  public void c(ae paramae, View paramView, float paramFloat)
  {
    d(paramae, paramView);
  }
}


/* Location:              android/support/v4/h/ae$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */