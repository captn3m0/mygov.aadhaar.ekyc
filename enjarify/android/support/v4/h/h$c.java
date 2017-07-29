package android.support.v4.h;

import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;

class h$c
  extends h.b
{
  public void a(LayoutInflater paramLayoutInflater, k paramk)
  {
    Object localObject1;
    Object localObject2;
    if (paramk != null)
    {
      localObject1 = new android/support/v4/h/j$a;
      ((j.a)localObject1).<init>(paramk);
      localObject2 = localObject1;
      paramLayoutInflater.setFactory2((LayoutInflater.Factory2)localObject2);
      localObject1 = paramLayoutInflater.getFactory();
      boolean bool = localObject1 instanceof LayoutInflater.Factory2;
      if (!bool) {
        break label57;
      }
      localObject1 = (LayoutInflater.Factory2)localObject1;
      j.a(paramLayoutInflater, (LayoutInflater.Factory2)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = null;
      localObject2 = null;
      break;
      label57:
      j.a(paramLayoutInflater, (LayoutInflater.Factory2)localObject2);
    }
  }
}


/* Location:              android/support/v4/h/h$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */