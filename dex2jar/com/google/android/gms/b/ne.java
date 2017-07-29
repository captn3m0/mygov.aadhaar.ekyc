package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

@qi
public final class ne
  extends ix.a
{
  private final String a;
  private final mw b;
  private m c;
  private final my d;
  private pl e;
  private String f;
  
  public ne(Context paramContext, String paramString, oc paramoc, un paramun, e parame)
  {
    this(paramString, new mw(paramContext, paramoc, paramun, parame));
  }
  
  /* Error */
  private ne(String paramString, mw parammw)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 34	com/google/android/gms/b/ix$a:<init>	()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield 36	com/google/android/gms/b/ne:a	Ljava/lang/String;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield 38	com/google/android/gms/b/ne:b	Lcom/google/android/gms/b/mw;
    //   14: aload_0
    //   15: new 40	com/google/android/gms/b/my
    //   18: dup
    //   19: invokespecial 41	com/google/android/gms/b/my:<init>	()V
    //   22: putfield 43	com/google/android/gms/b/ne:d	Lcom/google/android/gms/b/my;
    //   25: invokestatic 49	com/google/android/gms/ads/internal/w:t	()Lcom/google/android/gms/b/mz;
    //   28: astore 5
    //   30: aload 5
    //   32: getfield 53	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   35: ifnonnull +363 -> 398
    //   38: aload 5
    //   40: new 20	com/google/android/gms/b/mw
    //   43: dup
    //   44: aload_2
    //   45: getfield 56	com/google/android/gms/b/mw:a	Landroid/content/Context;
    //   48: invokevirtual 62	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   51: aload_2
    //   52: getfield 65	com/google/android/gms/b/mw:b	Lcom/google/android/gms/b/oc;
    //   55: aload_2
    //   56: getfield 68	com/google/android/gms/b/mw:c	Lcom/google/android/gms/b/un;
    //   59: aload_2
    //   60: getfield 71	com/google/android/gms/b/mw:d	Lcom/google/android/gms/ads/internal/e;
    //   63: invokespecial 23	com/google/android/gms/b/mw:<init>	(Landroid/content/Context;Lcom/google/android/gms/b/oc;Lcom/google/android/gms/b/un;Lcom/google/android/gms/ads/internal/e;)V
    //   66: putfield 53	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   69: aload 5
    //   71: getfield 53	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   74: ifnull +324 -> 398
    //   77: aload 5
    //   79: getfield 53	com/google/android/gms/b/mz:c	Lcom/google/android/gms/b/mw;
    //   82: getfield 56	com/google/android/gms/b/mw:a	Landroid/content/Context;
    //   85: invokevirtual 62	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   88: ldc 73
    //   90: iconst_0
    //   91: invokevirtual 77	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   94: astore_1
    //   95: aload 5
    //   97: getfield 80	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   100: invokevirtual 86	java/util/LinkedList:size	()I
    //   103: ifle +78 -> 181
    //   106: aload 5
    //   108: getfield 80	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   111: invokevirtual 90	java/util/LinkedList:remove	()Ljava/lang/Object;
    //   114: checkcast 92	com/google/android/gms/b/nb
    //   117: astore_2
    //   118: aload 5
    //   120: getfield 95	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   123: aload_2
    //   124: invokeinterface 101 2 0
    //   129: checkcast 103	com/google/android/gms/b/nc
    //   132: astore 6
    //   134: ldc 105
    //   136: aload_2
    //   137: invokestatic 108	com/google/android/gms/b/mz:a	(Ljava/lang/String;Lcom/google/android/gms/b/nb;)V
    //   140: aload 6
    //   142: getfield 110	com/google/android/gms/b/nc:a	Ljava/util/LinkedList;
    //   145: invokevirtual 86	java/util/LinkedList:size	()I
    //   148: ifle +18 -> 166
    //   151: aload 6
    //   153: aconst_null
    //   154: invokevirtual 113	com/google/android/gms/b/nc:a	(Lcom/google/android/gms/b/ih;)Lcom/google/android/gms/b/nc$a;
    //   157: getfield 117	com/google/android/gms/b/nc$a:a	Lcom/google/android/gms/ads/internal/m;
    //   160: invokevirtual 122	com/google/android/gms/ads/internal/m:O	()V
    //   163: goto -23 -> 140
    //   166: aload 5
    //   168: getfield 95	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   171: aload_2
    //   172: invokeinterface 124 2 0
    //   177: pop
    //   178: goto -83 -> 95
    //   181: new 126	java/util/HashMap
    //   184: dup
    //   185: invokespecial 127	java/util/HashMap:<init>	()V
    //   188: astore_2
    //   189: aload_1
    //   190: invokeinterface 133 1 0
    //   195: invokeinterface 137 1 0
    //   200: invokeinterface 143 1 0
    //   205: astore 6
    //   207: aload 6
    //   209: invokeinterface 149 1 0
    //   214: ifeq +185 -> 399
    //   217: aload 6
    //   219: invokeinterface 152 1 0
    //   224: checkcast 154	java/util/Map$Entry
    //   227: astore 7
    //   229: aload 7
    //   231: invokeinterface 157 1 0
    //   236: checkcast 159	java/lang/String
    //   239: ldc -95
    //   241: invokevirtual 165	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   244: ifne -37 -> 207
    //   247: aload 7
    //   249: invokeinterface 168 1 0
    //   254: checkcast 159	java/lang/String
    //   257: invokestatic 173	com/google/android/gms/b/nf:a	(Ljava/lang/String;)Lcom/google/android/gms/b/nf;
    //   260: astore 8
    //   262: new 92	com/google/android/gms/b/nb
    //   265: dup
    //   266: aload 8
    //   268: getfield 176	com/google/android/gms/b/nf:a	Lcom/google/android/gms/b/ih;
    //   271: aload 8
    //   273: getfield 178	com/google/android/gms/b/nf:b	Ljava/lang/String;
    //   276: aload 8
    //   278: getfield 181	com/google/android/gms/b/nf:c	I
    //   281: invokespecial 184	com/google/android/gms/b/nb:<init>	(Lcom/google/android/gms/b/ih;Ljava/lang/String;I)V
    //   284: astore 7
    //   286: aload 5
    //   288: getfield 95	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   291: aload 7
    //   293: invokeinterface 187 2 0
    //   298: ifne -91 -> 207
    //   301: new 103	com/google/android/gms/b/nc
    //   304: dup
    //   305: aload 8
    //   307: getfield 176	com/google/android/gms/b/nf:a	Lcom/google/android/gms/b/ih;
    //   310: aload 8
    //   312: getfield 178	com/google/android/gms/b/nf:b	Ljava/lang/String;
    //   315: aload 8
    //   317: getfield 181	com/google/android/gms/b/nf:c	I
    //   320: invokespecial 188	com/google/android/gms/b/nc:<init>	(Lcom/google/android/gms/b/ih;Ljava/lang/String;I)V
    //   323: astore 8
    //   325: aload 5
    //   327: getfield 95	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   330: aload 7
    //   332: aload 8
    //   334: invokeinterface 192 3 0
    //   339: pop
    //   340: aload_2
    //   341: aload 7
    //   343: invokevirtual 196	com/google/android/gms/b/nb:toString	()Ljava/lang/String;
    //   346: aload 7
    //   348: invokeinterface 192 3 0
    //   353: pop
    //   354: ldc -58
    //   356: aload 7
    //   358: invokestatic 108	com/google/android/gms/b/mz:a	(Ljava/lang/String;Lcom/google/android/gms/b/nb;)V
    //   361: goto -154 -> 207
    //   364: astore_1
    //   365: invokestatic 202	com/google/android/gms/ads/internal/w:i	()Lcom/google/android/gms/b/tj;
    //   368: aload_1
    //   369: ldc -52
    //   371: invokevirtual 209	com/google/android/gms/b/tj:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   374: ldc -45
    //   376: aload_1
    //   377: invokestatic 216	com/google/android/gms/b/tp:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   380: aload 5
    //   382: getfield 95	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   385: invokeinterface 219 1 0
    //   390: aload 5
    //   392: getfield 80	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   395: invokevirtual 220	java/util/LinkedList:clear	()V
    //   398: return
    //   399: aload_1
    //   400: ldc -95
    //   402: ldc -34
    //   404: invokeinterface 226 3 0
    //   409: invokestatic 229	com/google/android/gms/b/mz:a	(Ljava/lang/String;)[Ljava/lang/String;
    //   412: astore_1
    //   413: aload_1
    //   414: arraylength
    //   415: istore 4
    //   417: iconst_0
    //   418: istore_3
    //   419: iload_3
    //   420: iload 4
    //   422: if_icmpge -24 -> 398
    //   425: aload_2
    //   426: aload_1
    //   427: iload_3
    //   428: aaload
    //   429: invokeinterface 101 2 0
    //   434: checkcast 92	com/google/android/gms/b/nb
    //   437: astore 6
    //   439: aload 5
    //   441: getfield 95	com/google/android/gms/b/mz:a	Ljava/util/Map;
    //   444: aload 6
    //   446: invokeinterface 187 2 0
    //   451: ifeq +14 -> 465
    //   454: aload 5
    //   456: getfield 80	com/google/android/gms/b/mz:b	Ljava/util/LinkedList;
    //   459: aload 6
    //   461: invokevirtual 232	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   464: pop
    //   465: iload_3
    //   466: iconst_1
    //   467: iadd
    //   468: istore_3
    //   469: goto -50 -> 419
    //   472: astore_1
    //   473: goto -108 -> 365
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	476	0	this	ne
    //   0	476	1	paramString	String
    //   0	476	2	parammw	mw
    //   418	51	3	i	int
    //   415	8	4	j	int
    //   28	427	5	localmz	mz
    //   132	328	6	localObject1	Object
    //   227	130	7	localObject2	Object
    //   260	73	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   181	207	364	java/lang/RuntimeException
    //   207	361	364	java/lang/RuntimeException
    //   399	417	364	java/lang/RuntimeException
    //   425	465	364	java/lang/RuntimeException
    //   181	207	472	java/io/IOException
    //   207	361	472	java/io/IOException
    //   399	417	472	java/io/IOException
    //   425	465	472	java/io/IOException
  }
  
  private void a()
  {
    if (c != null) {
      return;
    }
    mw localmw = b;
    String str = a;
    c = new m(a, new il(), str, b, c, d);
    d.a(c);
    b();
  }
  
  private void b()
  {
    if ((c != null) && (e != null)) {
      c.a(e, f);
    }
  }
  
  public final String F()
  {
    if (c != null) {
      return c.F();
    }
    return null;
  }
  
  public final void G()
  {
    if (c != null)
    {
      c.G();
      return;
    }
    tp.e("Interstitial ad must be loaded before showInterstitial().");
  }
  
  public final void a(il paramil)
  {
    if (c != null) {
      c.a(paramil);
    }
  }
  
  public final void a(is paramis)
  {
    d.e = paramis;
    if (c != null) {
      d.a(c);
    }
  }
  
  public final void a(it paramit)
  {
    d.a = paramit;
    if (c != null) {
      d.a(c);
    }
  }
  
  public final void a(iz paramiz)
  {
    d.b = paramiz;
    if (c != null) {
      d.a(c);
    }
  }
  
  public final void a(jb paramjb)
  {
    a();
    if (c != null) {
      c.a(paramjb);
    }
  }
  
  public final void a(jh paramjh)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void a(jt paramjt)
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }
  
  public final void a(kq paramkq)
  {
    d.d = paramkq;
    if (c != null) {
      d.a(c);
    }
  }
  
  public final void a(ph paramph)
  {
    d.c = paramph;
    if (c != null) {
      d.a(c);
    }
  }
  
  public final void a(pl parampl, String paramString)
  {
    e = parampl;
    f = paramString;
    b();
  }
  
  public final void a(sb paramsb)
  {
    d.f = paramsb;
    if (c != null) {
      d.a(c);
    }
  }
  
  public final void a(String paramString) {}
  
  public final void a(boolean paramBoolean)
  {
    a();
    if (c != null) {
      c.a(paramBoolean);
    }
  }
  
  public final boolean a(ih paramih)
  {
    if (!mz.a(paramih).contains("gw")) {
      a();
    }
    if (mz.a(paramih).contains("_skipMediation")) {
      a();
    }
    if (j != null) {
      a();
    }
    if (c != null) {
      return c.a(paramih);
    }
    Object localObject3 = w.t();
    int i;
    ih localih;
    Object localObject4;
    nb localnb;
    Object localObject2;
    if (mz.a(paramih).contains("_ad"))
    {
      localObject1 = a;
      if (c != null)
      {
        i = rn.ac.a.getApplicationContext()).a().m;
        localih = mz.b(paramih);
        localObject4 = mz.c((String)localObject1);
        localnb = new nb(localih, (String)localObject4, i);
        localObject2 = (nc)a.get(localnb);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          mz.a("Interstitial pool created at %s.", localnb);
          localObject1 = new nc(localih, (String)localObject4, i);
          a.put(localnb, localObject1);
        }
        localObject2 = new nc.a((nc)localObject1, c, paramih);
        a.add(localObject2);
        e = true;
        mz.a("Inline entry added to the queue at %s.", localnb);
      }
    }
    Object localObject1 = a;
    if (!mz.b((String)localObject1))
    {
      i = rn.ac.a.getApplicationContext()).a().m;
      localih = mz.b(paramih);
      localObject2 = mz.c((String)localObject1);
      localnb = new nb(localih, (String)localObject2, i);
      localObject1 = (nc)a.get(localnb);
      if (localObject1 != null) {
        break label831;
      }
      mz.a("Interstitial pool created at %s.", localnb);
      localObject1 = new nc(localih, (String)localObject2, i);
      a.put(localnb, localObject1);
    }
    label714:
    label795:
    label812:
    label831:
    for (;;)
    {
      b.remove(localnb);
      b.add(localnb);
      e = true;
      for (;;)
      {
        i = b.size();
        localObject2 = ke.ba;
        if (i <= ((Integer)w.q().a((jz)localObject2)).intValue()) {
          break;
        }
        localObject2 = (nb)b.remove();
        localObject4 = (nc)a.get(localObject2);
        mz.a("Evicting interstitial queue for %s.", (nb)localObject2);
        while (a.size() > 0)
        {
          nc.a locala = ((nc)localObject4).a(null);
          if (e)
          {
            nd localnd = nd.a();
            c += 1;
          }
          a.O();
        }
        a.remove(localObject2);
      }
      for (;;)
      {
        if (a.size() > 0)
        {
          localObject2 = ((nc)localObject1).a(localih);
          if (e)
          {
            long l1 = w.k().a();
            long l2 = d;
            localObject3 = ke.bc;
            if (l1 - l2 > 1000L * ((Integer)w.q().a((jz)localObject3)).intValue())
            {
              mz.a("Expired interstitial at %s.", localnb);
              localObject2 = nd.a();
              b += 1;
              continue;
            }
          }
          if (b != null)
          {
            localObject1 = " (inline) ";
            mz.a(String.valueOf(localObject1).length() + 34 + "Pooled interstitial" + (String)localObject1 + "returned at %s.", localnb);
            localObject1 = localObject2;
            if (localObject1 == null) {
              break label812;
            }
            if (e) {
              break label795;
            }
            ((nc.a)localObject1).a();
            nd.a().b();
          }
        }
      }
      for (;;)
      {
        c = a;
        c.a(d);
        d.a(c);
        b();
        return f;
        localObject1 = " ";
        break;
        localObject1 = null;
        break label714;
        paramih = nd.a();
        d += 1;
      }
      a();
      nd.a().b();
      return c.a(paramih);
    }
  }
  
  public final void h()
  {
    if (c != null) {
      c.h();
    }
  }
  
  public final a i()
  {
    if (c != null) {
      return c.i();
    }
    return null;
  }
  
  public final il j()
  {
    if (c != null) {
      return c.j();
    }
    return null;
  }
  
  public final boolean k()
  {
    return (c != null) && (c.k());
  }
  
  public final void l()
  {
    if (c != null)
    {
      c.l();
      return;
    }
    tp.e("Interstitial ad must be loaded before pingManualTrackingUrl().");
  }
  
  public final void m()
  {
    if (c != null) {
      c.m();
    }
  }
  
  public final void n()
  {
    if (c != null) {
      c.n();
    }
  }
  
  public final void o()
  {
    if (c != null) {
      c.o();
    }
  }
  
  public final boolean p()
  {
    return (c != null) && (c.p());
  }
  
  public final jf q()
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }
}


/* Location:              com/google/android/gms/b/ne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */