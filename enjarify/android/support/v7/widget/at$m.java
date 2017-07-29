package android.support.v7.widget;

import android.support.v4.f.e;
import android.support.v4.h.b;
import android.support.v4.h.w;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class at$m
{
  final ArrayList a;
  ArrayList b;
  final ArrayList c;
  final List d;
  int e;
  int f;
  at.l g;
  at.s h;
  
  public at$m(at paramat)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    a = ((ArrayList)localObject);
    b = null;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((ArrayList)localObject);
    localObject = Collections.unmodifiableList(a);
    d = ((List)localObject);
    e = j;
    f = j;
  }
  
  private at.u a(long paramLong, int paramInt)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = a;
    int k = ((ArrayList)localObject2).size() + -1;
    int m = k;
    long l;
    if (m >= 0)
    {
      localObject2 = (at.u)a.get(m);
      l = e;
      boolean bool2 = l < paramLong;
      if (!bool2)
      {
        bool2 = ((at.u)localObject2).g();
        if (!bool2)
        {
          int n = f;
          if (paramInt == n)
          {
            ((at.u)localObject2).b(32);
            bool1 = ((at.u)localObject2).m();
            if (bool1)
            {
              localObject1 = i.F;
              bool1 = g;
              if (!bool1)
              {
                int j = 2;
                m = 14;
                ((at.u)localObject2).a(j, m);
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return (at.u)localObject2;
      a.remove(m);
      at localat = i;
      View localView = a;
      localat.removeDetachedView(localView, false);
      localObject2 = a;
      b((View)localObject2);
      k = m + -1;
      m = k;
      break;
      localObject2 = c;
      k = ((ArrayList)localObject2).size() + -1;
      for (m = k;; m = k)
      {
        if (m < 0) {
          break label317;
        }
        localObject2 = (at.u)c.get(m);
        l = e;
        boolean bool3 = l < paramLong;
        if (!bool3)
        {
          int i1 = f;
          if (paramInt == i1)
          {
            localObject1 = c;
            ((ArrayList)localObject1).remove(m);
            break;
          }
          c(m);
          k = 0;
          localObject2 = null;
          break;
        }
        k = m + -1;
      }
      label317:
      k = 0;
      localObject2 = null;
    }
  }
  
  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int j = 4;
    int k = paramViewGroup.getChildCount() + -1;
    Object localObject;
    for (int m = k; m >= 0; m = k)
    {
      localObject = paramViewGroup.getChildAt(m);
      boolean bool = localObject instanceof ViewGroup;
      if (bool)
      {
        localObject = (ViewGroup)localObject;
        bool = true;
        a((ViewGroup)localObject, bool);
      }
      k = m + -1;
    }
    if (!paramBoolean) {}
    for (;;)
    {
      return;
      k = paramViewGroup.getVisibility();
      if (k == j)
      {
        k = 0;
        localObject = null;
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(j);
      }
      else
      {
        k = paramViewGroup.getVisibility();
        paramViewGroup.setVisibility(j);
        paramViewGroup.setVisibility(k);
      }
    }
  }
  
  private at.u d(int paramInt)
  {
    int j = 32;
    int k = 0;
    Object localObject = b;
    int m;
    int n;
    if (localObject != null)
    {
      localObject = b;
      m = ((ArrayList)localObject).size();
      if (m != 0) {}
    }
    else
    {
      n = 0;
      localObject = null;
    }
    for (;;)
    {
      return (at.u)localObject;
      int i2 = 0;
      at.a locala = null;
      for (;;)
      {
        if (i2 >= m) {
          break label117;
        }
        localObject = (at.u)b.get(i2);
        boolean bool3 = ((at.u)localObject).g();
        if (!bool3)
        {
          int i3 = ((at.u)localObject).c();
          if (i3 == paramInt)
          {
            ((at.u)localObject).b(j);
            break;
          }
        }
        n = i2 + 1;
        i2 = n;
      }
      label117:
      localObject = i.l;
      boolean bool1 = e;
      if (bool1)
      {
        localObject = i.e;
        i1 = ((f)localObject).a(paramInt, 0);
        if (i1 > 0)
        {
          locala = i.l;
          i2 = locala.a();
          if (i1 < i2)
          {
            locala = i.l;
            long l1 = locala.a(i1);
            for (;;)
            {
              if (k >= m) {
                break label272;
              }
              localObject = (at.u)b.get(k);
              boolean bool2 = ((at.u)localObject).g();
              if (!bool2)
              {
                long l2 = e;
                bool2 = l2 < l1;
                if (!bool2)
                {
                  ((at.u)localObject).b(j);
                  break;
                }
              }
              i1 = k + 1;
              k = i1;
            }
          }
        }
      }
      label272:
      int i1 = 0;
      localObject = null;
    }
  }
  
  private at.u e(int paramInt)
  {
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    Object localObject3 = a;
    int m = ((ArrayList)localObject3).size();
    int i1 = 0;
    Object localObject4 = null;
    if (i1 < m)
    {
      localObject3 = (at.u)a.get(i1);
      boolean bool2 = ((at.u)localObject3).g();
      if (!bool2)
      {
        int i2 = ((at.u)localObject3).c();
        if (i2 == paramInt)
        {
          boolean bool3 = ((at.u)localObject3).j();
          if (!bool3)
          {
            at.r localr = i.F;
            bool3 = g;
            if (!bool3)
            {
              bool3 = ((at.u)localObject3).m();
              if (bool3) {}
            }
            else
            {
              j = 32;
              ((at.u)localObject3).b(j);
            }
          }
        }
      }
    }
    for (;;)
    {
      return (at.u)localObject3;
      int i4 = i1 + 1;
      i1 = i4;
      break;
      Object localObject5 = i.f;
      localObject3 = c;
      int i3 = ((List)localObject3).size();
      i1 = 0;
      localObject4 = null;
      label176:
      if (i1 < i3)
      {
        localObject3 = (View)c.get(i1);
        at.u localu = a.b((View)localObject3);
        int i5 = localu.c();
        if (i5 == paramInt)
        {
          boolean bool4 = localu.j();
          if (!bool4)
          {
            boolean bool5 = localu.m();
            if (!bool5) {
              localObject4 = localObject3;
            }
          }
        }
      }
      boolean bool1;
      for (;;)
      {
        if (localObject4 != null)
        {
          localObject3 = at.c((View)localObject4);
          localObject1 = i.f;
          localObject2 = a;
          k = ((ac.b)localObject2).a((View)localObject4);
          if (k < 0)
          {
            localObject3 = new java/lang/IllegalArgumentException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("view is not a child, cannot hide ");
            localObject1 = localObject4;
            ((IllegalArgumentException)localObject3).<init>((String)localObject1);
            throw ((Throwable)localObject3);
            i4 = i1 + 1;
            i1 = i4;
            break label176;
            i1 = 0;
            localObject4 = null;
            continue;
          }
          localObject5 = b;
          bool1 = ((ac.a)localObject5).c(k);
          if (!bool1)
          {
            localObject3 = new java/lang/RuntimeException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("trying to unhide a view that was not hidden");
            localObject1 = localObject4;
            ((RuntimeException)localObject3).<init>((String)localObject1);
            throw ((Throwable)localObject3);
          }
          localObject5 = b;
          ((ac.a)localObject5).b(k);
          ((ac)localObject1).b((View)localObject4);
          localObject1 = i.f;
          j = ((ac)localObject1).c((View)localObject4);
          k = -1;
          if (j == k)
          {
            localObject1 = new java/lang/IllegalStateException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("layout index should not be -1 after unhiding a view:");
            localObject3 = localObject3;
            ((IllegalStateException)localObject1).<init>((String)localObject3);
            throw ((Throwable)localObject1);
          }
          localObject2 = i.f;
          ((ac)localObject2).d(j);
          c((View)localObject4);
          j = 8224;
          ((at.u)localObject3).b(j);
          break;
        }
      }
      localObject3 = c;
      i1 = ((ArrayList)localObject3).size();
      for (;;)
      {
        if (k >= i1) {
          break label608;
        }
        localObject3 = (at.u)c.get(k);
        bool1 = ((at.u)localObject3).j();
        if (!bool1)
        {
          int n = ((at.u)localObject3).c();
          if (n == paramInt)
          {
            localObject1 = c;
            ((ArrayList)localObject1).remove(k);
            break;
          }
        }
        i4 = k + 1;
        k = i4;
      }
      label608:
      i4 = 0;
      localObject3 = null;
    }
  }
  
  public final int a(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject1 = i.F;
      int j = ((at.r)localObject1).a();
      if (paramInt < j) {}
    }
    else
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("invalid position ");
      localObject2 = ((StringBuilder)localObject2).append(paramInt).append(". State item count is ");
      int k = i.F.a();
      localObject2 = k;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = i.F;
    boolean bool = g;
    if (!bool) {}
    for (;;)
    {
      return paramInt;
      localObject1 = i.e;
      paramInt = ((f)localObject1).b(paramInt);
    }
  }
  
  final at.u a(int paramInt, long paramLong)
  {
    if (paramInt >= 0)
    {
      localObject1 = i.F;
      j = ((at.r)localObject1).a();
      if (paramInt < j) {}
    }
    else
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Invalid item position ");
      localObject2 = ((StringBuilder)localObject2).append(paramInt).append("(").append(paramInt).append("). Item count:");
      n = i.F.a();
      localObject2 = n;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int j = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int n = 0;
    Object localObject3 = null;
    Object localObject2 = i.F;
    boolean bool3 = g;
    label199:
    Object localObject4;
    boolean bool8;
    Object localObject5;
    if (bool3)
    {
      localObject3 = d(paramInt);
      if (localObject3 != null)
      {
        j = 1;
        f1 = Float.MIN_VALUE;
      }
    }
    else if (localObject3 == null)
    {
      localObject3 = e(paramInt);
      if (localObject3 != null)
      {
        bool3 = ((at.u)localObject3).m();
        if (!bool3) {
          break label405;
        }
        localObject2 = i.F;
        bool3 = g;
        if (bool3) {
          break label656;
        }
        ((at.u)localObject3).b(4);
        bool3 = ((at.u)localObject3).e();
        if (!bool3) {
          break label636;
        }
        localObject2 = i;
        localObject4 = a;
        bool8 = false;
        localObject5 = null;
        ((at)localObject2).removeDetachedView((View)localObject4, false);
        ((at.u)localObject3).f();
        label254:
        a((at.u)localObject3);
        n = 0;
        localObject3 = null;
      }
    }
    label405:
    long l1;
    long l2;
    label636:
    label656:
    int i5;
    boolean bool1;
    long l3;
    label1091:
    label1112:
    Object localObject6;
    for (;;)
    {
      if (localObject3 == null)
      {
        localObject2 = i.e;
        int i2 = ((f)localObject2).b(paramInt);
        int i4;
        if (i2 >= 0)
        {
          localObject4 = i.l;
          i8 = ((at.a)localObject4).a();
          if (i2 < i8) {}
        }
        else
        {
          localObject1 = new java/lang/IndexOutOfBoundsException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Inconsistency detected. Invalid item position ");
          localObject2 = ((StringBuilder)localObject3).append(paramInt).append("(offset:").append(i2).append(").state:");
          n = i.F.a();
          localObject2 = n;
          ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          j = 0;
          f1 = 0.0F;
          localObject1 = null;
          break;
          i2 = c;
          if (i2 >= 0)
          {
            i2 = c;
            localObject4 = i.l;
            i8 = ((at.a)localObject4).a();
            if (i2 < i8) {}
          }
          else
          {
            localObject1 = new java/lang/IndexOutOfBoundsException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("Inconsistency detected. Invalid view holder adapter position");
            localObject2 = localObject3;
            ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
          localObject2 = i.F;
          boolean bool4 = g;
          if (!bool4)
          {
            localObject2 = i.l;
            i8 = c;
            int i3 = ((at.a)localObject2).b(i8);
            i8 = f;
            if (i3 != i8)
            {
              i3 = 0;
              localObject2 = null;
              break label199;
            }
          }
          localObject2 = i.l;
          i4 = e;
          if (i4 != 0)
          {
            l1 = e;
            localObject2 = i.l;
            i8 = c;
            l2 = ((at.a)localObject2).a(i8);
            i4 = l1 < l2;
            if (i4 != 0)
            {
              i4 = 0;
              localObject2 = null;
              break label199;
            }
          }
          i4 = 1;
          break label199;
          i4 = ((at.u)localObject3).g();
          if (i4 == 0) {
            break label254;
          }
          ((at.u)localObject3).h();
          break label254;
          j = 1;
          f1 = Float.MIN_VALUE;
          continue;
        }
        localObject4 = i.l;
        i8 = ((at.a)localObject4).b(i4);
        localObject5 = i.l;
        bool8 = e;
        if (bool8)
        {
          l1 = i.l.a(i4);
          localObject3 = a(l1, i8);
          if (localObject3 != null)
          {
            c = i4;
            j = 1;
            f1 = Float.MIN_VALUE;
            i5 = j;
            if (localObject3 == null)
            {
              localObject1 = h;
              if (localObject1 != null)
              {
                localObject1 = h.a();
                if (localObject1 != null)
                {
                  localObject3 = i.a((View)localObject1);
                  if (localObject3 == null)
                  {
                    localObject1 = new java/lang/IllegalArgumentException;
                    ((IllegalArgumentException)localObject1).<init>("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    throw ((Throwable)localObject1);
                  }
                  bool1 = ((at.u)localObject3).b();
                  if (bool1)
                  {
                    localObject1 = new java/lang/IllegalArgumentException;
                    ((IllegalArgumentException)localObject1).<init>("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    throw ((Throwable)localObject1);
                  }
                }
              }
            }
            int i1;
            if (localObject3 == null)
            {
              localObject1 = (at.l.a)da.get(i8);
              if (localObject1 == null) {
                break label1091;
              }
              localObject3 = a;
              boolean bool2 = ((ArrayList)localObject3).isEmpty();
              if (bool2) {
                break label1091;
              }
              localObject1 = a;
              i1 = ((ArrayList)localObject1).size() + -1;
              localObject1 = (at.u)((ArrayList)localObject1).remove(i1);
              localObject3 = localObject1;
              if (localObject3 != null)
              {
                ((at.u)localObject3).q();
                bool1 = at.a;
                if (bool1)
                {
                  localObject1 = a;
                  bool1 = localObject1 instanceof ViewGroup;
                  if (bool1)
                  {
                    localObject1 = (ViewGroup)a;
                    bool8 = false;
                    localObject5 = null;
                    a((ViewGroup)localObject1, false);
                  }
                }
              }
            }
            if (localObject3 == null)
            {
              localObject1 = i;
              l1 = ((at)localObject1).getNanoTime();
              l2 = Long.MAX_VALUE;
              bool1 = paramLong < l2;
              if (bool1)
              {
                localObject1 = g.a(i8);
                l2 = c;
                l3 = 0L;
                bool1 = l2 < l3;
                if (bool1)
                {
                  l2 += l1;
                  bool1 = l2 < paramLong;
                  if (!bool1) {}
                }
                else
                {
                  bool1 = true;
                  f1 = Float.MIN_VALUE;
                }
                for (;;)
                {
                  if (bool1) {
                    break label1112;
                  }
                  bool1 = false;
                  f1 = 0.0F;
                  localObject1 = null;
                  return (at.u)localObject1;
                  i1 = 0;
                  localObject3 = null;
                  break;
                  bool1 = false;
                  f1 = 0.0F;
                  localObject1 = null;
                }
              }
              localObject1 = i.l;
              localObject3 = i;
              localObject6 = "RV CreateView";
              e.a((String)localObject6);
              localObject3 = ((at.a)localObject1).a((ViewGroup)localObject3, i8);
              f = i8;
              e.a();
              bool1 = at.p();
              if (bool1)
              {
                localObject1 = at.f(a);
                if (localObject1 != null)
                {
                  localObject6 = new java/lang/ref/WeakReference;
                  ((WeakReference)localObject6).<init>(localObject1);
                  b = ((WeakReference)localObject6);
                }
              }
              l2 = i.getNanoTime();
              localObject1 = g;
              l1 = l2 - l1;
              localObject1 = ((at.l)localObject1).a(i8);
              l2 = c;
              l1 = at.l.a(l2, l1);
              c = l1;
            }
          }
        }
      }
    }
    label1502:
    int m;
    for (int i8 = i5;; i8 = m)
    {
      if (i8 != 0)
      {
        localObject1 = i.F;
        bool1 = g;
        if (!bool1)
        {
          f1 = 1.14794E-41F;
          bool1 = ((at.u)localObject3).a(8192);
          if (bool1)
          {
            f1 = 0.0F;
            i5 = 8192;
            ((at.u)localObject3).a(0, i5);
            localObject1 = i.F;
            bool1 = j;
            if (bool1)
            {
              at.e.d((at.u)localObject3);
              localObject1 = i.B;
              localObject1 = i.F;
              ((at.u)localObject3).p();
              localObject1 = new android/support/v7/widget/at$e$b;
              ((at.e.b)localObject1).<init>();
              localObject1 = ((at.e.b)localObject1).a((at.u)localObject3);
              localObject2 = i;
              ((at)localObject2).a((at.u)localObject3, (at.e.b)localObject1);
            }
          }
        }
      }
      bool1 = false;
      f1 = 0.0F;
      localObject1 = null;
      localObject2 = i.F;
      boolean bool5 = g;
      if (bool5)
      {
        bool5 = ((at.u)localObject3).l();
        if (bool5)
        {
          g = paramInt;
          bool5 = false;
          localObject2 = null;
        }
      }
      for (;;)
      {
        localObject1 = a.getLayoutParams();
        if (localObject1 == null)
        {
          localObject1 = (at.h)i.generateDefaultLayoutParams();
          localObject5 = a;
          ((View)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject1);
          c = ((at.u)localObject3);
          if ((i8 == 0) || (!bool5)) {
            break label2099;
          }
          bool5 = true;
        }
        for (;;)
        {
          f = bool5;
          localObject1 = localObject3;
          break;
          bool5 = ((at.u)localObject3).l();
          if (bool5)
          {
            bool5 = ((at.u)localObject3).k();
            if (!bool5)
            {
              bool5 = ((at.u)localObject3).j();
              if (!bool5) {
                break label2108;
              }
            }
          }
          int i6 = i.e.b(paramInt);
          localObject1 = i;
          m = ((at)localObject1);
          int k = f;
          localObject5 = i;
          l1 = ((at)localObject5).getNanoTime();
          l2 = Long.MAX_VALUE;
          int i9 = paramLong < l2;
          if (i9 != 0)
          {
            localObject6 = g;
            localObject1 = ((at.l)localObject6).a(k);
            l2 = d;
            l3 = 0L;
            m = l2 < l3;
            if (m != 0)
            {
              l2 += l1;
              m = l2 < paramLong;
              if (m >= 0) {}
            }
            else
            {
              m = 1;
              f1 = Float.MIN_VALUE;
              label1696:
              if (m != 0) {
                break label1729;
              }
              m = 0;
              f1 = 0.0F;
              localObject1 = null;
            }
          }
          for (;;)
          {
            i6 = m;
            break;
            m = 0;
            f1 = 0.0F;
            localObject1 = null;
            break label1696;
            label1729:
            localObject1 = i.l;
            c = i6;
            i9 = e;
            if (i9 != 0)
            {
              l2 = ((at.a)localObject1).a(i6);
              e = l2;
            }
            i9 = 1;
            int i10 = 519;
            ((at.u)localObject3).a(i9, i10);
            localObject6 = "RV OnBindView";
            e.a((String)localObject6);
            ((at.u)localObject3).p();
            ((at.a)localObject1).a((at.u)localObject3, i6);
            ((at.u)localObject3).o();
            localObject1 = a.getLayoutParams();
            boolean bool6 = localObject1 instanceof at.h;
            if (bool6)
            {
              localObject1 = (at.h)localObject1;
              bool6 = true;
              e = bool6;
            }
            e.a();
            long l4 = i.getNanoTime();
            localObject6 = g;
            i10 = f;
            l4 -= l1;
            localObject5 = ((at.l)localObject6).a(i10);
            l2 = d;
            l4 = at.l.a(l2, l4);
            d = l4;
            localObject1 = a;
            localObject2 = i;
            bool6 = ((at)localObject2).j();
            if (bool6)
            {
              int i7 = w.d((View)localObject1);
              if (i7 == 0)
              {
                i7 = 1;
                w.c((View)localObject1, i7);
              }
              bool7 = w.a((View)localObject1);
              if (!bool7)
              {
                localObject2 = i.J.c;
                w.a((View)localObject1, (b)localObject2);
              }
            }
            localObject1 = i.F;
            m = g;
            if (m != 0) {
              g = paramInt;
            }
            m = 1;
            f1 = Float.MIN_VALUE;
          }
          localObject5 = i;
          bool8 = ((at)localObject5).checkLayoutParams((ViewGroup.LayoutParams)localObject1);
          if (!bool8)
          {
            localObject1 = (at.h)i.generateLayoutParams((ViewGroup.LayoutParams)localObject1);
            localObject5 = a;
            ((View)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject1);
            break label1502;
          }
          localObject1 = (at.h)localObject1;
          break label1502;
          label2099:
          bool7 = false;
          localObject2 = null;
        }
        label2108:
        bool7 = false;
        localObject2 = null;
      }
      boolean bool7 = m;
      break;
    }
  }
  
  public final void a()
  {
    a.clear();
    c();
  }
  
  final void a(at.u paramu)
  {
    int j = 1;
    int k = 0;
    boolean bool1 = paramu.e();
    Object localObject2;
    if (!bool1)
    {
      localObject1 = a.getParent();
      if (localObject1 == null) {}
    }
    else
    {
      localObject2 = new java/lang/IllegalArgumentException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("Scrapped or attached views may not be recycled. isScrap:");
      bool4 = paramu.e();
      StringBuilder localStringBuilder = ((StringBuilder)localObject1).append(bool4).append(" isAttached:");
      localObject1 = a.getParent();
      if (localObject1 != null) {
        bool1 = j;
      }
      for (;;)
      {
        localObject1 = bool1;
        ((IllegalArgumentException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
        bool1 = false;
        localObject1 = null;
      }
    }
    bool1 = paramu.n();
    Object localObject3;
    if (bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
      localObject3 = paramu;
      ((IllegalArgumentException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    bool1 = paramu.b();
    if (bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
      throw ((Throwable)localObject1);
    }
    boolean bool4 = at.u.a(paramu);
    Object localObject1 = i.l;
    if ((localObject1 != null) && (bool4)) {
      localObject1 = i.l;
    }
    bool1 = paramu.r();
    int i1;
    if (bool1)
    {
      int m = f;
      if (m > 0)
      {
        boolean bool2 = paramu.a(526);
        if (!bool2)
        {
          localObject1 = c;
          int n = ((ArrayList)localObject1).size();
          int i2 = f;
          if ((n >= i2) && (n > 0))
          {
            c(0);
            n += -1;
          }
          int i3 = at.p();
          if ((i3 != 0) && (n > 0))
          {
            localObject2 = i.E;
            int i4 = c;
            i3 = ((ak.a)localObject2).a(i4);
            if (i3 == 0)
            {
              n += -1;
              for (i3 = n; i3 >= 0; i3 = i1)
              {
                localObject1 = (at.u)c.get(i3);
                n = c;
                ak.a locala = i.E;
                boolean bool3 = locala.a(n);
                if (!bool3) {
                  break;
                }
                i1 = i3 + -1;
              }
              i1 = i3 + 1;
            }
          }
          localObject2 = c;
          ((ArrayList)localObject2).add(i1, paramu);
          i1 = j;
          if (i1 == 0)
          {
            a(paramu, j);
            k = j;
          }
        }
      }
    }
    for (;;)
    {
      localObject3 = i.g;
      ((bj)localObject3).d(paramu);
      if ((i1 == 0) && (k == 0) && (bool4))
      {
        i1 = 0;
        localObject1 = null;
        m = null;
      }
      return;
      i1 = 0;
      localObject1 = null;
      break;
      i1 = 0;
      localObject1 = null;
    }
  }
  
  final void a(at.u paramu, boolean paramBoolean)
  {
    int j = 0;
    at.b(paramu);
    Object localObject = a;
    w.a((View)localObject, null);
    if (paramBoolean)
    {
      localObject = i.n;
      if (localObject != null) {
        localObject = i.n;
      }
      localObject = i.l;
      if (localObject != null)
      {
        localObject = i.l;
        ((at.a)localObject).a(paramu);
      }
      localObject = i.F;
      if (localObject != null)
      {
        localObject = i.g;
        ((bj)localObject).d(paramu);
      }
    }
    m = null;
    localObject = d();
    j = f;
    ArrayList localArrayList = aa;
    localObject = (at.l.a)a.get(j);
    int k = b;
    j = localArrayList.size();
    if (k > j)
    {
      paramu.q();
      localArrayList.add(paramu);
    }
  }
  
  public final void a(View paramView)
  {
    at.u localu = at.c(paramView);
    boolean bool = localu.n();
    if (bool)
    {
      at localat = i;
      localat.removeDetachedView(paramView, false);
    }
    bool = localu.e();
    if (bool) {
      localu.f();
    }
    for (;;)
    {
      a(localu);
      return;
      bool = localu.g();
      if (bool) {
        localu.h();
      }
    }
  }
  
  public final View b(int paramInt)
  {
    return aMAX_VALUEa;
  }
  
  final void b()
  {
    Object localObject = i.m;
    int j;
    if (localObject != null)
    {
      localObject = i.m;
      j = z;
    }
    for (;;)
    {
      int k = e;
      j += k;
      f = j;
      localObject = c;
      j = ((ArrayList)localObject).size() + -1;
      while (j >= 0)
      {
        ArrayList localArrayList = c;
        k = localArrayList.size();
        int m = f;
        if (k <= m) {
          break;
        }
        c(j);
        j += -1;
      }
      j = 0;
      localObject = null;
    }
  }
  
  final void b(at.u paramu)
  {
    boolean bool = at.u.d(paramu);
    ArrayList localArrayList;
    if (bool)
    {
      localArrayList = b;
      localArrayList.remove(paramu);
    }
    for (;;)
    {
      at.u.b(paramu);
      at.u.c(paramu);
      paramu.h();
      return;
      localArrayList = a;
      localArrayList.remove(paramu);
    }
  }
  
  final void b(View paramView)
  {
    at.u localu = at.c(paramView);
    at.u.b(localu);
    at.u.c(localu);
    localu.h();
    a(localu);
  }
  
  final void c()
  {
    Object localObject = c;
    int j = ((ArrayList)localObject).size() + -1;
    while (j >= 0)
    {
      c(j);
      j += -1;
    }
    localObject = c;
    ((ArrayList)localObject).clear();
    boolean bool = at.p();
    if (bool)
    {
      localObject = i.E;
      ((ak.a)localObject).a();
    }
  }
  
  final void c(int paramInt)
  {
    at.u localu = (at.u)c.get(paramInt);
    a(localu, true);
    c.remove(paramInt);
  }
  
  final void c(View paramView)
  {
    boolean bool1 = true;
    at.u localu = at.c(paramView);
    boolean bool2 = localu.a(12);
    Object localObject1;
    if (!bool2)
    {
      bool2 = localu.s();
      if (bool2)
      {
        localObject1 = i;
        Object localObject2 = B;
        if (localObject2 != null)
        {
          localObject1 = B;
          localObject2 = localu.p();
          bool2 = ((at.e)localObject1).a(localu, (List)localObject2);
          if (!bool2) {
            break label144;
          }
        }
        bool2 = bool1;
      }
    }
    while (bool2)
    {
      bool2 = localu.j();
      if (bool2)
      {
        bool2 = localu.m();
        if (!bool2)
        {
          localObject1 = i.l;
          bool2 = e;
          if (!bool2)
          {
            localObject1 = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject1).<init>("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            throw ((Throwable)localObject1);
            label144:
            bool2 = false;
            localObject1 = null;
            continue;
          }
        }
      }
      localu.a(this, false);
      localObject1 = a;
      ((ArrayList)localObject1).add(localu);
    }
    for (;;)
    {
      return;
      localObject1 = b;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        b = ((ArrayList)localObject1);
      }
      localu.a(this, bool1);
      localObject1 = b;
      ((ArrayList)localObject1).add(localu);
    }
  }
  
  final at.l d()
  {
    at.l locall = g;
    if (locall == null)
    {
      locall = new android/support/v7/widget/at$l;
      locall.<init>();
      g = locall;
    }
    return g;
  }
}


/* Location:              android/support/v7/widget/at$m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */