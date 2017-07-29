package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.h.w;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.j;
import android.support.v7.widget.bf;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
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
    this(paramContext, paramAttributeSet, i1);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    Object localObject1 = getContext();
    Object localObject2 = a.j.MenuView;
    localObject1 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int i1 = a.j.MenuView_android_itemBackground;
    localObject2 = ((bf)localObject1).a(i1);
    h = ((Drawable)localObject2);
    i1 = a.j.MenuView_android_itemTextAppearance;
    i1 = ((bf)localObject1).g(i1, -1);
    i = i1;
    i1 = a.j.MenuView_preserveIconSpacing;
    boolean bool = ((bf)localObject1).a(i1, false);
    k = bool;
    j = paramContext;
    int i2 = a.j.MenuView_subMenuArrow;
    localObject2 = ((bf)localObject1).a(i2);
    l = ((Drawable)localObject2);
    a.recycle();
  }
  
  private void b()
  {
    Object localObject = getInflater();
    int i1 = a.g.abc_list_menu_item_radio;
    localObject = (RadioButton)((LayoutInflater)localObject).inflate(i1, this, false);
    c = ((RadioButton)localObject);
    localObject = c;
    addView((View)localObject);
  }
  
  private void c()
  {
    Object localObject = getInflater();
    int i1 = a.g.abc_list_menu_item_checkbox;
    localObject = (CheckBox)((LayoutInflater)localObject).inflate(i1, this, false);
    e = ((CheckBox)localObject);
    localObject = e;
    addView((View)localObject);
  }
  
  private LayoutInflater getInflater()
  {
    LayoutInflater localLayoutInflater = n;
    if (localLayoutInflater == null)
    {
      localLayoutInflater = LayoutInflater.from(getContext());
      n = localLayoutInflater;
    }
    return n;
  }
  
  private void setShortcut$25d965e(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean)
    {
      localObject = a;
      boolean bool = ((j)localObject).d();
      if (bool)
      {
        bool = false;
        localObject = null;
      }
    }
    int i1;
    for (int i2 = 0;; i2 = i1)
    {
      if (i2 == 0)
      {
        TextView localTextView = f;
        localObject = a;
        i1 = ((j)localObject).c();
        if (i1 != 0) {
          break;
        }
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      localObject = f;
      i1 = ((TextView)localObject).getVisibility();
      if (i1 != i2)
      {
        localObject = f;
        ((TextView)localObject).setVisibility(i2);
      }
      return;
      i1 = 8;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    String str = j.f;
    localStringBuilder.<init>(str);
    switch (i1)
    {
    default: 
      localStringBuilder.append(i1);
    }
    for (;;)
    {
      localObject = localStringBuilder.toString();
      break;
      localObject = j.g;
      localStringBuilder.append((String)localObject);
      continue;
      localObject = j.h;
      localStringBuilder.append((String)localObject);
      continue;
      localObject = j.i;
      localStringBuilder.append((String)localObject);
    }
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView1 = g;
    ImageView localImageView2;
    int i1;
    if (localImageView1 != null)
    {
      localImageView2 = g;
      if (!paramBoolean) {
        break label30;
      }
      i1 = 0;
      localImageView1 = null;
    }
    for (;;)
    {
      localImageView2.setVisibility(i1);
      return;
      label30:
      i1 = 8;
    }
  }
  
  public final void a(j paramj)
  {
    int i1 = 8;
    int i2 = 0;
    a = paramj;
    m = 0;
    int i3 = paramj.isVisible();
    Object localObject;
    if (i3 != 0)
    {
      i3 = 0;
      localObject = null;
      setVisibility(i3);
      localObject = paramj.a(this);
      setTitle((CharSequence)localObject);
      boolean bool = paramj.isCheckable();
      setCheckable(bool);
      bool = paramj.d();
      paramj.c();
      if (!bool) {
        break label210;
      }
      localObject = a;
      bool = ((j)localObject).d();
      if (!bool) {
        break label210;
      }
    }
    int i5;
    for (;;)
    {
      if (i2 == 0)
      {
        TextView localTextView = f;
        localObject = a;
        i4 = ((j)localObject).c();
        if (i4 != 0) {
          break label215;
        }
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      localObject = f;
      int i4 = ((TextView)localObject).getVisibility();
      if (i4 != i2)
      {
        localObject = f;
        ((TextView)localObject).setVisibility(i2);
      }
      localObject = paramj.getIcon();
      setIcon((Drawable)localObject);
      i5 = paramj.isEnabled();
      setEnabled(i5);
      i5 = paramj.hasSubMenu();
      setSubMenuArrowVisible(i5);
      return;
      i5 = i1;
      break;
      label210:
      i2 = i1;
    }
    label215:
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    String str = j.f;
    localStringBuilder.<init>(str);
    switch (i5)
    {
    default: 
      localStringBuilder.append(i5);
    }
    for (;;)
    {
      localObject = localStringBuilder.toString();
      break;
      localObject = j.g;
      localStringBuilder.append((String)localObject);
      continue;
      localObject = j.h;
      localStringBuilder.append((String)localObject);
      continue;
      localObject = j.i;
      localStringBuilder.append((String)localObject);
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
    Object localObject1 = h;
    w.a(this, (Drawable)localObject1);
    int i1 = a.f.title;
    localObject1 = (TextView)findViewById(i1);
    d = ((TextView)localObject1);
    i1 = i;
    int i2 = -1;
    Object localObject2;
    if (i1 != i2)
    {
      localObject1 = d;
      localObject2 = j;
      int i3 = i;
      ((TextView)localObject1).setTextAppearance((Context)localObject2, i3);
    }
    i1 = a.f.shortcut;
    localObject1 = (TextView)findViewById(i1);
    f = ((TextView)localObject1);
    i1 = a.f.submenuarrow;
    localObject1 = (ImageView)findViewById(i1);
    g = ((ImageView)localObject1);
    localObject1 = g;
    if (localObject1 != null)
    {
      localObject1 = g;
      localObject2 = l;
      ((ImageView)localObject1).setImageDrawable((Drawable)localObject2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = b;
    if (localObject != null)
    {
      boolean bool = k;
      if (bool)
      {
        ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
        localObject = (LinearLayout.LayoutParams)b.getLayoutParams();
        int i1 = height;
        if (i1 > 0)
        {
          i1 = width;
          if (i1 <= 0)
          {
            int i2 = height;
            width = i2;
          }
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    int i1 = 8;
    Object localObject1;
    if (!paramBoolean)
    {
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = e;
        if (localObject1 != null) {}
      }
    }
    for (;;)
    {
      return;
      localObject1 = a;
      int i2 = ((j)localObject1).e();
      Object localObject2;
      Object localObject3;
      if (i2 != 0)
      {
        localObject1 = c;
        if (localObject1 == null) {
          b();
        }
        localObject2 = c;
        localObject1 = e;
        localObject3 = localObject2;
        localObject2 = localObject1;
        label73:
        if (!paramBoolean) {
          break label192;
        }
        localObject1 = a;
        i2 = ((j)localObject1).isChecked();
        ((CompoundButton)localObject3).setChecked(i2);
        if (!paramBoolean) {
          break label186;
        }
        i2 = 0;
        localObject1 = null;
      }
      for (;;)
      {
        int i4 = ((CompoundButton)localObject3).getVisibility();
        if (i4 != i2) {
          ((CompoundButton)localObject3).setVisibility(i2);
        }
        if (localObject2 == null) {
          break;
        }
        int i3 = ((CompoundButton)localObject2).getVisibility();
        if (i3 == i1) {
          break;
        }
        ((CompoundButton)localObject2).setVisibility(i1);
        break;
        localObject1 = e;
        if (localObject1 == null) {
          c();
        }
        localObject2 = e;
        localObject1 = c;
        localObject3 = localObject2;
        localObject2 = localObject1;
        break label73;
        label186:
        i3 = i1;
      }
      label192:
      localObject1 = e;
      if (localObject1 != null)
      {
        localObject1 = e;
        ((CheckBox)localObject1).setVisibility(i1);
      }
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject1 = c;
        ((RadioButton)localObject1).setVisibility(i1);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object localObject = a;
    boolean bool = ((j)localObject).e();
    if (bool)
    {
      localObject = c;
      if (localObject == null) {
        b();
      }
    }
    for (localObject = c;; localObject = e)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      localObject = e;
      if (localObject == null) {
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
    Object localObject = a.b;
    boolean bool1 = i;
    boolean bool2;
    if (!bool1)
    {
      bool1 = o;
      if (!bool1) {}
    }
    else
    {
      bool1 = true;
      bool2 = bool1;
      if (bool2) {
        break label52;
      }
      bool1 = k;
      if (bool1) {
        break label52;
      }
    }
    for (;;)
    {
      return;
      bool2 = false;
      break;
      label52:
      localObject = b;
      if ((localObject == null) && (paramDrawable == null))
      {
        bool1 = k;
        if (!bool1) {}
      }
      else
      {
        localObject = b;
        if (localObject == null)
        {
          localObject = getInflater();
          int i3 = a.g.abc_list_menu_item_icon;
          localObject = (ImageView)((LayoutInflater)localObject).inflate(i3, this, false);
          b = ((ImageView)localObject);
          localObject = b;
          addView((View)localObject, 0);
        }
        if (paramDrawable == null)
        {
          bool1 = k;
          if (!bool1) {}
        }
        else
        {
          localObject = b;
          if (bool2) {}
          for (;;)
          {
            ((ImageView)localObject).setImageDrawable(paramDrawable);
            localObject = b;
            int i1 = ((ImageView)localObject).getVisibility();
            if (i1 == 0) {
              break;
            }
            localObject = b;
            ((ImageView)localObject).setVisibility(0);
            break;
            paramDrawable = null;
          }
        }
        localObject = b;
        int i2 = 8;
        ((ImageView)localObject).setVisibility(i2);
      }
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    int i1 = 8;
    TextView localTextView;
    int i2;
    if (paramCharSequence != null)
    {
      d.setText(paramCharSequence);
      localTextView = d;
      i2 = localTextView.getVisibility();
      if (i2 != 0)
      {
        localTextView = d;
        i1 = 0;
        localTextView.setVisibility(0);
      }
    }
    for (;;)
    {
      return;
      localTextView = d;
      i2 = localTextView.getVisibility();
      if (i2 != i1)
      {
        localTextView = d;
        localTextView.setVisibility(i1);
      }
    }
  }
}


/* Location:              android/support/v7/view/menu/ListMenuItemView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */