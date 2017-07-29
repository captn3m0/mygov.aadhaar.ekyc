package com.google.android.gms.common.util;

import android.os.Process;

public final class j
{
  private static String a = null;
  private static final int b = Process.myPid();
  
  public static String a()
  {
    String str = a;
    if (str == null)
    {
      int i = b;
      str = a(i);
      a = str;
    }
    return a;
  }
  
  /* Error */
  private static String a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iload_0
    //   3: ifgt +5 -> 8
    //   6: aload_1
    //   7: areturn
    //   8: invokestatic 27	android/os/StrictMode:allowThreadDiskReads	()Landroid/os/StrictMode$ThreadPolicy;
    //   11: astore_2
    //   12: new 29	java/io/BufferedReader
    //   15: astore_3
    //   16: new 31	java/io/FileReader
    //   19: astore 4
    //   21: bipush 25
    //   23: istore 5
    //   25: new 34	java/lang/StringBuilder
    //   28: astore 6
    //   30: aload 6
    //   32: iload 5
    //   34: invokespecial 38	java/lang/StringBuilder:<init>	(I)V
    //   37: ldc 40
    //   39: astore 7
    //   41: aload 6
    //   43: aload 7
    //   45: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: astore 7
    //   50: aload 7
    //   52: iload_0
    //   53: invokevirtual 47	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   56: astore 7
    //   58: ldc 49
    //   60: astore 6
    //   62: aload 7
    //   64: aload 6
    //   66: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: astore 7
    //   71: aload 7
    //   73: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore 7
    //   78: aload 4
    //   80: aload 7
    //   82: invokespecial 56	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   85: aload_3
    //   86: aload 4
    //   88: invokespecial 59	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   91: aload_2
    //   92: invokestatic 63	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   95: aload_3
    //   96: invokevirtual 66	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   99: astore_2
    //   100: aload_2
    //   101: invokevirtual 71	java/lang/String:trim	()Ljava/lang/String;
    //   104: astore_1
    //   105: aload_3
    //   106: invokestatic 76	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   109: goto -103 -> 6
    //   112: astore_3
    //   113: aload_2
    //   114: invokestatic 63	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   117: aload_3
    //   118: athrow
    //   119: astore_3
    //   120: aconst_null
    //   121: astore_3
    //   122: aload_3
    //   123: invokestatic 76	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   126: goto -120 -> 6
    //   129: astore 8
    //   131: aconst_null
    //   132: astore_3
    //   133: aload 8
    //   135: astore_1
    //   136: aload_3
    //   137: invokestatic 76	com/google/android/gms/common/util/h:a	(Ljava/io/Closeable;)V
    //   140: aload_1
    //   141: athrow
    //   142: astore_1
    //   143: goto -7 -> 136
    //   146: astore_2
    //   147: goto -25 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramInt	int
    //   1	140	1	localObject1	Object
    //   142	1	1	localObject2	Object
    //   11	103	2	localObject3	Object
    //   146	1	2	localIOException1	java.io.IOException
    //   15	91	3	localBufferedReader	java.io.BufferedReader
    //   112	6	3	localObject4	Object
    //   119	1	3	localIOException2	java.io.IOException
    //   121	16	3	localCloseable	java.io.Closeable
    //   19	68	4	localFileReader	java.io.FileReader
    //   23	10	5	i	int
    //   28	37	6	localObject5	Object
    //   39	42	7	localObject6	Object
    //   129	5	8	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   12	15	112	finally
    //   16	19	112	finally
    //   25	28	112	finally
    //   32	37	112	finally
    //   43	48	112	finally
    //   52	56	112	finally
    //   64	69	112	finally
    //   71	76	112	finally
    //   80	85	112	finally
    //   86	91	112	finally
    //   8	11	119	java/io/IOException
    //   113	117	119	java/io/IOException
    //   117	119	119	java/io/IOException
    //   8	11	129	finally
    //   113	117	129	finally
    //   117	119	129	finally
    //   91	95	142	finally
    //   95	99	142	finally
    //   100	104	142	finally
    //   91	95	146	java/io/IOException
    //   95	99	146	java/io/IOException
    //   100	104	146	java/io/IOException
  }
}


/* Location:              com/google/android/gms/common/util/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */