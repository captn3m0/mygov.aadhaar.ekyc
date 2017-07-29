package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.l;
import java.io.File;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class h
{
  SharedPreferences a;
  Context b;
  
  public h(Context paramContext)
  {
    this(paramContext, "com.google.android.gms.appid");
  }
  
  private h(Context paramContext, String paramString)
  {
    b = paramContext;
    boolean bool1 = false;
    Object localObject1 = paramContext.getSharedPreferences(paramString, 0);
    a = ((SharedPreferences)localObject1);
    Object localObject2 = String.valueOf(paramString);
    localObject1 = String.valueOf("-no-backup");
    int i = ((String)localObject1).length();
    if (i != 0)
    {
      localObject1 = ((String)localObject2).concat((String)localObject1);
      localObject2 = b;
      boolean bool2 = i.e();
      if (!bool2) {
        break label169;
      }
    }
    Object localObject3;
    for (localObject2 = ((Context)localObject2).getNoBackupFilesDir();; localObject2 = l.a((File)localObject3))
    {
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((File)localObject2, (String)localObject1);
      bool1 = ((File)localObject3).exists();
      if (!bool1) {}
      try
      {
        bool1 = ((File)localObject3).createNewFile();
        if (bool1)
        {
          bool1 = a();
          if (!bool1)
          {
            localObject1 = "InstanceID/Store";
            localObject2 = "App restored, clearing state";
            Log.i((String)localObject1, (String)localObject2);
            localObject1 = b;
            FirebaseInstanceId.a((Context)localObject1, this);
          }
        }
        return;
      }
      catch (IOException localIOException)
      {
        boolean bool3;
        do
        {
          String str2;
          localObject2 = "InstanceID/Store";
          int j = 3;
          bool3 = Log.isLoggable((String)localObject2, j);
        } while (!bool3);
        localObject2 = "InstanceID/Store";
        localObject3 = "Error creating file in no backup dir: ";
        str1 = String.valueOf(localIOException.getMessage());
        int k = str1.length();
        if (k == 0) {
          break label284;
        }
      }
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject2);
      break;
      label169:
      localObject2 = ((Context)localObject2).getApplicationInfo();
      localObject3 = new java/io/File;
      localObject2 = dataDir;
      str2 = "no_backup";
      ((File)localObject3).<init>((String)localObject2, str2);
    }
    String str1 = ((String)localObject3).concat(str1);
    for (;;)
    {
      Log.d((String)localObject2, str1);
      break;
      label284:
      str1 = new java/lang/String;
      str1.<init>((String)localObject3);
    }
  }
  
  private static String a(String paramString1, String paramString2)
  {
    String str = String.valueOf("|S|");
    int i = String.valueOf(paramString1).length();
    int j = String.valueOf(str).length();
    i += j;
    j = String.valueOf(paramString2).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    return paramString1 + str + paramString2;
  }
  
  private static String c(String paramString1, String paramString2, String paramString3)
  {
    String str = String.valueOf("|T|");
    int i = String.valueOf(paramString1).length() + 1;
    int j = String.valueOf(str).length();
    i += j;
    j = String.valueOf(paramString2).length();
    i += j;
    j = String.valueOf(paramString3).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    return paramString1 + str + paramString2 + "|" + paramString3;
  }
  
  private void e(String paramString)
  {
    SharedPreferences.Editor localEditor = a.edit();
    Object localObject = a.getAll().keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (String)localIterator.next();
      boolean bool2 = ((String)localObject).startsWith(paramString);
      if (bool2) {
        localEditor.remove((String)localObject);
      }
    }
    localEditor.commit();
  }
  
  public final h.a a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      Object localObject1 = a;
      String str = c(paramString1, paramString2, paramString3);
      localObject1 = ((SharedPreferences)localObject1).getString(str, null);
      localObject1 = h.a.a((String)localObject1);
      return (h.a)localObject1;
    }
    finally {}
  }
  
  final KeyPair a(String paramString)
  {
    try
    {
      KeyPair localKeyPair = a.a();
      long l = System.currentTimeMillis();
      Object localObject2 = a;
      localObject2 = ((SharedPreferences)localObject2).edit();
      String str1 = "|P|";
      str1 = a(paramString, str1);
      Object localObject3 = localKeyPair.getPublic();
      localObject3 = ((PublicKey)localObject3).getEncoded();
      localObject3 = FirebaseInstanceId.a((byte[])localObject3);
      ((SharedPreferences.Editor)localObject2).putString(str1, (String)localObject3);
      str1 = "|K|";
      str1 = a(paramString, str1);
      localObject3 = localKeyPair.getPrivate();
      localObject3 = ((PrivateKey)localObject3).getEncoded();
      localObject3 = FirebaseInstanceId.a((byte[])localObject3);
      ((SharedPreferences.Editor)localObject2).putString(str1, (String)localObject3);
      str1 = "cre";
      str1 = a(paramString, str1);
      String str2 = Long.toString(l);
      ((SharedPreferences.Editor)localObject2).putString(str1, str2);
      ((SharedPreferences.Editor)localObject2).commit();
      return localKeyPair;
    }
    finally {}
  }
  
  /* Error */
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 206	java/lang/System:currentTimeMillis	()J
    //   5: lstore 6
    //   7: aload 4
    //   9: aload 5
    //   11: lload 6
    //   13: invokestatic 248	com/google/firebase/iid/h$a:a	(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    //   16: astore 8
    //   18: aload 8
    //   20: ifnonnull +6 -> 26
    //   23: aload_0
    //   24: monitorexit
    //   25: return
    //   26: aload_0
    //   27: getfield 27	com/google/firebase/iid/h:a	Landroid/content/SharedPreferences;
    //   30: astore 9
    //   32: aload 9
    //   34: invokeinterface 144 1 0
    //   39: astore 9
    //   41: aload_1
    //   42: aload_2
    //   43: aload_3
    //   44: invokestatic 186	com/google/firebase/iid/h:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   47: astore 10
    //   49: aload 9
    //   51: aload 10
    //   53: aload 8
    //   55: invokeinterface 229 3 0
    //   60: pop
    //   61: aload 9
    //   63: invokeinterface 182 1 0
    //   68: pop
    //   69: goto -46 -> 23
    //   72: astore 8
    //   74: aload_0
    //   75: monitorexit
    //   76: aload 8
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	h
    //   0	79	1	paramString1	String
    //   0	79	2	paramString2	String
    //   0	79	3	paramString3	String
    //   0	79	4	paramString4	String
    //   0	79	5	paramString5	String
    //   5	7	6	l	long
    //   16	38	8	str1	String
    //   72	5	8	localObject1	Object
    //   30	32	9	localObject2	Object
    //   47	5	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   2	5	72	finally
    //   11	16	72	finally
    //   26	30	72	finally
    //   32	39	72	finally
    //   43	47	72	finally
    //   53	61	72	finally
    //   61	69	72	finally
  }
  
  public final boolean a()
  {
    try
    {
      Object localObject1 = a;
      localObject1 = ((SharedPreferences)localObject1).getAll();
      boolean bool = ((Map)localObject1).isEmpty();
      return bool;
    }
    finally {}
  }
  
  public final void b()
  {
    try
    {
      Object localObject1 = a;
      localObject1 = ((SharedPreferences)localObject1).edit();
      localObject1 = ((SharedPreferences.Editor)localObject1).clear();
      ((SharedPreferences.Editor)localObject1).commit();
      return;
    }
    finally {}
  }
  
  final void b(String paramString)
  {
    try
    {
      String str1 = String.valueOf(paramString);
      String str2 = "|";
      str1 = str1.concat(str2);
      e(str1);
      return;
    }
    finally {}
  }
  
  public final void b(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      String str = c(paramString1, paramString2, paramString3);
      Object localObject2 = a;
      localObject2 = ((SharedPreferences)localObject2).edit();
      ((SharedPreferences.Editor)localObject2).remove(str);
      ((SharedPreferences.Editor)localObject2).commit();
      return;
    }
    finally {}
  }
  
  public final void c(String paramString)
  {
    try
    {
      String str1 = String.valueOf(paramString);
      String str2 = "|T|";
      str1 = str1.concat(str2);
      e(str1);
      return;
    }
    finally {}
  }
  
  /* Error */
  public final KeyPair d(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/google/firebase/iid/h:a	Landroid/content/SharedPreferences;
    //   6: astore_2
    //   7: ldc -48
    //   9: astore_3
    //   10: aload_1
    //   11: aload_3
    //   12: invokestatic 210	com/google/firebase/iid/h:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   15: astore_3
    //   16: iconst_0
    //   17: istore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_2
    //   23: aload_3
    //   24: aconst_null
    //   25: invokeinterface 190 3 0
    //   30: astore_2
    //   31: aload_0
    //   32: getfield 27	com/google/firebase/iid/h:a	Landroid/content/SharedPreferences;
    //   35: astore_3
    //   36: ldc -25
    //   38: astore 5
    //   40: aload_1
    //   41: aload 5
    //   43: invokestatic 210	com/google/firebase/iid/h:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: astore 5
    //   48: aconst_null
    //   49: astore 6
    //   51: aload_3
    //   52: aload 5
    //   54: aconst_null
    //   55: invokeinterface 190 3 0
    //   60: astore_3
    //   61: aload_2
    //   62: ifnull +7 -> 69
    //   65: aload_3
    //   66: ifnonnull +9 -> 75
    //   69: aconst_null
    //   70: astore_2
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_2
    //   74: areturn
    //   75: bipush 8
    //   77: istore 4
    //   79: aload_2
    //   80: iload 4
    //   82: invokestatic 263	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   85: astore_2
    //   86: bipush 8
    //   88: istore 4
    //   90: aload_3
    //   91: iload 4
    //   93: invokestatic 263	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   96: astore_3
    //   97: ldc_w 265
    //   100: astore 5
    //   102: aload 5
    //   104: invokestatic 271	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   107: astore 5
    //   109: new 273	java/security/spec/X509EncodedKeySpec
    //   112: astore 6
    //   114: aload 6
    //   116: aload_2
    //   117: invokespecial 276	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   120: aload 5
    //   122: aload 6
    //   124: invokevirtual 280	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   127: astore 6
    //   129: new 282	java/security/spec/PKCS8EncodedKeySpec
    //   132: astore_2
    //   133: aload_2
    //   134: aload_3
    //   135: invokespecial 283	java/security/spec/PKCS8EncodedKeySpec:<init>	([B)V
    //   138: aload 5
    //   140: aload_2
    //   141: invokevirtual 287	java/security/KeyFactory:generatePrivate	(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   144: astore_3
    //   145: new 212	java/security/KeyPair
    //   148: astore_2
    //   149: aload_2
    //   150: aload 6
    //   152: aload_3
    //   153: invokespecial 290	java/security/KeyPair:<init>	(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    //   156: goto -85 -> 71
    //   159: astore_2
    //   160: ldc 68
    //   162: astore_3
    //   163: aload_2
    //   164: invokestatic 33	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   167: astore_2
    //   168: aload_2
    //   169: invokestatic 33	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   172: astore 5
    //   174: aload 5
    //   176: invokevirtual 39	java/lang/String:length	()I
    //   179: bipush 19
    //   181: iadd
    //   182: istore 4
    //   184: new 124	java/lang/StringBuilder
    //   187: astore 6
    //   189: aload 6
    //   191: iload 4
    //   193: invokespecial 127	java/lang/StringBuilder:<init>	(I)V
    //   196: ldc_w 292
    //   199: astore 5
    //   201: aload 6
    //   203: aload 5
    //   205: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: astore 5
    //   210: aload 5
    //   212: aload_2
    //   213: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: astore_2
    //   217: aload_2
    //   218: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: astore_2
    //   222: aload_3
    //   223: aload_2
    //   224: invokestatic 295	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   227: pop
    //   228: aload_0
    //   229: getfield 19	com/google/firebase/iid/h:b	Landroid/content/Context;
    //   232: astore_2
    //   233: aload_2
    //   234: aload_0
    //   235: invokestatic 81	com/google/firebase/iid/FirebaseInstanceId:a	(Landroid/content/Context;Lcom/google/firebase/iid/h;)V
    //   238: aconst_null
    //   239: astore_2
    //   240: goto -169 -> 71
    //   243: astore_2
    //   244: aload_0
    //   245: monitorexit
    //   246: aload_2
    //   247: athrow
    //   248: astore_2
    //   249: goto -89 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	h
    //   0	252	1	paramString	String
    //   6	144	2	localObject1	Object
    //   159	5	2	localInvalidKeySpecException	java.security.spec.InvalidKeySpecException
    //   167	73	2	localObject2	Object
    //   243	4	2	localObject3	Object
    //   248	1	2	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   9	214	3	localObject4	Object
    //   17	175	4	i	int
    //   20	191	5	localObject5	Object
    //   49	153	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   80	85	159	java/security/spec/InvalidKeySpecException
    //   91	96	159	java/security/spec/InvalidKeySpecException
    //   102	107	159	java/security/spec/InvalidKeySpecException
    //   109	112	159	java/security/spec/InvalidKeySpecException
    //   116	120	159	java/security/spec/InvalidKeySpecException
    //   122	127	159	java/security/spec/InvalidKeySpecException
    //   129	132	159	java/security/spec/InvalidKeySpecException
    //   134	138	159	java/security/spec/InvalidKeySpecException
    //   140	144	159	java/security/spec/InvalidKeySpecException
    //   145	148	159	java/security/spec/InvalidKeySpecException
    //   152	156	159	java/security/spec/InvalidKeySpecException
    //   2	6	243	finally
    //   11	15	243	finally
    //   24	30	243	finally
    //   31	35	243	finally
    //   41	46	243	finally
    //   54	60	243	finally
    //   80	85	243	finally
    //   91	96	243	finally
    //   102	107	243	finally
    //   109	112	243	finally
    //   116	120	243	finally
    //   122	127	243	finally
    //   129	132	243	finally
    //   134	138	243	finally
    //   140	144	243	finally
    //   145	148	243	finally
    //   152	156	243	finally
    //   163	167	243	finally
    //   168	172	243	finally
    //   174	179	243	finally
    //   184	187	243	finally
    //   191	196	243	finally
    //   203	208	243	finally
    //   212	216	243	finally
    //   217	221	243	finally
    //   223	228	243	finally
    //   228	232	243	finally
    //   234	238	243	finally
    //   80	85	248	java/security/NoSuchAlgorithmException
    //   91	96	248	java/security/NoSuchAlgorithmException
    //   102	107	248	java/security/NoSuchAlgorithmException
    //   109	112	248	java/security/NoSuchAlgorithmException
    //   116	120	248	java/security/NoSuchAlgorithmException
    //   122	127	248	java/security/NoSuchAlgorithmException
    //   129	132	248	java/security/NoSuchAlgorithmException
    //   134	138	248	java/security/NoSuchAlgorithmException
    //   140	144	248	java/security/NoSuchAlgorithmException
    //   145	148	248	java/security/NoSuchAlgorithmException
    //   152	156	248	java/security/NoSuchAlgorithmException
  }
}


/* Location:              com/google/firebase/iid/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */