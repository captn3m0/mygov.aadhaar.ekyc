package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class wb
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public wj a;
  public byte[] b;
  public int[] c;
  public String[] d;
  public int[] e;
  public byte[][] f;
  public boolean g;
  public final gf.d h;
  public final vz.c i;
  public final vz.c j;
  
  static
  {
    wc localwc = new com/google/android/gms/b/wc;
    localwc.<init>();
    CREATOR = localwc;
  }
  
  public wb(wj paramwj, gf.d paramd, vz.c paramc, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    a = paramwj;
    h = paramd;
    i = paramc;
    j = null;
    c = paramArrayOfInt1;
    d = paramArrayOfString;
    e = paramArrayOfInt2;
    f = paramArrayOfByte;
    g = paramBoolean;
  }
  
  wb(wj paramwj, byte[] paramArrayOfByte, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte1, boolean paramBoolean)
  {
    a = paramwj;
    b = paramArrayOfByte;
    c = paramArrayOfInt1;
    d = paramArrayOfString;
    h = null;
    i = null;
    j = null;
    e = paramArrayOfInt2;
    f = paramArrayOfByte1;
    g = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof wb;
      if (bool2)
      {
        paramObject = (wb)paramObject;
        Object localObject1 = a;
        Object localObject2 = a;
        bool2 = b.a(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = b;
          localObject2 = b;
          bool2 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
          if (bool2)
          {
            localObject1 = c;
            localObject2 = c;
            bool2 = Arrays.equals((int[])localObject1, (int[])localObject2);
            if (bool2)
            {
              localObject1 = d;
              localObject2 = d;
              bool2 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
              if (bool2)
              {
                localObject1 = h;
                localObject2 = h;
                bool2 = b.a(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = i;
                  localObject2 = i;
                  bool2 = b.a(localObject1, localObject2);
                  if (bool2)
                  {
                    localObject1 = j;
                    localObject2 = j;
                    bool2 = b.a(localObject1, localObject2);
                    if (bool2)
                    {
                      localObject1 = e;
                      localObject2 = e;
                      bool2 = Arrays.equals((int[])localObject1, (int[])localObject2);
                      if (bool2)
                      {
                        localObject1 = f;
                        localObject2 = f;
                        bool2 = Arrays.deepEquals((Object[])localObject1, (Object[])localObject2);
                        if (bool2)
                        {
                          bool2 = g;
                          boolean bool3 = g;
                          if (bool2 == bool3) {
                            continue;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[10];
    Object localObject = a;
    arrayOfObject[0] = localObject;
    localObject = b;
    arrayOfObject[1] = localObject;
    localObject = c;
    arrayOfObject[2] = localObject;
    localObject = d;
    arrayOfObject[3] = localObject;
    localObject = h;
    arrayOfObject[4] = localObject;
    localObject = i;
    arrayOfObject[5] = localObject;
    localObject = j;
    arrayOfObject[6] = localObject;
    localObject = e;
    arrayOfObject[7] = localObject;
    localObject = f;
    arrayOfObject[8] = localObject;
    localObject = Boolean.valueOf(g);
    arrayOfObject[9] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("LogEventParcelable[");
    Object localObject2 = a;
    localObject2 = ((StringBuilder)localObject1).append(localObject2).append(", LogEventBytes: ");
    localObject1 = b;
    if (localObject1 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append(", TestCodes: ");
      localObject2 = Arrays.toString(c);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", MendelPackages: ");
      localObject2 = Arrays.toString(d);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", LogEvent: ");
      localObject2 = h;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", ExtensionProducer: ");
      localObject2 = i;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", VeProducer: ");
      localObject2 = j;
      localObject1 = ((StringBuilder)localObject1).append(localObject2).append(", ExperimentIDs: ");
      localObject2 = Arrays.toString(e);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", ExperimentTokens: ");
      localObject2 = Arrays.toString(f);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(", AddPhenotypeExperimentTokens: ");
      boolean bool = g;
      return bool + "]";
      localObject1 = new java/lang/String;
      byte[] arrayOfByte = b;
      ((String)localObject1).<init>(arrayOfByte);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    wc.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/wb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */