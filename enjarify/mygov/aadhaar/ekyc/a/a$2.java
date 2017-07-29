package mygov.aadhaar.ekyc.a;

import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.support.v7.app.e;
import android.view.View;
import com.a.a.i;
import com.a.a.n.a;
import com.a.a.s;
import mygov.aadhaar.ekyc.MainActivity;
import org.json.JSONException;
import org.json.JSONObject;

final class a$2
  implements n.a
{
  a$2(a parama, View paramView) {}
  
  public final void a(s params)
  {
    int i = 2131624058;
    Object localObject1 = a;
    boolean bool = true;
    ((View)localObject1).setEnabled(bool);
    localObject1 = a;
    try
    {
      localObject3 = new org/json/JSONObject;
      String str = new java/lang/String;
      localObject1 = b;
      str.<init>((byte[])localObject1);
      ((JSONObject)localObject3).<init>(str);
      localObject1 = MainActivity.e();
      j = 2131624058;
      localObject1 = ((e)localObject1).findViewById(j);
      str = "message";
      localObject3 = ((JSONObject)localObject3).getString(str);
      localObject1 = Snackbar.a((View)localObject1, (CharSequence)localObject3);
      ((Snackbar)localObject1).a();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        Object localObject2 = MainActivity.e().findViewById(i);
        Object localObject3 = MainActivity.e().getResources();
        int j = 2131230786;
        localObject3 = ((Resources)localObject3).getString(j);
        localObject2 = Snackbar.a((View)localObject2, (CharSequence)localObject3);
        ((Snackbar)localObject2).a();
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/a/a$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */