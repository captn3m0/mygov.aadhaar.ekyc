package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
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
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

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
    a = paramContext.getSharedPreferences(paramString, 0);
    paramContext = String.valueOf(paramString);
    paramString = String.valueOf("-no-backup");
    if (paramString.length() != 0) {
      paramContext = paramContext.concat(paramString);
    }
    for (;;)
    {
      paramString = b;
      if (i.e())
      {
        paramString = paramString.getNoBackupFilesDir();
        paramContext = new File(paramString, paramContext);
        if (paramContext.exists()) {}
      }
      try
      {
        if ((paramContext.createNewFile()) && (!a()))
        {
          Log.i("InstanceID/Store", "App restored, clearing state");
          FirebaseInstanceId.a(b, this);
        }
        return;
        paramContext = new String(paramContext);
        continue;
        paramString = l.a(new File(getApplicationInfodataDir, "no_backup"));
      }
      catch (IOException paramContext)
      {
        while (!Log.isLoggable("InstanceID/Store", 3)) {}
        paramContext = String.valueOf(paramContext.getMessage());
        if (paramContext.length() == 0) {}
      }
    }
    for (paramContext = "Error creating file in no backup dir: ".concat(paramContext);; paramContext = new String("Error creating file in no backup dir: "))
    {
      Log.d("InstanceID/Store", paramContext);
      return;
    }
  }
  
  private static String a(String paramString1, String paramString2)
  {
    String str = String.valueOf("|S|");
    return String.valueOf(paramString1).length() + String.valueOf(str).length() + String.valueOf(paramString2).length() + paramString1 + str + paramString2;
  }
  
  private static String c(String paramString1, String paramString2, String paramString3)
  {
    String str = String.valueOf("|T|");
    return String.valueOf(paramString1).length() + 1 + String.valueOf(str).length() + String.valueOf(paramString2).length() + String.valueOf(paramString3).length() + paramString1 + str + paramString2 + "|" + paramString3;
  }
  
  private void e(String paramString)
  {
    SharedPreferences.Editor localEditor = a.edit();
    Iterator localIterator = a.getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str.startsWith(paramString)) {
        localEditor.remove(str);
      }
    }
    localEditor.commit();
  }
  
  public final a a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = a.a(a.getString(c(paramString1, paramString2, paramString3), null));
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  final KeyPair a(String paramString)
  {
    try
    {
      KeyPair localKeyPair = a.a();
      long l = System.currentTimeMillis();
      SharedPreferences.Editor localEditor = a.edit();
      localEditor.putString(a(paramString, "|P|"), FirebaseInstanceId.a(localKeyPair.getPublic().getEncoded()));
      localEditor.putString(a(paramString, "|K|"), FirebaseInstanceId.a(localKeyPair.getPrivate().getEncoded()));
      localEditor.putString(a(paramString, "cre"), Long.toString(l));
      localEditor.commit();
      return localKeyPair;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload 4
    //   4: aload 5
    //   6: invokestatic 209	java/lang/System:currentTimeMillis	()J
    //   9: invokestatic 252	com/google/firebase/iid/h$a:a	(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    //   12: astore 4
    //   14: aload 4
    //   16: ifnonnull +6 -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 33	com/google/firebase/iid/h:a	Landroid/content/SharedPreferences;
    //   26: invokeinterface 150 1 0
    //   31: astore 5
    //   33: aload 5
    //   35: aload_1
    //   36: aload_2
    //   37: aload_3
    //   38: invokestatic 191	com/google/firebase/iid/h:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   41: aload 4
    //   43: invokeinterface 232 3 0
    //   48: pop
    //   49: aload 5
    //   51: invokeinterface 188 1 0
    //   56: pop
    //   57: goto -38 -> 19
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	h
    //   0	65	1	paramString1	String
    //   0	65	2	paramString2	String
    //   0	65	3	paramString3	String
    //   0	65	4	paramString4	String
    //   0	65	5	paramString5	String
    // Exception table:
    //   from	to	target	type
    //   2	14	60	finally
    //   22	57	60	finally
  }
  
  public final boolean a()
  {
    try
    {
      boolean bool = a.getAll().isEmpty();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b()
  {
    try
    {
      a.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  final void b(String paramString)
  {
    try
    {
      e(String.valueOf(paramString).concat("|"));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void b(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = c(paramString1, paramString2, paramString3);
      paramString2 = a.edit();
      paramString2.remove(paramString1);
      paramString2.commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final void c(String paramString)
  {
    try
    {
      e(String.valueOf(paramString).concat("|T|"));
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public final KeyPair d(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/google/firebase/iid/h:a	Landroid/content/SharedPreferences;
    //   6: aload_1
    //   7: ldc -45
    //   9: invokestatic 213	com/google/firebase/iid/h:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   12: aconst_null
    //   13: invokeinterface 194 3 0
    //   18: astore_2
    //   19: aload_0
    //   20: getfield 33	com/google/firebase/iid/h:a	Landroid/content/SharedPreferences;
    //   23: aload_1
    //   24: ldc -22
    //   26: invokestatic 213	com/google/firebase/iid/h:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   29: aconst_null
    //   30: invokeinterface 194 3 0
    //   35: astore_3
    //   36: aload_2
    //   37: ifnull +7 -> 44
    //   40: aload_3
    //   41: ifnonnull +9 -> 50
    //   44: aconst_null
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: areturn
    //   50: aload_2
    //   51: bipush 8
    //   53: invokestatic 271	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   56: astore_1
    //   57: aload_3
    //   58: bipush 8
    //   60: invokestatic 271	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   63: astore_2
    //   64: ldc_w 273
    //   67: invokestatic 279	java/security/KeyFactory:getInstance	(Ljava/lang/String;)Ljava/security/KeyFactory;
    //   70: astore_3
    //   71: new 215	java/security/KeyPair
    //   74: dup
    //   75: aload_3
    //   76: new 281	java/security/spec/X509EncodedKeySpec
    //   79: dup
    //   80: aload_1
    //   81: invokespecial 284	java/security/spec/X509EncodedKeySpec:<init>	([B)V
    //   84: invokevirtual 288	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   87: aload_3
    //   88: new 290	java/security/spec/PKCS8EncodedKeySpec
    //   91: dup
    //   92: aload_2
    //   93: invokespecial 291	java/security/spec/PKCS8EncodedKeySpec:<init>	([B)V
    //   96: invokevirtual 295	java/security/KeyFactory:generatePrivate	(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   99: invokespecial 298	java/security/KeyPair:<init>	(Ljava/security/PublicKey;Ljava/security/PrivateKey;)V
    //   102: astore_1
    //   103: goto -57 -> 46
    //   106: astore_1
    //   107: aload_1
    //   108: invokestatic 39	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   111: astore_1
    //   112: ldc 74
    //   114: new 128	java/lang/StringBuilder
    //   117: dup
    //   118: aload_1
    //   119: invokestatic 39	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: invokevirtual 45	java/lang/String:length	()I
    //   125: bipush 19
    //   127: iadd
    //   128: invokespecial 131	java/lang/StringBuilder:<init>	(I)V
    //   131: ldc_w 300
    //   134: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload_1
    //   138: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 303	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   147: pop
    //   148: aload_0
    //   149: getfield 25	com/google/firebase/iid/h:b	Landroid/content/Context;
    //   152: aload_0
    //   153: invokestatic 87	com/google/firebase/iid/FirebaseInstanceId:a	(Landroid/content/Context;Lcom/google/firebase/iid/h;)V
    //   156: aconst_null
    //   157: astore_1
    //   158: goto -112 -> 46
    //   161: astore_1
    //   162: aload_0
    //   163: monitorexit
    //   164: aload_1
    //   165: athrow
    //   166: astore_1
    //   167: goto -60 -> 107
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	h
    //   0	170	1	paramString	String
    //   18	75	2	localObject1	Object
    //   35	53	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   50	103	106	java/security/spec/InvalidKeySpecException
    //   2	36	161	finally
    //   50	103	161	finally
    //   107	156	161	finally
    //   50	103	166	java/security/NoSuchAlgorithmException
  }
  
  static final class a
  {
    private static final long d = TimeUnit.DAYS.toMillis(7L);
    final String a;
    final String b;
    final long c;
    
    private a(String paramString1, String paramString2, long paramLong)
    {
      a = paramString1;
      b = paramString2;
      c = paramLong;
    }
    
    static a a(String paramString)
    {
      if (TextUtils.isEmpty(paramString)) {
        return null;
      }
      if (paramString.startsWith("{")) {
        try
        {
          paramString = new JSONObject(paramString);
          paramString = new a(paramString.getString("token"), paramString.getString("appVersion"), paramString.getLong("timestamp"));
          return paramString;
        }
        catch (JSONException paramString)
        {
          paramString = String.valueOf(paramString);
          Log.w("InstanceID/Store", String.valueOf(paramString).length() + 23 + "Failed to parse token: " + paramString);
          return null;
        }
      }
      return new a(paramString, null, 0L);
    }
    
    static String a(String paramString1, String paramString2, long paramLong)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("token", paramString1);
        localJSONObject.put("appVersion", paramString2);
        localJSONObject.put("timestamp", paramLong);
        paramString1 = localJSONObject.toString();
        return paramString1;
      }
      catch (JSONException paramString1)
      {
        paramString1 = String.valueOf(paramString1);
        Log.w("InstanceID/Store", String.valueOf(paramString1).length() + 24 + "Failed to encode token: " + paramString1);
      }
      return null;
    }
    
    final boolean b(String paramString)
    {
      return (System.currentTimeMillis() > c + d) || (!paramString.equals(b));
    }
  }
}


/* Location:              com/google/firebase/iid/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */