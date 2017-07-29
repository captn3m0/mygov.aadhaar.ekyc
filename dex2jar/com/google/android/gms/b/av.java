package com.google.android.gms.b;

public abstract class av<T>
{
  private static final Object c = new Object();
  private static a d = null;
  private static int e = 0;
  private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
  protected final String a;
  protected final T b;
  private T g = null;
  
  protected av(String paramString, T paramT)
  {
    a = paramString;
    b = paramT;
  }
  
  public static av<Integer> a(String paramString, Integer paramInteger)
  {
    new av(paramString, paramInteger) {};
  }
  
  public static av<Long> a(String paramString, Long paramLong)
  {
    new av(paramString, paramLong) {};
  }
  
  public static av<String> a(String paramString1, String paramString2)
  {
    new av(paramString1, paramString2) {};
  }
  
  public static av<Boolean> a(String paramString, boolean paramBoolean)
  {
    new av(paramString, Boolean.valueOf(paramBoolean)) {};
  }
  
  private static abstract interface a {}
}


/* Location:              com/google/android/gms/b/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */