package com.google.android.gms.b;

import android.app.Activity;
import android.support.v4.b.j;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c
  extends g
{
  private final SparseArray<a> d = new SparseArray();
  
  private c(af paramaf)
  {
    super(paramaf);
    e.a("AutoManageHelper", this);
  }
  
  public static c a(ad paramad)
  {
    if ((a instanceof j)) {}
    for (paramad = ar.a((j)a);; paramad = ag.a((Activity)a))
    {
      c localc = (c)paramad.a("AutoManageHelper", c.class);
      if (localc == null) {
        break;
      }
      return localc;
    }
    return new c(paramad);
  }
  
  public final void a()
  {
    super.a();
    boolean bool = a;
    String str = String.valueOf(d);
    Log.d("AutoManageHelper", String.valueOf(str).length() + 14 + "onStart " + bool + " " + str);
    if (!b)
    {
      int i = 0;
      while (i < d.size())
      {
        d.valueAt(i)).b.b();
        i += 1;
      }
    }
  }
  
  public final void a(int paramInt, com.google.android.gms.common.api.c paramc, c.c paramc1)
  {
    com.google.android.gms.common.internal.c.a(paramc, "GoogleApiClient instance cannot be null");
    if (d.indexOfKey(paramInt) < 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      com.google.android.gms.common.internal.c.a(bool1, 54 + "Already managing a GoogleApiClient with id " + paramInt);
      bool1 = a;
      boolean bool2 = b;
      Log.d("AutoManageHelper", 54 + "starting AutoManage for client " + paramInt + " " + bool1 + " " + bool2);
      paramc1 = new a(paramInt, paramc, paramc1);
      d.put(paramInt, paramc1);
      if ((a) && (!b))
      {
        paramc1 = String.valueOf(paramc);
        Log.d("AutoManageHelper", String.valueOf(paramc1).length() + 11 + "connecting " + paramc1);
        paramc.b();
      }
      return;
    }
  }
  
  protected final void a(a parama, int paramInt)
  {
    Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
    if (paramInt < 0) {
      Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
    }
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = (a)d.get(paramInt);
      } while (localObject == null);
      a locala = (a)d.get(paramInt);
      d.remove(paramInt);
      if (locala != null)
      {
        b.b(locala);
        b.c();
      }
      localObject = c;
    } while (localObject == null);
    ((c.c)localObject).a(parama);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    while (i < d.size())
    {
      a locala = (a)d.valueAt(i);
      paramPrintWriter.append(paramString).append("GoogleApiClient #").print(a);
      paramPrintWriter.println(":");
      b.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      i += 1;
    }
  }
  
  public final void b()
  {
    super.b();
    int i = 0;
    while (i < d.size())
    {
      d.valueAt(i)).b.c();
      i += 1;
    }
  }
  
  protected final void c()
  {
    int i = 0;
    while (i < d.size())
    {
      d.valueAt(i)).b.b();
      i += 1;
    }
  }
  
  private final class a
    implements c.c
  {
    public final int a;
    public final com.google.android.gms.common.api.c b;
    public final c.c c;
    
    public a(int paramInt, com.google.android.gms.common.api.c paramc, c.c paramc1)
    {
      a = paramInt;
      b = paramc;
      c = paramc1;
      paramc.a(this);
    }
    
    public final void a(a parama)
    {
      String str = String.valueOf(parama);
      Log.d("AutoManageHelper", String.valueOf(str).length() + 27 + "beginFailureResolution for " + str);
      b(parama, a);
    }
  }
}


/* Location:              com/google/android/gms/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */