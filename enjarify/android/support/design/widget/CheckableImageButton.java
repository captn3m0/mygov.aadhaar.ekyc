package android.support.design.widget;

import android.content.Context;
import android.support.v4.h.w;
import android.support.v7.widget.o;
import android.util.AttributeSet;
import android.widget.Checkable;

public class CheckableImageButton
  extends o
  implements Checkable
{
  private static final int[] a;
  private boolean b;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842912;
    a = arrayOfInt;
  }
  
  public CheckableImageButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    CheckableImageButton.1 local1 = new android/support/design/widget/CheckableImageButton$1;
    local1.<init>(this);
    w.a(this, local1);
  }
  
  public boolean isChecked()
  {
    return b;
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    boolean bool = b;
    int[] arrayOfInt2;
    if (bool)
    {
      int i = a.length + paramInt;
      arrayOfInt1 = super.onCreateDrawableState(i);
      arrayOfInt2 = a;
    }
    for (int[] arrayOfInt1 = mergeDrawableStates(arrayOfInt1, arrayOfInt2);; arrayOfInt1 = super.onCreateDrawableState(paramInt)) {
      return arrayOfInt1;
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    boolean bool = b;
    if (bool != paramBoolean)
    {
      b = paramBoolean;
      refreshDrawableState();
      int i = 2048;
      sendAccessibilityEvent(i);
    }
  }
  
  public void toggle()
  {
    boolean bool = b;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}


/* Location:              android/support/design/widget/CheckableImageButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */