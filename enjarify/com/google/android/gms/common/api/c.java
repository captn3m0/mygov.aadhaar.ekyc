package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.b.as;
import com.google.android.gms.b.f.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class c
{
  private static final Set a;
  
  static
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    a = Collections.newSetFromMap(localWeakHashMap);
  }
  
  public Looper a()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public f.a a(f.a parama)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void a(as paramas)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public abstract void a(c.c paramc);
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract void b();
  
  public void b(as paramas)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public abstract void b(c.c paramc);
  
  public abstract void c();
}


/* Location:              com/google/android/gms/common/api/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */