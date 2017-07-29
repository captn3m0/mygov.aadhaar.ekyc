package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.f.b;
import android.support.v4.widget.d;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class SearchView
  extends am
  implements android.support.v7.view.c
{
  static final a i = new a();
  private View.OnClickListener A;
  private boolean B;
  private boolean C;
  private boolean D;
  private CharSequence E;
  private boolean F;
  private boolean G;
  private int H;
  private boolean I;
  private CharSequence J;
  private boolean K;
  private int L;
  private Bundle M;
  private Runnable N;
  private final Runnable O;
  private Runnable P;
  private final WeakHashMap<String, Drawable.ConstantState> Q;
  final SearchAutoComplete a;
  final ImageView b;
  final ImageView c;
  final ImageView d;
  final ImageView e;
  View.OnFocusChangeListener f;
  d g;
  SearchableInfo h;
  private final View j;
  private final View k;
  private f l;
  private Rect m;
  private Rect n;
  private int[] o;
  private int[] p;
  private final ImageView q;
  private final Drawable r;
  private final int s;
  private final int t;
  private final Intent u;
  private final Intent v;
  private final CharSequence w;
  private c x;
  private b y;
  private d z;
  
  private void a(boolean paramBoolean)
  {
    int i5 = 1;
    int i4 = 8;
    C = paramBoolean;
    int i1;
    if (paramBoolean)
    {
      i2 = 0;
      if (TextUtils.isEmpty(a.getText())) {
        break label312;
      }
      i1 = 1;
      label33:
      b.setVisibility(i2);
      if ((!D) || (!e()) || (!hasFocus()) || ((i1 == 0) && (I))) {
        break label364;
      }
    }
    label96:
    label122:
    label145:
    label166:
    label180:
    label210:
    label225:
    label312:
    label322:
    label327:
    label332:
    label338:
    label345:
    label353:
    label358:
    label364:
    for (int i2 = 0;; i2 = 8)
    {
      c.setVisibility(i2);
      Object localObject = j;
      int i3;
      if (paramBoolean)
      {
        i2 = 8;
        ((View)localObject).setVisibility(i2);
        if ((q.getDrawable() != null) && (!B)) {
          break label322;
        }
        i2 = 8;
        q.setVisibility(i2);
        if (TextUtils.isEmpty(a.getText())) {
          break label327;
        }
        i2 = 1;
        if ((i2 == 0) && ((!B) || (K))) {
          break label332;
        }
        i3 = 1;
        localObject = d;
        if (i3 == 0) {
          break label338;
        }
        i3 = 0;
        ((ImageView)localObject).setVisibility(i3);
        Drawable localDrawable = d.getDrawable();
        if (localDrawable != null)
        {
          if (i2 == 0) {
            break label345;
          }
          localObject = ENABLED_STATE_SET;
          localDrawable.setState((int[])localObject);
        }
        if (i1 != 0) {
          break label353;
        }
        i1 = i5;
        if ((!I) || (C) || (i1 == 0)) {
          break label358;
        }
        c.setVisibility(8);
      }
      for (i1 = 0;; i1 = 8)
      {
        e.setVisibility(i1);
        i1 = i4;
        if (e()) {
          if (c.getVisibility() != 0)
          {
            i1 = i4;
            if (e.getVisibility() != 0) {}
          }
          else
          {
            i1 = 0;
          }
        }
        k.setVisibility(i1);
        return;
        i2 = 8;
        break;
        i1 = 0;
        break label33;
        i2 = 0;
        break label96;
        i2 = 0;
        break label122;
        i2 = 0;
        break label145;
        i3 = 0;
        break label166;
        i3 = 8;
        break label180;
        localObject = EMPTY_STATE_SET;
        break label210;
        i1 = 0;
        break label225;
      }
    }
  }
  
  static boolean a(Context paramContext)
  {
    return getResourcesgetConfigurationorientation == 2;
  }
  
  private boolean e()
  {
    return ((D) || (I)) && (!C);
  }
  
  private void f()
  {
    post(O);
  }
  
  private void g()
  {
    Object localObject2 = getQueryHint();
    SearchAutoComplete localSearchAutoComplete = a;
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "";
    }
    localObject2 = localObject1;
    if (B)
    {
      if (r != null) {
        break label45;
      }
      localObject2 = localObject1;
    }
    for (;;)
    {
      localSearchAutoComplete.setHint((CharSequence)localObject2);
      return;
      label45:
      int i1 = (int)(a.getTextSize() * 1.25D);
      r.setBounds(0, 0, i1, i1);
      localObject2 = new SpannableStringBuilder("   ");
      ((SpannableStringBuilder)localObject2).setSpan(new ImageSpan(r), 1, 2, 33);
      ((SpannableStringBuilder)localObject2).append((CharSequence)localObject1);
    }
  }
  
  private int getPreferredHeight()
  {
    return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_height);
  }
  
  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(a.d.abc_search_view_preferred_width);
  }
  
  public final void a()
  {
    if (K) {
      return;
    }
    K = true;
    L = a.getImeOptions();
    a.setImeOptions(L | 0x2000000);
    a.setText("");
    setIconified(false);
  }
  
  public final void b()
  {
    a.setText("");
    a.setSelection(a.length());
    J = "";
    clearFocus();
    a(true);
    a.setImeOptions(L);
    K = false;
  }
  
  public final void clearFocus()
  {
    G = true;
    setImeVisibility(false);
    super.clearFocus();
    a.clearFocus();
    G = false;
  }
  
  final void d()
  {
    a(C);
    f();
    a locala;
    SearchAutoComplete localSearchAutoComplete;
    if (a.hasFocus())
    {
      locala = i;
      localSearchAutoComplete = a;
      if (a == null) {}
    }
    try
    {
      a.invoke(localSearchAutoComplete, new Object[0]);
      locala = i;
      localSearchAutoComplete = a;
      if (b != null) {}
      try
      {
        b.invoke(localSearchAutoComplete, new Object[0]);
        return;
      }
      catch (Exception localException1) {}
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final int getImeOptions()
  {
    return a.getImeOptions();
  }
  
  public final int getInputType()
  {
    return a.getInputType();
  }
  
  public final int getMaxWidth()
  {
    return H;
  }
  
  public final CharSequence getQuery()
  {
    return a.getText();
  }
  
  public final CharSequence getQueryHint()
  {
    if (E != null) {
      return E;
    }
    if ((h != null) && (h.getHintId() != 0)) {
      return getContext().getText(h.getHintId());
    }
    return w;
  }
  
  final int getSuggestionCommitIconResId()
  {
    return t;
  }
  
  final int getSuggestionRowLayout()
  {
    return s;
  }
  
  public final d getSuggestionsAdapter()
  {
    return g;
  }
  
  protected final void onDetachedFromWindow()
  {
    removeCallbacks(O);
    post(P);
    super.onDetachedFromWindow();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      SearchAutoComplete localSearchAutoComplete = a;
      Rect localRect = m;
      localSearchAutoComplete.getLocationInWindow(o);
      getLocationInWindow(p);
      paramInt1 = o[1] - p[1];
      paramInt3 = o[0] - p[0];
      localRect.set(paramInt3, paramInt1, localSearchAutoComplete.getWidth() + paramInt3, localSearchAutoComplete.getHeight() + paramInt1);
      n.set(m.left, 0, m.right, paramInt4 - paramInt2);
      if (l == null)
      {
        l = new f(n, m, a);
        setTouchDelegate(l);
      }
    }
    else
    {
      return;
    }
    l.a(n, m);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (C)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getSize(paramInt1);
    switch (i2)
    {
    default: 
      paramInt1 = i1;
      i1 = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      switch (i1)
      {
      }
      break;
    }
    for (;;)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      return;
      if (H > 0)
      {
        paramInt1 = Math.min(H, i1);
        break;
      }
      paramInt1 = Math.min(getPreferredWidth(), i1);
      break;
      paramInt1 = i1;
      if (H <= 0) {
        break;
      }
      paramInt1 = Math.min(H, i1);
      break;
      if (H > 0)
      {
        paramInt1 = H;
        break;
      }
      paramInt1 = getPreferredWidth();
      break;
      paramInt2 = Math.min(getPreferredHeight(), paramInt2);
      continue;
      paramInt2 = getPreferredHeight();
    }
  }
  
  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof e))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (e)paramParcelable;
    super.onRestoreInstanceState(e);
    a(a);
    requestLayout();
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    e locale = new e(super.onSaveInstanceState());
    a = C;
    return locale;
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    f();
  }
  
  public final boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (G) {}
    while (!isFocusable()) {
      return false;
    }
    if (!C)
    {
      boolean bool = a.requestFocus(paramInt, paramRect);
      if (bool) {
        a(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public final void setAppSearchData(Bundle paramBundle)
  {
    M = paramBundle;
  }
  
  public final void setIconified(boolean paramBoolean)
  {
    if (paramBoolean) {
      if (TextUtils.isEmpty(a.getText())) {
        if ((B) && ((y == null) || (!y.a())))
        {
          clearFocus();
          a(true);
        }
      }
    }
    do
    {
      return;
      a.setText("");
      a.requestFocus();
      setImeVisibility(true);
      return;
      a(false);
      a.requestFocus();
      setImeVisibility(true);
    } while (A == null);
    A.onClick(this);
  }
  
  public final void setIconifiedByDefault(boolean paramBoolean)
  {
    if (B == paramBoolean) {
      return;
    }
    B = paramBoolean;
    a(paramBoolean);
    g();
  }
  
  public final void setImeOptions(int paramInt)
  {
    a.setImeOptions(paramInt);
  }
  
  final void setImeVisibility(boolean paramBoolean)
  {
    if (paramBoolean) {
      post(N);
    }
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(N);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    } while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }
  
  public final void setInputType(int paramInt)
  {
    a.setInputType(paramInt);
  }
  
  public final void setMaxWidth(int paramInt)
  {
    H = paramInt;
    requestLayout();
  }
  
  public final void setOnCloseListener(b paramb)
  {
    y = paramb;
  }
  
  public final void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    f = paramOnFocusChangeListener;
  }
  
  public final void setOnQueryTextListener(c paramc)
  {
    x = paramc;
  }
  
  public final void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    A = paramOnClickListener;
  }
  
  public final void setOnSuggestionListener(d paramd)
  {
    z = paramd;
  }
  
  final void setQuery(CharSequence paramCharSequence)
  {
    a.setText(paramCharSequence);
    SearchAutoComplete localSearchAutoComplete = a;
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i1 = 0;; i1 = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i1);
      return;
    }
  }
  
  public final void setQueryHint(CharSequence paramCharSequence)
  {
    E = paramCharSequence;
    g();
  }
  
  public final void setQueryRefinementEnabled(boolean paramBoolean)
  {
    F = paramBoolean;
    ba localba;
    if ((g instanceof ba))
    {
      localba = (ba)g;
      if (!paramBoolean) {
        break label35;
      }
    }
    label35:
    for (int i1 = 2;; i1 = 1)
    {
      j = i1;
      return;
    }
  }
  
  public final void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    boolean bool = true;
    h = paramSearchableInfo;
    int i1;
    if (h != null)
    {
      a.setThreshold(h.getSuggestThreshold());
      a.setImeOptions(h.getImeOptions());
      int i2 = h.getInputType();
      i1 = i2;
      if ((i2 & 0xF) == 1)
      {
        i2 &= 0xFFFEFFFF;
        i1 = i2;
        if (h.getSuggestAuthority() != null) {
          i1 = i2 | 0x10000 | 0x80000;
        }
      }
      a.setInputType(i1);
      if (g != null) {
        g.a(null);
      }
      if (h.getSuggestAuthority() != null)
      {
        g = new ba(getContext(), this, h, Q);
        a.setAdapter(g);
        paramSearchableInfo = (ba)g;
        if (F)
        {
          i1 = 2;
          j = i1;
        }
      }
      else
      {
        g();
      }
    }
    else
    {
      if ((h == null) || (!h.getVoiceSearchEnabled())) {
        break label297;
      }
      if (!h.getVoiceSearchLaunchWebSearch()) {
        break label273;
      }
      paramSearchableInfo = u;
    }
    for (;;)
    {
      label215:
      if (paramSearchableInfo != null) {
        if (getContext().getPackageManager().resolveActivity(paramSearchableInfo, 65536) == null) {}
      }
      for (;;)
      {
        I = bool;
        if (I) {
          a.setPrivateImeOptions("nm");
        }
        a(C);
        return;
        i1 = 1;
        break;
        label273:
        if (!h.getVoiceSearchLaunchRecognizer()) {
          break label303;
        }
        paramSearchableInfo = v;
        break label215;
        bool = false;
        continue;
        label297:
        bool = false;
      }
      label303:
      paramSearchableInfo = null;
    }
  }
  
  public final void setSubmitButtonEnabled(boolean paramBoolean)
  {
    D = paramBoolean;
    a(C);
  }
  
  public final void setSuggestionsAdapter(d paramd)
  {
    g = paramd;
    a.setAdapter(g);
  }
  
  public static class SearchAutoComplete
    extends g
  {
    private int a = getThreshold();
    private SearchView b;
    
    public SearchAutoComplete(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
    {
      this(paramContext, paramAttributeSet, a.a.autoCompleteTextViewStyle);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
    }
    
    private int getSearchViewTextMinWidthDp()
    {
      Configuration localConfiguration = getResources().getConfiguration();
      int i = android.support.v4.c.a.a.b(getResources());
      int j = android.support.v4.c.a.a.a(getResources());
      if ((i >= 960) && (j >= 720) && (orientation == 2)) {
        return 256;
      }
      if ((i >= 600) || ((i >= 640) && (j >= 480))) {
        return 192;
      }
      return 160;
    }
    
    public boolean enoughToFilter()
    {
      return (a <= 0) || (super.enoughToFilter());
    }
    
    protected void onFinishInflate()
    {
      super.onFinishInflate();
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
    }
    
    protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      b.d();
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      if (paramInt == 4)
      {
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            b.clearFocus();
            b.setImeVisibility(false);
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      super.onWindowFocusChanged(paramBoolean);
      SearchView.a locala;
      if ((paramBoolean) && (b.hasFocus()) && (getVisibility() == 0))
      {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        if (SearchView.a(getContext()))
        {
          locala = SearchView.i;
          if (c == null) {}
        }
      }
      try
      {
        c.invoke(this, new Object[] { Boolean.valueOf(true) });
        return;
      }
      catch (Exception localException) {}
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence paramCharSequence) {}
    
    void setSearchView(SearchView paramSearchView)
    {
      b = paramSearchView;
    }
    
    public void setThreshold(int paramInt)
    {
      super.setThreshold(paramInt);
      a = paramInt;
    }
  }
  
  private static final class a
  {
    Method a;
    Method b;
    Method c;
    private Method d;
    
    a()
    {
      try
      {
        a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        a.setAccessible(true);
        try
        {
          b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
          b.setAccessible(true);
          try
          {
            c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
            c.setAccessible(true);
            try
            {
              d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[] { Integer.TYPE, ResultReceiver.class });
              d.setAccessible(true);
              return;
            }
            catch (NoSuchMethodException localNoSuchMethodException1) {}
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            for (;;) {}
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          for (;;) {}
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException4)
      {
        for (;;) {}
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean a();
  }
  
  public static abstract interface c {}
  
  public static abstract interface d {}
  
  static final class e
    extends android.support.v4.h.a
  {
    public static final Parcelable.Creator<e> CREATOR = b.a(new android.support.v4.f.c() {});
    boolean a;
    
    public e(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      a = ((Boolean)paramParcel.readValue(null)).booleanValue();
    }
    
    e(Parcelable paramParcelable)
    {
      super();
    }
    
    public final String toString()
    {
      return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + a + "}";
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeValue(Boolean.valueOf(a));
    }
  }
  
  private static final class f
    extends TouchDelegate
  {
    private final View a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final int e;
    private boolean f;
    
    public f(Rect paramRect1, Rect paramRect2, View paramView)
    {
      super(paramView);
      e = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      b = new Rect();
      d = new Rect();
      c = new Rect();
      a(paramRect1, paramRect2);
      a = paramView;
    }
    
    public final void a(Rect paramRect1, Rect paramRect2)
    {
      b.set(paramRect1);
      d.set(paramRect1);
      d.inset(-e, -e);
      c.set(paramRect2);
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int j = 1;
      boolean bool2 = false;
      int k = (int)paramMotionEvent.getX();
      int m = (int)paramMotionEvent.getY();
      boolean bool1;
      int i;
      switch (paramMotionEvent.getAction())
      {
      default: 
        bool1 = false;
        i = j;
        label57:
        if (bool1)
        {
          if ((i == 0) || (c.contains(k, m))) {
            break label206;
          }
          paramMotionEvent.setLocation(a.getWidth() / 2, a.getHeight() / 2);
        }
        break;
      }
      for (;;)
      {
        bool2 = a.dispatchTouchEvent(paramMotionEvent);
        return bool2;
        if (!b.contains(k, m)) {
          break;
        }
        f = true;
        bool1 = true;
        i = j;
        break label57;
        boolean bool3 = f;
        i = j;
        bool1 = bool3;
        if (!bool3) {
          break label57;
        }
        i = j;
        bool1 = bool3;
        if (d.contains(k, m)) {
          break label57;
        }
        i = 0;
        bool1 = bool3;
        break label57;
        bool1 = f;
        f = false;
        i = j;
        break label57;
        label206:
        paramMotionEvent.setLocation(k - c.left, m - c.top);
      }
    }
  }
}


/* Location:              android/support/v7/widget/SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */