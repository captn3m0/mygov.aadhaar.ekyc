package android.support.v4.f;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public final class b
{
  public static Parcelable.Creator a(c paramc)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 13;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/f/d;
      ((d)localObject).<init>(paramc);
    }
    for (;;)
    {
      return (Parcelable.Creator)localObject;
      localObject = new android/support/v4/f/b$a;
      ((b.a)localObject).<init>(paramc);
    }
  }
}


/* Location:              android/support/v4/f/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */