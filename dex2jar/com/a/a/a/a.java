package com.a.a.a;

import android.os.SystemClock;
import com.a.a.b.a;
import com.a.a.h;
import com.a.a.i;
import com.a.a.j;
import com.a.a.l;
import com.a.a.p;
import com.a.a.q;
import com.a.a.r;
import com.a.a.s;
import com.a.a.t;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.cookie.DateUtils;

public final class a
  implements com.a.a.f
{
  protected static final boolean a = t.b;
  private static int d = 3000;
  private static int e = 4096;
  protected final f b;
  protected final b c;
  
  public a(f paramf)
  {
    this(paramf, new b(e));
  }
  
  private a(f paramf, b paramb)
  {
    b = paramf;
    c = paramb;
  }
  
  private static Map<String, String> a(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    int i = 0;
    while (i < paramArrayOfHeader.length)
    {
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
      i += 1;
    }
    return localTreeMap;
  }
  
  private static void a(String paramString, l<?> paraml, s params)
  {
    p localp = j;
    int i = paraml.f();
    try
    {
      localp.a(params);
      paraml.a(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      return;
    }
    catch (s params)
    {
      paraml.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      throw params;
    }
  }
  
  private byte[] a(HttpEntity paramHttpEntity)
  {
    k localk = new k(c, (int)paramHttpEntity.getContentLength());
    Object localObject2 = null;
    Object localObject1 = localObject2;
    Object localObject4;
    try
    {
      localObject4 = paramHttpEntity.getContent();
      if (localObject4 == null)
      {
        localObject1 = localObject2;
        throw new q();
      }
    }
    finally {}
    try
    {
      paramHttpEntity.consumeContent();
      c.a((byte[])localObject1);
      localk.close();
      throw ((Throwable)localObject3);
      localObject1 = localObject3;
      byte[] arrayOfByte = c.a(1024);
      for (;;)
      {
        localObject1 = arrayOfByte;
        int i = ((InputStream)localObject4).read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localObject1 = arrayOfByte;
        localk.write(arrayOfByte, 0, i);
      }
      localObject1 = arrayOfByte;
      localObject4 = localk.toByteArray();
      try
      {
        paramHttpEntity.consumeContent();
        c.a(arrayOfByte);
        localk.close();
        return (byte[])localObject4;
      }
      catch (IOException paramHttpEntity)
      {
        for (;;)
        {
          t.a("Error occured when calling consumingContent", new Object[0]);
        }
      }
    }
    catch (IOException paramHttpEntity)
    {
      for (;;)
      {
        t.a("Error occured when calling consumingContent", new Object[0]);
      }
    }
  }
  
  public final i a(l<?> paraml)
  {
    long l1 = SystemClock.elapsedRealtime();
    for (;;)
    {
      Map localMap = null;
      localObject6 = Collections.emptyMap();
      try
      {
        Object localObject1 = new HashMap();
        Object localObject4 = k;
        if (localObject4 != null)
        {
          if (b != null) {
            ((Map)localObject1).put("If-None-Match", b);
          }
          if (d > 0L) {
            ((Map)localObject1).put("If-Modified-Since", DateUtils.formatDate(new Date(d)));
          }
        }
        localObject4 = b.a(paraml, (Map)localObject1);
        localObject1 = localObject6;
        for (;;)
        {
          int i;
          Object localObject3;
          Object localObject5;
          try
          {
            localStatusLine = ((HttpResponse)localObject4).getStatusLine();
            localObject1 = localObject6;
            i = localStatusLine.getStatusCode();
            localObject1 = localObject6;
            localMap = a(((HttpResponse)localObject4).getAllHeaders());
            if (i == 304)
            {
              localObject1 = localMap;
              localObject6 = k;
              if (localObject6 == null)
              {
                localObject1 = localMap;
                return new i(304, null, localMap, true, SystemClock.elapsedRealtime() - l1);
              }
              localObject1 = localMap;
              g.putAll(localMap);
              localObject1 = localMap;
              return new i(304, a, g, true, SystemClock.elapsedRealtime() - l1);
            }
            localObject1 = localMap;
            if (((HttpResponse)localObject4).getEntity() != null)
            {
              localObject1 = localMap;
              localObject6 = a(((HttpResponse)localObject4).getEntity());
              localObject1 = localObject6;
            }
          }
          catch (IOException localIOException3)
          {
            long l2;
            Object localObject2;
            StatusLine localStatusLine = null;
            localObject6 = localIOException1;
            localObject5 = localIOException3;
            continue;
          }
          try
          {
            l2 = SystemClock.elapsedRealtime() - l1;
            if ((!a) && (l2 <= d)) {
              break label688;
            }
            if (localObject1 == null) {
              continue;
            }
            localObject6 = Integer.valueOf(localObject1.length);
            t.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paraml, Long.valueOf(l2), localObject6, Integer.valueOf(localStatusLine.getStatusCode()), Integer.valueOf(j.b()) });
          }
          catch (IOException localIOException2)
          {
            localObject6 = localObject5;
            localObject5 = localIOException2;
            Object localObject7 = localObject3;
            localObject3 = localIOException3;
            continue;
            if (i < 200) {
              continue;
            }
            if (i <= 299) {
              continue;
            }
          }
        }
        throw new IOException();
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        for (;;)
        {
          a("socket", paraml, new r());
          break;
          localObject2 = localMap;
          localObject6 = new byte[0];
          localObject2 = localObject6;
          continue;
          localObject6 = "null";
        }
        localObject6 = new i(i, (byte[])localObject2, localMap, false, SystemClock.elapsedRealtime() - l1);
        return (i)localObject6;
      }
      catch (ConnectTimeoutException localConnectTimeoutException)
      {
        a("connection", paraml, new r());
      }
      catch (MalformedURLException localMalformedURLException)
      {
        paraml = String.valueOf(b);
        if (paraml.length() != 0) {}
        for (paraml = "Bad URL ".concat(paraml);; paraml = new String("Bad URL ")) {
          throw new RuntimeException(paraml, localMalformedURLException);
        }
      }
      catch (IOException localIOException1)
      {
        localStatusLine = null;
        localObject3 = localObject6;
        localObject6 = localMap;
        if (localObject6 != null)
        {
          i = ((HttpResponse)localObject6).getStatusLine().getStatusCode();
          t.c("Unexpected response code %d for %s", new Object[] { Integer.valueOf(i), b });
          if (localStatusLine == null) {
            break label642;
          }
          localObject3 = new i(i, localStatusLine, (Map)localObject3, false, SystemClock.elapsedRealtime() - l1);
          if ((i == 401) || (i == 403)) {
            a("auth", paraml, new com.a.a.a((i)localObject3));
          }
        }
        else
        {
          throw new j(localIOException1);
        }
      }
    }
    throw new q((i)localObject3);
    label642:
    throw new h((byte)0);
  }
}


/* Location:              com/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */