package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.j;
import android.support.v7.e.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class z
{
  final TextView a;
  private bd b;
  private bd c;
  private bd d;
  private bd e;
  
  z(TextView paramTextView)
  {
    a = paramTextView;
  }
  
  protected static bd a(Context paramContext, m paramm, int paramInt)
  {
    ColorStateList localColorStateList = paramm.b(paramContext, paramInt);
    bd localbd;
    if (localColorStateList != null)
    {
      localbd = new android/support/v7/widget/bd;
      localbd.<init>();
      boolean bool = true;
      d = bool;
      a = localColorStateList;
    }
    for (;;)
    {
      return localbd;
      localbd = null;
    }
  }
  
  static z a(TextView paramTextView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v7/widget/aa;
      ((aa)localObject).<init>(paramTextView);
    }
    for (;;)
    {
      return (z)localObject;
      localObject = new android/support/v7/widget/z;
      ((z)localObject).<init>(paramTextView);
    }
  }
  
  void a()
  {
    Object localObject1 = b;
    if (localObject1 == null)
    {
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = d;
        if (localObject1 == null)
        {
          localObject1 = e;
          if (localObject1 == null) {
            return;
          }
        }
      }
    }
    localObject1 = a.getCompoundDrawables();
    Object localObject2 = localObject1[0];
    bd localbd = b;
    a((Drawable)localObject2, localbd);
    localObject2 = localObject1[1];
    localbd = c;
    a((Drawable)localObject2, localbd);
    localObject2 = localObject1[2];
    localbd = d;
    a((Drawable)localObject2, localbd);
    int i = 3;
    localObject1 = localObject1[i];
    localObject2 = e;
    a((Drawable)localObject1, (bd)localObject2);
  }
  
  final void a(Context paramContext, int paramInt)
  {
    Object localObject = a.j.TextAppearance;
    localObject = bf.a(paramContext, paramInt, (int[])localObject);
    int i = a.j.TextAppearance_textAllCaps;
    boolean bool1 = ((bf)localObject).e(i);
    TextView localTextView;
    if (bool1)
    {
      int j = a.j.TextAppearance_textAllCaps;
      n = 0;
      localTextView = null;
      boolean bool2 = ((bf)localObject).a(j, false);
      a(bool2);
    }
    int k = Build.VERSION.SDK_INT;
    int n = 23;
    if (k < n)
    {
      k = a.j.TextAppearance_android_textColor;
      boolean bool3 = ((bf)localObject).e(k);
      if (bool3)
      {
        int m = a.j.TextAppearance_android_textColor;
        ColorStateList localColorStateList = ((bf)localObject).d(m);
        if (localColorStateList != null)
        {
          localTextView = a;
          localTextView.setTextColor(localColorStateList);
        }
      }
    }
    a.recycle();
  }
  
  final void a(Drawable paramDrawable, bd parambd)
  {
    if ((paramDrawable != null) && (parambd != null))
    {
      int[] arrayOfInt = a.getDrawableState();
      m.a(paramDrawable, parambd, arrayOfInt);
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    int i = 0;
    ColorStateList localColorStateList1 = null;
    int j = 23;
    int k = 1;
    int i1 = -1;
    Object localObject1 = a.getContext();
    Object localObject2 = m.a();
    Object localObject3 = a.j.AppCompatTextHelper;
    localObject3 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject3, paramInt, 0);
    int i2 = a.j.AppCompatTextHelper_android_textAppearance;
    i2 = ((bf)localObject3).g(i2, i1);
    int i4 = a.j.AppCompatTextHelper_android_drawableLeft;
    boolean bool5 = ((bf)localObject3).e(i4);
    bd localbd;
    if (bool5)
    {
      i5 = a.j.AppCompatTextHelper_android_drawableLeft;
      i5 = ((bf)localObject3).g(i5, 0);
      localbd = a((Context)localObject1, (m)localObject2, i5);
      b = localbd;
    }
    int i5 = a.j.AppCompatTextHelper_android_drawableTop;
    boolean bool6 = ((bf)localObject3).e(i5);
    if (bool6)
    {
      i6 = a.j.AppCompatTextHelper_android_drawableTop;
      i6 = ((bf)localObject3).g(i6, 0);
      localbd = a((Context)localObject1, (m)localObject2, i6);
      c = localbd;
    }
    int i6 = a.j.AppCompatTextHelper_android_drawableRight;
    boolean bool7 = ((bf)localObject3).e(i6);
    if (bool7)
    {
      i7 = a.j.AppCompatTextHelper_android_drawableRight;
      i7 = ((bf)localObject3).g(i7, 0);
      localbd = a((Context)localObject1, (m)localObject2, i7);
      d = localbd;
    }
    int i7 = a.j.AppCompatTextHelper_android_drawableBottom;
    boolean bool8 = ((bf)localObject3).e(i7);
    if (bool8)
    {
      int i8 = a.j.AppCompatTextHelper_android_drawableBottom;
      i8 = ((bf)localObject3).g(i8, 0);
      localObject2 = a((Context)localObject1, (m)localObject2, i8);
      e = ((bd)localObject2);
    }
    a.recycle();
    localObject2 = a.getTransformationMethod();
    boolean bool9 = localObject2 instanceof PasswordTransformationMethod;
    Object localObject4;
    int i10;
    boolean bool11;
    int i3;
    ColorStateList localColorStateList2;
    if (i2 != i1)
    {
      localObject2 = a.j.TextAppearance;
      localObject4 = bf.a((Context)localObject1, i2, (int[])localObject2);
      if (!bool9)
      {
        int i9 = a.j.TextAppearance_textAllCaps;
        boolean bool10 = ((bf)localObject4).e(i9);
        if (bool10)
        {
          i10 = a.j.TextAppearance_textAllCaps;
          bool11 = ((bf)localObject4).a(i10, false);
          i10 = k;
          i2 = Build.VERSION.SDK_INT;
          if (i2 < j)
          {
            i2 = a.j.TextAppearance_android_textColor;
            boolean bool4 = ((bf)localObject4).e(i2);
            if (bool4)
            {
              i3 = a.j.TextAppearance_android_textColor;
              localColorStateList2 = ((bf)localObject4).d(i3);
              label401:
              int i11 = a.j.TextAppearance_android_textColorHint;
              boolean bool12 = ((bf)localObject4).e(i11);
              if (bool12)
              {
                i = a.j.TextAppearance_android_textColorHint;
                localColorStateList1 = ((bf)localObject4).d(i);
              }
              label432:
              localObject4 = a;
              ((TypedArray)localObject4).recycle();
            }
          }
        }
      }
    }
    for (;;)
    {
      localObject4 = a.j.TextAppearance;
      localObject1 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject4, paramInt, 0);
      if (!bool9)
      {
        i1 = a.j.TextAppearance_textAllCaps;
        boolean bool3 = ((bf)localObject1).e(i1);
        if (bool3)
        {
          i10 = a.j.TextAppearance_textAllCaps;
          bool11 = ((bf)localObject1).a(i10, false);
          i10 = k;
        }
      }
      k = Build.VERSION.SDK_INT;
      if (k < j)
      {
        k = a.j.TextAppearance_android_textColor;
        boolean bool1 = ((bf)localObject1).e(k);
        if (bool1)
        {
          m = a.j.TextAppearance_android_textColor;
          localColorStateList2 = ((bf)localObject1).d(m);
        }
        int m = a.j.TextAppearance_android_textColorHint;
        boolean bool2 = ((bf)localObject1).e(m);
        if (bool2)
        {
          int n = a.j.TextAppearance_android_textColorHint;
          localColorStateList1 = ((bf)localObject1).d(n);
        }
      }
      Object localObject5 = a;
      ((TypedArray)localObject5).recycle();
      if (localColorStateList2 != null)
      {
        localObject5 = a;
        ((TextView)localObject5).setTextColor(localColorStateList2);
      }
      if (localColorStateList1 != null)
      {
        localObject5 = a;
        ((TextView)localObject5).setHintTextColor(localColorStateList1);
      }
      if ((!bool9) && (i10 != 0)) {
        a(bool11);
      }
      return;
      i3 = 0;
      localColorStateList2 = null;
      break label401;
      i3 = 0;
      localColorStateList2 = null;
      break label432;
      i10 = 0;
      localObject2 = null;
      bool11 = false;
      localObject3 = null;
      break;
      i3 = 0;
      localColorStateList2 = null;
      i10 = 0;
      localObject2 = null;
      bool11 = false;
      localObject3 = null;
    }
  }
  
  final void a(boolean paramBoolean)
  {
    TextView localTextView = a;
    a locala;
    if (paramBoolean)
    {
      locala = new android/support/v7/e/a;
      Context localContext = a.getContext();
      locala.<init>(localContext);
    }
    for (;;)
    {
      localTextView.setTransformationMethod(locala);
      return;
      locala = null;
    }
  }
}


/* Location:              android/support/v7/widget/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */