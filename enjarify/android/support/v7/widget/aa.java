package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.widget.TextView;

final class aa
  extends z
{
  private bd b;
  private bd c;
  
  aa(TextView paramTextView)
  {
    super(paramTextView);
  }
  
  final void a()
  {
    super.a();
    Object localObject1 = b;
    if (localObject1 == null)
    {
      localObject1 = c;
      if (localObject1 == null) {}
    }
    else
    {
      localObject1 = a.getCompoundDrawablesRelative();
      Object localObject2 = localObject1[0];
      bd localbd = b;
      a((Drawable)localObject2, localbd);
      int i = 2;
      localObject1 = localObject1[i];
      localObject2 = c;
      a((Drawable)localObject1, (bd)localObject2);
    }
  }
  
  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    Object localObject1 = a.getContext();
    m localm = m.a();
    Object localObject2 = a.j.AppCompatTextHelper;
    localObject2 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
    int i = a.j.AppCompatTextHelper_android_drawableStart;
    boolean bool1 = ((TypedArray)localObject2).hasValue(i);
    if (bool1)
    {
      j = a.j.AppCompatTextHelper_android_drawableStart;
      j = ((TypedArray)localObject2).getResourceId(j, 0);
      bd localbd = a((Context)localObject1, localm, j);
      b = localbd;
    }
    int j = a.j.AppCompatTextHelper_android_drawableEnd;
    boolean bool2 = ((TypedArray)localObject2).hasValue(j);
    if (bool2)
    {
      int k = a.j.AppCompatTextHelper_android_drawableEnd;
      k = ((TypedArray)localObject2).getResourceId(k, 0);
      localObject1 = a((Context)localObject1, localm, k);
      c = ((bd)localObject1);
    }
    ((TypedArray)localObject2).recycle();
  }
}


/* Location:              android/support/v7/widget/aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */