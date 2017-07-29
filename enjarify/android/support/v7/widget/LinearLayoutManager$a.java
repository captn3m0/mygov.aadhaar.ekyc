package android.support.v7.widget;

import android.view.View;

final class LinearLayoutManager$a
{
  int a;
  int b;
  boolean c;
  boolean d;
  
  LinearLayoutManager$a(LinearLayoutManager paramLinearLayoutManager)
  {
    a();
  }
  
  final void a()
  {
    a = -1;
    b = (-1 << -1);
    c = false;
    d = false;
  }
  
  public final void a(View paramView)
  {
    boolean bool = c;
    as localas1;
    int i;
    if (bool)
    {
      localas1 = e.j;
      i = localas1.b(paramView);
      as localas2 = e.j;
      int j = localas2.a();
      i += j;
    }
    for (b = i;; b = i)
    {
      i = LinearLayoutManager.a(paramView);
      a = i;
      return;
      localas1 = e.j;
      i = localas1.a(paramView);
    }
  }
  
  final void b()
  {
    boolean bool = c;
    as localas;
    if (bool) {
      localas = e.j;
    }
    for (int i = localas.c();; i = localas.b())
    {
      b = i;
      return;
      localas = e.j;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("AnchorInfo{mPosition=");
    int i = a;
    localStringBuilder = localStringBuilder.append(i).append(", mCoordinate=");
    i = b;
    localStringBuilder = localStringBuilder.append(i).append(", mLayoutFromEnd=");
    boolean bool = c;
    localStringBuilder = localStringBuilder.append(bool).append(", mValid=");
    bool = d;
    return bool + '}';
  }
}


/* Location:              android/support/v7/widget/LinearLayoutManager$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */