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
import com.a.a.n.b;
import com.a.a.p;
import com.google.firebase.iid.FirebaseInstanceId;
import mygov.aadhaar.ekyc.MainActivity;
import mygov.aadhaar.ekyc.b.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    int i = 2131624070;
    int j = 2131624069;
    int k = 1;
    int m = 0;
    Object localObject1 = null;
    Object localObject2 = ((EditText)MainActivity.e().findViewById(j)).getText().toString().trim();
    int n = ((String)localObject2).length();
    Object localObject3;
    if (n <= 0)
    {
      localObject2 = MainActivity.e();
      localObject3 = "Kindly enter name";
      Toast.makeText((Context)localObject2, (CharSequence)localObject3, k).show();
      ((EditText)MainActivity.e().findViewById(j)).requestFocus();
      n = 0;
      localObject2 = null;
    }
    for (;;)
    {
      JSONObject localJSONObject;
      if (n != 0)
      {
        MainActivity.m.setVisibility(0);
        MainActivity.m.setDisplayedChild(0);
        localObject2 = MainActivity.o;
        k = 0;
        localJSONObject = null;
        ((ImageView)localObject2).setImageDrawable(null);
        paramView.setEnabled(false);
      }
      try
      {
        localObject2 = MainActivity.e();
        m = 2131624070;
        localObject2 = ((e)localObject2).findViewById(m);
        localObject2 = (EditText)localObject2;
        localObject2 = ((EditText)localObject2).getText();
        localObject1 = localObject2.toString();
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localObject3 = "name";
        localObject2 = MainActivity.e();
        j = 2131624069;
        localObject2 = ((e)localObject2).findViewById(j);
        localObject2 = (EditText)localObject2;
        localObject2 = ((EditText)localObject2).getText();
        localObject2 = localObject2.toString();
        localJSONObject.put((String)localObject3, localObject2);
        localObject2 = "aadhaar";
        localJSONObject.put((String)localObject2, localObject1);
        localObject2 = "reply-to";
        localObject3 = FirebaseInstanceId.a();
        localObject3 = ((FirebaseInstanceId)localObject3).b();
        localJSONObject.put((String)localObject2, localObject3);
        localObject2 = "token";
        localObject1 = mygov.aadhaar.ekyc.c.b.a((String)localObject1);
        localJSONObject.put((String)localObject2, localObject1);
        localObject2 = new mygov/aadhaar/ekyc/b/a;
        localObject1 = mygov.aadhaar.ekyc.b.a.l;
        localObject3 = new mygov/aadhaar/ekyc/a/b$1;
        ((b.1)localObject3).<init>(this, paramView);
        b.2 local2 = new mygov/aadhaar/ekyc/a/b$2;
        local2.<init>(this, paramView);
        ((mygov.aadhaar.ekyc.b.a)localObject2).<init>((String)localObject1, localJSONObject, (n.b)localObject3, local2);
        m = 0;
        localObject1 = null;
        g = false;
        localObject1 = new com/a/a/d;
        k = mygov.aadhaar.ekyc.a.b;
        localObject3 = null;
        ((d)localObject1).<init>(k, 0);
        j = ((p)localObject1);
        localObject1 = MainActivity.e();
        localObject1 = c.a((Context)localObject1);
        localObject1 = ((c)localObject1).a();
        ((m)localObject1).a((l)localObject2);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          localJSONException.printStackTrace();
        }
      }
      localObject2 = ((EditText)MainActivity.e().findViewById(i)).getText().toString().trim();
      n = ((String)localObject2).length();
      if (n <= 0)
      {
        localObject2 = MainActivity.e();
        localObject3 = "Kindly enter aadhar id";
        Toast.makeText((Context)localObject2, (CharSequence)localObject3, k).show();
        ((EditText)MainActivity.e().findViewById(i)).requestFocus();
        n = 0;
        localObject2 = null;
      }
      else
      {
        n = k;
      }
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */