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
  private final a d = new a();
  
  s(Context paramContext, LocationManager paramLocationManager)
  {
    b = paramContext;
    c = paramLocationManager;
  }
  
  private Location a(String paramString)
  {
    if (c != null) {
      try
      {
        if (c.isProviderEnabled(paramString))
        {
          paramString = c.getLastKnownLocation(paramString);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        Log.d("TwilightManager", "Failed to get last known location", paramString);
      }
    }
    return null;
  }
  
  final boolean a()
  {
    a locala = d;
    if ((d != null) && (d.f > System.currentTimeMillis())) {}
    for (int i = 1; i != 0; i = 0) {
      return a;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    if (d.a(b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
      localObject1 = a("network");
    }
    if (d.a(b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
      localObject2 = a("gps");
    }
    long l1;
    r localr;
    long l2;
    if ((localObject2 != null) && (localObject1 != null)) {
      if (((Location)localObject2).getTime() > ((Location)localObject1).getTime())
      {
        localObject1 = localObject2;
        if (localObject1 == null) {
          break label389;
        }
        localObject2 = d;
        l1 = System.currentTimeMillis();
        if (r.a == null) {
          r.a = new r();
        }
        localr = r.a;
        localr.a(l1 - 86400000L, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
        l2 = b;
        localr.a(l1, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
        if (d != 1) {
          break label339;
        }
      }
    }
    long l3;
    long l4;
    long l5;
    label339:
    for (boolean bool = true;; bool = false)
    {
      l3 = c;
      l4 = b;
      localr.a(86400000L + l1, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
      l5 = c;
      if ((l3 != -1L) && (l4 != -1L)) {
        break label345;
      }
      l1 = 43200000L + l1;
      a = bool;
      b = l2;
      c = l3;
      d = l4;
      e = l5;
      f = l1;
      return a;
      break;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        break;
      }
      break;
    }
    label345:
    if (l1 > l4) {
      l1 = 0L + l5;
    }
    for (;;)
    {
      l1 += 60000L;
      break;
      if (l1 > l3) {
        l1 = 0L + l4;
      } else {
        l1 = 0L + l3;
      }
    }
    label389:
    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
    i = Calendar.getInstance().get(11);
    return (i < 6) || (i >= 22);
  }
  
  private static final class a
  {
    boolean a;
    long b;
    long c;
    long d;
    long e;
    long f;
  }
}


/* Location:              android/support/v7/app/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */