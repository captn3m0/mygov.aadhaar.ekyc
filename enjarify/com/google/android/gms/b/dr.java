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
  private final AtomicLong a;
  private int b;
  
  dr(dc paramdc)
  {
    super(paramdc);
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>(0L);
    a = localAtomicLong;
  }
  
  private int a(String paramString, Object paramObject, boolean paramBoolean)
  {
    int i = 1;
    String str1;
    Object localObject1;
    int j;
    int n;
    Object localObject2;
    if (paramBoolean)
    {
      str1 = "param";
      cf.D();
      boolean bool1 = paramObject instanceof Parcelable[];
      if (bool1)
      {
        localObject1 = paramObject;
        localObject1 = (Parcelable[])paramObject;
        j = localObject1.length;
        n = 1000;
        if (j <= n) {
          break label139;
        }
        localObject2 = uc;
        String str2 = "Parameter array is too long; discarded. Value kind, name, array length";
        localObject1 = Integer.valueOf(j);
        ((cu.a)localObject2).a(str2, str1, paramString, localObject1);
        j = 0;
        localObject1 = null;
        label90:
        if (j != 0) {
          break label146;
        }
        j = 17;
      }
    }
    for (;;)
    {
      return j;
      boolean bool2 = paramObject instanceof ArrayList;
      if (bool2)
      {
        localObject1 = paramObject;
        localObject1 = (ArrayList)paramObject;
        k = ((ArrayList)localObject1).size();
        break;
      }
      int k = i;
      break label90;
      label139:
      k = i;
      break label90;
      label146:
      boolean bool3 = i(paramString);
      if (bool3)
      {
        localObject2 = "param";
        n = cf.C();
        localObject1 = this;
        str1 = paramString;
      }
      for (bool3 = a((String)localObject2, paramString, n, paramObject, paramBoolean);; bool3 = a((String)localObject2, paramString, n, paramObject, paramBoolean))
      {
        if (!bool3) {
          break label230;
        }
        bool3 = false;
        localObject1 = null;
        break;
        localObject2 = "param";
        n = cf.B();
        localObject1 = this;
        str1 = paramString;
      }
      label230:
      int m = 4;
    }
  }
  
  private static Object a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    if (paramObject == null) {
      paramObject = null;
    }
    for (;;)
    {
      return paramObject;
      boolean bool2 = paramObject instanceof Long;
      if (!bool2)
      {
        bool2 = paramObject instanceof Double;
        if (!bool2)
        {
          bool2 = paramObject instanceof Integer;
          long l;
          if (bool2)
          {
            i = ((Integer)paramObject).intValue();
            l = i;
            paramObject = Long.valueOf(l);
          }
          else
          {
            bool2 = paramObject instanceof Byte;
            if (bool2)
            {
              i = ((Byte)paramObject).byteValue();
              l = i;
              paramObject = Long.valueOf(l);
            }
            else
            {
              bool2 = paramObject instanceof Short;
              if (bool2)
              {
                i = ((Short)paramObject).shortValue();
                l = i;
                paramObject = Long.valueOf(l);
              }
              else
              {
                bool2 = paramObject instanceof Boolean;
                double d;
                if (bool2)
                {
                  paramObject = (Boolean)paramObject;
                  boolean bool1 = ((Boolean)paramObject).booleanValue();
                  if (bool1) {
                    l = 1L;
                  }
                  for (d = Double.MIN_VALUE;; d = 0.0D)
                  {
                    paramObject = Long.valueOf(l);
                    break;
                    l = 0L;
                  }
                }
                bool2 = paramObject instanceof Float;
                if (bool2)
                {
                  d = ((Float)paramObject).doubleValue();
                  paramObject = Double.valueOf(d);
                }
                else
                {
                  bool2 = paramObject instanceof String;
                  if (!bool2)
                  {
                    bool2 = paramObject instanceof Character;
                    if (!bool2)
                    {
                      bool2 = paramObject instanceof CharSequence;
                      if (!bool2) {
                        break label261;
                      }
                    }
                  }
                  str = String.valueOf(paramObject);
                  paramObject = a(str, paramInt, paramBoolean);
                  continue;
                  label261:
                  paramObject = null;
                }
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  public static Object a(Object paramObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: ifnonnull +5 -> 8
    //   6: aload_1
    //   7: areturn
    //   8: new 127	java/io/ByteArrayOutputStream
    //   11: astore_2
    //   12: aload_2
    //   13: invokespecial 130	java/io/ByteArrayOutputStream:<init>	()V
    //   16: new 132	java/io/ObjectOutputStream
    //   19: astore_3
    //   20: aload_3
    //   21: aload_2
    //   22: invokespecial 135	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   25: aload_3
    //   26: aload_0
    //   27: invokevirtual 139	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   30: aload_3
    //   31: invokevirtual 142	java/io/ObjectOutputStream:flush	()V
    //   34: new 144	java/io/ObjectInputStream
    //   37: astore 4
    //   39: new 146	java/io/ByteArrayInputStream
    //   42: astore 5
    //   44: aload_2
    //   45: invokevirtual 150	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   48: astore_2
    //   49: aload 5
    //   51: aload_2
    //   52: invokespecial 153	java/io/ByteArrayInputStream:<init>	([B)V
    //   55: aload 4
    //   57: aload 5
    //   59: invokespecial 156	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   62: aload 4
    //   64: invokevirtual 160	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   67: astore_2
    //   68: aload_3
    //   69: invokevirtual 163	java/io/ObjectOutputStream:close	()V
    //   72: aload 4
    //   74: invokevirtual 164	java/io/ObjectInputStream:close	()V
    //   77: aload_2
    //   78: astore_1
    //   79: goto -73 -> 6
    //   82: astore_2
    //   83: aconst_null
    //   84: astore 4
    //   86: aconst_null
    //   87: astore_3
    //   88: aload_3
    //   89: ifnull +7 -> 96
    //   92: aload_3
    //   93: invokevirtual 163	java/io/ObjectOutputStream:close	()V
    //   96: aload 4
    //   98: ifnull +8 -> 106
    //   101: aload 4
    //   103: invokevirtual 164	java/io/ObjectInputStream:close	()V
    //   106: aload_2
    //   107: athrow
    //   108: astore_2
    //   109: goto -103 -> 6
    //   112: astore_2
    //   113: goto -107 -> 6
    //   116: astore_2
    //   117: aconst_null
    //   118: astore 4
    //   120: goto -32 -> 88
    //   123: astore_2
    //   124: goto -36 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	paramObject	Object
    //   1	78	1	localObject1	Object
    //   11	67	2	localObject2	Object
    //   82	25	2	localObject3	Object
    //   108	1	2	localIOException	IOException
    //   112	1	2	localClassNotFoundException	ClassNotFoundException
    //   116	1	2	localObject4	Object
    //   123	1	2	localObject5	Object
    //   19	74	3	localObjectOutputStream	java.io.ObjectOutputStream
    //   37	82	4	localObjectInputStream	java.io.ObjectInputStream
    //   42	16	5	localByteArrayInputStream	ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   8	11	82	finally
    //   12	16	82	finally
    //   16	19	82	finally
    //   21	25	82	finally
    //   68	72	108	java/io/IOException
    //   72	77	108	java/io/IOException
    //   92	96	108	java/io/IOException
    //   101	106	108	java/io/IOException
    //   106	108	108	java/io/IOException
    //   68	72	112	java/lang/ClassNotFoundException
    //   72	77	112	java/lang/ClassNotFoundException
    //   92	96	112	java/lang/ClassNotFoundException
    //   101	106	112	java/lang/ClassNotFoundException
    //   106	108	112	java/lang/ClassNotFoundException
    //   26	30	116	finally
    //   30	34	116	finally
    //   34	37	116	finally
    //   39	42	116	finally
    //   44	48	116	finally
    //   51	55	116	finally
    //   57	62	116	finally
    //   62	67	123	finally
  }
  
  public static Object a(String paramString, Object paramObject)
  {
    Object localObject = "_ev";
    boolean bool1 = ((String)localObject).equals(paramString);
    boolean bool3;
    if (bool1)
    {
      int i = cf.C();
      bool3 = true;
      localObject = a(i, paramObject, bool3);
      return localObject;
    }
    boolean bool2 = i(paramString);
    if (bool2) {}
    for (int j = cf.C();; j = cf.B())
    {
      bool3 = false;
      localObject = a(j, paramObject, false);
      break;
    }
  }
  
  public static String a(ds.b paramb)
  {
    int i = 1;
    int j = 0;
    String str = null;
    if (paramb == null) {}
    StringBuilder localStringBuilder;
    for (str = "null";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("\nevent_filter {\n");
      Object localObject = a;
      a(localStringBuilder, 0, "filter_id", localObject);
      localObject = b;
      a(localStringBuilder, 0, "event_name", localObject);
      localObject = e;
      a(localStringBuilder, i, "event_count_filter", (ds.d)localObject);
      localStringBuilder.append("  filters {\n");
      ds.c[] arrayOfc = c;
      int k = arrayOfc.length;
      while (j < k)
      {
        ds.c localc = arrayOfc[j];
        int m = 2;
        a(localStringBuilder, m, localc);
        j += 1;
      }
      a(localStringBuilder, i);
      localStringBuilder.append("}\n}\n");
    }
  }
  
  public static String a(String paramString, int paramInt, boolean paramBoolean)
  {
    int i = paramString.length();
    String str1;
    String str2;
    if (i > paramInt)
    {
      if (!paramBoolean) {
        break label41;
      }
      i = 0;
      str1 = String.valueOf(paramString.substring(0, paramInt));
      str2 = "...";
    }
    label41:
    for (paramString = str1.concat(str2);; paramString = null) {
      return paramString;
    }
  }
  
  private static void a(Bundle paramBundle, Object paramObject)
  {
    com.google.android.gms.common.internal.c.a(paramBundle);
    if (paramObject != null)
    {
      boolean bool = paramObject instanceof String;
      if (!bool)
      {
        bool = paramObject instanceof CharSequence;
        if (!bool) {}
      }
      else
      {
        String str1 = String.valueOf(paramObject);
        String str2 = "_el";
        int i = str1.length();
        long l = i;
        paramBundle.putLong(str2, l);
      }
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      String str = "  ";
      paramStringBuilder.append(str);
      i += 1;
    }
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt, ds.c paramc)
  {
    if (paramc == null) {}
    for (;;)
    {
      return;
      a(paramStringBuilder, paramInt);
      paramStringBuilder.append("filter {\n");
      Object localObject1 = c;
      a(paramStringBuilder, paramInt, "complement", localObject1);
      localObject1 = d;
      a(paramStringBuilder, paramInt, "param_name", localObject1);
      int i = paramInt + 1;
      Object localObject2 = "string_filter";
      Object localObject3 = a;
      if (localObject3 != null)
      {
        a(paramStringBuilder, i);
        paramStringBuilder.append((String)localObject2);
        paramStringBuilder.append(" {\n");
        localObject2 = a;
        Object localObject4;
        int j;
        if (localObject2 != null)
        {
          localObject2 = "UNKNOWN_MATCH_TYPE";
          localObject4 = a;
          j = ((Integer)localObject4).intValue();
          switch (j)
          {
          }
        }
        for (;;)
        {
          localObject4 = "match_type";
          a(paramStringBuilder, i, (String)localObject4, localObject2);
          localObject4 = b;
          a(paramStringBuilder, i, "expression", localObject4);
          localObject4 = c;
          a(paramStringBuilder, i, "case_sensitive", localObject4);
          localObject2 = d;
          k = localObject2.length;
          if (k <= 0) {
            break label380;
          }
          k = i + 1;
          a(paramStringBuilder, k);
          paramStringBuilder.append("expression_list {\n");
          localObject3 = d;
          j = localObject3.length;
          k = 0;
          localObject2 = null;
          while (k < j)
          {
            String str = localObject3[k];
            int m = i + 2;
            a(paramStringBuilder, m);
            paramStringBuilder.append(str);
            str = "\n";
            paramStringBuilder.append(str);
            k += 1;
          }
          localObject2 = "REGEXP";
          continue;
          localObject2 = "BEGINS_WITH";
          continue;
          localObject2 = "ENDS_WITH";
          continue;
          localObject2 = "PARTIAL";
          continue;
          localObject2 = "EXACT";
          continue;
          localObject2 = "IN_LIST";
        }
        localObject2 = "}\n";
        paramStringBuilder.append((String)localObject2);
        label380:
        a(paramStringBuilder, i);
        localObject2 = "}\n";
        paramStringBuilder.append((String)localObject2);
      }
      int k = paramInt + 1;
      localObject1 = "number_filter";
      localObject3 = b;
      a(paramStringBuilder, k, (String)localObject1, (ds.d)localObject3);
      a(paramStringBuilder, paramInt);
      localObject2 = "}\n";
      paramStringBuilder.append((String)localObject2);
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt, String paramString, ds.d paramd)
  {
    if (paramd == null) {
      return;
    }
    a(paramStringBuilder, paramInt);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" {\n");
    Object localObject1 = a;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = "UNKNOWN_COMPARISON_TYPE";
      localObject2 = a;
      int i = ((Integer)localObject2).intValue();
      switch (i)
      {
      }
    }
    for (;;)
    {
      localObject2 = "comparison_type";
      a(paramStringBuilder, paramInt, (String)localObject2, localObject1);
      localObject2 = b;
      a(paramStringBuilder, paramInt, "match_as_float", localObject2);
      localObject2 = c;
      a(paramStringBuilder, paramInt, "comparison_value", localObject2);
      localObject2 = d;
      a(paramStringBuilder, paramInt, "min_comparison_value", localObject2);
      localObject2 = e;
      a(paramStringBuilder, paramInt, "max_comparison_value", localObject2);
      a(paramStringBuilder, paramInt);
      localObject1 = "}\n";
      paramStringBuilder.append((String)localObject1);
      break;
      localObject1 = "LESS_THAN";
      continue;
      localObject1 = "GREATER_THAN";
      continue;
      localObject1 = "EQUAL";
      continue;
      localObject1 = "BETWEEN";
    }
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return;
      int i = paramInt + 1;
      a(paramStringBuilder, i);
      paramStringBuilder.append(paramString);
      String str = ": ";
      paramStringBuilder.append(str);
      paramStringBuilder.append(paramObject);
      i = 10;
      paramStringBuilder.append(i);
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, du.e parame)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    if (parame == null) {}
    for (;;)
    {
      return;
      a(paramStringBuilder, k);
      paramStringBuilder.append("bundle {\n");
      Object localObject1 = a;
      a(paramStringBuilder, k, "protocol_version", localObject1);
      localObject1 = i;
      a(paramStringBuilder, k, "platform", localObject1);
      localObject1 = q;
      a(paramStringBuilder, k, "gmp_version", localObject1);
      localObject1 = r;
      a(paramStringBuilder, k, "uploading_gmp_version", localObject1);
      localObject1 = G;
      a(paramStringBuilder, k, "config_version", localObject1);
      localObject1 = y;
      a(paramStringBuilder, k, "gmp_app_id", localObject1);
      localObject1 = o;
      a(paramStringBuilder, k, "app_id", localObject1);
      localObject1 = p;
      a(paramStringBuilder, k, "app_version", localObject1);
      localObject1 = C;
      a(paramStringBuilder, k, "app_version_major", localObject1);
      localObject1 = D;
      a(paramStringBuilder, k, "app_version_minor", localObject1);
      localObject1 = E;
      a(paramStringBuilder, k, "app_version_release", localObject1);
      localObject1 = B;
      a(paramStringBuilder, k, "firebase_instance_id", localObject1);
      localObject1 = v;
      a(paramStringBuilder, k, "dev_cert_hash", localObject1);
      localObject1 = n;
      a(paramStringBuilder, k, "app_store", localObject1);
      localObject1 = d;
      a(paramStringBuilder, k, "upload_timestamp_millis", localObject1);
      localObject1 = e;
      a(paramStringBuilder, k, "start_timestamp_millis", localObject1);
      localObject1 = f;
      a(paramStringBuilder, k, "end_timestamp_millis", localObject1);
      localObject1 = g;
      a(paramStringBuilder, k, "previous_bundle_start_timestamp_millis", localObject1);
      localObject1 = h;
      a(paramStringBuilder, k, "previous_bundle_end_timestamp_millis", localObject1);
      localObject1 = u;
      a(paramStringBuilder, k, "app_instance_id", localObject1);
      localObject1 = s;
      a(paramStringBuilder, k, "resettable_device_id", localObject1);
      localObject1 = F;
      a(paramStringBuilder, k, "device_id", localObject1);
      localObject1 = t;
      a(paramStringBuilder, k, "limited_ad_tracking", localObject1);
      localObject1 = j;
      a(paramStringBuilder, k, "os_version", localObject1);
      localObject1 = k;
      a(paramStringBuilder, k, "device_model", localObject1);
      localObject1 = l;
      a(paramStringBuilder, k, "user_default_language", localObject1);
      localObject1 = m;
      a(paramStringBuilder, k, "time_zone_offset_minutes", localObject1);
      localObject1 = w;
      a(paramStringBuilder, k, "bundle_sequential_index", localObject1);
      localObject1 = z;
      a(paramStringBuilder, k, "service_upload", localObject1);
      localObject1 = x;
      a(paramStringBuilder, k, "health_monitor", localObject1);
      Object localObject2 = H;
      long l1 = ((Long)localObject2).longValue();
      long l2 = 0L;
      int m = l1 < l2;
      if (m != 0)
      {
        localObject2 = "android_id";
        localObject1 = H;
        a(paramStringBuilder, k, (String)localObject2, localObject1);
      }
      localObject1 = c;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      int n;
      if (localObject1 != null)
      {
        int i1 = localObject1.length;
        m = 0;
        localObject2 = null;
        while (m < i1)
        {
          localObject3 = localObject1[m];
          if (localObject3 != null)
          {
            a(paramStringBuilder, j);
            paramStringBuilder.append("user_property {\n");
            localObject4 = a;
            a(paramStringBuilder, j, "set_timestamp_millis", localObject4);
            localObject4 = b;
            a(paramStringBuilder, j, "name", localObject4);
            localObject4 = c;
            a(paramStringBuilder, j, "string_value", localObject4);
            localObject4 = d;
            a(paramStringBuilder, j, "int_value", localObject4);
            localObject5 = "double_value";
            localObject3 = f;
            a(paramStringBuilder, j, (String)localObject5, localObject3);
            a(paramStringBuilder, j);
            localObject3 = "}\n";
            paramStringBuilder.append((String)localObject3);
          }
          m += 1;
        }
      }
      localObject1 = A;
      if (localObject1 != null)
      {
        int i2 = localObject1.length;
        n = 0;
        localObject2 = null;
        while (n < i2)
        {
          localObject3 = localObject1[n];
          if (localObject3 != null)
          {
            a(paramStringBuilder, j);
            paramStringBuilder.append("audience_membership {\n");
            localObject4 = a;
            a(paramStringBuilder, j, "audience_id", localObject4);
            localObject4 = d;
            a(paramStringBuilder, j, "new_audience", localObject4);
            localObject4 = b;
            a(paramStringBuilder, "current_data", (du.f)localObject4);
            localObject5 = "previous_data";
            localObject3 = c;
            a(paramStringBuilder, (String)localObject5, (du.f)localObject3);
            a(paramStringBuilder, j);
            localObject3 = "}\n";
            paramStringBuilder.append((String)localObject3);
          }
          n += 1;
        }
      }
      du.b[] arrayOfb = b;
      if (arrayOfb != null)
      {
        int i3 = arrayOfb.length;
        n = 0;
        localObject2 = null;
        while (n < i3)
        {
          localObject1 = arrayOfb[n];
          if (localObject1 != null)
          {
            a(paramStringBuilder, j);
            paramStringBuilder.append("event {\n");
            localObject4 = b;
            a(paramStringBuilder, j, "name", localObject4);
            localObject4 = c;
            a(paramStringBuilder, j, "timestamp_millis", localObject4);
            localObject4 = d;
            a(paramStringBuilder, j, "previous_timestamp_millis", localObject4);
            localObject4 = e;
            a(paramStringBuilder, j, "count", localObject4);
            localObject5 = a;
            if (localObject5 != null)
            {
              int i4 = localObject5.length;
              int i5 = 0;
              localObject1 = null;
              while (i5 < i4)
              {
                Object localObject6 = localObject5[i5];
                if (localObject6 != null)
                {
                  a(paramStringBuilder, i);
                  paramStringBuilder.append("param {\n");
                  Object localObject7 = a;
                  a(paramStringBuilder, i, "name", localObject7);
                  localObject7 = b;
                  a(paramStringBuilder, i, "string_value", localObject7);
                  localObject7 = c;
                  a(paramStringBuilder, i, "int_value", localObject7);
                  String str = "double_value";
                  localObject6 = e;
                  a(paramStringBuilder, i, str, localObject6);
                  a(paramStringBuilder, i);
                  localObject6 = "}\n";
                  paramStringBuilder.append((String)localObject6);
                }
                i5 += 1;
              }
            }
            a(paramStringBuilder, j);
            localObject1 = "}\n";
            paramStringBuilder.append((String)localObject1);
          }
          n += 1;
        }
      }
      a(paramStringBuilder, k);
      localObject2 = "}\n";
      paramStringBuilder.append((String)localObject2);
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, du.f paramf)
  {
    char c = '\n';
    int i = 4;
    int j = 3;
    int k = 0;
    String str1 = null;
    if (paramf == null) {}
    for (;;)
    {
      return;
      a(paramStringBuilder, j);
      paramStringBuilder.append(paramString);
      paramStringBuilder.append(" {\n");
      Object localObject = b;
      int n;
      int i1;
      long l;
      if (localObject != null)
      {
        a(paramStringBuilder, i);
        paramStringBuilder.append("results: ");
        long[] arrayOfLong1 = b;
        int m = arrayOfLong1.length;
        n = 0;
        localObject = null;
        i1 = 0;
        String str2 = null;
        while (n < m)
        {
          l = arrayOfLong1[n];
          Long localLong1 = Long.valueOf(l);
          int i2 = i1 + 1;
          if (i1 != 0)
          {
            str2 = ", ";
            paramStringBuilder.append(str2);
          }
          paramStringBuilder.append(localLong1);
          n += 1;
          i1 = i2;
        }
        paramStringBuilder.append(c);
      }
      localObject = a;
      if (localObject != null)
      {
        a(paramStringBuilder, i);
        paramStringBuilder.append("status: ");
        long[] arrayOfLong2 = a;
        int i3 = arrayOfLong2.length;
        n = 0;
        localObject = null;
        while (k < i3)
        {
          l = arrayOfLong2[k];
          Long localLong2 = Long.valueOf(l);
          i1 = n + 1;
          if (n != 0)
          {
            localObject = ", ";
            paramStringBuilder.append((String)localObject);
          }
          paramStringBuilder.append(localLong2);
          k += 1;
          n = i1;
        }
        paramStringBuilder.append(c);
      }
      a(paramStringBuilder, j);
      str1 = "}\n";
      paramStringBuilder.append(str1);
    }
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool1 = false;
    for (;;)
    {
      try
      {
        localObject = paramContext.getPackageManager();
        if (localObject != null) {
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject;
        ComponentName localComponentName;
        int i;
        boolean bool2;
        continue;
      }
      return bool1;
      localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramString);
      i = 2;
      localObject = ((PackageManager)localObject).getReceiverInfo(localComponentName, i);
      if (localObject != null)
      {
        bool2 = enabled;
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  private static boolean a(Bundle paramBundle, int paramInt)
  {
    String str = "_err";
    long l1 = paramBundle.getLong(str);
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      str = "_err";
      l2 = paramInt;
      paramBundle.putLong(str, l2);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  static boolean a(cn paramcn, ca paramca)
  {
    com.google.android.gms.common.internal.c.a(paramcn);
    com.google.android.gms.common.internal.c.a(paramca);
    String str = b;
    boolean bool = TextUtils.isEmpty(str);
    if (bool)
    {
      cf.W();
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  static boolean a(String paramString)
  {
    boolean bool1 = false;
    com.google.android.gms.common.internal.c.a(paramString);
    int i = paramString.charAt(0);
    int j = 95;
    if (i == j)
    {
      String str = "_ep";
      boolean bool2 = paramString.equals(str);
      if (!bool2) {}
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  private boolean a(String paramString1, int paramInt, String paramString2)
  {
    boolean bool = false;
    cu.a locala;
    String str;
    if (paramString2 == null)
    {
      locala = ua;
      str = "Name is required and can't be null. Type";
      locala.a(str, paramString1);
    }
    for (;;)
    {
      return bool;
      int i = paramString2.length();
      if (i > paramInt)
      {
        locala = ua;
        str = "Name is too long. Type, maximum supported length, name";
        Integer localInteger = Integer.valueOf(paramInt);
        locala.a(str, paramString1, localInteger, paramString2);
      }
      else
      {
        bool = true;
      }
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool;
    if ((paramString1 == null) && (paramString2 == null)) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (paramString1 == null) {
        bool = false;
      } else {
        bool = paramString1.equals(paramString2);
      }
    }
  }
  
  private boolean a(String paramString1, String paramString2, int paramInt, Object paramObject, boolean paramBoolean)
  {
    boolean bool1 = true;
    if (paramObject == null) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Long;
      if (!bool2)
      {
        bool2 = paramObject instanceof Float;
        if (!bool2)
        {
          bool2 = paramObject instanceof Integer;
          if (!bool2)
          {
            bool2 = paramObject instanceof Byte;
            if (!bool2)
            {
              bool2 = paramObject instanceof Short;
              if (!bool2)
              {
                bool2 = paramObject instanceof Boolean;
                if (!bool2)
                {
                  bool2 = paramObject instanceof Double;
                  if (!bool2)
                  {
                    bool2 = paramObject instanceof String;
                    if (!bool2)
                    {
                      bool2 = paramObject instanceof Character;
                      if (!bool2)
                      {
                        bool2 = paramObject instanceof CharSequence;
                        if (!bool2) {
                          break label199;
                        }
                      }
                    }
                    Object localObject1 = String.valueOf(paramObject);
                    int m = ((String)localObject1).length();
                    if (m > paramInt)
                    {
                      cu.a locala = uc;
                      Object localObject2 = "Value is too long; discarded. Value kind, name, value length";
                      int i = ((String)localObject1).length();
                      localObject1 = Integer.valueOf(i);
                      locala.a((String)localObject2, paramString1, paramString2, localObject1);
                      bool1 = false;
                      locala = null;
                      continue;
                      label199:
                      int j = paramObject instanceof Bundle;
                      if ((j == 0) || (!paramBoolean))
                      {
                        j = paramObject instanceof Parcelable[];
                        if ((j != 0) && (paramBoolean))
                        {
                          paramObject = (Parcelable[])paramObject;
                          m = paramObject.length;
                          j = 0;
                          localObject1 = null;
                          for (;;)
                          {
                            if (j >= m) {
                              break label324;
                            }
                            Object localObject3 = paramObject[j];
                            boolean bool5 = localObject3 instanceof Bundle;
                            if (!bool5)
                            {
                              locala = uc;
                              localObject1 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                              localObject2 = localObject3.getClass();
                              locala.a((String)localObject1, localObject2, paramString2);
                              bool1 = false;
                              locala = null;
                              break;
                            }
                            int k;
                            j += 1;
                          }
                        }
                        else
                        {
                          label324:
                          boolean bool3 = paramObject instanceof ArrayList;
                          if ((bool3) && (paramBoolean))
                          {
                            paramObject = (ArrayList)paramObject;
                            localObject1 = ((ArrayList)paramObject).iterator();
                            boolean bool6;
                            do
                            {
                              boolean bool4 = ((Iterator)localObject1).hasNext();
                              if (!bool4) {
                                break;
                              }
                              localObject2 = ((Iterator)localObject1).next();
                              bool6 = localObject2 instanceof Bundle;
                            } while (bool6);
                            locala = uc;
                            localObject1 = "All ArrayList elements must be of type Bundle. Value type, name";
                            localObject2 = localObject2.getClass();
                            locala.a((String)localObject1, localObject2, paramString2);
                            bool1 = false;
                            locala = null;
                          }
                          else
                          {
                            bool1 = false;
                            locala = null;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private boolean a(String paramString1, Map paramMap, String paramString2)
  {
    boolean bool1 = false;
    Object localObject;
    String str;
    if (paramString2 == null)
    {
      localObject = ua;
      str = "Name is required and can't be null. Type";
      ((cu.a)localObject).a(str, paramString1);
    }
    for (;;)
    {
      return bool1;
      localObject = "firebase_";
      boolean bool2 = paramString2.startsWith((String)localObject);
      if (bool2)
      {
        localObject = ua;
        str = "Name starts with reserved prefix. Type, name";
        ((cu.a)localObject).a(str, paramString1, paramString2);
      }
      else
      {
        if (paramMap != null)
        {
          bool2 = paramMap.containsKey(paramString2);
          if (bool2)
          {
            localObject = ua;
            str = "Name is reserved. Type, name";
            ((cu.a)localObject).a(str, paramString1, paramString2);
            continue;
          }
        }
        bool1 = true;
      }
    }
  }
  
  public static boolean a(long[] paramArrayOfLong, int paramInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfLong.length * 64;
    if (paramInt >= i) {}
    for (;;)
    {
      return bool1;
      i = paramInt / 64;
      long l1 = paramArrayOfLong[i];
      i = paramInt % 64;
      long l2 = 1L << i;
      l1 &= l2;
      l2 = 0L;
      boolean bool2 = l1 < l2;
      if (bool2) {
        bool1 = true;
      }
    }
  }
  
  static byte[] a(Parcelable paramParcelable)
  {
    byte[] arrayOfByte;
    if (paramParcelable == null) {
      arrayOfByte = null;
    }
    for (;;)
    {
      return arrayOfByte;
      Parcel localParcel = Parcel.obtain();
      arrayOfByte = null;
      try
      {
        paramParcelable.writeToParcel(localParcel, 0);
        arrayOfByte = localParcel.marshall();
        localParcel.recycle();
      }
      finally
      {
        localParcel.recycle();
      }
    }
  }
  
  public static long[] a(BitSet paramBitSet)
  {
    int i = paramBitSet.length() + 63;
    int j = i / 64;
    long[] arrayOfLong = new long[j];
    for (int k = 0; k < j; k = i)
    {
      long l1 = 0L;
      arrayOfLong[k] = l1;
      i = 0;
      for (;;)
      {
        int m = 64;
        if (i >= m) {
          break;
        }
        m = k * 64 + i;
        int n = paramBitSet.length();
        if (m >= n) {
          break;
        }
        m = k * 64 + i;
        boolean bool = paramBitSet.get(m);
        if (bool)
        {
          l1 = arrayOfLong[k];
          long l2 = 1L << i;
          l1 |= l2;
          arrayOfLong[k] = l1;
        }
        i += 1;
      }
      i = k + 1;
    }
    return arrayOfLong;
  }
  
  public static String b(du.d paramd)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("\nbatch {\n");
    du.e[] arrayOfe1 = a;
    if (arrayOfe1 != null)
    {
      du.e[] arrayOfe2 = a;
      int i = arrayOfe2.length;
      int j = 0;
      arrayOfe1 = null;
      while (j < i)
      {
        du.e locale = arrayOfe2[j];
        if (locale != null) {
          a(localStringBuilder, locale);
        }
        j += 1;
      }
    }
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    boolean bool1 = false;
    for (;;)
    {
      try
      {
        localObject = paramContext.getPackageManager();
        if (localObject != null) {
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject;
        ComponentName localComponentName;
        int i;
        boolean bool2;
        continue;
      }
      return bool1;
      localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramString);
      i = 4;
      localObject = ((PackageManager)localObject).getServiceInfo(localComponentName, i);
      if (localObject != null)
      {
        bool2 = enabled;
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  private boolean b(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    cu.a locala;
    String str;
    if (paramString2 == null)
    {
      locala = ua;
      str = "Name is required and can't be null. Type";
      locala.a(str, paramString1);
    }
    for (;;)
    {
      return bool1;
      int i = paramString2.length();
      if (i == 0)
      {
        locala = ua;
        str = "Name is required and can't be empty. Type";
        locala.a(str, paramString1);
      }
      else
      {
        i = paramString2.codePointAt(0);
        boolean bool2 = Character.isLetter(i);
        if (!bool2)
        {
          locala = ua;
          str = "Name must start with a letter. Type, name";
          locala.a(str, paramString1, paramString2);
        }
        else
        {
          int j = paramString2.length();
          i = Character.charCount(i);
          for (;;)
          {
            if (i >= j) {
              break label205;
            }
            int k = paramString2.codePointAt(i);
            int m = 95;
            if (k != m)
            {
              boolean bool3 = Character.isLetterOrDigit(k);
              if (!bool3)
              {
                locala = ua;
                str = "Name must consist of letters, digits or _ (underscores). Type, name";
                locala.a(str, paramString1, paramString2);
                break;
              }
            }
            k = Character.charCount(k);
            i += k;
          }
          label205:
          bool1 = true;
        }
      }
    }
  }
  
  static long c(byte[] paramArrayOfByte)
  {
    int i = 0;
    com.google.android.gms.common.internal.c.a(paramArrayOfByte);
    int j = paramArrayOfByte.length;
    if (j > 0) {}
    long l1;
    int k;
    for (j = 1;; k = 0)
    {
      com.google.android.gms.common.internal.c.a(j);
      l1 = 0L;
      k = paramArrayOfByte.length + -1;
      while (k >= 0)
      {
        int m = paramArrayOfByte.length + -8;
        if (k < m) {
          break;
        }
        m = paramArrayOfByte[k];
        long l2 = m;
        long l3 = 255L;
        l2 = (l2 & l3) << i;
        l1 += l2;
        i += 8;
        k += -1;
      }
    }
    return l1;
  }
  
  public static Object c(String paramString, Object paramObject)
  {
    Object localObject = "_ldl";
    boolean bool1 = ((String)localObject).equals(paramString);
    int i;
    boolean bool2;
    if (bool1)
    {
      i = p(paramString);
      bool2 = true;
    }
    for (localObject = a(i, paramObject, bool2);; localObject = a(i, paramObject, false))
    {
      return localObject;
      i = p(paramString);
      bool2 = false;
    }
  }
  
  private boolean c(String paramString1, String paramString2)
  {
    int i = 95;
    boolean bool1 = false;
    cu.a locala;
    String str;
    if (paramString2 == null)
    {
      locala = ua;
      str = "Name is required and can't be null. Type";
      locala.a(str, paramString1);
    }
    for (;;)
    {
      return bool1;
      int j = paramString2.length();
      if (j == 0)
      {
        locala = ua;
        str = "Name is required and can't be empty. Type";
        locala.a(str, paramString1);
      }
      else
      {
        j = paramString2.codePointAt(0);
        boolean bool2 = Character.isLetter(j);
        if ((!bool2) && (j != i))
        {
          locala = ua;
          str = "Name must start with a letter or _ (underscore). Type, name";
          locala.a(str, paramString1, paramString2);
        }
        else
        {
          int k = paramString2.length();
          j = Character.charCount(j);
          for (;;)
          {
            if (j >= k) {
              break label211;
            }
            int m = paramString2.codePointAt(j);
            if (m != i)
            {
              boolean bool3 = Character.isLetterOrDigit(m);
              if (!bool3)
              {
                locala = ua;
                str = "Name must consist of letters, digits or _ (underscores). Type, name";
                locala.a(str, paramString1, paramString2);
                break;
              }
            }
            m = Character.charCount(m);
            j += m;
          }
          label211:
          bool1 = true;
        }
      }
    }
  }
  
  private boolean d(Context paramContext, String paramString)
  {
    localObject1 = new javax/security/auth/x500/X500Principal;
    Object localObject2 = "CN=Android Debug,O=Android,C=US";
    ((X500Principal)localObject1).<init>((String)localObject2);
    try
    {
      localObject2 = bc.a(paramContext);
      int i = 64;
      localObject2 = ((bb)localObject2).b(paramString, i);
      if (localObject2 == null) {
        break label176;
      }
      localObject3 = signatures;
      if (localObject3 == null) {
        break label176;
      }
      localObject3 = signatures;
      i = localObject3.length;
      if (i <= 0) {
        break label176;
      }
      localObject2 = signatures;
      i = 0;
      localObject3 = null;
      localObject2 = localObject2[0];
      localObject3 = "X.509";
      localObject3 = CertificateFactory.getInstance((String)localObject3);
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localObject2 = ((Signature)localObject2).toByteArray();
      localByteArrayInputStream.<init>((byte[])localObject2);
      localObject2 = ((CertificateFactory)localObject3).generateCertificate(localByteArrayInputStream);
      localObject2 = (X509Certificate)localObject2;
      localObject2 = ((X509Certificate)localObject2).getSubjectX500Principal();
      bool = ((X500Principal)localObject2).equals(localObject1);
    }
    catch (CertificateException localCertificateException)
    {
      for (;;)
      {
        localObject1 = ua;
        localObject3 = "Error obtaining certificate";
        ((cu.a)localObject1).a((String)localObject3, localCertificateException);
        boolean bool = true;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        localObject1 = ua;
        Object localObject3 = "Package name not found";
        ((cu.a)localObject1).a((String)localObject3, localNameNotFoundException);
      }
    }
    return bool;
  }
  
  static MessageDigest g(String paramString)
  {
    int i = 0;
    MessageDigest localMessageDigest = null;
    int j = 0;
    i = 2;
    if (j < i) {}
    for (;;)
    {
      try
      {
        localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i = j + 1;
        j = i;
      }
      break;
      i = 0;
      Object localObject = null;
    }
  }
  
  public static boolean i(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    String str;
    if (!bool)
    {
      str = "_";
      bool = paramString.startsWith(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  static boolean k(String paramString)
  {
    String str;
    int i;
    if (paramString != null)
    {
      str = "(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)";
      boolean bool = paramString.matches(str);
      if (bool)
      {
        i = paramString.length();
        int k = 310;
        if (i <= k) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      str = null;
    }
  }
  
  private int n(String paramString)
  {
    int i = 3;
    String str = "event param";
    boolean bool = b(str, paramString);
    if (!bool) {}
    for (;;)
    {
      return i;
      str = "event param";
      int j = 0;
      bool = a(str, null, paramString);
      if (!bool)
      {
        i = 14;
      }
      else
      {
        str = "event param";
        j = cf.A();
        bool = a(str, j, paramString);
        if (bool) {
          i = 0;
        }
      }
    }
  }
  
  private int o(String paramString)
  {
    int i = 3;
    String str = "event param";
    boolean bool = c(str, paramString);
    if (!bool) {}
    for (;;)
    {
      return i;
      str = "event param";
      int j = 0;
      bool = a(str, null, paramString);
      if (!bool)
      {
        i = 14;
      }
      else
      {
        str = "event param";
        j = cf.A();
        bool = a(str, j, paramString);
        if (bool) {
          i = 0;
        }
      }
    }
  }
  
  private static int p(String paramString)
  {
    String str = "_ldl";
    boolean bool = str.equals(paramString);
    if (bool) {}
    for (int i = cf.F();; i = cf.E()) {
      return i;
    }
  }
  
  public final Bundle a(Uri paramUri)
  {
    Bundle localBundle = null;
    if (paramUri == null) {
      return localBundle;
    }
    for (;;)
    {
      try
      {
        bool1 = paramUri.isHierarchical();
        if (!bool1) {
          break label426;
        }
        String str1 = "utm_campaign";
        str2 = paramUri.getQueryParameter(str1);
        str1 = "utm_source";
        str3 = paramUri.getQueryParameter(str1);
        str1 = "utm_medium";
        localObject2 = paramUri.getQueryParameter(str1);
        str1 = "gclid";
        str1 = paramUri.getQueryParameter(str1);
        boolean bool2 = TextUtils.isEmpty(str2);
        if (bool2)
        {
          bool2 = TextUtils.isEmpty(str3);
          if (bool2)
          {
            bool2 = TextUtils.isEmpty((CharSequence)localObject2);
            if (bool2)
            {
              bool2 = TextUtils.isEmpty(str1);
              if (bool2) {
                break;
              }
            }
          }
        }
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        bool2 = TextUtils.isEmpty(str2);
        if (!bool2)
        {
          String str4 = "campaign";
          localBundle.putString(str4, str2);
        }
        bool3 = TextUtils.isEmpty(str3);
        if (!bool3)
        {
          str2 = "source";
          localBundle.putString(str2, str3);
        }
        bool4 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool4)
        {
          str3 = "medium";
          localBundle.putString(str3, (String)localObject2);
        }
        bool5 = TextUtils.isEmpty(str1);
        if (!bool5)
        {
          localObject2 = "gclid";
          localBundle.putString((String)localObject2, str1);
        }
        str1 = paramUri.getQueryParameter("utm_term");
        bool5 = TextUtils.isEmpty(str1);
        if (!bool5)
        {
          localObject2 = "term";
          localBundle.putString((String)localObject2, str1);
        }
        str1 = paramUri.getQueryParameter("utm_content");
        bool5 = TextUtils.isEmpty(str1);
        if (!bool5)
        {
          localObject2 = "content";
          localBundle.putString((String)localObject2, str1);
        }
        str1 = paramUri.getQueryParameter("aclid");
        bool5 = TextUtils.isEmpty(str1);
        if (!bool5)
        {
          localObject2 = "aclid";
          localBundle.putString((String)localObject2, str1);
        }
        str1 = paramUri.getQueryParameter("cp1");
        bool5 = TextUtils.isEmpty(str1);
        if (!bool5)
        {
          localObject2 = "cp1";
          localBundle.putString((String)localObject2, str1);
        }
        str1 = paramUri.getQueryParameter("anid");
        bool5 = TextUtils.isEmpty(str1);
        if (bool5) {
          break;
        }
        localObject2 = "anid";
        localBundle.putString((String)localObject2, str1);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        localObject2 = uc;
        str3 = "Install referrer url isn't a hierarchical URI";
        ((cu.a)localObject2).a(str3, localUnsupportedOperationException);
      }
      break;
      label426:
      boolean bool1 = false;
      Object localObject1 = null;
      boolean bool5 = false;
      Object localObject2 = null;
      boolean bool4 = false;
      String str3 = null;
      boolean bool3 = false;
      String str2 = null;
    }
  }
  
  final Bundle a(Bundle paramBundle)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    if (paramBundle != null)
    {
      Object localObject1 = paramBundle.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)localIterator.next();
        Object localObject2 = paramBundle.get((String)localObject1);
        localObject2 = a((String)localObject1, localObject2);
        if (localObject2 == null)
        {
          localObject2 = uc;
          String str = "Param value can't be null";
          ((cu.a)localObject2).a(str, localObject1);
        }
        else
        {
          a(localBundle, (String)localObject1, localObject2);
        }
      }
    }
    return localBundle;
  }
  
  public final Bundle a(String paramString, Bundle paramBundle, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    Bundle localBundle;
    int i;
    int j;
    if (paramBundle != null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>(paramBundle);
      cf.x();
      localObject1 = paramBundle.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      i = 0;
      bool2 = localIterator.hasNext();
      if (bool2)
      {
        localObject1 = (String)localIterator.next();
        if (paramList != null)
        {
          boolean bool3 = paramList.contains(localObject1);
          if (bool3) {
            break label419;
          }
        }
        if (!paramBoolean1) {
          break label410;
        }
        j = n((String)localObject1);
        label104:
        if (j == 0) {
          j = o((String)localObject1);
        }
      }
    }
    for (;;)
    {
      Object localObject2;
      if (j != 0)
      {
        boolean bool6 = a(localBundle, j);
        if (bool6)
        {
          int n = cf.A();
          localObject2 = a((String)localObject1, n, bool1);
          String str = "_ev";
          localBundle.putString(str, (String)localObject2);
          n = 3;
          if (j == n) {
            a(localBundle, localObject1);
          }
        }
        localBundle.remove((String)localObject1);
        break;
      }
      Object localObject3 = paramBundle.get((String)localObject1);
      j = a((String)localObject1, localObject3, paramBoolean2);
      if (j != 0)
      {
        localObject2 = "_ev";
        boolean bool7 = ((String)localObject2).equals(localObject1);
        if (!bool7)
        {
          boolean bool4 = a(localBundle, j);
          if (bool4)
          {
            int k = cf.A();
            localObject3 = a((String)localObject1, k, bool1);
            localObject2 = "_ev";
            localBundle.putString((String)localObject2, (String)localObject3);
            localObject3 = paramBundle.get((String)localObject1);
            a(localBundle, localObject3);
          }
          localBundle.remove((String)localObject1);
          break;
        }
      }
      boolean bool5 = a((String)localObject1);
      if (bool5)
      {
        i += 1;
        m = 25;
        if (i > m)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(48);
          localObject3 = "Event can't contain more then 25 params";
          localObject2 = ua;
          ((cu.a)localObject2).a((String)localObject3, paramString, paramBundle);
          m = 5;
          a(localBundle, m);
          localBundle.remove((String)localObject1);
          break;
        }
      }
      bool2 = i;
      break;
      localObject1 = localBundle;
      return (Bundle)localObject1;
      label410:
      int m = 0;
      localObject3 = null;
      break label104;
      label419:
      m = 0;
      localObject3 = null;
    }
  }
  
  final Parcelable a(byte[] paramArrayOfByte, Parcelable.Creator paramCreator)
  {
    Object localObject1;
    if (paramArrayOfByte == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (Parcelable)localObject1;
      Parcel localParcel = Parcel.obtain();
      localObject1 = null;
      try
      {
        int i = paramArrayOfByte.length;
        localParcel.unmarshall(paramArrayOfByte, 0, i);
        localObject1 = null;
        localParcel.setDataPosition(0);
        localObject1 = paramCreator.createFromParcel(localParcel);
        localObject1 = (Parcelable)localObject1;
        localParcel.recycle();
      }
      catch (b.a locala)
      {
        Object localObject2 = super.u();
        localObject2 = a;
        String str = "Failed to load parcelable from buffer";
        ((cu.a)localObject2).a(str);
        localParcel.recycle();
        localObject2 = null;
      }
      finally
      {
        localParcel.recycle();
      }
    }
  }
  
  final cn a(String paramString1, Bundle paramBundle, String paramString2, long paramLong)
  {
    boolean bool = TextUtils.isEmpty(paramString1);
    Object localObject1;
    if (bool)
    {
      bool = false;
      localObject1 = null;
      return (cn)localObject1;
    }
    int i = c(paramString1);
    if (i != 0)
    {
      ua.a("Invalid conditional property event name", paramString1);
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    Object localObject2;
    if (paramBundle != null)
    {
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>(paramBundle);
    }
    for (;;)
    {
      ((Bundle)localObject2).putString("_o", paramString2);
      Object localObject3 = Collections.singletonList("_o");
      localObject1 = this;
      Object localObject4 = paramString1;
      localObject1 = a(paramString1, (Bundle)localObject2, (List)localObject3, false, false);
      localObject4 = a((Bundle)localObject1);
      localObject1 = new com/google/android/gms/b/cn;
      localObject2 = new com/google/android/gms/b/cl;
      ((cl)localObject2).<init>((Bundle)localObject4);
      localObject4 = paramString1;
      localObject3 = paramString2;
      ((cn)localObject1).<init>(paramString1, (cl)localObject2, paramString2, paramLong);
      break;
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
    }
  }
  
  protected final void a()
  {
    long l1 = 0L;
    Object localObject = new java/security/SecureRandom;
    ((SecureRandom)localObject).<init>();
    long l2 = ((SecureRandom)localObject).nextLong();
    boolean bool1 = l2 < l1;
    if (!bool1)
    {
      l2 = ((SecureRandom)localObject).nextLong();
      boolean bool2 = l2 < l1;
      if (!bool2)
      {
        localObject = uc;
        String str = "Utils falling back to Random for random id";
        ((cu.a)localObject).a(str);
      }
    }
    a.set(l2);
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    a(localBundle, paramInt1);
    boolean bool = TextUtils.isEmpty(paramString1);
    if (!bool) {
      localBundle.putString(paramString1, paramString2);
    }
    int i = 6;
    if (paramInt1 != i)
    {
      i = 7;
      if (paramInt1 != i)
      {
        i = 2;
        if (paramInt1 != i) {
          break label82;
        }
      }
    }
    String str = "_el";
    long l = paramInt2;
    localBundle.putLong(str, l);
    label82:
    cf.W();
    q.h().b("auto", "_err", localBundle);
  }
  
  public final void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    if (paramBundle == null) {}
    boolean bool;
    do
    {
      for (;;)
      {
        return;
        bool = paramObject instanceof Long;
        if (bool)
        {
          paramObject = (Long)paramObject;
          long l = ((Long)paramObject).longValue();
          paramBundle.putLong(paramString, l);
        }
        else
        {
          bool = paramObject instanceof String;
          if (bool)
          {
            str1 = String.valueOf(paramObject);
            paramBundle.putString(paramString, str1);
          }
          else
          {
            bool = paramObject instanceof Double;
            if (!bool) {
              break;
            }
            paramObject = (Double)paramObject;
            double d = ((Double)paramObject).doubleValue();
            paramBundle.putDouble(paramString, d);
          }
        }
      }
    } while (paramString == null);
    if (paramObject != null) {}
    for (String str1 = paramObject.getClass().getSimpleName();; str1 = null)
    {
      cu.a locala = ud;
      String str2 = "Not putting event parameter. Invalid value type. name, type";
      locala.a(str2, paramString, str1);
      break;
      bool = false;
    }
  }
  
  public final void a(du.c paramc, Object paramObject)
  {
    cu.a locala = null;
    com.google.android.gms.common.internal.c.a(paramObject);
    b = null;
    c = null;
    e = null;
    boolean bool = paramObject instanceof String;
    if (bool)
    {
      paramObject = (String)paramObject;
      b = ((String)paramObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Long;
      if (bool)
      {
        paramObject = (Long)paramObject;
        c = ((Long)paramObject);
      }
      else
      {
        bool = paramObject instanceof Double;
        if (bool)
        {
          paramObject = (Double)paramObject;
          e = ((Double)paramObject);
        }
        else
        {
          locala = ua;
          String str = "Ignoring invalid (type) event param value";
          locala.a(str, paramObject);
        }
      }
    }
  }
  
  public final void a(du.g paramg, Object paramObject)
  {
    cu.a locala = null;
    com.google.android.gms.common.internal.c.a(paramObject);
    c = null;
    d = null;
    f = null;
    boolean bool = paramObject instanceof String;
    if (bool)
    {
      paramObject = (String)paramObject;
      c = ((String)paramObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Long;
      if (bool)
      {
        paramObject = (Long)paramObject;
        d = ((Long)paramObject);
      }
      else
      {
        bool = paramObject instanceof Double;
        if (bool)
        {
          paramObject = (Double)paramObject;
          f = ((Double)paramObject);
        }
        else
        {
          locala = ua;
          String str = "Ignoring invalid (type) user attribute value";
          locala.a(str, paramObject);
        }
      }
    }
  }
  
  public final boolean a(long paramLong1, long paramLong2)
  {
    long l = 0L;
    boolean bool1 = true;
    boolean bool2 = paramLong1 < l;
    if (bool2)
    {
      bool2 = paramLong2 < l;
      if (bool2) {
        break label31;
      }
    }
    for (;;)
    {
      return bool1;
      label31:
      com.google.android.gms.common.util.c localc = super.m();
      l = Math.abs(localc.a() - paramLong1);
      bool2 = l < paramLong2;
      if (!bool2) {
        bool1 = false;
      }
    }
  }
  
  public final byte[] a(du.d paramd)
  {
    try
    {
      i = paramd.f();
      arrayOfByte = new byte[i];
      int j = arrayOfByte.length;
      localObject2 = fu.a(arrayOfByte, j);
      paramd.a((fu)localObject2);
      ((fu)localObject2).a();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        byte[] arrayOfByte;
        Object localObject2 = ua;
        String str = "Data loss. Failed to serialize batch";
        ((cu.a)localObject2).a(str, localIOException);
        int i = 0;
        Object localObject1 = null;
      }
    }
    return arrayOfByte;
  }
  
  public final byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      localGZIPOutputStream.<init>(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      ua.a("Failed to gzip content", localIOException);
      throw localIOException;
    }
  }
  
  public final int b(String paramString)
  {
    int i = 2;
    String str = "event";
    boolean bool = b(str, paramString);
    if (!bool) {}
    for (;;)
    {
      return i;
      str = "event";
      Map localMap = AppMeasurement.a.a;
      bool = a(str, localMap, paramString);
      if (!bool)
      {
        i = 13;
      }
      else
      {
        str = "event";
        int j = cf.y();
        bool = a(str, j, paramString);
        if (bool) {
          i = 0;
        }
      }
    }
  }
  
  public final int b(String paramString, Object paramObject)
  {
    int i = 0;
    Object localObject = "_ldl";
    boolean bool = ((String)localObject).equals(paramString);
    String str;
    int j;
    if (bool)
    {
      str = "user property referrer";
      j = p(paramString);
      localObject = this;
      bool = a(str, paramString, j, paramObject, false);
      if (!bool) {
        break label84;
      }
    }
    for (;;)
    {
      return i;
      str = "user property";
      j = p(paramString);
      localObject = this;
      bool = a(str, paramString, j, paramObject, false);
      break;
      label84:
      i = 7;
    }
  }
  
  public final byte[] b(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream;
    try
    {
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>(paramArrayOfByte);
      GZIPInputStream localGZIPInputStream = new java/util/zip/GZIPInputStream;
      localGZIPInputStream.<init>(localByteArrayInputStream);
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      int i = 1024;
      byte[] arrayOfByte = new byte[i];
      for (;;)
      {
        int j = localGZIPInputStream.read(arrayOfByte);
        if (j <= 0) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, j);
      }
      localGZIPInputStream.close();
    }
    catch (IOException localIOException)
    {
      ua.a("Failed to ungzip content", localIOException);
      throw localIOException;
    }
    localIOException.close();
    return localByteArrayOutputStream.toByteArray();
  }
  
  public final int c(String paramString)
  {
    int i = 2;
    String str = "event";
    boolean bool = c(str, paramString);
    if (!bool) {}
    for (;;)
    {
      return i;
      str = "event";
      Map localMap = AppMeasurement.a.a;
      bool = a(str, localMap, paramString);
      if (!bool)
      {
        i = 13;
      }
      else
      {
        str = "event";
        int j = cf.y();
        bool = a(str, j, paramString);
        if (bool) {
          i = 0;
        }
      }
    }
  }
  
  final long c(Context paramContext, String paramString)
  {
    long l1 = -1;
    super.e();
    com.google.android.gms.common.internal.c.a(paramContext);
    com.google.android.gms.common.internal.c.a(paramString);
    long l2 = 0L;
    Object localObject1 = paramContext.getPackageManager();
    Object localObject2 = g("MD5");
    if (localObject2 == null)
    {
      cu.a locala1 = ua;
      String str = "Could not get MD5 instance";
      locala1.a(str);
    }
    for (;;)
    {
      return l1;
      if (localObject1 != null) {
        try
        {
          boolean bool = d(paramContext, paramString);
          if (!bool)
          {
            localObject1 = bc.a(paramContext);
            Object localObject3 = super.n();
            localObject3 = ((Context)localObject3).getPackageName();
            int i = 64;
            localObject1 = ((bb)localObject1).b((String)localObject3, i);
            localObject3 = signatures;
            if (localObject3 != null)
            {
              localObject3 = signatures;
              int j = localObject3.length;
              if (j > 0)
              {
                Object localObject4 = signatures;
                locala2 = null;
                localObject4 = localObject4[0];
                localObject4 = ((Signature)localObject4).toByteArray();
                localObject4 = ((MessageDigest)localObject2).digest((byte[])localObject4);
                l1 = c((byte[])localObject4);
                continue;
              }
            }
            localObject1 = super.u();
            localObject1 = c;
            localObject2 = "Could not get signatures";
            ((cu.a)localObject1).a((String)localObject2);
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          cu.a locala2 = ua;
          localObject1 = "Package name not found";
          locala2.a((String)localObject1, localNameNotFoundException);
        }
      } else {
        l1 = l2;
      }
    }
  }
  
  public final int d(String paramString)
  {
    int i = 6;
    String str = "user property";
    boolean bool = b(str, paramString);
    if (!bool) {}
    for (;;)
    {
      return i;
      str = "user property";
      Map localMap = AppMeasurement.g.a;
      bool = a(str, localMap, paramString);
      if (!bool)
      {
        i = 15;
      }
      else
      {
        str = "user property";
        int j = cf.z();
        bool = a(str, j, paramString);
        if (bool) {
          i = 0;
        }
      }
    }
  }
  
  public final int e(String paramString)
  {
    int i = 6;
    String str = "user property";
    boolean bool = c(str, paramString);
    if (!bool) {}
    for (;;)
    {
      return i;
      str = "user property";
      Map localMap = AppMeasurement.g.a;
      bool = a(str, localMap, paramString);
      if (!bool)
      {
        i = 15;
      }
      else
      {
        str = "user property";
        int j = cf.z();
        bool = a(str, j, paramString);
        if (bool) {
          i = 0;
        }
      }
    }
  }
  
  public final boolean f(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = TextUtils.isEmpty(paramString);
    Object localObject;
    String str;
    if (bool2)
    {
      localObject = ua;
      str = "Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI";
      ((cu.a)localObject).a(str);
    }
    for (;;)
    {
      return bool1;
      com.google.android.gms.common.internal.c.a(paramString);
      localObject = "^1:\\d+:android:[a-f0-9]+$";
      bool2 = paramString.matches((String)localObject);
      if (!bool2)
      {
        localObject = ua;
        str = "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id";
        ((cu.a)localObject).a(str, paramString);
      }
      else
      {
        bool1 = true;
      }
    }
  }
  
  public final boolean h(String paramString)
  {
    super.e();
    Object localObject = bc.a(super.n());
    int i = ((bb)localObject).a(paramString);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      localObject = uf;
      String str = "Permission not granted";
      ((cu.a)localObject).a(str, paramString);
      int j = 0;
      localObject = null;
    }
  }
  
  public final boolean j(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    String str;
    if (bool)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      str = super.w().au();
      cf.W();
      bool = str.equals(paramString);
    }
  }
  
  final boolean l(String paramString)
  {
    String str = super.r().a(paramString, "measurement.upload.blacklist_internal");
    return "1".equals(str);
  }
  
  final boolean m(String paramString)
  {
    String str = super.r().a(paramString, "measurement.upload.blacklist_public");
    return "1".equals(str);
  }
  
  public final long x()
  {
    Object localObject1 = a;
    long l1 = ((AtomicLong)localObject1).get();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (;;)
    {
      long l3;
      long l4;
      synchronized (a)
      {
        localObject1 = new java/util/Random;
        l3 = System.nanoTime();
        com.google.android.gms.common.util.c localc = super.m();
        l4 = localc.a();
        l3 ^= l4;
        ((Random)localObject1).<init>(l3);
        l1 = ((Random)localObject1).nextLong();
        int i = b + 1;
        b = i;
        l3 = i;
        l1 += l3;
        return l1;
      }
      synchronized (a)
      {
        AtomicLong localAtomicLong1 = a;
        l3 = -1;
        l4 = 1L;
        localAtomicLong1.compareAndSet(l3, l4);
        localAtomicLong1 = a;
        l1 = localAtomicLong1.getAndIncrement();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/dr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */