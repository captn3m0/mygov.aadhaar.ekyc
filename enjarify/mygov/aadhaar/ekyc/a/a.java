package mygov.aadhaar.ekyc.a;

import android.content.Context;
import android.support.v7.app.e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.a.a.d;
import com.a.a.l;
import com.a.a.m;
import com.a.a.n.a;
import com.a.a.n.b;
import com.a.a.p;
import com.google.firebase.iid.FirebaseInstanceId;
import mygov.aadhaar.ekyc.MainActivity;
import mygov.aadhaar.ekyc.b.c;
import mygov.aadhaar.ekyc.c.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    int i = 2131624061;
    int j = 1;
    int k = 2131624062;
    int m = 0;
    Object localObject1 = null;
    Object localObject2 = ((EditText)MainActivity.e().findViewById(i)).getText().toString().trim();
    int n = ((String)localObject2).length();
    Object localObject3;
    Object localObject4;
    if (n <= 0)
    {
      localObject2 = MainActivity.e();
      localObject3 = "Kindly enter aadhar id";
      Toast.makeText((Context)localObject2, (CharSequence)localObject3, j).show();
      ((EditText)MainActivity.e().findViewById(i)).requestFocus();
      n = 0;
      localObject2 = null;
      if (n != 0)
      {
        MainActivity.n.setVisibility(0);
        MainActivity.n.setDisplayedChild(0);
        localObject2 = MainActivity.p;
        j = 0;
        localObject4 = null;
        ((ImageView)localObject2).setImageDrawable(null);
        paramView.setEnabled(false);
      }
    }
    for (;;)
    {
      try
      {
        localObject2 = MainActivity.e();
        m = 2131624061;
        localObject2 = ((e)localObject2).findViewById(m);
        localObject2 = (EditText)localObject2;
        localObject2 = ((EditText)localObject2).getText();
        localObject4 = localObject2.toString();
        localObject1 = mygov.aadhaar.ekyc.b.a.m;
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>();
        localObject2 = MainActivity.e();
        k = 2131624062;
        localObject2 = ((e)localObject2).findViewById(k);
        localObject2 = (EditText)localObject2;
        n = ((EditText)localObject2).getVisibility();
        if (n == 0)
        {
          localObject1 = mygov.aadhaar.ekyc.b.a.n;
          localObject5 = "otp";
          localObject2 = MainActivity.e();
          i = 2131624062;
          localObject2 = ((e)localObject2).findViewById(i);
          localObject2 = (EditText)localObject2;
          localObject2 = ((EditText)localObject2).getText();
          localObject2 = localObject2.toString();
          ((JSONObject)localObject3).put((String)localObject5, localObject2);
          localObject2 = "reply-to";
          localObject5 = FirebaseInstanceId.a();
          localObject5 = ((FirebaseInstanceId)localObject5).b();
          ((JSONObject)localObject3).put((String)localObject2, localObject5);
        }
        localObject2 = localObject1;
        localObject1 = "aadhaar";
        ((JSONObject)localObject3).put((String)localObject1, localObject4);
        localObject1 = "token";
        localObject4 = b.a((String)localObject4);
        ((JSONObject)localObject3).put((String)localObject1, localObject4);
        localObject1 = new mygov/aadhaar/ekyc/b/a;
        localObject4 = new mygov/aadhaar/ekyc/a/a$1;
        ((a.1)localObject4).<init>(this, paramView);
        Object localObject5 = new mygov/aadhaar/ekyc/a/a$2;
        ((a.2)localObject5).<init>(this, paramView);
        ((mygov.aadhaar.ekyc.b.a)localObject1).<init>((String)localObject2, (JSONObject)localObject3, (n.b)localObject4, (n.a)localObject5);
        n = 0;
        localObject2 = null;
        g = false;
        localObject2 = "otp";
        boolean bool = ((JSONObject)localObject3).has((String)localObject2);
        if (!bool) {
          continue;
        }
        localObject2 = new com/a/a/d;
        j = mygov.aadhaar.ekyc.a.b;
        i2 = 0;
        localObject3 = null;
        ((d)localObject2).<init>(j, 0);
        j = ((p)localObject2);
        localObject2 = MainActivity.e();
        localObject2 = c.a((Context)localObject2);
        localObject2 = ((c)localObject2).a();
        ((m)localObject2).a((l)localObject1);
        return;
      }
      catch (JSONException localJSONException)
      {
        int i2;
        int i1;
        localJSONException.printStackTrace();
        continue;
      }
      localObject2 = (EditText)MainActivity.e().findViewById(k);
      i1 = ((EditText)localObject2).getVisibility();
      if (i1 == 0)
      {
        localObject2 = ((EditText)MainActivity.e().findViewById(k)).getText().toString().trim();
        i1 = ((String)localObject2).length();
        i2 = 6;
        if (i1 < i2)
        {
          localObject2 = MainActivity.e();
          localObject3 = "Kindly enter OTP";
          Toast.makeText((Context)localObject2, (CharSequence)localObject3, j).show();
          localObject2 = (EditText)MainActivity.e().findViewById(k);
          ((EditText)localObject2).requestFocus();
        }
      }
      i1 = j;
      break;
      localObject2 = new com/a/a/d;
      j = mygov.aadhaar.ekyc.a.b;
      i2 = 0;
      localObject3 = null;
      ((d)localObject2).<init>(j, 0);
      j = ((p)localObject2);
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */