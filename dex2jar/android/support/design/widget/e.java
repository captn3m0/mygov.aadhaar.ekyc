package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.util.StateSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

class e
  extends g
{
  l a;
  private final o r = new o();
  
  e(z paramz, m paramm, q.d paramd)
  {
    super(paramz, paramm, paramd);
    r.a(j, a(new b()));
    r.a(k, a(new b()));
    r.a(l, a(new c()));
    r.a(m, a(new a()));
  }
  
  private q a(d paramd)
  {
    q localq = p.a();
    localq.a(b);
    localq.a(100L);
    localq.a(paramd);
    localq.a(paramd);
    a.d();
    return localq;
  }
  
  float a()
  {
    return h;
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    if (a != null)
    {
      a.a(paramFloat1, i + paramFloat1);
      f();
    }
  }
  
  void a(int paramInt)
  {
    if (e != null) {
      android.support.v4.d.a.a.a(e, new ColorStateList(new int[][] { k, j, new int[0] }, new int[] { paramInt, paramInt, 0 }));
    }
  }
  
  final void a(ColorStateList paramColorStateList)
  {
    if (d != null) {
      android.support.v4.d.a.a.a(d, paramColorStateList);
    }
    if (f != null)
    {
      c localc = f;
      if (paramColorStateList != null) {
        f = paramColorStateList.getColorForState(localc.getState(), f);
      }
      e = paramColorStateList;
      g = true;
      localc.invalidateSelf();
    }
  }
  
  final void a(PorterDuff.Mode paramMode)
  {
    if (d != null) {
      android.support.v4.d.a.a.a(d, paramMode);
    }
  }
  
  void a(Rect paramRect)
  {
    a.getPadding(paramRect);
  }
  
  void a(final g.a parama)
  {
    if (h()) {
      return;
    }
    c = 1;
    Animation localAnimation = AnimationUtils.loadAnimation(n.getContext(), android.support.design.a.a.design_fab_out);
    localAnimation.setInterpolator(a.c);
    localAnimation.setDuration(200L);
    localAnimation.setAnimationListener(new a.a()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        c = 0;
        paramAnonymousAnimation = n;
        if (a) {}
        for (int i = 8;; i = 4)
        {
          paramAnonymousAnimation.a(i, a);
          return;
        }
      }
    });
    n.startAnimation(localAnimation);
  }
  
  void a(int[] paramArrayOfInt)
  {
    o localo = r;
    int j = a.size();
    int i = 0;
    o.a locala;
    if (i < j)
    {
      locala = (o.a)a.get(i);
      if (!StateSet.stateSetMatches(a, paramArrayOfInt)) {}
    }
    for (paramArrayOfInt = locala;; paramArrayOfInt = null)
    {
      if (paramArrayOfInt != b)
      {
        if ((b != null) && (c != null))
        {
          c.a.e();
          c = null;
        }
        b = paramArrayOfInt;
        if (paramArrayOfInt != null)
        {
          c = b;
          c.a.a();
        }
      }
      return;
      i += 1;
      break;
    }
  }
  
  void b()
  {
    o localo = r;
    if (c != null)
    {
      c.a.g();
      c = null;
    }
  }
  
  void b(final g.a parama)
  {
    if (g()) {
      return;
    }
    c = 2;
    n.a(0, false);
    Animation localAnimation = AnimationUtils.loadAnimation(n.getContext(), android.support.design.a.a.design_fab_in);
    localAnimation.setDuration(200L);
    localAnimation.setInterpolator(a.d);
    localAnimation.setAnimationListener(new a.a()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        c = 0;
      }
    });
    n.startAnimation(localAnimation);
  }
  
  void c() {}
  
  private final class a
    extends e.d
  {
    a()
    {
      super((byte)0);
    }
    
    protected final float a()
    {
      return 0.0F;
    }
  }
  
  private final class b
    extends e.d
  {
    b()
    {
      super((byte)0);
    }
    
    protected final float a()
    {
      return h + i;
    }
  }
  
  private final class c
    extends e.d
  {
    c()
    {
      super((byte)0);
    }
    
    protected final float a()
    {
      return h;
    }
  }
  
  private abstract class d
    extends q.b
    implements q.c
  {
    private boolean a;
    private float c;
    private float d;
    
    private d() {}
    
    protected abstract float a();
    
    public final void a(q paramq)
    {
      if (!a)
      {
        c = a.j;
        d = a();
        a = true;
      }
      a.a(c + (d - c) * a.f());
    }
    
    public final void b(q paramq)
    {
      a.a(d);
      a = false;
    }
  }
}


/* Location:              android/support/design/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */