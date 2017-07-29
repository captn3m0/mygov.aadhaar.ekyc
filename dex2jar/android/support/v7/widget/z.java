package android.support.v7.widget;

import android.annotation.TargetApi;
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

@TargetApi(9)
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
    paramContext = paramm.b(paramContext, paramInt);
    if (paramContext != null)
    {
      paramm = new bd();
      d = true;
      a = paramContext;
      return paramm;
    }
    return null;
  }
  
  static z a(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return new aa(paramTextView);
    }
    return new z(paramTextView);
  }
  
  void a()
  {
    if ((b != null) || (c != null) || (d != null) || (e != null))
    {
      Drawable[] arrayOfDrawable = a.getCompoundDrawables();
      a(arrayOfDrawable[0], b);
      a(arrayOfDrawable[1], c);
      a(arrayOfDrawable[2], d);
      a(arrayOfDrawable[3], e);
    }
  }
  
  final void a(Context paramContext, int paramInt)
  {
    paramContext = bf.a(paramContext, paramInt, a.j.TextAppearance);
    if (paramContext.e(a.j.TextAppearance_textAllCaps)) {
      a(paramContext.a(a.j.TextAppearance_textAllCaps, false));
    }
    if ((Build.VERSION.SDK_INT < 23) && (paramContext.e(a.j.TextAppearance_android_textColor)))
    {
      ColorStateList localColorStateList = paramContext.d(a.j.TextAppearance_android_textColor);
      if (localColorStateList != null) {
        a.setTextColor(localColorStateList);
      }
    }
    a.recycle();
  }
  
  final void a(Drawable paramDrawable, bd parambd)
  {
    if ((paramDrawable != null) && (parambd != null)) {
      m.a(paramDrawable, parambd, a.getDrawableState());
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject3 = null;
    Object localObject2 = null;
    Object localObject4 = a.getContext();
    Object localObject1 = m.a();
    bf localbf = bf.a((Context)localObject4, paramAttributeSet, a.j.AppCompatTextHelper, paramInt, 0);
    int i = localbf.g(a.j.AppCompatTextHelper_android_textAppearance, -1);
    if (localbf.e(a.j.AppCompatTextHelper_android_drawableLeft)) {
      b = a((Context)localObject4, (m)localObject1, localbf.g(a.j.AppCompatTextHelper_android_drawableLeft, 0));
    }
    if (localbf.e(a.j.AppCompatTextHelper_android_drawableTop)) {
      c = a((Context)localObject4, (m)localObject1, localbf.g(a.j.AppCompatTextHelper_android_drawableTop, 0));
    }
    if (localbf.e(a.j.AppCompatTextHelper_android_drawableRight)) {
      d = a((Context)localObject4, (m)localObject1, localbf.g(a.j.AppCompatTextHelper_android_drawableRight, 0));
    }
    if (localbf.e(a.j.AppCompatTextHelper_android_drawableBottom)) {
      e = a((Context)localObject4, (m)localObject1, localbf.g(a.j.AppCompatTextHelper_android_drawableBottom, 0));
    }
    a.recycle();
    boolean bool3 = a.getTransformationMethod() instanceof PasswordTransformationMethod;
    boolean bool1;
    if (i != -1)
    {
      localbf = bf.a((Context)localObject4, i, a.j.TextAppearance);
      if ((!bool3) && (localbf.e(a.j.TextAppearance_textAllCaps)))
      {
        bool1 = localbf.a(a.j.TextAppearance_textAllCaps, false);
        i = 1;
        if (Build.VERSION.SDK_INT < 23) {
          if (localbf.e(a.j.TextAppearance_android_textColor))
          {
            localObject1 = localbf.d(a.j.TextAppearance_android_textColor);
            label261:
            localObject3 = localObject1;
            if (localbf.e(a.j.TextAppearance_android_textColorHint))
            {
              localObject2 = localbf.d(a.j.TextAppearance_android_textColorHint);
              localObject3 = localObject1;
            }
            label290:
            a.recycle();
            localObject1 = localObject3;
          }
        }
      }
    }
    for (;;)
    {
      localObject4 = bf.a((Context)localObject4, paramAttributeSet, a.j.TextAppearance, paramInt, 0);
      paramInt = i;
      boolean bool2 = bool1;
      if (!bool3)
      {
        paramInt = i;
        bool2 = bool1;
        if (((bf)localObject4).e(a.j.TextAppearance_textAllCaps))
        {
          bool2 = ((bf)localObject4).a(a.j.TextAppearance_textAllCaps, false);
          paramInt = 1;
        }
      }
      paramAttributeSet = (AttributeSet)localObject1;
      localObject3 = localObject2;
      if (Build.VERSION.SDK_INT < 23)
      {
        if (((bf)localObject4).e(a.j.TextAppearance_android_textColor)) {
          localObject1 = ((bf)localObject4).d(a.j.TextAppearance_android_textColor);
        }
        paramAttributeSet = (AttributeSet)localObject1;
        localObject3 = localObject2;
        if (((bf)localObject4).e(a.j.TextAppearance_android_textColorHint))
        {
          localObject3 = ((bf)localObject4).d(a.j.TextAppearance_android_textColorHint);
          paramAttributeSet = (AttributeSet)localObject1;
        }
      }
      a.recycle();
      if (paramAttributeSet != null) {
        a.setTextColor(paramAttributeSet);
      }
      if (localObject3 != null) {
        a.setHintTextColor((ColorStateList)localObject3);
      }
      if ((!bool3) && (paramInt != 0)) {
        a(bool2);
      }
      return;
      localObject1 = null;
      break label261;
      localObject3 = null;
      break label290;
      i = 0;
      bool1 = false;
      break;
      localObject1 = null;
      i = 0;
      bool1 = false;
      localObject2 = localObject3;
    }
  }
  
  final void a(boolean paramBoolean)
  {
    TextView localTextView = a;
    if (paramBoolean) {}
    for (a locala = new a(a.getContext());; locala = null)
    {
      localTextView.setTransformationMethod(locala);
      return;
    }
  }
}


/* Location:              android/support/v7/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */