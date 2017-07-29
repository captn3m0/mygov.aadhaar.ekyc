package android.support.v4.b;

import android.os.Build.VERSION;
import android.support.v4.g.e;
import android.util.Log;
import android.view.View;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class c
  extends s
  implements o.c
{
  static final boolean a;
  final o b;
  ArrayList c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  boolean j;
  boolean k;
  String l;
  boolean m;
  int n;
  int o;
  CharSequence p;
  int q;
  CharSequence r;
  ArrayList s;
  ArrayList t;
  boolean u;
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 21;
    if (i1 >= i2) {}
    for (i1 = 1;; i1 = 0)
    {
      a = i1;
      return;
    }
  }
  
  public c(o paramo)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    c = localArrayList;
    k = true;
    n = -1;
    u = false;
    b = paramo;
  }
  
  private int b(boolean paramBoolean)
  {
    boolean bool = m;
    Object localObject1;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("commit already called");
      throw ((Throwable)localObject1);
    }
    bool = o.a;
    if (bool)
    {
      Object localObject2 = new java/lang/StringBuilder;
      String str = "Commit: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = this;
      Log.v("FragmentManager", (String)localObject2);
      localObject1 = new android/support/v4/g/e;
      ((e)localObject1).<init>("FragmentManager");
      localObject2 = new java/io/PrintWriter;
      ((PrintWriter)localObject2).<init>((Writer)localObject1);
      localObject1 = "  ";
      a((String)localObject1, (PrintWriter)localObject2);
      ((PrintWriter)localObject2).close();
    }
    m = true;
    bool = j;
    int i1;
    if (bool)
    {
      localObject1 = b;
      i1 = ((o)localObject1).a(this);
    }
    for (n = i1;; n = i1)
    {
      b.a(this, paramBoolean);
      return n;
      i1 = -1;
    }
  }
  
  static boolean b(c.a parama)
  {
    i locali = b;
    boolean bool1 = t;
    boolean bool2;
    if (bool1)
    {
      View localView = P;
      if (localView != null)
      {
        bool1 = I;
        if (!bool1)
        {
          bool1 = H;
          if (!bool1)
          {
            bool2 = locali.C();
            if (bool2) {
              bool2 = true;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      locali = null;
    }
  }
  
  public final int a()
  {
    return b(false);
  }
  
  public final s a(i parami)
  {
    c.a locala = new android/support/v4/b/c$a;
    locala.<init>();
    a = 3;
    b = parami;
    a(locala);
    return this;
  }
  
  public final s a(i parami, String paramString)
  {
    Object localObject1 = parami.getClass();
    int i1 = ((Class)localObject1).getModifiers();
    boolean bool2 = ((Class)localObject1).isAnonymousClass();
    if (!bool2)
    {
      bool2 = Modifier.isPublic(i1);
      if (bool2)
      {
        bool2 = ((Class)localObject1).isMemberClass();
        if (!bool2) {
          break label103;
        }
        boolean bool1 = Modifier.isStatic(i1);
        if (bool1) {
          break label103;
        }
      }
    }
    Object localObject2 = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>("Fragment ");
    localObject1 = ((Class)localObject1).getCanonicalName();
    localObject1 = (String)localObject1 + " must be a public static class to be  properly recreated from instance state.";
    ((IllegalStateException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
    label103:
    localObject1 = b;
    z = ((o)localObject1);
    if (paramString != null)
    {
      localObject1 = G;
      if (localObject1 != null)
      {
        localObject1 = G;
        boolean bool3 = paramString.equals(localObject1);
        if (!bool3)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Can't change tag of fragment ");
          localObject2 = ((StringBuilder)localObject2).append(parami).append(": was ");
          localObject3 = G;
          localObject2 = (String)localObject3 + " now " + paramString;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      G = paramString;
    }
    localObject1 = new android/support/v4/b/c$a;
    ((c.a)localObject1).<init>();
    a = 1;
    b = parami;
    a((c.a)localObject1);
    return this;
  }
  
  final void a(int paramInt)
  {
    boolean bool1 = j;
    if (!bool1) {}
    for (;;)
    {
      return;
      bool1 = o.a;
      if (bool1)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Bump nesting in ");
        localObject2 = ((StringBuilder)localObject2).append(this);
        String str = " by ";
        localObject2 = str + paramInt;
        Log.v((String)localObject1, (String)localObject2);
      }
      int i2 = c.size();
      bool1 = false;
      Object localObject1 = null;
      int i3 = 0;
      Object localObject2 = null;
      while (i3 < i2)
      {
        localObject1 = (c.a)c.get(i3);
        Object localObject3 = b;
        if (localObject3 != null)
        {
          localObject3 = b;
          int i4 = y + paramInt;
          y = i4;
          boolean bool2 = o.a;
          if (bool2)
          {
            localObject3 = "FragmentManager";
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Bump nesting of ");
            Object localObject4 = b;
            localStringBuilder = localStringBuilder.append(localObject4);
            localObject4 = " to ";
            localStringBuilder = localStringBuilder.append((String)localObject4);
            i1 = b.y;
            localObject1 = i1;
            Log.v((String)localObject3, (String)localObject1);
          }
        }
        int i1 = i3 + 1;
        i3 = i1;
      }
    }
  }
  
  final void a(c.a parama)
  {
    c.add(parama);
    int i1 = d;
    c = i1;
    i1 = e;
    d = i1;
    i1 = f;
    e = i1;
    i1 = g;
    f = i1;
  }
  
  final void a(i.c paramc)
  {
    int i1 = 0;
    Object localObject = null;
    for (int i2 = 0;; i2 = i1)
    {
      localObject = c;
      i1 = ((ArrayList)localObject).size();
      if (i2 >= i1) {
        break;
      }
      localObject = (c.a)c.get(i2);
      boolean bool = b((c.a)localObject);
      if (bool)
      {
        localObject = b;
        ((i)localObject).a(paramc);
      }
      i1 = i2 + 1;
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
      localObject1 = l;
      paramPrintWriter.print((String)localObject1);
      paramPrintWriter.print(" mIndex=");
      int i1 = n;
      paramPrintWriter.print(i1);
      localObject1 = " mCommitted=";
      paramPrintWriter.print((String)localObject1);
      boolean bool1 = m;
      paramPrintWriter.println(bool1);
      int i2 = h;
      if (i2 != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        localObject1 = Integer.toHexString(h);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mTransitionStyle=#");
        i2 = i;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.println((String)localObject1);
      }
      i2 = d;
      if (i2 == 0)
      {
        i2 = e;
        if (i2 == 0) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        localObject1 = Integer.toHexString(d);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mExitAnim=#");
        i2 = e;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.println((String)localObject1);
      }
      i2 = f;
      if (i2 == 0)
      {
        i2 = g;
        if (i2 == 0) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        localObject1 = Integer.toHexString(f);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mPopExitAnim=#");
        i2 = g;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.println((String)localObject1);
      }
      i2 = o;
      if (i2 == 0)
      {
        localObject1 = p;
        if (localObject1 == null) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        i2 = o;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        localObject1 = p;
        paramPrintWriter.println(localObject1);
      }
      i2 = q;
      if (i2 == 0)
      {
        localObject1 = r;
        if (localObject1 == null) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        i2 = q;
        localObject1 = Integer.toHexString(i2);
        paramPrintWriter.print((String)localObject1);
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        localObject1 = r;
        paramPrintWriter.println(localObject1);
      }
    }
    Object localObject1 = c;
    boolean bool2 = ((ArrayList)localObject1).isEmpty();
    if (!bool2)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(paramString);
      Object localObject2 = "    ";
      ((StringBuilder)localObject1).append((String)localObject2);
      int i4 = c.size();
      bool2 = false;
      localObject1 = null;
      int i5 = 0;
      if (i5 < i4)
      {
        localObject1 = (c.a)c.get(i5);
        int i6 = a;
        String str;
        switch (i6)
        {
        default: 
          localObject2 = new java/lang/StringBuilder;
          str = "cmd=";
          ((StringBuilder)localObject2).<init>(str);
          int i7 = a;
          localObject2 = i7;
        }
        for (;;)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i5);
          str = ": ";
          paramPrintWriter.print(str);
          paramPrintWriter.print((String)localObject2);
          paramPrintWriter.print(" ");
          localObject2 = b;
          paramPrintWriter.println(localObject2);
          if (paramBoolean)
          {
            i6 = c;
            if (i6 == 0)
            {
              i6 = d;
              if (i6 == 0) {}
            }
            else
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              localObject2 = Integer.toHexString(c);
              paramPrintWriter.print((String)localObject2);
              paramPrintWriter.print(" exitAnim=#");
              i6 = d;
              localObject2 = Integer.toHexString(i6);
              paramPrintWriter.println((String)localObject2);
            }
            i6 = e;
            if (i6 == 0)
            {
              i6 = f;
              if (i6 == 0) {}
            }
            else
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              i6 = e;
              localObject2 = Integer.toHexString(i6);
              paramPrintWriter.print((String)localObject2);
              localObject2 = " popExitAnim=#";
              paramPrintWriter.print((String)localObject2);
              i3 = f;
              localObject1 = Integer.toHexString(i3);
              paramPrintWriter.println((String)localObject1);
            }
          }
          int i3 = i5 + 1;
          i5 = i3;
          break;
          localObject2 = "NULL";
          continue;
          localObject2 = "ADD";
          continue;
          localObject2 = "REPLACE";
          continue;
          localObject2 = "REMOVE";
          continue;
          localObject2 = "HIDE";
          continue;
          localObject2 = "SHOW";
          continue;
          localObject2 = "DETACH";
          continue;
          localObject2 = "ATTACH";
        }
      }
    }
  }
  
  final void a(ArrayList paramArrayList)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = 0;
    i locali1 = null;
    float f2 = 0.0F;
    Object localObject = c;
    int i3 = ((ArrayList)localObject).size();
    int i4;
    i locali2;
    int i6;
    int i7;
    float f3;
    if (i2 < i3)
    {
      localObject = (c.a)c.get(i2);
      i4 = a;
      switch (i4)
      {
      case 4: 
      case 5: 
      default: 
      case 1: 
      case 7: 
      case 3: 
      case 6: 
        for (;;)
        {
          i3 = i2 + 1;
          i2 = i3;
          break;
          localObject = b;
          paramArrayList.add(localObject);
          continue;
          localObject = b;
          paramArrayList.remove(localObject);
        }
      }
      locali2 = b;
      int i5 = F;
      i6 = paramArrayList.size() + -1;
      i7 = i2;
      i4 = 0;
      f3 = 0.0F;
      label179:
      if (i6 >= 0)
      {
        locali1 = (i)paramArrayList.get(i6);
        int i8 = F;
        if (i8 != i5) {
          break label422;
        }
        if (locali1 == locali2)
        {
          i2 = i1;
          f2 = f1;
          i4 = i7;
        }
      }
    }
    for (;;)
    {
      i6 += -1;
      i7 = i4;
      i4 = i2;
      f3 = f2;
      break label179;
      c.a locala = new android/support/v4/b/c$a;
      locala.<init>();
      a = 3;
      b = locali1;
      int i9 = c;
      c = i9;
      i9 = e;
      e = i9;
      i9 = d;
      d = i9;
      i9 = f;
      f = i9;
      ArrayList localArrayList = c;
      localArrayList.add(i7, locala);
      paramArrayList.remove(locali1);
      i2 = i7 + 1;
      int i10 = i4;
      i4 = i2;
      i2 = i10;
      f2 = f3;
      continue;
      if (i4 != 0)
      {
        localObject = c;
        ((ArrayList)localObject).remove(i7);
        i2 = i7 + -1;
        break;
      }
      a = i1;
      paramArrayList.add(locali2);
      i2 = i7;
      break;
      return;
      label422:
      i2 = i4;
      f2 = f3;
      i4 = i7;
    }
  }
  
  final void a(boolean paramBoolean)
  {
    Object localObject1 = c;
    int i1 = ((ArrayList)localObject1).size() + -1;
    int i2 = i1;
    Object localObject3;
    if (i2 >= 0)
    {
      localObject1 = (c.a)c.get(i2);
      Object localObject2 = b;
      int i3 = o.b(h);
      int i5 = i;
      ((i)localObject2).a(i3, i5);
      i3 = a;
      o localo;
      switch (i3)
      {
      case 2: 
      default: 
        localObject3 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Unknown cmd: ");
        i1 = a;
        localObject1 = i1;
        ((IllegalArgumentException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      case 1: 
        i3 = f;
        ((i)localObject2).a(i3);
        localo = b;
        localo.c((i)localObject2);
      }
      for (;;)
      {
        boolean bool2 = u;
        if (!bool2)
        {
          i1 = a;
          i4 = 3;
          if (i1 != i4)
          {
            localObject1 = b;
            ((o)localObject1).a((i)localObject2);
          }
        }
        i1 = i2 + -1;
        i2 = i1;
        break;
        int i4 = e;
        ((i)localObject2).a(i4);
        localo = b;
        i5 = 0;
        localo.a((i)localObject2, false);
        continue;
        i4 = e;
        ((i)localObject2).a(i4);
        o.e((i)localObject2);
        continue;
        i4 = f;
        ((i)localObject2).a(i4);
        o.d((i)localObject2);
        continue;
        i4 = e;
        ((i)localObject2).a(i4);
        localo = b;
        localo.g((i)localObject2);
        continue;
        i4 = f;
        ((i)localObject2).a(i4);
        localo = b;
        localo.f((i)localObject2);
      }
    }
    boolean bool1 = u;
    if ((!bool1) && (paramBoolean))
    {
      localObject1 = b;
      localObject3 = b;
      i2 = m;
      boolean bool3 = true;
      ((o)localObject1).a(i2, bool3);
    }
  }
  
  final boolean a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt2 == paramInt1)
    {
      bool = false;
      localObject1 = null;
      return bool;
    }
    Object localObject1 = c;
    int i2 = ((ArrayList)localObject1).size();
    int i3 = -1;
    int i4 = 0;
    label33:
    int i5;
    if (i4 < i2)
    {
      localObject1 = c.get(i4)).b;
      i5 = F;
      if ((i5 == 0) || (i5 == i3)) {
        break label210;
      }
      for (int i6 = paramInt1;; i6 = i1)
      {
        if (i6 >= paramInt2) {
          break label184;
        }
        localObject1 = (c)paramArrayList.get(i6);
        Object localObject2 = c;
        int i7 = ((ArrayList)localObject2).size();
        for (int i8 = 0;; i8 = i3)
        {
          if (i8 >= i7) {
            break label171;
          }
          localObject2 = c.get(i8)).b;
          i3 = F;
          if (i3 == i5)
          {
            bool = true;
            break;
          }
          i3 = i8 + 1;
        }
        label171:
        i1 = i6 + 1;
      }
    }
    label184:
    label210:
    for (int i1 = i5;; i1 = i3)
    {
      i4 += 1;
      i3 = i1;
      break label33;
      i1 = 0;
      localObject1 = null;
      break;
    }
  }
  
  public final boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    boolean bool = o.a;
    Object localObject2;
    if (bool)
    {
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      String str = "Run: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = this;
      Log.v((String)localObject1, (String)localObject2);
    }
    paramArrayList1.add(this);
    Object localObject1 = Boolean.valueOf(false);
    paramArrayList2.add(localObject1);
    bool = j;
    if (bool)
    {
      localObject1 = b;
      localObject2 = h;
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        h = ((ArrayList)localObject2);
      }
      localObject2 = h;
      ((ArrayList)localObject2).add(this);
      ((o)localObject1).d();
    }
    return true;
  }
  
  public final int b()
  {
    return b(true);
  }
  
  final void b(ArrayList paramArrayList)
  {
    int i1 = 0;
    Object localObject = null;
    int i2 = 0;
    localObject = c;
    i1 = ((ArrayList)localObject).size();
    if (i2 < i1)
    {
      localObject = (c.a)c.get(i2);
      int i3 = a;
      switch (i3)
      {
      }
      for (;;)
      {
        i1 = i2 + 1;
        i2 = i1;
        break;
        localObject = b;
        paramArrayList.remove(localObject);
        continue;
        localObject = b;
        paramArrayList.add(localObject);
      }
    }
  }
  
  final boolean b(int paramInt)
  {
    Object localObject = c;
    int i1 = ((ArrayList)localObject).size();
    int i2 = 0;
    int i3;
    if (i2 < i1)
    {
      localObject = c.get(i2)).b;
      i3 = F;
      if (i3 == paramInt) {
        i3 = 1;
      }
    }
    for (;;)
    {
      return i3;
      i3 = i2 + 1;
      i2 = i3;
      break;
      i3 = 0;
      localObject = null;
    }
  }
  
  final void c()
  {
    int i1 = 1;
    StringBuilder localStringBuilder = null;
    Object localObject1 = c;
    int i2 = ((ArrayList)localObject1).size();
    int i3 = 0;
    Object localObject2 = null;
    if (i3 < i2)
    {
      localObject1 = (c.a)c.get(i3);
      i locali = b;
      int i4 = h;
      int i6 = i;
      locali.a(i4, i6);
      i4 = a;
      int i7;
      o localo;
      switch (i4)
      {
      case 2: 
      default: 
        localObject2 = new java/lang/IllegalArgumentException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Unknown cmd: ");
        i7 = a;
        localObject1 = i7;
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      case 1: 
        i4 = c;
        locali.a(i4);
        localo = b;
        localo.a(locali, false);
      }
      for (;;)
      {
        boolean bool1 = u;
        if (!bool1)
        {
          i7 = a;
          if (i7 != i1)
          {
            localObject1 = b;
            ((o)localObject1).a(locali);
          }
        }
        int i8 = i3 + 1;
        i3 = i8;
        break;
        int i5 = d;
        locali.a(i5);
        localo = b;
        localo.c(locali);
        continue;
        i5 = d;
        locali.a(i5);
        o.d(locali);
        continue;
        i5 = c;
        locali.a(i5);
        o.e(locali);
        continue;
        i5 = d;
        locali.a(i5);
        localo = b;
        localo.f(locali);
        continue;
        i5 = c;
        locali.a(i5);
        localo = b;
        localo.g(locali);
      }
    }
    boolean bool2 = u;
    if (!bool2)
    {
      localObject1 = b;
      localObject2 = b;
      i3 = m;
      ((o)localObject1).a(i3, i1);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("BackStackEntry{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    int i1 = n;
    if (i1 >= 0)
    {
      str = " #";
      localStringBuilder.append(str);
      i1 = n;
      localStringBuilder.append(i1);
    }
    str = l;
    if (str != null)
    {
      localStringBuilder.append(" ");
      str = l;
      localStringBuilder.append(str);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/b/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */