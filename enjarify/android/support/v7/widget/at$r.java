package android.support.v7.widget;

import android.util.SparseArray;

public final class at$r
{
  int a = -1;
  int b = 0;
  int c = 0;
  int d = 1;
  int e = 0;
  boolean f = false;
  boolean g = false;
  boolean h = false;
  boolean i = false;
  boolean j = false;
  boolean k = false;
  int l;
  long m;
  int n;
  private SparseArray o;
  
  public final int a()
  {
    boolean bool = g;
    int i1;
    if (bool)
    {
      i1 = b;
      int i2 = c;
      i1 -= i2;
    }
    for (;;)
    {
      return i1;
      i1 = e;
    }
  }
  
  final void a(int paramInt)
  {
    int i1 = d & paramInt;
    if (i1 == 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("Layout state should be one of ");
      String str = Integer.toBinaryString(paramInt);
      localObject = ((StringBuilder)localObject).append(str).append(" but it is ");
      str = Integer.toBinaryString(d);
      localObject = str;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("State{mTargetPosition=");
    int i1 = a;
    localStringBuilder = localStringBuilder.append(i1).append(", mData=");
    SparseArray localSparseArray = o;
    localStringBuilder = localStringBuilder.append(localSparseArray).append(", mItemCount=");
    i1 = e;
    localStringBuilder = localStringBuilder.append(i1).append(", mPreviousLayoutItemCount=");
    i1 = b;
    localStringBuilder = localStringBuilder.append(i1).append(", mDeletedInvisibleItemCountSincePreviousLayout=");
    i1 = c;
    localStringBuilder = localStringBuilder.append(i1).append(", mStructureChanged=");
    boolean bool = f;
    localStringBuilder = localStringBuilder.append(bool).append(", mInPreLayout=");
    bool = g;
    localStringBuilder = localStringBuilder.append(bool).append(", mRunSimpleAnimations=");
    bool = j;
    localStringBuilder = localStringBuilder.append(bool).append(", mRunPredictiveAnimations=");
    bool = k;
    return bool + '}';
  }
}


/* Location:              android/support/v7/widget/at$r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */