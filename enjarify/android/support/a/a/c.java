package android.support.a.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class c
  extends f
  implements b
{
  final Drawable.Callback a;
  private c.a c;
  private Context d;
  private ArgbEvaluator e = null;
  private Animator.AnimatorListener f = null;
  private ArrayList g = null;
  
  c()
  {
    this(null, (byte)0);
  }
  
  private c(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  private c(Context paramContext, byte paramByte)
  {
    Object localObject = new android/support/a/a/c$1;
    ((c.1)localObject).<init>(this);
    a = ((Drawable.Callback)localObject);
    d = paramContext;
    localObject = new android/support/a/a/c$a;
    ((c.a)localObject).<init>();
    c = ((c.a)localObject);
  }
  
  public static c a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    c localc = new android/support/a/a/c;
    localc.<init>(paramContext);
    localc.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localc;
  }
  
  private void a(Animator paramAnimator)
  {
    boolean bool1 = paramAnimator instanceof AnimatorSet;
    Object localObject;
    String str;
    if (bool1)
    {
      localObject = paramAnimator;
      localObject = (AnimatorSet)paramAnimator;
      ArrayList localArrayList = ((AnimatorSet)localObject).getChildAnimations();
      if (localArrayList != null)
      {
        bool1 = false;
        localObject = null;
        int j = 0;
        str = null;
        for (;;)
        {
          int i = localArrayList.size();
          if (j >= i) {
            break;
          }
          localObject = (Animator)localArrayList.get(j);
          a((Animator)localObject);
          i = j + 1;
          j = i;
        }
      }
    }
    boolean bool2 = paramAnimator instanceof ObjectAnimator;
    if (bool2)
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      str = "fillColor";
      boolean bool3 = str.equals(localObject);
      if (!bool3)
      {
        str = "strokeColor";
        bool2 = str.equals(localObject);
        if (!bool2) {}
      }
      else
      {
        localObject = e;
        if (localObject == null)
        {
          localObject = new android/animation/ArgbEvaluator;
          ((ArgbEvaluator)localObject).<init>();
          e = ((ArgbEvaluator)localObject);
        }
        localObject = e;
        paramAnimator.setEvaluator((TypeEvaluator)localObject);
      }
    }
  }
  
  public final void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      android.support.v4.d.a.a.a(localDrawable, paramTheme);
    }
  }
  
  public final boolean canApplyTheme()
  {
    Drawable localDrawable = b;
    boolean bool;
    if (localDrawable != null)
    {
      localDrawable = b;
      bool = android.support.v4.d.a.a.d(localDrawable);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((Drawable)localObject).draw(paramCanvas);
    }
    for (;;)
    {
      return;
      c.b.draw(paramCanvas);
      localObject = c.c;
      boolean bool = ((AnimatorSet)localObject).isStarted();
      if (bool) {
        invalidateSelf();
      }
    }
  }
  
  public final int getAlpha()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (int i = android.support.v4.d.a.a.c((Drawable)localObject);; i = ((g)localObject).getAlpha())
    {
      return i;
      localObject = c.b;
    }
  }
  
  public final int getChangingConfigurations()
  {
    Drawable localDrawable = b;
    int i;
    if (localDrawable != null)
    {
      localDrawable = b;
      i = localDrawable.getChangingConfigurations();
    }
    for (;;)
    {
      return i;
      i = super.getChangingConfigurations();
      c.a locala = c;
      int j = a;
      i |= j;
    }
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = new android/support/a/a/c$b;
      Drawable.ConstantState localConstantState = b.getConstantState();
      ((c.b)localObject).<init>(localConstantState);
    }
    for (;;)
    {
      return (Drawable.ConstantState)localObject;
      localObject = null;
    }
  }
  
  public final int getIntrinsicHeight()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (int i = ((Drawable)localObject).getIntrinsicHeight();; i = ((g)localObject).getIntrinsicHeight())
    {
      return i;
      localObject = c.b;
    }
  }
  
  public final int getIntrinsicWidth()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (int i = ((Drawable)localObject).getIntrinsicWidth();; i = ((g)localObject).getIntrinsicWidth())
    {
      return i;
      localObject = c.b;
    }
  }
  
  public final int getOpacity()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (int i = ((Drawable)localObject).getOpacity();; i = ((g)localObject).getOpacity())
    {
      return i;
      localObject = c.b;
    }
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = 1;
    Object localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      android.support.v4.d.a.a.a((Drawable)localObject1, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    for (;;)
    {
      return;
      int j = paramXmlPullParser.getEventType();
      int k = paramXmlPullParser.getDepth() + 1;
      if (j != i)
      {
        int m = paramXmlPullParser.getDepth();
        if (m < k)
        {
          m = 3;
          if (j == m) {}
        }
        else
        {
          m = 2;
          Object localObject2;
          Object localObject3;
          int i1;
          Object localObject4;
          if (j == m)
          {
            localObject1 = paramXmlPullParser.getName();
            localObject2 = "animated-vector";
            boolean bool2 = ((String)localObject2).equals(localObject1);
            if (!bool2) {
              break label240;
            }
            localObject1 = a.e;
            localObject1 = f.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject1);
            int n = ((TypedArray)localObject1).getResourceId(0, 0);
            if (n != 0)
            {
              localObject2 = g.a(paramResources, n, paramTheme);
              d = false;
              localObject3 = a;
              ((g)localObject2).setCallback((Drawable.Callback)localObject3);
              localObject3 = c.b;
              if (localObject3 != null)
              {
                localObject3 = c.b;
                i1 = 0;
                localObject4 = null;
                ((g)localObject3).setCallback(null);
              }
              localObject3 = c;
              b = ((g)localObject2);
            }
            ((TypedArray)localObject1).recycle();
          }
          for (;;)
          {
            j = paramXmlPullParser.next();
            break;
            label240:
            localObject2 = "target";
            boolean bool1 = ((String)localObject2).equals(localObject1);
            if (bool1)
            {
              localObject1 = a.f;
              localObject1 = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject1);
              localObject2 = ((TypedArray)localObject1).getString(0);
              int i2 = ((TypedArray)localObject1).getResourceId(i, 0);
              if (i2 != 0)
              {
                localObject4 = d;
                if (localObject4 == null) {
                  break label470;
                }
                localObject3 = AnimatorInflater.loadAnimator(d, i2);
                localObject4 = c.b.c.b.h.get(localObject2);
                ((Animator)localObject3).setTarget(localObject4);
                i1 = Build.VERSION.SDK_INT;
                int i3 = 21;
                if (i1 < i3) {
                  a((Animator)localObject3);
                }
                localObject4 = c.a.a(c);
                if (localObject4 == null)
                {
                  localObject4 = c;
                  Object localObject5 = new java/util/ArrayList;
                  ((ArrayList)localObject5).<init>();
                  c.a.a((c.a)localObject4, (ArrayList)localObject5);
                  localObject4 = c;
                  localObject5 = new android/support/v4/g/a;
                  ((android.support.v4.g.a)localObject5).<init>();
                  e = ((android.support.v4.g.a)localObject5);
                }
                c.a.a(c).add(localObject3);
                localObject4 = c.e;
                ((android.support.v4.g.a)localObject4).put(localObject3, localObject2);
              }
              ((TypedArray)localObject1).recycle();
            }
          }
          label470:
          ((TypedArray)localObject1).recycle();
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("Context can't be null when inflating animators");
          throw ((Throwable)localObject1);
        }
      }
      localObject1 = c;
      AnimatorSet localAnimatorSet = c;
      if (localAnimatorSet == null)
      {
        localAnimatorSet = new android/animation/AnimatorSet;
        localAnimatorSet.<init>();
        c = localAnimatorSet;
      }
      localAnimatorSet = c;
      localObject1 = d;
      localAnimatorSet.playTogether((Collection)localObject1);
    }
  }
  
  public final boolean isAutoMirrored()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (boolean bool = android.support.v4.d.a.a.b((Drawable)localObject);; bool = ((g)localObject).isAutoMirrored())
    {
      return bool;
      localObject = c.b;
    }
  }
  
  public final boolean isRunning()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = (AnimatedVectorDrawable)b;
    }
    for (boolean bool = ((AnimatedVectorDrawable)localObject).isRunning();; bool = ((AnimatorSet)localObject).isRunning())
    {
      return bool;
      localObject = c.c;
    }
  }
  
  public final boolean isStateful()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (boolean bool = ((Drawable)localObject).isStateful();; bool = ((g)localObject).isStateful())
    {
      return bool;
      localObject = c.b;
    }
  }
  
  public final Drawable mutate()
  {
    Drawable localDrawable = b;
    if (localDrawable != null)
    {
      localDrawable = b;
      localDrawable.mutate();
    }
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((Drawable)localObject).setBounds(paramRect);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      ((g)localObject).setBounds(paramRect);
    }
  }
  
  protected final boolean onLevelChange(int paramInt)
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (boolean bool = ((Drawable)localObject).setLevel(paramInt);; bool = ((g)localObject).setLevel(paramInt))
    {
      return bool;
      localObject = c.b;
    }
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (boolean bool = ((Drawable)localObject).setState(paramArrayOfInt);; bool = ((g)localObject).setState(paramArrayOfInt))
    {
      return bool;
      localObject = c.b;
    }
  }
  
  public final void setAlpha(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((Drawable)localObject).setAlpha(paramInt);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      ((g)localObject).setAlpha(paramInt);
    }
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((Drawable)localObject).setAutoMirrored(paramBoolean);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      ((g)localObject).setAutoMirrored(paramBoolean);
    }
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      ((Drawable)localObject).setColorFilter(paramColorFilter);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      ((g)localObject).setColorFilter(paramColorFilter);
    }
  }
  
  public final void setTint(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      android.support.v4.d.a.a.a((Drawable)localObject, paramInt);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      ((g)localObject).setTint(paramInt);
    }
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      android.support.v4.d.a.a.a((Drawable)localObject, paramColorStateList);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      ((g)localObject).setTintList(paramColorStateList);
    }
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      android.support.v4.d.a.a.a((Drawable)localObject, paramMode);
    }
    for (;;)
    {
      return;
      localObject = c.b;
      ((g)localObject).setTintMode(paramMode);
    }
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = b;
    }
    for (boolean bool = ((Drawable)localObject).setVisible(paramBoolean1, paramBoolean2);; bool = super.setVisible(paramBoolean1, paramBoolean2))
    {
      return bool;
      localObject = c.b;
      ((g)localObject).setVisible(paramBoolean1, paramBoolean2);
    }
  }
  
  public final void start()
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = (AnimatedVectorDrawable)b;
      ((AnimatedVectorDrawable)localObject).start();
    }
    for (;;)
    {
      return;
      localObject = c.c;
      boolean bool = ((AnimatorSet)localObject).isStarted();
      if (!bool)
      {
        localObject = c.c;
        ((AnimatorSet)localObject).start();
        invalidateSelf();
      }
    }
  }
  
  public final void stop()
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = (AnimatedVectorDrawable)b;
      ((AnimatedVectorDrawable)localObject).stop();
    }
    for (;;)
    {
      return;
      localObject = c.c;
      ((AnimatorSet)localObject).end();
    }
  }
}


/* Location:              android/support/a/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */