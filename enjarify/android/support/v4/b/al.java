package android.support.v4.b;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;

final class al
{
  static RemoteInput[] a(am.a[] paramArrayOfa)
  {
    int i;
    if (paramArrayOfa == null) {
      i = 0;
    }
    RemoteInput[] arrayOfRemoteInput;
    for (Object localObject1 = null;; localObject1 = arrayOfRemoteInput)
    {
      return (RemoteInput[])localObject1;
      arrayOfRemoteInput = new RemoteInput[paramArrayOfa.length];
      i = 0;
      localObject1 = null;
      for (;;)
      {
        int j = paramArrayOfa.length;
        if (i >= j) {
          break;
        }
        Object localObject2 = paramArrayOfa[i];
        RemoteInput.Builder localBuilder = new android/app/RemoteInput$Builder;
        Object localObject3 = ((am.a)localObject2).a();
        localBuilder.<init>((String)localObject3);
        localObject3 = ((am.a)localObject2).b();
        localBuilder = localBuilder.setLabel((CharSequence)localObject3);
        localObject3 = ((am.a)localObject2).c();
        localBuilder = localBuilder.setChoices((CharSequence[])localObject3);
        boolean bool = ((am.a)localObject2).d();
        localBuilder = localBuilder.setAllowFreeFormInput(bool);
        localObject2 = ((am.a)localObject2).e();
        localObject2 = localBuilder.addExtras((Bundle)localObject2).build();
        arrayOfRemoteInput[i] = localObject2;
        i += 1;
      }
    }
  }
}


/* Location:              android/support/v4/b/al.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */