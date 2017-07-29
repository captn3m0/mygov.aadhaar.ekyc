package android.support.v4.h;

import android.view.LayoutInflater;

class h$b
  implements h.a
{
  public final k a(LayoutInflater paramLayoutInflater)
  {
    Object localObject = paramLayoutInflater.getFactory();
    boolean bool = localObject instanceof i.a;
    if (bool) {}
    for (localObject = a;; localObject = null) {
      return (k)localObject;
    }
  }
  
  public void a(LayoutInflater paramLayoutInflater, k paramk)
  {
    i.a locala;
    if (paramk != null)
    {
      locala = new android/support/v4/h/i$a;
      locala.<init>(paramk);
    }
    for (;;)
    {
      paramLayoutInflater.setFactory(locala);
      return;
      locala = null;
    }
  }
}


/* Location:              android/support/v4/h/h$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */