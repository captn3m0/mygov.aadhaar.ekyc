package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.x;
import android.support.v4.h.aa;
import android.support.v4.h.ae;
import android.support.v4.h.s;
import android.support.v7.a.a.a;
import android.support.v7.a.a.c;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.i;
import android.support.v7.a.a.j;
import android.support.v7.view.b;
import android.support.v7.view.d;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ab;
import android.support.v7.widget.ad;
import android.support.v7.widget.ai;
import android.support.v7.widget.ai.a;
import android.support.v7.widget.bc;
import android.support.v7.widget.bh;
import android.support.v7.widget.bk;
import android.support.v7.widget.g;
import android.support.v7.widget.i;
import android.support.v7.widget.j;
import android.support.v7.widget.n;
import android.support.v7.widget.r;
import android.support.v7.widget.u;
import android.support.v7.widget.v;
import android.support.v7.widget.y;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

class m
  extends h
  implements android.support.v4.h.k, h.a
{
  private static final boolean p;
  private m.e A;
  private boolean B;
  private TextView C;
  private View D;
  private boolean E;
  private boolean F;
  private boolean G;
  private m.d[] H;
  private m.d I;
  private boolean J;
  private final Runnable K;
  private boolean L;
  private Rect M;
  private Rect N;
  private o O;
  b q;
  ActionBarContextView r;
  PopupWindow s;
  Runnable t;
  ae u = null;
  ViewGroup v;
  boolean w;
  int x;
  private ad y;
  private m.a z;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i < j) {}
    for (i = 1;; i = 0)
    {
      p = i;
      return;
    }
  }
  
  m(Context paramContext, Window paramWindow, f paramf)
  {
    super(paramContext, paramWindow, paramf);
    m.1 local1 = new android/support/v7/app/m$1;
    local1.<init>(this);
    K = local1;
  }
  
  private void a(m.d paramd, KeyEvent paramKeyEvent)
  {
    int i = -1;
    int j = -2;
    int k = 0;
    int m = 1;
    boolean bool1 = o;
    if (!bool1)
    {
      bool1 = o;
      if (!bool1) {
        break label35;
      }
    }
    label35:
    Object localObject1;
    int i3;
    label86:
    label179:
    label188:
    label195:
    label197:
    Object localObject4;
    label406:
    int i1;
    do
    {
      boolean bool2;
      do
      {
        do
        {
          for (;;)
          {
            return;
            int n = a;
            int i4;
            if (n == 0)
            {
              localObject1 = b;
              localObject2 = ((Context)localObject1).getResources().getConfiguration();
              n = screenLayout & 0xF;
              i3 = 4;
              if (n != i3) {
                break label179;
              }
              n = m;
              localObject1 = ((Context)localObject1).getApplicationInfo();
              i4 = targetSdkVersion;
              i3 = 11;
              if (i4 < i3) {
                break label188;
              }
              i4 = m;
            }
            for (;;)
            {
              if ((n != 0) && (i4 != 0)) {
                break label195;
              }
              localObject2 = c.getCallback();
              if (localObject2 == null) {
                break label197;
              }
              i4 = a;
              localObject3 = j;
              bool2 = ((Window.Callback)localObject2).onMenuOpened(i4, (Menu)localObject3);
              if (bool2) {
                break label197;
              }
              a(paramd, m);
              break;
              bool2 = false;
              localObject2 = null;
              break label86;
              i4 = 0;
              localObject1 = null;
            }
          }
          localObject2 = b;
          localObject1 = "window";
          localObject2 = ((Context)localObject2).getSystemService((String)localObject1);
          localObject4 = localObject2;
          localObject4 = (WindowManager)localObject2;
        } while (localObject4 == null);
        bool2 = b(paramd, paramKeyEvent);
      } while (!bool2);
      localObject2 = g;
      if (localObject2 != null)
      {
        bool2 = q;
        if (!bool2) {
          break label1143;
        }
      }
      localObject2 = g;
      if (localObject2 != null) {
        break label865;
      }
      localObject2 = n();
      localObject5 = new android/util/TypedValue;
      ((TypedValue)localObject5).<init>();
      localObject1 = ((Context)localObject2).getResources().newTheme();
      Object localObject3 = ((Context)localObject2).getTheme();
      ((Resources.Theme)localObject1).setTo((Resources.Theme)localObject3);
      i3 = a.a.actionBarPopupTheme;
      ((Resources.Theme)localObject1).resolveAttribute(i3, (TypedValue)localObject5, m);
      i3 = resourceId;
      if (i3 != 0)
      {
        i3 = resourceId;
        ((Resources.Theme)localObject1).applyStyle(i3, m);
      }
      i3 = a.a.panelMenuListTheme;
      ((Resources.Theme)localObject1).resolveAttribute(i3, (TypedValue)localObject5, m);
      i3 = resourceId;
      if (i3 == 0) {
        break;
      }
      i = resourceId;
      ((Resources.Theme)localObject1).applyStyle(i, m);
      localObject5 = new android/support/v7/view/d;
      ((d)localObject5).<init>((Context)localObject2, 0);
      ((Context)localObject5).getTheme().setTo((Resources.Theme)localObject1);
      l = ((Context)localObject5);
      localObject2 = a.j.AppCompatTheme;
      localObject2 = ((Context)localObject5).obtainStyledAttributes((int[])localObject2);
      i = a.j.AppCompatTheme_panelBackground;
      i = ((TypedArray)localObject2).getResourceId(i, 0);
      b = i;
      i = a.j.AppCompatTheme_android_windowAnimationStyle;
      i = ((TypedArray)localObject2).getResourceId(i, 0);
      f = i;
      ((TypedArray)localObject2).recycle();
      localObject2 = new android/support/v7/app/m$c;
      localObject5 = l;
      ((m.c)localObject2).<init>(this, (Context)localObject5);
      g = ((ViewGroup)localObject2);
      i1 = 81;
      c = i1;
      localObject2 = g;
    } while (localObject2 == null);
    label534:
    Object localObject2 = i;
    if (localObject2 != null)
    {
      localObject2 = i;
      h = ((View)localObject2);
      i1 = m;
      label561:
      if (i1 == 0) {
        break label1102;
      }
      localObject2 = h;
      if (localObject2 == null) {
        break label1134;
      }
      localObject2 = i;
      if (localObject2 == null) {
        break label1104;
      }
      i1 = m;
      label592:
      if (i1 == 0) {
        break label1141;
      }
      localObject2 = h.getLayoutParams();
      if (localObject2 != null) {
        break label1187;
      }
      localObject2 = new android/view/ViewGroup$LayoutParams;
      ((ViewGroup.LayoutParams)localObject2).<init>(j, j);
    }
    label865:
    label1095:
    label1102:
    label1104:
    label1134:
    label1141:
    label1143:
    label1187:
    for (Object localObject5 = localObject2;; localObject5 = localObject2)
    {
      i1 = b;
      localObject1 = g;
      ((ViewGroup)localObject1).setBackgroundResource(i1);
      localObject2 = h.getParent();
      if (localObject2 != null)
      {
        boolean bool4 = localObject2 instanceof ViewGroup;
        if (bool4)
        {
          localObject2 = (ViewGroup)localObject2;
          localObject1 = h;
          ((ViewGroup)localObject2).removeView((View)localObject1);
        }
      }
      localObject2 = g;
      localObject1 = h;
      ((ViewGroup)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)localObject5);
      localObject2 = h;
      boolean bool3 = ((View)localObject2).hasFocus();
      if (!bool3)
      {
        localObject2 = h;
        ((View)localObject2).requestFocus();
      }
      i = j;
      for (;;)
      {
        n = false;
        localObject2 = new android/view/WindowManager$LayoutParams;
        k = d;
        int i5 = e;
        i3 = 1002;
        int i6 = 8519680;
        int i7 = -3;
        ((WindowManager.LayoutParams)localObject2).<init>(i, j, k, i5, i3, i6, i7);
        i = c;
        gravity = i;
        i = f;
        windowAnimations = i;
        localObject5 = g;
        ((WindowManager)localObject4).addView((View)localObject5, (ViewGroup.LayoutParams)localObject2);
        o = m;
        break;
        i = a.i.Theme_AppCompat_CompactMenu;
        ((Resources.Theme)localObject1).applyStyle(i, m);
        break label406;
        bool3 = q;
        if (!bool3) {
          break label534;
        }
        localObject2 = g;
        int i2 = ((ViewGroup)localObject2).getChildCount();
        if (i2 <= 0) {
          break label534;
        }
        localObject2 = g;
        ((ViewGroup)localObject2).removeAllViews();
        break label534;
        localObject2 = j;
        if (localObject2 != null)
        {
          localObject2 = A;
          if (localObject2 == null)
          {
            localObject2 = new android/support/v7/app/m$e;
            ((m.e)localObject2).<init>(this);
            A = ((m.e)localObject2);
          }
          localObject2 = A;
          localObject5 = j;
          if (localObject5 == null) {
            i2 = 0;
          }
          for (localObject2 = null;; localObject2 = ((android.support.v7.view.menu.f)localObject2).a((ViewGroup)localObject5))
          {
            localObject2 = (View)localObject2;
            h = ((View)localObject2);
            localObject2 = h;
            if (localObject2 == null) {
              break label1095;
            }
            i2 = m;
            break;
            localObject5 = k;
            if (localObject5 == null)
            {
              localObject5 = new android/support/v7/view/menu/f;
              localObject1 = l;
              i3 = a.g.abc_list_menu_item_layout;
              ((android.support.v7.view.menu.f)localObject5).<init>((Context)localObject1, i3);
              k = ((android.support.v7.view.menu.f)localObject5);
              k.h = ((o.a)localObject2);
              localObject2 = j;
              localObject5 = k;
              ((android.support.v7.view.menu.h)localObject2).a((android.support.v7.view.menu.o)localObject5);
            }
            localObject2 = k;
            localObject5 = g;
          }
        }
        i2 = 0;
        localObject2 = null;
        break label561;
        break;
        localObject2 = k.d();
        i2 = ((ListAdapter)localObject2).getCount();
        if (i2 > 0)
        {
          i2 = m;
          break label592;
        }
        i2 = 0;
        localObject2 = null;
        break label592;
        break;
        localObject2 = i;
        if (localObject2 != null)
        {
          localObject2 = i.getLayoutParams();
          if (localObject2 != null)
          {
            i2 = width;
            if (i2 == i) {
              continue;
            }
          }
        }
        i = j;
      }
    }
  }
  
  private boolean a(m.d paramd, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    android.support.v7.view.menu.h localh1 = null;
    int i = paramKeyEvent.isSystem();
    if (i != 0) {}
    for (;;)
    {
      return bool;
      i = m;
      if (i == 0)
      {
        i = b(paramd, paramKeyEvent);
        if (i == 0) {}
      }
      else
      {
        android.support.v7.view.menu.h localh2 = j;
        if (localh2 != null)
        {
          localh1 = j;
          i = 1;
          bool = localh1.performShortcut(paramInt, paramKeyEvent, i);
        }
      }
    }
  }
  
  private boolean b(m.d paramd, KeyEvent paramKeyEvent)
  {
    int i = 108;
    boolean bool1 = false;
    int j = 1;
    boolean bool2 = false;
    boolean bool3 = o;
    if (bool3) {}
    for (;;)
    {
      return bool2;
      bool3 = m;
      if (!bool3) {
        break;
      }
      bool2 = j;
    }
    Object localObject1 = I;
    if (localObject1 != null)
    {
      localObject1 = I;
      if (localObject1 != paramd)
      {
        localObject1 = I;
        a((m.d)localObject1, false);
      }
    }
    localObject1 = c;
    Window.Callback localCallback = ((Window)localObject1).getCallback();
    if (localCallback != null)
    {
      k = a;
      localObject1 = localCallback.onCreatePanelView(k);
      i = ((View)localObject1);
    }
    int k = a;
    int i3;
    label148:
    Object localObject2;
    int m;
    Object localObject3;
    Resources.Theme localTheme;
    if (k != 0)
    {
      k = a;
      if (k != i) {}
    }
    else
    {
      i3 = j;
      if (i3 != 0)
      {
        localObject1 = y;
        if (localObject1 != null)
        {
          localObject1 = y;
          ((ad)localObject1).g();
        }
      }
      localObject1 = i;
      if (localObject1 != null) {
        break label892;
      }
      boolean bool4;
      if (i3 != 0)
      {
        localObject1 = g;
        bool4 = localObject1 instanceof q;
        if (bool4) {
          break label892;
        }
      }
      localObject1 = j;
      if (localObject1 != null)
      {
        bool4 = r;
        if (!bool4) {
          break label696;
        }
      }
      localObject1 = j;
      if (localObject1 == null)
      {
        localObject2 = b;
        m = a;
        if (m != 0)
        {
          m = a;
          if (m != i) {
            break label930;
          }
        }
        localObject1 = y;
        if (localObject1 == null) {
          break label930;
        }
        localObject3 = new android/util/TypedValue;
        ((TypedValue)localObject3).<init>();
        localTheme = ((Context)localObject2).getTheme();
        m = a.a.actionBarTheme;
        localTheme.resolveAttribute(m, (TypedValue)localObject3, j);
        m = resourceId;
        if (m == 0) {
          break label665;
        }
        localObject1 = ((Context)localObject2).getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        int i5 = resourceId;
        ((Resources.Theme)localObject1).applyStyle(i5, j);
        i5 = a.a.actionBarWidgetTheme;
        ((Resources.Theme)localObject1).resolveAttribute(i5, (TypedValue)localObject3, j);
        label380:
        i5 = resourceId;
        if (i5 != 0)
        {
          if (localObject1 == null)
          {
            localObject1 = ((Context)localObject2).getResources().newTheme();
            ((Resources.Theme)localObject1).setTo(localTheme);
          }
          i = resourceId;
          ((Resources.Theme)localObject1).applyStyle(i, j);
        }
        localObject3 = localObject1;
        if (localObject1 == null) {
          break label930;
        }
        localObject1 = new android/support/v7/view/d;
        ((d)localObject1).<init>((Context)localObject2, 0);
        localObject2 = ((Context)localObject1).getTheme();
        ((Resources.Theme)localObject2).setTo((Resources.Theme)localObject3);
      }
    }
    for (;;)
    {
      localObject2 = new android/support/v7/view/menu/h;
      ((android.support.v7.view.menu.h)localObject2).<init>((Context)localObject1);
      ((android.support.v7.view.menu.h)localObject2).a(this);
      paramd.a((android.support.v7.view.menu.h)localObject2);
      localObject1 = j;
      if (localObject1 == null) {
        break;
      }
      if (i3 != 0)
      {
        localObject1 = y;
        if (localObject1 != null)
        {
          localObject1 = z;
          if (localObject1 == null)
          {
            localObject1 = new android/support/v7/app/m$a;
            ((m.a)localObject1).<init>(this);
            z = ((m.a)localObject1);
          }
          localObject1 = y;
          localObject2 = j;
          localObject3 = z;
          ((ad)localObject1).a((Menu)localObject2, (o.a)localObject3);
        }
      }
      localObject1 = j;
      ((android.support.v7.view.menu.h)localObject1).d();
      m = a;
      localObject2 = j;
      boolean bool5 = localCallback.onCreatePanelMenu(m, (Menu)localObject2);
      int i4;
      if (!bool5)
      {
        paramd.a(null);
        if (i3 == 0) {
          break;
        }
        localObject1 = y;
        if (localObject1 == null) {
          break;
        }
        localObject1 = y;
        localObject2 = z;
        ((ad)localObject1).a(null, (o.a)localObject2);
        break;
        i4 = 0;
        break label148;
        label665:
        int n = a.a.actionBarWidgetTheme;
        localTheme.resolveAttribute(n, (TypedValue)localObject3, j);
        n = 0;
        localObject1 = null;
        break label380;
      }
      r = false;
      label696:
      j.d();
      localObject1 = s;
      if (localObject1 != null)
      {
        localObject1 = j;
        localObject2 = s;
        ((android.support.v7.view.menu.h)localObject1).c((Bundle)localObject2);
        s = null;
      }
      localObject1 = i;
      localObject2 = j;
      boolean bool6 = localCallback.onPreparePanel(0, (View)localObject1, (Menu)localObject2);
      if (!bool6)
      {
        if (i4 != 0)
        {
          localObject1 = y;
          if (localObject1 != null)
          {
            localObject1 = y;
            localObject2 = z;
            ((ad)localObject1).a(null, (o.a)localObject2);
          }
        }
        localObject1 = j;
        ((android.support.v7.view.menu.h)localObject1).e();
        break;
      }
      int i1;
      if (paramKeyEvent != null)
      {
        i1 = paramKeyEvent.getDeviceId();
        label831:
        localObject1 = KeyCharacterMap.load(i1);
        i1 = ((KeyCharacterMap)localObject1).getKeyboardType();
        if (i1 == j) {
          break label921;
        }
        i1 = j;
      }
      for (;;)
      {
        p = i1;
        localObject1 = j;
        bool1 = p;
        ((android.support.v7.view.menu.h)localObject1).setQwertyMode(bool1);
        localObject1 = j;
        ((android.support.v7.view.menu.h)localObject1).e();
        label892:
        m = j;
        n = false;
        I = paramd;
        bool2 = j;
        break;
        int i2 = -1;
        break label831;
        label921:
        i2 = 0;
        localObject1 = null;
      }
      label930:
      localObject1 = localObject2;
    }
  }
  
  private void f(int paramInt)
  {
    int i = 1;
    int j = x;
    int k = i << paramInt;
    j |= k;
    x = j;
    boolean bool = w;
    if (!bool)
    {
      View localView = c.getDecorView();
      Runnable localRunnable = K;
      android.support.v4.h.w.a(localView, localRunnable);
      w = i;
    }
  }
  
  private void s()
  {
    int i = 108;
    int j = 16908290;
    int k = 1;
    int m = 0;
    TypedValue localTypedValue = null;
    boolean bool1 = B;
    Object localObject1;
    Object localObject2;
    int i6;
    Object localObject3;
    if (!bool1)
    {
      localObject1 = b;
      localObject2 = a.j.AppCompatTheme;
      localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject2);
      int i1 = a.j.AppCompatTheme_windowActionBar;
      boolean bool3 = ((TypedArray)localObject1).hasValue(i1);
      if (!bool3)
      {
        ((TypedArray)localObject1).recycle();
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        throw ((Throwable)localObject1);
      }
      int i2 = a.j.AppCompatTheme_windowNoTitle;
      boolean bool4 = ((TypedArray)localObject1).getBoolean(i2, false);
      if (bool4)
      {
        c(k);
        int i3 = a.j.AppCompatTheme_windowActionBarOverlay;
        boolean bool5 = ((TypedArray)localObject1).getBoolean(i3, false);
        if (bool5)
        {
          i4 = 109;
          c(i4);
        }
        int i4 = a.j.AppCompatTheme_windowActionModeOverlay;
        boolean bool6 = ((TypedArray)localObject1).getBoolean(i4, false);
        if (bool6)
        {
          i5 = 10;
          c(i5);
        }
        int i5 = a.j.AppCompatTheme_android_windowIsFloating;
        boolean bool7 = ((TypedArray)localObject1).getBoolean(i5, false);
        l = bool7;
        ((TypedArray)localObject1).recycle();
        c.getDecorView();
        localObject1 = LayoutInflater.from(b);
        bool7 = this.m;
        if (bool7) {
          break label702;
        }
        bool7 = l;
        if (!bool7) {
          break label441;
        }
        i6 = a.g.abc_dialog_title_material;
        localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i6, null);
        this.j = false;
        this.i = false;
        localObject3 = localObject1;
      }
    }
    for (;;)
    {
      label441:
      int i10;
      if (localObject3 == null)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("AppCompat does not support the current theme features: { windowActionBar: ");
        boolean bool12 = this.i;
        localObject2 = ((StringBuilder)localObject2).append(bool12).append(", windowActionBarOverlay: ");
        bool12 = this.j;
        localObject2 = ((StringBuilder)localObject2).append(bool12).append(", android:windowIsFloating: ");
        bool12 = l;
        localObject2 = ((StringBuilder)localObject2).append(bool12).append(", windowActionModeOverlay: ");
        bool12 = this.k;
        localObject2 = ((StringBuilder)localObject2).append(bool12).append(", windowNoTitle: ");
        bool12 = this.m;
        localObject2 = bool12 + " }";
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        i6 = a.j.AppCompatTheme_windowActionBar;
        boolean bool8 = ((TypedArray)localObject1).getBoolean(i6, false);
        if (!bool8) {
          break;
        }
        c(i);
        break;
        bool1 = this.i;
        if (!bool1) {
          break label1447;
        }
        localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        localObject1 = b.getTheme();
        i10 = a.a.actionBarTheme;
        ((Resources.Theme)localObject1).resolveAttribute(i10, (TypedValue)localObject2, k);
        n = resourceId;
        int i7;
        if (n != 0)
        {
          localObject1 = new android/support/v7/view/d;
          localObject3 = b;
          i7 = resourceId;
          ((d)localObject1).<init>((Context)localObject3, i7);
        }
        for (;;)
        {
          localObject1 = LayoutInflater.from((Context)localObject1);
          i7 = a.g.abc_screen_toolbar;
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i7, null);
          i7 = a.f.decor_content_parent;
          localObject2 = (ad)((ViewGroup)localObject1).findViewById(i7);
          y = ((ad)localObject2);
          localObject2 = y;
          localObject3 = c.getCallback();
          ((ad)localObject2).setWindowCallback((Window.Callback)localObject3);
          bool9 = this.j;
          if (bool9)
          {
            localObject2 = y;
            i10 = 109;
            ((ad)localObject2).a(i10);
          }
          bool9 = E;
          if (bool9)
          {
            localObject2 = y;
            i10 = 2;
            ((ad)localObject2).a(i10);
          }
          bool9 = F;
          if (bool9)
          {
            localObject2 = y;
            i10 = 5;
            ((ad)localObject2).a(i10);
          }
          localObject3 = localObject1;
          break;
          localObject1 = b;
        }
        label702:
        boolean bool9 = this.k;
        int i8;
        if (bool9)
        {
          i8 = a.g.abc_screen_simple_overlay_action_mode;
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i8, null);
        }
        for (localObject2 = localObject1;; localObject2 = localObject1)
        {
          n = Build.VERSION.SDK_INT;
          i10 = 21;
          if (n < i10) {
            break label801;
          }
          localObject1 = new android/support/v7/app/m$2;
          ((m.2)localObject1).<init>(this);
          android.support.v4.h.w.a((View)localObject2, (s)localObject1);
          localObject3 = localObject2;
          break;
          i8 = a.g.abc_screen_simple;
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i8, null);
        }
        label801:
        localObject1 = localObject2;
        localObject1 = (ai)localObject2;
        localObject3 = new android/support/v7/app/m$3;
        ((m.3)localObject3).<init>(this);
        ((ai)localObject1).setOnFitSystemWindowsListener((ai.a)localObject3);
        localObject3 = localObject2;
        continue;
      }
      localObject1 = y;
      if (localObject1 == null)
      {
        n = a.f.title;
        localObject1 = (TextView)((ViewGroup)localObject3).findViewById(n);
        C = ((TextView)localObject1);
      }
      bk.b((View)localObject3);
      int n = a.f.action_bar_activity_content;
      localObject1 = (ContentFrameLayout)((ViewGroup)localObject3).findViewById(n);
      localObject2 = (ViewGroup)c.findViewById(j);
      if (localObject2 != null)
      {
        for (;;)
        {
          int i15 = ((ViewGroup)localObject2).getChildCount();
          if (i15 <= 0) {
            break;
          }
          View localView = ((ViewGroup)localObject2).getChildAt(0);
          ((ViewGroup)localObject2).removeViewAt(0);
          ((ContentFrameLayout)localObject1).addView(localView);
        }
        ((ViewGroup)localObject2).setId(-1);
        ((ContentFrameLayout)localObject1).setId(j);
        boolean bool17 = localObject2 instanceof FrameLayout;
        if (bool17)
        {
          localObject2 = (FrameLayout)localObject2;
          ((FrameLayout)localObject2).setForeground(null);
        }
      }
      c.setContentView((View)localObject3);
      localObject2 = new android/support/v7/app/m$4;
      ((m.4)localObject2).<init>(this);
      ((ContentFrameLayout)localObject1).setAttachListener((ContentFrameLayout.a)localObject2);
      v = ((ViewGroup)localObject3);
      localObject1 = d;
      boolean bool2 = localObject1 instanceof Activity;
      if (bool2) {}
      for (localObject1 = ((Activity)d).getTitle();; localObject1 = this.n)
      {
        boolean bool10 = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool10) {
          b((CharSequence)localObject1);
        }
        localObject1 = (ContentFrameLayout)v.findViewById(j);
        localObject2 = c.getDecorView();
        i10 = ((View)localObject2).getPaddingLeft();
        m = ((View)localObject2).getPaddingTop();
        int i16 = ((View)localObject2).getPaddingRight();
        int i9 = ((View)localObject2).getPaddingBottom();
        Rect localRect = b;
        localRect.set(i10, m, i16, i9);
        boolean bool11 = android.support.v4.h.w.F((View)localObject1);
        if (bool11) {
          ((ContentFrameLayout)localObject1).requestLayout();
        }
        localObject2 = b;
        localObject3 = a.j.AppCompatTheme;
        localObject2 = ((Context)localObject2).obtainStyledAttributes((int[])localObject3);
        i10 = a.j.AppCompatTheme_windowMinWidthMajor;
        localTypedValue = ((ContentFrameLayout)localObject1).getMinWidthMajor();
        ((TypedArray)localObject2).getValue(i10, localTypedValue);
        i10 = a.j.AppCompatTheme_windowMinWidthMinor;
        localTypedValue = ((ContentFrameLayout)localObject1).getMinWidthMinor();
        ((TypedArray)localObject2).getValue(i10, localTypedValue);
        i10 = a.j.AppCompatTheme_windowFixedWidthMajor;
        boolean bool13 = ((TypedArray)localObject2).hasValue(i10);
        if (bool13)
        {
          i11 = a.j.AppCompatTheme_windowFixedWidthMajor;
          localTypedValue = ((ContentFrameLayout)localObject1).getFixedWidthMajor();
          ((TypedArray)localObject2).getValue(i11, localTypedValue);
        }
        int i11 = a.j.AppCompatTheme_windowFixedWidthMinor;
        boolean bool14 = ((TypedArray)localObject2).hasValue(i11);
        if (bool14)
        {
          i12 = a.j.AppCompatTheme_windowFixedWidthMinor;
          localTypedValue = ((ContentFrameLayout)localObject1).getFixedWidthMinor();
          ((TypedArray)localObject2).getValue(i12, localTypedValue);
        }
        int i12 = a.j.AppCompatTheme_windowFixedHeightMajor;
        boolean bool15 = ((TypedArray)localObject2).hasValue(i12);
        if (bool15)
        {
          i13 = a.j.AppCompatTheme_windowFixedHeightMajor;
          localTypedValue = ((ContentFrameLayout)localObject1).getFixedHeightMajor();
          ((TypedArray)localObject2).getValue(i13, localTypedValue);
        }
        int i13 = a.j.AppCompatTheme_windowFixedHeightMinor;
        boolean bool16 = ((TypedArray)localObject2).hasValue(i13);
        if (bool16)
        {
          i14 = a.j.AppCompatTheme_windowFixedHeightMinor;
          localTypedValue = ((ContentFrameLayout)localObject1).getFixedHeightMinor();
          ((TypedArray)localObject2).getValue(i14, localTypedValue);
        }
        ((TypedArray)localObject2).recycle();
        ((ContentFrameLayout)localObject1).requestLayout();
        B = k;
        localObject1 = g(0);
        bool11 = o;
        if (!bool11) {
          if (localObject1 != null)
          {
            localObject1 = j;
            if (localObject1 != null) {}
          }
          else
          {
            f(i);
          }
        }
        return;
      }
      label1447:
      int i14 = 0;
      localObject3 = null;
    }
  }
  
  private void t()
  {
    boolean bool = B;
    if (bool)
    {
      AndroidRuntimeException localAndroidRuntimeException = new android/util/AndroidRuntimeException;
      localAndroidRuntimeException.<init>("Window feature must be requested before adding content");
      throw localAndroidRuntimeException;
    }
  }
  
  final m.d a(Menu paramMenu)
  {
    int i = 0;
    Object localObject1 = null;
    m.d[] arrayOfd = H;
    int j;
    int k;
    if (arrayOfd != null)
    {
      j = arrayOfd.length;
      k = 0;
      label23:
      if (k >= j) {
        break label78;
      }
      localObject1 = arrayOfd[k];
      if (localObject1 == null) {
        break label67;
      }
      android.support.v7.view.menu.h localh = j;
      if (localh != paramMenu) {
        break label67;
      }
    }
    for (Object localObject2 = localObject1;; localObject2 = null)
    {
      return (m.d)localObject2;
      j = 0;
      localObject2 = null;
      break;
      label67:
      i = k + 1;
      k = i;
      break label23;
      label78:
      j = 0;
    }
  }
  
  public final View a(int paramInt)
  {
    s();
    return c.findViewById(paramInt);
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 1;
    boolean bool1 = false;
    String str1 = null;
    Object localObject1 = a(paramString, paramContext, paramAttributeSet);
    if (localObject1 != null) {
      return (View)localObject1;
    }
    localObject1 = O;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/app/o;
      ((o)localObject1).<init>();
      O = ((o)localObject1);
    }
    boolean bool2 = p;
    int k;
    if (bool2)
    {
      bool2 = paramAttributeSet instanceof XmlPullParser;
      if (bool2)
      {
        localObject1 = paramAttributeSet;
        localObject1 = (XmlPullParser)paramAttributeSet;
        k = ((XmlPullParser)localObject1).getDepth();
        if (k > i) {
          k = i;
        }
      }
    }
    for (;;)
    {
      label107:
      o localo = O;
      boolean bool4 = p;
      boolean bool5 = bh.a();
      if ((k != 0) && (paramView != null)) {}
      for (localObject1 = paramView.getContext();; localObject1 = paramContext)
      {
        localObject1 = o.a((Context)localObject1, (AttributeSet)paramAttributeSet, bool4);
        if (bool5) {
          localObject1 = bc.a((Context)localObject1);
        }
        bool4 = false;
        Object localObject2 = null;
        int m = -1;
        int n = paramString.hashCode();
        switch (n)
        {
        default: 
          label296:
          bool1 = m;
          switch (bool1)
          {
          default: 
            label300:
            label368:
            if ((localObject2 != null) || (paramContext == localObject1)) {}
            break;
          }
          break;
        }
        for (localObject1 = localo.a((Context)localObject1, paramString, (AttributeSet)paramAttributeSet); localObject1 != null; localObject1 = localObject2)
        {
          o.a((View)localObject1, (AttributeSet)paramAttributeSet);
          break;
          bool3 = false;
          localObject1 = null;
          break label107;
          localObject1 = paramView;
          localObject1 = (ViewParent)paramView;
          if (localObject1 == null)
          {
            bool3 = false;
            localObject1 = null;
            break label107;
          }
          View localView = c.getDecorView();
          for (localObject2 = localObject1;; localObject2 = ((ViewParent)localObject2).getParent())
          {
            if (localObject2 == null)
            {
              bool3 = i;
              break;
            }
            if (localObject2 != localView)
            {
              bool3 = localObject2 instanceof View;
              if (bool3)
              {
                localObject1 = localObject2;
                localObject1 = (View)localObject2;
                bool3 = android.support.v4.h.w.H((View)localObject1);
                if (!bool3) {
                  continue;
                }
              }
            }
            bool3 = false;
            localObject1 = null;
            break;
          }
          String str2 = "TextView";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          break label300;
          str1 = "ImageView";
          bool1 = paramString.equals(str1);
          if (!bool1) {
            break label296;
          }
          bool1 = i;
          break label300;
          str2 = "Button";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          int j = 2;
          break label300;
          str2 = "EditText";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 3;
          break label300;
          str2 = "Spinner";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 4;
          break label300;
          str2 = "ImageButton";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 5;
          break label300;
          str2 = "CheckBox";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 6;
          break label300;
          str2 = "RadioButton";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 7;
          break label300;
          str2 = "CheckedTextView";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 8;
          break label300;
          str2 = "AutoCompleteTextView";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 9;
          break label300;
          str2 = "MultiAutoCompleteTextView";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 10;
          break label300;
          str2 = "RatingBar";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 11;
          break label300;
          str2 = "SeekBar";
          i = paramString.equals(str2);
          if (i == 0) {
            break label296;
          }
          j = 12;
          break label300;
          localObject2 = new android/support/v7/widget/ab;
          ((ab)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/q;
          ((android.support.v7.widget.q)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/i;
          ((i)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/n;
          ((n)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/y;
          ((y)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/o;
          ((android.support.v7.widget.o)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/j;
          ((j)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/u;
          ((u)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/k;
          ((android.support.v7.widget.k)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/g;
          ((g)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/r;
          ((r)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/v;
          ((v)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
          localObject2 = new android/support/v7/widget/w;
          ((android.support.v7.widget.w)localObject2).<init>((Context)localObject1, (AttributeSet)paramAttributeSet);
          break label368;
        }
      }
      boolean bool3 = false;
      localObject1 = null;
    }
  }
  
  View a(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject = d;
    boolean bool = localObject instanceof LayoutInflater.Factory;
    if (bool)
    {
      localObject = ((LayoutInflater.Factory)d).onCreateView(paramString, paramContext, paramAttributeSet);
      if (localObject == null) {}
    }
    for (;;)
    {
      return (View)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  final void a(int paramInt, m.d paramd, Menu paramMenu)
  {
    Object localObject;
    if (paramMenu == null)
    {
      if ((paramd == null) && (paramInt >= 0))
      {
        localObject = H;
        int i = localObject.length;
        if (paramInt < i)
        {
          localObject = H;
          paramd = localObject[paramInt];
        }
      }
      if (paramd != null) {
        paramMenu = j;
      }
    }
    boolean bool;
    if (paramd != null)
    {
      bool = o;
      if (bool) {}
    }
    for (;;)
    {
      return;
      bool = o;
      if (!bool)
      {
        localObject = d;
        ((Window.Callback)localObject).onPanelClosed(paramInt, paramMenu);
      }
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    boolean bool = i;
    if (bool)
    {
      bool = B;
      if (bool)
      {
        localObject1 = a();
        if (localObject1 != null) {
          ((a)localObject1).a(paramConfiguration);
        }
      }
    }
    Object localObject1 = android.support.v7.widget.m.a();
    Context localContext = b;
    synchronized (a)
    {
      localObject1 = b;
      localObject1 = ((WeakHashMap)localObject1).get(localContext);
      localObject1 = (android.support.v4.g.f)localObject1;
      if (localObject1 != null) {
        ((android.support.v4.g.f)localObject1).b();
      }
      k();
      return;
    }
  }
  
  public void a(Bundle paramBundle)
  {
    boolean bool1 = true;
    Object localObject = d;
    boolean bool2 = localObject instanceof Activity;
    if (bool2)
    {
      localObject = x.b((Activity)d);
      if (localObject != null)
      {
        localObject = g;
        if (localObject != null) {
          break label48;
        }
        L = bool1;
      }
    }
    for (;;)
    {
      return;
      label48:
      ((a)localObject).a(bool1);
    }
  }
  
  final void a(m.d paramd, boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      int i = a;
      if (i == 0)
      {
        localObject1 = y;
        if (localObject1 != null)
        {
          localObject1 = y;
          boolean bool1 = ((ad)localObject1).c();
          if (bool1)
          {
            localObject1 = j;
            b((android.support.v7.view.menu.h)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = b;
      Object localObject2 = "window";
      localObject1 = (WindowManager)((Context)localObject1).getSystemService((String)localObject2);
      if (localObject1 != null)
      {
        boolean bool2 = o;
        if (bool2)
        {
          localObject2 = g;
          if (localObject2 != null)
          {
            localObject2 = g;
            ((WindowManager)localObject1).removeView((View)localObject2);
            if (paramBoolean)
            {
              j = a;
              a(j, paramd, null);
            }
          }
        }
      }
      m = false;
      n = false;
      o = false;
      h = null;
      int j = 1;
      q = j;
      localObject1 = I;
      if (localObject1 == paramd) {
        I = null;
      }
    }
  }
  
  public final void a(android.support.v7.view.menu.h paramh)
  {
    int i = 108;
    Object localObject1 = y;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = y;
      boolean bool1 = ((ad)localObject1).b();
      if (bool1)
      {
        localObject1 = ViewConfiguration.get(b);
        bool1 = aa.a((ViewConfiguration)localObject1);
        if (bool1)
        {
          localObject1 = y;
          bool1 = ((ad)localObject1).d();
          if (!bool1) {}
        }
        else
        {
          localObject1 = c.getCallback();
          localObject2 = y;
          boolean bool2 = ((ad)localObject2).c();
          if (!bool2) {
            if (localObject1 != null)
            {
              bool2 = o;
              if (!bool2)
              {
                bool2 = w;
                if (bool2)
                {
                  int j = x & 0x1;
                  if (j != 0)
                  {
                    localObject2 = c.getDecorView();
                    localObject3 = K;
                    ((View)localObject2).removeCallbacks((Runnable)localObject3);
                    localObject2 = K;
                    ((Runnable)localObject2).run();
                  }
                }
                localObject2 = g(0);
                Object localObject3 = j;
                if (localObject3 != null)
                {
                  boolean bool4 = r;
                  if (!bool4)
                  {
                    localObject3 = i;
                    android.support.v7.view.menu.h localh = j;
                    bool4 = ((Window.Callback)localObject1).onPreparePanel(0, (View)localObject3, localh);
                    if (bool4)
                    {
                      localObject2 = j;
                      ((Window.Callback)localObject1).onMenuOpened(i, (Menu)localObject2);
                      localObject1 = y;
                      ((ad)localObject1).e();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject2 = y;
      ((ad)localObject2).f();
      boolean bool3 = o;
      if (!bool3)
      {
        localObject2 = g0j;
        ((Window.Callback)localObject1).onPanelClosed(i, (Menu)localObject2);
        continue;
        localObject1 = g(0);
        q = true;
        a((m.d)localObject1, false);
        bool3 = false;
        localObject2 = null;
        a((m.d)localObject1, null);
      }
    }
  }
  
  public final void a(Toolbar paramToolbar)
  {
    Window.Callback localCallback = null;
    Object localObject1 = d;
    boolean bool1 = localObject1 instanceof Activity;
    if (!bool1) {
      return;
    }
    localObject1 = a();
    boolean bool2 = localObject1 instanceof t;
    if (bool2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
      throw ((Throwable)localObject1);
    }
    h = null;
    if (localObject1 != null) {
      ((a)localObject1).g();
    }
    Object localObject2;
    if (paramToolbar != null)
    {
      localObject2 = new android/support/v7/app/q;
      localObject1 = ((Activity)d).getTitle();
      localCallback = e;
      ((q)localObject2).<init>(paramToolbar, (CharSequence)localObject1, localCallback);
      g = ((a)localObject2);
      localObject1 = c;
      localObject2 = c;
      ((Window)localObject1).setCallback((Window.Callback)localObject2);
    }
    for (;;)
    {
      g();
      break;
      g = null;
      localObject1 = c;
      localObject2 = e;
      ((Window)localObject1).setCallback((Window.Callback)localObject2);
    }
  }
  
  public final void a(View paramView)
  {
    s();
    ViewGroup localViewGroup = (ViewGroup)v.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    d.onContentChanged();
  }
  
  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    s();
    ViewGroup localViewGroup = (ViewGroup)v.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    d.onContentChanged();
  }
  
  final boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    m.d locald = null;
    boolean bool1 = true;
    Object localObject = a();
    boolean bool2;
    if (localObject != null)
    {
      bool2 = ((a)localObject).a(paramInt, paramKeyEvent);
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      localObject = I;
      int i;
      if (localObject != null)
      {
        localObject = I;
        i = paramKeyEvent.getKeyCode();
        bool2 = a((m.d)localObject, i, paramKeyEvent);
        if (bool2)
        {
          locald = I;
          if (locald == null) {
            continue;
          }
          locald = I;
          n = bool1;
          continue;
        }
      }
      localObject = I;
      if (localObject == null)
      {
        localObject = g(0);
        b((m.d)localObject, paramKeyEvent);
        i = paramKeyEvent.getKeyCode();
        boolean bool3 = a((m.d)localObject, i, paramKeyEvent);
        m = false;
        if (bool3) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public final boolean a(android.support.v7.view.menu.h paramh, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = c.getCallback();
    boolean bool2;
    if (localCallback != null)
    {
      boolean bool1 = o;
      if (!bool1)
      {
        Object localObject = paramh.k();
        localObject = a((Menu)localObject);
        if (localObject != null)
        {
          int i = a;
          bool2 = localCallback.onMenuItemSelected(i, paramMenuItem);
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localCallback = null;
    }
  }
  
  final boolean a(KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    String str = null;
    int i = 1;
    int k = paramKeyEvent.getKeyCode();
    int i1 = 82;
    if (k == i1)
    {
      localObject1 = d;
      boolean bool2 = ((Window.Callback)localObject1).dispatchKeyEvent(paramKeyEvent);
      if (!bool2) {}
    }
    int j;
    label248:
    do
    {
      for (;;)
      {
        return i;
        i1 = paramKeyEvent.getKeyCode();
        int m = paramKeyEvent.getAction();
        if (m == 0) {
          m = i;
        }
        for (;;)
        {
          if (m != 0)
          {
            int n;
            switch (i1)
            {
            default: 
              m = Build.VERSION.SDK_INT;
              j = 11;
              if (m < j) {
                a(i1, paramKeyEvent);
              }
              j = 0;
              break;
              n = 0;
              localObject1 = null;
              break;
            case 82: 
              n = paramKeyEvent.getRepeatCount();
              if (n != 0) {
                break;
              }
              localObject1 = g(0);
              bool1 = o;
              if (bool1) {
                break;
              }
              b((m.d)localObject1, paramKeyEvent);
              break;
            case 4: 
              n = paramKeyEvent.getFlags() & 0x80;
              if (n != 0) {
                n = j;
              }
              for (;;)
              {
                J = n;
                break;
                n = 0;
                localObject1 = null;
              }
            }
          }
        }
        switch (i1)
        {
        default: 
          j = 0;
        }
      }
      localObject1 = q;
    } while (localObject1 != null);
    Object localObject2 = g(0);
    Object localObject1 = y;
    if (localObject1 != null)
    {
      localObject1 = y;
      bool3 = ((ad)localObject1).b();
      if (bool3)
      {
        localObject1 = ViewConfiguration.get(b);
        bool3 = aa.a((ViewConfiguration)localObject1);
        if (!bool3)
        {
          localObject1 = y;
          bool3 = ((ad)localObject1).c();
          if (!bool3)
          {
            bool3 = o;
            if (bool3) {
              break label687;
            }
            bool3 = b((m.d)localObject2, paramKeyEvent);
            if (!bool3) {
              break label687;
            }
            localObject1 = y;
            bool3 = ((ad)localObject1).e();
          }
        }
      }
    }
    label384:
    while (bool3)
    {
      localObject1 = b;
      localObject2 = "audio";
      localObject1 = (AudioManager)((Context)localObject1).getSystemService((String)localObject2);
      if (localObject1 == null) {
        break label544;
      }
      ((AudioManager)localObject1).playSoundEffect(0);
      break;
      localObject1 = y;
      bool3 = ((ad)localObject1).f();
      continue;
      bool3 = o;
      if (!bool3)
      {
        bool3 = n;
        if (!bool3) {
          break label486;
        }
      }
      bool3 = o;
      a((m.d)localObject2, j);
    }
    label486:
    boolean bool3 = m;
    if (bool3)
    {
      bool3 = r;
      if (!bool3) {
        break label696;
      }
      m = false;
    }
    label544:
    label685:
    label687:
    label696:
    for (bool3 = b((m.d)localObject2, paramKeyEvent);; bool3 = j)
    {
      if (bool3)
      {
        a((m.d)localObject2, paramKeyEvent);
        bool3 = j;
        break label384;
        localObject1 = "AppCompatDelegate";
        str = "Couldn't get audio manager";
        Log.w((String)localObject1, str);
        break;
        bool3 = J;
        J = false;
        localObject2 = g(0);
        if (localObject2 != null)
        {
          boolean bool4 = o;
          if (bool4)
          {
            if (bool3) {
              break;
            }
            a((m.d)localObject2, j);
            break;
          }
        }
        localObject1 = q;
        if (localObject1 != null)
        {
          localObject1 = q;
          ((b)localObject1).c();
          bool3 = j;
        }
        for (;;)
        {
          if (!bool3) {
            break label685;
          }
          break;
          localObject1 = a();
          if (localObject1 != null)
          {
            bool3 = ((a)localObject1).e();
            if (bool3)
            {
              bool3 = j;
              continue;
            }
          }
          bool3 = false;
          localObject1 = null;
        }
        break label248;
      }
      bool3 = false;
      localObject1 = null;
      break label384;
    }
  }
  
  public final void b(int paramInt)
  {
    s();
    ViewGroup localViewGroup = (ViewGroup)v.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(b).inflate(paramInt, localViewGroup);
    d.onContentChanged();
  }
  
  final void b(android.support.v7.view.menu.h paramh)
  {
    boolean bool1 = G;
    if (bool1) {}
    for (;;)
    {
      return;
      bool1 = true;
      G = bool1;
      y.h();
      Window.Callback localCallback = c.getCallback();
      if (localCallback != null)
      {
        boolean bool2 = o;
        if (!bool2)
        {
          int i = 108;
          localCallback.onPanelClosed(i, paramh);
        }
      }
      bool1 = false;
      localCallback = null;
      G = false;
    }
  }
  
  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    s();
    ((ViewGroup)v.findViewById(16908290)).addView(paramView, paramLayoutParams);
    d.onContentChanged();
  }
  
  final void b(CharSequence paramCharSequence)
  {
    Object localObject = y;
    if (localObject != null)
    {
      localObject = y;
      ((ad)localObject).setWindowTitle(paramCharSequence);
    }
    for (;;)
    {
      return;
      localObject = g;
      if (localObject != null)
      {
        localObject = g;
        ((a)localObject).a(paramCharSequence);
      }
      else
      {
        localObject = C;
        if (localObject != null)
        {
          localObject = C;
          ((TextView)localObject).setText(paramCharSequence);
        }
      }
    }
  }
  
  public final void c()
  {
    s();
  }
  
  public final boolean c(int paramInt)
  {
    int i = 108;
    int j = 1;
    float f = Float.MIN_VALUE;
    int k = 8;
    String str1;
    String str2;
    Window localWindow;
    if (paramInt == k)
    {
      str1 = "AppCompatDelegate";
      str2 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.";
      Log.i(str1, str2);
      paramInt = i;
      boolean bool2 = this.m;
      if ((!bool2) || (paramInt != i)) {
        break label96;
      }
      i = 0;
      localWindow = null;
    }
    for (;;)
    {
      return i;
      int m = 9;
      if (paramInt != m) {
        break;
      }
      str1 = "AppCompatDelegate";
      str2 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.";
      Log.i(str1, str2);
      paramInt = 109;
      break;
      label96:
      boolean bool1 = this.i;
      if ((bool1) && (paramInt == j)) {
        this.i = false;
      }
      switch (paramInt)
      {
      default: 
        localWindow = c;
        bool1 = localWindow.requestFeature(paramInt);
        break;
      case 108: 
        t();
        this.i = j;
        bool1 = j;
        break;
      case 109: 
        t();
        this.j = j;
        bool1 = j;
        break;
      case 10: 
        t();
        this.k = j;
        bool1 = j;
        break;
      case 2: 
        t();
        E = j;
        bool1 = j;
        break;
      case 5: 
        t();
        F = j;
        bool1 = j;
        break;
      case 1: 
        t();
        this.m = j;
        bool1 = j;
      }
    }
  }
  
  final void d(int paramInt)
  {
    int i = 108;
    Object localObject;
    if (paramInt == i)
    {
      localObject = a();
      if (localObject != null) {
        ((a)localObject).c(false);
      }
    }
    for (;;)
    {
      return;
      if (paramInt == 0)
      {
        localObject = g(paramInt);
        boolean bool = o;
        if (bool) {
          a((m.d)localObject, false);
        }
      }
    }
  }
  
  public void e()
  {
    a locala = a();
    if (locala != null) {
      locala.b(false);
    }
  }
  
  final boolean e(int paramInt)
  {
    boolean bool = true;
    int i = 108;
    if (paramInt == i)
    {
      a locala = a();
      if (locala != null) {
        locala.c(bool);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  public final void f()
  {
    a locala = a();
    if (locala != null)
    {
      boolean bool = true;
      locala.b(bool);
    }
  }
  
  protected final m.d g(int paramInt)
  {
    Object localObject1 = H;
    int i;
    if (localObject1 != null)
    {
      i = localObject1.length;
      if (i > paramInt) {}
    }
    else
    {
      i = paramInt + 1;
      localObject2 = new m.d[i];
      if (localObject1 != null)
      {
        int j = localObject1.length;
        System.arraycopy(localObject1, 0, localObject2, 0, j);
      }
      H = ((m.d[])localObject2);
      localObject1 = localObject2;
    }
    Object localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new android/support/v7/app/m$d;
      ((m.d)localObject2).<init>(paramInt);
      localObject1[paramInt] = localObject2;
    }
    for (localObject1 = localObject2;; localObject1 = localObject2) {
      return (m.d)localObject1;
    }
  }
  
  public final void g()
  {
    a locala = a();
    boolean bool;
    if (locala != null)
    {
      bool = locala.d();
      if (!bool) {}
    }
    for (;;)
    {
      return;
      bool = false;
      locala = null;
      f(0);
    }
  }
  
  public void h()
  {
    boolean bool = w;
    if (bool)
    {
      localObject = c.getDecorView();
      Runnable localRunnable = K;
      ((View)localObject).removeCallbacks(localRunnable);
    }
    super.h();
    Object localObject = g;
    if (localObject != null)
    {
      localObject = g;
      ((a)localObject).g();
    }
  }
  
  final void h(int paramInt)
  {
    boolean bool = true;
    Object localObject1 = g(paramInt);
    Object localObject2 = j;
    if (localObject2 != null)
    {
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      android.support.v7.view.menu.h localh = j;
      localh.b((Bundle)localObject2);
      int i = ((Bundle)localObject2).size();
      if (i > 0) {
        s = ((Bundle)localObject2);
      }
      j.d();
      localObject2 = j;
      ((android.support.v7.view.menu.h)localObject2).clear();
    }
    r = bool;
    q = bool;
    int j = 108;
    if ((paramInt == j) || (paramInt == 0))
    {
      localObject1 = y;
      if (localObject1 != null)
      {
        localObject1 = g(0);
        if (localObject1 != null)
        {
          m = false;
          localObject2 = null;
          b((m.d)localObject1, null);
        }
      }
    }
  }
  
  final int i(int paramInt)
  {
    int i = -1;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    Object localObject1 = r;
    boolean bool1;
    Object localObject2;
    Object localObject3;
    int m;
    float f2;
    label299:
    label310:
    label349:
    ActionBarContextView localActionBarContextView;
    if (localObject1 != null)
    {
      localObject1 = r.getLayoutParams();
      bool1 = localObject1 instanceof ViewGroup.MarginLayoutParams;
      if (bool1)
      {
        localObject1 = (ViewGroup.MarginLayoutParams)r.getLayoutParams();
        localObject2 = r;
        boolean bool2 = ((ActionBarContextView)localObject2).isShown();
        if (bool2)
        {
          localObject2 = M;
          if (localObject2 == null)
          {
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            M = ((Rect)localObject2);
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            N = ((Rect)localObject2);
          }
          localObject2 = M;
          localObject3 = N;
          ((Rect)localObject2).set(0, paramInt, 0, 0);
          Object localObject4 = v;
          bk.a((View)localObject4, (Rect)localObject2, (Rect)localObject3);
          m = top;
          if (m == 0)
          {
            m = paramInt;
            int n = topMargin;
            if (n == m) {
              break label532;
            }
            topMargin = paramInt;
            localObject2 = D;
            if (localObject2 != null) {
              break label413;
            }
            localObject2 = new android/view/View;
            localObject3 = b;
            ((View)localObject2).<init>((Context)localObject3);
            D = ((View)localObject2);
            localObject2 = D;
            localObject3 = b.getResources();
            int i2 = a.c.abc_input_method_navigation_guard;
            n = ((Resources)localObject3).getColor(i2);
            ((View)localObject2).setBackgroundColor(n);
            localObject2 = v;
            localObject3 = D;
            localObject4 = new android/view/ViewGroup$LayoutParams;
            ((ViewGroup.LayoutParams)localObject4).<init>(i, paramInt);
            ((ViewGroup)localObject2).addView((View)localObject3, i, (ViewGroup.LayoutParams)localObject4);
            m = j;
            f2 = f1;
            localObject3 = D;
            if (localObject3 == null) {
              break label464;
            }
            boolean bool3 = this.k;
            if ((!bool3) && (j != 0)) {
              paramInt = 0;
            }
            int i3 = m;
            float f3 = f2;
            m = j;
            f2 = f1;
            j = i3;
            f1 = f3;
            if (j != 0)
            {
              localActionBarContextView = r;
              localActionBarContextView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            }
            bool1 = m;
          }
        }
      }
    }
    for (;;)
    {
      localObject2 = D;
      if (localObject2 != null)
      {
        localObject2 = D;
        if (!bool1) {
          break label505;
        }
      }
      for (;;)
      {
        ((View)localObject2).setVisibility(k);
        return paramInt;
        m = 0;
        localObject2 = null;
        f2 = 0.0F;
        break;
        label413:
        localObject2 = D.getLayoutParams();
        int i1 = height;
        if (i1 != paramInt)
        {
          height = paramInt;
          localObject3 = D;
          ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        m = j;
        f2 = f1;
        break label299;
        label464:
        j = 0;
        localActionBarContextView = null;
        f1 = 0.0F;
        break label310;
        m = topMargin;
        if (m == 0) {
          break label512;
        }
        topMargin = 0;
        m = 0;
        localObject2 = null;
        f2 = 0.0F;
        break label349;
        label505:
        k = 8;
      }
      label512:
      j = 0;
      localActionBarContextView = null;
      f1 = 0.0F;
      m = 0;
      localObject2 = null;
      f2 = 0.0F;
      break label349;
      label532:
      m = 0;
      localObject2 = null;
      f2 = 0.0F;
      break label299;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public final void j()
  {
    Object localObject1 = LayoutInflater.from(b);
    Object localObject2 = ((LayoutInflater)localObject1).getFactory();
    if (localObject2 == null) {
      android.support.v4.h.h.a((LayoutInflater)localObject1, this);
    }
    for (;;)
    {
      return;
      localObject1 = android.support.v4.h.h.a((LayoutInflater)localObject1);
      boolean bool = localObject1 instanceof m;
      if (!bool)
      {
        localObject1 = "AppCompatDelegate";
        localObject2 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's";
        Log.i((String)localObject1, (String)localObject2);
      }
    }
  }
  
  public final void m()
  {
    s();
    boolean bool1 = i;
    if (bool1)
    {
      localObject = g;
      if (localObject == null) {}
    }
    else
    {
      return;
    }
    Object localObject = d;
    bool1 = localObject instanceof Activity;
    t localt;
    if (bool1)
    {
      localt = new android/support/v7/app/t;
      localObject = (Activity)d;
      boolean bool2 = j;
      localt.<init>((Activity)localObject, bool2);
      g = localt;
    }
    for (;;)
    {
      localObject = g;
      if (localObject == null) {
        break;
      }
      localObject = g;
      boolean bool3 = L;
      ((a)localObject).a(bool3);
      break;
      localObject = d;
      bool1 = localObject instanceof Dialog;
      if (bool1)
      {
        localt = new android/support/v7/app/t;
        localObject = (Dialog)d;
        localt.<init>((Dialog)localObject);
        g = localt;
      }
    }
  }
  
  final boolean o()
  {
    boolean bool = B;
    ViewGroup localViewGroup;
    if (bool)
    {
      localViewGroup = v;
      if (localViewGroup != null)
      {
        localViewGroup = v;
        bool = android.support.v4.h.w.F(localViewGroup);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewGroup = null;
    }
  }
  
  final void p()
  {
    ae localae = u;
    if (localae != null)
    {
      localae = u;
      localae.a();
    }
  }
  
  final void q()
  {
    m.d locald = g(0);
    a(locald, true);
  }
  
  final void r()
  {
    Object localObject1 = y;
    if (localObject1 != null)
    {
      localObject1 = y;
      ((ad)localObject1).h();
    }
    localObject1 = s;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = c.getDecorView();
      localObject2 = t;
      ((View)localObject1).removeCallbacks((Runnable)localObject2);
      localObject1 = s;
      bool = ((PopupWindow)localObject1).isShowing();
      if (!bool) {}
    }
    try
    {
      localObject1 = s;
      ((PopupWindow)localObject1).dismiss();
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    boolean bool = false;
    localObject1 = null;
    s = null;
    p();
    bool = false;
    localObject1 = g(0);
    if (localObject1 != null)
    {
      localObject2 = j;
      if (localObject2 != null)
      {
        localObject1 = j;
        ((android.support.v7.view.menu.h)localObject1).close();
      }
    }
  }
}


/* Location:              android/support/v7/app/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */