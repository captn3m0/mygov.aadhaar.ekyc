package android.support.v4.b;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class ab$g
  extends ab.q
{
  CharSequence a;
  CharSequence b;
  List c;
  
  ab$g()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    c = localArrayList;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Object localObject1 = a;
    CharSequence localCharSequence;
    if (localObject1 != null)
    {
      localObject1 = "android.selfDisplayName";
      localCharSequence = a;
      paramBundle.putCharSequence((String)localObject1, localCharSequence);
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = "android.conversationTitle";
      localCharSequence = b;
      paramBundle.putCharSequence((String)localObject1, localCharSequence);
    }
    localObject1 = c;
    boolean bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      String str = "android.messages";
      List localList = c;
      Bundle[] arrayOfBundle = new Bundle[localList.size()];
      int j = localList.size();
      bool = false;
      localObject1 = null;
      int k = 0;
      localCharSequence = null;
      while (k < j)
      {
        localObject1 = (ab.g.a)localList.get(k);
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        Object localObject2 = a;
        Object localObject3;
        if (localObject2 != null)
        {
          localObject2 = "text";
          localObject3 = a;
          localBundle.putCharSequence((String)localObject2, (CharSequence)localObject3);
        }
        long l = b;
        localBundle.putLong("time", l);
        localObject2 = c;
        if (localObject2 != null)
        {
          localObject2 = "sender";
          localObject3 = c;
          localBundle.putCharSequence((String)localObject2, (CharSequence)localObject3);
        }
        localObject2 = d;
        if (localObject2 != null)
        {
          localObject2 = "type";
          localObject3 = d;
          localBundle.putString((String)localObject2, (String)localObject3);
        }
        localObject2 = e;
        if (localObject2 != null)
        {
          localObject2 = "uri";
          localObject1 = e;
          localBundle.putParcelable((String)localObject2, (Parcelable)localObject1);
        }
        arrayOfBundle[k] = localBundle;
        int i = k + 1;
        k = i;
      }
      paramBundle.putParcelableArray(str, arrayOfBundle);
    }
  }
}


/* Location:              android/support/v4/b/ab$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */