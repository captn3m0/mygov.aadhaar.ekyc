package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class cx
  extends bw
{
  private static final String l = cx.class.getSimpleName();
  protected static final Object m = new Object();
  protected static volatile eu n = null;
  static boolean o = false;
  private static long t = 0L;
  protected boolean p = false;
  protected String q;
  protected boolean r = false;
  protected boolean s = false;
  
  protected cx(Context paramContext, String paramString)
  {
    super(paramContext);
    q = paramString;
    p = false;
  }
  
  protected cx(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    q = paramString;
    p = paramBoolean;
  }
  
  private static ev a(eu parameu, MotionEvent paramMotionEvent, DisplayMetrics paramDisplayMetrics)
  {
    parameu = parameu.a("0TNXsDL7i3/giEIRZ2C17w6sUa+xQzpYOanW7gEOVEc4muJ/fNp3f0dblCoU8pib", "8ogG8m4ceWRWghLFGcr4zLKsogeTUYJ2i+fczCQJFPA=");
    if ((parameu == null) || (paramMotionEvent == null)) {
      throw new ea();
    }
    try
    {
      parameu = new ev((String)parameu.invoke(null, new Object[] { paramMotionEvent, paramDisplayMetrics }));
      return parameu;
    }
    catch (IllegalAccessException parameu)
    {
      throw new ea(parameu);
    }
    catch (InvocationTargetException parameu)
    {
      for (;;) {}
    }
  }
  
  protected static void a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      if (!o)
      {
        t = ew.a().longValue() / 1000L;
        n = b(paramContext, paramBoolean);
        o = true;
      }
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  protected static void a(List<Callable<Void>> paramList)
  {
    if (n == null) {}
    ExecutorService localExecutorService;
    do
    {
      return;
      localExecutorService = nc;
    } while ((localExecutorService == null) || (paramList.isEmpty()));
    try
    {
      jz localjz = ke.bI;
      localExecutorService.invokeAll(paramList, ((Long)w.q().a(localjz)).longValue(), TimeUnit.MILLISECONDS);
      return;
    }
    catch (InterruptedException paramList)
    {
      Log.d(l, String.format("class methods got exception: %s", new Object[] { ew.a(paramList) }));
    }
  }
  
  private static eu b(Context paramContext, boolean paramBoolean)
  {
    if (n == null) {}
    synchronized (m)
    {
      if (n == null)
      {
        paramContext = eu.a(paramContext, "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", paramBoolean);
        List localList = Collections.singletonList(Context.class);
        paramContext.a("/kx5MRqcn95qiPsrER7Pf1KGd7PBYuhpMEcvRTG/50mqLTSF+WRdejBEGdAcneo9", "IV2mOci6PItyVa4+aS/m3tdGY5jvNepAthMITbGHa+4=", localList);
        paramContext.a("IV9hgNU9JsTc4ClkKbZpe8gHLDpyFNFShra47+ePwZlB2Y8mKL3aGMjp3Ql9EgBJ", "F2XT6ynN53J7IRvpTV9Po8o9Ngchv/wI14w0QztcuMk=", localList);
        paramContext.a("/2RViZGfJUst9NLI1YVhIh5g4nE8oIpN3GOrU5vSVuhU2xgS9z5ZcLJ8KUCgsyQT", "FdrzkFsdfKtVRmpVR1x5jN+18bWIe2LlExfdpodbFTU=", localList);
        paramContext.a("4Oye2uGRb174AtSucoQCMXsKOLPRgDtGUCNKgJrCjpevU+Bh7oXj7TsvmzPZPD1f", "lFuI8/gNCIV1wobdhu8qnycOiDgkUZitvgC/AcTH7RM=", localList);
        paramContext.a("vgrvc9YBWhwZtRW5xKP3tXwq8T9o3U2EY99is612WSYXB1uhffw25BqnJpLhCcRJ", "i7JiqUVh/vNFaIyVqyhZ1vU247JDx7ffq8Je7lAspAg=", localList);
        paramContext.a("YlqUGaseeN5/KEZL3/9OPCn3KxjeOnHfYuhtRa5qrZeiJeBgKjMjlju2GH0RgEB2", "+9VKZwOzD5EpL/g2LbnFVTMQnh84/y1s9n2uMeAZEm8=", localList);
        paramContext.a("x0r//gwhUayadPsu2BWPTnmSs8k3yJ3JEyAmNFTlai2o/+lAaONDB9oSes1fjdHd", "uopzAucBvwYkIFPOb7MIOUv4dPMynZS9lZF47Ylrpfk=", localList);
        paramContext.a("SSEM9uUQPfYkPsU3UP3Mg3XcPZVaT/KWlqN20JPYYLIcdxqC/CCC7mC2wZiZDswj", "E5tdnbZk6X2J1+Nqz91MRgxlr9tMUVZ/haPbsYy0mjo=", localList);
        localList = Arrays.asList(new Class[] { MotionEvent.class, DisplayMetrics.class });
        paramContext.a("0TNXsDL7i3/giEIRZ2C17w6sUa+xQzpYOanW7gEOVEc4muJ/fNp3f0dblCoU8pib", "8ogG8m4ceWRWghLFGcr4zLKsogeTUYJ2i+fczCQJFPA=", localList);
        paramContext.a("tgAV6P+QhvJIpDVZWLu2Vi80c4ijxphyGQxF8t1uqEuM+kIZfWKhTQe2FwZYkdWS", "r/3I2uWiGR9rkXogqcOABm3hFQH/ZMDFTue5fdYXpNU=", localList);
        paramContext.a("oaRnsXPr2BELeTucy30Z2TT/pCnOqxbeudeAdg9s7JRyq+cL+tahBXal+OL8b75E", "YUePPai1L0abOPOah9wzdXgG5V28uO3KWqq49V7WN5k=", Collections.emptyList());
        paramContext.a("psafpYhT+Yt3VLmcclIEovSSAIT5sMeg3A+UBQfrztazZCapYjckbJ7t0A4OJR9D", "HwvXLxtTgIVH4d3kKsc9SAdJR/JpRH9HPJOMDcQXzEM=", Collections.emptyList());
        paramContext.a("ZQ9ZsXqaSHEWYFyISTNfq3RvP5q+BSdhUx637Uu+Z1DxU7QJ7W6amW1qhT7YRX0o", "4iTbpGgNA5nzndlwyuo6zL5yjVwp+4o9Iq3RMdWi1fk=", Collections.emptyList());
        paramContext.a("lZMvXszq9MYR0PXyvHzxkR0eNlcOcgvd8Bvyi+/hfjQ+Q/D5MWjCFni6cqXRKKOI", "vKKcPNxCASu74n4RwTnsOXYpC4b0wyoL/MxcZZMeT5A=", Collections.emptyList());
        paramContext.a("PTvHnZSJMQCs0mkDCz2LAi9ymjZwU9RstmiIqfwzvqTiwfV/PWGw4xSnULJR5z4d", "UgXzrPdbH/3iHMsrV7tZb551eY3jVMJMSQGGUFhYme8=", Collections.emptyList());
        paramContext.a("SlQ3IItoCMWTgujfTZqrDJhw45FHiEWqbp07eMPHJG6t2FRrK54SZ1a3u0kD/ca9", "NfharOO0iCGE8K4KkOn+B/rG/3LasVf37wmtvqkFHNw=", Collections.emptyList());
        paramContext.a("5emoMKIa7YJzC0KdB+CPE4wnHtgmCkLzQ4P8KmPHDMCxpQUkP2562es3pYk1/4Hk", "VjTBDWP4YxZp87kkPiQQI8Ayevd4l5ABNq/APrjLLY0=", Arrays.asList(new Class[] { Context.class, Boolean.TYPE }));
        paramContext.a("L4KslGfxBQLl4543nGyWld6Y4N2boqcHto9nKUdkh7untYsFwHVHId422XJTH00/", "P2exJ33wh6Ox9YAkDoRzEhRBrKX40dgIWB5vWrtLppk=", Arrays.asList(new Class[] { StackTraceElement[].class }));
        paramContext.a("1g5RXdZuTFRl9aq372jZaVEcfsbdymb0TJnvtxZf2NsLsl/3j8a/geJ2dipi6OtH", "R8hzaN2oxSS2R4X6s/X9LYugT1mItlCr1mrSnRTfVzA=", Arrays.asList(new Class[] { View.class }));
        n = paramContext;
      }
      return n;
    }
  }
  
  protected final long a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    Method localMethod = n.a("L4KslGfxBQLl4543nGyWld6Y4N2boqcHto9nKUdkh7untYsFwHVHId422XJTH00/", "P2exJ33wh6Ox9YAkDoRzEhRBrKX40dgIWB5vWrtLppk=");
    if ((localMethod == null) || (paramArrayOfStackTraceElement == null)) {
      throw new ea();
    }
    try
    {
      long l1 = esinvokea.longValue();
      return l1;
    }
    catch (IllegalAccessException paramArrayOfStackTraceElement)
    {
      throw new ea(paramArrayOfStackTraceElement);
    }
    catch (InvocationTargetException paramArrayOfStackTraceElement)
    {
      for (;;) {}
    }
  }
  
  protected bf.a a(Context paramContext, View paramView)
  {
    locala = new bf.a();
    if (!TextUtils.isEmpty(q)) {
      b = q;
    }
    localeu = b(paramContext, p);
    localeu.h();
    for (;;)
    {
      try
      {
        paramContext = a(localeu, a, k);
        n = a;
        o = b;
        p = c;
        if (this.j)
        {
          D = d;
          E = e;
        }
        localObject = new bf.a.a();
        ev localev = b(a);
        a = a;
        b = b;
        h = c;
        if (this.j)
        {
          c = e;
          e = d;
          if (f.longValue() == 0L) {
            continue;
          }
          i = 1;
          g = Integer.valueOf(i);
          if (d > 0L)
          {
            if (k == null) {
              continue;
            }
            paramContext = Long.valueOf(Math.round(this.i / d));
            d = paramContext;
            f = Long.valueOf(Math.round(h / d));
          }
          j = i;
          i = j;
          if (k.longValue() == 0L) {
            continue;
          }
          i = 1;
          k = Integer.valueOf(i);
          if (g > 0L) {
            l = Long.valueOf(g);
          }
        }
        W = ((bf.a.a)localObject);
      }
      catch (ea paramContext)
      {
        Object localObject;
        int i;
        continue;
      }
      if (c > 0L) {
        I = Long.valueOf(c);
      }
      if (d > 0L) {
        H = Long.valueOf(d);
      }
      if (e > 0L) {
        G = Long.valueOf(e);
      }
      if (f > 0L) {
        J = Long.valueOf(f);
      }
      try
      {
        int j = b.size() - 1;
        if (j <= 0) {
          continue;
        }
        X = new bf.a.a[j];
        i = 0;
        if (i >= j) {
          continue;
        }
        paramContext = a(localeu, (MotionEvent)b.get(i), k);
        localObject = new bf.a.a();
        a = a;
        b = b;
        X[i] = localObject;
        i += 1;
        continue;
        i = 0;
      }
      catch (ea paramContext)
      {
        X = null;
        paramContext = new ArrayList();
        if (c == null) {
          continue;
        }
        i = localeu.j();
        paramContext.add(new fh(localeu, locala));
        paramContext.add(new fk(localeu, "ZQ9ZsXqaSHEWYFyISTNfq3RvP5q+BSdhUx637Uu+Z1DxU7QJ7W6amW1qhT7YRX0o", "4iTbpGgNA5nzndlwyuo6zL5yjVwp+4o9Iq3RMdWi1fk=", locala, i));
        paramContext.add(new ff(localeu, "oaRnsXPr2BELeTucy30Z2TT/pCnOqxbeudeAdg9s7JRyq+cL+tahBXal+OL8b75E", "YUePPai1L0abOPOah9wzdXgG5V28uO3KWqq49V7WN5k=", locala, t, i));
        paramContext.add(new fe(localeu, "lZMvXszq9MYR0PXyvHzxkR0eNlcOcgvd8Bvyi+/hfjQ+Q/D5MWjCFni6cqXRKKOI", "vKKcPNxCASu74n4RwTnsOXYpC4b0wyoL/MxcZZMeT5A=", locala, i));
        paramContext.add(new ey(localeu, "YlqUGaseeN5/KEZL3/9OPCn3KxjeOnHfYuhtRa5qrZeiJeBgKjMjlju2GH0RgEB2", "+9VKZwOzD5EpL/g2LbnFVTMQnh84/y1s9n2uMeAZEm8=", locala, i));
        paramContext.add(new fi(localeu, "PTvHnZSJMQCs0mkDCz2LAi9ymjZwU9RstmiIqfwzvqTiwfV/PWGw4xSnULJR5z4d", "UgXzrPdbH/3iHMsrV7tZb551eY3jVMJMSQGGUFhYme8=", locala, i));
        paramContext.add(new fc(localeu, "4Oye2uGRb174AtSucoQCMXsKOLPRgDtGUCNKgJrCjpevU+Bh7oXj7TsvmzPZPD1f", "lFuI8/gNCIV1wobdhu8qnycOiDgkUZitvgC/AcTH7RM=", locala, i));
        paramContext.add(new fq(localeu, "x0r//gwhUayadPsu2BWPTnmSs8k3yJ3JEyAmNFTlai2o/+lAaONDB9oSes1fjdHd", "uopzAucBvwYkIFPOb7MIOUv4dPMynZS9lZF47Ylrpfk=", locala, i));
        localObject = ke.bL;
        if (!((Boolean)w.q().a((jz)localObject)).booleanValue()) {
          continue;
        }
        paramContext.add(new ez(localeu, "SSEM9uUQPfYkPsU3UP3Mg3XcPZVaT/KWlqN20JPYYLIcdxqC/CCC7mC2wZiZDswj", "E5tdnbZk6X2J1+Nqz91MRgxlr9tMUVZ/haPbsYy0mjo=", locala, i));
        paramContext.add(new fo(localeu, "SlQ3IItoCMWTgujfTZqrDJhw45FHiEWqbp07eMPHJG6t2FRrK54SZ1a3u0kD/ca9", "NfharOO0iCGE8K4KkOn+B/rG/3LasVf37wmtvqkFHNw=", locala, i));
        paramContext.add(new fn(localeu, "L4KslGfxBQLl4543nGyWld6Y4N2boqcHto9nKUdkh7untYsFwHVHId422XJTH00/", "P2exJ33wh6Ox9YAkDoRzEhRBrKX40dgIWB5vWrtLppk=", locala, i, new Throwable().getStackTrace()));
        localObject = ke.bM;
        if (!((Boolean)w.q().a((jz)localObject)).booleanValue()) {
          continue;
        }
        paramContext.add(new fs(localeu, "1g5RXdZuTFRl9aq372jZaVEcfsbdymb0TJnvtxZf2NsLsl/3j8a/geJ2dipi6OtH", "R8hzaN2oxSS2R4X6s/X9LYugT1mItlCr1mrSnRTfVzA=", locala, i, paramView));
        a(paramContext);
        localeu.i();
        return locala;
      }
      paramContext = null;
      continue;
      i = 0;
    }
  }
  
  protected final bf.a a(Context paramContext, bd.a parama)
  {
    bf.a locala = new bf.a();
    if (!TextUtils.isEmpty(q)) {
      b = q;
    }
    paramContext = b(paramContext, p);
    paramContext.h();
    a(paramContext, locala, parama);
    paramContext.i();
    return locala;
  }
  
  protected void a(eu parameu, bf.a parama, bd.a parama1)
  {
    if (c == null) {
      return;
    }
    a(b(parameu, parama, parama1));
  }
  
  protected final ev b(MotionEvent paramMotionEvent)
  {
    Method localMethod = n.a("tgAV6P+QhvJIpDVZWLu2Vi80c4ijxphyGQxF8t1uqEuM+kIZfWKhTQe2FwZYkdWS", "r/3I2uWiGR9rkXogqcOABm3hFQH/ZMDFTue5fdYXpNU=");
    if ((localMethod == null) || (paramMotionEvent == null)) {
      throw new ea();
    }
    try
    {
      paramMotionEvent = new ev((String)localMethod.invoke(null, new Object[] { paramMotionEvent, k }));
      return paramMotionEvent;
    }
    catch (IllegalAccessException paramMotionEvent)
    {
      throw new ea(paramMotionEvent);
    }
    catch (InvocationTargetException paramMotionEvent)
    {
      for (;;) {}
    }
  }
  
  protected List<Callable<Void>> b(eu parameu, bf.a parama, bd.a parama1)
  {
    int i = parameu.j();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new fb(parameu, "5emoMKIa7YJzC0KdB+CPE4wnHtgmCkLzQ4P8KmPHDMCxpQUkP2562es3pYk1/4Hk", "VjTBDWP4YxZp87kkPiQQI8Ayevd4l5ABNq/APrjLLY0=", parama, i, parama1));
    localArrayList.add(new ff(parameu, "oaRnsXPr2BELeTucy30Z2TT/pCnOqxbeudeAdg9s7JRyq+cL+tahBXal+OL8b75E", "YUePPai1L0abOPOah9wzdXgG5V28uO3KWqq49V7WN5k=", parama, t, i));
    localArrayList.add(new fk(parameu, "ZQ9ZsXqaSHEWYFyISTNfq3RvP5q+BSdhUx637Uu+Z1DxU7QJ7W6amW1qhT7YRX0o", "4iTbpGgNA5nzndlwyuo6zL5yjVwp+4o9Iq3RMdWi1fk=", parama, i));
    localArrayList.add(new fl(parameu, "/2RViZGfJUst9NLI1YVhIh5g4nE8oIpN3GOrU5vSVuhU2xgS9z5ZcLJ8KUCgsyQT", "FdrzkFsdfKtVRmpVR1x5jN+18bWIe2LlExfdpodbFTU=", parama, i));
    localArrayList.add(new fp(parameu, "psafpYhT+Yt3VLmcclIEovSSAIT5sMeg3A+UBQfrztazZCapYjckbJ7t0A4OJR9D", "HwvXLxtTgIVH4d3kKsc9SAdJR/JpRH9HPJOMDcQXzEM=", parama, i));
    localArrayList.add(new fa(parameu, "IV9hgNU9JsTc4ClkKbZpe8gHLDpyFNFShra47+ePwZlB2Y8mKL3aGMjp3Ql9EgBJ", "F2XT6ynN53J7IRvpTV9Po8o9Ngchv/wI14w0QztcuMk=", parama, i));
    localArrayList.add(new fc(parameu, "4Oye2uGRb174AtSucoQCMXsKOLPRgDtGUCNKgJrCjpevU+Bh7oXj7TsvmzPZPD1f", "lFuI8/gNCIV1wobdhu8qnycOiDgkUZitvgC/AcTH7RM=", parama, i));
    localArrayList.add(new fj(parameu, "vgrvc9YBWhwZtRW5xKP3tXwq8T9o3U2EY99is612WSYXB1uhffw25BqnJpLhCcRJ", "i7JiqUVh/vNFaIyVqyhZ1vU247JDx7ffq8Je7lAspAg=", parama, i));
    localArrayList.add(new ey(parameu, "YlqUGaseeN5/KEZL3/9OPCn3KxjeOnHfYuhtRa5qrZeiJeBgKjMjlju2GH0RgEB2", "+9VKZwOzD5EpL/g2LbnFVTMQnh84/y1s9n2uMeAZEm8=", parama, i));
    localArrayList.add(new fe(parameu, "lZMvXszq9MYR0PXyvHzxkR0eNlcOcgvd8Bvyi+/hfjQ+Q/D5MWjCFni6cqXRKKOI", "vKKcPNxCASu74n4RwTnsOXYpC4b0wyoL/MxcZZMeT5A=", parama, i));
    localArrayList.add(new fi(parameu, "PTvHnZSJMQCs0mkDCz2LAi9ymjZwU9RstmiIqfwzvqTiwfV/PWGw4xSnULJR5z4d", "UgXzrPdbH/3iHMsrV7tZb551eY3jVMJMSQGGUFhYme8=", parama, i));
    localArrayList.add(new fq(parameu, "x0r//gwhUayadPsu2BWPTnmSs8k3yJ3JEyAmNFTlai2o/+lAaONDB9oSes1fjdHd", "uopzAucBvwYkIFPOb7MIOUv4dPMynZS9lZF47Ylrpfk=", parama, i));
    parama1 = ke.bK;
    if (((Boolean)w.q().a(parama1)).booleanValue()) {
      localArrayList.add(new ez(parameu, "SSEM9uUQPfYkPsU3UP3Mg3XcPZVaT/KWlqN20JPYYLIcdxqC/CCC7mC2wZiZDswj", "E5tdnbZk6X2J1+Nqz91MRgxlr9tMUVZ/haPbsYy0mjo=", parama, i));
    }
    localArrayList.add(new fo(parameu, "SlQ3IItoCMWTgujfTZqrDJhw45FHiEWqbp07eMPHJG6t2FRrK54SZ1a3u0kD/ca9", "NfharOO0iCGE8K4KkOn+B/rG/3LasVf37wmtvqkFHNw=", parama, i));
    return localArrayList;
  }
}


/* Location:              com/google/android/gms/b/cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */