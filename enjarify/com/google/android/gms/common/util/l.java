package com.google.android.gms.common.util;

import android.util.Log;
import java.io.File;

public final class l
{
  public static File a(File paramFile)
  {
    synchronized (l.class)
    {
      boolean bool = paramFile.exists();
      if (!bool)
      {
        bool = paramFile.mkdirs();
        if (!bool)
        {
          bool = paramFile.exists();
          if (!bool) {
            break label36;
          }
        }
      }
      label36:
      String str2;
      for (;;)
      {
        return paramFile;
        String str1 = "SupportV4Utils";
        str2 = "Unable to create no-backup dir ";
        str3 = paramFile.getPath();
        str3 = String.valueOf(str3);
        int i = str3.length();
        if (i == 0) {
          break;
        }
        str3 = str2.concat(str3);
        Log.w(str1, str3);
        paramFile = null;
      }
      String str3 = new java/lang/String;
      str3.<init>(str2);
    }
  }
}


/* Location:              com/google/android/gms/common/util/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */