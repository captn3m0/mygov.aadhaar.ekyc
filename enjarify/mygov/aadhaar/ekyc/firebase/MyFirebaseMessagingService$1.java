package mygov.aadhaar.ekyc.firebase;

import android.os.Handler;
import android.support.v7.app.e;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.gms.ads.h;
import com.google.android.gms.b.jl;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import mygov.aadhaar.ekyc.MainActivity;
import mygov.aadhaar.ekyc.b.b;
import org.json.JSONException;
import org.json.JSONObject;

final class MyFirebaseMessagingService$1
  implements Runnable
{
  MyFirebaseMessagingService$1(MyFirebaseMessagingService paramMyFirebaseMessagingService, Map paramMap, Boolean paramBoolean) {}
  
  public final void run()
  {
    int i = 2130837622;
    int j = 1;
    Object localObject1 = (String)a.get("request-type");
    Object localObject3 = "authbyname";
    boolean bool = ((String)localObject1).equalsIgnoreCase((String)localObject3);
    int m;
    if (bool)
    {
      localObject1 = MainActivity.e();
      m = 2131624071;
      ((e)localObject1).findViewById(m).setEnabled(j);
      MainActivity.m.setDisplayedChild(j);
      localObject1 = b;
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = MainActivity.o;
        m = 2130837623;
        ((ImageView)localObject1).setImageResource(m);
        localObject1 = ta;
        bool = ((jl)localObject1).a();
        if (bool)
        {
          localObject1 = MainActivity.t;
          ((h)localObject1).a();
        }
      }
    }
    for (;;)
    {
      return;
      localObject1 = MainActivity.o;
      ((ImageView)localObject1).setImageResource(i);
      break;
      localObject1 = (String)a.get("request-type");
      localObject3 = "authbyotp";
      bool = ((String)localObject1).equalsIgnoreCase((String)localObject3);
      if (bool)
      {
        try
        {
          localObject3 = new org/json/JSONObject;
          localObject1 = a;
          ((JSONObject)localObject3).<init>((Map)localObject1);
          localObject1 = "success";
          bool = ((JSONObject)localObject3).getBoolean((String)localObject1);
          localObject1 = Boolean.valueOf(bool);
          localObject4 = MainActivity.n;
          i = 1;
          ((ViewFlipper)localObject4).setDisplayedChild(i);
          bool = ((Boolean)localObject1).booleanValue();
          if (!bool) {
            break label1000;
          }
          localObject1 = MainActivity.e();
          k = 2131624061;
          localObject1 = ((e)localObject1).findViewById(k);
          localObject1 = (EditText)localObject1;
          k = 0;
          localObject4 = null;
          ((EditText)localObject1).setEnabled(false);
          localObject1 = MainActivity.e();
          k = 2131624062;
          localObject1 = ((e)localObject1).findViewById(k);
          localObject1 = (EditText)localObject1;
          k = 0;
          localObject4 = null;
          ((EditText)localObject1).setVisibility(0);
          localObject1 = MainActivity.e();
          k = 2131624062;
          localObject1 = ((e)localObject1).findViewById(k);
          localObject1 = (EditText)localObject1;
          ((EditText)localObject1).requestFocus();
          localObject1 = "name";
          bool = ((JSONObject)localObject3).has((String)localObject1);
          if (!bool) {
            continue;
          }
          localObject1 = MainActivity.e();
          k = 2131624062;
          localObject1 = ((e)localObject1).findViewById(k);
          localObject1 = (EditText)localObject1;
          k = 4;
          ((EditText)localObject1).setVisibility(k);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject4 = "name";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "co";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "house";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = " - ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "street";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "lm";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "po";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "subdist";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = " - ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "dist";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "state";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = " - ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "pc";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "dob";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = " - ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "gender";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "email";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = "phone";
          localObject4 = ((JSONObject)localObject3).get((String)localObject4);
          localObject1 = ((StringBuilder)localObject1).append(localObject4);
          localObject4 = "\n";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
          localObject4 = ((StringBuilder)localObject1).toString();
          localObject1 = MainActivity.e();
          i = 2131624067;
          localObject1 = ((e)localObject1).findViewById(i);
          localObject1 = (TextView)localObject1;
          ((TextView)localObject1).setText((CharSequence)localObject4);
          localObject1 = MainActivity.p;
          k = 2130837623;
          ((ImageView)localObject1).setImageResource(k);
        }
        catch (JSONException localJSONException)
        {
          Object localObject4;
          int k;
          String str;
          label891:
          localJSONException.printStackTrace();
        }
        try
        {
          localObject1 = new java/net/URL;
          localObject4 = "photo";
          localObject4 = ((JSONObject)localObject3).getString((String)localObject4);
          ((URL)localObject1).<init>((String)localObject4);
          localObject1 = new mygov/aadhaar/ekyc/b/b;
          ((b)localObject1).<init>();
          k = 1;
          localObject4 = new String[k];
          i = 0;
          str = "photo";
          localObject3 = ((JSONObject)localObject3).getString(str);
          localObject4[0] = localObject3;
          ((b)localObject1).execute((Object[])localObject4);
        }
        catch (MalformedURLException localMalformedURLException)
        {
          localMalformedURLException.printStackTrace();
          break label891;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
          break label891;
        }
        localObject1 = MainActivity.e();
        m = 2131624061;
        localObject1 = ((e)localObject1).findViewById(m);
        localObject1 = (EditText)localObject1;
        m = 1;
        ((EditText)localObject1).setEnabled(m);
        localObject1 = MainActivity.t;
        localObject1 = a;
        bool = ((jl)localObject1).a();
        if (bool)
        {
          localObject1 = new android/os/Handler;
          ((Handler)localObject1).<init>();
          localObject3 = new mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1$1;
          ((MyFirebaseMessagingService.1.1)localObject3).<init>(this);
          long l = 15000L;
          ((Handler)localObject1).postDelayed((Runnable)localObject3, l);
          continue;
          continue;
          label1000:
          Object localObject2 = MainActivity.p;
          int n = 2130837622;
          ((ImageView)localObject2).setImageResource(n);
          localObject2 = MainActivity.e();
          n = 2131624061;
          localObject2 = ((e)localObject2).findViewById(n);
          localObject2 = (EditText)localObject2;
          n = 1;
          ((EditText)localObject2).setEnabled(n);
          localObject2 = MainActivity.t;
          localObject2 = a;
          bool = ((jl)localObject2).a();
          if (bool)
          {
            localObject2 = new android/os/Handler;
            ((Handler)localObject2).<init>();
            localObject3 = new mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1$2;
            ((MyFirebaseMessagingService.1.2)localObject3).<init>(this);
            l = 5000L;
            ((Handler)localObject2).postDelayed((Runnable)localObject3, l);
          }
        }
      }
    }
  }
}


/* Location:              mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */