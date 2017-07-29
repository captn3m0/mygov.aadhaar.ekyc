package com.google.android.gms.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.i;
import java.io.InputStream;

final class qa$6
  implements ua.a
{
  qa$6(qa paramqa, boolean paramBoolean1, double paramDouble, boolean paramBoolean2, String paramString) {}
  
  private kv b()
  {
    qa localqa = e;
    boolean bool = a;
    localqa.a(2, bool);
    return null;
  }
  
  private kv b(InputStream paramInputStream)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = new android/graphics/BitmapFactory$Options;
    ((BitmapFactory.Options)localObject2).<init>();
    long l1 = 4639833516098453504L;
    double d1 = b;
    double d2 = 160.0D * d1;
    int i = (int)d2;
    inDensity = i;
    boolean bool2 = c;
    Object localObject4;
    if (!bool2)
    {
      localObject4 = Bitmap.Config.RGB_565;
      inPreferredConfig = ((Bitmap.Config)localObject4);
    }
    l1 = SystemClock.uptimeMillis();
    int k = 0;
    Object localObject5 = null;
    Object localObject3;
    try
    {
      localObject2 = BitmapFactory.decodeStream(paramInputStream, null, (BitmapFactory.Options)localObject2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int j;
        boolean bool3;
        localObject5 = "Error grabbing image.";
        tp.b((String)localObject5, localException);
        localObject3 = null;
      }
      l2 = SystemClock.uptimeMillis();
      bool1 = i.c();
      if (!bool1) {
        break label306;
      }
    }
    if (localObject2 == null)
    {
      localObject2 = e;
      j = 2;
      bool3 = a;
      ((qa)localObject2).a(j, bool3);
      return (kv)localObject1;
    }
    long l2;
    bool1 = tp.a();
    int m;
    int n;
    int i1;
    if (bool1)
    {
      m = ((Bitmap)localObject3).getWidth();
      n = ((Bitmap)localObject3).getHeight();
      i1 = ((Bitmap)localObject3).getAllocationByteCount();
      l1 = l2 - l1;
      localObject1 = Looper.getMainLooper().getThread();
      localObject5 = Thread.currentThread();
      if (localObject1 != localObject5) {
        break label357;
      }
      bool1 = true;
    }
    for (;;)
    {
      k = 108;
      Object localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>(k);
      localObject5 = ((StringBuilder)localObject6).append("Decoded image w: ").append(m).append(" h:").append(n).append(" bytes: ").append(i1);
      localObject6 = " time: ";
      localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
      localObject4 = ((StringBuilder)localObject5).append(l1);
      Object localObject7 = " on ui thread: ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject7);
      localObject1 = bool1;
      tp.a((String)localObject1);
      label306:
      localObject1 = new com/google/android/gms/b/kv;
      localObject4 = new android/graphics/drawable/BitmapDrawable;
      localObject7 = Resources.getSystem();
      ((BitmapDrawable)localObject4).<init>((Resources)localObject7, (Bitmap)localObject3);
      localObject3 = Uri.parse(d);
      d1 = b;
      ((kv)localObject1).<init>((Drawable)localObject4, (Uri)localObject3, d1);
      break;
      label357:
      bool1 = false;
      localObject1 = null;
    }
  }
}


/* Location:              com/google/android/gms/b/qa$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */