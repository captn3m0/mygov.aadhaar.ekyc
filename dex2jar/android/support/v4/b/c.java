package android.support.v4.b;

import android.os.Build.VERSION;
import android.support.v4.g.e;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class c
  extends s
  implements o.c
{
  static final boolean a;
  final o b;
  ArrayList<a> c = new ArrayList();
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  boolean j;
  boolean k = true;
  String l;
  boolean m;
  int n = -1;
  int o;
  CharSequence p;
  int q;
  CharSequence r;
  ArrayList<String> s;
  ArrayList<String> t;
  boolean u = false;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public c(o paramo)
  {
    b = paramo;
  }
  
  private int b(boolean paramBoolean)
  {
    if (m) {
      throw new IllegalStateException("commit already called");
    }
    if (o.a)
    {
      Log.v("FragmentManager", "Commit: " + this);
      PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
      a("  ", localPrintWriter);
      localPrintWriter.close();
    }
    m = true;
    if (j) {}
    for (n = b.a(this);; n = -1)
    {
      b.a(this, paramBoolean);
      return n;
    }
  }
  
  static boolean b(a parama)
  {
    parama = b;
    return (t) && (P != null) && (!I) && (!H) && (parama.C());
  }
  
  public final int a()
  {
    return b(false);
  }
  
  public final s a(i parami)
  {
    a locala = new a();
    a = 3;
    b = parami;
    a(locala);
    return this;
  }
  
  public final s a(i parami, String paramString)
  {
    Class localClass = parami.getClass();
    int i1 = localClass.getModifiers();
    if ((localClass.isAnonymousClass()) || (!Modifier.isPublic(i1)) || ((localClass.isMemberClass()) && (!Modifier.isStatic(i1)))) {
      throw new IllegalStateException("Fragment " + localClass.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }
    z = b;
    if (paramString != null)
    {
      if ((G != null) && (!paramString.equals(G))) {
        throw new IllegalStateException("Can't change tag of fragment " + parami + ": was " + G + " now " + paramString);
      }
      G = paramString;
    }
    paramString = new a();
    a = 1;
    b = parami;
    a(paramString);
    return this;
  }
  
  final void a(int paramInt)
  {
    if (!j) {}
    for (;;)
    {
      return;
      if (o.a) {
        Log.v("FragmentManager", "Bump nesting in " + this + " by " + paramInt);
      }
      int i2 = c.size();
      int i1 = 0;
      while (i1 < i2)
      {
        a locala = (a)c.get(i1);
        if (b != null)
        {
          i locali = b;
          y += paramInt;
          if (o.a) {
            Log.v("FragmentManager", "Bump nesting of " + b + " to " + b.y);
          }
        }
        i1 += 1;
      }
    }
  }
  
  final void a(a parama)
  {
    c.add(parama);
    c = d;
    d = e;
    e = f;
    f = g;
  }
  
  final void a(i.c paramc)
  {
    int i1 = 0;
    while (i1 < c.size())
    {
      a locala = (a)c.get(i1);
      if (b(locala)) {
        b.a(paramc);
      }
      i1 += 1;
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    a(paramString, paramPrintWriter, true);
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(l);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(n);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(m);
      if (h != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(h));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(i));
      }
      if ((d != 0) || (e != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(d));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(e));
      }
      if ((f != 0) || (g != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(f));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(g));
      }
      if ((o != 0) || (p != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(o));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(p);
      }
      if ((q != 0) || (r != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(q));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(r);
      }
    }
    if (!c.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      new StringBuilder().append(paramString).append("    ");
      int i2 = c.size();
      int i1 = 0;
      if (i1 < i2)
      {
        a locala = (a)c.get(i1);
        String str;
        switch (a)
        {
        default: 
          str = "cmd=" + a;
        }
        for (;;)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(b);
          if (paramBoolean)
          {
            if ((c != 0) || (d != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(c));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(d));
            }
            if ((e != 0) || (f != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(e));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(f));
            }
          }
          i1 += 1;
          break;
          str = "NULL";
          continue;
          str = "ADD";
          continue;
          str = "REPLACE";
          continue;
          str = "REMOVE";
          continue;
          str = "HIDE";
          continue;
          str = "SHOW";
          continue;
          str = "DETACH";
          continue;
          str = "ATTACH";
        }
      }
    }
  }
  
  final void a(ArrayList<i> paramArrayList)
  {
    int i1 = 0;
    a locala1;
    int i2;
    i locali1;
    int i3;
    label139:
    i locali2;
    int i4;
    if (i1 < c.size())
    {
      locala1 = (a)c.get(i1);
      i2 = i1;
      switch (a)
      {
      default: 
        i2 = i1;
      case 4: 
      case 5: 
      case 1: 
      case 7: 
      case 3: 
      case 6: 
        for (;;)
        {
          i1 = i2 + 1;
          break;
          paramArrayList.add(b);
          i2 = i1;
          continue;
          paramArrayList.remove(b);
          i2 = i1;
        }
      }
      locali1 = b;
      int i5 = F;
      i3 = paramArrayList.size() - 1;
      i2 = 0;
      if (i3 >= 0)
      {
        locali2 = (i)paramArrayList.get(i3);
        if (F != i5) {
          break label332;
        }
        if (locali2 == locali1)
        {
          i4 = 1;
          i2 = i1;
          i1 = i4;
        }
      }
    }
    for (;;)
    {
      i4 = i3 - 1;
      i3 = i2;
      i2 = i1;
      i1 = i3;
      i3 = i4;
      break label139;
      a locala2 = new a();
      a = 3;
      b = locali2;
      c = c;
      e = e;
      d = d;
      f = f;
      c.add(i1, locala2);
      paramArrayList.remove(locali2);
      i4 = i1 + 1;
      i1 = i2;
      i2 = i4;
      continue;
      if (i2 != 0)
      {
        c.remove(i1);
        i2 = i1 - 1;
        break;
      }
      a = 1;
      paramArrayList.add(locali1);
      i2 = i1;
      break;
      return;
      label332:
      i4 = i1;
      i1 = i2;
      i2 = i4;
    }
  }
  
  final void a(boolean paramBoolean)
  {
    int i1 = c.size() - 1;
    if (i1 >= 0)
    {
      a locala = (a)c.get(i1);
      i locali = b;
      locali.a(o.b(h), i);
      switch (a)
      {
      case 2: 
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + a);
      case 1: 
        locali.a(f);
        b.c(locali);
      }
      for (;;)
      {
        if ((!u) && (a != 3)) {
          b.a(locali);
        }
        i1 -= 1;
        break;
        locali.a(e);
        b.a(locali, false);
        continue;
        locali.a(e);
        o.e(locali);
        continue;
        locali.a(f);
        o.d(locali);
        continue;
        locali.a(e);
        b.g(locali);
        continue;
        locali.a(f);
        b.f(locali);
      }
    }
    if ((!u) && (paramBoolean)) {
      b.a(b.m, true);
    }
  }
  
  final boolean a(ArrayList<c> paramArrayList, int paramInt1, int paramInt2)
  {
    if (paramInt2 == paramInt1) {
      return false;
    }
    int i5 = c.size();
    int i1 = -1;
    int i2 = 0;
    if (i2 < i5)
    {
      int i4 = c.get(i2)).b.F;
      if ((i4 == 0) || (i4 == i1)) {
        break label160;
      }
      i1 = paramInt1;
      while (i1 < paramInt2)
      {
        c localc = (c)paramArrayList.get(i1);
        int i6 = c.size();
        int i3 = 0;
        while (i3 < i6)
        {
          if (c.get(i3)).b.F == i4) {
            return true;
          }
          i3 += 1;
        }
        i1 += 1;
      }
      i1 = i4;
    }
    label160:
    for (;;)
    {
      i2 += 1;
      break;
      return false;
    }
  }
  
  public final boolean a(ArrayList<c> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    if (o.a) {
      Log.v("FragmentManager", "Run: " + this);
    }
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.valueOf(false));
    if (j)
    {
      paramArrayList = b;
      if (h == null) {
        h = new ArrayList();
      }
      h.add(this);
      paramArrayList.d();
    }
    return true;
  }
  
  public final int b()
  {
    return b(true);
  }
  
  final void b(ArrayList<i> paramArrayList)
  {
    int i1 = 0;
    if (i1 < c.size())
    {
      a locala = (a)c.get(i1);
      switch (a)
      {
      }
      for (;;)
      {
        i1 += 1;
        break;
        paramArrayList.remove(b);
        continue;
        paramArrayList.add(b);
      }
    }
  }
  
  final boolean b(int paramInt)
  {
    int i2 = c.size();
    int i1 = 0;
    while (i1 < i2)
    {
      if (c.get(i1)).b.F == paramInt) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  final void c()
  {
    int i2 = c.size();
    int i1 = 0;
    if (i1 < i2)
    {
      a locala = (a)c.get(i1);
      i locali = b;
      locali.a(h, i);
      switch (a)
      {
      case 2: 
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + a);
      case 1: 
        locali.a(c);
        b.a(locali, false);
      }
      for (;;)
      {
        if ((!u) && (a != 1)) {
          b.a(locali);
        }
        i1 += 1;
        break;
        locali.a(d);
        b.c(locali);
        continue;
        locali.a(d);
        o.d(locali);
        continue;
        locali.a(c);
        o.e(locali);
        continue;
        locali.a(d);
        b.f(locali);
        continue;
        locali.a(c);
        b.g(locali);
      }
    }
    if (!u) {
      b.a(b.m, true);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (n >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(n);
    }
    if (l != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(l);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  static final class a
  {
    int a;
    i b;
    int c;
    int d;
    int e;
    int f;
  }
}


/* Location:              android/support/v4/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */