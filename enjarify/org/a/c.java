package org.a;

import java.util.Arrays;
import java.util.List;
import org.a.d.d;
import org.a.d.d.a;

public enum c
  implements d
{
  private final List j;
  
  static
  {
    int m = 4;
    int n = 3;
    int i1 = 2;
    int i2 = 1;
    Object localObject1 = new org/a/c;
    Object localObject2 = new Integer[n];
    Object localObject3 = Integer.valueOf(128);
    localObject2[0] = localObject3;
    localObject3 = Integer.valueOf(192);
    localObject2[i2] = localObject3;
    localObject3 = Integer.valueOf(256);
    localObject2[i1] = localObject3;
    localObject2 = Arrays.asList((Object[])localObject2);
    ((c)localObject1).<init>("AES", 0, (List)localObject2);
    a = (c)localObject1;
    localObject1 = new org/a/c;
    localObject2 = new Integer[i2];
    localObject3 = Integer.valueOf(256);
    localObject2[0] = localObject3;
    localObject2 = Arrays.asList((Object[])localObject2);
    ((c)localObject1).<init>("HMAC_SHA1", i2, (List)localObject2);
    b = (c)localObject1;
    localObject1 = new org/a/c;
    localObject2 = new Integer[i2];
    localObject3 = Integer.valueOf(1024);
    localObject2[0] = localObject3;
    localObject2 = Arrays.asList((Object[])localObject2);
    ((c)localObject1).<init>("DSA_PRIV", i1, (List)localObject2);
    c = (c)localObject1;
    localObject1 = new org/a/c;
    localObject2 = new Integer[i2];
    localObject3 = Integer.valueOf(1024);
    localObject2[0] = localObject3;
    localObject2 = Arrays.asList((Object[])localObject2);
    ((c)localObject1).<init>("DSA_PUB", n, (List)localObject2);
    d = (c)localObject1;
    localObject1 = new org/a/c;
    localObject2 = new Integer[n];
    localObject3 = Integer.valueOf(4096);
    localObject2[0] = localObject3;
    localObject3 = Integer.valueOf(2048);
    localObject2[i2] = localObject3;
    localObject3 = Integer.valueOf(1024);
    localObject2[i1] = localObject3;
    localObject2 = Arrays.asList((Object[])localObject2);
    ((c)localObject1).<init>("RSA_PRIV", m, (List)localObject2);
    e = (c)localObject1;
    localObject1 = new org/a/c;
    localObject3 = new Integer[n];
    Integer localInteger = Integer.valueOf(4096);
    localObject3[0] = localInteger;
    localInteger = Integer.valueOf(2048);
    localObject3[i2] = localInteger;
    localInteger = Integer.valueOf(1024);
    localObject3[i1] = localInteger;
    localObject3 = Arrays.asList((Object[])localObject3);
    ((c)localObject1).<init>("RSA_PUB", 5, (List)localObject3);
    f = (c)localObject1;
    localObject1 = new org/a/c;
    localObject3 = new Integer[m];
    localInteger = Integer.valueOf(256);
    localObject3[0] = localInteger;
    localInteger = Integer.valueOf(384);
    localObject3[i2] = localInteger;
    localInteger = Integer.valueOf(521);
    localObject3[i1] = localInteger;
    localInteger = Integer.valueOf(192);
    localObject3[n] = localInteger;
    localObject3 = Arrays.asList((Object[])localObject3);
    ((c)localObject1).<init>("EC_PRIV", 6, (List)localObject3);
    g = (c)localObject1;
    localObject1 = new org/a/c;
    localObject3 = new Integer[m];
    localInteger = Integer.valueOf(256);
    localObject3[0] = localInteger;
    localInteger = Integer.valueOf(384);
    localObject3[i2] = localInteger;
    localInteger = Integer.valueOf(521);
    localObject3[i1] = localInteger;
    localInteger = Integer.valueOf(192);
    localObject3[n] = localInteger;
    localObject3 = Arrays.asList((Object[])localObject3);
    ((c)localObject1).<init>("EC_PUB", 7, (List)localObject3);
    h = (c)localObject1;
    localObject1 = new org/a/c;
    localObject3 = new Integer[i2];
    localInteger = Integer.valueOf(i2);
    localObject3[0] = localInteger;
    localObject3 = Arrays.asList((Object[])localObject3);
    ((c)localObject1).<init>("TEST", 8, (List)localObject3);
    i = (c)localObject1;
    localObject1 = new c[9];
    c localc = a;
    localObject1[0] = localc;
    localc = b;
    localObject1[i2] = localc;
    localc = c;
    localObject1[i1] = localc;
    localc = d;
    localObject1[n] = localc;
    localc = e;
    localObject1[m] = localc;
    localObject2 = f;
    localObject1[5] = localObject2;
    localObject2 = g;
    localObject1[6] = localObject2;
    localObject2 = h;
    localObject1[7] = localObject2;
    localObject2 = i;
    localObject1[8] = localObject2;
    k = (c[])localObject1;
  }
  
  private c(List paramList)
  {
    j = paramList;
  }
  
  public final String a()
  {
    return name();
  }
  
  public final d.a b()
  {
    c.a locala = new org/a/c$a;
    locala.<init>(this, (byte)0);
    return locala;
  }
}


/* Location:              org/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */