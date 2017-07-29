package android.support.v4.b;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.g.d;
import android.support.v4.g.k;
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
  private static final k a;
  static final Object j;
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
  boolean M;
  boolean N;
  ViewGroup O;
  View P;
  View Q;
  boolean R;
  boolean S;
  w T;
  boolean U;
  boolean V;
  i.a W;
  boolean X;
  boolean Y;
  float Z;
  int k = 0;
  Bundle l;
  SparseArray m;
  int n;
  String o;
  Bundle p;
  i q;
  int r;
  int s;
  boolean t;
  protected boolean u;
  boolean v;
  boolean w;
  boolean x;
  int y;
  o z;
  
  static
  {
    Object localObject = new android/support/v4/g/k;
    ((k)localObject).<init>();
    a = (k)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    j = localObject;
  }
  
  public i()
  {
    n = i;
    r = i;
    M = bool;
    S = bool;
  }
  
  public static i a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }
  
  public static i a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Object localObject1 = a;
      localObject1 = ((k)localObject1).get(paramString);
      localObject1 = (Class)localObject1;
      if (localObject1 == null)
      {
        localObject1 = paramContext.getClassLoader();
        localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
        localObject2 = a;
        ((k)localObject2).put(paramString, localObject1);
      }
      localObject1 = ((Class)localObject1).newInstance();
      localObject1 = (i)localObject1;
      if (paramBundle != null)
      {
        localObject2 = localObject1.getClass();
        localObject2 = ((Class)localObject2).getClassLoader();
        paramBundle.setClassLoader((ClassLoader)localObject2);
        p = paramBundle;
      }
      return (i)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = new android/support/v4/b/i$b;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Unable to instantiate fragment ");
      localObject3 = paramString + ": make sure class name exists, is public, and has an empty constructor that is public";
      ((i.b)localObject2).<init>((String)localObject3, localClassNotFoundException);
      throw ((Throwable)localObject2);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new android/support/v4/b/i$b;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Unable to instantiate fragment ");
      localObject3 = paramString + ": make sure class name exists, is public, and has an empty constructor that is public";
      ((i.b)localObject2).<init>((String)localObject3, localInstantiationException);
      throw ((Throwable)localObject2);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new android/support/v4/b/i$b;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Unable to instantiate fragment ");
      localObject3 = paramString + ": make sure class name exists, is public, and has an empty constructor that is public";
      ((i.b)localObject2).<init>((String)localObject3, localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
  }
  
  private void b()
  {
    Object localObject = A;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Fragment has not been attached yet.");
      throw ((Throwable)localObject);
    }
    localObject = new android/support/v4/b/o;
    ((o)localObject).<init>();
    B = ((o)localObject);
    localObject = B;
    m localm = A;
    i.2 local2 = new android/support/v4/b/i$2;
    local2.<init>(this);
    ((o)localObject).a(localm, local2, this);
  }
  
  static boolean b(Context paramContext, String paramString)
  {
    try
    {
      Object localObject1 = a;
      localObject1 = ((k)localObject1).get(paramString);
      localObject1 = (Class)localObject1;
      if (localObject1 == null)
      {
        localObject1 = paramContext.getClassLoader();
        localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
        localObject3 = a;
        ((k)localObject3).put(paramString, localObject1);
      }
      Object localObject3 = i.class;
      bool = ((Class)localObject3).isAssignableFrom((Class)localObject1);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
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
    Object localObject = W;
    if (localObject == null) {}
    for (localObject = null;; localObject = W.a) {
      return (View)localObject;
    }
  }
  
  final int B()
  {
    i.a locala = W;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = W;
      i = b;
    }
  }
  
  final boolean C()
  {
    i.a locala = W;
    boolean bool;
    if (locala == null)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = W;
      bool = p;
    }
  }
  
  final boolean D()
  {
    i.a locala = W;
    boolean bool;
    if (locala == null)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = W;
      bool = r;
    }
  }
  
  public void a()
  {
    N = true;
  }
  
  final void a(int paramInt)
  {
    i.a locala = W;
    if ((locala == null) && (paramInt == 0)) {}
    for (;;)
    {
      return;
      locala = u();
      c = paramInt;
    }
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    i.a locala = W;
    if ((locala == null) && (paramInt1 == 0) && (paramInt2 == 0)) {}
    for (;;)
    {
      return;
      u();
      W.d = paramInt1;
      locala = W;
      e = paramInt2;
    }
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  final void a(int paramInt, i parami)
  {
    n = paramInt;
    Object localObject;
    String str;
    int i;
    if (parami != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = o;
      localObject = ((StringBuilder)localObject).append(str);
      str = ":";
      localObject = ((StringBuilder)localObject).append(str);
      i = n;
      localObject = i;
    }
    for (o = ((String)localObject);; o = ((String)localObject))
    {
      return;
      localObject = new java/lang/StringBuilder;
      str = "android:fragment:";
      ((StringBuilder)localObject).<init>(str);
      i = n;
      localObject = i;
    }
  }
  
  public void a(Context paramContext)
  {
    boolean bool = true;
    N = bool;
    Object localObject = A;
    if (localObject == null) {}
    for (localObject = null;; localObject = A.b)
    {
      if (localObject != null)
      {
        localObject = null;
        N = false;
        N = bool;
      }
      return;
    }
  }
  
  public void a(Bundle paramBundle)
  {
    boolean bool = true;
    N = bool;
    e(paramBundle);
    o localo1 = B;
    if (localo1 != null)
    {
      localo1 = B;
      int i = m;
      if (i <= 0) {
        break label53;
      }
    }
    for (;;)
    {
      if (!bool)
      {
        localo2 = B;
        localo2.g();
      }
      return;
      label53:
      bool = false;
      o localo2 = null;
    }
  }
  
  final void a(i.c paramc)
  {
    u();
    Object localObject1 = W.q;
    if (paramc == localObject1) {}
    for (;;)
    {
      return;
      if (paramc != null)
      {
        localObject1 = W.q;
        if (localObject1 != null)
        {
          localObject1 = new java/lang/IllegalStateException;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Trying to set a replacement startPostponedEnterTransition on ");
          localObject2 = this;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      localObject1 = W;
      boolean bool = p;
      if (bool)
      {
        localObject1 = W;
        q = paramc;
      }
      if (paramc != null) {
        paramc.b();
      }
    }
  }
  
  final void a(View paramView)
  {
    ua = paramView;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    Object localObject1 = Integer.toHexString(E);
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mContainerId=#");
    localObject1 = Integer.toHexString(F);
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mTag=");
    localObject1 = G;
    paramPrintWriter.println((String)localObject1);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    int i = k;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mIndex=");
    i = n;
    paramPrintWriter.print(i);
    paramPrintWriter.print(" mWho=");
    localObject1 = o;
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print(" mBackStackNesting=");
    i = y;
    paramPrintWriter.println(i);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    boolean bool = t;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mRemoving=");
    bool = u;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mFromLayout=");
    bool = v;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mInLayout=");
    bool = w;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    bool = H;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mDetached=");
    bool = I;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mMenuVisible=");
    bool = M;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mHasMenu=");
    bool = L;
    paramPrintWriter.println(bool);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    bool = J;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mRetaining=");
    bool = K;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mUserVisibleHint=");
    bool = S;
    paramPrintWriter.println(bool);
    localObject1 = z;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      localObject1 = z;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = A;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      localObject1 = A;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = D;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      localObject1 = D;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = p;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      localObject1 = p;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = l;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      localObject1 = l;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = m;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      localObject1 = m;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = q;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      localObject1 = q;
      paramPrintWriter.print(localObject1);
      localObject1 = " mTargetRequestCode=";
      paramPrintWriter.print((String)localObject1);
      i1 = s;
      paramPrintWriter.println(i1);
    }
    int i1 = v();
    if (i1 != 0)
    {
      paramPrintWriter.print(paramString);
      localObject1 = "mNextAnim=";
      paramPrintWriter.print((String)localObject1);
      i1 = v();
      paramPrintWriter.println(i1);
    }
    localObject1 = O;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      localObject1 = O;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = P;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      localObject1 = P;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = Q;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      localObject1 = P;
      paramPrintWriter.println(localObject1);
    }
    localObject1 = A();
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      localObject1 = A();
      paramPrintWriter.println(localObject1);
      paramPrintWriter.print(paramString);
      localObject1 = "mStateAfterAnimating=";
      paramPrintWriter.print((String)localObject1);
      i1 = B();
      paramPrintWriter.println(i1);
    }
    localObject1 = T;
    Object localObject2;
    String str;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      localObject1 = T;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = "  ";
      localObject2 = str;
      ((w)localObject1).a((String)localObject2, paramPrintWriter);
    }
    localObject1 = B;
    if (localObject1 != null)
    {
      paramPrintWriter.print(paramString);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("Child ");
      localObject2 = B;
      localObject1 = localObject2 + ":";
      paramPrintWriter.println((String)localObject1);
      localObject1 = B;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString);
      str = "  ";
      localObject2 = str;
      ((o)localObject1).a((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  final void a(boolean paramBoolean)
  {
    ur = paramBoolean;
  }
  
  public LayoutInflater b(Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = A.c();
    o localo = B;
    int i;
    int i1;
    if (localo == null)
    {
      b();
      i = k;
      i1 = 5;
      if (i < i1) {
        break label58;
      }
      localo = B;
      localo.j();
    }
    for (;;)
    {
      localo = B;
      h.a(localLayoutInflater, localo);
      return localLayoutInflater;
      label58:
      i = k;
      i1 = 4;
      if (i >= i1)
      {
        localo = B;
        localo.i();
      }
      else
      {
        i = k;
        i1 = 2;
        if (i >= i1)
        {
          localo = B;
          localo.h();
        }
        else
        {
          i = k;
          if (i > 0)
          {
            localo = B;
            localo.g();
          }
        }
      }
    }
  }
  
  final void b(int paramInt)
  {
    ub = paramInt;
  }
  
  public void c()
  {
    boolean bool1 = true;
    N = bool1;
    boolean bool2 = U;
    if (!bool2)
    {
      U = bool1;
      bool2 = V;
      if (!bool2)
      {
        V = bool1;
        localObject = A;
        String str = o;
        boolean bool3 = U;
        localObject = ((m)localObject).a(str, bool3);
        T = ((w)localObject);
      }
      Object localObject = T;
      if (localObject != null)
      {
        localObject = T;
        ((w)localObject).b();
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
      Object localObject = paramBundle.getParcelable("android:support:fragments");
      if (localObject != null)
      {
        o localo = B;
        if (localo == null) {
          b();
        }
        localo = B;
        p localp = C;
        localo.a((Parcelable)localObject, localp);
        C = null;
        localObject = B;
        ((o)localObject).g();
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
    Object localObject = B;
    if (localObject != null)
    {
      localObject = B.f();
      if (localObject != null)
      {
        String str = "android:support:fragments";
        paramBundle.putParcelable(str, (Parcelable)localObject);
      }
    }
  }
  
  final boolean f()
  {
    int i = y;
    if (i > 0) {}
    int i1;
    for (i = 1;; i1 = 0) {
      return i;
    }
  }
  
  public final j g()
  {
    Object localObject = A;
    if (localObject == null) {}
    for (localObject = null;; localObject = (j)A.b) {
      return (j)localObject;
    }
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final void j()
  {
    boolean bool = true;
    N = bool;
    Object localObject = A;
    if (localObject == null) {}
    for (localObject = null;; localObject = A.b)
    {
      if (localObject != null)
      {
        localObject = null;
        N = false;
        N = bool;
      }
      return;
    }
  }
  
  public void n()
  {
    boolean bool1 = true;
    N = bool1;
    boolean bool2 = V;
    if (!bool2)
    {
      V = bool1;
      localObject = A;
      String str = o;
      boolean bool3 = U;
      localObject = ((m)localObject).a(str, bool3);
      T = ((w)localObject);
    }
    Object localObject = T;
    if (localObject != null)
    {
      localObject = T;
      ((w)localObject).g();
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
    Object localObject = W;
    if (localObject == null) {}
    for (localObject = null;; localObject = W.f) {
      return localObject;
    }
  }
  
  public final Object q()
  {
    Object localObject = W;
    if (localObject == null) {}
    for (localObject = null;; localObject = W.h) {
      return localObject;
    }
  }
  
  final void r()
  {
    Object localObject1 = null;
    Object localObject2 = W;
    if (localObject2 == null) {}
    for (;;)
    {
      if (localObject1 != null) {
        ((i.c)localObject1).a();
      }
      return;
      W.p = false;
      localObject2 = W.q;
      i.a locala = W;
      q = null;
      localObject1 = localObject2;
    }
  }
  
  final View s()
  {
    o localo = B;
    if (localo != null)
    {
      localo = B;
      s = false;
    }
    return null;
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    Object localObject1 = A;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Fragment ");
      localObject2 = this + " not attached to Activity";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    A.a(this, paramIntent, paramInt);
  }
  
  final void t()
  {
    Object localObject = B;
    if (localObject != null)
    {
      localObject = B;
      ((o)localObject).m();
    }
    k = 2;
    boolean bool1 = U;
    if (bool1)
    {
      localObject = null;
      U = false;
      bool1 = V;
      if (!bool1)
      {
        bool1 = true;
        V = bool1;
        localObject = A;
        String str = o;
        boolean bool2 = U;
        localObject = ((m)localObject).a(str, bool2);
        T = ((w)localObject);
      }
      localObject = T;
      if (localObject != null)
      {
        localObject = A;
        bool1 = h;
        if (!bool1) {
          break label117;
        }
        localObject = T;
        ((w)localObject).d();
      }
    }
    for (;;)
    {
      return;
      label117:
      localObject = T;
      ((w)localObject).c();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    d.a(this, localStringBuilder);
    int i = n;
    if (i >= 0)
    {
      str = " #";
      localStringBuilder.append(str);
      i = n;
      localStringBuilder.append(i);
    }
    i = E;
    if (i != 0)
    {
      localStringBuilder.append(" id=0x");
      i = E;
      str = Integer.toHexString(i);
      localStringBuilder.append(str);
    }
    String str = G;
    if (str != null)
    {
      localStringBuilder.append(" ");
      str = G;
      localStringBuilder.append(str);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  final i.a u()
  {
    i.a locala = W;
    if (locala == null)
    {
      locala = new android/support/v4/b/i$a;
      locala.<init>();
      W = locala;
    }
    return W;
  }
  
  final int v()
  {
    i.a locala = W;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = W;
      i = c;
    }
  }
  
  final int w()
  {
    i.a locala = W;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = W;
      i = d;
    }
  }
  
  final int x()
  {
    i.a locala = W;
    int i;
    if (locala == null)
    {
      i = 0;
      locala = null;
    }
    for (;;)
    {
      return i;
      locala = W;
      i = e;
    }
  }
  
  final ao y()
  {
    Object localObject = W;
    if (localObject == null) {}
    for (localObject = null;; localObject = W.n) {
      return (ao)localObject;
    }
  }
  
  final ao z()
  {
    Object localObject = W;
    if (localObject == null) {}
    for (localObject = null;; localObject = W.o) {
      return (ao)localObject;
    }
  }
}


/* Location:              android/support/v4/b/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */