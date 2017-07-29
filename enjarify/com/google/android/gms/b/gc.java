package com.google.android.gms.b;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class gc
{
  public static String a(gb paramgb)
  {
    Object localObject;
    if (paramgb == null) {
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      String str3 = null;
      try
      {
        StringBuffer localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>();
        a(null, paramgb, localStringBuffer, (StringBuffer)localObject);
        localObject = ((StringBuffer)localObject).toString();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        str3 = "Error printing proto: ";
        String str1 = String.valueOf(localIllegalAccessException.getMessage());
        i = str1.length();
        if (i != 0)
        {
          str1 = str3.concat(str1);
        }
        else
        {
          str1 = new java/lang/String;
          str1.<init>(str3);
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        str3 = "Error printing proto: ";
        String str2 = String.valueOf(localInvocationTargetException.getMessage());
        int i = str2.length();
        if (i != 0)
        {
          str2 = str3.concat(str2);
        }
        else
        {
          str2 = new java/lang/String;
          str2.<init>(str3);
        }
      }
    }
  }
  
  private static String a(String paramString)
  {
    StringBuffer localStringBuffer1 = new java/lang/StringBuffer;
    localStringBuffer1.<init>();
    int i = 0;
    int j = paramString.length();
    if (i < j)
    {
      j = paramString.charAt(i);
      char c1;
      if (i == 0)
      {
        c1 = Character.toLowerCase(j);
        localStringBuffer1.append(c1);
      }
      for (;;)
      {
        i += 1;
        break;
        boolean bool = Character.isUpperCase(c1);
        if (bool)
        {
          char c2 = '_';
          StringBuffer localStringBuffer2 = localStringBuffer1.append(c2);
          c1 = Character.toLowerCase(c1);
          localStringBuffer2.append(c1);
        }
        else
        {
          localStringBuffer1.append(c1);
        }
      }
    }
    return localStringBuffer1.toString();
  }
  
  private static void a(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    int i = 200;
    String str1 = null;
    if (paramObject != null)
    {
      boolean bool1 = paramObject instanceof gb;
      if (!bool1) {
        break label655;
      }
      int n = paramStringBuffer1.length();
      Object localObject1;
      if (paramString != null)
      {
        localObject1 = paramStringBuffer2.append(paramStringBuffer1);
        localObject3 = a(paramString);
        localObject1 = ((StringBuffer)localObject1).append((String)localObject3);
        localObject3 = " <\n";
        ((StringBuffer)localObject1).append((String)localObject3);
        localObject1 = "  ";
        paramStringBuffer1.append((String)localObject1);
      }
      Class localClass = paramObject.getClass();
      Field[] arrayOfField = localClass.getFields();
      int i1 = arrayOfField.length;
      i = 0;
      Method[] arrayOfMethod = null;
      Object localObject4;
      int i6;
      while (i < i1)
      {
        localObject1 = arrayOfField[i];
        int i3 = ((Field)localObject1).getModifiers();
        localObject4 = ((Field)localObject1).getName();
        Object localObject5 = "cachedSize";
        boolean bool6 = ((String)localObject5).equals(localObject4);
        if (!bool6)
        {
          bool6 = i3 & 0x1;
          boolean bool7 = true;
          if (bool6 == bool7)
          {
            i3 &= 0x8;
            i6 = 8;
            if (i3 != i6)
            {
              localObject3 = "_";
              int i4 = ((String)localObject4).startsWith((String)localObject3);
              if (i4 == 0)
              {
                localObject3 = "_";
                i4 = ((String)localObject4).endsWith((String)localObject3);
                if (i4 == 0)
                {
                  localObject3 = ((Field)localObject1).getType();
                  localObject5 = ((Field)localObject1).get(paramObject);
                  bool1 = ((Class)localObject3).isArray();
                  if (bool1)
                  {
                    localObject1 = ((Class)localObject3).getComponentType();
                    localObject3 = Byte.TYPE;
                    if (localObject1 != localObject3)
                    {
                      if (localObject5 == null)
                      {
                        bool1 = false;
                        localObject1 = null;
                      }
                      for (;;)
                      {
                        i4 = 0;
                        localObject3 = null;
                        while (i4 < bool1)
                        {
                          Object localObject6 = Array.get(localObject5, i4);
                          a((String)localObject4, localObject6, paramStringBuffer1, paramStringBuffer2);
                          i4 += 1;
                        }
                        j = Array.getLength(localObject5);
                      }
                    }
                  }
                  a((String)localObject4, localObject5, paramStringBuffer1, paramStringBuffer2);
                }
              }
            }
          }
        }
        int j = i + 1;
        i = j;
      }
      arrayOfMethod = localClass.getMethods();
      int i7 = arrayOfMethod.length;
      int i5 = 0;
      localObject3 = null;
      if (i5 < i7)
      {
        localObject1 = arrayOfMethod[i5].getName();
        String str3 = "set";
        boolean bool5 = ((String)localObject1).startsWith(str3);
        if (bool5)
        {
          int i2 = 3;
          str3 = ((String)localObject1).substring(i2);
          localObject4 = "has";
        }
        for (;;)
        {
          try
          {
            localObject1 = String.valueOf(str3);
            i6 = ((String)localObject1).length();
            if (i6 != 0)
            {
              localObject1 = ((String)localObject4).concat((String)localObject1);
              localObject4 = null;
              localObject4 = new Class[0];
              localObject1 = localClass.getMethod((String)localObject1, (Class[])localObject4);
              localObject4 = new Object[0];
              localObject1 = (Boolean)((Method)localObject1).invoke(paramObject, (Object[])localObject4);
              boolean bool2 = ((Boolean)localObject1).booleanValue();
              if (bool2) {
                localObject4 = "get";
              }
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException1)
          {
            int k;
            continue;
            String str2 = new java/lang/String;
            str2.<init>((String)localObject4);
            continue;
          }
          try
          {
            localObject1 = String.valueOf(str3);
            i6 = ((String)localObject1).length();
            if (i6 == 0) {
              continue;
            }
            localObject1 = ((String)localObject4).concat((String)localObject1);
            localObject4 = null;
            localObject4 = new Class[0];
            localObject1 = localClass.getMethod((String)localObject1, (Class[])localObject4);
            localObject4 = new Object[0];
            localObject1 = ((Method)localObject1).invoke(paramObject, (Object[])localObject4);
            a(str3, localObject1, paramStringBuffer1, paramStringBuffer2);
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            continue;
          }
          k = i5 + 1;
          i5 = k;
          break;
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>((String)localObject4);
        }
      }
      if (paramString != null)
      {
        paramStringBuffer1.setLength(n);
        localObject2 = paramStringBuffer2.append(paramStringBuffer1);
        str1 = ">\n";
        ((StringBuffer)localObject2).append(str1);
      }
    }
    return;
    label655:
    Object localObject2 = a(paramString);
    localObject2 = paramStringBuffer2.append(paramStringBuffer1).append((String)localObject2);
    Object localObject3 = ": ";
    ((StringBuffer)localObject2).append((String)localObject3);
    boolean bool3 = paramObject instanceof String;
    if (bool3)
    {
      paramObject = (String)paramObject;
      localObject2 = "http";
      bool3 = ((String)paramObject).startsWith((String)localObject2);
      if (!bool3)
      {
        int m = ((String)paramObject).length();
        if (m > i)
        {
          localObject2 = String.valueOf(((String)paramObject).substring(0, i));
          str1 = "[...]";
          paramObject = ((String)localObject2).concat(str1);
        }
      }
      localObject2 = b((String)paramObject);
      localObject2 = paramStringBuffer2.append("\"").append((String)localObject2);
      str1 = "\"";
      ((StringBuffer)localObject2).append(str1);
    }
    for (;;)
    {
      localObject2 = "\n";
      paramStringBuffer2.append((String)localObject2);
      break;
      boolean bool4 = paramObject instanceof byte[];
      if (bool4)
      {
        paramObject = (byte[])paramObject;
        a((byte[])paramObject, paramStringBuffer2);
      }
      else
      {
        paramStringBuffer2.append(paramObject);
      }
    }
  }
  
  private static void a(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    int i = 92;
    int j = 34;
    String str;
    if (paramArrayOfByte == null)
    {
      str = "\"\"";
      paramStringBuffer.append(str);
    }
    for (;;)
    {
      return;
      paramStringBuffer.append(j);
      int k = 0;
      str = null;
      int m = paramArrayOfByte.length;
      if (k < m)
      {
        m = paramArrayOfByte[k] & 0xFF;
        Object localObject1;
        char c1;
        if ((m == i) || (m == j))
        {
          localObject1 = paramStringBuffer.append(i);
          c1 = (char)m;
          ((StringBuffer)localObject1).append(c1);
        }
        for (;;)
        {
          k += 1;
          break;
          char c2 = ' ';
          if (c1 >= c2)
          {
            c2 = '';
            if (c1 < c2)
            {
              c1 = (char)c1;
              paramStringBuffer.append(c1);
              continue;
            }
          }
          localObject1 = "\\%03o";
          int n = 1;
          Object[] arrayOfObject = new Object[n];
          Object localObject2 = Integer.valueOf(c1);
          arrayOfObject[0] = localObject2;
          localObject2 = String.format((String)localObject1, arrayOfObject);
          paramStringBuffer.append((String)localObject2);
        }
      }
      paramStringBuffer.append(j);
    }
  }
  
  private static String b(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    int j = 0;
    if (j < i)
    {
      char c1 = paramString.charAt(j);
      char c2 = ' ';
      if (c1 >= c2)
      {
        c2 = '~';
        if (c1 <= c2)
        {
          c2 = '"';
          if (c1 != c2)
          {
            c2 = '\'';
            if (c1 != c2) {
              localStringBuilder.append(c1);
            }
          }
        }
      }
      for (;;)
      {
        j += 1;
        break;
        String str = "\\u%04x";
        int k = 1;
        Object[] arrayOfObject = new Object[k];
        Object localObject = Integer.valueOf(c1);
        arrayOfObject[0] = localObject;
        localObject = String.format(str, arrayOfObject);
        localStringBuilder.append((String)localObject);
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              com/google/android/gms/b/gc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */