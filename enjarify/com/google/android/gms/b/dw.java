package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;
import android.view.View;

public final class dw
{
  static final String[] d;
  String a = "googleads.g.doubleclick.net";
  String b = "/pagead/ads";
  String[] c;
  public bv e;
  private String f = "ad.doubleclick.net";
  
  static
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "/aclk";
    arrayOfString[1] = "/pcs/click";
    d = arrayOfString;
  }
  
  public dw(bv parambv)
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = ".doubleclick.net";
    arrayOfString[1] = ".googleadservices.com";
    arrayOfString[2] = ".googlesyndication.com";
    c = arrayOfString;
    e = parambv;
  }
  
  private boolean c(Uri paramUri)
  {
    Object localObject1;
    if (paramUri == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    try
    {
      localObject1 = paramUri.getHost();
      String str = f;
      bool = ((String)localObject1).equals(str);
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  public final Uri a(Uri paramUri, Context paramContext, View paramView)
  {
    Object localObject = "ai";
    try
    {
      String str = paramUri.getQueryParameter((String)localObject);
      boolean bool = true;
      localObject = this;
      return a(paramUri, paramContext, str, bool, paramView);
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      dx localdx = new com/google/android/gms/b/dx;
      localdx.<init>("Provided Uri is not in a valid state");
      throw localdx;
    }
  }
  
  final Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean, View paramView)
  {
    int i = -1;
    boolean bool1;
    Object localObject3;
    try
    {
      bool1 = c(paramUri);
      if (bool1)
      {
        Object localObject1 = paramUri.toString();
        localObject3 = "dc_ms=";
        boolean bool2 = ((String)localObject1).contains((CharSequence)localObject3);
        if (!bool2) {
          break label111;
        }
        localObject1 = new com/google/android/gms/b/dx;
        localObject3 = "Parameter already exists: dc_ms";
        ((dx)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      localObject2 = new com/google/android/gms/b/dx;
      ((dx)localObject2).<init>("Provided Uri is not in a valid state");
      throw ((Throwable)localObject2);
    }
    Object localObject2 = "ms";
    localObject2 = paramUri.getQueryParameter((String)localObject2);
    if (localObject2 != null)
    {
      localObject2 = new com/google/android/gms/b/dx;
      localObject3 = "Query parameter already exists: ms";
      ((dx)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    label111:
    Object localObject4;
    String str1;
    Object localObject5;
    Object localObject6;
    int m;
    int n;
    if (paramBoolean)
    {
      localObject2 = e;
      localObject2 = ((bv)localObject2).a(paramContext, paramString, paramView);
      localObject3 = localObject2;
      if (!bool1) {
        break label468;
      }
      localObject2 = "dc_ms";
      localObject4 = paramUri.toString();
      str1 = ";adurl";
      int k = ((String)localObject4).indexOf(str1);
      if (k == i) {
        break label313;
      }
      localObject5 = new java/lang/StringBuilder;
      localObject6 = null;
      m = k + 1;
      localObject6 = ((String)localObject4).substring(0, m);
      ((StringBuilder)localObject5).<init>((String)localObject6);
      localObject2 = ((StringBuilder)localObject5).append((String)localObject2);
      localObject5 = "=";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject3 = ";";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      n = k + 1;
      localObject3 = ((String)localObject4).substring(n);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject2 = Uri.parse((String)localObject2);
    }
    for (;;)
    {
      return (Uri)localObject2;
      localObject2 = e;
      localObject2 = ((bv)localObject2).a(paramContext);
      localObject3 = localObject2;
      break;
      label313:
      str1 = paramUri.getEncodedPath();
      i = ((String)localObject4).indexOf(str1);
      localObject6 = new java/lang/StringBuilder;
      m = 0;
      String str2 = null;
      int i1 = str1.length() + i;
      str2 = ((String)localObject4).substring(0, i1);
      ((StringBuilder)localObject6).<init>(str2);
      str2 = ";";
      localObject6 = ((StringBuilder)localObject6).append(str2);
      localObject2 = ((StringBuilder)localObject6).append((String)localObject2);
      localObject6 = "=";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject6);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject3 = ";";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      n = str1.length() + i;
      localObject3 = ((String)localObject4).substring(n);
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject2 = Uri.parse((String)localObject2);
      continue;
      label468:
      localObject4 = "ms";
      str1 = paramUri.toString();
      localObject2 = "&adurl";
      int j = str1.indexOf((String)localObject2);
      if (j == i)
      {
        localObject2 = "?adurl";
        j = str1.indexOf((String)localObject2);
      }
      if (j != i)
      {
        localObject5 = new java/lang/StringBuilder;
        localObject6 = null;
        m = j + 1;
        localObject6 = str1.substring(0, m);
        ((StringBuilder)localObject5).<init>((String)localObject6);
        localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
        localObject5 = "=";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
        localObject4 = "&";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        j += 1;
        localObject2 = str1.substring(j);
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject2 = Uri.parse((String)localObject2);
      }
      else
      {
        localObject2 = paramUri.buildUpon();
        localObject2 = ((Uri.Builder)localObject2).appendQueryParameter((String)localObject4, (String)localObject3);
        localObject2 = ((Uri.Builder)localObject2).build();
      }
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    e.a(paramMotionEvent);
  }
  
  public final boolean a(Uri paramUri)
  {
    boolean bool1 = false;
    NullPointerException localNullPointerException1 = null;
    if (paramUri == null)
    {
      localNullPointerException1 = new java/lang/NullPointerException;
      localNullPointerException1.<init>();
      throw localNullPointerException1;
    }
    try
    {
      String str1 = paramUri.getHost();
      String str2 = a;
      boolean bool2 = str1.equals(str2);
      if (bool2)
      {
        str1 = paramUri.getPath();
        str2 = b;
        bool2 = str1.equals(str2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
    catch (NullPointerException localNullPointerException2)
    {
      for (;;) {}
    }
    return bool1;
  }
  
  public final boolean b(Uri paramUri)
  {
    boolean bool1 = false;
    NullPointerException localNullPointerException1 = null;
    if (paramUri == null)
    {
      localNullPointerException1 = new java/lang/NullPointerException;
      localNullPointerException1.<init>();
      throw localNullPointerException1;
    }
    for (;;)
    {
      try
      {
        String str1 = paramUri.getHost();
        String[] arrayOfString = c;
        int i = arrayOfString.length;
        j = 0;
        if (j < i)
        {
          String str2 = arrayOfString[j];
          boolean bool2 = str1.endsWith(str2);
          if (!bool2) {
            continue;
          }
          bool1 = true;
        }
      }
      catch (NullPointerException localNullPointerException2)
      {
        int j;
        continue;
      }
      return bool1;
      j += 1;
    }
  }
}


/* Location:              com/google/android/gms/b/dw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */