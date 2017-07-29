package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.b.a;
import com.google.android.gms.measurement.AppMeasurement.a;
import com.google.android.gms.measurement.AppMeasurement.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

public final class dr
  extends df
{
  private final AtomicLong a = new AtomicLong(0L);
  private int b;
  
  dr(dc paramdc)
  {
    super(paramdc);
  }
  
  private int a(String paramString, Object paramObject, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      cf.D();
      int i;
      if ((paramObject instanceof Parcelable[]))
      {
        i = ((Parcelable[])paramObject).length;
        if (i <= 1000) {
          break label86;
        }
        uc.a("Parameter array is too long; discarded. Value kind, name, array length", "param", paramString, Integer.valueOf(i));
        i = 0;
      }
      for (;;)
      {
        if (i != 0) {
          break label92;
        }
        return 17;
        if ((paramObject instanceof ArrayList))
        {
          i = ((ArrayList)paramObject).size();
          break;
        }
        i = 1;
        continue;
        label86:
        i = 1;
      }
    }
    label92:
    if (i(paramString)) {}
    for (paramBoolean = a("param", paramString, cf.C(), paramObject, paramBoolean); paramBoolean; paramBoolean = a("param", paramString, cf.B(), paramObject, paramBoolean)) {
      return 0;
    }
    return 4;
  }
  
  private static Object a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    Object localObject;
    if (paramObject == null) {
      localObject = null;
    }
    do
    {
      do
      {
        return localObject;
        localObject = paramObject;
      } while ((paramObject instanceof Long));
      localObject = paramObject;
    } while ((paramObject instanceof Double));
    if ((paramObject instanceof Integer)) {
      return Long.valueOf(((Integer)paramObject).intValue());
    }
    if ((paramObject instanceof Byte)) {
      return Long.valueOf(((Byte)paramObject).byteValue());
    }
    if ((paramObject instanceof Short)) {
      return Long.valueOf(((Short)paramObject).shortValue());
    }
    if ((paramObject instanceof Boolean))
    {
      if (((Boolean)paramObject).booleanValue()) {}
      for (long l = 1L;; l = 0L) {
        return Long.valueOf(l);
      }
    }
    if ((paramObject instanceof Float)) {
      return Double.valueOf(((Float)paramObject).doubleValue());
    }
    if (((paramObject instanceof String)) || ((paramObject instanceof Character)) || ((paramObject instanceof CharSequence))) {
      return a(String.valueOf(paramObject), paramInt, paramBoolean);
    }
    return null;
  }
  
  /* Error */
  public static Object a(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 129	java/io/ByteArrayOutputStream
    //   9: dup
    //   10: invokespecial 132	java/io/ByteArrayOutputStream:<init>	()V
    //   13: astore_1
    //   14: new 134	java/io/ObjectOutputStream
    //   17: dup
    //   18: aload_1
    //   19: invokespecial 137	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   22: astore_2
    //   23: aload_2
    //   24: aload_0
    //   25: invokevirtual 141	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   28: aload_2
    //   29: invokevirtual 144	java/io/ObjectOutputStream:flush	()V
    //   32: new 146	java/io/ObjectInputStream
    //   35: dup
    //   36: new 148	java/io/ByteArrayInputStream
    //   39: dup
    //   40: aload_1
    //   41: invokevirtual 152	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   44: invokespecial 155	java/io/ByteArrayInputStream:<init>	([B)V
    //   47: invokespecial 158	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   50: astore_1
    //   51: aload_1
    //   52: invokevirtual 162	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   55: astore_0
    //   56: aload_2
    //   57: invokevirtual 165	java/io/ObjectOutputStream:close	()V
    //   60: aload_1
    //   61: invokevirtual 166	java/io/ObjectInputStream:close	()V
    //   64: aload_0
    //   65: areturn
    //   66: aload_2
    //   67: ifnull +7 -> 74
    //   70: aload_2
    //   71: invokevirtual 165	java/io/ObjectOutputStream:close	()V
    //   74: aload_1
    //   75: ifnull +7 -> 82
    //   78: aload_1
    //   79: invokevirtual 166	java/io/ObjectInputStream:close	()V
    //   82: aload_0
    //   83: athrow
    //   84: astore_0
    //   85: aconst_null
    //   86: areturn
    //   87: astore_0
    //   88: aconst_null
    //   89: areturn
    //   90: astore_0
    //   91: aconst_null
    //   92: astore_1
    //   93: goto -27 -> 66
    //   96: astore_0
    //   97: goto -31 -> 66
    //   100: astore_0
    //   101: aconst_null
    //   102: astore_1
    //   103: aconst_null
    //   104: astore_2
    //   105: goto -39 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramObject	Object
    //   13	90	1	localObject	Object
    //   22	83	2	localObjectOutputStream	java.io.ObjectOutputStream
    // Exception table:
    //   from	to	target	type
    //   56	64	84	java/io/IOException
    //   70	74	84	java/io/IOException
    //   78	82	84	java/io/IOException
    //   82	84	84	java/io/IOException
    //   56	64	87	java/lang/ClassNotFoundException
    //   70	74	87	java/lang/ClassNotFoundException
    //   78	82	87	java/lang/ClassNotFoundException
    //   82	84	87	java/lang/ClassNotFoundException
    //   23	51	90	finally
    //   51	56	96	finally
    //   6	23	100	finally
  }
  
  public static Object a(String paramString, Object paramObject)
  {
    if ("_ev".equals(paramString)) {
      return a(cf.C(), paramObject, true);
    }
    if (i(paramString)) {}
    for (int i = cf.C();; i = cf.B()) {
      return a(i, paramObject, false);
    }
  }
  
  public static String a(ds.b paramb)
  {
    int i = 0;
    if (paramb == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nevent_filter {\n");
    a(localStringBuilder, 0, "filter_id", a);
    a(localStringBuilder, 0, "event_name", b);
    a(localStringBuilder, 1, "event_count_filter", e);
    localStringBuilder.append("  filters {\n");
    paramb = c;
    int j = paramb.length;
    while (i < j)
    {
      a(localStringBuilder, 2, paramb[i]);
      i += 1;
    }
    a(localStringBuilder, 1);
    localStringBuilder.append("}\n}\n");
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString, int paramInt, boolean paramBoolean)
  {
    String str = paramString;
    if (paramString.length() > paramInt)
    {
      if (paramBoolean) {
        str = String.valueOf(paramString.substring(0, paramInt)).concat("...");
      }
    }
    else {
      return str;
    }
    return null;
  }
  
  private static void a(Bundle paramBundle, Object paramObject)
  {
    com.google.android.gms.common.internal.c.a(paramBundle);
    if ((paramObject != null) && (((paramObject instanceof String)) || ((paramObject instanceof CharSequence)))) {
      paramBundle.putLong("_el", String.valueOf(paramObject).length());
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      paramStringBuilder.append("  ");
      i += 1;
    }
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt, ds.c paramc)
  {
    if (paramc == null) {
      return;
    }
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append("filter {\n");
    a(paramStringBuilder, paramInt, "complement", c);
    a(paramStringBuilder, paramInt, "param_name", d);
    int j = paramInt + 1;
    ds.f localf = a;
    if (localf != null)
    {
      a(paramStringBuilder, j);
      paramStringBuilder.append("string_filter");
      paramStringBuilder.append(" {\n");
      Object localObject;
      if (a != null)
      {
        localObject = "UNKNOWN_MATCH_TYPE";
        switch (a.intValue())
        {
        }
      }
      for (;;)
      {
        a(paramStringBuilder, j, "match_type", localObject);
        a(paramStringBuilder, j, "expression", b);
        a(paramStringBuilder, j, "case_sensitive", c);
        if (d.length <= 0) {
          break label316;
        }
        a(paramStringBuilder, j + 1);
        paramStringBuilder.append("expression_list {\n");
        localObject = d;
        int k = localObject.length;
        int i = 0;
        while (i < k)
        {
          localf = localObject[i];
          a(paramStringBuilder, j + 2);
          paramStringBuilder.append(localf);
          paramStringBuilder.append("\n");
          i += 1;
        }
        localObject = "REGEXP";
        continue;
        localObject = "BEGINS_WITH";
        continue;
        localObject = "ENDS_WITH";
        continue;
        localObject = "PARTIAL";
        continue;
        localObject = "EXACT";
        continue;
        localObject = "IN_LIST";
      }
      paramStringBuilder.append("}\n");
      label316:
      a(paramStringBuilder, j);
      paramStringBuilder.append("}\n");
    }
    a(paramStringBuilder, paramInt + 1, "number_filter", b);
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append("}\n");
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt, String paramString, ds.d paramd)
  {
    if (paramd == null) {
      return;
    }
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    if (a != null)
    {
      paramString = "UNKNOWN_COMPARISON_TYPE";
      switch (a.intValue())
      {
      }
    }
    for (;;)
    {
      a(paramStringBuilder, paramInt, "comparison_type", paramString);
      a(paramStringBuilder, paramInt, "match_as_float", b);
      a(paramStringBuilder, paramInt, "comparison_value", c);
      a(paramStringBuilder, paramInt, "min_comparison_value", d);
      a(paramStringBuilder, paramInt, "max_comparison_value", e);
      a(paramStringBuilder, paramInt);
      paramStringBuilder.append("}\n");
      return;
      paramString = "LESS_THAN";
      continue;
      paramString = "GREATER_THAN";
      continue;
      paramString = "EQUAL";
      continue;
      paramString = "BETWEEN";
    }
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    a(paramStringBuilder, paramInt + 1);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
    paramStringBuilder.append('\n');
  }
  
  private static void a(StringBuilder paramStringBuilder, du.e parame)
  {
    if (parame == null) {
      return;
    }
    a(paramStringBuilder, 1);
    paramStringBuilder.append("bundle {\n");
    a(paramStringBuilder, 1, "protocol_version", a);
    a(paramStringBuilder, 1, "platform", i);
    a(paramStringBuilder, 1, "gmp_version", q);
    a(paramStringBuilder, 1, "uploading_gmp_version", r);
    a(paramStringBuilder, 1, "config_version", G);
    a(paramStringBuilder, 1, "gmp_app_id", y);
    a(paramStringBuilder, 1, "app_id", o);
    a(paramStringBuilder, 1, "app_version", p);
    a(paramStringBuilder, 1, "app_version_major", C);
    a(paramStringBuilder, 1, "app_version_minor", D);
    a(paramStringBuilder, 1, "app_version_release", E);
    a(paramStringBuilder, 1, "firebase_instance_id", B);
    a(paramStringBuilder, 1, "dev_cert_hash", v);
    a(paramStringBuilder, 1, "app_store", n);
    a(paramStringBuilder, 1, "upload_timestamp_millis", d);
    a(paramStringBuilder, 1, "start_timestamp_millis", e);
    a(paramStringBuilder, 1, "end_timestamp_millis", f);
    a(paramStringBuilder, 1, "previous_bundle_start_timestamp_millis", g);
    a(paramStringBuilder, 1, "previous_bundle_end_timestamp_millis", h);
    a(paramStringBuilder, 1, "app_instance_id", u);
    a(paramStringBuilder, 1, "resettable_device_id", s);
    a(paramStringBuilder, 1, "device_id", F);
    a(paramStringBuilder, 1, "limited_ad_tracking", t);
    a(paramStringBuilder, 1, "os_version", j);
    a(paramStringBuilder, 1, "device_model", k);
    a(paramStringBuilder, 1, "user_default_language", l);
    a(paramStringBuilder, 1, "time_zone_offset_minutes", m);
    a(paramStringBuilder, 1, "bundle_sequential_index", w);
    a(paramStringBuilder, 1, "service_upload", z);
    a(paramStringBuilder, 1, "health_monitor", x);
    if (H.longValue() != 0L) {
      a(paramStringBuilder, 1, "android_id", H);
    }
    Object localObject1 = c;
    int j;
    int i;
    Object localObject2;
    if (localObject1 != null)
    {
      j = localObject1.length;
      i = 0;
      while (i < j)
      {
        localObject2 = localObject1[i];
        if (localObject2 != null)
        {
          a(paramStringBuilder, 2);
          paramStringBuilder.append("user_property {\n");
          a(paramStringBuilder, 2, "set_timestamp_millis", a);
          a(paramStringBuilder, 2, "name", b);
          a(paramStringBuilder, 2, "string_value", c);
          a(paramStringBuilder, 2, "int_value", d);
          a(paramStringBuilder, 2, "double_value", f);
          a(paramStringBuilder, 2);
          paramStringBuilder.append("}\n");
        }
        i += 1;
      }
    }
    localObject1 = A;
    if (localObject1 != null)
    {
      j = localObject1.length;
      i = 0;
      while (i < j)
      {
        localObject2 = localObject1[i];
        if (localObject2 != null)
        {
          a(paramStringBuilder, 2);
          paramStringBuilder.append("audience_membership {\n");
          a(paramStringBuilder, 2, "audience_id", a);
          a(paramStringBuilder, 2, "new_audience", d);
          a(paramStringBuilder, "current_data", b);
          a(paramStringBuilder, "previous_data", c);
          a(paramStringBuilder, 2);
          paramStringBuilder.append("}\n");
        }
        i += 1;
      }
    }
    parame = b;
    if (parame != null)
    {
      int k = parame.length;
      i = 0;
      while (i < k)
      {
        localObject1 = parame[i];
        if (localObject1 != null)
        {
          a(paramStringBuilder, 2);
          paramStringBuilder.append("event {\n");
          a(paramStringBuilder, 2, "name", b);
          a(paramStringBuilder, 2, "timestamp_millis", c);
          a(paramStringBuilder, 2, "previous_timestamp_millis", d);
          a(paramStringBuilder, 2, "count", e);
          localObject1 = a;
          if (localObject1 != null)
          {
            int m = localObject1.length;
            j = 0;
            while (j < m)
            {
              localObject2 = localObject1[j];
              if (localObject2 != null)
              {
                a(paramStringBuilder, 3);
                paramStringBuilder.append("param {\n");
                a(paramStringBuilder, 3, "name", a);
                a(paramStringBuilder, 3, "string_value", b);
                a(paramStringBuilder, 3, "int_value", c);
                a(paramStringBuilder, 3, "double_value", e);
                a(paramStringBuilder, 3);
                paramStringBuilder.append("}\n");
              }
              j += 1;
            }
          }
          a(paramStringBuilder, 2);
          paramStringBuilder.append("}\n");
        }
        i += 1;
      }
    }
    a(paramStringBuilder, 1);
    paramStringBuilder.append("}\n");
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, du.f paramf)
  {
    int k = 0;
    if (paramf == null) {
      return;
    }
    a(paramStringBuilder, 3);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    int m;
    int j;
    int i;
    long l;
    if (b != null)
    {
      a(paramStringBuilder, 4);
      paramStringBuilder.append("results: ");
      paramString = b;
      m = paramString.length;
      j = 0;
      i = 0;
      while (j < m)
      {
        l = paramString[j];
        if (i != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(Long.valueOf(l));
        j += 1;
        i += 1;
      }
      paramStringBuilder.append('\n');
    }
    if (a != null)
    {
      a(paramStringBuilder, 4);
      paramStringBuilder.append("status: ");
      paramString = a;
      m = paramString.length;
      i = 0;
      j = k;
      while (j < m)
      {
        l = paramString[j];
        if (i != 0) {
          paramStringBuilder.append(", ");
        }
        paramStringBuilder.append(Long.valueOf(l));
        j += 1;
        i += 1;
      }
      paramStringBuilder.append('\n');
    }
    a(paramStringBuilder, 3);
    paramStringBuilder.append("}\n");
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        return false;
      }
      paramContext = localPackageManager.getReceiverInfo(new ComponentName(paramContext, paramString), 2);
      if (paramContext != null)
      {
        boolean bool = enabled;
        if (bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private static boolean a(Bundle paramBundle, int paramInt)
  {
    if (paramBundle.getLong("_err") == 0L)
    {
      paramBundle.putLong("_err", paramInt);
      return true;
    }
    return false;
  }
  
  static boolean a(cn paramcn, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramcn);
    com.google.android.gms.common.internal.c.a(paramca);
    if (TextUtils.isEmpty(b))
    {
      cf.W();
      return false;
    }
    return true;
  }
  
  static boolean a(String paramString)
  {
    boolean bool = false;
    com.google.android.gms.common.internal.c.a(paramString);
    if ((paramString.charAt(0) != '_') || (paramString.equals("_ep"))) {
      bool = true;
    }
    return bool;
  }
  
  private boolean a(String paramString1, int paramInt, String paramString2)
  {
    if (paramString2 == null)
    {
      ua.a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() > paramInt)
    {
      ua.a("Name is too long. Type, maximum supported length, name", paramString1, Integer.valueOf(paramInt), paramString2);
      return false;
    }
    return true;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      return true;
    }
    if (paramString1 == null) {
      return false;
    }
    return paramString1.equals(paramString2);
  }
  
  private boolean a(String paramString1, String paramString2, int paramInt, Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null) {}
    do
    {
      while (!paramString1.hasNext())
      {
        for (;;)
        {
          return true;
          if ((!(paramObject instanceof Long)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Integer)) && (!(paramObject instanceof Byte)) && (!(paramObject instanceof Short)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Double))) {
            if (((paramObject instanceof String)) || ((paramObject instanceof Character)) || ((paramObject instanceof CharSequence)))
            {
              paramObject = String.valueOf(paramObject);
              if (((String)paramObject).length() > paramInt)
              {
                uc.a("Value is too long; discarded. Value kind, name, value length", paramString1, paramString2, Integer.valueOf(((String)paramObject).length()));
                return false;
              }
            }
            else if ((!(paramObject instanceof Bundle)) || (!paramBoolean))
            {
              if ((!(paramObject instanceof Parcelable[])) || (!paramBoolean)) {
                break;
              }
              paramString1 = (Parcelable[])paramObject;
              int i = paramString1.length;
              paramInt = 0;
              while (paramInt < i)
              {
                paramObject = paramString1[paramInt];
                if (!(paramObject instanceof Bundle))
                {
                  uc.a("All Parcelable[] elements must be of type Bundle. Value type, name", paramObject.getClass(), paramString2);
                  return false;
                }
                paramInt += 1;
              }
            }
          }
        }
        if ((!(paramObject instanceof ArrayList)) || (!paramBoolean)) {
          break;
        }
        paramString1 = ((ArrayList)paramObject).iterator();
      }
      paramObject = paramString1.next();
    } while ((paramObject instanceof Bundle));
    uc.a("All ArrayList elements must be of type Bundle. Value type, name", paramObject.getClass(), paramString2);
    return false;
    return false;
  }
  
  private boolean a(String paramString1, Map<String, String> paramMap, String paramString2)
  {
    if (paramString2 == null)
    {
      ua.a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.startsWith("firebase_"))
    {
      ua.a("Name starts with reserved prefix. Type, name", paramString1, paramString2);
      return false;
    }
    if ((paramMap != null) && (paramMap.containsKey(paramString2)))
    {
      ua.a("Name is reserved. Type, name", paramString1, paramString2);
      return false;
    }
    return true;
  }
  
  public static boolean a(long[] paramArrayOfLong, int paramInt)
  {
    if (paramInt >= paramArrayOfLong.length * 64) {}
    while ((paramArrayOfLong[(paramInt / 64)] & 1L << paramInt % 64) == 0L) {
      return false;
    }
    return true;
  }
  
  static byte[] a(Parcelable paramParcelable)
  {
    if (paramParcelable == null) {
      return null;
    }
    Parcel localParcel = Parcel.obtain();
    try
    {
      paramParcelable.writeToParcel(localParcel, 0);
      paramParcelable = localParcel.marshall();
      return paramParcelable;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public static long[] a(BitSet paramBitSet)
  {
    int k = (paramBitSet.length() + 63) / 64;
    long[] arrayOfLong = new long[k];
    int i = 0;
    while (i < k)
    {
      arrayOfLong[i] = 0L;
      int j = 0;
      while ((j < 64) && (i * 64 + j < paramBitSet.length()))
      {
        if (paramBitSet.get(i * 64 + j)) {
          arrayOfLong[i] |= 1L << j;
        }
        j += 1;
      }
      i += 1;
    }
    return arrayOfLong;
  }
  
  public static String b(du.d paramd)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\nbatch {\n");
    if (a != null)
    {
      paramd = a;
      int j = paramd.length;
      int i = 0;
      while (i < j)
      {
        du.e locale = paramd[i];
        if (locale != null) {
          a(localStringBuilder, locale);
        }
        i += 1;
      }
    }
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        return false;
      }
      paramContext = localPackageManager.getServiceInfo(new ComponentName(paramContext, paramString), 4);
      if (paramContext != null)
      {
        boolean bool = enabled;
        if (bool) {
          return true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private boolean b(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      ua.a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      ua.a("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int i = paramString2.codePointAt(0);
    if (!Character.isLetter(i))
    {
      ua.a("Name must start with a letter. Type, name", paramString1, paramString2);
      return false;
    }
    int j = paramString2.length();
    i = Character.charCount(i);
    while (i < j)
    {
      int k = paramString2.codePointAt(i);
      if ((k != 95) && (!Character.isLetterOrDigit(k)))
      {
        ua.a("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      i += Character.charCount(k);
    }
    return true;
  }
  
  static long c(byte[] paramArrayOfByte)
  {
    int j = 0;
    com.google.android.gms.common.internal.c.a(paramArrayOfByte);
    if (paramArrayOfByte.length > 0) {}
    long l;
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.c.a(bool);
      l = 0L;
      int i = paramArrayOfByte.length - 1;
      while ((i >= 0) && (i >= paramArrayOfByte.length - 8))
      {
        l += ((paramArrayOfByte[i] & 0xFF) << j);
        j += 8;
        i -= 1;
      }
    }
    return l;
  }
  
  public static Object c(String paramString, Object paramObject)
  {
    if ("_ldl".equals(paramString)) {
      return a(p(paramString), paramObject, true);
    }
    return a(p(paramString), paramObject, false);
  }
  
  private boolean c(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      ua.a("Name is required and can't be null. Type", paramString1);
      return false;
    }
    if (paramString2.length() == 0)
    {
      ua.a("Name is required and can't be empty. Type", paramString1);
      return false;
    }
    int i = paramString2.codePointAt(0);
    if ((!Character.isLetter(i)) && (i != 95))
    {
      ua.a("Name must start with a letter or _ (underscore). Type, name", paramString1, paramString2);
      return false;
    }
    int j = paramString2.length();
    i = Character.charCount(i);
    while (i < j)
    {
      int k = paramString2.codePointAt(i);
      if ((k != 95) && (!Character.isLetterOrDigit(k)))
      {
        ua.a("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
        return false;
      }
      i += Character.charCount(k);
    }
    return true;
  }
  
  private boolean d(Context paramContext, String paramString)
  {
    X500Principal localX500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
    try
    {
      paramContext = bc.a(paramContext).b(paramString, 64);
      if ((paramContext != null) && (signatures != null) && (signatures.length > 0))
      {
        paramContext = signatures[0];
        boolean bool = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(paramContext.toByteArray()))).getSubjectX500Principal().equals(localX500Principal);
        return bool;
      }
    }
    catch (CertificateException paramContext)
    {
      ua.a("Error obtaining certificate", paramContext);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        ua.a("Package name not found", paramContext);
      }
    }
  }
  
  static MessageDigest g(String paramString)
  {
    int i = 0;
    while (i < 2) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i += 1;
      }
    }
    return null;
  }
  
  public static boolean i(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.startsWith("_"));
  }
  
  static boolean k(String paramString)
  {
    return (paramString != null) && (paramString.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) && (paramString.length() <= 310);
  }
  
  private int n(String paramString)
  {
    if (!b("event param", paramString)) {}
    do
    {
      return 3;
      if (!a("event param", null, paramString)) {
        return 14;
      }
    } while (!a("event param", cf.A(), paramString));
    return 0;
  }
  
  private int o(String paramString)
  {
    if (!c("event param", paramString)) {}
    do
    {
      return 3;
      if (!a("event param", null, paramString)) {
        return 14;
      }
    } while (!a("event param", cf.A(), paramString));
    return 0;
  }
  
  private static int p(String paramString)
  {
    if ("_ldl".equals(paramString)) {
      return cf.F();
    }
    return cf.E();
  }
  
  public final Bundle a(Uri paramUri)
  {
    Object localObject = null;
    if (paramUri == null) {
      return (Bundle)localObject;
    }
    for (;;)
    {
      try
      {
        if (paramUri.isHierarchical())
        {
          str4 = paramUri.getQueryParameter("utm_campaign");
          str3 = paramUri.getQueryParameter("utm_source");
          str2 = paramUri.getQueryParameter("utm_medium");
          str1 = paramUri.getQueryParameter("gclid");
          if ((TextUtils.isEmpty(str4)) && (TextUtils.isEmpty(str3)) && (TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str1))) {
            break;
          }
          Bundle localBundle = new Bundle();
          if (!TextUtils.isEmpty(str4)) {
            localBundle.putString("campaign", str4);
          }
          if (!TextUtils.isEmpty(str3)) {
            localBundle.putString("source", str3);
          }
          if (!TextUtils.isEmpty(str2)) {
            localBundle.putString("medium", str2);
          }
          if (!TextUtils.isEmpty(str1)) {
            localBundle.putString("gclid", str1);
          }
          str1 = paramUri.getQueryParameter("utm_term");
          if (!TextUtils.isEmpty(str1)) {
            localBundle.putString("term", str1);
          }
          str1 = paramUri.getQueryParameter("utm_content");
          if (!TextUtils.isEmpty(str1)) {
            localBundle.putString("content", str1);
          }
          str1 = paramUri.getQueryParameter("aclid");
          if (!TextUtils.isEmpty(str1)) {
            localBundle.putString("aclid", str1);
          }
          str1 = paramUri.getQueryParameter("cp1");
          if (!TextUtils.isEmpty(str1)) {
            localBundle.putString("cp1", str1);
          }
          paramUri = paramUri.getQueryParameter("anid");
          localObject = localBundle;
          if (TextUtils.isEmpty(paramUri)) {
            break;
          }
          localBundle.putString("anid", paramUri);
          return localBundle;
        }
      }
      catch (UnsupportedOperationException paramUri)
      {
        uc.a("Install referrer url isn't a hierarchical URI", paramUri);
        return null;
      }
      String str1 = null;
      String str2 = null;
      String str3 = null;
      String str4 = null;
    }
  }
  
  final Bundle a(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = a(str, paramBundle.get(str));
        if (localObject == null) {
          uc.a("Param value can't be null", str);
        } else {
          a(localBundle, str, localObject);
        }
      }
    }
    return localBundle;
  }
  
  public final Bundle a(String paramString, Bundle paramBundle, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    Bundle localBundle = null;
    int i;
    String str1;
    int j;
    if (paramBundle != null)
    {
      localBundle = new Bundle(paramBundle);
      cf.x();
      Iterator localIterator = paramBundle.keySet().iterator();
      i = 0;
      if (localIterator.hasNext())
      {
        str1 = (String)localIterator.next();
        if ((paramList != null) && (paramList.contains(str1))) {
          break label330;
        }
        if (!paramBoolean1) {
          break label324;
        }
        j = n(str1);
        label85:
        k = j;
        if (j != 0) {}
      }
    }
    label324:
    label330:
    for (int k = o(str1);; k = 0)
    {
      if (k != 0)
      {
        if (a(localBundle, k))
        {
          localBundle.putString("_ev", a(str1, cf.A(), true));
          if (k == 3) {
            a(localBundle, str1);
          }
        }
        localBundle.remove(str1);
        break;
      }
      j = a(str1, paramBundle.get(str1), paramBoolean2);
      if ((j != 0) && (!"_ev".equals(str1)))
      {
        if (a(localBundle, j))
        {
          localBundle.putString("_ev", a(str1, cf.A(), true));
          a(localBundle, paramBundle.get(str1));
        }
        localBundle.remove(str1);
        break;
      }
      j = i;
      if (a(str1))
      {
        i += 1;
        j = i;
        if (i > 25)
        {
          String str2 = 48 + "Event can't contain more then 25 params";
          ua.a(str2, paramString, paramBundle);
          a(localBundle, 5);
          localBundle.remove(str1);
          break;
        }
      }
      i = j;
      break;
      return localBundle;
      j = 0;
      break label85;
    }
  }
  
  final <T extends Parcelable> T a(byte[] paramArrayOfByte, Parcelable.Creator<T> paramCreator)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
      localParcel.setDataPosition(0);
      paramArrayOfByte = (Parcelable)paramCreator.createFromParcel(localParcel);
      return paramArrayOfByte;
    }
    catch (b.a paramArrayOfByte)
    {
      ua.a("Failed to load parcelable from buffer");
      return null;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  final cn a(String paramString1, Bundle paramBundle, String paramString2, long paramLong)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return null;
    }
    if (c(paramString1) != 0)
    {
      ua.a("Invalid conditional property event name", paramString1);
      throw new IllegalArgumentException();
    }
    if (paramBundle != null) {}
    for (paramBundle = new Bundle(paramBundle);; paramBundle = new Bundle())
    {
      paramBundle.putString("_o", paramString2);
      return new cn(paramString1, new cl(a(a(paramString1, paramBundle, Collections.singletonList("_o"), false, false))), paramString2, paramLong);
    }
  }
  
  protected final void a()
  {
    SecureRandom localSecureRandom = new SecureRandom();
    long l2 = localSecureRandom.nextLong();
    long l1 = l2;
    if (l2 == 0L)
    {
      l2 = localSecureRandom.nextLong();
      l1 = l2;
      if (l2 == 0L)
      {
        uc.a("Utils falling back to Random for random id");
        l1 = l2;
      }
    }
    a.set(l1);
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    Bundle localBundle = new Bundle();
    a(localBundle, paramInt1);
    if (!TextUtils.isEmpty(paramString1)) {
      localBundle.putString(paramString1, paramString2);
    }
    if ((paramInt1 == 6) || (paramInt1 == 7) || (paramInt1 == 2)) {
      localBundle.putLong("_el", paramInt2);
    }
    cf.W();
    q.h().b("auto", "_err", localBundle);
  }
  
  public final void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    if (paramBundle == null) {}
    do
    {
      return;
      if ((paramObject instanceof Long))
      {
        paramBundle.putLong(paramString, ((Long)paramObject).longValue());
        return;
      }
      if ((paramObject instanceof String))
      {
        paramBundle.putString(paramString, String.valueOf(paramObject));
        return;
      }
      if ((paramObject instanceof Double))
      {
        paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
        return;
      }
    } while (paramString == null);
    if (paramObject != null) {}
    for (paramBundle = paramObject.getClass().getSimpleName();; paramBundle = null)
    {
      ud.a("Not putting event parameter. Invalid value type. name, type", paramString, paramBundle);
      return;
    }
  }
  
  public final void a(du.c paramc, Object paramObject)
  {
    com.google.android.gms.common.internal.c.a(paramObject);
    b = null;
    c = null;
    e = null;
    if ((paramObject instanceof String))
    {
      b = ((String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      c = ((Long)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      e = ((Double)paramObject);
      return;
    }
    ua.a("Ignoring invalid (type) event param value", paramObject);
  }
  
  public final void a(du.g paramg, Object paramObject)
  {
    com.google.android.gms.common.internal.c.a(paramObject);
    c = null;
    d = null;
    f = null;
    if ((paramObject instanceof String))
    {
      c = ((String)paramObject);
      return;
    }
    if ((paramObject instanceof Long))
    {
      d = ((Long)paramObject);
      return;
    }
    if ((paramObject instanceof Double))
    {
      f = ((Double)paramObject);
      return;
    }
    ua.a("Ignoring invalid (type) user attribute value", paramObject);
  }
  
  public final boolean a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (paramLong2 <= 0L)) {}
    while (Math.abs(super.m().a() - paramLong1) > paramLong2) {
      return true;
    }
    return false;
  }
  
  public final byte[] a(du.d paramd)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramd.f()];
      fu localfu = fu.a(arrayOfByte, arrayOfByte.length);
      paramd.a(localfu);
      localfu.a();
      return arrayOfByte;
    }
    catch (IOException paramd)
    {
      ua.a("Data loss. Failed to serialize batch", paramd);
    }
    return null;
  }
  
  public final byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      ua.a("Failed to gzip content", paramArrayOfByte);
      throw paramArrayOfByte;
    }
  }
  
  public final int b(String paramString)
  {
    if (!b("event", paramString)) {}
    do
    {
      return 2;
      if (!a("event", AppMeasurement.a.a, paramString)) {
        return 13;
      }
    } while (!a("event", cf.y(), paramString));
    return 0;
  }
  
  public final int b(String paramString, Object paramObject)
  {
    if ("_ldl".equals(paramString)) {}
    for (boolean bool = a("user property referrer", paramString, p(paramString), paramObject, false); bool; bool = a("user property", paramString, p(paramString), paramObject, false)) {
      return 0;
    }
    return 7;
  }
  
  public final byte[] b(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream;
    try
    {
      paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);
      GZIPInputStream localGZIPInputStream = new GZIPInputStream(paramArrayOfByte);
      localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = localGZIPInputStream.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localGZIPInputStream.close();
    }
    catch (IOException paramArrayOfByte)
    {
      ua.a("Failed to ungzip content", paramArrayOfByte);
      throw paramArrayOfByte;
    }
    paramArrayOfByte.close();
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    return paramArrayOfByte;
  }
  
  public final int c(String paramString)
  {
    if (!c("event", paramString)) {}
    do
    {
      return 2;
      if (!a("event", AppMeasurement.a.a, paramString)) {
        return 13;
      }
    } while (!a("event", cf.y(), paramString));
    return 0;
  }
  
  final long c(Context paramContext, String paramString)
  {
    super.e();
    com.google.android.gms.common.internal.c.a(paramContext);
    com.google.android.gms.common.internal.c.a(paramString);
    PackageManager localPackageManager = paramContext.getPackageManager();
    MessageDigest localMessageDigest = g("MD5");
    if (localMessageDigest == null)
    {
      ua.a("Could not get MD5 instance");
      return -1L;
    }
    if (localPackageManager != null) {
      try
      {
        if (!d(paramContext, paramString))
        {
          paramContext = bc.a(paramContext).b(super.n().getPackageName(), 64);
          if ((signatures != null) && (signatures.length > 0)) {
            return c(localMessageDigest.digest(signatures[0].toByteArray()));
          }
          uc.a("Could not get signatures");
          return -1L;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ua.a("Package name not found", paramContext);
      }
    }
    return 0L;
  }
  
  public final int d(String paramString)
  {
    if (!b("user property", paramString)) {}
    do
    {
      return 6;
      if (!a("user property", AppMeasurement.g.a, paramString)) {
        return 15;
      }
    } while (!a("user property", cf.z(), paramString));
    return 0;
  }
  
  public final int e(String paramString)
  {
    if (!c("user property", paramString)) {}
    do
    {
      return 6;
      if (!a("user property", AppMeasurement.g.a, paramString)) {
        return 15;
      }
    } while (!a("user property", cf.z(), paramString));
    return 0;
  }
  
  public final boolean f(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      ua.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
      return false;
    }
    com.google.android.gms.common.internal.c.a(paramString);
    if (!paramString.matches("^1:\\d+:android:[a-f0-9]+$"))
    {
      ua.a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", paramString);
      return false;
    }
    return true;
  }
  
  public final boolean h(String paramString)
  {
    super.e();
    if (bc.a(super.n()).a(paramString) == 0) {
      return true;
    }
    uf.a("Permission not granted", paramString);
    return false;
  }
  
  public final boolean j(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    String str = super.w().au();
    cf.W();
    return str.equals(paramString);
  }
  
  final boolean l(String paramString)
  {
    return "1".equals(super.r().a(paramString, "measurement.upload.blacklist_internal"));
  }
  
  final boolean m(String paramString)
  {
    return "1".equals(super.r().a(paramString, "measurement.upload.blacklist_public"));
  }
  
  public final long x()
  {
    long l1;
    if (a.get() == 0L) {
      synchronized (a)
      {
        l1 = new Random(System.nanoTime() ^ super.m().a()).nextLong();
        int i = b + 1;
        b = i;
        long l2 = i;
        return l1 + l2;
      }
    }
    synchronized (a)
    {
      a.compareAndSet(-1L, 1L);
      l1 = a.getAndIncrement();
      return l1;
    }
  }
}


/* Location:              com/google/android/gms/b/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */