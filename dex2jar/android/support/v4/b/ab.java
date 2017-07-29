package android.support.v4.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.f.a;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ab
{
  static final h a = new l();
  
  static
  {
    if (a.a())
    {
      a = new k();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new j();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      a = new i();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new p();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new o();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new n();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new m();
      return;
    }
  }
  
  static void a(aa paramaa, q paramq)
  {
    if (paramq != null)
    {
      if (!(paramq instanceof c)) {
        break label37;
      }
      paramq = (c)paramq;
      ah.a(paramaa, e, g, f, a);
    }
    label37:
    do
    {
      return;
      if ((paramq instanceof f))
      {
        paramq = (f)paramq;
        ah.a(paramaa, e, g, f, a);
        return;
      }
    } while (!(paramq instanceof b));
    paramq = (b)paramq;
    ah.a(paramaa, e, g, f, a, b, c);
  }
  
  static void a(z paramz, ArrayList<a> paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      paramz.a((a)paramArrayList.next());
    }
  }
  
  static void b(aa paramaa, q paramq)
  {
    if (paramq != null)
    {
      if ((paramq instanceof g))
      {
        paramq = (g)paramq;
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        ArrayList localArrayList3 = new ArrayList();
        ArrayList localArrayList4 = new ArrayList();
        ArrayList localArrayList5 = new ArrayList();
        Iterator localIterator = c.iterator();
        while (localIterator.hasNext())
        {
          ab.g.a locala = (ab.g.a)localIterator.next();
          localArrayList1.add(a);
          localArrayList2.add(Long.valueOf(b));
          localArrayList3.add(c);
          localArrayList4.add(d);
          localArrayList5.add(e);
        }
        ae.a(paramaa, a, b, localArrayList1, localArrayList2, localArrayList3, localArrayList4, localArrayList5);
      }
    }
    else {
      return;
    }
    a(paramaa, paramq);
  }
  
  public static final class a
    extends af.a
  {
    public static final af.a.a e = new af.a.a() {};
    final Bundle a;
    public int b;
    public CharSequence c;
    public PendingIntent d;
    private final ak[] f;
    private boolean g;
    
    public final int a()
    {
      return b;
    }
    
    public final CharSequence b()
    {
      return c;
    }
    
    public final PendingIntent c()
    {
      return d;
    }
    
    public final Bundle d()
    {
      return a;
    }
    
    public final boolean e()
    {
      return g;
    }
  }
  
  public static final class b
    extends ab.q
  {
    Bitmap a;
    Bitmap b;
    boolean c;
  }
  
  public static final class c
    extends ab.q
  {
    CharSequence a;
    
    public final c a(CharSequence paramCharSequence)
    {
      a = ab.d.d(paramCharSequence);
      return this;
    }
  }
  
  public static final class d
  {
    int A = 0;
    Notification B;
    RemoteViews C;
    RemoteViews D;
    RemoteViews E;
    public Notification F = new Notification();
    public ArrayList<String> G;
    public Context a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    public Bitmap g;
    public CharSequence h;
    public int i;
    int j;
    boolean k = true;
    public boolean l;
    public ab.q m;
    public CharSequence n;
    public CharSequence[] o;
    int p;
    int q;
    boolean r;
    String s;
    boolean t;
    String u;
    public ArrayList<ab.a> v = new ArrayList();
    public boolean w = false;
    String x;
    Bundle y;
    public int z = 0;
    
    public d(Context paramContext)
    {
      a = paramContext;
      F.when = System.currentTimeMillis();
      F.audioStreamType = -1;
      j = 0;
      G = new ArrayList();
    }
    
    protected static CharSequence d(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {}
      while (paramCharSequence.length() <= 5120) {
        return paramCharSequence;
      }
      return paramCharSequence.subSequence(0, 5120);
    }
    
    public final d a()
    {
      Notification localNotification = F;
      flags |= 0x10;
      return this;
    }
    
    public final d a(int paramInt)
    {
      F.icon = paramInt;
      return this;
    }
    
    public final d a(Uri paramUri)
    {
      F.sound = paramUri;
      F.audioStreamType = -1;
      return this;
    }
    
    public final d a(ab.q paramq)
    {
      if (m != paramq)
      {
        m = paramq;
        if (m != null)
        {
          paramq = m;
          if (d != this)
          {
            d = this;
            if (d != null) {
              d.a(paramq);
            }
          }
        }
      }
      return this;
    }
    
    public final d a(CharSequence paramCharSequence)
    {
      b = d(paramCharSequence);
      return this;
    }
    
    public final Notification b()
    {
      ab.h localh = ab.a;
      new ab.e();
      return localh.a(this);
    }
    
    public final d b(CharSequence paramCharSequence)
    {
      c = d(paramCharSequence);
      return this;
    }
    
    public final d c(CharSequence paramCharSequence)
    {
      F.tickerText = d(paramCharSequence);
      return this;
    }
  }
  
  protected static final class e
  {
    public static Notification a(ab.d paramd, aa paramaa)
    {
      paramaa = paramaa.b();
      if (C != null) {
        contentView = C;
      }
      return paramaa;
    }
  }
  
  public static final class f
    extends ab.q
  {
    ArrayList<CharSequence> a = new ArrayList();
  }
  
  public static final class g
    extends ab.q
  {
    CharSequence a;
    CharSequence b;
    List<a> c = new ArrayList();
    
    public final void a(Bundle paramBundle)
    {
      super.a(paramBundle);
      if (a != null) {
        paramBundle.putCharSequence("android.selfDisplayName", a);
      }
      if (b != null) {
        paramBundle.putCharSequence("android.conversationTitle", b);
      }
      if (!c.isEmpty())
      {
        List localList = c;
        Bundle[] arrayOfBundle = new Bundle[localList.size()];
        int j = localList.size();
        int i = 0;
        while (i < j)
        {
          a locala = (a)localList.get(i);
          Bundle localBundle = new Bundle();
          if (a != null) {
            localBundle.putCharSequence("text", a);
          }
          localBundle.putLong("time", b);
          if (c != null) {
            localBundle.putCharSequence("sender", c);
          }
          if (d != null) {
            localBundle.putString("type", d);
          }
          if (e != null) {
            localBundle.putParcelable("uri", e);
          }
          arrayOfBundle[i] = localBundle;
          i += 1;
        }
        paramBundle.putParcelableArray("android.messages", arrayOfBundle);
      }
    }
    
    public static final class a
    {
      final CharSequence a;
      final long b;
      final CharSequence c;
      String d;
      Uri e;
    }
  }
  
  static abstract interface h
  {
    public abstract Notification a(ab.d paramd);
  }
  
  static class i
    extends ab.p
  {
    public Notification a(ab.d paramd)
    {
      Object localObject = new ac.a(a, F, b, c, h, f, i, d, e, g, p, q, r, k, l, j, n, w, G, y, s, t, u, C, D);
      ab.a((z)localObject, v);
      ab.a((aa)localObject, m);
      localObject = ab.e.a(paramd, (aa)localObject);
      if (m != null) {
        m.a(extras);
      }
      return (Notification)localObject;
    }
  }
  
  static class j
    extends ab.i
  {
    public Notification a(ab.d paramd)
    {
      Object localObject = new ad.a(a, F, b, c, h, f, i, d, e, g, p, q, r, k, l, j, n, w, x, G, y, z, A, B, s, t, u, C, D, E);
      ab.a((z)localObject, v);
      ab.a((aa)localObject, m);
      localObject = ab.e.a(paramd, (aa)localObject);
      if (m != null) {
        m.a(extras);
      }
      return (Notification)localObject;
    }
  }
  
  static final class k
    extends ab.j
  {
    public final Notification a(ab.d paramd)
    {
      Object localObject = new ae.a(a, F, b, c, h, f, i, d, e, g, p, q, r, k, l, j, n, w, x, G, y, z, A, B, s, t, u, o, C, D, E);
      ab.a((z)localObject, v);
      ab.b((aa)localObject, m);
      localObject = ab.e.a(paramd, (aa)localObject);
      if (m != null) {
        m.a(extras);
      }
      return (Notification)localObject;
    }
  }
  
  static class l
    implements ab.h
  {
    public Notification a(ab.d paramd)
    {
      Notification localNotification = af.a(F, a, b, c, d, e);
      if (j > 0) {
        flags |= 0x80;
      }
      if (C != null) {
        contentView = C;
      }
      return localNotification;
    }
    
    public Bundle a(Notification paramNotification)
    {
      return null;
    }
  }
  
  static final class m
    extends ab.l
  {
    public final Notification a(ab.d paramd)
    {
      Object localObject2 = a;
      Notification localNotification = F;
      Object localObject1 = b;
      CharSequence localCharSequence1 = c;
      CharSequence localCharSequence2 = h;
      RemoteViews localRemoteViews = f;
      int i = i;
      PendingIntent localPendingIntent2 = d;
      PendingIntent localPendingIntent1 = e;
      Bitmap localBitmap = g;
      localObject2 = new Notification.Builder((Context)localObject2).setWhen(when).setSmallIcon(icon, iconLevel).setContent(contentView).setTicker(tickerText, localRemoteViews).setSound(sound, audioStreamType).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS);
      if ((flags & 0x2) != 0)
      {
        bool = true;
        localObject2 = ((Notification.Builder)localObject2).setOngoing(bool);
        if ((flags & 0x8) == 0) {
          break label306;
        }
        bool = true;
        label181:
        localObject2 = ((Notification.Builder)localObject2).setOnlyAlertOnce(bool);
        if ((flags & 0x10) == 0) {
          break label311;
        }
        bool = true;
        label202:
        localObject1 = ((Notification.Builder)localObject2).setAutoCancel(bool).setDefaults(defaults).setContentTitle((CharSequence)localObject1).setContentText(localCharSequence1).setContentInfo(localCharSequence2).setContentIntent(localPendingIntent2).setDeleteIntent(deleteIntent);
        if ((flags & 0x80) == 0) {
          break label316;
        }
      }
      label306:
      label311:
      label316:
      for (boolean bool = true;; bool = false)
      {
        localNotification = ((Notification.Builder)localObject1).setFullScreenIntent(localPendingIntent1, bool).setLargeIcon(localBitmap).setNumber(i).getNotification();
        if (C != null) {
          contentView = C;
        }
        return localNotification;
        bool = false;
        break;
        bool = false;
        break label181;
        bool = false;
        break label202;
      }
    }
  }
  
  static final class n
    extends ab.l
  {
    public final Notification a(ab.d paramd)
    {
      return ab.e.a(paramd, new ag.a(a, F, b, c, h, f, i, d, e, g, p, q, r));
    }
  }
  
  static class o
    extends ab.l
  {
    public Notification a(ab.d paramd)
    {
      Object localObject = new ah.a(a, F, b, c, h, f, i, d, e, g, p, q, r, l, j, n, w, y, s, t, u, C, D);
      ab.a((z)localObject, v);
      ab.a((aa)localObject, m);
      localObject = ab.e.a(paramd, (aa)localObject);
      if (m != null)
      {
        Bundle localBundle = a((Notification)localObject);
        if (localBundle != null) {
          m.a(localBundle);
        }
      }
      return (Notification)localObject;
    }
    
    public Bundle a(Notification paramNotification)
    {
      return ah.a(paramNotification);
    }
  }
  
  static class p
    extends ab.o
  {
    public Notification a(ab.d paramd)
    {
      ai.a locala = new ai.a(a, F, b, c, h, f, i, d, e, g, p, q, r, k, l, j, n, w, G, y, s, t, u, C, D);
      ab.a(locala, v);
      ab.a(locala, m);
      return ab.e.a(paramd, locala);
    }
    
    public final Bundle a(Notification paramNotification)
    {
      return extras;
    }
  }
  
  public static abstract class q
  {
    ab.d d;
    CharSequence e;
    CharSequence f;
    boolean g = false;
    
    public void a(Bundle paramBundle) {}
  }
}


/* Location:              android/support/v4/b/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */