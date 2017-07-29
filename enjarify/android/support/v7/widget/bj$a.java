package android.support.v7.widget;

import android.support.v4.g.j.a;
import android.support.v4.g.j.b;

final class bj$a
{
  static j.a d;
  int a;
  at.e.b b;
  at.e.b c;
  
  static
  {
    j.b localb = new android/support/v4/g/j$b;
    localb.<init>(20);
    d = localb;
  }
  
  static a a()
  {
    a locala = (a)d.a();
    if (locala == null)
    {
      locala = new android/support/v7/widget/bj$a;
      locala.<init>();
    }
    return locala;
  }
  
  static void a(a parama)
  {
    a = 0;
    b = null;
    c = null;
    d.a(parama);
  }
  
  static void b()
  {
    Object localObject;
    do
    {
      localObject = d.a();
    } while (localObject != null);
  }
}


/* Location:              android/support/v7/widget/bj$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */