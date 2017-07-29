package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.a.b;
import android.support.design.a.f;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

final class y
{
  private static final int[] a;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843848;
    a = arrayOfInt;
  }
  
  static void a(View paramView)
  {
    ViewOutlineProvider localViewOutlineProvider = ViewOutlineProvider.BOUNDS;
    paramView.setOutlineProvider(localViewOutlineProvider);
  }
  
  static void a(View paramView, float paramFloat)
  {
    int i = 16842766;
    int j = 1;
    Object localObject1 = paramView.getResources();
    int k = a.f.app_bar_elevation_anim_duration;
    int m = ((Resources)localObject1).getInteger(k);
    StateListAnimator localStateListAnimator = new android/animation/StateListAnimator;
    localStateListAnimator.<init>();
    Object localObject2 = new int[3];
    localObject2[0] = i;
    int n = a.b.state_collapsible;
    localObject2[j] = n;
    int i1 = -a.b.state_collapsed;
    localObject2[2] = i1;
    float[] arrayOfFloat = new float[j];
    arrayOfFloat[0] = 0.0F;
    Object localObject3 = ObjectAnimator.ofFloat(paramView, "elevation", arrayOfFloat);
    long l = m;
    localObject3 = ((ObjectAnimator)localObject3).setDuration(l);
    localStateListAnimator.addState((int[])localObject2, (Animator)localObject3);
    localObject2 = new int[j];
    localObject2[0] = i;
    arrayOfFloat = new float[j];
    arrayOfFloat[0] = paramFloat;
    localObject3 = ObjectAnimator.ofFloat(paramView, "elevation", arrayOfFloat);
    l = m;
    localObject1 = ((ObjectAnimator)localObject3).setDuration(l);
    localStateListAnimator.addState((int[])localObject2, (Animator)localObject1);
    localObject1 = new int[0];
    localObject3 = new float[j];
    localObject3[0] = 0.0F;
    localObject2 = ObjectAnimator.ofFloat(paramView, "elevation", (float[])localObject3).setDuration(0L);
    localStateListAnimator.addState((int[])localObject1, (Animator)localObject2);
    paramView.setStateListAnimator(localStateListAnimator);
  }
  
  static void a(View paramView, AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = paramView.getContext();
    Object localObject3 = a;
    localObject3 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject3, 0, paramInt);
    boolean bool = false;
    try
    {
      bool = ((TypedArray)localObject3).hasValue(0);
      if (bool)
      {
        bool = false;
        int i = ((TypedArray)localObject3).getResourceId(0, 0);
        localObject1 = AnimatorInflater.loadStateListAnimator((Context)localObject1, i);
        paramView.setStateListAnimator((StateListAnimator)localObject1);
      }
      return;
    }
    finally
    {
      ((TypedArray)localObject3).recycle();
    }
  }
}


/* Location:              android/support/design/widget/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */