package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.c;
import android.support.design.a.i;
import android.support.v4.c.a.a;
import android.support.v4.h.w;
import android.support.v7.widget.p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver;
import java.util.List;

@CoordinatorLayout.b(a=Behavior.class)
public final class FloatingActionButton
  extends z
{
  int a;
  boolean b;
  final Rect c;
  private ColorStateList d;
  private PorterDuff.Mode e;
  private int f;
  private int g;
  private int h;
  private final Rect i;
  private p j;
  private g k;
  
  private static int a(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    switch (m)
    {
    case 0: 
    default: 
      return paramInt1;
    case -2147483648: 
      return Math.min(paramInt1, paramInt2);
    }
    return paramInt2;
  }
  
  private g.a c(final a parama)
  {
    if (parama == null) {
      return null;
    }
    new g.a() {};
  }
  
  private g getImpl()
  {
    int m;
    Object localObject;
    if (k == null)
    {
      m = Build.VERSION.SDK_INT;
      if (m < 21) {
        break label47;
      }
      localObject = new h(this, new b(), x.a);
    }
    for (;;)
    {
      k = ((g)localObject);
      return k;
      label47:
      if (m >= 14) {
        localObject = new f(this, new b(), x.a);
      } else {
        localObject = new e(this, new b(), x.a);
      }
    }
  }
  
  final void a(a parama)
  {
    getImpl().b(c(parama));
  }
  
  final void b(a parama)
  {
    getImpl().a(c(parama));
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    getImpl().a(getDrawableState());
  }
  
  public final ColorStateList getBackgroundTintList()
  {
    return d;
  }
  
  public final PorterDuff.Mode getBackgroundTintMode()
  {
    return e;
  }
  
  public final float getCompatElevation()
  {
    return getImpl().a();
  }
  
  public final Drawable getContentBackground()
  {
    return getImplg;
  }
  
  public final int getRippleColor()
  {
    return f;
  }
  
  public final int getSize()
  {
    return g;
  }
  
  final int getSizeDimension()
  {
    int m = g;
    Resources localResources;
    for (;;)
    {
      localResources = getResources();
      switch (m)
      {
      case 0: 
      default: 
        return localResources.getDimensionPixelSize(a.c.design_fab_size_normal);
      case -1: 
        if (Math.max(a.b(localResources), a.a(localResources)) < 470) {
          m = 1;
        } else {
          m = 0;
        }
        break;
      }
    }
    return localResources.getDimensionPixelSize(a.c.design_fab_size_mini);
  }
  
  public final boolean getUseCompatPadding()
  {
    return b;
  }
  
  @TargetApi(11)
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    getImpl().b();
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    g localg = getImpl();
    if (localg.d())
    {
      if (q == null) {
        q = new g.1(localg);
      }
      n.getViewTreeObserver().addOnPreDrawListener(q);
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    g localg = getImpl();
    if (q != null)
    {
      n.getViewTreeObserver().removeOnPreDrawListener(q);
      q = null;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int m = getSizeDimension();
    a = ((m - h) / 2);
    getImpl().f();
    paramInt1 = Math.min(a(m, paramInt1), a(m, paramInt2));
    setMeasuredDimension(c.left + paramInt1 + c.right, paramInt1 + c.top + c.bottom);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      Rect localRect = i;
      if (w.F(this))
      {
        localRect.set(0, 0, getWidth(), getHeight());
        left += c.left;
        top += c.top;
        right -= c.right;
        bottom -= c.bottom;
      }
      for (int m = 1; (m != 0) && (!i.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())); m = 0) {
        return false;
      }
    }
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public final void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (d != paramColorStateList)
    {
      d = paramColorStateList;
      getImpl().a(paramColorStateList);
    }
  }
  
  public final void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (e != paramMode)
    {
      e = paramMode;
      getImpl().a(paramMode);
    }
  }
  
  public final void setCompatElevation(float paramFloat)
  {
    g localg = getImpl();
    if (h != paramFloat)
    {
      h = paramFloat;
      localg.a(paramFloat, i);
    }
  }
  
  public final void setImageResource(int paramInt)
  {
    j.a(paramInt);
  }
  
  public final void setRippleColor(int paramInt)
  {
    if (f != paramInt)
    {
      f = paramInt;
      getImpl().a(paramInt);
    }
  }
  
  public final void setSize(int paramInt)
  {
    if (paramInt != g)
    {
      g = paramInt;
      requestLayout();
    }
  }
  
  public final void setUseCompatPadding(boolean paramBoolean)
  {
    if (b != paramBoolean)
    {
      b = paramBoolean;
      getImpl().c();
    }
  }
  
  public static class Behavior
    extends CoordinatorLayout.a<FloatingActionButton>
  {
    private Rect a;
    private FloatingActionButton.a b;
    private boolean c;
    
    public Behavior()
    {
      c = true;
    }
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.FloatingActionButton_Behavior_Layout);
      c = paramContext.getBoolean(a.i.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
      paramContext.recycle();
    }
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
    {
      if (!a(paramAppBarLayout, paramFloatingActionButton)) {
        return false;
      }
      if (a == null) {
        a = new Rect();
      }
      Rect localRect = a;
      t.a(paramCoordinatorLayout, paramAppBarLayout, localRect);
      if (bottom <= paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        paramFloatingActionButton.b(b);
      }
      for (;;)
      {
        return true;
        paramFloatingActionButton.a(b);
      }
    }
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
    {
      int j = 0;
      Object localObject1 = paramCoordinatorLayout.a(paramFloatingActionButton);
      int k = ((List)localObject1).size();
      int i = 0;
      Object localObject2;
      if (i < k)
      {
        localObject2 = (View)((List)localObject1).get(i);
        if ((localObject2 instanceof AppBarLayout)) {
          if (!a(paramCoordinatorLayout, (AppBarLayout)localObject2, paramFloatingActionButton)) {
            break label194;
          }
        }
      }
      else
      {
        label65:
        paramCoordinatorLayout.a(paramFloatingActionButton, paramInt);
        localObject1 = c;
        if ((localObject1 != null) && (((Rect)localObject1).centerX() > 0) && (((Rect)localObject1).centerY() > 0))
        {
          localObject2 = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
          if (paramFloatingActionButton.getRight() < paramCoordinatorLayout.getWidth() - rightMargin) {
            break label203;
          }
          paramInt = right;
        }
      }
      for (;;)
      {
        label130:
        if (paramFloatingActionButton.getBottom() >= paramCoordinatorLayout.getHeight() - bottomMargin) {
          i = bottom;
        }
        for (;;)
        {
          if (i != 0) {
            w.e(paramFloatingActionButton, i);
          }
          if (paramInt != 0) {
            w.f(paramFloatingActionButton, paramInt);
          }
          return true;
          if ((b((View)localObject2)) && (b((View)localObject2, paramFloatingActionButton))) {
            break label65;
          }
          label194:
          i += 1;
          break;
          label203:
          if (paramFloatingActionButton.getLeft() > leftMargin) {
            break label252;
          }
          paramInt = -left;
          break label130;
          i = j;
          if (paramFloatingActionButton.getTop() <= topMargin) {
            i = -top;
          }
        }
        label252:
        paramInt = 0;
      }
    }
    
    private boolean a(View paramView, FloatingActionButton paramFloatingActionButton)
    {
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
      if (!c) {
        return false;
      }
      if (f != paramView.getId()) {
        return false;
      }
      return paramFloatingActionButton.getUserSetVisibility() == 0;
    }
    
    private static boolean b(View paramView)
    {
      paramView = paramView.getLayoutParams();
      if ((paramView instanceof CoordinatorLayout.d)) {
        return a instanceof BottomSheetBehavior;
      }
      return false;
    }
    
    private boolean b(View paramView, FloatingActionButton paramFloatingActionButton)
    {
      if (!a(paramView, paramFloatingActionButton)) {
        return false;
      }
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramFloatingActionButton.getLayoutParams();
      int i = paramView.getTop();
      int j = paramFloatingActionButton.getHeight() / 2;
      if (i < topMargin + j) {
        paramFloatingActionButton.b(b);
      }
      for (;;)
      {
        return true;
        paramFloatingActionButton.a(b);
      }
    }
    
    public final void a(CoordinatorLayout.d paramd)
    {
      if (h == 0) {
        h = 80;
      }
    }
  }
  
  public static abstract class a {}
  
  private final class b
    implements m
  {
    b() {}
    
    public final float a()
    {
      return getSizeDimension() / 2.0F;
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      c.set(paramInt1, paramInt2, paramInt3, paramInt4);
      setPadding(a + paramInt1, a + paramInt2, a + paramInt3, a + paramInt4);
    }
    
    public final void a(Drawable paramDrawable)
    {
      FloatingActionButton.a(FloatingActionButton.this, paramDrawable);
    }
    
    public final boolean b()
    {
      return b;
    }
  }
}


/* Location:              android/support/design/widget/FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */