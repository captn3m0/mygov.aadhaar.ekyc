package android.support.v7.widget;

import android.support.v4.h.w;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class at$u
{
  private static final List o = Collections.EMPTY_LIST;
  public final View a;
  WeakReference b;
  int c;
  int d;
  long e;
  int f;
  int g;
  u h;
  u i;
  List j;
  List k;
  int l;
  at m;
  private int n;
  private int p;
  private at.m q;
  private boolean r;
  private int s;
  
  public at$u(View paramView)
  {
    c = i1;
    d = i1;
    long l1 = -1;
    e = l1;
    f = i1;
    g = i1;
    h = null;
    i = null;
    j = null;
    k = null;
    p = 0;
    q = null;
    r = false;
    s = 0;
    l = i1;
    if (paramView == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("itemView may not be null");
      throw localIllegalArgumentException;
    }
    a = paramView;
  }
  
  final void a()
  {
    int i1 = -1;
    d = i1;
    g = i1;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    int i1 = n;
    int i2 = paramInt2 ^ 0xFFFFFFFF;
    i1 &= i2;
    i2 = paramInt1 & paramInt2;
    i1 |= i2;
    n = i1;
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    int i1 = -1;
    int i2 = d;
    if (i2 == i1)
    {
      i2 = c;
      d = i2;
    }
    i2 = g;
    if (i2 == i1)
    {
      i2 = c;
      g = i2;
    }
    if (paramBoolean)
    {
      i2 = g + paramInt;
      g = i2;
    }
    i2 = c + paramInt;
    c = i2;
    Object localObject = a.getLayoutParams();
    if (localObject != null)
    {
      localObject = (at.h)a.getLayoutParams();
      i1 = 1;
      e = i1;
    }
  }
  
  final void a(at.m paramm, boolean paramBoolean)
  {
    q = paramm;
    r = paramBoolean;
  }
  
  final void a(Object paramObject)
  {
    int i1;
    if (paramObject == null)
    {
      i1 = 1024;
      b(i1);
    }
    for (;;)
    {
      return;
      i1 = n & 0x400;
      if (i1 == 0)
      {
        Object localObject = j;
        if (localObject == null)
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          j = ((List)localObject);
          localObject = Collections.unmodifiableList(j);
          k = ((List)localObject);
        }
        localObject = j;
        ((List)localObject).add(paramObject);
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean)
    {
      i1 = p + -1;
      p = i1;
      i1 = p;
      if (i1 >= 0) {
        break label80;
      }
      i1 = 0;
      p = 0;
      String str1 = "View";
      Object localObject = new java/lang/StringBuilder;
      String str2 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ";
      ((StringBuilder)localObject).<init>(str2);
      localObject = this;
      Log.e(str1, (String)localObject);
    }
    for (;;)
    {
      return;
      i1 = p + 1;
      break;
      label80:
      if (!paramBoolean)
      {
        i1 = p;
        int i2 = 1;
        if (i1 == i2)
        {
          i1 = n | 0x10;
          n = i1;
          continue;
        }
      }
      if (paramBoolean)
      {
        i1 = p;
        if (i1 == 0)
        {
          i1 = n & 0xFFFFFFEF;
          n = i1;
        }
      }
    }
  }
  
  final boolean a(int paramInt)
  {
    int i1 = n & paramInt;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  final void b(int paramInt)
  {
    int i1 = n | paramInt;
    n = i1;
  }
  
  final boolean b()
  {
    int i1 = n & 0x80;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final int c()
  {
    int i1 = g;
    int i2 = -1;
    if (i1 == i2) {}
    for (i1 = c;; i1 = g) {
      return i1;
    }
  }
  
  public final int d()
  {
    at localat = m;
    if (localat == null) {}
    for (int i1 = -1;; i1 = localat.c(this))
    {
      return i1;
      localat = m;
    }
  }
  
  final boolean e()
  {
    at.m localm = q;
    boolean bool;
    if (localm != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localm = null;
    }
  }
  
  final void f()
  {
    q.b(this);
  }
  
  final boolean g()
  {
    int i1 = n & 0x20;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  final void h()
  {
    int i1 = n & 0xFFFFFFDF;
    n = i1;
  }
  
  final void i()
  {
    int i1 = n & 0xFEFF;
    n = i1;
  }
  
  final boolean j()
  {
    int i1 = n & 0x4;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  final boolean k()
  {
    int i1 = n & 0x2;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  final boolean l()
  {
    int i1 = n & 0x1;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  final boolean m()
  {
    int i1 = n & 0x8;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  final boolean n()
  {
    int i1 = n & 0x100;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  final void o()
  {
    List localList = j;
    if (localList != null)
    {
      localList = j;
      localList.clear();
    }
    int i1 = n & 0xFBFF;
    n = i1;
  }
  
  final List p()
  {
    int i1 = n & 0x400;
    List localList;
    if (i1 == 0)
    {
      localList = j;
      if (localList != null)
      {
        localList = j;
        i1 = localList.size();
        if (i1 != 0) {}
      }
      else
      {
        localList = o;
      }
    }
    for (;;)
    {
      return localList;
      localList = k;
      continue;
      localList = o;
    }
  }
  
  final void q()
  {
    int i1 = -1;
    n = 0;
    c = i1;
    d = i1;
    e = -1;
    g = i1;
    p = 0;
    h = null;
    i = null;
    o();
    s = 0;
    l = i1;
    at.b(this);
  }
  
  public final boolean r()
  {
    int i1 = n & 0x10;
    View localView;
    boolean bool;
    if (i1 == 0)
    {
      localView = a;
      bool = w.b(localView);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  final boolean s()
  {
    int i1 = n & 0x2;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("ViewHolder{");
    Object localObject2 = Integer.toHexString(hashCode());
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" position=");
    int i1 = c;
    localObject1 = ((StringBuilder)localObject1).append(i1).append(" id=");
    long l1 = e;
    localObject1 = ((StringBuilder)localObject1).append(l1).append(", oldPos=");
    i1 = d;
    localObject1 = ((StringBuilder)localObject1).append(i1);
    localObject2 = ", pLpos:";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    i1 = g;
    localObject1 = i1;
    localStringBuilder.<init>((String)localObject1);
    boolean bool1 = e();
    boolean bool2;
    if (bool1)
    {
      localObject1 = " scrap ";
      localObject2 = localStringBuilder.append((String)localObject1);
      bool1 = r;
      if (bool1)
      {
        localObject1 = "[changeScrap]";
        ((StringBuilder)localObject2).append((String)localObject1);
      }
    }
    else
    {
      bool1 = j();
      if (bool1)
      {
        localObject1 = " invalid";
        localStringBuilder.append((String)localObject1);
      }
      bool1 = l();
      if (!bool1)
      {
        localObject1 = " unbound";
        localStringBuilder.append((String)localObject1);
      }
      bool1 = k();
      if (bool1)
      {
        localObject1 = " update";
        localStringBuilder.append((String)localObject1);
      }
      bool1 = m();
      if (bool1)
      {
        localObject1 = " removed";
        localStringBuilder.append((String)localObject1);
      }
      bool1 = b();
      if (bool1)
      {
        localObject1 = " ignored";
        localStringBuilder.append((String)localObject1);
      }
      bool1 = n();
      if (bool1)
      {
        localObject1 = " tmpDetached";
        localStringBuilder.append((String)localObject1);
      }
      bool1 = r();
      if (!bool1)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>(" not recyclable(");
        i1 = p;
        localObject1 = ((StringBuilder)localObject1).append(i1);
        localObject2 = ")";
        localObject1 = (String)localObject2;
        localStringBuilder.append((String)localObject1);
      }
      int i2 = n & 0x200;
      if (i2 == 0)
      {
        bool2 = j();
        if (!bool2) {
          break label406;
        }
      }
      bool2 = true;
    }
    for (;;)
    {
      if (bool2)
      {
        localObject1 = " undefined adapter position";
        localStringBuilder.append((String)localObject1);
      }
      localObject1 = a.getParent();
      if (localObject1 == null)
      {
        localObject1 = " no parent";
        localStringBuilder.append((String)localObject1);
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localObject1 = "[attachedScrap]";
      break;
      label406:
      bool2 = false;
      localObject1 = null;
    }
  }
}


/* Location:              android/support/v7/widget/at$u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */