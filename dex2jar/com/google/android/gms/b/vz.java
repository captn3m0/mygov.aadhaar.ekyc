package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.TimeZone;

public final class vz
{
  public static final a.g<we> a = new a.g();
  public static final a.b<we, Object> b = new a.b() {};
  @Deprecated
  public static final a<Object> c = new a("ClearcutLogger.API", b, a);
  private final String d;
  private final int e;
  private String f;
  private int g = -1;
  private String h;
  private String i;
  private final boolean j;
  private int k = 0;
  private final wa l;
  private final com.google.android.gms.common.util.c m;
  private d n;
  private final b o;
  
  public vz(Context paramContext, String paramString)
  {
    this(paramContext, paramString, new wd(paramContext), e.d(), new wi(paramContext));
  }
  
  private vz(Context paramContext, String paramString, wa paramwa, com.google.android.gms.common.util.c paramc, b paramb)
  {
    d = paramContext.getPackageName();
    e = a(paramContext);
    g = -1;
    f = paramString;
    h = null;
    i = null;
    j = false;
    l = paramwa;
    m = paramc;
    n = new d();
    k = 0;
    o = paramb;
    if (j)
    {
      if (h == null) {
        bool = true;
      }
      com.google.android.gms.common.internal.c.b(bool, "can't be anonymous with an upload account");
    }
  }
  
  private static int a(Context paramContext)
  {
    try
    {
      int i1 = getPackageManagergetPackageInfogetPackageName0versionCode;
      return i1;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.wtf("ClearcutLogger", "This can't happen.");
    }
    return 0;
  }
  
  public final class a
  {
    int a = vz.a(vz.this);
    String b = vz.b(vz.this);
    String c = vz.c(vz.this);
    String d = vz.d(vz.this);
    int e = vz.a();
    final vz.c f;
    boolean g = true;
    final gf.d h = new gf.d();
    boolean i = false;
    private ArrayList<Integer> k = null;
    private ArrayList<String> l = null;
    private ArrayList<Integer> m = null;
    private ArrayList<byte[]> n = null;
    
    private a(byte[] paramArrayOfByte)
    {
      this(paramArrayOfByte, (byte)0);
    }
    
    private a(byte[] paramArrayOfByte, byte paramByte)
    {
      h.a = vz.e(vz.this).a();
      h.b = vz.e(vz.this).b();
      gf.d locald = h;
      vz.f(vz.this);
      long l1 = h.a;
      p = (TimeZone.getDefault().getOffset(l1) / 1000);
      if (paramArrayOfByte != null) {
        h.k = paramArrayOfByte;
      }
      f = null;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean a(String paramString, int paramInt);
  }
  
  public static abstract interface c
  {
    public abstract byte[] a();
  }
  
  public static final class d {}
}


/* Location:              com/google/android/gms/b/vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */