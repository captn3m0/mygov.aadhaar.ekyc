package mygov.aadhaar.ekyc.firebase;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.b.ab.d;
import android.support.v7.app.e;
import android.util.Log;
import com.google.android.gms.ads.h;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mygov.aadhaar.ekyc.MainActivity;

public class MyFirebaseMessagingService
  extends FirebaseMessagingService
{
  public final void a(com.google.firebase.messaging.a parama)
  {
    if (b == null)
    {
      b = new android.support.v4.g.a();
      localObject1 = a.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        Object localObject3 = a.get((String)localObject2);
        if ((localObject3 instanceof String))
        {
          localObject3 = (String)localObject3;
          if ((!((String)localObject2).startsWith("google.")) && (!((String)localObject2).startsWith("gcm.")) && (!((String)localObject2).equals("from")) && (!((String)localObject2).equals("message_type")) && (!((String)localObject2).equals("collapse_key"))) {
            b.put(localObject2, localObject3);
          }
        }
      }
    }
    final Object localObject1 = b;
    Log.d("MyFirebaseMsgService", "From: " + a.getString("from"));
    Log.d("MyFirebaseMsgService", "Notification Message Body: " + localObject1.toString());
    if (MainActivity.e() != null)
    {
      boolean bool = Boolean.parseBoolean((String)((Map)localObject1).get("success"));
      MainActivity.e().runOnUiThread(new Runnable()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: aload_0
          //   1: getfield 26	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1:a	Ljava/util/Map;
          //   4: ldc 41
          //   6: invokeinterface 47 2 0
          //   11: checkcast 49	java/lang/String
          //   14: ldc 51
          //   16: invokevirtual 55	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
          //   19: ifeq +70 -> 89
          //   22: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   25: ldc 62
          //   27: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   30: iconst_1
          //   31: invokevirtual 74	android/view/View:setEnabled	(Z)V
          //   34: getstatic 78	mygov/aadhaar/ekyc/MainActivity:m	Landroid/widget/ViewFlipper;
          //   37: iconst_1
          //   38: invokevirtual 84	android/widget/ViewFlipper:setDisplayedChild	(I)V
          //   41: aload_0
          //   42: getfield 28	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1:b	Ljava/lang/Boolean;
          //   45: invokevirtual 90	java/lang/Boolean:booleanValue	()Z
          //   48: ifeq +30 -> 78
          //   51: getstatic 94	mygov/aadhaar/ekyc/MainActivity:o	Landroid/widget/ImageView;
          //   54: ldc 95
          //   56: invokevirtual 100	android/widget/ImageView:setImageResource	(I)V
          //   59: getstatic 104	mygov/aadhaar/ekyc/MainActivity:t	Lcom/google/android/gms/ads/h;
          //   62: getfield 109	com/google/android/gms/ads/h:a	Lcom/google/android/gms/b/jl;
          //   65: invokevirtual 113	com/google/android/gms/b/jl:a	()Z
          //   68: ifeq +9 -> 77
          //   71: getstatic 104	mygov/aadhaar/ekyc/MainActivity:t	Lcom/google/android/gms/ads/h;
          //   74: invokevirtual 115	com/google/android/gms/ads/h:a	()V
          //   77: return
          //   78: getstatic 94	mygov/aadhaar/ekyc/MainActivity:o	Landroid/widget/ImageView;
          //   81: ldc 116
          //   83: invokevirtual 100	android/widget/ImageView:setImageResource	(I)V
          //   86: goto -27 -> 59
          //   89: aload_0
          //   90: getfield 26	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1:a	Ljava/util/Map;
          //   93: ldc 41
          //   95: invokeinterface 47 2 0
          //   100: checkcast 49	java/lang/String
          //   103: ldc 118
          //   105: invokevirtual 55	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
          //   108: ifeq -31 -> 77
          //   111: new 120	org/json/JSONObject
          //   114: dup
          //   115: aload_0
          //   116: getfield 26	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1:a	Ljava/util/Map;
          //   119: invokespecial 123	org/json/JSONObject:<init>	(Ljava/util/Map;)V
          //   122: astore_2
          //   123: aload_2
          //   124: ldc 125
          //   126: invokevirtual 128	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
          //   129: istore_1
          //   130: getstatic 131	mygov/aadhaar/ekyc/MainActivity:n	Landroid/widget/ViewFlipper;
          //   133: iconst_1
          //   134: invokevirtual 84	android/widget/ViewFlipper:setDisplayedChild	(I)V
          //   137: iload_1
          //   138: invokestatic 135	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
          //   141: invokevirtual 90	java/lang/Boolean:booleanValue	()Z
          //   144: ifeq +412 -> 556
          //   147: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   150: ldc -120
          //   152: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   155: checkcast 138	android/widget/EditText
          //   158: iconst_0
          //   159: invokevirtual 139	android/widget/EditText:setEnabled	(Z)V
          //   162: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   165: ldc -116
          //   167: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   170: checkcast 138	android/widget/EditText
          //   173: iconst_0
          //   174: invokevirtual 143	android/widget/EditText:setVisibility	(I)V
          //   177: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   180: ldc -116
          //   182: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   185: checkcast 138	android/widget/EditText
          //   188: invokevirtual 146	android/widget/EditText:requestFocus	()Z
          //   191: pop
          //   192: aload_2
          //   193: ldc -108
          //   195: invokevirtual 151	org/json/JSONObject:has	(Ljava/lang/String;)Z
          //   198: ifeq -121 -> 77
          //   201: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   204: ldc -116
          //   206: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   209: checkcast 138	android/widget/EditText
          //   212: iconst_4
          //   213: invokevirtual 143	android/widget/EditText:setVisibility	(I)V
          //   216: new 153	java/lang/StringBuilder
          //   219: dup
          //   220: invokespecial 154	java/lang/StringBuilder:<init>	()V
          //   223: aload_2
          //   224: ldc -108
          //   226: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   229: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   232: ldc -93
          //   234: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   237: aload_2
          //   238: ldc -88
          //   240: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   243: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   246: ldc -93
          //   248: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   251: aload_2
          //   252: ldc -86
          //   254: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   257: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   260: ldc -84
          //   262: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   265: aload_2
          //   266: ldc -82
          //   268: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   271: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   274: ldc -93
          //   276: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   279: aload_2
          //   280: ldc -80
          //   282: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   285: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   288: ldc -93
          //   290: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   293: aload_2
          //   294: ldc -78
          //   296: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   299: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   302: ldc -93
          //   304: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   307: aload_2
          //   308: ldc -76
          //   310: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   313: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   316: ldc -84
          //   318: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   321: aload_2
          //   322: ldc -74
          //   324: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   327: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   330: ldc -93
          //   332: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   335: aload_2
          //   336: ldc -72
          //   338: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   341: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   344: ldc -84
          //   346: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   349: aload_2
          //   350: ldc -70
          //   352: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   355: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   358: ldc -93
          //   360: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   363: aload_2
          //   364: ldc -68
          //   366: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   369: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   372: ldc -84
          //   374: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   377: aload_2
          //   378: ldc -66
          //   380: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   383: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   386: ldc -93
          //   388: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   391: aload_2
          //   392: ldc -64
          //   394: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   397: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   400: ldc -93
          //   402: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   405: aload_2
          //   406: ldc -62
          //   408: invokevirtual 157	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
          //   411: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          //   414: ldc -93
          //   416: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   419: invokevirtual 198	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   422: astore_3
          //   423: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   426: ldc -57
          //   428: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   431: checkcast 201	android/widget/TextView
          //   434: aload_3
          //   435: invokevirtual 205	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
          //   438: getstatic 208	mygov/aadhaar/ekyc/MainActivity:p	Landroid/widget/ImageView;
          //   441: ldc 95
          //   443: invokevirtual 100	android/widget/ImageView:setImageResource	(I)V
          //   446: new 210	java/net/URL
          //   449: dup
          //   450: aload_2
          //   451: ldc -44
          //   453: invokevirtual 216	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
          //   456: invokespecial 219	java/net/URL:<init>	(Ljava/lang/String;)V
          //   459: pop
          //   460: new 221	mygov/aadhaar/ekyc/b/b
          //   463: dup
          //   464: invokespecial 222	mygov/aadhaar/ekyc/b/b:<init>	()V
          //   467: iconst_1
          //   468: anewarray 49	java/lang/String
          //   471: dup
          //   472: iconst_0
          //   473: aload_2
          //   474: ldc -44
          //   476: invokevirtual 216	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
          //   479: aastore
          //   480: invokevirtual 226	mygov/aadhaar/ekyc/b/b:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
          //   483: pop
          //   484: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   487: ldc -120
          //   489: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   492: checkcast 138	android/widget/EditText
          //   495: iconst_1
          //   496: invokevirtual 139	android/widget/EditText:setEnabled	(Z)V
          //   499: getstatic 104	mygov/aadhaar/ekyc/MainActivity:t	Lcom/google/android/gms/ads/h;
          //   502: getfield 109	com/google/android/gms/ads/h:a	Lcom/google/android/gms/b/jl;
          //   505: invokevirtual 113	com/google/android/gms/b/jl:a	()Z
          //   508: ifeq -431 -> 77
          //   511: new 228	android/os/Handler
          //   514: dup
          //   515: invokespecial 229	android/os/Handler:<init>	()V
          //   518: new 13	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1$1
          //   521: dup
          //   522: aload_0
          //   523: invokespecial 232	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1$1:<init>	(Lmygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1;)V
          //   526: ldc2_w 233
          //   529: invokevirtual 238	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
          //   532: pop
          //   533: return
          //   534: astore_2
          //   535: aload_2
          //   536: invokevirtual 241	org/json/JSONException:printStackTrace	()V
          //   539: return
          //   540: astore_2
          //   541: aload_2
          //   542: invokevirtual 242	java/net/MalformedURLException:printStackTrace	()V
          //   545: goto -61 -> 484
          //   548: astore_2
          //   549: aload_2
          //   550: invokevirtual 243	java/io/IOException:printStackTrace	()V
          //   553: goto -69 -> 484
          //   556: getstatic 208	mygov/aadhaar/ekyc/MainActivity:p	Landroid/widget/ImageView;
          //   559: ldc 116
          //   561: invokevirtual 100	android/widget/ImageView:setImageResource	(I)V
          //   564: invokestatic 61	mygov/aadhaar/ekyc/MainActivity:e	()Landroid/support/v7/app/e;
          //   567: ldc -120
          //   569: invokevirtual 68	android/support/v7/app/e:findViewById	(I)Landroid/view/View;
          //   572: checkcast 138	android/widget/EditText
          //   575: iconst_1
          //   576: invokevirtual 139	android/widget/EditText:setEnabled	(Z)V
          //   579: getstatic 104	mygov/aadhaar/ekyc/MainActivity:t	Lcom/google/android/gms/ads/h;
          //   582: getfield 109	com/google/android/gms/ads/h:a	Lcom/google/android/gms/b/jl;
          //   585: invokevirtual 113	com/google/android/gms/b/jl:a	()Z
          //   588: ifeq -511 -> 77
          //   591: new 228	android/os/Handler
          //   594: dup
          //   595: invokespecial 229	android/os/Handler:<init>	()V
          //   598: new 15	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1$2
          //   601: dup
          //   602: aload_0
          //   603: invokespecial 244	mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1$2:<init>	(Lmygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService$1;)V
          //   606: ldc2_w 245
          //   609: invokevirtual 238	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
          //   612: pop
          //   613: return
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	614	0	this	1
          //   129	9	1	bool	boolean
          //   122	352	2	localJSONObject	org.json.JSONObject
          //   534	2	2	localJSONException	org.json.JSONException
          //   540	2	2	localMalformedURLException	java.net.MalformedURLException
          //   548	2	2	localIOException	java.io.IOException
          //   422	13	3	str	String
          // Exception table:
          //   from	to	target	type
          //   111	446	534	org/json/JSONException
          //   446	484	534	org/json/JSONException
          //   484	533	534	org/json/JSONException
          //   541	545	534	org/json/JSONException
          //   549	553	534	org/json/JSONException
          //   556	613	534	org/json/JSONException
          //   446	484	540	java/net/MalformedURLException
          //   446	484	548	java/io/IOException
        }
      });
      return;
    }
    parama = localObject1.toString();
    localObject1 = new Intent(this, MainActivity.class);
    ((Intent)localObject1).addFlags(67108864);
    localObject1 = PendingIntent.getActivity(this, 0, (Intent)localObject1, 1073741824);
    Object localObject2 = RingtoneManager.getDefaultUri(2);
    parama = new ab.d(this).a(2130903040).a("Firebase Push Notification").b(parama).a().a((Uri)localObject2);
    d = ((PendingIntent)localObject1);
    ((NotificationManager)getSystemService("notification")).notify(0, parama.b());
  }
}


/* Location:              mygov/aadhaar/ekyc/firebase/MyFirebaseMessagingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */