package android.support.design.widget;

import android.os.Build.VERSION;

final class x
{
  static final q.d a = new q.d()
  {
    public final q a()
    {
      if (Build.VERSION.SDK_INT >= 12) {}
      for (Object localObject = new s();; localObject = new r()) {
        return new q((q.e)localObject);
      }
    }
  };
  
  static q a()
  {
    return a.a();
  }
  
  static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}


/* Location:              android/support/design/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */