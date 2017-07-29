package com.google.android.gms.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class vk$6
  implements DialogInterface.OnClickListener
{
  vk$6(JsPromptResult paramJsPromptResult, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    JsPromptResult localJsPromptResult = a;
    String str = b.getText().toString();
    localJsPromptResult.confirm(str);
  }
}


/* Location:              com/google/android/gms/b/vk$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */