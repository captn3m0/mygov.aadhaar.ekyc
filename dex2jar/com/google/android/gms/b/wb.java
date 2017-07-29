package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class wb
  extends a
{
  public static final Parcelable.Creator<wb> CREATOR = new wc();
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
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof wb)) {
        break;
      }
      paramObject = (wb)paramObject;
    } while ((b.a(a, a)) && (Arrays.equals(b, b)) && (Arrays.equals(c, c)) && (Arrays.equals(d, d)) && (b.a(h, h)) && (b.a(i, i)) && (b.a(j, j)) && (Arrays.equals(e, e)) && (Arrays.deepEquals(f, f)) && (g == g));
    return false;
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, d, h, i, j, e, f, Boolean.valueOf(g) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LogEventParcelable[").append(a).append(", LogEventBytes: ");
    if (b == null) {}
    for (String str = null;; str = new String(b)) {
      return str + ", TestCodes: " + Arrays.toString(c) + ", MendelPackages: " + Arrays.toString(d) + ", LogEvent: " + h + ", ExtensionProducer: " + i + ", VeProducer: " + j + ", ExperimentIDs: " + Arrays.toString(e) + ", ExperimentTokens: " + Arrays.toString(f) + ", AddPhenotypeExperimentTokens: " + g + "]";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    wc.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/wb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */