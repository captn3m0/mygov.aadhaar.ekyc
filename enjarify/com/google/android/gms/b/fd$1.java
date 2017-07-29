package com.google.android.gms.b;

import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicBoolean;

final class fd$1
  extends ContentObserver
{
  fd$1()
  {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    fd.a().set(true);
  }
}


/* Location:              com/google/android/gms/b/fd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */