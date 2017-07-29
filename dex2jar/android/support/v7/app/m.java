package android.support.v7.app;

import android.annotation.TargetApi;
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
import android.support.v4.h.aj;
import android.support.v4.h.al;
import android.support.v4.h.al.d;
import android.support.v4.h.s;
import android.support.v7.a.a.a;
import android.support.v7.a.a.c;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.i;
import android.support.v7.a.a.j;
import android.support.v7.view.b.a;
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
import android.view.MotionEvent;
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

@TargetApi(9)
class m
  extends h
  implements android.support.v4.h.k, h.a
{
  private static final boolean p;
  private e A;
  private boolean B;
  private TextView C;
  private View D;
  private boolean E;
  private boolean F;
  private boolean G;
  private d[] H;
  private d I;
  private boolean J;
  private final Runnable K = new Runnable()
  {
    public final void run()
    {
      if ((x & 0x1) != 0) {
        h(0);
      }
      if ((x & 0x1000) != 0) {
        h(108);
      }
      w = false;
      x = 0;
    }
  };
  private boolean L;
  private Rect M;
  private Rect N;
  private o O;
  android.support.v7.view.b q;
  ActionBarContextView r;
  PopupWindow s;
  Runnable t;
  ae u = null;
  ViewGroup v;
  boolean w;
  int x;
  private ad y;
  private a z;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      p = bool;
      return;
    }
  }
  
  m(Context paramContext, Window paramWindow, f paramf)
  {
    super(paramContext, paramWindow, paramf);
  }
  
  private void a(d paramd, KeyEvent paramKeyEvent)
  {
    int k = -1;
    if ((o) || (o)) {}
    Object localObject1;
    int i;
    label115:
    label120:
    label124:
    label126:
    Object localObject2;
    label266:
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (a == 0)
          {
            localObject1 = b;
            if ((getResourcesgetConfigurationscreenLayout & 0xF) != 4) {
              break label115;
            }
            i = 1;
            if (getApplicationInfotargetSdkVersion < 11) {
              break label120;
            }
          }
          for (int j = 1;; j = 0)
          {
            if ((i != 0) && (j != 0)) {
              break label124;
            }
            localObject1 = c.getCallback();
            if ((localObject1 == null) || (((Window.Callback)localObject1).onMenuOpened(a, j))) {
              break label126;
            }
            a(paramd, true);
            return;
            i = 0;
            break;
          }
        }
        localObject1 = (WindowManager)b.getSystemService("window");
      } while ((localObject1 == null) || (!b(paramd, paramKeyEvent)));
      if ((g != null) && (!q)) {
        break label757;
      }
      if (g != null) {
        break label581;
      }
      localObject2 = n();
      TypedValue localTypedValue = new TypedValue();
      paramKeyEvent = ((Context)localObject2).getResources().newTheme();
      paramKeyEvent.setTo(((Context)localObject2).getTheme());
      paramKeyEvent.resolveAttribute(a.a.actionBarPopupTheme, localTypedValue, true);
      if (resourceId != 0) {
        paramKeyEvent.applyStyle(resourceId, true);
      }
      paramKeyEvent.resolveAttribute(a.a.panelMenuListTheme, localTypedValue, true);
      if (resourceId == 0) {
        break;
      }
      paramKeyEvent.applyStyle(resourceId, true);
      localObject2 = new d((Context)localObject2, 0);
      ((Context)localObject2).getTheme().setTo(paramKeyEvent);
      l = ((Context)localObject2);
      paramKeyEvent = ((Context)localObject2).obtainStyledAttributes(a.j.AppCompatTheme);
      b = paramKeyEvent.getResourceId(a.j.AppCompatTheme_panelBackground, 0);
      f = paramKeyEvent.getResourceId(a.j.AppCompatTheme_android_windowAnimationStyle, 0);
      paramKeyEvent.recycle();
      g = new c(l);
      c = 81;
    } while (g == null);
    label359:
    if (i != null)
    {
      h = i;
      i = 1;
      label376:
      if (i == 0) {
        break label730;
      }
      if (h == null) {
        break label752;
      }
      if (i == null) {
        break label732;
      }
      i = 1;
      label396:
      if (i == 0) {
        break label755;
      }
      paramKeyEvent = h.getLayoutParams();
      if (paramKeyEvent != null) {
        break label793;
      }
      paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
    }
    label581:
    label727:
    label730:
    label732:
    label752:
    label755:
    label757:
    label793:
    for (;;)
    {
      i = b;
      g.setBackgroundResource(i);
      localObject2 = h.getParent();
      if ((localObject2 != null) && ((localObject2 instanceof ViewGroup))) {
        ((ViewGroup)localObject2).removeView(h);
      }
      g.addView(h, paramKeyEvent);
      if (!h.hasFocus()) {
        h.requestFocus();
      }
      i = -2;
      for (;;)
      {
        n = false;
        paramKeyEvent = new WindowManager.LayoutParams(i, -2, d, e, 1002, 8519680, -3);
        gravity = c;
        windowAnimations = f;
        ((WindowManager)localObject1).addView(g, paramKeyEvent);
        o = true;
        return;
        paramKeyEvent.applyStyle(a.i.Theme_AppCompat_CompactMenu, true);
        break label266;
        if ((!q) || (g.getChildCount() <= 0)) {
          break label359;
        }
        g.removeAllViews();
        break label359;
        if (j != null)
        {
          if (A == null) {
            A = new e();
          }
          paramKeyEvent = A;
          if (j == null) {}
          for (paramKeyEvent = null;; paramKeyEvent = k.a(g))
          {
            h = ((View)paramKeyEvent);
            if (h == null) {
              break label727;
            }
            i = 1;
            break;
            if (k == null)
            {
              k = new android.support.v7.view.menu.f(l, a.g.abc_list_menu_item_layout);
              k.h = paramKeyEvent;
              j.a(k);
            }
          }
        }
        i = 0;
        break label376;
        break;
        if (k.d().getCount() > 0)
        {
          i = 1;
          break label396;
        }
        i = 0;
        break label396;
        break;
        if (i != null)
        {
          paramKeyEvent = i.getLayoutParams();
          if (paramKeyEvent != null)
          {
            i = k;
            if (width == -1) {
              continue;
            }
          }
        }
        i = -2;
      }
    }
  }
  
  private boolean a(d paramd, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.isSystem()) {}
    while (((!m) && (!b(paramd, paramKeyEvent))) || (j == null)) {
      return false;
    }
    return j.performShortcut(paramInt, paramKeyEvent, 1);
  }
  
  private boolean b(d paramd, KeyEvent paramKeyEvent)
  {
    if (o) {
      return false;
    }
    if (m) {
      return true;
    }
    if ((I != null) && (I != paramd)) {
      a(I, false);
    }
    Window.Callback localCallback = c.getCallback();
    if (localCallback != null) {
      i = localCallback.onCreatePanelView(a);
    }
    int i;
    label89:
    Context localContext;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if ((a == 0) || (a == 108))
    {
      i = 1;
      if ((i != 0) && (y != null)) {
        y.g();
      }
      if ((i != null) || ((i != 0) && ((g instanceof q)))) {
        break label624;
      }
      if ((j != null) && (!r)) {
        break label494;
      }
      if (j == null)
      {
        localContext = b;
        if (((a != 0) && (a != 108)) || (y == null)) {
          break label652;
        }
        localTypedValue = new TypedValue();
        localTheme = localContext.getTheme();
        localTheme.resolveAttribute(a.a.actionBarTheme, localTypedValue, true);
        if (resourceId == 0) {
          break label471;
        }
        localObject1 = localContext.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
        label256:
        Object localObject2 = localObject1;
        if (resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(resourceId, true);
        }
        if (localObject2 == null) {
          break label652;
        }
        localObject1 = new d(localContext, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new android.support.v7.view.menu.h((Context)localObject1);
      ((android.support.v7.view.menu.h)localObject1).a(this);
      paramd.a((android.support.v7.view.menu.h)localObject1);
      if (j == null) {
        break;
      }
      if ((i != 0) && (y != null))
      {
        if (z == null) {
          z = new a();
        }
        y.a(j, z);
      }
      j.d();
      if (!localCallback.onCreatePanelMenu(a, j))
      {
        paramd.a(null);
        if ((i == 0) || (y == null)) {
          break;
        }
        y.a(null, z);
        return false;
        i = 0;
        break label89;
        label471:
        localTheme.resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
        localObject1 = null;
        break label256;
      }
      r = false;
      label494:
      j.d();
      if (s != null)
      {
        j.c(s);
        s = null;
      }
      if (!localCallback.onPreparePanel(0, i, j))
      {
        if ((i != 0) && (y != null)) {
          y.a(null, z);
        }
        j.e();
        return false;
      }
      if (paramKeyEvent != null)
      {
        i = paramKeyEvent.getDeviceId();
        if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
          break label646;
        }
      }
      label624:
      label646:
      for (boolean bool = true;; bool = false)
      {
        p = bool;
        j.setQwertyMode(p);
        j.e();
        m = true;
        n = false;
        I = paramd;
        return true;
        i = -1;
        break;
      }
      label652:
      localObject1 = localContext;
    }
  }
  
  private void f(int paramInt)
  {
    x |= 1 << paramInt;
    if (!w)
    {
      android.support.v4.h.w.a(c.getDecorView(), K);
      w = true;
    }
  }
  
  private void s()
  {
    Object localObject1;
    if (!B)
    {
      localObject1 = b.obtainStyledAttributes(a.j.AppCompatTheme);
      if (!((TypedArray)localObject1).hasValue(a.j.AppCompatTheme_windowActionBar))
      {
        ((TypedArray)localObject1).recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
      }
      if (((TypedArray)localObject1).getBoolean(a.j.AppCompatTheme_windowNoTitle, false))
      {
        c(1);
        if (((TypedArray)localObject1).getBoolean(a.j.AppCompatTheme_windowActionBarOverlay, false)) {
          c(109);
        }
        if (((TypedArray)localObject1).getBoolean(a.j.AppCompatTheme_windowActionModeOverlay, false)) {
          c(10);
        }
        l = ((TypedArray)localObject1).getBoolean(a.j.AppCompatTheme_android_windowIsFloating, false);
        ((TypedArray)localObject1).recycle();
        c.getDecorView();
        localObject1 = LayoutInflater.from(b);
        if (this.m) {
          break label459;
        }
        if (!l) {
          break label288;
        }
        localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.g.abc_dialog_title_material, null);
        this.j = false;
        this.i = false;
      }
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.i + ", windowActionBarOverlay: " + this.j + ", android:windowIsFloating: " + l + ", windowActionModeOverlay: " + this.k + ", windowNoTitle: " + this.m + " }");
        if (!((TypedArray)localObject1).getBoolean(a.j.AppCompatTheme_windowActionBar, false)) {
          break;
        }
        c(108);
        break;
        label288:
        if (!this.i) {
          break label1002;
        }
        localObject1 = new TypedValue();
        b.getTheme().resolveAttribute(a.a.actionBarTheme, (TypedValue)localObject1, true);
        if (resourceId != 0) {}
        for (localObject1 = new d(b, resourceId);; localObject1 = b)
        {
          localObject1 = (ViewGroup)LayoutInflater.from((Context)localObject1).inflate(a.g.abc_screen_toolbar, null);
          y = ((ad)((ViewGroup)localObject1).findViewById(a.f.decor_content_parent));
          y.setWindowCallback(c.getCallback());
          if (this.j) {
            y.a(109);
          }
          if (E) {
            y.a(2);
          }
          if (F) {
            y.a(5);
          }
          break;
        }
        label459:
        if (this.k) {}
        for (localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.g.abc_screen_simple_overlay_action_mode, null);; localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.g.abc_screen_simple, null))
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label521;
          }
          android.support.v4.h.w.a((View)localObject1, new s()
          {
            public final al a(View paramAnonymousView, al paramAnonymousal)
            {
              int j = paramAnonymousal.b();
              int i = i(j);
              al localal = paramAnonymousal;
              if (j != i)
              {
                j = paramAnonymousal.a();
                int k = paramAnonymousal.c();
                int m = paramAnonymousal.d();
                localal = al.a.a(b, j, i, k, m);
              }
              return android.support.v4.h.w.a(paramAnonymousView, localal);
            }
          });
          break;
        }
        label521:
        ((ai)localObject1).setOnFitSystemWindowsListener(new ai.a()
        {
          public final void a(Rect paramAnonymousRect)
          {
            top = i(top);
          }
        });
        continue;
      }
      if (y == null) {
        C = ((TextView)((ViewGroup)localObject1).findViewById(a.f.title));
      }
      bk.b((View)localObject1);
      Object localObject2 = (ContentFrameLayout)((ViewGroup)localObject1).findViewById(a.f.action_bar_activity_content);
      ViewGroup localViewGroup = (ViewGroup)c.findViewById(16908290);
      if (localViewGroup != null)
      {
        while (localViewGroup.getChildCount() > 0)
        {
          View localView = localViewGroup.getChildAt(0);
          localViewGroup.removeViewAt(0);
          ((ContentFrameLayout)localObject2).addView(localView);
        }
        localViewGroup.setId(-1);
        ((ContentFrameLayout)localObject2).setId(16908290);
        if ((localViewGroup instanceof FrameLayout)) {
          ((FrameLayout)localViewGroup).setForeground(null);
        }
      }
      c.setContentView((View)localObject1);
      ((ContentFrameLayout)localObject2).setAttachListener(new ContentFrameLayout.a()
      {
        public final void a()
        {
          r();
        }
      });
      v = ((ViewGroup)localObject1);
      if ((d instanceof Activity)) {}
      for (localObject1 = ((Activity)d).getTitle();; localObject1 = n)
      {
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          b((CharSequence)localObject1);
        }
        localObject1 = (ContentFrameLayout)v.findViewById(16908290);
        localObject2 = c.getDecorView();
        int i = ((View)localObject2).getPaddingLeft();
        int j = ((View)localObject2).getPaddingTop();
        int k = ((View)localObject2).getPaddingRight();
        int m = ((View)localObject2).getPaddingBottom();
        b.set(i, j, k, m);
        if (android.support.v4.h.w.F((View)localObject1)) {
          ((ContentFrameLayout)localObject1).requestLayout();
        }
        localObject2 = b.obtainStyledAttributes(a.j.AppCompatTheme);
        ((TypedArray)localObject2).getValue(a.j.AppCompatTheme_windowMinWidthMajor, ((ContentFrameLayout)localObject1).getMinWidthMajor());
        ((TypedArray)localObject2).getValue(a.j.AppCompatTheme_windowMinWidthMinor, ((ContentFrameLayout)localObject1).getMinWidthMinor());
        if (((TypedArray)localObject2).hasValue(a.j.AppCompatTheme_windowFixedWidthMajor)) {
          ((TypedArray)localObject2).getValue(a.j.AppCompatTheme_windowFixedWidthMajor, ((ContentFrameLayout)localObject1).getFixedWidthMajor());
        }
        if (((TypedArray)localObject2).hasValue(a.j.AppCompatTheme_windowFixedWidthMinor)) {
          ((TypedArray)localObject2).getValue(a.j.AppCompatTheme_windowFixedWidthMinor, ((ContentFrameLayout)localObject1).getFixedWidthMinor());
        }
        if (((TypedArray)localObject2).hasValue(a.j.AppCompatTheme_windowFixedHeightMajor)) {
          ((TypedArray)localObject2).getValue(a.j.AppCompatTheme_windowFixedHeightMajor, ((ContentFrameLayout)localObject1).getFixedHeightMajor());
        }
        if (((TypedArray)localObject2).hasValue(a.j.AppCompatTheme_windowFixedHeightMinor)) {
          ((TypedArray)localObject2).getValue(a.j.AppCompatTheme_windowFixedHeightMinor, ((ContentFrameLayout)localObject1).getFixedHeightMinor());
        }
        ((TypedArray)localObject2).recycle();
        ((ContentFrameLayout)localObject1).requestLayout();
        B = true;
        localObject1 = g(0);
        if ((!o) && ((localObject1 == null) || (j == null))) {
          f(108);
        }
        return;
      }
      label1002:
      localObject1 = null;
    }
  }
  
  private void t()
  {
    if (B) {
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
  }
  
  final d a(Menu paramMenu)
  {
    d[] arrayOfd = H;
    int i;
    int j;
    if (arrayOfd != null)
    {
      i = arrayOfd.length;
      j = 0;
    }
    for (;;)
    {
      if (j >= i) {
        break label57;
      }
      d locald = arrayOfd[j];
      if ((locald != null) && (j == paramMenu))
      {
        return locald;
        i = 0;
        break;
      }
      j += 1;
    }
    label57:
    return null;
  }
  
  public final View a(int paramInt)
  {
    s();
    return c.findViewById(paramInt);
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int j = 0;
    Object localObject1 = a(paramString, paramContext, paramAttributeSet);
    if (localObject1 != null)
    {
      paramString = (String)localObject1;
      return paramString;
    }
    if (O == null) {
      O = new o();
    }
    int i;
    if (p) {
      if ((paramAttributeSet instanceof XmlPullParser)) {
        if (((XmlPullParser)paramAttributeSet).getDepth() > 1) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      label72:
      Object localObject2 = O;
      boolean bool1 = p;
      boolean bool2 = bh.a();
      if ((i != 0) && (paramView != null)) {}
      for (paramView = paramView.getContext();; paramView = paramContext)
      {
        paramView = o.a(paramView, paramAttributeSet, bool1);
        localObject1 = paramView;
        if (bool2) {
          localObject1 = bc.a(paramView);
        }
        paramView = null;
        switch (paramString.hashCode())
        {
        default: 
          label244:
          i = -1;
          switch (i)
          {
          default: 
            label247:
            label316:
            if ((paramView == null) && (paramContext != localObject1)) {
              paramView = ((o)localObject2).a((Context)localObject1, paramString, paramAttributeSet);
            }
            break;
          }
          break;
        }
        for (;;)
        {
          paramString = paramView;
          if (paramView == null) {
            break;
          }
          o.a(paramView, paramAttributeSet);
          return paramView;
          i = 0;
          break label72;
          localObject1 = (ViewParent)paramView;
          if (localObject1 == null)
          {
            i = 0;
            break label72;
          }
          localObject2 = c.getDecorView();
          for (;;)
          {
            if (localObject1 == null)
            {
              i = 1;
              break;
            }
            if ((localObject1 == localObject2) || (!(localObject1 instanceof View)) || (android.support.v4.h.w.H((View)localObject1)))
            {
              i = 0;
              break;
            }
            localObject1 = ((ViewParent)localObject1).getParent();
          }
          if (!paramString.equals("TextView")) {
            break label244;
          }
          i = j;
          break label247;
          if (!paramString.equals("ImageView")) {
            break label244;
          }
          i = 1;
          break label247;
          if (!paramString.equals("Button")) {
            break label244;
          }
          i = 2;
          break label247;
          if (!paramString.equals("EditText")) {
            break label244;
          }
          i = 3;
          break label247;
          if (!paramString.equals("Spinner")) {
            break label244;
          }
          i = 4;
          break label247;
          if (!paramString.equals("ImageButton")) {
            break label244;
          }
          i = 5;
          break label247;
          if (!paramString.equals("CheckBox")) {
            break label244;
          }
          i = 6;
          break label247;
          if (!paramString.equals("RadioButton")) {
            break label244;
          }
          i = 7;
          break label247;
          if (!paramString.equals("CheckedTextView")) {
            break label244;
          }
          i = 8;
          break label247;
          if (!paramString.equals("AutoCompleteTextView")) {
            break label244;
          }
          i = 9;
          break label247;
          if (!paramString.equals("MultiAutoCompleteTextView")) {
            break label244;
          }
          i = 10;
          break label247;
          if (!paramString.equals("RatingBar")) {
            break label244;
          }
          i = 11;
          break label247;
          if (!paramString.equals("SeekBar")) {
            break label244;
          }
          i = 12;
          break label247;
          paramView = new ab((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new android.support.v7.widget.q((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new i((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new n((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new y((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new android.support.v7.widget.o((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new j((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new u((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new android.support.v7.widget.k((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new g((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new r((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new v((Context)localObject1, paramAttributeSet);
          break label316;
          paramView = new android.support.v7.widget.w((Context)localObject1, paramAttributeSet);
          break label316;
        }
      }
      i = 0;
    }
  }
  
  View a(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((d instanceof LayoutInflater.Factory))
    {
      paramString = ((LayoutInflater.Factory)d).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramString != null) {
        return paramString;
      }
    }
    return null;
  }
  
  final void a(int paramInt, d paramd, Menu paramMenu)
  {
    Object localObject1 = paramd;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      d locald = paramd;
      if (paramd == null)
      {
        locald = paramd;
        if (paramInt >= 0)
        {
          locald = paramd;
          if (paramInt < H.length) {
            locald = H[paramInt];
          }
        }
      }
      localObject1 = locald;
      localObject2 = paramMenu;
      if (locald != null)
      {
        localObject2 = j;
        localObject1 = locald;
      }
    }
    if ((localObject1 != null) && (!o)) {}
    while (o) {
      return;
    }
    d.onPanelClosed(paramInt, (Menu)localObject2);
  }
  
  public final void a(Configuration arg1)
  {
    if ((i) && (B))
    {
      localObject1 = a();
      if (localObject1 != null) {
        ((a)localObject1).a(???);
      }
    }
    Object localObject1 = android.support.v7.widget.m.a();
    Context localContext = b;
    synchronized (a)
    {
      localObject1 = (android.support.v4.g.f)b.get(localContext);
      if (localObject1 != null) {
        ((android.support.v4.g.f)localObject1).b();
      }
      k();
      return;
    }
  }
  
  public void a(Bundle paramBundle)
  {
    if (((d instanceof Activity)) && (x.b((Activity)d) != null))
    {
      paramBundle = g;
      if (paramBundle == null) {
        L = true;
      }
    }
    else
    {
      return;
    }
    paramBundle.a(true);
  }
  
  final void a(d paramd, boolean paramBoolean)
  {
    if ((paramBoolean) && (a == 0) && (y != null) && (y.c())) {
      b(j);
    }
    do
    {
      return;
      WindowManager localWindowManager = (WindowManager)b.getSystemService("window");
      if ((localWindowManager != null) && (o) && (g != null))
      {
        localWindowManager.removeView(g);
        if (paramBoolean) {
          a(a, paramd, null);
        }
      }
      m = false;
      n = false;
      o = false;
      h = null;
      q = true;
    } while (I != paramd);
    I = null;
  }
  
  public final void a(android.support.v7.view.menu.h paramh)
  {
    if ((y != null) && (y.b()) && ((!aa.a(ViewConfiguration.get(b))) || (y.d())))
    {
      paramh = c.getCallback();
      if (!y.c()) {
        if ((paramh != null) && (!o))
        {
          if ((w) && ((x & 0x1) != 0))
          {
            c.getDecorView().removeCallbacks(K);
            K.run();
          }
          d locald = g(0);
          if ((j != null) && (!r) && (paramh.onPreparePanel(0, i, j)))
          {
            paramh.onMenuOpened(108, j);
            y.e();
          }
        }
      }
      do
      {
        return;
        y.f();
      } while (o);
      paramh.onPanelClosed(108, g0j);
      return;
    }
    paramh = g(0);
    q = true;
    a(paramh, false);
    a(paramh, null);
  }
  
  public final void a(Toolbar paramToolbar)
  {
    if (!(d instanceof Activity)) {
      return;
    }
    a locala = a();
    if ((locala instanceof t)) {
      throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    h = null;
    if (locala != null) {
      locala.g();
    }
    if (paramToolbar != null)
    {
      paramToolbar = new q(paramToolbar, ((Activity)d).getTitle(), e);
      g = paramToolbar;
      c.setCallback(c);
    }
    for (;;)
    {
      g();
      return;
      g = null;
      c.setCallback(e);
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
    Object localObject = a();
    if ((localObject != null) && (((a)localObject).a(paramInt, paramKeyEvent))) {}
    boolean bool;
    do
    {
      do
      {
        return true;
        if ((I == null) || (!a(I, paramKeyEvent.getKeyCode(), paramKeyEvent))) {
          break;
        }
      } while (I == null);
      I.n = true;
      return true;
      if (I != null) {
        break;
      }
      localObject = g(0);
      b((d)localObject, paramKeyEvent);
      bool = a((d)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent);
      m = false;
    } while (bool);
    return false;
  }
  
  public final boolean a(android.support.v7.view.menu.h paramh, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = c.getCallback();
    if ((localCallback != null) && (!o))
    {
      paramh = a(paramh.k());
      if (paramh != null) {
        return localCallback.onMenuItemSelected(a, paramMenuItem);
      }
    }
    return false;
  }
  
  final boolean a(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 82) && (d.dispatchKeyEvent(paramKeyEvent))) {}
    int i;
    label180:
    do
    {
      int j;
      do
      {
        do
        {
          return true;
          j = paramKeyEvent.getKeyCode();
          if (paramKeyEvent.getAction() == 0) {}
          for (i = 1; i != 0; i = 0) {
            switch (j)
            {
            default: 
              if (Build.VERSION.SDK_INT < 11) {
                a(j, paramKeyEvent);
              }
              return false;
            }
          }
        } while (paramKeyEvent.getRepeatCount() != 0);
        locald = g(0);
      } while (o);
      b(locald, paramKeyEvent);
      return true;
      if ((paramKeyEvent.getFlags() & 0x80) != 0) {}
      for (bool = true;; bool = false)
      {
        J = bool;
        break;
      }
      switch (j)
      {
      default: 
        return false;
      }
    } while (q != null);
    d locald = g(0);
    if ((y != null) && (y.b()) && (!aa.a(ViewConfiguration.get(b)))) {
      if (!y.c())
      {
        if ((o) || (!b(locald, paramKeyEvent))) {
          break label495;
        }
        bool = y.e();
      }
    }
    label268:
    while (bool)
    {
      paramKeyEvent = (AudioManager)b.getSystemService("audio");
      if (paramKeyEvent == null) {
        break label394;
      }
      paramKeyEvent.playSoundEffect(0);
      return true;
      bool = y.f();
      continue;
      if ((!o) && (!n)) {
        break label345;
      }
      bool = o;
      a(locald, true);
    }
    label345:
    if (m)
    {
      if (!r) {
        break label501;
      }
      m = false;
    }
    label394:
    label495:
    label501:
    for (boolean bool = b(locald, paramKeyEvent);; bool = true)
    {
      if (bool)
      {
        a(locald, paramKeyEvent);
        bool = true;
        break label268;
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        return true;
        bool = J;
        J = false;
        paramKeyEvent = g(0);
        if ((paramKeyEvent != null) && (o))
        {
          if (bool) {
            break;
          }
          a(paramKeyEvent, true);
          return true;
        }
        if (q != null)
        {
          q.c();
          i = 1;
        }
        while (i != 0)
        {
          return true;
          paramKeyEvent = a();
          if ((paramKeyEvent != null) && (paramKeyEvent.e())) {
            i = 1;
          } else {
            i = 0;
          }
        }
        break label180;
      }
      bool = false;
      break label268;
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
    if (G) {
      return;
    }
    G = true;
    y.h();
    Window.Callback localCallback = c.getCallback();
    if ((localCallback != null) && (!o)) {
      localCallback.onPanelClosed(108, paramh);
    }
    G = false;
  }
  
  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    s();
    ((ViewGroup)v.findViewById(16908290)).addView(paramView, paramLayoutParams);
    d.onContentChanged();
  }
  
  final void b(CharSequence paramCharSequence)
  {
    if (y != null) {
      y.setWindowTitle(paramCharSequence);
    }
    do
    {
      return;
      if (g != null)
      {
        g.a(paramCharSequence);
        return;
      }
    } while (C == null);
    C.setText(paramCharSequence);
  }
  
  public final void c()
  {
    s();
  }
  
  public final boolean c(int paramInt)
  {
    int i;
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      i = 108;
    }
    while ((m) && (i == 108))
    {
      return false;
      i = paramInt;
      if (paramInt == 9)
      {
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        i = 109;
      }
    }
    if ((this.i) && (i == 1)) {
      this.i = false;
    }
    switch (i)
    {
    default: 
      return c.requestFeature(i);
    case 108: 
      t();
      this.i = true;
      return true;
    case 109: 
      t();
      j = true;
      return true;
    case 10: 
      t();
      k = true;
      return true;
    case 2: 
      t();
      E = true;
      return true;
    case 5: 
      t();
      F = true;
      return true;
    }
    t();
    m = true;
    return true;
  }
  
  final void d(int paramInt)
  {
    Object localObject;
    if (paramInt == 108)
    {
      localObject = a();
      if (localObject != null) {
        ((a)localObject).c(false);
      }
    }
    do
    {
      do
      {
        return;
      } while (paramInt != 0);
      localObject = g(paramInt);
    } while (!o);
    a((d)localObject, false);
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
    if (paramInt == 108)
    {
      a locala = a();
      if (locala != null) {
        locala.c(true);
      }
      return true;
    }
    return false;
  }
  
  public final void f()
  {
    a locala = a();
    if (locala != null) {
      locala.b(true);
    }
  }
  
  protected final d g(int paramInt)
  {
    Object localObject2 = H;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new d[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      H = ((d[])localObject1);
    }
    localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new d(paramInt);
      localObject1[paramInt] = localObject2;
      return (d)localObject2;
    }
    return (d)localObject2;
  }
  
  public final void g()
  {
    a locala = a();
    if ((locala != null) && (locala.d())) {
      return;
    }
    f(0);
  }
  
  public void h()
  {
    if (w) {
      c.getDecorView().removeCallbacks(K);
    }
    super.h();
    if (g != null) {
      g.g();
    }
  }
  
  final void h(int paramInt)
  {
    d locald = g(paramInt);
    if (j != null)
    {
      Bundle localBundle = new Bundle();
      j.b(localBundle);
      if (localBundle.size() > 0) {
        s = localBundle;
      }
      j.d();
      j.clear();
    }
    r = true;
    q = true;
    if (((paramInt == 108) || (paramInt == 0)) && (y != null))
    {
      locald = g(0);
      if (locald != null)
      {
        m = false;
        b(locald, null);
      }
    }
  }
  
  final int i(int paramInt)
  {
    int j = 1;
    int k = 1;
    int m = 0;
    Object localObject1;
    Object localObject2;
    int i;
    if ((r != null) && ((r.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject1 = (ViewGroup.MarginLayoutParams)r.getLayoutParams();
      if (r.isShown())
      {
        if (M == null)
        {
          M = new Rect();
          N = new Rect();
        }
        localObject2 = M;
        Rect localRect = N;
        ((Rect)localObject2).set(0, paramInt, 0, 0);
        bk.a(v, (Rect)localObject2, localRect);
        if (top == 0)
        {
          i = paramInt;
          if (topMargin == i) {
            break label355;
          }
          topMargin = paramInt;
          if (D != null) {
            break label279;
          }
          D = new View(b);
          D.setBackgroundColor(b.getResources().getColor(a.c.abc_input_method_navigation_guard));
          v.addView(D, -1, new ViewGroup.LayoutParams(-1, paramInt));
          i = 1;
          label201:
          if (D == null) {
            break label317;
          }
          label208:
          j = paramInt;
          if (!this.k)
          {
            j = paramInt;
            if (k != 0) {
              j = 0;
            }
          }
          paramInt = j;
          j = i;
          i = k;
          label233:
          if (j != 0) {
            r.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      if (D != null)
      {
        localObject1 = D;
        if (i == 0) {
          break label342;
        }
      }
      label279:
      label317:
      label342:
      for (i = m;; i = 8)
      {
        ((View)localObject1).setVisibility(i);
        return paramInt;
        i = 0;
        break;
        localObject2 = D.getLayoutParams();
        if (height != paramInt)
        {
          height = paramInt;
          D.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        i = 1;
        break label201;
        k = 0;
        break label208;
        if (topMargin == 0) {
          break label348;
        }
        topMargin = 0;
        i = 0;
        break label233;
      }
      label348:
      j = 0;
      i = 0;
      break label233;
      label355:
      i = 0;
      break label201;
      i = 0;
    }
  }
  
  public final void j()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(b);
    if (localLayoutInflater.getFactory() == null) {
      android.support.v4.h.h.a(localLayoutInflater, this);
    }
    while ((android.support.v4.h.h.a(localLayoutInflater) instanceof m)) {
      return;
    }
    Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
  }
  
  public final void m()
  {
    s();
    if ((!i) || (g != null)) {}
    for (;;)
    {
      return;
      if ((d instanceof Activity)) {
        g = new t((Activity)d, j);
      }
      while (g != null)
      {
        g.a(L);
        return;
        if ((d instanceof Dialog)) {
          g = new t((Dialog)d);
        }
      }
    }
  }
  
  final boolean o()
  {
    return (B) && (v != null) && (android.support.v4.h.w.F(v));
  }
  
  final void p()
  {
    if (u != null) {
      u.a();
    }
  }
  
  final void q()
  {
    a(g(0), true);
  }
  
  final void r()
  {
    if (y != null) {
      y.h();
    }
    if (s != null)
    {
      c.getDecorView().removeCallbacks(t);
      if (!s.isShowing()) {}
    }
    try
    {
      s.dismiss();
      s = null;
      p();
      d locald = g(0);
      if ((locald != null) && (j != null)) {
        j.close();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  private final class a
    implements o.a
  {
    a() {}
    
    public final void a(android.support.v7.view.menu.h paramh, boolean paramBoolean)
    {
      b(paramh);
    }
    
    public final boolean a(android.support.v7.view.menu.h paramh)
    {
      Window.Callback localCallback = c.getCallback();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paramh);
      }
      return true;
    }
  }
  
  final class b
    implements b.a
  {
    private b.a b;
    
    public b(b.a parama)
    {
      b = parama;
    }
    
    public final void a(android.support.v7.view.b paramb)
    {
      b.a(paramb);
      if (s != null) {
        c.getDecorView().removeCallbacks(t);
      }
      if (r != null)
      {
        p();
        u = android.support.v4.h.w.s(r).a(0.0F);
        u.a(new aj()
        {
          public final void b(View paramAnonymousView)
          {
            r.setVisibility(8);
            if (s != null) {
              s.dismiss();
            }
            for (;;)
            {
              r.removeAllViews();
              u.a(null);
              u = null;
              return;
              if ((r.getParent() instanceof View)) {
                android.support.v4.h.w.w((View)r.getParent());
              }
            }
          }
        });
      }
      if (f != null)
      {
        paramb = f;
        paramb = q;
      }
      q = null;
    }
    
    public final boolean a(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return b.a(paramb, paramMenu);
    }
    
    public final boolean a(android.support.v7.view.b paramb, MenuItem paramMenuItem)
    {
      return b.a(paramb, paramMenuItem);
    }
    
    public final boolean b(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return b.b(paramb, paramMenu);
    }
  }
  
  private final class c
    extends ContentFrameLayout
  {
    public c(Context paramContext)
    {
      super();
    }
    
    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (a(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (paramMotionEvent.getAction() == 0)
      {
        int i = (int)paramMotionEvent.getX();
        int j = (int)paramMotionEvent.getY();
        if ((i < -5) || (j < -5) || (i > getWidth() + 5) || (j > getHeight() + 5)) {}
        for (i = 1; i != 0; i = 0)
        {
          q();
          return true;
        }
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public final void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(android.support.v7.b.a.b.b(getContext(), paramInt));
    }
  }
  
  protected static final class d
  {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    android.support.v7.view.menu.h j;
    android.support.v7.view.menu.f k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    Bundle s;
    
    d(int paramInt)
    {
      a = paramInt;
      q = false;
    }
    
    final void a(android.support.v7.view.menu.h paramh)
    {
      if (paramh == j) {}
      do
      {
        return;
        if (j != null) {
          j.b(k);
        }
        j = paramh;
      } while ((paramh == null) || (k == null));
      paramh.a(k);
    }
  }
  
  private final class e
    implements o.a
  {
    e() {}
    
    public final void a(android.support.v7.view.menu.h paramh, boolean paramBoolean)
    {
      android.support.v7.view.menu.h localh = paramh.k();
      if (localh != paramh) {}
      for (int i = 1;; i = 0)
      {
        m localm = m.this;
        if (i != 0) {
          paramh = localh;
        }
        paramh = localm.a(paramh);
        if (paramh != null)
        {
          if (i == 0) {
            break;
          }
          a(a, paramh, localh);
          a(paramh, true);
        }
        return;
      }
      a(paramh, paramBoolean);
    }
    
    public final boolean a(android.support.v7.view.menu.h paramh)
    {
      if ((paramh == null) && (i))
      {
        Window.Callback localCallback = c.getCallback();
        if ((localCallback != null) && (!o)) {
          localCallback.onMenuOpened(108, paramh);
        }
      }
      return true;
    }
  }
}


/* Location:              android/support/v7/app/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */