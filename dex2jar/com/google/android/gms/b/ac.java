package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract interface ac
{
  public abstract <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT);
  
  public abstract void a();
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract void b();
  
  public abstract boolean c();
  
  public abstract void d();
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, boolean paramBoolean);
    
    public abstract void a(Bundle paramBundle);
    
    public abstract void a(a parama);
  }
}


/* Location:              com/google/android/gms/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */