package android.support.v4.b;

import android.os.Bundle;

final class an
{
  static Bundle[] a(am.a[] paramArrayOfa)
  {
    int i;
    if (paramArrayOfa == null) {
      i = 0;
    }
    Bundle[] arrayOfBundle;
    for (Object localObject1 = null;; localObject1 = arrayOfBundle)
    {
      return (Bundle[])localObject1;
      arrayOfBundle = new Bundle[paramArrayOfa.length];
      i = 0;
      localObject1 = null;
      for (;;)
      {
        int j = paramArrayOfa.length;
        if (i >= j) {
          break;
        }
        Object localObject2 = paramArrayOfa[i];
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        Object localObject3 = ((am.a)localObject2).a();
        localBundle.putString("resultKey", (String)localObject3);
        localObject3 = ((am.a)localObject2).b();
        localBundle.putCharSequence("label", (CharSequence)localObject3);
        localObject3 = ((am.a)localObject2).c();
        localBundle.putCharSequenceArray("choices", (CharSequence[])localObject3);
        boolean bool = ((am.a)localObject2).d();
        localBundle.putBoolean("allowFreeFormInput", bool);
        String str = "extras";
        localObject2 = ((am.a)localObject2).e();
        localBundle.putBundle(str, (Bundle)localObject2);
        arrayOfBundle[i] = localBundle;
        i += 1;
      }
    }
  }
}


/* Location:              android/support/v4/b/an.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */