package com.google.android.gms.common.api;

public final class b
{
  public static String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 1: 
    case 9: 
    case 11: 
    case 12: 
    default: 
      int i = 32;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      str = "unknown status code: " + paramInt;
    }
    for (;;)
    {
      return str;
      str = "SUCCESS_CACHE";
      continue;
      str = "SUCCESS";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "ERROR";
      continue;
      str = "INTERRUPTED";
      continue;
      str = "TIMEOUT";
      continue;
      str = "CANCELED";
      continue;
      str = "API_NOT_CONNECTED";
      continue;
      str = "DEAD_CLIENT";
    }
  }
}


/* Location:              com/google/android/gms/common/api/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */