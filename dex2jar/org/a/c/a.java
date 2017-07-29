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
      paramVarArgs = MessageFormat.format(a.getString(paramString), paramVarArgs);
      return paramVarArgs;
    }
    catch (MissingResourceException paramVarArgs) {}
    return "!" + paramString + '!';
  }
}


/* Location:              org/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */