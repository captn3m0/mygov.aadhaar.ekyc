package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

@TargetApi(20)
final class al
{
  static RemoteInput[] a(am.a[] paramArrayOfa)
  {
    if (paramArrayOfa == null) {
      return null;
    }
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfa.length];
    int i = 0;
    while (i < paramArrayOfa.length)
    {
      am.a locala = paramArrayOfa[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(locala.a()).setLabel(locala.b()).setChoices(locala.c()).setAllowFreeFormInput(locala.d()).addExtras(locala.e()).build();
      i += 1;
    }
    return arrayOfRemoteInput;
  }
}


/* Location:              android/support/v4/b/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */