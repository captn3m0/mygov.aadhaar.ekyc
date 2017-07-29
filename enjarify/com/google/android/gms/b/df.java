package com.google.android.gms.b;

abstract class df
  extends de
{
  private boolean a;
  
  df(dc paramdc)
  {
    super(paramdc);
    dc localdc = q;
    int i = j + 1;
    j = i;
  }
  
  final boolean I()
  {
    boolean bool = a;
    if (bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected final void J()
  {
    boolean bool = I();
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Not initialized");
      throw localIllegalStateException;
    }
  }
  
  public final void K()
  {
    boolean bool = a;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Can't initialize twice");
      throw ((Throwable)localObject);
    }
    a();
    Object localObject = q;
    int i = k + 1;
    k = i;
    a = true;
  }
  
  protected abstract void a();
}


/* Location:              com/google/android/gms/b/df.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */