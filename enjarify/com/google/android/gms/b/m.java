package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class m
  implements ac
{
  final Map a;
  final Map b;
  final t c;
  final Lock d;
  final Condition e;
  final boolean f;
  boolean g;
  Map h;
  Map i;
  com.google.android.gms.common.a j;
  private final Map k;
  private final x l;
  private final Looper m;
  private final com.google.android.gms.common.m n;
  private final p o;
  private final boolean p;
  private final Queue q;
  private m.b r;
  
  public m(Context paramContext, Lock paramLock, Looper paramLooper, com.google.android.gms.common.m paramm, Map paramMap1, p paramp, Map paramMap2, a.b paramb, ArrayList paramArrayList, t paramt, boolean paramBoolean)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    b = ((Map)localObject1);
    localObject1 = new java/util/LinkedList;
    ((LinkedList)localObject1).<init>();
    q = ((Queue)localObject1);
    d = paramLock;
    m = paramLooper;
    localObject1 = paramLock.newCondition();
    e = ((Condition)localObject1);
    n = paramm;
    c = paramt;
    k = paramMap2;
    o = paramp;
    p = paramBoolean;
    HashMap localHashMap1 = new java/util/HashMap;
    localHashMap1.<init>();
    localObject1 = paramMap2.keySet();
    Object localObject2 = ((Set)localObject1).iterator();
    boolean bool1;
    Object localObject3;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.google.android.gms.common.api.a)((Iterator)localObject2).next();
      localObject3 = ((com.google.android.gms.common.api.a)localObject1).b();
      localHashMap1.put(localObject3, localObject1);
    }
    HashMap localHashMap2 = new java/util/HashMap;
    localHashMap2.<init>();
    localObject2 = paramArrayList.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (i)((Iterator)localObject2).next();
      localObject3 = a;
      localHashMap2.put(localObject3, localObject1);
    }
    localObject1 = paramMap1.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject4 = localObject1;
      localObject4 = (Map.Entry)localObject1;
      localObject1 = ((Map.Entry)localObject4).getKey();
      localObject3 = (com.google.android.gms.common.api.a)localHashMap1.get(localObject1);
      a.f localf = (a.f)((Map.Entry)localObject4).getValue();
      ((Boolean)k.get(localObject3)).booleanValue();
      i locali = (i)localHashMap2.get(localObject3);
      localObject1 = new com/google/android/gms/b/l;
      localObject2 = paramContext;
      ((l)localObject1).<init>(paramContext, (com.google.android.gms.common.api.a)localObject3, paramLooper, localf, locali, paramp, paramb);
      localObject3 = a;
      localObject2 = (a.d)((Map.Entry)localObject4).getKey();
      ((Map)localObject3).put(localObject2, localObject1);
      boolean bool2 = localf.d();
      if (bool2)
      {
        localObject3 = b;
        localObject2 = (a.d)((Map.Entry)localObject4).getKey();
        ((Map)localObject3).put(localObject2, localObject1);
      }
    }
    f = false;
    localObject1 = x.a();
    l = ((x)localObject1);
  }
  
  /* Error */
  private com.google.android.gms.common.a a(a.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   4: astore_2
    //   5: aload_2
    //   6: invokeinterface 186 1 0
    //   11: aload_0
    //   12: getfield 45	com/google/android/gms/b/m:a	Ljava/util/Map;
    //   15: astore_2
    //   16: aload_2
    //   17: aload_1
    //   18: invokeinterface 125 2 0
    //   23: astore_2
    //   24: aload_2
    //   25: checkcast 137	com/google/android/gms/b/l
    //   28: astore_2
    //   29: aload_0
    //   30: getfield 168	com/google/android/gms/b/m:h	Ljava/util/Map;
    //   33: astore_3
    //   34: aload_3
    //   35: ifnull +43 -> 78
    //   38: aload_2
    //   39: ifnull +39 -> 78
    //   42: aload_0
    //   43: getfield 168	com/google/android/gms/b/m:h	Ljava/util/Map;
    //   46: astore_3
    //   47: aload_2
    //   48: getfield 166	com/google/android/gms/common/api/n:b	Lcom/google/android/gms/b/wn;
    //   51: astore_2
    //   52: aload_3
    //   53: aload_2
    //   54: invokeinterface 125 2 0
    //   59: astore_2
    //   60: aload_2
    //   61: checkcast 170	com/google/android/gms/common/a
    //   64: astore_2
    //   65: aload_0
    //   66: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   69: astore_3
    //   70: aload_3
    //   71: invokeinterface 189 1 0
    //   76: aload_2
    //   77: areturn
    //   78: aload_0
    //   79: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   82: invokeinterface 189 1 0
    //   87: aconst_null
    //   88: astore_2
    //   89: goto -13 -> 76
    //   92: astore_2
    //   93: aload_0
    //   94: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   97: invokeinterface 189 1 0
    //   102: aload_2
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	m
    //   0	104	1	paramd	a.d
    //   4	85	2	localObject1	Object
    //   92	11	2	localObject2	Object
    //   33	38	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   11	15	92	finally
    //   17	23	92	finally
    //   24	28	92	finally
    //   29	33	92	finally
    //   42	46	92	finally
    //   47	51	92	finally
    //   53	59	92	finally
    //   60	64	92	finally
  }
  
  public final f.a a(f.a parama)
  {
    int i1 = 4;
    a.d locald = a;
    boolean bool = p;
    Object localObject1;
    Object localObject3;
    Object localObject4;
    int i3;
    if (bool)
    {
      localObject1 = a;
      Object localObject2 = a((a.d)localObject1);
      if (localObject2 != null)
      {
        int i2 = c;
        if (i2 == i1)
        {
          localObject2 = new com/google/android/gms/common/api/Status;
          localObject3 = l;
          localObject4 = a.get(localObject1)).b;
          i3 = System.identityHashCode(c);
          localObject1 = (x.a)f.get(localObject4);
          if (localObject1 == null)
          {
            bool = false;
            localObject1 = null;
            ((Status)localObject2).<init>(i1, null, (PendingIntent)localObject1);
            parama.a((Status)localObject2);
            bool = true;
            label135:
            if (!bool) {
              break label250;
            }
          }
        }
      }
    }
    for (;;)
    {
      return parama;
      localObject1 = (x.a)f.get(localObject4);
      localObject4 = f;
      if (localObject4 == null) {
        bool = false;
      }
      for (localObject1 = null;; localObject1 = f.g)
      {
        if (localObject1 != null) {
          break label204;
        }
        bool = false;
        localObject1 = null;
        break;
      }
      label204:
      localObject3 = c;
      localObject1 = ((ec)localObject1).e();
      int i4 = 134217728;
      localObject1 = PendingIntent.getActivity((Context)localObject3, i3, (Intent)localObject1, i4);
      break;
      bool = false;
      localObject1 = null;
      break label135;
      label250:
      c.k.a(parama);
      localObject1 = (l)a.get(locald);
      parama = ((l)localObject1).a(parama);
    }
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface 186 1 0
    //   11: aload_0
    //   12: getfield 294	com/google/android/gms/b/m:g	Z
    //   15: istore_2
    //   16: iload_2
    //   17: ifeq +15 -> 32
    //   20: aload_0
    //   21: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   24: astore_1
    //   25: aload_1
    //   26: invokeinterface 189 1 0
    //   31: return
    //   32: iconst_1
    //   33: istore_2
    //   34: aload_0
    //   35: iload_2
    //   36: putfield 294	com/google/android/gms/b/m:g	Z
    //   39: iconst_0
    //   40: istore_2
    //   41: aconst_null
    //   42: astore_1
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield 168	com/google/android/gms/b/m:h	Ljava/util/Map;
    //   48: iconst_0
    //   49: istore_2
    //   50: aconst_null
    //   51: astore_1
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 296	com/google/android/gms/b/m:i	Ljava/util/Map;
    //   57: iconst_0
    //   58: istore_2
    //   59: aconst_null
    //   60: astore_1
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 298	com/google/android/gms/b/m:r	Lcom/google/android/gms/b/m$b;
    //   66: iconst_0
    //   67: istore_2
    //   68: aconst_null
    //   69: astore_1
    //   70: aload_0
    //   71: aconst_null
    //   72: putfield 300	com/google/android/gms/b/m:j	Lcom/google/android/gms/common/a;
    //   75: aload_0
    //   76: getfield 153	com/google/android/gms/b/m:l	Lcom/google/android/gms/b/x;
    //   79: astore_1
    //   80: aload_1
    //   81: invokevirtual 302	com/google/android/gms/b/x:b	()V
    //   84: aload_0
    //   85: getfield 153	com/google/android/gms/b/m:l	Lcom/google/android/gms/b/x;
    //   88: astore_3
    //   89: aload_0
    //   90: getfield 45	com/google/android/gms/b/m:a	Ljava/util/Map;
    //   93: astore_1
    //   94: aload_1
    //   95: invokeinterface 157 1 0
    //   100: astore_1
    //   101: new 304	com/google/android/gms/b/d
    //   104: astore 4
    //   106: aload 4
    //   108: aload_1
    //   109: invokespecial 307	com/google/android/gms/b/d:<init>	(Ljava/lang/Iterable;)V
    //   112: aload_1
    //   113: invokeinterface 310 1 0
    //   118: astore 5
    //   120: aload 5
    //   122: invokeinterface 92 1 0
    //   127: istore_2
    //   128: iload_2
    //   129: ifeq +149 -> 278
    //   132: aload 5
    //   134: invokeinterface 96 1 0
    //   139: astore_1
    //   140: aload_1
    //   141: checkcast 162	com/google/android/gms/common/api/n
    //   144: astore_1
    //   145: aload_3
    //   146: getfield 251	com/google/android/gms/b/x:f	Ljava/util/Map;
    //   149: astore 6
    //   151: aload_1
    //   152: getfield 166	com/google/android/gms/common/api/n:b	Lcom/google/android/gms/b/wn;
    //   155: astore_1
    //   156: aload 6
    //   158: aload_1
    //   159: invokeinterface 125 2 0
    //   164: astore_1
    //   165: aload_1
    //   166: checkcast 253	com/google/android/gms/b/x$a
    //   169: astore_1
    //   170: aload_1
    //   171: ifnull +12 -> 183
    //   174: aload_1
    //   175: invokevirtual 312	com/google/android/gms/b/x$a:i	()Z
    //   178: istore_2
    //   179: iload_2
    //   180: ifne -60 -> 120
    //   183: aload_3
    //   184: getfield 315	com/google/android/gms/b/x:i	Landroid/os/Handler;
    //   187: astore_1
    //   188: aload_3
    //   189: getfield 315	com/google/android/gms/b/x:i	Landroid/os/Handler;
    //   192: astore_3
    //   193: iconst_2
    //   194: istore 7
    //   196: aload_3
    //   197: iload 7
    //   199: aload 4
    //   201: invokevirtual 322	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   204: astore_3
    //   205: aload_1
    //   206: aload_3
    //   207: invokevirtual 326	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   210: pop
    //   211: aload 4
    //   213: getfield 329	com/google/android/gms/b/d:b	Lcom/google/android/gms/c/c;
    //   216: astore_1
    //   217: aload_1
    //   218: getfield 334	com/google/android/gms/c/c:a	Lcom/google/android/gms/c/h;
    //   221: astore_1
    //   222: new 336	com/google/android/gms/b/ax
    //   225: astore_3
    //   226: aload_0
    //   227: getfield 56	com/google/android/gms/b/m:m	Landroid/os/Looper;
    //   230: astore 4
    //   232: aload_3
    //   233: aload 4
    //   235: invokespecial 339	com/google/android/gms/b/ax:<init>	(Landroid/os/Looper;)V
    //   238: new 341	com/google/android/gms/b/m$a
    //   241: astore 4
    //   243: iconst_0
    //   244: istore 7
    //   246: aconst_null
    //   247: astore 5
    //   249: aload 4
    //   251: aload_0
    //   252: iconst_0
    //   253: invokespecial 344	com/google/android/gms/b/m$a:<init>	(Lcom/google/android/gms/b/m;B)V
    //   256: aload_1
    //   257: aload_3
    //   258: aload 4
    //   260: invokevirtual 349	com/google/android/gms/c/b:a	(Ljava/util/concurrent/Executor;Lcom/google/android/gms/c/a;)Lcom/google/android/gms/c/b;
    //   263: pop
    //   264: aload_0
    //   265: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   268: astore_1
    //   269: aload_1
    //   270: invokeinterface 189 1 0
    //   275: goto -244 -> 31
    //   278: aload 4
    //   280: getfield 329	com/google/android/gms/b/d:b	Lcom/google/android/gms/c/c;
    //   283: astore_1
    //   284: aload_1
    //   285: invokevirtual 351	com/google/android/gms/c/c:a	()V
    //   288: aload 4
    //   290: getfield 329	com/google/android/gms/b/d:b	Lcom/google/android/gms/c/c;
    //   293: astore_1
    //   294: aload_1
    //   295: getfield 334	com/google/android/gms/c/c:a	Lcom/google/android/gms/c/h;
    //   298: astore_1
    //   299: goto -77 -> 222
    //   302: astore_1
    //   303: aload_0
    //   304: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   307: invokeinterface 189 1 0
    //   312: aload_1
    //   313: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	314	0	this	m
    //   4	295	1	localObject1	Object
    //   302	11	1	localObject2	Object
    //   15	165	2	bool	boolean
    //   88	170	3	localObject3	Object
    //   104	185	4	localObject4	Object
    //   118	130	5	localIterator	Iterator
    //   149	8	6	localMap	Map
    //   194	51	7	i1	int
    // Exception table:
    //   from	to	target	type
    //   11	15	302	finally
    //   35	39	302	finally
    //   44	48	302	finally
    //   53	57	302	finally
    //   62	66	302	finally
    //   71	75	302	finally
    //   75	79	302	finally
    //   80	84	302	finally
    //   84	88	302	finally
    //   89	93	302	finally
    //   94	100	302	finally
    //   101	104	302	finally
    //   108	112	302	finally
    //   112	118	302	finally
    //   120	127	302	finally
    //   132	139	302	finally
    //   140	144	302	finally
    //   145	149	302	finally
    //   151	155	302	finally
    //   158	164	302	finally
    //   165	169	302	finally
    //   174	178	302	finally
    //   183	187	302	finally
    //   188	192	302	finally
    //   199	204	302	finally
    //   206	211	302	finally
    //   211	216	302	finally
    //   217	221	302	finally
    //   222	225	302	finally
    //   226	230	302	finally
    //   233	238	302	finally
    //   238	241	302	finally
    //   252	256	302	finally
    //   258	264	302	finally
    //   278	283	302	finally
    //   284	288	302	finally
    //   288	293	302	finally
    //   294	298	302	finally
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public final void b()
  {
    d.lock();
    boolean bool = false;
    Object localObject1 = null;
    try
    {
      g = false;
      bool = false;
      localObject1 = null;
      h = null;
      bool = false;
      localObject1 = null;
      i = null;
      localObject1 = r;
      if (localObject1 != null)
      {
        bool = false;
        localObject1 = null;
        r = null;
      }
      bool = false;
      localObject1 = null;
      j = null;
      for (;;)
      {
        localObject1 = q;
        bool = ((Queue)localObject1).isEmpty();
        if (bool) {
          break;
        }
        localObject1 = q;
        localObject1 = ((Queue)localObject1).remove();
        localObject1 = (f.a)localObject1;
        ((f.a)localObject1).a(null);
        ((f.a)localObject1).b();
      }
      localCondition = e;
    }
    finally
    {
      d.unlock();
    }
    Condition localCondition;
    localCondition.signalAll();
    d.unlock();
  }
  
  /* Error */
  public final boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface 186 1 0
    //   11: aload_0
    //   12: getfield 168	com/google/android/gms/b/m:h	Ljava/util/Map;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull +25 -> 42
    //   20: aload_0
    //   21: getfield 300	com/google/android/gms/b/m:j	Lcom/google/android/gms/common/a;
    //   24: astore_1
    //   25: aload_1
    //   26: ifnonnull +16 -> 42
    //   29: iconst_1
    //   30: istore_2
    //   31: aload_0
    //   32: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   35: invokeinterface 189 1 0
    //   40: iload_2
    //   41: ireturn
    //   42: iconst_0
    //   43: istore_2
    //   44: aconst_null
    //   45: astore_1
    //   46: goto -15 -> 31
    //   49: astore_1
    //   50: aload_0
    //   51: getfield 54	com/google/android/gms/b/m:d	Ljava/util/concurrent/locks/Lock;
    //   54: invokeinterface 189 1 0
    //   59: aload_1
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	m
    //   4	42	1	localObject1	Object
    //   49	11	1	localObject2	Object
    //   30	14	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	15	49	finally
    //   20	24	49	finally
  }
  
  public final void d() {}
}


/* Location:              com/google/android/gms/b/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */