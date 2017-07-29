package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.h.w;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.b;
import android.support.v7.a.a.a;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

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
  final View.OnClickListener O = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if ((paramAnonymousView == n) && (p != null)) {
        paramAnonymousView = Message.obtain(p);
      }
      for (;;)
      {
        if (paramAnonymousView != null) {
          paramAnonymousView.sendToTarget();
        }
        N.obtainMessage(1, b).sendToTarget();
        return;
        if ((paramAnonymousView == q) && (s != null)) {
          paramAnonymousView = Message.obtain(s);
        } else if ((paramAnonymousView == t) && (v != null)) {
          paramAnonymousView = Message.obtain(v);
        } else {
          paramAnonymousView = null;
        }
      }
    }
  };
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
    a = paramContext;
    b = paramn;
    c = paramWindow;
    N = new b(paramn);
    paramContext = paramContext.obtainStyledAttributes(null, a.j.AlertDialog, a.a.alertDialogStyle, 0);
    F = paramContext.getResourceId(a.j.AlertDialog_android_layout, 0);
    G = paramContext.getResourceId(a.j.AlertDialog_buttonPanelSideLayout, 0);
    H = paramContext.getResourceId(a.j.AlertDialog_listLayout, 0);
    I = paramContext.getResourceId(a.j.AlertDialog_multiChoiceItemLayout, 0);
    J = paramContext.getResourceId(a.j.AlertDialog_singleChoiceItemLayout, 0);
    K = paramContext.getResourceId(a.j.AlertDialog_listItemLayout, 0);
    L = paramContext.getBoolean(a.j.AlertDialog_showTitle, true);
    paramContext.recycle();
    paramn.a().c(1);
  }
  
  static ViewGroup a(View paramView1, View paramView2)
  {
    if (paramView1 == null) {
      if (!(paramView2 instanceof ViewStub)) {
        break label71;
      }
    }
    label71:
    for (paramView1 = ((ViewStub)paramView2).inflate();; paramView1 = paramView2)
    {
      return (ViewGroup)paramView1;
      if (paramView2 != null)
      {
        ViewParent localViewParent = paramView2.getParent();
        if ((localViewParent instanceof ViewGroup)) {
          ((ViewGroup)localViewParent).removeView(paramView2);
        }
      }
      if ((paramView1 instanceof ViewStub)) {
        paramView1 = ((ViewStub)paramView1).inflate();
      }
      for (;;)
      {
        return (ViewGroup)paramView1;
      }
    }
  }
  
  static void a(View paramView1, View paramView2, View paramView3)
  {
    int i2 = 0;
    if (paramView2 != null)
    {
      if (w.b(paramView1, -1))
      {
        i1 = 0;
        paramView2.setVisibility(i1);
      }
    }
    else if (paramView3 != null) {
      if (!w.b(paramView1, 1)) {
        break label48;
      }
    }
    label48:
    for (int i1 = i2;; i1 = 4)
    {
      paramView3.setVisibility(i1);
      return;
      i1 = 4;
      break;
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
    if (paramView.onCheckIsTextEditor()) {
      return true;
    }
    if (!(paramView instanceof ViewGroup)) {
      return false;
    }
    paramView = (ViewGroup)paramView;
    int i1 = paramView.getChildCount();
    while (i1 > 0)
    {
      int i2 = i1 - 1;
      i1 = i2;
      if (a(paramView.getChildAt(i2))) {
        return true;
      }
    }
    return false;
  }
  
  public final void a(int paramInt)
  {
    y = null;
    x = paramInt;
    if (z != null)
    {
      if (paramInt != 0)
      {
        z.setVisibility(0);
        z.setImageResource(x);
      }
    }
    else {
      return;
    }
    z.setVisibility(8);
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage)
  {
    if (paramOnClickListener != null) {
      paramMessage = N.obtainMessage(paramInt, paramOnClickListener);
    }
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Button does not exist");
    case -1: 
      o = paramCharSequence;
      p = paramMessage;
      return;
    case -2: 
      r = paramCharSequence;
      s = paramMessage;
      return;
    }
    u = paramCharSequence;
    v = paramMessage;
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    d = paramCharSequence;
    if (A != null) {
      A.setText(paramCharSequence);
    }
  }
  
  public static class RecycleListView
    extends ListView
  {
    final int a;
    final int b;
    
    public RecycleListView(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.RecycleListView);
      b = paramContext.getDimensionPixelOffset(a.j.RecycleListView_paddingBottomNoButtons, -1);
      a = paramContext.getDimensionPixelOffset(a.j.RecycleListView_paddingTopNoTitle, -1);
    }
  }
  
  public static final class a
  {
    public int A;
    public boolean B = false;
    public boolean[] C;
    public boolean D;
    public boolean E;
    public int F = -1;
    public DialogInterface.OnMultiChoiceClickListener G;
    public Cursor H;
    public String I;
    public String J;
    public AdapterView.OnItemSelectedListener K;
    public boolean L = true;
    public final Context a;
    public final LayoutInflater b;
    public int c = 0;
    public Drawable d;
    public int e = 0;
    public CharSequence f;
    public View g;
    public CharSequence h;
    public CharSequence i;
    public DialogInterface.OnClickListener j;
    public CharSequence k;
    public DialogInterface.OnClickListener l;
    public CharSequence m;
    public DialogInterface.OnClickListener n;
    public boolean o;
    public DialogInterface.OnCancelListener p;
    public DialogInterface.OnDismissListener q;
    public DialogInterface.OnKeyListener r;
    public CharSequence[] s;
    public ListAdapter t;
    public DialogInterface.OnClickListener u;
    public int v;
    public View w;
    public int x;
    public int y;
    public int z;
    
    public a(Context paramContext)
    {
      a = paramContext;
      o = true;
      b = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    }
  }
  
  private static final class b
    extends Handler
  {
    private WeakReference<DialogInterface> a;
    
    public b(DialogInterface paramDialogInterface)
    {
      a = new WeakReference(paramDialogInterface);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (what)
      {
      case 0: 
      default: 
        return;
      case -3: 
      case -2: 
      case -1: 
        ((DialogInterface.OnClickListener)obj).onClick((DialogInterface)a.get(), what);
        return;
      }
      ((DialogInterface)obj).dismiss();
    }
  }
  
  private static final class c
    extends ArrayAdapter<CharSequence>
  {
    public c(Context paramContext, int paramInt, CharSequence[] paramArrayOfCharSequence)
    {
      super(paramInt, 16908308, paramArrayOfCharSequence);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final boolean hasStableIds()
    {
      return true;
    }
  }
}


/* Location:              android/support/v7/app/AlertController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */