package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.o;

public class tu$d
  extends tu.f
{
  public final Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    if (paramBoolean)
    {
      float f = 0.0F;
      localObject1 = null;
      boolean bool = paramFloat < 0.0F;
      if (bool)
      {
        f = 25.0F;
        bool = paramFloat < f;
        if (!bool) {
          break label59;
        }
      }
    }
    Object localObject1 = new android/graphics/drawable/BitmapDrawable;
    Object localObject2 = paramContext.getResources();
    ((BitmapDrawable)localObject1).<init>((Resources)localObject2, paramBitmap);
    for (;;)
    {
      return (Drawable)localObject1;
      try
      {
        label59:
        int i = paramBitmap.getWidth();
        int j = paramBitmap.getHeight();
        Object localObject3 = null;
        localObject1 = Bitmap.createScaledBitmap(paramBitmap, i, j, false);
        localObject2 = Bitmap.createBitmap((Bitmap)localObject1);
        localObject3 = RenderScript.create(paramContext);
        Object localObject4 = Element.U8_4((RenderScript)localObject3);
        localObject4 = ScriptIntrinsicBlur.create((RenderScript)localObject3, (Element)localObject4);
        localObject1 = Allocation.createFromBitmap((RenderScript)localObject3, (Bitmap)localObject1);
        localObject3 = Allocation.createFromBitmap((RenderScript)localObject3, (Bitmap)localObject2);
        ((ScriptIntrinsicBlur)localObject4).setRadius(paramFloat);
        ((ScriptIntrinsicBlur)localObject4).setInput((Allocation)localObject1);
        ((ScriptIntrinsicBlur)localObject4).forEach((Allocation)localObject3);
        ((Allocation)localObject3).copyTo((Bitmap)localObject2);
        localObject1 = new android/graphics/drawable/BitmapDrawable;
        localObject3 = paramContext.getResources();
        ((BitmapDrawable)localObject1).<init>((Resources)localObject3, (Bitmap)localObject2);
      }
      catch (RuntimeException localRuntimeException)
      {
        BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
        localObject2 = paramContext.getResources();
        localBitmapDrawable.<init>((Resources)localObject2, paramBitmap);
      }
    }
  }
  
  public final String a(Context paramContext)
  {
    ui localui = ui.a();
    Object localObject = a;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool)
    {
      localObject = o.f(paramContext);
      ui.1 local1 = new com/google/android/gms/b/ui$1;
      local1.<init>((Context)localObject, paramContext);
      localObject = (String)uh.a(local1);
      a = ((String)localObject);
    }
    return a;
  }
  
  public final boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    super.a(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
    return true;
  }
  
  public final void b(Context paramContext)
  {
    ui localui = ui.a();
    tp.a("Updating user agent.");
    String str1 = WebSettings.getDefaultUserAgent(paramContext);
    Object localObject = a;
    boolean bool = str1.equals(localObject);
    if (!bool)
    {
      localObject = o.f(paramContext);
      if (localObject == null)
      {
        localObject = WebSettings.getDefaultUserAgent(paramContext);
        SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("admob_user_agent", 0).edit();
        String str2 = "user_agent";
        localObject = localEditor.putString(str2, (String)localObject);
        ((SharedPreferences.Editor)localObject).apply();
      }
      a = str1;
    }
    tp.a("User agent is updated.");
    w.i().s();
  }
}


/* Location:              com/google/android/gms/b/tu$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */