package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public final class d$a
{
  public final AlertController.a a;
  private final int b;
  
  public d$a(Context paramContext)
  {
    this(paramContext, i);
  }
  
  private d$a(Context paramContext, int paramInt)
  {
    AlertController.a locala = new android/support/v7/app/AlertController$a;
    ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
    int i = d.a(paramContext, paramInt);
    localContextThemeWrapper.<init>(paramContext, i);
    locala.<init>(localContextThemeWrapper);
    a = locala;
    b = paramInt;
  }
  
  public final d a()
  {
    d locald = new android/support/v7/app/d;
    Object localObject1 = this;
    Object localObject2 = a.a;
    int i = b;
    localObject1 = locald;
    locald.<init>((Context)localObject2, i);
    localObject1 = this;
    AlertController.a locala = a;
    localObject1 = locald;
    AlertController localAlertController = a;
    localObject2 = g;
    Object localObject3;
    Object localObject4;
    int i2;
    int i3;
    int i4;
    AlertController.RecycleListView localRecycleListView;
    label373:
    label421:
    label465:
    label472:
    boolean bool2;
    if (localObject2 != null)
    {
      localObject2 = g;
      C = ((View)localObject2);
      localObject2 = h;
      if (localObject2 != null)
      {
        localObject2 = h;
        e = ((CharSequence)localObject2);
        localObject3 = B;
        if (localObject3 != null)
        {
          localObject3 = B;
          ((TextView)localObject3).setText((CharSequence)localObject2);
        }
      }
      localObject2 = i;
      int j;
      if (localObject2 != null)
      {
        j = -1;
        localObject3 = i;
        localObject4 = j;
        i2 = 0;
        arrayOfCharSequence = null;
        localAlertController.a(j, (CharSequence)localObject3, (DialogInterface.OnClickListener)localObject4, null);
      }
      localObject2 = k;
      if (localObject2 != null)
      {
        j = -2;
        localObject3 = k;
        localObject4 = l;
        i2 = 0;
        arrayOfCharSequence = null;
        localAlertController.a(j, (CharSequence)localObject3, (DialogInterface.OnClickListener)localObject4, null);
      }
      localObject2 = m;
      if (localObject2 != null)
      {
        j = -3;
        localObject3 = m;
        localObject4 = n;
        i2 = 0;
        arrayOfCharSequence = null;
        localAlertController.a(j, (CharSequence)localObject3, (DialogInterface.OnClickListener)localObject4, null);
      }
      localObject2 = s;
      if (localObject2 == null)
      {
        localObject2 = H;
        if (localObject2 == null)
        {
          localObject2 = t;
          if (localObject2 == null) {
            break label472;
          }
        }
      }
      localObject2 = b;
      i3 = H;
      i4 = 0;
      localObject4 = null;
      localRecycleListView = (AlertController.RecycleListView)((LayoutInflater)localObject2).inflate(i3, null);
      boolean bool1 = D;
      if (!bool1) {
        break label950;
      }
      localObject2 = H;
      if (localObject2 != null) {
        break label910;
      }
      localObject2 = new android/support/v7/app/AlertController$a$1;
      localObject3 = a;
      i4 = I;
      CharSequence[] arrayOfCharSequence = s;
      ((AlertController.a.1)localObject2).<init>(locala, (Context)localObject3, i4, arrayOfCharSequence, localRecycleListView);
      D = ((ListAdapter)localObject2);
      int k = F;
      E = k;
      localObject2 = u;
      if (localObject2 == null) {
        break label1115;
      }
      localObject2 = new android/support/v7/app/AlertController$a$3;
      ((AlertController.a.3)localObject2).<init>(locala, localAlertController);
      localRecycleListView.setOnItemClickListener((AdapterView.OnItemClickListener)localObject2);
      localObject2 = K;
      if (localObject2 != null)
      {
        localObject2 = K;
        localRecycleListView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject2);
      }
      int m = E;
      if (m == 0) {
        break label1148;
      }
      m = 1;
      localRecycleListView.setChoiceMode(m);
      f = localRecycleListView;
      localObject2 = w;
      if (localObject2 == null) {
        break label1205;
      }
      bool2 = B;
      if (!bool2) {
        break label1173;
      }
      localObject2 = w;
      i3 = x;
      i4 = y;
      i2 = z;
      i = A;
      g = ((View)localObject2);
      localObject2 = null;
      h = 0;
      bool2 = true;
      m = bool2;
      i = i3;
      j = i4;
      k = i2;
      l = i;
    }
    for (;;)
    {
      localObject1 = this;
      bool2 = a.o;
      localObject1 = locald;
      locald.setCancelable(bool2);
      localObject1 = this;
      localObject2 = a;
      bool2 = o;
      if (bool2)
      {
        bool2 = true;
        localObject1 = locald;
        locald.setCanceledOnTouchOutside(bool2);
      }
      localObject1 = this;
      localObject2 = a.p;
      localObject1 = locald;
      locald.setOnCancelListener((DialogInterface.OnCancelListener)localObject2);
      localObject1 = this;
      localObject2 = a.q;
      localObject1 = locald;
      locald.setOnDismissListener((DialogInterface.OnDismissListener)localObject2);
      localObject1 = this;
      localObject2 = a.r;
      if (localObject2 != null)
      {
        localObject2 = a.r;
        localObject1 = locald;
        locald.setOnKeyListener((DialogInterface.OnKeyListener)localObject2);
      }
      return locald;
      localObject2 = f;
      if (localObject2 != null)
      {
        localObject2 = f;
        localAlertController.a((CharSequence)localObject2);
      }
      localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = d;
        y = ((Drawable)localObject2);
        i3 = 0;
        x = 0;
        localObject3 = z;
        if (localObject3 != null)
        {
          if (localObject2 == null) {
            break label891;
          }
          localObject3 = z;
          i4 = 0;
          localObject4 = null;
          ((ImageView)localObject3).setVisibility(0);
          localObject3 = z;
          ((ImageView)localObject3).setImageDrawable((Drawable)localObject2);
        }
      }
      for (;;)
      {
        int n = c;
        if (n != 0)
        {
          n = c;
          localAlertController.a(n);
        }
        n = e;
        if (n == 0) {
          break;
        }
        n = e;
        localObject3 = new android/util/TypedValue;
        ((TypedValue)localObject3).<init>();
        localObject4 = a.getTheme();
        i2 = 1;
        ((Resources.Theme)localObject4).resolveAttribute(n, (TypedValue)localObject3, i2);
        n = resourceId;
        localAlertController.a(n);
        break;
        label891:
        localObject2 = z;
        i3 = 8;
        ((ImageView)localObject2).setVisibility(i3);
      }
      label910:
      AlertController.a.2 local2 = new android/support/v7/app/AlertController$a$2;
      Context localContext1 = a;
      Cursor localCursor1 = H;
      local2.<init>(locala, localContext1, localCursor1, localRecycleListView, localAlertController);
      localObject2 = local2;
      break label373;
      label950:
      boolean bool3 = E;
      if (bool3) {}
      for (int i5 = J;; i5 = K)
      {
        localObject2 = H;
        if (localObject2 == null) {
          break label1065;
        }
        SimpleCursorAdapter localSimpleCursorAdapter = new android/widget/SimpleCursorAdapter;
        Context localContext2 = a;
        Cursor localCursor2 = H;
        localObject1 = new String[1];
        Object localObject5 = localObject1;
        localObject3 = I;
        localObject1[0] = localObject3;
        localObject1 = new int[1];
        bool3 = false;
        i3 = 16908308;
        localObject1[0] = i3;
        localSimpleCursorAdapter.<init>(localContext2, i5, localCursor2, (String[])localObject5, (int[])localObject1);
        localObject2 = localSimpleCursorAdapter;
        break;
      }
      label1065:
      localObject2 = t;
      if (localObject2 != null)
      {
        localObject2 = t;
        break label373;
      }
      localObject2 = new android/support/v7/app/AlertController$c;
      localObject3 = a;
      localObject4 = s;
      ((AlertController.c)localObject2).<init>((Context)localObject3, i5, (CharSequence[])localObject4);
      break label373;
      label1115:
      localObject2 = G;
      if (localObject2 == null) {
        break label421;
      }
      localObject2 = new android/support/v7/app/AlertController$a$4;
      ((AlertController.a.4)localObject2).<init>(locala, localRecycleListView, localAlertController);
      localRecycleListView.setOnItemClickListener((AdapterView.OnItemClickListener)localObject2);
      break label421;
      label1148:
      bool3 = D;
      if (!bool3) {
        break label465;
      }
      int i1 = 2;
      localRecycleListView.setChoiceMode(i1);
      break label465;
      label1173:
      localObject2 = w;
      g = ((View)localObject2);
      h = 0;
      i1 = 0;
      localObject2 = null;
      m = false;
      continue;
      label1205:
      i1 = v;
      if (i1 != 0)
      {
        i1 = v;
        i = 0;
        locala = null;
        g = null;
        h = i1;
        i1 = 0;
        localObject2 = null;
        m = false;
      }
    }
  }
}


/* Location:              android/support/v7/app/d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */