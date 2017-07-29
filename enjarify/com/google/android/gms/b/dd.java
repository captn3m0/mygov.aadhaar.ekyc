package com.google.android.gms.b;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.o;
import com.google.android.gms.common.p;
import com.google.android.gms.common.util.m;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class dd
  extends cq.a
{
  private final dc a;
  private Boolean b;
  private String c;
  
  public dd(dc paramdc)
  {
    this(paramdc, (byte)0);
  }
  
  private dd(dc paramdc, byte paramByte)
  {
    com.google.android.gms.common.internal.c.a(paramdc);
    a = paramdc;
    c = null;
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = TextUtils.isEmpty(paramString);
    if (bool2)
    {
      a.e().a.a("Measurement Service called without app package");
      localObject1 = new java/lang/SecurityException;
      ((SecurityException)localObject1).<init>("Measurement Service called without app package");
      throw ((Throwable)localObject1);
    }
    if (paramBoolean) {}
    try
    {
      Object localObject2 = b;
      int j;
      if (localObject2 == null)
      {
        localObject2 = "com.google.android.gms";
        localObject3 = c;
        bool2 = ((String)localObject2).equals(localObject3);
        if (!bool2)
        {
          localObject2 = a;
          localObject2 = a;
          j = Binder.getCallingUid();
          bool2 = m.a((Context)localObject2, j);
          if (!bool2)
          {
            localObject2 = a;
            localObject2 = a;
            localObject2 = p.a((Context)localObject2);
            localObject3 = a;
            localObject3 = a;
            ((Context)localObject3).getPackageManager();
            j = Binder.getCallingUid();
            bool2 = ((p)localObject2).a(j);
            if (!bool2) {
              break label181;
            }
          }
        }
        bool1 = i;
        label181:
        localObject1 = Boolean.valueOf(bool1);
        b = ((Boolean)localObject1);
      }
      localObject1 = b;
      bool1 = ((Boolean)localObject1).booleanValue();
      if (!bool1)
      {
        localObject1 = c;
        if (localObject1 == null)
        {
          localObject1 = a;
          localObject1 = a;
          i = Binder.getCallingUid();
          bool1 = o.a((Context)localObject1, i, paramString);
          if (bool1) {
            c = paramString;
          }
        }
        localObject1 = c;
        bool1 = paramString.equals(localObject1);
        if (!bool1)
        {
          localObject1 = new java/lang/SecurityException;
          localObject4 = "Unknown calling package name '%s'.";
          bool2 = true;
          localObject2 = new Object[bool2];
          j = 0;
          localObject3 = null;
          localObject2[0] = paramString;
          localObject4 = String.format((String)localObject4, (Object[])localObject2);
          ((SecurityException)localObject1).<init>((String)localObject4);
          throw ((Throwable)localObject1);
        }
      }
    }
    catch (SecurityException localSecurityException)
    {
      Object localObject4 = a.e().a;
      Object localObject3 = cu.a(paramString);
      ((cu.a)localObject4).a("Measurement Service called with invalid calling package. appId", localObject3);
      throw localSecurityException;
    }
  }
  
  private void d(ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramca);
    Object localObject = a;
    a((String)localObject, false);
    localObject = a.i();
    String str = b;
    ((dr)localObject).f(str);
  }
  
  /* Error */
  public final List a(ca paramca, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 147	com/google/android/gms/b/dd:d	(Lcom/google/android/gms/b/ca;)V
    //   5: aload_0
    //   6: getfield 24	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   9: invokevirtual 150	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   12: astore_3
    //   13: new 152	com/google/android/gms/b/dd$7
    //   16: astore 4
    //   18: aload 4
    //   20: aload_0
    //   21: aload_1
    //   22: invokespecial 155	com/google/android/gms/b/dd$7:<init>	(Lcom/google/android/gms/b/dd;Lcom/google/android/gms/b/ca;)V
    //   25: aload_3
    //   26: aload 4
    //   28: invokevirtual 160	com/google/android/gms/b/db:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   31: astore_3
    //   32: aload_3
    //   33: invokeinterface 166 1 0
    //   38: astore_3
    //   39: aload_3
    //   40: checkcast 168	java/util/List
    //   43: astore_3
    //   44: new 170	java/util/ArrayList
    //   47: astore 4
    //   49: aload_3
    //   50: invokeinterface 173 1 0
    //   55: istore 5
    //   57: aload 4
    //   59: iload 5
    //   61: invokespecial 176	java/util/ArrayList:<init>	(I)V
    //   64: aload_3
    //   65: invokeinterface 180 1 0
    //   70: astore 6
    //   72: aload 6
    //   74: invokeinterface 185 1 0
    //   79: istore 7
    //   81: iload 7
    //   83: ifeq +105 -> 188
    //   86: aload 6
    //   88: invokeinterface 188 1 0
    //   93: astore_3
    //   94: aload_3
    //   95: checkcast 190	com/google/android/gms/b/dq
    //   98: astore_3
    //   99: iload_2
    //   100: ifne +21 -> 121
    //   103: aload_3
    //   104: getfield 191	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   107: astore 8
    //   109: aload 8
    //   111: invokestatic 193	com/google/android/gms/b/dr:i	(Ljava/lang/String;)Z
    //   114: istore 9
    //   116: iload 9
    //   118: ifne -46 -> 72
    //   121: new 195	com/google/android/gms/b/do
    //   124: astore 8
    //   126: aload 8
    //   128: aload_3
    //   129: invokespecial 198	com/google/android/gms/b/do:<init>	(Lcom/google/android/gms/b/dq;)V
    //   132: aload 4
    //   134: aload 8
    //   136: invokeinterface 201 2 0
    //   141: pop
    //   142: goto -70 -> 72
    //   145: astore_3
    //   146: aload_0
    //   147: getfield 24	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   150: invokevirtual 39	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   153: getfield 44	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   156: astore 4
    //   158: ldc -53
    //   160: astore 6
    //   162: aload_1
    //   163: getfield 128	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   166: invokestatic 121	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   169: astore 8
    //   171: aload 4
    //   173: aload 6
    //   175: aload 8
    //   177: aload_3
    //   178: invokevirtual 206	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   181: iconst_0
    //   182: istore 7
    //   184: aconst_null
    //   185: astore_3
    //   186: aload_3
    //   187: areturn
    //   188: aload 4
    //   190: astore_3
    //   191: goto -5 -> 186
    //   194: astore_3
    //   195: goto -49 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	dd
    //   0	198	1	paramca	ca
    //   0	198	2	paramBoolean	boolean
    //   12	117	3	localObject1	Object
    //   145	33	3	localInterruptedException	InterruptedException
    //   185	6	3	localObject2	Object
    //   194	1	3	localExecutionException	ExecutionException
    //   16	173	4	localObject3	Object
    //   55	5	5	i	int
    //   70	104	6	localObject4	Object
    //   79	104	7	bool1	boolean
    //   107	69	8	localObject5	Object
    //   114	3	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   32	38	145	java/lang/InterruptedException
    //   39	43	145	java/lang/InterruptedException
    //   44	47	145	java/lang/InterruptedException
    //   49	55	145	java/lang/InterruptedException
    //   59	64	145	java/lang/InterruptedException
    //   64	70	145	java/lang/InterruptedException
    //   72	79	145	java/lang/InterruptedException
    //   86	93	145	java/lang/InterruptedException
    //   94	98	145	java/lang/InterruptedException
    //   103	107	145	java/lang/InterruptedException
    //   109	114	145	java/lang/InterruptedException
    //   121	124	145	java/lang/InterruptedException
    //   128	132	145	java/lang/InterruptedException
    //   134	142	145	java/lang/InterruptedException
    //   32	38	194	java/util/concurrent/ExecutionException
    //   39	43	194	java/util/concurrent/ExecutionException
    //   44	47	194	java/util/concurrent/ExecutionException
    //   49	55	194	java/util/concurrent/ExecutionException
    //   59	64	194	java/util/concurrent/ExecutionException
    //   64	70	194	java/util/concurrent/ExecutionException
    //   72	79	194	java/util/concurrent/ExecutionException
    //   86	93	194	java/util/concurrent/ExecutionException
    //   94	98	194	java/util/concurrent/ExecutionException
    //   103	107	194	java/util/concurrent/ExecutionException
    //   109	114	194	java/util/concurrent/ExecutionException
    //   121	124	194	java/util/concurrent/ExecutionException
    //   128	132	194	java/util/concurrent/ExecutionException
    //   134	142	194	java/util/concurrent/ExecutionException
  }
  
  public final List a(String paramString1, String paramString2, ca paramca)
  {
    d(paramca);
    Object localObject1 = a.f();
    localObject2 = new com/google/android/gms/b/dd$16;
    ((dd.16)localObject2).<init>(this, paramca, paramString1, paramString2);
    localObject1 = ((db)localObject1).a((Callable)localObject2);
    try
    {
      localObject1 = ((Future)localObject1).get();
      localObject1 = (List)localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject2 = a.e().a;
        String str = "Failed to get conditional user properties";
        ((cu.a)localObject2).a(str, localInterruptedException);
        List localList = Collections.emptyList();
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    return (List)localObject1;
  }
  
  public final List a(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = true;
    a(paramString1, bool);
    Object localObject1 = a.f();
    localObject2 = new com/google/android/gms/b/dd$17;
    ((dd.17)localObject2).<init>(this, paramString1, paramString2, paramString3);
    localObject1 = ((db)localObject1).a((Callable)localObject2);
    try
    {
      localObject1 = ((Future)localObject1).get();
      localObject1 = (List)localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject2 = a.e().a;
        String str = "Failed to get conditional user properties";
        ((cu.a)localObject2).a(str, localInterruptedException);
        List localList = Collections.emptyList();
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    return (List)localObject1;
  }
  
  /* Error */
  public final List a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aload_0
    //   4: aload_1
    //   5: iload 5
    //   7: invokespecial 131	com/google/android/gms/b/dd:a	(Ljava/lang/String;Z)V
    //   10: aload_0
    //   11: getfield 24	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   14: invokevirtual 150	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   17: astore 6
    //   19: new 230	com/google/android/gms/b/dd$15
    //   22: astore 7
    //   24: aload 7
    //   26: aload_0
    //   27: aload_1
    //   28: aload_2
    //   29: aload_3
    //   30: invokespecial 231	com/google/android/gms/b/dd$15:<init>	(Lcom/google/android/gms/b/dd;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   33: aload 6
    //   35: aload 7
    //   37: invokevirtual 160	com/google/android/gms/b/db:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   40: astore 6
    //   42: aload 6
    //   44: invokeinterface 166 1 0
    //   49: astore 6
    //   51: aload 6
    //   53: checkcast 168	java/util/List
    //   56: astore 6
    //   58: new 170	java/util/ArrayList
    //   61: astore 7
    //   63: aload 6
    //   65: invokeinterface 173 1 0
    //   70: istore 8
    //   72: aload 7
    //   74: iload 8
    //   76: invokespecial 176	java/util/ArrayList:<init>	(I)V
    //   79: aload 6
    //   81: invokeinterface 180 1 0
    //   86: astore 9
    //   88: aload 9
    //   90: invokeinterface 185 1 0
    //   95: istore 5
    //   97: iload 5
    //   99: ifeq +111 -> 210
    //   102: aload 9
    //   104: invokeinterface 188 1 0
    //   109: astore 6
    //   111: aload 6
    //   113: checkcast 190	com/google/android/gms/b/dq
    //   116: astore 6
    //   118: iload 4
    //   120: ifne +22 -> 142
    //   123: aload 6
    //   125: getfield 191	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   128: astore 10
    //   130: aload 10
    //   132: invokestatic 193	com/google/android/gms/b/dr:i	(Ljava/lang/String;)Z
    //   135: istore 11
    //   137: iload 11
    //   139: ifne -51 -> 88
    //   142: new 195	com/google/android/gms/b/do
    //   145: astore 10
    //   147: aload 10
    //   149: aload 6
    //   151: invokespecial 198	com/google/android/gms/b/do:<init>	(Lcom/google/android/gms/b/dq;)V
    //   154: aload 7
    //   156: aload 10
    //   158: invokeinterface 201 2 0
    //   163: pop
    //   164: goto -76 -> 88
    //   167: astore 6
    //   169: aload_0
    //   170: getfield 24	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   173: invokevirtual 39	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   176: getfield 44	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   179: astore 7
    //   181: ldc -53
    //   183: astore 9
    //   185: aload_1
    //   186: invokestatic 121	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   189: astore 10
    //   191: aload 7
    //   193: aload 9
    //   195: aload 10
    //   197: aload 6
    //   199: invokevirtual 206	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   202: invokestatic 223	java/util/Collections:emptyList	()Ljava/util/List;
    //   205: astore 6
    //   207: aload 6
    //   209: areturn
    //   210: aload 7
    //   212: astore 6
    //   214: goto -7 -> 207
    //   217: astore 6
    //   219: goto -50 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	dd
    //   0	222	1	paramString1	String
    //   0	222	2	paramString2	String
    //   0	222	3	paramString3	String
    //   0	222	4	paramBoolean	boolean
    //   1	97	5	bool1	boolean
    //   17	133	6	localObject1	Object
    //   167	31	6	localInterruptedException	InterruptedException
    //   205	8	6	localObject2	Object
    //   217	1	6	localExecutionException	ExecutionException
    //   22	189	7	localObject3	Object
    //   70	5	8	i	int
    //   86	108	9	localObject4	Object
    //   128	68	10	localObject5	Object
    //   135	3	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   42	49	167	java/lang/InterruptedException
    //   51	56	167	java/lang/InterruptedException
    //   58	61	167	java/lang/InterruptedException
    //   63	70	167	java/lang/InterruptedException
    //   74	79	167	java/lang/InterruptedException
    //   79	86	167	java/lang/InterruptedException
    //   88	95	167	java/lang/InterruptedException
    //   102	109	167	java/lang/InterruptedException
    //   111	116	167	java/lang/InterruptedException
    //   123	128	167	java/lang/InterruptedException
    //   130	135	167	java/lang/InterruptedException
    //   142	145	167	java/lang/InterruptedException
    //   149	154	167	java/lang/InterruptedException
    //   156	164	167	java/lang/InterruptedException
    //   42	49	217	java/util/concurrent/ExecutionException
    //   51	56	217	java/util/concurrent/ExecutionException
    //   58	61	217	java/util/concurrent/ExecutionException
    //   63	70	217	java/util/concurrent/ExecutionException
    //   74	79	217	java/util/concurrent/ExecutionException
    //   79	86	217	java/util/concurrent/ExecutionException
    //   88	95	217	java/util/concurrent/ExecutionException
    //   102	109	217	java/util/concurrent/ExecutionException
    //   111	116	217	java/util/concurrent/ExecutionException
    //   123	128	217	java/util/concurrent/ExecutionException
    //   130	135	217	java/util/concurrent/ExecutionException
    //   142	145	217	java/util/concurrent/ExecutionException
    //   149	154	217	java/util/concurrent/ExecutionException
    //   156	164	217	java/util/concurrent/ExecutionException
  }
  
  /* Error */
  public final List a(String paramString1, String paramString2, boolean paramBoolean, ca paramca)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload 4
    //   3: invokespecial 147	com/google/android/gms/b/dd:d	(Lcom/google/android/gms/b/ca;)V
    //   6: aload_0
    //   7: getfield 24	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   10: invokevirtual 150	com/google/android/gms/b/dc:f	()Lcom/google/android/gms/b/db;
    //   13: astore 5
    //   15: new 233	com/google/android/gms/b/dd$14
    //   18: astore 6
    //   20: aload 6
    //   22: aload_0
    //   23: aload 4
    //   25: aload_1
    //   26: aload_2
    //   27: invokespecial 234	com/google/android/gms/b/dd$14:<init>	(Lcom/google/android/gms/b/dd;Lcom/google/android/gms/b/ca;Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload 5
    //   32: aload 6
    //   34: invokevirtual 160	com/google/android/gms/b/db:a	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   37: astore 5
    //   39: aload 5
    //   41: invokeinterface 166 1 0
    //   46: astore 5
    //   48: aload 5
    //   50: checkcast 168	java/util/List
    //   53: astore 5
    //   55: new 170	java/util/ArrayList
    //   58: astore 6
    //   60: aload 5
    //   62: invokeinterface 173 1 0
    //   67: istore 7
    //   69: aload 6
    //   71: iload 7
    //   73: invokespecial 176	java/util/ArrayList:<init>	(I)V
    //   76: aload 5
    //   78: invokeinterface 180 1 0
    //   83: astore 8
    //   85: aload 8
    //   87: invokeinterface 185 1 0
    //   92: istore 9
    //   94: iload 9
    //   96: ifeq +114 -> 210
    //   99: aload 8
    //   101: invokeinterface 188 1 0
    //   106: astore 5
    //   108: aload 5
    //   110: checkcast 190	com/google/android/gms/b/dq
    //   113: astore 5
    //   115: iload_3
    //   116: ifne +22 -> 138
    //   119: aload 5
    //   121: getfield 191	com/google/android/gms/b/dq:c	Ljava/lang/String;
    //   124: astore 10
    //   126: aload 10
    //   128: invokestatic 193	com/google/android/gms/b/dr:i	(Ljava/lang/String;)Z
    //   131: istore 11
    //   133: iload 11
    //   135: ifne -50 -> 85
    //   138: new 195	com/google/android/gms/b/do
    //   141: astore 10
    //   143: aload 10
    //   145: aload 5
    //   147: invokespecial 198	com/google/android/gms/b/do:<init>	(Lcom/google/android/gms/b/dq;)V
    //   150: aload 6
    //   152: aload 10
    //   154: invokeinterface 201 2 0
    //   159: pop
    //   160: goto -75 -> 85
    //   163: astore 5
    //   165: aload_0
    //   166: getfield 24	com/google/android/gms/b/dd:a	Lcom/google/android/gms/b/dc;
    //   169: invokevirtual 39	com/google/android/gms/b/dc:e	()Lcom/google/android/gms/b/cu;
    //   172: getfield 44	com/google/android/gms/b/cu:a	Lcom/google/android/gms/b/cu$a;
    //   175: astore 6
    //   177: ldc -53
    //   179: astore 8
    //   181: aload 4
    //   183: getfield 128	com/google/android/gms/b/ca:a	Ljava/lang/String;
    //   186: invokestatic 121	com/google/android/gms/b/cu:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   189: astore 10
    //   191: aload 6
    //   193: aload 8
    //   195: aload 10
    //   197: aload 5
    //   199: invokevirtual 206	com/google/android/gms/b/cu$a:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   202: invokestatic 223	java/util/Collections:emptyList	()Ljava/util/List;
    //   205: astore 5
    //   207: aload 5
    //   209: areturn
    //   210: aload 6
    //   212: astore 5
    //   214: goto -7 -> 207
    //   217: astore 5
    //   219: goto -54 -> 165
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	dd
    //   0	222	1	paramString1	String
    //   0	222	2	paramString2	String
    //   0	222	3	paramBoolean	boolean
    //   0	222	4	paramca	ca
    //   13	133	5	localObject1	Object
    //   163	35	5	localInterruptedException	InterruptedException
    //   205	8	5	localObject2	Object
    //   217	1	5	localExecutionException	ExecutionException
    //   18	193	6	localObject3	Object
    //   67	5	7	i	int
    //   83	111	8	localObject4	Object
    //   92	3	9	bool1	boolean
    //   124	72	10	localObject5	Object
    //   131	3	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   39	46	163	java/lang/InterruptedException
    //   48	53	163	java/lang/InterruptedException
    //   55	58	163	java/lang/InterruptedException
    //   60	67	163	java/lang/InterruptedException
    //   71	76	163	java/lang/InterruptedException
    //   76	83	163	java/lang/InterruptedException
    //   85	92	163	java/lang/InterruptedException
    //   99	106	163	java/lang/InterruptedException
    //   108	113	163	java/lang/InterruptedException
    //   119	124	163	java/lang/InterruptedException
    //   126	131	163	java/lang/InterruptedException
    //   138	141	163	java/lang/InterruptedException
    //   145	150	163	java/lang/InterruptedException
    //   152	160	163	java/lang/InterruptedException
    //   39	46	217	java/util/concurrent/ExecutionException
    //   48	53	217	java/util/concurrent/ExecutionException
    //   55	58	217	java/util/concurrent/ExecutionException
    //   60	67	217	java/util/concurrent/ExecutionException
    //   71	76	217	java/util/concurrent/ExecutionException
    //   76	83	217	java/util/concurrent/ExecutionException
    //   85	92	217	java/util/concurrent/ExecutionException
    //   99	106	217	java/util/concurrent/ExecutionException
    //   108	113	217	java/util/concurrent/ExecutionException
    //   119	124	217	java/util/concurrent/ExecutionException
    //   126	131	217	java/util/concurrent/ExecutionException
    //   138	141	217	java/util/concurrent/ExecutionException
    //   145	150	217	java/util/concurrent/ExecutionException
    //   152	160	217	java/util/concurrent/ExecutionException
  }
  
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    db localdb = a.f();
    dd.9 local9 = new com/google/android/gms/b/dd$9;
    local9.<init>(this, paramString2, paramString3, paramString1, paramLong);
    localdb.a(local9);
  }
  
  public final void a(ca paramca)
  {
    d(paramca);
    db localdb = a.f();
    dd.8 local8 = new com/google/android/gms/b/dd$8;
    local8.<init>(this, paramca);
    localdb.a(local8);
  }
  
  public final void a(cd paramcd)
  {
    com.google.android.gms.common.internal.c.a(paramcd);
    com.google.android.gms.common.internal.c.a(d);
    Object localObject1 = b;
    boolean bool = true;
    a((String)localObject1, bool);
    localObject1 = new com/google/android/gms/b/cd;
    ((cd)localObject1).<init>(paramcd);
    Object localObject2 = d.a();
    Object localObject3;
    if (localObject2 == null)
    {
      localObject2 = a.f();
      localObject3 = new com/google/android/gms/b/dd$12;
      ((dd.12)localObject3).<init>(this, (cd)localObject1);
      ((db)localObject2).a((Runnable)localObject3);
    }
    for (;;)
    {
      return;
      localObject2 = a.f();
      localObject3 = new com/google/android/gms/b/dd$13;
      ((dd.13)localObject3).<init>(this, (cd)localObject1);
      ((db)localObject2).a((Runnable)localObject3);
    }
  }
  
  public final void a(cd paramcd, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramcd);
    com.google.android.gms.common.internal.c.a(d);
    d(paramca);
    cd localcd = new com/google/android/gms/b/cd;
    localcd.<init>(paramcd);
    Object localObject1 = a;
    b = ((String)localObject1);
    localObject1 = d.a();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = a.f();
      localObject2 = new com/google/android/gms/b/dd$10;
      ((dd.10)localObject2).<init>(this, localcd, paramca);
      ((db)localObject1).a((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = a.f();
      localObject2 = new com/google/android/gms/b/dd$11;
      ((dd.11)localObject2).<init>(this, localcd, paramca);
      ((db)localObject1).a((Runnable)localObject2);
    }
  }
  
  public final void a(cn paramcn, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramcn);
    d(paramca);
    db localdb = a.f();
    dd.2 local2 = new com/google/android/gms/b/dd$2;
    local2.<init>(this, paramcn, paramca);
    localdb.a(local2);
  }
  
  public final void a(cn paramcn, String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.c.a(paramcn);
    com.google.android.gms.common.internal.c.a(paramString1);
    a(paramString1, true);
    db localdb = a.f();
    dd.3 local3 = new com/google/android/gms/b/dd$3;
    local3.<init>(this, paramcn, paramString1);
    localdb.a(local3);
  }
  
  public final void a(do paramdo, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramdo);
    d(paramca);
    Object localObject1 = paramdo.a();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = a.f();
      localObject2 = new com/google/android/gms/b/dd$5;
      ((dd.5)localObject2).<init>(this, paramdo, paramca);
      ((db)localObject1).a((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = a.f();
      localObject2 = new com/google/android/gms/b/dd$6;
      ((dd.6)localObject2).<init>(this, paramdo, paramca);
      ((db)localObject1).a((Runnable)localObject2);
    }
  }
  
  public final byte[] a(cn paramcn, String paramString)
  {
    long l1 = 1000000L;
    com.google.android.gms.common.internal.c.a(paramString);
    com.google.android.gms.common.internal.c.a(paramcn);
    bool = true;
    a(paramString, bool);
    Object localObject1 = a.e().f;
    localObject3 = a;
    ((cu.a)localObject1).a("Log and bundle. event", localObject3);
    long l2 = a.i.c();
    long l3 = l2 / l1;
    localObject1 = a.f();
    localObject4 = new com/google/android/gms/b/dd$4;
    ((dd.4)localObject4).<init>(this, paramcn, paramString);
    localObject1 = ((db)localObject1).b((Callable)localObject4);
    try
    {
      localObject1 = ((Future)localObject1).get();
      localObject1 = (byte[])localObject1;
      if (localObject1 == null)
      {
        localObject1 = a;
        localObject1 = ((dc)localObject1).e();
        localObject1 = a;
        localObject4 = "Log and bundle returned null. appId";
        localObject5 = cu.a(paramString);
        ((cu.a)localObject1).a((String)localObject4, localObject5);
        bool = false;
        localObject1 = null;
        localObject1 = new byte[0];
      }
      localObject4 = a;
      localObject4 = i;
      l1 = ((com.google.android.gms.common.util.c)localObject4).c();
      long l4 = 1000000L;
      l1 /= l4;
      localObject4 = a;
      localObject4 = ((dc)localObject4).e();
      localObject4 = f;
      String str1 = "Log and bundle processed. event, size, time_ms";
      String str2 = a;
      int i = localObject1.length;
      Integer localInteger = Integer.valueOf(i);
      l3 = l1 - l3;
      localObject3 = Long.valueOf(l3);
      ((cu.a)localObject4).a(str1, str2, localInteger, localObject3);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject4 = a.e().a;
        localObject3 = "Failed to log and bundle. appId, event, error";
        Object localObject6 = cu.a(paramString);
        Object localObject5 = a;
        ((cu.a)localObject4).a((String)localObject3, localObject6, localObject5, localInterruptedException);
        bool = false;
        Object localObject2 = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    return (byte[])localObject1;
  }
  
  public final void b(ca paramca)
  {
    d(paramca);
    db localdb = a.f();
    dd.1 local1 = new com/google/android/gms/b/dd$1;
    local1.<init>(this, paramca);
    localdb.a(local1);
  }
  
  public final String c(ca paramca)
  {
    d(paramca);
    dc localdc = a;
    String str = a;
    return localdc.a(str);
  }
}


/* Location:              com/google/android/gms/b/dd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */