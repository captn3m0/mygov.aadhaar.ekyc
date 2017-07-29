package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;

public abstract class ms
  implements f
{
  protected Context a;
  protected String b;
  protected WeakReference c;
  
  public ms(vc paramvc)
  {
    Object localObject = paramvc.getContext();
    a = ((Context)localObject);
    localObject = w.e();
    Context localContext = a;
    String str = oa;
    localObject = ((tt)localObject).a(localContext, str);
    b = ((String)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramvc);
    c = ((WeakReference)localObject);
  }
  
  public abstract void a();
  
  protected final void a(String paramString1, String paramString2, int paramInt)
  {
    Handler localHandler = uk.a;
    ms.2 local2 = new com/google/android/gms/b/ms$2;
    local2.<init>(this, paramString1, paramString2, paramInt);
    localHandler.post(local2);
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Handler localHandler = uk.a;
    ms.3 local3 = new com/google/android/gms/b/ms$3;
    local3.<init>(this, paramString1, paramString2, paramString3, paramString4);
    localHandler.post(local3);
  }
  
  public abstract boolean a(String paramString);
}


/* Location:              com/google/android/gms/b/ms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */