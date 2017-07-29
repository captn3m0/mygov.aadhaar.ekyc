package com.google.ads.mediation;

import com.google.android.gms.b.ul;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class h
{
  public final void a(Map paramMap)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    Object localObject2 = getClass().getFields();
    int i = localObject2.length;
    int j = 0;
    Object localObject3 = null;
    int m = 0;
    Object localObject4 = null;
    Object localObject6;
    while (m < i)
    {
      localObject6 = localObject2[m];
      localObject3 = (h.b)((Field)localObject6).getAnnotation(h.b.class);
      if (localObject3 != null)
      {
        localObject3 = ((h.b)localObject3).a();
        ((Map)localObject1).put(localObject3, localObject6);
      }
      j = m + 1;
      m = j;
    }
    boolean bool1 = ((Map)localObject1).isEmpty();
    if (bool1)
    {
      localObject3 = "No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.";
      ul.e((String)localObject3);
    }
    localObject3 = paramMap.entrySet();
    localObject2 = ((Set)localObject3).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject4 = ((Map.Entry)localObject3).getKey();
      localObject4 = (Field)((Map)localObject1).remove(localObject4);
      if (localObject4 != null)
      {
        try
        {
          localObject7 = ((Map.Entry)localObject3).getValue();
          ((Field)localObject4).set(this, localObject7);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localObject3 = (String)((Map.Entry)localObject3).getKey();
          m = String.valueOf(localObject3).length() + 49;
          localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>(m);
          localObject3 = ((StringBuilder)localObject7).append("Server option \"").append((String)localObject3);
          String str = "\" could not be set: Illegal Access";
          localObject3 = str;
          ul.e((String)localObject3);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          localObject3 = (String)((Map.Entry)localObject3).getKey();
          m = String.valueOf(localObject3).length() + 43;
          localObject7 = new java/lang/StringBuilder;
          ((StringBuilder)localObject7).<init>(m);
          localObject3 = ((StringBuilder)localObject7).append("Server option \"").append((String)localObject3);
          localObject5 = "\" could not be set: Bad Type";
          localObject3 = (String)localObject5;
          ul.e((String)localObject3);
        }
      }
      else
      {
        localObject5 = (String)((Map.Entry)localObject3).getKey();
        localObject3 = (String)((Map.Entry)localObject3).getValue();
        i = String.valueOf(localObject5).length() + 31;
        i1 = String.valueOf(localObject3).length();
        i += i1;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>(i);
        localObject5 = ((StringBuilder)localObject6).append("Unexpected server option: ").append((String)localObject5);
        localObject7 = " = \"";
        localObject3 = ((StringBuilder)localObject5).append((String)localObject7).append((String)localObject3);
        localObject5 = "\"";
        localObject3 = (String)localObject5;
        ul.b((String)localObject3);
      }
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject3 = ((Map)localObject1).values();
    localObject1 = ((Collection)localObject3).iterator();
    boolean bool2;
    do
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = (Field)((Iterator)localObject1).next();
      localObject5 = (h.b)((Field)localObject3).getAnnotation(h.b.class);
      bool2 = ((h.b)localObject5).b();
    } while (!bool2);
    Object localObject7 = "Required server option missing: ";
    Object localObject5 = String.valueOf(((h.b)((Field)localObject3).getAnnotation(h.b.class)).a());
    int i1 = ((String)localObject5).length();
    if (i1 != 0) {
      localObject5 = ((String)localObject7).concat((String)localObject5);
    }
    for (;;)
    {
      ul.e((String)localObject5);
      int n = ((StringBuilder)localObject2).length();
      if (n > 0)
      {
        localObject5 = ", ";
        ((StringBuilder)localObject2).append((String)localObject5);
      }
      localObject5 = h.b.class;
      localObject3 = ((h.b)((Field)localObject3).getAnnotation((Class)localObject5)).a();
      ((StringBuilder)localObject2).append((String)localObject3);
      break;
      localObject5 = new java/lang/String;
      ((String)localObject5).<init>((String)localObject7);
    }
    int k = ((StringBuilder)localObject2).length();
    if (k > 0)
    {
      localObject5 = new com/google/ads/mediation/h$a;
      localObject1 = "Required server option(s) missing: ";
      localObject3 = String.valueOf(((StringBuilder)localObject2).toString());
      int i2 = ((String)localObject3).length();
      if (i2 != 0) {
        localObject3 = ((String)localObject1).concat((String)localObject3);
      }
      for (;;)
      {
        ((h.a)localObject5).<init>((String)localObject3);
        throw ((Throwable)localObject5);
        localObject3 = new java/lang/String;
        ((String)localObject3).<init>((String)localObject1);
      }
    }
  }
}


/* Location:              com/google/ads/mediation/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */