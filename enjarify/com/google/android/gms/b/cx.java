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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class cx
  extends bw
{
  private static final String l = cx.class.getSimpleName();
  protected static final Object m;
  protected static volatile eu n = null;
  static boolean o = false;
  private static long t = 0L;
  protected boolean p = false;
  protected String q;
  protected boolean r = false;
  protected boolean s = false;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    m = localObject;
  }
  
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
    Object localObject1 = "8ogG8m4ceWRWghLFGcr4zLKsogeTUYJ2i+fczCQJFPA=";
    Object localObject2 = parameu.a("0TNXsDL7i3/giEIRZ2C17w6sUa+xQzpYOanW7gEOVEc4muJ/fNp3f0dblCoU8pib", (String)localObject1);
    if ((localObject2 == null) || (paramMotionEvent == null))
    {
      localObject2 = new com/google/android/gms/b/ea;
      ((ea)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
    try
    {
      localObject1 = new com/google/android/gms/b/ev;
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      arrayOfObject[0] = paramMotionEvent;
      j = 1;
      arrayOfObject[j] = paramDisplayMetrics;
      localObject2 = ((Method)localObject2).invoke(null, arrayOfObject);
      localObject2 = (String)localObject2;
      ((ev)localObject1).<init>((String)localObject2);
      return (ev)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject1 = new com/google/android/gms/b/ea;
      ((ea)localObject1).<init>(localIllegalAccessException);
      throw ((Throwable)localObject1);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  protected static void a(Context paramContext, boolean paramBoolean)
  {
    synchronized (cx.class)
    {
      boolean bool = o;
      if (!bool)
      {
        Object localObject1 = ew.a();
        long l1 = ((Long)localObject1).longValue();
        long l2 = 1000L;
        l1 /= l2;
        t = l1;
        localObject1 = b(paramContext, paramBoolean);
        n = (eu)localObject1;
        bool = true;
        o = bool;
      }
      return;
    }
  }
  
  protected static void a(List paramList)
  {
    Object localObject1 = n;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = n;
      Object localObject2 = c;
      if (localObject2 != null)
      {
        boolean bool = paramList.isEmpty();
        if (!bool) {
          try
          {
            localObject1 = ke.bI;
            localObject3 = w.q();
            localObject1 = ((kd)localObject3).a((jz)localObject1);
            localObject1 = (Long)localObject1;
            long l1 = ((Long)localObject1).longValue();
            localObject1 = TimeUnit.MILLISECONDS;
            ((ExecutorService)localObject2).invokeAll(paramList, l1, (TimeUnit)localObject1);
          }
          catch (InterruptedException localInterruptedException)
          {
            localObject2 = l;
            Object localObject3 = "class methods got exception: %s";
            int i = 1;
            Object[] arrayOfObject = new Object[i];
            String str = ew.a(localInterruptedException);
            arrayOfObject[0] = str;
            str = String.format((String)localObject3, arrayOfObject);
            Log.d((String)localObject2, str);
          }
        }
      }
    }
  }
  
  private static eu b(Context paramContext, boolean paramBoolean)
  {
    Object localObject1 = n;
    if (localObject1 == null) {}
    synchronized (m)
    {
      localObject1 = n;
      if (localObject1 == null)
      {
        localObject1 = "pWgSmgxREOizVsrpWzv2FevgkMRzEzPQ2R2fRa7gjO4=";
        Object localObject4 = "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";
        localObject1 = eu.a(paramContext, (String)localObject1, (String)localObject4, paramBoolean);
        localObject4 = Context.class;
        localObject4 = Collections.singletonList(localObject4);
        String str = "/kx5MRqcn95qiPsrER7Pf1KGd7PBYuhpMEcvRTG/50mqLTSF+WRdejBEGdAcneo9";
        Object localObject5 = "IV2mOci6PItyVa4+aS/m3tdGY5jvNepAthMITbGHa+4=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "IV9hgNU9JsTc4ClkKbZpe8gHLDpyFNFShra47+ePwZlB2Y8mKL3aGMjp3Ql9EgBJ";
        localObject5 = "F2XT6ynN53J7IRvpTV9Po8o9Ngchv/wI14w0QztcuMk=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "/2RViZGfJUst9NLI1YVhIh5g4nE8oIpN3GOrU5vSVuhU2xgS9z5ZcLJ8KUCgsyQT";
        localObject5 = "FdrzkFsdfKtVRmpVR1x5jN+18bWIe2LlExfdpodbFTU=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "4Oye2uGRb174AtSucoQCMXsKOLPRgDtGUCNKgJrCjpevU+Bh7oXj7TsvmzPZPD1f";
        localObject5 = "lFuI8/gNCIV1wobdhu8qnycOiDgkUZitvgC/AcTH7RM=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "vgrvc9YBWhwZtRW5xKP3tXwq8T9o3U2EY99is612WSYXB1uhffw25BqnJpLhCcRJ";
        localObject5 = "i7JiqUVh/vNFaIyVqyhZ1vU247JDx7ffq8Je7lAspAg=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "YlqUGaseeN5/KEZL3/9OPCn3KxjeOnHfYuhtRa5qrZeiJeBgKjMjlju2GH0RgEB2";
        localObject5 = "+9VKZwOzD5EpL/g2LbnFVTMQnh84/y1s9n2uMeAZEm8=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "x0r//gwhUayadPsu2BWPTnmSs8k3yJ3JEyAmNFTlai2o/+lAaONDB9oSes1fjdHd";
        localObject5 = "uopzAucBvwYkIFPOb7MIOUv4dPMynZS9lZF47Ylrpfk=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "SSEM9uUQPfYkPsU3UP3Mg3XcPZVaT/KWlqN20JPYYLIcdxqC/CCC7mC2wZiZDswj";
        localObject5 = "E5tdnbZk6X2J1+Nqz91MRgxlr9tMUVZ/haPbsYy0mjo=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        int i = 2;
        localObject4 = new Class[i];
        int j = 0;
        str = null;
        localObject5 = MotionEvent.class;
        localObject4[0] = localObject5;
        j = 1;
        localObject5 = DisplayMetrics.class;
        localObject4[j] = localObject5;
        localObject4 = Arrays.asList((Object[])localObject4);
        str = "0TNXsDL7i3/giEIRZ2C17w6sUa+xQzpYOanW7gEOVEc4muJ/fNp3f0dblCoU8pib";
        localObject5 = "8ogG8m4ceWRWghLFGcr4zLKsogeTUYJ2i+fczCQJFPA=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        str = "tgAV6P+QhvJIpDVZWLu2Vi80c4ijxphyGQxF8t1uqEuM+kIZfWKhTQe2FwZYkdWS";
        localObject5 = "r/3I2uWiGR9rkXogqcOABm3hFQH/ZMDFTue5fdYXpNU=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        localObject4 = "oaRnsXPr2BELeTucy30Z2TT/pCnOqxbeudeAdg9s7JRyq+cL+tahBXal+OL8b75E";
        str = "YUePPai1L0abOPOah9wzdXgG5V28uO3KWqq49V7WN5k=";
        localObject5 = Collections.emptyList();
        ((eu)localObject1).a((String)localObject4, str, (List)localObject5);
        localObject4 = "psafpYhT+Yt3VLmcclIEovSSAIT5sMeg3A+UBQfrztazZCapYjckbJ7t0A4OJR9D";
        str = "HwvXLxtTgIVH4d3kKsc9SAdJR/JpRH9HPJOMDcQXzEM=";
        localObject5 = Collections.emptyList();
        ((eu)localObject1).a((String)localObject4, str, (List)localObject5);
        localObject4 = "ZQ9ZsXqaSHEWYFyISTNfq3RvP5q+BSdhUx637Uu+Z1DxU7QJ7W6amW1qhT7YRX0o";
        str = "4iTbpGgNA5nzndlwyuo6zL5yjVwp+4o9Iq3RMdWi1fk=";
        localObject5 = Collections.emptyList();
        ((eu)localObject1).a((String)localObject4, str, (List)localObject5);
        localObject4 = "lZMvXszq9MYR0PXyvHzxkR0eNlcOcgvd8Bvyi+/hfjQ+Q/D5MWjCFni6cqXRKKOI";
        str = "vKKcPNxCASu74n4RwTnsOXYpC4b0wyoL/MxcZZMeT5A=";
        localObject5 = Collections.emptyList();
        ((eu)localObject1).a((String)localObject4, str, (List)localObject5);
        localObject4 = "PTvHnZSJMQCs0mkDCz2LAi9ymjZwU9RstmiIqfwzvqTiwfV/PWGw4xSnULJR5z4d";
        str = "UgXzrPdbH/3iHMsrV7tZb551eY3jVMJMSQGGUFhYme8=";
        localObject5 = Collections.emptyList();
        ((eu)localObject1).a((String)localObject4, str, (List)localObject5);
        localObject4 = "SlQ3IItoCMWTgujfTZqrDJhw45FHiEWqbp07eMPHJG6t2FRrK54SZ1a3u0kD/ca9";
        str = "NfharOO0iCGE8K4KkOn+B/rG/3LasVf37wmtvqkFHNw=";
        localObject5 = Collections.emptyList();
        ((eu)localObject1).a((String)localObject4, str, (List)localObject5);
        i = 2;
        localObject4 = new Class[i];
        j = 0;
        str = null;
        localObject5 = Context.class;
        localObject4[0] = localObject5;
        j = 1;
        localObject5 = Boolean.TYPE;
        localObject4[j] = localObject5;
        localObject4 = Arrays.asList((Object[])localObject4);
        str = "5emoMKIa7YJzC0KdB+CPE4wnHtgmCkLzQ4P8KmPHDMCxpQUkP2562es3pYk1/4Hk";
        localObject5 = "VjTBDWP4YxZp87kkPiQQI8Ayevd4l5ABNq/APrjLLY0=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        i = 1;
        localObject4 = new Class[i];
        j = 0;
        str = null;
        localObject5 = StackTraceElement[].class;
        localObject4[0] = localObject5;
        localObject4 = Arrays.asList((Object[])localObject4);
        str = "L4KslGfxBQLl4543nGyWld6Y4N2boqcHto9nKUdkh7untYsFwHVHId422XJTH00/";
        localObject5 = "P2exJ33wh6Ox9YAkDoRzEhRBrKX40dgIWB5vWrtLppk=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        i = 1;
        localObject4 = new Class[i];
        j = 0;
        str = null;
        localObject5 = View.class;
        localObject4[0] = localObject5;
        localObject4 = Arrays.asList((Object[])localObject4);
        str = "1g5RXdZuTFRl9aq372jZaVEcfsbdymb0TJnvtxZf2NsLsl/3j8a/geJ2dipi6OtH";
        localObject5 = "R8hzaN2oxSS2R4X6s/X9LYugT1mItlCr1mrSnRTfVzA=";
        ((eu)localObject1).a(str, (String)localObject5, (List)localObject4);
        n = (eu)localObject1;
      }
      return n;
    }
  }
  
  protected final long a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    Object localObject1 = n;
    Object localObject2 = "L4KslGfxBQLl4543nGyWld6Y4N2boqcHto9nKUdkh7untYsFwHVHId422XJTH00/";
    String str = "P2exJ33wh6Ox9YAkDoRzEhRBrKX40dgIWB5vWrtLppk=";
    localObject1 = ((eu)localObject1).a((String)localObject2, str);
    if ((localObject1 == null) || (paramArrayOfStackTraceElement == null))
    {
      localObject1 = new com/google/android/gms/b/ea;
      ((ea)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject2 = new com/google/android/gms/b/es;
      str = null;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramArrayOfStackTraceElement;
      localObject1 = ((Method)localObject1).invoke(null, arrayOfObject);
      localObject1 = (String)localObject1;
      ((es)localObject2).<init>((String)localObject1);
      localObject1 = a;
      return ((Long)localObject1).longValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new com/google/android/gms/b/ea;
      ((ea)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  protected bf.a a(Context paramContext, View paramView)
  {
    locala = new com/google/android/gms/b/bf$a;
    locala.<init>();
    Object localObject1 = q;
    int i = TextUtils.isEmpty((CharSequence)localObject1);
    if (i == 0)
    {
      localObject1 = q;
      b = ((String)localObject1);
    }
    i = p;
    localeu = b(paramContext, i);
    localeu.h();
    for (;;)
    {
      try
      {
        localObject1 = a;
        localObject3 = this.k;
        localObject1 = a(localeu, (MotionEvent)localObject1, (DisplayMetrics)localObject3);
        localObject3 = a;
        n = ((Long)localObject3);
        localObject3 = b;
        o = ((Long)localObject3);
        localObject3 = c;
        p = ((Long)localObject3);
        i1 = this.j;
        if (i1 != 0)
        {
          localObject3 = d;
          D = ((Long)localObject3);
          localObject1 = e;
          E = ((Long)localObject1);
        }
        localObject3 = new com/google/android/gms/b/bf$a$a;
        ((bf.a.a)localObject3).<init>();
        localObject1 = a;
        localObject4 = b((MotionEvent)localObject1);
        localObject1 = a;
        a = ((Long)localObject1);
        localObject1 = b;
        b = ((Long)localObject1);
        localObject1 = c;
        h = ((Long)localObject1);
        i = this.j;
        if (i != 0)
        {
          localObject1 = e;
          c = ((Long)localObject1);
          localObject1 = d;
          e = ((Long)localObject1);
          localObject1 = f;
          l1 = ((Long)localObject1).longValue();
          long l2 = 0L;
          double d1 = 0.0D;
          i = l1 < l2;
          if (i == 0) {
            continue;
          }
          i = 1;
          localObject1 = Integer.valueOf(i);
          g = ((Integer)localObject1);
          l1 = d;
          l2 = 0L;
          d1 = 0.0D;
          int j = l1 < l2;
          if (j > 0)
          {
            localObject1 = this.k;
            if (localObject1 == null) {
              continue;
            }
            l1 = this.i;
            d2 = l1;
            l2 = d;
            d1 = l2;
            d2 /= d1;
            l1 = Math.round(d2);
            localObject1 = Long.valueOf(l1);
            d = ((Long)localObject1);
            l1 = h;
            d2 = l1;
            l2 = d;
            d1 = l2;
            d2 /= d1;
            l1 = Math.round(d2);
            localObject1 = Long.valueOf(l1);
            f = ((Long)localObject1);
          }
          localObject1 = i;
          j = ((Long)localObject1);
          localObject1 = j;
          i = ((Long)localObject1);
          localObject1 = k;
          l1 = ((Long)localObject1).longValue();
          l2 = 0L;
          d1 = 0.0D;
          j = l1 < l2;
          if (j == 0) {
            continue;
          }
          j = 1;
          localObject1 = Integer.valueOf(j);
          k = ((Integer)localObject1);
          l1 = g;
          l2 = 0L;
          d1 = 0.0D;
          bool1 = l1 < l2;
          if (bool1)
          {
            l1 = g;
            localObject1 = Long.valueOf(l1);
            l = ((Long)localObject1);
          }
        }
        W = ((bf.a.a)localObject3);
      }
      catch (ea localea2)
      {
        Object localObject3;
        int i1;
        Object localObject4;
        long l1;
        double d2;
        boolean bool1;
        long l3;
        continue;
      }
      l3 = c;
      l1 = 0L;
      d2 = 0.0D;
      bool1 = l3 < l1;
      if (bool1)
      {
        l3 = c;
        localObject1 = Long.valueOf(l3);
        I = ((Long)localObject1);
      }
      l3 = d;
      l1 = 0L;
      d2 = 0.0D;
      bool1 = l3 < l1;
      if (bool1)
      {
        l3 = d;
        localObject1 = Long.valueOf(l3);
        H = ((Long)localObject1);
      }
      l3 = e;
      l1 = 0L;
      d2 = 0.0D;
      bool1 = l3 < l1;
      if (bool1)
      {
        l3 = e;
        localObject1 = Long.valueOf(l3);
        G = ((Long)localObject1);
      }
      l3 = f;
      l1 = 0L;
      d2 = 0.0D;
      bool1 = l3 < l1;
      if (bool1)
      {
        l3 = f;
        localObject1 = Long.valueOf(l3);
        J = ((Long)localObject1);
      }
      try
      {
        localObject1 = b;
        k = ((LinkedList)localObject1).size();
        int i2 = k + -1;
        if (i2 <= 0) {
          continue;
        }
        localObject1 = new bf.a.a[i2];
        X = ((bf.a.a[])localObject1);
        k = 0;
        localObject1 = null;
        i1 = 0;
        localObject3 = null;
        if (i1 >= i2) {
          continue;
        }
        localObject1 = b;
        localObject1 = ((LinkedList)localObject1).get(i1);
        localObject1 = (MotionEvent)localObject1;
        Object localObject5 = this.k;
        localObject1 = a(localeu, (MotionEvent)localObject1, (DisplayMetrics)localObject5);
        localObject5 = new com/google/android/gms/b/bf$a$a;
        ((bf.a.a)localObject5).<init>();
        localObject6 = a;
        a = ((Long)localObject6);
        localObject1 = b;
        b = ((Long)localObject1);
        localObject1 = X;
        localObject1[i1] = localObject5;
        k = i1 + 1;
        i1 = k;
        continue;
        k = 0;
        localObject1 = null;
      }
      catch (ea localea1)
      {
        int k = 0;
        Object localObject2 = null;
        X = null;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject2 = c;
        if (localObject2 == null) {
          continue;
        }
        int i3 = localeu.j();
        localObject2 = new com/google/android/gms/b/fh;
        ((fh)localObject2).<init>(localeu, locala);
        localArrayList.add(localObject2);
        localObject2 = new com/google/android/gms/b/fk;
        ((fk)localObject2).<init>(localeu, "ZQ9ZsXqaSHEWYFyISTNfq3RvP5q+BSdhUx637Uu+Z1DxU7QJ7W6amW1qhT7YRX0o", "4iTbpGgNA5nzndlwyuo6zL5yjVwp+4o9Iq3RMdWi1fk=", locala, i3);
        localArrayList.add(localObject2);
        ff localff = new com/google/android/gms/b/ff;
        String str1 = "oaRnsXPr2BELeTucy30Z2TT/pCnOqxbeudeAdg9s7JRyq+cL+tahBXal+OL8b75E";
        String str2 = "YUePPai1L0abOPOah9wzdXgG5V28uO3KWqq49V7WN5k=";
        long l4 = t;
        localff.<init>(localeu, str1, str2, locala, l4, i3);
        localArrayList.add(localff);
        localObject2 = new com/google/android/gms/b/fe;
        ((fe)localObject2).<init>(localeu, "lZMvXszq9MYR0PXyvHzxkR0eNlcOcgvd8Bvyi+/hfjQ+Q/D5MWjCFni6cqXRKKOI", "vKKcPNxCASu74n4RwTnsOXYpC4b0wyoL/MxcZZMeT5A=", locala, i3);
        localArrayList.add(localObject2);
        localObject2 = new com/google/android/gms/b/ey;
        ((ey)localObject2).<init>(localeu, "YlqUGaseeN5/KEZL3/9OPCn3KxjeOnHfYuhtRa5qrZeiJeBgKjMjlju2GH0RgEB2", "+9VKZwOzD5EpL/g2LbnFVTMQnh84/y1s9n2uMeAZEm8=", locala, i3);
        localArrayList.add(localObject2);
        localObject2 = new com/google/android/gms/b/fi;
        ((fi)localObject2).<init>(localeu, "PTvHnZSJMQCs0mkDCz2LAi9ymjZwU9RstmiIqfwzvqTiwfV/PWGw4xSnULJR5z4d", "UgXzrPdbH/3iHMsrV7tZb551eY3jVMJMSQGGUFhYme8=", locala, i3);
        localArrayList.add(localObject2);
        localObject2 = new com/google/android/gms/b/fc;
        ((fc)localObject2).<init>(localeu, "4Oye2uGRb174AtSucoQCMXsKOLPRgDtGUCNKgJrCjpevU+Bh7oXj7TsvmzPZPD1f", "lFuI8/gNCIV1wobdhu8qnycOiDgkUZitvgC/AcTH7RM=", locala, i3);
        localArrayList.add(localObject2);
        localObject2 = new com/google/android/gms/b/fq;
        localObject4 = "uopzAucBvwYkIFPOb7MIOUv4dPMynZS9lZF47Ylrpfk=";
        ((fq)localObject2).<init>(localeu, "x0r//gwhUayadPsu2BWPTnmSs8k3yJ3JEyAmNFTlai2o/+lAaONDB9oSes1fjdHd", (String)localObject4, locala, i3);
        localArrayList.add(localObject2);
        localObject2 = ke.bL;
        localObject3 = w.q();
        localObject2 = (Boolean)((kd)localObject3).a((jz)localObject2);
        boolean bool2 = ((Boolean)localObject2).booleanValue();
        if (!bool2) {
          continue;
        }
        localObject2 = new com/google/android/gms/b/ez;
        localObject3 = "SSEM9uUQPfYkPsU3UP3Mg3XcPZVaT/KWlqN20JPYYLIcdxqC/CCC7mC2wZiZDswj";
        localObject4 = "E5tdnbZk6X2J1+Nqz91MRgxlr9tMUVZ/haPbsYy0mjo=";
        ((ez)localObject2).<init>(localeu, (String)localObject3, (String)localObject4, locala, i3);
        localArrayList.add(localObject2);
        localObject2 = new com/google/android/gms/b/fo;
        ((fo)localObject2).<init>(localeu, "SlQ3IItoCMWTgujfTZqrDJhw45FHiEWqbp07eMPHJG6t2FRrK54SZ1a3u0kD/ca9", "NfharOO0iCGE8K4KkOn+B/rG/3LasVf37wmtvqkFHNw=", locala, i3);
        localArrayList.add(localObject2);
        localObject2 = new com/google/android/gms/b/fn;
        localObject4 = "P2exJ33wh6Ox9YAkDoRzEhRBrKX40dgIWB5vWrtLppk=";
        Object localObject6 = new java/lang/Throwable;
        ((Throwable)localObject6).<init>();
        localObject6 = ((Throwable)localObject6).getStackTrace();
        ((fn)localObject2).<init>(localeu, "L4KslGfxBQLl4543nGyWld6Y4N2boqcHto9nKUdkh7untYsFwHVHId422XJTH00/", (String)localObject4, locala, i3, (StackTraceElement[])localObject6);
        localArrayList.add(localObject2);
        localObject2 = ke.bM;
        localObject3 = w.q();
        localObject2 = (Boolean)((kd)localObject3).a((jz)localObject2);
        bool2 = ((Boolean)localObject2).booleanValue();
        if (!bool2) {
          continue;
        }
        localObject2 = new com/google/android/gms/b/fs;
        localObject3 = "1g5RXdZuTFRl9aq372jZaVEcfsbdymb0TJnvtxZf2NsLsl/3j8a/geJ2dipi6OtH";
        localObject4 = "R8hzaN2oxSS2R4X6s/X9LYugT1mItlCr1mrSnRTfVzA=";
        localObject6 = paramView;
        ((fs)localObject2).<init>(localeu, (String)localObject3, (String)localObject4, locala, i3, paramView);
        localArrayList.add(localObject2);
        a(localArrayList);
        localeu.i();
        return locala;
      }
      k = 0;
      localObject1 = null;
      continue;
      k = 0;
      localObject1 = null;
    }
  }
  
  protected final bf.a a(Context paramContext, bd.a parama)
  {
    bf.a locala = new com/google/android/gms/b/bf$a;
    locala.<init>();
    Object localObject = q;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool)
    {
      localObject = q;
      b = ((String)localObject);
    }
    bool = p;
    localObject = b(paramContext, bool);
    ((eu)localObject).h();
    a((eu)localObject, locala, parama);
    ((eu)localObject).i();
    return locala;
  }
  
  protected void a(eu parameu, bf.a parama, bd.a parama1)
  {
    Object localObject = c;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = b(parameu, parama, parama1);
      a((List)localObject);
    }
  }
  
  protected final ev b(MotionEvent paramMotionEvent)
  {
    Object localObject1 = n;
    Object localObject2 = "tgAV6P+QhvJIpDVZWLu2Vi80c4ijxphyGQxF8t1uqEuM+kIZfWKhTQe2FwZYkdWS";
    String str = "r/3I2uWiGR9rkXogqcOABm3hFQH/ZMDFTue5fdYXpNU=";
    localObject1 = ((eu)localObject1).a((String)localObject2, str);
    if ((localObject1 == null) || (paramMotionEvent == null))
    {
      localObject1 = new com/google/android/gms/b/ea;
      ((ea)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject2 = new com/google/android/gms/b/ev;
      str = null;
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      arrayOfObject[0] = paramMotionEvent;
      j = 1;
      DisplayMetrics localDisplayMetrics = k;
      arrayOfObject[j] = localDisplayMetrics;
      localObject1 = ((Method)localObject1).invoke(null, arrayOfObject);
      localObject1 = (String)localObject1;
      ((ev)localObject2).<init>((String)localObject1);
      return (ev)localObject2;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new com/google/android/gms/b/ea;
      ((ea)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  protected List b(eu parameu, bf.a parama, bd.a parama1)
  {
    int i = parameu.j();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/google/android/gms/b/fb;
    Object localObject2 = parameu;
    ((fb)localObject1).<init>(parameu, "5emoMKIa7YJzC0KdB+CPE4wnHtgmCkLzQ4P8KmPHDMCxpQUkP2562es3pYk1/4Hk", "VjTBDWP4YxZp87kkPiQQI8Ayevd4l5ABNq/APrjLLY0=", parama, i, parama1);
    localArrayList.add(localObject1);
    ff localff = new com/google/android/gms/b/ff;
    String str1 = "oaRnsXPr2BELeTucy30Z2TT/pCnOqxbeudeAdg9s7JRyq+cL+tahBXal+OL8b75E";
    String str2 = "YUePPai1L0abOPOah9wzdXgG5V28uO3KWqq49V7WN5k=";
    long l1 = t;
    localff.<init>(parameu, str1, str2, parama, l1, i);
    localArrayList.add(localff);
    localObject1 = new com/google/android/gms/b/fk;
    ((fk)localObject1).<init>(parameu, "ZQ9ZsXqaSHEWYFyISTNfq3RvP5q+BSdhUx637Uu+Z1DxU7QJ7W6amW1qhT7YRX0o", "4iTbpGgNA5nzndlwyuo6zL5yjVwp+4o9Iq3RMdWi1fk=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fl;
    ((fl)localObject1).<init>(parameu, "/2RViZGfJUst9NLI1YVhIh5g4nE8oIpN3GOrU5vSVuhU2xgS9z5ZcLJ8KUCgsyQT", "FdrzkFsdfKtVRmpVR1x5jN+18bWIe2LlExfdpodbFTU=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fp;
    ((fp)localObject1).<init>(parameu, "psafpYhT+Yt3VLmcclIEovSSAIT5sMeg3A+UBQfrztazZCapYjckbJ7t0A4OJR9D", "HwvXLxtTgIVH4d3kKsc9SAdJR/JpRH9HPJOMDcQXzEM=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fa;
    ((fa)localObject1).<init>(parameu, "IV9hgNU9JsTc4ClkKbZpe8gHLDpyFNFShra47+ePwZlB2Y8mKL3aGMjp3Ql9EgBJ", "F2XT6ynN53J7IRvpTV9Po8o9Ngchv/wI14w0QztcuMk=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fc;
    ((fc)localObject1).<init>(parameu, "4Oye2uGRb174AtSucoQCMXsKOLPRgDtGUCNKgJrCjpevU+Bh7oXj7TsvmzPZPD1f", "lFuI8/gNCIV1wobdhu8qnycOiDgkUZitvgC/AcTH7RM=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fj;
    ((fj)localObject1).<init>(parameu, "vgrvc9YBWhwZtRW5xKP3tXwq8T9o3U2EY99is612WSYXB1uhffw25BqnJpLhCcRJ", "i7JiqUVh/vNFaIyVqyhZ1vU247JDx7ffq8Je7lAspAg=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/ey;
    ((ey)localObject1).<init>(parameu, "YlqUGaseeN5/KEZL3/9OPCn3KxjeOnHfYuhtRa5qrZeiJeBgKjMjlju2GH0RgEB2", "+9VKZwOzD5EpL/g2LbnFVTMQnh84/y1s9n2uMeAZEm8=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fe;
    ((fe)localObject1).<init>(parameu, "lZMvXszq9MYR0PXyvHzxkR0eNlcOcgvd8Bvyi+/hfjQ+Q/D5MWjCFni6cqXRKKOI", "vKKcPNxCASu74n4RwTnsOXYpC4b0wyoL/MxcZZMeT5A=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fi;
    ((fi)localObject1).<init>(parameu, "PTvHnZSJMQCs0mkDCz2LAi9ymjZwU9RstmiIqfwzvqTiwfV/PWGw4xSnULJR5z4d", "UgXzrPdbH/3iHMsrV7tZb551eY3jVMJMSQGGUFhYme8=", parama, i);
    localArrayList.add(localObject1);
    localObject1 = new com/google/android/gms/b/fq;
    String str3 = "x0r//gwhUayadPsu2BWPTnmSs8k3yJ3JEyAmNFTlai2o/+lAaONDB9oSes1fjdHd";
    String str4 = "uopzAucBvwYkIFPOb7MIOUv4dPMynZS9lZF47Ylrpfk=";
    ((fq)localObject1).<init>(parameu, str3, str4, parama, i);
    localArrayList.add(localObject1);
    localObject1 = ke.bK;
    localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (bool)
    {
      localObject1 = new com/google/android/gms/b/ez;
      str3 = "SSEM9uUQPfYkPsU3UP3Mg3XcPZVaT/KWlqN20JPYYLIcdxqC/CCC7mC2wZiZDswj";
      str4 = "E5tdnbZk6X2J1+Nqz91MRgxlr9tMUVZ/haPbsYy0mjo=";
      localObject2 = parameu;
      ((ez)localObject1).<init>(parameu, str3, str4, parama, i);
      localArrayList.add(localObject1);
    }
    localObject1 = new com/google/android/gms/b/fo;
    localObject2 = parameu;
    ((fo)localObject1).<init>(parameu, "SlQ3IItoCMWTgujfTZqrDJhw45FHiEWqbp07eMPHJG6t2FRrK54SZ1a3u0kD/ca9", "NfharOO0iCGE8K4KkOn+B/rG/3LasVf37wmtvqkFHNw=", parama, i);
    localArrayList.add(localObject1);
    return localArrayList;
  }
}


/* Location:              com/google/android/gms/b/cx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */