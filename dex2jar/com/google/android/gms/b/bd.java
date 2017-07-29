package com.google.android.gms.b;

public abstract interface bd
{
  public static final class a
    extends fv<a>
  {
    public bd.b a;
    public bd.c b;
    
    public a()
    {
      ah = -1;
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.b(1, a);
      }
      j = i;
      if (b != null) {
        j = i + fu.b(2, b);
      }
      return j;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(1, a);
      }
      if (b != null) {
        paramfu.a(2, b);
      }
      super.a(paramfu);
    }
  }
  
  public static final class b
    extends fv<b>
  {
    public Integer a = null;
    
    public b()
    {
      ah = -1;
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.b(27, a.intValue());
      }
      return i;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(27, a.intValue());
      }
      super.a(paramfu);
    }
  }
  
  public static final class c
    extends fv<c>
  {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    
    public c()
    {
      ah = -1;
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.b(1, a);
      }
      j = i;
      if (b != null) {
        j = i + fu.b(2, b);
      }
      i = j;
      if (c != null) {
        i = j + fu.b(3, c);
      }
      j = i;
      if (d != null) {
        j = i + fu.b(4, d);
      }
      i = j;
      if (e != null) {
        i = j + fu.b(5, e);
      }
      return i;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(1, a);
      }
      if (b != null) {
        paramfu.a(2, b);
      }
      if (c != null) {
        paramfu.a(3, c);
      }
      if (d != null) {
        paramfu.a(4, d);
      }
      if (e != null) {
        paramfu.a(5, e);
      }
      super.a(paramfu);
    }
  }
}


/* Location:              com/google/android/gms/b/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */