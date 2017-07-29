package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.a.i;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class FloatingActionButton$Behavior
  extends CoordinatorLayout.a
{
  private Rect a;
  private FloatingActionButton.a b;
  private boolean c;
  
  public FloatingActionButton$Behavior()
  {
    c = true;
  }
  
  public FloatingActionButton$Behavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.i.FloatingActionButton_Behavior_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = a.i.FloatingActionButton_Behavior_Layout_behavior_autoHide;
    boolean bool = ((TypedArray)localObject).getBoolean(i, true);
    c = bool;
    ((TypedArray)localObject).recycle();
  }
  
  private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
  {
    boolean bool = a(paramAppBarLayout, paramFloatingActionButton);
    if (!bool)
    {
      bool = false;
      localObject = null;
      return bool;
    }
    Object localObject = a;
    if (localObject == null)
    {
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      a = ((Rect)localObject);
    }
    localObject = a;
    t.a(paramCoordinatorLayout, paramAppBarLayout, (Rect)localObject);
    int i = bottom;
    int j = paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent();
    if (i <= j)
    {
      localObject = b;
      paramFloatingActionButton.b((FloatingActionButton.a)localObject);
    }
    for (;;)
    {
      i = 1;
      break;
      localObject = b;
      paramFloatingActionButton.a((FloatingActionButton.a)localObject);
    }
  }
  
  private boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
  {
    int i = 0;
    Object localObject1 = paramCoordinatorLayout.a(paramFloatingActionButton);
    int j = ((List)localObject1).size();
    int k = 0;
    Object localObject2;
    label77:
    int m;
    if (k < j)
    {
      localObject2 = (View)((List)localObject1).get(k);
      boolean bool1 = localObject2 instanceof AppBarLayout;
      if (bool1)
      {
        localObject2 = (AppBarLayout)localObject2;
        boolean bool3 = a(paramCoordinatorLayout, (AppBarLayout)localObject2, paramFloatingActionButton);
        if (!bool3) {
          break label257;
        }
      }
    }
    else
    {
      paramCoordinatorLayout.a(paramFloatingActionButton, paramInt);
      localObject1 = c;
      if (localObject1 != null)
      {
        int n = ((Rect)localObject1).centerX();
        if (n > 0)
        {
          n = ((Rect)localObject1).centerY();
          if (n > 0)
          {
            localObject2 = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
            k = paramFloatingActionButton.getRight();
            j = paramCoordinatorLayout.getWidth();
            m = rightMargin;
            j -= m;
            if (k < j) {
              break label270;
            }
            k = right;
          }
        }
      }
    }
    for (;;)
    {
      label167:
      j = paramFloatingActionButton.getBottom();
      m = paramCoordinatorLayout.getHeight();
      int i2 = bottomMargin;
      m -= i2;
      if (j >= m) {
        i = bottom;
      }
      for (;;)
      {
        if (i != 0) {
          w.e(paramFloatingActionButton, i);
        }
        if (k != 0) {
          w.f(paramFloatingActionButton, k);
        }
        return true;
        boolean bool2 = b((View)localObject2);
        if (bool2)
        {
          boolean bool4 = b((View)localObject2, paramFloatingActionButton);
          if (bool4) {
            break label77;
          }
        }
        label257:
        int i1 = k + 1;
        k = i1;
        break;
        label270:
        k = paramFloatingActionButton.getLeft();
        j = leftMargin;
        if (k > j) {
          break label336;
        }
        k = -left;
        break label167;
        j = paramFloatingActionButton.getTop();
        i1 = topMargin;
        if (j <= i1)
        {
          i1 = top;
          i = -i1;
        }
      }
      label336:
      k = 0;
    }
  }
  
  private boolean a(View paramView, FloatingActionButton paramFloatingActionButton)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
    boolean bool1 = c;
    boolean bool2;
    if (!bool1)
    {
      bool2 = false;
      locald = null;
    }
    for (;;)
    {
      return bool2;
      int j = f;
      int i = paramView.getId();
      if (j != i)
      {
        j = 0;
        locald = null;
      }
      else
      {
        j = paramFloatingActionButton.getUserSetVisibility();
        if (j != 0)
        {
          j = 0;
          locald = null;
        }
        else
        {
          j = 1;
        }
      }
    }
  }
  
  private static boolean b(View paramView)
  {
    Object localObject = paramView.getLayoutParams();
    boolean bool1 = localObject instanceof CoordinatorLayout.d;
    boolean bool2;
    if (bool1)
    {
      localObject = a;
      bool2 = localObject instanceof BottomSheetBehavior;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  private boolean b(View paramView, FloatingActionButton paramFloatingActionButton)
  {
    boolean bool = a(paramView, paramFloatingActionButton);
    if (!bool)
    {
      bool = false;
      localObject = null;
      return bool;
    }
    Object localObject = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
    int j = paramView.getTop();
    int k = paramFloatingActionButton.getHeight() / 2;
    int i = topMargin + k;
    if (j < i)
    {
      localObject = b;
      paramFloatingActionButton.b((FloatingActionButton.a)localObject);
    }
    for (;;)
    {
      i = 1;
      break;
      localObject = b;
      paramFloatingActionButton.a((FloatingActionButton.a)localObject);
    }
  }
  
  public final void a(CoordinatorLayout.d paramd)
  {
    int i = h;
    if (i == 0)
    {
      i = 80;
      h = i;
    }
  }
}


/* Location:              android/support/design/widget/FloatingActionButton$Behavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */