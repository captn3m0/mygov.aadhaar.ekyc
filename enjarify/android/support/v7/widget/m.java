package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.a.a.g;
import android.support.v4.g.c;
import android.support.v4.g.f;
import android.support.v4.g.l;
import android.support.v7.a.a.a;
import android.support.v7.a.a.c;
import android.support.v7.a.a.e;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class m
{
  private static final PorterDuff.Mode c;
  private static m d;
  private static final m.b e;
  private static final int[] f;
  private static final int[] g;
  private static final int[] h;
  private static final int[] i;
  private static final int[] j;
  private static final int[] k;
  public final Object a;
  public final WeakHashMap b;
  private WeakHashMap l;
  private android.support.v4.g.a m;
  private l n;
  private TypedValue o;
  private boolean p;
  
  static
  {
    int i1 = 4;
    int i2 = 3;
    int i3 = 2;
    int i4 = 1;
    c = PorterDuff.Mode.SRC_IN;
    Object localObject = new android/support/v7/widget/m$b;
    ((m.b)localObject).<init>();
    e = (m.b)localObject;
    localObject = new int[i2];
    int i5 = a.e.abc_textfield_search_default_mtrl_alpha;
    localObject[0] = i5;
    i5 = a.e.abc_textfield_default_mtrl_alpha;
    localObject[i4] = i5;
    i5 = a.e.abc_ab_share_pack_mtrl_alpha;
    localObject[i3] = i5;
    f = (int[])localObject;
    localObject = new int[7];
    i5 = a.e.abc_ic_commit_search_api_mtrl_alpha;
    localObject[0] = i5;
    i5 = a.e.abc_seekbar_tick_mark_material;
    localObject[i4] = i5;
    i5 = a.e.abc_ic_menu_share_mtrl_alpha;
    localObject[i3] = i5;
    i5 = a.e.abc_ic_menu_copy_mtrl_am_alpha;
    localObject[i2] = i5;
    i5 = a.e.abc_ic_menu_cut_mtrl_alpha;
    localObject[i1] = i5;
    int i6 = a.e.abc_ic_menu_selectall_mtrl_alpha;
    localObject[5] = i6;
    i6 = a.e.abc_ic_menu_paste_mtrl_am_alpha;
    localObject[6] = i6;
    g = (int[])localObject;
    localObject = new int[10];
    i5 = a.e.abc_textfield_activated_mtrl_alpha;
    localObject[0] = i5;
    i5 = a.e.abc_textfield_search_activated_mtrl_alpha;
    localObject[i4] = i5;
    i5 = a.e.abc_cab_background_top_mtrl_alpha;
    localObject[i3] = i5;
    i5 = a.e.abc_text_cursor_material;
    localObject[i2] = i5;
    i5 = a.e.abc_text_select_handle_left_mtrl_dark;
    localObject[i1] = i5;
    i6 = a.e.abc_text_select_handle_middle_mtrl_dark;
    localObject[5] = i6;
    i6 = a.e.abc_text_select_handle_right_mtrl_dark;
    localObject[6] = i6;
    i6 = a.e.abc_text_select_handle_left_mtrl_light;
    localObject[7] = i6;
    i6 = a.e.abc_text_select_handle_middle_mtrl_light;
    localObject[8] = i6;
    i6 = a.e.abc_text_select_handle_right_mtrl_light;
    localObject[9] = i6;
    h = (int[])localObject;
    localObject = new int[i2];
    i5 = a.e.abc_popup_background_mtrl_mult;
    localObject[0] = i5;
    i5 = a.e.abc_cab_background_internal_bg;
    localObject[i4] = i5;
    i5 = a.e.abc_menu_hardkey_panel_mtrl_mult;
    localObject[i3] = i5;
    i = (int[])localObject;
    localObject = new int[i3];
    i5 = a.e.abc_tab_indicator_material;
    localObject[0] = i5;
    i5 = a.e.abc_textfield_search_material;
    localObject[i4] = i5;
    j = (int[])localObject;
    localObject = new int[i3];
    i5 = a.e.abc_btn_check_material;
    localObject[0] = i5;
    i5 = a.e.abc_btn_radio_material;
    localObject[i4] = i5;
    k = (int[])localObject;
  }
  
  public m()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>(0);
    b = ((WeakHashMap)localObject);
  }
  
  private static long a(TypedValue paramTypedValue)
  {
    long l1 = assetCookie << 32;
    long l2 = data;
    return l1 | l2;
  }
  
  private static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    Object localObject1 = e;
    int i1 = m.b.a(paramInt, paramMode);
    Object localObject2 = Integer.valueOf(i1);
    localObject1 = (PorterDuffColorFilter)((m.b)localObject1).a(localObject2);
    if (localObject1 == null)
    {
      localObject1 = new android/graphics/PorterDuffColorFilter;
      ((PorterDuffColorFilter)localObject1).<init>(paramInt, paramMode);
      localObject2 = e;
      int i2 = m.b.a(paramInt, paramMode);
      Integer localInteger = Integer.valueOf(i2);
      ((m.b)localObject2).a(localInteger, localObject1);
    }
    return (PorterDuffColorFilter)localObject1;
  }
  
  private Drawable a(Context paramContext, long paramLong)
  {
    for (;;)
    {
      synchronized (a)
      {
        Object localObject2 = b;
        localObject2 = ((WeakHashMap)localObject2).get(paramContext);
        localObject2 = (f)localObject2;
        if (localObject2 == null)
        {
          localObject2 = null;
          return (Drawable)localObject2;
        }
        localObject5 = ((f)localObject2).a(paramLong);
        localObject5 = (WeakReference)localObject5;
        if (localObject5 == null) {
          break label196;
        }
        localObject5 = ((WeakReference)localObject5).get();
        localObject5 = (Drawable.ConstantState)localObject5;
        if (localObject5 != null)
        {
          localObject2 = paramContext.getResources();
          localObject2 = ((Drawable.ConstantState)localObject5).newDrawable((Resources)localObject2);
        }
      }
      Object localObject5 = c;
      int i1 = e;
      int i2 = c.a((long[])localObject5, i1, paramLong);
      if (i2 >= 0)
      {
        Object localObject6 = d;
        localObject6 = localObject6[i2];
        Object localObject7 = f.a;
        if (localObject6 != localObject7)
        {
          localObject6 = d;
          localObject7 = f.a;
          localObject6[i2] = localObject7;
          i2 = 1;
          b = i2;
        }
      }
      label196:
      Object localObject4 = null;
    }
  }
  
  public static m a()
  {
    m localm = d;
    if (localm == null)
    {
      localm = new android/support/v7/widget/m;
      localm.<init>();
      d = localm;
      int i1 = Build.VERSION.SDK_INT;
      int i2 = 24;
      if (i1 < i2)
      {
        String str = "vector";
        Object localObject = new android/support/v7/widget/m$d;
        ((m.d)localObject).<init>();
        localm.a(str, (m.c)localObject);
        i1 = Build.VERSION.SDK_INT;
        i2 = 11;
        if (i1 >= i2)
        {
          str = "animated-vector";
          localObject = new android/support/v7/widget/m$a;
          ((m.a)localObject).<init>();
          localm.a(str, (m.c)localObject);
        }
      }
    }
    return d;
  }
  
  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    boolean bool = ag.b(paramDrawable);
    if (bool) {
      paramDrawable = paramDrawable.mutate();
    }
    if (paramMode == null) {
      paramMode = c;
    }
    PorterDuffColorFilter localPorterDuffColorFilter = a(paramInt, paramMode);
    paramDrawable.setColorFilter(localPorterDuffColorFilter);
  }
  
  static void a(Drawable paramDrawable, bd parambd, int[] paramArrayOfInt)
  {
    int i1 = 0;
    Object localObject1 = null;
    boolean bool1 = ag.b(paramDrawable);
    Object localObject2;
    if (bool1)
    {
      localObject2 = paramDrawable.mutate();
      if (localObject2 != paramDrawable)
      {
        localObject2 = "AppCompatDrawableManager";
        localObject1 = "Mutated drawable is not the same instance as the input.";
        Log.d((String)localObject2, (String)localObject1);
        return;
      }
    }
    bool1 = d;
    label86:
    PorterDuff.Mode localMode;
    if (!bool1)
    {
      bool1 = c;
      if (!bool1) {}
    }
    else
    {
      bool1 = d;
      if (bool1)
      {
        localObject2 = a;
        boolean bool2 = c;
        if (!bool2) {
          break label149;
        }
        localMode = b;
        label103:
        if ((localObject2 != null) && (localMode != null)) {
          break label157;
        }
        label113:
        paramDrawable.setColorFilter((ColorFilter)localObject1);
      }
    }
    for (;;)
    {
      int i2 = Build.VERSION.SDK_INT;
      i1 = 23;
      if (i2 > i1) {
        break;
      }
      paramDrawable.invalidateSelf();
      break;
      i2 = 0;
      localObject2 = null;
      break label86;
      label149:
      localMode = c;
      break label103;
      label157:
      i1 = 0;
      i2 = ((ColorStateList)localObject2).getColorForState(paramArrayOfInt, 0);
      localObject1 = a(i2, localMode);
      break label113;
      paramDrawable.clearColorFilter();
    }
  }
  
  private void a(String paramString, m.c paramc)
  {
    android.support.v4.g.a locala = m;
    if (locala == null)
    {
      locala = new android/support/v4/g/a;
      locala.<init>();
      m = locala;
    }
    m.put(paramString, paramc);
  }
  
  static boolean a(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    int i1 = 16842801;
    float f1 = 2.3693695E-38F;
    int i2 = -1;
    float f2 = 0.0F / 0.0F;
    boolean bool1 = false;
    PorterDuffColorFilter localPorterDuffColorFilter = null;
    boolean bool2 = true;
    PorterDuff.Mode localMode = c;
    Object localObject1 = f;
    boolean bool3 = a((int[])localObject1, paramInt);
    int i4;
    Object localObject2;
    boolean bool6;
    if (bool3)
    {
      i4 = a.a.colorControlNormal;
      localObject2 = localMode;
      bool6 = bool2;
      i1 = i2;
      f1 = f2;
    }
    for (;;)
    {
      if (bool6)
      {
        bool1 = ag.b(paramDrawable);
        if (bool1) {
          paramDrawable = paramDrawable.mutate();
        }
        int i3 = bb.a(paramContext, i4);
        localPorterDuffColorFilter = a(i3, (PorterDuff.Mode)localObject2);
        paramDrawable.setColorFilter(localPorterDuffColorFilter);
        if (i1 != i2) {
          paramDrawable.setAlpha(i1);
        }
      }
      for (;;)
      {
        return bool2;
        localObject1 = h;
        boolean bool4 = a((int[])localObject1, paramInt);
        if (bool4)
        {
          int i5 = a.a.colorControlActivated;
          localObject2 = localMode;
          bool6 = bool2;
          i1 = i2;
          f1 = f2;
          break;
        }
        localObject1 = i;
        boolean bool5 = a((int[])localObject1, paramInt);
        if (bool5)
        {
          localObject1 = PorterDuff.Mode.MULTIPLY;
          bool6 = bool2;
          localObject2 = localObject1;
          bool5 = i1;
          i1 = i2;
          f1 = f2;
          break;
        }
        i6 = a.e.abc_list_divider_mtrl_alpha;
        if (paramInt == i6)
        {
          i6 = 16842800;
          f1 = 40.8F;
          i1 = Math.round(f1);
          localObject2 = localMode;
          bool6 = bool2;
          break;
        }
        i6 = a.e.abc_dialog_material_background;
        if (paramInt != i6) {
          break label288;
        }
        i6 = i1;
        localObject2 = localMode;
        bool6 = bool2;
        i1 = i2;
        f1 = f2;
        break;
        bool2 = false;
      }
      label288:
      i1 = i2;
      f1 = f2;
      int i6 = 0;
      localObject1 = null;
      localObject2 = localMode;
      bool6 = false;
      localMode = null;
    }
  }
  
  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
    if (localConstantState != null) {}
    for (;;)
    {
      synchronized (a)
      {
        Object localObject2 = b;
        localObject2 = ((WeakHashMap)localObject2).get(paramContext);
        localObject2 = (f)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new android/support/v4/g/f;
          ((f)localObject2).<init>();
          localObject5 = b;
          ((WeakHashMap)localObject5).put(paramContext, localObject2);
        }
        Object localObject5 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject5).<init>(localConstantState);
        ((f)localObject2).a(paramLong, localObject5);
        bool = true;
        return bool;
      }
      boolean bool = false;
      Object localObject4 = null;
    }
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool = false;
    int i1 = paramArrayOfInt.length;
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1)
      {
        int i3 = paramArrayOfInt[i2];
        if (i3 == paramInt) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      i2 += 1;
    }
  }
  
  private static ColorStateList c(Context paramContext, int paramInt)
  {
    int i1 = 4;
    int i2 = 3;
    int i3 = 2;
    int i4 = 1;
    int[][] arrayOfInt = new int[i1][];
    int[] arrayOfInt1 = new int[i1];
    int i5 = a.a.colorControlHighlight;
    i5 = bb.a(paramContext, i5);
    int i6 = a.a.colorButtonNormal;
    i6 = bb.c(paramContext, i6);
    int[] arrayOfInt2 = bb.a;
    arrayOfInt[0] = arrayOfInt2;
    arrayOfInt1[0] = i6;
    int[] arrayOfInt3 = bb.d;
    arrayOfInt[i4] = arrayOfInt3;
    i6 = android.support.v4.d.a.a(i5, paramInt);
    arrayOfInt1[i4] = i6;
    arrayOfInt3 = bb.b;
    arrayOfInt[i3] = arrayOfInt3;
    i5 = android.support.v4.d.a.a(i5, paramInt);
    arrayOfInt1[i3] = i5;
    Object localObject = bb.h;
    arrayOfInt[i2] = localObject;
    arrayOfInt1[i2] = paramInt;
    localObject = new android/content/res/ColorStateList;
    ((ColorStateList)localObject).<init>(arrayOfInt, arrayOfInt1);
    return (ColorStateList)localObject;
  }
  
  final Drawable a(Context paramContext, int paramInt)
  {
    Object localObject1 = null;
    int i1 = 2;
    int i2 = 1;
    Object localObject2 = m;
    Object localObject4;
    if (localObject2 != null)
    {
      localObject2 = m;
      boolean bool1 = ((android.support.v4.g.a)localObject2).isEmpty();
      if (!bool1)
      {
        localObject2 = n;
        if (localObject2 != null)
        {
          localObject2 = (String)n.a(paramInt);
          localObject4 = "appcompat_skip_skip";
          boolean bool2 = ((String)localObject4).equals(localObject2);
          if (!bool2)
          {
            if (localObject2 == null) {
              break label130;
            }
            localObject4 = m;
            localObject2 = ((android.support.v4.g.a)localObject4).get(localObject2);
            if (localObject2 != null) {
              break label130;
            }
          }
          bool1 = false;
          localObject2 = null;
        }
      }
    }
    for (;;)
    {
      return (Drawable)localObject2;
      localObject2 = new android/support/v4/g/l;
      ((l)localObject2).<init>();
      n = ((l)localObject2);
      label130:
      localObject2 = o;
      if (localObject2 == null)
      {
        localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        o = ((TypedValue)localObject2);
      }
      localObject4 = o;
      localObject2 = paramContext.getResources();
      ((Resources)localObject2).getValue(paramInt, (TypedValue)localObject4, i2);
      long l1 = a((TypedValue)localObject4);
      localObject1 = a(paramContext, l1);
      if (localObject1 != null)
      {
        localObject2 = localObject1;
      }
      else
      {
        Object localObject5 = string;
        Object localObject6;
        if (localObject5 != null)
        {
          localObject5 = string.toString();
          localObject6 = ".xml";
          boolean bool3 = ((String)localObject5).endsWith((String)localObject6);
          if (bool3) {
            try
            {
              localObject5 = ((Resources)localObject2).getXml(paramInt);
              localObject6 = Xml.asAttributeSet((XmlPullParser)localObject5);
              int i3;
              do
              {
                i3 = ((XmlPullParser)localObject5).next();
              } while ((i3 != i1) && (i3 != i2));
              if (i3 != i1)
              {
                localObject2 = new org/xmlpull/v1/XmlPullParserException;
                localObject4 = "No start tag found";
                ((XmlPullParserException)localObject2).<init>((String)localObject4);
                throw ((Throwable)localObject2);
              }
            }
            catch (Exception localException)
            {
              localObject4 = "AppCompatDrawableManager";
              localObject5 = "Exception while inflating drawable";
              Log.e((String)localObject4, (String)localObject5, localException);
            }
          }
        }
        for (Object localObject3 = localObject1;; localObject3 = localObject1)
        {
          if (localObject3 != null) {
            break label463;
          }
          localObject1 = n;
          localObject4 = "appcompat_skip_skip";
          ((l)localObject1).b(paramInt, localObject4);
          break;
          localObject3 = ((XmlPullParser)localObject5).getName();
          Object localObject7 = n;
          ((l)localObject7).b(paramInt, localObject3);
          localObject7 = m;
          localObject3 = ((android.support.v4.g.a)localObject7).get(localObject3);
          localObject3 = (m.c)localObject3;
          if (localObject3 != null)
          {
            localObject7 = paramContext.getTheme();
            localObject1 = ((m.c)localObject3).a(paramContext, (XmlPullParser)localObject5, (AttributeSet)localObject6, (Resources.Theme)localObject7);
          }
          if (localObject1 != null)
          {
            i4 = changingConfigurations;
            ((Drawable)localObject1).setChangingConfigurations(i4);
            a(paramContext, l1, (Drawable)localObject1);
          }
        }
        label463:
        continue;
        int i4 = 0;
        localObject3 = null;
      }
    }
  }
  
  public final Drawable a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    int i1 = 0;
    Drawable localDrawable1 = null;
    boolean bool2 = p;
    Object localObject2;
    if (!bool2)
    {
      p = bool1;
      int i2 = a.e.abc_vector_test;
      localObject1 = a(paramContext, i2, false);
      boolean bool3;
      if (localObject1 != null)
      {
        boolean bool4 = localObject1 instanceof g;
        if (!bool4)
        {
          localObject2 = "android.graphics.drawable.VectorDrawable";
          localObject1 = localObject1.getClass().getName();
          bool3 = ((String)localObject2).equals(localObject1);
          if (!bool3) {
            break label117;
          }
        }
        bool3 = bool1;
      }
      while (!bool3)
      {
        p = false;
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        throw ((Throwable)localObject1);
        label117:
        bool3 = false;
        localObject1 = null;
      }
    }
    Object localObject1 = a(paramContext, paramInt);
    if (localObject1 == null)
    {
      localObject1 = o;
      if (localObject1 == null)
      {
        localObject1 = new android/util/TypedValue;
        ((TypedValue)localObject1).<init>();
        o = ((TypedValue)localObject1);
      }
      localObject2 = o;
      paramContext.getResources().getValue(paramInt, (TypedValue)localObject2, bool1);
      long l1 = a((TypedValue)localObject2);
      localObject1 = a(paramContext, l1);
      if (localObject1 == null)
      {
        int i3 = a.e.abc_cab_background_top_material;
        if (paramInt == i3)
        {
          localObject1 = new android/graphics/drawable/LayerDrawable;
          i3 = 2;
          Drawable[] arrayOfDrawable = new Drawable[i3];
          int i4 = a.e.abc_cab_background_internal_bg;
          Drawable localDrawable2 = a(paramContext, i4, false);
          arrayOfDrawable[0] = localDrawable2;
          i4 = a.e.abc_cab_background_top_mtrl_alpha;
          localDrawable1 = a(paramContext, i4, false);
          arrayOfDrawable[bool1] = localDrawable1;
          ((LayerDrawable)localObject1).<init>(arrayOfDrawable);
        }
        if (localObject1 != null)
        {
          i1 = changingConfigurations;
          ((Drawable)localObject1).setChangingConfigurations(i1);
          a(paramContext, l1, (Drawable)localObject1);
        }
      }
    }
    if (localObject1 == null) {
      localObject1 = android.support.v4.c.a.a(paramContext, paramInt);
    }
    if (localObject1 != null) {
      localObject1 = a(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
    }
    if (localObject1 != null) {
      ag.a((Drawable)localObject1);
    }
    return (Drawable)localObject1;
  }
  
  final Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject1 = null;
    int i1 = 16908303;
    int i2 = 16908301;
    int i3 = 16908288;
    Object localObject2 = b(paramContext, paramInt);
    int i4;
    int i6;
    if (localObject2 != null)
    {
      i4 = ag.b(paramDrawable);
      if (i4 != 0) {
        paramDrawable = paramDrawable.mutate();
      }
      paramDrawable = android.support.v4.d.a.a.f(paramDrawable);
      android.support.v4.d.a.a.a(paramDrawable, (ColorStateList)localObject2);
      i6 = a.e.abc_switch_thumb_material;
      if (paramInt == i6) {
        localObject1 = PorterDuff.Mode.MULTIPLY;
      }
      if (localObject1 != null) {
        android.support.v4.d.a.a.a(paramDrawable, (PorterDuff.Mode)localObject1);
      }
    }
    for (;;)
    {
      return paramDrawable;
      i6 = a.e.abc_seekbar_track_material;
      int i5;
      PorterDuff.Mode localMode1;
      PorterDuff.Mode localMode2;
      if (paramInt == i6)
      {
        localObject1 = paramDrawable;
        localObject1 = (LayerDrawable)paramDrawable;
        localObject2 = ((LayerDrawable)localObject1).findDrawableByLayerId(i4);
        i5 = a.a.colorControlNormal;
        i5 = bb.a(paramContext, i5);
        localMode1 = c;
        a((Drawable)localObject2, i5, localMode1);
        localObject2 = ((LayerDrawable)localObject1).findDrawableByLayerId(i1);
        i5 = a.a.colorControlNormal;
        i5 = bb.a(paramContext, i5);
        localMode1 = c;
        a((Drawable)localObject2, i5, localMode1);
        localObject1 = ((LayerDrawable)localObject1).findDrawableByLayerId(i2);
        i6 = a.a.colorControlActivated;
        i6 = bb.a(paramContext, i6);
        localMode2 = c;
        a((Drawable)localObject1, i6, localMode2);
      }
      else
      {
        i6 = a.e.abc_ratingbar_material;
        if (paramInt != i6)
        {
          i6 = a.e.abc_ratingbar_indicator_material;
          if (paramInt != i6)
          {
            i6 = a.e.abc_ratingbar_small_material;
            if (paramInt != i6) {
              break label383;
            }
          }
        }
        localObject1 = paramDrawable;
        localObject1 = (LayerDrawable)paramDrawable;
        localObject2 = ((LayerDrawable)localObject1).findDrawableByLayerId(i5);
        i5 = a.a.colorControlNormal;
        i5 = bb.c(paramContext, i5);
        localMode1 = c;
        a((Drawable)localObject2, i5, localMode1);
        localObject2 = ((LayerDrawable)localObject1).findDrawableByLayerId(i1);
        i5 = a.a.colorControlActivated;
        i5 = bb.a(paramContext, i5);
        localMode1 = c;
        a((Drawable)localObject2, i5, localMode1);
        localObject1 = ((LayerDrawable)localObject1).findDrawableByLayerId(i2);
        i6 = a.a.colorControlActivated;
        i6 = bb.a(paramContext, i6);
        localMode2 = c;
        a((Drawable)localObject1, i6, localMode2);
        continue;
        label383:
        boolean bool = a(paramContext, paramInt, paramDrawable);
        if ((!bool) && (paramBoolean)) {
          paramDrawable = null;
        }
      }
    }
  }
  
  final ColorStateList b(Context paramContext, int paramInt)
  {
    int i1 = 0;
    Object localObject1 = null;
    Object localObject2 = l;
    int i3;
    if (localObject2 != null)
    {
      localObject2 = (l)l.get(paramContext);
      if (localObject2 != null)
      {
        localObject2 = (ColorStateList)((l)localObject2).a(paramInt);
        if (localObject2 == null)
        {
          i1 = a.e.abc_edit_text_material;
          if (paramInt != i1) {
            break label180;
          }
          i3 = a.c.abc_tint_edittext;
          localObject1 = b.a(paramContext, i3);
        }
      }
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject2 = l;
        if (localObject2 == null)
        {
          localObject2 = new java/util/WeakHashMap;
          ((WeakHashMap)localObject2).<init>();
          l = ((WeakHashMap)localObject2);
        }
        localObject2 = (l)l.get(paramContext);
        if (localObject2 == null)
        {
          localObject2 = new android/support/v4/g/l;
          ((l)localObject2).<init>();
          WeakHashMap localWeakHashMap = l;
          localWeakHashMap.put(paramContext, localObject2);
        }
        ((l)localObject2).b(paramInt, localObject1);
      }
      localObject2 = localObject1;
      return (ColorStateList)localObject2;
      i3 = 0;
      localObject2 = null;
      break;
      i3 = 0;
      localObject2 = null;
      break;
      label180:
      i1 = a.e.abc_switch_track_mtrl_alpha;
      if (paramInt == i1)
      {
        i3 = a.c.abc_tint_switch_track;
        localObject1 = b.a(paramContext, i3);
      }
      else
      {
        i1 = a.e.abc_switch_thumb_material;
        if (paramInt == i1)
        {
          i3 = a.c.abc_tint_switch_thumb;
          localObject1 = b.a(paramContext, i3);
        }
        else
        {
          i1 = a.e.abc_btn_default_mtrl_shape;
          if (paramInt == i1)
          {
            i3 = a.a.colorButtonNormal;
            i3 = bb.a(paramContext, i3);
            localObject1 = c(paramContext, i3);
          }
          else
          {
            i1 = a.e.abc_btn_borderless_material;
            if (paramInt == i1)
            {
              i3 = 0;
              localObject2 = null;
              localObject1 = c(paramContext, 0);
            }
            else
            {
              i1 = a.e.abc_btn_colored_material;
              if (paramInt == i1)
              {
                i3 = a.a.colorAccent;
                i3 = bb.a(paramContext, i3);
                localObject1 = c(paramContext, i3);
              }
              else
              {
                i1 = a.e.abc_spinner_mtrl_am_alpha;
                if (paramInt != i1)
                {
                  i1 = a.e.abc_spinner_textfield_background_material;
                  if (paramInt != i1) {}
                }
                else
                {
                  i3 = a.c.abc_tint_spinner;
                  localObject1 = b.a(paramContext, i3);
                  continue;
                }
                localObject1 = g;
                boolean bool = a((int[])localObject1, paramInt);
                if (bool)
                {
                  i3 = a.a.colorControlNormal;
                  localObject1 = bb.b(paramContext, i3);
                }
                else
                {
                  localObject1 = j;
                  bool = a((int[])localObject1, paramInt);
                  if (bool)
                  {
                    i3 = a.c.abc_tint_default;
                    localObject1 = b.a(paramContext, i3);
                  }
                  else
                  {
                    localObject1 = k;
                    bool = a((int[])localObject1, paramInt);
                    if (bool)
                    {
                      i3 = a.c.abc_tint_btn_checkable;
                      localObject1 = b.a(paramContext, i3);
                    }
                    else
                    {
                      int i2 = a.e.abc_seekbar_thumb_material;
                      if (paramInt == i2)
                      {
                        i3 = a.c.abc_tint_seek_thumb;
                        localObject1 = b.a(paramContext, i3);
                      }
                      else
                      {
                        localObject1 = localObject2;
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


/* Location:              android/support/v7/widget/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */