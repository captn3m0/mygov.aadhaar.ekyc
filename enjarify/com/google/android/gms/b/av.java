package com.google.android.gms.b;

public abstract class av
{
  private static final Object c;
  private static av.a d = null;
  private static int e = 0;
  private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
  protected final String a;
  protected final Object b;
  private Object g = null;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
  }
  
  protected av(String paramString, Object paramObject)
  {
    a = paramString;
    b = paramObject;
  }
  
  public static av a(String paramString, Integer paramInteger)
  {
    av.3 local3 = new com/google/android/gms/b/av$3;
    local3.<init>(paramString, paramInteger);
    return local3;
  }
  
  public static av a(String paramString, Long paramLong)
  {
    av.2 local2 = new com/google/android/gms/b/av$2;
    local2.<init>(paramString, paramLong);
    return local2;
  }
  
  public static av a(String paramString1, String paramString2)
  {
    av.4 local4 = new com/google/android/gms/b/av$4;
    local4.<init>(paramString1, paramString2);
    return local4;
  }
  
  public static av a(String paramString, boolean paramBoolean)
  {
    av.1 local1 = new com/google/android/gms/b/av$1;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    local1.<init>(paramString, localBoolean);
    return local1;
  }
}


/* Location:              com/google/android/gms/b/av.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */