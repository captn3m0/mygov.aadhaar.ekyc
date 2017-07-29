package android.support.v4.g;

import android.util.Log;
import java.io.Writer;

public final class e
  extends Writer
{
  private final String a;
  private StringBuilder b;
  
  public e(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    b = localStringBuilder;
    a = paramString;
  }
  
  private void a()
  {
    Object localObject = b;
    int i = ((StringBuilder)localObject).length();
    if (i > 0)
    {
      localObject = a;
      String str = b.toString();
      Log.d((String)localObject, str);
      localObject = b;
      str = null;
      StringBuilder localStringBuilder = b;
      int j = localStringBuilder.length();
      ((StringBuilder)localObject).delete(0, j);
    }
  }
  
  public final void close()
  {
    a();
  }
  
  public final void flush()
  {
    a();
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      int j = paramInt1 + i;
      j = paramArrayOfChar[j];
      int k = 10;
      if (j == k) {
        a();
      }
      for (;;)
      {
        i += 1;
        break;
        StringBuilder localStringBuilder = b;
        localStringBuilder.append(j);
      }
    }
  }
}


/* Location:              android/support/v4/g/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */