package android.support.v4.b;

import android.annotation.TargetApi;
import android.os.Bundle;

@TargetApi(16)
final class an
{
  static Bundle[] a(am.a[] paramArrayOfa)
  {
    if (paramArrayOfa == null) {
      return null;
    }
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfa.length];
    int i = 0;
    while (i < paramArrayOfa.length)
    {
      am.a locala = paramArrayOfa[i];
      Bundle localBundle = new Bundle();
      localBundle.putString("resultKey", locala.a());
      localBundle.putCharSequence("label", locala.b());
      localBundle.putCharSequenceArray("choices", locala.c());
      localBundle.putBoolean("allowFreeFormInput", locala.d());
      localBundle.putBundle("extras", locala.e());
      arrayOfBundle[i] = localBundle;
      i += 1;
    }
    return arrayOfBundle;
  }
}


/* Location:              android/support/v4/b/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */