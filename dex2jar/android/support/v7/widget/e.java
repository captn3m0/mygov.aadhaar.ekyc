package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

class e
  extends DataSetObservable
{
  static final String a = e.class.getSimpleName();
  private static final Object g = new Object();
  private static final Map<String, e> h = new HashMap();
  final Object b;
  final List<a> c;
  final Context d;
  final String e;
  boolean f;
  private final List<c> i;
  private Intent j;
  private b k;
  private int l;
  private boolean m;
  private boolean n;
  private boolean o;
  private d p;
  
  private boolean d()
  {
    if ((k != null) && (j != null) && (!c.isEmpty()) && (!i.isEmpty()))
    {
      Collections.unmodifiableList(i);
      return true;
    }
    return false;
  }
  
  private void e()
  {
    int i2 = i.size() - l;
    if (i2 <= 0) {}
    for (;;)
    {
      return;
      n = true;
      int i1 = 0;
      while (i1 < i2)
      {
        i.remove(0);
        i1 += 1;
      }
    }
  }
  
  /* Error */
  private void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 106	android/support/v7/widget/e:d	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 108	android/support/v7/widget/e:e	Ljava/lang/String;
    //   8: invokevirtual 114	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 120	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: ldc 122
    //   20: invokeinterface 128 3 0
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: iconst_1
    //   29: if_icmpeq +18 -> 47
    //   32: iload_1
    //   33: iconst_2
    //   34: if_icmpeq +13 -> 47
    //   37: aload_3
    //   38: invokeinterface 131 1 0
    //   43: istore_1
    //   44: goto -17 -> 27
    //   47: ldc -123
    //   49: aload_3
    //   50: invokeinterface 136 1 0
    //   55: invokevirtual 142	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifne +50 -> 108
    //   61: new 102	org/xmlpull/v1/XmlPullParserException
    //   64: dup
    //   65: ldc -112
    //   67: invokespecial 147	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   70: athrow
    //   71: astore_3
    //   72: getstatic 53	android/support/v7/widget/e:a	Ljava/lang/String;
    //   75: new 149	java/lang/StringBuilder
    //   78: dup
    //   79: ldc -105
    //   81: invokespecial 152	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   84: aload_0
    //   85: getfield 108	android/support/v7/widget/e:e	Ljava/lang/String;
    //   88: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: aload_3
    //   95: invokestatic 164	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   98: pop
    //   99: aload_2
    //   100: ifnull +7 -> 107
    //   103: aload_2
    //   104: invokevirtual 169	java/io/FileInputStream:close	()V
    //   107: return
    //   108: aload_0
    //   109: getfield 80	android/support/v7/widget/e:i	Ljava/util/List;
    //   112: astore 4
    //   114: aload 4
    //   116: invokeinterface 172 1 0
    //   121: aload_3
    //   122: invokeinterface 131 1 0
    //   127: istore_1
    //   128: iload_1
    //   129: iconst_1
    //   130: if_icmpeq +138 -> 268
    //   133: iload_1
    //   134: iconst_3
    //   135: if_icmpeq -14 -> 121
    //   138: iload_1
    //   139: iconst_4
    //   140: if_icmpeq -19 -> 121
    //   143: ldc -82
    //   145: aload_3
    //   146: invokeinterface 136 1 0
    //   151: invokevirtual 142	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   154: ifne +52 -> 206
    //   157: new 102	org/xmlpull/v1/XmlPullParserException
    //   160: dup
    //   161: ldc -80
    //   163: invokespecial 147	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   166: athrow
    //   167: astore_3
    //   168: getstatic 53	android/support/v7/widget/e:a	Ljava/lang/String;
    //   171: new 149	java/lang/StringBuilder
    //   174: dup
    //   175: ldc -105
    //   177: invokespecial 152	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   180: aload_0
    //   181: getfield 108	android/support/v7/widget/e:e	Ljava/lang/String;
    //   184: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: aload_3
    //   191: invokestatic 164	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   194: pop
    //   195: aload_2
    //   196: ifnull -89 -> 107
    //   199: aload_2
    //   200: invokevirtual 169	java/io/FileInputStream:close	()V
    //   203: return
    //   204: astore_2
    //   205: return
    //   206: aload 4
    //   208: new 12	android/support/v7/widget/e$c
    //   211: dup
    //   212: aload_3
    //   213: aconst_null
    //   214: ldc -78
    //   216: invokeinterface 182 3 0
    //   221: aload_3
    //   222: aconst_null
    //   223: ldc -72
    //   225: invokeinterface 182 3 0
    //   230: invokestatic 190	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   233: aload_3
    //   234: aconst_null
    //   235: ldc -64
    //   237: invokeinterface 182 3 0
    //   242: invokestatic 198	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   245: invokespecial 201	android/support/v7/widget/e$c:<init>	(Ljava/lang/String;JF)V
    //   248: invokeinterface 204 2 0
    //   253: pop
    //   254: goto -133 -> 121
    //   257: astore_3
    //   258: aload_2
    //   259: ifnull +7 -> 266
    //   262: aload_2
    //   263: invokevirtual 169	java/io/FileInputStream:close	()V
    //   266: aload_3
    //   267: athrow
    //   268: aload_2
    //   269: ifnull -162 -> 107
    //   272: aload_2
    //   273: invokevirtual 169	java/io/FileInputStream:close	()V
    //   276: return
    //   277: astore_2
    //   278: return
    //   279: astore_2
    //   280: return
    //   281: astore_2
    //   282: goto -16 -> 266
    //   285: astore_2
    //   286: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	287	0	this	e
    //   26	115	1	i1	int
    //   11	189	2	localFileInputStream	java.io.FileInputStream
    //   204	69	2	localIOException1	IOException
    //   277	1	2	localIOException2	IOException
    //   279	1	2	localIOException3	IOException
    //   281	1	2	localIOException4	IOException
    //   285	1	2	localFileNotFoundException	FileNotFoundException
    //   15	35	3	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   71	75	3	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   167	67	3	localIOException5	IOException
    //   257	10	3	localObject	Object
    //   112	95	4	localList	List
    // Exception table:
    //   from	to	target	type
    //   12	25	71	org/xmlpull/v1/XmlPullParserException
    //   37	44	71	org/xmlpull/v1/XmlPullParserException
    //   47	71	71	org/xmlpull/v1/XmlPullParserException
    //   108	121	71	org/xmlpull/v1/XmlPullParserException
    //   121	128	71	org/xmlpull/v1/XmlPullParserException
    //   143	167	71	org/xmlpull/v1/XmlPullParserException
    //   206	254	71	org/xmlpull/v1/XmlPullParserException
    //   12	25	167	java/io/IOException
    //   37	44	167	java/io/IOException
    //   47	71	167	java/io/IOException
    //   108	121	167	java/io/IOException
    //   121	128	167	java/io/IOException
    //   143	167	167	java/io/IOException
    //   206	254	167	java/io/IOException
    //   199	203	204	java/io/IOException
    //   12	25	257	finally
    //   37	44	257	finally
    //   47	71	257	finally
    //   72	99	257	finally
    //   108	121	257	finally
    //   121	128	257	finally
    //   143	167	257	finally
    //   168	195	257	finally
    //   206	254	257	finally
    //   272	276	277	java/io/IOException
    //   103	107	279	java/io/IOException
    //   262	266	281	java/io/IOException
    //   0	12	285	java/io/FileNotFoundException
  }
  
  public final int a()
  {
    synchronized (b)
    {
      c();
      int i1 = c.size();
      return i1;
    }
  }
  
  public final int a(ResolveInfo paramResolveInfo)
  {
    for (;;)
    {
      int i1;
      synchronized (b)
      {
        c();
        List localList = c;
        int i2 = localList.size();
        i1 = 0;
        if (i1 < i2)
        {
          if (geta == paramResolveInfo) {
            return i1;
          }
        }
        else {
          return -1;
        }
      }
      i1 += 1;
    }
  }
  
  public final ResolveInfo a(int paramInt)
  {
    synchronized (b)
    {
      c();
      ResolveInfo localResolveInfo = c.get(paramInt)).a;
      return localResolveInfo;
    }
  }
  
  final boolean a(c paramc)
  {
    boolean bool = i.add(paramc);
    Object[] arrayOfObject;
    if (bool)
    {
      n = true;
      e();
      if (!m) {
        throw new IllegalStateException("No preceding call to #readHistoricalData");
      }
      if (n)
      {
        n = false;
        if (!TextUtils.isEmpty(e))
        {
          paramc = new e();
          arrayOfObject = new Object[2];
          arrayOfObject[0] = new ArrayList(i);
          arrayOfObject[1] = e;
          if (Build.VERSION.SDK_INT < 11) {
            break label126;
          }
          paramc.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, arrayOfObject);
        }
      }
    }
    for (;;)
    {
      d();
      notifyChanged();
      return bool;
      label126:
      paramc.execute(arrayOfObject);
    }
  }
  
  public final Intent b(int paramInt)
  {
    synchronized (b)
    {
      if (j == null) {
        return null;
      }
      c();
      Object localObject2 = (a)c.get(paramInt);
      localObject2 = new ComponentName(a.activityInfo.packageName, a.activityInfo.name);
      Intent localIntent = new Intent(j);
      localIntent.setComponent((ComponentName)localObject2);
      if (p != null)
      {
        new Intent(localIntent);
        if (p.a()) {
          return null;
        }
      }
      a(new c((ComponentName)localObject2, System.currentTimeMillis(), 1.0F));
      return localIntent;
    }
  }
  
  public final ResolveInfo b()
  {
    synchronized (b)
    {
      c();
      if (!c.isEmpty())
      {
        ResolveInfo localResolveInfo = c.get(0)).a;
        return localResolveInfo;
      }
      return null;
    }
  }
  
  final void c()
  {
    int i2 = 1;
    int i1;
    if ((o) && (j != null))
    {
      o = false;
      c.clear();
      List localList = d.getPackageManager().queryIntentActivities(j, 0);
      int i3 = localList.size();
      i1 = 0;
      while (i1 < i3)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i1);
        c.add(new a(localResolveInfo));
        i1 += 1;
      }
      i1 = 1;
      if ((!f) || (!n) || (TextUtils.isEmpty(e))) {
        break label167;
      }
      f = false;
      m = true;
      f();
    }
    for (;;)
    {
      e();
      if ((i1 | i2) != 0)
      {
        d();
        notifyChanged();
      }
      return;
      i1 = 0;
      break;
      label167:
      i2 = 0;
    }
  }
  
  public final class a
    implements Comparable<a>
  {
    public final ResolveInfo a;
    public float b;
    
    public a(ResolveInfo paramResolveInfo)
    {
      a = paramResolveInfo;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (a)paramObject;
      } while (Float.floatToIntBits(b) == Float.floatToIntBits(b));
      return false;
    }
    
    public final int hashCode()
    {
      return Float.floatToIntBits(b) + 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("resolveInfo:").append(a.toString());
      localStringBuilder.append("; weight:").append(new BigDecimal(b));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface b {}
  
  public static final class c
  {
    public final ComponentName a;
    public final long b;
    public final float c;
    
    public c(ComponentName paramComponentName, long paramLong, float paramFloat)
    {
      a = paramComponentName;
      b = paramLong;
      c = paramFloat;
    }
    
    public c(String paramString, long paramLong, float paramFloat)
    {
      this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (c)paramObject;
        if (a == null)
        {
          if (a != null) {
            return false;
          }
        }
        else if (!a.equals(a)) {
          return false;
        }
        if (b != b) {
          return false;
        }
      } while (Float.floatToIntBits(c) == Float.floatToIntBits(c));
      return false;
    }
    
    public final int hashCode()
    {
      if (a == null) {}
      for (int i = 0;; i = a.hashCode()) {
        return ((i + 31) * 31 + (int)(b ^ b >>> 32)) * 31 + Float.floatToIntBits(c);
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("; activity:").append(a);
      localStringBuilder.append("; time:").append(b);
      localStringBuilder.append("; weight:").append(new BigDecimal(c));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface d
  {
    public abstract boolean a();
  }
  
  private final class e
    extends AsyncTask<Object, Void, Void>
  {
    e() {}
    
    private Void a(Object... paramVarArgs)
    {
      int i = 0;
      List localList = (List)paramVarArgs[0];
      Object localObject2 = (String)paramVarArgs[1];
      for (;;)
      {
        try
        {
          paramVarArgs = d.openFileOutput((String)localObject2, 0);
          localObject2 = Xml.newSerializer();
          int j;
          e.c localc;
          ((XmlSerializer)localObject2).endTag(null, "historical-records");
        }
        catch (FileNotFoundException paramVarArgs)
        {
          try
          {
            ((XmlSerializer)localObject2).setOutput(paramVarArgs, null);
            ((XmlSerializer)localObject2).startDocument("UTF-8", Boolean.valueOf(true));
            ((XmlSerializer)localObject2).startTag(null, "historical-records");
            j = localList.size();
            if (i >= j) {
              break label210;
            }
            localc = (e.c)localList.remove(0);
            ((XmlSerializer)localObject2).startTag(null, "historical-record");
            ((XmlSerializer)localObject2).attribute(null, "activity", a.flattenToString());
            ((XmlSerializer)localObject2).attribute(null, "time", String.valueOf(b));
            ((XmlSerializer)localObject2).attribute(null, "weight", String.valueOf(c));
            ((XmlSerializer)localObject2).endTag(null, "historical-record");
            i += 1;
            continue;
            paramVarArgs = paramVarArgs;
            Log.e(e.a, "Error writing historical record file: " + (String)localObject2, paramVarArgs);
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            Log.e(e.a, "Error writing historical record file: " + e, localIllegalArgumentException);
            f = true;
            if (paramVarArgs == null) {
              continue;
            }
            try
            {
              paramVarArgs.close();
              return null;
            }
            catch (IOException paramVarArgs)
            {
              return null;
            }
          }
          catch (IllegalStateException localIllegalStateException)
          {
            Log.e(e.a, "Error writing historical record file: " + e, localIllegalStateException);
            f = true;
            if (paramVarArgs == null) {
              continue;
            }
            try
            {
              paramVarArgs.close();
              return null;
            }
            catch (IOException paramVarArgs)
            {
              return null;
            }
          }
          catch (IOException localIOException)
          {
            Log.e(e.a, "Error writing historical record file: " + e, localIOException);
            f = true;
            if (paramVarArgs == null) {
              continue;
            }
            try
            {
              paramVarArgs.close();
              return null;
            }
            catch (IOException paramVarArgs)
            {
              return null;
            }
          }
          finally
          {
            f = true;
            if (paramVarArgs == null) {
              break label429;
            }
          }
          return null;
        }
        label210:
        ((XmlSerializer)localObject2).endDocument();
        f = true;
        if (paramVarArgs != null) {
          try
          {
            paramVarArgs.close();
            return null;
          }
          catch (IOException paramVarArgs)
          {
            return null;
          }
        }
      }
      try
      {
        paramVarArgs.close();
        label429:
        throw ((Throwable)localObject1);
      }
      catch (IOException paramVarArgs)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              android/support/v7/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */