package mygov.aadhaar.ekyc.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public final class b
  extends AsyncTask
{
  private static Bitmap a(String[] paramArrayOfString)
  {
    Bitmap localBitmap = null;
    try
    {
      Object localObject = new java/net/URL;
      String str = null;
      str = paramArrayOfString[0];
      ((URL)localObject).<init>(str);
      localObject = ((URL)localObject).openConnection();
      localObject = ((URLConnection)localObject).getInputStream();
      localBitmap = BitmapFactory.decodeStream((InputStream)localObject);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      for (;;)
      {
        localMalformedURLException.printStackTrace();
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
    return localBitmap;
  }
}


/* Location:              mygov/aadhaar/ekyc/b/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */