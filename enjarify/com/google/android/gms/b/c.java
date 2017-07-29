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
  private final SparseArray d;
  
  private c(af paramaf)
  {
    super(paramaf);
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    d = localSparseArray;
    e.a("AutoManageHelper", this);
  }
  
  public static c a(ad paramad)
  {
    Object localObject1 = a;
    boolean bool = localObject1 instanceof j;
    Object localObject2;
    if (bool)
    {
      localObject1 = ar.a((j)a);
      localObject2 = localObject1;
      Class localClass = c.class;
      localObject1 = (c)((af)localObject2).a("AutoManageHelper", localClass);
      if (localObject1 == null) {
        break label67;
      }
    }
    for (;;)
    {
      return (c)localObject1;
      localObject1 = ag.a((Activity)a);
      localObject2 = localObject1;
      break;
      label67:
      localObject1 = new com/google/android/gms/b/c;
      ((c)localObject1).<init>((af)localObject2);
    }
  }
  
  public final void a()
  {
    super.a();
    Object localObject1 = "AutoManageHelper";
    int i = a;
    String str1 = String.valueOf(d);
    int j = String.valueOf(str1).length() + 14;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(j);
    Object localObject2 = localStringBuilder.append("onStart ").append(i);
    String str2 = " ";
    localObject2 = str2 + str1;
    Log.d((String)localObject1, (String)localObject2);
    boolean bool = b;
    if (!bool)
    {
      bool = false;
      localObject1 = null;
      i = 0;
      localObject2 = null;
      for (;;)
      {
        localObject1 = d;
        int k = ((SparseArray)localObject1).size();
        if (i >= k) {
          break;
        }
        localObject1 = d.valueAt(i)).b;
        ((com.google.android.gms.common.api.c)localObject1).b();
        int m = i + 1;
        i = m;
      }
    }
  }
  
  public final void a(int paramInt, com.google.android.gms.common.api.c paramc, c.c paramc1)
  {
    int i = 54;
    com.google.android.gms.common.internal.c.a(paramc, "GoogleApiClient instance cannot be null");
    Object localObject1 = d;
    int j = ((SparseArray)localObject1).indexOfKey(paramInt);
    if (j < 0) {
      j = 1;
    }
    for (;;)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>(i);
      Object localObject3 = "Already managing a GoogleApiClient with id ";
      localObject2 = (String)localObject3 + paramInt;
      com.google.android.gms.common.internal.c.a(j, localObject2);
      boolean bool2 = a;
      boolean bool3 = b;
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>(i);
      localObject4 = ((StringBuilder)localObject4).append("starting AutoManage for client ").append(paramInt);
      String str = " ";
      localObject2 = ((StringBuilder)localObject4).append(str).append(bool2);
      localObject4 = " ";
      localObject2 = (String)localObject4 + bool3;
      Log.d("AutoManageHelper", (String)localObject2);
      localObject1 = new com/google/android/gms/b/c$a;
      ((c.a)localObject1).<init>(this, paramInt, paramc, paramc1);
      localObject2 = d;
      ((SparseArray)localObject2).put(paramInt, localObject1);
      boolean bool1 = a;
      if (bool1)
      {
        bool1 = b;
        if (!bool1)
        {
          localObject1 = "AutoManageHelper";
          localObject2 = String.valueOf(paramc);
          int k = String.valueOf(localObject2).length() + 11;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(k);
          localObject3 = ((StringBuilder)localObject4).append("connecting ");
          localObject2 = (String)localObject2;
          Log.d((String)localObject1, (String)localObject2);
          paramc.b();
        }
      }
      return;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  protected final void a(a parama, int paramInt)
  {
    Object localObject1 = "AutoManageHelper";
    Object localObject2 = "Unresolved error while connecting client. Stopping auto-manage.";
    Log.w((String)localObject1, (String)localObject2);
    Object localObject3;
    if (paramInt < 0)
    {
      localObject1 = "AutoManageHelper";
      localObject2 = "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set";
      localObject3 = new java/lang/Exception;
      ((Exception)localObject3).<init>();
      Log.wtf((String)localObject1, (String)localObject2, (Throwable)localObject3);
    }
    for (;;)
    {
      return;
      localObject1 = (c.a)d.get(paramInt);
      if (localObject1 != null)
      {
        localObject2 = (c.a)d.get(paramInt);
        localObject3 = d;
        ((SparseArray)localObject3).remove(paramInt);
        if (localObject2 != null)
        {
          localObject3 = b;
          ((com.google.android.gms.common.api.c)localObject3).b((c.c)localObject2);
          localObject2 = b;
          ((com.google.android.gms.common.api.c)localObject2).c();
        }
        localObject1 = c;
        if (localObject1 != null) {
          ((c.c)localObject1).a(parama);
        }
      }
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    Object localObject1 = null;
    for (int j = 0;; j = i)
    {
      localObject1 = d;
      i = ((SparseArray)localObject1).size();
      if (j >= i) {
        break;
      }
      localObject1 = (c.a)d.valueAt(j);
      Object localObject2 = paramPrintWriter.append(paramString).append("GoogleApiClient #");
      int k = a;
      ((PrintWriter)localObject2).print(k);
      paramPrintWriter.println(":");
      localObject1 = b;
      localObject2 = String.valueOf(paramString);
      String str = "  ";
      localObject2 = ((String)localObject2).concat(str);
      ((com.google.android.gms.common.api.c)localObject1).a((String)localObject2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      i = j + 1;
    }
  }
  
  public final void b()
  {
    super.b();
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = d;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = d.valueAt(j)).b;
      ((com.google.android.gms.common.api.c)localObject).c();
      i = j + 1;
    }
  }
  
  protected final void c()
  {
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = d;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = d.valueAt(j)).b;
      ((com.google.android.gms.common.api.c)localObject).b();
      i = j + 1;
    }
  }
}


/* Location:              com/google/android/gms/b/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */