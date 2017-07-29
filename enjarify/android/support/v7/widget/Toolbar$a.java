package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.a.a.a;
import android.support.v7.view.c;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.u;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import java.util.ArrayList;

final class Toolbar$a
  implements android.support.v7.view.menu.o
{
  h a;
  j b;
  
  Toolbar$a(Toolbar paramToolbar) {}
  
  public final void a(Context paramContext, h paramh)
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = b;
      if (localObject != null)
      {
        localObject = a;
        j localj = b;
        ((h)localObject).b(localj);
      }
    }
    a = paramh;
  }
  
  public final void a(Parcelable paramParcelable) {}
  
  public final void a(h paramh, boolean paramBoolean) {}
  
  public final void a(o.a parama) {}
  
  public final void a(boolean paramBoolean)
  {
    int i = 0;
    j localj1 = null;
    Object localObject = b;
    int j;
    int k;
    if (localObject != null)
    {
      localObject = a;
      if (localObject != null)
      {
        j = a.size();
        k = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      if (k < j)
      {
        MenuItem localMenuItem = a.getItem(k);
        j localj2 = b;
        if (localMenuItem == localj2) {
          i = 1;
        }
      }
      else
      {
        if (i == 0)
        {
          localj1 = b;
          b(localj1);
        }
        return;
      }
      k += 1;
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(j paramj)
  {
    int i = 8388611;
    boolean bool1 = true;
    int j = 2;
    Object localObject1 = c;
    Object localObject2 = f;
    View localView;
    if (localObject2 == null)
    {
      localObject2 = new android/support/v7/widget/o;
      localObject3 = ((Toolbar)localObject1).getContext();
      localView = null;
      int k = a.a.toolbarNavigationButtonStyle;
      ((o)localObject2).<init>((Context)localObject3, null, k);
      f = ((ImageButton)localObject2);
      localObject2 = f;
      localObject3 = d;
      ((ImageButton)localObject2).setImageDrawable((Drawable)localObject3);
      localObject2 = f;
      localObject3 = e;
      ((ImageButton)localObject2).setContentDescription((CharSequence)localObject3);
      localObject2 = new android/support/v7/widget/Toolbar$b;
      ((Toolbar.b)localObject2).<init>();
      int m = l & 0x70 | i;
      a = m;
      b = j;
      f.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject2 = f;
      localObject3 = new android/support/v7/widget/Toolbar$3;
      ((Toolbar.3)localObject3).<init>((Toolbar)localObject1);
      ((ImageButton)localObject2).setOnClickListener((View.OnClickListener)localObject3);
    }
    localObject1 = c.f.getParent();
    localObject2 = c;
    if (localObject1 != localObject2)
    {
      localObject1 = c;
      localObject2 = c.f;
      ((Toolbar)localObject1).addView((View)localObject2);
    }
    localObject1 = c;
    localObject2 = paramj.getActionView();
    g = ((View)localObject2);
    b = paramj;
    localObject1 = c.g.getParent();
    localObject2 = c;
    if (localObject1 != localObject2)
    {
      localObject1 = Toolbar.e();
      n = c.l & 0x70 | i;
      a = n;
      b = j;
      c.g.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = c;
      localObject2 = c.g;
      ((Toolbar)localObject1).addView((View)localObject2);
    }
    Object localObject3 = c;
    int i1 = ((Toolbar)localObject3).getChildCount() + -1;
    for (int n = i1; n >= 0; n = i1)
    {
      localView = ((Toolbar)localObject3).getChildAt(n);
      localObject1 = (Toolbar.b)localView.getLayoutParams();
      i1 = b;
      if (i1 != j)
      {
        localObject1 = a;
        if (localView != localObject1)
        {
          ((Toolbar)localObject3).removeViewAt(n);
          localObject1 = n;
          ((ArrayList)localObject1).add(localView);
        }
      }
      i1 = n + -1;
    }
    c.requestLayout();
    paramj.d(bool1);
    localObject1 = c.g;
    boolean bool2 = localObject1 instanceof c;
    if (bool2)
    {
      localObject1 = (c)c.g;
      ((c)localObject1).a();
    }
    return bool1;
  }
  
  public final boolean a(u paramu)
  {
    return false;
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final boolean b(j paramj)
  {
    Object localObject1 = c.g;
    boolean bool = localObject1 instanceof c;
    if (bool)
    {
      localObject1 = (c)c.g;
      ((c)localObject1).b();
    }
    localObject1 = c;
    Object localObject2 = c.g;
    ((Toolbar)localObject1).removeView((View)localObject2);
    localObject1 = c;
    localObject2 = c.f;
    ((Toolbar)localObject1).removeView((View)localObject2);
    c.g = null;
    Toolbar localToolbar = c;
    localObject1 = n;
    int i = ((ArrayList)localObject1).size() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject1 = (View)n.get(j);
      localToolbar.addView((View)localObject1);
      i = j + -1;
    }
    n.clear();
    b = null;
    c.requestLayout();
    paramj.d(false);
    return true;
  }
  
  public final Parcelable c()
  {
    return null;
  }
}


/* Location:              android/support/v7/widget/Toolbar$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */