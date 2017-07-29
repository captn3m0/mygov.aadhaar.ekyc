package android.support.v7.widget;

final class bi$a
{
  int a = 0;
  int b;
  int c;
  int d;
  int e;
  
  private static int a(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 > paramInt2) {
      i = 1;
    }
    for (;;)
    {
      return i;
      if (paramInt1 == paramInt2) {
        i = 2;
      } else {
        i = 4;
      }
    }
  }
  
  final void a(int paramInt)
  {
    int i = a | paramInt;
    a = i;
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramInt4;
  }
  
  final boolean a()
  {
    boolean bool = false;
    int i = a & 0x7;
    int j;
    int k;
    if (i != 0)
    {
      i = a;
      j = d;
      k = b;
      j = a(j, k) << 0;
      i &= j;
      if (i != 0) {}
    }
    for (;;)
    {
      return bool;
      i = a & 0x70;
      if (i != 0)
      {
        i = a;
        j = d;
        k = c;
        j = a(j, k) << 4;
        i &= j;
        if (i == 0) {}
      }
      else
      {
        i = a & 0x700;
        if (i != 0)
        {
          i = a;
          j = e;
          k = b;
          j = a(j, k) << 8;
          i &= j;
          if (i == 0) {}
        }
        else
        {
          i = a & 0x7000;
          if (i != 0)
          {
            i = a;
            j = e;
            k = c;
            j = a(j, k) << 12;
            i &= j;
            if (i == 0) {}
          }
          else
          {
            bool = true;
          }
        }
      }
    }
  }
}


/* Location:              android/support/v7/widget/bi$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */