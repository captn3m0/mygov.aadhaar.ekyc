package android.support.v4.c;

import android.content.ComponentName;
import android.content.Intent;

class b$b
  implements b.a
{
  public Intent a(ComponentName paramComponentName)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.MAIN");
    localIntent.setComponent(paramComponentName);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return localIntent;
  }
}


/* Location:              android/support/v4/c/b$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */