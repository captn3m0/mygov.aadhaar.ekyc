package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

class e
  extends DataSetObservable
{
  static final String a = e.class.getSimpleName();
  private static final Object g;
  private static final Map h;
  final Object b;
  final List c;
  final Context d;
  final String e;
  boolean f;
  private final List i;
  private Intent j;
  private e.b k;
  private int l;
  private boolean m;
  private boolean n;
  private boolean o;
  private e.d p;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    g = localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    h = (Map)localObject;
  }
  
  private boolean d()
  {
    Object localObject = k;
    boolean bool;
    if (localObject != null)
    {
      localObject = j;
      if (localObject != null)
      {
        localObject = c;
        bool = ((List)localObject).isEmpty();
        if (!bool)
        {
          localObject = i;
          bool = ((List)localObject).isEmpty();
          if (!bool)
          {
            localObject = i;
            Collections.unmodifiableList((List)localObject);
            bool = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void e()
  {
    List localList1 = i;
    int i1 = localList1.size();
    int i2 = l;
    i2 = i1 - i2;
    if (i2 <= 0) {}
    for (;;)
    {
      return;
      n = true;
      i1 = 0;
      localList1 = null;
      while (i1 < i2)
      {
        List localList2 = i;
        localList2.remove(0);
        i1 += 1;
      }
    }
  }
  
  /* Error */
  private void f()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 86	android/support/v7/widget/e:d	Landroid/content/Context;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 88	android/support/v7/widget/e:e	Ljava/lang/String;
    //   11: astore_3
    //   12: aload_2
    //   13: aload_3
    //   14: invokevirtual 94	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   17: astore_3
    //   18: invokestatic 100	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   21: astore 4
    //   23: ldc 102
    //   25: astore_2
    //   26: aload 4
    //   28: aload_3
    //   29: aload_2
    //   30: invokeinterface 108 3 0
    //   35: iconst_0
    //   36: istore 5
    //   38: aconst_null
    //   39: astore_2
    //   40: iload 5
    //   42: iload_1
    //   43: if_icmpeq +25 -> 68
    //   46: iconst_2
    //   47: istore 6
    //   49: iload 5
    //   51: iload 6
    //   53: if_icmpeq +15 -> 68
    //   56: aload 4
    //   58: invokeinterface 112 1 0
    //   63: istore 5
    //   65: goto -25 -> 40
    //   68: ldc 114
    //   70: astore_2
    //   71: aload 4
    //   73: invokeinterface 117 1 0
    //   78: astore 7
    //   80: aload_2
    //   81: aload 7
    //   83: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   86: istore 5
    //   88: iload 5
    //   90: ifne +81 -> 171
    //   93: new 125	org/xmlpull/v1/XmlPullParserException
    //   96: astore_2
    //   97: ldc 127
    //   99: astore 4
    //   101: aload_2
    //   102: aload 4
    //   104: invokespecial 130	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   107: aload_2
    //   108: athrow
    //   109: astore_2
    //   110: getstatic 38	android/support/v7/widget/e:a	Ljava/lang/String;
    //   113: astore 4
    //   115: new 132	java/lang/StringBuilder
    //   118: astore 7
    //   120: ldc -122
    //   122: astore 8
    //   124: aload 7
    //   126: aload 8
    //   128: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   131: aload_0
    //   132: getfield 88	android/support/v7/widget/e:e	Ljava/lang/String;
    //   135: astore 8
    //   137: aload 7
    //   139: aload 8
    //   141: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: astore 7
    //   146: aload 7
    //   148: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   151: astore 7
    //   153: aload 4
    //   155: aload 7
    //   157: aload_2
    //   158: invokestatic 147	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   161: pop
    //   162: aload_3
    //   163: ifnull +7 -> 170
    //   166: aload_3
    //   167: invokevirtual 152	java/io/FileInputStream:close	()V
    //   170: return
    //   171: aload_0
    //   172: getfield 65	android/support/v7/widget/e:i	Ljava/util/List;
    //   175: astore_2
    //   176: aload_2
    //   177: invokeinterface 155 1 0
    //   182: aload 4
    //   184: invokeinterface 112 1 0
    //   189: istore 6
    //   191: iload 6
    //   193: iload_1
    //   194: if_icmpeq +253 -> 447
    //   197: iconst_3
    //   198: istore 9
    //   200: iload 6
    //   202: iload 9
    //   204: if_icmpeq -22 -> 182
    //   207: iconst_4
    //   208: istore 9
    //   210: iload 6
    //   212: iload 9
    //   214: if_icmpeq -32 -> 182
    //   217: aload 4
    //   219: invokeinterface 117 1 0
    //   224: astore 7
    //   226: ldc -97
    //   228: astore 8
    //   230: aload 8
    //   232: aload 7
    //   234: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   237: istore 6
    //   239: iload 6
    //   241: ifne +87 -> 328
    //   244: new 125	org/xmlpull/v1/XmlPullParserException
    //   247: astore_2
    //   248: ldc -95
    //   250: astore 4
    //   252: aload_2
    //   253: aload 4
    //   255: invokespecial 130	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   258: aload_2
    //   259: athrow
    //   260: astore_2
    //   261: getstatic 38	android/support/v7/widget/e:a	Ljava/lang/String;
    //   264: astore 4
    //   266: new 132	java/lang/StringBuilder
    //   269: astore 7
    //   271: ldc -122
    //   273: astore 8
    //   275: aload 7
    //   277: aload 8
    //   279: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   282: aload_0
    //   283: getfield 88	android/support/v7/widget/e:e	Ljava/lang/String;
    //   286: astore 8
    //   288: aload 7
    //   290: aload 8
    //   292: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: astore 7
    //   297: aload 7
    //   299: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   302: astore 7
    //   304: aload 4
    //   306: aload 7
    //   308: aload_2
    //   309: invokestatic 147	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   312: pop
    //   313: aload_3
    //   314: ifnull -144 -> 170
    //   317: aload_3
    //   318: invokevirtual 152	java/io/FileInputStream:close	()V
    //   321: goto -151 -> 170
    //   324: astore_2
    //   325: goto -155 -> 170
    //   328: iconst_0
    //   329: istore 6
    //   331: aconst_null
    //   332: astore 7
    //   334: ldc -93
    //   336: astore 8
    //   338: aload 4
    //   340: aconst_null
    //   341: aload 8
    //   343: invokeinterface 167 3 0
    //   348: astore 7
    //   350: iconst_0
    //   351: istore 9
    //   353: aconst_null
    //   354: astore 8
    //   356: ldc -87
    //   358: astore 10
    //   360: aload 4
    //   362: aconst_null
    //   363: aload 10
    //   365: invokeinterface 167 3 0
    //   370: astore 8
    //   372: aload 8
    //   374: invokestatic 175	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   377: lstore 11
    //   379: fconst_0
    //   380: fstore 13
    //   382: aconst_null
    //   383: astore 14
    //   385: ldc -79
    //   387: astore 15
    //   389: aload 4
    //   391: aconst_null
    //   392: aload 15
    //   394: invokeinterface 167 3 0
    //   399: astore 14
    //   401: aload 14
    //   403: invokestatic 183	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   406: fstore 13
    //   408: new 185	android/support/v7/widget/e$c
    //   411: astore 15
    //   413: aload 15
    //   415: aload 7
    //   417: lload 11
    //   419: fload 13
    //   421: invokespecial 188	android/support/v7/widget/e$c:<init>	(Ljava/lang/String;JF)V
    //   424: aload_2
    //   425: aload 15
    //   427: invokeinterface 191 2 0
    //   432: pop
    //   433: goto -251 -> 182
    //   436: astore_2
    //   437: aload_3
    //   438: ifnull +7 -> 445
    //   441: aload_3
    //   442: invokevirtual 152	java/io/FileInputStream:close	()V
    //   445: aload_2
    //   446: athrow
    //   447: aload_3
    //   448: ifnull -278 -> 170
    //   451: aload_3
    //   452: invokevirtual 152	java/io/FileInputStream:close	()V
    //   455: goto -285 -> 170
    //   458: astore_2
    //   459: goto -289 -> 170
    //   462: astore_2
    //   463: goto -293 -> 170
    //   466: astore_3
    //   467: goto -22 -> 445
    //   470: astore_2
    //   471: goto -301 -> 170
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	474	0	this	e
    //   1	194	1	i1	int
    //   6	102	2	localObject1	Object
    //   109	49	2	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   175	84	2	localObject2	Object
    //   260	49	2	localIOException1	java.io.IOException
    //   324	101	2	localIOException2	java.io.IOException
    //   436	10	2	localObject3	Object
    //   458	1	2	localIOException3	java.io.IOException
    //   462	1	2	localIOException4	java.io.IOException
    //   470	1	2	localFileNotFoundException	java.io.FileNotFoundException
    //   11	441	3	localObject4	Object
    //   466	1	3	localIOException5	java.io.IOException
    //   21	369	4	localObject5	Object
    //   36	28	5	i2	int
    //   86	3	5	bool1	boolean
    //   47	168	6	i3	int
    //   237	93	6	bool2	boolean
    //   78	338	7	localObject6	Object
    //   122	251	8	str1	String
    //   198	154	9	i4	int
    //   358	6	10	str2	String
    //   377	41	11	l1	long
    //   380	40	13	f1	float
    //   383	19	14	str3	String
    //   387	39	15	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   18	21	109	org/xmlpull/v1/XmlPullParserException
    //   29	35	109	org/xmlpull/v1/XmlPullParserException
    //   56	63	109	org/xmlpull/v1/XmlPullParserException
    //   71	78	109	org/xmlpull/v1/XmlPullParserException
    //   81	86	109	org/xmlpull/v1/XmlPullParserException
    //   93	96	109	org/xmlpull/v1/XmlPullParserException
    //   102	107	109	org/xmlpull/v1/XmlPullParserException
    //   107	109	109	org/xmlpull/v1/XmlPullParserException
    //   171	175	109	org/xmlpull/v1/XmlPullParserException
    //   176	182	109	org/xmlpull/v1/XmlPullParserException
    //   182	189	109	org/xmlpull/v1/XmlPullParserException
    //   217	224	109	org/xmlpull/v1/XmlPullParserException
    //   232	237	109	org/xmlpull/v1/XmlPullParserException
    //   244	247	109	org/xmlpull/v1/XmlPullParserException
    //   253	258	109	org/xmlpull/v1/XmlPullParserException
    //   258	260	109	org/xmlpull/v1/XmlPullParserException
    //   341	348	109	org/xmlpull/v1/XmlPullParserException
    //   363	370	109	org/xmlpull/v1/XmlPullParserException
    //   372	377	109	org/xmlpull/v1/XmlPullParserException
    //   392	399	109	org/xmlpull/v1/XmlPullParserException
    //   401	406	109	org/xmlpull/v1/XmlPullParserException
    //   408	411	109	org/xmlpull/v1/XmlPullParserException
    //   419	424	109	org/xmlpull/v1/XmlPullParserException
    //   425	433	109	org/xmlpull/v1/XmlPullParserException
    //   18	21	260	java/io/IOException
    //   29	35	260	java/io/IOException
    //   56	63	260	java/io/IOException
    //   71	78	260	java/io/IOException
    //   81	86	260	java/io/IOException
    //   93	96	260	java/io/IOException
    //   102	107	260	java/io/IOException
    //   107	109	260	java/io/IOException
    //   171	175	260	java/io/IOException
    //   176	182	260	java/io/IOException
    //   182	189	260	java/io/IOException
    //   217	224	260	java/io/IOException
    //   232	237	260	java/io/IOException
    //   244	247	260	java/io/IOException
    //   253	258	260	java/io/IOException
    //   258	260	260	java/io/IOException
    //   341	348	260	java/io/IOException
    //   363	370	260	java/io/IOException
    //   372	377	260	java/io/IOException
    //   392	399	260	java/io/IOException
    //   401	406	260	java/io/IOException
    //   408	411	260	java/io/IOException
    //   419	424	260	java/io/IOException
    //   425	433	260	java/io/IOException
    //   317	321	324	java/io/IOException
    //   18	21	436	finally
    //   29	35	436	finally
    //   56	63	436	finally
    //   71	78	436	finally
    //   81	86	436	finally
    //   93	96	436	finally
    //   102	107	436	finally
    //   107	109	436	finally
    //   110	113	436	finally
    //   115	118	436	finally
    //   126	131	436	finally
    //   131	135	436	finally
    //   139	144	436	finally
    //   146	151	436	finally
    //   157	162	436	finally
    //   171	175	436	finally
    //   176	182	436	finally
    //   182	189	436	finally
    //   217	224	436	finally
    //   232	237	436	finally
    //   244	247	436	finally
    //   253	258	436	finally
    //   258	260	436	finally
    //   261	264	436	finally
    //   266	269	436	finally
    //   277	282	436	finally
    //   282	286	436	finally
    //   290	295	436	finally
    //   297	302	436	finally
    //   308	313	436	finally
    //   341	348	436	finally
    //   363	370	436	finally
    //   372	377	436	finally
    //   392	399	436	finally
    //   401	406	436	finally
    //   408	411	436	finally
    //   419	424	436	finally
    //   425	433	436	finally
    //   451	455	458	java/io/IOException
    //   166	170	462	java/io/IOException
    //   441	445	466	java/io/IOException
    //   2	6	470	java/io/FileNotFoundException
    //   7	11	470	java/io/FileNotFoundException
    //   13	17	470	java/io/FileNotFoundException
  }
  
  public final int a()
  {
    synchronized (b)
    {
      c();
      List localList = c;
      int i1 = localList.size();
      return i1;
    }
  }
  
  public final int a(ResolveInfo paramResolveInfo)
  {
    synchronized (b)
    {
      c();
      List localList = c;
      int i1 = localList.size();
      int i2 = 0;
      while (i2 < i1)
      {
        Object localObject2 = localList.get(i2);
        localObject2 = (e.a)localObject2;
        localObject2 = a;
        if (localObject2 == paramResolveInfo)
        {
          i3 = i2;
          return i3;
        }
        i2 += 1;
      }
      int i3 = -1;
    }
  }
  
  public final ResolveInfo a(int paramInt)
  {
    synchronized (b)
    {
      c();
      Object localObject2 = c;
      localObject2 = ((List)localObject2).get(paramInt);
      localObject2 = (e.a)localObject2;
      localObject2 = a;
      return (ResolveInfo)localObject2;
    }
  }
  
  final boolean a(e.c paramc)
  {
    boolean bool1 = true;
    Object localObject1 = i;
    boolean bool2 = ((List)localObject1).add(paramc);
    Object localObject2;
    Object[] arrayOfObject;
    if (bool2)
    {
      n = bool1;
      e();
      boolean bool3 = m;
      if (!bool3)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("No preceding call to #readHistoricalData");
        throw ((Throwable)localObject1);
      }
      bool3 = n;
      if (bool3)
      {
        n = false;
        localObject2 = e;
        bool3 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool3)
        {
          localObject2 = new android/support/v7/widget/e$e;
          ((e.e)localObject2).<init>(this);
          int i1 = 2;
          arrayOfObject = new Object[i1];
          Object localObject3 = new java/util/ArrayList;
          List localList = i;
          ((ArrayList)localObject3).<init>(localList);
          arrayOfObject[0] = localObject3;
          localObject3 = e;
          arrayOfObject[bool1] = localObject3;
          int i2 = Build.VERSION.SDK_INT;
          int i3 = 11;
          if (i2 < i3) {
            break label187;
          }
          localObject3 = AsyncTask.THREAD_POOL_EXECUTOR;
          ((AsyncTask)localObject2).executeOnExecutor((Executor)localObject3, arrayOfObject);
        }
      }
    }
    for (;;)
    {
      d();
      notifyChanged();
      return bool2;
      label187:
      ((AsyncTask)localObject2).execute(arrayOfObject);
    }
  }
  
  public final Intent b(int paramInt)
  {
    e.c localc = null;
    synchronized (b)
    {
      Object localObject2 = j;
      if (localObject2 == null) {}
      ComponentName localComponentName;
      for (localObject2 = null;; localObject2 = null)
      {
        return (Intent)localObject2;
        c();
        localObject2 = c;
        localObject2 = ((List)localObject2).get(paramInt);
        localObject2 = (e.a)localObject2;
        localComponentName = new android/content/ComponentName;
        Object localObject4 = a;
        localObject4 = activityInfo;
        localObject4 = packageName;
        localObject2 = a;
        localObject2 = activityInfo;
        localObject2 = name;
        localComponentName.<init>((String)localObject4, (String)localObject2);
        localObject2 = new android/content/Intent;
        localObject4 = j;
        ((Intent)localObject2).<init>((Intent)localObject4);
        ((Intent)localObject2).setComponent(localComponentName);
        localObject4 = p;
        if (localObject4 == null) {
          break;
        }
        localObject4 = new android/content/Intent;
        ((Intent)localObject4).<init>((Intent)localObject2);
        localObject4 = p;
        boolean bool = ((e.d)localObject4).a();
        if (!bool) {
          break;
        }
      }
      localc = new android/support/v7/widget/e$c;
      long l1 = System.currentTimeMillis();
      float f1 = 1.0F;
      localc.<init>(localComponentName, l1, f1);
      a(localc);
    }
  }
  
  public final ResolveInfo b()
  {
    synchronized (b)
    {
      c();
      Object localObject2 = c;
      boolean bool = ((List)localObject2).isEmpty();
      if (!bool)
      {
        localObject2 = c;
        localObject2 = ((List)localObject2).get(0);
        localObject2 = (e.a)localObject2;
        localObject2 = a;
        return (ResolveInfo)localObject2;
      }
      bool = false;
      localObject2 = null;
    }
  }
  
  final void c()
  {
    int i1 = 1;
    boolean bool1 = o;
    Object localObject1;
    int i2;
    if (bool1)
    {
      localObject1 = j;
      if (localObject1 != null)
      {
        o = false;
        c.clear();
        localObject1 = d.getPackageManager();
        Object localObject2 = j;
        List localList1 = ((PackageManager)localObject1).queryIntentActivities((Intent)localObject2, 0);
        int i3 = localList1.size();
        int i4 = 0;
        localObject2 = null;
        while (i4 < i3)
        {
          localObject1 = (ResolveInfo)localList1.get(i4);
          List localList2 = c;
          e.a locala = new android/support/v7/widget/e$a;
          locala.<init>(this, (ResolveInfo)localObject1);
          localList2.add(locala);
          i2 = i4 + 1;
          i4 = i2;
        }
        i2 = i1;
        boolean bool2 = f;
        if (!bool2) {
          break label216;
        }
        bool2 = n;
        if (!bool2) {
          break label216;
        }
        localObject2 = e;
        bool2 = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool2) {
          break label216;
        }
        f = false;
        m = i1;
        f();
      }
    }
    for (;;)
    {
      i2 |= i1;
      e();
      if (i2 != 0)
      {
        d();
        notifyChanged();
      }
      return;
      i2 = 0;
      localObject1 = null;
      break;
      label216:
      i1 = 0;
    }
  }
}


/* Location:              android/support/v7/widget/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */