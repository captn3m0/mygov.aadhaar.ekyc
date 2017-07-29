package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.a.a;
import android.support.design.a.g;
import android.support.design.a.i;
import android.support.v4.h.ae;
import android.support.v4.h.aj;
import android.support.v4.h.al;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

public abstract class b<B extends b<B>>
{
  static final Handler a = new Handler(Looper.getMainLooper(), new Handler.Callback()
  {
    public final boolean handleMessage(Message paramAnonymousMessage)
    {
      switch (what)
      {
      default: 
        return false;
      case 0: 
        paramAnonymousMessage = (b)obj;
        if (c.getParent() == null)
        {
          localObject = c.getLayoutParams();
          if ((localObject instanceof CoordinatorLayout.d))
          {
            localObject = (CoordinatorLayout.d)localObject;
            b.a locala = new b.a(paramAnonymousMessage);
            f = SwipeDismissBehavior.a(0.1F);
            g = SwipeDismissBehavior.a(0.6F);
            d = 0;
            c = new b.5(paramAnonymousMessage);
            ((CoordinatorLayout.d)localObject).a(locala);
            g = 80;
          }
          b.addView(c);
        }
        c.setOnAttachStateChangeListener(new b.6(paramAnonymousMessage));
        if (w.F(c)) {
          if (paramAnonymousMessage.e()) {
            paramAnonymousMessage.b();
          }
        }
        for (;;)
        {
          return true;
          paramAnonymousMessage.c();
          continue;
          c.setOnLayoutChangeListener(new b.7(paramAnonymousMessage));
        }
      }
      Object localObject = (b)obj;
      int i = arg1;
      if ((((b)localObject).e()) && (c.getVisibility() == 0)) {
        if (Build.VERSION.SDK_INT >= 14) {
          w.s(c).c(c.getHeight()).a(a.b).a(250L).a(new b.10((b)localObject, i)).b();
        }
      }
      for (;;)
      {
        return true;
        paramAnonymousMessage = AnimationUtils.loadAnimation(c.getContext(), a.a.design_snackbar_out);
        paramAnonymousMessage.setInterpolator(a.b);
        paramAnonymousMessage.setDuration(250L);
        paramAnonymousMessage.setAnimationListener(new b.2((b)localObject, i));
        c.startAnimation(paramAnonymousMessage);
        continue;
        ((b)localObject).d();
      }
    }
  });
  final ViewGroup b;
  final e c;
  int d;
  final n.a e = new n.a()
  {
    public final void a()
    {
      b.a.sendMessage(b.a.obtainMessage(0, b.this));
    }
    
    public final void a(int paramAnonymousInt)
    {
      b.a.sendMessage(b.a.obtainMessage(1, paramAnonymousInt, 0, b.this));
    }
  };
  private final Context f;
  private final b g;
  private List<Object<B>> h;
  private final AccessibilityManager i;
  
  protected b(ViewGroup paramViewGroup, View paramView, b paramb)
  {
    if (paramViewGroup == null) {
      throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }
    if (paramView == null) {
      throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }
    if (paramb == null) {
      throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }
    b = paramViewGroup;
    g = paramb;
    f = paramViewGroup.getContext();
    p.a(f);
    c = ((e)LayoutInflater.from(f).inflate(a.g.design_layout_snackbar, b, false));
    c.addView(paramView);
    w.k(c);
    w.c(c, 1);
    w.a(c, true);
    w.a(c, new s()
    {
      public final al a(View paramAnonymousView, al paramAnonymousal)
      {
        paramAnonymousView.setPadding(paramAnonymousView.getPaddingLeft(), paramAnonymousView.getPaddingTop(), paramAnonymousView.getPaddingRight(), paramAnonymousal.d());
        return paramAnonymousal;
      }
    });
    i = ((AccessibilityManager)f.getSystemService("accessibility"));
  }
  
  public final void a()
  {
    n localn = n.a();
    int j = d;
    n.a locala = e;
    for (;;)
    {
      synchronized (a)
      {
        if (localn.d(locala))
        {
          c.b = j;
          b.removeCallbacksAndMessages(c);
          localn.a(c);
          return;
        }
        if (localn.e(locala))
        {
          d.b = j;
          if ((c == null) || (!localn.a(c, 4))) {
            break;
          }
          return;
        }
      }
      d = new n.b(j, locala);
    }
    c = null;
    ((n)localObject2).b();
  }
  
  final void b()
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      w.b(c, c.getHeight());
      w.s(c).c(0.0F).a(a.b).a(250L).a(new aj()
      {
        public final void a(View paramAnonymousView)
        {
          b.a(b.this).a();
        }
        
        public final void b(View paramAnonymousView)
        {
          c();
        }
      }).b();
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(c.getContext(), a.a.design_snackbar_in);
    localAnimation.setInterpolator(a.b);
    localAnimation.setDuration(250L);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        c();
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
      
      public final void onAnimationStart(Animation paramAnonymousAnimation) {}
    });
    c.startAnimation(localAnimation);
  }
  
  final void c()
  {
    n localn = n.a();
    n.a locala = e;
    synchronized (a)
    {
      if (localn.d(locala)) {
        localn.a(c);
      }
      if (h != null)
      {
        int j = h.size() - 1;
        if (j >= 0)
        {
          h.get(j);
          j -= 1;
        }
      }
    }
  }
  
  final void d()
  {
    n localn = n.a();
    n.a locala = e;
    synchronized (a)
    {
      if (localn.d(locala))
      {
        c = null;
        if (d != null) {
          localn.b();
        }
      }
      if (h != null)
      {
        int j = h.size() - 1;
        if (j >= 0)
        {
          h.get(j);
          j -= 1;
        }
      }
    }
    if (Build.VERSION.SDK_INT < 11) {
      c.setVisibility(8);
    }
    ??? = c.getParent();
    if ((??? instanceof ViewGroup)) {
      ((ViewGroup)???).removeView(c);
    }
  }
  
  final boolean e()
  {
    return !i.isEnabled();
  }
  
  final class a
    extends SwipeDismissBehavior<b.e>
  {
    a() {}
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, b.e parame, MotionEvent paramMotionEvent)
    {
      switch (paramMotionEvent.getActionMasked())
      {
      }
      for (;;)
      {
        return super.a(paramCoordinatorLayout, parame, paramMotionEvent);
        if (paramCoordinatorLayout.a(parame, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
        {
          n.a().a(e);
          continue;
          n.a().b(e);
        }
      }
    }
    
    public final boolean b(View paramView)
    {
      return paramView instanceof b.e;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  static abstract interface c
  {
    public abstract void a();
  }
  
  static abstract interface d
  {
    public abstract void a();
  }
  
  static class e
    extends FrameLayout
  {
    private b.d a;
    private b.c b;
    
    e(Context paramContext)
    {
      this(paramContext, null);
    }
    
    e(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.SnackbarLayout);
      if (paramContext.hasValue(a.i.SnackbarLayout_elevation)) {
        w.d(this, paramContext.getDimensionPixelSize(a.i.SnackbarLayout_elevation, 0));
      }
      paramContext.recycle();
      setClickable(true);
    }
    
    protected void onAttachedToWindow()
    {
      super.onAttachedToWindow();
      w.w(this);
    }
    
    protected void onDetachedFromWindow()
    {
      super.onDetachedFromWindow();
      if (b != null) {
        b.a();
      }
    }
    
    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if (a != null) {
        a.a();
      }
    }
    
    void setOnAttachStateChangeListener(b.c paramc)
    {
      b = paramc;
    }
    
    void setOnLayoutChangeListener(b.d paramd)
    {
      a = paramd;
    }
  }
}


/* Location:              android/support/design/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */