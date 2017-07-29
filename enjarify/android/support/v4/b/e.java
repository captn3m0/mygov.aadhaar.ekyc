package android.support.v4.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

abstract class e
  extends aq
{
  boolean a;
  
  static void a(int paramInt)
  {
    int i = 0xFFFF0000 & paramInt;
    if (i != 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Can only use lower 16 bits for requestCode");
      throw localIllegalArgumentException;
    }
  }
  
  abstract View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);
  
  protected void onCreate(Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    if (i < j)
    {
      Object localObject = getLayoutInflater().getFactory();
      if (localObject == null)
      {
        localObject = getLayoutInflater();
        ((LayoutInflater)localObject).setFactory(this);
      }
    }
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = a(null, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      localView = super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = a;
    if (!bool)
    {
      int i = -1;
      if (paramInt1 != i) {
        a(paramInt1);
      }
    }
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              android/support/v4/b/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */