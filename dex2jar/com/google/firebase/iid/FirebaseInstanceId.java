package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.annotation.Keep;
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
  private static Map<String, FirebaseInstanceId> c = new android.support.v4.g.a();
  private static e d;
  public final d a;
  final String b;
  private final com.google.firebase.a e;
  
  private FirebaseInstanceId(com.google.firebase.a parama, d paramd)
  {
    e = parama;
    a = paramd;
    parama = e.b().b;
    if (parama != null) {}
    for (;;)
    {
      b = parama;
      if (b != null) {
        break;
      }
      throw new IllegalStateException("IID failing to initialize, FirebaseApp is missing project ID");
      paramd = e.b().a;
      parama = paramd;
      if (paramd.startsWith("1:"))
      {
        parama = paramd.split(":");
        if (parama.length < 2)
        {
          parama = null;
        }
        else
        {
          paramd = parama[1];
          parama = paramd;
          if (paramd.isEmpty()) {
            parama = null;
          }
        }
      }
    }
    FirebaseInstanceIdService.a(e.a(), this);
  }
  
  static int a(Context paramContext)
  {
    return a(paramContext, paramContext.getPackageName());
  }
  
  static int a(Context paramContext, String paramString)
  {
    try
    {
      int i = getPackageManagergetPackageInfo0versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = String.valueOf(paramContext);
      Log.w("FirebaseInstanceId", String.valueOf(paramContext).length() + 23 + "Failed to find package " + paramContext);
    }
    return 0;
  }
  
  public static FirebaseInstanceId a()
  {
    return getInstance(com.google.firebase.a.c());
  }
  
  public static String a(KeyPair paramKeyPair)
  {
    paramKeyPair = paramKeyPair.getPublic().getEncoded();
    try
    {
      paramKeyPair = MessageDigest.getInstance("SHA1").digest(paramKeyPair);
      paramKeyPair[0] = ((byte)((paramKeyPair[0] & 0xF) + 112 & 0xFF));
      paramKeyPair = Base64.encodeToString(paramKeyPair, 0, 8, 11);
      return paramKeyPair;
    }
    catch (NoSuchAlgorithmException paramKeyPair)
    {
      Log.w("FirebaseInstanceId", "Unexpected error, device missing required alghorithms");
    }
    return null;
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  static void a(Context paramContext, h paramh)
  {
    paramh.b();
    paramh = new Intent();
    paramh.putExtra("CMD", "RST");
    g.a().a(paramContext, paramh);
  }
  
  static String b(Context paramContext)
  {
    try
    {
      paramContext = getPackageManagergetPackageInfogetPackageName0versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = String.valueOf(paramContext);
      Log.w("FirebaseInstanceId", String.valueOf(paramContext).length() + 38 + "Never happens: can't find own package " + paramContext);
    }
    return null;
  }
  
  static void c(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("CMD", "SYNC");
    g.a().a(paramContext, localIntent);
  }
  
  static e d()
  {
    return d;
  }
  
  @Keep
  public static FirebaseInstanceId getInstance(com.google.firebase.a parama)
  {
    try
    {
      FirebaseInstanceId localFirebaseInstanceId = (FirebaseInstanceId)c.get(ba);
      Object localObject = localFirebaseInstanceId;
      if (localFirebaseInstanceId == null)
      {
        localObject = d.a(parama.a(), null);
        if (d == null) {
          d = new e(d.c());
        }
        localObject = new FirebaseInstanceId(parama, (d)localObject);
        c.put(ba, localObject);
      }
      return (FirebaseInstanceId)localObject;
    }
    finally {}
  }
  
  final void a(Bundle paramBundle)
  {
    paramBundle.putString("gmp_app_id", e.b().a);
  }
  
  public final String b()
  {
    h.a locala = c();
    if ((locala == null) || (locala.b(d.f))) {
      FirebaseInstanceIdService.a(e.a());
    }
    if (locala != null) {
      return a;
    }
    return null;
  }
  
  final h.a c()
  {
    return d.c().a("", b, "*");
  }
}


/* Location:              com/google/firebase/iid/FirebaseInstanceId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */