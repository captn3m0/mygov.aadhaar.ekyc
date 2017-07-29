package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.h.w;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public final class d
  extends n
  implements DialogInterface
{
  final AlertController a = new AlertController(getContext(), this, getWindow());
  
  protected d(Context paramContext, int paramInt)
  {
    super(paramContext, a(paramContext, paramInt));
  }
  
  static int a(Context paramContext, int paramInt)
  {
    if (paramInt >= 16777216) {
      return paramInt;
    }
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(a.a.alertDialogTheme, localTypedValue, true);
    return resourceId;
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    AlertController localAlertController = a;
    int i;
    Object localObject4;
    Object localObject3;
    Object localObject2;
    Object localObject1;
    label108:
    label114:
    label225:
    label360:
    label410:
    label458:
    label506:
    int j;
    label547:
    label564:
    label570:
    label629:
    label646:
    int k;
    label664:
    label679:
    label779:
    int m;
    label825:
    int n;
    if ((G != 0) && (M == 1))
    {
      i = G;
      b.setContentView(i);
      paramBundle = c.findViewById(a.f.parentPanel);
      localObject4 = paramBundle.findViewById(a.f.topPanel);
      localObject3 = paramBundle.findViewById(a.f.contentPanel);
      localObject2 = paramBundle.findViewById(a.f.buttonPanel);
      localObject1 = (ViewGroup)paramBundle.findViewById(a.f.customPanel);
      if (g == null) {
        break label1013;
      }
      paramBundle = g;
      if (paramBundle == null) {
        break label1049;
      }
      i = 1;
      if ((i == 0) || (!AlertController.a(paramBundle))) {
        c.setFlags(131072, 131072);
      }
      if (i == 0) {
        break label1054;
      }
      Object localObject5 = (FrameLayout)c.findViewById(a.f.custom);
      ((FrameLayout)localObject5).addView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
      if (m) {
        ((FrameLayout)localObject5).setPadding(i, j, k, l);
      }
      if (f != null) {
        getLayoutParamsweight = 0.0F;
      }
      View localView = ((ViewGroup)localObject1).findViewById(a.f.topPanel);
      localObject5 = ((ViewGroup)localObject1).findViewById(a.f.contentPanel);
      paramBundle = ((ViewGroup)localObject1).findViewById(a.f.buttonPanel);
      localObject4 = AlertController.a(localView, (View)localObject4);
      localObject3 = AlertController.a((View)localObject5, (View)localObject3);
      paramBundle = AlertController.a(paramBundle, (View)localObject2);
      w = ((NestedScrollView)c.findViewById(a.f.scrollView));
      w.setFocusable(false);
      w.setNestedScrollingEnabled(false);
      B = ((TextView)((ViewGroup)localObject3).findViewById(16908299));
      if (B != null)
      {
        if (e == null) {
          break label1064;
        }
        B.setText(e);
      }
      i = 0;
      n = ((Button)paramBundle.findViewById(16908313));
      n.setOnClickListener(O);
      if (!TextUtils.isEmpty(o)) {
        break label1158;
      }
      n.setVisibility(8);
      q = ((Button)paramBundle.findViewById(16908314));
      q.setOnClickListener(O);
      if (!TextUtils.isEmpty(r)) {
        break label1185;
      }
      q.setVisibility(8);
      t = ((Button)paramBundle.findViewById(16908315));
      t.setOnClickListener(O);
      if (!TextUtils.isEmpty(u)) {
        break label1214;
      }
      t.setVisibility(8);
      localObject2 = a;
      localObject5 = new TypedValue();
      ((Context)localObject2).getTheme().resolveAttribute(a.a.alertDialogCenterButtons, (TypedValue)localObject5, true);
      if (data == 0) {
        break label1243;
      }
      j = 1;
      if (j != 0)
      {
        if (i != 1) {
          break label1248;
        }
        AlertController.a(n);
      }
      if (i == 0) {
        break label1280;
      }
      i = 1;
      if (i == 0) {
        paramBundle.setVisibility(8);
      }
      if (C == null) {
        break label1285;
      }
      localObject2 = new ViewGroup.LayoutParams(-1, -2);
      ((ViewGroup)localObject4).addView(C, 0, (ViewGroup.LayoutParams)localObject2);
      c.findViewById(a.f.title_template).setVisibility(8);
      if ((localObject1 == null) || (((ViewGroup)localObject1).getVisibility() == 8)) {
        break label1503;
      }
      i = 1;
      if ((localObject4 == null) || (((ViewGroup)localObject4).getVisibility() == 8)) {
        break label1508;
      }
      k = 1;
      if ((paramBundle == null) || (paramBundle.getVisibility() == 8)) {
        break label1514;
      }
      j = 1;
      if ((j == 0) && (localObject3 != null))
      {
        paramBundle = ((ViewGroup)localObject3).findViewById(a.f.textSpacerNoButtons);
        if (paramBundle != null) {
          paramBundle.setVisibility(0);
        }
      }
      if (k == 0) {
        break label1519;
      }
      if (w != null) {
        w.setClipToPadding(true);
      }
      localObject1 = null;
      if ((e == null) && (f == null))
      {
        paramBundle = (Bundle)localObject1;
        if (i == 0) {}
      }
      else
      {
        paramBundle = (Bundle)localObject1;
        if (i == 0) {
          paramBundle = ((ViewGroup)localObject4).findViewById(a.f.titleDividerNoCustom);
        }
      }
      if (paramBundle != null) {
        paramBundle.setVisibility(0);
      }
      if ((f instanceof AlertController.RecycleListView))
      {
        paramBundle = (AlertController.RecycleListView)f;
        if ((j == 0) || (k == 0))
        {
          int i1 = paramBundle.getPaddingLeft();
          if (k == 0) {
            break label1545;
          }
          m = paramBundle.getPaddingTop();
          int i2 = paramBundle.getPaddingRight();
          if (j == 0) {
            break label1554;
          }
          n = paramBundle.getPaddingBottom();
          label841:
          paramBundle.setPadding(i1, m, i2, n);
        }
      }
      if (i == 0)
      {
        if (f == null) {
          break label1563;
        }
        paramBundle = f;
        label871:
        if (paramBundle != null)
        {
          if (k == 0) {
            break label1572;
          }
          i = 1;
          label882:
          if (j == 0) {
            break label1577;
          }
          j = 2;
          label888:
          i |= j;
          localObject1 = c.findViewById(a.f.scrollIndicatorUp);
          localObject2 = c.findViewById(a.f.scrollIndicatorDown);
          if (Build.VERSION.SDK_INT < 23) {
            break label1582;
          }
          w.g(paramBundle, i);
          if (localObject1 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject1);
          }
          if (localObject2 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject2);
          }
        }
      }
    }
    for (;;)
    {
      paramBundle = f;
      if ((paramBundle != null) && (D != null))
      {
        paramBundle.setAdapter(D);
        i = E;
        if (i >= 0)
        {
          paramBundle.setItemChecked(i, true);
          paramBundle.setSelection(i);
        }
      }
      return;
      i = F;
      break;
      label1013:
      if (h != 0)
      {
        paramBundle = LayoutInflater.from(a).inflate(h, (ViewGroup)localObject1, false);
        break label108;
      }
      paramBundle = null;
      break label108;
      label1049:
      i = 0;
      break label114;
      label1054:
      ((ViewGroup)localObject1).setVisibility(8);
      break label225;
      label1064:
      B.setVisibility(8);
      w.removeView(B);
      if (f != null)
      {
        localObject2 = (ViewGroup)w.getParent();
        i = ((ViewGroup)localObject2).indexOfChild(w);
        ((ViewGroup)localObject2).removeViewAt(i);
        ((ViewGroup)localObject2).addView(f, i, new ViewGroup.LayoutParams(-1, -1));
        break label360;
      }
      ((ViewGroup)localObject3).setVisibility(8);
      break label360;
      label1158:
      n.setText(o);
      n.setVisibility(0);
      i = 1;
      break label410;
      label1185:
      q.setText(r);
      q.setVisibility(0);
      i |= 0x2;
      break label458;
      label1214:
      t.setText(u);
      t.setVisibility(0);
      i |= 0x4;
      break label506;
      label1243:
      j = 0;
      break label547;
      label1248:
      if (i == 2)
      {
        AlertController.a(q);
        break label564;
      }
      if (i != 4) {
        break label564;
      }
      AlertController.a(t);
      break label564;
      label1280:
      i = 0;
      break label570;
      label1285:
      z = ((ImageView)c.findViewById(16908294));
      if (!TextUtils.isEmpty(d)) {
        i = 1;
      }
      for (;;)
      {
        if ((i != 0) && (L))
        {
          A = ((TextView)c.findViewById(a.f.alertTitle));
          A.setText(d);
          if (x != 0)
          {
            z.setImageResource(x);
            break;
            i = 0;
            continue;
          }
          if (y != null)
          {
            z.setImageDrawable(y);
            break;
          }
          A.setPadding(z.getPaddingLeft(), z.getPaddingTop(), z.getPaddingRight(), z.getPaddingBottom());
          z.setVisibility(8);
          break;
        }
      }
      c.findViewById(a.f.title_template).setVisibility(8);
      z.setVisibility(8);
      ((ViewGroup)localObject4).setVisibility(8);
      break label629;
      label1503:
      i = 0;
      break label646;
      label1508:
      k = 0;
      break label664;
      label1514:
      j = 0;
      break label679;
      label1519:
      if (localObject3 == null) {
        break label779;
      }
      paramBundle = ((ViewGroup)localObject3).findViewById(a.f.textSpacerNoTitle);
      if (paramBundle == null) {
        break label779;
      }
      paramBundle.setVisibility(0);
      break label779;
      label1545:
      m = a;
      break label825;
      label1554:
      n = b;
      break label841;
      label1563:
      paramBundle = w;
      break label871;
      label1572:
      i = 0;
      break label882;
      label1577:
      j = 0;
      break label888;
      label1582:
      paramBundle = (Bundle)localObject1;
      if (localObject1 != null)
      {
        paramBundle = (Bundle)localObject1;
        if ((i & 0x1) == 0)
        {
          ((ViewGroup)localObject3).removeView((View)localObject1);
          paramBundle = null;
        }
      }
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if ((i & 0x2) == 0)
        {
          ((ViewGroup)localObject3).removeView((View)localObject2);
          localObject1 = null;
        }
      }
      if ((paramBundle != null) || (localObject1 != null)) {
        if (e != null)
        {
          w.setOnScrollChangeListener(new AlertController.2(localAlertController, paramBundle, (View)localObject1));
          w.post(new AlertController.3(localAlertController, paramBundle, (View)localObject1));
        }
        else if (f != null)
        {
          f.setOnScrollListener(new AlertController.4(localAlertController, paramBundle, (View)localObject1));
          f.post(new AlertController.5(localAlertController, paramBundle, (View)localObject1));
        }
        else
        {
          if (paramBundle != null) {
            ((ViewGroup)localObject3).removeView(paramBundle);
          }
          if (localObject1 != null) {
            ((ViewGroup)localObject3).removeView((View)localObject1);
          }
        }
      }
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AlertController localAlertController = a;
    if ((w != null) && (w.a(paramKeyEvent))) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AlertController localAlertController = a;
    if ((w != null) && (w.a(paramKeyEvent))) {}
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    a.a(paramCharSequence);
  }
  
  public static final class a
  {
    public final AlertController.a a;
    private final int b;
    
    public a(Context paramContext)
    {
      this(paramContext, d.a(paramContext, 0));
    }
    
    private a(Context paramContext, int paramInt)
    {
      a = new AlertController.a(new ContextThemeWrapper(paramContext, d.a(paramContext, paramInt)));
      b = paramInt;
    }
    
    public final d a()
    {
      d locald = new d(a.a, b);
      AlertController.a locala = a;
      AlertController localAlertController = a;
      Object localObject;
      AlertController.RecycleListView localRecycleListView;
      label255:
      label296:
      label328:
      int i;
      if (g != null)
      {
        C = g;
        if (h != null)
        {
          localObject = h;
          e = ((CharSequence)localObject);
          if (B != null) {
            B.setText((CharSequence)localObject);
          }
        }
        if (i != null) {
          localAlertController.a(-1, i, j, null);
        }
        if (k != null) {
          localAlertController.a(-2, k, l, null);
        }
        if (m != null) {
          localAlertController.a(-3, m, n, null);
        }
        if ((s != null) || (H != null) || (t != null))
        {
          localRecycleListView = (AlertController.RecycleListView)b.inflate(H, null);
          if (!D) {
            break label693;
          }
          if (H != null) {
            break label665;
          }
          localObject = new AlertController.a.1(locala, a, I, s, localRecycleListView);
          D = ((ListAdapter)localObject);
          E = F;
          if (u == null) {
            break label809;
          }
          localRecycleListView.setOnItemClickListener(new AlertController.a.3(locala, localAlertController));
          if (K != null) {
            localRecycleListView.setOnItemSelectedListener(K);
          }
          if (!E) {
            break label838;
          }
          localRecycleListView.setChoiceMode(1);
          f = localRecycleListView;
        }
        if (w == null) {
          break label880;
        }
        if (!B) {
          break label855;
        }
        localObject = w;
        i = x;
        int j = y;
        int k = z;
        int m = A;
        g = ((View)localObject);
        h = 0;
        m = true;
        i = i;
        j = j;
        k = k;
        l = m;
      }
      for (;;)
      {
        locald.setCancelable(a.o);
        if (a.o) {
          locald.setCanceledOnTouchOutside(true);
        }
        locald.setOnCancelListener(a.p);
        locald.setOnDismissListener(a.q);
        if (a.r != null) {
          locald.setOnKeyListener(a.r);
        }
        return locald;
        if (f != null) {
          localAlertController.a(f);
        }
        if (d != null)
        {
          localObject = d;
          y = ((Drawable)localObject);
          x = 0;
          if (z != null)
          {
            if (localObject == null) {
              break label652;
            }
            z.setVisibility(0);
            z.setImageDrawable((Drawable)localObject);
          }
        }
        for (;;)
        {
          if (c != 0) {
            localAlertController.a(c);
          }
          if (e == 0) {
            break;
          }
          i = e;
          localObject = new TypedValue();
          a.getTheme().resolveAttribute(i, (TypedValue)localObject, true);
          localAlertController.a(resourceId);
          break;
          label652:
          z.setVisibility(8);
        }
        label665:
        localObject = new AlertController.a.2(locala, a, H, localRecycleListView, localAlertController);
        break label255;
        label693:
        if (E) {}
        for (i = J;; i = K)
        {
          if (H == null) {
            break label768;
          }
          localObject = new SimpleCursorAdapter(a, i, H, new String[] { I }, new int[] { 16908308 });
          break;
        }
        label768:
        if (t != null)
        {
          localObject = t;
          break label255;
        }
        localObject = new AlertController.c(a, i, s);
        break label255;
        label809:
        if (G == null) {
          break label296;
        }
        localRecycleListView.setOnItemClickListener(new AlertController.a.4(locala, localRecycleListView, localAlertController));
        break label296;
        label838:
        if (!D) {
          break label328;
        }
        localRecycleListView.setChoiceMode(2);
        break label328;
        label855:
        g = w;
        h = 0;
        m = false;
        continue;
        label880:
        if (v != 0)
        {
          i = v;
          g = null;
          h = i;
          m = false;
        }
      }
    }
  }
}


/* Location:              android/support/v7/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */