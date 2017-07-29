package com.google.android.gms.b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.overlay.e;
import com.google.android.gms.ads.internal.w;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class ml
  implements md
{
  private final mf a;
  private final f b;
  private final ot c;
  
  public ml(mf parammf, f paramf, ot paramot)
  {
    a = parammf;
    b = paramf;
    c = paramot;
  }
  
  private void a(boolean paramBoolean)
  {
    ot localot = c;
    if (localot != null)
    {
      localot = c;
      localot.a(paramBoolean);
    }
  }
  
  private static boolean a(Map paramMap)
  {
    Object localObject = paramMap.get("custom_close");
    return "1".equals(localObject);
  }
  
  private static int b(Map paramMap)
  {
    Object localObject = (String)paramMap.get("o");
    String str;
    boolean bool1;
    int i;
    if (localObject != null)
    {
      str = "p";
      bool1 = str.equalsIgnoreCase((String)localObject);
      if (bool1)
      {
        localObject = w.g();
        i = ((tu)localObject).b();
      }
    }
    for (;;)
    {
      return i;
      str = "l";
      bool1 = str.equalsIgnoreCase((String)localObject);
      if (bool1)
      {
        localObject = w.g();
        i = ((tu)localObject).a();
      }
      else
      {
        str = "c";
        boolean bool2 = str.equalsIgnoreCase((String)localObject);
        int j;
        if (bool2)
        {
          localObject = w.g();
          j = ((tu)localObject).c();
        }
        else
        {
          j = -1;
        }
      }
    }
  }
  
  public final void a(vc paramvc, Map paramMap)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = (String)paramMap.get("a");
    if (localObject2 == null)
    {
      localObject2 = "Action missing from an open GMSG.";
      tp.e((String)localObject2);
    }
    Object localObject3;
    vd localvd;
    boolean bool1;
    for (;;)
    {
      return;
      localObject3 = b;
      if (localObject3 != null)
      {
        localObject3 = b;
        bool3 = ((f)localObject3).a();
        if (!bool3)
        {
          localObject3 = b;
          localObject2 = (String)paramMap.get("u");
          ((f)localObject3).a((String)localObject2);
          continue;
        }
      }
      localvd = paramvc.l();
      localObject3 = "expand";
      boolean bool3 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
      if (bool3)
      {
        bool5 = paramvc.p();
        if (bool5)
        {
          localObject2 = "Cannot expand WebView that is already expanded.";
          tp.e((String)localObject2);
        }
        else
        {
          a(false);
          bool5 = a(paramMap);
          int k = b(paramMap);
          localvd.a(bool5, k);
        }
      }
      else
      {
        localObject3 = "webapp";
        boolean bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
        boolean bool2;
        if (bool4)
        {
          localObject2 = (String)paramMap.get("u");
          a(false);
          if (localObject2 != null)
          {
            bool4 = a(paramMap);
            j = b(paramMap);
            localvd.a(bool4, j, (String)localObject2);
          }
          else
          {
            bool2 = a(paramMap);
            i = b(paramMap);
            localObject2 = (String)paramMap.get("html");
            localObject3 = (String)paramMap.get("baseurl");
            localvd.a(bool2, i, (String)localObject2, (String)localObject3);
          }
        }
        else
        {
          localObject3 = "in_app_purchase";
          bool4 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
          Object localObject4;
          if (bool4)
          {
            localObject2 = (String)paramMap.get("product_id");
            localObject3 = (String)paramMap.get("report_urls");
            localObject1 = a;
            if (localObject1 != null)
            {
              if (localObject3 != null)
              {
                bool2 = ((String)localObject3).isEmpty();
                if (!bool2)
                {
                  localObject3 = ((String)localObject3).split(" ");
                  localObject1 = a;
                  localObject4 = new java/util/ArrayList;
                  localObject3 = Arrays.asList((Object[])localObject3);
                  ((ArrayList)localObject4).<init>((Collection)localObject3);
                  ((mf)localObject1).a((String)localObject2, (ArrayList)localObject4);
                  continue;
                }
              }
              localObject3 = a;
              localObject1 = new java/util/ArrayList;
              ((ArrayList)localObject1).<init>();
              ((mf)localObject3).a((String)localObject2, (ArrayList)localObject1);
            }
          }
          else
          {
            localObject3 = "app";
            bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
            if (bool5)
            {
              localObject3 = "true";
              localObject2 = (String)paramMap.get("system_browser");
              bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject2);
              if (bool5)
              {
                a(i);
                localObject3 = paramvc.getContext();
                localObject2 = (String)paramMap.get("u");
                bool5 = TextUtils.isEmpty((CharSequence)localObject2);
                if (bool5)
                {
                  localObject2 = "Destination url cannot be empty.";
                  tp.e((String)localObject2);
                  continue;
                }
                localObject2 = paramvc.l();
                localObject1 = new com/google/android/gms/b/ml$a;
                ((ml.a)localObject1).<init>(paramvc);
                localObject3 = ((ml.a)localObject1).a((Context)localObject3, paramMap);
                try
                {
                  localObject1 = new com/google/android/gms/ads/internal/overlay/e;
                  ((e)localObject1).<init>((Intent)localObject3);
                  ((vd)localObject2).a((e)localObject1);
                }
                catch (ActivityNotFoundException localActivityNotFoundException)
                {
                  localObject2 = localActivityNotFoundException.getMessage();
                  tp.e((String)localObject2);
                }
                continue;
              }
            }
            a(i);
            localObject2 = (String)paramMap.get("intent_url");
            localObject3 = (String)paramMap.get("u");
            bool2 = false;
            localObject1 = null;
            bool1 = TextUtils.isEmpty((CharSequence)localObject2);
            if (bool1) {
              break label808;
            }
            bool1 = false;
            localObject4 = null;
            try
            {
              localObject2 = Intent.parseUri((String)localObject2, 0);
              localObject4 = localObject2;
              if (localObject4 != null)
              {
                localObject2 = ((Intent)localObject4).getData();
                if (localObject2 != null)
                {
                  localObject1 = ((Intent)localObject4).getData();
                  localObject2 = ((Uri)localObject1).toString();
                  boolean bool6 = TextUtils.isEmpty((CharSequence)localObject2);
                  if (bool6) {
                    break label872;
                  }
                  w.e();
                  localObject2 = tt.a(paramvc, (String)localObject2);
                }
              }
            }
            catch (URISyntaxException localURISyntaxException)
            {
              try
              {
                localObject2 = Uri.parse((String)localObject2);
                ((Intent)localObject4).setData((Uri)localObject2);
                if (localObject4 == null) {
                  break label894;
                }
                localObject2 = new com/google/android/gms/ads/internal/overlay/e;
                ((e)localObject2).<init>((Intent)localObject4);
                localvd.a((e)localObject2);
              }
              catch (Exception localException)
              {
                String str2;
                int m;
                str4 = "Error parsing the uri: ";
                localObject2 = String.valueOf(localObject2);
                int n = ((String)localObject2).length();
                if (n == 0) {
                  break label879;
                }
              }
              localURISyntaxException = localURISyntaxException;
              str2 = "Error parsing the url: ";
              localObject2 = String.valueOf(localObject2);
              m = ((String)localObject2).length();
              if (m == 0) {
                break label816;
              }
            }
          }
        }
      }
    }
    localObject2 = str2.concat((String)localObject2);
    label808:
    String str1;
    for (;;)
    {
      tp.b((String)localObject2, localURISyntaxException);
      bool1 = false;
      str1 = null;
      break;
      label816:
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>(str2);
    }
    String str4;
    localObject2 = str4.concat((String)localObject2);
    for (;;)
    {
      tp.b((String)localObject2, localException);
      label872:
      localObject2 = localObject1;
      break;
      label879:
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>(str4);
    }
    label894:
    boolean bool5 = TextUtils.isEmpty((CharSequence)localObject3);
    if (!bool5) {
      w.e();
    }
    for (localObject1 = tt.a(paramvc, (String)localObject3);; localObject1 = localObject3)
    {
      localObject2 = new com/google/android/gms/ads/internal/overlay/e;
      localObject3 = (String)paramMap.get("i");
      str1 = (String)paramMap.get("m");
      String str3 = (String)paramMap.get("p");
      str4 = (String)paramMap.get("c");
      String str5 = (String)paramMap.get("f");
      String str6 = (String)paramMap.get("e");
      ((e)localObject2).<init>((String)localObject3, (String)localObject1, str1, str3, str4, str5, str6);
      localvd.a((e)localObject2);
      break;
    }
  }
}


/* Location:              com/google/android/gms/b/ml.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */