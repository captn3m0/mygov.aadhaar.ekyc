package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.b.dr;
import com.google.android.gms.common.internal.c;

public class AppMeasurement$ConditionalUserProperty
{
  public boolean mActive;
  public String mAppId;
  public long mCreationTimestamp;
  public String mExpiredEventName;
  public Bundle mExpiredEventParams;
  public String mName;
  public String mOrigin;
  public long mTimeToLive;
  public String mTimedOutEventName;
  public Bundle mTimedOutEventParams;
  public String mTriggerEventName;
  public long mTriggerTimeout;
  public String mTriggeredEventName;
  public Bundle mTriggeredEventParams;
  public long mTriggeredTimestamp;
  public Object mValue;
  
  public AppMeasurement$ConditionalUserProperty() {}
  
  public AppMeasurement$ConditionalUserProperty(ConditionalUserProperty paramConditionalUserProperty)
  {
    c.a(paramConditionalUserProperty);
    Object localObject = mAppId;
    mAppId = ((String)localObject);
    localObject = mOrigin;
    mOrigin = ((String)localObject);
    long l = mCreationTimestamp;
    mCreationTimestamp = l;
    localObject = mName;
    mName = ((String)localObject);
    localObject = mValue;
    if (localObject != null)
    {
      localObject = dr.a(mValue);
      mValue = localObject;
      localObject = mValue;
      if (localObject == null)
      {
        localObject = mValue;
        mValue = localObject;
      }
    }
    localObject = mValue;
    mValue = localObject;
    boolean bool = mActive;
    mActive = bool;
    localObject = mTriggerEventName;
    mTriggerEventName = ((String)localObject);
    l = mTriggerTimeout;
    mTriggerTimeout = l;
    localObject = mTimedOutEventName;
    mTimedOutEventName = ((String)localObject);
    localObject = mTimedOutEventParams;
    Bundle localBundle;
    if (localObject != null)
    {
      localObject = new android/os/Bundle;
      localBundle = mTimedOutEventParams;
      ((Bundle)localObject).<init>(localBundle);
      mTimedOutEventParams = ((Bundle)localObject);
    }
    localObject = mTriggeredEventName;
    mTriggeredEventName = ((String)localObject);
    localObject = mTriggeredEventParams;
    if (localObject != null)
    {
      localObject = new android/os/Bundle;
      localBundle = mTriggeredEventParams;
      ((Bundle)localObject).<init>(localBundle);
      mTriggeredEventParams = ((Bundle)localObject);
    }
    l = mTriggeredTimestamp;
    mTriggeredTimestamp = l;
    l = mTimeToLive;
    mTimeToLive = l;
    localObject = mExpiredEventName;
    mExpiredEventName = ((String)localObject);
    localObject = mExpiredEventParams;
    if (localObject != null)
    {
      localObject = new android/os/Bundle;
      localBundle = mExpiredEventParams;
      ((Bundle)localObject).<init>(localBundle);
      mExpiredEventParams = ((Bundle)localObject);
    }
  }
}


/* Location:              com/google/android/gms/measurement/AppMeasurement$ConditionalUserProperty.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */