package android.support.v4.h;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

class w$e
  extends w.c
{
  static Field b;
  static boolean c = false;
  
  public final void a(View paramView, b paramb)
  {
    if (paramb == null) {}
    for (Object localObject = null;; localObject = b)
    {
      localObject = (View.AccessibilityDelegate)localObject;
      paramView.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
      return;
    }
  }
  
  public final void a(View paramView, boolean paramBoolean)
  {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  /* Error */
  public final boolean a(View paramView)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: getstatic 10	android/support/v4/h/w$e:c	Z
    //   7: istore 4
    //   9: iload 4
    //   11: ifeq +5 -> 16
    //   14: iload_3
    //   15: ireturn
    //   16: getstatic 34	android/support/v4/h/w$e:b	Ljava/lang/reflect/Field;
    //   19: astore 5
    //   21: aload 5
    //   23: ifnonnull +35 -> 58
    //   26: ldc 18
    //   28: astore 5
    //   30: ldc 36
    //   32: astore 6
    //   34: aload 5
    //   36: aload 6
    //   38: invokevirtual 42	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   41: astore 5
    //   43: aload 5
    //   45: putstatic 34	android/support/v4/h/w$e:b	Ljava/lang/reflect/Field;
    //   48: iconst_1
    //   49: istore 7
    //   51: aload 5
    //   53: iload 7
    //   55: invokevirtual 47	java/lang/reflect/Field:setAccessible	(Z)V
    //   58: getstatic 34	android/support/v4/h/w$e:b	Ljava/lang/reflect/Field;
    //   61: astore 5
    //   63: aload 5
    //   65: aload_1
    //   66: invokevirtual 51	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   69: astore 5
    //   71: aload 5
    //   73: ifnull -59 -> 14
    //   76: iload_2
    //   77: istore_3
    //   78: goto -64 -> 14
    //   81: astore 5
    //   83: iload_2
    //   84: putstatic 10	android/support/v4/h/w$e:c	Z
    //   87: goto -73 -> 14
    //   90: astore 5
    //   92: iload_2
    //   93: putstatic 10	android/support/v4/h/w$e:c	Z
    //   96: goto -82 -> 14
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	e
    //   0	99	1	paramView	View
    //   1	92	2	bool1	boolean
    //   3	75	3	bool2	boolean
    //   7	3	4	bool3	boolean
    //   19	53	5	localObject1	Object
    //   81	1	5	localObject2	Object
    //   90	1	5	localObject3	Object
    //   32	5	6	str	String
    //   49	5	7	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   36	41	81	finally
    //   43	48	81	finally
    //   53	58	81	finally
    //   58	61	90	finally
    //   65	69	90	finally
  }
  
  public final boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
  
  public final boolean b(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }
  
  public final ae t(View paramView)
  {
    Object localObject = a;
    if (localObject == null)
    {
      localObject = new java/util/WeakHashMap;
      ((WeakHashMap)localObject).<init>();
      a = ((WeakHashMap)localObject);
    }
    localObject = (ae)a.get(paramView);
    if (localObject == null)
    {
      localObject = new android/support/v4/h/ae;
      ((ae)localObject).<init>(paramView);
      WeakHashMap localWeakHashMap = a;
      localWeakHashMap.put(paramView, localObject);
    }
    return (ae)localObject;
  }
}


/* Location:              android/support/v4/h/w$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */