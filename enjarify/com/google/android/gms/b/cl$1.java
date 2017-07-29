package com.google.android.gms.b;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

final class cl$1
  implements Iterator
{
  Iterator a;
  
  cl$1(cl paramcl)
  {
    Iterator localIterator = cl.a(b).keySet().iterator();
    a = localIterator;
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final void remove()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Remove not supported");
    throw localUnsupportedOperationException;
  }
}


/* Location:              com/google/android/gms/b/cl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */