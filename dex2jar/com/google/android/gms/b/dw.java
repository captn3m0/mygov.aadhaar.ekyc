package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.MotionEvent;
import android.view.View;

public final class dw
{
  static final String[] d = { "/aclk", "/pcs/click" };
  String a = "googleads.g.doubleclick.net";
  String b = "/pagead/ads";
  String[] c = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  public bv e;
  private String f = "ad.doubleclick.net";
  
  public dw(bv parambv)
  {
    e = parambv;
  }
  
  private boolean c(Uri paramUri)
  {
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      boolean bool = paramUri.getHost().equals(f);
      return bool;
    }
    catch (NullPointerException paramUri) {}
    return false;
  }
  
  public final Uri a(Uri paramUri, Context paramContext, View paramView)
  {
    try
    {
      paramUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true, paramView);
      return paramUri;
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new dx("Provided Uri is not in a valid state");
    }
  }
  
  final Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean, View paramView)
  {
    boolean bool;
    try
    {
      bool = c(paramUri);
      if (bool)
      {
        if (!paramUri.toString().contains("dc_ms=")) {
          break label64;
        }
        throw new dx("Parameter already exists: dc_ms");
      }
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new dx("Provided Uri is not in a valid state");
    }
    if (paramUri.getQueryParameter("ms") != null) {
      throw new dx("Query parameter already exists: ms");
    }
    label64:
    if (paramBoolean) {
      paramContext = e.a(paramContext, paramString, paramView);
    }
    while (bool)
    {
      paramString = paramUri.toString();
      i = paramString.indexOf(";adurl");
      if (i != -1)
      {
        return Uri.parse(paramString.substring(0, i + 1) + "dc_ms" + "=" + paramContext + ";" + paramString.substring(i + 1));
        paramContext = e.a(paramContext);
      }
      else
      {
        paramUri = paramUri.getEncodedPath();
        i = paramString.indexOf(paramUri);
        return Uri.parse(paramString.substring(0, paramUri.length() + i) + ";" + "dc_ms" + "=" + paramContext + ";" + paramString.substring(paramUri.length() + i));
      }
    }
    paramString = paramUri.toString();
    int j = paramString.indexOf("&adurl");
    int i = j;
    if (j == -1) {
      i = paramString.indexOf("?adurl");
    }
    if (i != -1) {
      return Uri.parse(paramString.substring(0, i + 1) + "ms" + "=" + paramContext + "&" + paramString.substring(i + 1));
    }
    paramUri = paramUri.buildUpon().appendQueryParameter("ms", paramContext).build();
    return paramUri;
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    e.a(paramMotionEvent);
  }
  
  public final boolean a(Uri paramUri)
  {
    boolean bool2 = false;
    if (paramUri == null) {
      throw new NullPointerException();
    }
    boolean bool1 = bool2;
    try
    {
      if (paramUri.getHost().equals(a))
      {
        boolean bool3 = paramUri.getPath().equals(b);
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (NullPointerException paramUri) {}
    return false;
  }
  
  public final boolean b(Uri paramUri)
  {
    boolean bool2 = false;
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      paramUri = paramUri.getHost();
      String[] arrayOfString = c;
      int j = arrayOfString.length;
      int i = 0;
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          bool1 = paramUri.endsWith(arrayOfString[i]);
          if (bool1) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
        i += 1;
      }
      return false;
    }
    catch (NullPointerException paramUri) {}
  }
}


/* Location:              com/google/android/gms/b/dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */