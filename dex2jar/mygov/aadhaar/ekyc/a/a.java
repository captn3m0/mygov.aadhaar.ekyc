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
import mygov.aadhaar.ekyc.c.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements View.OnClickListener
{
  public final void onClick(final View paramView)
  {
    int i;
    if (((EditText)MainActivity.e().findViewById(2131624061)).getText().toString().trim().length() <= 0)
    {
      Toast.makeText(MainActivity.e(), "Kindly enter aadhar id", 1).show();
      ((EditText)MainActivity.e().findViewById(2131624061)).requestFocus();
      i = 0;
    }
    for (;;)
    {
      if (i != 0)
      {
        MainActivity.n.setVisibility(0);
        MainActivity.n.setDisplayedChild(0);
        MainActivity.p.setImageDrawable(null);
        paramView.setEnabled(false);
      }
      try
      {
        String str2 = ((EditText)MainActivity.e().findViewById(2131624061)).getText().toString();
        String str1 = mygov.aadhaar.ekyc.b.a.m;
        JSONObject localJSONObject = new JSONObject();
        if (((EditText)MainActivity.e().findViewById(2131624062)).getVisibility() == 0)
        {
          str1 = mygov.aadhaar.ekyc.b.a.n;
          localJSONObject.put("otp", ((EditText)MainActivity.e().findViewById(2131624062)).getText().toString());
          localJSONObject.put("reply-to", FirebaseInstanceId.a().b());
        }
        localJSONObject.put("aadhaar", str2);
        localJSONObject.put("token", b.a(str2));
        paramView = new mygov.aadhaar.ekyc.b.a(str1, localJSONObject, new n.b()new n.a {}, new n.a()
        {
          public final void a(s paramAnonymouss)
          {
            paramView.setEnabled(true);
            paramAnonymouss = a;
            try
            {
              paramAnonymouss = new JSONObject(new String(b));
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
        if (localJSONObject.has("otp")) {}
        for (j = new d(mygov.aadhaar.ekyc.a.b, 0);; j = new d(mygov.aadhaar.ekyc.a.b, 0))
        {
          c.a(MainActivity.e()).a().a(paramView);
          return;
          if ((((EditText)MainActivity.e().findViewById(2131624062)).getVisibility() == 0) && (((EditText)MainActivity.e().findViewById(2131624062)).getText().toString().trim().length() < 6))
          {
            Toast.makeText(MainActivity.e(), "Kindly enter OTP", 1).show();
            ((EditText)MainActivity.e().findViewById(2131624062)).requestFocus();
          }
          i = 1;
          break;
        }
        return;
      }
      catch (JSONException paramView)
      {
        paramView.printStackTrace();
      }
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */