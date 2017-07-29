package com.google.android.gms.b;

import android.content.Context;
import android.os.Environment;
import com.google.android.gms.ads.internal.w;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class kg
{
  BlockingQueue a;
  ExecutorService b;
  public LinkedHashMap c;
  Map d;
  String e;
  final Context f;
  final String g;
  AtomicBoolean h;
  File i;
  
  public kg(Context paramContext, String paramString1, String paramString2, Map paramMap)
  {
    Object localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    c = ((LinkedHashMap)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    d = ((Map)localObject1);
    f = paramContext;
    g = paramString1;
    e = paramString2;
    localObject1 = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject1).<init>(false);
    h = ((AtomicBoolean)localObject1);
    Object localObject2 = h;
    localObject1 = ke.V;
    Object localObject3 = w.q();
    boolean bool = ((Boolean)((kd)localObject3).a((jz)localObject1)).booleanValue();
    ((AtomicBoolean)localObject2).set(bool);
    localObject1 = h;
    bool = ((AtomicBoolean)localObject1).get();
    if (bool)
    {
      localObject1 = Environment.getExternalStorageDirectory();
      if (localObject1 != null)
      {
        localObject2 = new java/io/File;
        localObject3 = "sdk_csi_data.txt";
        ((File)localObject2).<init>((File)localObject1, (String)localObject3);
        i = ((File)localObject2);
      }
    }
    localObject1 = paramMap.entrySet();
    localObject3 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = ((Iterator)localObject3).next();
      localObject2 = localObject1;
      localObject2 = (Map.Entry)localObject1;
      LinkedHashMap localLinkedHashMap = c;
      localObject1 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = (String)((Map.Entry)localObject2).getValue();
      localLinkedHashMap.put(localObject1, localObject2);
    }
    localObject1 = new java/util/concurrent/ArrayBlockingQueue;
    ((ArrayBlockingQueue)localObject1).<init>(30);
    a = ((BlockingQueue)localObject1);
    localObject1 = Executors.newSingleThreadExecutor();
    b = ((ExecutorService)localObject1);
    localObject1 = b;
    localObject2 = new com/google/android/gms/b/kg$1;
    ((kg.1)localObject2).<init>(this);
    ((ExecutorService)localObject1).execute((Runnable)localObject2);
    localObject1 = d;
    localObject3 = kj.b;
    ((Map)localObject1).put("action", localObject3);
    localObject1 = d;
    localObject3 = kj.b;
    ((Map)localObject1).put("ad_format", localObject3);
    localObject1 = d;
    localObject3 = kj.c;
    ((Map)localObject1).put("e", localObject3);
  }
  
  public final kj a(String paramString)
  {
    kj localkj = (kj)d.get(paramString);
    if (localkj != null) {}
    for (;;)
    {
      return localkj;
      localkj = kj.a;
    }
  }
  
  final Map a(Map paramMap1, Map paramMap2)
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>(paramMap1);
    if (paramMap2 == null) {}
    for (Object localObject = localLinkedHashMap;; localObject = localLinkedHashMap)
    {
      return (Map)localObject;
      localObject = paramMap2.entrySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (Map.Entry)localIterator.next();
        String str1 = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        String str2 = (String)localLinkedHashMap.get(str1);
        kj localkj = a(str1);
        localObject = localkj.a(str2, (String)localObject);
        localLinkedHashMap.put(str1, localObject);
      }
    }
  }
  
  public final boolean a(km paramkm)
  {
    return a.offer(paramkm);
  }
}


/* Location:              com/google/android/gms/b/kg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */