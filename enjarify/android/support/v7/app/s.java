package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.c.d;
import android.util.Log;
import java.util.Calendar;

final class s
{
  static s a;
  private final Context b;
  private final LocationManager c;
  private final s.a d;
  
  s(Context paramContext, LocationManager paramLocationManager)
  {
    s.a locala = new android/support/v7/app/s$a;
    locala.<init>();
    d = locala;
    b = paramContext;
    c = paramLocationManager;
  }
  
  private Location a(String paramString)
  {
    Object localObject1 = c;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = c;
        bool = ((LocationManager)localObject1).isProviderEnabled(paramString);
        if (bool)
        {
          localObject1 = c;
          localObject1 = ((LocationManager)localObject1).getLastKnownLocation(paramString);
          return (Location)localObject1;
        }
      }
      catch (Exception localException)
      {
        String str1 = "TwilightManager";
        String str2 = "Failed to get last known location";
        Log.d(str1, str2, localException);
      }
      boolean bool = false;
      Object localObject2 = null;
    }
  }
  
  final boolean a()
  {
    s.a locala1 = d;
    Object localObject1 = d;
    long l2;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = d;
      long l1 = f;
      l2 = System.currentTimeMillis();
      bool1 = l1 < l2;
      if (bool1)
      {
        bool1 = true;
        if (!bool1) {
          break label65;
        }
        bool1 = a;
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localObject1 = null;
      break;
      label65:
      bool1 = false;
      localObject1 = null;
      boolean bool3 = false;
      Object localObject2 = null;
      Context localContext = b;
      String str = "android.permission.ACCESS_COARSE_LOCATION";
      int m = d.a(localContext, str);
      if (m == 0) {
        localObject1 = a("network");
      }
      localContext = b;
      str = "android.permission.ACCESS_FINE_LOCATION";
      m = d.a(localContext, str);
      if (m == 0) {
        localObject2 = a("gps");
      }
      long l3;
      Object localObject3;
      label177:
      s.a locala2;
      long l4;
      double d1;
      double d2;
      long l5;
      long l6;
      int i;
      if ((localObject2 != null) && (localObject1 != null))
      {
        l2 = ((Location)localObject2).getTime();
        l3 = ((Location)localObject1).getTime();
        int n = l2 < l3;
        if (n > 0)
        {
          localObject3 = localObject2;
          if (localObject3 == null) {
            break label572;
          }
          locala2 = d;
          l4 = System.currentTimeMillis();
          localObject1 = r.a;
          if (localObject1 == null)
          {
            localObject1 = new android/support/v7/app/r;
            ((r)localObject1).<init>();
            r.a = (r)localObject1;
          }
          localObject2 = r.a;
          l2 = l4 - 86400000L;
          d1 = ((Location)localObject3).getLatitude();
          d2 = ((Location)localObject3).getLongitude();
          ((r)localObject2).a(l2, d1, d2);
          l5 = b;
          l6 = l5;
          d1 = ((Location)localObject3).getLatitude();
          d2 = ((Location)localObject3).getLongitude();
          l2 = l4;
          ((r)localObject2).a(l4, d1, d2);
          i = d;
          n = 1;
          if (i != n) {
            break label496;
          }
          i = 1;
        }
      }
      long l7;
      for (;;)
      {
        l7 = c;
        l5 = b;
        long l8 = l5;
        l2 = 86400000L + l4;
        d1 = ((Location)localObject3).getLatitude();
        d2 = ((Location)localObject3).getLongitude();
        ((r)localObject2).a(l2, d1, d2);
        l3 = c;
        l2 = -1;
        bool3 = l7 < l2;
        if (bool3)
        {
          l2 = -1;
          bool3 = l5 < l2;
          if (bool3) {
            break label504;
          }
        }
        l2 = 43200000L + l4;
        a = i;
        l5 = l6;
        b = l6;
        l5 = l7;
        c = l7;
        l5 = l8;
        d = l8;
        e = l3;
        f = l2;
        boolean bool2 = a;
        break;
        localObject3 = localObject1;
        break label177;
        if (localObject2 != null)
        {
          localObject3 = localObject2;
          break label177;
        }
        localObject3 = localObject1;
        break label177;
        label496:
        bool2 = false;
        localObject1 = null;
      }
      label504:
      bool3 = l4 < l5;
      if (bool3) {
        l2 = 0L + l3;
      }
      for (;;)
      {
        long l9 = 60000L;
        d2 = 2.9644E-319D;
        l2 += l9;
        break;
        bool3 = l4 < l7;
        if (bool3) {
          l2 = 0L + l5;
        } else {
          l2 = 0L + l7;
        }
      }
      label572:
      localObject2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.";
      Log.i("TwilightManager", (String)localObject2);
      localObject1 = Calendar.getInstance();
      int j = ((Calendar)localObject1).get(11);
      int k = 6;
      if (j >= k)
      {
        k = 22;
        if (j < k) {}
      }
      else
      {
        j = 1;
        continue;
      }
      j = 0;
      localObject1 = null;
    }
  }
}


/* Location:              android/support/v7/app/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */