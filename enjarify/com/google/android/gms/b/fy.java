package com.google.android.gms.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class fy
  implements Cloneable
{
  List a;
  private fw b;
  private Object c;
  
  fy()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
  }
  
  private byte[] b()
  {
    byte[] arrayOfByte = new byte[a()];
    int i = arrayOfByte.length;
    fu localfu = fu.a(arrayOfByte, i);
    a(localfu);
    return arrayOfByte;
  }
  
  private fy c()
  {
    int i = 0;
    Object localObject1 = null;
    fy localfy = new com/google/android/gms/b/fy;
    localfy.<init>();
    boolean bool;
    do
    {
      for (;;)
      {
        try
        {
          Object localObject2 = b;
          b = ((fw)localObject2);
          localObject2 = a;
          if (localObject2 == null)
          {
            bool = false;
            localObject2 = null;
            a = null;
            localObject2 = c;
            if (localObject2 != null)
            {
              localObject2 = c;
              bool = localObject2 instanceof gb;
              if (bool)
              {
                localObject2 = c;
                localObject2 = (gb)localObject2;
                localObject2 = ((gb)localObject2).clone();
                localObject2 = (gb)localObject2;
                c = localObject2;
              }
            }
            else
            {
              return localfy;
            }
          }
          else
          {
            localObject2 = a;
            localList = a;
            ((List)localObject2).addAll(localList);
            continue;
          }
          localObject3 = c;
        }
        catch (CloneNotSupportedException localCloneNotSupportedException)
        {
          localObject1 = new java/lang/AssertionError;
          ((AssertionError)localObject1).<init>(localCloneNotSupportedException);
          throw ((Throwable)localObject1);
        }
        bool = localObject3 instanceof byte[];
        if (bool)
        {
          localObject3 = c;
          localObject3 = (byte[])localObject3;
          localObject3 = ((byte[])localObject3).clone();
          c = localObject3;
        }
        else
        {
          localObject3 = c;
          bool = localObject3 instanceof byte[][];
          if (bool)
          {
            localObject3 = c;
            localObject3 = (byte[][])localObject3;
            j = localObject3.length;
            localObject4 = new byte[j][];
            c = localObject4;
            j = 0;
            localList = null;
            for (;;)
            {
              i = localObject3.length;
              if (j >= i) {
                break;
              }
              localObject1 = localObject3[j];
              localObject1 = ((byte[])localObject1).clone();
              localObject1 = (byte[])localObject1;
              localObject4[j] = localObject1;
              i = j + 1;
              j = i;
            }
          }
          localObject3 = c;
          bool = localObject3 instanceof boolean[];
          if (bool)
          {
            localObject3 = c;
            localObject3 = (boolean[])localObject3;
            localObject3 = ((boolean[])localObject3).clone();
            c = localObject3;
          }
          else
          {
            localObject3 = c;
            bool = localObject3 instanceof int[];
            if (bool)
            {
              localObject3 = c;
              localObject3 = (int[])localObject3;
              localObject3 = ((int[])localObject3).clone();
              c = localObject3;
            }
            else
            {
              localObject3 = c;
              bool = localObject3 instanceof long[];
              if (bool)
              {
                localObject3 = c;
                localObject3 = (long[])localObject3;
                localObject3 = ((long[])localObject3).clone();
                c = localObject3;
              }
              else
              {
                localObject3 = c;
                bool = localObject3 instanceof float[];
                if (bool)
                {
                  localObject3 = c;
                  localObject3 = (float[])localObject3;
                  localObject3 = ((float[])localObject3).clone();
                  c = localObject3;
                }
                else
                {
                  localObject3 = c;
                  bool = localObject3 instanceof double[];
                  if (!bool) {
                    break;
                  }
                  localObject3 = c;
                  localObject3 = (double[])localObject3;
                  localObject3 = ((double[])localObject3).clone();
                  c = localObject3;
                }
              }
            }
          }
        }
      }
      localObject3 = c;
      bool = localObject3 instanceof gb[];
    } while (!bool);
    Object localObject3 = c;
    localObject3 = (gb[])localObject3;
    int j = localObject3.length;
    Object localObject4 = new gb[j];
    c = localObject4;
    j = 0;
    List localList = null;
    for (;;)
    {
      i = localObject3.length;
      if (j >= i) {
        break;
      }
      localObject1 = localObject3[j];
      localObject1 = ((gb)localObject1).clone();
      localObject1 = (gb)localObject1;
      localObject4[j] = localObject1;
      i = j + 1;
      j = i;
    }
  }
  
  final int a()
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject2 = c;
    if (localObject2 != null)
    {
      localObject1 = b;
      localObject2 = c;
      j = ((fw)localObject1).a(localObject2);
      return j;
    }
    Iterator localIterator = a.iterator();
    int j = 0;
    localObject2 = null;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (gd)localIterator.next();
      int k = fu.d(a) + 0;
      localObject1 = b;
      int i = localObject1.length + k + j;
      j = i;
    }
  }
  
  final void a(fu paramfu)
  {
    Object localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = b;
      localObject2 = c;
      ((fw)localObject1).a(localObject2, paramfu);
      return;
    }
    localObject1 = a;
    Object localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (gd)((Iterator)localObject2).next();
      int i = a;
      paramfu.c(i);
      localObject1 = b;
      paramfu.b((byte[])localObject1);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    if (paramObject == this) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof fy;
      if (!bool2) {
        continue;
      }
      paramObject = (fy)paramObject;
      Object localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = c;
        if (localObject2 != null)
        {
          localObject2 = b;
          fw localfw = b;
          if (localObject2 != localfw) {
            continue;
          }
          localObject1 = b.b;
          bool1 = ((Class)localObject1).isArray();
          if (!bool1)
          {
            localObject1 = c;
            localObject2 = c;
            bool1 = localObject1.equals(localObject2);
            continue;
          }
          localObject1 = c;
          bool1 = localObject1 instanceof byte[];
          if (bool1)
          {
            localObject1 = (byte[])c;
            localObject2 = (byte[])c;
            bool1 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
            continue;
          }
          localObject1 = c;
          bool1 = localObject1 instanceof int[];
          if (bool1)
          {
            localObject1 = (int[])c;
            localObject2 = (int[])c;
            bool1 = Arrays.equals((int[])localObject1, (int[])localObject2);
            continue;
          }
          localObject1 = c;
          bool1 = localObject1 instanceof long[];
          if (bool1)
          {
            localObject1 = (long[])c;
            localObject2 = (long[])c;
            bool1 = Arrays.equals((long[])localObject1, (long[])localObject2);
            continue;
          }
          localObject1 = c;
          bool1 = localObject1 instanceof float[];
          if (bool1)
          {
            localObject1 = (float[])c;
            localObject2 = (float[])c;
            bool1 = Arrays.equals((float[])localObject1, (float[])localObject2);
            continue;
          }
          localObject1 = c;
          bool1 = localObject1 instanceof double[];
          if (bool1)
          {
            localObject1 = (double[])c;
            localObject2 = (double[])c;
            bool1 = Arrays.equals((double[])localObject1, (double[])localObject2);
            continue;
          }
          localObject1 = c;
          bool1 = localObject1 instanceof boolean[];
          if (bool1)
          {
            localObject1 = (boolean[])c;
            localObject2 = (boolean[])c;
            bool1 = Arrays.equals((boolean[])localObject1, (boolean[])localObject2);
            continue;
          }
          localObject1 = (Object[])c;
          localObject2 = (Object[])c;
          bool1 = Arrays.deepEquals((Object[])localObject1, (Object[])localObject2);
          continue;
        }
      }
      localObject1 = a;
      if (localObject1 != null)
      {
        localObject1 = a;
        if (localObject1 != null)
        {
          localObject1 = a;
          localObject2 = a;
          bool1 = ((List)localObject1).equals(localObject2);
          continue;
        }
      }
      try
      {
        localObject1 = b();
        localObject2 = ((fy)paramObject).b();
        bool1 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
      }
      catch (IOException localIOException)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>(localIOException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public final int hashCode()
  {
    try
    {
      byte[] arrayOfByte = b();
      return Arrays.hashCode(arrayOfByte) + 527;
    }
    catch (IOException localIOException)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(localIOException);
      throw localIllegalStateException;
    }
  }
}


/* Location:              com/google/android/gms/b/fy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */