package android.support.v4.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.g.b;
import android.support.v4.g.e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class o
  extends n
  implements android.support.v4.h.k
{
  static final Interpolator D;
  static final Interpolator E;
  static final Interpolator F;
  static final Interpolator G;
  static boolean a;
  static final boolean b;
  static Field q;
  SparseArray A = null;
  ArrayList B;
  Runnable C;
  private CopyOnWriteArrayList H;
  ArrayList c;
  boolean d;
  ArrayList e;
  ArrayList f;
  ArrayList g;
  ArrayList h;
  ArrayList i;
  ArrayList j;
  ArrayList k;
  ArrayList l;
  int m = 0;
  m n;
  k o;
  i p;
  boolean r;
  boolean s;
  boolean t;
  String u;
  boolean v;
  ArrayList w;
  ArrayList x;
  ArrayList y;
  Bundle z = null;
  
  static
  {
    boolean bool = false;
    Object localObject = null;
    float f1 = 2.5F;
    float f2 = 1.5F;
    a = false;
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 11;
    if (i1 >= i2) {
      bool = true;
    }
    b = bool;
    q = null;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>(f1);
    D = (Interpolator)localObject;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>(f2);
    E = (Interpolator)localObject;
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>(f1);
    F = (Interpolator)localObject;
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>(f2);
    G = (Interpolator)localObject;
  }
  
  o()
  {
    o.1 local1 = new android/support/v4/b/o$1;
    local1.<init>(this);
    C = local1;
  }
  
  private int a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2, b paramb)
  {
    boolean bool1 = true;
    int i1 = paramInt2 + -1;
    int i2 = i1;
    int i3 = paramInt2;
    c localc;
    Object localObject;
    int i4;
    label58:
    label110:
    label142:
    label219:
    int i7;
    if (i2 >= paramInt1)
    {
      localc = (c)paramArrayList1.get(i2);
      localObject = (Boolean)paramArrayList2.get(i2);
      boolean bool2 = ((Boolean)localObject).booleanValue();
      i4 = 0;
      ArrayList localArrayList = null;
      localObject = c;
      int i5 = ((ArrayList)localObject).size();
      if (i4 < i5)
      {
        localObject = (c.a)c.get(i4);
        boolean bool3 = c.b((c.a)localObject);
        if (bool3)
        {
          bool3 = bool1;
          if (!bool3) {
            break label296;
          }
          int i6 = i2 + 1;
          boolean bool4 = localc.a(paramArrayList1, i6, paramInt2);
          if (bool4) {
            break label296;
          }
          bool4 = bool1;
          if (!bool4) {
            break label317;
          }
          localObject = B;
          if (localObject == null)
          {
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            B = ((ArrayList)localObject);
          }
          localObject = new android/support/v4/b/o$e;
          ((o.e)localObject).<init>(localc, bool2);
          localArrayList = B;
          localArrayList.add(localObject);
          localc.a((i.c)localObject);
          if (!bool2) {
            break label305;
          }
          localc.c();
          i7 = i3 + -1;
          if (i2 != i7)
          {
            paramArrayList1.remove(i2);
            paramArrayList1.add(i7, localc);
          }
          b(paramb);
        }
      }
    }
    label296:
    label305:
    label317:
    for (i1 = i7;; i1 = i3)
    {
      i7 = i2 + -1;
      i2 = i7;
      i3 = i1;
      break;
      i7 = i4 + 1;
      i4 = i7;
      break label58;
      i7 = 0;
      localObject = null;
      break label110;
      i7 = 0;
      localObject = null;
      break label142;
      localc.a(false);
      break label219;
      return i3;
    }
  }
  
  private i a(Bundle paramBundle, String paramString)
  {
    int i1 = -1;
    int i2 = paramBundle.getInt(paramString, i1);
    Object localObject1;
    if (i2 == i1)
    {
      i1 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (i)localObject1;
      localObject1 = e;
      i1 = ((ArrayList)localObject1).size();
      Object localObject2;
      Object localObject3;
      if (i2 >= i1)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Fragment no longer exists for key ");
        localObject2 = ((StringBuilder)localObject2).append(paramString);
        localObject3 = ": index ";
        localObject2 = (String)localObject3 + i2;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        a((RuntimeException)localObject1);
      }
      localObject1 = (i)e.get(i2);
      if (localObject1 == null)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Fragment no longer exists for key ");
        localObject3 = ((StringBuilder)localObject3).append(paramString);
        String str1 = ": index ";
        localObject3 = ((StringBuilder)localObject3).append(str1);
        String str2 = i2;
        ((IllegalStateException)localObject2).<init>(str2);
        a((RuntimeException)localObject2);
      }
    }
  }
  
  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new android/view/animation/AlphaAnimation;
    localAlphaAnimation.<init>(paramFloat1, paramFloat2);
    Interpolator localInterpolator = E;
    localAlphaAnimation.setInterpolator(localInterpolator);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    long l1 = 220L;
    int i1 = 1;
    float f1 = 0.5F;
    AnimationSet localAnimationSet = new android/view/animation/AnimationSet;
    localAnimationSet.<init>(false);
    Object localObject = new android/view/animation/ScaleAnimation;
    ((ScaleAnimation)localObject).<init>(paramFloat1, paramFloat2, paramFloat1, paramFloat2, i1, f1, i1, f1);
    Interpolator localInterpolator = D;
    ((ScaleAnimation)localObject).setInterpolator(localInterpolator);
    ((ScaleAnimation)localObject).setDuration(l1);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new android/view/animation/AlphaAnimation;
    ((AlphaAnimation)localObject).<init>(paramFloat3, paramFloat4);
    localInterpolator = E;
    ((AlphaAnimation)localObject).setInterpolator(localInterpolator);
    ((AlphaAnimation)localObject).setDuration(l1);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private Animation a(i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    float f1 = 0.975F;
    float f2 = 1.0F;
    parami.v();
    i.l();
    int i1 = parami.v();
    Object localObject;
    if (i1 != 0)
    {
      localObject = n.c;
      int i3 = parami.v();
      localObject = AnimationUtils.loadAnimation((Context)localObject, i3);
      if (localObject == null) {}
    }
    for (;;)
    {
      return (Animation)localObject;
      float f3;
      if (paramInt1 == 0)
      {
        i1 = 0;
        localObject = null;
        f3 = 0.0F;
      }
      else
      {
        i1 = -1;
        f3 = 0.0F / 0.0F;
        switch (paramInt1)
        {
        }
        for (;;)
        {
          if (i1 >= 0) {
            break label212;
          }
          i1 = 0;
          localObject = null;
          f3 = 0.0F;
          break;
          if (paramBoolean)
          {
            i1 = 1;
            f3 = Float.MIN_VALUE;
          }
          else
          {
            i1 = 2;
            f3 = 2.8E-45F;
            continue;
            if (paramBoolean)
            {
              i1 = 3;
              f3 = 4.2E-45F;
            }
            else
            {
              i1 = 4;
              f3 = 5.6E-45F;
              continue;
              if (paramBoolean)
              {
                i1 = 5;
                f3 = 7.0E-45F;
              }
              else
              {
                i1 = 6;
                f3 = 8.4E-45F;
              }
            }
          }
        }
        label212:
        int i2;
        switch (i1)
        {
        default: 
          boolean bool;
          if (paramInt2 == 0)
          {
            localObject = n;
            bool = ((m)localObject).e();
            if (bool)
            {
              localObject = n;
              paramInt2 = ((m)localObject).f();
            }
          }
          if (paramInt2 == 0)
          {
            bool = false;
            localObject = null;
            f3 = 0.0F;
          }
          break;
        case 1: 
          i2 = 1066401792;
          f3 = 1.125F;
          localObject = a(f3, f2, 0.0F, f2);
          break;
        case 2: 
          localObject = a(f2, f1, f2, 0.0F);
          break;
        case 3: 
          localObject = a(f1, f2, 0.0F, f2);
          break;
        case 4: 
          i2 = 1065982362;
          f3 = 1.075F;
          localObject = a(f2, f3, f2, 0.0F);
          break;
        case 5: 
          localObject = a(0.0F, f2);
          break;
        case 6: 
          localObject = a(f2, 0.0F);
          continue;
          i2 = 0;
          localObject = null;
          f3 = 0.0F;
        }
      }
    }
  }
  
  /* Error */
  private void a(int paramInt, c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnonnull +16 -> 24
    //   11: new 105	java/util/ArrayList
    //   14: astore_3
    //   15: aload_3
    //   16: invokespecial 134	java/util/ArrayList:<init>	()V
    //   19: aload_0
    //   20: aload_3
    //   21: putfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   24: aload_0
    //   25: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   28: astore_3
    //   29: aload_3
    //   30: invokevirtual 123	java/util/ArrayList:size	()I
    //   33: istore 4
    //   35: iload_1
    //   36: iload 4
    //   38: if_icmpge +93 -> 131
    //   41: getstatic 59	android/support/v4/b/o:a	Z
    //   44: istore 4
    //   46: iload 4
    //   48: ifeq +68 -> 116
    //   51: ldc_w 275
    //   54: astore_3
    //   55: new 172	java/lang/StringBuilder
    //   58: astore 5
    //   60: ldc_w 277
    //   63: astore 6
    //   65: aload 5
    //   67: aload 6
    //   69: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload 5
    //   74: iload_1
    //   75: invokevirtual 186	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   78: astore 5
    //   80: ldc_w 279
    //   83: astore 6
    //   85: aload 5
    //   87: aload 6
    //   89: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: astore 5
    //   94: aload 5
    //   96: aload_2
    //   97: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   100: astore 5
    //   102: aload 5
    //   104: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: astore 5
    //   109: aload_3
    //   110: aload 5
    //   112: invokestatic 287	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   115: pop
    //   116: aload_0
    //   117: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   120: astore_3
    //   121: aload_3
    //   122: iload_1
    //   123: aload_2
    //   124: invokevirtual 291	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   127: pop
    //   128: aload_0
    //   129: monitorexit
    //   130: return
    //   131: iload 4
    //   133: iload_1
    //   134: if_icmpge +132 -> 266
    //   137: aload_0
    //   138: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   141: astore 5
    //   143: aconst_null
    //   144: astore 6
    //   146: aload 5
    //   148: aconst_null
    //   149: invokevirtual 143	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   152: pop
    //   153: aload_0
    //   154: getfield 293	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   157: astore 5
    //   159: aload 5
    //   161: ifnonnull +19 -> 180
    //   164: new 105	java/util/ArrayList
    //   167: astore 5
    //   169: aload 5
    //   171: invokespecial 134	java/util/ArrayList:<init>	()V
    //   174: aload_0
    //   175: aload 5
    //   177: putfield 293	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   180: getstatic 59	android/support/v4/b/o:a	Z
    //   183: istore 7
    //   185: iload 7
    //   187: ifeq +49 -> 236
    //   190: ldc_w 275
    //   193: astore 5
    //   195: new 172	java/lang/StringBuilder
    //   198: astore 6
    //   200: ldc_w 295
    //   203: astore 8
    //   205: aload 6
    //   207: aload 8
    //   209: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   212: aload 6
    //   214: iload 4
    //   216: invokevirtual 186	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   219: astore 6
    //   221: aload 6
    //   223: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: astore 6
    //   228: aload 5
    //   230: aload 6
    //   232: invokestatic 287	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   235: pop
    //   236: aload_0
    //   237: getfield 293	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   240: astore 5
    //   242: iload 4
    //   244: invokestatic 301	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: astore 6
    //   249: aload 5
    //   251: aload 6
    //   253: invokevirtual 143	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   256: pop
    //   257: iload 4
    //   259: iconst_1
    //   260: iadd
    //   261: istore 4
    //   263: goto -132 -> 131
    //   266: getstatic 59	android/support/v4/b/o:a	Z
    //   269: istore 4
    //   271: iload 4
    //   273: ifeq +68 -> 341
    //   276: ldc_w 275
    //   279: astore_3
    //   280: new 172	java/lang/StringBuilder
    //   283: astore 5
    //   285: ldc_w 303
    //   288: astore 6
    //   290: aload 5
    //   292: aload 6
    //   294: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   297: aload 5
    //   299: iload_1
    //   300: invokevirtual 186	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   303: astore 5
    //   305: ldc_w 305
    //   308: astore 6
    //   310: aload 5
    //   312: aload 6
    //   314: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: astore 5
    //   319: aload 5
    //   321: aload_2
    //   322: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   325: astore 5
    //   327: aload 5
    //   329: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: astore 5
    //   334: aload_3
    //   335: aload 5
    //   337: invokestatic 287	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   340: pop
    //   341: aload_0
    //   342: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   345: astore_3
    //   346: aload_3
    //   347: aload_2
    //   348: invokevirtual 143	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   351: pop
    //   352: goto -224 -> 128
    //   355: astore_3
    //   356: aload_0
    //   357: monitorexit
    //   358: aload_3
    //   359: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	this	o
    //   0	360	1	paramInt	int
    //   0	360	2	paramc	c
    //   6	341	3	localObject1	Object
    //   355	4	3	localObject2	Object
    //   33	6	4	i1	int
    //   44	218	4	i2	int
    //   269	3	4	bool1	boolean
    //   58	278	5	localObject3	Object
    //   63	250	6	localObject4	Object
    //   183	3	7	bool2	boolean
    //   203	5	8	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	355	finally
    //   11	14	355	finally
    //   15	19	355	finally
    //   20	24	355	finally
    //   24	28	355	finally
    //   29	33	355	finally
    //   41	44	355	finally
    //   55	58	355	finally
    //   67	72	355	finally
    //   74	78	355	finally
    //   87	92	355	finally
    //   96	100	355	finally
    //   102	107	355	finally
    //   110	116	355	finally
    //   116	120	355	finally
    //   123	128	355	finally
    //   128	130	355	finally
    //   137	141	355	finally
    //   148	153	355	finally
    //   153	157	355	finally
    //   164	167	355	finally
    //   169	174	355	finally
    //   175	180	355	finally
    //   180	183	355	finally
    //   195	198	355	finally
    //   207	212	355	finally
    //   214	219	355	finally
    //   221	226	355	finally
    //   230	236	355	finally
    //   236	240	355	finally
    //   242	247	355	finally
    //   251	257	355	finally
    //   266	269	355	finally
    //   280	283	355	finally
    //   292	297	355	finally
    //   299	303	355	finally
    //   312	317	355	finally
    //   321	325	355	finally
    //   327	332	355	finally
    //   335	341	355	finally
    //   341	345	355	finally
    //   347	352	355	finally
    //   356	358	355	finally
  }
  
  private void a(i parami, Context paramContext, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).a(parami, paramContext, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void a(i parami, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).a(parami, paramBundle, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void a(i parami, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).a(parami, paramView, paramBundle, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private static void a(b paramb)
  {
    int i1 = paramb.size();
    int i2 = 0;
    Object localObject = null;
    int i3 = 0;
    if (i3 < i1)
    {
      localObject = (i)g[i3];
      boolean bool = t;
      View localView;
      if (!bool)
      {
        localView = P;
        int i5 = Build.VERSION.SDK_INT;
        int i6 = 11;
        if (i5 >= i6) {
          break label87;
        }
        localObject = P;
        int i4 = 4;
        ((View)localObject).setVisibility(i4);
      }
      for (;;)
      {
        i2 = i3 + 1;
        i3 = i2;
        break;
        label87:
        float f1 = localView.getAlpha();
        Z = f1;
        i2 = 0;
        localObject = null;
        localView.setAlpha(0.0F);
      }
    }
  }
  
  private static void a(View paramView, Animation paramAnimation)
  {
    int i1 = 0;
    o.a locala = null;
    int i2 = 1;
    if ((paramView == null) || (paramAnimation == null)) {
      return;
    }
    int i3 = Build.VERSION.SDK_INT;
    int i6 = 19;
    int i4;
    if (i3 >= i6)
    {
      i3 = android.support.v4.h.w.f(paramView);
      if (i3 == 0)
      {
        i4 = android.support.v4.h.w.A(paramView);
        if (i4 != 0)
        {
          i4 = paramAnimation instanceof AlphaAnimation;
          if (i4 == 0) {
            break label182;
          }
          i4 = i2;
        }
      }
    }
    for (;;)
    {
      if (i4 != 0) {
        i1 = i2;
      }
      if (i1 == 0) {
        break;
      }
      i1 = 0;
      locala = null;
      try
      {
        localObject1 = q;
        if (localObject1 == null)
        {
          localObject1 = Animation.class;
          str = "mListener";
          localObject1 = ((Class)localObject1).getDeclaredField(str);
          q = (Field)localObject1;
          i2 = 1;
          ((Field)localObject1).setAccessible(i2);
        }
        localObject1 = q;
        localObject1 = ((Field)localObject1).get(paramAnimation);
        localObject1 = (Animation.AnimationListener)localObject1;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          Object localObject1;
          str = "FragmentManager";
          localObject4 = "No field with the name mListener is found in Animation class";
          Log.e(str, (String)localObject4, localNoSuchFieldException);
          i5 = 0;
          Object localObject2 = null;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          String str = "FragmentManager";
          Object localObject4 = "Cannot access Animation's mListener field";
          Log.e(str, (String)localObject4, localIllegalAccessException);
          int i5 = 0;
          Object localObject3 = null;
        }
      }
      i1 = 2;
      android.support.v4.h.w.d(paramView, i1);
      locala = new android/support/v4/b/o$a;
      locala.<init>(paramView, (Animation)paramAnimation, (Animation.AnimationListener)localObject1);
      ((Animation)paramAnimation).setAnimationListener(locala);
      break;
      label182:
      i4 = paramAnimation instanceof AnimationSet;
      if (i4 != 0)
      {
        localObject1 = paramAnimation;
        localObject4 = ((AnimationSet)paramAnimation).getAnimations();
        i4 = 0;
        localObject1 = null;
        for (;;)
        {
          int i7 = ((List)localObject4).size();
          if (i4 >= i7) {
            break label266;
          }
          Object localObject5 = ((List)localObject4).get(i4);
          boolean bool = localObject5 instanceof AlphaAnimation;
          if (bool)
          {
            i4 = i2;
            break;
          }
          i4 += 1;
        }
      }
      label266:
      i5 = 0;
      localObject1 = null;
    }
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Object localObject1 = paramRuntimeException.getMessage();
    Log.e("FragmentManager", (String)localObject1);
    Log.e("FragmentManager", "Activity state:");
    Object localObject2 = new android/support/v4/g/e;
    ((e)localObject2).<init>("FragmentManager");
    localObject1 = new java/io/PrintWriter;
    ((PrintWriter)localObject1).<init>((Writer)localObject2);
    localObject2 = n;
    if (localObject2 != null) {}
    for (;;)
    {
      try
      {
        localObject2 = n;
        str2 = "  ";
        arrayOfString = null;
        arrayOfString = new String[0];
        ((m)localObject2).a(str2, (PrintWriter)localObject1, arrayOfString);
      }
      catch (Exception localException1)
      {
        localObject1 = "FragmentManager";
        str2 = "Failed dumping state";
        Log.e((String)localObject1, str2, localException1);
        continue;
      }
      throw paramRuntimeException;
      String str1 = "  ";
      String str2 = null;
      String[] arrayOfString = null;
      try
      {
        arrayOfString = new String[0];
        a(str1, null, (PrintWriter)localObject1, arrayOfString);
      }
      catch (Exception localException2)
      {
        localObject1 = "FragmentManager";
        str2 = "Failed dumping state";
        Log.e((String)localObject1, str2, localException2);
      }
    }
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i1 = -1;
    Object localObject1 = B;
    int i2;
    int i3;
    int i4;
    label26:
    Object localObject2;
    int i6;
    if (localObject1 == null)
    {
      i2 = 0;
      localObject1 = null;
      i3 = 0;
      i4 = i2;
      if (i3 >= i4) {
        return;
      }
      localObject1 = (o.e)B.get(i3);
      if (paramArrayList1 == null) {
        break label149;
      }
      boolean bool1 = a;
      if (bool1) {
        break label149;
      }
      localObject2 = b;
      int i5 = paramArrayList1.indexOf(localObject2);
      if (i5 == i1) {
        break label149;
      }
      localObject2 = (Boolean)paramArrayList2.get(i5);
      i6 = ((Boolean)localObject2).booleanValue();
      if (i6 == 0) {
        break label149;
      }
      ((o.e)localObject1).d();
      i2 = i3;
      i6 = i4;
    }
    for (;;)
    {
      i3 = i2 + 1;
      i4 = i6;
      break label26;
      localObject1 = B;
      i2 = ((ArrayList)localObject1).size();
      break;
      label149:
      int i7 = c;
      if (i7 == 0) {
        i7 = 1;
      }
      for (;;)
      {
        if (i7 == 0)
        {
          if (paramArrayList1 == null) {
            break label318;
          }
          localObject2 = b;
          int i9 = paramArrayList1.size();
          bool2 = ((c)localObject2).a(paramArrayList1, 0, i9);
          if (!bool2) {
            break label318;
          }
        }
        localObject2 = B;
        ((ArrayList)localObject2).remove(i3);
        i3 += -1;
        i4 += -1;
        if (paramArrayList1 == null) {
          break label313;
        }
        boolean bool2 = a;
        if (bool2) {
          break label313;
        }
        localObject2 = b;
        int i8 = paramArrayList1.indexOf(localObject2);
        if (i8 == i1) {
          break label313;
        }
        localObject2 = (Boolean)paramArrayList2.get(i8);
        bool3 = ((Boolean)localObject2).booleanValue();
        if (!bool3) {
          break label313;
        }
        ((o.e)localObject1).d();
        i2 = i3;
        bool3 = i4;
        break;
        bool3 = false;
        localObject2 = null;
      }
      label313:
      ((o.e)localObject1).c();
      label318:
      i2 = i3;
      boolean bool3 = i4;
    }
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    b localb = null;
    boolean bool2 = getu;
    Object localObject1 = y;
    Object localObject3;
    int i1;
    int i2;
    label87:
    label141:
    boolean bool6;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      y = ((ArrayList)localObject1);
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject1 = y;
        localObject3 = f;
        ((ArrayList)localObject1).addAll((Collection)localObject3);
      }
      i1 = paramInt1;
      i2 = 0;
      if (i1 >= paramInt2) {
        break label218;
      }
      localObject1 = (c)paramArrayList1.get(i1);
      localObject3 = (Boolean)paramArrayList2.get(i1);
      boolean bool4 = ((Boolean)localObject3).booleanValue();
      if (bool4) {
        break label193;
      }
      localObject3 = y;
      ((c)localObject1).a((ArrayList)localObject3);
      if (i2 == 0)
      {
        bool6 = j;
        if (!bool6) {
          break label209;
        }
      }
      bool6 = bool1;
    }
    for (;;)
    {
      int i3 = i1 + 1;
      i1 = i3;
      i2 = bool6;
      break label87;
      localObject1 = y;
      ((ArrayList)localObject1).clear();
      break;
      label193:
      localObject3 = y;
      ((c)localObject1).b((ArrayList)localObject3);
      break label141;
      label209:
      bool6 = false;
      localObject1 = null;
    }
    label218:
    localObject1 = y;
    ((ArrayList)localObject1).clear();
    Object localObject4;
    int i6;
    if (!bool2)
    {
      localObject1 = this;
      localObject3 = paramArrayList1;
      localObject4 = paramArrayList2;
      i6 = paramInt2;
      t.a(this, paramArrayList1, paramArrayList2, paramInt1, paramInt2, false);
    }
    b(paramArrayList1, paramArrayList2, paramInt1, paramInt2);
    if (bool2)
    {
      localb = new android/support/v4/g/b;
      localb.<init>();
      b(localb);
      localObject1 = this;
      localObject3 = paramArrayList1;
      localObject4 = paramArrayList2;
      i6 = paramInt2;
      i6 = a(paramArrayList1, paramArrayList2, paramInt1, paramInt2, localb);
      a(localb);
    }
    for (;;)
    {
      if ((i6 != paramInt1) && (bool2))
      {
        localObject1 = this;
        localObject3 = paramArrayList1;
        localObject4 = paramArrayList2;
        t.a(this, paramArrayList1, paramArrayList2, paramInt1, i6, bool1);
        int i5 = m;
        a(i5, bool1);
      }
      while (paramInt1 < paramInt2)
      {
        localObject1 = (c)paramArrayList1.get(paramInt1);
        localObject3 = (Boolean)paramArrayList2.get(paramInt1);
        boolean bool5 = ((Boolean)localObject3).booleanValue();
        int i4;
        if (bool5)
        {
          i4 = n;
          if (i4 >= 0) {
            i4 = n;
          }
        }
        try
        {
          localObject4 = j;
          Object localObject5 = null;
          ((ArrayList)localObject4).set(i4, null);
          localObject4 = k;
          if (localObject4 == null)
          {
            localObject4 = new java/util/ArrayList;
            ((ArrayList)localObject4).<init>();
            k = ((ArrayList)localObject4);
          }
          boolean bool3 = a;
          if (bool3)
          {
            localObject4 = "FragmentManager";
            localObject5 = new java/lang/StringBuilder;
            String str = "Freeing back stack index ";
            ((StringBuilder)localObject5).<init>(str);
            localObject5 = ((StringBuilder)localObject5).append(i4);
            localObject5 = ((StringBuilder)localObject5).toString();
            Log.v((String)localObject4, (String)localObject5);
          }
          localObject4 = k;
          localObject3 = Integer.valueOf(i4);
          ((ArrayList)localObject4).add(localObject3);
          i4 = -1;
          n = i4;
          paramInt1 += 1;
        }
        finally {}
      }
      if (i2 != 0) {
        d();
      }
      return;
      i6 = paramInt2;
    }
  }
  
  public static int b(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return i1;
      i1 = 8194;
      continue;
      i1 = 4097;
      continue;
      i1 = 4099;
    }
  }
  
  private void b(i parami, Context paramContext, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).b(parami, paramContext, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void b(i parami, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).b(parami, paramBundle, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void b(i parami, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).b(parami, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void b(b paramb)
  {
    int i1 = m;
    if (i1 <= 0) {
      return;
    }
    i1 = m;
    int i3 = 4;
    int i4 = Math.min(i1, i3);
    Object localObject = f;
    if (localObject == null) {}
    int i2;
    for (int i5 = 0;; i5 = i2)
    {
      for (int i6 = 0; i6 < i5; i6 = i2)
      {
        localObject = f;
        i locali = (i)((ArrayList)localObject).get(i6);
        i1 = k;
        if (i1 < i4)
        {
          int i7 = locali.v();
          int i8 = locali.w();
          localObject = this;
          a(locali, i4, i7, i8, false);
          localObject = P;
          if (localObject != null)
          {
            boolean bool = H;
            if (!bool)
            {
              bool = X;
              if (bool) {
                paramb.add(locali);
              }
            }
          }
        }
        i2 = i6 + 1;
      }
      break;
      localObject = f;
      i2 = ((ArrayList)localObject).size();
    }
  }
  
  private void b(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i1 = 0;
    if (paramArrayList1 != null)
    {
      boolean bool = paramArrayList1.isEmpty();
      if (!bool) {}
    }
    else
    {
      return;
    }
    Object localObject;
    if (paramArrayList2 != null)
    {
      int i2 = paramArrayList1.size();
      i4 = paramArrayList2.size();
      if (i2 == i4) {}
    }
    else
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Internal error with the back stack records");
      throw ((Throwable)localObject);
    }
    a(paramArrayList1, paramArrayList2);
    int i5 = paramArrayList1.size();
    int i4 = 0;
    label72:
    int i6;
    if (i1 < i5)
    {
      localObject = (c)paramArrayList1.get(i1);
      i3 = u;
      if (i3 != 0) {
        break label259;
      }
      if (i4 != i1) {
        a(paramArrayList1, paramArrayList2, i4, i1);
      }
      i4 = i1 + 1;
      localObject = (Boolean)paramArrayList2.get(i1);
      i3 = ((Boolean)localObject).booleanValue();
      if (i3 != 0) {
        while (i4 < i5)
        {
          localObject = (Boolean)paramArrayList2.get(i4);
          i3 = ((Boolean)localObject).booleanValue();
          if (i3 == 0) {
            break;
          }
          localObject = (c)paramArrayList1.get(i4);
          i3 = u;
          if (i3 != 0) {
            break;
          }
          i4 += 1;
        }
      }
      i3 = i4;
      a(paramArrayList1, paramArrayList2, i1, i4);
      i6 = i4 + -1;
      i4 = i3;
    }
    label259:
    for (int i3 = i6;; i3 = i1)
    {
      i1 = i3 + 1;
      break label72;
      if (i4 == i5) {
        break;
      }
      a(paramArrayList1, paramArrayList2, i4, i5);
      break;
    }
  }
  
  private static void b(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    if (paramInt1 < paramInt2)
    {
      c localc = (c)paramArrayList1.get(paramInt1);
      Boolean localBoolean = (Boolean)paramArrayList2.get(paramInt1);
      boolean bool = localBoolean.booleanValue();
      int i2;
      if (bool)
      {
        localc.a(-1);
        i2 = paramInt2 + -1;
        if (paramInt1 == i2)
        {
          i2 = i1;
          label61:
          localc.a(i2);
        }
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        i2 = 0;
        localBoolean = null;
        break label61;
        localc.a(i1);
        localc.c();
      }
    }
  }
  
  private i c(int paramInt)
  {
    Object localObject = f;
    int i1;
    int i2;
    int i3;
    if (localObject != null)
    {
      localObject = f;
      i1 = ((ArrayList)localObject).size() + -1;
      i2 = i1;
      if (i2 >= 0)
      {
        localObject = (i)f.get(i2);
        if (localObject != null)
        {
          i3 = E;
          if (i3 != paramInt) {}
        }
      }
    }
    for (;;)
    {
      return (i)localObject;
      i1 = i2 + -1;
      i2 = i1;
      break;
      localObject = e;
      if (localObject != null)
      {
        localObject = e;
        i1 = ((ArrayList)localObject).size() + -1;
        for (i2 = i1;; i2 = i1)
        {
          if (i2 < 0) {
            break label140;
          }
          localObject = (i)e.get(i2);
          if (localObject != null)
          {
            i3 = E;
            if (i3 == paramInt) {
              break;
            }
          }
          i1 = i2 + -1;
        }
      }
      label140:
      i1 = 0;
      localObject = null;
    }
  }
  
  private void c(i parami, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).c(parami, paramBundle, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void c(i parami, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).c(parami, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private boolean c(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    for (;;)
    {
      try
      {
        Object localObject1 = c;
        int i1;
        if (localObject1 != null)
        {
          localObject1 = c;
          i1 = ((ArrayList)localObject1).size();
          if (i1 != 0) {}
        }
        else
        {
          i1 = 0;
          localObject1 = null;
          return i1;
        }
        localObject1 = c;
        int i3 = ((ArrayList)localObject1).size();
        int i4 = 0;
        Runnable localRunnable = null;
        if (i4 < i3)
        {
          localObject1 = c;
          localObject1 = ((ArrayList)localObject1).get(i4);
          localObject1 = (o.c)localObject1;
          ((o.c)localObject1).a(paramArrayList1, paramArrayList2);
          i2 = i4 + 1;
          i4 = i2;
          continue;
        }
        localObject1 = c;
        ((ArrayList)localObject1).clear();
        localObject1 = n;
        localObject1 = d;
        localRunnable = C;
        ((Handler)localObject1).removeCallbacks(localRunnable);
        if (i3 > 0)
        {
          i2 = 1;
          continue;
        }
        int i2 = 0;
      }
      finally {}
      Object localObject3 = null;
    }
  }
  
  public static void d(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2)
    {
      String str1 = "FragmentManager";
      Object localObject = new java/lang/StringBuilder;
      String str2 = "hide: ";
      ((StringBuilder)localObject).<init>(str2);
      localObject = parami;
      Log.v(str1, (String)localObject);
    }
    bool2 = H;
    if (!bool2)
    {
      H = bool1;
      bool2 = Y;
      if (bool2) {
        break label78;
      }
    }
    for (;;)
    {
      Y = bool1;
      return;
      label78:
      bool1 = false;
    }
  }
  
  private void d(i parami, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).d(parami, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  public static void e(i parami)
  {
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2)
    {
      String str1 = "FragmentManager";
      Object localObject = new java/lang/StringBuilder;
      String str2 = "show: ";
      ((StringBuilder)localObject).<init>(str2);
      localObject = parami;
      Log.v(str1, (String)localObject);
    }
    bool2 = H;
    if (bool2)
    {
      H = false;
      bool2 = Y;
      if (!bool2) {
        bool1 = true;
      }
      Y = bool1;
    }
  }
  
  private void e(i parami, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).e(parami, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void f(i parami, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).f(parami, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void g(i parami, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).g(parami, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void h(i parami)
  {
    int i1 = m;
    a(parami, i1, 0, 0, false);
  }
  
  private void h(i parami, boolean paramBoolean)
  {
    Object localObject = p;
    if (localObject != null)
    {
      localObject = p.z;
      boolean bool1 = localObject instanceof o;
      if (bool1)
      {
        localObject = (o)localObject;
        bool1 = true;
        ((o)localObject).h(parami, bool1);
      }
    }
    localObject = H;
    if (localObject == null) {
      return;
    }
    localObject = H;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.g.i)localIterator.next();
      if (paramBoolean)
      {
        localObject = (Boolean)b;
        ((Boolean)localObject).booleanValue();
      }
    }
  }
  
  private void i(i parami)
  {
    Object localObject = Q;
    if (localObject == null) {
      return;
    }
    localObject = A;
    if (localObject == null)
    {
      localObject = new android/util/SparseArray;
      ((SparseArray)localObject).<init>();
      A = ((SparseArray)localObject);
    }
    for (;;)
    {
      localObject = Q;
      SparseArray localSparseArray = A;
      ((View)localObject).saveHierarchyState(localSparseArray);
      localObject = A;
      int i1 = ((SparseArray)localObject).size();
      if (i1 <= 0) {
        break;
      }
      localObject = A;
      m = ((SparseArray)localObject);
      i1 = 0;
      localObject = null;
      A = null;
      break;
      localObject = A;
      ((SparseArray)localObject).clear();
    }
  }
  
  private boolean p()
  {
    c();
    t();
    ArrayList localArrayList1 = w;
    ArrayList localArrayList2 = x;
    int i1 = -1;
    o localo = this;
    boolean bool1 = a(localArrayList1, localArrayList2, null, i1, 0);
    if (bool1)
    {
      boolean bool2 = true;
      d = bool2;
    }
    try
    {
      localArrayList1 = w;
      localArrayList2 = x;
      b(localArrayList1, localArrayList2);
      u();
      return bool1;
    }
    finally
    {
      u();
    }
  }
  
  private void q()
  {
    Object localObject = e;
    if (localObject == null) {}
    int i1;
    int i2;
    do
    {
      return;
      i1 = 0;
      localObject = e;
      i2 = ((ArrayList)localObject).size();
    } while (i1 >= i2);
    localObject = e;
    i locali = (i)((ArrayList)localObject).get(i1);
    if (locali != null)
    {
      boolean bool = R;
      if (bool)
      {
        bool = d;
        if (!bool) {
          break label82;
        }
        bool = true;
        v = bool;
      }
    }
    for (;;)
    {
      int i3 = i1 + 1;
      i1 = i3;
      break;
      label82:
      R = false;
      int i4 = m;
      localObject = this;
      a(locali, i4, 0, 0, false);
    }
  }
  
  private void r()
  {
    boolean bool = s;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Can not perform this action after onSaveInstanceState");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = u;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Can not perform this action inside of ");
      String str = u;
      localObject2 = str;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  /* Error */
  private void s()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 133	android/support/v4/b/o:B	Ljava/util/ArrayList;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull +113 -> 125
    //   15: aload_0
    //   16: getfield 133	android/support/v4/b/o:B	Ljava/util/ArrayList;
    //   19: astore_3
    //   20: aload_3
    //   21: invokevirtual 560	java/util/ArrayList:isEmpty	()Z
    //   24: istore 4
    //   26: iload 4
    //   28: ifne +97 -> 125
    //   31: iload_2
    //   32: istore 4
    //   34: aload_0
    //   35: getfield 576	android/support/v4/b/o:c	Ljava/util/ArrayList;
    //   38: astore 5
    //   40: aload 5
    //   42: ifnull +91 -> 133
    //   45: aload_0
    //   46: getfield 576	android/support/v4/b/o:c	Ljava/util/ArrayList;
    //   49: astore 5
    //   51: aload 5
    //   53: invokevirtual 123	java/util/ArrayList:size	()I
    //   56: istore 6
    //   58: iload 6
    //   60: iload_2
    //   61: if_icmpne +72 -> 133
    //   64: iload 4
    //   66: ifne +7 -> 73
    //   69: iload_2
    //   70: ifeq +52 -> 122
    //   73: aload_0
    //   74: getfield 241	android/support/v4/b/o:n	Landroid/support/v4/b/m;
    //   77: astore 7
    //   79: aload 7
    //   81: getfield 584	android/support/v4/b/m:d	Landroid/os/Handler;
    //   84: astore 7
    //   86: aload_0
    //   87: getfield 103	android/support/v4/b/o:C	Ljava/lang/Runnable;
    //   90: astore_1
    //   91: aload 7
    //   93: aload_1
    //   94: invokevirtual 590	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   97: aload_0
    //   98: getfield 241	android/support/v4/b/o:n	Landroid/support/v4/b/m;
    //   101: astore 7
    //   103: aload 7
    //   105: getfield 584	android/support/v4/b/m:d	Landroid/os/Handler;
    //   108: astore 7
    //   110: aload_0
    //   111: getfield 103	android/support/v4/b/o:C	Ljava/lang/Runnable;
    //   114: astore_1
    //   115: aload 7
    //   117: aload_1
    //   118: invokevirtual 657	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   121: pop
    //   122: aload_0
    //   123: monitorexit
    //   124: return
    //   125: iconst_0
    //   126: istore 4
    //   128: aconst_null
    //   129: astore_3
    //   130: goto -96 -> 34
    //   133: iconst_0
    //   134: istore_2
    //   135: aconst_null
    //   136: astore 7
    //   138: goto -74 -> 64
    //   141: astore 7
    //   143: aload_0
    //   144: monitorexit
    //   145: aload 7
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	o
    //   1	117	1	localRunnable	Runnable
    //   3	132	2	i1	int
    //   10	120	3	localArrayList1	ArrayList
    //   24	103	4	bool	boolean
    //   38	14	5	localArrayList2	ArrayList
    //   56	6	6	i2	int
    //   77	60	7	localObject1	Object
    //   141	5	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	10	141	finally
    //   15	19	141	finally
    //   20	24	141	finally
    //   34	38	141	finally
    //   45	49	141	finally
    //   51	56	141	finally
    //   73	77	141	finally
    //   79	84	141	finally
    //   86	90	141	finally
    //   93	97	141	finally
    //   97	101	141	finally
    //   103	108	141	finally
    //   110	114	141	finally
    //   117	122	141	finally
    //   122	124	141	finally
    //   143	145	141	finally
  }
  
  private void t()
  {
    boolean bool = d;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("FragmentManager is already executing transactions");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = Looper.myLooper();
    Looper localLooper = n.d.getLooper();
    if (localObject1 != localLooper)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Must be called from main thread of fragment host");
      throw ((Throwable)localObject1);
    }
    localObject1 = w;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      w = ((ArrayList)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      x = ((ArrayList)localObject1);
    }
    d = true;
    bool = false;
    localObject1 = null;
    localLooper = null;
    try
    {
      a(null, null);
      return;
    }
    finally
    {
      d = false;
    }
  }
  
  private void u()
  {
    d = false;
    x.clear();
    w.clear();
  }
  
  private void v()
  {
    boolean bool1 = v;
    if (bool1)
    {
      int i3 = 0;
      boolean bool3 = false;
      for (;;)
      {
        Object localObject = e;
        int i1 = ((ArrayList)localObject).size();
        if (i3 >= i1) {
          break;
        }
        localObject = (i)e.get(i3);
        if (localObject != null)
        {
          w localw = T;
          if (localw != null)
          {
            localObject = T;
            boolean bool2 = ((w)localObject).a();
            bool3 |= bool2;
          }
        }
        int i2 = i3 + 1;
        i3 = i2;
      }
      if (!bool3)
      {
        v = false;
        q();
      }
    }
  }
  
  /* Error */
  public final int a(c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 293	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +17 -> 25
    //   11: aload_0
    //   12: getfield 293	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual 123	java/util/ArrayList:size	()I
    //   20: istore_3
    //   21: iload_3
    //   22: ifgt +129 -> 151
    //   25: aload_0
    //   26: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull +16 -> 47
    //   34: new 105	java/util/ArrayList
    //   37: astore_2
    //   38: aload_2
    //   39: invokespecial 134	java/util/ArrayList:<init>	()V
    //   42: aload_0
    //   43: aload_2
    //   44: putfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   47: aload_0
    //   48: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 123	java/util/ArrayList:size	()I
    //   56: istore_3
    //   57: getstatic 59	android/support/v4/b/o:a	Z
    //   60: istore 4
    //   62: iload 4
    //   64: ifeq +70 -> 134
    //   67: ldc_w 275
    //   70: astore 5
    //   72: new 172	java/lang/StringBuilder
    //   75: astore 6
    //   77: ldc_w 277
    //   80: astore 7
    //   82: aload 6
    //   84: aload 7
    //   86: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: aload 6
    //   91: iload_3
    //   92: invokevirtual 186	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   95: astore 6
    //   97: ldc_w 279
    //   100: astore 7
    //   102: aload 6
    //   104: aload 7
    //   106: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: astore 6
    //   111: aload 6
    //   113: aload_1
    //   114: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   117: astore 6
    //   119: aload 6
    //   121: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: astore 6
    //   126: aload 5
    //   128: aload 6
    //   130: invokestatic 287	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   133: pop
    //   134: aload_0
    //   135: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   138: astore 5
    //   140: aload 5
    //   142: aload_1
    //   143: invokevirtual 143	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   146: pop
    //   147: aload_0
    //   148: monitorexit
    //   149: iload_3
    //   150: ireturn
    //   151: aload_0
    //   152: getfield 293	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   155: astore_2
    //   156: aload_0
    //   157: getfield 293	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   160: astore 5
    //   162: aload 5
    //   164: invokevirtual 123	java/util/ArrayList:size	()I
    //   167: iconst_m1
    //   168: iadd
    //   169: istore 4
    //   171: aload_2
    //   172: iload 4
    //   174: invokevirtual 151	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   177: astore_2
    //   178: aload_2
    //   179: checkcast 297	java/lang/Integer
    //   182: astore_2
    //   183: aload_2
    //   184: invokevirtual 683	java/lang/Integer:intValue	()I
    //   187: istore_3
    //   188: getstatic 59	android/support/v4/b/o:a	Z
    //   191: istore 4
    //   193: iload 4
    //   195: ifeq +70 -> 265
    //   198: ldc_w 275
    //   201: astore 5
    //   203: new 172	java/lang/StringBuilder
    //   206: astore 6
    //   208: ldc_w 303
    //   211: astore 7
    //   213: aload 6
    //   215: aload 7
    //   217: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   220: aload 6
    //   222: iload_3
    //   223: invokevirtual 186	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   226: astore 6
    //   228: ldc_w 305
    //   231: astore 7
    //   233: aload 6
    //   235: aload 7
    //   237: invokevirtual 181	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: astore 6
    //   242: aload 6
    //   244: aload_1
    //   245: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   248: astore 6
    //   250: aload 6
    //   252: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   255: astore 6
    //   257: aload 5
    //   259: aload 6
    //   261: invokestatic 287	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   264: pop
    //   265: aload_0
    //   266: getfield 273	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   269: astore 5
    //   271: aload 5
    //   273: iload_3
    //   274: aload_1
    //   275: invokevirtual 291	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   278: pop
    //   279: aload_0
    //   280: monitorexit
    //   281: goto -132 -> 149
    //   284: astore_2
    //   285: aload_0
    //   286: monitorexit
    //   287: aload_2
    //   288: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	289	0	this	o
    //   0	289	1	paramc	c
    //   6	178	2	localObject1	Object
    //   284	4	2	localObject2	Object
    //   20	254	3	i1	int
    //   60	3	4	bool1	boolean
    //   169	4	4	i2	int
    //   191	3	4	bool2	boolean
    //   70	202	5	localObject3	Object
    //   75	185	6	localObject4	Object
    //   80	156	7	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	284	finally
    //   11	15	284	finally
    //   16	20	284	finally
    //   25	29	284	finally
    //   34	37	284	finally
    //   38	42	284	finally
    //   43	47	284	finally
    //   47	51	284	finally
    //   52	56	284	finally
    //   57	60	284	finally
    //   72	75	284	finally
    //   84	89	284	finally
    //   91	95	284	finally
    //   104	109	284	finally
    //   113	117	284	finally
    //   119	124	284	finally
    //   128	134	284	finally
    //   134	138	284	finally
    //   142	147	284	finally
    //   147	149	284	finally
    //   151	155	284	finally
    //   156	160	284	finally
    //   162	167	284	finally
    //   172	177	284	finally
    //   178	182	284	finally
    //   183	187	284	finally
    //   188	191	284	finally
    //   203	206	284	finally
    //   215	220	284	finally
    //   222	226	284	finally
    //   235	240	284	finally
    //   244	248	284	finally
    //   250	255	284	finally
    //   259	265	284	finally
    //   265	269	284	finally
    //   274	279	284	finally
    //   279	281	284	finally
    //   285	287	284	finally
  }
  
  public final i a(String paramString)
  {
    Object localObject = f;
    int i1;
    int i2;
    String str;
    boolean bool;
    if ((localObject != null) && (paramString != null))
    {
      localObject = f;
      i1 = ((ArrayList)localObject).size() + -1;
      i2 = i1;
      if (i2 >= 0)
      {
        localObject = (i)f.get(i2);
        if (localObject != null)
        {
          str = G;
          bool = paramString.equals(str);
          if (!bool) {}
        }
      }
    }
    for (;;)
    {
      return (i)localObject;
      i1 = i2 + -1;
      i2 = i1;
      break;
      localObject = e;
      if ((localObject != null) && (paramString != null))
      {
        localObject = e;
        i1 = ((ArrayList)localObject).size() + -1;
        for (i2 = i1;; i2 = i1)
        {
          if (i2 < 0) {
            break label162;
          }
          localObject = (i)e.get(i2);
          if (localObject != null)
          {
            str = G;
            bool = paramString.equals(str);
            if (bool) {
              break;
            }
          }
          i1 = i2 + -1;
        }
      }
      label162:
      i1 = 0;
      localObject = null;
    }
  }
  
  public final s a()
  {
    c localc = new android/support/v4/b/c;
    localc.<init>(this);
    return localc;
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    String str1 = null;
    int i1 = -1;
    int i2 = 1;
    Object localObject2 = "fragment";
    int i3 = ((String)localObject2).equals(paramString);
    if (i3 == 0)
    {
      i3 = 0;
      localObject2 = null;
      return (View)localObject2;
    }
    localObject2 = paramAttributeSet.getAttributeValue(null, "class");
    Object localObject3 = o.b.a;
    localObject3 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject3);
    if (localObject2 == null) {
      localObject2 = ((TypedArray)localObject3).getString(0);
    }
    for (Object localObject4 = localObject2;; localObject4 = localObject2)
    {
      int i5 = ((TypedArray)localObject3).getResourceId(i2, i1);
      String str2 = ((TypedArray)localObject3).getString(2);
      ((TypedArray)localObject3).recycle();
      localObject2 = n.c;
      i3 = i.b((Context)localObject2, (String)localObject4);
      if (i3 == 0)
      {
        i3 = 0;
        localObject2 = null;
        break;
      }
      int i6;
      if (paramView != null) {
        i6 = paramView.getId();
      }
      Object localObject5;
      while ((i6 == i1) && (i5 == i1) && (str2 == null))
      {
        localObject2 = new java/lang/IllegalArgumentException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject5 = paramAttributeSet.getPositionDescription();
        localObject3 = (String)localObject5 + ": Must specify unique android:id, android:tag, or have a parent with an id for " + (String)localObject4;
        ((IllegalArgumentException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
        i6 = 0;
        localObject3 = null;
      }
      label405:
      label476:
      boolean bool2;
      if (i5 != i1)
      {
        localObject2 = c(i5);
        if ((localObject2 == null) && (str2 != null)) {
          localObject2 = a(str2);
        }
        if ((localObject2 == null) && (i6 != i1)) {
          localObject2 = c(i6);
        }
        bool1 = a;
        if (bool1)
        {
          localObject1 = "FragmentManager";
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>("onCreateView: id=0x");
          String str3 = Integer.toHexString(i5);
          localObject6 = ((StringBuilder)localObject6).append(str3).append(" fname=").append((String)localObject4);
          str3 = " existing=";
          localObject6 = str3 + localObject2;
          Log.v((String)localObject1, (String)localObject6);
        }
        if (localObject2 != null) {
          break label599;
        }
        localObject1 = i.a(paramContext, (String)localObject4);
        v = i2;
        if (i5 == 0) {
          break label592;
        }
        i3 = i5;
        E = i3;
        F = i6;
        G = str2;
        w = i2;
        z = this;
        localObject2 = n;
        A = ((m)localObject2);
        localObject2 = l;
        ((i)localObject1).j();
        a((i)localObject1, i2);
        localObject3 = localObject1;
        int i4 = m;
        if (i4 > 0) {
          break label774;
        }
        bool2 = v;
        if (!bool2) {
          break label774;
        }
        localObject2 = this;
        bool1 = false;
        localObject1 = null;
        i1 = 0;
        Object localObject6 = null;
        a((i)localObject3, i2, 0, 0, false);
      }
      for (;;)
      {
        localObject2 = P;
        if (localObject2 != null) {
          break label783;
        }
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Fragment ");
        localObject3 = (String)localObject4 + " did not create a view.";
        ((IllegalStateException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
        bool2 = false;
        localObject2 = null;
        break;
        label592:
        bool2 = i6;
        break label405;
        label599:
        bool1 = w;
        if (bool1)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          str1 = paramAttributeSet.getPositionDescription();
          localObject5 = ((StringBuilder)localObject5).append(str1).append(": Duplicate id 0x");
          str1 = Integer.toHexString(i5);
          localObject5 = ((StringBuilder)localObject5).append(str1).append(", tag ").append(str2).append(", or parent id 0x");
          localObject3 = Integer.toHexString(i6);
          localObject3 = (String)localObject3 + " with another fragment for " + (String)localObject4;
          ((IllegalArgumentException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        w = i2;
        localObject3 = n;
        A = ((m)localObject3);
        boolean bool3 = K;
        if (!bool3)
        {
          localObject3 = l;
          ((i)localObject2).j();
        }
        localObject3 = localObject2;
        break label476;
        label774:
        h((i)localObject3);
      }
      label783:
      if (i5 != 0)
      {
        localObject2 = P;
        ((View)localObject2).setId(i5);
      }
      localObject2 = P.getTag();
      if (localObject2 == null)
      {
        localObject2 = P;
        ((View)localObject2).setTag(str2);
      }
      localObject2 = P;
      break;
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt < 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Bad id: ");
      localObject2 = paramInt;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new android/support/v4/b/o$d;
    ((o.d)localObject1).<init>(this, paramInt);
    a((o.c)localObject1, false);
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    Object localObject = n;
    if ((localObject == null) && (paramInt != 0))
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No activity");
      throw ((Throwable)localObject);
    }
    if (!paramBoolean)
    {
      int i1 = m;
      if (paramInt != i1) {}
    }
    do
    {
      return;
      m = paramInt;
      localObject = e;
    } while (localObject == null);
    localObject = f;
    int i4;
    int i5;
    int i6;
    label83:
    w localw;
    if (localObject != null)
    {
      localObject = f;
      i4 = ((ArrayList)localObject).size();
      i5 = 0;
      i6 = 0;
      if (i5 >= i4) {
        break label149;
      }
      localObject = (i)f.get(i5);
      a((i)localObject);
      localw = T;
      if (localw == null) {
        break label332;
      }
      localObject = T;
    }
    label149:
    label163:
    int i3;
    label325:
    label332:
    for (int i2 = ((w)localObject).a() | i6;; i3 = i6)
    {
      i5 += 1;
      i6 = i2;
      break label83;
      i6 = 0;
      localObject = e;
      i4 = ((ArrayList)localObject).size();
      i5 = 0;
      if (i5 < i4)
      {
        localObject = (i)e.get(i5);
        if (localObject == null) {
          break label325;
        }
        boolean bool = u;
        if (!bool)
        {
          bool = I;
          if (!bool) {
            break label325;
          }
        }
        bool = X;
        if (bool) {
          break label325;
        }
        a((i)localObject);
        localw = T;
        if (localw == null) {
          break label325;
        }
        localObject = T;
      }
      for (i2 = ((w)localObject).a() | i6;; i3 = i6)
      {
        i5 += 1;
        i6 = i2;
        break label163;
        if (i6 == 0) {
          q();
        }
        i2 = r;
        if (i2 == 0) {
          break;
        }
        localObject = n;
        if (localObject == null) {
          break;
        }
        i3 = m;
        i6 = 5;
        if (i3 != i6) {
          break;
        }
        localObject = n;
        ((m)localObject).d();
        r = false;
        break;
      }
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    Object localObject = f;
    if (localObject != null)
    {
      int i1 = 0;
      localObject = null;
      for (int i2 = 0;; i2 = i1)
      {
        localObject = f;
        i1 = ((ArrayList)localObject).size();
        if (i2 >= i1) {
          break;
        }
        localObject = (i)f.get(i2);
        if (localObject != null)
        {
          ((i)localObject).onConfigurationChanged(paramConfiguration);
          o localo = B;
          if (localo != null)
          {
            localObject = B;
            ((o)localObject).a(paramConfiguration);
          }
        }
        i1 = i2 + 1;
      }
    }
  }
  
  final void a(Parcelable paramParcelable, p paramp)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    if (paramParcelable == null) {}
    Object localObject2;
    do
    {
      return;
      paramParcelable = (q)paramParcelable;
      localObject2 = a;
    } while (localObject2 == null);
    Object localObject3;
    Object localObject4;
    int i1;
    int i3;
    int i4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    if (paramp != null)
    {
      localObject3 = a;
      localObject4 = b;
      if (localObject3 != null)
      {
        i1 = ((List)localObject3).size();
        i3 = i1;
      }
      for (;;)
      {
        i4 = 0;
        localObject5 = null;
        while (i4 < i3)
        {
          localObject2 = (i)((List)localObject3).get(i4);
          boolean bool3 = a;
          if (bool3)
          {
            localObject6 = "FragmentManager";
            localObject7 = new java/lang/StringBuilder;
            localObject8 = "restoreAllState: re-attaching retained ";
            ((StringBuilder)localObject7).<init>((String)localObject8);
            localObject7 = localObject2;
            Log.v((String)localObject6, (String)localObject7);
          }
          localObject6 = a;
          int i6 = n;
          localObject6 = localObject6[i6];
          l = ((i)localObject2);
          m = null;
          y = 0;
          w = false;
          t = false;
          q = null;
          localObject7 = k;
          if (localObject7 != null)
          {
            localObject7 = k;
            localObject8 = n.c.getClassLoader();
            ((Bundle)localObject7).setClassLoader((ClassLoader)localObject8);
            localObject7 = k;
            localObject8 = "android:view_state";
            localObject7 = ((Bundle)localObject7).getSparseParcelableArray((String)localObject8);
            m = ((SparseArray)localObject7);
            localObject6 = k;
            l = ((Bundle)localObject6);
          }
          i1 = i4 + 1;
          i4 = i1;
        }
        i3 = 0;
        localObject9 = null;
      }
    }
    for (Object localObject9 = localObject4;; localObject9 = null)
    {
      localObject2 = new java/util/ArrayList;
      localObject4 = a;
      int i9 = localObject4.length;
      ((ArrayList)localObject2).<init>(i9);
      e = ((ArrayList)localObject2);
      localObject2 = g;
      if (localObject2 != null)
      {
        localObject2 = g;
        ((ArrayList)localObject2).clear();
      }
      i9 = 0;
      localObject4 = null;
      localObject2 = a;
      i1 = localObject2.length;
      if (i9 < i1)
      {
        localObject2 = a;
        localObject5 = localObject2[i9];
        if (localObject5 != null)
        {
          if (localObject9 == null) {
            break label1851;
          }
          i1 = ((List)localObject9).size();
          if (i9 >= i1) {
            break label1851;
          }
        }
      }
      for (localObject2 = (p)((List)localObject9).get(i9);; localObject2 = null)
      {
        localObject3 = n;
        localObject6 = p;
        localObject7 = l;
        if (localObject7 == null)
        {
          localObject7 = c;
          localObject8 = i;
          if (localObject8 != null)
          {
            localObject8 = i;
            localObject10 = ((Context)localObject7).getClassLoader();
            ((Bundle)localObject8).setClassLoader((ClassLoader)localObject10);
          }
          localObject8 = a;
          Object localObject10 = i;
          localObject8 = i.a((Context)localObject7, (String)localObject8, (Bundle)localObject10);
          l = ((i)localObject8);
          localObject8 = k;
          if (localObject8 != null)
          {
            localObject8 = k;
            localObject7 = ((Context)localObject7).getClassLoader();
            ((Bundle)localObject8).setClassLoader((ClassLoader)localObject7);
            localObject7 = l;
            localObject8 = k;
            l = ((Bundle)localObject8);
          }
          localObject7 = l;
          int i11 = b;
          ((i)localObject7).a(i11, (i)localObject6);
          localObject6 = l;
          boolean bool4 = c;
          v = bool4;
          l.x = bool1;
          localObject6 = l;
          int i7 = d;
          E = i7;
          localObject6 = l;
          i7 = e;
          F = i7;
          localObject6 = l;
          localObject7 = f;
          G = ((String)localObject7);
          localObject6 = l;
          boolean bool5 = g;
          J = bool5;
          localObject6 = l;
          bool5 = h;
          I = bool5;
          localObject6 = l;
          bool5 = j;
          H = bool5;
          localObject6 = l;
          localObject3 = f;
          z = ((o)localObject3);
          bool7 = a;
          if (bool7)
          {
            localObject3 = "FragmentManager";
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>("Instantiated fragment ");
            localObject7 = l;
            localObject6 = localObject7;
            Log.v((String)localObject3, (String)localObject6);
          }
        }
        localObject3 = l;
        C = ((p)localObject2);
        localObject2 = l;
        boolean bool7 = a;
        if (bool7)
        {
          localObject3 = "FragmentManager";
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>("restoreAllState: active #");
          localObject6 = ((StringBuilder)localObject6).append(i9);
          localObject7 = ": ";
          localObject6 = (String)localObject7 + localObject2;
          Log.v((String)localObject3, (String)localObject6);
        }
        localObject3 = e;
        ((ArrayList)localObject3).add(localObject2);
        l = null;
        for (;;)
        {
          i1 = i9 + 1;
          i9 = i1;
          break;
          e.add(null);
          localObject2 = g;
          if (localObject2 == null)
          {
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            g = ((ArrayList)localObject2);
          }
          boolean bool2 = a;
          if (bool2)
          {
            localObject2 = "FragmentManager";
            localObject5 = new java/lang/StringBuilder;
            localObject3 = "restoreAllState: avail #";
            ((StringBuilder)localObject5).<init>((String)localObject3);
            localObject5 = i9;
            Log.v((String)localObject2, (String)localObject5);
          }
          localObject2 = g;
          localObject5 = Integer.valueOf(i9);
          ((ArrayList)localObject2).add(localObject5);
        }
        if (paramp != null)
        {
          localObject3 = a;
          if (localObject3 != null)
          {
            i2 = ((List)localObject3).size();
            i9 = i2;
            i4 = 0;
            localObject5 = null;
            label1102:
            if (i4 >= i9) {
              break label1293;
            }
            localObject2 = (i)((List)localObject3).get(i4);
            i3 = r;
            if (i3 >= 0)
            {
              i3 = r;
              localObject6 = e;
              int i5 = ((ArrayList)localObject6).size();
              if (i3 >= i5) {
                break label1216;
              }
              localObject9 = e;
              i5 = r;
              localObject9 = (i)((ArrayList)localObject9).get(i5);
            }
          }
          for (q = ((i)localObject9);; q = null)
          {
            i2 = i4 + 1;
            i4 = i2;
            break label1102;
            i9 = 0;
            localObject4 = null;
            break;
            label1216:
            localObject9 = "FragmentManager";
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>("Re-attaching retained fragment ");
            localObject6 = ((StringBuilder)localObject6).append(localObject2);
            localObject7 = " target no longer exists: ";
            localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
            int i8 = r;
            localObject6 = i8;
            Log.w((String)localObject9, (String)localObject6);
          }
        }
        label1293:
        localObject2 = b;
        boolean bool6;
        if (localObject2 != null)
        {
          localObject2 = new java/util/ArrayList;
          i3 = b.length;
          ((ArrayList)localObject2).<init>(i3);
          f = ((ArrayList)localObject2);
          i3 = 0;
          localObject9 = null;
          for (;;)
          {
            localObject2 = b;
            i2 = localObject2.length;
            if (i3 >= i2) {
              break;
            }
            localObject2 = e;
            localObject4 = b;
            i9 = localObject4[i3];
            localObject2 = (i)((ArrayList)localObject2).get(i9);
            if (localObject2 == null)
            {
              localObject4 = new java/lang/IllegalStateException;
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>("No instantiated fragment for index #");
              localObject3 = b;
              int i12 = localObject3[i3];
              localObject5 = i12;
              ((IllegalStateException)localObject4).<init>((String)localObject5);
              a((RuntimeException)localObject4);
            }
            t = bool1;
            bool6 = a;
            if (bool6)
            {
              localObject4 = "FragmentManager";
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>("restoreAllState: added #");
              localObject5 = ((StringBuilder)localObject5).append(i3);
              localObject3 = ": ";
              localObject5 = (String)localObject3 + localObject2;
              Log.v((String)localObject4, (String)localObject5);
            }
            localObject4 = f;
            bool6 = ((ArrayList)localObject4).contains(localObject2);
            if (bool6)
            {
              localObject2 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject2).<init>("Already added!");
              throw ((Throwable)localObject2);
            }
            localObject4 = f;
            ((ArrayList)localObject4).add(localObject2);
            i2 = i3 + 1;
            i3 = i2;
          }
        }
        f = null;
        localObject2 = c;
        if (localObject2 != null)
        {
          localObject2 = new java/util/ArrayList;
          localObject9 = c;
          i3 = localObject9.length;
          ((ArrayList)localObject2).<init>(i3);
          h = ((ArrayList)localObject2);
          i2 = 0;
          localObject2 = null;
          for (;;)
          {
            localObject9 = c;
            i3 = localObject9.length;
            if (i2 >= i3) {
              break;
            }
            localObject9 = c[i2].a(this);
            bool6 = a;
            if (bool6)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("restoreAllState: back stack #");
              localObject1 = ((StringBuilder)localObject1).append(i2).append(" (index ");
              i4 = n;
              localObject1 = ((StringBuilder)localObject1).append(i4);
              localObject5 = "): ";
              localObject1 = (String)localObject5 + localObject9;
              Log.v("FragmentManager", (String)localObject1);
              localObject4 = new android/support/v4/g/e;
              ((e)localObject4).<init>("FragmentManager");
              localObject1 = new java/io/PrintWriter;
              ((PrintWriter)localObject1).<init>((Writer)localObject4);
              localObject4 = "  ";
              ((c)localObject9).a((String)localObject4, (PrintWriter)localObject1, false);
              ((PrintWriter)localObject1).close();
            }
            localObject4 = h;
            ((ArrayList)localObject4).add(localObject9);
            int i10 = n;
            if (i10 >= 0)
            {
              i10 = n;
              a(i10, (c)localObject9);
            }
            i2 += 1;
          }
        }
        h = null;
        break;
        label1851:
        int i2 = 0;
      }
      i3 = 0;
    }
  }
  
  final void a(i parami)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    if (parami == null) {}
    int i2;
    label46:
    Object localObject2;
    Object localObject3;
    label118:
    int i9;
    float f3;
    label243:
    boolean bool3;
    do
    {
      return;
      i2 = m;
      boolean bool1 = u;
      if (bool1)
      {
        bool1 = parami.f();
        if (!bool1) {
          break;
        }
        i2 = Math.min(i2, i1);
      }
      int i7 = parami.w();
      int i8 = parami.x();
      localObject1 = this;
      localObject2 = parami;
      a(parami, i2, i7, i8, false);
      localObject1 = P;
      if (localObject1 != null)
      {
        localObject3 = O;
        localObject1 = P;
        if ((localObject3 != null) && (localObject1 != null)) {
          break label535;
        }
        bool1 = false;
        localObject1 = null;
        f2 = 0.0F;
        if (localObject1 != null)
        {
          localObject1 = P;
          localObject2 = O;
          int i3 = ((ViewGroup)localObject2).indexOfChild((View)localObject1);
          localObject3 = P;
          i2 = ((ViewGroup)localObject2).indexOfChild((View)localObject3);
          if (i2 < i3)
          {
            ((ViewGroup)localObject2).removeViewAt(i2);
            localObject3 = P;
            ((ViewGroup)localObject2).addView((View)localObject3, i3);
          }
        }
        boolean bool2 = X;
        if (bool2)
        {
          localObject1 = O;
          if (localObject1 != null)
          {
            int i4 = Build.VERSION.SDK_INT;
            i9 = 11;
            f3 = 1.5E-44F;
            if (i4 >= i9) {
              break label625;
            }
            localObject1 = P;
            ((View)localObject1).setVisibility(0);
            Z = 0.0F;
            X = false;
            i4 = parami.w();
            i9 = parami.x();
            localObject1 = a(parami, i4, i1, i9);
            if (localObject1 != null)
            {
              a(P, (Animation)localObject1);
              localObject2 = P;
              ((View)localObject2).startAnimation((Animation)localObject1);
            }
          }
        }
      }
      bool3 = Y;
    } while (!bool3);
    Object localObject1 = P;
    label349:
    int i5;
    if (localObject1 != null)
    {
      i9 = parami.w();
      bool3 = H;
      if (bool3) {
        break label664;
      }
      bool3 = i1;
      f2 = f1;
      i2 = parami.x();
      localObject1 = a(parami, i9, bool3, i2);
      if (localObject1 != null)
      {
        a(P, (Animation)localObject1);
        P.startAnimation((Animation)localObject1);
        localObject2 = P;
        a((View)localObject2, (Animation)localObject1);
        ((Animation)localObject1).start();
      }
      bool3 = H;
      if (!bool3) {
        break label676;
      }
      bool3 = parami.D();
      if (bool3) {
        break label676;
      }
      i5 = 8;
    }
    for (float f2 = 1.1E-44F;; f2 = 0.0F)
    {
      localObject2 = P;
      ((View)localObject2).setVisibility(i5);
      boolean bool4 = parami.D();
      if (bool4) {
        parami.a(false);
      }
      bool4 = t;
      if (bool4)
      {
        bool4 = L;
        if (bool4)
        {
          bool4 = M;
          if (bool4) {
            r = i1;
          }
        }
      }
      Y = false;
      bool4 = H;
      i.h();
      break;
      i2 = Math.min(i2, 0);
      break label46;
      label535:
      localObject1 = f;
      int i6 = ((ArrayList)localObject1).indexOf(parami) + -1;
      for (i9 = i6;; i9 = i6)
      {
        if (i9 < 0) {
          break label613;
        }
        localObject1 = (i)f.get(i9);
        Object localObject4 = O;
        if (localObject4 == localObject3)
        {
          localObject4 = P;
          if (localObject4 != null) {
            break;
          }
        }
        i6 = i9 + -1;
      }
      label613:
      i6 = 0;
      localObject1 = null;
      f2 = 0.0F;
      break label118;
      label625:
      f2 = Z;
      boolean bool5 = f2 < 0.0F;
      if (!bool5) {
        break label243;
      }
      localObject1 = P;
      f3 = Z;
      ((View)localObject1).setAlpha(f3);
      break label243;
      label664:
      bool5 = false;
      localObject1 = null;
      f2 = 0.0F;
      break label349;
      label676:
      bool5 = false;
      localObject1 = null;
    }
  }
  
  final void a(i parami, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1 = 4;
    int i2 = 3;
    int i3 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = t;
    if (bool1)
    {
      bool1 = I;
      if (!bool1) {}
    }
    else if (paramInt1 > i3)
    {
      paramInt1 = i3;
    }
    bool1 = u;
    if (bool1)
    {
      int i4 = k;
      if (paramInt1 > i4) {
        paramInt1 = k;
      }
    }
    boolean bool2 = R;
    if (bool2)
    {
      i5 = k;
      if ((i5 < i1) && (paramInt1 > i2)) {
        paramInt1 = i2;
      }
    }
    int i5 = k;
    Object localObject1;
    int i19;
    Object localObject5;
    label960:
    label1025:
    Object localObject3;
    if (i5 < paramInt1)
    {
      boolean bool3 = v;
      if (bool3)
      {
        bool3 = w;
        if (bool3) {}
      }
      Object localObject2;
      Object localObject4;
      for (;;)
      {
        return;
        localObject1 = parami.A();
        if (localObject1 != null)
        {
          parami.a(null);
          i19 = parami.B();
          localObject1 = this;
          localObject2 = parami;
          localObject4 = null;
          a(parami, i19, 0, 0, i3);
        }
        int i6 = k;
        switch (i6)
        {
        default: 
          i6 = k;
          if (i6 != paramInt1)
          {
            localObject1 = "FragmentManager";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("moveToState: Fragment state for ");
            localObject2 = ((StringBuilder)localObject2).append(parami).append(" not updated inline; expected state ").append(paramInt1);
            localObject5 = " found ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
            i19 = k;
            localObject2 = i19;
            Log.w((String)localObject1, (String)localObject2);
            k = paramInt1;
          }
          break;
        }
      }
      boolean bool4 = a;
      if (bool4)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        localObject5 = "moveto CREATED: ";
        ((StringBuilder)localObject2).<init>((String)localObject5);
        localObject2 = parami;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = l;
      if (localObject1 != null)
      {
        localObject1 = l;
        localObject2 = n.c.getClassLoader();
        ((Bundle)localObject1).setClassLoader((ClassLoader)localObject2);
        localObject1 = l.getSparseParcelableArray("android:view_state");
        m = ((SparseArray)localObject1);
        localObject1 = l;
        localObject2 = "android:target_state";
        localObject1 = a((Bundle)localObject1, (String)localObject2);
        q = ((i)localObject1);
        localObject1 = q;
        if (localObject1 != null)
        {
          localObject1 = l;
          localObject2 = "android:target_req_state";
          int i7 = ((Bundle)localObject1).getInt((String)localObject2, 0);
          s = i7;
        }
        localObject1 = l;
        localObject2 = "android:user_visible_hint";
        bool5 = ((Bundle)localObject1).getBoolean((String)localObject2, i3);
        S = bool5;
        bool5 = S;
        if (!bool5)
        {
          R = i3;
          if (paramInt1 > i2) {
            paramInt1 = i2;
          }
        }
      }
      localObject1 = n;
      A = ((m)localObject1);
      localObject1 = p;
      D = ((i)localObject1);
      localObject1 = p;
      if (localObject1 != null) {}
      for (localObject1 = p.B;; localObject1 = n.f)
      {
        z = ((o)localObject1);
        localObject1 = n.c;
        a(parami, (Context)localObject1, false);
        N = false;
        localObject1 = n.c;
        parami.a((Context)localObject1);
        bool5 = N;
        if (bool5) {
          break;
        }
        localObject1 = new android/support/v4/b/ap;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Fragment ");
        localObject2 = parami + " did not call through to super.onAttach()";
        ((ap)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject1 = D;
      if (localObject1 != null)
      {
        localObject1 = D;
        i.k();
      }
      localObject1 = n.c;
      b(parami, (Context)localObject1, false);
      boolean bool5 = K;
      if (!bool5)
      {
        localObject1 = l;
        localObject2 = B;
        if (localObject2 != null)
        {
          localObject2 = B;
          s = false;
        }
        k = i3;
        N = false;
        parami.a((Bundle)localObject1);
        bool5 = N;
        if (!bool5)
        {
          localObject1 = new android/support/v4/b/ap;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Fragment ");
          localObject2 = parami + " did not call through to super.onCreate()";
          ((ap)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        localObject1 = l;
        a(parami, (Bundle)localObject1, false);
        K = false;
        bool5 = v;
        int i20;
        if (bool5)
        {
          localObject1 = l;
          parami.b((Bundle)localObject1);
          localObject1 = l;
          localObject1 = parami.s();
          P = ((View)localObject1);
          localObject1 = P;
          if (localObject1 == null) {
            break label1745;
          }
          localObject1 = P;
          Q = ((View)localObject1);
          int i8 = Build.VERSION.SDK_INT;
          i20 = 11;
          if (i8 < i20) {
            break label1727;
          }
          localObject1 = P;
          android.support.v4.h.w.z((View)localObject1);
          bool6 = H;
          if (bool6)
          {
            localObject1 = P;
            i20 = 8;
            ((View)localObject1).setVisibility(i20);
          }
          localObject1 = P;
          localObject1 = l;
          i.m();
          localObject1 = P;
          localObject2 = l;
          a(parami, (View)localObject1, (Bundle)localObject2, false);
        }
        if (paramInt1 <= i3) {
          break label1989;
        }
        boolean bool6 = a;
        if (bool6)
        {
          localObject1 = "FragmentManager";
          localObject2 = new java/lang/StringBuilder;
          localObject5 = "moveto ACTIVITY_CREATED: ";
          ((StringBuilder)localObject2).<init>((String)localObject5);
          localObject2 = parami;
          Log.v((String)localObject1, (String)localObject2);
        }
        bool6 = v;
        if (!bool6)
        {
          int i9 = F;
          if (i9 == 0) {
            break label4029;
          }
          i9 = F;
          i20 = -1;
          if (i9 == i20)
          {
            localObject1 = new java/lang/IllegalArgumentException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("Cannot create fragment ");
            localObject2 = ((StringBuilder)localObject2).append(parami);
            localObject5 = " for a container view with no id";
            localObject2 = (String)localObject5;
            ((IllegalArgumentException)localObject1).<init>((String)localObject2);
            a((RuntimeException)localObject1);
          }
          localObject1 = o;
          i20 = F;
          localObject1 = (ViewGroup)((k)localObject1).a(i20);
          if (localObject1 == null)
          {
            boolean bool16 = x;
            if (!bool16)
            {
              try
              {
                localObject2 = A;
                if (localObject2 != null) {
                  break label1753;
                }
                localObject2 = new java/lang/IllegalStateException;
                localObject5 = new java/lang/StringBuilder;
                localObject4 = "Fragment ";
                ((StringBuilder)localObject5).<init>((String)localObject4);
                localObject5 = ((StringBuilder)localObject5).append(parami);
                localObject4 = " not attached to Activity";
                localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
                localObject5 = ((StringBuilder)localObject5).toString();
                ((IllegalStateException)localObject2).<init>((String)localObject5);
                throw ((Throwable)localObject2);
              }
              catch (Resources.NotFoundException localNotFoundException)
              {
                localObject3 = "unknown";
              }
              label1295:
              localObject5 = new java/lang/IllegalArgumentException;
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>("No view found for id 0x");
              int i22 = F;
              String str = Integer.toHexString(i22);
              localObject4 = ((StringBuilder)localObject4).append(str);
              str = " (";
              localObject3 = ((StringBuilder)localObject4).append(str).append((String)localObject3);
              localObject4 = ") for fragment ";
              localObject3 = (String)localObject4 + parami;
              ((IllegalArgumentException)localObject5).<init>((String)localObject3);
              a((RuntimeException)localObject5);
            }
          }
        }
      }
    }
    for (;;)
    {
      O = ((ViewGroup)localObject1);
      localObject3 = l;
      parami.b((Bundle)localObject3);
      localObject3 = l;
      localObject3 = parami.s();
      P = ((View)localObject3);
      localObject3 = P;
      int i21;
      if (localObject3 != null)
      {
        localObject3 = P;
        Q = ((View)localObject3);
        i21 = Build.VERSION.SDK_INT;
        i19 = 11;
        if (i21 >= i19)
        {
          localObject3 = P;
          android.support.v4.h.w.z((View)localObject3);
          label1475:
          if (localObject1 != null)
          {
            localObject3 = P;
            ((ViewGroup)localObject1).addView((View)localObject3);
          }
          boolean bool7 = H;
          if (bool7)
          {
            localObject1 = P;
            i21 = 8;
            ((View)localObject1).setVisibility(i21);
          }
          localObject1 = P;
          localObject1 = l;
          i.m();
          localObject1 = P;
          localObject3 = l;
          a(parami, (View)localObject1, (Bundle)localObject3, false);
          localObject1 = P;
          int i10 = ((View)localObject1).getVisibility();
          if (i10 != 0) {
            break label1809;
          }
          localObject1 = O;
          if (localObject1 == null) {
            break label1809;
          }
          i10 = i3;
          f2 = f1;
          label1595:
          X = i10;
        }
      }
      boolean bool8;
      for (;;)
      {
        localObject1 = l;
        localObject3 = B;
        if (localObject3 != null)
        {
          localObject3 = B;
          s = false;
        }
        i21 = 2;
        k = i21;
        N = false;
        parami.c((Bundle)localObject1);
        bool8 = N;
        if (bool8) {
          break label1829;
        }
        localObject1 = new android/support/v4/b/ap;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Fragment ");
        localObject3 = parami + " did not call through to super.onActivityCreated()";
        ((ap)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
        localObject1 = l;
        parami.e((Bundle)localObject1);
        k = i3;
        break;
        label1727:
        localObject1 = y.a(P);
        P = ((View)localObject1);
        break label960;
        label1745:
        Q = null;
        break label1025;
        label1753:
        localObject3 = A;
        localObject3 = c;
        localObject3 = ((Context)localObject3).getResources();
        i19 = F;
        localObject3 = ((Resources)localObject3).getResourceName(i19);
        break label1295;
        localObject3 = y.a(P);
        P = ((View)localObject3);
        break label1475;
        label1809:
        bool8 = false;
        localObject1 = null;
        f2 = 0.0F;
        break label1595;
        Q = null;
      }
      label1829:
      localObject1 = B;
      if (localObject1 != null)
      {
        localObject1 = B;
        ((o)localObject1).h();
      }
      localObject1 = l;
      b(parami, (Bundle)localObject1, false);
      localObject1 = P;
      if (localObject1 != null)
      {
        localObject1 = l;
        localObject1 = m;
        if (localObject1 != null)
        {
          localObject1 = Q;
          localObject3 = m;
          ((View)localObject1).restoreHierarchyState((SparseArray)localObject3);
          m = null;
        }
        N = false;
        N = i3;
        bool8 = N;
        if (!bool8)
        {
          localObject1 = new android/support/v4/b/ap;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Fragment ");
          localObject3 = parami + " did not call through to super.onViewStateRestored()";
          ((ap)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      l = null;
      label1989:
      int i11 = 2;
      float f2 = 2.8E-45F;
      if (paramInt1 > i11) {
        k = i2;
      }
      if (paramInt1 > i2)
      {
        bool9 = a;
        if (bool9)
        {
          localObject1 = "FragmentManager";
          localObject3 = new java/lang/StringBuilder;
          localObject5 = "moveto STARTED: ";
          ((StringBuilder)localObject3).<init>((String)localObject5);
          localObject3 = parami;
          Log.v((String)localObject1, (String)localObject3);
        }
        localObject1 = B;
        if (localObject1 != null)
        {
          B.s = false;
          localObject1 = B;
          ((o)localObject1).c();
        }
        k = i1;
        N = false;
        parami.c();
        bool9 = N;
        if (!bool9)
        {
          localObject1 = new android/support/v4/b/ap;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Fragment ");
          localObject3 = parami + " did not call through to super.onStart()";
          ((ap)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
        localObject1 = B;
        if (localObject1 != null)
        {
          localObject1 = B;
          ((o)localObject1).i();
        }
        localObject1 = T;
        if (localObject1 != null)
        {
          localObject1 = T;
          ((w)localObject1).f();
        }
        b(parami, false);
      }
      if (paramInt1 <= i1) {
        break;
      }
      boolean bool9 = a;
      if (bool9)
      {
        localObject1 = "FragmentManager";
        localObject3 = new java/lang/StringBuilder;
        localObject5 = "moveto RESUMED: ";
        ((StringBuilder)localObject3).<init>((String)localObject5);
        localObject3 = parami;
        Log.v((String)localObject1, (String)localObject3);
      }
      localObject1 = B;
      if (localObject1 != null)
      {
        B.s = false;
        localObject1 = B;
        ((o)localObject1).c();
      }
      f2 = 7.0E-45F;
      k = 5;
      N = false;
      N = i3;
      bool9 = N;
      if (!bool9)
      {
        localObject1 = new android/support/v4/b/ap;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Fragment ");
        localObject3 = parami + " did not call through to super.onResume()";
        ((ap)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      localObject1 = B;
      if (localObject1 != null)
      {
        B.j();
        localObject1 = B;
        ((o)localObject1).c();
      }
      c(parami, false);
      l = null;
      m = null;
      break;
      int i12 = k;
      if (i12 <= paramInt1) {
        break;
      }
      i12 = k;
      switch (i12)
      {
      default: 
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        label2487:
        int i14;
        do
        {
          if (paramInt1 > 0) {
            break;
          }
          boolean bool10 = t;
          if (bool10)
          {
            localObject1 = parami.A();
            if (localObject1 != null)
            {
              localObject1 = parami.A();
              parami.a(null);
              ((View)localObject1).clearAnimation();
            }
          }
          localObject1 = parami.A();
          if (localObject1 == null) {
            break label3388;
          }
          parami.b(paramInt1);
          paramInt1 = i3;
          break;
          int i13 = 5;
          f2 = 7.0E-45F;
          boolean bool11;
          if (paramInt1 < i13)
          {
            bool11 = a;
            if (bool11)
            {
              localObject1 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              localObject5 = "movefrom RESUMED: ";
              ((StringBuilder)localObject3).<init>((String)localObject5);
              localObject3 = parami;
              Log.v((String)localObject1, (String)localObject3);
            }
            localObject1 = B;
            if (localObject1 != null)
            {
              localObject1 = B;
              ((o)localObject1).k();
            }
            k = i1;
            N = false;
            N = i3;
            bool11 = N;
            if (!bool11)
            {
              localObject1 = new android/support/v4/b/ap;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("Fragment ");
              localObject3 = parami + " did not call through to super.onPause()";
              ((ap)localObject1).<init>((String)localObject3);
              throw ((Throwable)localObject1);
            }
            d(parami, false);
          }
          if (paramInt1 < i1)
          {
            bool11 = a;
            if (bool11)
            {
              localObject1 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              localObject5 = "movefrom STARTED: ";
              ((StringBuilder)localObject3).<init>((String)localObject5);
              localObject3 = parami;
              Log.v((String)localObject1, (String)localObject3);
            }
            localObject1 = B;
            if (localObject1 != null)
            {
              localObject1 = B;
              ((o)localObject1).l();
            }
            k = i2;
            N = false;
            parami.d();
            bool11 = N;
            if (!bool11)
            {
              localObject1 = new android/support/v4/b/ap;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("Fragment ");
              localObject3 = parami + " did not call through to super.onStop()";
              ((ap)localObject1).<init>((String)localObject3);
              throw ((Throwable)localObject1);
            }
            e(parami, false);
          }
          if (paramInt1 < i2)
          {
            bool11 = a;
            if (bool11)
            {
              localObject1 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              localObject5 = "movefrom STOPPED: ";
              ((StringBuilder)localObject3).<init>((String)localObject5);
              localObject3 = parami;
              Log.v((String)localObject1, (String)localObject3);
            }
            parami.t();
          }
          i14 = 2;
          f2 = 2.8E-45F;
        } while (paramInt1 >= i14);
        boolean bool12 = a;
        if (bool12)
        {
          localObject1 = "FragmentManager";
          localObject3 = new java/lang/StringBuilder;
          localObject5 = "movefrom ACTIVITY_CREATED: ";
          ((StringBuilder)localObject3).<init>((String)localObject5);
          localObject3 = parami;
          Log.v((String)localObject1, (String)localObject3);
        }
        localObject1 = P;
        if (localObject1 != null)
        {
          localObject1 = n;
          bool12 = ((m)localObject1).b();
          if (bool12)
          {
            localObject1 = m;
            if (localObject1 == null) {
              i(parami);
            }
          }
        }
        localObject1 = B;
        if (localObject1 != null)
        {
          localObject1 = B;
          d = i3;
          ((o)localObject1).a(i3, false);
          d = false;
        }
        k = i3;
        N = false;
        parami.e();
        bool12 = N;
        if (!bool12)
        {
          localObject1 = new android/support/v4/b/ap;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Fragment ");
          localObject3 = parami + " did not call through to super.onDestroyView()";
          ((ap)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
        localObject1 = T;
        if (localObject1 != null)
        {
          localObject1 = T;
          ((w)localObject1).e();
        }
        f(parami, false);
        localObject1 = P;
        boolean bool14;
        if (localObject1 != null)
        {
          localObject1 = O;
          if (localObject1 != null)
          {
            int i15 = m;
            if (i15 <= 0) {
              break label4017;
            }
            boolean bool13 = t;
            if (bool13) {
              break label4017;
            }
            localObject1 = P;
            int i16 = ((View)localObject1).getVisibility();
            if (i16 != 0) {
              break label4017;
            }
            f2 = Z;
            i21 = 0;
            localObject3 = null;
            bool14 = f2 < 0.0F;
            if (bool14) {
              break label4017;
            }
            localObject1 = a(parami, paramInt2, false, paramInt3);
          }
        }
        for (;;)
        {
          i21 = 0;
          localObject3 = null;
          Z = 0.0F;
          if (localObject1 != null)
          {
            localObject3 = P;
            parami.a((View)localObject3);
            parami.b(paramInt1);
            localObject3 = P;
            localObject5 = new android/support/v4/b/o$2;
            ((o.2)localObject5).<init>(this, (View)localObject3, (Animation)localObject1, parami);
            ((Animation)localObject1).setAnimationListener((Animation.AnimationListener)localObject5);
            localObject3 = P;
            ((View)localObject3).startAnimation((Animation)localObject1);
          }
          localObject1 = O;
          localObject3 = P;
          ((ViewGroup)localObject1).removeView((View)localObject3);
          O = null;
          P = null;
          Q = null;
          break label2487;
          label3388:
          bool14 = a;
          if (bool14)
          {
            localObject1 = "FragmentManager";
            localObject3 = new java/lang/StringBuilder;
            localObject5 = "movefrom CREATED: ";
            ((StringBuilder)localObject3).<init>((String)localObject5);
            localObject3 = parami;
            Log.v((String)localObject1, (String)localObject3);
          }
          bool14 = K;
          if (!bool14)
          {
            localObject1 = B;
            if (localObject1 != null)
            {
              localObject1 = B;
              ((o)localObject1).n();
            }
            k = 0;
            N = false;
            parami.n();
            bool14 = N;
            if (!bool14)
            {
              localObject1 = new android/support/v4/b/ap;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("Fragment ");
              localObject3 = parami + " did not call through to super.onDestroy()";
              ((ap)localObject1).<init>((String)localObject3);
              throw ((Throwable)localObject1);
            }
            B = null;
            g(parami, false);
          }
          for (;;)
          {
            N = false;
            parami.a();
            bool14 = N;
            if (bool14) {
              break;
            }
            localObject1 = new android/support/v4/b/ap;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("Fragment ");
            localObject3 = parami + " did not call through to super.onDetach()";
            ((ap)localObject1).<init>((String)localObject3);
            throw ((Throwable)localObject1);
            k = 0;
          }
          localObject1 = B;
          if (localObject1 != null)
          {
            bool14 = K;
            if (!bool14)
            {
              localObject1 = new java/lang/IllegalStateException;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("Child FragmentManager of ");
              localObject3 = parami + " was not  destroyed and this fragment is not retaining instance";
              ((IllegalStateException)localObject1).<init>((String)localObject3);
              throw ((Throwable)localObject1);
            }
            localObject1 = B;
            ((o)localObject1).n();
            B = null;
          }
          h(parami, false);
          if (paramBoolean) {
            break;
          }
          bool14 = K;
          if (!bool14)
          {
            int i17 = n;
            if (i17 < 0) {
              break;
            }
            boolean bool15 = a;
            if (bool15)
            {
              localObject1 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              localObject5 = "Freeing fragment index ";
              ((StringBuilder)localObject3).<init>((String)localObject5);
              localObject3 = parami;
              Log.v((String)localObject1, (String)localObject3);
            }
            localObject1 = e;
            i21 = n;
            ((ArrayList)localObject1).set(i21, null);
            localObject1 = g;
            if (localObject1 == null)
            {
              localObject1 = new java/util/ArrayList;
              ((ArrayList)localObject1).<init>();
              g = ((ArrayList)localObject1);
            }
            localObject1 = g;
            i21 = n;
            localObject3 = Integer.valueOf(i21);
            ((ArrayList)localObject1).add(localObject3);
            localObject1 = n;
            localObject3 = o;
            ((m)localObject1).a((String)localObject3);
            i18 = -1;
            f2 = 0.0F / 0.0F;
            n = i18;
            o = null;
            t = false;
            u = false;
            v = false;
            w = false;
            x = false;
            y = 0;
            z = null;
            B = null;
            A = null;
            E = 0;
            F = 0;
            G = null;
            H = false;
            I = false;
            K = false;
            T = null;
            U = false;
            V = false;
            break;
          }
          A = null;
          D = null;
          z = null;
          break;
          label4017:
          i18 = 0;
          localObject1 = null;
          f2 = 0.0F;
        }
        label4029:
        int i18 = 0;
        localObject1 = null;
        f2 = 0.0F;
      }
    }
  }
  
  public final void a(i parami, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject1 = f;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      f = ((ArrayList)localObject1);
    }
    boolean bool2 = a;
    Object localObject2;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      String str = "add: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = parami;
      Log.v((String)localObject1, (String)localObject2);
    }
    b(parami);
    bool2 = I;
    if (!bool2)
    {
      localObject1 = f;
      bool2 = ((ArrayList)localObject1).contains(parami);
      if (bool2)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Fragment already added: ");
        localObject2 = parami;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      f.add(parami);
      t = bool1;
      u = false;
      localObject1 = P;
      if (localObject1 == null) {
        Y = false;
      }
      bool2 = L;
      if (bool2)
      {
        bool2 = M;
        if (bool2) {
          r = bool1;
        }
      }
      if (paramBoolean) {
        h(parami);
      }
    }
  }
  
  public final void a(m paramm, k paramk, i parami)
  {
    Object localObject = n;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Already attached");
      throw ((Throwable)localObject);
    }
    n = paramm;
    o = paramk;
    p = parami;
  }
  
  public final void a(o.c paramc, boolean paramBoolean)
  {
    if (!paramBoolean) {
      r();
    }
    try
    {
      boolean bool = t;
      Object localObject1;
      if (!bool)
      {
        localObject1 = n;
        if (localObject1 != null) {}
      }
      else
      {
        localObject1 = new java/lang/IllegalStateException;
        String str = "Activity has been destroyed";
        ((IllegalStateException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    ArrayList localArrayList = c;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      c = localArrayList;
    }
    localArrayList = c;
    localArrayList.add(paramc);
    s();
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i1 = 0;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    String str1 = "    ";
    String str2 = str1;
    localObject1 = e;
    int i2;
    int i5;
    String str3;
    if (localObject1 != null)
    {
      localObject1 = e;
      i2 = ((ArrayList)localObject1).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        i3 = System.identityHashCode(this);
        localObject1 = Integer.toHexString(i3);
        paramPrintWriter.print((String)localObject1);
        localObject1 = ":";
        paramPrintWriter.println((String)localObject1);
        i5 = 0;
        str1 = null;
        while (i5 < i2)
        {
          localObject1 = (i)e.get(i5);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i5);
          str3 = ": ";
          paramPrintWriter.print(str3);
          paramPrintWriter.println(localObject1);
          if (localObject1 != null) {
            ((i)localObject1).a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          i3 = i5 + 1;
          i5 = i3;
        }
      }
    }
    localObject1 = f;
    if (localObject1 != null)
    {
      localObject1 = f;
      i2 = ((ArrayList)localObject1).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Added Fragments:";
        paramPrintWriter.println((String)localObject1);
        i5 = 0;
        str1 = null;
        while (i5 < i2)
        {
          localObject1 = (i)f.get(i5);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i5);
          str3 = ": ";
          paramPrintWriter.print(str3);
          localObject1 = ((i)localObject1).toString();
          paramPrintWriter.println((String)localObject1);
          i3 = i5 + 1;
          i5 = i3;
        }
      }
    }
    localObject1 = i;
    if (localObject1 != null)
    {
      localObject1 = i;
      i2 = ((ArrayList)localObject1).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Fragments Created Menus:";
        paramPrintWriter.println((String)localObject1);
        i5 = 0;
        str1 = null;
        while (i5 < i2)
        {
          localObject1 = (i)i.get(i5);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i5);
          str3 = ": ";
          paramPrintWriter.print(str3);
          localObject1 = ((i)localObject1).toString();
          paramPrintWriter.println((String)localObject1);
          i3 = i5 + 1;
          i5 = i3;
        }
      }
    }
    localObject1 = h;
    if (localObject1 != null)
    {
      localObject1 = h;
      i2 = ((ArrayList)localObject1).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Back Stack:";
        paramPrintWriter.println((String)localObject1);
        i5 = 0;
        str1 = null;
        while (i5 < i2)
        {
          localObject1 = (c)h.get(i5);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i5);
          paramPrintWriter.print(": ");
          str3 = ((c)localObject1).toString();
          paramPrintWriter.println(str3);
          ((c)localObject1).a(str2, paramPrintWriter);
          i3 = i5 + 1;
          i5 = i3;
        }
      }
    }
    try
    {
      localObject1 = j;
      if (localObject1 != null)
      {
        localObject1 = j;
        int i6 = ((ArrayList)localObject1).size();
        if (i6 > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "Back Stack Indices:";
          paramPrintWriter.println((String)localObject1);
          i5 = 0;
          str1 = null;
          while (i5 < i6)
          {
            localObject1 = j;
            localObject1 = ((ArrayList)localObject1).get(i5);
            localObject1 = (c)localObject1;
            paramPrintWriter.print(paramString);
            String str4 = "  #";
            paramPrintWriter.print(str4);
            paramPrintWriter.print(i5);
            str4 = ": ";
            paramPrintWriter.print(str4);
            paramPrintWriter.println(localObject1);
            i3 = i5 + 1;
            i5 = i3;
          }
        }
      }
      localObject1 = k;
      if (localObject1 != null)
      {
        localObject1 = k;
        i3 = ((ArrayList)localObject1).size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "mAvailBackStackIndices: ";
          paramPrintWriter.print((String)localObject1);
          localObject1 = k;
          localObject1 = ((ArrayList)localObject1).toArray();
          localObject1 = Arrays.toString((Object[])localObject1);
          paramPrintWriter.println((String)localObject1);
        }
      }
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject1 = c;
        i5 = ((ArrayList)localObject1).size();
        if (i5 > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "Pending Actions:";
          paramPrintWriter.println((String)localObject1);
          while (i1 < i5)
          {
            localObject1 = (o.c)c.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            str2 = ": ";
            paramPrintWriter.print(str2);
            paramPrintWriter.println(localObject1);
            i3 = i1 + 1;
            i1 = i3;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    Object localObject3 = n;
    paramPrintWriter.println(localObject3);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    localObject3 = o;
    paramPrintWriter.println(localObject3);
    localObject3 = p;
    if (localObject3 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      localObject3 = p;
      paramPrintWriter.println(localObject3);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    int i3 = m;
    paramPrintWriter.print(i3);
    paramPrintWriter.print(" mStateSaved=");
    boolean bool = s;
    paramPrintWriter.print(bool);
    localObject3 = " mDestroyed=";
    paramPrintWriter.print((String)localObject3);
    bool = t;
    paramPrintWriter.println(bool);
    bool = r;
    if (bool)
    {
      paramPrintWriter.print(paramString);
      localObject3 = "  mNeedMenuInvalidate=";
      paramPrintWriter.print((String)localObject3);
      bool = r;
      paramPrintWriter.println(bool);
    }
    localObject3 = u;
    if (localObject3 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      localObject3 = u;
      paramPrintWriter.println((String)localObject3);
    }
    localObject3 = g;
    if (localObject3 != null)
    {
      localObject3 = g;
      int i4 = ((ArrayList)localObject3).size();
      if (i4 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mAvailIndices: ");
        localObject3 = Arrays.toString(g.toArray());
        paramPrintWriter.println((String)localObject3);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = f;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = f;
      int i1 = ((ArrayList)localObject).size() + -1;
      for (int i2 = i1; i2 >= 0; i2 = i1)
      {
        localObject = (i)f.get(i2);
        if (localObject != null)
        {
          o localo = B;
          if (localo != null)
          {
            localObject = B;
            ((o)localObject).a(paramBoolean);
          }
        }
        i1 = i2 + -1;
      }
    }
  }
  
  public final boolean a(Menu paramMenu)
  {
    boolean bool1 = true;
    Object localObject = f;
    int i1;
    boolean bool2;
    boolean bool4;
    if (localObject != null)
    {
      i1 = 0;
      bool2 = false;
      localObject = f;
      int i2 = ((ArrayList)localObject).size();
      if (i1 >= i2) {
        break label142;
      }
      localObject = (i)f.get(i1);
      if (localObject != null)
      {
        bool4 = H;
        if (bool4) {
          break label151;
        }
        bool4 = L;
        if (!bool4) {
          break label145;
        }
        bool4 = M;
        if (!bool4) {
          break label145;
        }
        bool4 = bool1;
        label88:
        o localo = B;
        if (localo != null)
        {
          localObject = B;
          boolean bool3 = ((o)localObject).a(paramMenu);
          bool4 |= bool3;
        }
      }
    }
    for (;;)
    {
      if (bool4) {
        bool2 = bool1;
      }
      int i3 = i1 + 1;
      i1 = i3;
      break;
      bool2 = false;
      label142:
      return bool2;
      label145:
      bool4 = false;
      break label88;
      label151:
      bool4 = false;
    }
  }
  
  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = 0;
    ArrayList localArrayList = null;
    Object localObject = f;
    int i3;
    boolean bool1;
    float f2;
    int i4;
    boolean bool3;
    if (localObject != null)
    {
      i3 = 0;
      bool1 = false;
      f2 = 0.0F;
      localObject = f;
      i4 = ((ArrayList)localObject).size();
      if (i3 >= i4) {
        break label203;
      }
      localObject = (i)f.get(i3);
      if (localObject == null) {
        break label288;
      }
      bool3 = H;
      if (bool3) {
        break label305;
      }
      bool3 = L;
      if (!bool3) {
        break label299;
      }
      bool3 = M;
      if (!bool3) {
        break label299;
      }
      bool3 = i1;
      label110:
      o localo = B;
      if (localo != null)
      {
        localo = B;
        boolean bool4 = localo.a(paramMenu, paramMenuInflater);
        bool3 |= bool4;
      }
    }
    for (;;)
    {
      if (bool3)
      {
        if (localArrayList == null)
        {
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
        }
        localArrayList.add(localObject);
        i4 = i1;
      }
      for (float f3 = f1;; f3 = f2)
      {
        i3 += 1;
        bool1 = i4;
        f2 = f3;
        break;
        bool1 = false;
        f2 = 0.0F;
        label203:
        localObject = i;
        if (localObject != null) {
          for (;;)
          {
            localObject = i;
            i4 = ((ArrayList)localObject).size();
            if (i2 >= i4) {
              break;
            }
            localObject = (i)i.get(i2);
            if (localArrayList != null)
            {
              bool2 = localArrayList.contains(localObject);
              if (bool2) {}
            }
            else
            {
              i.o();
            }
            i2 += 1;
          }
        }
        i = localArrayList;
        return bool1;
        label288:
        boolean bool2 = bool1;
      }
      label299:
      bool3 = false;
      break label110;
      label305:
      bool3 = false;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject = f;
    if (localObject != null) {}
    label113:
    label122:
    int i3;
    for (int i1 = 0;; i1 = i3)
    {
      localObject = f;
      int i2 = ((ArrayList)localObject).size();
      boolean bool3;
      if (i1 < i2)
      {
        localObject = (i)f.get(i1);
        if (localObject == null) {
          break label122;
        }
        boolean bool4 = H;
        if (bool4) {
          break label113;
        }
        o localo = B;
        if (localo == null) {
          break label113;
        }
        localObject = B;
        bool3 = ((o)localObject).a(paramMenuItem);
        if (!bool3) {
          break label113;
        }
        bool3 = bool1;
      }
      while (bool3)
      {
        bool2 = bool1;
        return bool2;
        bool3 = false;
        localObject = null;
      }
      i3 = i1 + 1;
    }
  }
  
  final boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    Object localObject1 = null;
    Object localObject2 = h;
    boolean bool1;
    if (localObject2 == null) {
      bool1 = false;
    }
    int i2;
    for (localObject2 = null;; localObject2 = null)
    {
      return bool1;
      if ((paramString != null) || (paramInt1 >= 0)) {
        break label118;
      }
      i2 = paramInt2 & 0x1;
      if (i2 != 0) {
        break label118;
      }
      localObject2 = h;
      i2 = ((ArrayList)localObject2).size() + -1;
      if (i2 >= 0) {
        break;
      }
      i2 = 0;
    }
    ArrayList localArrayList = h;
    localObject2 = localArrayList.remove(i2);
    paramArrayList1.add(localObject2);
    localObject2 = Boolean.valueOf(i1);
    paramArrayList2.add(localObject2);
    for (;;)
    {
      i2 = i1;
      break;
      label118:
      i2 = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        localObject2 = h;
        i2 = ((ArrayList)localObject2).size();
        i3 = i2 + -1;
        String str;
        boolean bool2;
        while (i3 >= 0)
        {
          localObject2 = (c)h.get(i3);
          if (paramString != null)
          {
            str = l;
            bool2 = paramString.equals(str);
            if (bool2) {
              break;
            }
          }
          if (paramInt1 >= 0)
          {
            i2 = n;
            if (paramInt1 == i2) {
              break;
            }
          }
          i3 += -1;
        }
        if (i3 < 0)
        {
          i2 = 0;
          localObject2 = null;
          break;
        }
        i2 = paramInt2 & 0x1;
        if (i2 != 0)
        {
          i3 += -1;
          while (i3 >= 0)
          {
            localObject2 = (c)h.get(i3);
            if (paramString != null)
            {
              str = l;
              bool2 = paramString.equals(str);
              if (bool2) {}
            }
            else
            {
              if (paramInt1 < 0) {
                break;
              }
              i2 = n;
              if (paramInt1 != i2) {
                break;
              }
            }
            i3 += -1;
          }
        }
        i2 = i3;
      }
      localArrayList = h;
      int i3 = localArrayList.size() + -1;
      if (i2 == i3)
      {
        i2 = 0;
        localObject2 = null;
        break;
      }
      localArrayList = h;
      i3 = localArrayList.size() + -1;
      while (i3 > i2)
      {
        localObject1 = h.remove(i3);
        paramArrayList1.add(localObject1);
        localObject1 = Boolean.valueOf(i1);
        paramArrayList2.add(localObject1);
        i3 += -1;
      }
    }
  }
  
  public final i b(String paramString)
  {
    Object localObject1 = e;
    int i1;
    int i2;
    Object localObject2;
    if ((localObject1 != null) && (paramString != null))
    {
      localObject1 = e;
      i1 = ((ArrayList)localObject1).size() + -1;
      i2 = i1;
      if (i2 >= 0)
      {
        localObject1 = (i)e.get(i2);
        if (localObject1 != null)
        {
          localObject2 = o;
          boolean bool = paramString.equals(localObject2);
          if (bool) {
            label69:
            if (localObject1 == null) {
              break label105;
            }
          }
        }
      }
    }
    for (;;)
    {
      return (i)localObject1;
      localObject2 = B;
      if (localObject2 != null)
      {
        localObject1 = B.b(paramString);
        break label69;
      }
      i1 = 0;
      localObject1 = null;
      break label69;
      label105:
      i1 = i2 + -1;
      i2 = i1;
      break;
      i1 = 0;
      localObject1 = null;
    }
  }
  
  final void b(i parami)
  {
    int i1 = n;
    if (i1 >= 0) {
      return;
    }
    Object localObject1 = g;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = g;
      i1 = ((ArrayList)localObject1).size();
      if (i1 > 0) {}
    }
    else
    {
      localObject1 = e;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        e = ((ArrayList)localObject1);
      }
      i1 = e.size();
      localObject2 = p;
      parami.a(i1, (i)localObject2);
      localObject1 = e;
      ((ArrayList)localObject1).add(parami);
    }
    for (;;)
    {
      boolean bool = a;
      if (!bool) {
        break;
      }
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      String str = "Allocated fragment index ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = parami;
      Log.v((String)localObject1, (String)localObject2);
      break;
      localObject1 = g;
      int i3 = g.size() + -1;
      int i2 = ((Integer)((ArrayList)localObject1).remove(i3)).intValue();
      localObject2 = p;
      parami.a(i2, (i)localObject2);
      localObject1 = e;
      i3 = n;
      ((ArrayList)localObject1).set(i3, parami);
    }
  }
  
  public final void b(Menu paramMenu)
  {
    Object localObject = f;
    if (localObject != null)
    {
      int i1 = 0;
      localObject = null;
      for (int i2 = 0;; i2 = i1)
      {
        localObject = f;
        i1 = ((ArrayList)localObject).size();
        if (i2 >= i1) {
          break;
        }
        localObject = (i)f.get(i2);
        if (localObject != null)
        {
          boolean bool = H;
          if (!bool)
          {
            o localo = B;
            if (localo != null)
            {
              localObject = B;
              ((o)localObject).b(paramMenu);
            }
          }
        }
        i1 = i2 + 1;
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    Object localObject = f;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = f;
      int i1 = ((ArrayList)localObject).size() + -1;
      for (int i2 = i1; i2 >= 0; i2 = i1)
      {
        localObject = (i)f.get(i2);
        if (localObject != null)
        {
          o localo = B;
          if (localo != null)
          {
            localObject = B;
            ((o)localObject).b(paramBoolean);
          }
        }
        i1 = i2 + -1;
      }
    }
  }
  
  public final boolean b()
  {
    r();
    return p();
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject = f;
    if (localObject != null) {}
    label113:
    label122:
    int i3;
    for (int i1 = 0;; i1 = i3)
    {
      localObject = f;
      int i2 = ((ArrayList)localObject).size();
      boolean bool3;
      if (i1 < i2)
      {
        localObject = (i)f.get(i1);
        if (localObject == null) {
          break label122;
        }
        boolean bool4 = H;
        if (bool4) {
          break label113;
        }
        o localo = B;
        if (localo == null) {
          break label113;
        }
        localObject = B;
        bool3 = ((o)localObject).b(paramMenuItem);
        if (!bool3) {
          break label113;
        }
        bool3 = bool1;
      }
      while (bool3)
      {
        bool2 = bool1;
        return bool2;
        bool3 = false;
        localObject = null;
      }
      i3 = i1 + 1;
    }
  }
  
  public final void c(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("remove: ");
      localObject2 = ((StringBuilder)localObject2).append(parami);
      String str = " nesting=";
      localObject2 = ((StringBuilder)localObject2).append(str);
      int i1 = y;
      localObject2 = i1;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool2 = parami.f();
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      boolean bool3 = I;
      if ((!bool3) || (bool2))
      {
        localObject1 = f;
        if (localObject1 != null)
        {
          localObject1 = f;
          ((ArrayList)localObject1).remove(parami);
        }
        bool2 = L;
        if (bool2)
        {
          bool2 = M;
          if (bool2) {
            r = bool1;
          }
        }
        t = false;
        u = bool1;
      }
      return;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public final boolean c()
  {
    boolean bool1 = true;
    t();
    boolean bool2 = false;
    ArrayList localArrayList1 = null;
    for (;;)
    {
      ArrayList localArrayList2 = w;
      ArrayList localArrayList3 = x;
      boolean bool3 = c(localArrayList2, localArrayList3);
      if (bool3)
      {
        d = bool1;
        try
        {
          localArrayList1 = w;
          localArrayList2 = x;
          b(localArrayList1, localArrayList2);
          u();
          bool2 = bool1;
        }
        finally
        {
          u();
        }
      }
    }
    v();
    return bool2;
  }
  
  final void d()
  {
    ArrayList localArrayList1 = l;
    if (localArrayList1 != null)
    {
      int i1 = 0;
      localArrayList1 = null;
      for (;;)
      {
        ArrayList localArrayList2 = l;
        int i2 = localArrayList2.size();
        if (i1 >= i2) {
          break;
        }
        localArrayList2 = l;
        localArrayList2.get(i1);
        i1 += 1;
      }
    }
  }
  
  final p e()
  {
    int i1 = 1;
    p localp = null;
    Object localObject1 = e;
    int i2;
    int i3;
    Object localObject2;
    int i4;
    ArrayList localArrayList;
    int i5;
    if (localObject1 != null)
    {
      i2 = 0;
      i3 = 0;
      localObject2 = null;
      i4 = 0;
      localArrayList = null;
      localObject1 = e;
      i5 = ((ArrayList)localObject1).size();
      if (i2 >= i5) {
        break label317;
      }
      localObject1 = (i)e.get(i2);
      if (localObject1 != null)
      {
        boolean bool1 = J;
        Object localObject3;
        if (bool1)
        {
          if (localArrayList == null)
          {
            localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
          }
          localArrayList.add(localObject1);
          K = i1;
          localObject3 = q;
          if (localObject3 == null) {
            break label250;
          }
          localObject3 = q;
        }
        label250:
        int i7;
        for (int i6 = n;; i7 = -1)
        {
          r = i6;
          boolean bool2 = a;
          if (bool2)
          {
            localObject3 = "FragmentManager";
            Object localObject4 = new java/lang/StringBuilder;
            String str = "retainNonConfig: keeping retained ";
            ((StringBuilder)localObject4).<init>(str);
            localObject4 = localObject1;
            Log.v((String)localObject3, (String)localObject4);
          }
          localObject3 = B;
          if (localObject3 == null) {
            break label344;
          }
          localObject1 = B;
          localObject3 = ((o)localObject1).e();
          if (localObject3 == null) {
            break label344;
          }
          if (localObject2 != null) {
            break;
          }
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          i3 = 0;
          localObject2 = null;
          while (i3 < i2)
          {
            ((ArrayList)localObject1).add(null);
            i3 += 1;
          }
        }
        localObject1 = localObject2;
        ((ArrayList)localObject1).add(localObject3);
        localObject2 = localObject1;
        i5 = i1;
      }
    }
    for (;;)
    {
      if ((localObject2 != null) && (i5 == 0)) {
        ((ArrayList)localObject2).add(null);
      }
      localObject1 = localArrayList;
      i4 = i2 + 1;
      i2 = i4;
      break;
      i3 = 0;
      localObject2 = null;
      i4 = 0;
      localArrayList = null;
      label317:
      if ((localArrayList == null) && (localObject2 == null)) {}
      for (;;)
      {
        return localp;
        localp = new android/support/v4/b/p;
        localp.<init>(localArrayList, (List)localObject2);
      }
      label344:
      i5 = 0;
      localObject1 = null;
    }
  }
  
  final Parcelable f()
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = null;
    int i2 = 0;
    Object localObject2 = B;
    if (localObject2 != null) {
      for (;;)
      {
        localObject2 = B;
        boolean bool1 = ((ArrayList)localObject2).isEmpty();
        if (bool1) {
          break;
        }
        localObject2 = (o.e)B.remove(0);
        ((o.e)localObject2).c();
      }
    }
    localObject2 = e;
    int i7;
    Object localObject3;
    if (localObject2 == null)
    {
      i7 = 0;
      localObject3 = null;
    }
    int i8;
    Object localObject4;
    Object localObject6;
    for (;;)
    {
      i8 = 0;
      localObject4 = null;
      while (i8 < i7)
      {
        localObject2 = e;
        localObject5 = (i)((ArrayList)localObject2).get(i8);
        if (localObject5 != null)
        {
          localObject2 = ((i)localObject5).A();
          if (localObject2 != null)
          {
            i9 = ((i)localObject5).B();
            localObject2 = ((i)localObject5).A();
            ((i)localObject5).a(null);
            localObject2 = ((View)localObject2).getAnimation();
            if (localObject2 != null) {
              ((Animation)localObject2).cancel();
            }
            localObject2 = this;
            i10 = 0;
            localObject6 = null;
            arrayOfr = null;
            a((i)localObject5, i9, 0, 0, false);
          }
        }
        i3 = i8 + 1;
        i8 = i3;
      }
      localObject2 = e;
      int i3 = ((ArrayList)localObject2).size();
      i7 = i3;
    }
    c();
    boolean bool2 = b;
    if (bool2) {
      s = i1;
    }
    localObject2 = e;
    int i4;
    if (localObject2 != null)
    {
      localObject2 = e;
      i4 = ((ArrayList)localObject2).size();
      if (i4 > 0) {}
    }
    else
    {
      return (Parcelable)localObject1;
    }
    localObject2 = e;
    int i10 = ((ArrayList)localObject2).size();
    r[] arrayOfr = new r[i10];
    int i9 = 0;
    int i11 = 0;
    Object localObject5 = null;
    float f2 = 0.0F;
    label301:
    if (i9 < i10)
    {
      localObject2 = (i)e.get(i9);
      if (localObject2 == null) {
        break label1543;
      }
      i11 = n;
      if (i11 < 0)
      {
        localObject5 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Failure saving state: active ");
        localObject3 = ((StringBuilder)localObject3).append(localObject2);
        localObject4 = " has cleared index: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        i8 = n;
        localObject3 = i8;
        ((IllegalStateException)localObject5).<init>((String)localObject3);
        a((RuntimeException)localObject5);
      }
      localObject3 = new android/support/v4/b/r;
      ((r)localObject3).<init>((i)localObject2);
      arrayOfr[i9] = localObject3;
      i11 = k;
      if (i11 > 0)
      {
        localObject5 = k;
        if (localObject5 == null)
        {
          localObject5 = z;
          if (localObject5 == null)
          {
            localObject5 = new android/os/Bundle;
            ((Bundle)localObject5).<init>();
            z = ((Bundle)localObject5);
          }
          localObject5 = z;
          ((i)localObject2).f((Bundle)localObject5);
          localObject5 = z;
          c((i)localObject2, (Bundle)localObject5, false);
          localObject5 = z;
          boolean bool7 = ((Bundle)localObject5).isEmpty();
          if (bool7) {
            break label1554;
          }
          localObject5 = z;
          z = null;
        }
      }
    }
    for (;;)
    {
      localObject4 = P;
      if (localObject4 != null) {
        i((i)localObject2);
      }
      localObject4 = m;
      Object localObject7;
      if (localObject4 != null)
      {
        if (localObject5 == null)
        {
          localObject5 = new android/os/Bundle;
          ((Bundle)localObject5).<init>();
        }
        localObject4 = "android:view_state";
        localObject7 = m;
        ((Bundle)localObject5).putSparseParcelableArray((String)localObject4, (SparseArray)localObject7);
      }
      boolean bool6 = S;
      if (!bool6)
      {
        if (localObject5 == null)
        {
          localObject5 = new android/os/Bundle;
          ((Bundle)localObject5).<init>();
        }
        localObject4 = "android:user_visible_hint";
        boolean bool9 = S;
        ((Bundle)localObject5).putBoolean((String)localObject4, bool9);
      }
      k = ((Bundle)localObject5);
      localObject5 = q;
      if (localObject5 != null)
      {
        localObject5 = q;
        int i12 = n;
        if (i12 < 0)
        {
          localObject5 = new java/lang/IllegalStateException;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("Failure saving state: ");
          localObject4 = ((StringBuilder)localObject4).append(localObject2).append(" has target not in fragment manager: ");
          localObject7 = q;
          localObject4 = localObject7;
          ((IllegalStateException)localObject5).<init>((String)localObject4);
          a((RuntimeException)localObject5);
        }
        localObject5 = k;
        if (localObject5 == null)
        {
          localObject5 = new android/os/Bundle;
          ((Bundle)localObject5).<init>();
          k = ((Bundle)localObject5);
        }
        localObject5 = k;
        localObject4 = "android:target_state";
        localObject7 = q;
        int i14 = n;
        if (i14 < 0)
        {
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          Object localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>("Fragment ");
          localObject8 = ((StringBuilder)localObject8).append(localObject7);
          String str = " is not currently in the FragmentManager";
          localObject8 = str;
          localIllegalStateException.<init>((String)localObject8);
          a(localIllegalStateException);
        }
        int i13 = n;
        ((Bundle)localObject5).putInt((String)localObject4, i13);
        i12 = s;
        if (i12 != 0)
        {
          localObject5 = k;
          localObject4 = "android:target_req_state";
          i13 = s;
          ((Bundle)localObject5).putInt((String)localObject4, i13);
        }
      }
      label929:
      boolean bool8 = a;
      if (bool8)
      {
        localObject5 = "FragmentManager";
        localObject4 = new java/lang/StringBuilder;
        localObject7 = "Saved state of ";
        ((StringBuilder)localObject4).<init>((String)localObject7);
        localObject2 = ((StringBuilder)localObject4).append(localObject2);
        localObject4 = ": ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject3 = k;
        localObject2 = localObject3;
        Log.v((String)localObject5, (String)localObject2);
      }
      i4 = i1;
      for (float f3 = f1;; f3 = f2)
      {
        i9 += 1;
        bool8 = i4;
        f2 = f3;
        break label301;
        localObject5 = l;
        k = ((Bundle)localObject5);
        break label929;
        if (!bool8)
        {
          boolean bool3 = a;
          if (!bool3) {
            break;
          }
          localObject2 = "FragmentManager";
          localObject5 = "saveAllState: no fragments!";
          Log.v((String)localObject2, (String)localObject5);
          break;
        }
        localObject2 = f;
        if (localObject2 != null)
        {
          localObject2 = f;
          i10 = ((ArrayList)localObject2).size();
          if (i10 > 0)
          {
            localObject5 = new int[i10];
            int i6;
            for (i9 = 0; i9 < i10; i9 = i6)
            {
              localObject2 = (i)f.get(i9);
              int i5 = n;
              localObject5[i9] = i5;
              i5 = localObject5[i9];
              Object localObject9;
              if (i5 < 0)
              {
                localObject2 = new java/lang/IllegalStateException;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>("Failure saving state: active ");
                localObject9 = f.get(i9);
                localObject3 = ((StringBuilder)localObject3).append(localObject9);
                localObject9 = " has cleared index: ";
                localObject3 = ((StringBuilder)localObject3).append((String)localObject9);
                i1 = localObject5[i9];
                localObject3 = i1;
                ((IllegalStateException)localObject2).<init>((String)localObject3);
                a((RuntimeException)localObject2);
              }
              boolean bool4 = a;
              if (bool4)
              {
                localObject2 = "FragmentManager";
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>("saveAllState: adding fragment #");
                localObject3 = ((StringBuilder)localObject3).append(i9).append(": ");
                localObject9 = f.get(i9);
                localObject3 = localObject9;
                Log.v((String)localObject2, (String)localObject3);
              }
              i6 = i9 + 1;
            }
          }
        }
        bool8 = false;
        localObject5 = null;
        f2 = 0.0F;
        localObject2 = h;
        if (localObject2 != null)
        {
          localObject2 = h;
          i9 = ((ArrayList)localObject2).size();
          if (i9 > 0)
          {
            localObject1 = new d[i9];
            while (i2 < i9)
            {
              localObject6 = new android/support/v4/b/d;
              localObject2 = (c)h.get(i2);
              ((d)localObject6).<init>((c)localObject2);
              localObject1[i2] = localObject6;
              bool5 = a;
              if (bool5)
              {
                localObject2 = "FragmentManager";
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>("saveAllState: adding back stack #");
                localObject6 = ((StringBuilder)localObject6).append(i2).append(": ");
                localObject3 = h.get(i2);
                localObject6 = localObject3;
                Log.v((String)localObject2, (String)localObject6);
              }
              i2 += 1;
            }
          }
        }
        localObject2 = new android/support/v4/b/q;
        ((q)localObject2).<init>();
        a = arrayOfr;
        b = ((int[])localObject5);
        c = ((d[])localObject1);
        localObject1 = localObject2;
        break;
        label1543:
        boolean bool5 = bool8;
      }
      label1554:
      bool8 = false;
      localObject5 = null;
      f2 = 0.0F;
    }
  }
  
  public final void f(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      str = "detach: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = parami;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool2 = I;
    if (!bool2)
    {
      I = bool1;
      bool2 = t;
      if (bool2)
      {
        localObject1 = f;
        if (localObject1 != null)
        {
          bool2 = a;
          if (bool2)
          {
            localObject1 = "FragmentManager";
            localObject2 = new java/lang/StringBuilder;
            str = "remove from detach: ";
            ((StringBuilder)localObject2).<init>(str);
            localObject2 = parami;
            Log.v((String)localObject1, (String)localObject2);
          }
          localObject1 = f;
          ((ArrayList)localObject1).remove(parami);
        }
        bool2 = L;
        if (bool2)
        {
          bool2 = M;
          if (bool2) {
            r = bool1;
          }
        }
        bool2 = false;
        localObject1 = null;
        t = false;
      }
    }
  }
  
  public final void g()
  {
    int i1 = 1;
    s = false;
    d = i1;
    a(i1, false);
    d = false;
  }
  
  public final void g(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    Object localObject2;
    String str;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      str = "attach: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = parami;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool2 = I;
    if (bool2)
    {
      localObject1 = null;
      I = false;
      bool2 = t;
      if (!bool2)
      {
        localObject1 = f;
        if (localObject1 == null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          f = ((ArrayList)localObject1);
        }
        localObject1 = f;
        bool2 = ((ArrayList)localObject1).contains(parami);
        if (bool2)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Fragment already added: ");
          localObject2 = parami;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        bool2 = a;
        if (bool2)
        {
          localObject1 = "FragmentManager";
          localObject2 = new java/lang/StringBuilder;
          str = "add from attach: ";
          ((StringBuilder)localObject2).<init>(str);
          localObject2 = parami;
          Log.v((String)localObject1, (String)localObject2);
        }
        localObject1 = f;
        ((ArrayList)localObject1).add(parami);
        t = bool1;
        bool2 = L;
        if (bool2)
        {
          bool2 = M;
          if (bool2) {
            r = bool1;
          }
        }
      }
    }
  }
  
  public final void h()
  {
    s = false;
    d = true;
    a(2, false);
    d = false;
  }
  
  public final void i()
  {
    s = false;
    d = true;
    a(4, false);
    d = false;
  }
  
  public final void j()
  {
    s = false;
    d = true;
    a(5, false);
    d = false;
  }
  
  public final void k()
  {
    d = true;
    a(4, false);
    d = false;
  }
  
  public final void l()
  {
    boolean bool = true;
    s = bool;
    d = bool;
    a(3, false);
    d = false;
  }
  
  public final void m()
  {
    d = true;
    a(2, false);
    d = false;
  }
  
  public final void n()
  {
    boolean bool = true;
    t = bool;
    c();
    d = bool;
    a(0, false);
    d = false;
    n = null;
    o = null;
    p = null;
  }
  
  public final void o()
  {
    Object localObject = f;
    if (localObject != null)
    {
      int i1 = 0;
      localObject = null;
      for (int i2 = 0;; i2 = i1)
      {
        localObject = f;
        i1 = ((ArrayList)localObject).size();
        if (i2 >= i1) {
          break;
        }
        localObject = (i)f.get(i2);
        if (localObject != null)
        {
          ((i)localObject).onLowMemory();
          o localo = B;
          if (localo != null)
          {
            localObject = B;
            ((o)localObject).o();
          }
        }
        i1 = i2 + 1;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("FragmentManager{");
    int i1 = System.identityHashCode(this);
    Object localObject = Integer.toHexString(i1);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" in ");
    localObject = p;
    if (localObject != null)
    {
      localObject = p;
      android.support.v4.g.d.a(localObject, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      localObject = n;
      android.support.v4.g.d.a(localObject, localStringBuilder);
    }
  }
}


/* Location:              android/support/v4/b/o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */