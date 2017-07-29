package com.google.android.gms.b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadLocalRandom;

public class bl
{
  protected static volatile vz a = null;
  private static final ConditionVariable d;
  private static volatile Random e = null;
  protected volatile Boolean b;
  private eu c;
  
  static
  {
    ConditionVariable localConditionVariable = new android/os/ConditionVariable;
    localConditionVariable.<init>();
    d = localConditionVariable;
  }
  
  public bl(eu parameu)
  {
    c = parameu;
    ExecutorService localExecutorService = c;
    bl.1 local1 = new com/google/android/gms/b/bl$1;
    local1.<init>(this);
    localExecutorService.execute(local1);
  }
  
  public static int a()
  {
    for (;;)
    {
      try
      {
        i = Build.VERSION.SDK_INT;
        int j = 21;
        if (i < j) {
          continue;
        }
        localObject = ThreadLocalRandom.current();
        i = ((ThreadLocalRandom)localObject).nextInt();
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject;
        Random localRandom = c();
        int i = localRandom.nextInt();
        continue;
      }
      return i;
      localObject = c();
      i = ((Random)localObject).nextInt();
    }
  }
  
  private static Random c()
  {
    Random localRandom = e;
    if (localRandom == null) {}
    synchronized (bl.class)
    {
      localRandom = e;
      if (localRandom == null)
      {
        localRandom = new java/util/Random;
        localRandom.<init>();
        e = localRandom;
      }
      return e;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong)
  {
    boolean bool1;
    Object localObject3;
    vz.a locala;
    int j;
    Object localObject4;
    try
    {
      Object localObject1 = d;
      ((ConditionVariable)localObject1).block();
      localObject1 = b;
      bool1 = ((Boolean)localObject1).booleanValue();
      if (bool1)
      {
        localObject1 = a;
        if (localObject1 != null)
        {
          localObject1 = c;
          bool1 = ((eu)localObject1).d();
          if (bool1)
          {
            localObject1 = new com/google/android/gms/b/be$a;
            ((be.a)localObject1).<init>();
            localObject3 = c;
            localObject3 = ((eu)localObject3).a();
            localObject3 = ((Context)localObject3).getPackageName();
            a = ((String)localObject3);
            localObject3 = Long.valueOf(paramLong);
            b = ((Long)localObject3);
            localObject3 = a;
            localObject1 = gb.a((gb)localObject1);
            locala = new com/google/android/gms/b/vz$a;
            j = 0;
            localObject4 = null;
            locala.<init>((vz)localObject3, (byte[])localObject1, '\000');
            localObject1 = h;
            f = paramInt2;
            localObject1 = h;
            e = paramInt1;
            localObject1 = c;
            localObject1 = k;
            bool1 = i;
            if (!bool1) {
              break label212;
            }
            localObject1 = new java/lang/IllegalStateException;
            localObject3 = "do not reuse LogEventBuilder";
            ((IllegalStateException)localObject1).<init>((String)localObject3);
            throw ((Throwable)localObject1);
          }
        }
      }
    }
    catch (Exception localException) {}
    for (;;)
    {
      return;
      label212:
      bool1 = true;
      i = bool1;
      wb localwb = new com/google/android/gms/b/wb;
      Object localObject2 = new com/google/android/gms/b/wj;
      localObject3 = j;
      localObject3 = vz.h((vz)localObject3);
      localObject4 = j;
      j = vz.i((vz)localObject4);
      int k = a;
      Object localObject5 = b;
      Object localObject6 = c;
      Object localObject7 = d;
      Object localObject8 = j;
      boolean bool3 = vz.g((vz)localObject8);
      int m = e;
      ((wj)localObject2).<init>((String)localObject3, j, k, (String)localObject5, (String)localObject6, (String)localObject7, bool3, m);
      gf.d locald = h;
      localObject5 = f;
      localObject6 = vz.b();
      localObject7 = vz.c();
      localObject8 = vz.b();
      byte[][] arrayOfByte = vz.d();
      boolean bool4 = g;
      localObject3 = localwb;
      localObject4 = localObject2;
      localwb.<init>((wj)localObject2, locald, (vz.c)localObject5, (int[])localObject6, (String[])localObject7, (int[])localObject8, arrayOfByte, bool4);
      localObject2 = a;
      localObject3 = j;
      localObject3 = vz.j((vz)localObject3);
      localObject4 = g;
      int i = c;
      boolean bool2 = ((vz.b)localObject3).a((String)localObject4, i);
      if (bool2)
      {
        localObject2 = j;
        localObject2 = vz.k((vz)localObject2);
        ((wa)localObject2).a(localwb);
      }
      else
      {
        localObject2 = Status.a;
        e.a((Status)localObject2);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/bl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */