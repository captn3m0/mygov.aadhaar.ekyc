package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Iterator;

@qi
public final class hf
{
  final Object a = new Object();
  int b = 0;
  int c = 0;
  int d = 0;
  int e;
  String f = "";
  String g = "";
  String h = "";
  private final int i;
  private final int j;
  private final int k;
  private final hl l;
  private final hq m;
  private ArrayList<String> n = new ArrayList();
  private ArrayList<String> o = new ArrayList();
  private ArrayList<hj> p = new ArrayList();
  
  public hf(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    i = paramInt1;
    j = paramInt2;
    k = paramInt3;
    l = new hl(paramInt4);
    m = new hq(paramInt5, paramInt6, paramInt7);
  }
  
  private static String a(ArrayList<String> paramArrayList)
  {
    if (paramArrayList.isEmpty()) {
      paramArrayList = "";
    }
    Object localObject;
    do
    {
      return paramArrayList;
      localObject = new StringBuffer();
      paramArrayList = paramArrayList.iterator();
      do
      {
        if (!paramArrayList.hasNext()) {
          break;
        }
        ((StringBuffer)localObject).append((String)paramArrayList.next());
        ((StringBuffer)localObject).append(' ');
      } while (((StringBuffer)localObject).length() <= 100);
      ((StringBuffer)localObject).deleteCharAt(((StringBuffer)localObject).length() - 1);
      localObject = ((StringBuffer)localObject).toString();
      paramArrayList = (ArrayList<String>)localObject;
    } while (((String)localObject).length() < 100);
    return ((String)localObject).substring(0, 100);
  }
  
  public final void a(String arg1, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    b(???, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    synchronized (a)
    {
      if (d < 0) {
        tp.b("ActivityContent: negative number of WebViews.");
      }
      c();
      return;
    }
  }
  
  public final boolean a()
  {
    for (;;)
    {
      synchronized (a)
      {
        if (d == 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final void b()
  {
    synchronized (a)
    {
      d += 1;
      return;
    }
  }
  
  final void b(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((paramString == null) || (paramString.length() < k)) {
      return;
    }
    synchronized (a)
    {
      n.add(paramString);
      b += paramString.length();
      if (paramBoolean)
      {
        o.add(paramString);
        p.add(new hj(paramFloat1, paramFloat2, paramFloat3, paramFloat4, o.size() - 1));
      }
      return;
    }
  }
  
  public final void c()
  {
    synchronized (a)
    {
      int i1 = b;
      int i2 = c;
      i1 = i1 * i + i2 * j;
      if (i1 > e)
      {
        e = i1;
        jz localjz = ke.ac;
        if ((((Boolean)w.q().a(localjz)).booleanValue()) && (!w.i().a()))
        {
          f = l.a(n);
          g = l.a(o);
        }
        localjz = ke.ae;
        if ((((Boolean)w.q().a(localjz)).booleanValue()) && (!w.i().b())) {
          h = m.a(o, p);
        }
      }
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof hf)) {}
    do
    {
      return false;
      if (paramObject == this) {
        return true;
      }
      paramObject = (hf)paramObject;
    } while ((f == null) || (!f.equals(f)));
    return true;
  }
  
  public final int hashCode()
  {
    return f.hashCode();
  }
  
  public final String toString()
  {
    int i1 = c;
    int i2 = e;
    int i3 = b;
    String str1 = String.valueOf(a(n));
    String str2 = String.valueOf(a(o));
    String str3 = f;
    String str4 = g;
    String str5 = h;
    return String.valueOf(str1).length() + 165 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + "ActivityContent fetchId: " + i1 + " score:" + i2 + " total_length:" + i3 + "\n text: " + str1 + "\n viewableText" + str2 + "\n signture: " + str3 + "\n viewableSignture: " + str4 + "\n viewableSignatureForVertical: " + str5;
  }
}


/* Location:              com/google/android/gms/b/hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */