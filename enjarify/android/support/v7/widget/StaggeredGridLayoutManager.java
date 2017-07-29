package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.h.a.a;
import android.support.v4.h.a.b;
import android.support.v4.h.a.b.n;
import android.support.v4.h.a.f;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager
  extends at.g
{
  private boolean F;
  private StaggeredGridLayoutManager.d G;
  private int H;
  private final Rect I;
  private final StaggeredGridLayoutManager.a J;
  private boolean K;
  private boolean L;
  private int[] M;
  private final Runnable N;
  StaggeredGridLayoutManager.e[] a;
  as b;
  as c;
  boolean d;
  boolean e;
  int f;
  int g;
  StaggeredGridLayoutManager.c h;
  private int i;
  private int j;
  private int k;
  private final al l;
  private BitSet m;
  private int n;
  private boolean o;
  
  public StaggeredGridLayoutManager(int paramInt1, int paramInt2)
  {
    i = i1;
    d = false;
    e = false;
    f = i1;
    g = (-1 << -1);
    Object localObject = new android/support/v7/widget/StaggeredGridLayoutManager$c;
    ((StaggeredGridLayoutManager.c)localObject).<init>();
    h = ((StaggeredGridLayoutManager.c)localObject);
    n = 2;
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    I = ((Rect)localObject);
    localObject = new android/support/v7/widget/StaggeredGridLayoutManager$a;
    ((StaggeredGridLayoutManager.a)localObject).<init>(this);
    J = ((StaggeredGridLayoutManager.a)localObject);
    K = false;
    L = bool;
    localObject = new android/support/v7/widget/StaggeredGridLayoutManager$1;
    ((StaggeredGridLayoutManager.1)localObject).<init>(this);
    N = ((Runnable)localObject);
    j = paramInt2;
    c(paramInt1);
    i1 = n;
    if (i1 != 0) {}
    for (;;)
    {
      w = bool;
      al localal = new android/support/v7/widget/al;
      localal.<init>();
      l = localal;
      h();
      return;
      bool = false;
      localal = null;
    }
  }
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    i = i1;
    d = false;
    e = false;
    f = i1;
    g = (-1 << -1);
    Object localObject1 = new android/support/v7/widget/StaggeredGridLayoutManager$c;
    ((StaggeredGridLayoutManager.c)localObject1).<init>();
    h = ((StaggeredGridLayoutManager.c)localObject1);
    i1 = 2;
    n = i1;
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    I = ((Rect)localObject1);
    localObject1 = new android/support/v7/widget/StaggeredGridLayoutManager$a;
    ((StaggeredGridLayoutManager.a)localObject1).<init>(this);
    J = ((StaggeredGridLayoutManager.a)localObject1);
    K = false;
    L = i3;
    localObject1 = new android/support/v7/widget/StaggeredGridLayoutManager$1;
    ((StaggeredGridLayoutManager.1)localObject1).<init>(this);
    N = ((Runnable)localObject1);
    localObject1 = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    int i4 = a;
    Object localObject2;
    if ((i4 != 0) && (i4 != i3))
    {
      localObject2 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject2).<init>("invalid orientation.");
      throw ((Throwable)localObject2);
    }
    as localas1 = null;
    a(null);
    int i5 = j;
    if (i4 != i5)
    {
      j = i4;
      as localas2 = b;
      localas1 = c;
      b = localas1;
      c = localas2;
      j();
    }
    i4 = b;
    c(i4);
    boolean bool = c;
    a(bool);
    int i2 = n;
    if (i2 != 0) {}
    for (;;)
    {
      w = i3;
      localObject2 = new android/support/v7/widget/al;
      ((al)localObject2).<init>();
      l = ((al)localObject2);
      h();
      return;
      i3 = 0;
      localObject2 = null;
    }
  }
  
  private int a(at.m paramm, al paramal, at.r paramr)
  {
    Object localObject1 = m;
    int i1 = 0;
    as localas = null;
    int i2 = i;
    boolean bool1 = true;
    ((BitSet)localObject1).set(0, i2, bool1);
    localObject1 = l;
    boolean bool8 = i;
    int i13;
    label116:
    Object localObject2;
    View localView;
    int i15;
    Object localObject3;
    int i16;
    label273:
    int i21;
    if (bool8)
    {
      int i12 = e;
      i1 = 1;
      if (i12 == i1)
      {
        i12 = -1 >>> 1;
        i1 = i12;
        i12 = e;
        i(i12, i1);
        boolean bool9 = e;
        if (!bool9) {
          break label733;
        }
        localObject1 = b;
        i13 = ((as)localObject1).c();
        i2 = i13;
        i13 = 0;
        localObject1 = null;
        bool1 = paramal.a(paramr);
        if (!bool1) {
          break label2460;
        }
        localObject2 = l;
        bool1 = i;
        if (!bool1)
        {
          localObject2 = m;
          bool1 = ((BitSet)localObject2).isEmpty();
          if (bool1) {
            break label2460;
          }
        }
        i13 = c;
        localView = paramm.b(i13);
        i13 = c;
        int i3 = d;
        i13 += i3;
        c = i13;
        localObject1 = (StaggeredGridLayoutManager.b)localView.getLayoutParams();
        i15 = c.c();
        localObject2 = h;
        localObject3 = a;
        if (localObject3 != null)
        {
          localObject3 = a;
          i16 = localObject3.length;
          if (i15 < i16) {
            break label753;
          }
        }
        i3 = -1;
        i16 = i3;
        i3 = -1;
        if (i16 != i3) {
          break label774;
        }
        i3 = 1;
        i21 = i3;
      }
    }
    Object localObject4;
    label325:
    label359:
    label400:
    int i22;
    int i29;
    Object localObject5;
    label486:
    label522:
    Object localObject6;
    StaggeredGridLayoutManager.e locale;
    int i34;
    int i18;
    label733:
    label753:
    label774:
    int i7;
    label819:
    int i31;
    int i37;
    for (;;)
    {
      if (i21 != 0)
      {
        boolean bool2 = b;
        if (bool2)
        {
          localObject2 = a;
          i16 = 0;
          localObject3 = null;
          localObject4 = localObject2[0];
          localObject2 = h;
          ((StaggeredGridLayoutManager.c)localObject2).c(i15);
          localObject2 = a;
          i16 = e;
          localObject2[i15] = i16;
          a = ((StaggeredGridLayoutManager.e)localObject4);
          int i4 = e;
          i16 = 1;
          if (i4 != i16) {
            break label1041;
          }
          i4 = -1;
          i16 = 0;
          localObject3 = null;
          super.a(localView, i4, false);
          boolean bool3 = b;
          if (!bool3) {
            break label1125;
          }
          int i5 = j;
          i16 = 1;
          if (i5 != i16) {
            break label1064;
          }
          i5 = H;
          i16 = E;
          i22 = C;
          i29 = 0;
          localObject5 = null;
          int i30 = height;
          boolean bool17 = true;
          i16 = a(i16, i22, 0, i30, bool17);
          a(localView, i5, i16);
          i5 = e;
          i16 = 1;
          if (i5 != i16) {
            break label1612;
          }
          boolean bool4 = b;
          if (!bool4) {
            break label1326;
          }
          i6 = k(i2);
          localObject3 = b;
          i16 = ((as)localObject3).e(localView);
          i22 = i6 + i16;
          if (i21 == 0) {
            break label2618;
          }
          int i17 = b;
          if (i17 == 0) {
            break label2618;
          }
          localObject5 = new android/support/v7/widget/StaggeredGridLayoutManager$c$a;
          ((StaggeredGridLayoutManager.c.a)localObject5).<init>();
          localObject3 = new int[i];
          c = ((int[])localObject3);
          i17 = 0;
          localObject3 = null;
          for (;;)
          {
            i30 = i;
            if (i17 >= i30) {
              break;
            }
            localObject6 = c;
            locale = a[i17];
            i34 = locale.b(i6);
            i34 = i6 - i34;
            localObject6[i17] = i34;
            i17 += 1;
          }
          i13 = -1 << -1;
          i1 = i13;
          break;
          i13 = e;
          i1 = 1;
          if (i13 == i1)
          {
            i13 = g;
            i1 = b;
            i13 += i1;
            i1 = i13;
            break;
          }
          i13 = f;
          i1 = b;
          i13 -= i1;
          i1 = i13;
          break;
          localObject1 = b;
          i13 = ((as)localObject1).b();
          i2 = i13;
          break label116;
          localObject2 = a;
          i6 = localObject2[i15];
          i18 = i6;
          break label273;
          i6 = 0;
          localObject2 = null;
          i21 = 0;
          continue;
        }
        int i6 = e;
        boolean bool5 = l(i6);
        if (bool5)
        {
          i18 = i + -1;
          i22 = -1;
          i7 = -1;
          i36 = e;
          i29 = 1;
          if (i36 != i29) {
            break label939;
          }
          i36 = 0;
          localObject4 = null;
          i31 = -1 >>> 1;
          localObject5 = b;
          i37 = ((as)localObject5).b();
          i34 = i18;
          label863:
          if (i34 != i22)
          {
            localObject3 = a[i34];
            i29 = ((StaggeredGridLayoutManager.e)localObject3).b(i37);
            if (i29 >= i31) {
              break label2640;
            }
          }
        }
      }
    }
    label939:
    label967:
    label1041:
    label1064:
    label1125:
    label1326:
    label1449:
    label1498:
    label1612:
    label1801:
    label1808:
    label1817:
    label1823:
    label1832:
    label1860:
    int i33;
    for (int i36 = i29;; i36 = i33)
    {
      i29 = i34 + i7;
      i34 = i29;
      i31 = i36;
      localObject4 = localObject3;
      break label863;
      break label325;
      i18 = 0;
      localObject3 = null;
      i22 = i;
      i7 = 1;
      break label819;
      i36 = 0;
      localObject4 = null;
      i31 = -1 << -1;
      localObject5 = b;
      i37 = ((as)localObject5).c();
      i34 = i18;
      if (i34 != i22)
      {
        localObject3 = a[i34];
        i29 = ((StaggeredGridLayoutManager.e)localObject3).a(i37);
        if (i29 <= i31) {
          break label2629;
        }
      }
      for (i36 = i29;; i36 = i33)
      {
        i29 = i34 + i7;
        i34 = i29;
        i31 = i36;
        localObject4 = localObject3;
        break label967;
        break label325;
        localObject2 = a;
        localObject4 = localObject2[i18];
        break label359;
        i7 = 0;
        localObject2 = null;
        i18 = 0;
        localObject3 = null;
        super.a(localView, 0, false);
        break label400;
        i7 = D;
        i18 = B;
        i22 = 0;
        Object localObject7 = null;
        i29 = width;
        i31 = 1;
        i7 = a(i7, i18, 0, i29, i31);
        i18 = H;
        a(localView, i7, i18);
        break label486;
        i7 = j;
        i18 = 1;
        if (i7 == i18)
        {
          i7 = k;
          i18 = B;
          localObject7 = null;
          i29 = width;
          localObject6 = null;
          i7 = a(i7, i18, 0, i29, false);
          i18 = E;
          i22 = C;
          i29 = 0;
          localObject5 = null;
          i32 = height;
          i34 = 1;
          i18 = a(i18, i22, 0, i32, i34);
          a(localView, i7, i18);
          break label486;
        }
        i7 = D;
        i18 = B;
        localObject7 = null;
        i29 = width;
        i7 = a(i7, i18, 0, i29, true);
        i18 = k;
        i22 = C;
        i29 = 0;
        localObject5 = null;
        int i32 = height;
        int i35 = 0;
        locale = null;
        i18 = a(i18, i22, 0, i32, false);
        a(localView, i7, i18);
        break label486;
        i7 = ((StaggeredGridLayoutManager.e)localObject4).b(i2);
        break label522;
        b = -1;
        a = i15;
        localObject3 = h;
        ((StaggeredGridLayoutManager.c)localObject3).a((StaggeredGridLayoutManager.c.a)localObject5);
        i18 = i7;
        i7 = i22;
        for (;;)
        {
          boolean bool11 = b;
          int i23;
          if (bool11)
          {
            i23 = d;
            i29 = -1;
            if (i23 == i29) {
              if (i21 == 0)
              {
                i23 = e;
                i29 = 1;
                if (i23 != i29) {
                  break label1832;
                }
                localObject7 = a;
                localObject5 = null;
                localObject7 = localObject7[0];
                i29 = ((StaggeredGridLayoutManager.e)localObject7).b(-1 << -1);
                i23 = 1;
                i32 = i;
                if (i23 >= i32) {
                  break label1817;
                }
                localObject6 = a[i23];
                i35 = -1 << -1;
                i32 = ((StaggeredGridLayoutManager.e)localObject6).b(i35);
                if (i32 == i29) {
                  break label1808;
                }
                i23 = 0;
                localObject7 = null;
                if (i23 != 0) {
                  break label1823;
                }
                i23 = 1;
              }
            }
          }
          int i8;
          for (;;)
          {
            if (i23 != 0)
            {
              localObject7 = h.d(i15);
              if (localObject7 != null)
              {
                i29 = 1;
                d = i29;
              }
              i23 = 1;
              K = i23;
            }
            i23 = e;
            i29 = 1;
            if (i23 != i29) {
              break label2174;
            }
            boolean bool12 = b;
            if (!bool12) {
              break label1944;
            }
            int i24 = i + -1;
            while (i24 >= 0)
            {
              localObject5 = a[i24];
              ((StaggeredGridLayoutManager.e)localObject5).b(localView);
              i24 += -1;
            }
            boolean bool6 = b;
            if (bool6) {}
            for (i8 = j(i2);; i8 = ((StaggeredGridLayoutManager.e)localObject4).a(i2))
            {
              localObject3 = b;
              i18 = ((as)localObject3).e(localView);
              i24 = i8 - i18;
              if (i21 == 0) {
                break label1801;
              }
              int i19 = b;
              if (i19 == 0) {
                break label1801;
              }
              localObject5 = new android/support/v7/widget/StaggeredGridLayoutManager$c$a;
              ((StaggeredGridLayoutManager.c.a)localObject5).<init>();
              localObject3 = new int[i];
              c = ((int[])localObject3);
              i19 = 0;
              localObject3 = null;
              for (;;)
              {
                i32 = i;
                if (i19 >= i32) {
                  break;
                }
                localObject6 = c;
                locale = a[i19];
                i35 = locale.a(i8) - i8;
                localObject6[i19] = i35;
                i19 += 1;
              }
            }
            i20 = 1;
            b = i20;
            a = i15;
            localObject3 = h;
            ((StaggeredGridLayoutManager.c)localObject3).a((StaggeredGridLayoutManager.c.a)localObject5);
            i20 = i24;
            break;
            i24 += 1;
            break label1449;
            i24 = 1;
            break label1498;
            i24 = 0;
            localObject7 = null;
            continue;
            localObject7 = a;
            localObject5 = null;
            localObject7 = localObject7[0];
            i29 = ((StaggeredGridLayoutManager.e)localObject7).a(-1 << -1);
            i24 = 1;
            i33 = i;
            if (i24 < i33)
            {
              localObject6 = a[i24];
              i35 = -1 << -1;
              i33 = ((StaggeredGridLayoutManager.e)localObject6).a(i35);
              if (i33 != i29)
              {
                i24 = 0;
                localObject7 = null;
              }
            }
            for (;;)
            {
              if (i24 != 0) {
                break label1935;
              }
              i24 = 1;
              break;
              i24 += 1;
              break label1860;
              i24 = 1;
            }
            label1935:
            i24 = 0;
            localObject7 = null;
          }
          label1944:
          localObject7 = a;
          ((StaggeredGridLayoutManager.e)localObject7).b(localView);
          label1958:
          boolean bool13 = t();
          label2010:
          label2069:
          label2102:
          int i10;
          boolean bool10;
          if (bool13)
          {
            int i25 = j;
            i29 = 1;
            if (i25 == i29)
            {
              boolean bool14 = b;
              if (bool14)
              {
                localObject7 = c;
                int i26 = ((as)localObject7).c();
                localObject5 = c;
                i29 = ((as)localObject5).e(localView);
                int i38 = i26 - i29;
                i29 = i26;
                i26 = i38;
                i33 = j;
                i35 = 1;
                if (i33 != i35) {
                  break label2388;
                }
                a(localView, i26, i20, i29, i8);
                boolean bool7 = b;
                if (!bool7) {
                  break label2404;
                }
                localObject2 = l;
                int i9 = e;
                i(i9, i1);
                localObject2 = l;
                a(paramm, (al)localObject2);
                localObject2 = l;
                i10 = h;
                if (i10 != 0)
                {
                  i10 = localView.hasFocusable();
                  if (i10 != 0)
                  {
                    bool10 = b;
                    if (!bool10) {
                      break label2430;
                    }
                    localObject1 = m;
                    ((BitSet)localObject1).clear();
                  }
                }
              }
            }
          }
          label2174:
          int i28;
          for (;;)
          {
            bool10 = true;
            break;
            boolean bool15 = b;
            if (bool15)
            {
              i27 = i + -1;
              while (i27 >= 0)
              {
                localObject5 = a[i27];
                ((StaggeredGridLayoutManager.e)localObject5).a(localView);
                i27 += -1;
              }
              break label1958;
            }
            localObject7 = a;
            ((StaggeredGridLayoutManager.e)localObject7).a(localView);
            break label1958;
            localObject7 = c;
            int i27 = ((as)localObject7).c();
            i29 = i + -1;
            i33 = e;
            i29 -= i33;
            i33 = k;
            i29 *= i33;
            i27 -= i29;
            break label2010;
            boolean bool16 = b;
            if (bool16)
            {
              localObject7 = c;
              i28 = ((as)localObject7).b();
            }
            for (;;)
            {
              localObject5 = c;
              i29 = ((as)localObject5).e(localView) + i28;
              break;
              i28 = e;
              i29 = k;
              i28 *= i29;
              localObject5 = c;
              i29 = ((as)localObject5).b();
              i28 += i29;
            }
            label2388:
            a(localView, i20, i28, i10, i29);
            break label2069;
            label2404:
            localObject2 = l;
            i11 = e;
            a((StaggeredGridLayoutManager.e)localObject4, i11, i1);
            break label2102;
            label2430:
            localObject1 = m;
            i11 = e;
            i20 = 0;
            localObject3 = null;
            ((BitSet)localObject1).set(i11, false);
          }
          label2460:
          if (!bool10)
          {
            localObject1 = l;
            a(paramm, (al)localObject1);
          }
          localObject1 = l;
          int i14 = e;
          i1 = -1;
          if (i14 == i1)
          {
            localObject1 = b;
            i14 = ((as)localObject1).b();
            i14 = j(i14);
            localas = b;
            i1 = localas.b();
            i14 = i1 - i14;
            if (i14 <= 0) {
              break label2609;
            }
            i1 = b;
            i14 = Math.min(i1, i14);
          }
          for (;;)
          {
            return i14;
            localObject1 = b;
            i14 = ((as)localObject1).c();
            i14 = k(i14);
            localas = b;
            i1 = localas.c();
            i14 -= i1;
            break;
            label2609:
            i14 = 0;
            localObject1 = null;
          }
          label2618:
          int i20 = i11;
          int i11 = i28;
        }
        label2629:
        localObject3 = localObject4;
      }
      label2640:
      localObject3 = localObject4;
    }
  }
  
  private void a(int paramInt, at.r paramr)
  {
    int i1 = 1;
    boolean bool1 = false;
    l.b = 0;
    Object localObject1 = l;
    c = paramInt;
    boolean bool2 = k();
    int i2;
    int i4;
    Object localObject2;
    if (bool2)
    {
      i2 = a;
      int i3 = -1;
      if (i2 != i3)
      {
        i4 = e;
        if (i2 < paramInt)
        {
          i2 = i1;
          if (i4 != i2) {
            break label274;
          }
          localObject1 = b;
          i2 = ((as)localObject1).e();
          i4 = 0;
          localObject2 = null;
        }
      }
    }
    for (;;)
    {
      label93:
      Object localObject3 = q;
      label125:
      as localas;
      int i6;
      int i5;
      if (localObject3 != null)
      {
        localObject3 = q;
        boolean bool3 = h;
        if (bool3)
        {
          bool3 = i1;
          if (!bool3) {
            break label301;
          }
          localObject3 = l;
          localas = b;
          i6 = localas.b();
          i4 = i6 - i4;
          f = i4;
          localObject2 = l;
          localObject3 = b;
          i5 = ((as)localObject3).c();
          i2 += i5;
          g = i2;
        }
      }
      for (;;)
      {
        l.h = false;
        l.a = i1;
        localObject1 = l;
        localObject2 = b;
        i4 = ((as)localObject2).g();
        if (i4 == 0)
        {
          localObject2 = b;
          i4 = ((as)localObject2).d();
          if (i4 == 0) {
            bool1 = i1;
          }
        }
        i = bool1;
        return;
        i2 = 0;
        localObject1 = null;
        break;
        label274:
        i4 = b.e();
        i2 = 0;
        localObject1 = null;
        break label93;
        i5 = 0;
        localObject3 = null;
        break label125;
        label301:
        localObject3 = l;
        localas = b;
        i6 = localas.d();
        i2 += i6;
        g = i2;
        localObject1 = l;
        i4 = -i4;
        f = i4;
      }
      i2 = 0;
      localObject1 = null;
      i4 = 0;
      localObject2 = null;
    }
  }
  
  private void a(StaggeredGridLayoutManager.e parame, int paramInt1, int paramInt2)
  {
    int i1 = d;
    int i2 = -1;
    BitSet localBitSet;
    if (paramInt1 == i2)
    {
      i2 = parame.a();
      i1 += i2;
      if (i1 <= paramInt2)
      {
        localBitSet = m;
        i2 = e;
        localBitSet.set(i2, false);
      }
    }
    for (;;)
    {
      return;
      i2 = parame.b();
      i1 = i2 - i1;
      if (i1 >= paramInt2)
      {
        localBitSet = m;
        i2 = e;
        localBitSet.set(i2, false);
      }
    }
  }
  
  private void a(at.m paramm, int paramInt)
  {
    int i1 = 1;
    for (;;)
    {
      int i2 = l();
      View localView;
      int i3;
      Object localObject2;
      if (i2 > 0)
      {
        localView = d(0);
        localObject1 = b;
        i2 = ((as)localObject1).b(localView);
        if (i2 <= paramInt)
        {
          localObject1 = b;
          i2 = ((as)localObject1).c(localView);
          if (i2 <= paramInt)
          {
            localObject1 = (StaggeredGridLayoutManager.b)localView.getLayoutParams();
            boolean bool = b;
            if (!bool) {
              break label180;
            }
            i2 = 0;
            localObject1 = null;
            i3 = i;
            if (i2 >= i3) {
              break label138;
            }
            localObject2 = a[i2].a;
            i3 = ((ArrayList)localObject2).size();
            if (i3 != i1) {
              break label129;
            }
          }
        }
      }
      label129:
      label138:
      label180:
      do
      {
        return;
        i2 += 1;
        break;
        i2 = 0;
        localObject1 = null;
        for (;;)
        {
          i3 = i;
          if (i2 >= i3) {
            break;
          }
          localObject2 = a[i2];
          ((StaggeredGridLayoutManager.e)localObject2).e();
          i2 += 1;
        }
        localObject2 = a.a;
        i3 = ((ArrayList)localObject2).size();
      } while (i3 == i1);
      Object localObject1 = a;
      ((StaggeredGridLayoutManager.e)localObject1).e();
      a(localView, paramm);
    }
  }
  
  private void a(at.m paramm, al paramal)
  {
    int i1 = 1;
    int i2 = -1;
    boolean bool = a;
    if (bool)
    {
      bool = i;
      if (!bool) {
        break label28;
      }
    }
    for (;;)
    {
      return;
      label28:
      i3 = b;
      if (i3 != 0) {
        break;
      }
      i1 = e;
      if (i1 == i2)
      {
        i1 = g;
        b(paramm, i1);
      }
      else
      {
        i1 = f;
        a(paramm, i1);
      }
    }
    int i3 = e;
    StaggeredGridLayoutManager.e locale2;
    if (i3 == i2)
    {
      i4 = f;
      int i5 = f;
      locale1 = a[0];
      i3 = locale1.a(i5);
      for (;;)
      {
        i2 = i;
        if (i1 >= i2) {
          break;
        }
        locale2 = a[i1];
        i2 = locale2.a(i5);
        if (i2 > i3) {
          i3 = i2;
        }
        i1 += 1;
      }
      i1 = i4 - i3;
      if (i1 < 0) {}
      for (i1 = g;; i1 = i3 - i1)
      {
        b(paramm, i1);
        break;
        i3 = g;
        i2 = b;
        i1 = Math.min(i1, i2);
      }
    }
    int i4 = g;
    StaggeredGridLayoutManager.e locale1 = a[0];
    i3 = locale1.b(i4);
    for (;;)
    {
      i2 = i;
      if (i1 >= i2) {
        break;
      }
      locale2 = a[i1];
      i2 = locale2.b(i4);
      if (i2 < i3) {
        i3 = i2;
      }
      i1 += 1;
    }
    i1 = g;
    i1 = i3 - i1;
    if (i1 < 0) {}
    for (i1 = f;; i1 = Math.min(i1, i2) + i3)
    {
      a(paramm, i1);
      break;
      i3 = f;
      i2 = b;
    }
  }
  
  private void a(at.m paramm, at.r paramr, boolean paramBoolean)
  {
    int i1 = -1 << -1;
    int i2 = k(i1);
    if (i2 == i1) {}
    for (;;)
    {
      return;
      as localas = b;
      i1 = localas.c();
      i2 = i1 - i2;
      if (i2 > 0)
      {
        i1 = -i2;
        i1 = -c(i1, paramm, paramr);
        i2 -= i1;
        if ((paramBoolean) && (i2 > 0))
        {
          localas = b;
          localas.a(i2);
        }
      }
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2)
  {
    Object localObject = I;
    b(paramView, (Rect)localObject);
    localObject = (StaggeredGridLayoutManager.b)paramView.getLayoutParams();
    int i1 = leftMargin;
    Rect localRect1 = I;
    int i2 = left;
    i1 += i2;
    i2 = rightMargin;
    int i3 = I.right;
    i2 += i3;
    i1 = c(paramInt1, i1, i2);
    i2 = topMargin;
    Rect localRect2 = I;
    i3 = top;
    i2 += i3;
    i3 = bottomMargin;
    Rect localRect3 = I;
    int i4 = bottom;
    i3 += i4;
    i2 = c(paramInt2, i2, i3);
    boolean bool = a(paramView, i1, i2, (at.h)localObject);
    if (bool) {
      paramView.measure(i1, i2);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool = false;
    a(null);
    StaggeredGridLayoutManager.d locald = G;
    if (locald != null)
    {
      locald = G;
      bool = h;
      if (bool != paramBoolean)
      {
        locald = G;
        h = paramBoolean;
      }
    }
    d = paramBoolean;
    j();
  }
  
  private View b(boolean paramBoolean)
  {
    int i1 = b.b();
    int i2 = b.c();
    int i3 = l();
    int i4 = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    int i5 = 0;
    if (i5 < i3)
    {
      localObject2 = d(i5);
      as localas1 = b;
      int i6 = localas1.a((View)localObject2);
      as localas2 = b;
      int i7 = localas2.b((View)localObject2);
      if ((i7 <= i1) || (i6 >= i2)) {
        break label133;
      }
      if ((i6 >= i1) || (!paramBoolean)) {
        label101:
        return (View)localObject2;
      }
      if (localObject1 != null) {
        break label133;
      }
    }
    for (;;)
    {
      i4 = i5 + 1;
      i5 = i4;
      localObject1 = localObject2;
      break;
      localObject2 = localObject1;
      break label101;
      label133:
      localObject2 = localObject1;
    }
  }
  
  private void b(int paramInt, at.r paramr)
  {
    int i1 = 1;
    int i2;
    int i3;
    if (paramInt > 0)
    {
      i2 = u();
      i3 = i1;
    }
    for (;;)
    {
      l.a = i1;
      a(i2, paramr);
      i(i3);
      al localal = l;
      i1 = l.d + i2;
      c = i1;
      localal = l;
      i1 = Math.abs(paramInt);
      b = i1;
      return;
      i3 = -1;
      i2 = v();
    }
  }
  
  private void b(at.m paramm, int paramInt)
  {
    int i1 = 1;
    int i2 = l() + -1;
    for (int i3 = i2;; i3 = i2)
    {
      View localView;
      int i4;
      Object localObject2;
      if (i3 >= 0)
      {
        localView = d(i3);
        localObject1 = b;
        i2 = ((as)localObject1).a(localView);
        if (i2 >= paramInt)
        {
          localObject1 = b;
          i2 = ((as)localObject1).d(localView);
          if (i2 >= paramInt)
          {
            localObject1 = (StaggeredGridLayoutManager.b)localView.getLayoutParams();
            boolean bool = b;
            if (!bool) {
              break label187;
            }
            i2 = 0;
            localObject1 = null;
            i4 = i;
            if (i2 >= i4) {
              break label145;
            }
            localObject2 = a[i2].a;
            i4 = ((ArrayList)localObject2).size();
            if (i4 != i1) {
              break label136;
            }
          }
        }
      }
      label136:
      label145:
      label187:
      do
      {
        return;
        i2 += 1;
        break;
        i2 = 0;
        localObject1 = null;
        for (;;)
        {
          i4 = i;
          if (i2 >= i4) {
            break;
          }
          localObject2 = a[i2];
          ((StaggeredGridLayoutManager.e)localObject2).d();
          i2 += 1;
        }
        localObject2 = a.a;
        i4 = ((ArrayList)localObject2).size();
      } while (i4 == i1);
      Object localObject1 = a;
      ((StaggeredGridLayoutManager.e)localObject1).d();
      a(localView, paramm);
      i2 = i3 + -1;
    }
  }
  
  private void b(at.m paramm, at.r paramr, boolean paramBoolean)
  {
    int i1 = -1 >>> 1;
    int i2 = j(i1);
    if (i2 == i1) {}
    for (;;)
    {
      return;
      as localas = b;
      i1 = localas.b();
      i2 -= i1;
      if (i2 > 0)
      {
        i1 = c(i2, paramm, paramr);
        i2 -= i1;
        if ((paramBoolean) && (i2 > 0))
        {
          localas = b;
          i2 = -i2;
          localas.a(i2);
        }
      }
    }
  }
  
  private static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    for (;;)
    {
      return paramInt1;
      int i1 = View.MeasureSpec.getMode(paramInt1);
      int i2 = -1 << -1;
      if (i1 != i2)
      {
        i2 = 1073741824;
        if (i1 != i2) {}
      }
      else
      {
        int i3 = View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3;
        i2 = Math.max(0, i3);
        paramInt1 = View.MeasureSpec.makeMeasureSpec(i2, i1);
      }
    }
  }
  
  private int c(int paramInt, at.m paramm, at.r paramr)
  {
    int i1 = l();
    if ((i1 == 0) || (paramInt == 0))
    {
      paramInt = 0;
      return paramInt;
    }
    b(paramInt, paramr);
    Object localObject = l;
    i1 = a(paramm, (al)localObject, paramr);
    al localal = l;
    int i3 = b;
    if (i3 >= i1) {
      if (paramInt >= 0) {
        break label122;
      }
    }
    int i2;
    label122:
    for (paramInt = -i1;; paramInt = i2)
    {
      localObject = b;
      i3 = -paramInt;
      ((as)localObject).a(i3);
      i2 = e;
      o = i2;
      l.b = 0;
      localObject = l;
      a(paramm, (al)localObject);
      break;
    }
  }
  
  private View c(boolean paramBoolean)
  {
    int i1 = b.b();
    Object localObject1 = b;
    int i2 = ((as)localObject1).c();
    int i3 = 0;
    Object localObject2 = null;
    int i4 = l() + -1;
    int i5 = i4;
    if (i5 >= 0)
    {
      localObject1 = d(i5);
      as localas1 = b;
      int i6 = localas1.a((View)localObject1);
      as localas2 = b;
      int i7 = localas2.b((View)localObject1);
      if ((i7 <= i1) || (i6 >= i2)) {
        break label130;
      }
      if ((i7 <= i2) || (!paramBoolean)) {
        label101:
        return (View)localObject1;
      }
      if (localObject2 != null) {
        break label130;
      }
    }
    for (;;)
    {
      i3 = i5 + -1;
      i5 = i3;
      localObject2 = localObject1;
      break;
      localObject1 = localObject2;
      break label101;
      label130:
      localObject1 = localObject2;
    }
  }
  
  private void c(int paramInt)
  {
    Object localObject = null;
    a(null);
    int i1 = i;
    if (paramInt != i1)
    {
      h.a();
      j();
      i = paramInt;
      localObject = new java/util/BitSet;
      int i2 = i;
      ((BitSet)localObject).<init>(i2);
      m = ((BitSet)localObject);
      localObject = new StaggeredGridLayoutManager.e[i];
      a = ((StaggeredGridLayoutManager.e[])localObject);
      i1 = 0;
      localObject = null;
      for (;;)
      {
        i2 = i;
        if (i1 >= i2) {
          break;
        }
        StaggeredGridLayoutManager.e[] arrayOfe = a;
        StaggeredGridLayoutManager.e locale = new android/support/v7/widget/StaggeredGridLayoutManager$e;
        locale.<init>(this, i1);
        arrayOfe[i1] = locale;
        i1 += 1;
      }
      j();
    }
  }
  
  private void d(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 1;
    boolean bool1 = e;
    int i2;
    int i3;
    int i4;
    label47:
    StaggeredGridLayoutManager.c localc;
    if (bool1)
    {
      i2 = u();
      i3 = i2;
      i2 = 8;
      if (paramInt3 != i2) {
        break label128;
      }
      if (paramInt1 >= paramInt2) {
        break label117;
      }
      i4 = paramInt2 + 1;
      i2 = paramInt1;
      localc = h;
      localc.b(i2);
      switch (paramInt3)
      {
      default: 
        label96:
        if (i4 > i3) {
          break;
        }
      }
    }
    label117:
    label128:
    label236:
    for (;;)
    {
      return;
      i2 = v();
      i3 = i2;
      break;
      i4 = paramInt1 + 1;
      i2 = paramInt2;
      break label47;
      i4 = paramInt1 + paramInt2;
      i2 = paramInt1;
      break label47;
      localc = h;
      localc.b(paramInt1, paramInt2);
      break label96;
      localc = h;
      localc.a(paramInt1, paramInt2);
      break label96;
      h.a(paramInt1, i1);
      localc = h;
      localc.b(paramInt2, i1);
      break label96;
      boolean bool2 = e;
      if (bool2) {}
      for (int i5 = v();; i5 = u())
      {
        if (i2 > i5) {
          break label236;
        }
        j();
        break;
      }
    }
  }
  
  private int h(at.r paramr)
  {
    boolean bool1 = true;
    int i1 = 0;
    int i2 = l();
    if (i2 == 0) {
      return i1;
    }
    as localas = b;
    boolean bool2 = L;
    label37:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = b(bool2);
      bool2 = L;
      if (bool2) {
        break label100;
      }
    }
    for (;;)
    {
      View localView2 = c(bool1);
      boolean bool3 = L;
      boolean bool4 = e;
      i1 = ax.a(paramr, localas, localView1, localView2, this, bool3, bool4);
      break;
      bool2 = false;
      break label37;
      label100:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private void h()
  {
    int i1 = j;
    as localas = as.a(this, i1);
    b = localas;
    i1 = j;
    i1 = 1 - i1;
    localas = as.a(this, i1);
    c = localas;
  }
  
  private void h(int paramInt)
  {
    int i1 = i;
    i1 = paramInt / i1;
    k = i1;
    i1 = c.g();
    i1 = View.MeasureSpec.makeMeasureSpec(paramInt, i1);
    H = i1;
  }
  
  private int i(at.r paramr)
  {
    boolean bool1 = true;
    int i1 = 0;
    int i2 = l();
    if (i2 == 0) {
      return i1;
    }
    as localas = b;
    boolean bool2 = L;
    label37:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = b(bool2);
      bool2 = L;
      if (bool2) {
        break label92;
      }
    }
    for (;;)
    {
      View localView2 = c(bool1);
      boolean bool3 = L;
      i1 = ax.a(paramr, localas, localView1, localView2, this, bool3);
      break;
      bool2 = false;
      break label37;
      label92:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private void i(int paramInt)
  {
    int i1 = 1;
    int i2 = -1;
    float f1 = 0.0F / 0.0F;
    al localal1 = l;
    e = paramInt;
    al localal2 = l;
    boolean bool1 = e;
    boolean bool2;
    if (paramInt == i2)
    {
      bool2 = i1;
      if (bool1 != bool2) {
        break label64;
      }
    }
    for (;;)
    {
      d = i1;
      return;
      bool2 = false;
      localal1 = null;
      break;
      label64:
      i1 = i2;
    }
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    for (;;)
    {
      int i2 = i;
      if (i1 >= i2) {
        break;
      }
      Object localObject = a[i1].a;
      boolean bool = ((ArrayList)localObject).isEmpty();
      if (!bool)
      {
        localObject = a[i1];
        a((StaggeredGridLayoutManager.e)localObject, paramInt1, paramInt2);
      }
      i1 += 1;
    }
  }
  
  private int j(int paramInt)
  {
    StaggeredGridLayoutManager.e locale1 = a[0];
    int i1 = locale1.a(paramInt);
    int i2 = 1;
    for (;;)
    {
      int i3 = i;
      if (i2 >= i3) {
        break;
      }
      StaggeredGridLayoutManager.e locale2 = a[i2];
      i3 = locale2.a(paramInt);
      if (i3 < i1) {
        i1 = i3;
      }
      i2 += 1;
    }
    return i1;
  }
  
  private int j(at.r paramr)
  {
    boolean bool1 = true;
    int i1 = 0;
    int i2 = l();
    if (i2 == 0) {
      return i1;
    }
    as localas = b;
    boolean bool2 = L;
    label37:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = b(bool2);
      bool2 = L;
      if (bool2) {
        break label92;
      }
    }
    for (;;)
    {
      View localView2 = c(bool1);
      boolean bool3 = L;
      i1 = ax.b(paramr, localas, localView1, localView2, this, bool3);
      break;
      bool2 = false;
      break label37;
      label92:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private int k(int paramInt)
  {
    StaggeredGridLayoutManager.e locale1 = a[0];
    int i1 = locale1.b(paramInt);
    int i2 = 1;
    for (;;)
    {
      int i3 = i;
      if (i2 >= i3) {
        break;
      }
      StaggeredGridLayoutManager.e locale2 = a[i2];
      i3 = locale2.b(paramInt);
      if (i3 > i1) {
        i1 = i3;
      }
      i2 += 1;
    }
    return i1;
  }
  
  private boolean l(int paramInt)
  {
    int i1 = -1;
    int i4 = 1;
    int i5 = j;
    int i2;
    if (i5 == 0)
    {
      if (paramInt == i1)
      {
        i5 = i4;
        i2 = e;
        if (i5 == i2) {
          break label42;
        }
      }
      for (;;)
      {
        return i4;
        i5 = 0;
        break;
        label42:
        i4 = 0;
      }
    }
    label55:
    int i3;
    if (paramInt == i2)
    {
      i5 = i4;
      i3 = e;
      if (i5 != i3) {
        break label91;
      }
    }
    label91:
    for (i5 = i4;; i5 = 0)
    {
      i3 = t();
      if (i5 == i3) {
        break;
      }
      i4 = 0;
      break;
      i5 = 0;
      break label55;
    }
  }
  
  private View r()
  {
    int i1 = -1;
    int i2 = 1;
    float f1 = Float.MIN_VALUE;
    int i3 = l() + -1;
    BitSet localBitSet = new java/util/BitSet;
    int i8 = i;
    localBitSet.<init>(i8);
    i8 = i;
    localBitSet.set(0, i8, i2);
    i8 = j;
    boolean bool5;
    int i9;
    int i10;
    label88:
    label98:
    int i11;
    View localView;
    Object localObject2;
    int i12;
    as localas;
    int i13;
    Object localObject3;
    boolean bool2;
    if (i8 == i2)
    {
      bool5 = t();
      if (bool5)
      {
        bool5 = i2;
        i9 = e;
        if (i9 == 0) {
          break label270;
        }
        i10 = i1;
        if (i3 >= i10) {
          break label285;
        }
        i9 = i2;
        i11 = i3;
        if (i11 == i10) {
          break label670;
        }
        localView = d(i11);
        localObject1 = (StaggeredGridLayoutManager.b)localView.getLayoutParams();
        localObject2 = a;
        i3 = e;
        boolean bool1 = localBitSet.get(i3);
        if (!bool1) {
          break label404;
        }
        localObject2 = a;
        boolean bool6 = e;
        if (!bool6) {
          break label300;
        }
        i12 = ((StaggeredGridLayoutManager.e)localObject2).b();
        localas = b;
        i13 = localas.c();
        if (i12 >= i13) {
          break label374;
        }
        localObject3 = a;
        int i4 = a.size() + -1;
        localObject2 = (StaggeredGridLayoutManager.b)((View)((ArrayList)localObject3).get(i4)).getLayoutParams();
        bool2 = b;
        if (bool2) {
          break label291;
        }
        bool2 = i2;
        label252:
        if (!bool2) {
          break label383;
        }
      }
    }
    label261:
    label270:
    label285:
    label291:
    label300:
    label374:
    label383:
    label404:
    int i7;
    for (Object localObject1 = localView;; localObject1 = localView)
    {
      return (View)localObject1;
      bool5 = i1;
      break;
      i10 = bool2 + true;
      bool2 = false;
      localObject2 = null;
      break label88;
      i9 = i1;
      break label98;
      bool2 = false;
      localObject2 = null;
      break label252;
      i12 = ((StaggeredGridLayoutManager.e)localObject2).a();
      localas = b;
      i13 = localas.b();
      if (i12 > i13)
      {
        localObject2 = (StaggeredGridLayoutManager.b)((View)a.get(0)).getLayoutParams();
        bool2 = b;
        if (!bool2)
        {
          bool2 = i2;
          break label252;
        }
        bool2 = false;
        localObject2 = null;
        break label252;
      }
      bool2 = false;
      localObject2 = null;
      break label252;
      localObject2 = a;
      int i5 = e;
      localBitSet.clear(i5);
      boolean bool3 = b;
      if (bool3) {
        break label658;
      }
      int i6 = i11 + i9;
      if (i6 == i10) {
        break label658;
      }
      i6 = i11 + i9;
      localObject3 = d(i6);
      boolean bool4 = e;
      if (!bool4) {
        break label584;
      }
      localObject2 = b;
      i7 = ((as)localObject2).b(localView);
      localas = b;
      i13 = localas.b((View)localObject3);
      if (i7 >= i13) {
        break label500;
      }
    }
    label500:
    if (i7 == i13) {
      i7 = i2;
    }
    for (;;)
    {
      label510:
      if (i7 != 0)
      {
        localObject2 = (StaggeredGridLayoutManager.b)((View)localObject3).getLayoutParams();
        localObject1 = a;
        i1 = e;
        localObject2 = a;
        i7 = e;
        i1 -= i7;
        if (i1 < 0)
        {
          i7 = i2;
          label564:
          if (!bool5) {
            break label650;
          }
          i1 = i2;
        }
        for (;;)
        {
          if (i7 == i1) {
            break label658;
          }
          localObject1 = localView;
          break;
          label584:
          localObject2 = b;
          i7 = ((as)localObject2).a(localView);
          localas = b;
          i13 = localas.a((View)localObject3);
          if (i7 > i13)
          {
            localObject1 = localView;
            break;
          }
          if (i7 != i13) {
            break label678;
          }
          i7 = i2;
          break label510;
          i7 = 0;
          localObject2 = null;
          break label564;
          label650:
          i1 = 0;
          localObject1 = null;
        }
      }
      label658:
      i1 = i11 + i9;
      i11 = i1;
      break;
      label670:
      i1 = 0;
      localObject1 = null;
      break label261;
      label678:
      i7 = 0;
      localObject2 = null;
    }
  }
  
  private void s()
  {
    int i1 = 1;
    int i2 = j;
    boolean bool;
    if (i2 != i1)
    {
      bool = t();
      if (bool) {}
    }
    else
    {
      i1 = d;
    }
    for (;;)
    {
      e = i1;
      return;
      bool = d;
      if (bool) {
        i1 = 0;
      }
    }
  }
  
  private boolean t()
  {
    int i1 = 1;
    at localat = q;
    int i2 = w.g(localat);
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  private int u()
  {
    int i1 = l();
    View localView;
    if (i1 == 0)
    {
      i1 = 0;
      localView = null;
    }
    for (;;)
    {
      return i1;
      i1 += -1;
      localView = d(i1);
      i1 = a(localView);
    }
  }
  
  private int v()
  {
    int i1 = 0;
    View localView = null;
    int i2 = l();
    if (i2 == 0) {}
    for (;;)
    {
      return i1;
      localView = d(0);
      i1 = a(localView);
    }
  }
  
  public final int a(int paramInt, at.m paramm, at.r paramr)
  {
    return c(paramInt, paramm, paramr);
  }
  
  public final int a(at.m paramm, at.r paramr)
  {
    int i1 = j;
    if (i1 == 0) {}
    for (i1 = i;; i1 = super.a(paramm, paramr)) {
      return i1;
    }
  }
  
  public final at.h a(Context paramContext, AttributeSet paramAttributeSet)
  {
    StaggeredGridLayoutManager.b localb = new android/support/v7/widget/StaggeredGridLayoutManager$b;
    localb.<init>(paramContext, paramAttributeSet);
    return localb;
  }
  
  public final at.h a(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
    StaggeredGridLayoutManager.b localb;
    if (bool)
    {
      localb = new android/support/v7/widget/StaggeredGridLayoutManager$b;
      paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      localb.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localb;
      localb = new android/support/v7/widget/StaggeredGridLayoutManager$b;
      localb.<init>(paramLayoutParams);
    }
  }
  
  public final View a(View paramView, int paramInt, at.m paramm, at.r paramr)
  {
    int i1 = l();
    float f1;
    Object localObject1;
    if (i1 == 0)
    {
      i1 = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
    for (;;)
    {
      return (View)localObject1;
      View localView1 = b(paramView);
      if (localView1 == null)
      {
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
      }
      else
      {
        s();
        int i8;
        switch (paramInt)
        {
        default: 
          i1 = -1 << -1;
          f1 = -0.0F;
          i8 = i1;
        }
        for (;;)
        {
          i1 = -1 << -1;
          f1 = -0.0F;
          if (i8 != i1) {
            break label470;
          }
          i1 = 0;
          f1 = 0.0F;
          localObject1 = null;
          break;
          i1 = j;
          int i9 = 1;
          if (i1 == i9)
          {
            i1 = -1;
            f1 = 0.0F / 0.0F;
            i8 = i1;
          }
          else
          {
            int i2 = t();
            if (i2 != 0)
            {
              i2 = 1;
              f1 = Float.MIN_VALUE;
              i8 = i2;
            }
            else
            {
              int i3 = -1;
              f1 = 0.0F / 0.0F;
              i8 = i3;
              continue;
              i3 = j;
              i9 = 1;
              if (i3 == i9)
              {
                i3 = 1;
                f1 = Float.MIN_VALUE;
                i8 = i3;
              }
              else
              {
                boolean bool1 = t();
                if (bool1)
                {
                  i4 = -1;
                  f1 = 0.0F / 0.0F;
                  i8 = i4;
                }
                else
                {
                  i4 = 1;
                  f1 = Float.MIN_VALUE;
                  i8 = i4;
                  continue;
                  i4 = j;
                  i9 = 1;
                  if (i4 == i9)
                  {
                    i4 = -1;
                    f1 = 0.0F / 0.0F;
                    i8 = i4;
                  }
                  else
                  {
                    i4 = -1 << -1;
                    f1 = -0.0F;
                    i8 = i4;
                    continue;
                    i4 = j;
                    i9 = 1;
                    if (i4 == i9)
                    {
                      i4 = 1;
                      f1 = Float.MIN_VALUE;
                      i8 = i4;
                    }
                    else
                    {
                      i4 = -1 << -1;
                      f1 = -0.0F;
                      i8 = i4;
                      continue;
                      i4 = j;
                      if (i4 == 0)
                      {
                        i4 = -1;
                        f1 = 0.0F / 0.0F;
                        i8 = i4;
                      }
                      else
                      {
                        i4 = -1 << -1;
                        f1 = -0.0F;
                        i8 = i4;
                        continue;
                        i4 = j;
                        if (i4 == 0)
                        {
                          i4 = 1;
                          f1 = Float.MIN_VALUE;
                          i8 = i4;
                        }
                        else
                        {
                          i4 = -1 << -1;
                          f1 = -0.0F;
                          i8 = i4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        label470:
        localObject1 = (StaggeredGridLayoutManager.b)localView1.getLayoutParams();
        boolean bool4 = b;
        StaggeredGridLayoutManager.e locale = a;
        int i4 = 1;
        f1 = Float.MIN_VALUE;
        if (i8 == i4) {}
        int i11;
        View localView2;
        for (i4 = u();; i4 = v())
        {
          a(i4, paramr);
          i(i8);
          localObject2 = l;
          i11 = l.d + i4;
          c = i11;
          localObject2 = l;
          as localas = b;
          int i12 = localas.e();
          float f2 = i12;
          i11 = (int)(0.33333334F * f2);
          b = i11;
          l.h = true;
          localObject2 = l;
          i11 = 0;
          localView2 = null;
          a = false;
          localObject2 = l;
          a(paramm, (al)localObject2, paramr);
          bool3 = e;
          o = bool3;
          if (bool4) {
            break label691;
          }
          localObject2 = locale.a(i4, i8);
          if ((localObject2 == null) || (localObject2 == localView1)) {
            break label691;
          }
          localObject1 = localObject2;
          break;
        }
        label691:
        boolean bool3 = l(i8);
        if (bool3)
        {
          i10 = i + -1;
          for (i11 = i10;; i11 = i10)
          {
            if (i11 < 0) {
              break label832;
            }
            localObject2 = a[i11].a(i4, i8);
            if ((localObject2 != null) && (localObject2 != localView1))
            {
              localObject1 = localObject2;
              break;
            }
            i10 = i11 + -1;
          }
        }
        int i10 = 0;
        Object localObject2 = null;
        for (;;)
        {
          i11 = i;
          if (i10 >= i11) {
            break label832;
          }
          localView2 = a[i10].a(i4, i8);
          if ((localView2 != null) && (localView2 != localView1))
          {
            localObject1 = localView2;
            break;
          }
          i10 += 1;
        }
        label832:
        int i5 = d;
        if (i5 == 0)
        {
          i5 = 1;
          f1 = Float.MIN_VALUE;
          i10 = i5;
          label854:
          int i6 = -1;
          f1 = 0.0F / 0.0F;
          if (i8 != i6) {
            break label1047;
          }
          i6 = 1;
          f1 = Float.MIN_VALUE;
          label876:
          if (i10 != i6) {
            break label1059;
          }
          i6 = 1;
          f1 = Float.MIN_VALUE;
          i11 = i6;
          label894:
          if (!bool4)
          {
            if (i11 == 0) {
              break label1077;
            }
            i6 = locale.f();
            label911:
            localObject1 = a(i6);
            if ((localObject1 != null) && (localObject1 != localView1)) {
              continue;
            }
          }
          boolean bool2 = l(i8);
          if (!bool2) {
            break label1106;
          }
          i7 = i + -1;
          i10 = i7;
          label956:
          if (i10 < 0) {
            break label1204;
          }
          i7 = e;
          if (i10 != i7)
          {
            if (i11 == 0) {
              break label1087;
            }
            localObject1 = a[i10];
          }
        }
        for (int i7 = ((StaggeredGridLayoutManager.e)localObject1).f();; i7 = ((StaggeredGridLayoutManager.e)localObject1).g())
        {
          localObject1 = a(i7);
          if ((localObject1 != null) && (localObject1 != localView1)) {
            break;
          }
          i7 = i10 + -1;
          i10 = i7;
          break label956;
          i7 = 0;
          f1 = 0.0F;
          localObject1 = null;
          i10 = 0;
          localObject2 = null;
          break label854;
          label1047:
          i7 = 0;
          f1 = 0.0F;
          localObject1 = null;
          break label876;
          label1059:
          i7 = 0;
          f1 = 0.0F;
          localObject1 = null;
          i11 = 0;
          localView2 = null;
          break label894;
          label1077:
          i7 = locale.g();
          break label911;
          label1087:
          localObject1 = a[i10];
        }
        label1106:
        i7 = 0;
        f1 = 0.0F;
        localObject1 = null;
        for (;;)
        {
          i10 = i;
          if (i7 >= i10) {
            break label1204;
          }
          if (i11 != 0) {
            localObject2 = a[i7];
          }
          for (i10 = ((StaggeredGridLayoutManager.e)localObject2).f();; i10 = ((StaggeredGridLayoutManager.e)localObject2).g())
          {
            localObject2 = a(i10);
            if ((localObject2 == null) || (localObject2 == localView1)) {
              break label1195;
            }
            localObject1 = localObject2;
            break;
            localObject2 = a[i7];
          }
          label1195:
          i7 += 1;
        }
        label1204:
        i7 = 0;
        f1 = 0.0F;
        localObject1 = null;
      }
    }
  }
  
  public final void a()
  {
    h.a();
    j();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 1);
  }
  
  public final void a(int paramInt1, int paramInt2, at.r paramr, at.g.a parama)
  {
    int i1 = 0;
    int i2 = j;
    if (i2 == 0)
    {
      i2 = l();
      if ((i2 != 0) && (paramInt1 != 0)) {
        break label35;
      }
    }
    label35:
    label393:
    for (;;)
    {
      return;
      paramInt1 = paramInt2;
      break;
      b(paramInt1, paramr);
      Object localObject1 = M;
      if (localObject1 != null)
      {
        localObject1 = M;
        i2 = localObject1.length;
        i4 = i;
        if (i2 >= i4) {}
      }
      else
      {
        i2 = i;
        localObject1 = new int[i2];
        M = ((int[])localObject1);
      }
      i2 = 0;
      localObject1 = null;
      int i4 = 0;
      int i5 = i;
      Object localObject2;
      int i6;
      Object localObject3;
      if (i2 < i5)
      {
        localObject2 = l;
        i5 = d;
        i6 = -1;
        if (i5 == i6)
        {
          localObject2 = l;
          i5 = f;
          localObject3 = a[i2];
          al localal = l;
          int i7 = f;
          i6 = ((StaggeredGridLayoutManager.e)localObject3).a(i7);
          i5 -= i6;
        }
        for (;;)
        {
          if (i5 >= 0)
          {
            localObject3 = M;
            localObject3[i4] = i5;
            i4 += 1;
          }
          i2 += 1;
          break;
          localObject2 = a[i2];
          i6 = l.g;
          i5 = ((StaggeredGridLayoutManager.e)localObject2).b(i6);
          localObject3 = l;
          i6 = g;
          i5 -= i6;
        }
      }
      localObject1 = M;
      Arrays.sort((int[])localObject1, 0, i4);
      for (;;)
      {
        if (i1 >= i4) {
          break label393;
        }
        localObject1 = l;
        boolean bool = ((al)localObject1).a(paramr);
        if (!bool) {
          break;
        }
        int i3 = l.c;
        localObject2 = M;
        i5 = localObject2[i1];
        parama.a(i3, i5);
        localObject1 = l;
        i5 = c;
        localObject3 = l;
        i6 = d;
        i5 += i6;
        c = i5;
        i1 += 1;
      }
    }
  }
  
  public final void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = m();
    int i2 = o() + i1;
    i1 = n();
    int i3 = p();
    i1 += i3;
    i3 = j;
    int i4 = 1;
    at localat;
    if (i3 == i4)
    {
      i3 = paramRect.height();
      i1 += i3;
      i3 = w.r(q);
      i1 = a(paramInt2, i1, i3);
      i3 = k;
      i4 = i;
      i3 *= i4;
      i2 += i3;
      localat = q;
      i3 = w.q(localat);
      i2 = a(paramInt1, i2, i3);
    }
    for (;;)
    {
      h(i2, i1);
      return;
      i3 = paramRect.width();
      i2 += i3;
      i3 = w.q(q);
      i2 = a(paramInt1, i2, i3);
      i3 = k;
      i4 = i;
      i3 *= i4;
      i1 += i3;
      localat = q;
      i3 = w.r(localat);
      i1 = a(paramInt2, i1, i3);
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof StaggeredGridLayoutManager.d;
    if (bool)
    {
      paramParcelable = (StaggeredGridLayoutManager.d)paramParcelable;
      G = paramParcelable;
      j();
    }
  }
  
  public final void a(at.m paramm, at.r paramr, View paramView, b paramb)
  {
    int i1 = 1;
    int i2 = -1;
    Object localObject = paramView.getLayoutParams();
    boolean bool1 = localObject instanceof StaggeredGridLayoutManager.b;
    if (!bool1)
    {
      super.a(paramView, paramb);
      return;
    }
    localObject = (StaggeredGridLayoutManager.b)localObject;
    int i3 = j;
    int i4;
    if (i3 == 0)
    {
      i3 = ((StaggeredGridLayoutManager.b)localObject).a();
      i4 = b;
      if (i4 != 0) {
        i1 = i;
      }
      i4 = i3;
      i3 = i1;
      i1 = i2;
    }
    for (;;)
    {
      boolean bool2 = b;
      localObject = b.n.a(i4, i3, i2, i1, bool2);
      paramb.a(localObject);
      break;
      i3 = ((StaggeredGridLayoutManager.b)localObject).a();
      int i5 = b;
      if (i5 != 0)
      {
        i1 = i;
        i5 = i2;
        i2 = i3;
        i3 = i5;
      }
      else
      {
        i5 = i2;
        i2 = i3;
        i3 = i5;
      }
    }
  }
  
  public final void a(at.r paramr)
  {
    super.a(paramr);
    f = -1;
    g = (-1 << -1);
    G = null;
    J.a();
  }
  
  public final void a(at paramat, at.m paramm)
  {
    Runnable localRunnable = N;
    a(localRunnable);
    int i1 = 0;
    localRunnable = null;
    for (;;)
    {
      int i2 = i;
      if (i1 >= i2) {
        break;
      }
      StaggeredGridLayoutManager.e locale = a[i1];
      locale.c();
      i1 += 1;
    }
    paramat.requestLayout();
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = 0;
    View localView1 = null;
    super.a(paramAccessibilityEvent);
    int i2 = l();
    f localf;
    View localView2;
    if (i2 > 0)
    {
      localf = a.a(paramAccessibilityEvent);
      localView2 = b(false);
      localView1 = c(false);
      if ((localView2 != null) && (localView1 != null)) {
        break label49;
      }
    }
    for (;;)
    {
      return;
      label49:
      int i3 = a(localView2);
      i1 = a(localView1);
      if (i3 < i1)
      {
        localf.a(i3);
        localf.b(i1);
      }
      else
      {
        localf.a(i1);
        localf.b(i3);
      }
    }
  }
  
  public final void a(String paramString)
  {
    StaggeredGridLayoutManager.d locald = G;
    if (locald == null) {
      super.a(paramString);
    }
  }
  
  public final boolean a(at.h paramh)
  {
    return paramh instanceof StaggeredGridLayoutManager.b;
  }
  
  public final int b(int paramInt, at.m paramm, at.r paramr)
  {
    return c(paramInt, paramm, paramr);
  }
  
  public final int b(at.m paramm, at.r paramr)
  {
    int i1 = j;
    int i2 = 1;
    if (i1 == i2) {}
    for (i1 = i;; i1 = super.b(paramm, paramr)) {
      return i1;
    }
  }
  
  public final int b(at.r paramr)
  {
    return h(paramr);
  }
  
  public final at.h b()
  {
    int i1 = -1;
    int i2 = -2;
    int i3 = j;
    StaggeredGridLayoutManager.b localb;
    if (i3 == 0)
    {
      localb = new android/support/v7/widget/StaggeredGridLayoutManager$b;
      localb.<init>(i2, i1);
    }
    for (;;)
    {
      return localb;
      localb = new android/support/v7/widget/StaggeredGridLayoutManager$b;
      localb.<init>(i1, i2);
    }
  }
  
  public final void b(int paramInt)
  {
    int i1 = -1;
    StaggeredGridLayoutManager.d locald = G;
    if (locald != null)
    {
      locald = G;
      int i2 = a;
      if (i2 != paramInt)
      {
        locald = G;
        d = null;
        c = 0;
        a = i1;
        b = i1;
      }
    }
    f = paramInt;
    g = (-1 << -1);
    j();
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 2);
  }
  
  public final int c(at.r paramr)
  {
    return h(paramr);
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 4);
  }
  
  public final void c(at.m paramm, at.r paramr)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i19 = i1;
    StaggeredGridLayoutManager.a locala = J;
    Object localObject1 = G;
    int i21;
    if (localObject1 == null)
    {
      i1 = f;
      i21 = -1;
      f2 = 0.0F / 0.0F;
      if (i1 == i21) {}
    }
    else
    {
      i1 = paramr.a();
      if (i1 == 0)
      {
        c(paramm);
        locala.a();
        label64:
        return;
      }
    }
    boolean bool1 = e;
    if (bool1)
    {
      i2 = f;
      i21 = -1;
      f2 = 0.0F / 0.0F;
      if (i2 == i21)
      {
        localObject1 = G;
        if (localObject1 == null) {
          break label295;
        }
      }
    }
    int i2 = 1;
    f1 = Float.MIN_VALUE;
    int i30 = i2;
    float f3 = f1;
    label187:
    Object localObject3;
    int i32;
    label295:
    Object localObject4;
    label315:
    label559:
    label595:
    int i6;
    if (i30 != 0)
    {
      locala.a();
      localObject1 = G;
      if (localObject1 == null) {
        break label918;
      }
      localObject1 = G;
      i2 = c;
      if (i2 > 0)
      {
        localObject1 = G;
        i2 = c;
        i21 = i;
        if (i2 == i21)
        {
          i2 = 0;
          f1 = 0.0F;
          localObject1 = null;
          i21 = i;
          if (i2 < i21)
          {
            a[i2].c();
            localObject2 = G.d;
            i21 = localObject2[i2];
            int i31 = -1 << -1;
            if (i21 != i31)
            {
              localObject3 = G;
              boolean bool19 = i;
              if (!bool19) {
                break label315;
              }
              localObject3 = b;
              i32 = ((as)localObject3).c();
              i21 += i32;
            }
            for (;;)
            {
              localObject3 = a[i2];
              ((StaggeredGridLayoutManager.e)localObject3).c(i21);
              i2 += 1;
              break label187;
              i2 = 0;
              f1 = 0.0F;
              localObject1 = null;
              i30 = 0;
              localObject4 = null;
              f3 = 0.0F;
              break;
              localObject3 = b;
              i32 = ((as)localObject3).b();
              i21 += i32;
            }
          }
        }
        else
        {
          localObject1 = G;
          d = null;
          c = 0;
          e = 0;
          f = null;
          f2 = 0.0F;
          g = null;
          localObject1 = G;
          localObject2 = G;
          i21 = b;
          a = i21;
        }
      }
      boolean bool2 = G.j;
      F = bool2;
      bool2 = G.h;
      a(bool2);
      s();
      localObject1 = G;
      int i3 = a;
      i21 = -1;
      f2 = 0.0F / 0.0F;
      if (i3 == i21) {
        break label904;
      }
      i3 = G.a;
      f = i3;
      localObject1 = G;
      boolean bool3 = i;
      c = bool3;
      localObject1 = G;
      int i4 = e;
      i21 = 1;
      f2 = Float.MIN_VALUE;
      if (i4 > i21)
      {
        localObject1 = h;
        localObject2 = G.f;
        a = ((int[])localObject2);
        localObject1 = h;
        localObject2 = G.g;
        b = ((List)localObject2);
      }
      boolean bool4 = g;
      if (!bool4)
      {
        i5 = f;
        i21 = -1;
        f2 = 0.0F / 0.0F;
        if (i5 != i21) {
          break label936;
        }
      }
      int i5 = 0;
      f1 = 0.0F;
      localObject1 = null;
      if (i5 == 0)
      {
        boolean bool5 = o;
        if (!bool5) {
          break label1767;
        }
        i32 = paramr.a();
        i6 = l() + -1;
        i21 = i6;
        label624:
        if (i21 < 0) {
          break label1756;
        }
        localObject1 = d(i21);
        i6 = a((View)localObject1);
        if ((i6 < 0) || (i6 >= i32)) {
          break label1745;
        }
      }
    }
    label904:
    label918:
    label936:
    label1069:
    label1167:
    label1219:
    label1274:
    label1478:
    label1497:
    label1529:
    label1601:
    label1610:
    label1621:
    label1719:
    label1745:
    label1756:
    label1767:
    int i27;
    for (;;)
    {
      a = i6;
      i6 = -1 << -1;
      f1 = -0.0F;
      b = i6;
      i6 = 1;
      f1 = Float.MIN_VALUE;
      e = i6;
      localObject1 = G;
      if (localObject1 == null)
      {
        i6 = f;
        i21 = -1;
        f2 = 0.0F / 0.0F;
        if (i6 == i21)
        {
          boolean bool6 = c;
          boolean bool17 = o;
          if (bool6 == bool17)
          {
            bool6 = t();
            bool17 = F;
            if (bool6 == bool17) {}
          }
          else
          {
            localObject1 = h;
            ((StaggeredGridLayoutManager.c)localObject1).a();
            bool6 = true;
            f1 = Float.MIN_VALUE;
            d = bool6;
          }
        }
      }
      int i7 = l();
      if (i7 <= 0) {
        break label2251;
      }
      localObject1 = G;
      if (localObject1 != null)
      {
        localObject1 = G;
        i7 = c;
        if (i7 > 0) {
          break label2251;
        }
      }
      int i8 = d;
      if (i8 == 0) {
        break label1849;
      }
      i8 = 0;
      f1 = 0.0F;
      localObject1 = null;
      int i23;
      for (;;)
      {
        int i22 = i;
        if (i8 >= i22) {
          break;
        }
        localObject2 = a[i8];
        ((StaggeredGridLayoutManager.e)localObject2).c();
        i23 = b;
        i30 = -1 << -1;
        f3 = -0.0F;
        if (i23 != i30)
        {
          localObject2 = a[i8];
          i30 = b;
          ((StaggeredGridLayoutManager.e)localObject2).c(i30);
        }
        int i9;
        i8 += 1;
      }
      boolean bool7 = e;
      c = bool7;
      break;
      s();
      bool7 = e;
      c = bool7;
      break label559;
      int i10 = f;
      if (i10 >= 0)
      {
        i10 = f;
        i23 = paramr.a();
        if (i10 < i23) {}
      }
      else
      {
        f = -1;
        g = (-1 << -1);
        i10 = 0;
        f1 = 0.0F;
        localObject1 = null;
        break label595;
      }
      localObject1 = G;
      if (localObject1 != null)
      {
        localObject1 = G;
        i10 = a;
        i23 = -1;
        f2 = 0.0F / 0.0F;
        if (i10 != i23)
        {
          localObject1 = G;
          i10 = c;
          if (i10 > 0) {
            break label1719;
          }
        }
      }
      i10 = f;
      localObject2 = a(i10);
      int i13;
      if (localObject2 != null)
      {
        boolean bool8 = e;
        if (bool8)
        {
          int i11 = u();
          a = i11;
          i11 = g;
          i32 = -1 << -1;
          if (i11 == i32) {
            break label1219;
          }
          boolean bool9 = c;
          if (!bool9) {
            break label1167;
          }
          localObject1 = b;
          i12 = ((as)localObject1).c();
          i32 = g;
          i12 -= i32;
          localObject3 = b;
          i23 = ((as)localObject3).b((View)localObject2);
          i12 -= i23;
        }
        for (b = i12;; b = i12)
        {
          i12 = 1;
          f1 = Float.MIN_VALUE;
          break;
          i12 = v();
          break label1069;
          localObject1 = b;
          i12 = ((as)localObject1).b();
          i32 = g;
          i12 += i32;
          localObject3 = b;
          i23 = ((as)localObject3).a((View)localObject2);
          i12 -= i23;
        }
        localObject1 = b;
        int i12 = ((as)localObject1).e((View)localObject2);
        localObject3 = b;
        i32 = ((as)localObject3).e();
        if (i12 > i32)
        {
          boolean bool10 = c;
          if (bool10)
          {
            localObject1 = b;
            i13 = ((as)localObject1).c();
            b = i13;
          }
        }
      }
      for (;;)
      {
        i13 = 1;
        f1 = Float.MIN_VALUE;
        break;
        localObject1 = b;
        i13 = ((as)localObject1).b();
        break label1274;
        localObject1 = b;
        i13 = ((as)localObject1).a((View)localObject2);
        localObject3 = b;
        i32 = ((as)localObject3).b();
        i13 -= i32;
        if (i13 < 0)
        {
          i13 = -i13;
          b = i13;
        }
        else
        {
          localObject1 = b;
          i13 = ((as)localObject1).c();
          localObject3 = b;
          i23 = ((as)localObject3).b((View)localObject2);
          i13 -= i23;
          if (i13 < 0)
          {
            b = i13;
          }
          else
          {
            i13 = -1 << -1;
            f1 = -0.0F;
            b = i13;
            continue;
            i13 = f;
            a = i13;
            i13 = g;
            i23 = -1 << -1;
            f2 = -0.0F;
            if (i13 == i23)
            {
              i13 = a;
              i23 = l();
              if (i23 == 0)
              {
                boolean bool11 = e;
                if (bool11) {
                  break label1601;
                }
                int i14 = -1;
                f1 = 0.0F / 0.0F;
                i23 = 1;
                f2 = Float.MIN_VALUE;
                if (i14 != i23) {
                  break label1610;
                }
                i14 = 1;
                f1 = Float.MIN_VALUE;
                c = i14;
                boolean bool12 = c;
                if (!bool12) {
                  break label1621;
                }
                localObject1 = g.b;
                i15 = ((as)localObject1).c();
                b = i15;
              }
            }
            for (;;)
            {
              i15 = 1;
              f1 = Float.MIN_VALUE;
              d = i15;
              break;
              i23 = v();
              if (i15 < i23)
              {
                i15 = 1;
                f1 = Float.MIN_VALUE;
              }
              for (;;)
              {
                int i24 = e;
                if (i15 == i24) {
                  break label1601;
                }
                i15 = -1;
                f1 = 0.0F / 0.0F;
                break;
                i15 = 0;
                f1 = 0.0F;
                localObject1 = null;
              }
              i15 = 1;
              f1 = Float.MIN_VALUE;
              break label1478;
              i15 = 0;
              f1 = 0.0F;
              localObject1 = null;
              break label1497;
              localObject1 = g.b;
              i15 = ((as)localObject1).b();
              break label1529;
              i15 = g;
              boolean bool18 = c;
              if (bool18)
              {
                localObject2 = g.b;
                int i25 = ((as)localObject2).c();
                i15 = i25 - i15;
                b = i15;
              }
              else
              {
                localObject2 = g.b;
                i26 = ((as)localObject2).b();
                i15 += i26;
                b = i15;
              }
            }
            f1 = -0.0F;
            b = (-1 << -1);
            i15 = f;
            a = i15;
          }
        }
      }
      i15 = i26 + -1;
      int i26 = i15;
      break label624;
      i15 = 0;
      f1 = 0.0F;
      localObject1 = null;
      continue;
      i32 = paramr.a();
      int i36 = l();
      i15 = 0;
      f1 = 0.0F;
      localObject1 = null;
      i27 = 0;
      localObject2 = null;
      f2 = 0.0F;
      for (;;)
      {
        if (i27 >= i36) {
          break label1838;
        }
        localObject1 = d(i27);
        i15 = a((View)localObject1);
        if ((i15 >= 0) && (i15 < i32)) {
          break;
        }
        i15 = i27 + 1;
        i27 = i15;
      }
      label1838:
      i15 = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
    label1849:
    int i28;
    label1932:
    Object localObject5;
    label2031:
    int i43;
    if (i30 == 0)
    {
      localObject1 = J.f;
      if (localObject1 != null) {}
    }
    else
    {
      i15 = 0;
      f1 = 0.0F;
      localObject1 = null;
      i27 = i;
      if (i15 < i27)
      {
        localObject2 = a;
        localObject4 = localObject2[i15];
        boolean bool20 = e;
        int i37 = b;
        if (bool20)
        {
          f2 = -0.0F;
          i28 = ((StaggeredGridLayoutManager.e)localObject4).b(-1 << -1);
          ((StaggeredGridLayoutManager.e)localObject4).c();
          int i39 = -1 << -1;
          if (i28 != i39) {
            if (bool20)
            {
              localObject5 = f.b;
              int i40 = ((as)localObject5).c();
              if (i28 < i40) {}
            }
            else
            {
              if (bool20) {
                break label2031;
              }
              localObject3 = f.b;
              int i33 = ((as)localObject3).b();
              if (i28 <= i33) {
                break label2031;
              }
            }
          }
        }
        for (;;)
        {
          i15 += 1;
          break;
          f2 = -0.0F;
          i28 = ((StaggeredGridLayoutManager.e)localObject4).a(-1 << -1);
          break label1932;
          i34 = -1 << -1;
          if (i37 != i34) {
            i28 += i37;
          }
          c = i28;
          b = i28;
        }
      }
      localObject2 = J;
      localObject4 = a;
      int i34 = localObject4.length;
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject1 = f;
        i15 = localObject1.length;
        if (i15 >= i34) {}
      }
      else
      {
        i15 = g.a.length;
        localObject1 = new int[i15];
        f = ((int[])localObject1);
      }
      i15 = 0;
      f1 = 0.0F;
      localObject1 = null;
      while (i15 < i34)
      {
        int[] arrayOfInt = f;
        localObject5 = localObject4[i15];
        i43 = -1 << -1;
        int i41 = ((StaggeredGridLayoutManager.e)localObject5).a(i43);
        arrayOfInt[i15] = i41;
        i15 += 1;
      }
    }
    int i15 = 0;
    f1 = 0.0F;
    localObject1 = null;
    for (;;)
    {
      i28 = i;
      if (i15 >= i28) {
        break;
      }
      localObject2 = a[i15];
      ((StaggeredGridLayoutManager.e)localObject2).c();
      localObject4 = J.f;
      i30 = localObject4[i15];
      ((StaggeredGridLayoutManager.e)localObject2).c(i30);
      i15 += 1;
    }
    label2251:
    a(paramm);
    localObject1 = l;
    int i29 = 0;
    float f2 = 0.0F;
    Object localObject2 = null;
    a = false;
    f1 = 0.0F;
    K = false;
    localObject1 = c;
    i15 = ((as)localObject1).e();
    h(i15);
    i15 = a;
    a(i15, paramr);
    int i16 = c;
    label2410:
    int i38;
    int i35;
    label2467:
    boolean bool21;
    int i18;
    if (i16 != 0)
    {
      i(-1);
      localObject1 = l;
      a(paramm, (al)localObject1, paramr);
      i16 = 1;
      f1 = Float.MIN_VALUE;
      i(i16);
      localObject1 = l;
      i29 = a;
      localObject4 = l;
      i30 = d;
      i29 += i30;
      c = i29;
      localObject1 = l;
      a(paramm, (al)localObject1, paramr);
      localObject1 = c;
      int i17 = ((as)localObject1).g();
      i29 = 1073741824;
      f2 = 2.0F;
      if (i17 == i29) {
        break label3030;
      }
      i30 = 0;
      f3 = 0.0F;
      localObject4 = null;
      i38 = l();
      i17 = 0;
      f1 = 0.0F;
      localObject1 = null;
      i35 = 0;
      localObject3 = null;
      if (i35 >= i38) {
        break label2680;
      }
      localObject1 = d(i35);
      localObject2 = c;
      i29 = ((as)localObject2).e((View)localObject1);
      f2 = i29;
      bool21 = f2 < f3;
      if (bool21) {
        break label3292;
      }
      localObject1 = (StaggeredGridLayoutManager.b)((View)localObject1).getLayoutParams();
      boolean bool13 = b;
      if (!bool13) {
        break label3285;
      }
      i18 = 1065353216;
      f1 = 1.0F * f2;
      i29 = i;
      f2 = i29;
      f1 /= f2;
    }
    label2564:
    label2680:
    label2943:
    label3030:
    label3070:
    label3276:
    label3285:
    label3292:
    for (f1 = Math.max(f3, f1);; f1 = f3)
    {
      i29 = i35 + 1;
      i35 = i29;
      f3 = f1;
      break label2467;
      i(1);
      localObject1 = l;
      a(paramm, (al)localObject1, paramr);
      i18 = -1;
      f1 = 0.0F / 0.0F;
      i(i18);
      localObject1 = l;
      i29 = a;
      localObject4 = l;
      i30 = d;
      i29 += i30;
      c = i29;
      localObject1 = l;
      a(paramm, (al)localObject1, paramr);
      break label2410;
      i35 = k;
      f1 = i * f3;
      i18 = Math.round(f1);
      localObject2 = c;
      i29 = ((as)localObject2).g();
      i30 = -1 << -1;
      f3 = -0.0F;
      if (i29 == i30)
      {
        localObject2 = c;
        i29 = ((as)localObject2).e();
        i18 = Math.min(i18, i29);
      }
      h(i18);
      i18 = k;
      if (i18 != i35)
      {
        i18 = 0;
        f1 = 0.0F;
        localObject1 = null;
        i29 = 0;
        localObject2 = null;
        f2 = 0.0F;
        if (i29 < i38)
        {
          localObject4 = d(i29);
          localObject1 = (StaggeredGridLayoutManager.b)((View)localObject4).getLayoutParams();
          bool21 = b;
          int i42;
          if (!bool21)
          {
            bool21 = t();
            if (!bool21) {
              break label2943;
            }
            i42 = j;
            i43 = 1;
            if (i42 != i43) {
              break label2943;
            }
            i42 = i + -1;
            StaggeredGridLayoutManager.e locale = a;
            i43 = e;
            i42 = -(i42 - i43);
            i43 = k;
            i42 *= i43;
            i43 = i + -1;
            localObject1 = a;
            i18 = e;
            i18 = -(i43 - i18) * i35;
            i18 = i42 - i18;
            ((View)localObject4).offsetLeftAndRight(i18);
          }
          for (;;)
          {
            i18 = i29 + 1;
            i29 = i18;
            break;
            localObject5 = a;
            i42 = e;
            i43 = k;
            i42 *= i43;
            localObject1 = a;
            i18 = e * i35;
            i43 = j;
            int i44 = 1;
            if (i43 == i44)
            {
              i18 = i42 - i18;
              ((View)localObject4).offsetLeftAndRight(i18);
            }
            else
            {
              i18 = i42 - i18;
              ((View)localObject4).offsetTopAndBottom(i18);
            }
          }
        }
      }
      i18 = l();
      boolean bool14;
      boolean bool16;
      Object localObject6;
      if (i18 > 0)
      {
        bool14 = e;
        if (bool14)
        {
          a(paramm, paramr, true);
          bool14 = false;
          f1 = 0.0F;
          localObject1 = null;
          b(paramm, paramr, false);
        }
      }
      else
      {
        bool14 = false;
        f1 = 0.0F;
        localObject1 = null;
        if (i19 != 0)
        {
          boolean bool15 = g;
          if (!bool15)
          {
            int i20 = n;
            if (i20 == 0) {
              break label3276;
            }
            i20 = l();
            if (i20 <= 0) {
              break label3276;
            }
            bool16 = K;
            if (!bool16)
            {
              localObject6 = r();
              if (localObject6 == null) {
                break label3276;
              }
            }
            bool16 = true;
          }
        }
      }
      for (;;)
      {
        if (bool16)
        {
          localObject6 = N;
          a((Runnable)localObject6);
          bool16 = g();
          if (bool16)
          {
            bool14 = true;
            f1 = Float.MIN_VALUE;
          }
        }
        bool16 = g;
        if (bool16)
        {
          localObject6 = J;
          ((StaggeredGridLayoutManager.a)localObject6).a();
        }
        bool16 = c;
        o = bool16;
        bool16 = t();
        F = bool16;
        if (!bool14) {
          break label64;
        }
        J.a();
        bool14 = false;
        f1 = 0.0F;
        localObject1 = null;
        bool16 = false;
        localObject6 = null;
        break;
        b(paramm, paramr, true);
        bool14 = false;
        f1 = 0.0F;
        localObject1 = null;
        a(paramm, paramr, false);
        break label3070;
        bool16 = false;
        localObject6 = null;
      }
      f1 = f2;
      break label2564;
    }
  }
  
  public final boolean c()
  {
    StaggeredGridLayoutManager.d locald = G;
    boolean bool;
    if (locald == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locald = null;
    }
  }
  
  public final int d(at.r paramr)
  {
    return i(paramr);
  }
  
  public final Parcelable d()
  {
    boolean bool1 = true;
    int i1 = 0;
    Object localObject1 = null;
    int i2 = -1;
    int i4 = -1 << -1;
    Object localObject2 = G;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = new android/support/v7/widget/StaggeredGridLayoutManager$d;
      localObject3 = G;
      ((StaggeredGridLayoutManager.d)localObject2).<init>((StaggeredGridLayoutManager.d)localObject3);
    }
    for (;;)
    {
      return (Parcelable)localObject2;
      StaggeredGridLayoutManager.d locald = new android/support/v7/widget/StaggeredGridLayoutManager$d;
      locald.<init>();
      boolean bool3 = d;
      h = bool3;
      bool3 = o;
      i = bool3;
      bool3 = F;
      j = bool3;
      localObject2 = h;
      label195:
      label220:
      label229:
      int i8;
      label270:
      int i3;
      if (localObject2 != null)
      {
        localObject2 = h.a;
        if (localObject2 != null)
        {
          localObject2 = h.a;
          f = ((int[])localObject2);
          int i5 = f.length;
          e = i5;
          localObject2 = h.b;
          g = ((List)localObject2);
          i5 = l();
          if (i5 <= 0) {
            break label438;
          }
          boolean bool4 = o;
          if (!bool4) {
            break label365;
          }
          int i6 = u();
          a = i6;
          int i7 = e;
          if (i7 == 0) {
            break label374;
          }
          localObject2 = c(bool1);
          if (localObject2 != null) {
            break label384;
          }
          i7 = i2;
          b = i7;
          i8 = i;
          c = i8;
          localObject2 = new int[i];
          d = ((int[])localObject2);
          i8 = 0;
          localObject2 = null;
          i2 = i;
          if (i8 >= i2) {
            break label458;
          }
          boolean bool2 = o;
          if (!bool2) {
            break label394;
          }
          localObject3 = a[i8];
          i3 = ((StaggeredGridLayoutManager.e)localObject3).b(i4);
          if (i3 != i4)
          {
            localObject1 = b;
            i1 = ((as)localObject1).c();
            i3 -= i1;
          }
        }
      }
      for (;;)
      {
        localObject1 = d;
        localObject1[i8] = i3;
        i8 += 1;
        break label270;
        e = 0;
        break;
        label365:
        i8 = v();
        break label195;
        label374:
        localObject2 = b(bool1);
        break label220;
        label384:
        i8 = a((View)localObject2);
        break label229;
        label394:
        localObject3 = a[i8];
        i3 = ((StaggeredGridLayoutManager.e)localObject3).a(i4);
        if (i3 != i4)
        {
          localObject1 = b;
          i1 = ((as)localObject1).b();
          i3 -= i1;
        }
      }
      label438:
      a = i3;
      b = i3;
      c = 0;
      label458:
      localObject2 = locald;
    }
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 8);
  }
  
  public final int e(at.r paramr)
  {
    return i(paramr);
  }
  
  public final void e(int paramInt)
  {
    super.e(paramInt);
    int i1 = 0;
    for (;;)
    {
      int i2 = i;
      if (i1 >= i2) {
        break;
      }
      StaggeredGridLayoutManager.e locale = a[i1];
      locale.d(paramInt);
      i1 += 1;
    }
  }
  
  public final boolean e()
  {
    int i1 = j;
    if (i1 == 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final int f(at.r paramr)
  {
    return j(paramr);
  }
  
  public final void f(int paramInt)
  {
    super.f(paramInt);
    int i1 = 0;
    for (;;)
    {
      int i2 = i;
      if (i1 >= i2) {
        break;
      }
      StaggeredGridLayoutManager.e locale = a[i1];
      locale.d(paramInt);
      i1 += 1;
    }
  }
  
  public final boolean f()
  {
    int i1 = 1;
    int i2 = j;
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public final int g(at.r paramr)
  {
    return j(paramr);
  }
  
  public final void g(int paramInt)
  {
    if (paramInt == 0) {
      g();
    }
  }
  
  final boolean g()
  {
    int i1 = 0;
    StaggeredGridLayoutManager.c localc = null;
    boolean bool1 = true;
    int i3 = l();
    boolean bool2;
    if (i3 != 0)
    {
      i3 = n;
      if (i3 != 0)
      {
        bool2 = v;
        if (bool2) {
          break label43;
        }
      }
    }
    bool1 = false;
    label43:
    int i7;
    for (;;)
    {
      return bool1;
      bool2 = e;
      int i4;
      if (bool2)
      {
        i6 = u();
        i4 = v();
        i7 = i6;
      }
      for (i6 = i4;; i6 = i4)
      {
        if (i7 != 0) {
          break label136;
        }
        localObject1 = r();
        if (localObject1 == null) {
          break label136;
        }
        localObject1 = h;
        ((StaggeredGridLayoutManager.c)localObject1).a();
        u = bool1;
        j();
        break;
        i6 = v();
        i4 = u();
        i7 = i6;
      }
      label136:
      bool3 = K;
      if (bool3) {
        break;
      }
      bool1 = false;
    }
    boolean bool3 = e;
    if (bool3) {}
    Object localObject2;
    int i2;
    for (int i5 = -1;; i5 = i2)
    {
      localObject2 = h;
      int i8 = i6 + 1;
      localObject2 = ((StaggeredGridLayoutManager.c)localObject2).a(i7, i8, i5);
      if (localObject2 != null) {
        break label230;
      }
      K = false;
      localObject1 = h;
      i2 = i6 + 1;
      ((StaggeredGridLayoutManager.c)localObject1).a(i2);
      i2 = 0;
      break;
    }
    label230:
    localc = h;
    int i6 = a;
    i5 *= -1;
    Object localObject1 = localc.a(i7, i6, i5);
    if (localObject1 == null)
    {
      localObject1 = h;
      i1 = a;
      ((StaggeredGridLayoutManager.c)localObject1).a(i1);
    }
    for (;;)
    {
      u = i2;
      j();
      break;
      localc = h;
      i5 = a + 1;
      localc.a(i5);
    }
  }
}


/* Location:              android/support/v7/widget/StaggeredGridLayoutManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */