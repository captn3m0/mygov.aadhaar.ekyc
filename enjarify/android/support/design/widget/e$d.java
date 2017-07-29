package android.support.design.widget;

abstract class e$d
  extends q.b
  implements q.c
{
  private boolean a;
  private float c;
  private float d;
  
  private e$d(e parame) {}
  
  protected abstract float a();
  
  public final void a(q paramq)
  {
    boolean bool = a;
    if (!bool)
    {
      locall = b.a;
      float f1 = j;
      c = f1;
      f1 = a();
      d = f1;
      bool = true;
      f1 = Float.MIN_VALUE;
      a = bool;
    }
    l locall = b.a;
    float f2 = c;
    float f3 = d;
    float f4 = c;
    f3 -= f4;
    f4 = a.f();
    f3 *= f4;
    f2 += f3;
    locall.a(f2);
  }
  
  public final void b(q paramq)
  {
    l locall = b.a;
    float f = d;
    locall.a(f);
    a = false;
  }
}


/* Location:              android/support/design/widget/e$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */