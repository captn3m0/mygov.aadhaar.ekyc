package android.support.v4.b;

public final class l
{
  final m<?> a;
  
  l(m<?> paramm)
  {
    a = paramm;
  }
  
  public final i a(String paramString)
  {
    return a.f.b(paramString);
  }
  
  public final void a()
  {
    a.f.s = false;
  }
  
  public final void a(boolean paramBoolean)
  {
    m localm = a;
    h = paramBoolean;
    if ((i != null) && (k))
    {
      k = false;
      if (paramBoolean) {
        i.d();
      }
    }
    else
    {
      return;
    }
    i.c();
  }
  
  public final boolean b()
  {
    return a.f.c();
  }
  
  public final void c()
  {
    m localm = a;
    if (!k)
    {
      k = true;
      if (i == null) {
        break label37;
      }
      i.b();
    }
    for (;;)
    {
      j = true;
      return;
      label37:
      if (!j)
      {
        i = localm.a("(root)", k);
        if ((i != null) && (!i.e)) {
          i.b();
        }
      }
    }
  }
}


/* Location:              android/support/v4/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */