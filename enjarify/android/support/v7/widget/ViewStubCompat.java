package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  private int a = 0;
  private int b;
  private WeakReference c;
  private LayoutInflater d;
  private ViewStubCompat.a e;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = a.j.ViewStubCompat;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, 0);
    int j = a.j.ViewStubCompat_android_inflatedId;
    j = ((TypedArray)localObject).getResourceId(j, i);
    b = j;
    j = a.j.ViewStubCompat_android_layout;
    j = ((TypedArray)localObject).getResourceId(j, 0);
    a = j;
    j = a.j.ViewStubCompat_android_id;
    j = ((TypedArray)localObject).getResourceId(j, i);
    setId(j);
    ((TypedArray)localObject).recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public final View a()
  {
    Object localObject1 = getParent();
    if (localObject1 != null)
    {
      boolean bool = localObject1 instanceof ViewGroup;
      if (bool)
      {
        int i = a;
        if (i != 0)
        {
          localObject1 = (ViewGroup)localObject1;
          Object localObject2 = d;
          int j;
          if (localObject2 != null)
          {
            localObject2 = d;
            j = a;
            ViewGroup.LayoutParams localLayoutParams = null;
            localObject2 = ((LayoutInflater)localObject2).inflate(j, (ViewGroup)localObject1, false);
            j = b;
            int k = -1;
            if (j != k)
            {
              j = b;
              ((View)localObject2).setId(j);
            }
            j = ((ViewGroup)localObject1).indexOfChild(this);
            ((ViewGroup)localObject1).removeViewInLayout(this);
            localLayoutParams = getLayoutParams();
            if (localLayoutParams == null) {
              break label151;
            }
            ((ViewGroup)localObject1).addView((View)localObject2, j, localLayoutParams);
          }
          for (;;)
          {
            localObject1 = new java/lang/ref/WeakReference;
            ((WeakReference)localObject1).<init>(localObject2);
            c = ((WeakReference)localObject1);
            return (View)localObject2;
            localObject2 = LayoutInflater.from(getContext());
            break;
            label151:
            ((ViewGroup)localObject1).addView((View)localObject2, j);
          }
        }
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("ViewStub must have a valid layoutResource");
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("ViewStub must have a non-null ViewGroup viewParent");
    throw ((Throwable)localObject1);
  }
  
  protected final void dispatchDraw(Canvas paramCanvas) {}
  
  public final void draw(Canvas paramCanvas) {}
  
  public final int getInflatedId()
  {
    return b;
  }
  
  public final LayoutInflater getLayoutInflater()
  {
    return d;
  }
  
  public final int getLayoutResource()
  {
    return a;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public final void setInflatedId(int paramInt)
  {
    b = paramInt;
  }
  
  public final void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    d = paramLayoutInflater;
  }
  
  public final void setLayoutResource(int paramInt)
  {
    a = paramInt;
  }
  
  public final void setOnInflateListener(ViewStubCompat.a parama)
  {
    e = parama;
  }
  
  public final void setVisibility(int paramInt)
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = (View)c.get();
      if (localObject != null) {
        ((View)localObject).setVisibility(paramInt);
      }
    }
    for (;;)
    {
      return;
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("setVisibility called on un-referenced view");
      throw ((Throwable)localObject);
      super.setVisibility(paramInt);
      if (paramInt != 0)
      {
        int i = 4;
        if (paramInt != i) {}
      }
      else
      {
        a();
      }
    }
  }
}


/* Location:              android/support/v7/widget/ViewStubCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */