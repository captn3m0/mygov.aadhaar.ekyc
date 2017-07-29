package com.google.android.gms.b;

abstract class df
  extends de
{
  private boolean a;
  
  df(dc paramdc)
  {
    super(paramdc);
    paramdc = q;
    j += 1;
  }
  
  final boolean I()
  {
    return a;
  }
  
  protected final void J()
  {
    if (!I()) {
      throw new IllegalStateException("Not initialized");
    }
  }
  
  public final void K()
  {
    if (a) {
      throw new IllegalStateException("Can't initialize twice");
    }
    a();
    dc localdc = q;
    k += 1;
    a = true;
  }
  
  protected abstract void a();
}


/* Location:              com/google/android/gms/b/df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */