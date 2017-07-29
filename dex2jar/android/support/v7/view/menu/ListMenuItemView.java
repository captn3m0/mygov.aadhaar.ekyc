package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.j;
import android.support.v7.widget.bf;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView
  extends LinearLayout
  implements p.a
{
  private j a;
  private ImageView b;
  private RadioButton c;
  private TextView d;
  private CheckBox e;
  private TextView f;
  private ImageView g;
  private Drawable h;
  private int i;
  private Context j;
  private boolean k;
  private Drawable l;
  private int m;
  private LayoutInflater n;
  private boolean o;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.listMenuViewStyle);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = bf.a(getContext(), paramAttributeSet, a.j.MenuView, paramInt, 0);
    h = paramAttributeSet.a(a.j.MenuView_android_itemBackground);
    i = paramAttributeSet.g(a.j.MenuView_android_itemTextAppearance, -1);
    k = paramAttributeSet.a(a.j.MenuView_preserveIconSpacing, false);
    j = paramContext;
    l = paramAttributeSet.a(a.j.MenuView_subMenuArrow);
    a.recycle();
  }
  
  private void b()
  {
    c = ((RadioButton)getInflater().inflate(a.g.abc_list_menu_item_radio, this, false));
    addView(c);
  }
  
  private void c()
  {
    e = ((CheckBox)getInflater().inflate(a.g.abc_list_menu_item_checkbox, this, false));
    addView(e);
  }
  
  private LayoutInflater getInflater()
  {
    if (n == null) {
      n = LayoutInflater.from(getContext());
    }
    return n;
  }
  
  private void setShortcut$25d965e(boolean paramBoolean)
  {
    if ((paramBoolean) && (a.d())) {}
    char c1;
    for (int i1 = 0;; i1 = 8)
    {
      if (i1 == 0)
      {
        TextView localTextView = f;
        c1 = a.c();
        if (c1 != 0) {
          break;
        }
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      if (f.getVisibility() != i1) {
        f.setVisibility(i1);
      }
      return;
    }
    Object localObject = new StringBuilder(j.f);
    switch (c1)
    {
    default: 
      ((StringBuilder)localObject).append(c1);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      break;
      ((StringBuilder)localObject).append(j.g);
      continue;
      ((StringBuilder)localObject).append(j.h);
      continue;
      ((StringBuilder)localObject).append(j.i);
    }
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView;
    if (g != null)
    {
      localImageView = g;
      if (!paramBoolean) {
        break label24;
      }
    }
    label24:
    for (int i1 = 0;; i1 = 8)
    {
      localImageView.setVisibility(i1);
      return;
    }
  }
  
  public final void a(j paramj)
  {
    int i2 = 0;
    a = paramj;
    m = 0;
    if (paramj.isVisible())
    {
      i1 = 0;
      setVisibility(i1);
      setTitle(paramj.a(this));
      setCheckable(paramj.isCheckable());
      boolean bool = paramj.d();
      paramj.c();
      if ((!bool) || (!a.d())) {
        break label156;
      }
    }
    char c1;
    label156:
    for (int i1 = i2;; i1 = 8)
    {
      if (i1 == 0)
      {
        TextView localTextView = f;
        c1 = a.c();
        if (c1 != 0) {
          break label162;
        }
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      if (f.getVisibility() != i1) {
        f.setVisibility(i1);
      }
      setIcon(paramj.getIcon());
      setEnabled(paramj.isEnabled());
      setSubMenuArrowVisible(paramj.hasSubMenu());
      return;
      i1 = 8;
      break;
    }
    label162:
    Object localObject = new StringBuilder(j.f);
    switch (c1)
    {
    default: 
      ((StringBuilder)localObject).append(c1);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      break;
      ((StringBuilder)localObject).append(j.g);
      continue;
      ((StringBuilder)localObject).append(j.h);
      continue;
      ((StringBuilder)localObject).append(j.i);
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public j getItemData()
  {
    return a;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    w.a(this, h);
    d = ((TextView)findViewById(a.f.title));
    if (i != -1) {
      d.setTextAppearance(j, i);
    }
    f = ((TextView)findViewById(a.f.shortcut));
    g = ((ImageView)findViewById(a.f.submenuarrow));
    if (g != null) {
      g.setImageDrawable(l);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((b != null) && (k))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)b.getLayoutParams();
      if ((height > 0) && (width <= 0)) {
        width = height;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (c == null) && (e == null)) {}
    label51:
    label133:
    label139:
    do
    {
      return;
      Object localObject1;
      Object localObject2;
      if (a.e())
      {
        if (c == null) {
          b();
        }
        localObject1 = c;
        localObject2 = e;
        if (!paramBoolean) {
          break label139;
        }
        ((CompoundButton)localObject1).setChecked(a.isChecked());
        if (!paramBoolean) {
          break label133;
        }
      }
      for (int i1 = 0;; i1 = 8)
      {
        if (((CompoundButton)localObject1).getVisibility() != i1) {
          ((CompoundButton)localObject1).setVisibility(i1);
        }
        if ((localObject2 == null) || (((CompoundButton)localObject2).getVisibility() == 8)) {
          break;
        }
        ((CompoundButton)localObject2).setVisibility(8);
        return;
        if (e == null) {
          c();
        }
        localObject1 = e;
        localObject2 = c;
        break label51;
      }
      if (e != null) {
        e.setVisibility(8);
      }
    } while (c == null);
    c.setVisibility(8);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    if (a.e()) {
      if (c == null) {
        b();
      }
    }
    for (Object localObject = c;; localObject = e)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      if (e == null) {
        c();
      }
    }
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    o = paramBoolean;
    k = paramBoolean;
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i1;
    if ((a.b.i) || (o))
    {
      i1 = 1;
      if ((i1 != 0) || (k)) {
        break label39;
      }
    }
    label39:
    while ((b == null) && (paramDrawable == null) && (!k))
    {
      return;
      i1 = 0;
      break;
    }
    if (b == null)
    {
      b = ((ImageView)getInflater().inflate(a.g.abc_list_menu_item_icon, this, false));
      addView(b, 0);
    }
    if ((paramDrawable != null) || (k))
    {
      ImageView localImageView = b;
      if (i1 != 0) {}
      for (;;)
      {
        localImageView.setImageDrawable(paramDrawable);
        if (b.getVisibility() == 0) {
          break;
        }
        b.setVisibility(0);
        return;
        paramDrawable = null;
      }
    }
    b.setVisibility(8);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      d.setText(paramCharSequence);
      if (d.getVisibility() != 0) {
        d.setVisibility(0);
      }
    }
    while (d.getVisibility() == 8) {
      return;
    }
    d.setVisibility(8);
  }
}


/* Location:              android/support/v7/view/menu/ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */