package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.v4.h.a;
import android.support.v4.widget.d;
import android.support.v7.a.a.d;
import android.support.v7.view.c;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListAdapter;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class SearchView
  extends am
  implements c
{
  static final SearchView.a i;
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
  private final WeakHashMap Q;
  final SearchView.SearchAutoComplete a;
  final ImageView b;
  final ImageView c;
  final ImageView d;
  final ImageView e;
  View.OnFocusChangeListener f;
  d g;
  SearchableInfo h;
  private final View j;
  private final View k;
  private SearchView.f l;
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
  private SearchView.c x;
  private SearchView.b y;
  private SearchView.d z;
  
  static
  {
    SearchView.a locala = new android/support/v7/widget/SearchView$a;
    locala.<init>();
    i = locala;
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = 1;
    int i2 = 8;
    C = paramBoolean;
    Object localObject1;
    Object localObject2;
    boolean bool2;
    label44:
    Object localObject3;
    int i4;
    if (paramBoolean)
    {
      int i3 = 0;
      localObject1 = null;
      localObject2 = a.getText();
      bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool2) {
        break label418;
      }
      bool2 = i1;
      localObject3 = b;
      ((ImageView)localObject3).setVisibility(i3);
      i4 = D;
      if (i4 == 0) {
        break label488;
      }
      i4 = e();
      if (i4 == 0) {
        break label488;
      }
      i4 = hasFocus();
      if (i4 == 0) {
        break label488;
      }
      if (!bool2)
      {
        i4 = I;
        if (i4 != 0) {
          break label488;
        }
      }
      i4 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      c.setVisibility(i4);
      localObject3 = j;
      label134:
      label169:
      int i9;
      label206:
      label236:
      label253:
      label288:
      label301:
      int i7;
      if (paramBoolean)
      {
        i4 = i2;
        ((View)localObject3).setVisibility(i4);
        localObject1 = q.getDrawable();
        if (localObject1 != null)
        {
          i5 = B;
          if (i5 == 0) {
            break label436;
          }
        }
        int i5 = i2;
        localObject3 = q;
        ((ImageView)localObject3).setVisibility(i5);
        localObject1 = a.getText();
        int i6 = TextUtils.isEmpty((CharSequence)localObject1);
        if (i6 != 0) {
          break label445;
        }
        i9 = i1;
        if (i9 == 0)
        {
          i6 = B;
          if (i6 == 0) {
            break label454;
          }
          i6 = K;
          if (i6 != 0) {
            break label454;
          }
        }
        i6 = i1;
        Object localObject4 = d;
        if (i6 == 0) {
          break label463;
        }
        i6 = 0;
        localObject1 = null;
        ((ImageView)localObject4).setVisibility(i6);
        localObject1 = d;
        localObject4 = ((ImageView)localObject1).getDrawable();
        if (localObject4 != null)
        {
          if (i9 == 0) {
            break label469;
          }
          localObject1 = ENABLED_STATE_SET;
          ((Drawable)localObject4).setState((int[])localObject1);
        }
        if (bool2) {
          break label477;
        }
        i7 = I;
        if (i7 == 0) {
          break label482;
        }
        i7 = C;
        if ((i7 != 0) || (i1 == 0)) {
          break label482;
        }
        c.setVisibility(i2);
        i7 = 0;
        localObject1 = null;
      }
      for (;;)
      {
        localObject2 = e;
        ((ImageView)localObject2).setVisibility(i7);
        boolean bool1 = e();
        if (bool1)
        {
          localObject1 = c;
          i8 = ((ImageView)localObject1).getVisibility();
          if (i8 != 0)
          {
            localObject1 = e;
            i8 = ((ImageView)localObject1).getVisibility();
            if (i8 != 0) {}
          }
          else
          {
            i2 = 0;
          }
        }
        k.setVisibility(i2);
        return;
        i8 = i2;
        break;
        label418:
        bool2 = false;
        localObject2 = null;
        break label44;
        i8 = 0;
        localObject1 = null;
        break label134;
        label436:
        i8 = 0;
        localObject1 = null;
        break label169;
        label445:
        i9 = 0;
        localObject3 = null;
        break label206;
        label454:
        i8 = 0;
        localObject1 = null;
        break label236;
        label463:
        i8 = i2;
        break label253;
        label469:
        localObject1 = EMPTY_STATE_SET;
        break label288;
        label477:
        i1 = 0;
        break label301;
        label482:
        i8 = i2;
      }
      label488:
      int i8 = i2;
    }
  }
  
  static boolean a(Context paramContext)
  {
    Configuration localConfiguration = paramContext.getResources().getConfiguration();
    int i1 = orientation;
    int i3 = 2;
    if (i1 == i3) {
      i1 = 1;
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localConfiguration = null;
    }
  }
  
  private boolean e()
  {
    boolean bool = D;
    if (!bool)
    {
      bool = I;
      if (!bool) {}
    }
    else
    {
      bool = C;
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void f()
  {
    Runnable localRunnable = O;
    post(localRunnable);
  }
  
  private void g()
  {
    Object localObject1 = getQueryHint();
    SearchView.SearchAutoComplete localSearchAutoComplete = a;
    if (localObject1 == null) {
      localObject1 = "";
    }
    boolean bool = B;
    Object localObject2;
    if (bool)
    {
      localObject2 = r;
      if (localObject2 != null) {
        break label43;
      }
    }
    for (;;)
    {
      localSearchAutoComplete.setHint((CharSequence)localObject1);
      return;
      label43:
      float f1 = a.getTextSize();
      double d1 = f1;
      double d2 = 1.25D;
      d1 *= d2;
      int i1 = (int)d1;
      r.setBounds(0, 0, i1, i1);
      localObject2 = new android/text/SpannableStringBuilder;
      ((SpannableStringBuilder)localObject2).<init>("   ");
      ImageSpan localImageSpan = new android/text/style/ImageSpan;
      Drawable localDrawable = r;
      localImageSpan.<init>(localDrawable);
      int i2 = 1;
      int i3 = 2;
      int i4 = 33;
      ((SpannableStringBuilder)localObject2).setSpan(localImageSpan, i2, i3, i4);
      ((SpannableStringBuilder)localObject2).append((CharSequence)localObject1);
      localObject1 = localObject2;
    }
  }
  
  private int getPreferredHeight()
  {
    Resources localResources = getContext().getResources();
    int i1 = a.d.abc_search_view_preferred_height;
    return localResources.getDimensionPixelSize(i1);
  }
  
  private int getPreferredWidth()
  {
    Resources localResources = getContext().getResources();
    int i1 = a.d.abc_search_view_preferred_width;
    return localResources.getDimensionPixelSize(i1);
  }
  
  public final void a()
  {
    boolean bool = K;
    if (bool) {}
    for (;;)
    {
      return;
      K = true;
      int i1 = a.getImeOptions();
      L = i1;
      SearchView.SearchAutoComplete localSearchAutoComplete = a;
      int i2 = L;
      int i3 = 33554432;
      i2 |= i3;
      localSearchAutoComplete.setImeOptions(i2);
      localSearchAutoComplete = a;
      String str = "";
      localSearchAutoComplete.setText(str);
      i1 = 0;
      localSearchAutoComplete = null;
      setIconified(false);
    }
  }
  
  public final void b()
  {
    Object localObject = "";
    a.setText((CharSequence)localObject);
    SearchView.SearchAutoComplete localSearchAutoComplete = a;
    int i1 = a.length();
    localSearchAutoComplete.setSelection(i1);
    J = ((CharSequence)localObject);
    clearFocus();
    a(true);
    localObject = a;
    int i2 = L;
    ((SearchView.SearchAutoComplete)localObject).setImeOptions(i2);
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
    boolean bool = C;
    a(bool);
    f();
    Object localObject1 = a;
    bool = ((SearchView.SearchAutoComplete)localObject1).hasFocus();
    if (bool)
    {
      localObject1 = i;
      localSearchAutoComplete = a;
      localObject2 = a;
      if (localObject2 == null) {}
    }
    try
    {
      localObject1 = a;
      localObject2 = null;
      localObject2 = new Object[0];
      ((Method)localObject1).invoke(localSearchAutoComplete, (Object[])localObject2);
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
    localObject1 = i;
    SearchView.SearchAutoComplete localSearchAutoComplete = a;
    Object localObject2 = b;
    if (localObject2 != null) {}
    try
    {
      localObject1 = b;
      localObject2 = null;
      localObject2 = new Object[0];
      ((Method)localObject1).invoke(localSearchAutoComplete, (Object[])localObject2);
      return;
    }
    catch (Exception localException1)
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
    Object localObject = E;
    if (localObject != null) {
      localObject = E;
    }
    for (;;)
    {
      return (CharSequence)localObject;
      localObject = h;
      if (localObject != null)
      {
        localObject = h;
        int i1 = ((SearchableInfo)localObject).getHintId();
        if (i1 != 0)
        {
          localObject = getContext();
          SearchableInfo localSearchableInfo = h;
          int i2 = localSearchableInfo.getHintId();
          localObject = ((Context)localObject).getText(i2);
          continue;
        }
      }
      localObject = w;
    }
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
    Runnable localRunnable = O;
    removeCallbacks(localRunnable);
    localRunnable = P;
    post(localRunnable);
    super.onDetachedFromWindow();
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1;
    Rect localRect;
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = a;
      localRect = m;
      localObject2 = o;
      ((View)localObject1).getLocationInWindow((int[])localObject2);
      localObject2 = p;
      getLocationInWindow((int[])localObject2);
      int i2 = o[i1];
      int i3 = p[i1];
      i2 -= i3;
      Object localObject3 = o;
      i3 = localObject3[0];
      int[] arrayOfInt = p;
      i1 = arrayOfInt[0];
      i3 -= i1;
      i1 = ((View)localObject1).getWidth() + i3;
      int i4 = ((View)localObject1).getHeight() + i2;
      localRect.set(i3, i2, i1, i4);
      localObject1 = n;
      localRect = m;
      int i5 = left;
      localObject2 = m;
      i2 = right;
      i3 = paramInt4 - paramInt2;
      ((Rect)localObject1).set(i5, 0, i2, i3);
      localObject1 = l;
      if (localObject1 != null) {
        break label258;
      }
      localObject1 = new android/support/v7/widget/SearchView$f;
      localRect = n;
      localObject2 = m;
      localObject3 = a;
      ((SearchView.f)localObject1).<init>(localRect, (Rect)localObject2, (View)localObject3);
      l = ((SearchView.f)localObject1);
      localObject1 = l;
      setTouchDelegate((TouchDelegate)localObject1);
    }
    for (;;)
    {
      return;
      label258:
      localObject1 = l;
      localRect = n;
      localObject2 = m;
      ((SearchView.f)localObject1).a(localRect, (Rect)localObject2);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    boolean bool = C;
    if (bool)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i3 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    label72:
    int i4;
    switch (i3)
    {
    default: 
      i4 = View.MeasureSpec.getMode(paramInt2);
      i3 = View.MeasureSpec.getSize(paramInt2);
      switch (i4)
      {
      }
      break;
    }
    for (;;)
    {
      i2 = View.MeasureSpec.makeMeasureSpec(i2, i1);
      i3 = View.MeasureSpec.makeMeasureSpec(i3, i1);
      super.onMeasure(i2, i3);
      break;
      i3 = H;
      if (i3 > 0)
      {
        i3 = H;
        i2 = Math.min(i3, i2);
        break label72;
      }
      i3 = getPreferredWidth();
      i2 = Math.min(i3, i2);
      break label72;
      i3 = H;
      if (i3 <= 0) {
        break label72;
      }
      i3 = H;
      i2 = Math.min(i3, i2);
      break label72;
      i2 = H;
      if (i2 > 0)
      {
        i2 = H;
        break label72;
      }
      i2 = getPreferredWidth();
      break label72;
      i4 = getPreferredHeight();
      i3 = Math.min(i4, i3);
      continue;
      i3 = getPreferredHeight();
    }
  }
  
  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof SearchView.e;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (SearchView.e)paramParcelable;
      Parcelable localParcelable = e;
      super.onRestoreInstanceState(localParcelable);
      bool = a;
      a(bool);
      requestLayout();
    }
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    SearchView.e locale = new android/support/v7/widget/SearchView$e;
    locale.<init>(localParcelable);
    boolean bool = C;
    a = bool;
    return locale;
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    f();
  }
  
  public final boolean requestFocus(int paramInt, Rect paramRect)
  {
    boolean bool1 = false;
    boolean bool2 = G;
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = isFocusable();
      if (bool2)
      {
        bool2 = C;
        if (!bool2)
        {
          SearchView.SearchAutoComplete localSearchAutoComplete = a;
          bool2 = localSearchAutoComplete.requestFocus(paramInt, paramRect);
          if (bool2) {
            a(false);
          }
          bool1 = bool2;
        }
        else
        {
          bool1 = super.requestFocus(paramInt, paramRect);
        }
      }
    }
  }
  
  public final void setAppSearchData(Bundle paramBundle)
  {
    M = paramBundle;
  }
  
  public final void setIconified(boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject;
    boolean bool2;
    if (paramBoolean)
    {
      localObject = a.getText();
      bool2 = TextUtils.isEmpty((CharSequence)localObject);
      if (bool2)
      {
        bool2 = B;
        if (bool2)
        {
          localObject = y;
          if (localObject != null)
          {
            localObject = y;
            bool2 = ((SearchView.b)localObject).a();
            if (bool2) {}
          }
          else
          {
            clearFocus();
            a(bool1);
          }
        }
      }
    }
    for (;;)
    {
      return;
      localObject = a;
      String str = "";
      ((SearchView.SearchAutoComplete)localObject).setText(str);
      localObject = a;
      ((SearchView.SearchAutoComplete)localObject).requestFocus();
      setImeVisibility(bool1);
      continue;
      bool2 = false;
      a(false);
      a.requestFocus();
      setImeVisibility(bool1);
      localObject = A;
      if (localObject != null)
      {
        localObject = A;
        ((View.OnClickListener)localObject).onClick(this);
      }
    }
  }
  
  public final void setIconifiedByDefault(boolean paramBoolean)
  {
    boolean bool = B;
    if (bool == paramBoolean) {}
    for (;;)
    {
      return;
      B = paramBoolean;
      a(paramBoolean);
      g();
    }
  }
  
  public final void setImeOptions(int paramInt)
  {
    a.setImeOptions(paramInt);
  }
  
  final void setImeVisibility(boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = N;
      post((Runnable)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = N;
      removeCallbacks((Runnable)localObject1);
      localObject1 = getContext();
      Object localObject2 = "input_method";
      localObject1 = (InputMethodManager)((Context)localObject1).getSystemService((String)localObject2);
      if (localObject1 != null)
      {
        localObject2 = getWindowToken();
        ((InputMethodManager)localObject1).hideSoftInputFromWindow((IBinder)localObject2, 0);
      }
    }
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
  
  public final void setOnCloseListener(SearchView.b paramb)
  {
    y = paramb;
  }
  
  public final void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    f = paramOnFocusChangeListener;
  }
  
  public final void setOnQueryTextListener(SearchView.c paramc)
  {
    x = paramc;
  }
  
  public final void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    A = paramOnClickListener;
  }
  
  public final void setOnSuggestionListener(SearchView.d paramd)
  {
    z = paramd;
  }
  
  final void setQuery(CharSequence paramCharSequence)
  {
    SearchView.SearchAutoComplete localSearchAutoComplete1 = a;
    localSearchAutoComplete1.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete2 = a;
    int i1 = TextUtils.isEmpty(paramCharSequence);
    if (i1 != 0)
    {
      i1 = 0;
      localSearchAutoComplete1 = null;
    }
    for (;;)
    {
      localSearchAutoComplete2.setSelection(i1);
      return;
      int i2 = paramCharSequence.length();
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
    Object localObject = g;
    boolean bool = localObject instanceof ba;
    if (bool)
    {
      localObject = (ba)g;
      if (!paramBoolean) {
        break label41;
      }
    }
    label41:
    for (int i1 = 2;; i1 = 1)
    {
      j = i1;
      return;
    }
  }
  
  public final void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    int i1 = 65536;
    int i2 = 1;
    h = paramSearchableInfo;
    Object localObject1 = h;
    Object localObject2;
    int i4;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject1 = a;
      int i3 = h.getSuggestThreshold();
      ((SearchView.SearchAutoComplete)localObject1).setThreshold(i3);
      localObject1 = a;
      localObject2 = h;
      i3 = ((SearchableInfo)localObject2).getImeOptions();
      ((SearchView.SearchAutoComplete)localObject1).setImeOptions(i3);
      localObject1 = h;
      int i5 = ((SearchableInfo)localObject1).getInputType();
      i3 = i5 & 0xF;
      if (i3 == i2)
      {
        i3 = -65537;
        i5 &= i3;
        localObject2 = h.getSuggestAuthority();
        if (localObject2 != null)
        {
          i5 |= i1;
          i3 = 524288;
          i5 |= i3;
        }
      }
      localObject2 = a;
      ((SearchView.SearchAutoComplete)localObject2).setInputType(i5);
      localObject1 = g;
      if (localObject1 != null)
      {
        localObject1 = g;
        ((d)localObject1).a(null);
      }
      localObject1 = h.getSuggestAuthority();
      if (localObject1 != null)
      {
        localObject1 = new android/support/v7/widget/ba;
        localObject2 = getContext();
        SearchableInfo localSearchableInfo = h;
        WeakHashMap localWeakHashMap = Q;
        ((ba)localObject1).<init>((Context)localObject2, this, localSearchableInfo, localWeakHashMap);
        g = ((d)localObject1);
        localObject1 = a;
        localObject2 = g;
        ((SearchView.SearchAutoComplete)localObject1).setAdapter((ListAdapter)localObject2);
        localObject1 = (ba)g;
        boolean bool1 = F;
        if (bool1)
        {
          i4 = 2;
          j = i4;
        }
      }
      else
      {
        g();
      }
    }
    else
    {
      localObject1 = h;
      if (localObject1 == null) {
        break label451;
      }
      localObject1 = h;
      bool2 = ((SearchableInfo)localObject1).getVoiceSearchEnabled();
      if (!bool2) {
        break label451;
      }
      localObject1 = h;
      bool2 = ((SearchableInfo)localObject1).getVoiceSearchLaunchWebSearch();
      if (!bool2) {
        break label419;
      }
      localObject1 = u;
    }
    for (;;)
    {
      label337:
      if (localObject1 != null)
      {
        localObject2 = getContext().getPackageManager();
        localObject1 = ((PackageManager)localObject2).resolveActivity((Intent)localObject1, i1);
        if (localObject1 == null) {}
      }
      for (;;)
      {
        I = i2;
        bool2 = I;
        if (bool2)
        {
          localObject1 = a;
          localObject2 = "nm";
          ((SearchView.SearchAutoComplete)localObject1).setPrivateImeOptions((String)localObject2);
        }
        bool2 = C;
        a(bool2);
        return;
        i4 = i2;
        break;
        label419:
        localObject1 = h;
        bool2 = ((SearchableInfo)localObject1).getVoiceSearchLaunchRecognizer();
        if (!bool2) {
          break label456;
        }
        localObject1 = v;
        break label337;
        i2 = 0;
        continue;
        label451:
        i2 = 0;
      }
      label456:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public final void setSubmitButtonEnabled(boolean paramBoolean)
  {
    D = paramBoolean;
    boolean bool = C;
    a(bool);
  }
  
  public final void setSuggestionsAdapter(d paramd)
  {
    g = paramd;
    SearchView.SearchAutoComplete localSearchAutoComplete = a;
    d locald = g;
    localSearchAutoComplete.setAdapter(locald);
  }
}


/* Location:              android/support/v7/widget/SearchView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */