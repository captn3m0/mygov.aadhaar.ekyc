package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;
import java.util.List;

final class ActivityChooserView$b
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  public final void onClick(View paramView)
  {
    Object localObject1 = a.c;
    Object localObject2;
    int j;
    if (paramView == localObject1)
    {
      a.a();
      localObject1 = a.a.a.b();
      int i = a.a.a.a((ResolveInfo)localObject1);
      localObject2 = a.a.a;
      localObject1 = ((e)localObject2).b(i);
      if (localObject1 != null)
      {
        j = 524288;
        ((Intent)localObject1).addFlags(j);
        localObject2 = a.getContext();
        ((Context)localObject2).startActivity((Intent)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject1 = a.b;
      if (paramView != localObject1) {
        break;
      }
      a.g = false;
      localObject1 = a;
      localObject2 = a;
      j = h;
      ((ActivityChooserView)localObject1).a(j);
    }
    localObject1 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public final void onDismiss()
  {
    Object localObject = a.f;
    if (localObject != null)
    {
      localObject = a.f;
      ((PopupWindow.OnDismissListener)localObject).onDismiss();
    }
    localObject = a.d;
    if (localObject != null)
    {
      localObject = a.d;
      ((android.support.v4.h.e)localObject).a(false);
    }
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject1 = (ActivityChooserView.a)paramAdapterView.getAdapter();
    int i = ((ActivityChooserView.a)localObject1).getItemViewType(paramInt);
    int j;
    float f1;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = a;
      j = -1 >>> 1;
      f1 = 0.0F / 0.0F;
      ((ActivityChooserView)localObject1).a(j);
    }
    do
    {
      return;
      a.a();
      localObject1 = a;
      bool = g;
      if (!bool) {
        break;
      }
    } while (paramInt <= 0);
    localObject1 = a.a;
    e locale = a;
    Object localObject5;
    for (;;)
    {
      synchronized (b)
      {
        locale.c();
        localObject1 = c;
        localObject1 = ((List)localObject1).get(paramInt);
        localObject1 = (e.a)localObject1;
        localObject5 = c;
        float f2 = 0.0F;
        ComponentName localComponentName = null;
        localObject5 = ((List)localObject5).get(0);
        localObject5 = (e.a)localObject5;
        if (localObject5 != null)
        {
          f1 = b;
          f2 = b;
          f1 -= f2;
          f2 = 5.0F;
          f1 += f2;
          localComponentName = new android/content/ComponentName;
          Object localObject6 = a;
          localObject6 = activityInfo;
          localObject6 = packageName;
          localObject1 = a;
          localObject1 = activityInfo;
          localObject1 = name;
          localComponentName.<init>((String)localObject6, (String)localObject1);
          localObject1 = new android/support/v7/widget/e$c;
          long l = System.currentTimeMillis();
          ((e.c)localObject1).<init>(localComponentName, l, f1);
          locale.a((e.c)localObject1);
        }
      }
      j = 1065353216;
      f1 = 1.0F;
    }
    Object localObject3 = a.a;
    boolean bool = b;
    if (bool) {}
    for (;;)
    {
      localObject3 = a.a.a.b(paramInt);
      if (localObject3 == null) {
        break;
      }
      j = 524288;
      f1 = 7.34684E-40F;
      ((Intent)localObject3).addFlags(j);
      localObject5 = a.getContext();
      ((Context)localObject5).startActivity((Intent)localObject3);
      break;
      paramInt += 1;
    }
  }
  
  public final boolean onLongClick(View paramView)
  {
    boolean bool = true;
    Object localObject = a.c;
    if (paramView == localObject)
    {
      localObject = a.a;
      int i = ((ActivityChooserView.a)localObject).getCount();
      if (i > 0)
      {
        a.g = bool;
        localObject = a;
        ActivityChooserView localActivityChooserView = a;
        int j = h;
        ((ActivityChooserView)localObject).a(j);
      }
      return bool;
    }
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>();
    throw ((Throwable)localObject);
  }
}


/* Location:              android/support/v7/widget/ActivityChooserView$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */