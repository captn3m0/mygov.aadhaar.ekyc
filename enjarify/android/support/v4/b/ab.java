package android.support.v4.b;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.f.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ab
{
  static final ab.h a;
  
  static
  {
    boolean bool = a.a();
    Object localObject;
    if (bool)
    {
      localObject = new android/support/v4/b/ab$k;
      ((ab.k)localObject).<init>();
      a = (ab.h)localObject;
    }
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i >= j)
      {
        localObject = new android/support/v4/b/ab$j;
        ((ab.j)localObject).<init>();
        a = (ab.h)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 20;
        if (i >= j)
        {
          localObject = new android/support/v4/b/ab$i;
          ((ab.i)localObject).<init>();
          a = (ab.h)localObject;
        }
        else
        {
          i = Build.VERSION.SDK_INT;
          j = 19;
          if (i >= j)
          {
            localObject = new android/support/v4/b/ab$p;
            ((ab.p)localObject).<init>();
            a = (ab.h)localObject;
          }
          else
          {
            i = Build.VERSION.SDK_INT;
            j = 16;
            if (i >= j)
            {
              localObject = new android/support/v4/b/ab$o;
              ((ab.o)localObject).<init>();
              a = (ab.h)localObject;
            }
            else
            {
              i = Build.VERSION.SDK_INT;
              j = 14;
              if (i >= j)
              {
                localObject = new android/support/v4/b/ab$n;
                ((ab.n)localObject).<init>();
                a = (ab.h)localObject;
              }
              else
              {
                i = Build.VERSION.SDK_INT;
                j = 11;
                if (i >= j)
                {
                  localObject = new android/support/v4/b/ab$m;
                  ((ab.m)localObject).<init>();
                  a = (ab.h)localObject;
                }
                else
                {
                  localObject = new android/support/v4/b/ab$l;
                  ((ab.l)localObject).<init>();
                  a = (ab.h)localObject;
                }
              }
            }
          }
        }
      }
    }
  }
  
  static void a(aa paramaa, ab.q paramq)
  {
    boolean bool1;
    Object localObject1;
    boolean bool2;
    CharSequence localCharSequence1;
    Object localObject2;
    if (paramq != null)
    {
      bool1 = paramq instanceof ab.c;
      if (!bool1) {
        break label53;
      }
      paramq = (ab.c)paramq;
      localObject1 = e;
      bool2 = g;
      localCharSequence1 = f;
      localObject2 = a;
      ah.a(paramaa, (CharSequence)localObject1, bool2, localCharSequence1, (CharSequence)localObject2);
    }
    for (;;)
    {
      return;
      label53:
      bool1 = paramq instanceof ab.f;
      if (bool1)
      {
        paramq = (ab.f)paramq;
        localObject1 = e;
        bool2 = g;
        localCharSequence1 = f;
        localObject2 = a;
        ah.a(paramaa, (CharSequence)localObject1, bool2, localCharSequence1, (ArrayList)localObject2);
      }
      else
      {
        bool1 = paramq instanceof ab.b;
        if (bool1)
        {
          paramq = (ab.b)paramq;
          CharSequence localCharSequence2 = e;
          boolean bool3 = g;
          localObject2 = f;
          Bitmap localBitmap1 = a;
          Bitmap localBitmap2 = b;
          boolean bool4 = c;
          localObject1 = paramaa;
          ah.a(paramaa, localCharSequence2, bool3, (CharSequence)localObject2, localBitmap1, localBitmap2, bool4);
        }
      }
    }
  }
  
  static void a(z paramz, ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ab.a locala = (ab.a)localIterator.next();
      paramz.a(locala);
    }
  }
  
  static void b(aa paramaa, ab.q paramq)
  {
    if (paramq != null)
    {
      boolean bool = paramq instanceof ab.g;
      if (!bool) {
        break label232;
      }
      paramq = (ab.g)paramq;
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>();
      ArrayList localArrayList3 = new java/util/ArrayList;
      localArrayList3.<init>();
      ArrayList localArrayList4 = new java/util/ArrayList;
      localArrayList4.<init>();
      ArrayList localArrayList5 = new java/util/ArrayList;
      localArrayList5.<init>();
      Object localObject1 = c;
      Object localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (ab.g.a)((Iterator)localObject2).next();
        localObject3 = a;
        localArrayList1.add(localObject3);
        long l = b;
        localObject3 = Long.valueOf(l);
        localArrayList2.add(localObject3);
        localObject3 = c;
        localArrayList3.add(localObject3);
        localObject3 = d;
        localArrayList4.add(localObject3);
        localObject1 = e;
        localArrayList5.add(localObject1);
      }
      localObject2 = a;
      Object localObject3 = b;
      localObject1 = paramaa;
      ae.a(paramaa, (CharSequence)localObject2, (CharSequence)localObject3, localArrayList1, localArrayList2, localArrayList3, localArrayList4, localArrayList5);
    }
    for (;;)
    {
      return;
      label232:
      a(paramaa, paramq);
    }
  }
}


/* Location:              android/support/v4/b/ab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */