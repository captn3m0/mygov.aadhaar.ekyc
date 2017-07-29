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
import android.support.v4.f.a;
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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class o
  extends n
  implements android.support.v4.h.k
{
  static final Interpolator D = new DecelerateInterpolator(2.5F);
  static final Interpolator E = new DecelerateInterpolator(1.5F);
  static final Interpolator F = new AccelerateInterpolator(2.5F);
  static final Interpolator G = new AccelerateInterpolator(1.5F);
  static boolean a;
  static final boolean b;
  static Field q;
  SparseArray<Parcelable> A = null;
  ArrayList<e> B;
  Runnable C = new Runnable()
  {
    public final void run()
    {
      c();
    }
  };
  private CopyOnWriteArrayList<android.support.v4.g.i<Object, Boolean>> H;
  ArrayList<c> c;
  boolean d;
  ArrayList<i> e;
  ArrayList<i> f;
  ArrayList<Integer> g;
  ArrayList<c> h;
  ArrayList<i> i;
  ArrayList<c> j;
  ArrayList<Integer> k;
  ArrayList<Object> l;
  int m = 0;
  m n;
  k o;
  i p;
  boolean r;
  boolean s;
  boolean t;
  String u;
  boolean v;
  ArrayList<c> w;
  ArrayList<Boolean> x;
  ArrayList<i> y;
  Bundle z = null;
  
  static
  {
    boolean bool = false;
    a = false;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = true;
    }
    b = bool;
    q = null;
  }
  
  private int a(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, b<i> paramb)
  {
    int i2 = paramInt2 - 1;
    int i1 = paramInt2;
    c localc;
    int i3;
    if (i2 >= paramInt1)
    {
      localc = (c)paramArrayList.get(i2);
      boolean bool = ((Boolean)paramArrayList1.get(i2)).booleanValue();
      i3 = 0;
      label44:
      if (i3 < c.size()) {
        if (c.b((c.a)c.get(i3)))
        {
          i3 = 1;
          label79:
          if ((i3 == 0) || (localc.a(paramArrayList, i2 + 1, paramInt2))) {
            break label223;
          }
          i3 = 1;
          label102:
          if (i3 == 0) {
            break label241;
          }
          if (B == null) {
            B = new ArrayList();
          }
          e locale = new e(localc, bool);
          B.add(locale);
          localc.a(locale);
          if (!bool) {
            break label229;
          }
          localc.c();
          label165:
          i1 -= 1;
          if (i2 != i1)
          {
            paramArrayList.remove(i2);
            paramArrayList.add(i1, localc);
          }
          b(paramb);
        }
      }
    }
    label223:
    label229:
    label241:
    for (;;)
    {
      i2 -= 1;
      break;
      i3 += 1;
      break label44;
      i3 = 0;
      break label79;
      i3 = 0;
      break label102;
      localc.a(false);
      break label165;
      return i1;
    }
  }
  
  private i a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    if (i1 == -1) {
      paramBundle = null;
    }
    i locali;
    do
    {
      return paramBundle;
      if (i1 >= e.size()) {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      }
      locali = (i)e.get(i1);
      paramBundle = locali;
    } while (locali != null);
    a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
    return locali;
  }
  
  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(E);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(D);
    ((ScaleAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(E);
    ((AlphaAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private Animation a(i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    parami.v();
    i.l();
    if (parami.v() != 0)
    {
      parami = AnimationUtils.loadAnimation(n.c, parami.v());
      if (parami != null) {
        return parami;
      }
    }
    if (paramInt1 == 0) {
      return null;
    }
    int i1 = -1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = i1;
    }
    while (paramInt1 < 0)
    {
      return null;
      if (paramBoolean)
      {
        paramInt1 = 1;
      }
      else
      {
        paramInt1 = 2;
        continue;
        if (paramBoolean)
        {
          paramInt1 = 3;
        }
        else
        {
          paramInt1 = 4;
          continue;
          if (paramBoolean) {
            paramInt1 = 5;
          } else {
            paramInt1 = 6;
          }
        }
      }
    }
    switch (paramInt1)
    {
    default: 
      paramInt1 = paramInt2;
      if (paramInt2 == 0)
      {
        paramInt1 = paramInt2;
        if (n.e()) {
          paramInt1 = n.f();
        }
      }
      if (paramInt1 == 0) {
        return null;
      }
      break;
    case 1: 
      return a(1.125F, 1.0F, 0.0F, 1.0F);
    case 2: 
      return a(1.0F, 0.975F, 1.0F, 0.0F);
    case 3: 
      return a(0.975F, 1.0F, 0.0F, 1.0F);
    case 4: 
      return a(1.0F, 1.075F, 1.0F, 0.0F);
    case 5: 
      return a(0.0F, 1.0F);
    case 6: 
      return a(1.0F, 0.0F);
    }
    return null;
  }
  
  /* Error */
  private void a(int paramInt, c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 285	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   6: ifnonnull +14 -> 20
    //   9: aload_0
    //   10: new 127	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 156	java/util/ArrayList:<init>	()V
    //   17: putfield 285	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   20: aload_0
    //   21: getfield 285	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   24: invokevirtual 145	java/util/ArrayList:size	()I
    //   27: istore 4
    //   29: iload 4
    //   31: istore_3
    //   32: iload_1
    //   33: iload 4
    //   35: if_icmpge +56 -> 91
    //   38: getstatic 82	android/support/v4/b/o:a	Z
    //   41: ifeq +37 -> 78
    //   44: ldc_w 287
    //   47: new 195	java/lang/StringBuilder
    //   50: dup
    //   51: ldc_w 289
    //   54: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   57: iload_1
    //   58: invokevirtual 209	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   61: ldc_w 291
    //   64: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_2
    //   68: invokevirtual 294	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 213	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 299	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   77: pop
    //   78: aload_0
    //   79: getfield 285	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   82: iload_1
    //   83: aload_2
    //   84: invokevirtual 303	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   87: pop
    //   88: aload_0
    //   89: monitorexit
    //   90: return
    //   91: iload_3
    //   92: iload_1
    //   93: if_icmpge +79 -> 172
    //   96: aload_0
    //   97: getfield 285	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   100: aconst_null
    //   101: invokevirtual 163	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   104: pop
    //   105: aload_0
    //   106: getfield 305	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   109: ifnonnull +14 -> 123
    //   112: aload_0
    //   113: new 127	java/util/ArrayList
    //   116: dup
    //   117: invokespecial 156	java/util/ArrayList:<init>	()V
    //   120: putfield 305	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   123: getstatic 82	android/support/v4/b/o:a	Z
    //   126: ifeq +27 -> 153
    //   129: ldc_w 287
    //   132: new 195	java/lang/StringBuilder
    //   135: dup
    //   136: ldc_w 307
    //   139: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   142: iload_3
    //   143: invokevirtual 209	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   146: invokevirtual 213	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   149: invokestatic 299	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   152: pop
    //   153: aload_0
    //   154: getfield 305	android/support/v4/b/o:k	Ljava/util/ArrayList;
    //   157: iload_3
    //   158: invokestatic 313	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   161: invokevirtual 163	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   164: pop
    //   165: iload_3
    //   166: iconst_1
    //   167: iadd
    //   168: istore_3
    //   169: goto -78 -> 91
    //   172: getstatic 82	android/support/v4/b/o:a	Z
    //   175: ifeq +37 -> 212
    //   178: ldc_w 287
    //   181: new 195	java/lang/StringBuilder
    //   184: dup
    //   185: ldc_w 315
    //   188: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: iload_1
    //   192: invokevirtual 209	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   195: ldc_w 317
    //   198: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: aload_2
    //   202: invokevirtual 294	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 213	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: invokestatic 299	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   211: pop
    //   212: aload_0
    //   213: getfield 285	android/support/v4/b/o:j	Ljava/util/ArrayList;
    //   216: aload_2
    //   217: invokevirtual 163	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   220: pop
    //   221: goto -133 -> 88
    //   224: astore_2
    //   225: aload_0
    //   226: monitorexit
    //   227: aload_2
    //   228: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	o
    //   0	229	1	paramInt	int
    //   0	229	2	paramc	c
    //   31	138	3	i1	int
    //   27	9	4	i2	int
    // Exception table:
    //   from	to	target	type
    //   2	20	224	finally
    //   20	29	224	finally
    //   38	78	224	finally
    //   78	88	224	finally
    //   88	90	224	finally
    //   96	123	224	finally
    //   123	153	224	finally
    //   153	165	224	finally
    //   172	212	224	finally
    //   212	221	224	finally
    //   225	227	224	finally
  }
  
  private void a(i parami, Context paramContext, boolean paramBoolean)
  {
    if (p != null)
    {
      o localo = p.z;
      if ((localo instanceof o)) {
        ((o)localo).a(parami, paramContext, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        paramContext = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void a(i parami, Bundle paramBundle, boolean paramBoolean)
  {
    if (p != null)
    {
      o localo = p.z;
      if ((localo instanceof o)) {
        ((o)localo).a(parami, paramBundle, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        paramBundle = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void a(i parami, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    if (p != null)
    {
      o localo = p.z;
      if ((localo instanceof o)) {
        ((o)localo).a(parami, paramView, paramBundle, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        paramView = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private static void a(b<i> paramb)
  {
    int i2 = paramb.size();
    int i1 = 0;
    if (i1 < i2)
    {
      i locali = (i)g[i1];
      View localView;
      if (!t)
      {
        localView = P;
        if (Build.VERSION.SDK_INT >= 11) {
          break label58;
        }
        P.setVisibility(4);
      }
      for (;;)
      {
        i1 += 1;
        break;
        label58:
        Z = localView.getAlpha();
        localView.setAlpha(0.0F);
      }
    }
  }
  
  private static void a(View paramView, Animation paramAnimation)
  {
    int i3 = 0;
    if ((paramView == null) || (paramAnimation == null)) {
      return;
    }
    int i2 = i3;
    int i1;
    if (Build.VERSION.SDK_INT >= 19)
    {
      i2 = i3;
      if (android.support.v4.h.w.f(paramView) == 0)
      {
        i2 = i3;
        if (android.support.v4.h.w.A(paramView))
        {
          if (!(paramAnimation instanceof AlphaAnimation)) {
            break label126;
          }
          i1 = 1;
        }
      }
    }
    for (;;)
    {
      i2 = i3;
      if (i1 != 0) {
        i2 = 1;
      }
      if (i2 == 0) {
        break;
      }
      try
      {
        if (q == null)
        {
          localObject1 = Animation.class.getDeclaredField("mListener");
          q = (Field)localObject1;
          ((Field)localObject1).setAccessible(true);
        }
        localObject1 = (Animation.AnimationListener)q.get(paramAnimation);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          Object localObject1;
          Log.e("FragmentManager", "No field with the name mListener is found in Animation class", localNoSuchFieldException);
          Object localObject2 = null;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          Log.e("FragmentManager", "Cannot access Animation's mListener field", localIllegalAccessException);
          Object localObject3 = null;
        }
      }
      android.support.v4.h.w.d(paramView, 2);
      paramAnimation.setAnimationListener(new a(paramView, paramAnimation, (Animation.AnimationListener)localObject1));
      return;
      label126:
      if ((paramAnimation instanceof AnimationSet))
      {
        localObject1 = ((AnimationSet)paramAnimation).getAnimations();
        i1 = 0;
        for (;;)
        {
          if (i1 >= ((List)localObject1).size()) {
            break label181;
          }
          if ((((List)localObject1).get(i1) instanceof AlphaAnimation))
          {
            i1 = 1;
            break;
          }
          i1 += 1;
        }
      }
      label181:
      i1 = 0;
    }
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
    if (n != null) {}
    for (;;)
    {
      try
      {
        n.a("  ", localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
        continue;
      }
      try
      {
        a("  ", null, localException1, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
  }
  
  private void a(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    int i1;
    int i2;
    label12:
    e locale;
    int i3;
    if (B == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1) {
        return;
      }
      locale = (e)B.get(i2);
      if ((paramArrayList == null) || (a)) {
        break label101;
      }
      i3 = paramArrayList.indexOf(b);
      if ((i3 == -1) || (!((Boolean)paramArrayList1.get(i3)).booleanValue())) {
        break label101;
      }
      locale.d();
    }
    for (;;)
    {
      i2 += 1;
      break label12;
      i1 = B.size();
      break;
      label101:
      if (c == 0) {}
      int i4;
      for (i3 = 1;; i3 = 0)
      {
        if (i3 == 0)
        {
          i4 = i2;
          i3 = i1;
          if (paramArrayList == null) {
            break label240;
          }
          i4 = i2;
          i3 = i1;
          if (!b.a(paramArrayList, 0, paramArrayList.size())) {
            break label240;
          }
        }
        B.remove(i2);
        i4 = i2 - 1;
        i3 = i1 - 1;
        if ((paramArrayList == null) || (a)) {
          break label235;
        }
        i1 = paramArrayList.indexOf(b);
        if ((i1 == -1) || (!((Boolean)paramArrayList1.get(i1)).booleanValue())) {
          break label235;
        }
        locale.d();
        i2 = i4;
        i1 = i3;
        break;
      }
      label235:
      locale.c();
      label240:
      i2 = i4;
      i1 = i3;
    }
  }
  
  private void a(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    boolean bool = getu;
    int i2;
    label56:
    Object localObject;
    if (y == null)
    {
      y = new ArrayList();
      if (f != null) {
        y.addAll(f);
      }
      i2 = paramInt1;
      i1 = 0;
      if (i2 >= paramInt2) {
        break label151;
      }
      localObject = (c)paramArrayList.get(i2);
      if (((Boolean)paramArrayList1.get(i2)).booleanValue()) {
        break label133;
      }
      ((c)localObject).a(y);
      label98:
      if ((i1 == 0) && (!j)) {
        break label145;
      }
    }
    label133:
    label145:
    for (int i1 = 1;; i1 = 0)
    {
      i2 += 1;
      break label56;
      y.clear();
      break;
      ((c)localObject).b(y);
      break label98;
    }
    label151:
    y.clear();
    if (!bool) {
      t.a(this, paramArrayList, paramArrayList1, paramInt1, paramInt2, false);
    }
    b(paramArrayList, paramArrayList1, paramInt1, paramInt2);
    int i3;
    if (bool)
    {
      localObject = new b();
      b((b)localObject);
      i3 = a(paramArrayList, paramArrayList1, paramInt1, paramInt2, (b)localObject);
      a((b)localObject);
    }
    for (;;)
    {
      i2 = paramInt1;
      if (i3 != paramInt1)
      {
        i2 = paramInt1;
        if (bool)
        {
          t.a(this, paramArrayList, paramArrayList1, paramInt1, i3, true);
          a(m, true);
          i2 = paramInt1;
        }
      }
      while (i2 < paramInt2)
      {
        localObject = (c)paramArrayList.get(i2);
        if ((((Boolean)paramArrayList1.get(i2)).booleanValue()) && (n >= 0)) {
          paramInt1 = n;
        }
        try
        {
          j.set(paramInt1, null);
          if (k == null) {
            k = new ArrayList();
          }
          if (a) {
            Log.v("FragmentManager", "Freeing back stack index " + paramInt1);
          }
          k.add(Integer.valueOf(paramInt1));
          n = -1;
          i2 += 1;
        }
        finally {}
      }
      if (i1 != 0) {
        d();
      }
      return;
      i3 = paramInt2;
    }
  }
  
  public static int b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 4097: 
      return 8194;
    case 8194: 
      return 4097;
    }
    return 4099;
  }
  
  private void b(i parami, Context paramContext, boolean paramBoolean)
  {
    if (p != null)
    {
      o localo = p.z;
      if ((localo instanceof o)) {
        ((o)localo).b(parami, paramContext, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        paramContext = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void b(i parami, Bundle paramBundle, boolean paramBoolean)
  {
    if (p != null)
    {
      o localo = p.z;
      if ((localo instanceof o)) {
        ((o)localo).b(parami, paramBundle, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        paramBundle = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void b(i parami, boolean paramBoolean)
  {
    Object localObject;
    if (p != null)
    {
      localObject = p.z;
      if ((localObject instanceof o)) {
        ((o)localObject).b(parami, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        localObject = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void b(b<i> paramb)
  {
    if (m <= 0) {
      return;
    }
    int i3 = Math.min(m, 4);
    if (f == null) {}
    for (int i1 = 0;; i1 = f.size())
    {
      int i2 = 0;
      while (i2 < i1)
      {
        i locali = (i)f.get(i2);
        if (k < i3)
        {
          a(locali, i3, locali.v(), locali.w(), false);
          if ((P != null) && (!H) && (X)) {
            paramb.add(locali);
          }
        }
        i2 += 1;
      }
      break;
    }
  }
  
  private void b(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    int i1 = 0;
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return;
    }
    if ((paramArrayList1 == null) || (paramArrayList.size() != paramArrayList1.size())) {
      throw new IllegalStateException("Internal error with the back stack records");
    }
    a(paramArrayList, paramArrayList1);
    int i4 = paramArrayList.size();
    int i2 = 0;
    label55:
    if (i1 < i4)
    {
      if (getu) {
        break label220;
      }
      if (i2 != i1) {
        a(paramArrayList, paramArrayList1, i2, i1);
      }
      int i3 = i1 + 1;
      i2 = i3;
      if (((Boolean)paramArrayList1.get(i1)).booleanValue()) {
        for (;;)
        {
          i2 = i3;
          if (i3 >= i4) {
            break;
          }
          i2 = i3;
          if (!((Boolean)paramArrayList1.get(i3)).booleanValue()) {
            break;
          }
          i2 = i3;
          if (getu) {
            break;
          }
          i3 += 1;
        }
      }
      a(paramArrayList, paramArrayList1, i1, i2);
      i1 = i2;
      i3 = i2 - 1;
      i2 = i1;
      i1 = i3;
    }
    label220:
    for (;;)
    {
      i1 += 1;
      break label55;
      if (i2 == i4) {
        break;
      }
      a(paramArrayList, paramArrayList1, i2, i4);
      return;
    }
  }
  
  private static void b(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      c localc = (c)paramArrayList.get(paramInt1);
      boolean bool;
      if (((Boolean)paramArrayList1.get(paramInt1)).booleanValue())
      {
        localc.a(-1);
        if (paramInt1 == paramInt2 - 1)
        {
          bool = true;
          label45:
          localc.a(bool);
        }
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        bool = false;
        break label45;
        localc.a(1);
        localc.c();
      }
    }
  }
  
  private i c(int paramInt)
  {
    int i1;
    Object localObject;
    if (f != null)
    {
      i1 = f.size() - 1;
      while (i1 >= 0)
      {
        localObject = (i)f.get(i1);
        if ((localObject != null) && (E == paramInt)) {
          return (i)localObject;
        }
        i1 -= 1;
      }
    }
    if (e != null)
    {
      i1 = e.size() - 1;
      for (;;)
      {
        if (i1 < 0) {
          break label112;
        }
        i locali = (i)e.get(i1);
        if (locali != null)
        {
          localObject = locali;
          if (E == paramInt) {
            break;
          }
        }
        i1 -= 1;
      }
    }
    label112:
    return null;
  }
  
  private void c(i parami, Bundle paramBundle, boolean paramBoolean)
  {
    if (p != null)
    {
      o localo = p.z;
      if ((localo instanceof o)) {
        ((o)localo).c(parami, paramBundle, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        paramBundle = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void c(i parami, boolean paramBoolean)
  {
    Object localObject;
    if (p != null)
    {
      localObject = p.z;
      if ((localObject instanceof o)) {
        ((o)localObject).c(parami, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        localObject = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private boolean c(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    try
    {
      if ((c == null) || (c.size() == 0)) {
        return false;
      }
      int i2 = c.size();
      int i1 = 0;
      while (i1 < i2)
      {
        ((c)c.get(i1)).a(paramArrayList, paramArrayList1);
        i1 += 1;
      }
      c.clear();
      n.d.removeCallbacks(C);
      if (i2 > 0) {
        return true;
      }
    }
    finally {}
    return false;
  }
  
  public static void d(i parami)
  {
    boolean bool = true;
    if (a) {
      Log.v("FragmentManager", "hide: " + parami);
    }
    if (!H)
    {
      H = true;
      if (Y) {
        break label57;
      }
    }
    for (;;)
    {
      Y = bool;
      return;
      label57:
      bool = false;
    }
  }
  
  private void d(i parami, boolean paramBoolean)
  {
    Object localObject;
    if (p != null)
    {
      localObject = p.z;
      if ((localObject instanceof o)) {
        ((o)localObject).d(parami, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        localObject = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  public static void e(i parami)
  {
    boolean bool = false;
    if (a) {
      Log.v("FragmentManager", "show: " + parami);
    }
    if (H)
    {
      H = false;
      if (!Y) {
        bool = true;
      }
      Y = bool;
    }
  }
  
  private void e(i parami, boolean paramBoolean)
  {
    Object localObject;
    if (p != null)
    {
      localObject = p.z;
      if ((localObject instanceof o)) {
        ((o)localObject).e(parami, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        localObject = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void f(i parami, boolean paramBoolean)
  {
    Object localObject;
    if (p != null)
    {
      localObject = p.z;
      if ((localObject instanceof o)) {
        ((o)localObject).f(parami, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        localObject = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void g(i parami, boolean paramBoolean)
  {
    Object localObject;
    if (p != null)
    {
      localObject = p.z;
      if ((localObject instanceof o)) {
        ((o)localObject).g(parami, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        localObject = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void h(i parami)
  {
    a(parami, m, 0, 0, false);
  }
  
  private void h(i parami, boolean paramBoolean)
  {
    Object localObject;
    if (p != null)
    {
      localObject = p.z;
      if ((localObject instanceof o)) {
        ((o)localObject).h(parami, true);
      }
    }
    if (H == null) {}
    for (;;)
    {
      return;
      parami = H.iterator();
      while (parami.hasNext())
      {
        localObject = (android.support.v4.g.i)parami.next();
        if (paramBoolean) {
          ((Boolean)b).booleanValue();
        }
      }
    }
  }
  
  private void i(i parami)
  {
    if (Q == null) {
      return;
    }
    if (A == null) {
      A = new SparseArray();
    }
    for (;;)
    {
      Q.saveHierarchyState(A);
      if (A.size() <= 0) {
        break;
      }
      m = A;
      A = null;
      return;
      A.clear();
    }
  }
  
  private boolean p()
  {
    c();
    t();
    boolean bool = a(w, x, null, -1, 0);
    if (bool) {
      d = true;
    }
    try
    {
      b(w, x);
      u();
      return bool;
    }
    finally
    {
      u();
    }
  }
  
  private void q()
  {
    if (e == null) {
      return;
    }
    int i1 = 0;
    label10:
    i locali;
    if (i1 < e.size())
    {
      locali = (i)e.get(i1);
      if ((locali != null) && (R))
      {
        if (!d) {
          break label63;
        }
        v = true;
      }
    }
    for (;;)
    {
      i1 += 1;
      break label10;
      break;
      label63:
      R = false;
      a(locali, m, 0, 0, false);
    }
  }
  
  private void r()
  {
    if (s) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (u != null) {
      throw new IllegalStateException("Can not perform this action inside of " + u);
    }
  }
  
  private void s()
  {
    int i2 = 1;
    label44:
    label73:
    label92:
    label97:
    label100:
    for (;;)
    {
      int i1;
      try
      {
        if ((B == null) || (B.isEmpty())) {
          break label92;
        }
        i1 = 1;
        if ((c == null) || (c.size() != 1)) {
          break label97;
        }
      }
      finally {}
      n.d.removeCallbacks(C);
      n.d.post(C);
      return;
      for (;;)
      {
        if (i1 != 0) {
          break label100;
        }
        if (i2 == 0) {
          break label73;
        }
        break label44;
        i1 = 0;
        break;
        i2 = 0;
      }
    }
  }
  
  private void t()
  {
    if (d) {
      throw new IllegalStateException("FragmentManager is already executing transactions");
    }
    if (Looper.myLooper() != n.d.getLooper()) {
      throw new IllegalStateException("Must be called from main thread of fragment host");
    }
    if (w == null)
    {
      w = new ArrayList();
      x = new ArrayList();
    }
    d = true;
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
    if (v)
    {
      int i1 = 0;
      boolean bool2;
      for (boolean bool1 = false; i1 < e.size(); bool1 = bool2)
      {
        i locali = (i)e.get(i1);
        bool2 = bool1;
        if (locali != null)
        {
          bool2 = bool1;
          if (T != null) {
            bool2 = bool1 | T.a();
          }
        }
        i1 += 1;
      }
      if (!bool1)
      {
        v = false;
        q();
      }
    }
  }
  
  public final int a(c paramc)
  {
    try
    {
      if ((k == null) || (k.size() <= 0))
      {
        if (j == null) {
          j = new ArrayList();
        }
        i1 = j.size();
        if (a) {
          Log.v("FragmentManager", "Setting back stack index " + i1 + " to " + paramc);
        }
        j.add(paramc);
        return i1;
      }
      int i1 = ((Integer)k.remove(k.size() - 1)).intValue();
      if (a) {
        Log.v("FragmentManager", "Adding back stack index " + i1 + " with " + paramc);
      }
      j.set(i1, paramc);
      return i1;
    }
    finally {}
  }
  
  public final i a(String paramString)
  {
    int i1;
    Object localObject;
    if ((f != null) && (paramString != null))
    {
      i1 = f.size() - 1;
      while (i1 >= 0)
      {
        localObject = (i)f.get(i1);
        if ((localObject != null) && (paramString.equals(G))) {
          return (i)localObject;
        }
        i1 -= 1;
      }
    }
    if ((e != null) && (paramString != null))
    {
      i1 = e.size() - 1;
      for (;;)
      {
        if (i1 < 0) {
          break label126;
        }
        i locali = (i)e.get(i1);
        if (locali != null)
        {
          localObject = locali;
          if (paramString.equals(G)) {
            break;
          }
        }
        i1 -= 1;
      }
    }
    label126:
    return null;
  }
  
  public final s a()
  {
    return new c(this);
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    paramString = paramContext.obtainStyledAttributes(paramAttributeSet, b.a);
    if (str1 == null) {
      str1 = paramString.getString(0);
    }
    for (;;)
    {
      int i3 = paramString.getResourceId(1, -1);
      String str2 = paramString.getString(2);
      paramString.recycle();
      if (!i.b(n.c, str1)) {
        return null;
      }
      if (paramView != null) {}
      for (int i1 = paramView.getId(); (i1 == -1) && (i3 == -1) && (str2 == null); i1 = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      }
      int i2;
      if (i3 != -1)
      {
        paramString = c(i3);
        paramView = paramString;
        if (paramString == null)
        {
          paramView = paramString;
          if (str2 != null) {
            paramView = a(str2);
          }
        }
        paramString = paramView;
        if (paramView == null)
        {
          paramString = paramView;
          if (i1 != -1) {
            paramString = c(i1);
          }
        }
        if (a) {
          Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(i3) + " fname=" + str1 + " existing=" + paramString);
        }
        if (paramString != null) {
          break label414;
        }
        paramView = i.a(paramContext, str1);
        v = true;
        if (i3 == 0) {
          break label407;
        }
        i2 = i3;
        label289:
        E = i2;
        F = i1;
        G = str2;
        w = true;
        z = this;
        A = n;
        paramString = l;
        paramView.j();
        a(paramView, true);
        label340:
        if ((m > 0) || (!v)) {
          break label533;
        }
        a(paramView, 1, 0, 0, false);
      }
      for (;;)
      {
        if (P != null) {
          break label541;
        }
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        paramString = null;
        break;
        label407:
        i2 = i1;
        break label289;
        label414:
        if (w) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i3) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i1) + " with another fragment for " + str1);
        }
        w = true;
        A = n;
        if (!K)
        {
          paramView = l;
          paramString.j();
        }
        paramView = paramString;
        break label340;
        label533:
        h(paramView);
      }
      label541:
      if (i3 != 0) {
        P.setId(i3);
      }
      if (P.getTag() == null) {
        P.setTag(str2);
      }
      return P;
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt);
    }
    a(new d(paramInt), false);
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    if ((n == null) && (paramInt != 0)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == m)) {}
    do
    {
      return;
      m = paramInt;
    } while (e == null);
    int i3;
    int i2;
    label68:
    int i1;
    i locali;
    if (f != null)
    {
      i3 = f.size();
      i2 = 0;
      paramInt = 0;
      i1 = paramInt;
      if (i2 >= i3) {
        break label127;
      }
      locali = (i)f.get(i2);
      a(locali);
      if (T == null) {
        break label273;
      }
      paramInt = T.a() | paramInt;
    }
    label127:
    label139:
    label268:
    label273:
    for (;;)
    {
      i2 += 1;
      break label68;
      i1 = 0;
      i3 = e.size();
      i2 = 0;
      if (i2 < i3)
      {
        locali = (i)e.get(i2);
        if ((locali == null) || ((!u) && (!I)) || (X)) {
          break label268;
        }
        a(locali);
        if (T == null) {
          break label268;
        }
      }
      for (paramInt = T.a() | i1;; paramInt = i1)
      {
        i2 += 1;
        i1 = paramInt;
        break label139;
        if (i1 == 0) {
          q();
        }
        if ((!r) || (n == null) || (m != 5)) {
          break;
        }
        n.d();
        r = false;
        return;
      }
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    if (f != null)
    {
      int i1 = 0;
      while (i1 < f.size())
      {
        i locali = (i)f.get(i1);
        if (locali != null)
        {
          locali.onConfigurationChanged(paramConfiguration);
          if (B != null) {
            B.a(paramConfiguration);
          }
        }
        i1 += 1;
      }
    }
  }
  
  final void a(Parcelable paramParcelable, p paramp)
  {
    if (paramParcelable == null) {}
    q localq;
    do
    {
      return;
      localq = (q)paramParcelable;
    } while (a == null);
    Object localObject1;
    int i1;
    int i2;
    Object localObject2;
    Object localObject3;
    if (paramp != null)
    {
      localObject1 = a;
      paramParcelable = b;
      if (localObject1 != null) {}
      for (i1 = ((List)localObject1).size();; i1 = 0)
      {
        i2 = 0;
        while (i2 < i1)
        {
          localObject2 = (i)((List)localObject1).get(i2);
          if (a) {
            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + localObject2);
          }
          localObject3 = a[n];
          l = ((i)localObject2);
          m = null;
          y = 0;
          w = false;
          t = false;
          q = null;
          if (k != null)
          {
            k.setClassLoader(n.c.getClassLoader());
            m = k.getSparseParcelableArray("android:view_state");
            l = k;
          }
          i2 += 1;
        }
      }
    }
    for (;;)
    {
      e = new ArrayList(a.length);
      if (g != null) {
        g.clear();
      }
      i1 = 0;
      if (i1 < a.length)
      {
        localObject2 = a[i1];
        if (localObject2 != null) {
          if ((paramParcelable == null) || (i1 >= paramParcelable.size())) {
            break label1208;
          }
        }
      }
      label740:
      label811:
      label856:
      label1208:
      for (localObject1 = (p)paramParcelable.get(i1);; localObject1 = null)
      {
        localObject3 = n;
        i locali = p;
        if (l == null)
        {
          Context localContext = c;
          if (i != null) {
            i.setClassLoader(localContext.getClassLoader());
          }
          l = i.a(localContext, a, i);
          if (k != null)
          {
            k.setClassLoader(localContext.getClassLoader());
            l.l = k;
          }
          l.a(b, locali);
          l.v = c;
          l.x = true;
          l.E = d;
          l.F = e;
          l.G = f;
          l.J = g;
          l.I = h;
          l.H = j;
          l.z = f;
          if (a) {
            Log.v("FragmentManager", "Instantiated fragment " + l);
          }
        }
        l.C = ((p)localObject1);
        localObject1 = l;
        if (a) {
          Log.v("FragmentManager", "restoreAllState: active #" + i1 + ": " + localObject1);
        }
        e.add(localObject1);
        l = null;
        for (;;)
        {
          i1 += 1;
          break;
          e.add(null);
          if (g == null) {
            g = new ArrayList();
          }
          if (a) {
            Log.v("FragmentManager", "restoreAllState: avail #" + i1);
          }
          g.add(Integer.valueOf(i1));
        }
        if (paramp != null)
        {
          paramParcelable = a;
          if (paramParcelable != null)
          {
            i1 = paramParcelable.size();
            i2 = 0;
            if (i2 >= i1) {
              break label856;
            }
            paramp = (i)paramParcelable.get(i2);
            if (r >= 0) {
              if (r >= e.size()) {
                break label811;
              }
            }
          }
          for (q = ((i)e.get(r));; q = null)
          {
            i2 += 1;
            break label740;
            i1 = 0;
            break;
            Log.w("FragmentManager", "Re-attaching retained fragment " + paramp + " target no longer exists: " + r);
          }
        }
        if (b != null)
        {
          f = new ArrayList(b.length);
          i1 = 0;
          while (i1 < b.length)
          {
            paramParcelable = (i)e.get(b[i1]);
            if (paramParcelable == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + b[i1]));
            }
            t = true;
            if (a) {
              Log.v("FragmentManager", "restoreAllState: added #" + i1 + ": " + paramParcelable);
            }
            if (f.contains(paramParcelable)) {
              throw new IllegalStateException("Already added!");
            }
            f.add(paramParcelable);
            i1 += 1;
          }
        }
        f = null;
        if (c != null)
        {
          h = new ArrayList(c.length);
          i1 = 0;
          while (i1 < c.length)
          {
            paramParcelable = c[i1].a(this);
            if (a)
            {
              Log.v("FragmentManager", "restoreAllState: back stack #" + i1 + " (index " + n + "): " + paramParcelable);
              paramp = new PrintWriter(new e("FragmentManager"));
              paramParcelable.a("  ", paramp, false);
              paramp.close();
            }
            h.add(paramParcelable);
            if (n >= 0) {
              a(n, paramParcelable);
            }
            i1 += 1;
          }
          break;
        }
        h = null;
        return;
      }
      paramParcelable = null;
    }
  }
  
  final void a(i parami)
  {
    if (parami == null) {}
    int i2;
    ViewGroup localViewGroup;
    Object localObject1;
    label79:
    Object localObject2;
    label166:
    do
    {
      return;
      i2 = m;
      i1 = i2;
      if (u)
      {
        if (!parami.f()) {
          break;
        }
        i1 = Math.min(i2, 1);
      }
      a(parami, i1, parami.w(), parami.x(), false);
      if (P != null)
      {
        localViewGroup = O;
        localObject1 = P;
        if ((localViewGroup != null) && (localObject1 != null)) {
          break label382;
        }
        localObject1 = null;
        if (localObject1 != null)
        {
          localObject1 = P;
          localObject2 = O;
          i1 = ((ViewGroup)localObject2).indexOfChild((View)localObject1);
          i2 = ((ViewGroup)localObject2).indexOfChild(P);
          if (i2 < i1)
          {
            ((ViewGroup)localObject2).removeViewAt(i2);
            ((ViewGroup)localObject2).addView(P, i1);
          }
        }
        if ((X) && (O != null))
        {
          if (Build.VERSION.SDK_INT >= 11) {
            break label445;
          }
          P.setVisibility(0);
          Z = 0.0F;
          X = false;
          localObject1 = a(parami, parami.w(), true, parami.x());
          if (localObject1 != null)
          {
            a(P, (Animation)localObject1);
            P.startAnimation((Animation)localObject1);
          }
        }
      }
    } while (!Y);
    boolean bool;
    if (P != null)
    {
      i1 = parami.w();
      if (H) {
        break label468;
      }
      bool = true;
      label244:
      localObject1 = a(parami, i1, bool, parami.x());
      if (localObject1 != null)
      {
        a(P, (Animation)localObject1);
        P.startAnimation((Animation)localObject1);
        a(P, (Animation)localObject1);
        ((Animation)localObject1).start();
      }
      if ((!H) || (parami.D())) {
        break label474;
      }
    }
    label382:
    label439:
    label445:
    label468:
    label474:
    for (int i1 = 8;; i1 = 0)
    {
      P.setVisibility(i1);
      if (parami.D()) {
        parami.a(false);
      }
      if ((t) && (L) && (M)) {
        r = true;
      }
      Y = false;
      bool = H;
      i.h();
      return;
      i1 = Math.min(i2, 0);
      break;
      i1 = f.indexOf(parami) - 1;
      for (;;)
      {
        if (i1 < 0) {
          break label439;
        }
        localObject2 = (i)f.get(i1);
        if (O == localViewGroup)
        {
          localObject1 = localObject2;
          if (P != null) {
            break;
          }
        }
        i1 -= 1;
      }
      localObject1 = null;
      break label79;
      if (Z <= 0.0F) {
        break label166;
      }
      P.setAlpha(Z);
      break label166;
      bool = false;
      break label244;
    }
  }
  
  final void a(final i parami, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1;
    if (t)
    {
      i1 = paramInt1;
      if (!I) {}
    }
    else
    {
      i1 = paramInt1;
      if (paramInt1 > 1) {
        i1 = 1;
      }
    }
    int i2 = i1;
    if (u)
    {
      i2 = i1;
      if (i1 > k) {
        i2 = k;
      }
    }
    paramInt1 = i2;
    if (R)
    {
      paramInt1 = i2;
      if (k < 4)
      {
        paramInt1 = i2;
        if (i2 > 3) {
          paramInt1 = 3;
        }
      }
    }
    label710:
    label758:
    Object localObject3;
    if (k < paramInt1)
    {
      if ((v) && (!w)) {}
      do
      {
        return;
        if (parami.A() != null)
        {
          parami.a(null);
          a(parami, parami.B(), 0, 0, true);
        }
        paramInt2 = paramInt1;
        i1 = paramInt1;
        i2 = paramInt1;
        paramInt3 = paramInt1;
        switch (k)
        {
        default: 
          i1 = paramInt1;
        }
      } while (k == i1);
      Log.w("FragmentManager", "moveToState: Fragment state for " + parami + " not updated inline; expected state " + i1 + " found " + k);
      k = i1;
      return;
      if (a) {
        Log.v("FragmentManager", "moveto CREATED: " + parami);
      }
      paramInt3 = paramInt1;
      if (l != null)
      {
        l.setClassLoader(n.c.getClassLoader());
        m = l.getSparseParcelableArray("android:view_state");
        q = a(l, "android:target_state");
        if (q != null) {
          s = l.getInt("android:target_req_state", 0);
        }
        S = l.getBoolean("android:user_visible_hint", true);
        paramInt3 = paramInt1;
        if (!S)
        {
          R = true;
          paramInt3 = paramInt1;
          if (paramInt1 > 3) {
            paramInt3 = 3;
          }
        }
      }
      A = n;
      D = p;
      if (p != null) {}
      for (Object localObject1 = p.B;; localObject1 = n.f)
      {
        z = ((o)localObject1);
        a(parami, n.c, false);
        N = false;
        parami.a(n.c);
        if (N) {
          break;
        }
        throw new ap("Fragment " + parami + " did not call through to super.onAttach()");
      }
      if (D != null)
      {
        localObject1 = D;
        i.k();
      }
      b(parami, n.c, false);
      if (!K)
      {
        localObject1 = l;
        if (B != null) {
          B.s = false;
        }
        k = 1;
        N = false;
        parami.a((Bundle)localObject1);
        if (!N) {
          throw new ap("Fragment " + parami + " did not call through to super.onCreate()");
        }
        a(parami, l, false);
        K = false;
        paramInt2 = paramInt3;
        if (v)
        {
          parami.b(l);
          localObject1 = l;
          P = parami.s();
          if (P == null) {
            break label1241;
          }
          Q = P;
          if (Build.VERSION.SDK_INT < 11) {
            break label1227;
          }
          android.support.v4.h.w.z(P);
          if (H) {
            P.setVisibility(8);
          }
          localObject1 = P;
          localObject1 = l;
          i.m();
          a(parami, P, l, false);
          paramInt2 = paramInt3;
        }
        i1 = paramInt2;
        if (paramInt2 <= 1) {
          break label1418;
        }
        if (a) {
          Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + parami);
        }
        if (!v)
        {
          if (F == 0) {
            break label2899;
          }
          if (F == -1) {
            a(new IllegalArgumentException("Cannot create fragment " + parami + " for a container view with no id"));
          }
          localObject3 = (ViewGroup)o.a(F);
          localObject1 = localObject3;
          if (localObject3 == null)
          {
            localObject1 = localObject3;
            if (!x)
            {
              try
              {
                if (A != null) {
                  break label1252;
                }
                throw new IllegalStateException("Fragment " + parami + " not attached to Activity");
              }
              catch (Resources.NotFoundException localNotFoundException)
              {
                localObject2 = "unknown";
              }
              label933:
              a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(F) + " (" + (String)localObject2 + ") for fragment " + parami));
            }
          }
        }
      }
    }
    label1051:
    label1130:
    label1227:
    label1241:
    label1252:
    label1288:
    label1302:
    label1418:
    label1806:
    label2422:
    label2893:
    label2899:
    for (Object localObject2 = localObject3;; localObject2 = null)
    {
      O = ((ViewGroup)localObject2);
      parami.b(l);
      localObject3 = l;
      P = parami.s();
      if (P != null)
      {
        Q = P;
        if (Build.VERSION.SDK_INT >= 11)
        {
          android.support.v4.h.w.z(P);
          if (localObject2 != null) {
            ((ViewGroup)localObject2).addView(P);
          }
          if (H) {
            P.setVisibility(8);
          }
          localObject2 = P;
          localObject2 = l;
          i.m();
          a(parami, P, l, false);
          if ((P.getVisibility() != 0) || (O == null)) {
            break label1288;
          }
          paramBoolean = true;
          X = paramBoolean;
        }
      }
      for (;;)
      {
        localObject2 = l;
        if (B != null) {
          B.s = false;
        }
        k = 2;
        N = false;
        parami.c((Bundle)localObject2);
        if (N) {
          break label1302;
        }
        throw new ap("Fragment " + parami + " did not call through to super.onActivityCreated()");
        parami.e(l);
        k = 1;
        break;
        P = y.a(P);
        break label710;
        Q = null;
        paramInt2 = paramInt3;
        break label758;
        localObject2 = A.c.getResources().getResourceName(F);
        break label933;
        P = y.a(P);
        break label1051;
        paramBoolean = false;
        break label1130;
        Q = null;
      }
      if (B != null) {
        B.h();
      }
      b(parami, l, false);
      if (P != null)
      {
        localObject2 = l;
        if (m != null)
        {
          Q.restoreHierarchyState(m);
          m = null;
        }
        N = false;
        N = true;
        if (!N) {
          throw new ap("Fragment " + parami + " did not call through to super.onViewStateRestored()");
        }
      }
      l = null;
      i1 = paramInt2;
      i2 = i1;
      if (i1 > 2)
      {
        k = 3;
        i2 = i1;
      }
      paramInt3 = i2;
      if (i2 > 3)
      {
        if (a) {
          Log.v("FragmentManager", "moveto STARTED: " + parami);
        }
        if (B != null)
        {
          B.s = false;
          B.c();
        }
        k = 4;
        N = false;
        parami.c();
        if (!N) {
          throw new ap("Fragment " + parami + " did not call through to super.onStart()");
        }
        if (B != null) {
          B.i();
        }
        if (T != null) {
          T.f();
        }
        b(parami, false);
        paramInt3 = i2;
      }
      i1 = paramInt3;
      if (paramInt3 <= 4) {
        break;
      }
      if (a) {
        Log.v("FragmentManager", "moveto RESUMED: " + parami);
      }
      if (B != null)
      {
        B.s = false;
        B.c();
      }
      k = 5;
      N = false;
      N = true;
      if (!N) {
        throw new ap("Fragment " + parami + " did not call through to super.onResume()");
      }
      if (B != null)
      {
        B.j();
        B.c();
      }
      c(parami, false);
      l = null;
      m = null;
      i1 = paramInt3;
      break;
      i1 = paramInt1;
      if (k <= paramInt1) {
        break;
      }
      switch (k)
      {
      default: 
        i1 = paramInt1;
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        do
        {
          i1 = paramInt1;
          if (paramInt1 > 0) {
            break;
          }
          if ((t) && (parami.A() != null))
          {
            localObject2 = parami.A();
            parami.a(null);
            ((View)localObject2).clearAnimation();
          }
          if (parami.A() == null) {
            break label2422;
          }
          parami.b(paramInt1);
          i1 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom RESUMED: " + parami);
            }
            if (B != null) {
              B.k();
            }
            k = 4;
            N = false;
            N = true;
            if (!N) {
              throw new ap("Fragment " + parami + " did not call through to super.onPause()");
            }
            d(parami, false);
          }
          if (paramInt1 < 4)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STARTED: " + parami);
            }
            if (B != null) {
              B.l();
            }
            k = 3;
            N = false;
            parami.d();
            if (!N) {
              throw new ap("Fragment " + parami + " did not call through to super.onStop()");
            }
            e(parami, false);
          }
          if (paramInt1 < 3)
          {
            if (a) {
              Log.v("FragmentManager", "movefrom STOPPED: " + parami);
            }
            parami.t();
          }
        } while (paramInt1 >= 2);
        if (a) {
          Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + parami);
        }
        if ((P != null) && (n.b()) && (m == null)) {
          i(parami);
        }
        if (B != null)
        {
          localObject2 = B;
          d = true;
          ((o)localObject2).a(1, false);
          d = false;
        }
        k = 1;
        N = false;
        parami.e();
        if (!N) {
          throw new ap("Fragment " + parami + " did not call through to super.onDestroyView()");
        }
        if (T != null) {
          T.e();
        }
        f(parami, false);
        if ((P != null) && (O != null)) {
          if ((m <= 0) || (t) || (P.getVisibility() != 0) || (Z < 0.0F)) {
            break label2893;
          }
        }
        for (localObject2 = a(parami, paramInt2, false, paramInt3);; localObject2 = null)
        {
          Z = 0.0F;
          if (localObject2 != null)
          {
            parami.a(P);
            parami.b(paramInt1);
            ((Animation)localObject2).setAnimationListener(new a(P, (Animation)localObject2)
            {
              public final void onAnimationEnd(Animation paramAnonymousAnimation)
              {
                super.onAnimationEnd(paramAnonymousAnimation);
                if (parami.A() != null)
                {
                  parami.a(null);
                  a(parami, parami.B(), 0, 0, false);
                }
              }
            });
            P.startAnimation((Animation)localObject2);
          }
          O.removeView(P);
          O = null;
          P = null;
          Q = null;
          break label1806;
          if (a) {
            Log.v("FragmentManager", "movefrom CREATED: " + parami);
          }
          if (!K)
          {
            if (B != null) {
              B.n();
            }
            k = 0;
            N = false;
            parami.n();
            if (!N) {
              throw new ap("Fragment " + parami + " did not call through to super.onDestroy()");
            }
            B = null;
            g(parami, false);
          }
          for (;;)
          {
            N = false;
            parami.a();
            if (N) {
              break;
            }
            throw new ap("Fragment " + parami + " did not call through to super.onDetach()");
            k = 0;
          }
          if (B != null)
          {
            if (!K) {
              throw new IllegalStateException("Child FragmentManager of " + parami + " was not  destroyed and this fragment is not retaining instance");
            }
            B.n();
            B = null;
          }
          h(parami, false);
          i1 = paramInt1;
          if (paramBoolean) {
            break;
          }
          if (!K)
          {
            i1 = paramInt1;
            if (n < 0) {
              break;
            }
            if (a) {
              Log.v("FragmentManager", "Freeing fragment index " + parami);
            }
            e.set(n, null);
            if (g == null) {
              g = new ArrayList();
            }
            g.add(Integer.valueOf(n));
            n.a(o);
            n = -1;
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
            i1 = paramInt1;
            break;
          }
          A = null;
          D = null;
          z = null;
          i1 = paramInt1;
          break;
        }
      }
    }
  }
  
  public final void a(i parami, boolean paramBoolean)
  {
    if (f == null) {
      f = new ArrayList();
    }
    if (a) {
      Log.v("FragmentManager", "add: " + parami);
    }
    b(parami);
    if (!I)
    {
      if (f.contains(parami)) {
        throw new IllegalStateException("Fragment already added: " + parami);
      }
      f.add(parami);
      t = true;
      u = false;
      if (P == null) {
        Y = false;
      }
      if ((L) && (M)) {
        r = true;
      }
      if (paramBoolean) {
        h(parami);
      }
    }
  }
  
  public final void a(m paramm, k paramk, i parami)
  {
    if (n != null) {
      throw new IllegalStateException("Already attached");
    }
    n = paramm;
    o = paramk;
    p = parami;
  }
  
  public final void a(c paramc, boolean paramBoolean)
  {
    if (!paramBoolean) {
      r();
    }
    try
    {
      if ((t) || (n == null)) {
        throw new IllegalStateException("Activity has been destroyed");
      }
    }
    finally
    {
      throw paramc;
      if (c == null) {
        c = new ArrayList();
      }
      c.add(paramc);
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i2 = 0;
    String str = paramString + "    ";
    int i3;
    int i1;
    if (e != null)
    {
      i3 = e.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        i1 = 0;
        while (i1 < i3)
        {
          i locali = (i)e.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(locali);
          if (locali != null) {
            locali.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          i1 += 1;
        }
      }
    }
    if (f != null)
    {
      i3 = f.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        i1 = 0;
        while (i1 < i3)
        {
          paramFileDescriptor = (i)f.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          i1 += 1;
        }
      }
    }
    if (i != null)
    {
      i3 = i.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        i1 = 0;
        while (i1 < i3)
        {
          paramFileDescriptor = (i)i.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          i1 += 1;
        }
      }
    }
    if (h != null)
    {
      i3 = h.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        i1 = 0;
        while (i1 < i3)
        {
          paramFileDescriptor = (c)h.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          paramFileDescriptor.a(str, paramPrintWriter);
          i1 += 1;
        }
      }
    }
    try
    {
      if (j != null)
      {
        i3 = j.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          i1 = 0;
          while (i1 < i3)
          {
            paramFileDescriptor = (c)j.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
      if ((k != null) && (k.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(k.toArray()));
      }
      if (c != null)
      {
        i3 = c.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          i1 = i2;
          while (i1 < i3)
          {
            paramFileDescriptor = (c)c.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
            i1 += 1;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    paramPrintWriter.println(n);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(o);
    if (p != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(p);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(m);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(s);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(t);
    if (r)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(r);
    }
    if (u != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(u);
    }
    if ((g != null) && (g.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(g.toArray()));
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (f == null) {}
    for (;;)
    {
      return;
      int i1 = f.size() - 1;
      while (i1 >= 0)
      {
        i locali = (i)f.get(i1);
        if ((locali != null) && (B != null)) {
          B.a(paramBoolean);
        }
        i1 -= 1;
      }
    }
  }
  
  public final boolean a(Menu paramMenu)
  {
    int i1;
    boolean bool3;
    boolean bool4;
    i locali;
    boolean bool1;
    if (f != null)
    {
      i1 = 0;
      bool3 = false;
      bool4 = bool3;
      if (i1 >= f.size()) {
        break label127;
      }
      locali = (i)f.get(i1);
      bool4 = bool3;
      if (locali != null)
      {
        if (H) {
          break label135;
        }
        if ((!L) || (!M)) {
          break label130;
        }
        bool1 = true;
        label78:
        bool2 = bool1;
        if (B == null) {}
      }
    }
    label127:
    label130:
    label135:
    for (boolean bool2 = bool1 | B.a(paramMenu);; bool2 = false)
    {
      bool4 = bool3;
      if (bool2) {
        bool4 = true;
      }
      i1 += 1;
      bool3 = bool4;
      break;
      bool4 = false;
      return bool4;
      bool1 = false;
      break label78;
    }
  }
  
  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i4 = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    int i3;
    boolean bool2;
    boolean bool3;
    i locali;
    int i1;
    if (f != null)
    {
      i3 = 0;
      bool2 = false;
      localObject2 = localObject1;
      bool3 = bool2;
      if (i3 >= f.size()) {
        break label162;
      }
      locali = (i)f.get(i3);
      if (locali == null) {
        break label228;
      }
      if (H) {
        break label236;
      }
      if ((!L) || (!M)) {
        break label231;
      }
      i1 = 1;
      label87:
      int i2 = i1;
      if (B == null) {}
    }
    label162:
    label228:
    label231:
    label236:
    for (boolean bool1 = i1 | B.a(paramMenu, paramMenuInflater);; bool1 = false)
    {
      if (bool1)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(locali);
        bool2 = true;
        localObject1 = localObject2;
      }
      for (;;)
      {
        i3 += 1;
        break;
        bool3 = false;
        if (i != null)
        {
          i1 = i4;
          while (i1 < i.size())
          {
            paramMenu = (i)i.get(i1);
            if ((localObject2 == null) || (!((ArrayList)localObject2).contains(paramMenu))) {
              i.o();
            }
            i1 += 1;
          }
        }
        i = ((ArrayList)localObject2);
        return bool3;
      }
      i1 = 0;
      break label87;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i1;
    if (f != null) {
      i1 = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i1 < f.size())
      {
        i locali = (i)f.get(i1);
        if (locali == null) {
          break label94;
        }
        if ((H) || (B == null) || (!B.a(paramMenuItem))) {
          break label89;
        }
      }
      label89:
      for (int i2 = 1; i2 != 0; i2 = 0)
      {
        bool1 = true;
        return bool1;
      }
      label94:
      i1 += 1;
    }
  }
  
  final boolean a(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1, String paramString, int paramInt1, int paramInt2)
  {
    if (h == null) {
      return false;
    }
    if ((paramString == null) && (paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
    {
      paramInt1 = h.size() - 1;
      if (paramInt1 < 0) {
        return false;
      }
      paramArrayList.add(h.remove(paramInt1));
      paramArrayList1.add(Boolean.valueOf(true));
    }
    for (;;)
    {
      return true;
      int i1 = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        int i2 = h.size() - 1;
        c localc;
        while (i2 >= 0)
        {
          localc = (c)h.get(i2);
          if (((paramString != null) && (paramString.equals(l))) || ((paramInt1 >= 0) && (paramInt1 == n))) {
            break;
          }
          i2 -= 1;
        }
        if (i2 < 0) {
          return false;
        }
        i1 = i2;
        if ((paramInt2 & 0x1) != 0)
        {
          paramInt2 = i2 - 1;
          for (;;)
          {
            i1 = paramInt2;
            if (paramInt2 < 0) {
              break;
            }
            localc = (c)h.get(paramInt2);
            if ((paramString == null) || (!paramString.equals(l)))
            {
              i1 = paramInt2;
              if (paramInt1 < 0) {
                break;
              }
              i1 = paramInt2;
              if (paramInt1 != n) {
                break;
              }
            }
            paramInt2 -= 1;
          }
        }
      }
      if (i1 == h.size() - 1) {
        return false;
      }
      paramInt1 = h.size() - 1;
      while (paramInt1 > i1)
      {
        paramArrayList.add(h.remove(paramInt1));
        paramArrayList1.add(Boolean.valueOf(true));
        paramInt1 -= 1;
      }
    }
  }
  
  public final i b(String paramString)
  {
    if ((e != null) && (paramString != null))
    {
      int i1 = e.size() - 1;
      while (i1 >= 0)
      {
        i locali = (i)e.get(i1);
        if (locali != null)
        {
          if (paramString.equals(o)) {}
          while (locali != null)
          {
            return locali;
            if (B != null) {
              locali = B.b(paramString);
            } else {
              locali = null;
            }
          }
        }
        i1 -= 1;
      }
    }
    return null;
  }
  
  final void b(i parami)
  {
    if (n >= 0) {}
    for (;;)
    {
      return;
      if ((g == null) || (g.size() <= 0))
      {
        if (e == null) {
          e = new ArrayList();
        }
        parami.a(e.size(), p);
        e.add(parami);
      }
      while (a)
      {
        Log.v("FragmentManager", "Allocated fragment index " + parami);
        return;
        parami.a(((Integer)g.remove(g.size() - 1)).intValue(), p);
        e.set(n, parami);
      }
    }
  }
  
  public final void b(Menu paramMenu)
  {
    if (f != null)
    {
      int i1 = 0;
      while (i1 < f.size())
      {
        i locali = (i)f.get(i1);
        if ((locali != null) && (!H) && (B != null)) {
          B.b(paramMenu);
        }
        i1 += 1;
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (f == null) {}
    for (;;)
    {
      return;
      int i1 = f.size() - 1;
      while (i1 >= 0)
      {
        i locali = (i)f.get(i1);
        if ((locali != null) && (B != null)) {
          B.b(paramBoolean);
        }
        i1 -= 1;
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
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i1;
    if (f != null) {
      i1 = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i1 < f.size())
      {
        i locali = (i)f.get(i1);
        if (locali == null) {
          break label94;
        }
        if ((H) || (B == null) || (!B.b(paramMenuItem))) {
          break label89;
        }
      }
      label89:
      for (int i2 = 1; i2 != 0; i2 = 0)
      {
        bool1 = true;
        return bool1;
      }
      label94:
      i1 += 1;
    }
  }
  
  public final void c(i parami)
  {
    if (a) {
      Log.v("FragmentManager", "remove: " + parami + " nesting=" + y);
    }
    if (!parami.f()) {}
    for (int i1 = 1;; i1 = 0)
    {
      if ((!I) || (i1 != 0))
      {
        if (f != null) {
          f.remove(parami);
        }
        if ((L) && (M)) {
          r = true;
        }
        t = false;
        u = true;
      }
      return;
    }
  }
  
  /* Error */
  public final boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 636	android/support/v4/b/o:t	()V
    //   4: iconst_0
    //   5: istore_1
    //   6: aload_0
    //   7: aload_0
    //   8: getfield 638	android/support/v4/b/o:w	Ljava/util/ArrayList;
    //   11: aload_0
    //   12: getfield 640	android/support/v4/b/o:x	Ljava/util/ArrayList;
    //   15: invokespecial 1320	android/support/v4/b/o:c	(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    //   18: ifeq +36 -> 54
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield 645	android/support/v4/b/o:d	Z
    //   26: aload_0
    //   27: aload_0
    //   28: getfield 638	android/support/v4/b/o:w	Ljava/util/ArrayList;
    //   31: aload_0
    //   32: getfield 640	android/support/v4/b/o:x	Ljava/util/ArrayList;
    //   35: invokespecial 647	android/support/v4/b/o:b	(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   38: aload_0
    //   39: invokespecial 649	android/support/v4/b/o:u	()V
    //   42: iconst_1
    //   43: istore_1
    //   44: goto -38 -> 6
    //   47: astore_2
    //   48: aload_0
    //   49: invokespecial 649	android/support/v4/b/o:u	()V
    //   52: aload_2
    //   53: athrow
    //   54: aload_0
    //   55: invokespecial 651	android/support/v4/b/o:v	()V
    //   58: iload_1
    //   59: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	o
    //   5	54	1	bool	boolean
    //   47	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   26	38	47	finally
  }
  
  final void d()
  {
    if (l != null)
    {
      int i1 = 0;
      while (i1 < l.size())
      {
        l.get(i1);
        i1 += 1;
      }
    }
  }
  
  final p e()
  {
    int i1;
    Object localObject2;
    Object localObject1;
    Object localObject4;
    Object localObject3;
    Object localObject5;
    int i2;
    if (e != null)
    {
      i1 = 0;
      localObject2 = null;
      localObject1 = null;
      localObject4 = localObject2;
      localObject3 = localObject1;
      if (i1 >= e.size()) {
        break label301;
      }
      i locali = (i)e.get(i1);
      localObject5 = localObject2;
      localObject4 = localObject1;
      if (locali != null)
      {
        localObject3 = localObject1;
        if (J)
        {
          localObject4 = localObject1;
          if (localObject1 == null) {
            localObject4 = new ArrayList();
          }
          ((ArrayList)localObject4).add(locali);
          K = true;
          if (q == null) {
            break label221;
          }
        }
        label221:
        for (i2 = q.n;; i2 = -1)
        {
          r = i2;
          localObject3 = localObject4;
          if (a)
          {
            Log.v("FragmentManager", "retainNonConfig: keeping retained " + locali);
            localObject3 = localObject4;
          }
          if (B == null) {
            break label325;
          }
          localObject4 = B.e();
          if (localObject4 == null) {
            break label325;
          }
          if (localObject2 != null) {
            break;
          }
          localObject2 = new ArrayList();
          i2 = 0;
          for (;;)
          {
            localObject1 = localObject2;
            if (i2 >= i1) {
              break;
            }
            ((ArrayList)localObject2).add(null);
            i2 += 1;
          }
        }
        localObject1 = localObject2;
        ((ArrayList)localObject1).add(localObject4);
        i2 = 1;
        localObject2 = localObject1;
      }
    }
    for (;;)
    {
      localObject5 = localObject2;
      localObject4 = localObject3;
      if (localObject2 != null)
      {
        localObject5 = localObject2;
        localObject4 = localObject3;
        if (i2 == 0)
        {
          ((ArrayList)localObject2).add(null);
          localObject4 = localObject3;
          localObject5 = localObject2;
        }
      }
      i1 += 1;
      localObject1 = localObject4;
      localObject2 = localObject5;
      break;
      localObject4 = null;
      localObject3 = null;
      label301:
      if ((localObject3 == null) && (localObject4 == null)) {
        return null;
      }
      return new p((List)localObject3, (List)localObject4);
      label325:
      i2 = 0;
    }
  }
  
  final Parcelable f()
  {
    Object localObject3 = null;
    int i3 = 0;
    if (B != null) {
      while (!B.isEmpty()) {
        ((e)B.remove(0)).c();
      }
    }
    if (e == null) {}
    Object localObject1;
    Object localObject2;
    for (int i1 = 0;; i1 = e.size())
    {
      i2 = 0;
      while (i2 < i1)
      {
        localObject1 = (i)e.get(i2);
        if ((localObject1 != null) && (((i)localObject1).A() != null))
        {
          i4 = ((i)localObject1).B();
          localObject2 = ((i)localObject1).A();
          ((i)localObject1).a(null);
          localObject2 = ((View)localObject2).getAnimation();
          if (localObject2 != null) {
            ((Animation)localObject2).cancel();
          }
          a((i)localObject1, i4, 0, 0, false);
        }
        i2 += 1;
      }
    }
    c();
    if (b) {
      s = true;
    }
    if ((e == null) || (e.size() <= 0)) {
      return null;
    }
    int i4 = e.size();
    r[] arrayOfr = new r[i4];
    int i2 = 0;
    i1 = 0;
    label202:
    i locali;
    r localr;
    if (i2 < i4)
    {
      locali = (i)e.get(i2);
      if (locali == null) {
        break label1059;
      }
      if (n < 0) {
        a(new IllegalStateException("Failure saving state: active " + locali + " has cleared index: " + n));
      }
      localr = new r(locali);
      arrayOfr[i2] = localr;
      if ((k > 0) && (k == null))
      {
        if (z == null) {
          z = new Bundle();
        }
        locali.f(z);
        c(locali, z, false);
        if (z.isEmpty()) {
          break label1062;
        }
        localObject2 = z;
        z = null;
      }
    }
    for (;;)
    {
      if (P != null) {
        i(locali);
      }
      localObject1 = localObject2;
      if (m != null)
      {
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new Bundle();
        }
        ((Bundle)localObject1).putSparseParcelableArray("android:view_state", m);
      }
      localObject2 = localObject1;
      if (!S)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new Bundle();
        }
        ((Bundle)localObject2).putBoolean("android:user_visible_hint", S);
      }
      k = ((Bundle)localObject2);
      if (q != null)
      {
        if (q.n < 0) {
          a(new IllegalStateException("Failure saving state: " + locali + " has target not in fragment manager: " + q));
        }
        if (k == null) {
          k = new Bundle();
        }
        localObject1 = k;
        localObject2 = q;
        if (n < 0) {
          a(new IllegalStateException("Fragment " + localObject2 + " is not currently in the FragmentManager"));
        }
        ((Bundle)localObject1).putInt("android:target_state", n);
        if (s != 0) {
          k.putInt("android:target_req_state", s);
        }
      }
      label652:
      if (a) {
        Log.v("FragmentManager", "Saved state of " + locali + ": " + k);
      }
      i1 = 1;
      label1059:
      for (;;)
      {
        i2 += 1;
        break label202;
        k = l;
        break label652;
        if (i1 == 0)
        {
          if (!a) {
            break;
          }
          Log.v("FragmentManager", "saveAllState: no fragments!");
          return null;
        }
        if (f != null)
        {
          i2 = f.size();
          if (i2 > 0)
          {
            localObject2 = new int[i2];
            i1 = 0;
            for (;;)
            {
              localObject1 = localObject2;
              if (i1 >= i2) {
                break;
              }
              localObject2[i1] = f.get(i1)).n;
              if (localObject2[i1] < 0) {
                a(new IllegalStateException("Failure saving state: active " + f.get(i1) + " has cleared index: " + localObject2[i1]));
              }
              if (a) {
                Log.v("FragmentManager", "saveAllState: adding fragment #" + i1 + ": " + f.get(i1));
              }
              i1 += 1;
            }
          }
        }
        localObject1 = null;
        localObject2 = localObject3;
        if (h != null)
        {
          i2 = h.size();
          localObject2 = localObject3;
          if (i2 > 0)
          {
            localObject3 = new d[i2];
            i1 = i3;
            for (;;)
            {
              localObject2 = localObject3;
              if (i1 >= i2) {
                break;
              }
              localObject3[i1] = new d((c)h.get(i1));
              if (a) {
                Log.v("FragmentManager", "saveAllState: adding back stack #" + i1 + ": " + h.get(i1));
              }
              i1 += 1;
            }
          }
        }
        localObject3 = new q();
        a = arrayOfr;
        b = ((int[])localObject1);
        c = ((d[])localObject2);
        return (Parcelable)localObject3;
      }
      label1062:
      localObject2 = null;
    }
  }
  
  public final void f(i parami)
  {
    if (a) {
      Log.v("FragmentManager", "detach: " + parami);
    }
    if (!I)
    {
      I = true;
      if (t)
      {
        if (f != null)
        {
          if (a) {
            Log.v("FragmentManager", "remove from detach: " + parami);
          }
          f.remove(parami);
        }
        if ((L) && (M)) {
          r = true;
        }
        t = false;
      }
    }
  }
  
  public final void g()
  {
    s = false;
    d = true;
    a(1, false);
    d = false;
  }
  
  public final void g(i parami)
  {
    if (a) {
      Log.v("FragmentManager", "attach: " + parami);
    }
    if (I)
    {
      I = false;
      if (!t)
      {
        if (f == null) {
          f = new ArrayList();
        }
        if (f.contains(parami)) {
          throw new IllegalStateException("Fragment already added: " + parami);
        }
        if (a) {
          Log.v("FragmentManager", "add from attach: " + parami);
        }
        f.add(parami);
        t = true;
        if ((L) && (M)) {
          r = true;
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
    s = true;
    d = true;
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
    t = true;
    c();
    d = true;
    a(0, false);
    d = false;
    n = null;
    o = null;
    p = null;
  }
  
  public final void o()
  {
    if (f != null)
    {
      int i1 = 0;
      while (i1 < f.size())
      {
        i locali = (i)f.get(i1);
        if (locali != null)
        {
          locali.onLowMemory();
          if (B != null) {
            B.o();
          }
        }
        i1 += 1;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (p != null) {
      android.support.v4.g.d.a(p, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      android.support.v4.g.d.a(n, localStringBuilder);
    }
  }
  
  static class a
    implements Animation.AnimationListener
  {
    private Animation.AnimationListener a;
    private boolean b;
    View c;
    
    public a(View paramView, Animation paramAnimation)
    {
      if ((paramView == null) || (paramAnimation == null)) {
        return;
      }
      c = paramView;
    }
    
    public a(View paramView, Animation paramAnimation, Animation.AnimationListener paramAnimationListener)
    {
      if ((paramView == null) || (paramAnimation == null)) {
        return;
      }
      a = paramAnimationListener;
      c = paramView;
      b = true;
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      if ((c != null) && (b))
      {
        if ((!android.support.v4.h.w.H(c)) && (!a.a())) {
          break label64;
        }
        c.post(new Runnable()
        {
          public final void run()
          {
            android.support.v4.h.w.d(c, 0);
          }
        });
      }
      for (;;)
      {
        if (a != null) {
          a.onAnimationEnd(paramAnimation);
        }
        return;
        label64:
        android.support.v4.h.w.d(c, 0);
      }
    }
    
    public void onAnimationRepeat(Animation paramAnimation)
    {
      if (a != null) {
        a.onAnimationRepeat(paramAnimation);
      }
    }
    
    public void onAnimationStart(Animation paramAnimation)
    {
      if (a != null) {
        a.onAnimationStart(paramAnimation);
      }
    }
  }
  
  static final class b
  {
    public static final int[] a = { 16842755, 16842960, 16842961 };
  }
  
  static abstract interface c
  {
    public abstract boolean a(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1);
  }
  
  private final class d
    implements o.c
  {
    final String a = null;
    final int b;
    final int c;
    
    d(int paramInt)
    {
      b = paramInt;
      c = 1;
    }
    
    public final boolean a(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1)
    {
      return a(paramArrayList, paramArrayList1, a, b, c);
    }
  }
  
  static final class e
    implements i.c
  {
    final boolean a;
    final c b;
    int c;
    
    e(c paramc, boolean paramBoolean)
    {
      a = paramBoolean;
      b = paramc;
    }
    
    public final void a()
    {
      c -= 1;
      if (c != 0) {
        return;
      }
      o.a(b.b);
    }
    
    public final void b()
    {
      c += 1;
    }
    
    public final void c()
    {
      boolean bool1 = false;
      int i;
      int j;
      if (c > 0)
      {
        i = 1;
        localo = b.b;
        int k = f.size();
        j = 0;
        label32:
        if (j >= k) {
          break label164;
        }
        localObject = (i)f.get(j);
        ((i)localObject).a(null);
        if ((i != 0) && (((i)localObject).C()))
        {
          if ((z != null) && (z.n != null)) {
            break label109;
          }
          up = false;
        }
      }
      for (;;)
      {
        j += 1;
        break label32;
        i = 0;
        break;
        label109:
        if (Looper.myLooper() != z.n.d.getLooper()) {
          z.n.d.postAtFrontOfQueue(new i.1((i)localObject));
        } else {
          ((i)localObject).r();
        }
      }
      label164:
      o localo = b.b;
      Object localObject = b;
      boolean bool2 = a;
      if (i == 0) {
        bool1 = true;
      }
      o.a(localo, (c)localObject, bool2, bool1, true);
    }
    
    public final void d()
    {
      o.a(b.b, b, a, false, false);
    }
  }
}


/* Location:              android/support/v4/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */