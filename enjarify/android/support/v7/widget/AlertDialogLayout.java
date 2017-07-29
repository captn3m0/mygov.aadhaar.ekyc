package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.h.f;
import android.support.v4.h.w;
import android.support.v7.a.a.f;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class AlertDialogLayout
  extends am
{
  public AlertDialogLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = j - k;
    j -= i;
    k = getPaddingRight();
    int n = j - k;
    j = getMeasuredHeight();
    int i1 = getChildCount();
    k = getGravity();
    int i2 = k & 0x70;
    int i3 = 0x800007 & k;
    Drawable localDrawable;
    label127:
    int i4;
    int i5;
    label137:
    View localView;
    int i6;
    int i7;
    am.a locala;
    switch (i2)
    {
    default: 
      j = getPaddingTop();
      localDrawable = getDividerDrawable();
      if (localDrawable == null)
      {
        k = 0;
        localDrawable = null;
        i2 = 0;
        i4 = 0;
        i5 = j;
        if (i4 >= i1) {
          return;
        }
        localView = getChildAt(i4);
        if (localView != null)
        {
          j = localView.getVisibility();
          i2 = 8;
          if (j != i2)
          {
            i6 = localView.getMeasuredWidth();
            i7 = localView.getMeasuredHeight();
            locala = (am.a)localView.getLayoutParams();
            i2 = h;
            if (i2 < 0) {
              i2 = i3;
            }
            int i8 = w.g(this);
            i2 = f.a(i2, i8) & 0x7;
            switch (i2)
            {
            default: 
              i2 = leftMargin + i;
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      boolean bool = a(i4);
      if (bool) {
        i5 += k;
      }
      int i9 = topMargin;
      i5 += i9;
      i6 += i2;
      i9 = i5 + i7;
      localView.layout(i2, i5, i6, i9);
      j = bottomMargin + i7;
      i5 += j;
      j = i4 + 1;
      i4 = j;
      break label137;
      k = getPaddingTop() + paramInt4 - paramInt2;
      j = k - j;
      break;
      k = getPaddingTop();
      i2 = paramInt4 - paramInt2;
      j = (i2 - j) / 2 + k;
      break;
      k = localDrawable.getIntrinsicHeight();
      break label127;
      i2 = (n - i6) / 2 + i;
      i9 = leftMargin;
      i2 += i9;
      i9 = rightMargin;
      i2 -= i9;
      continue;
      i2 = m - i6;
      i9 = rightMargin;
      i2 -= i9;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    Object localObject3 = null;
    int n = getChildCount();
    int i1 = 0;
    Object localObject4 = null;
    int i2 = 0;
    View localView = null;
    int i3;
    int i4;
    Object localObject5;
    if (i2 < n)
    {
      localObject4 = getChildAt(i2);
      i3 = ((View)localObject4).getVisibility();
      i4 = 8;
      if (i3 == i4) {
        break label1024;
      }
      i3 = ((View)localObject4).getId();
      i4 = a.f.topPanel;
      if (i3 == i4)
      {
        localObject5 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject5;
      }
    }
    for (;;)
    {
      i = i2 + 1;
      i2 = i;
      localObject1 = localObject2;
      localObject2 = localObject3;
      localObject3 = localObject4;
      break;
      i4 = a.f.buttonPanel;
      if (i3 == i4)
      {
        localObject2 = localObject1;
        localObject5 = localObject4;
        localObject4 = localObject3;
        localObject3 = localObject5;
      }
      else
      {
        i4 = a.f.contentPanel;
        if (i3 != i4)
        {
          i4 = a.f.customPanel;
          if (i3 != i4) {}
        }
        else if (localObject3 != null)
        {
          i1 = 0;
        }
        for (localObject4 = null;; localObject4 = null)
        {
          if (i1 == 0) {
            super.onMeasure(paramInt1, paramInt2);
          }
          return;
          localObject3 = localObject2;
          localObject2 = localObject1;
          break;
          i1 = 0;
        }
        int i5 = View.MeasureSpec.getMode(paramInt2);
        int i6 = View.MeasureSpec.getSize(paramInt2);
        int i7 = View.MeasureSpec.getMode(paramInt1);
        i3 = 0;
        i1 = getPaddingTop();
        i2 = getPaddingBottom() + i1;
        if (localObject1 != null)
        {
          ((View)localObject1).measure(paramInt1, 0);
          i1 = ((View)localObject1).getMeasuredHeight();
          i2 += i1;
          i1 = 0;
          localObject4 = null;
          i = w.j((View)localObject1);
          i3 = w.a(0, i);
        }
        i = 0;
        localObject1 = null;
        i1 = 0;
        localObject4 = null;
        label348:
        int i8;
        if (localObject2 != null)
        {
          i1 = 0;
          ((View)localObject2).measure(paramInt1, 0);
          localObject4 = localObject2;
          i = w.r((View)localObject4);
          if (i > 0)
          {
            i1 = i;
            i = ((View)localObject2).getMeasuredHeight() - i1;
            i2 += i1;
            i4 = w.j((View)localObject2);
            i3 = w.a(i3, i4);
            i8 = i;
            i = i1;
          }
        }
        for (;;)
        {
          i1 = 0;
          localObject4 = null;
          if (localObject3 != null) {
            if (i5 == 0)
            {
              i1 = 0;
              localObject4 = null;
              label408:
              ((View)localObject3).measure(paramInt1, i1);
              i1 = ((View)localObject3).getMeasuredHeight();
              i2 += i1;
              i4 = w.j((View)localObject3);
              i3 = w.a(i3, i4);
              i4 = i1;
            }
          }
          for (;;)
          {
            i1 = i6 - i2;
            int i9;
            if (localObject2 != null)
            {
              i2 -= i;
              i8 = Math.min(i1, i8);
              if (i8 > 0)
              {
                i1 -= i8;
                i += i8;
              }
              i8 = 1073741824;
              i = View.MeasureSpec.makeMeasureSpec(i, i8);
              ((View)localObject2).measure(paramInt1, i);
              i = ((View)localObject2).getMeasuredHeight() + i2;
              k = w.j((View)localObject2);
              k = w.a(i3, k);
              i9 = i1;
              i1 = i;
              i = i9;
            }
            for (;;)
            {
              if ((localObject3 != null) && (i > 0))
              {
                i1 -= i4;
                i = View.MeasureSpec.makeMeasureSpec(i + i4, i5);
                ((View)localObject3).measure(paramInt1, i);
                i = ((View)localObject3).getMeasuredHeight();
                i1 += i;
                m = w.j((View)localObject3);
              }
              for (m = w.a(k, m);; m = k)
              {
                i9 = 0;
                localObject5 = null;
                k = 0;
                localObject2 = null;
                i = 0;
                localObject1 = null;
                for (;;)
                {
                  if (i < n)
                  {
                    localView = getChildAt(i);
                    i3 = localView.getVisibility();
                    i4 = 8;
                    if (i3 != i4)
                    {
                      i2 = localView.getMeasuredWidth();
                      k = Math.max(k, i2);
                    }
                    i += 1;
                    continue;
                    boolean bool = localObject4 instanceof ViewGroup;
                    if (bool)
                    {
                      localObject4 = (ViewGroup)localObject4;
                      j = ((ViewGroup)localObject4).getChildCount();
                      i4 = 1;
                      if (j == i4)
                      {
                        j = 0;
                        localObject1 = null;
                        localObject4 = ((ViewGroup)localObject4).getChildAt(0);
                        break;
                      }
                    }
                    i1 = 0;
                    localObject4 = null;
                    break label348;
                    localObject4 = null;
                    i4 = i6 - i2;
                    i1 = View.MeasureSpec.makeMeasureSpec(Math.max(0, i4), i5);
                    break label408;
                  }
                }
                j = getPaddingLeft();
                i2 = getPaddingRight();
                j += i2;
                m = w.a(k + j, paramInt1, m);
                k = 0;
                localObject2 = null;
                i1 = w.a(i1, paramInt2, 0);
                setMeasuredDimension(m, i1);
                i1 = 1073741824;
                if (i7 != i1)
                {
                  i1 = getMeasuredWidth();
                  m = 1073741824;
                  k = View.MeasureSpec.makeMeasureSpec(i1, m);
                  i1 = 0;
                  localObject4 = null;
                  for (i8 = 0; i8 < n; i8 = i1)
                  {
                    localObject3 = getChildAt(i8);
                    i1 = ((View)localObject3).getVisibility();
                    j = 8;
                    if (i1 != j)
                    {
                      localObject4 = ((View)localObject3).getLayoutParams();
                      localObject6 = localObject4;
                      localObject6 = (am.a)localObject4;
                      i1 = width;
                      j = -1;
                      if (i1 == j)
                      {
                        i5 = height;
                        i1 = ((View)localObject3).getMeasuredHeight();
                        height = i1;
                        j = 0;
                        localObject1 = null;
                        i3 = 0;
                        localObject4 = this;
                        i2 = paramInt2;
                        measureChildWithMargins((View)localObject3, k, 0, paramInt2, 0);
                        height = i5;
                      }
                    }
                    i1 = i8 + 1;
                  }
                }
                i1 = 1;
                break;
              }
              int j = i1;
              k = i3;
              i1 = i2;
            }
            i4 = 0;
            Object localObject6 = null;
          }
          i8 = 0;
        }
        label1024:
        localObject4 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
    }
  }
}


/* Location:              android/support/v7/widget/AlertDialogLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */