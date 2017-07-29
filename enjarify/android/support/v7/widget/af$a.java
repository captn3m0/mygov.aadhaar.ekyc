package android.support.v7.widget;

final class af$a
{
  public at.u a;
  public at.u b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  private af$a(at.u paramu1, at.u paramu2)
  {
    a = paramu1;
    b = paramu2;
  }
  
  af$a(at.u paramu1, at.u paramu2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramu1, paramu2);
    c = paramInt1;
    d = paramInt2;
    e = paramInt3;
    f = paramInt4;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("ChangeInfo{oldHolder=");
    at.u localu = a;
    localStringBuilder = localStringBuilder.append(localu).append(", newHolder=");
    localu = b;
    localStringBuilder = localStringBuilder.append(localu).append(", fromX=");
    int i = c;
    localStringBuilder = localStringBuilder.append(i).append(", fromY=");
    i = d;
    localStringBuilder = localStringBuilder.append(i).append(", toX=");
    i = e;
    localStringBuilder = localStringBuilder.append(i).append(", toY=");
    i = f;
    return i + '}';
  }
}


/* Location:              android/support/v7/widget/af$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */