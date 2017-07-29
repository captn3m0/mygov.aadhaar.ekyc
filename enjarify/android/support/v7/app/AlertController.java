package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.h.w;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.a.a.a;
import android.support.v7.a.a.j;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

final class AlertController
{
  TextView A;
  TextView B;
  View C;
  ListAdapter D;
  int E = -1;
  int F;
  int G;
  int H;
  int I;
  int J;
  int K;
  boolean L;
  int M = 0;
  Handler N;
  final View.OnClickListener O;
  final Context a;
  final n b;
  final Window c;
  CharSequence d;
  CharSequence e;
  ListView f;
  View g;
  int h;
  int i;
  int j;
  int k;
  int l;
  boolean m = false;
  Button n;
  CharSequence o;
  Message p;
  Button q;
  CharSequence r;
  Message s;
  Button t;
  CharSequence u;
  Message v;
  NestedScrollView w;
  int x = 0;
  Drawable y;
  ImageView z;
  
  public AlertController(Context paramContext, n paramn, Window paramWindow)
  {
    Object localObject = new android/support/v7/app/AlertController$1;
    ((AlertController.1)localObject).<init>(this);
    O = ((View.OnClickListener)localObject);
    a = paramContext;
    b = paramn;
    c = paramWindow;
    localObject = new android/support/v7/app/AlertController$b;
    ((AlertController.b)localObject).<init>(paramn);
    N = ((Handler)localObject);
    int[] arrayOfInt = a.j.AlertDialog;
    int i2 = a.a.alertDialogStyle;
    localObject = paramContext.obtainStyledAttributes(null, arrayOfInt, i2, 0);
    int i3 = a.j.AlertDialog_android_layout;
    i3 = ((TypedArray)localObject).getResourceId(i3, 0);
    F = i3;
    i3 = a.j.AlertDialog_buttonPanelSideLayout;
    i3 = ((TypedArray)localObject).getResourceId(i3, 0);
    G = i3;
    i3 = a.j.AlertDialog_listLayout;
    i3 = ((TypedArray)localObject).getResourceId(i3, 0);
    H = i3;
    i3 = a.j.AlertDialog_multiChoiceItemLayout;
    i3 = ((TypedArray)localObject).getResourceId(i3, 0);
    I = i3;
    i3 = a.j.AlertDialog_singleChoiceItemLayout;
    i3 = ((TypedArray)localObject).getResourceId(i3, 0);
    J = i3;
    i3 = a.j.AlertDialog_listItemLayout;
    i3 = ((TypedArray)localObject).getResourceId(i3, 0);
    K = i3;
    i3 = a.j.AlertDialog_showTitle;
    boolean bool = ((TypedArray)localObject).getBoolean(i3, i1);
    L = bool;
    ((TypedArray)localObject).recycle();
    paramn.a().c(i1);
  }
  
  static ViewGroup a(View paramView1, View paramView2)
  {
    boolean bool1;
    if (paramView1 == null)
    {
      bool1 = paramView2 instanceof ViewStub;
      if (!bool1) {
        break label92;
      }
      paramView2 = (ViewStub)paramView2;
    }
    label92:
    for (Object localObject = paramView2.inflate();; localObject = paramView2)
    {
      localObject = (ViewGroup)localObject;
      return (ViewGroup)localObject;
      if (paramView2 != null)
      {
        localObject = paramView2.getParent();
        boolean bool2 = localObject instanceof ViewGroup;
        if (bool2)
        {
          localObject = (ViewGroup)localObject;
          ((ViewGroup)localObject).removeView(paramView2);
        }
      }
      bool1 = paramView1 instanceof ViewStub;
      if (bool1) {
        paramView1 = (ViewStub)paramView1;
      }
      for (localObject = paramView1.inflate();; localObject = paramView1)
      {
        localObject = (ViewGroup)localObject;
        break;
      }
    }
  }
  
  static void a(View paramView1, View paramView2, View paramView3)
  {
    int i1 = 4;
    int i2 = 0;
    boolean bool;
    if (paramView2 != null)
    {
      int i3 = w.b(paramView1, -1);
      if (i3 != 0)
      {
        i3 = 0;
        paramView2.setVisibility(i3);
      }
    }
    else if (paramView3 != null)
    {
      bool = w.b(paramView1, 1);
      if (!bool) {
        break label59;
      }
    }
    for (;;)
    {
      paramView3.setVisibility(i2);
      return;
      bool = i1;
      break;
      label59:
      i2 = i1;
    }
  }
  
  static void a(Button paramButton)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    gravity = 1;
    weight = 0.5F;
    paramButton.setLayoutParams(localLayoutParams);
  }
  
  static boolean a(View paramView)
  {
    boolean bool1 = true;
    boolean bool2 = paramView.onCheckIsTextEditor();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = paramView instanceof ViewGroup;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramView = (ViewGroup)paramView;
        int i1 = paramView.getChildCount();
        for (;;)
        {
          if (i1 > 0)
          {
            i1 += -1;
            View localView = paramView.getChildAt(i1);
            boolean bool3 = a(localView);
            if (bool3) {
              break;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    y = null;
    x = paramInt;
    ImageView localImageView = z;
    int i1;
    if (localImageView != null)
    {
      if (paramInt == 0) {
        break label47;
      }
      z.setVisibility(0);
      localImageView = z;
      i1 = x;
      localImageView.setImageResource(i1);
    }
    for (;;)
    {
      return;
      label47:
      localImageView = z;
      i1 = 8;
      localImageView.setVisibility(i1);
    }
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    Object localObject;
    if (paramOnClickListener != null)
    {
      localObject = N;
      paramMessage = ((Handler)localObject).obtainMessage(paramInt, paramOnClickListener);
    }
    switch (paramInt)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Button does not exist");
      throw ((Throwable)localObject);
    case -1: 
      o = paramCharSequence;
      p = paramMessage;
    }
    for (;;)
    {
      return;
      r = paramCharSequence;
      s = paramMessage;
      continue;
      u = paramCharSequence;
      v = paramMessage;
    }
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    d = paramCharSequence;
    TextView localTextView = A;
    if (localTextView != null)
    {
      localTextView = A;
      localTextView.setText(paramCharSequence);
    }
  }
}


/* Location:              android/support/v7/app/AlertController.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */