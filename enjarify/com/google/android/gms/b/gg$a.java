package com.google.android.gms.b;

public final class gg$a
  extends fv
{
  private static volatile a[] b;
  public String a = "";
  
  public gg$a()
  {
    ag = null;
    ah = -1;
  }
  
  public static a[] b()
  {
    a[] arrayOfa = b;
    if (arrayOfa == null) {}
    synchronized (fz.c)
    {
      arrayOfa = b;
      if (arrayOfa == null)
      {
        arrayOfa = null;
        arrayOfa = new a[0];
        b = arrayOfa;
      }
      return b;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = a;
    if (str1 != null)
    {
      str1 = a;
      String str2 = "";
      boolean bool = str1.equals(str2);
      if (!bool)
      {
        str2 = a;
        int j = fu.b(1, str2);
        i += j;
      }
    }
    return i;
  }
  
  public final void a(fu paramfu)
  {
    String str1 = a;
    if (str1 != null)
    {
      str1 = a;
      String str2 = "";
      int i = str1.equals(str2);
      if (i == 0)
      {
        i = 1;
        str2 = a;
        paramfu.a(i, str2);
      }
    }
    super.a(paramfu);
  }
}


/* Location:              com/google/android/gms/b/gg$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */