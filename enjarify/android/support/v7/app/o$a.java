package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class o$a
  implements View.OnClickListener
{
  private final View a;
  private final String b;
  private Method c;
  private Context d;
  
  public o$a(View paramView, String paramString)
  {
    a = paramView;
    b = paramString;
  }
  
  public final void onClick(View paramView)
  {
    Object localObject1 = c;
    if (localObject1 == null) {
      localObject1 = a.getContext();
    }
    while (localObject1 != null) {
      try
      {
        bool = ((Context)localObject1).isRestricted();
        if (!bool)
        {
          localObject2 = localObject1.getClass();
          localObject4 = b;
          j = 1;
          localObject5 = new Class[j];
          Class localClass = View.class;
          localObject5[0] = localClass;
          localObject2 = ((Class)localObject2).getMethod((String)localObject4, (Class[])localObject5);
          if (localObject2 != null)
          {
            c = ((Method)localObject2);
            d = ((Context)localObject1);
          }
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        try
        {
          localObject1 = c;
          Object localObject2 = d;
          int k = 1;
          localObject4 = new Object[k];
          int j = 0;
          localObject5 = null;
          localObject4[0] = paramView;
          ((Method)localObject1).invoke(localObject2, (Object[])localObject4);
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          boolean bool;
          Object localObject4;
          Object localObject5;
          int m;
          int i;
          localObject3 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject3).<init>("Could not execute non-public method for android:onClick", localIllegalAccessException);
          throw ((Throwable)localObject3);
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          Object localObject3 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject3).<init>("Could not execute method for android:onClick", localInvocationTargetException);
          throw ((Throwable)localObject3);
        }
        localNoSuchMethodException = localNoSuchMethodException;
        bool = localObject1 instanceof ContextWrapper;
        if (bool)
        {
          localObject1 = ((ContextWrapper)localObject1).getBaseContext();
        }
        else
        {
          m = 0;
          localObject1 = null;
        }
      }
    }
    localObject1 = a;
    m = ((View)localObject1).getId();
    i = -1;
    if (m == i) {}
    for (localObject1 = "";; localObject1 = (String)localObject3)
    {
      localObject3 = new java/lang/IllegalStateException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("Could not find method ");
      localObject5 = b;
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5).append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
      localObject5 = a.getClass();
      localObject1 = localObject5 + (String)localObject1;
      ((IllegalStateException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(" with id '");
      localObject4 = a.getContext().getResources();
      localObject1 = ((Resources)localObject4).getResourceEntryName(m);
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "'";
    }
  }
}


/* Location:              android/support/v7/app/o$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */