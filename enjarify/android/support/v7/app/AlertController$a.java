package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

public final class AlertController$a
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
  public boolean L;
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
  
  public AlertController$a(Context paramContext)
  {
    L = bool;
    a = paramContext;
    o = bool;
    LayoutInflater localLayoutInflater = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    b = localLayoutInflater;
  }
}


/* Location:              android/support/v7/app/AlertController$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */