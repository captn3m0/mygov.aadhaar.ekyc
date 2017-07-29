package android.support.v4.b;

public final class l
{
  final m a;
  
  l(m paramm)
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
    Object localObject = a;
    h = paramBoolean;
    w localw = i;
    if (localw != null)
    {
      boolean bool = k;
      if (bool)
      {
        bool = false;
        localw = null;
        k = false;
        if (!paramBoolean) {
          break label54;
        }
        localObject = i;
        ((w)localObject).d();
      }
    }
    for (;;)
    {
      return;
      label54:
      localObject = i;
      ((w)localObject).c();
    }
  }
  
  public final boolean b()
  {
    return a.f.c();
  }
  
  public final void c()
  {
    boolean bool1 = true;
    m localm = a;
    boolean bool2 = k;
    w localw;
    if (!bool2)
    {
      k = bool1;
      localw = i;
      if (localw == null) {
        break label49;
      }
      localw = i;
      localw.b();
    }
    for (;;)
    {
      j = bool1;
      return;
      label49:
      bool2 = j;
      if (!bool2)
      {
        boolean bool3 = k;
        localw = localm.a("(root)", bool3);
        i = localw;
        localw = i;
        if (localw != null)
        {
          localw = i;
          bool2 = e;
          if (!bool2)
          {
            localw = i;
            localw.b();
          }
        }
      }
    }
  }
}


/* Location:              android/support/v4/b/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */