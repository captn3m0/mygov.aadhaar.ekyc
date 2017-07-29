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
    int j = getPaddingLeft();
    int k = paramInt3 - paramInt1;
    int m = getPaddingRight();
    int n = getPaddingRight();
    paramInt1 = getMeasuredHeight();
    int i1 = getChildCount();
    int i2 = getGravity();
    Object localObject;
    label91:
    label94:
    int i3;
    int i4;
    am.a locala;
    int i;
    switch (i2 & 0x70)
    {
    default: 
      paramInt1 = getPaddingTop();
      localObject = getDividerDrawable();
      if (localObject == null)
      {
        paramInt3 = 0;
        paramInt4 = 0;
        if (paramInt4 >= i1) {
          return;
        }
        localObject = getChildAt(paramInt4);
        paramInt2 = paramInt1;
        if (localObject != null)
        {
          paramInt2 = paramInt1;
          if (((View)localObject).getVisibility() != 8)
          {
            i3 = ((View)localObject).getMeasuredWidth();
            i4 = ((View)localObject).getMeasuredHeight();
            locala = (am.a)((View)localObject).getLayoutParams();
            i = h;
            paramInt2 = i;
            if (i < 0) {
              paramInt2 = 0x800007 & i2;
            }
            switch (f.a(paramInt2, w.g(this)) & 0x7)
            {
            default: 
              paramInt2 = leftMargin + j;
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      i = paramInt1;
      if (a(paramInt4)) {
        i = paramInt1 + paramInt3;
      }
      paramInt1 = i + topMargin;
      ((View)localObject).layout(paramInt2, paramInt1, i3 + paramInt2, paramInt1 + i4);
      paramInt2 = paramInt1 + (bottomMargin + i4);
      paramInt4 += 1;
      paramInt1 = paramInt2;
      break label94;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - paramInt1;
      break;
      paramInt3 = getPaddingTop();
      paramInt1 = (paramInt4 - paramInt2 - paramInt1) / 2 + paramInt3;
      break;
      paramInt3 = ((Drawable)localObject).getIntrinsicHeight();
      break label91;
      paramInt2 = (k - j - n - i3) / 2 + j + leftMargin - rightMargin;
      continue;
      paramInt2 = k - m - i3 - rightMargin;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject3 = null;
    Object localObject1 = null;
    Object localObject2 = null;
    int i3 = getChildCount();
    int i = 0;
    Object localObject4;
    int j;
    if (i < i3)
    {
      localObject4 = getChildAt(i);
      if (((View)localObject4).getVisibility() == 8) {
        break label769;
      }
      j = ((View)localObject4).getId();
      if (j == a.f.topPanel)
      {
        localObject3 = localObject4;
        localObject4 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
      }
    }
    for (;;)
    {
      i += 1;
      localObject4 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject4;
      break;
      if (j == a.f.buttonPanel)
      {
        localObject1 = localObject2;
        localObject2 = localObject4;
      }
      else
      {
        if ((j == a.f.contentPanel) || (j == a.f.customPanel)) {
          if (localObject2 == null) {}
        }
        for (i = 0;; i = 0)
        {
          if (i == 0) {
            super.onMeasure(paramInt1, paramInt2);
          }
          return;
          localObject2 = localObject1;
          localObject1 = localObject4;
          break;
        }
        int i5 = View.MeasureSpec.getMode(paramInt2);
        int i2 = View.MeasureSpec.getSize(paramInt2);
        int i4 = View.MeasureSpec.getMode(paramInt1);
        j = 0;
        i = getPaddingTop();
        i = getPaddingBottom() + i;
        int k = i;
        if (localObject3 != null)
        {
          ((View)localObject3).measure(paramInt1, 0);
          k = i + ((View)localObject3).getMeasuredHeight();
          j = w.a(0, w.j((View)localObject3));
        }
        i = 0;
        label255:
        int n;
        int m;
        if (localObject1 != null)
        {
          ((View)localObject1).measure(paramInt1, 0);
          localObject3 = localObject1;
          i = w.r((View)localObject3);
          if (i > 0)
          {
            n = ((View)localObject1).getMeasuredHeight();
            m = k + i;
            k = w.a(j, w.j((View)localObject1));
            n -= i;
          }
        }
        for (;;)
        {
          label299:
          int i1;
          if (localObject2 != null) {
            if (i5 == 0)
            {
              j = 0;
              ((View)localObject2).measure(paramInt1, j);
              i1 = ((View)localObject2).getMeasuredHeight();
              j = m + i1;
              k = w.a(k, w.j((View)localObject2));
            }
          }
          for (;;)
          {
            i2 -= j;
            if (localObject1 != null)
            {
              int i6 = Math.min(i2, n);
              m = i2;
              n = i;
              if (i6 > 0)
              {
                m = i2 - i6;
                n = i + i6;
              }
              ((View)localObject1).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(n, 1073741824));
              n = ((View)localObject1).getMeasuredHeight();
              k = w.a(k, w.j((View)localObject1));
              i = n + (j - i);
              i2 = m;
            }
            for (j = k;; j = k)
            {
              if ((localObject2 != null) && (i2 > 0))
              {
                ((View)localObject2).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i2 + i1, i5));
                i = i - i1 + ((View)localObject2).getMeasuredHeight();
                j = w.a(j, w.j((View)localObject2));
              }
              for (;;)
              {
                m = 0;
                k = 0;
                for (;;)
                {
                  if (k < i3)
                  {
                    localObject1 = getChildAt(k);
                    n = m;
                    if (((View)localObject1).getVisibility() != 8) {
                      n = Math.max(m, ((View)localObject1).getMeasuredWidth());
                    }
                    k += 1;
                    m = n;
                    continue;
                    if ((localObject3 instanceof ViewGroup))
                    {
                      localObject3 = (ViewGroup)localObject3;
                      if (((ViewGroup)localObject3).getChildCount() == 1)
                      {
                        localObject3 = ((ViewGroup)localObject3).getChildAt(0);
                        break;
                      }
                    }
                    i = 0;
                    break label255;
                    j = View.MeasureSpec.makeMeasureSpec(Math.max(0, i2 - m), i5);
                    break label299;
                  }
                }
                setMeasuredDimension(w.a(m + (getPaddingLeft() + getPaddingRight()), paramInt1, j), w.a(i, paramInt2, 0));
                if (i4 != 1073741824)
                {
                  j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                  i = 0;
                  while (i < i3)
                  {
                    localObject1 = getChildAt(i);
                    if (((View)localObject1).getVisibility() != 8)
                    {
                      localObject2 = (am.a)((View)localObject1).getLayoutParams();
                      if (width == -1)
                      {
                        k = height;
                        height = ((View)localObject1).getMeasuredHeight();
                        measureChildWithMargins((View)localObject1, j, 0, paramInt2, 0);
                        height = k;
                      }
                    }
                    i += 1;
                  }
                }
                i = 1;
                break;
              }
              i = j;
            }
            i1 = 0;
            j = m;
          }
          n = 0;
          m = k;
          k = j;
        }
        label769:
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject4;
      }
    }
  }
}


/* Location:              android/support/v7/widget/AlertDialogLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */