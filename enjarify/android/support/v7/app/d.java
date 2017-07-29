package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.h.w;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.b;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public final class d
  extends n
  implements DialogInterface
{
  final AlertController a;
  
  protected d(Context paramContext, int paramInt)
  {
    super(paramContext, i);
    AlertController localAlertController = new android/support/v7/app/AlertController;
    Context localContext = getContext();
    Window localWindow = getWindow();
    localAlertController.<init>(localContext, this, localWindow);
    a = localAlertController;
  }
  
  static int a(Context paramContext, int paramInt)
  {
    int i = 16777216;
    if (paramInt >= i) {}
    for (;;)
    {
      return paramInt;
      TypedValue localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      Resources.Theme localTheme = paramContext.getTheme();
      int j = a.a.alertDialogTheme;
      boolean bool = true;
      localTheme.resolveAttribute(j, localTypedValue, bool);
      paramInt = resourceId;
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    AlertController localAlertController = a;
    int i = G;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    label146:
    label154:
    Object localObject7;
    label332:
    ViewGroup localViewGroup1;
    ViewGroup localViewGroup2;
    label519:
    int i10;
    label597:
    label669:
    label741:
    int i11;
    label799:
    label825:
    label833:
    int i8;
    label926:
    float f;
    label956:
    label986:
    int i12;
    label1016:
    int i1;
    label1156:
    int i4;
    label1210:
    label1229:
    label1268:
    label1287:
    int k;
    if (i != 0)
    {
      i = M;
      int m = 1;
      if (i == m)
      {
        i = G;
        b.setContentView(i);
        localObject1 = c;
        m = a.f.parentPanel;
        localObject1 = ((Window)localObject1).findViewById(m);
        m = a.f.topPanel;
        localObject2 = ((View)localObject1).findViewById(m);
        m = a.f.contentPanel;
        localObject3 = ((View)localObject1).findViewById(m);
        m = a.f.buttonPanel;
        localObject4 = ((View)localObject1).findViewById(m);
        m = a.f.customPanel;
        localObject1 = (ViewGroup)((View)localObject1).findViewById(m);
        localObject5 = g;
        if (localObject5 == null) {
          break label1466;
        }
        localObject5 = g;
        localObject6 = localObject5;
        if (localObject6 == null) {
          break label1532;
        }
        m = 1;
        if (m != 0)
        {
          boolean bool3 = AlertController.a((View)localObject6);
          if (bool3) {}
        }
        else
        {
          localObject7 = c;
          i5 = 131072;
          i6 = 131072;
          ((Window)localObject7).setFlags(i5, i6);
        }
        if (m == 0) {
          break label1541;
        }
        localObject5 = c;
        int i3 = a.f.custom;
        localObject5 = (FrameLayout)((Window)localObject5).findViewById(i3);
        localObject7 = new android/view/ViewGroup$LayoutParams;
        int i5 = -1;
        int i6 = -1;
        ((ViewGroup.LayoutParams)localObject7).<init>(i5, i6);
        ((FrameLayout)localObject5).addView((View)localObject6, (ViewGroup.LayoutParams)localObject7);
        boolean bool4 = m;
        if (bool4)
        {
          i7 = i;
          i3 = j;
          i5 = k;
          i6 = l;
          ((FrameLayout)localObject5).setPadding(i7, i3, i5, i6);
        }
        localObject5 = f;
        if (localObject5 != null)
        {
          localObject5 = (LinearLayout.LayoutParams)((ViewGroup)localObject1).getLayoutParams();
          i7 = 0;
          localObject6 = null;
          weight = 0.0F;
        }
        m = a.f.topPanel;
        localObject5 = ((ViewGroup)localObject1).findViewById(m);
        int i7 = a.f.contentPanel;
        localObject6 = ((ViewGroup)localObject1).findViewById(i7);
        i3 = a.f.buttonPanel;
        localObject7 = ((ViewGroup)localObject1).findViewById(i3);
        localViewGroup1 = AlertController.a((View)localObject5, (View)localObject2);
        localViewGroup2 = AlertController.a((View)localObject6, (View)localObject3);
        localObject2 = AlertController.a((View)localObject7, (View)localObject4);
        localObject5 = c;
        i7 = a.f.scrollView;
        localObject5 = (NestedScrollView)((Window)localObject5).findViewById(i7);
        w = ((NestedScrollView)localObject5);
        w.setFocusable(false);
        localObject5 = w;
        i7 = 0;
        localObject6 = null;
        ((NestedScrollView)localObject5).setNestedScrollingEnabled(false);
        m = 16908299;
        localObject5 = (TextView)localViewGroup2.findViewById(m);
        B = ((TextView)localObject5);
        localObject5 = B;
        if (localObject5 != null)
        {
          localObject5 = e;
          if (localObject5 == null) {
            break label1555;
          }
          localObject5 = B;
          localObject6 = e;
          ((TextView)localObject5).setText((CharSequence)localObject6);
        }
        i7 = 0;
        localObject6 = null;
        localObject5 = (Button)((ViewGroup)localObject2).findViewById(16908313);
        n = ((Button)localObject5);
        localObject5 = n;
        localObject3 = O;
        ((Button)localObject5).setOnClickListener((View.OnClickListener)localObject3);
        localObject5 = o;
        boolean bool1 = TextUtils.isEmpty((CharSequence)localObject5);
        if (!bool1) {
          break label1690;
        }
        localObject5 = n;
        i10 = 8;
        ((Button)localObject5).setVisibility(i10);
        localObject5 = (Button)((ViewGroup)localObject2).findViewById(16908314);
        q = ((Button)localObject5);
        localObject5 = q;
        localObject3 = O;
        ((Button)localObject5).setOnClickListener((View.OnClickListener)localObject3);
        localObject5 = r;
        bool1 = TextUtils.isEmpty((CharSequence)localObject5);
        if (!bool1) {
          break label1734;
        }
        localObject5 = q;
        i10 = 8;
        ((Button)localObject5).setVisibility(i10);
        localObject5 = (Button)((ViewGroup)localObject2).findViewById(16908315);
        t = ((Button)localObject5);
        localObject5 = t;
        localObject3 = O;
        ((Button)localObject5).setOnClickListener((View.OnClickListener)localObject3);
        localObject5 = u;
        bool1 = TextUtils.isEmpty((CharSequence)localObject5);
        if (!bool1) {
          break label1780;
        }
        localObject5 = t;
        i10 = 8;
        ((Button)localObject5).setVisibility(i10);
        localObject5 = a;
        localObject3 = new android/util/TypedValue;
        ((TypedValue)localObject3).<init>();
        localObject5 = ((Context)localObject5).getTheme();
        i11 = a.a.alertDialogCenterButtons;
        i3 = 1;
        ((Resources.Theme)localObject5).resolveAttribute(i11, (TypedValue)localObject3, i3);
        int n = data;
        if (n == 0) {
          break label1826;
        }
        n = 1;
        if (n != 0)
        {
          n = 1;
          if (i7 != n) {
            break label1835;
          }
          localObject5 = n;
          AlertController.a((Button)localObject5);
        }
        if (i7 == 0) {
          break label1883;
        }
        n = 1;
        if (n == 0)
        {
          n = 8;
          ((ViewGroup)localObject2).setVisibility(n);
        }
        localObject5 = C;
        if (localObject5 == null) {
          break label1892;
        }
        localObject5 = new android/view/ViewGroup$LayoutParams;
        ((ViewGroup.LayoutParams)localObject5).<init>(-1, -2);
        localObject6 = C;
        i10 = 0;
        localObject3 = null;
        localViewGroup1.addView((View)localObject6, 0, (ViewGroup.LayoutParams)localObject5);
        localObject5 = c;
        i8 = a.f.title_template;
        localObject5 = ((Window)localObject5).findViewById(i8);
        i8 = 8;
        ((View)localObject5).setVisibility(i8);
        if (localObject1 == null) {
          break label2226;
        }
        i = ((ViewGroup)localObject1).getVisibility();
        n = 8;
        if (i == n) {
          break label2226;
        }
        i = 1;
        f = Float.MIN_VALUE;
        i11 = i;
        if (localViewGroup1 == null) {
          break label2243;
        }
        i = localViewGroup1.getVisibility();
        n = 8;
        if (i == n) {
          break label2243;
        }
        i = 1;
        f = Float.MIN_VALUE;
        i10 = i;
        if (localObject2 == null) {
          break label2260;
        }
        i = ((ViewGroup)localObject2).getVisibility();
        n = 8;
        if (i == n) {
          break label2260;
        }
        i = 1;
        f = Float.MIN_VALUE;
        i12 = i;
        if ((i12 == 0) && (localViewGroup2 != null))
        {
          i = a.f.textSpacerNoButtons;
          localObject1 = localViewGroup2.findViewById(i);
          if (localObject1 != null)
          {
            n = 0;
            localObject5 = null;
            ((View)localObject1).setVisibility(0);
          }
        }
        if (i10 == 0) {
          break label2277;
        }
        localObject1 = w;
        if (localObject1 != null)
        {
          localObject1 = w;
          n = 1;
          ((NestedScrollView)localObject1).setClipToPadding(n);
        }
        i = 0;
        f = 0.0F;
        localObject1 = null;
        localObject5 = e;
        if (localObject5 == null)
        {
          localObject5 = f;
          if ((localObject5 == null) && (i11 == 0)) {}
        }
        else if (i11 == 0)
        {
          i = a.f.titleDividerNoCustom;
          localObject1 = localViewGroup1.findViewById(i);
        }
        if (localObject1 != null)
        {
          i1 = 0;
          localObject5 = null;
          ((View)localObject1).setVisibility(0);
        }
        localObject1 = f;
        int j = localObject1 instanceof AlertController.RecycleListView;
        if (j != 0)
        {
          localObject1 = (AlertController.RecycleListView)f;
          if ((i12 == 0) || (i10 == 0))
          {
            i4 = ((AlertController.RecycleListView)localObject1).getPaddingLeft();
            if (i10 == 0) {
              break label2314;
            }
            i1 = ((AlertController.RecycleListView)localObject1).getPaddingTop();
            i5 = ((AlertController.RecycleListView)localObject1).getPaddingRight();
            if (i12 == 0) {
              break label2324;
            }
            i8 = ((AlertController.RecycleListView)localObject1).getPaddingBottom();
            ((AlertController.RecycleListView)localObject1).setPadding(i4, i1, i5, i8);
          }
        }
        if (i11 == 0)
        {
          localObject1 = f;
          if (localObject1 == null) {
            break label2334;
          }
          localObject1 = f;
          localObject6 = localObject1;
          if (localObject6 != null)
          {
            if (i10 == 0) {
              break label2347;
            }
            j = 1;
            f = Float.MIN_VALUE;
            i1 = j;
            if (i12 == 0) {
              break label2364;
            }
            k = 2;
            f = 2.8E-45F;
            label1299:
            i12 = i1 | k;
            localObject1 = c;
            i1 = a.f.scrollIndicatorUp;
            localObject5 = ((Window)localObject1).findViewById(i1);
            localObject1 = c;
            i10 = a.f.scrollIndicatorDown;
            localObject1 = ((Window)localObject1).findViewById(i10);
            i10 = Build.VERSION.SDK_INT;
            i11 = 23;
            if (i10 < i11) {
              break label2375;
            }
            w.g((View)localObject6, i12);
            if (localObject5 != null) {
              localViewGroup2.removeView((View)localObject5);
            }
            if (localObject1 != null) {
              localViewGroup2.removeView((View)localObject1);
            }
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject5 = D;
        if (localObject5 != null)
        {
          localObject5 = D;
          ((ListView)localObject1).setAdapter((ListAdapter)localObject5);
          i1 = E;
          if (i1 >= 0)
          {
            i8 = 1;
            ((ListView)localObject1).setItemChecked(i1, i8);
            ((ListView)localObject1).setSelection(i1);
          }
        }
      }
      return;
      k = F;
      break;
      label1466:
      i1 = h;
      if (i1 != 0)
      {
        localObject5 = LayoutInflater.from(a);
        i9 = h;
        i4 = 0;
        localObject7 = null;
        localObject5 = ((LayoutInflater)localObject5).inflate(i9, (ViewGroup)localObject1, false);
        localObject6 = localObject5;
        break label146;
      }
      i1 = 0;
      localObject5 = null;
      int i9 = 0;
      localObject6 = null;
      break label146;
      label1532:
      i1 = 0;
      localObject5 = null;
      break label154;
      label1541:
      i1 = 8;
      ((ViewGroup)localObject1).setVisibility(i1);
      break label332;
      label1555:
      localObject5 = B;
      i9 = 8;
      ((TextView)localObject5).setVisibility(i9);
      localObject5 = w;
      localObject6 = B;
      ((NestedScrollView)localObject5).removeView((View)localObject6);
      localObject5 = f;
      if (localObject5 != null)
      {
        localObject5 = (ViewGroup)w.getParent();
        localObject6 = w;
        i9 = ((ViewGroup)localObject5).indexOfChild((View)localObject6);
        ((ViewGroup)localObject5).removeViewAt(i9);
        localObject3 = f;
        localObject4 = new android/view/ViewGroup$LayoutParams;
        i4 = -1;
        int i13 = -1;
        ((ViewGroup.LayoutParams)localObject4).<init>(i4, i13);
        ((ViewGroup)localObject5).addView((View)localObject3, i9, (ViewGroup.LayoutParams)localObject4);
        break label519;
      }
      i1 = 8;
      localViewGroup2.setVisibility(i1);
      break label519;
      label1690:
      localObject5 = n;
      localObject6 = o;
      ((Button)localObject5).setText((CharSequence)localObject6);
      localObject5 = n;
      localObject6 = null;
      ((Button)localObject5).setVisibility(0);
      i1 = 1;
      i9 = i1;
      break label597;
      label1734:
      localObject5 = q;
      localObject3 = r;
      ((Button)localObject5).setText((CharSequence)localObject3);
      localObject5 = q;
      i10 = 0;
      localObject3 = null;
      ((Button)localObject5).setVisibility(0);
      i9 |= 0x2;
      break label669;
      label1780:
      localObject5 = t;
      localObject3 = u;
      ((Button)localObject5).setText((CharSequence)localObject3);
      localObject5 = t;
      i10 = 0;
      localObject3 = null;
      ((Button)localObject5).setVisibility(0);
      i9 |= 0x4;
      break label741;
      label1826:
      i1 = 0;
      localObject5 = null;
      break label799;
      label1835:
      i1 = 2;
      if (i9 == i1)
      {
        localObject5 = q;
        AlertController.a((Button)localObject5);
        break label825;
      }
      i1 = 4;
      if (i9 != i1) {
        break label825;
      }
      localObject5 = t;
      AlertController.a((Button)localObject5);
      break label825;
      label1883:
      i1 = 0;
      localObject5 = null;
      break label833;
      label1892:
      localObject5 = c;
      i9 = 16908294;
      localObject5 = (ImageView)((Window)localObject5).findViewById(i9);
      z = ((ImageView)localObject5);
      localObject5 = d;
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject5);
      if (!bool2) {
        bool2 = true;
      }
      for (;;)
      {
        if (bool2)
        {
          bool2 = L;
          if (bool2)
          {
            localObject5 = c;
            i9 = a.f.alertTitle;
            localObject5 = (TextView)((Window)localObject5).findViewById(i9);
            A = ((TextView)localObject5);
            localObject5 = A;
            localObject6 = d;
            ((TextView)localObject5).setText((CharSequence)localObject6);
            i2 = x;
            if (i2 != 0)
            {
              localObject5 = z;
              i9 = x;
              ((ImageView)localObject5).setImageResource(i9);
              break;
              i2 = 0;
              localObject5 = null;
              continue;
            }
            localObject5 = y;
            if (localObject5 != null)
            {
              localObject5 = z;
              localObject6 = y;
              ((ImageView)localObject5).setImageDrawable((Drawable)localObject6);
              break;
            }
            localObject5 = A;
            localObject6 = z;
            i9 = ((ImageView)localObject6).getPaddingLeft();
            localObject3 = z;
            i10 = ((ImageView)localObject3).getPaddingTop();
            localObject4 = z;
            i11 = ((ImageView)localObject4).getPaddingRight();
            localObject7 = z;
            i4 = ((ImageView)localObject7).getPaddingBottom();
            ((TextView)localObject5).setPadding(i9, i10, i11, i4);
            localObject5 = z;
            i9 = 8;
            ((ImageView)localObject5).setVisibility(i9);
            break;
          }
        }
      }
      localObject5 = c;
      i9 = a.f.title_template;
      ((Window)localObject5).findViewById(i9).setVisibility(8);
      localObject5 = z;
      i9 = 8;
      ((ImageView)localObject5).setVisibility(i9);
      int i2 = 8;
      localViewGroup1.setVisibility(i2);
      break label926;
      label2226:
      k = 0;
      f = 0.0F;
      localObject1 = null;
      i11 = 0;
      localObject4 = null;
      break label956;
      label2243:
      k = 0;
      f = 0.0F;
      localObject1 = null;
      i10 = 0;
      localObject3 = null;
      break label986;
      label2260:
      k = 0;
      f = 0.0F;
      localObject1 = null;
      i12 = 0;
      localObject2 = null;
      break label1016;
      label2277:
      if (localViewGroup2 == null) {
        break label1156;
      }
      k = a.f.textSpacerNoTitle;
      localObject1 = localViewGroup2.findViewById(k);
      if (localObject1 == null) {
        break label1156;
      }
      i2 = 0;
      localObject5 = null;
      ((View)localObject1).setVisibility(0);
      break label1156;
      label2314:
      i2 = a;
      break label1210;
      label2324:
      i9 = b;
      break label1229;
      label2334:
      localObject1 = w;
      localObject6 = localObject1;
      break label1268;
      label2347:
      k = 0;
      f = 0.0F;
      localObject1 = null;
      i2 = 0;
      localObject5 = null;
      break label1287;
      label2364:
      k = 0;
      f = 0.0F;
      localObject1 = null;
      break label1299;
      label2375:
      if (localObject5 != null)
      {
        i9 = i12 & 0x1;
        if (i9 == 0)
        {
          localViewGroup2.removeView((View)localObject5);
          i2 = 0;
          localObject5 = null;
        }
      }
      if (localObject1 != null)
      {
        i9 = i12 & 0x2;
        if (i9 == 0)
        {
          localViewGroup2.removeView((View)localObject1);
          k = 0;
          f = 0.0F;
          localObject1 = null;
        }
      }
      if ((localObject5 != null) || (localObject1 != null))
      {
        localObject6 = e;
        if (localObject6 != null)
        {
          localObject6 = w;
          localObject2 = new android/support/v7/app/AlertController$2;
          ((AlertController.2)localObject2).<init>(localAlertController, (View)localObject5, (View)localObject1);
          ((NestedScrollView)localObject6).setOnScrollChangeListener((NestedScrollView.b)localObject2);
          localObject6 = w;
          localObject2 = new android/support/v7/app/AlertController$3;
          ((AlertController.3)localObject2).<init>(localAlertController, (View)localObject5, (View)localObject1);
          ((NestedScrollView)localObject6).post((Runnable)localObject2);
        }
        else
        {
          localObject6 = f;
          if (localObject6 != null)
          {
            localObject6 = f;
            localObject2 = new android/support/v7/app/AlertController$4;
            ((AlertController.4)localObject2).<init>(localAlertController, (View)localObject5, (View)localObject1);
            ((ListView)localObject6).setOnScrollListener((AbsListView.OnScrollListener)localObject2);
            localObject6 = f;
            localObject2 = new android/support/v7/app/AlertController$5;
            ((AlertController.5)localObject2).<init>(localAlertController, (View)localObject5, (View)localObject1);
            ((ListView)localObject6).post((Runnable)localObject2);
          }
          else
          {
            if (localObject5 != null) {
              localViewGroup2.removeView((View)localObject5);
            }
            if (localObject1 != null) {
              localViewGroup2.removeView((View)localObject1);
            }
          }
        }
      }
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    Object localObject = a;
    NestedScrollView localNestedScrollView = w;
    boolean bool2;
    if (localNestedScrollView != null)
    {
      localObject = w;
      bool2 = ((NestedScrollView)localObject).a(paramKeyEvent);
      if (bool2)
      {
        bool2 = bool1;
        if (!bool2) {
          break label59;
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      label59:
      bool1 = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    Object localObject = a;
    NestedScrollView localNestedScrollView = w;
    boolean bool2;
    if (localNestedScrollView != null)
    {
      localObject = w;
      bool2 = ((NestedScrollView)localObject).a(paramKeyEvent);
      if (bool2)
      {
        bool2 = bool1;
        if (!bool2) {
          break label59;
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject = null;
      break;
      label59:
      bool1 = super.onKeyUp(paramInt, paramKeyEvent);
    }
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    a.a(paramCharSequence);
  }
}


/* Location:              android/support/v7/app/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */