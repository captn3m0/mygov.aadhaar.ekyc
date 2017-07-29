package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.g;

public final class AdUrlAdapter
  extends a
  implements c, e, g
{
  public final String getAdUnitId(Bundle paramBundle)
  {
    return "adurl";
  }
  
  protected final Bundle zza(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle1 != null) {}
    for (;;)
    {
      paramBundle1.putBundle("sdk_less_server_data", paramBundle2);
      paramBundle1.putBoolean("_noRefresh", true);
      return paramBundle1;
      paramBundle1 = new android/os/Bundle;
      paramBundle1.<init>();
    }
  }
}


/* Location:              com/google/ads/mediation/AdUrlAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */