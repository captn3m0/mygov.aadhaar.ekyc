package com.google.android.gms.b;

final class ua$2
  implements re.a
{
  ua$2(String paramString, ua.c paramc) {}
  
  public final void a(vr paramvr)
  {
    String str1 = a;
    String str2 = String.valueOf(paramvr.toString());
    int i = String.valueOf(str1).length() + 21;
    int j = String.valueOf(str2).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    tp.e("Failed to load URL: " + str1 + "\n" + str2);
    b.a(null);
  }
}


/* Location:              com/google/android/gms/b/ua$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */