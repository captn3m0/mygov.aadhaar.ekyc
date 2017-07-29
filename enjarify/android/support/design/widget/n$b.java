package android.support.design.widget;

import java.lang.ref.WeakReference;

final class n$b
{
  final WeakReference a;
  int b;
  boolean c;
  
  n$b(int paramInt, n.a parama)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(parama);
    a = localWeakReference;
    b = paramInt;
  }
  
  final boolean a(n.a parama)
  {
    Object localObject;
    boolean bool;
    if (parama != null)
    {
      localObject = a.get();
      if (localObject == parama) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              android/support/design/widget/n$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */