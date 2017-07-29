package mygov.aadhaar.ekyc.c;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.a.b.c;
import org.a.d.e;

public final class a
  implements e
{
  private static final Charset a = Charset.forName("UTF-8");
  private final AssetManager b;
  private final String c;
  
  public a(Resources paramResources, String paramString)
  {
    AssetManager localAssetManager = paramResources.getAssets();
    b = localAssetManager;
    c = paramString;
  }
  
  private String a(String paramString)
  {
    int i = 1024;
    Object localObject1;
    for (;;)
    {
      try
      {
        char[] arrayOfChar = new char[i];
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        Object localObject2 = b;
        localObject3 = c;
        if (localObject3 == null)
        {
          localObject2 = ((AssetManager)localObject2).open(paramString);
          localObject3 = new java/io/InputStreamReader;
          localObject4 = a;
          ((InputStreamReader)localObject3).<init>((InputStream)localObject2, (Charset)localObject4);
          int j = ((InputStreamReader)localObject3).read(arrayOfChar);
          if (j <= 0) {
            break;
          }
          localObject4 = null;
          ((StringBuilder)localObject1).append(arrayOfChar, 0, j);
          continue;
        }
        localObject3 = new java/lang/StringBuilder;
      }
      catch (IOException localIOException)
      {
        localObject1 = new org/a/b/c;
        ((c)localObject1).<init>("Couldn't read Keyczar 'meta' file from assets/", localIOException);
        throw ((Throwable)localObject1);
      }
      ((StringBuilder)localObject3).<init>();
      Object localObject4 = c;
      Object localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = File.separator;
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).append(paramString);
      paramString = ((StringBuilder)localObject3).toString();
    }
    return ((StringBuilder)localObject1).toString();
  }
  
  public final String a()
  {
    return a("meta");
  }
  
  public final String a(int paramInt)
  {
    String str = String.valueOf(paramInt);
    return a(str);
  }
}


/* Location:              mygov/aadhaar/ekyc/c/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */