package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.b.kx;
import com.google.android.gms.b.lh;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class p$2
  implements vd.a
{
  p$2(kx paramkx, String paramString, vc paramvc) {}
  
  public final void a(vc paramvc, boolean paramBoolean)
  {
    Object localObject2;
    Object localObject3;
    Object localObject4;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject2 = "headline";
      localObject3 = a;
      localObject3 = ((kx)localObject3).a();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "body";
      localObject3 = a;
      localObject3 = ((kx)localObject3).c();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "call_to_action";
      localObject3 = a;
      localObject3 = ((kx)localObject3).e();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "advertiser";
      localObject3 = a;
      localObject3 = ((kx)localObject3).f();
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "logo";
      localObject3 = a;
      localObject3 = ((kx)localObject3).d();
      localObject3 = p.a((lh)localObject3);
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      localObject3 = a;
      localObject3 = ((kx)localObject3).b();
      if (localObject3 != null)
      {
        localObject3 = ((List)localObject3).iterator();
        for (;;)
        {
          boolean bool = ((Iterator)localObject3).hasNext();
          if (!bool) {
            break;
          }
          localObject4 = ((Iterator)localObject3).next();
          localObject4 = p.a(localObject4);
          localObject4 = p.a((lh)localObject4);
          ((JSONArray)localObject2).put(localObject4);
        }
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      localObject2 = "Exception occurred when loading assets";
      tp.c((String)localObject2, localJSONException);
    }
    for (;;)
    {
      localObject3 = "images";
      localJSONException.put((String)localObject3, localObject2);
      localObject2 = "extras";
      localObject3 = a;
      localObject3 = ((kx)localObject3).i();
      localObject4 = b;
      localObject3 = p.a((Bundle)localObject3, (String)localObject4);
      localJSONException.put((String)localObject2, localObject3);
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>();
      localObject3 = "assets";
      ((JSONObject)localObject2).put((String)localObject3, localJSONException);
      Object localObject1 = "template_id";
      localObject3 = "1";
      ((JSONObject)localObject2).put((String)localObject1, localObject3);
      localObject1 = c;
      localObject3 = "google.afma.nativeExpressAds.loadAssets";
      ((vc)localObject1).a((String)localObject3, (JSONObject)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/p$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */