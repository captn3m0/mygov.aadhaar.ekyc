package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.a.i;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class CoordinatorLayout$d
  extends ViewGroup.MarginLayoutParams
{
  CoordinatorLayout.a a;
  boolean b = false;
  public int c = 0;
  public int d = 0;
  public int e;
  int f;
  public int g;
  public int h;
  int i;
  int j;
  View k;
  View l;
  boolean m;
  boolean n;
  boolean o;
  final Rect p;
  Object q;
  
  public CoordinatorLayout$d()
  {
    super(i2, i2);
    e = i1;
    f = i1;
    g = 0;
    h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    p = localRect;
  }
  
  CoordinatorLayout$d(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e = i1;
    f = i1;
    g = 0;
    h = 0;
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    p = ((Rect)localObject1);
    localObject1 = a.i.CoordinatorLayout_Layout;
    localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1);
    int i2 = a.i.CoordinatorLayout_Layout_android_layout_gravity;
    i2 = ((TypedArray)localObject1).getInteger(i2, 0);
    c = i2;
    i2 = a.i.CoordinatorLayout_Layout_layout_anchor;
    i2 = ((TypedArray)localObject1).getResourceId(i2, i1);
    f = i2;
    i2 = a.i.CoordinatorLayout_Layout_layout_anchorGravity;
    i2 = ((TypedArray)localObject1).getInteger(i2, 0);
    d = i2;
    i2 = a.i.CoordinatorLayout_Layout_layout_keyline;
    i2 = ((TypedArray)localObject1).getInteger(i2, i1);
    e = i2;
    i2 = a.i.CoordinatorLayout_Layout_layout_insetEdge;
    i2 = ((TypedArray)localObject1).getInt(i2, 0);
    g = i2;
    i2 = a.i.CoordinatorLayout_Layout_layout_dodgeInsetEdges;
    i2 = ((TypedArray)localObject1).getInt(i2, 0);
    h = i2;
    i2 = a.i.CoordinatorLayout_Layout_layout_behavior;
    boolean bool = ((TypedArray)localObject1).hasValue(i2);
    b = bool;
    bool = b;
    if (bool)
    {
      int i3 = a.i.CoordinatorLayout_Layout_layout_behavior;
      Object localObject2 = ((TypedArray)localObject1).getString(i3);
      localObject2 = CoordinatorLayout.a(paramContext, paramAttributeSet, (String)localObject2);
      a = ((CoordinatorLayout.a)localObject2);
    }
    ((TypedArray)localObject1).recycle();
    localObject1 = a;
    if (localObject1 != null)
    {
      localObject1 = a;
      ((CoordinatorLayout.a)localObject1).a(this);
    }
  }
  
  public CoordinatorLayout$d(d paramd)
  {
    super(paramd);
    e = i1;
    f = i1;
    g = 0;
    h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    p = localRect;
  }
  
  public CoordinatorLayout$d(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    e = i1;
    f = i1;
    g = 0;
    h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    p = localRect;
  }
  
  public CoordinatorLayout$d(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    e = i1;
    f = i1;
    g = 0;
    h = 0;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    p = localRect;
  }
  
  public final void a(CoordinatorLayout.a parama)
  {
    CoordinatorLayout.a locala = a;
    if (locala != parama)
    {
      a = parama;
      locala = null;
      q = null;
      boolean bool = true;
      b = bool;
      if (parama != null) {
        parama.a(this);
      }
    }
  }
}


/* Location:              android/support/design/widget/CoordinatorLayout$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */