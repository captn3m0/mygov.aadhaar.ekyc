package android.support.v4.h;

import android.view.LayoutInflater;

final class h$d
  extends h.c
{
  public final void a(LayoutInflater paramLayoutInflater, k paramk)
  {
    j.a locala;
    if (paramk != null)
    {
      locala = new android/support/v4/h/j$a;
      locala.<init>(paramk);
    }
    for (;;)
    {
      paramLayoutInflater.setFactory2(locala);
      return;
      locala = null;
    }
  }
}


/* Location:              android/support/v4/h/h$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */