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
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.g.k;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.i;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
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
  private final k q;
  
  public f(Context paramContext)
  {
    k localk = new android/support/v4/g/k;
    localk.<init>();
    q = localk;
    g = paramContext;
  }
  
  public static String a()
  {
    synchronized (f.class)
    {
      int i1 = e;
      int i2 = i1 + 1;
      e = i2;
      String str = Integer.toString(i1);
      return str;
    }
  }
  
  public static String a(Context paramContext)
  {
    boolean bool1 = true;
    Object localObject = a;
    if (localObject != null) {
      localObject = a;
    }
    for (;;)
    {
      return (String)localObject;
      int i1 = Process.myUid();
      c = i1;
      PackageManager localPackageManager = paramContext.getPackageManager();
      localObject = new android/content/Intent;
      ((Intent)localObject).<init>("com.google.iid.TOKEN_REQUEST");
      localObject = localPackageManager.queryBroadcastReceivers((Intent)localObject, 0);
      Iterator localIterator = ((List)localObject).iterator();
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = nextactivityInfo.packageName;
        String str1 = "com.google.iid.TOKEN_REQUEST";
        bool2 = a(localPackageManager, (String)localObject, str1);
      } while (!bool2);
      b = bool1;
      boolean bool2 = bool1;
      for (;;)
      {
        if (!bool2) {
          break label126;
        }
        localObject = a;
        break;
        bool2 = false;
        localObject = null;
      }
      label126:
      bool2 = i.g();
      if (!bool2)
      {
        bool2 = a(localPackageManager);
        if (bool2)
        {
          localObject = a;
          continue;
        }
      }
      String str2 = "Failed to resolve IID implementation package, falling back";
      Log.w("InstanceID/Rpc", str2);
      localObject = "com.google.android.gms";
      bool2 = a(localPackageManager, (String)localObject);
      if (bool2)
      {
        bool2 = i.g();
        b = bool2;
        localObject = a;
      }
      else
      {
        bool2 = i.e();
        if (!bool2)
        {
          localObject = "com.google.android.gsf";
          bool2 = a(localPackageManager, (String)localObject);
          if (bool2)
          {
            b = false;
            localObject = a;
            continue;
          }
        }
        str2 = "Google Play services is missing, unable to get tokens";
        Log.w("InstanceID/Rpc", str2);
        bool2 = false;
        localObject = null;
      }
    }
  }
  
  static String a(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("SERVICE_NOT_AVAILABLE");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = paramIntent.getStringExtra("registration_id");
    if (localObject1 == null) {
      localObject1 = paramIntent.getStringExtra("unregistered");
    }
    if (localObject1 == null)
    {
      localObject1 = paramIntent.getStringExtra("error");
      if (localObject1 != null)
      {
        localObject2 = new java/io/IOException;
        ((IOException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      Object localObject2 = String.valueOf(paramIntent.getExtras());
      int i1 = String.valueOf(localObject2).length() + 29;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i1);
      localObject2 = "Unexpected response from GCM " + (String)localObject2;
      Throwable localThrowable = new java/lang/Throwable;
      localThrowable.<init>();
      Log.w("InstanceID/Rpc", (String)localObject2, localThrowable);
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("SERVICE_NOT_AVAILABLE");
      throw ((Throwable)localObject1);
    }
    return (String)localObject1;
  }
  
  private static String a(KeyPair paramKeyPair, String... paramVarArgs)
  {
    String str1 = null;
    Object localObject1 = "\n";
    for (;;)
    {
      Object localObject2;
      Object localObject3;
      try
      {
        localObject1 = TextUtils.join((CharSequence)localObject1, paramVarArgs);
        localObject2 = "UTF-8";
        localObject2 = ((String)localObject1).getBytes((String)localObject2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        boolean bool;
        localObject2 = "InstanceID/Rpc";
        localObject3 = "Unable to encode string";
        Log.e((String)localObject2, (String)localObject3, localUnsupportedEncodingException);
        continue;
        String str2 = "SHA256withECDSA";
        continue;
      }
      try
      {
        localObject3 = paramKeyPair.getPrivate();
        bool = localObject3 instanceof RSAPrivateKey;
        if (!bool) {
          continue;
        }
        localObject1 = "SHA256withRSA";
        localObject1 = Signature.getInstance((String)localObject1);
        ((Signature)localObject1).initSign((PrivateKey)localObject3);
        ((Signature)localObject1).update((byte[])localObject2);
        localObject1 = ((Signature)localObject1).sign();
        str1 = FirebaseInstanceId.a((byte[])localObject1);
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        localObject2 = "InstanceID/Rpc";
        localObject3 = "Unable to sign registration request";
        Log.e((String)localObject2, (String)localObject3, localGeneralSecurityException);
      }
    }
    return str1;
  }
  
  public static void a(Context paramContext, Intent paramIntent)
  {
    synchronized (f.class)
    {
      Object localObject1 = k;
      if (localObject1 == null)
      {
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        localObject3 = "com.google.example.invalidpackage";
        ((Intent)localObject1).setPackage((String)localObject3);
        localObject3 = null;
        localObject1 = PendingIntent.getBroadcast(paramContext, 0, (Intent)localObject1, 0);
        k = (PendingIntent)localObject1;
      }
      localObject1 = "app";
      Object localObject3 = k;
      paramIntent.putExtra((String)localObject1, (Parcelable)localObject3);
      return;
    }
  }
  
  private void a(String paramString, Intent paramIntent)
  {
    for (;;)
    {
      synchronized (q)
      {
        Object localObject1 = q;
        localObject1 = ((k)localObject1).remove(paramString);
        localObject1 = (f.b)localObject1;
        if (localObject1 == null)
        {
          String str1 = "InstanceID/Rpc";
          String str2 = "Missing callback for ";
          localObject1 = String.valueOf(paramString);
          int i1 = ((String)localObject1).length();
          if (i1 != 0)
          {
            localObject1 = str2.concat((String)localObject1);
            Log.w(str1, (String)localObject1);
            return;
          }
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(str2);
        }
      }
      ((f.b)localObject2).a(paramIntent);
    }
  }
  
  private void a(String paramString1, String paramString2)
  {
    k localk = q;
    int i1;
    Object localObject1;
    int i2;
    String str2;
    if (paramString1 == null)
    {
      i1 = 0;
      localObject1 = null;
      i2 = 0;
      str2 = null;
    }
    for (;;)
    {
      try
      {
        localObject1 = q;
        i1 = ((k)localObject1).size();
        if (i2 < i1)
        {
          localObject1 = q;
          localObject1 = ((k)localObject1).c(i2);
          localObject1 = (f.b)localObject1;
          ((f.b)localObject1).a(paramString2);
          i1 = i2 + 1;
          i2 = i1;
          continue;
        }
        localObject1 = q;
        ((k)localObject1).clear();
        return;
      }
      finally {}
      localObject1 = q;
      localObject1 = ((k)localObject1).remove(paramString1);
      localObject1 = (f.b)localObject1;
      String str1;
      if (localObject1 == null)
      {
        str2 = "InstanceID/Rpc";
        String str3 = "Missing callback for ";
        localObject1 = String.valueOf(paramString1);
        int i3 = ((String)localObject1).length();
        if (i3 != 0)
        {
          localObject1 = str3.concat((String)localObject1);
          Log.w(str2, (String)localObject1);
        }
        else
        {
          str1 = new java/lang/String;
          str1.<init>(str3);
        }
      }
      else
      {
        str1.a(paramString2);
      }
    }
  }
  
  private static boolean a(PackageManager paramPackageManager)
  {
    Object localObject = new android/content/Intent;
    ((Intent)localObject).<init>("com.google.android.c2dm.intent.REGISTER");
    localObject = paramPackageManager.queryIntentServices((Intent)localObject, 0);
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = nextserviceInfo.packageName;
      String str = "com.google.android.c2dm.intent.REGISTER";
      bool = a(paramPackageManager, (String)localObject, str);
    } while (!bool);
    b = false;
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private static boolean a(PackageManager paramPackageManager, String paramString)
  {
    boolean bool = false;
    int i1 = 0;
    ApplicationInfo localApplicationInfo = null;
    try
    {
      localApplicationInfo = paramPackageManager.getApplicationInfo(paramString, 0);
      String str = packageName;
      a = str;
      i1 = uid;
      d = i1;
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  private static boolean a(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    String str = "com.google.android.c2dm.permission.SEND";
    int i1 = paramPackageManager.checkPermission(str, paramString1);
    boolean bool;
    if (i1 == 0) {
      bool = a(paramPackageManager, paramString1);
    }
    for (;;)
    {
      return bool;
      int i2 = String.valueOf(paramString1).length() + 56;
      int i3 = String.valueOf(paramString2).length();
      i2 += i3;
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(i2);
      Object localObject2 = ((StringBuilder)localObject1).append("Possible malicious package ").append(paramString1).append(" declares ").append(paramString2);
      localObject1 = " without permission";
      localObject2 = (String)localObject1;
      Log.w("InstanceID/Rpc", (String)localObject2);
      bool = false;
      str = null;
    }
  }
  
  private void b()
  {
    Messenger localMessenger = h;
    if (localMessenger != null) {}
    for (;;)
    {
      return;
      a(g);
      localMessenger = new android/os/Messenger;
      f.1 local1 = new com/google/firebase/iid/f$1;
      Looper localLooper = Looper.getMainLooper();
      local1.<init>(this, localLooper);
      localMessenger.<init>(local1);
      h = localMessenger;
    }
  }
  
  /* Error */
  final Intent a(android.os.Bundle paramBundle, KeyPair paramKeyPair)
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_3
    //   2: invokestatic 359	com/google/firebase/iid/f:a	()Ljava/lang/String;
    //   5: astore 4
    //   7: new 361	com/google/firebase/iid/f$a
    //   10: astore 5
    //   12: aload 5
    //   14: iconst_0
    //   15: invokespecial 364	com/google/firebase/iid/f$a:<init>	(B)V
    //   18: aload_0
    //   19: getfield 52	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   22: astore 6
    //   24: aload 6
    //   26: monitorenter
    //   27: aload_0
    //   28: getfield 52	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   31: astore 7
    //   33: aload 7
    //   35: aload 4
    //   37: aload 5
    //   39: invokevirtual 368	android/support/v4/g/k:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: aload 6
    //   45: monitorexit
    //   46: invokestatic 374	android/os/SystemClock:elapsedRealtime	()J
    //   49: lstore 8
    //   51: aload_0
    //   52: getfield 376	com/google/firebase/iid/f:p	J
    //   55: lstore 10
    //   57: lconst_0
    //   58: lstore 12
    //   60: lload 10
    //   62: lload 12
    //   64: lcmp
    //   65: istore 14
    //   67: iload 14
    //   69: ifeq +109 -> 178
    //   72: aload_0
    //   73: getfield 376	com/google/firebase/iid/f:p	J
    //   76: lstore 10
    //   78: lload 8
    //   80: lload 10
    //   82: lcmp
    //   83: istore 14
    //   85: iload 14
    //   87: ifgt +91 -> 178
    //   90: aload_0
    //   91: getfield 376	com/google/firebase/iid/f:p	J
    //   94: lload 8
    //   96: lsub
    //   97: lstore 15
    //   99: aload_0
    //   100: getfield 378	com/google/firebase/iid/f:o	I
    //   103: istore 17
    //   105: new 174	java/lang/StringBuilder
    //   108: astore 18
    //   110: aload 18
    //   112: bipush 78
    //   114: invokespecial 177	java/lang/StringBuilder:<init>	(I)V
    //   117: aload 18
    //   119: ldc_w 381
    //   122: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: lload 15
    //   127: invokevirtual 384	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   130: ldc_w 386
    //   133: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: iload 17
    //   138: invokevirtual 389	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   141: invokevirtual 186	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: astore 4
    //   146: ldc 125
    //   148: aload 4
    //   150: invokestatic 133	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   153: pop
    //   154: new 146	java/io/IOException
    //   157: astore 7
    //   159: aload 7
    //   161: ldc_w 391
    //   164: invokespecial 149	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   167: aload 7
    //   169: athrow
    //   170: astore 7
    //   172: aload 6
    //   174: monitorexit
    //   175: aload 7
    //   177: athrow
    //   178: aload_0
    //   179: invokespecial 393	com/google/firebase/iid/f:b	()V
    //   182: getstatic 33	com/google/firebase/iid/f:a	Ljava/lang/String;
    //   185: astore 7
    //   187: aload 7
    //   189: ifnonnull +19 -> 208
    //   192: new 146	java/io/IOException
    //   195: astore 7
    //   197: aload 7
    //   199: ldc_w 395
    //   202: invokespecial 149	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   205: aload 7
    //   207: athrow
    //   208: invokestatic 374	android/os/SystemClock:elapsedRealtime	()J
    //   211: lstore 8
    //   213: aload_0
    //   214: lload 8
    //   216: putfield 397	com/google/firebase/iid/f:l	J
    //   219: new 75	android/content/Intent
    //   222: astore 6
    //   224: getstatic 35	com/google/firebase/iid/f:b	Z
    //   227: istore 14
    //   229: iload 14
    //   231: ifeq +726 -> 957
    //   234: ldc 77
    //   236: astore 7
    //   238: aload 6
    //   240: aload 7
    //   242: invokespecial 80	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   245: getstatic 33	com/google/firebase/iid/f:a	Ljava/lang/String;
    //   248: astore 7
    //   250: aload 6
    //   252: aload 7
    //   254: invokevirtual 262	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   257: pop
    //   258: aload_0
    //   259: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   262: astore 19
    //   264: aload_0
    //   265: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   268: invokestatic 340	com/google/firebase/iid/f:a	(Landroid/content/Context;)Ljava/lang/String;
    //   271: astore 18
    //   273: aload 19
    //   275: aload 18
    //   277: invokestatic 402	com/google/firebase/iid/FirebaseInstanceId:a	(Landroid/content/Context;Ljava/lang/String;)I
    //   280: invokestatic 60	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   283: astore 19
    //   285: aload_1
    //   286: ldc_w 399
    //   289: aload 19
    //   291: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   294: getstatic 415	android/os/Build$VERSION:SDK_INT	I
    //   297: invokestatic 60	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   300: astore 19
    //   302: aload_1
    //   303: ldc_w 410
    //   306: aload 19
    //   308: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   311: aload_0
    //   312: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   315: invokestatic 420	com/google/firebase/iid/FirebaseInstanceId:a	(Landroid/content/Context;)I
    //   318: invokestatic 60	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   321: astore 19
    //   323: aload_1
    //   324: ldc_w 417
    //   327: aload 19
    //   329: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   332: aload_0
    //   333: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   336: invokestatic 424	com/google/firebase/iid/FirebaseInstanceId:b	(Landroid/content/Context;)Ljava/lang/String;
    //   339: astore 19
    //   341: aload_1
    //   342: ldc_w 422
    //   345: aload 19
    //   347: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   350: aload_1
    //   351: ldc_w 426
    //   354: ldc_w 428
    //   357: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   360: aload_2
    //   361: invokestatic 433	com/google/firebase/iid/FirebaseInstanceId:a	(Ljava/security/KeyPair;)Ljava/lang/String;
    //   364: astore 19
    //   366: aload_1
    //   367: ldc_w 430
    //   370: aload 19
    //   372: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   375: aload_2
    //   376: invokevirtual 437	java/security/KeyPair:getPublic	()Ljava/security/PublicKey;
    //   379: invokeinterface 442 1 0
    //   384: invokestatic 241	com/google/firebase/iid/FirebaseInstanceId:a	([B)Ljava/lang/String;
    //   387: astore 7
    //   389: aload_1
    //   390: ldc_w 444
    //   393: aload 7
    //   395: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: iconst_2
    //   399: istore 20
    //   401: iload 20
    //   403: anewarray 165	java/lang/String
    //   406: astore 18
    //   408: aload_0
    //   409: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   412: invokevirtual 450	android/content/Context:getPackageName	()Ljava/lang/String;
    //   415: astore 21
    //   417: aload 18
    //   419: iconst_0
    //   420: aload 21
    //   422: aastore
    //   423: iconst_1
    //   424: istore 22
    //   426: aload 18
    //   428: iload 22
    //   430: aload 7
    //   432: aastore
    //   433: aload_2
    //   434: aload 18
    //   436: invokestatic 453	com/google/firebase/iid/f:a	(Ljava/security/KeyPair;[Ljava/lang/String;)Ljava/lang/String;
    //   439: astore 7
    //   441: aload_1
    //   442: ldc_w 446
    //   445: aload 7
    //   447: invokevirtual 408	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   450: aload 6
    //   452: aload_1
    //   453: invokevirtual 457	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   456: pop
    //   457: aload_0
    //   458: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   461: aload 6
    //   463: invokestatic 460	com/google/firebase/iid/f:a	(Landroid/content/Context;Landroid/content/Intent;)V
    //   466: invokestatic 374	android/os/SystemClock:elapsedRealtime	()J
    //   469: lstore 8
    //   471: aload_0
    //   472: lload 8
    //   474: putfield 397	com/google/firebase/iid/f:l	J
    //   477: aload 4
    //   479: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   482: invokevirtual 172	java/lang/String:length	()I
    //   485: iconst_5
    //   486: iadd
    //   487: istore 23
    //   489: new 174	java/lang/StringBuilder
    //   492: astore 18
    //   494: aload 18
    //   496: iload 23
    //   498: invokespecial 177	java/lang/StringBuilder:<init>	(I)V
    //   501: aload 18
    //   503: ldc_w 464
    //   506: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: aload 4
    //   511: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: ldc_w 466
    //   517: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: invokevirtual 186	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   523: astore 19
    //   525: aload 6
    //   527: ldc_w 462
    //   530: aload 19
    //   532: invokevirtual 469	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   535: pop
    //   536: aload 4
    //   538: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   541: invokevirtual 172	java/lang/String:length	()I
    //   544: iconst_5
    //   545: iadd
    //   546: istore 23
    //   548: new 174	java/lang/StringBuilder
    //   551: astore 18
    //   553: aload 18
    //   555: iload 23
    //   557: invokespecial 177	java/lang/StringBuilder:<init>	(I)V
    //   560: aload 18
    //   562: ldc_w 464
    //   565: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: aload 4
    //   570: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   573: astore 19
    //   575: ldc_w 466
    //   578: astore 18
    //   580: aload 19
    //   582: aload 18
    //   584: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: invokevirtual 186	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   590: astore 19
    //   592: aload 6
    //   594: ldc_w 471
    //   597: aload 19
    //   599: invokevirtual 469	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   602: pop
    //   603: ldc -114
    //   605: astore 7
    //   607: getstatic 33	com/google/firebase/iid/f:a	Ljava/lang/String;
    //   610: astore 19
    //   612: aload 7
    //   614: aload 19
    //   616: invokevirtual 475	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   619: istore 14
    //   621: ldc 125
    //   623: astore 19
    //   625: aload 19
    //   627: iload_3
    //   628: invokestatic 479	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   631: istore 23
    //   633: iload 23
    //   635: ifeq +72 -> 707
    //   638: ldc 125
    //   640: astore 19
    //   642: aload 6
    //   644: invokevirtual 163	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   647: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   650: astore 18
    //   652: aload 18
    //   654: invokestatic 169	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   657: invokevirtual 172	java/lang/String:length	()I
    //   660: bipush 8
    //   662: iadd
    //   663: istore 22
    //   665: new 174	java/lang/StringBuilder
    //   668: astore 24
    //   670: aload 24
    //   672: iload 22
    //   674: invokespecial 177	java/lang/StringBuilder:<init>	(I)V
    //   677: aload 24
    //   679: ldc_w 481
    //   682: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   685: astore 21
    //   687: aload 21
    //   689: aload 18
    //   691: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   694: invokevirtual 186	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   697: astore 18
    //   699: aload 19
    //   701: aload 18
    //   703: invokestatic 483	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   706: pop
    //   707: iload 14
    //   709: ifeq +263 -> 972
    //   712: aload_0
    //   713: monitorenter
    //   714: getstatic 43	com/google/firebase/iid/f:f	Landroid/content/BroadcastReceiver;
    //   717: astore 7
    //   719: aload 7
    //   721: ifnonnull +126 -> 847
    //   724: new 485	com/google/firebase/iid/f$2
    //   727: astore 7
    //   729: aload 7
    //   731: aload_0
    //   732: invokespecial 488	com/google/firebase/iid/f$2:<init>	(Lcom/google/firebase/iid/f;)V
    //   735: aload 7
    //   737: putstatic 43	com/google/firebase/iid/f:f	Landroid/content/BroadcastReceiver;
    //   740: ldc 125
    //   742: astore 7
    //   744: iconst_3
    //   745: istore 23
    //   747: aload 7
    //   749: iload 23
    //   751: invokestatic 479	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   754: istore 14
    //   756: iload 14
    //   758: ifeq +20 -> 778
    //   761: ldc 125
    //   763: astore 7
    //   765: ldc_w 490
    //   768: astore 19
    //   770: aload 7
    //   772: aload 19
    //   774: invokestatic 483	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   777: pop
    //   778: new 492	android/content/IntentFilter
    //   781: astore 7
    //   783: ldc_w 494
    //   786: astore 19
    //   788: aload 7
    //   790: aload 19
    //   792: invokespecial 495	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   795: aload_0
    //   796: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   799: astore 19
    //   801: aload 19
    //   803: invokevirtual 450	android/content/Context:getPackageName	()Ljava/lang/String;
    //   806: astore 19
    //   808: aload 7
    //   810: aload 19
    //   812: invokevirtual 498	android/content/IntentFilter:addCategory	(Ljava/lang/String;)V
    //   815: aload_0
    //   816: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   819: astore 19
    //   821: getstatic 43	com/google/firebase/iid/f:f	Landroid/content/BroadcastReceiver;
    //   824: astore 18
    //   826: ldc_w 326
    //   829: astore 21
    //   831: aconst_null
    //   832: astore 24
    //   834: aload 19
    //   836: aload 18
    //   838: aload 7
    //   840: aload 21
    //   842: aconst_null
    //   843: invokevirtual 502	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    //   846: pop
    //   847: aload_0
    //   848: monitorexit
    //   849: aload_0
    //   850: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   853: astore 7
    //   855: aload 7
    //   857: aload 6
    //   859: invokevirtual 506	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   862: pop
    //   863: aload 5
    //   865: getfield 509	com/google/firebase/iid/f$a:a	Landroid/os/ConditionVariable;
    //   868: astore 7
    //   870: ldc2_w 510
    //   873: lstore 8
    //   875: aload 7
    //   877: lload 8
    //   879: invokevirtual 519	android/os/ConditionVariable:block	(J)Z
    //   882: istore 14
    //   884: iload 14
    //   886: ifne +297 -> 1183
    //   889: ldc 125
    //   891: astore 7
    //   893: ldc_w 521
    //   896: astore 5
    //   898: aload 7
    //   900: aload 5
    //   902: invokestatic 133	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   905: pop
    //   906: new 146	java/io/IOException
    //   909: astore 7
    //   911: ldc_w 523
    //   914: astore 5
    //   916: aload 7
    //   918: aload 5
    //   920: invokespecial 149	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   923: aload 7
    //   925: athrow
    //   926: astore 7
    //   928: aload_0
    //   929: getfield 52	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   932: astore 5
    //   934: aload 5
    //   936: monitorenter
    //   937: aload_0
    //   938: getfield 52	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   941: astore 6
    //   943: aload 6
    //   945: aload 4
    //   947: invokevirtual 278	android/support/v4/g/k:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   950: pop
    //   951: aload 5
    //   953: monitorexit
    //   954: aload 7
    //   956: athrow
    //   957: ldc_w 302
    //   960: astore 7
    //   962: goto -724 -> 238
    //   965: astore 7
    //   967: aload_0
    //   968: monitorexit
    //   969: aload 7
    //   971: athrow
    //   972: aload_0
    //   973: getfield 337	com/google/firebase/iid/f:h	Landroid/os/Messenger;
    //   976: astore 19
    //   978: aload 6
    //   980: ldc_w 525
    //   983: aload 19
    //   985: invokevirtual 274	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   988: pop
    //   989: aload_0
    //   990: getfield 527	com/google/firebase/iid/f:i	Landroid/os/Messenger;
    //   993: astore 7
    //   995: aload 7
    //   997: ifnonnull +14 -> 1011
    //   1000: aload_0
    //   1001: getfield 529	com/google/firebase/iid/f:j	Lcom/google/android/gms/iid/MessengerCompat;
    //   1004: astore 7
    //   1006: aload 7
    //   1008: ifnull +78 -> 1086
    //   1011: invokestatic 535	android/os/Message:obtain	()Landroid/os/Message;
    //   1014: astore 7
    //   1016: aload 7
    //   1018: aload 6
    //   1020: putfield 539	android/os/Message:obj	Ljava/lang/Object;
    //   1023: aload_0
    //   1024: getfield 527	com/google/firebase/iid/f:i	Landroid/os/Messenger;
    //   1027: astore 19
    //   1029: aload 19
    //   1031: ifnull +81 -> 1112
    //   1034: aload_0
    //   1035: getfield 527	com/google/firebase/iid/f:i	Landroid/os/Messenger;
    //   1038: astore 19
    //   1040: aload 19
    //   1042: aload 7
    //   1044: invokevirtual 543	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1047: goto -184 -> 863
    //   1050: astore 7
    //   1052: ldc 125
    //   1054: astore 7
    //   1056: aload 7
    //   1058: iload_3
    //   1059: invokestatic 479	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   1062: istore 14
    //   1064: iload 14
    //   1066: ifeq +20 -> 1086
    //   1069: ldc 125
    //   1071: astore 7
    //   1073: ldc_w 545
    //   1076: astore 19
    //   1078: aload 7
    //   1080: aload 19
    //   1082: invokestatic 483	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   1085: pop
    //   1086: getstatic 35	com/google/firebase/iid/f:b	Z
    //   1089: istore 14
    //   1091: iload 14
    //   1093: ifeq +73 -> 1166
    //   1096: aload_0
    //   1097: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   1100: astore 7
    //   1102: aload 7
    //   1104: aload 6
    //   1106: invokevirtual 548	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   1109: goto -246 -> 863
    //   1112: aload_0
    //   1113: getfield 529	com/google/firebase/iid/f:j	Lcom/google/android/gms/iid/MessengerCompat;
    //   1116: astore 19
    //   1118: aload 19
    //   1120: getfield 552	com/google/android/gms/iid/MessengerCompat:a	Landroid/os/Messenger;
    //   1123: astore 18
    //   1125: aload 18
    //   1127: ifnull +20 -> 1147
    //   1130: aload 19
    //   1132: getfield 552	com/google/android/gms/iid/MessengerCompat:a	Landroid/os/Messenger;
    //   1135: astore 19
    //   1137: aload 19
    //   1139: aload 7
    //   1141: invokevirtual 543	android/os/Messenger:send	(Landroid/os/Message;)V
    //   1144: goto -281 -> 863
    //   1147: aload 19
    //   1149: getfield 555	com/google/android/gms/iid/MessengerCompat:b	Lcom/google/android/gms/iid/a;
    //   1152: astore 19
    //   1154: aload 19
    //   1156: aload 7
    //   1158: invokeinterface 559 2 0
    //   1163: goto -300 -> 863
    //   1166: aload_0
    //   1167: getfield 54	com/google/firebase/iid/f:g	Landroid/content/Context;
    //   1170: astore 7
    //   1172: aload 7
    //   1174: aload 6
    //   1176: invokevirtual 506	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   1179: pop
    //   1180: goto -317 -> 863
    //   1183: aload 5
    //   1185: getfield 561	com/google/firebase/iid/f$a:c	Ljava/lang/String;
    //   1188: astore 7
    //   1190: aload 7
    //   1192: ifnull +25 -> 1217
    //   1195: new 146	java/io/IOException
    //   1198: astore 7
    //   1200: aload 5
    //   1202: getfield 561	com/google/firebase/iid/f$a:c	Ljava/lang/String;
    //   1205: astore 5
    //   1207: aload 7
    //   1209: aload 5
    //   1211: invokespecial 149	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1214: aload 7
    //   1216: athrow
    //   1217: aload 5
    //   1219: getfield 564	com/google/firebase/iid/f$a:b	Landroid/content/Intent;
    //   1222: astore 7
    //   1224: aload_0
    //   1225: getfield 52	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   1228: astore 5
    //   1230: aload 5
    //   1232: monitorenter
    //   1233: aload_0
    //   1234: getfield 52	com/google/firebase/iid/f:q	Landroid/support/v4/g/k;
    //   1237: astore 6
    //   1239: aload 6
    //   1241: aload 4
    //   1243: invokevirtual 278	android/support/v4/g/k:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1246: pop
    //   1247: aload 5
    //   1249: monitorexit
    //   1250: aload 7
    //   1252: areturn
    //   1253: astore 7
    //   1255: aload 5
    //   1257: monitorexit
    //   1258: aload 7
    //   1260: athrow
    //   1261: astore 7
    //   1263: aload 5
    //   1265: monitorexit
    //   1266: aload 7
    //   1268: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1269	0	this	f
    //   0	1269	1	paramBundle	android.os.Bundle
    //   0	1269	2	paramKeyPair	KeyPair
    //   1	1058	3	i1	int
    //   5	1237	4	str1	String
    //   22	1218	6	localObject2	Object
    //   31	137	7	localObject3	Object
    //   170	6	7	localObject4	Object
    //   185	739	7	localObject5	Object
    //   926	29	7	localObject6	Object
    //   960	1	7	str2	String
    //   965	5	7	localObject7	Object
    //   993	50	7	localObject8	Object
    //   1050	1	7	localRemoteException	android.os.RemoteException
    //   1054	197	7	localObject9	Object
    //   1253	6	7	localObject10	Object
    //   1261	6	7	localObject11	Object
    //   49	829	8	l1	long
    //   55	26	10	l2	long
    //   58	5	12	l3	long
    //   65	1027	14	bool1	boolean
    //   97	29	15	l4	long
    //   103	34	17	i2	int
    //   108	1018	18	localObject12	Object
    //   262	893	19	localObject13	Object
    //   399	3	20	i3	int
    //   415	426	21	localObject14	Object
    //   424	249	22	i4	int
    //   487	69	23	i5	int
    //   631	3	23	bool2	boolean
    //   745	5	23	i6	int
    //   668	165	24	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   27	31	170	finally
    //   37	43	170	finally
    //   43	46	170	finally
    //   172	175	170	finally
    //   863	868	926	finally
    //   877	882	926	finally
    //   900	906	926	finally
    //   906	909	926	finally
    //   918	923	926	finally
    //   923	926	926	finally
    //   1183	1188	926	finally
    //   1195	1198	926	finally
    //   1200	1205	926	finally
    //   1209	1214	926	finally
    //   1214	1217	926	finally
    //   1217	1222	926	finally
    //   714	717	965	finally
    //   724	727	965	finally
    //   731	735	965	finally
    //   735	740	965	finally
    //   749	754	965	finally
    //   772	778	965	finally
    //   778	781	965	finally
    //   790	795	965	finally
    //   795	799	965	finally
    //   801	806	965	finally
    //   810	815	965	finally
    //   815	819	965	finally
    //   821	824	965	finally
    //   842	847	965	finally
    //   847	849	965	finally
    //   967	969	965	finally
    //   1023	1027	1050	android/os/RemoteException
    //   1034	1038	1050	android/os/RemoteException
    //   1042	1047	1050	android/os/RemoteException
    //   1112	1116	1050	android/os/RemoteException
    //   1118	1123	1050	android/os/RemoteException
    //   1130	1135	1050	android/os/RemoteException
    //   1139	1144	1050	android/os/RemoteException
    //   1147	1152	1050	android/os/RemoteException
    //   1156	1163	1050	android/os/RemoteException
    //   1233	1237	1253	finally
    //   1241	1247	1253	finally
    //   1247	1250	1253	finally
    //   1255	1258	1253	finally
    //   937	941	1261	finally
    //   945	951	1261	finally
    //   951	954	1261	finally
    //   1263	1266	1261	finally
  }
  
  final void b(Intent paramIntent)
  {
    long l1 = 0L;
    int i1 = 0;
    Object localObject1 = null;
    int i2 = 2;
    int i3 = 1;
    int i4 = 3;
    if (paramIntent == null)
    {
      localObject2 = "InstanceID/Rpc";
      bool2 = Log.isLoggable((String)localObject2, i4);
      if (bool2)
      {
        localObject2 = "InstanceID/Rpc";
        localObject1 = "Unexpected response: null";
        Log.d((String)localObject2, (String)localObject1);
      }
    }
    Object localObject3;
    int i9;
    int i10;
    Object localObject4;
    for (;;)
    {
      return;
      localObject2 = paramIntent.getAction();
      localObject3 = "com.google.android.c2dm.intent.REGISTRATION";
      bool2 = ((String)localObject3).equals(localObject2);
      if (!bool2)
      {
        localObject2 = "InstanceID/Rpc";
        bool2 = Log.isLoggable((String)localObject2, i4);
        if (bool2)
        {
          localObject1 = "InstanceID/Rpc";
          localObject3 = "Unexpected response ";
          localObject2 = String.valueOf(paramIntent.getAction());
          i9 = ((String)localObject2).length();
          if (i9 != 0) {
            localObject2 = ((String)localObject3).concat((String)localObject2);
          }
          for (;;)
          {
            Log.d((String)localObject1, (String)localObject2);
            break;
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>((String)localObject3);
          }
        }
      }
      else
      {
        localObject2 = paramIntent.getStringExtra("registration_id");
        if (localObject2 == null) {
          localObject2 = paramIntent.getStringExtra("unregistered");
        }
        if (localObject2 != null) {
          break label956;
        }
        localObject2 = "error";
        localObject3 = paramIntent.getStringExtra((String)localObject2);
        if (localObject3 != null) {
          break;
        }
        localObject2 = "InstanceID/Rpc";
        localObject1 = String.valueOf(paramIntent.getExtras());
        i10 = String.valueOf(localObject1).length() + 49;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(i10);
        localObject3 = ((StringBuilder)localObject4).append("Unexpected response, no error or registration id ");
        localObject1 = (String)localObject1;
        Log.w((String)localObject2, (String)localObject1);
      }
    }
    Object localObject2 = "InstanceID/Rpc";
    boolean bool2 = Log.isLoggable((String)localObject2, i4);
    Object localObject5;
    int i12;
    label334:
    String str;
    if (bool2)
    {
      localObject4 = "InstanceID/Rpc";
      localObject5 = "Received InstanceID error ";
      localObject2 = String.valueOf(localObject3);
      i12 = ((String)localObject2).length();
      if (i12 != 0)
      {
        localObject2 = ((String)localObject5).concat((String)localObject2);
        Log.d((String)localObject4, (String)localObject2);
      }
    }
    else
    {
      localObject2 = "|";
      bool2 = ((String)localObject3).startsWith((String)localObject2);
      if (!bool2) {
        break label1341;
      }
      localObject4 = ((String)localObject3).split("\\|");
      localObject2 = "ID";
      localObject5 = localObject4[i3];
      bool2 = ((String)localObject2).equals(localObject5);
      if (!bool2)
      {
        localObject5 = "InstanceID/Rpc";
        str = "Unexpected structured response ";
        localObject2 = String.valueOf(localObject3);
        i10 = ((String)localObject2).length();
        if (i10 == 0) {
          break label667;
        }
        localObject2 = str.concat((String)localObject2);
        label434:
        Log.w((String)localObject5, (String)localObject2);
      }
      int i5 = localObject4.length;
      if (i5 <= i2) {
        break label682;
      }
      localObject2 = localObject4[i2];
      localObject1 = localObject4[i4];
      localObject3 = ":";
      boolean bool7 = ((String)localObject1).startsWith((String)localObject3);
      if (bool7) {
        localObject1 = ((String)localObject1).substring(i3);
      }
      label496:
      localObject3 = "error";
      paramIntent.putExtra((String)localObject3, (String)localObject1);
    }
    for (;;)
    {
      a((String)localObject2, (String)localObject1);
      localObject2 = "Retry-After";
      long l2 = paramIntent.getLongExtra((String)localObject2, l1);
      boolean bool3 = l2 < l1;
      if (bool3)
      {
        long l3 = SystemClock.elapsedRealtime();
        m = l3;
        int i6 = (int)l2 * 1000;
        o = i6;
        l3 = SystemClock.elapsedRealtime();
        l2 = o;
        l3 += l2;
        p = l3;
        localObject2 = "InstanceID/Rpc";
        i1 = o;
        i11 = 52;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(i11);
        localObject3 = ((StringBuilder)localObject4).append("Explicit request from server to backoff: ");
        localObject1 = i1;
        Log.w((String)localObject2, (String)localObject1);
        break;
        localObject2 = new java/lang/String;
        ((String)localObject2).<init>((String)localObject5);
        break label334;
        label667:
        localObject2 = new java/lang/String;
        ((String)localObject2).<init>(str);
        break label434;
        label682:
        localObject1 = "UNKNOWN";
        i6 = 0;
        localObject2 = null;
        break label496;
      }
      localObject2 = "SERVICE_NOT_AVAILABLE";
      boolean bool4 = ((String)localObject2).equals(localObject1);
      if (!bool4)
      {
        localObject2 = "AUTHENTICATION_FAILED";
        bool4 = ((String)localObject2).equals(localObject1);
        if (!bool4) {
          break;
        }
      }
      localObject2 = "com.google.android.gsf";
      localObject3 = a;
      bool4 = ((String)localObject2).equals(localObject3);
      if (!bool4) {
        break;
      }
      int i7 = n + 1;
      n = i7;
      i7 = n;
      if (i7 < i4) {
        break;
      }
      i7 = n;
      if (i7 == i4)
      {
        localObject2 = new java/util/Random;
        ((Random)localObject2).<init>();
        i11 = 1000;
        i7 = ((Random)localObject2).nextInt(i11) + 1000;
        o = i7;
      }
      i7 = o * 2;
      o = i7;
      l2 = SystemClock.elapsedRealtime();
      i7 = o;
      long l4 = i7;
      l2 += l4;
      p = l2;
      localObject2 = "InstanceID/Rpc";
      int i11 = o;
      i9 = String.valueOf(localObject1).length() + 31;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>(i9);
      localObject1 = ((StringBuilder)localObject5).append("Backoff due to ").append((String)localObject1);
      localObject4 = " for ";
      localObject1 = (String)localObject4 + i11;
      Log.w((String)localObject2, (String)localObject1);
      break;
      label956:
      l2 = SystemClock.elapsedRealtime();
      l = l2;
      p = l1;
      n = 0;
      o = 0;
      localObject3 = "|";
      boolean bool8 = ((String)localObject2).startsWith((String)localObject3);
      if (bool8)
      {
        localObject4 = ((String)localObject2).split("\\|");
        localObject3 = "ID";
        localObject5 = localObject4[i3];
        bool8 = ((String)localObject3).equals(localObject5);
        if (!bool8)
        {
          localObject3 = "InstanceID/Rpc";
          localObject5 = "Unexpected structured response ";
          localObject2 = String.valueOf(localObject2);
          i12 = ((String)localObject2).length();
          if (i12 == 0) {
            break label1239;
          }
          localObject2 = ((String)localObject5).concat((String)localObject2);
          label1074:
          Log.w((String)localObject3, (String)localObject2);
        }
        localObject3 = localObject4[i2];
        i7 = localObject4.length;
        int i13 = 4;
        if (i7 > i13)
        {
          localObject2 = "SYNC";
          localObject5 = localObject4[i4];
          boolean bool5 = ((String)localObject2).equals(localObject5);
          if (!bool5) {
            break label1254;
          }
          localObject2 = g;
          FirebaseInstanceId.c((Context)localObject2);
        }
      }
      label1239:
      label1254:
      do
      {
        int i8 = localObject4.length + -1;
        localObject2 = localObject4[i8];
        localObject1 = ":";
        boolean bool1 = ((String)localObject2).startsWith((String)localObject1);
        if (bool1) {
          localObject2 = ((String)localObject2).substring(i3);
        }
        paramIntent.putExtra("registration_id", (String)localObject2);
        localObject1 = localObject3;
        if (localObject1 != null) {
          break label1331;
        }
        localObject2 = "InstanceID/Rpc";
        bool6 = Log.isLoggable((String)localObject2, i4);
        if (!bool6) {
          break;
        }
        localObject2 = "InstanceID/Rpc";
        localObject1 = "Ignoring response without a request ID";
        Log.d((String)localObject2, (String)localObject1);
        break;
        localObject2 = new java/lang/String;
        ((String)localObject2).<init>((String)localObject5);
        break label1074;
        localObject2 = "RST";
        localObject5 = localObject4[i4];
        bool6 = ((String)localObject2).equals(localObject5);
      } while (!bool6);
      localObject2 = g;
      localObject4 = g;
      d.a((Context)localObject4, null);
      localObject1 = d.c();
      FirebaseInstanceId.a((Context)localObject2, (h)localObject1);
      localObject2 = "registration_id";
      paramIntent.removeExtra((String)localObject2);
      a((String)localObject3, paramIntent);
      break;
      label1331:
      a((String)localObject1, paramIntent);
      break;
      label1341:
      boolean bool6 = false;
      localObject2 = null;
      localObject1 = localObject3;
    }
  }
}


/* Location:              com/google/firebase/iid/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */