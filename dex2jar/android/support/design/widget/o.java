package android.support.design.widget;

import java.util.ArrayList;

final class o
{
  final ArrayList<a> a = new ArrayList();
  a b = null;
  q c = null;
  private final q.a d = new q.b()
  {
    public final void b(q paramAnonymousq)
    {
      if (c == paramAnonymousq) {
        c = null;
      }
    }
  };
  
  public final void a(int[] paramArrayOfInt, q paramq)
  {
    paramArrayOfInt = new a(paramArrayOfInt, paramq);
    paramq.a(d);
    a.add(paramArrayOfInt);
  }
  
  static final class a
  {
    final int[] a;
    final q b;
    
    a(int[] paramArrayOfInt, q paramq)
    {
      a = paramArrayOfInt;
      b = paramq;
    }
  }
}


/* Location:              android/support/design/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */