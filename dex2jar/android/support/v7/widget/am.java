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
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class am
  extends ViewGroup
{
  private boolean a = true;
  private int b = -1;
  private int c = 0;
  private int d;
  private int e = 8388659;
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
    paramContext = bf.a(paramContext, paramAttributeSet, a.j.LinearLayoutCompat, paramInt, 0);
    paramInt = paramContext.a(a.j.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0) {
      setOrientation(paramInt);
    }
    paramInt = paramContext.a(a.j.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0) {
      setGravity(paramInt);
    }
    boolean bool = paramContext.a(a.j.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool) {
      setBaselineAligned(bool);
    }
    paramInt = a.j.LinearLayoutCompat_android_weightSum;
    g = a.getFloat(paramInt, -1.0F);
    b = paramContext.a(a.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    h = paramContext.a(a.j.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(paramContext.a(a.j.LinearLayoutCompat_divider));
    n = paramContext.a(a.j.LinearLayoutCompat_showDividers, 0);
    o = paramContext.e(a.j.LinearLayoutCompat_dividerPadding, 0);
    a.recycle();
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    int i1 = 0;
    while (i1 < paramInt1)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() != 8)
      {
        a locala = (a)localView.getLayoutParams();
        if (width == -1)
        {
          int i3 = height;
          height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, i2, 0, paramInt2, 0);
          height = i3;
        }
      }
      i1 += 1;
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt)
  {
    k.setBounds(getPaddingLeft() + o, paramInt, getWidth() - getPaddingRight() - o, m + paramInt);
    k.draw(paramCanvas);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    f = 0;
    int i6 = 0;
    int i4 = 0;
    int i3 = 0;
    int i8 = 0;
    int i5 = 1;
    float f1 = 0.0F;
    int i15 = getVirtualChildCount();
    int i17 = View.MeasureSpec.getMode(paramInt1);
    int i16 = View.MeasureSpec.getMode(paramInt2);
    int i7 = 0;
    int i2 = 0;
    if ((i == null) || (j == null))
    {
      i = new int[4];
      j = new int[4];
    }
    Object localObject1 = i;
    Object localObject2 = j;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    localObject2[3] = -1;
    localObject2[2] = -1;
    localObject2[1] = -1;
    localObject2[0] = -1;
    boolean bool1 = a;
    boolean bool2 = h;
    if (i17 == 1073741824) {}
    int i1;
    int i9;
    Object localObject3;
    int i12;
    int i11;
    for (int i10 = 1;; i10 = 0)
    {
      i1 = Integer.MIN_VALUE;
      for (i9 = 0;; i9 = i12)
      {
        if (i9 >= i15) {
          break label894;
        }
        localObject3 = getChildAt(i9);
        if (localObject3 != null) {
          break;
        }
        f += 0;
        i12 = i9;
        i11 = i4;
        i9 = i3;
        i4 = i8;
        i3 = i5;
        i12 += 1;
        i5 = i3;
        i8 = i4;
        i3 = i9;
        i4 = i11;
      }
    }
    a locala;
    label340:
    label361:
    label386:
    int i13;
    int i14;
    if (((View)localObject3).getVisibility() != 8)
    {
      if (a(i9)) {
        f += l;
      }
      locala = (a)((View)localObject3).getLayoutParams();
      f1 += g;
      if ((i17 == 1073741824) && (width == 0) && (g > 0.0F)) {
        if (i10 != 0)
        {
          f += leftMargin + rightMargin;
          if (!bool1) {
            break label643;
          }
          i11 = View.MeasureSpec.makeMeasureSpec(0, 0);
          ((View)localObject3).measure(i11, i11);
          i11 = 0;
          if ((i16 == 1073741824) || (height != -1)) {
            break label2319;
          }
          i7 = 1;
          i11 = 1;
          i12 = topMargin + bottomMargin;
          i13 = ((View)localObject3).getMeasuredHeight() + i12;
          i14 = bk.a(i4, w.j((View)localObject3));
          if (bool1)
          {
            int i18 = ((View)localObject3).getBaseline();
            if (i18 != -1)
            {
              if (h >= 0) {
                break label823;
              }
              i4 = e;
              label453:
              i4 = ((i4 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              localObject1[i4] = Math.max(localObject1[i4], i18);
              localObject2[i4] = Math.max(localObject2[i4], i13 - i18);
            }
          }
          i6 = Math.max(i6, i13);
          if ((i5 == 0) || (height != -1)) {
            break label833;
          }
          i4 = 1;
          label526:
          if (g <= 0.0F) {
            break label846;
          }
          if (i11 == 0) {
            break label839;
          }
          label541:
          i5 = Math.max(i8, i12);
          i11 = i4;
          i4 = i5;
          i12 = i1;
          i8 = i14;
          i5 = i3;
          i3 = i11;
          i1 = i2;
          i2 = i12;
        }
      }
    }
    for (;;)
    {
      i12 = i9 + 0;
      i9 = i1;
      i1 = i2;
      i2 = i9;
      i9 = i5;
      i11 = i8;
      break;
      i11 = f;
      f = Math.max(i11, leftMargin + i11 + rightMargin);
      break label340;
      label643:
      i2 = 1;
      break label361;
      i12 = Integer.MIN_VALUE;
      i11 = i12;
      if (width == 0)
      {
        i11 = i12;
        if (g > 0.0F)
        {
          i11 = 0;
          width = -2;
        }
      }
      if (f1 == 0.0F)
      {
        i12 = f;
        label701:
        a((View)localObject3, paramInt1, i12, paramInt2, 0);
        if (i11 != Integer.MIN_VALUE) {
          width = i11;
        }
        i11 = ((View)localObject3).getMeasuredWidth();
        if (i10 == 0) {
          break label786;
        }
        f += leftMargin + i11 + rightMargin + 0;
      }
      for (;;)
      {
        if (bool2)
        {
          i1 = Math.max(i11, i1);
          break;
          i12 = 0;
          break label701;
          label786:
          i12 = f;
          f = Math.max(i12, i12 + i11 + leftMargin + rightMargin + 0);
          continue;
          label823:
          i4 = h;
          break label453;
          label833:
          i4 = 0;
          break label526;
          label839:
          i12 = i13;
          break label541;
          label846:
          if (i11 != 0) {}
          for (;;)
          {
            i5 = Math.max(i3, i12);
            i3 = i4;
            i11 = i2;
            i4 = i8;
            i2 = i1;
            i1 = i11;
            i8 = i14;
            break;
            i12 = i13;
          }
          label894:
          if ((f > 0) && (a(i15))) {
            f += l;
          }
          if ((localObject1[1] != -1) || (localObject1[0] != -1) || (localObject1[2] != -1) || (localObject1[3] != -1)) {}
          for (i9 = Math.max(i6, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));; i9 = i6)
          {
            if ((bool2) && ((i17 == Integer.MIN_VALUE) || (i17 == 0)))
            {
              f = 0;
              i6 = 0;
              if (i6 < i15)
              {
                localObject3 = getChildAt(i6);
                if (localObject3 == null) {
                  f += 0;
                }
                for (;;)
                {
                  i6 += 1;
                  break;
                  if (((View)localObject3).getVisibility() == 8)
                  {
                    i6 += 0;
                  }
                  else
                  {
                    localObject3 = (a)((View)localObject3).getLayoutParams();
                    if (i10 != 0)
                    {
                      i11 = f;
                      i12 = leftMargin;
                      f = (rightMargin + (i12 + i1) + 0 + i11);
                    }
                    else
                    {
                      i11 = f;
                      i12 = leftMargin;
                      f = Math.max(i11, rightMargin + (i11 + i1 + i12) + 0);
                    }
                  }
                }
              }
            }
            f += getPaddingLeft() + getPaddingRight();
            i13 = w.a(Math.max(f, getSuggestedMinimumWidth()), paramInt1, 0);
            i6 = (0xFFFFFF & i13) - f;
            if ((i2 != 0) || ((i6 != 0) && (f1 > 0.0F)))
            {
              if (g > 0.0F) {
                f1 = g;
              }
              localObject1[3] = -1;
              localObject1[2] = -1;
              localObject1[1] = -1;
              localObject1[0] = -1;
              localObject2[3] = -1;
              localObject2[2] = -1;
              localObject2[1] = -1;
              localObject2[0] = -1;
              f = 0;
              i8 = 0;
              i2 = i5;
              i5 = -1;
              i1 = i4;
              i4 = i5;
              i5 = i6;
              if (i8 < i15)
              {
                localObject3 = getChildAt(i8);
                if ((localObject3 == null) || (((View)localObject3).getVisibility() == 8)) {
                  break label2281;
                }
                locala = (a)((View)localObject3).getLayoutParams();
                float f2 = g;
                if (f2 <= 0.0F) {
                  break label2266;
                }
                i9 = (int)(i5 * f2 / f1);
                i12 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + topMargin + bottomMargin, height);
                if ((width != 0) || (i17 != 1073741824))
                {
                  i11 = i9 + ((View)localObject3).getMeasuredWidth();
                  i6 = i11;
                  if (i11 < 0) {
                    i6 = 0;
                  }
                  label1467:
                  ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i12);
                  i1 = bk.a(i1, w.j((View)localObject3) & 0xFF000000);
                  f1 -= f2;
                  i6 = i5 - i9;
                  i5 = i1;
                  i1 = i6;
                  label1517:
                  if (i10 == 0) {
                    break label1790;
                  }
                  f += ((View)localObject3).getMeasuredWidth() + leftMargin + rightMargin + 0;
                  label1550:
                  if ((i16 == 1073741824) || (height != -1)) {
                    break label1830;
                  }
                  i6 = 1;
                  label1569:
                  i12 = topMargin + bottomMargin;
                  i11 = ((View)localObject3).getMeasuredHeight() + i12;
                  i9 = Math.max(i4, i11);
                  if (i6 == 0) {
                    break label1836;
                  }
                  i4 = i12;
                  label1610:
                  i4 = Math.max(i3, i4);
                  if ((i2 == 0) || (height != -1)) {
                    break label1843;
                  }
                  i2 = 1;
                  label1636:
                  if (bool1)
                  {
                    i6 = ((View)localObject3).getBaseline();
                    if (i6 != -1)
                    {
                      if (h >= 0) {
                        break label1849;
                      }
                      i3 = e;
                      label1668:
                      i3 = ((i3 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                      localObject1[i3] = Math.max(localObject1[i3], i6);
                      localObject2[i3] = Math.max(localObject2[i3], i11 - i6);
                    }
                  }
                  i6 = i5;
                  i5 = i2;
                  i3 = i9;
                  i2 = i6;
                }
              }
            }
            for (;;)
            {
              i9 = i8 + 1;
              i6 = i5;
              i8 = i3;
              i5 = i1;
              i1 = i2;
              i2 = i6;
              i3 = i4;
              i4 = i8;
              i8 = i9;
              break;
              if (i9 > 0)
              {
                i6 = i9;
                break label1467;
              }
              i6 = 0;
              break label1467;
              label1790:
              i6 = f;
              f = Math.max(i6, ((View)localObject3).getMeasuredWidth() + i6 + leftMargin + rightMargin + 0);
              break label1550;
              label1830:
              i6 = 0;
              break label1569;
              label1836:
              i4 = i11;
              break label1610;
              label1843:
              i2 = 0;
              break label1636;
              label1849:
              i3 = h;
              break label1668;
              f += getPaddingLeft() + getPaddingRight();
              if ((localObject1[1] == -1) && (localObject1[0] == -1) && (localObject1[2] == -1))
              {
                i5 = i4;
                if (localObject1[3] == -1) {}
              }
              else
              {
                i5 = Math.max(i4, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));
              }
              i4 = i1;
              i6 = i2;
              i2 = i5;
              i1 = i3;
              for (;;)
              {
                if ((i6 == 0) && (i16 != 1073741824)) {}
                for (;;)
                {
                  setMeasuredDimension(0xFF000000 & i4 | i13, w.a(Math.max(i1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, i4 << 16));
                  if (i7 != 0)
                  {
                    i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    paramInt2 = 0;
                    while (paramInt2 < i15)
                    {
                      localObject1 = getChildAt(paramInt2);
                      if (((View)localObject1).getVisibility() != 8)
                      {
                        localObject2 = (a)((View)localObject1).getLayoutParams();
                        if (height == -1)
                        {
                          i2 = width;
                          width = ((View)localObject1).getMeasuredWidth();
                          measureChildWithMargins((View)localObject1, paramInt1, 0, i1, 0);
                          width = i2;
                        }
                      }
                      paramInt2 += 1;
                      continue;
                      i3 = Math.max(i3, i8);
                      if ((!bool2) || (i17 == 1073741824)) {
                        break label2251;
                      }
                      i2 = 0;
                      while (i2 < i15)
                      {
                        localObject1 = getChildAt(i2);
                        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (getLayoutParamsg > 0.0F)) {
                          ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
                        }
                        i2 += 1;
                      }
                    }
                  }
                  return;
                  i1 = i2;
                }
                label2251:
                i1 = i3;
                i2 = i9;
                i6 = i5;
              }
              label2266:
              i6 = i1;
              i1 = i5;
              i5 = i6;
              break label1517;
              label2281:
              i9 = i2;
              i2 = i1;
              i6 = i4;
              i1 = i5;
              i5 = i9;
              i4 = i3;
              i3 = i6;
            }
          }
          label2319:
          break label386;
        }
      }
      break label361;
      i12 = i2;
      i11 = i3;
      i13 = i4;
      i2 = i1;
      i1 = i12;
      i3 = i5;
      i4 = i8;
      i5 = i11;
      i8 = i13;
    }
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    k.setBounds(paramInt, getPaddingTop() + o, l + paramInt, getHeight() - getPaddingBottom() - o);
    k.draw(paramCanvas);
  }
  
  private static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
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
  
  public a a(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  protected final boolean a(int paramInt)
  {
    if (paramInt == 0) {
      if ((n & 0x1) == 0) {}
    }
    do
    {
      return true;
      return false;
      if (paramInt != getChildCount()) {
        break;
      }
    } while ((n & 0x4) != 0);
    return false;
    if ((n & 0x2) != 0)
    {
      paramInt -= 1;
      for (;;)
      {
        if (paramInt < 0) {
          break label75;
        }
        if (getChildAt(paramInt).getVisibility() != 8) {
          break;
        }
        paramInt -= 1;
      }
    }
    return false;
    label75:
    return false;
  }
  
  protected a b(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new a(paramLayoutParams);
  }
  
  protected a c()
  {
    if (d == 0) {
      return new a(-2, -2);
    }
    if (d == 1) {
      return new a(-1, -2);
    }
    return null;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  public int getBaseline()
  {
    int i1 = -1;
    if (b < 0) {
      i1 = super.getBaseline();
    }
    View localView;
    int i2;
    do
    {
      return i1;
      if (getChildCount() <= b) {
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      }
      localView = getChildAt(b);
      i2 = localView.getBaseline();
      if (i2 != -1) {
        break;
      }
    } while (b == 0);
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    i1 = c;
    if (d == 1)
    {
      int i3 = e & 0x70;
      if (i3 != 48) {
        switch (i3)
        {
        }
      }
    }
    for (;;)
    {
      return getLayoutParamstopMargin + i1 + i2;
      i1 = getBottom() - getTop() - getPaddingBottom() - f;
      continue;
      i1 += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - f) / 2;
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
    if (k == null) {}
    int i1;
    a locala;
    int i3;
    boolean bool;
    label259:
    do
    {
      int i2;
      do
      {
        return;
        if (d != 1) {
          break;
        }
        i2 = getVirtualChildCount();
        i1 = 0;
        while (i1 < i2)
        {
          localView = getChildAt(i1);
          if ((localView != null) && (localView.getVisibility() != 8) && (a(i1)))
          {
            locala = (a)localView.getLayoutParams();
            a(paramCanvas, localView.getTop() - topMargin - m);
          }
          i1 += 1;
        }
      } while (!a(i2));
      localView = getChildAt(i2 - 1);
      if (localView == null) {}
      for (i1 = getHeight() - getPaddingBottom() - m;; i1 = bottomMargin + i1)
      {
        a(paramCanvas, i1);
        return;
        locala = (a)localView.getLayoutParams();
        i1 = localView.getBottom();
      }
      i3 = getVirtualChildCount();
      bool = bk.a(this);
      i1 = 0;
      if (i1 < i3)
      {
        localView = getChildAt(i1);
        if ((localView != null) && (localView.getVisibility() != 8) && (a(i1)))
        {
          locala = (a)localView.getLayoutParams();
          if (!bool) {
            break label259;
          }
          i2 = localView.getRight();
        }
        for (i2 = rightMargin + i2;; i2 = localView.getLeft() - leftMargin - l)
        {
          b(paramCanvas, i2);
          i1 += 1;
          break;
        }
      }
    } while (!a(i3));
    View localView = getChildAt(i3 - 1);
    if (localView == null) {
      if (bool) {
        i1 = getPaddingLeft();
      }
    }
    for (;;)
    {
      b(paramCanvas, i1);
      return;
      i1 = getWidth() - getPaddingRight() - l;
      continue;
      locala = (a)localView.getLayoutParams();
      if (bool)
      {
        i1 = localView.getLeft() - leftMargin - l;
      }
      else
      {
        i1 = localView.getRight();
        i1 = rightMargin + i1;
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(am.class.getName());
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(am.class.getName());
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    label93:
    Object localObject1;
    if (d == 1)
    {
      i1 = getPaddingLeft();
      i2 = paramInt3 - paramInt1;
      i3 = getPaddingRight();
      i4 = getPaddingRight();
      i5 = getVirtualChildCount();
      paramInt1 = e;
      i6 = e;
      switch (paramInt1 & 0x70)
      {
      default: 
        paramInt1 = getPaddingTop();
        paramInt3 = 0;
        paramInt2 = paramInt1;
        paramInt1 = paramInt3;
        if (paramInt1 < i5)
        {
          localObject1 = getChildAt(paramInt1);
          if (localObject1 == null) {
            paramInt2 += 0;
          }
        }
        break;
      }
    }
    for (;;)
    {
      paramInt1 += 1;
      break label93;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - f;
      break;
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - f) / 2;
      break;
      if (((View)localObject1).getVisibility() != 8)
      {
        int i7 = ((View)localObject1).getMeasuredWidth();
        int i8 = ((View)localObject1).getMeasuredHeight();
        Object localObject2 = (a)((View)localObject1).getLayoutParams();
        paramInt4 = h;
        paramInt3 = paramInt4;
        if (paramInt4 < 0) {
          paramInt3 = 0x800007 & i6;
        }
        switch (f.a(paramInt3, w.g(this)) & 0x7)
        {
        default: 
          paramInt3 = leftMargin + i1;
        }
        for (;;)
        {
          paramInt4 = paramInt2;
          if (a(paramInt1)) {
            paramInt4 = paramInt2 + m;
          }
          paramInt2 = paramInt4 + topMargin;
          b((View)localObject1, paramInt3, paramInt2 + 0, i7, i8);
          paramInt2 += bottomMargin + i8 + 0;
          paramInt1 += 0;
          break;
          paramInt3 = (i2 - i1 - i4 - i7) / 2 + i1 + leftMargin - rightMargin;
          continue;
          paramInt3 = i2 - i3 - i7 - rightMargin;
        }
        paramBoolean = bk.a(this);
        i3 = getPaddingTop();
        i5 = paramInt4 - paramInt2;
        i6 = getPaddingBottom();
        i7 = getPaddingBottom();
        i8 = getVirtualChildCount();
        paramInt2 = e;
        int i9 = e;
        boolean bool = a;
        localObject1 = i;
        localObject2 = j;
        switch (f.a(paramInt2 & 0x800007, w.g(this)))
        {
        default: 
          paramInt1 = getPaddingLeft();
          if (paramBoolean) {
            i1 = i8 - 1;
          }
          break;
        }
        for (paramInt4 = -1;; paramInt4 = 1)
        {
          paramInt2 = 0;
          paramInt3 = paramInt1;
          label507:
          int i12;
          View localView;
          if (paramInt2 < i8)
          {
            i12 = i1 + paramInt4 * paramInt2;
            localView = getChildAt(i12);
            if (localView == null)
            {
              paramInt3 += 0;
              paramInt1 = paramInt2;
            }
          }
          for (;;)
          {
            paramInt2 = paramInt1 + 1;
            break label507;
            paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - f;
            break;
            paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - f) / 2;
            break;
            if (localView.getVisibility() != 8)
            {
              int i10 = localView.getMeasuredWidth();
              int i11 = localView.getMeasuredHeight();
              paramInt1 = -1;
              a locala = (a)localView.getLayoutParams();
              i2 = paramInt1;
              if (bool)
              {
                i2 = paramInt1;
                if (height != -1) {
                  i2 = localView.getBaseline();
                }
              }
              i4 = h;
              paramInt1 = i4;
              if (i4 < 0) {
                paramInt1 = i9 & 0x70;
              }
              switch (paramInt1 & 0x70)
              {
              default: 
                paramInt1 = i3;
              }
              label715:
              label895:
              for (;;)
              {
                if (a(i12)) {
                  paramInt3 = l + paramInt3;
                }
                for (;;)
                {
                  paramInt3 += leftMargin;
                  b(localView, paramInt3 + 0, paramInt1, i10, i11);
                  paramInt3 += rightMargin + i10 + 0;
                  paramInt1 = paramInt2 + 0;
                  break;
                  i4 = topMargin + i3;
                  paramInt1 = i4;
                  if (i2 == -1) {
                    break label895;
                  }
                  paramInt1 = localObject1[1] - i2 + i4;
                  break label715;
                  paramInt1 = (i5 - i3 - i7 - i11) / 2 + i3 + topMargin - bottomMargin;
                  break label715;
                  i4 = i5 - i6 - i11 - bottomMargin;
                  paramInt1 = i4;
                  if (i2 == -1) {
                    break label895;
                  }
                  paramInt1 = localView.getMeasuredHeight();
                  paramInt1 = i4 - (localObject2[2] - (paramInt1 - i2));
                  break label715;
                  return;
                }
              }
            }
            paramInt1 = paramInt2;
          }
          i1 = 0;
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3;
    int i1;
    int i2;
    int i8;
    int i4;
    float f1;
    int i14;
    int i15;
    int i16;
    int i7;
    int i6;
    boolean bool;
    int i5;
    int i9;
    Object localObject;
    int i13;
    int i12;
    int i11;
    int i10;
    a locala;
    if (d == 1)
    {
      f = 0;
      i3 = 0;
      i1 = 0;
      i2 = 0;
      i8 = 0;
      i4 = 1;
      f1 = 0.0F;
      i14 = getVirtualChildCount();
      i15 = View.MeasureSpec.getMode(paramInt1);
      i16 = View.MeasureSpec.getMode(paramInt2);
      i7 = 0;
      i6 = 0;
      int i17 = b;
      bool = h;
      i5 = Integer.MIN_VALUE;
      i9 = 0;
      for (;;)
      {
        if (i9 < i14)
        {
          localObject = getChildAt(i9);
          if (localObject == null)
          {
            f += 0;
            i13 = i9;
            i12 = i3;
            i11 = i1;
            i10 = i2;
            i9 = i8;
            i3 = i4;
            i2 = i6;
            i1 = i5;
            i13 += 1;
            i5 = i1;
            i6 = i2;
            i4 = i3;
            i8 = i9;
            i2 = i10;
            i1 = i11;
            i3 = i12;
            i9 = i13;
          }
          else
          {
            if (((View)localObject).getVisibility() == 8) {
              break label1655;
            }
            if (a(i9)) {
              f += m;
            }
            locala = (a)((View)localObject).getLayoutParams();
            f1 += g;
            if ((i16 == 1073741824) && (height == 0) && (g > 0.0F))
            {
              i6 = f;
              f = Math.max(i6, topMargin + i6 + bottomMargin);
              i6 = 1;
              label283:
              if ((i17 >= 0) && (i17 == i9 + 1)) {
                c = f;
              }
              if ((i9 < i17) && (g > 0.0F)) {
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
              }
            }
            else
            {
              i11 = Integer.MIN_VALUE;
              i10 = i11;
              if (height == 0)
              {
                i10 = i11;
                if (g > 0.0F)
                {
                  i10 = 0;
                  height = -2;
                }
              }
              if (f1 == 0.0F) {}
              for (i11 = f;; i11 = 0)
              {
                a((View)localObject, paramInt1, 0, paramInt2, i11);
                if (i10 != Integer.MIN_VALUE) {
                  height = i10;
                }
                i10 = ((View)localObject).getMeasuredHeight();
                i11 = f;
                f = Math.max(i11, i11 + i10 + topMargin + bottomMargin + 0);
                if (!bool) {
                  break label1652;
                }
                i5 = Math.max(i10, i5);
                break;
              }
            }
            i10 = 0;
            if ((i15 == 1073741824) || (width != -1)) {
              break label1649;
            }
            i7 = 1;
            i10 = 1;
            label499:
            i11 = leftMargin + rightMargin;
            i12 = ((View)localObject).getMeasuredWidth() + i11;
            i3 = Math.max(i3, i12);
            i13 = bk.a(i1, w.j((View)localObject));
            if ((i4 != 0) && (width == -1))
            {
              i1 = 1;
              label560:
              if (g <= 0.0F) {
                break label678;
              }
              if (i10 == 0) {
                break label671;
              }
              label575:
              i8 = Math.max(i8, i11);
              i4 = i2;
              i2 = i6;
              i6 = i3;
              i3 = i8;
              i10 = i5;
              i8 = i13;
              i5 = i4;
              i4 = i3;
              i3 = i1;
              i1 = i2;
              i2 = i10;
            }
          }
        }
      }
    }
    for (;;)
    {
      i13 = i9 + 0;
      i9 = i1;
      i1 = i2;
      i2 = i9;
      i9 = i4;
      i10 = i5;
      i11 = i8;
      i12 = i6;
      break;
      i1 = 0;
      break label560;
      label671:
      i11 = i12;
      break label575;
      label678:
      if (i10 != 0) {}
      for (;;)
      {
        i10 = Math.max(i2, i11);
        i4 = i1;
        i1 = i6;
        i2 = i5;
        i6 = i3;
        i3 = i4;
        i4 = i8;
        i5 = i10;
        i8 = i13;
        break;
        i11 = i12;
      }
      if ((f > 0) && (a(i14))) {
        f += m;
      }
      if ((bool) && ((i16 == Integer.MIN_VALUE) || (i16 == 0)))
      {
        f = 0;
        i9 = 0;
        if (i9 < i14)
        {
          localObject = getChildAt(i9);
          if (localObject == null) {
            f += 0;
          }
          for (;;)
          {
            i9 += 1;
            break;
            if (((View)localObject).getVisibility() == 8)
            {
              i9 += 0;
            }
            else
            {
              localObject = (a)((View)localObject).getLayoutParams();
              i10 = f;
              i11 = topMargin;
              f = Math.max(i10, bottomMargin + (i10 + i5 + i11) + 0);
            }
          }
        }
      }
      f += getPaddingTop() + getPaddingBottom();
      i11 = w.a(Math.max(f, getSuggestedMinimumHeight()), paramInt2, 0);
      i9 = (0xFFFFFF & i11) - f;
      if ((i6 != 0) || ((i9 != 0) && (f1 > 0.0F)))
      {
        if (g > 0.0F) {
          f1 = g;
        }
        f = 0;
        i8 = 0;
        i5 = i4;
        i4 = i3;
        i3 = i2;
        i2 = i5;
        i5 = i9;
        if (i8 < i14)
        {
          localObject = getChildAt(i8);
          if (((View)localObject).getVisibility() == 8) {
            break label1622;
          }
          locala = (a)((View)localObject).getLayoutParams();
          float f2 = g;
          if (f2 <= 0.0F) {
            break label1607;
          }
          i9 = (int)(i5 * f2 / f1);
          i12 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + leftMargin + rightMargin, width);
          if ((height != 0) || (i16 != 1073741824))
          {
            i10 = i9 + ((View)localObject).getMeasuredHeight();
            i6 = i10;
            if (i10 < 0) {
              i6 = 0;
            }
            label1132:
            ((View)localObject).measure(i12, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            i1 = bk.a(i1, w.j((View)localObject) & 0xFF00);
            i6 = i5 - i9;
            i5 = i1;
            f1 -= f2;
            i1 = i6;
            label1182:
            i9 = leftMargin + rightMargin;
            i10 = ((View)localObject).getMeasuredWidth() + i9;
            i6 = Math.max(i4, i10);
            if ((i15 == 1073741824) || (width != -1)) {
              break label1376;
            }
            i4 = 1;
            label1233:
            if (i4 == 0) {
              break label1382;
            }
            i4 = i9;
            label1242:
            i3 = Math.max(i3, i4);
            if ((i2 == 0) || (width != -1)) {
              break label1389;
            }
            i2 = 1;
            label1268:
            i4 = f;
            i9 = ((View)localObject).getMeasuredHeight();
            i10 = topMargin;
            f = Math.max(i4, bottomMargin + (i9 + i4 + i10) + 0);
            i4 = i2;
            i2 = i6;
          }
        }
      }
      for (;;)
      {
        i9 = i8 + 1;
        i8 = i5;
        i6 = i2;
        i5 = i1;
        i1 = i8;
        i2 = i4;
        i4 = i6;
        i8 = i9;
        break;
        if (i9 > 0)
        {
          i6 = i9;
          break label1132;
        }
        i6 = 0;
        break label1132;
        label1376:
        i4 = 0;
        break label1233;
        label1382:
        i4 = i10;
        break label1242;
        label1389:
        i2 = 0;
        break label1268;
        f += getPaddingTop() + getPaddingBottom();
        i5 = i3;
        i3 = i4;
        i4 = i2;
        for (i2 = i5;; i2 = i6)
        {
          if ((i4 == 0) && (i15 != 1073741824)) {}
          for (;;)
          {
            setMeasuredDimension(w.a(Math.max(i2 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, i1), i11);
            if (i7 != 0) {
              a(i14, paramInt2);
            }
            return;
            i6 = Math.max(i2, i8);
            if ((!bool) || (i16 == 1073741824)) {
              break;
            }
            i2 = 0;
            while (i2 < i14)
            {
              localObject = getChildAt(i2);
              if ((localObject != null) && (((View)localObject).getVisibility() != 8) && (getLayoutParamsg > 0.0F)) {
                ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
              }
              i2 += 1;
            }
            b(paramInt1, paramInt2);
            return;
            i2 = i3;
          }
        }
        label1607:
        i6 = i1;
        i1 = i5;
        i5 = i6;
        break label1182;
        label1622:
        i6 = i2;
        i2 = i4;
        i4 = i1;
        i1 = i5;
        i5 = i4;
        i4 = i6;
      }
      label1649:
      break label499;
      label1652:
      break label283;
      label1655:
      i10 = i5;
      i11 = i6;
      i5 = i2;
      i6 = i3;
      i12 = i1;
      i2 = i10;
      i1 = i11;
      i3 = i4;
      i4 = i8;
      i8 = i12;
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getChildCount())) {
      throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }
    b = paramInt;
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    if (paramDrawable == k) {
      return;
    }
    k = paramDrawable;
    if (paramDrawable != null) {
      l = paramDrawable.getIntrinsicWidth();
    }
    for (m = paramDrawable.getIntrinsicHeight();; m = 0)
    {
      if (paramDrawable == null) {
        bool = true;
      }
      setWillNotDraw(bool);
      requestLayout();
      return;
      l = 0;
    }
  }
  
  public void setDividerPadding(int paramInt)
  {
    o = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    if (e != paramInt)
    {
      if ((0x800007 & paramInt) != 0) {
        break label46;
      }
      paramInt = 0x800003 | paramInt;
    }
    label46:
    for (;;)
    {
      int i1 = paramInt;
      if ((paramInt & 0x70) == 0) {
        i1 = paramInt | 0x30;
      }
      e = i1;
      requestLayout();
      return;
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    paramInt &= 0x800007;
    if ((e & 0x800007) != paramInt)
    {
      e = (paramInt | e & 0xFF7FFFF8);
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    h = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    if (d != paramInt)
    {
      d = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    if (paramInt != n) {
      requestLayout();
    }
    n = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 0x70;
    if ((e & 0x70) != paramInt)
    {
      e = (paramInt | e & 0xFFFFFF8F);
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    g = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static class a
    extends ViewGroup.MarginLayoutParams
  {
    public float g;
    public int h = -1;
    
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      g = 0.0F;
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.LinearLayoutCompat_Layout);
      g = paramContext.getFloat(a.j.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      h = paramContext.getInt(a.j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      paramContext.recycle();
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              android/support/v7/widget/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */