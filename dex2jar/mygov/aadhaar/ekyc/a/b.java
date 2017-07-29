package mygov.aadhaar.ekyc.a;

import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.support.v7.app.e;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.a.a.d;
import com.a.a.i;
import com.a.a.m;
import com.a.a.n.a;
import com.a.a.n.b;
import com.a.a.s;
import com.google.android.gms.ads.h;
import com.google.firebase.iid.FirebaseInstanceId;
import mygov.aadhaar.ekyc.MainActivity;
import mygov.aadhaar.ekyc.b.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements View.OnClickListener
{
  public final void onClick(final View paramView)
  {
    int i;
    if (((EditText)MainActivity.e().findViewById(2131624069)).getText().toString().trim().length() <= 0)
    {
      Toast.makeText(MainActivity.e(), "Kindly enter name", 1).show();
      ((EditText)MainActivity.e().findViewById(2131624069)).requestFocus();
      i = 0;
    }
    for (;;)
    {
      if (i != 0)
      {
        MainActivity.m.setVisibility(0);
        MainActivity.m.setDisplayedChild(0);
        MainActivity.o.setImageDrawable(null);
        paramView.setEnabled(false);
      }
      try
      {
        String str = ((EditText)MainActivity.e().findViewById(2131624070)).getText().toString();
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("name", ((EditText)MainActivity.e().findViewById(2131624069)).getText().toString());
        localJSONObject.put("aadhaar", str);
        localJSONObject.put("reply-to", FirebaseInstanceId.a().b());
        localJSONObject.put("token", mygov.aadhaar.ekyc.c.b.a(str));
        paramView = new mygov.aadhaar.ekyc.b.a(mygov.aadhaar.ekyc.b.a.l, localJSONObject, new n.b()new n.a {}, new n.a()
        {
          public final void a(s paramAnonymouss)
          {
            paramView.setEnabled(true);
            try
            {
              paramAnonymouss = new JSONObject(new String(a.b));
              Snackbar.a(MainActivity.e().findViewById(2131624058), paramAnonymouss.getString("message")).a();
              return;
            }
            catch (NullPointerException paramAnonymouss)
            {
              Snackbar.a(MainActivity.e().findViewById(2131624058), MainActivity.e().getResources().getString(2131230786)).a();
              return;
            }
            catch (JSONException paramAnonymouss)
            {
              for (;;) {}
            }
          }
        });
        g = false;
        j = new d(mygov.aadhaar.ekyc.a.b, 0);
        c.a(MainActivity.e()).a().a(paramView);
        return;
      }
      catch (JSONException paramView)
      {
        paramView.printStackTrace();
      }
      if (((EditText)MainActivity.e().findViewById(2131624070)).getText().toString().trim().length() <= 0)
      {
        Toast.makeText(MainActivity.e(), "Kindly enter aadhar id", 1).show();
        ((EditText)MainActivity.e().findViewById(2131624070)).requestFocus();
        i = 0;
      }
      else
      {
        i = 1;
      }
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */