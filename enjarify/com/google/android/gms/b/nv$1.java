package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.b.c;
import java.util.List;

final class nv$1
  implements Runnable
{
  nv$1(nv paramnv, nu paramnu) {}
  
  public final void run()
  {
    Object localObject1 = b;
    int m;
    for (;;)
    {
      synchronized (f)
      {
        localObject1 = b;
        int i = m;
        m = -2;
        if (i != m) {
          return;
        }
        localObject1 = b;
        localObject7 = b;
        localObject7 = ((nv)localObject7).b();
        l = ((od)localObject7);
        localObject1 = b;
        localObject1 = l;
        if (localObject1 == null)
        {
          localObject1 = b;
          m = 4;
          ((nv)localObject1).a(m);
        }
      }
      localObject3 = b;
      boolean bool1 = ((nv)localObject3).c();
      if (!bool1) {
        break;
      }
      localObject3 = b;
      m = 1;
      bool1 = ((nv)localObject3).b(m);
      if (bool1) {
        break;
      }
      localObject3 = b;
      localObject3 = a;
      localObject7 = String.valueOf(localObject3);
      m = ((String)localObject7).length() + 56;
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>(m);
      localObject7 = "Ignoring adapter ";
      localObject7 = ((StringBuilder)???).append((String)localObject7);
      localObject3 = ((StringBuilder)localObject7).append((String)localObject3);
      localObject7 = " as delayed impression is not supported";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject7);
      localObject3 = ((StringBuilder)localObject3).toString();
      tp.e((String)localObject3);
      localObject3 = b;
      m = 2;
      ((nv)localObject3).a(m);
    }
    Object localObject3 = a;
    localObject7 = b;
    for (;;)
    {
      synchronized (a)
      {
        b = ((nw.a)localObject7);
        nv localnv = b;
        nu localnu = a;
        localObject3 = b;
        localObject3 = i;
        String str1 = localnv.a((String)localObject3);
        try
        {
          localObject3 = g;
          int j = c;
          m = 4100000;
          if (j >= m) {
            break;
          }
          localObject3 = d;
          boolean bool2 = d;
          if (!bool2) {
            break label375;
          }
          localObject3 = l;
          localObject7 = e;
          localObject7 = b.a(localObject7);
          ??? = c;
          ((od)localObject3).a((a)localObject7, (ih)???, str1, localnu);
        }
        catch (RemoteException localRemoteException)
        {
          od localod1;
          ih localih;
          localObject7 = "Could not request ad from mediation adapter.";
          tp.c((String)localObject7, localRemoteException);
          int k = 5;
          localnv.a(k);
          continue;
          boolean bool3 = h;
          if (!bool3) {
            break label544;
          }
          od localod2 = l;
          Object localObject5 = e;
          a locala = b.a(localObject5);
          Object localObject9 = c;
          localObject5 = b;
          String str2 = a;
          Object localObject10 = i;
          List localList = j;
          Object localObject11 = str1;
          Object localObject12 = localnu;
          localod2.a(locala, (ih)localObject9, str1, str2, localnu, (le)localObject10, localList);
          continue;
          localObject5 = d;
          bool3 = d;
          if (!bool3) {
            break label625;
          }
          localod2 = l;
          localObject5 = e;
          locala = b.a(localObject5);
          localObject9 = c;
          localObject5 = b;
          str2 = a;
          localObject11 = str1;
          localObject12 = localnu;
          localod2.a(locala, (ih)localObject9, str1, str2, localnu);
          continue;
          bool3 = k;
          if (!bool3) {
            break label834;
          }
          localObject5 = b;
          localObject5 = l;
          if (localObject5 == null) {
            break label759;
          }
          localod2 = l;
          localObject5 = e;
          locala = b.a(localObject5);
          localObject9 = c;
          localObject5 = b;
          str2 = a;
          localObject10 = new com/google/android/gms/b/le;
          localObject5 = b;
          localObject5 = p;
          localObject5 = nv.b((String)localObject5);
          ((le)localObject10).<init>((c)localObject5);
          localObject5 = b;
          localList = o;
          localObject11 = str1;
          localObject12 = localnu;
          localod2.a(locala, (ih)localObject9, str1, str2, localnu, (le)localObject10, localList);
          continue;
          localod2 = l;
          localObject5 = e;
          locala = b.a(localObject5);
          localObject9 = d;
          localObject11 = c;
          localObject5 = b;
          localObject12 = a;
          str2 = str1;
          localObject10 = localnu;
          localod2.a(locala, (il)localObject9, (ih)localObject11, str1, (String)localObject12, localnu);
          continue;
          localod2 = l;
          localObject5 = e;
          locala = b.a(localObject5);
          localObject9 = d;
          localObject11 = c;
          localObject5 = b;
          localObject12 = a;
          str2 = str1;
          localObject10 = localnu;
          localod2.a(locala, (il)localObject9, (ih)localObject11, str1, (String)localObject12, localnu);
          continue;
        }
      }
      label375:
      localod1 = l;
      localObject7 = e;
      localObject7 = b.a(localObject7);
      ??? = d;
      localih = c;
      localod1.a((a)localObject7, (il)???, localih, str1, localnu);
    }
  }
}


/* Location:              com/google/android/gms/b/nv$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */