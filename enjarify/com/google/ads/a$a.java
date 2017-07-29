package com.google.ads;

public enum a$a
{
  private final String e;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/google/ads/a$a;
    ((a)localObject).<init>("INVALID_REQUEST", 0, "Invalid Ad request.");
    a = (a)localObject;
    localObject = new com/google/ads/a$a;
    ((a)localObject).<init>("NO_FILL", k, "Ad request successful, but no ad returned due to lack of ad inventory.");
    b = (a)localObject;
    localObject = new com/google/ads/a$a;
    ((a)localObject).<init>("NETWORK_ERROR", j, "A network error occurred.");
    c = (a)localObject;
    localObject = new com/google/ads/a$a;
    ((a)localObject).<init>("INTERNAL_ERROR", i, "There was an internal error.");
    d = (a)localObject;
    localObject = new a[4];
    a locala = a;
    localObject[0] = locala;
    locala = b;
    localObject[k] = locala;
    locala = c;
    localObject[j] = locala;
    locala = d;
    localObject[i] = locala;
    f = (a[])localObject;
  }
  
  private a$a(String paramString1)
  {
    e = paramString1;
  }
  
  public final String toString()
  {
    return e;
  }
}


/* Location:              com/google/ads/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */