package mygov.aadhaar.ekyc.firebase;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService
  extends FirebaseInstanceIdService
{
  public final void a()
  {
    String str = FirebaseInstanceId.a().b();
    Log.d("MyFirebaseIIDService", "Refreshed token: " + str);
  }
}


/* Location:              mygov/aadhaar/ekyc/firebase/MyFirebaseInstanceIDService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */