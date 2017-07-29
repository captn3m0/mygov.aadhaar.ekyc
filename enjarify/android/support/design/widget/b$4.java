package android.support.design.widget;

import android.os.Handler;
import android.os.Message;

final class b$4
  implements n.a
{
  b$4(b paramb) {}
  
  public final void a()
  {
    Handler localHandler = b.a;
    Object localObject = b.a;
    b localb = a;
    localObject = ((Handler)localObject).obtainMessage(0, localb);
    localHandler.sendMessage((Message)localObject);
  }
  
  public final void a(int paramInt)
  {
    Handler localHandler = b.a;
    Object localObject = b.a;
    b localb = a;
    localObject = ((Handler)localObject).obtainMessage(1, paramInt, 0, localb);
    localHandler.sendMessage((Message)localObject);
  }
}


/* Location:              android/support/design/widget/b$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */