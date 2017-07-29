package android.support.v4.b;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.g.d;
import android.support.v4.h.h;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class i
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final android.support.v4.g.k<String, Class<?>> a = new android.support.v4.g.k();
  static final Object j = new Object();
  m A;
  o B;
  p C;
  i D;
  int E;
  int F;
  String G;
  boolean H;
  boolean I;
  boolean J;
  boolean K;
  boolean L;
  boolean M = true;
  boolean N;
  ViewGroup O;
  View P;
  View Q;
  boolean R;
  boolean S = true;
  w T;
  boolean U;
  boolean V;
  a W;
  boolean X;
  boolean Y;
  float Z;
  int k = 0;
  Bundle l;
  SparseArray<Parcelable> m;
  int n = -1;
  String o;
  Bundle p;
  i q;
  int r = -1;
  int s;
  boolean t;
  protected boolean u;
  boolean v;
  boolean w;
  boolean x;
  int y;
  o z;
  
  public static i a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }
  
  public static i a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass2 = (Class)a.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass1);
      }
      paramContext = (i)localClass1.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        p = paramBundle;
      }
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new b("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new b("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new b("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
  }
  
  private void b()
  {
    if (A == null) {
      throw new IllegalStateException("Fragment has not been attached yet.");
    }
    B = new o();
    B.a(A, new k()
    {
      public final View a(int paramAnonymousInt)
      {
        if (P == null) {
          throw new IllegalStateException("Fragment does not have a view");
        }
        return P.findViewById(paramAnonymousInt);
      }
      
      public final boolean a()
      {
        return P != null;
      }
    }, this);
  }
  
  static boolean b(Context paramContext, String paramString)
  {
    try
    {
      Class localClass2 = (Class)a.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        a.put(paramString, localClass1);
      }
      boolean bool = i.class.isAssignableFrom(localClass1);
      return bool;
    }
    catch (ClassNotFoundException paramContext) {}
    return false;
  }
  
  public static void h() {}
  
  public static void i() {}
  
  public static void k() {}
  
  public static Animation l()
  {
    return null;
  }
  
  public static void m() {}
  
  public static void o() {}
  
  final View A()
  {
    if (W == null) {
      return null;
    }
    return W.a;
  }
  
  final int B()
  {
    if (W == null) {
      return 0;
    }
    return W.b;
  }
  
  final boolean C()
  {
    if (W == null) {
      return false;
    }
    return W.p;
  }
  
  final boolean D()
  {
    if (W == null) {
      return false;
    }
    return W.r;
  }
  
  public void a()
  {
    N = true;
  }
  
  final void a(int paramInt)
  {
    if ((W == null) && (paramInt == 0)) {
      return;
    }
    uc = paramInt;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    if ((W == null) && (paramInt1 == 0) && (paramInt2 == 0)) {
      return;
    }
    u();
    W.d = paramInt1;
    W.e = paramInt2;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void a(int paramInt, i parami)
  {
    n = paramInt;
    if (parami != null)
    {
      o = (o + ":" + n);
      return;
    }
    o = ("android:fragment:" + n);
  }
  
  public void a(Context paramContext)
  {
    N = true;
    if (A == null) {}
    for (paramContext = null;; paramContext = A.b)
    {
      if (paramContext != null)
      {
        N = false;
        N = true;
      }
      return;
    }
  }
  
  public void a(Bundle paramBundle)
  {
    int i = 1;
    N = true;
    e(paramBundle);
    if (B != null) {
      if (B.m <= 0) {
        break label41;
      }
    }
    for (;;)
    {
      if (i == 0) {
        B.g();
      }
      return;
      label41:
      i = 0;
    }
  }
  
  final void a(c paramc)
  {
    u();
    if (paramc == W.q) {}
    do
    {
      return;
      if ((paramc != null) && (W.q != null)) {
        throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
      }
      if (W.p) {
        W.q = paramc;
      }
    } while (paramc == null);
    paramc.b();
  }
  
  final void a(View paramView)
  {
    ua = paramView;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(E));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(F));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(G);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(k);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(n);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(o);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(y);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(t);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(u);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(v);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(w);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(H);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(I);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(M);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(L);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(J);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(K);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(S);
    if (z != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(z);
    }
    if (A != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(A);
    }
    if (D != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(D);
    }
    if (p != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(p);
    }
    if (l != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(l);
    }
    if (m != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(m);
    }
    if (q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(q);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(s);
    }
    if (v() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(v());
    }
    if (O != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(O);
    }
    if (P != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(P);
    }
    if (Q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(P);
    }
    if (A() != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(A());
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(B());
    }
    if (T != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      T.a(paramString + "  ", paramPrintWriter);
    }
    if (B != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Child " + B + ":");
      B.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  final void a(boolean paramBoolean)
  {
    ur = paramBoolean;
  }
  
  public LayoutInflater b(Bundle paramBundle)
  {
    paramBundle = A.c();
    if (B == null)
    {
      b();
      if (k < 5) {
        break label44;
      }
      B.j();
    }
    for (;;)
    {
      h.a(paramBundle, B);
      return paramBundle;
      label44:
      if (k >= 4) {
        B.i();
      } else if (k >= 2) {
        B.h();
      } else if (k > 0) {
        B.g();
      }
    }
  }
  
  final void b(int paramInt)
  {
    ub = paramInt;
  }
  
  public void c()
  {
    N = true;
    if (!U)
    {
      U = true;
      if (!V)
      {
        V = true;
        T = A.a(o, U);
      }
      if (T != null) {
        T.b();
      }
    }
  }
  
  public void c(Bundle paramBundle)
  {
    N = true;
  }
  
  public void d()
  {
    N = true;
  }
  
  public void d(Bundle paramBundle) {}
  
  public void e()
  {
    N = true;
  }
  
  final void e(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getParcelable("android:support:fragments");
      if (paramBundle != null)
      {
        if (B == null) {
          b();
        }
        B.a(paramBundle, C);
        C = null;
        B.g();
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  final void f(Bundle paramBundle)
  {
    d(paramBundle);
    if (B != null)
    {
      Parcelable localParcelable = B.f();
      if (localParcelable != null) {
        paramBundle.putParcelable("android:support:fragments", localParcelable);
      }
    }
  }
  
  final boolean f()
  {
    return y > 0;
  }
  
  public final j g()
  {
    if (A == null) {
      return null;
    }
    return (j)A.b;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final void j()
  {
    N = true;
    if (A == null) {}
    for (Activity localActivity = null;; localActivity = A.b)
    {
      if (localActivity != null)
      {
        N = false;
        N = true;
      }
      return;
    }
  }
  
  public void n()
  {
    N = true;
    if (!V)
    {
      V = true;
      T = A.a(o, U);
    }
    if (T != null) {
      T.g();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    N = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    g().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    N = true;
  }
  
  public final Object p()
  {
    if (W == null) {
      return null;
    }
    return W.f;
  }
  
  public final Object q()
  {
    if (W == null) {
      return null;
    }
    return W.h;
  }
  
  final void r()
  {
    c localc = null;
    if (W == null) {}
    for (;;)
    {
      if (localc != null) {
        localc.a();
      }
      return;
      W.p = false;
      localc = W.q;
      W.q = null;
    }
  }
  
  final View s()
  {
    if (B != null) {
      B.s = false;
    }
    return null;
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if (A == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    A.a(this, paramIntent, paramInt);
  }
  
  final void t()
  {
    if (B != null) {
      B.m();
    }
    k = 2;
    if (U)
    {
      U = false;
      if (!V)
      {
        V = true;
        T = A.a(o, U);
      }
      if (T != null)
      {
        if (!A.h) {
          break label87;
        }
        T.d();
      }
    }
    return;
    label87:
    T.c();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    d.a(this, localStringBuilder);
    if (n >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(n);
    }
    if (E != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(E));
    }
    if (G != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(G);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  final a u()
  {
    if (W == null) {
      W = new a();
    }
    return W;
  }
  
  final int v()
  {
    if (W == null) {
      return 0;
    }
    return W.c;
  }
  
  final int w()
  {
    if (W == null) {
      return 0;
    }
    return W.d;
  }
  
  final int x()
  {
    if (W == null) {
      return 0;
    }
    return W.e;
  }
  
  final ao y()
  {
    if (W == null) {
      return null;
    }
    return W.n;
  }
  
  final ao z()
  {
    if (W == null) {
      return null;
    }
    return W.o;
  }
  
  static final class a
  {
    View a;
    int b;
    int c;
    int d;
    int e;
    Object f = null;
    Object g = i.j;
    Object h = null;
    Object i = i.j;
    Object j = null;
    Object k = i.j;
    Boolean l;
    Boolean m;
    ao n = null;
    ao o = null;
    boolean p;
    i.c q;
    boolean r;
  }
  
  public static final class b
    extends RuntimeException
  {
    public b(String paramString, Exception paramException)
    {
      super(paramException);
    }
  }
  
  static abstract interface c
  {
    public abstract void a();
    
    public abstract void b();
  }
}


/* Location:              android/support/v4/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */