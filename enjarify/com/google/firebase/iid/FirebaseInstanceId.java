package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.b;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Map;

public class FirebaseInstanceId
{
  private static Map c;
  private static e d;
  public final d a;
  final String b;
  private final com.google.firebase.a e;
  
  static
  {
    android.support.v4.g.a locala = new android/support/v4/g/a;
    locala.<init>();
    c = locala;
  }
  
  private FirebaseInstanceId(com.google.firebase.a parama, d paramd)
  {
    e = parama;
    a = paramd;
    Object localObject = e.b().b;
    if (localObject != null) {}
    for (;;)
    {
      b = ((String)localObject);
      localObject = b;
      if (localObject != null) {
        break;
      }
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("IID failing to initialize, FirebaseApp is missing project ID");
      throw ((Throwable)localObject);
      localObject = e.b().a;
      String str = "1:";
      boolean bool1 = ((String)localObject).startsWith(str);
      if (bool1)
      {
        str = ":";
        localObject = ((String)localObject).split(str);
        int i = localObject.length;
        int j = 2;
        if (i < j)
        {
          localObject = null;
        }
        else
        {
          localObject = localObject[1];
          boolean bool2 = ((String)localObject).isEmpty();
          if (bool2) {
            localObject = null;
          }
        }
      }
    }
    FirebaseInstanceIdService.a(e.a(), this);
  }
  
  static int a(Context paramContext)
  {
    String str = paramContext.getPackageName();
    return a(paramContext, str);
  }
  
  static int a(Context paramContext, String paramString)
  {
    int i = 0;
    try
    {
      Object localObject = paramContext.getPackageManager();
      str2 = null;
      localObject = ((PackageManager)localObject).getPackageInfo(paramString, 0);
      i = versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        String str2 = "FirebaseInstanceId";
        String str1 = String.valueOf(localNameNotFoundException);
        int j = String.valueOf(str1).length() + 23;
        StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>(j);
        StringBuilder localStringBuilder2 = localStringBuilder1.append("Failed to find package ");
        str1 = str1;
        Log.w(str2, str1);
      }
    }
    return i;
  }
  
  public static FirebaseInstanceId a()
  {
    return getInstance(com.google.firebase.a.c());
  }
  
  public static String a(KeyPair paramKeyPair)
  {
    Object localObject1 = paramKeyPair.getPublic().getEncoded();
    localObject3 = "SHA1";
    try
    {
      localObject3 = MessageDigest.getInstance((String)localObject3);
      localObject1 = ((MessageDigest)localObject3).digest((byte[])localObject1);
      int i = 0;
      localObject3 = null;
      i = (localObject1[0] & 0xF) + 112;
      int j = 0;
      i = (byte)(i & 0xFF);
      localObject1[0] = i;
      i = 0;
      localObject3 = null;
      j = 8;
      int k = 11;
      localObject1 = Base64.encodeToString((byte[])localObject1, 0, j, k);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localObject3 = "Unexpected error, device missing required alghorithms";
        Log.w("FirebaseInstanceId", (String)localObject3);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  static void a(Context paramContext, h paramh)
  {
    paramh.b();
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent.putExtra("CMD", "RST");
    g.a().a(paramContext, localIntent);
  }
  
  static String b(Context paramContext)
  {
    try
    {
      localObject = paramContext.getPackageManager();
      str2 = paramContext.getPackageName();
      i = 0;
      localStringBuilder1 = null;
      localObject = ((PackageManager)localObject).getPackageInfo(str2, 0);
      localObject = versionName;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject;
        String str2 = "FirebaseInstanceId";
        String str1 = String.valueOf(localNameNotFoundException);
        int i = String.valueOf(str1).length() + 38;
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>(i);
        StringBuilder localStringBuilder1 = localStringBuilder2.append("Never happens: can't find own package ");
        str1 = str1;
        Log.w(str2, str1);
        str1 = null;
      }
    }
    return (String)localObject;
  }
  
  static void c(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent.putExtra("CMD", "SYNC");
    g.a().a(paramContext, localIntent);
  }
  
  static e d()
  {
    return d;
  }
  
  public static FirebaseInstanceId getInstance(com.google.firebase.a parama)
  {
    synchronized (FirebaseInstanceId.class)
    {
      Object localObject1 = c;
      Object localObject3 = parama.b();
      localObject3 = a;
      localObject1 = ((Map)localObject1).get(localObject3);
      localObject1 = (FirebaseInstanceId)localObject1;
      if (localObject1 == null)
      {
        localObject1 = parama.a();
        localObject3 = null;
        localObject3 = d.a((Context)localObject1, null);
        localObject1 = d;
        if (localObject1 == null)
        {
          localObject1 = new com/google/firebase/iid/e;
          localObject4 = d.c();
          ((e)localObject1).<init>((h)localObject4);
          d = (e)localObject1;
        }
        localObject1 = new com/google/firebase/iid/FirebaseInstanceId;
        ((FirebaseInstanceId)localObject1).<init>(parama, (d)localObject3);
        localObject3 = c;
        Object localObject4 = parama.b();
        localObject4 = a;
        ((Map)localObject3).put(localObject4, localObject1);
      }
      return (FirebaseInstanceId)localObject1;
    }
  }
  
  final void a(Bundle paramBundle)
  {
    String str = e.b().a;
    paramBundle.putString("gmp_app_id", str);
  }
  
  public final String b()
  {
    Object localObject1 = c();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = d.f;
      boolean bool = ((h.a)localObject1).b((String)localObject2);
      if (!bool) {}
    }
    else
    {
      localObject2 = e.a();
      FirebaseInstanceIdService.a((Context)localObject2);
    }
    if (localObject1 != null) {}
    for (localObject1 = a;; localObject1 = null) {
      return (String)localObject1;
    }
  }
  
  final h.a c()
  {
    h localh = d.c();
    String str = b;
    return localh.a("", str, "*");
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */