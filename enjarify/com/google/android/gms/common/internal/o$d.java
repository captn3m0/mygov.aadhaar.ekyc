package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import java.util.concurrent.atomic.AtomicInteger;

final class o$d
  extends Handler
{
  public o$d(o paramo, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private static void a(Message paramMessage)
  {
    ((o.e)obj).c();
  }
  
  private static boolean b(Message paramMessage)
  {
    int i = 1;
    int j = what;
    int m = 2;
    if (j != m)
    {
      j = what;
      if (j != i)
      {
        int k = what;
        int n = 5;
        if (k != n) {
          break label38;
        }
      }
    }
    for (;;)
    {
      return i;
      label38:
      i = 0;
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int j = 1;
    int k = 4;
    Object localObject2 = a.g;
    int m = ((AtomicInteger)localObject2).get();
    int i2 = arg1;
    if (m != i2)
    {
      bool1 = b(paramMessage);
      if (bool1) {
        a(paramMessage);
      }
    }
    for (;;)
    {
      return;
      m = what;
      if (m != j)
      {
        m = what;
        i2 = 5;
        if (m != i2) {}
      }
      else
      {
        localObject2 = a;
        boolean bool3 = ((o)localObject2).c();
        if (!bool3)
        {
          a(paramMessage);
          continue;
        }
      }
      int n = what;
      i2 = 3;
      if (n == i2)
      {
        localObject2 = obj;
        boolean bool4 = localObject2 instanceof PendingIntent;
        if (bool4) {
          localObject1 = (PendingIntent)obj;
        }
        localObject2 = new com/google/android/gms/common/a;
        i2 = arg2;
        ((a)localObject2).<init>(i2, (PendingIntent)localObject1);
        a.f.a((a)localObject2);
        localObject1 = a;
        ((o)localObject1).a((a)localObject2);
      }
      else
      {
        int i1 = what;
        if (i1 == k)
        {
          o.a(a, k);
          localObject2 = o.b(a);
          if (localObject2 != null)
          {
            localObject2 = o.b(a);
            i2 = arg2;
            ((o.b)localObject2).a(i2);
          }
          localObject2 = a;
          i2 = arg2;
          b = i2;
          long l = System.currentTimeMillis();
          c = l;
          localObject2 = a;
          o.a((o)localObject2, k, j, null);
        }
        else
        {
          int i = what;
          i1 = 2;
          if (i == i1)
          {
            localObject1 = a;
            bool2 = ((o)localObject1).b();
            if (!bool2)
            {
              a(paramMessage);
              continue;
            }
          }
          boolean bool2 = b(paramMessage);
          if (bool2)
          {
            localObject1 = (o.e)obj;
            ((o.e)localObject1).b();
          }
          else
          {
            localObject1 = "GmsClient";
            i1 = what;
            i2 = 45;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i2);
            localObject2 = "Don't know how to handle message: " + i1;
            Exception localException = new java/lang/Exception;
            localException.<init>();
            Log.wtf((String)localObject1, (String)localObject2, localException);
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/common/internal/o$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */