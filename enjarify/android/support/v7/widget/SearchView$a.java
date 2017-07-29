package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

final class SearchView$a
{
  Method a;
  Method b;
  Method c;
  private Method d;
  
  SearchView$a()
  {
    Object localObject = AutoCompleteTextView.class;
    String str = "doBeforeTextChanged";
    int i = 0;
    Class[] arrayOfClass = null;
    try
    {
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
      a = ((Method)localObject);
      localObject = a;
      bool = true;
      ((Method)localObject).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException4)
    {
      boolean bool;
      for (;;) {}
    }
    localObject = AutoCompleteTextView.class;
    str = "doAfterTextChanged";
    i = 0;
    arrayOfClass = null;
    try
    {
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
      b = ((Method)localObject);
      localObject = b;
      bool = true;
      ((Method)localObject).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException3)
    {
      for (;;) {}
    }
    localObject = AutoCompleteTextView.class;
    str = "ensureImeVisible";
    i = 1;
    try
    {
      arrayOfClass = new Class[i];
      j = 0;
      localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      c = ((Method)localObject);
      localObject = c;
      bool = true;
      ((Method)localObject).setAccessible(bool);
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      int j;
      Class localClass;
      for (;;) {}
    }
    localObject = InputMethodManager.class;
    str = "showSoftInputUnchecked";
    i = 2;
    try
    {
      arrayOfClass = new Class[i];
      j = 0;
      localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      j = 1;
      localClass = ResultReceiver.class;
      arrayOfClass[j] = localClass;
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      d = ((Method)localObject);
      localObject = d;
      bool = true;
      ((Method)localObject).setAccessible(bool);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      for (;;) {}
    }
  }
}


/* Location:              android/support/v7/widget/SearchView$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */