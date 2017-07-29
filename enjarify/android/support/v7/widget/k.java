package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public final class k
  extends CheckedTextView
{
  private static final int[] a;
  private z b;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843016;
    a = arrayOfInt;
  }
  
  public k(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, (byte)0);
  }
  
  private k(Context paramContext, AttributeSet paramAttributeSet, byte paramByte)
  {
    super((Context)localObject1, paramAttributeSet, i);
    localObject1 = z.a(this);
    b = ((z)localObject1);
    b.a(paramAttributeSet, i);
    b.a();
    localObject1 = getContext();
    Object localObject2 = a;
    localObject1 = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject2, i, 0);
    localObject2 = ((bf)localObject1).a(0);
    setCheckMarkDrawable((Drawable)localObject2);
    a.recycle();
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    z localz = b;
    if (localz != null)
    {
      localz = b;
      localz.a();
    }
  }
  
  public final void setCheckMarkDrawable(int paramInt)
  {
    Drawable localDrawable = b.b(getContext(), paramInt);
    setCheckMarkDrawable(localDrawable);
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    z localz = b;
    if (localz != null)
    {
      localz = b;
      localz.a(paramContext, paramInt);
    }
  }
}


/* Location:              android/support/v7/widget/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */