package android.support.v7.widget;

final class ac$a
{
  long a = 0L;
  a b;
  
  private void a()
  {
    a locala = b;
    if (locala == null)
    {
      locala = new android/support/v7/widget/ac$a;
      locala.<init>();
      b = locala;
    }
  }
  
  final void a(int paramInt)
  {
    for (;;)
    {
      int i = 64;
      if (paramInt < i) {
        break;
      }
      a();
      this = b;
      paramInt += -64;
    }
    long l1 = a;
    long l2 = 1L << paramInt;
    l1 |= l2;
    a = l1;
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      int i = 64;
      if (paramInt < i) {
        break;
      }
      a();
      this = b;
      paramInt += -64;
    }
    long l1 = a & 0x8000000000000000;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      bool = true;
      label50:
      l2 = (1L << paramInt) - 1L;
      long l3 = a & l2;
      long l4 = a;
      long l5 = -1;
      l2 = (l2 ^ l5) & l4;
      int j = 1;
      l2 = l2 << j | l3;
      a = l2;
      if (!paramBoolean) {
        break label150;
      }
      a(paramInt);
    }
    for (;;)
    {
      if (!bool)
      {
        a locala = b;
        if (locala == null) {
          return;
        }
      }
      a();
      this = b;
      paramInt = 0;
      paramBoolean = bool;
      break;
      bool = false;
      break label50;
      label150:
      b(paramInt);
    }
  }
  
  final void b(int paramInt)
  {
    for (;;)
    {
      int i = 64;
      if (paramInt < i) {
        break;
      }
      a locala = b;
      if (locala == null) {
        return;
      }
      this = b;
      paramInt += -64;
    }
    long l1 = a;
    long l2 = 1L << paramInt;
    long l3 = -1;
    l2 ^= l3;
    l1 &= l2;
    a = l1;
  }
  
  final boolean c(int paramInt)
  {
    for (;;)
    {
      int i = 64;
      if (paramInt < i) {
        break;
      }
      a();
      this = b;
      paramInt += -64;
    }
    long l1 = a;
    long l2 = 1L << paramInt;
    l1 &= l2;
    l2 = 0L;
    boolean bool = l1 < l2;
    if (bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  final boolean d(int paramInt)
  {
    long l1 = 1L;
    long l2 = -1;
    int i = 1;
    for (;;)
    {
      int k = 64;
      if (paramInt < k) {
        break;
      }
      a();
      this = b;
      paramInt += -64;
    }
    long l3 = l1 << paramInt;
    long l4 = a & l3;
    long l5 = 0L;
    boolean bool2 = l4 < l5;
    if (bool2) {}
    for (bool2 = i;; bool2 = false)
    {
      l4 = a;
      l5 = l3 ^ l2;
      l4 &= l5;
      a = l4;
      l3 -= l1;
      l4 = a & l3;
      l5 = a;
      l3 = Long.rotateRight((l3 ^ l2) & l5, i) | l4;
      a = l3;
      a locala = b;
      if (locala != null)
      {
        locala = b;
        boolean bool1 = locala.c(0);
        if (bool1)
        {
          int j = 63;
          a(j);
        }
        locala = b;
        locala.d(0);
      }
      return bool2;
    }
  }
  
  final int e(int paramInt)
  {
    int i = 64;
    long l1 = 1L;
    a locala = b;
    long l2;
    int j;
    if (locala == null) {
      if (paramInt >= i)
      {
        l2 = a;
        j = Long.bitCount(l2);
      }
    }
    for (;;)
    {
      return j;
      l2 = a;
      long l3 = (l1 << paramInt) - l1;
      l2 &= l3;
      j = Long.bitCount(l2);
      continue;
      if (paramInt < i)
      {
        l2 = a;
        l3 = (l1 << paramInt) - l1;
        l2 &= l3;
        j = Long.bitCount(l2);
      }
      else
      {
        locala = b;
        i = paramInt + -64;
        j = locala.e(i);
        l3 = a;
        i = Long.bitCount(l3);
        j += i;
      }
    }
  }
  
  public final String toString()
  {
    Object localObject = b;
    long l1;
    if (localObject == null) {
      l1 = a;
    }
    String str;
    for (localObject = Long.toBinaryString(l1);; localObject = str)
    {
      return (String)localObject;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = b.toString();
      localObject = ((StringBuilder)localObject).append(str).append("xx");
      long l2 = a;
      str = Long.toBinaryString(l2);
    }
  }
}


/* Location:              android/support/v7/widget/ac$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */