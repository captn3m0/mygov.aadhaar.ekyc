package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.w;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class bw
  implements bv
{
  protected MotionEvent a;
  protected LinkedList b;
  protected long c;
  protected long d;
  protected long e;
  protected long f;
  protected long g;
  protected long h;
  protected long i;
  protected boolean j;
  protected DisplayMetrics k;
  private boolean l;
  
  protected bw(Context paramContext)
  {
    Object localObject1 = new java/util/LinkedList;
    ((LinkedList)localObject1).<init>();
    b = ((LinkedList)localObject1);
    c = l1;
    d = l1;
    e = l1;
    f = l1;
    g = l1;
    h = l1;
    i = l1;
    l = false;
    j = false;
    try
    {
      bj.a();
      localObject1 = paramContext.getResources();
      localObject1 = ((Resources)localObject1).getDisplayMetrics();
      k = ((DisplayMetrics)localObject1);
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
  
  /* Error */
  private String a(Context paramContext, String paramString, boolean paramBoolean, View paramView, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: iconst_0
    //   4: istore 7
    //   6: aconst_null
    //   7: astore 8
    //   9: aload 5
    //   11: ifnull +104 -> 115
    //   14: aload 5
    //   16: arraylength
    //   17: istore 9
    //   19: iload 9
    //   21: ifle +94 -> 115
    //   24: new 71	com/google/android/gms/b/bd$a
    //   27: astore 10
    //   29: aload 10
    //   31: invokespecial 72	com/google/android/gms/b/bd$a:<init>	()V
    //   34: aload 5
    //   36: arraylength
    //   37: istore 11
    //   39: aload 10
    //   41: aload 5
    //   43: iload 11
    //   45: invokestatic 77	com/google/android/gms/b/gb:a	(Lcom/google/android/gms/b/gb;[BI)Lcom/google/android/gms/b/gb;
    //   48: astore 10
    //   50: aload 10
    //   52: checkcast 71	com/google/android/gms/b/bd$a
    //   55: astore 10
    //   57: iload_3
    //   58: ifeq +66 -> 124
    //   61: aload_0
    //   62: aload_1
    //   63: aload 4
    //   65: invokevirtual 80	com/google/android/gms/b/bw:a	(Landroid/content/Context;Landroid/view/View;)Lcom/google/android/gms/b/bf$a;
    //   68: astore 10
    //   70: iconst_1
    //   71: istore 7
    //   73: aload_0
    //   74: iload 7
    //   76: putfield 48	com/google/android/gms/b/bw:l	Z
    //   79: aload 10
    //   81: astore 8
    //   83: aload 8
    //   85: ifnull +15 -> 100
    //   88: aload 8
    //   90: invokevirtual 85	com/google/android/gms/b/bf$a:f	()I
    //   93: istore 9
    //   95: iload 9
    //   97: ifne +43 -> 140
    //   100: iconst_5
    //   101: istore 9
    //   103: iload 9
    //   105: invokestatic 92	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   108: astore 10
    //   110: aload 10
    //   112: areturn
    //   113: astore 10
    //   115: iconst_0
    //   116: istore 9
    //   118: aconst_null
    //   119: astore 10
    //   121: goto -64 -> 57
    //   124: aload_0
    //   125: aload_1
    //   126: aload 10
    //   128: invokevirtual 95	com/google/android/gms/b/bw:a	(Landroid/content/Context;Lcom/google/android/gms/b/bd$a;)Lcom/google/android/gms/b/bf$a;
    //   131: astore 10
    //   133: aload 10
    //   135: astore 8
    //   137: goto -54 -> 83
    //   140: getstatic 101	com/google/android/gms/b/ke:bJ	Lcom/google/android/gms/b/jz;
    //   143: astore 10
    //   145: invokestatic 107	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   148: astore 12
    //   150: aload 12
    //   152: aload 10
    //   154: invokevirtual 112	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   157: astore 10
    //   159: aload 10
    //   161: checkcast 114	java/lang/Boolean
    //   164: astore 10
    //   166: aload 10
    //   168: invokevirtual 118	java/lang/Boolean:booleanValue	()Z
    //   171: istore 9
    //   173: iload 9
    //   175: ifne +29 -> 204
    //   178: iload 6
    //   180: istore 9
    //   182: iload 9
    //   184: ifne +78 -> 262
    //   187: iload 6
    //   189: istore 9
    //   191: aload 8
    //   193: aload_2
    //   194: iload 9
    //   196: invokestatic 121	com/google/android/gms/b/bj:a	(Lcom/google/android/gms/b/bf$a;Ljava/lang/String;Z)Ljava/lang/String;
    //   199: astore 10
    //   201: goto -91 -> 110
    //   204: getstatic 124	com/google/android/gms/b/ke:bP	Lcom/google/android/gms/b/jz;
    //   207: astore 10
    //   209: invokestatic 107	com/google/android/gms/ads/internal/w:q	()Lcom/google/android/gms/b/kd;
    //   212: astore 12
    //   214: aload 12
    //   216: aload 10
    //   218: invokevirtual 112	com/google/android/gms/b/kd:a	(Lcom/google/android/gms/b/jz;)Ljava/lang/Object;
    //   221: astore 10
    //   223: aload 10
    //   225: checkcast 114	java/lang/Boolean
    //   228: astore 10
    //   230: aload 10
    //   232: invokevirtual 118	java/lang/Boolean:booleanValue	()Z
    //   235: istore 9
    //   237: iload 9
    //   239: ifeq +14 -> 253
    //   242: iload_3
    //   243: ifeq +10 -> 253
    //   246: iload 6
    //   248: istore 9
    //   250: goto -68 -> 182
    //   253: iconst_0
    //   254: istore 9
    //   256: aconst_null
    //   257: astore 10
    //   259: goto -77 -> 182
    //   262: iconst_0
    //   263: istore 9
    //   265: aconst_null
    //   266: astore 10
    //   268: goto -77 -> 191
    //   271: astore 10
    //   273: bipush 7
    //   275: istore 9
    //   277: iload 9
    //   279: invokestatic 92	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   282: astore 10
    //   284: goto -174 -> 110
    //   287: astore 10
    //   289: iconst_3
    //   290: istore 9
    //   292: iload 9
    //   294: invokestatic 92	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   297: astore 10
    //   299: goto -189 -> 110
    //   302: astore 10
    //   304: goto -31 -> 273
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	this	bw
    //   0	307	1	paramContext	Context
    //   0	307	2	paramString	String
    //   0	307	3	paramBoolean	boolean
    //   0	307	4	paramView	View
    //   0	307	5	paramArrayOfByte	byte[]
    //   1	246	6	bool1	boolean
    //   4	71	7	bool2	boolean
    //   7	185	8	localObject1	Object
    //   17	100	9	m	int
    //   171	93	9	bool3	boolean
    //   275	18	9	n	int
    //   27	84	10	localObject2	Object
    //   113	1	10	localga	ga
    //   119	148	10	localObject3	Object
    //   271	1	10	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   282	1	10	str1	String
    //   287	1	10	localObject4	Object
    //   297	1	10	str2	String
    //   302	1	10	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   37	7	11	i1	int
    //   148	67	12	localkd	kd
    // Exception table:
    //   from	to	target	type
    //   24	27	113	com/google/android/gms/b/ga
    //   29	34	113	com/google/android/gms/b/ga
    //   34	37	113	com/google/android/gms/b/ga
    //   43	48	113	com/google/android/gms/b/ga
    //   50	55	113	com/google/android/gms/b/ga
    //   63	68	271	java/security/NoSuchAlgorithmException
    //   74	79	271	java/security/NoSuchAlgorithmException
    //   88	93	271	java/security/NoSuchAlgorithmException
    //   103	108	271	java/security/NoSuchAlgorithmException
    //   126	131	271	java/security/NoSuchAlgorithmException
    //   140	143	271	java/security/NoSuchAlgorithmException
    //   145	148	271	java/security/NoSuchAlgorithmException
    //   152	157	271	java/security/NoSuchAlgorithmException
    //   159	164	271	java/security/NoSuchAlgorithmException
    //   166	171	271	java/security/NoSuchAlgorithmException
    //   194	199	271	java/security/NoSuchAlgorithmException
    //   204	207	271	java/security/NoSuchAlgorithmException
    //   209	212	271	java/security/NoSuchAlgorithmException
    //   216	221	271	java/security/NoSuchAlgorithmException
    //   223	228	271	java/security/NoSuchAlgorithmException
    //   230	235	271	java/security/NoSuchAlgorithmException
    //   63	68	287	finally
    //   74	79	287	finally
    //   88	93	287	finally
    //   103	108	287	finally
    //   126	131	287	finally
    //   140	143	287	finally
    //   145	148	287	finally
    //   152	157	287	finally
    //   159	164	287	finally
    //   166	171	287	finally
    //   194	199	287	finally
    //   204	207	287	finally
    //   209	212	287	finally
    //   216	221	287	finally
    //   223	228	287	finally
    //   230	235	287	finally
    //   63	68	302	java/io/UnsupportedEncodingException
    //   74	79	302	java/io/UnsupportedEncodingException
    //   88	93	302	java/io/UnsupportedEncodingException
    //   103	108	302	java/io/UnsupportedEncodingException
    //   126	131	302	java/io/UnsupportedEncodingException
    //   140	143	302	java/io/UnsupportedEncodingException
    //   145	148	302	java/io/UnsupportedEncodingException
    //   152	157	302	java/io/UnsupportedEncodingException
    //   159	164	302	java/io/UnsupportedEncodingException
    //   166	171	302	java/io/UnsupportedEncodingException
    //   194	199	302	java/io/UnsupportedEncodingException
    //   204	207	302	java/io/UnsupportedEncodingException
    //   209	212	302	java/io/UnsupportedEncodingException
    //   216	221	302	java/io/UnsupportedEncodingException
    //   223	228	302	java/io/UnsupportedEncodingException
    //   230	235	302	java/io/UnsupportedEncodingException
  }
  
  protected abstract long a(StackTraceElement[] paramArrayOfStackTraceElement);
  
  protected abstract bf.a a(Context paramContext, View paramView);
  
  protected abstract bf.a a(Context paramContext, bd.a parama);
  
  public final String a(Context paramContext)
  {
    boolean bool = ew.b();
    if (bool)
    {
      localObject1 = ke.bO;
      localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("The caller must not be called from the UI thread.");
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = this;
    Object localObject2 = paramContext;
    return a(paramContext, null, false, null, null);
  }
  
  public final String a(Context paramContext, String paramString, View paramView)
  {
    return a(paramContext, paramString, true, paramView, null);
  }
  
  public final String a(Context paramContext, byte[] paramArrayOfByte)
  {
    boolean bool = ew.b();
    if (bool)
    {
      localObject1 = ke.bO;
      localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("The caller must not be called from the UI thread.");
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = this;
    Object localObject2 = paramContext;
    return a(paramContext, null, false, null, paramArrayOfByte);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = a;
      ((MotionEvent)localObject).recycle();
    }
    localObject = k;
    if (localObject != null)
    {
      long l1 = 0L;
      long l2 = paramInt3;
      int m = 1;
      float f1 = paramInt1;
      DisplayMetrics localDisplayMetrics = k;
      float f2 = density;
      f1 *= f2;
      f2 = paramInt2;
      float f3 = k.density;
      f2 *= f3;
      f3 = 0.0F;
      localObject = MotionEvent.obtain(l1, l2, m, f1, f2, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    }
    for (a = ((MotionEvent)localObject);; a = null)
    {
      j = false;
      return;
      localObject = null;
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    long l1 = 0L;
    long l2 = 1L;
    int m = 1;
    int n = 0;
    MotionEvent localMotionEvent = null;
    boolean bool = l;
    Object localObject1;
    Object localObject4;
    if (bool)
    {
      f = l1;
      e = l1;
      d = l1;
      c = l1;
      g = l1;
      i = l1;
      h = l1;
      localObject1 = b;
      localObject4 = ((LinkedList)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (MotionEvent)((Iterator)localObject4).next();
        ((MotionEvent)localObject1).recycle();
      }
      b.clear();
      bool = false;
      localObject1 = null;
      a = null;
      l = false;
    }
    int i1 = paramMotionEvent.getAction();
    long l3;
    switch (i1)
    {
    default: 
    case 1: 
    case 0: 
    case 3: 
      for (;;)
      {
        j = m;
        return;
        localObject1 = MotionEvent.obtain(paramMotionEvent);
        a = ((MotionEvent)localObject1);
        localObject1 = b;
        localMotionEvent = a;
        ((LinkedList)localObject1).add(localMotionEvent);
        localObject1 = b;
        i1 = ((LinkedList)localObject1).size();
        n = 6;
        if (i1 > n)
        {
          localObject1 = (MotionEvent)b.remove();
          ((MotionEvent)localObject1).recycle();
        }
        l3 = e + l2;
        e = l3;
        try
        {
          localObject1 = new java/lang/Throwable;
          ((Throwable)localObject1).<init>();
          localObject1 = ((Throwable)localObject1).getStackTrace();
          l3 = a((StackTraceElement[])localObject1);
          g = l3;
        }
        catch (ea localea1) {}
        continue;
        l3 = c + l2;
        c = l3;
        continue;
        l3 = f + l2;
        f = l3;
      }
    }
    l2 = d;
    i1 = paramMotionEvent.getHistorySize() + 1;
    l1 = i1;
    l2 += l1;
    d = l2;
    for (;;)
    {
      try
      {
        localObject4 = b(paramMotionEvent);
        Object localObject2 = d;
        if (localObject2 == null) {
          break label554;
        }
        localObject2 = g;
        if (localObject2 == null) {
          break label554;
        }
        i1 = m;
        if (i1 != 0)
        {
          l2 = h;
          localObject2 = d;
          l1 = ((Long)localObject2).longValue();
          localObject2 = g;
          long l4 = ((Long)localObject2).longValue();
          l1 += l4;
          l2 += l1;
          h = l2;
        }
        localObject2 = k;
        if (localObject2 == null) {
          break label563;
        }
        localObject2 = e;
        if (localObject2 == null) {
          break label563;
        }
        localObject2 = h;
        if (localObject2 == null) {
          break label563;
        }
        i1 = m;
        if (i1 == 0) {
          break;
        }
        l2 = i;
        localObject2 = e;
        l1 = ((Long)localObject2).longValue();
        localObject2 = h;
        l3 = ((Long)localObject2).longValue() + l1 + l2;
        i = l3;
      }
      catch (ea localea2) {}
      break;
      label554:
      i1 = 0;
      Object localObject3 = null;
      continue;
      label563:
      i1 = 0;
      localObject3 = null;
    }
  }
  
  protected abstract ev b(MotionEvent paramMotionEvent);
}


/* Location:              com/google/android/gms/b/bw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */