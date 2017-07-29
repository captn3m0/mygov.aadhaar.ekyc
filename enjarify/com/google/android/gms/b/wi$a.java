package com.google.android.gms.b;

import android.content.ContentResolver;
import android.content.Context;

final class wi$a
{
  final ContentResolver a;
  
  wi$a(Context paramContext)
  {
    Object localObject;
    String str;
    boolean bool;
    if (paramContext != null)
    {
      localObject = wi.a;
      if (localObject == null)
      {
        localObject = bc.a(paramContext);
        str = "com.google.android.providers.gsf.permission.READ_GSERVICES";
        int j = ((bb)localObject).a(str);
        if (j == 0)
        {
          j = i;
          localObject = Boolean.valueOf(j);
          wi.a = (Boolean)localObject;
        }
      }
      else
      {
        localObject = wi.a;
        bool = ((Boolean)localObject).booleanValue();
        if (bool) {
          break label87;
        }
      }
    }
    else
    {
      bool = false;
      localObject = null;
      a = null;
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      break;
      label87:
      localObject = paramContext.getContentResolver();
      a = ((ContentResolver)localObject);
      localObject = a;
      String[] arrayOfString = new String[i];
      str = "gms:playlog:service:sampling_";
      arrayOfString[0] = str;
      fd.a((ContentResolver)localObject, arrayOfString);
    }
  }
}


/* Location:              com/google/android/gms/b/wi$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */