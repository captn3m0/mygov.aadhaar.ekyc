package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.f;
import android.support.v4.h.w;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class am
  extends ViewGroup
{
  private boolean a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private float g;
  private boolean h;
  private int[] i;
  private int[] j;
  private Drawable k;
  private int l;
  private int m;
  private int n;
  private int o;
  
  public am(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public am(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public am(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a = bool1;
    b = i1;
    c = 0;
    int i2 = 8388659;
    e = i2;
    Object localObject = a.j.LinearLayoutCompat;
    localObject = bf.a(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    int i3 = a.j.LinearLayoutCompat_android_orientation;
    i3 = ((bf)localObject).a(i3, i1);
    if (i3 >= 0) {
      setOrientation(i3);
    }
    i3 = a.j.LinearLayoutCompat_android_gravity;
    i3 = ((bf)localObject).a(i3, i1);
    if (i3 >= 0) {
      setGravity(i3);
    }
    i3 = a.j.LinearLayoutCompat_android_baselineAligned;
    boolean bool2 = ((bf)localObject).a(i3, bool1);
    if (!bool2) {
      setBaselineAligned(bool2);
    }
    int i4 = a.j.LinearLayoutCompat_android_weightSum;
    float f1 = a.getFloat(i4, -1.0F);
    g = f1;
    i4 = a.j.LinearLayoutCompat_android_baselineAlignedChildIndex;
    i4 = ((bf)localObject).a(i4, i1);
    b = i4;
    i4 = a.j.LinearLayoutCompat_measureWithLargestChild;
    boolean bool3 = ((bf)localObject).a(i4, false);
    h = bool3;
    int i5 = a.j.LinearLayoutCompat_divider;
    Drawable localDrawable = ((bf)localObject).a(i5);
    setDividerDrawable(localDrawable);
    i5 = a.j.LinearLayoutCompat_showDividers;
    i5 = ((bf)localObject).a(i5, 0);
    n = i5;
    i5 = a.j.LinearLayoutCompat_dividerPadding;
    i5 = ((bf)localObject).e(i5, 0);
    o = i5;
    a.recycle();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = getMeasuredWidth();
    int i2 = 1073741824;
    int i3 = View.MeasureSpec.makeMeasureSpec(i1, i2);
    for (int i4 = 0; i4 < paramInt1; i4 = i1)
    {
      View localView = getChildAt(i4);
      i1 = localView.getVisibility();
      int i5 = 8;
      if (i1 != i5)
      {
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (am.a)localObject1;
        i1 = width;
        i5 = -1;
        if (i1 == i5)
        {
          int i6 = height;
          i1 = localView.getMeasuredHeight();
          height = i1;
          localObject1 = this;
          i5 = paramInt2;
          measureChildWithMargins(localView, i3, 0, paramInt2, 0);
          height = i6;
        }
      }
      i1 = i4 + 1;
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt)
  {
    Drawable localDrawable = k;
    int i1 = getPaddingLeft();
    int i2 = o;
    i1 += i2;
    i2 = getWidth();
    int i3 = getPaddingRight();
    i2 -= i3;
    i3 = o;
    i2 -= i3;
    i3 = m + paramInt;
    localDrawable.setBounds(i1, paramInt, i2, i3);
    k.draw(paramCanvas);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    float f1 = 0.0F;
    Object localObject1 = this;
    f = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 1;
    float f2 = Float.MIN_VALUE;
    int i13 = 0;
    float f3 = 0.0F;
    Object localObject2 = null;
    int i15 = getVirtualChildCount();
    int i16 = View.MeasureSpec.getMode(paramInt1);
    int i17 = View.MeasureSpec.getMode(paramInt2);
    int i18 = 0;
    float f4 = 0.0F;
    int i19 = 0;
    float f5 = 0.0F;
    Object localObject3 = i;
    if (localObject3 != null)
    {
      localObject3 = j;
      if (localObject3 != null) {}
    }
    else
    {
      localObject3 = new int[4];
      localObject1 = this;
      i = ((int[])localObject3);
      i1 = 4;
      f1 = 5.6E-45F;
      localObject3 = new int[i1];
      j = ((int[])localObject3);
    }
    localObject1 = this;
    int[] arrayOfInt = i;
    localObject1 = this;
    localObject1 = j;
    Object localObject4 = localObject1;
    int i20 = -1;
    arrayOfInt[3] = i20;
    arrayOfInt[2] = i20;
    arrayOfInt[1] = i20;
    arrayOfInt[0] = i20;
    localObject3 = null;
    int i21 = 1;
    float f6 = Float.MIN_VALUE;
    int i23 = 2;
    float f7 = 2.8E-45F;
    int i24 = 3;
    float f8 = 4.2E-45F;
    i20 = -1;
    float f9 = 0.0F / 0.0F;
    localObject1[i24] = i20;
    localObject1[i23] = i20;
    localObject1[i21] = i20;
    localObject1[0] = i20;
    localObject1 = this;
    boolean bool9 = a;
    boolean bool10 = h;
    i1 = 1073741824;
    f1 = 2.0F;
    if (i16 == i1)
    {
      i1 = 1;
      f1 = Float.MIN_VALUE;
    }
    int i26;
    float f10;
    int i27;
    View localView1;
    for (int i25 = i1;; i25 = 0)
    {
      i26 = -1 << -1;
      f10 = -0.0F;
      for (i27 = 0;; i27 = i1 + 1)
      {
        if (i27 >= i15) {
          break label1414;
        }
        localObject1 = this;
        localView1 = getChildAt(i27);
        if (localView1 != null) {
          break;
        }
        i1 = f + 0;
        f = i1;
        i1 = i27;
      }
      i1 = 0;
      f1 = 0.0F;
      localObject3 = null;
    }
    i1 = localView1.getVisibility();
    i23 = 8;
    f7 = 1.1E-44F;
    Object localObject5;
    float f11;
    int i3;
    label517:
    label562:
    label620:
    label715:
    label825:
    float f12;
    int i28;
    if (i1 != i23)
    {
      boolean bool1 = a(i27);
      if (bool1)
      {
        i2 = f;
        i23 = l;
        i2 += i23;
        f = i2;
      }
      localObject3 = localView1.getLayoutParams();
      localObject5 = localObject3;
      localObject5 = (am.a)localObject3;
      f1 = g;
      f11 = f3 + f1;
      int i2 = 1073741824;
      f1 = 2.0F;
      if (i16 == i2)
      {
        i2 = width;
        if (i2 == 0)
        {
          f1 = g;
          i13 = 0;
          f3 = 0.0F;
          localObject2 = null;
          boolean bool2 = f1 < 0.0F;
          if (bool2) {
            if (i25 != 0)
            {
              localObject1 = this;
              i3 = f;
              i13 = leftMargin;
              i23 = rightMargin;
              i13 += i23;
              i3 += i13;
              f = i3;
              if (!bool9) {
                break label1006;
              }
              f1 = 0.0F;
              localObject3 = null;
              i13 = 0;
              f3 = 0.0F;
              localObject2 = null;
              i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
              localView1.measure(i3, i3);
              i20 = i26;
              i26 = i19;
              f10 = f5;
              i3 = 0;
              f1 = 0.0F;
              localObject3 = null;
              i13 = 1073741824;
              f3 = 2.0F;
              if (i17 == i13) {
                break label3811;
              }
              i13 = height;
              i23 = -1;
              f7 = 0.0F / 0.0F;
              if (i13 != i23) {
                break label3811;
              }
              i13 = 1;
              f3 = Float.MIN_VALUE;
              i3 = 1;
              f1 = Float.MIN_VALUE;
              i23 = topMargin;
              i24 = bottomMargin;
              i23 += i24;
              i24 = localView1.getMeasuredHeight() + i23;
              i18 = w.j(localView1);
              i18 = bk.a(i9, i18);
              if (bool9)
              {
                i19 = localView1.getBaseline();
                i21 = -1;
                f6 = 0.0F / 0.0F;
                if (i19 != i21)
                {
                  i21 = h;
                  if (i21 >= 0) {
                    break label1330;
                  }
                  localObject1 = this;
                  i21 = e;
                  i21 = ((i21 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                  i9 = arrayOfInt[i21];
                  i9 = Math.max(i9, i19);
                  arrayOfInt[i21] = i9;
                  i9 = localObject4[i21];
                  i19 = i24 - i19;
                  i19 = Math.max(i9, i19);
                  localObject4[i21] = i19;
                }
              }
              i19 = Math.max(i8, i24);
              if (i12 == 0) {
                break label1340;
              }
              i21 = height;
              i12 = -1;
              f2 = 0.0F / 0.0F;
              if (i21 != i12) {
                break label1340;
              }
              i21 = 1;
              f6 = Float.MIN_VALUE;
              f12 = g;
              i12 = 0;
              f2 = 0.0F;
              i28 = f12 < 0.0F;
              if (i28 <= 0) {
                break label1358;
              }
              if (i3 == 0) {
                break label1352;
              }
              i3 = i23;
              label856:
              i3 = Math.max(i11, i3);
              f7 = f11;
              i24 = i21;
              f8 = f6;
              i28 = i10;
              i21 = i26;
              f6 = f10;
              i26 = i19;
              int i30 = i20;
              i20 = i3;
              i3 = i30;
            }
          }
        }
      }
    }
    for (;;)
    {
      i19 = i27 + 0;
      i12 = i24;
      f2 = f8;
      i11 = i20;
      i10 = i28;
      i9 = i18;
      i8 = i26;
      i26 = i3;
      i18 = i13;
      f4 = f3;
      i3 = i19;
      f3 = f7;
      i19 = i21;
      f5 = f6;
      break;
      localObject1 = this;
      i3 = f;
      i13 = leftMargin + i3;
      i23 = rightMargin;
      i13 += i23;
      i3 = Math.max(i3, i13);
      f = i3;
      break label517;
      label1006:
      i19 = 1;
      f5 = Float.MIN_VALUE;
      i20 = i26;
      i26 = i19;
      f10 = f5;
      break label562;
      i3 = -1 << -1;
      f1 = -0.0F;
      i13 = width;
      View localView2;
      if (i13 == 0)
      {
        f3 = g;
        i23 = 0;
        f7 = 0.0F;
        localView2 = null;
        boolean bool7 = f3 < 0.0F;
        if (bool7)
        {
          i3 = 0;
          f1 = 0.0F;
          localObject3 = null;
          i14 = -2;
          f3 = 0.0F / 0.0F;
          width = i14;
        }
      }
      int i31 = i3;
      f1 = 0.0F;
      localObject3 = null;
      boolean bool3 = f11 < 0.0F;
      label1126:
      int i4;
      if (!bool3)
      {
        localObject1 = this;
        i23 = f;
        i20 = 0;
        f9 = 0.0F;
        localObject3 = this;
        i14 = paramInt1;
        i24 = paramInt2;
        a(localView1, paramInt1, i23, paramInt2, 0);
        i4 = -1 << -1;
        f1 = -0.0F;
        if (i31 != i4) {
          width = i31;
        }
        i4 = localView1.getMeasuredWidth();
        if (i25 == 0) {
          break label1267;
        }
        localObject1 = this;
        i14 = f;
        i23 = leftMargin + i4;
        i24 = rightMargin;
        i23 = i23 + i24 + 0;
        i14 += i23;
        f = i14;
      }
      for (;;)
      {
        if (bool10)
        {
          i20 = Math.max(i4, i26);
          i26 = i19;
          f10 = f5;
          break;
          i23 = 0;
          f7 = 0.0F;
          localView2 = null;
          break label1126;
          label1267:
          localObject1 = this;
          i14 = f;
          i23 = i14 + i4;
          i24 = leftMargin;
          i23 += i24;
          i24 = rightMargin;
          i23 = i23 + i24 + 0;
          i14 = Math.max(i14, i23);
          f = i14;
          continue;
          label1330:
          i21 = h;
          break label715;
          label1340:
          i21 = 0;
          f6 = 0.0F;
          localView1 = null;
          break label825;
          label1352:
          i4 = i24;
          break label856;
          label1358:
          if (i4 != 0) {}
          for (;;)
          {
            i4 = Math.max(i10, i23);
            f7 = f11;
            i24 = i21;
            f8 = f6;
            i28 = i4;
            i21 = i26;
            f6 = f10;
            i4 = i20;
            i20 = i11;
            i26 = i19;
            break;
            i23 = i24;
          }
          label1414:
          localObject1 = this;
          i4 = f;
          if (i4 > 0)
          {
            boolean bool4 = a(i15);
            if (bool4)
            {
              i5 = f;
              i21 = l;
              i5 += i21;
              f = i5;
            }
          }
          f1 = Float.MIN_VALUE;
          int i5 = arrayOfInt[1];
          i21 = -1;
          f6 = 0.0F / 0.0F;
          if (i5 == i21)
          {
            f1 = 0.0F;
            localObject3 = null;
            i5 = arrayOfInt[0];
            i21 = -1;
            f6 = 0.0F / 0.0F;
            if (i5 == i21)
            {
              f1 = 2.8E-45F;
              i5 = arrayOfInt[2];
              i21 = -1;
              f6 = 0.0F / 0.0F;
              if (i5 == i21)
              {
                f1 = 4.2E-45F;
                i5 = arrayOfInt[3];
                i21 = -1;
                f6 = 0.0F / 0.0F;
                if (i5 == i21) {
                  break label3804;
                }
              }
            }
          }
          f1 = 4.2E-45F;
          i5 = arrayOfInt[3];
          localView1 = null;
          i21 = arrayOfInt[0];
          i23 = arrayOfInt[1];
          i24 = arrayOfInt[2];
          i23 = Math.max(i23, i24);
          i21 = Math.max(i21, i23);
          i5 = Math.max(i5, i21);
          f6 = 4.2E-45F;
          i21 = localObject4[3];
          f7 = 0.0F;
          localView2 = null;
          i23 = localObject4[0];
          f8 = Float.MIN_VALUE;
          i24 = localObject4[1];
          f9 = 2.8E-45F;
          i20 = localObject4[2];
          i24 = Math.max(i24, i20);
          i23 = Math.max(i23, i24);
          i21 = Math.max(i21, i23);
          i5 += i21;
          label2429:
          label2492:
          label2556:
          label2600:
          label2649:
          label2692:
          label2739:
          label2893:
          label2960:
          label2972:
          label2979:
          label2991:
          label3268:
          label3748:
          label3758:
          label3773:
          label3804:
          for (i23 = Math.max(i8, i5);; i23 = i8)
          {
            if (bool10)
            {
              i5 = -1 << -1;
              f1 = -0.0F;
              if ((i16 == i5) || (i16 == 0))
              {
                i5 = 0;
                f1 = 0.0F;
                localObject3 = null;
                localObject1 = this;
                f = 0;
                i21 = 0;
                f6 = 0.0F;
                localView1 = null;
                if (i21 < i15)
                {
                  localObject1 = this;
                  localObject3 = getChildAt(i21);
                  if (localObject3 == null)
                  {
                    i5 = f + 0;
                    f = i5;
                    i5 = i21;
                  }
                  for (;;)
                  {
                    i21 = i5 + 1;
                    break;
                    i24 = ((View)localObject3).getVisibility();
                    i20 = 8;
                    f9 = 1.1E-44F;
                    if (i24 == i20)
                    {
                      i5 = i21 + 0;
                    }
                    else
                    {
                      localObject3 = (am.a)((View)localObject3).getLayoutParams();
                      if (i25 != 0)
                      {
                        i24 = f;
                        i20 = leftMargin + i26;
                        i5 = rightMargin + i20 + 0 + i24;
                        f = i5;
                        i5 = i21;
                      }
                      else
                      {
                        i24 = f;
                        i20 = i24 + i26;
                        i29 = leftMargin;
                        i20 += i29;
                        i5 = rightMargin + i20 + 0;
                        i5 = Math.max(i24, i5);
                        f = i5;
                        i5 = i21;
                      }
                    }
                  }
                }
              }
            }
            localObject1 = this;
            i5 = f;
            i21 = getPaddingLeft();
            i24 = getPaddingRight();
            i21 += i24;
            i5 += i21;
            f = i5;
            i5 = f;
            i21 = getSuggestedMinimumWidth();
            i5 = Math.max(i5, i21);
            f6 = 0.0F;
            localView1 = null;
            i8 = w.a(i5, paramInt1, 0);
            f1 = 2.3509886E-38F;
            i5 = 0xFFFFFF & i8;
            i21 = f;
            i24 = i5 - i21;
            boolean bool5;
            int i6;
            int i32;
            if (i19 == 0)
            {
              if (i24 != 0)
              {
                f1 = 0.0F;
                localObject3 = null;
                bool5 = f3 < 0.0F;
                if (!bool5) {}
              }
            }
            else
            {
              localObject1 = this;
              f1 = g;
              i21 = 0;
              f6 = 0.0F;
              localView1 = null;
              bool5 = f1 < 0.0F;
              if (bool5) {
                f3 = g;
              }
              i29 = -1;
              arrayOfInt[3] = i29;
              arrayOfInt[2] = i29;
              arrayOfInt[1] = i29;
              arrayOfInt[0] = i29;
              i21 = 1;
              f6 = Float.MIN_VALUE;
              i23 = 2;
              f7 = 2.8E-45F;
              i29 = -1;
              f12 = 0.0F / 0.0F;
              localObject4[3] = i29;
              localObject4[i23] = i29;
              localObject4[i21] = i29;
              localObject4[0] = i29;
              f9 = 0.0F / 0.0F;
              localObject1 = this;
              f = 0;
              bool5 = false;
              f1 = 0.0F;
              localObject3 = null;
              i11 = 0;
              i26 = i12;
              f10 = f2;
              i19 = i10;
              i12 = -1;
              f2 = f9;
              i20 = i9;
              if (i11 < i15)
              {
                localObject1 = this;
                localView2 = getChildAt(i11);
                if (localView2 == null) {
                  break label3773;
                }
                i6 = localView2.getVisibility();
                i21 = 8;
                f6 = 1.1E-44F;
                if (i6 == i21) {
                  break label3773;
                }
                localObject3 = (am.a)localView2.getLayoutParams();
                f12 = g;
                f6 = 0.0F;
                localView1 = null;
                boolean bool8 = f12 < 0.0F;
                if (!bool8) {
                  break label3758;
                }
                f6 = i24 * f12 / f3;
                i22 = (int)f6;
                f12 = f3 - f12;
                i24 -= i22;
                i14 = getPaddingTop();
                i32 = getPaddingBottom();
                i14 += i32;
                i32 = topMargin;
                i14 += i32;
                i32 = bottomMargin;
                i14 += i32;
                i32 = height;
                i32 = getChildMeasureSpec(paramInt2, i14, i32);
                i14 = width;
                if (i14 == 0)
                {
                  i14 = 1073741824;
                  f3 = 2.0F;
                  if (i16 == i14) {}
                }
                else
                {
                  i14 = localView2.getMeasuredWidth();
                  i22 += i14;
                  if (i22 < 0)
                  {
                    i22 = 0;
                    f6 = 0.0F;
                    localView1 = null;
                  }
                  localObject2 = localView2;
                  i10 = 1073741824;
                  i22 = View.MeasureSpec.makeMeasureSpec(i22, i10);
                  ((View)localObject2).measure(i22, i32);
                  i22 = w.j(localView2);
                  i14 = -16777216;
                  f3 = -1.7014118E38F;
                  i22 &= i14;
                  i32 = bk.a(i20, i22);
                  f9 = f12;
                  i29 = i24;
                  if (i25 == 0) {
                    break label2893;
                  }
                  localObject1 = this;
                  i22 = f;
                  i14 = localView2.getMeasuredWidth();
                  i24 = leftMargin;
                  i14 += i24;
                  i24 = rightMargin;
                  i14 = i14 + i24 + 0;
                  i22 += i14;
                  f = i22;
                  i22 = 1073741824;
                  f6 = 2.0F;
                  if (i17 == i22) {
                    break label2960;
                  }
                  i22 = height;
                  i14 = -1;
                  f3 = 0.0F / 0.0F;
                  if (i22 != i14) {
                    break label2960;
                  }
                  i22 = 1;
                  f6 = Float.MIN_VALUE;
                  i14 = topMargin;
                  i24 = bottomMargin;
                  i14 += i24;
                  i24 = localView2.getMeasuredHeight() + i14;
                  i12 = Math.max(i12, i24);
                  if (i22 == 0) {
                    break label2972;
                  }
                  i22 = i14;
                  i14 = Math.max(i19, i22);
                  if (i26 == 0) {
                    break label2979;
                  }
                  i22 = height;
                  i26 = -1;
                  f10 = 0.0F / 0.0F;
                  if (i22 != i26) {
                    break label2979;
                  }
                  i22 = 1;
                  f6 = Float.MIN_VALUE;
                  if (bool9)
                  {
                    i23 = localView2.getBaseline();
                    i26 = -1;
                    f10 = 0.0F / 0.0F;
                    if (i23 != i26)
                    {
                      i26 = h;
                      if (i26 >= 0) {
                        break label2991;
                      }
                      localObject1 = this;
                      i6 = e;
                      i6 = ((i6 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                      i26 = Math.max(arrayOfInt[i6], i23);
                      arrayOfInt[i6] = i26;
                      i26 = localObject4[i6];
                      i23 = i24 - i23;
                      i23 = Math.max(i26, i23);
                      localObject4[i6] = i23;
                    }
                  }
                  f1 = f9;
                  i23 = i14;
                  i24 = i32;
                  i14 = i22;
                  f3 = f6;
                  i20 = i12;
                  i22 = i29;
                }
              }
            }
            for (;;)
            {
              i29 = i11 + 1;
              i11 = i29;
              i26 = i14;
              f10 = f3;
              i19 = i23;
              i12 = i20;
              i20 = i24;
              f3 = f1;
              i24 = i22;
              break;
              if (i22 > 0)
              {
                localObject2 = localView2;
                break label2429;
              }
              i22 = 0;
              f6 = 0.0F;
              localView1 = null;
              localObject2 = localView2;
              break label2429;
              localObject1 = this;
              i22 = f;
              i14 = localView2.getMeasuredWidth() + i22;
              i24 = leftMargin;
              i14 += i24;
              i24 = rightMargin;
              i14 = i14 + i24 + 0;
              i22 = Math.max(i22, i14);
              f = i22;
              break label2556;
              i22 = 0;
              f6 = 0.0F;
              localView1 = null;
              break label2600;
              i22 = i24;
              break label2649;
              i22 = 0;
              f6 = 0.0F;
              localView1 = null;
              break label2692;
              i6 = h;
              break label2739;
              localObject1 = this;
              i6 = f;
              i22 = getPaddingLeft();
              i14 = getPaddingRight();
              i22 += i14;
              i6 += i22;
              f = i6;
              f1 = Float.MIN_VALUE;
              i6 = arrayOfInt[1];
              i22 = -1;
              f6 = 0.0F / 0.0F;
              if (i6 == i22)
              {
                f1 = 0.0F;
                localObject3 = null;
                i6 = arrayOfInt[0];
                i22 = -1;
                f6 = 0.0F / 0.0F;
                if (i6 == i22)
                {
                  f1 = 2.8E-45F;
                  i6 = arrayOfInt[2];
                  i22 = -1;
                  f6 = 0.0F / 0.0F;
                  if (i6 == i22)
                  {
                    f1 = 4.2E-45F;
                    i6 = arrayOfInt[3];
                    i22 = -1;
                    f6 = 0.0F / 0.0F;
                    if (i6 == i22) {
                      break label3268;
                    }
                  }
                }
              }
              f1 = 4.2E-45F;
              i6 = arrayOfInt[3];
              localView1 = null;
              i22 = arrayOfInt[0];
              i14 = arrayOfInt[1];
              i23 = arrayOfInt[2];
              i14 = Math.max(i14, i23);
              i22 = Math.max(i22, i14);
              i6 = Math.max(i6, i22);
              f6 = 4.2E-45F;
              i22 = localObject4[3];
              f3 = 0.0F;
              localObject2 = null;
              i14 = localObject4[0];
              f7 = Float.MIN_VALUE;
              i23 = localObject4[1];
              f8 = 2.8E-45F;
              i24 = localObject4[2];
              i23 = Math.max(i23, i24);
              i14 = Math.max(i14, i23);
              i22 = Math.max(i22, i14);
              i6 += i22;
              i12 = Math.max(i12, i6);
              i6 = i19;
              i9 = i20;
              i22 = i12;
              i12 = i26;
              f2 = f10;
              for (;;)
              {
                if (i12 == 0)
                {
                  i14 = 1073741824;
                  f3 = 2.0F;
                  if (i17 == i14) {}
                }
                for (;;)
                {
                  i22 = getPaddingTop();
                  i14 = getPaddingBottom();
                  i22 += i14;
                  i6 += i22;
                  i22 = getSuggestedMinimumHeight();
                  i6 = Math.max(i6, i22);
                  f6 = -1.7014118E38F;
                  i22 = 0xFF000000 & i9 | i8;
                  i14 = i9 << 16;
                  i6 = w.a(i6, paramInt2, i14);
                  localObject1 = this;
                  setMeasuredDimension(i22, i6);
                  if (i18 != 0)
                  {
                    i6 = getMeasuredHeight();
                    i22 = 1073741824;
                    f6 = 2.0F;
                    i24 = View.MeasureSpec.makeMeasureSpec(i6, i22);
                    i6 = 0;
                    f1 = 0.0F;
                    localObject3 = null;
                    i25 = 0;
                    while (i25 < i15)
                    {
                      localObject1 = this;
                      localView1 = getChildAt(i25);
                      i6 = localView1.getVisibility();
                      i14 = 8;
                      f3 = 1.1E-44F;
                      if (i6 != i14)
                      {
                        localObject3 = localView1.getLayoutParams();
                        localObject5 = localObject3;
                        localObject5 = (am.a)localObject3;
                        i6 = height;
                        i14 = -1;
                        f3 = 0.0F / 0.0F;
                        if (i6 == i14)
                        {
                          i18 = width;
                          i6 = localView1.getMeasuredWidth();
                          width = i6;
                          i23 = 0;
                          f7 = 0.0F;
                          localView2 = null;
                          i20 = 0;
                          f9 = 0.0F;
                          localObject3 = this;
                          i14 = paramInt1;
                          measureChildWithMargins(localView1, paramInt1, 0, i24, 0);
                          width = i18;
                        }
                      }
                      i6 = i25 + 1;
                      i25 = i6;
                      continue;
                      i19 = Math.max(i10, i11);
                      if (!bool10) {
                        break label3748;
                      }
                      i6 = 1073741824;
                      f1 = 2.0F;
                      if (i16 == i6) {
                        break label3748;
                      }
                      i6 = 0;
                      f1 = 0.0F;
                      localObject3 = null;
                      i22 = 0;
                      localView1 = null;
                      f6 = 0.0F;
                      while (i22 < i15)
                      {
                        localObject1 = this;
                        localObject2 = getChildAt(i22);
                        if (localObject2 != null)
                        {
                          i6 = ((View)localObject2).getVisibility();
                          i24 = 8;
                          f8 = 1.1E-44F;
                          if (i6 != i24)
                          {
                            localObject3 = (am.a)((View)localObject2).getLayoutParams();
                            f1 = g;
                            i24 = 0;
                            f8 = 0.0F;
                            boolean bool6 = f1 < 0.0F;
                            if (bool6)
                            {
                              f1 = 2.0F;
                              i7 = View.MeasureSpec.makeMeasureSpec(i26, 1073741824);
                              i24 = ((View)localObject2).getMeasuredHeight();
                              i20 = 1073741824;
                              f9 = 2.0F;
                              i24 = View.MeasureSpec.makeMeasureSpec(i24, i20);
                              ((View)localObject2).measure(i7, i24);
                            }
                          }
                        }
                        i7 = i22 + 1;
                        i22 = i7;
                      }
                    }
                  }
                  return;
                  i7 = i22;
                }
                i7 = i19;
                i22 = i23;
              }
              i29 = i24;
              i32 = i20;
              f9 = f3;
              break label2492;
              f1 = f3;
              i22 = i24;
              i23 = i19;
              i14 = i26;
              f3 = f10;
              i24 = i20;
              i20 = i12;
            }
          }
          label3811:
          i14 = i18;
          f3 = f4;
          break label620;
        }
      }
      i20 = i26;
      i26 = i19;
      f10 = f5;
      break label562;
      int i7 = i26;
      int i22 = i19;
      f6 = f5;
      f7 = f3;
      i24 = i12;
      f8 = f2;
      i20 = i11;
      int i29 = i10;
      int i14 = i18;
      f3 = f4;
      i26 = i8;
      i18 = i9;
    }
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    Drawable localDrawable = k;
    int i1 = getPaddingTop();
    int i2 = o;
    i1 += i2;
    i2 = l + paramInt;
    int i3 = getHeight();
    int i4 = getPaddingBottom();
    i3 -= i4;
    i4 = o;
    i3 -= i4;
    localDrawable.setBounds(paramInt, i1, i2, i3);
    k.draw(paramCanvas);
  }
  
  private static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt1 + paramInt3;
    int i2 = paramInt2 + paramInt4;
    paramView.layout(paramInt1, paramInt2, i1, i2);
  }
  
  private static int getChildrenSkipCount$5359dca7()
  {
    return 0;
  }
  
  private static int getLocationOffset$3c7ec8d0()
  {
    return 0;
  }
  
  private static int getNextLocationOffset$3c7ec8d0()
  {
    return 0;
  }
  
  public am.a a(AttributeSet paramAttributeSet)
  {
    am.a locala = new android/support/v7/widget/am$a;
    Context localContext = getContext();
    locala.<init>(localContext, paramAttributeSet);
    return locala;
  }
  
  protected final boolean a(int paramInt)
  {
    boolean bool = true;
    int i1;
    if (paramInt == 0)
    {
      i1 = n & 0x1;
      if (i1 == 0) {}
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      i1 = getChildCount();
      if (paramInt == i1)
      {
        i1 = n & 0x4;
        if (i1 == 0) {
          bool = false;
        }
      }
      else
      {
        i1 = n & 0x2;
        if (i1 != 0)
        {
          i1 = paramInt + -1;
          for (;;)
          {
            if (i1 < 0) {
              break label106;
            }
            View localView = getChildAt(i1);
            int i2 = localView.getVisibility();
            int i3 = 8;
            if (i2 != i3) {
              break;
            }
            i1 += -1;
          }
        }
        bool = false;
        continue;
        label106:
        bool = false;
      }
    }
  }
  
  protected am.a b(ViewGroup.LayoutParams paramLayoutParams)
  {
    am.a locala = new android/support/v7/widget/am$a;
    locala.<init>(paramLayoutParams);
    return locala;
  }
  
  protected am.a c()
  {
    int i1 = -2;
    int i2 = d;
    am.a locala;
    if (i2 == 0)
    {
      locala = new android/support/v7/widget/am$a;
      locala.<init>(i1, i1);
    }
    for (;;)
    {
      return locala;
      i2 = d;
      int i3 = 1;
      if (i2 == i3)
      {
        locala = new android/support/v7/widget/am$a;
        i3 = -1;
        locala.<init>(i3, i1);
      }
      else
      {
        i2 = 0;
        locala = null;
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof am.a;
  }
  
  public int getBaseline()
  {
    int i1 = -1;
    int i2 = b;
    if (i2 < 0) {
      i1 = super.getBaseline();
    }
    View localView;
    int i4;
    do
    {
      return i1;
      i2 = getChildCount();
      int i3 = b;
      if (i2 <= i3)
      {
        localObject = new java/lang/RuntimeException;
        ((RuntimeException)localObject).<init>("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        throw ((Throwable)localObject);
      }
      i2 = b;
      localView = getChildAt(i2);
      i4 = localView.getBaseline();
      if (i4 != i1) {
        break;
      }
      i2 = b;
    } while (i2 == 0);
    Object localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    throw ((Throwable)localObject);
    i1 = c;
    i2 = d;
    int i5 = 1;
    if (i2 == i5)
    {
      i2 = e & 0x70;
      i5 = 48;
      if (i2 == i5) {}
    }
    switch (i2)
    {
    default: 
      i2 = i1;
    }
    for (;;)
    {
      localObject = (am.a)localView.getLayoutParams();
      i1 = topMargin + i2 + i4;
      break;
      i1 = getBottom();
      i2 = getTop();
      i1 -= i2;
      i2 = getPaddingBottom();
      i1 -= i2;
      i2 = f;
      i1 -= i2;
      i2 = i1;
      continue;
      i2 = getBottom();
      i5 = getTop();
      i2 -= i5;
      i5 = getPaddingTop();
      i2 -= i5;
      i5 = getPaddingBottom();
      i2 -= i5;
      i5 = f;
      i2 = (i2 - i5) / 2;
      i1 += i2;
      i2 = i1;
    }
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return b;
  }
  
  public Drawable getDividerDrawable()
  {
    return k;
  }
  
  public int getDividerPadding()
  {
    return o;
  }
  
  public int getDividerWidth()
  {
    return l;
  }
  
  public int getGravity()
  {
    return e;
  }
  
  public int getOrientation()
  {
    return d;
  }
  
  public int getShowDividers()
  {
    return n;
  }
  
  int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return g;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i1 = 8;
    int i2 = 0;
    am.a locala = null;
    Object localObject = k;
    if (localObject == null) {}
    int i7;
    int i8;
    boolean bool5;
    label347:
    boolean bool4;
    do
    {
      boolean bool2;
      do
      {
        return;
        i7 = d;
        i8 = 1;
        if (i7 != i8) {
          break;
        }
        i8 = getVirtualChildCount();
        i7 = 0;
        localObject = null;
        while (i7 < i8)
        {
          View localView1 = getChildAt(i7);
          if (localView1 != null)
          {
            i2 = localView1.getVisibility();
            if (i2 != i1)
            {
              boolean bool1 = a(i7);
              if (bool1)
              {
                locala = (am.a)localView1.getLayoutParams();
                int i9 = localView1.getTop();
                i3 = topMargin;
                i3 = i9 - i3;
                i9 = m;
                i3 -= i9;
                a(paramCanvas, i3);
              }
            }
          }
          int i3 = i7 + 1;
          i7 = i3;
        }
        bool2 = a(i8);
      } while (!bool2);
      int i4 = i8 + -1;
      localObject = getChildAt(i4);
      if (localObject == null)
      {
        i4 = getHeight();
        i7 = getPaddingBottom();
        i4 -= i7;
        i7 = m;
        i4 -= i7;
      }
      for (;;)
      {
        a(paramCanvas, i4);
        break;
        locala = (am.a)((View)localObject).getLayoutParams();
        i7 = ((View)localObject).getBottom();
        i4 = bottomMargin + i7;
      }
      i8 = getVirtualChildCount();
      bool5 = bk.a(this);
      i7 = 0;
      localObject = null;
      if (i7 < i8)
      {
        View localView2 = getChildAt(i7);
        int i10;
        int i5;
        if (localView2 != null)
        {
          i4 = localView2.getVisibility();
          if (i4 != i1)
          {
            boolean bool3 = a(i7);
            if (bool3)
            {
              locala = (am.a)localView2.getLayoutParams();
              if (!bool5) {
                break label347;
              }
              i10 = localView2.getRight();
              i5 = rightMargin + i10;
            }
          }
        }
        for (;;)
        {
          b(paramCanvas, i5);
          i5 = i7 + 1;
          i7 = i5;
          break;
          i10 = localView2.getLeft();
          i5 = leftMargin;
          i5 = i10 - i5;
          i10 = l;
          i5 -= i10;
        }
      }
      bool4 = a(i8);
    } while (!bool4);
    int i6 = i8 + -1;
    localObject = getChildAt(i6);
    if (localObject == null) {
      if (bool5) {
        i6 = getPaddingLeft();
      }
    }
    for (;;)
    {
      b(paramCanvas, i6);
      break;
      i6 = getWidth();
      i7 = getPaddingRight();
      i6 -= i7;
      i7 = l;
      i6 -= i7;
      continue;
      locala = (am.a)((View)localObject).getLayoutParams();
      if (bool5)
      {
        i7 = ((View)localObject).getLeft();
        i6 = leftMargin;
        i6 = i7 - i6;
        i7 = l;
        i6 -= i7;
      }
      else
      {
        i7 = ((View)localObject).getRight();
        i6 = rightMargin + i7;
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 14;
    if (i1 >= i2)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      String str = am.class.getName();
      paramAccessibilityEvent.setClassName(str);
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 14;
    if (i1 >= i2)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      String str = am.class.getName();
      paramAccessibilityNodeInfo.setClassName(str);
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = this;
    int i1 = d;
    int i2 = 1;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i10;
    label133:
    View localView1;
    int i14;
    if (i1 == i2)
    {
      i3 = getPaddingLeft();
      i1 = paramInt3 - paramInt1;
      i2 = getPaddingRight();
      i4 = i1 - i2;
      i1 -= i3;
      i2 = getPaddingRight();
      i5 = i1 - i2;
      i6 = getVirtualChildCount();
      i1 = e & 0x70;
      i2 = e;
      i7 = 0x800007 & i2;
      switch (i1)
      {
      default: 
        i1 = getPaddingTop();
        i10 = 0;
        int i13 = i1;
        if (i10 < i6)
        {
          localObject1 = this;
          localView1 = getChildAt(i10);
          if (localView1 == null)
          {
            i13 += 0;
            i1 = i10;
          }
        }
        break;
      }
    }
    for (;;)
    {
      i10 = i1 + 1;
      break label133;
      i1 = getPaddingTop() + paramInt4 - paramInt2;
      i2 = f;
      i1 -= i2;
      break;
      i1 = getPaddingTop();
      i2 = paramInt4 - paramInt2;
      i14 = f;
      i2 = (i2 - i14) / 2;
      i1 += i2;
      break;
      i1 = localView1.getVisibility();
      i2 = 8;
      label693:
      label960:
      int i12;
      if (i1 != i2)
      {
        int i17 = localView1.getMeasuredWidth();
        int i18 = localView1.getMeasuredHeight();
        am.a locala = (am.a)localView1.getLayoutParams();
        i2 = h;
        if (i2 < 0) {
          i2 = i7;
        }
        int i19 = w.g(this);
        i2 = f.a(i2, i19) & 0x7;
        switch (i2)
        {
        default: 
          i2 = leftMargin + i3;
        }
        int i15;
        for (;;)
        {
          localObject1 = this;
          boolean bool2 = a(i10);
          if (bool2)
          {
            int i20 = m;
            i14 += i20;
          }
          int i21 = topMargin;
          i14 += i21;
          int i22 = i14 + 0;
          b(localView1, i2, i22, i17, i18);
          i1 = bottomMargin + i18 + 0;
          i14 += i1;
          i1 = i10 + 0;
          break;
          i2 = (i5 - i17) / 2 + i3;
          i22 = leftMargin;
          i2 += i22;
          i22 = rightMargin;
          i2 -= i22;
          continue;
          i2 = i4 - i17;
          i22 = rightMargin;
          i2 -= i22;
        }
        int i8 = bk.a(this);
        i3 = getPaddingTop();
        i1 = paramInt4 - paramInt2;
        i2 = getPaddingBottom();
        int i23 = i1 - i2;
        i1 -= i3;
        i2 = getPaddingBottom();
        i17 = i1 - i2;
        i18 = getVirtualChildCount();
        i1 = e & 0x800007;
        i6 = e & 0x70;
        boolean bool3 = a;
        int[] arrayOfInt = i;
        localObject1 = this;
        localObject1 = j;
        Object localObject2 = localObject1;
        i2 = w.g(this);
        i1 = f.a(i1, i2);
        switch (i1)
        {
        default: 
          i4 = getPaddingLeft();
          i2 = 0;
          i1 = 1;
          if (i8 != 0)
          {
            i2 = i18 + -1;
            i1 = -1;
            i8 = i2;
          }
          break;
        }
        for (i2 = i1;; i2 = i1)
        {
          i5 = 0;
          int i24;
          View localView2;
          if (i5 < i18)
          {
            i1 = i2 * i5;
            i24 = i8 + i1;
            localObject1 = this;
            localView2 = getChildAt(i24);
            if (localView2 == null)
            {
              i4 += 0;
              i1 = i5;
            }
          }
          for (;;)
          {
            i5 = i1 + 1;
            break label693;
            i1 = getPaddingLeft() + paramInt3 - paramInt1;
            localObject1 = this;
            i2 = f;
            i4 = i1 - i2;
            break;
            i1 = getPaddingLeft();
            i2 = paramInt3 - paramInt1;
            localObject1 = this;
            i15 = f;
            i2 = (i2 - i15) / 2;
            i4 = i1 + i2;
            break;
            i1 = localView2.getVisibility();
            i15 = 8;
            if (i1 != i15)
            {
              int i25 = localView2.getMeasuredWidth();
              int i26 = localView2.getMeasuredHeight();
              int i16 = -1;
              locala = (am.a)localView2.getLayoutParams();
              int i27;
              int i28;
              if (bool3)
              {
                i10 = height;
                i27 = -1;
                i28 = i27;
                if (i10 != i27) {
                  i16 = localView2.getBaseline();
                }
              }
              i10 = h;
              if (i10 < 0) {
                i10 = i6;
              }
              i10 &= 0x70;
              switch (i10)
              {
              default: 
                i16 = i3;
              }
              for (;;)
              {
                localObject1 = this;
                boolean bool1 = a(i24);
                if (bool1) {}
                for (int i11 = l + i4;; i12 = i4)
                {
                  i4 = leftMargin;
                  i11 += i4;
                  i4 = i11 + 0;
                  localObject1 = localView2;
                  b(localView2, i4, i16, i25, i26);
                  i1 = rightMargin + i25 + 0;
                  i4 = i11 + i1;
                  i1 = i5 + 0;
                  break;
                  i12 = topMargin + i3;
                  i27 = -1;
                  i28 = i27;
                  if (i16 == i27) {
                    break label1216;
                  }
                  i27 = arrayOfInt[1];
                  i16 = i27 - i16 + i12;
                  break label960;
                  i16 = (i17 - i26) / 2 + i3;
                  i12 = topMargin;
                  i16 += i12;
                  i12 = bottomMargin;
                  i16 -= i12;
                  break label960;
                  i12 = i23 - i26;
                  i28 = bottomMargin;
                  i27 = i28;
                  i12 -= i28;
                  i27 = -1;
                  i28 = i27;
                  if (i16 == i27) {
                    break label1216;
                  }
                  i16 = localView2.getMeasuredHeight() - i16;
                  i27 = localObject2[2];
                  i16 = i27 - i16;
                  i16 = i12 - i16;
                  break label960;
                  return;
                }
                label1216:
                i16 = i12;
              }
            }
            i1 = i5;
          }
          int i9 = 0;
        }
      }
      i1 = i12;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = d;
    int i9 = 1;
    float f1 = Float.MIN_VALUE;
    float f2;
    Object localObject1;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    float f3;
    float f4;
    View localView1;
    int i18;
    int i19;
    int i20;
    int i21;
    float f5;
    int i22;
    float f6;
    boolean bool10;
    boolean bool11;
    int i25;
    float f7;
    int i26;
    View localView2;
    int i27;
    float f8;
    float f9;
    int i28;
    label359:
    Object localObject3;
    int i17;
    int i30;
    int i5;
    float f10;
    label686:
    label748:
    label846:
    int i31;
    label877:
    float f12;
    if (i1 == i9)
    {
      i1 = 0;
      f2 = 0.0F;
      localObject1 = null;
      f = 0;
      i11 = 0;
      i12 = 0;
      i13 = 0;
      i14 = 0;
      i15 = 1;
      f3 = Float.MIN_VALUE;
      int i16 = 0;
      f4 = 0.0F;
      localView1 = null;
      i18 = getVirtualChildCount();
      i19 = View.MeasureSpec.getMode(paramInt1);
      i20 = View.MeasureSpec.getMode(paramInt2);
      i21 = 0;
      f5 = 0.0F;
      i22 = 0;
      f6 = 0.0F;
      int i23 = b;
      bool10 = h;
      bool11 = bool10;
      i25 = -1 << -1;
      f7 = -0.0F;
      for (i26 = 0;; i26 = i1 + 1)
      {
        bool10 = i26;
        if (i26 >= i18) {
          break label1059;
        }
        localView2 = getChildAt(i26);
        if (localView2 != null) {
          break;
        }
        i1 = f + 0;
        f = i1;
        i1 = i26;
      }
      i1 = localView2.getVisibility();
      i27 = 8;
      f8 = 1.1E-44F;
      if (i1 == i27) {
        break label2471;
      }
      boolean bool1 = a(i26);
      if (bool1)
      {
        i2 = f;
        i27 = m;
        i2 += i27;
        f = i2;
      }
      localObject1 = localView2.getLayoutParams();
      Object localObject2 = localObject1;
      localObject2 = (am.a)localObject1;
      f2 = g;
      f9 = f4 + f2;
      int i2 = 1073741824;
      f2 = 2.0F;
      bool10 = i20;
      if (i20 == i2)
      {
        i2 = height;
        if (i2 == 0)
        {
          f2 = g;
          i16 = 0;
          f4 = 0.0F;
          localView1 = null;
          boolean bool2 = f2 < 0.0F;
          if (bool2)
          {
            int i3 = f;
            i16 = topMargin + i3;
            i27 = bottomMargin;
            i16 += i27;
            i3 = Math.max(i3, i16);
            f = i3;
            i22 = 1;
            f6 = Float.MIN_VALUE;
            i28 = i25;
            i25 = i22;
            f7 = f6;
            if (i23 >= 0)
            {
              i3 = i26 + 1;
              bool10 = i23;
              if (i23 == i3)
              {
                i3 = f;
                c = i3;
              }
            }
            bool10 = i26;
            if (i26 >= i23) {
              break label686;
            }
            f2 = g;
            i16 = 0;
            f4 = 0.0F;
            localView1 = null;
            boolean bool3 = f2 < 0.0F;
            if (!bool3) {
              break label686;
            }
            localObject1 = new java/lang/RuntimeException;
            ((RuntimeException)localObject1).<init>("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
            throw ((Throwable)localObject1);
          }
        }
      }
      int i4 = -1 << -1;
      f2 = -0.0F;
      i16 = height;
      if (i16 == 0)
      {
        f4 = g;
        i27 = 0;
        f8 = 0.0F;
        localObject3 = null;
        boolean bool9 = f4 < 0.0F;
        if (bool9)
        {
          i4 = 0;
          f2 = 0.0F;
          localObject1 = null;
          i17 = -2;
          f4 = 0.0F / 0.0F;
          height = i17;
        }
      }
      int i29 = i4;
      i27 = 0;
      f8 = 0.0F;
      localObject3 = null;
      f2 = 0.0F;
      localObject1 = null;
      boolean bool4 = f9 < 0.0F;
      if (!bool4) {
        i28 = f;
      }
      for (;;)
      {
        localObject1 = this;
        i17 = paramInt1;
        i30 = paramInt2;
        a(localView2, paramInt1, 0, paramInt2, i28);
        i5 = -1 << -1;
        f2 = -0.0F;
        bool10 = i29;
        if (i29 != i5) {
          height = i29;
        }
        i5 = localView2.getMeasuredHeight();
        i17 = f;
        i27 = i17 + i5;
        i30 = topMargin;
        i27 += i30;
        i30 = bottomMargin;
        i27 = i27 + i30 + 0;
        i17 = Math.max(i17, i27);
        f = i17;
        if (!bool11) {
          break label2456;
        }
        i28 = Math.max(i5, i25);
        i25 = i22;
        f7 = f6;
        break;
        i28 = 0;
        f10 = 0.0F;
      }
      i5 = 0;
      f2 = 0.0F;
      localObject1 = null;
      i17 = 1073741824;
      f4 = 2.0F;
      bool10 = i19;
      if (i19 == i17) {
        break label2445;
      }
      i17 = width;
      i27 = -1;
      f8 = 0.0F / 0.0F;
      if (i17 != i27) {
        break label2445;
      }
      i17 = 1;
      f4 = Float.MIN_VALUE;
      i5 = 1;
      f2 = Float.MIN_VALUE;
      i27 = leftMargin;
      i30 = rightMargin;
      i27 += i30;
      i30 = localView2.getMeasuredWidth() + i27;
      bool10 = i11;
      i22 = Math.max(i11, i30);
      i9 = w.j(localView2);
      bool10 = i12;
      i21 = bk.a(i12, i9);
      if (i15 != 0)
      {
        i9 = width;
        i15 = -1;
        f3 = 0.0F / 0.0F;
        if (i9 == i15)
        {
          i9 = 1;
          f1 = Float.MIN_VALUE;
          float f11 = g;
          i15 = 0;
          f3 = 0.0F;
          i31 = f11 < 0.0F;
          if (i31 <= 0) {
            break label999;
          }
          if (i5 == 0) {
            break label993;
          }
          i5 = i27;
          i5 = Math.max(i14, i5);
          f8 = f9;
          i30 = i9;
          f12 = f1;
          i31 = i13;
          i9 = i25;
          f1 = f7;
          i25 = i22;
          int i33 = i28;
          i28 = i5;
          i5 = i33;
        }
      }
    }
    for (;;)
    {
      i22 = i26 + 0;
      i15 = i30;
      f3 = f12;
      i14 = i28;
      i13 = i31;
      i12 = i21;
      i11 = i25;
      i25 = i5;
      i21 = i17;
      f5 = f4;
      i5 = i22;
      f4 = f8;
      i22 = i9;
      f6 = f1;
      break;
      i9 = 0;
      f1 = 0.0F;
      localView2 = null;
      break label846;
      label993:
      i5 = i30;
      break label877;
      label999:
      if (i5 != 0) {}
      for (;;)
      {
        bool10 = i13;
        i5 = Math.max(i13, i27);
        f8 = f9;
        i30 = i9;
        f12 = f1;
        i31 = i5;
        i9 = i25;
        f1 = f7;
        i5 = i28;
        i28 = i14;
        i25 = i22;
        break;
        i27 = i30;
      }
      label1059:
      i5 = f;
      if (i5 > 0)
      {
        boolean bool5 = a(i18);
        if (bool5)
        {
          i6 = f;
          i9 = m;
          i6 += i9;
          f = i6;
        }
      }
      if (bool11)
      {
        i6 = -1 << -1;
        f2 = -0.0F;
        bool10 = i20;
        if ((i20 == i6) || (i20 == 0))
        {
          i6 = 0;
          f2 = 0.0F;
          localObject1 = null;
          f = 0;
          i9 = 0;
          f1 = 0.0F;
          localView2 = null;
          bool10 = i18;
          if (i9 < i18)
          {
            localObject1 = getChildAt(i9);
            if (localObject1 == null)
            {
              i6 = f + 0;
              f = i6;
              i6 = i9;
            }
            for (;;)
            {
              i9 = i6 + 1;
              break;
              i27 = ((View)localObject1).getVisibility();
              i30 = 8;
              f12 = 1.1E-44F;
              if (i27 == i30)
              {
                i6 = i9 + 0;
              }
              else
              {
                localObject1 = (am.a)((View)localObject1).getLayoutParams();
                i27 = f;
                i30 = i27 + i25;
                i28 = topMargin;
                i30 += i28;
                i6 = bottomMargin + i30 + 0;
                i6 = Math.max(i27, i6);
                f = i6;
                i6 = i9;
              }
            }
          }
        }
      }
      int i6 = f;
      i9 = getPaddingTop();
      i27 = getPaddingBottom();
      i9 += i27;
      i6 += i9;
      f = i6;
      i6 = f;
      i9 = getSuggestedMinimumHeight();
      i6 = Math.max(i6, i9);
      f1 = 0.0F;
      localView2 = null;
      int i24 = paramInt2;
      i26 = w.a(i6, paramInt2, 0);
      f2 = 2.3509886E-38F;
      i6 = 0xFFFFFF & i26;
      i9 = f;
      i27 = i6 - i9;
      boolean bool6;
      int i34;
      View localView3;
      int i7;
      if (i22 == 0)
      {
        if (i27 != 0)
        {
          f2 = 0.0F;
          localObject1 = null;
          bool6 = f4 < 0.0F;
          if (!bool6) {}
        }
      }
      else
      {
        f2 = g;
        i9 = 0;
        f1 = 0.0F;
        localView2 = null;
        bool6 = f2 < 0.0F;
        if (bool6) {
          f4 = g;
        }
        f = 0;
        bool6 = false;
        f2 = 0.0F;
        localObject1 = null;
        i14 = 0;
        i22 = i15;
        f6 = f3;
        i34 = i13;
        i25 = i12;
        i15 = i11;
        i24 = i18;
        if (i14 < i18)
        {
          localView3 = getChildAt(i14);
          i7 = localView3.getVisibility();
          i9 = 8;
          f1 = 1.1E-44F;
          if (i7 == i9) {
            break label2415;
          }
          localObject1 = (am.a)localView3.getLayoutParams();
          f10 = g;
          f1 = 0.0F;
          localView2 = null;
          boolean bool8 = f10 < 0.0F;
          if (!bool8) {
            break label2400;
          }
          f1 = i27 * f10 / f4;
          i10 = (int)f1;
          f10 = f4 - f10;
          i32 = i27 - i10;
          i17 = getPaddingLeft();
          i27 = getPaddingRight();
          i17 += i27;
          i27 = leftMargin;
          i17 += i27;
          i27 = rightMargin;
          i17 += i27;
          i27 = width;
          i24 = paramInt1;
          i17 = getChildMeasureSpec(paramInt1, i17, i27);
          i27 = height;
          if (i27 == 0)
          {
            i27 = 1073741824;
            f8 = 2.0F;
            i24 = i20;
            if (i20 == i27) {}
          }
          else
          {
            i27 = localView3.getMeasuredHeight();
            i10 += i27;
            if (i10 < 0)
            {
              i10 = 0;
              f1 = 0.0F;
              localView2 = null;
            }
            localObject3 = localView3;
            label1710:
            i13 = 1073741824;
            i24 = i13;
            i10 = View.MeasureSpec.makeMeasureSpec(i10, i13);
            ((View)localObject3).measure(i17, i10);
            i10 = w.j(localView3) & 0xFF00;
            i10 = bk.a(i25, i10);
            i17 = i32;
            i27 = i10;
            f1 = f10;
            label1768:
            i28 = leftMargin;
            i32 = rightMargin;
            i28 += i32;
            i32 = localView3.getMeasuredWidth() + i28;
            i25 = Math.max(i15, i32);
            i15 = 1073741824;
            f3 = 2.0F;
            i24 = i19;
            if (i19 == i15) {
              break label2031;
            }
            i15 = width;
            i13 = -1;
            i24 = i13;
            if (i15 != i13) {
              break label2031;
            }
            i15 = 1;
            f3 = Float.MIN_VALUE;
            label1855:
            if (i15 == 0) {
              break label2040;
            }
            label1860:
            i32 = Math.max(i34, i28);
            if (i22 == 0) {
              break label2047;
            }
            i28 = width;
            i22 = -1;
            f6 = 0.0F / 0.0F;
            if (i28 != i22) {
              break label2047;
            }
            i28 = 1;
            f10 = Float.MIN_VALUE;
            label1903:
            i22 = f;
            i30 = localView3.getMeasuredHeight() + i22;
            i34 = topMargin;
            i30 += i34;
            i7 = bottomMargin + i30 + 0;
            i7 = Math.max(i22, i7);
            f = i7;
            i7 = i32;
            i30 = i25;
          }
        }
      }
      for (;;)
      {
        i32 = i14 + 1;
        i14 = i32;
        i22 = i28;
        f6 = f10;
        i34 = i7;
        i25 = i27;
        i15 = i30;
        i27 = i17;
        f4 = f1;
        break;
        if (i10 > 0)
        {
          localObject3 = localView3;
          break label1710;
        }
        i10 = 0;
        f1 = 0.0F;
        localView2 = null;
        localObject3 = localView3;
        break label1710;
        label2031:
        i15 = 0;
        f3 = 0.0F;
        break label1855;
        label2040:
        i28 = i32;
        break label1860;
        label2047:
        i28 = 0;
        f10 = 0.0F;
        break label1903;
        i7 = f;
        i10 = getPaddingTop();
        i17 = getPaddingBottom();
        i10 += i17;
        i7 += i10;
        f = i7;
        i7 = i34;
        i12 = i25;
        i10 = i15;
        i15 = i22;
        f3 = f6;
        for (;;)
        {
          if (i15 == 0)
          {
            i17 = 1073741824;
            f4 = 2.0F;
            i24 = i19;
            if (i19 == i17) {}
          }
          for (;;)
          {
            i10 = getPaddingLeft();
            i17 = getPaddingRight();
            i10 += i17;
            i7 += i10;
            i10 = getSuggestedMinimumWidth();
            i7 = Math.max(i7, i10);
            i24 = paramInt1;
            i7 = w.a(i7, paramInt1, i12);
            setMeasuredDimension(i7, i26);
            if (i21 != 0) {
              a(i18, paramInt2);
            }
            for (;;)
            {
              return;
              i24 = i13;
              i34 = Math.max(i13, i14);
              if (!bool11) {
                break;
              }
              i7 = 1073741824;
              f2 = 2.0F;
              i24 = i20;
              if (i20 == i7) {
                break;
              }
              i7 = 0;
              f2 = 0.0F;
              localObject1 = null;
              i10 = 0;
              localView2 = null;
              f1 = 0.0F;
              for (;;)
              {
                i24 = i18;
                if (i10 >= i18) {
                  break;
                }
                localView1 = getChildAt(i10);
                if (localView1 != null)
                {
                  i7 = localView1.getVisibility();
                  i27 = 8;
                  f8 = 1.1E-44F;
                  if (i7 != i27)
                  {
                    localObject1 = (am.a)localView1.getLayoutParams();
                    f2 = g;
                    i27 = 0;
                    f8 = 0.0F;
                    localObject3 = null;
                    boolean bool7 = f2 < 0.0F;
                    if (bool7)
                    {
                      i8 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredWidth(), 1073741824);
                      f8 = 2.0F;
                      i27 = View.MeasureSpec.makeMeasureSpec(i25, 1073741824);
                      localView1.measure(i8, i27);
                    }
                  }
                }
                i8 = i10 + 1;
                i10 = i8;
              }
              b(paramInt1, paramInt2);
            }
            i8 = i10;
          }
          i8 = i34;
          i10 = i11;
        }
        label2400:
        f1 = f4;
        i17 = i27;
        i27 = i25;
        break label1768;
        label2415:
        f1 = f4;
        i28 = i22;
        f10 = f6;
        i8 = i34;
        i30 = i15;
        i17 = i27;
        i27 = i25;
      }
      label2445:
      i17 = i21;
      f4 = f5;
      break label748;
      label2456:
      i28 = i25;
      i25 = i22;
      f7 = f6;
      break label359;
      label2471:
      int i8 = i25;
      int i10 = i22;
      f1 = f6;
      f8 = f4;
      i30 = i15;
      f12 = f3;
      i28 = i14;
      int i32 = i13;
      i17 = i21;
      f4 = f5;
      i25 = i11;
      i21 = i12;
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i1 = getChildCount();
      if (paramInt < i1) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("base aligned child index out of range (0, ");
      int i2 = getChildCount();
      localObject = i2 + ")";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    b = paramInt;
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    Drawable localDrawable = k;
    if (paramDrawable == localDrawable) {
      return;
    }
    k = paramDrawable;
    int i1;
    if (paramDrawable != null)
    {
      i1 = paramDrawable.getIntrinsicWidth();
      l = i1;
      i1 = paramDrawable.getIntrinsicHeight();
    }
    for (m = i1;; m = 0)
    {
      if (paramDrawable == null) {
        bool = true;
      }
      setWillNotDraw(bool);
      requestLayout();
      break;
      l = 0;
    }
  }
  
  public void setDividerPadding(int paramInt)
  {
    o = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    int i1 = e;
    if (i1 != paramInt)
    {
      i1 = 0x800007 & paramInt;
      if (i1 != 0) {
        break label50;
      }
    }
    label50:
    for (i1 = 0x800003 | paramInt;; i1 = paramInt)
    {
      int i2 = i1 & 0x70;
      if (i2 == 0) {
        i1 |= 0x30;
      }
      e = i1;
      requestLayout();
      return;
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    int i1 = 8388615;
    int i2 = paramInt & i1;
    int i3 = e & i1;
    if (i3 != i2)
    {
      i3 = e;
      i1 = -8388616;
      i3 &= i1;
      i2 |= i3;
      e = i2;
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    h = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    int i1 = d;
    if (i1 != paramInt)
    {
      d = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    int i1 = n;
    if (paramInt != i1) {
      requestLayout();
    }
    n = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    int i1 = paramInt & 0x70;
    int i2 = e & 0x70;
    if (i2 != i1)
    {
      i2 = e & 0xFFFFFF8F;
      i1 |= i2;
      e = i1;
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    float f1 = Math.max(0.0F, paramFloat);
    g = f1;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              android/support/v7/widget/am.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */