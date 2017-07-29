package android.support.a.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
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
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"NewApi"})
public final class c
  extends f
  implements b
{
  final Drawable.Callback a = new Drawable.Callback()
  {
    public final void invalidateDrawable(Drawable paramAnonymousDrawable)
    {
      invalidateSelf();
    }
    
    public final void scheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable, long paramAnonymousLong)
    {
      scheduleSelf(paramAnonymousRunnable, paramAnonymousLong);
    }
    
    public final void unscheduleDrawable(Drawable paramAnonymousDrawable, Runnable paramAnonymousRunnable)
    {
      unscheduleSelf(paramAnonymousRunnable);
    }
  };
  private a c;
  private Context d;
  private ArgbEvaluator e = null;
  private Animator.AnimatorListener f = null;
  private ArrayList<Object> g = null;
  
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
    d = paramContext;
    c = new a();
  }
  
  public static c a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramContext = new c(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }
  
  private void a(Animator paramAnimator)
  {
    Object localObject;
    if ((paramAnimator instanceof AnimatorSet))
    {
      localObject = ((AnimatorSet)paramAnimator).getChildAnimations();
      if (localObject != null)
      {
        int i = 0;
        while (i < ((List)localObject).size())
        {
          a((Animator)((List)localObject).get(i));
          i += 1;
        }
      }
    }
    if ((paramAnimator instanceof ObjectAnimator))
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      if (("fillColor".equals(localObject)) || ("strokeColor".equals(localObject)))
      {
        if (e == null) {
          e = new ArgbEvaluator();
        }
        paramAnimator.setEvaluator(e);
      }
    }
  }
  
  public final void applyTheme(Resources.Theme paramTheme)
  {
    if (b != null) {
      android.support.v4.d.a.a.a(b, paramTheme);
    }
  }
  
  public final boolean canApplyTheme()
  {
    if (b != null) {
      return android.support.v4.d.a.a.d(b);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (b != null) {
      b.draw(paramCanvas);
    }
    do
    {
      return;
      c.b.draw(paramCanvas);
    } while (!c.c.isStarted());
    invalidateSelf();
  }
  
  public final int getAlpha()
  {
    if (b != null) {
      return android.support.v4.d.a.a.c(b);
    }
    return c.b.getAlpha();
  }
  
  public final int getChangingConfigurations()
  {
    if (b != null) {
      return b.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | c.a;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (b != null) {
      return new b(b.getConstantState());
    }
    return null;
  }
  
  public final int getIntrinsicHeight()
  {
    if (b != null) {
      return b.getIntrinsicHeight();
    }
    return c.b.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth()
  {
    if (b != null) {
      return b.getIntrinsicWidth();
    }
    return c.b.getIntrinsicWidth();
  }
  
  public final int getOpacity()
  {
    if (b != null) {
      return b.getOpacity();
    }
    return c.b.getOpacity();
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (b != null)
    {
      android.support.v4.d.a.a.a(b, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    if ((i != 1) && ((paramXmlPullParser.getDepth() >= j + 1) || (i != 3)))
    {
      Object localObject1;
      Object localObject2;
      if (i == 2)
      {
        localObject1 = paramXmlPullParser.getName();
        if (!"animated-vector".equals(localObject1)) {
          break label182;
        }
        localObject1 = f.a(paramResources, paramTheme, paramAttributeSet, a.e);
        i = ((TypedArray)localObject1).getResourceId(0, 0);
        if (i != 0)
        {
          localObject2 = g.a(paramResources, i, paramTheme);
          d = false;
          ((g)localObject2).setCallback(a);
          if (c.b != null) {
            c.b.setCallback(null);
          }
          c.b = ((g)localObject2);
        }
        ((TypedArray)localObject1).recycle();
      }
      for (;;)
      {
        i = paramXmlPullParser.next();
        break;
        label182:
        if ("target".equals(localObject1))
        {
          localObject1 = paramResources.obtainAttributes(paramAttributeSet, a.f);
          localObject2 = ((TypedArray)localObject1).getString(0);
          i = ((TypedArray)localObject1).getResourceId(1, 0);
          if (i != 0)
          {
            if (d == null) {
              break label357;
            }
            Animator localAnimator = AnimatorInflater.loadAnimator(d, i);
            localAnimator.setTarget(c.b.c.b.h.get(localObject2));
            if (Build.VERSION.SDK_INT < 21) {
              a(localAnimator);
            }
            if (a.a(c) == null)
            {
              a.a(c, new ArrayList());
              c.e = new android.support.v4.g.a();
            }
            a.a(c).add(localAnimator);
            c.e.put(localAnimator, localObject2);
          }
          ((TypedArray)localObject1).recycle();
        }
      }
      label357:
      ((TypedArray)localObject1).recycle();
      throw new IllegalStateException("Context can't be null when inflating animators");
    }
    paramResources = c;
    if (c == null) {
      c = new AnimatorSet();
    }
    c.playTogether(d);
  }
  
  public final boolean isAutoMirrored()
  {
    if (b != null) {
      return android.support.v4.d.a.a.b(b);
    }
    return c.b.isAutoMirrored();
  }
  
  public final boolean isRunning()
  {
    if (b != null) {
      return ((AnimatedVectorDrawable)b).isRunning();
    }
    return c.c.isRunning();
  }
  
  public final boolean isStateful()
  {
    if (b != null) {
      return b.isStateful();
    }
    return c.b.isStateful();
  }
  
  public final Drawable mutate()
  {
    if (b != null) {
      b.mutate();
    }
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    if (b != null)
    {
      b.setBounds(paramRect);
      return;
    }
    c.b.setBounds(paramRect);
  }
  
  protected final boolean onLevelChange(int paramInt)
  {
    if (b != null) {
      return b.setLevel(paramInt);
    }
    return c.b.setLevel(paramInt);
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (b != null) {
      return b.setState(paramArrayOfInt);
    }
    return c.b.setState(paramArrayOfInt);
  }
  
  public final void setAlpha(int paramInt)
  {
    if (b != null)
    {
      b.setAlpha(paramInt);
      return;
    }
    c.b.setAlpha(paramInt);
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    if (b != null)
    {
      b.setAutoMirrored(paramBoolean);
      return;
    }
    c.b.setAutoMirrored(paramBoolean);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (b != null)
    {
      b.setColorFilter(paramColorFilter);
      return;
    }
    c.b.setColorFilter(paramColorFilter);
  }
  
  public final void setTint(int paramInt)
  {
    if (b != null)
    {
      android.support.v4.d.a.a.a(b, paramInt);
      return;
    }
    c.b.setTint(paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (b != null)
    {
      android.support.v4.d.a.a.a(b, paramColorStateList);
      return;
    }
    c.b.setTintList(paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (b != null)
    {
      android.support.v4.d.a.a.a(b, paramMode);
      return;
    }
    c.b.setTintMode(paramMode);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (b != null) {
      return b.setVisible(paramBoolean1, paramBoolean2);
    }
    c.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void start()
  {
    if (b != null) {
      ((AnimatedVectorDrawable)b).start();
    }
    while (c.c.isStarted()) {
      return;
    }
    c.c.start();
    invalidateSelf();
  }
  
  public final void stop()
  {
    if (b != null)
    {
      ((AnimatedVectorDrawable)b).stop();
      return;
    }
    c.c.end();
  }
  
  private static final class a
    extends Drawable.ConstantState
  {
    int a;
    g b;
    AnimatorSet c;
    ArrayList<Animator> d;
    android.support.v4.g.a<Animator, String> e;
    
    public final int getChangingConfigurations()
    {
      return a;
    }
    
    public final Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }
  
  private static final class b
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState a;
    
    public b(Drawable.ConstantState paramConstantState)
    {
      a = paramConstantState;
    }
    
    public final boolean canApplyTheme()
    {
      return a.canApplyTheme();
    }
    
    public final int getChangingConfigurations()
    {
      return a.getChangingConfigurations();
    }
    
    public final Drawable newDrawable()
    {
      c localc = new c();
      b = a.newDrawable();
      b.setCallback(a);
      return localc;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      c localc = new c();
      b = a.newDrawable(paramResources);
      b.setCallback(a);
      return localc;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      c localc = new c();
      b = a.newDrawable(paramResources, paramTheme);
      b.setCallback(a);
      return localc;
    }
  }
}


/* Location:              android/support/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */