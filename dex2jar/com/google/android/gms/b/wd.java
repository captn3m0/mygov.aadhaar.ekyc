package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.n;

public final class wd
  extends n<Object>
  implements wa
{
  wd(Context paramContext)
  {
    super(paramContext, vz.c, new wm());
  }
  
  public final d<Status> a(wb paramwb)
  {
    return b(new b(paramwb, e));
  }
  
  static class a
    extends wg.a
  {
    public void a(Status paramStatus)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void a(Status paramStatus, long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void b(Status paramStatus)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void b(Status paramStatus, long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void c(Status paramStatus)
    {
      throw new UnsupportedOperationException();
    }
  }
  
  static final class b
    extends f.a<Status, we>
  {
    private final wb h;
    
    b(wb paramwb, c paramc)
    {
      super(paramc);
      h = paramwb;
    }
  }
}


/* Location:              com/google/android/gms/b/wd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */