package android.support.design.widget;

import android.content.Context;
import android.support.v4.h.a.b.g;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.widget.o;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton
  extends o
  implements Checkable
{
  private static final int[] a = { 16842912 };
  private boolean b;
  
  public CheckableImageButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.imageButtonStyle);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    w.a(this, new android.support.v4.h.b()
    {
      public final void a(View paramAnonymousView, android.support.v4.h.a.b paramAnonymousb)
      {
        super.a(paramAnonymousView, paramAnonymousb);
        paramAnonymousb.a(true);
        boolean bool = isChecked();
        android.support.v4.h.a.b.a.b(b, bool);
      }
      
      public final void a(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
      {
        super.a(paramAnonymousView, paramAnonymousAccessibilityEvent);
        paramAnonymousAccessibilityEvent.setChecked(isChecked());
      }
    });
  }
  
  public boolean isChecked()
  {
    return b;
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    if (b) {
      return mergeDrawableStates(super.onCreateDrawableState(a.length + paramInt), a);
    }
    return super.onCreateDrawableState(paramInt);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    if (b != paramBoolean)
    {
      b = paramBoolean;
      refreshDrawableState();
      sendAccessibilityEvent(2048);
    }
  }
  
  public void toggle()
  {
    if (!b) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}


/* Location:              android/support/design/widget/CheckableImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */