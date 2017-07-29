package com.google.android.gms.ads.internal.purchase;

import android.util.Base64;
import com.google.android.gms.b.tp;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public final class l
{
  public static PublicKey a(String paramString)
  {
    byte[] arrayOfByte = null;
    try
    {
      arrayOfByte = Base64.decode(paramString, 0);
      localObject = "RSA";
      localObject = KeyFactory.getInstance((String)localObject);
      X509EncodedKeySpec localX509EncodedKeySpec = new java/security/spec/X509EncodedKeySpec;
      localX509EncodedKeySpec.<init>(arrayOfByte);
      return ((KeyFactory)localObject).generatePublic(localX509EncodedKeySpec);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject);
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      tp.c("Invalid key specification.");
      Object localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>(localInvalidKeySpecException);
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean a(PublicKey paramPublicKey, String paramString1, String paramString2)
  {
    boolean bool1 = false;
    Object localObject = "SHA1withRSA";
    for (;;)
    {
      try
      {
        localObject = Signature.getInstance((String)localObject);
        ((Signature)localObject).initVerify(paramPublicKey);
        byte[] arrayOfByte = paramString1.getBytes();
        ((Signature)localObject).update(arrayOfByte);
        arrayOfByte = null;
        arrayOfByte = Base64.decode(paramString2, 0);
        boolean bool2 = ((Signature)localObject).verify(arrayOfByte);
        if (bool2) {
          continue;
        }
        localObject = "Signature verification failed.";
        tp.c((String)localObject);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        String str1 = "NoSuchAlgorithmException.";
        tp.c(str1);
        continue;
      }
      catch (InvalidKeyException localInvalidKeyException)
      {
        String str2 = "Invalid key specification.";
        tp.c(str2);
        continue;
      }
      catch (SignatureException localSignatureException)
      {
        String str3 = "Signature exception.";
        tp.c(str3);
        continue;
      }
      return bool1;
      bool1 = true;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */