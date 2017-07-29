package mygov.aadhaar.ekyc.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public final class b
  extends AsyncTask<String, String, Bitmap>
{
  private static Bitmap a(String[] paramArrayOfString)
  {
    try
    {
      paramArrayOfString = BitmapFactory.decodeStream(new URL(paramArrayOfString[0]).openConnection().getInputStream());
      return paramArrayOfString;
    }
    catch (MalformedURLException paramArrayOfString)
    {
      paramArrayOfString.printStackTrace();
      return null;
    }
    catch (IOException paramArrayOfString)
    {
      paramArrayOfString.printStackTrace();
    }
    return null;
  }
}


/* Location:              mygov/aadhaar/ekyc/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */