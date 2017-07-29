package android.support.v4.h.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public final class b
{
  public static final b.g a;
  public final Object b;
  public int c = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 24;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/a/b$e;
      ((b.e)localObject).<init>();
      a = (b.g)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 23;
      if (i >= j)
      {
        localObject = new android/support/v4/h/a/b$d;
        ((b.d)localObject).<init>();
        a = (b.g)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 22;
        if (i >= j)
        {
          localObject = new android/support/v4/h/a/b$c;
          ((b.c)localObject).<init>();
          a = (b.g)localObject;
        }
        else
        {
          i = Build.VERSION.SDK_INT;
          j = 21;
          if (i >= j)
          {
            localObject = new android/support/v4/h/a/b$b;
            ((b.b)localObject).<init>();
            a = (b.g)localObject;
          }
          else
          {
            i = Build.VERSION.SDK_INT;
            j = 19;
            if (i >= j)
            {
              localObject = new android/support/v4/h/a/b$k;
              ((b.k)localObject).<init>();
              a = (b.g)localObject;
            }
            else
            {
              i = Build.VERSION.SDK_INT;
              j = 18;
              if (i >= j)
              {
                localObject = new android/support/v4/h/a/b$j;
                ((b.j)localObject).<init>();
                a = (b.g)localObject;
              }
              else
              {
                i = Build.VERSION.SDK_INT;
                j = 17;
                if (i >= j)
                {
                  localObject = new android/support/v4/h/a/b$i;
                  ((b.i)localObject).<init>();
                  a = (b.g)localObject;
                }
                else
                {
                  i = Build.VERSION.SDK_INT;
                  j = 16;
                  if (i >= j)
                  {
                    localObject = new android/support/v4/h/a/b$h;
                    ((b.h)localObject).<init>();
                    a = (b.g)localObject;
                  }
                  else
                  {
                    i = Build.VERSION.SDK_INT;
                    j = 14;
                    if (i >= j)
                    {
                      localObject = new android/support/v4/h/a/b$f;
                      ((b.f)localObject).<init>();
                      a = (b.g)localObject;
                    }
                    else
                    {
                      localObject = new android/support/v4/h/a/b$l;
                      ((b.l)localObject).<init>();
                      a = (b.g)localObject;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public b(Object paramObject)
  {
    b = paramObject;
  }
  
  public static b a(b paramb)
  {
    Object localObject1 = a;
    Object localObject2 = b;
    localObject2 = ((b.g)localObject1).a(localObject2);
    if (localObject2 != null)
    {
      localObject1 = new android/support/v4/h/a/b;
      ((b)localObject1).<init>(localObject2);
    }
    for (;;)
    {
      return (b)localObject1;
      localObject1 = null;
    }
  }
  
  public final int a()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.b(localObject);
  }
  
  public final void a(int paramInt)
  {
    b.g localg = a;
    Object localObject = b;
    localg.a(localObject, paramInt);
  }
  
  public final void a(Rect paramRect)
  {
    b.g localg = a;
    Object localObject = b;
    localg.a(localObject, paramRect);
  }
  
  public final void a(View paramView)
  {
    b.g localg = a;
    Object localObject = b;
    localg.b(localObject, paramView);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    b.g localg = a;
    Object localObject = b;
    localg.a(localObject, paramCharSequence);
  }
  
  public final void a(Object paramObject)
  {
    b.g localg = a;
    Object localObject1 = b;
    Object localObject2 = a;
    localg.c(localObject1, localObject2);
  }
  
  public final void a(boolean paramBoolean)
  {
    b.g localg = a;
    Object localObject = b;
    localg.a(localObject, paramBoolean);
  }
  
  public final boolean a(b.a parama)
  {
    b.g localg = a;
    Object localObject1 = b;
    Object localObject2 = E;
    return localg.a(localObject1, localObject2);
  }
  
  public final void b(Rect paramRect)
  {
    b.g localg = a;
    Object localObject = b;
    localg.b(localObject, paramRect);
  }
  
  public final void b(boolean paramBoolean)
  {
    b.g localg = a;
    Object localObject = b;
    localg.e(localObject, paramBoolean);
  }
  
  public final boolean b()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.k(localObject);
  }
  
  public final void c(boolean paramBoolean)
  {
    b.g localg = a;
    Object localObject = b;
    localg.f(localObject, paramBoolean);
  }
  
  public final boolean c()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.l(localObject);
  }
  
  public final boolean d()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.p(localObject);
  }
  
  public final boolean e()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.i(localObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 != localObject2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (b)paramObject;
          localObject1 = b;
          if (localObject1 == null)
          {
            localObject1 = b;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = b;
            localObject2 = b;
            boolean bool2 = localObject1.equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public final boolean f()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.m(localObject);
  }
  
  public final boolean g()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.j(localObject);
  }
  
  public final void h()
  {
    b.g localg = a;
    Object localObject = b;
    localg.q(localObject);
  }
  
  public final int hashCode()
  {
    Object localObject = b;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = b;
      i = localObject.hashCode();
    }
  }
  
  public final CharSequence i()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.e(localObject);
  }
  
  public final CharSequence j()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.c(localObject);
  }
  
  public final CharSequence k()
  {
    b.g localg = a;
    Object localObject = b;
    return localg.d(localObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = super.toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    a((Rect)localObject1);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("; boundsInParent: ");
    localObject2 = localObject1;
    localStringBuilder.append((String)localObject2);
    b((Rect)localObject1);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("; boundsInScreen: ");
    localObject1 = localObject1;
    localStringBuilder.append((String)localObject1);
    localObject1 = localStringBuilder.append("; packageName: ");
    localObject2 = i();
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; className: ");
    localObject2 = j();
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; text: ");
    localObject2 = a;
    Object localObject3 = b;
    localObject2 = ((b.g)localObject2).f(localObject3);
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; contentDescription: ");
    localObject2 = k();
    ((StringBuilder)localObject1).append((CharSequence)localObject2);
    localObject1 = localStringBuilder.append("; viewId: ");
    localObject2 = a;
    localObject3 = b;
    localObject2 = ((b.g)localObject2).u(localObject3);
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append("; checkable: ");
    localObject2 = a;
    localObject3 = b;
    boolean bool = ((b.g)localObject2).g(localObject3);
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; checked: ");
    localObject2 = a;
    localObject3 = b;
    bool = ((b.g)localObject2).h(localObject3);
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; focusable: ");
    bool = b();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; focused: ");
    bool = c();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; selected: ");
    bool = d();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; clickable: ");
    bool = e();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; longClickable: ");
    bool = f();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; enabled: ");
    bool = g();
    ((StringBuilder)localObject1).append(bool);
    localObject1 = localStringBuilder.append("; password: ");
    localObject2 = a;
    localObject3 = b;
    bool = ((b.g)localObject2).n(localObject3);
    ((StringBuilder)localObject1).append(bool);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("; scrollable: ");
    localObject2 = a;
    localObject3 = b;
    bool = ((b.g)localObject2).o(localObject3);
    localObject1 = bool;
    localStringBuilder.append((String)localObject1);
    localObject1 = "; [";
    localStringBuilder.append((String)localObject1);
    int j = a();
    if (j != 0)
    {
      int k = Integer.numberOfTrailingZeros(j);
      k = 1 << k;
      int i = (k ^ 0xFFFFFFFF) & j;
      switch (k)
      {
      default: 
        localObject1 = "ACTION_UNKNOWN";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject1);
        if (i != 0)
        {
          localObject1 = ", ";
          localStringBuilder.append((String)localObject1);
        }
        j = i;
        break;
        localObject1 = "ACTION_FOCUS";
        continue;
        localObject1 = "ACTION_CLEAR_FOCUS";
        continue;
        localObject1 = "ACTION_SELECT";
        continue;
        localObject1 = "ACTION_CLEAR_SELECTION";
        continue;
        localObject1 = "ACTION_CLICK";
        continue;
        localObject1 = "ACTION_LONG_CLICK";
        continue;
        localObject1 = "ACTION_ACCESSIBILITY_FOCUS";
        continue;
        localObject1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue;
        localObject1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject1 = "ACTION_NEXT_HTML_ELEMENT";
        continue;
        localObject1 = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue;
        localObject1 = "ACTION_SCROLL_FORWARD";
        continue;
        localObject1 = "ACTION_SCROLL_BACKWARD";
        continue;
        localObject1 = "ACTION_CUT";
        continue;
        localObject1 = "ACTION_COPY";
        continue;
        localObject1 = "ACTION_PASTE";
        continue;
        localObject1 = "ACTION_SET_SELECTION";
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/h/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */