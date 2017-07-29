package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.g.k;
import android.util.Log;
import com.google.android.gms.common.util.i;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class f
{
  static String a = null;
  static boolean b = false;
  static int c = 0;
  static int d = 0;
  static int e = 0;
  static BroadcastReceiver f = null;
  static PendingIntent k;
  Context g;
  Messenger h;
  Messenger i;
  MessengerCompat j;
  long l;
  long m;
  int n;
  int o;
  long p;
  private final k<String, b> q = new k();
  
  public f(Context paramContext)
  {
    g = paramContext;
  }
  
  public static String a()
  {
    try
    {
      int i1 = e;
      e = i1 + 1;
      String str = Integer.toString(i1);
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static String a(Context paramContext)
  {
    if (a != null) {
      return a;
    }
    c = Process.myUid();
    paramContext = paramContext.getPackageManager();
    Iterator localIterator = paramContext.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
    while (localIterator.hasNext()) {
      if (a(paramContext, nextactivityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
        b = true;
      }
    }
    for (int i1 = 1; i1 != 0; i1 = 0) {
      return a;
    }
    if ((!i.g()) && (a(paramContext))) {
      return a;
    }
    Log.w("InstanceID/Rpc", "Failed to resolve IID implementation package, falling back");
    if (a(paramContext, "com.google.android.gms"))
    {
      b = i.g();
      return a;
    }
    if ((!i.e()) && (a(paramContext, "com.google.android.gsf")))
    {
      b = false;
      return a;
    }
    Log.w("InstanceID/Rpc", "Google Play services is missing, unable to get tokens");
    return null;
  }
  
  static String a(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    String str2 = paramIntent.getStringExtra("registration_id");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramIntent.getStringExtra("unregistered");
    }
    if (str1 == null)
    {
      str1 = paramIntent.getStringExtra("error");
      if (str1 != null) {
        throw new IOException(str1);
      }
      paramIntent = String.valueOf(paramIntent.getExtras());
      Log.w("InstanceID/Rpc", String.valueOf(paramIntent).length() + 29 + "Unexpected response from GCM " + paramIntent, new Throwable());
      throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    return str1;
  }
  
  /* Error */
  private static String a(java.security.KeyPair paramKeyPair, String... paramVarArgs)
  {
    // Byte code:
    //   0: ldc -44
    //   2: aload_1
    //   3: invokestatic 218	android/text/TextUtils:join	(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //   6: ldc -36
    //   8: invokevirtual 224	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   11: astore_1
    //   12: aload_0
    //   13: invokevirtual 230	java/security/KeyPair:getPrivate	()Ljava/security/PrivateKey;
    //   16: astore_2
    //   17: aload_2
    //   18: instanceof 232
    //   21: ifeq +44 -> 65
    //   24: ldc -22
    //   26: astore_0
    //   27: aload_0
    //   28: invokestatic 240	java/security/Signature:getInstance	(Ljava/lang/String;)Ljava/security/Signature;
    //   31: astore_0
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual 244	java/security/Signature:initSign	(Ljava/security/PrivateKey;)V
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual 248	java/security/Signature:update	([B)V
    //   42: aload_0
    //   43: invokevirtual 252	java/security/Signature:sign	()[B
    //   46: invokestatic 257	com/google/firebase/iid/FirebaseInstanceId:a	([B)Ljava/lang/String;
    //   49: astore_0
    //   50: aload_0
    //   51: areturn
    //   52: astore_0
    //   53: ldc -118
    //   55: ldc_w 259
    //   58: aload_0
    //   59: invokestatic 261	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   62: pop
    //   63: aconst_null
    //   64: areturn
    //   65: ldc_w 263
    //   68: astore_0
    //   69: goto -42 -> 27
    //   72: astore_0
    //   73: ldc -118
    //   75: ldc_w 265
    //   78: aload_0
    //   79: invokestatic 261	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   82: pop
    //   83: aconst_null
    //   84: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	paramKeyPair	java.security.KeyPair
    //   0	85	1	paramVarArgs	String[]
    //   16	18	2	localPrivateKey	java.security.PrivateKey
    // Exception table:
    //   from	to	target	type
    //   0	12	52	java/io/UnsupportedEncodingException
    //   12	24	72	java/security/GeneralSecurityException
    //   27	50	72	java/security/GeneralSecurityException
  }
  
  public static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      if (k == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        k = PendingIntent.getBroadcast(paramContext, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", k);
      return;
    }
    finally {}
  }
  
  private void a(String paramString, Intent paramIntent)
  {
    b localb;
    synchronized (q)
    {
      localb = (b)q.remove(paramString);
      if (localb == null)
      {
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0)
        {
          paramString = "Missing callback for ".concat(paramString);
          Log.w("InstanceID/Rpc", paramString);
          return;
        }
        paramString = new String("Missing callback for ");
      }
    }
    localb.a(paramIntent);
  }
  
  private void a(String paramString1, String paramString2)
  {
    k localk = q;
    int i1;
    if (paramString1 == null) {
      i1 = 0;
    }
    for (;;)
    {
      try
      {
        if (i1 < q.size())
        {
          ((b)q.c(i1)).a(paramString2);
          i1 += 1;
          continue;
        }
        q.clear();
        return;
      }
      finally {}
      b localb = (b)q.remove(paramString1);
      if (localb == null)
      {
        paramString1 = String.valueOf(paramString1);
        if (paramString1.length() != 0)
        {
          paramString1 = "Missing callback for ".concat(paramString1);
          Log.w("InstanceID/Rpc", paramString1);
          return;
        }
        paramString1 = new String("Missing callback for ");
        continue;
      }
      localb.a(paramString2);
    }
  }
  
  private static boolean a(PackageManager paramPackageManager)
  {
    Iterator localIterator = paramPackageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
    while (localIterator.hasNext()) {
      if (a(paramPackageManager, nextserviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER"))
      {
        b = false;
        return true;
      }
    }
    return false;
  }
  
  private static boolean a(PackageManager paramPackageManager, String paramString)
  {
    try
    {
      paramPackageManager = paramPackageManager.getApplicationInfo(paramString, 0);
      a = packageName;
      d = uid;
      return true;
    }
    catch (PackageManager.NameNotFoundException paramPackageManager) {}
    return false;
  }
  
  private static boolean a(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    if (paramPackageManager.checkPermission("com.google.android.c2dm.permission.SEND", paramString1) == 0) {
      return a(paramPackageManager, paramString1);
    }
    Log.w("InstanceID/Rpc", String.valueOf(paramString1).length() + 56 + String.valueOf(paramString2).length() + "Possible malicious package " + paramString1 + " declares " + paramString2 + " without permission");
    return false;
  }
  
  private void b()
  {
    if (h != null) {
      return;
    }
    a(g);
    h = new Messenger(new Handler(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        f localf = f.this;
        if (paramAnonymousMessage != null)
        {
          if ((obj instanceof Intent))
          {
            Object localObject = (Intent)obj;
            ((Intent)localObject).setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (((Intent)localObject).hasExtra("google.messenger"))
            {
              localObject = ((Intent)localObject).getParcelableExtra("google.messenger");
              if ((localObject instanceof MessengerCompat)) {
                j = ((MessengerCompat)localObject);
              }
              if ((localObject instanceof Messenger)) {
                i = ((Messenger)localObject);
              }
            }
            localf.b((Intent)obj);
          }
        }
        else {
          return;
        }
        Log.w("InstanceID/Rpc", "Dropping invalid message");
      }
    });
  }
  
  /* Error */
  final Intent a(android.os.Bundle arg1, java.security.KeyPair paramKeyPair)
  {
    // Byte code:
    //   0: invokestatic 371	com/google/firebase/iid/f:a	()Ljava/lang/String;
    //   3: astore 10
    //   5: new 10	com/google/firebase/iid/f$a
    //   8: dup
    //   9: iconst_0
    //   10: invokespecial 374	com/google/firebase/iid/f$a:<init>	(B)V
    //   13: astore 11
    //   15: aload_0
    //   16: getfield 64	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   19: astore 9
    //   21: aload 9
    //   23: monitorenter
    //   24: aload_0
    //   25: getfield 64	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   28: aload 10
    //   30: aload 11
    //   32: invokevirtual 378	android/support/v4/g/k:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   35: pop
    //   36: aload 9
    //   38: monitorexit
    //   39: invokestatic 384	android/os/SystemClock:elapsedRealtime	()J
    //   42: lstore 4
    //   44: aload_0
    //   45: getfield 386	com/google/firebase/iid/f:p	J
    //   48: lconst_0
    //   49: lcmp
    //   50: ifeq +83 -> 133
    //   53: lload 4
    //   55: aload_0
    //   56: getfield 386	com/google/firebase/iid/f:p	J
    //   59: lcmp
    //   60: ifgt +73 -> 133
    //   63: aload_0
    //   64: getfield 386	com/google/firebase/iid/f:p	J
    //   67: lstore 6
    //   69: aload_0
    //   70: getfield 388	com/google/firebase/iid/f:o	I
    //   73: istore_3
    //   74: ldc -118
    //   76: new 185	java/lang/StringBuilder
    //   79: dup
    //   80: bipush 78
    //   82: invokespecial 191	java/lang/StringBuilder:<init>	(I)V
    //   85: ldc_w 390
    //   88: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: lload 6
    //   93: lload 4
    //   95: lsub
    //   96: invokevirtual 393	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   99: ldc_w 395
    //   102: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: iload_3
    //   106: invokevirtual 398	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   109: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokestatic 146	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   115: pop
    //   116: new 160	java/io/IOException
    //   119: dup
    //   120: ldc_w 400
    //   123: invokespecial 163	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   126: athrow
    //   127: astore_1
    //   128: aload 9
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    //   133: aload_0
    //   134: invokespecial 402	com/google/firebase/iid/f:b	()V
    //   137: getstatic 44	com/google/firebase/iid/f:a	Ljava/lang/String;
    //   140: ifnonnull +14 -> 154
    //   143: new 160	java/io/IOException
    //   146: dup
    //   147: ldc_w 404
    //   150: invokespecial 163	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   153: athrow
    //   154: aload_0
    //   155: invokestatic 384	android/os/SystemClock:elapsedRealtime	()J
    //   158: putfield 406	com/google/firebase/iid/f:l	J
    //   161: getstatic 46	com/google/firebase/iid/f:b	Z
    //   164: ifeq +496 -> 660
    //   167: ldc 90
    //   169: astore 9
    //   171: new 88	android/content/Intent
    //   174: dup
    //   175: aload 9
    //   177: invokespecial 93	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   180: astore 9
    //   182: aload 9
    //   184: getstatic 44	com/google/firebase/iid/f:a	Ljava/lang/String;
    //   187: invokevirtual 275	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   190: pop
    //   191: aload_1
    //   192: ldc_w 408
    //   195: aload_0
    //   196: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   199: aload_0
    //   200: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   203: invokestatic 352	com/google/firebase/iid/f:a	(Landroid/content/Context;)Ljava/lang/String;
    //   206: invokestatic 411	com/google/firebase/iid/FirebaseInstanceId:a	(Landroid/content/Context;Ljava/lang/String;)I
    //   209: invokestatic 73	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   212: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   215: aload_1
    //   216: ldc_w 418
    //   219: getstatic 423	android/os/Build$VERSION:SDK_INT	I
    //   222: invokestatic 73	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   225: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   228: aload_1
    //   229: ldc_w 425
    //   232: aload_0
    //   233: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   236: invokestatic 428	com/google/firebase/iid/FirebaseInstanceId:a	(Landroid/content/Context;)I
    //   239: invokestatic 73	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   242: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   245: aload_1
    //   246: ldc_w 430
    //   249: aload_0
    //   250: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   253: invokestatic 432	com/google/firebase/iid/FirebaseInstanceId:b	(Landroid/content/Context;)Ljava/lang/String;
    //   256: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   259: aload_1
    //   260: ldc_w 434
    //   263: ldc_w 436
    //   266: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   269: aload_1
    //   270: ldc_w 438
    //   273: aload_2
    //   274: invokestatic 441	com/google/firebase/iid/FirebaseInstanceId:a	(Ljava/security/KeyPair;)Ljava/lang/String;
    //   277: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   280: aload_2
    //   281: invokevirtual 445	java/security/KeyPair:getPublic	()Ljava/security/PublicKey;
    //   284: invokeinterface 450 1 0
    //   289: invokestatic 257	com/google/firebase/iid/FirebaseInstanceId:a	([B)Ljava/lang/String;
    //   292: astore 12
    //   294: aload_1
    //   295: ldc_w 452
    //   298: aload 12
    //   300: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   303: aload_1
    //   304: ldc_w 454
    //   307: aload_2
    //   308: iconst_2
    //   309: anewarray 179	java/lang/String
    //   312: dup
    //   313: iconst_0
    //   314: aload_0
    //   315: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   318: invokevirtual 457	android/content/Context:getPackageName	()Ljava/lang/String;
    //   321: aastore
    //   322: dup
    //   323: iconst_1
    //   324: aload 12
    //   326: aastore
    //   327: invokestatic 459	com/google/firebase/iid/f:a	(Ljava/security/KeyPair;[Ljava/lang/String;)Ljava/lang/String;
    //   330: invokevirtual 416	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload 9
    //   335: aload_1
    //   336: invokevirtual 463	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   339: pop
    //   340: aload_0
    //   341: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   344: aload 9
    //   346: invokestatic 465	com/google/firebase/iid/f:a	(Landroid/content/Context;Landroid/content/Intent;)V
    //   349: aload_0
    //   350: invokestatic 384	android/os/SystemClock:elapsedRealtime	()J
    //   353: putfield 406	com/google/firebase/iid/f:l	J
    //   356: aload 9
    //   358: ldc_w 467
    //   361: new 185	java/lang/StringBuilder
    //   364: dup
    //   365: aload 10
    //   367: invokestatic 183	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   370: invokevirtual 188	java/lang/String:length	()I
    //   373: iconst_5
    //   374: iadd
    //   375: invokespecial 191	java/lang/StringBuilder:<init>	(I)V
    //   378: ldc_w 469
    //   381: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: aload 10
    //   386: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: ldc_w 471
    //   392: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   398: invokevirtual 474	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   401: pop
    //   402: aload 9
    //   404: ldc_w 476
    //   407: new 185	java/lang/StringBuilder
    //   410: dup
    //   411: aload 10
    //   413: invokestatic 183	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   416: invokevirtual 188	java/lang/String:length	()I
    //   419: iconst_5
    //   420: iadd
    //   421: invokespecial 191	java/lang/StringBuilder:<init>	(I)V
    //   424: ldc_w 469
    //   427: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: aload 10
    //   432: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: ldc_w 471
    //   438: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: invokevirtual 474	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   447: pop
    //   448: ldc -101
    //   450: getstatic 44	com/google/firebase/iid/f:a	Ljava/lang/String;
    //   453: invokevirtual 480	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   456: istore 8
    //   458: ldc -118
    //   460: iconst_3
    //   461: invokestatic 484	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   464: ifeq +48 -> 512
    //   467: aload 9
    //   469: invokevirtual 177	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   472: invokestatic 183	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   475: astore_1
    //   476: ldc -118
    //   478: new 185	java/lang/StringBuilder
    //   481: dup
    //   482: aload_1
    //   483: invokestatic 183	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   486: invokevirtual 188	java/lang/String:length	()I
    //   489: bipush 8
    //   491: iadd
    //   492: invokespecial 191	java/lang/StringBuilder:<init>	(I)V
    //   495: ldc_w 486
    //   498: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: aload_1
    //   502: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   508: invokestatic 488	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   511: pop
    //   512: iload 8
    //   514: ifeq +159 -> 673
    //   517: aload_0
    //   518: monitorenter
    //   519: getstatic 54	com/google/firebase/iid/f:f	Landroid/content/BroadcastReceiver;
    //   522: ifnonnull +70 -> 592
    //   525: new 8	com/google/firebase/iid/f$2
    //   528: dup
    //   529: aload_0
    //   530: invokespecial 491	com/google/firebase/iid/f$2:<init>	(Lcom/google/firebase/iid/f;)V
    //   533: putstatic 54	com/google/firebase/iid/f:f	Landroid/content/BroadcastReceiver;
    //   536: ldc -118
    //   538: iconst_3
    //   539: invokestatic 484	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   542: ifeq +12 -> 554
    //   545: ldc -118
    //   547: ldc_w 493
    //   550: invokestatic 488	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   553: pop
    //   554: new 495	android/content/IntentFilter
    //   557: dup
    //   558: ldc_w 497
    //   561: invokespecial 498	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   564: astore_1
    //   565: aload_1
    //   566: aload_0
    //   567: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   570: invokevirtual 457	android/content/Context:getPackageName	()Ljava/lang/String;
    //   573: invokevirtual 501	android/content/IntentFilter:addCategory	(Ljava/lang/String;)V
    //   576: aload_0
    //   577: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   580: getstatic 54	com/google/firebase/iid/f:f	Landroid/content/BroadcastReceiver;
    //   583: aload_1
    //   584: ldc_w 339
    //   587: aconst_null
    //   588: invokevirtual 505	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    //   591: pop
    //   592: aload_0
    //   593: monitorexit
    //   594: aload_0
    //   595: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   598: aload 9
    //   600: invokevirtual 509	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   603: pop
    //   604: aload 11
    //   606: getfield 512	com/google/firebase/iid/f$a:a	Landroid/os/ConditionVariable;
    //   609: ldc2_w 513
    //   612: invokevirtual 520	android/os/ConditionVariable:block	(J)Z
    //   615: ifne +199 -> 814
    //   618: ldc -118
    //   620: ldc_w 522
    //   623: invokestatic 146	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   626: pop
    //   627: new 160	java/io/IOException
    //   630: dup
    //   631: ldc_w 524
    //   634: invokespecial 163	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   637: athrow
    //   638: astore_2
    //   639: aload_0
    //   640: getfield 64	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   643: astore_1
    //   644: aload_1
    //   645: monitorenter
    //   646: aload_0
    //   647: getfield 64	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   650: aload 10
    //   652: invokevirtual 292	android/support/v4/g/k:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   655: pop
    //   656: aload_1
    //   657: monitorexit
    //   658: aload_2
    //   659: athrow
    //   660: ldc_w 315
    //   663: astore 9
    //   665: goto -494 -> 171
    //   668: astore_1
    //   669: aload_0
    //   670: monitorexit
    //   671: aload_1
    //   672: athrow
    //   673: aload 9
    //   675: ldc_w 526
    //   678: aload_0
    //   679: getfield 350	com/google/firebase/iid/f:h	Landroid/os/Messenger;
    //   682: invokevirtual 287	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   685: pop
    //   686: aload_0
    //   687: getfield 528	com/google/firebase/iid/f:i	Landroid/os/Messenger;
    //   690: ifnonnull +10 -> 700
    //   693: aload_0
    //   694: getfield 530	com/google/firebase/iid/f:j	Lcom/google/android/gms/iid/MessengerCompat;
    //   697: ifnull +50 -> 747
    //   700: invokestatic 536	android/os/Message:obtain	()Landroid/os/Message;
    //   703: astore_1
    //   704: aload_1
    //   705: aload 9
    //   707: putfield 540	android/os/Message:obj	Ljava/lang/Object;
    //   710: aload_0
    //   711: getfield 528	com/google/firebase/iid/f:i	Landroid/os/Messenger;
    //   714: ifnull +51 -> 765
    //   717: aload_0
    //   718: getfield 528	com/google/firebase/iid/f:i	Landroid/os/Messenger;
    //   721: aload_1
    //   722: invokevirtual 544	android/os/Messenger:send	(Landroid/os/Message;)V
    //   725: goto -121 -> 604
    //   728: astore_1
    //   729: ldc -118
    //   731: iconst_3
    //   732: invokestatic 484	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   735: ifeq +12 -> 747
    //   738: ldc -118
    //   740: ldc_w 546
    //   743: invokestatic 488	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   746: pop
    //   747: getstatic 46	com/google/firebase/iid/f:b	Z
    //   750: ifeq +51 -> 801
    //   753: aload_0
    //   754: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   757: aload 9
    //   759: invokevirtual 549	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   762: goto -158 -> 604
    //   765: aload_0
    //   766: getfield 530	com/google/firebase/iid/f:j	Lcom/google/android/gms/iid/MessengerCompat;
    //   769: astore_2
    //   770: aload_2
    //   771: getfield 553	com/google/android/gms/iid/MessengerCompat:a	Landroid/os/Messenger;
    //   774: ifnull +14 -> 788
    //   777: aload_2
    //   778: getfield 553	com/google/android/gms/iid/MessengerCompat:a	Landroid/os/Messenger;
    //   781: aload_1
    //   782: invokevirtual 544	android/os/Messenger:send	(Landroid/os/Message;)V
    //   785: goto -181 -> 604
    //   788: aload_2
    //   789: getfield 556	com/google/android/gms/iid/MessengerCompat:b	Lcom/google/android/gms/iid/a;
    //   792: aload_1
    //   793: invokeinterface 560 2 0
    //   798: goto -194 -> 604
    //   801: aload_0
    //   802: getfield 66	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   805: aload 9
    //   807: invokevirtual 509	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   810: pop
    //   811: goto -207 -> 604
    //   814: aload 11
    //   816: getfield 562	com/google/firebase/iid/f$a:c	Ljava/lang/String;
    //   819: ifnull +16 -> 835
    //   822: new 160	java/io/IOException
    //   825: dup
    //   826: aload 11
    //   828: getfield 562	com/google/firebase/iid/f$a:c	Ljava/lang/String;
    //   831: invokespecial 163	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   834: athrow
    //   835: aload 11
    //   837: getfield 565	com/google/firebase/iid/f$a:b	Landroid/content/Intent;
    //   840: astore_2
    //   841: aload_0
    //   842: getfield 64	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   845: astore_1
    //   846: aload_1
    //   847: monitorenter
    //   848: aload_0
    //   849: getfield 64	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   852: aload 10
    //   854: invokevirtual 292	android/support/v4/g/k:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   857: pop
    //   858: aload_1
    //   859: monitorexit
    //   860: aload_2
    //   861: areturn
    //   862: astore_2
    //   863: aload_1
    //   864: monitorexit
    //   865: aload_2
    //   866: athrow
    //   867: astore_2
    //   868: aload_1
    //   869: monitorexit
    //   870: aload_2
    //   871: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	872	0	this	f
    //   0	872	2	paramKeyPair	java.security.KeyPair
    //   73	33	3	i1	int
    //   42	52	4	l1	long
    //   67	25	6	l2	long
    //   456	57	8	bool	boolean
    //   19	787	9	localObject	Object
    //   3	850	10	str1	String
    //   13	823	11	locala	a
    //   292	33	12	str2	String
    // Exception table:
    //   from	to	target	type
    //   24	39	127	finally
    //   128	131	127	finally
    //   604	638	638	finally
    //   814	835	638	finally
    //   835	841	638	finally
    //   519	554	668	finally
    //   554	592	668	finally
    //   592	594	668	finally
    //   669	671	668	finally
    //   710	725	728	android/os/RemoteException
    //   765	785	728	android/os/RemoteException
    //   788	798	728	android/os/RemoteException
    //   848	860	862	finally
    //   863	865	862	finally
    //   646	658	867	finally
    //   868	870	867	finally
  }
  
  final void b(Intent paramIntent)
  {
    Object localObject2 = null;
    if (paramIntent == null) {
      if (Log.isLoggable("InstanceID/Rpc", 3)) {
        Log.d("InstanceID/Rpc", "Unexpected response: null");
      }
    }
    do
    {
      return;
      if ("com.google.android.c2dm.intent.REGISTRATION".equals(paramIntent.getAction())) {
        break;
      }
    } while (!Log.isLoggable("InstanceID/Rpc", 3));
    paramIntent = String.valueOf(paramIntent.getAction());
    if (paramIntent.length() != 0) {}
    for (paramIntent = "Unexpected response ".concat(paramIntent);; paramIntent = new String("Unexpected response "))
    {
      Log.d("InstanceID/Rpc", paramIntent);
      return;
    }
    Object localObject3 = paramIntent.getStringExtra("registration_id");
    Object localObject1 = localObject3;
    if (localObject3 == null) {
      localObject1 = paramIntent.getStringExtra("unregistered");
    }
    if (localObject1 == null)
    {
      localObject2 = paramIntent.getStringExtra("error");
      if (localObject2 == null)
      {
        paramIntent = String.valueOf(paramIntent.getExtras());
        Log.w("InstanceID/Rpc", String.valueOf(paramIntent).length() + 49 + "Unexpected response, no error or registration id " + paramIntent);
        return;
      }
      if (Log.isLoggable("InstanceID/Rpc", 3))
      {
        localObject1 = String.valueOf(localObject2);
        if (((String)localObject1).length() != 0)
        {
          localObject1 = "Received InstanceID error ".concat((String)localObject1);
          label215:
          Log.d("InstanceID/Rpc", (String)localObject1);
        }
      }
      else
      {
        if (!((String)localObject2).startsWith("|")) {
          break label894;
        }
        Object localObject4 = ((String)localObject2).split("\\|");
        if (!"ID".equals(localObject4[1]))
        {
          localObject1 = String.valueOf(localObject2);
          if (((String)localObject1).length() == 0) {
            break label451;
          }
          localObject1 = "Unexpected structured response ".concat((String)localObject1);
          label282:
          Log.w("InstanceID/Rpc", (String)localObject1);
        }
        if (localObject4.length <= 2) {
          break label466;
        }
        localObject3 = localObject4[2];
        localObject4 = localObject4[3];
        localObject2 = localObject3;
        localObject1 = localObject4;
        if (((String)localObject4).startsWith(":"))
        {
          localObject1 = ((String)localObject4).substring(1);
          localObject2 = localObject3;
        }
        label340:
        paramIntent.putExtra("error", (String)localObject1);
      }
    }
    for (;;)
    {
      a((String)localObject2, (String)localObject1);
      long l1 = paramIntent.getLongExtra("Retry-After", 0L);
      if (l1 > 0L)
      {
        m = SystemClock.elapsedRealtime();
        o = ((int)l1 * 1000);
        p = (SystemClock.elapsedRealtime() + o);
        i1 = o;
        Log.w("InstanceID/Rpc", 52 + "Explicit request from server to backoff: " + i1);
        return;
        localObject1 = new String("Received InstanceID error ");
        break label215;
        label451:
        localObject1 = new String("Unexpected structured response ");
        break label282;
        label466:
        localObject1 = "UNKNOWN";
        localObject2 = null;
        break label340;
      }
      if (((!"SERVICE_NOT_AVAILABLE".equals(localObject1)) && (!"AUTHENTICATION_FAILED".equals(localObject1))) || (!"com.google.android.gsf".equals(a))) {
        break;
      }
      n += 1;
      if (n < 3) {
        break;
      }
      if (n == 3) {
        o = (new Random().nextInt(1000) + 1000);
      }
      o *= 2;
      p = (SystemClock.elapsedRealtime() + o);
      int i1 = o;
      Log.w("InstanceID/Rpc", String.valueOf(localObject1).length() + 31 + "Backoff due to " + (String)localObject1 + " for " + i1);
      return;
      l = SystemClock.elapsedRealtime();
      p = 0L;
      n = 0;
      o = 0;
      if (((String)localObject1).startsWith("|"))
      {
        localObject3 = ((String)localObject1).split("\\|");
        if (!"ID".equals(localObject3[1]))
        {
          localObject1 = String.valueOf(localObject1);
          if (((String)localObject1).length() == 0) {
            break label821;
          }
          localObject1 = "Unexpected structured response ".concat((String)localObject1);
          label714:
          Log.w("InstanceID/Rpc", (String)localObject1);
        }
        localObject2 = localObject3[2];
        if (localObject3.length > 4)
        {
          if (!"SYNC".equals(localObject3[3])) {
            break label836;
          }
          FirebaseInstanceId.c(g);
        }
      }
      label821:
      label836:
      while (!"RST".equals(localObject3[3]))
      {
        localObject3 = localObject3[(localObject3.length - 1)];
        localObject1 = localObject3;
        if (((String)localObject3).startsWith(":")) {
          localObject1 = ((String)localObject3).substring(1);
        }
        paramIntent.putExtra("registration_id", (String)localObject1);
        if (localObject2 != null) {
          break label886;
        }
        if (!Log.isLoggable("InstanceID/Rpc", 3)) {
          break;
        }
        Log.d("InstanceID/Rpc", "Ignoring response without a request ID");
        return;
        localObject1 = new String("Unexpected structured response ");
        break label714;
      }
      localObject1 = g;
      d.a(g, null);
      FirebaseInstanceId.a((Context)localObject1, d.c());
      paramIntent.removeExtra("registration_id");
      a((String)localObject2, paramIntent);
      return;
      label886:
      a((String)localObject2, paramIntent);
      return;
      label894:
      localObject3 = null;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
  
  private static final class a
    implements f.b
  {
    final ConditionVariable a = new ConditionVariable();
    Intent b;
    String c;
    
    public final void a(Intent paramIntent)
    {
      b = paramIntent;
      a.open();
    }
    
    public final void a(String paramString)
    {
      c = paramString;
      a.open();
    }
  }
  
  private static abstract interface b
  {
    public abstract void a(Intent paramIntent);
    
    public abstract void a(String paramString);
  }
}


/* Location:              com/google/firebase/iid/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */