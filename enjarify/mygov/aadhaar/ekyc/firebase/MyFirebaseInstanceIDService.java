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
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Refreshed token: ");
    str = str;
    Log.d("MyFirebaseIIDService", str);
  }
}


/* Location:              mygov/aadhaar/ekyc/firebase/MyFirebaseInstanceIDService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */