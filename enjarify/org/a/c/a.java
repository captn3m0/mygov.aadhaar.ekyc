package org.a.c;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class a
{
  private static ResourceBundle a = ResourceBundle.getBundle("org.keyczar.i18n.messages");
  
  public static String a(String paramString, Object... paramVarArgs)
  {
    try
    {
      localObject1 = a;
      localObject1 = ((ResourceBundle)localObject1).getString(paramString);
      localObject1 = MessageFormat.format((String)localObject1, paramVarArgs);
    }
    catch (MissingResourceException localMissingResourceException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = new java/lang/StringBuilder;
        String str = "!";
        ((StringBuilder)localObject2).<init>(str);
        localObject2 = ((StringBuilder)localObject2).append(paramString);
        char c = '!';
        localObject2 = c;
      }
    }
    return (String)localObject1;
  }
}


/* Location:              org/a/c/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */