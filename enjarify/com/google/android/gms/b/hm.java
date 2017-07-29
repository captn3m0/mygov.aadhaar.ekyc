package com.google.android.gms.b;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class hm
{
  public static int a(String paramString)
  {
    int i = 461845907;
    int j = -862048943;
    int k = 0;
    Object localObject = "UTF-8";
    try
    {
      localObject = paramString.getBytes((String)localObject);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        int i3;
        arrayOfByte = paramString.getBytes();
      }
      i1 = m & 0x3;
      switch (i1)
      {
      default: 
        i5 = i2;
      }
    }
    int m = localObject.length;
    int n = (m & 0xFFFFFFFC) + 0;
    int i1 = 0;
    for (int i2 = 0; i1 < n; i2 = i3)
    {
      i3 = localObject[i1] & 0xFF;
      int i4 = i1 + 1;
      i4 = (localObject[i4] & 0xFF) << 8;
      i3 |= i4;
      i4 = i1 + 2;
      i4 = (localObject[i4] & 0xFF) << 16;
      i3 |= i4;
      i4 = i1 + 3;
      i4 = localObject[i4] << 24;
      i3 = (i3 | i4) * j;
      i4 = i3 << 15;
      i3 = (i3 >>> 17 | i4) * i;
      i2 ^= i3;
      i3 = i2 << 13;
      i2 = (i2 >>> 19 | i3) * 5;
      i3 = -430675100 + i2;
      i1 += 4;
    }
    for (;;)
    {
      byte[] arrayOfByte;
      i5 ^= m;
      k = i5 >>> 16;
      int i5 = (i5 ^ k) * -2048144789;
      k = i5 >>> 13;
      i5 = (i5 ^ k) * -1028477387;
      k = i5 >>> 16;
      return i5 ^ k;
      k = n + 2;
      k = (arrayOfByte[k] & 0xFF) << 16;
      i1 = n + 1;
      i1 = (arrayOfByte[i1] & 0xFF) << 8;
      k |= i1;
      i5 = (arrayOfByte[n] & 0xFF | k) * j;
      k = i5 << 15;
      i5 = (i5 >>> 17 | k) * i ^ i2;
    }
  }
  
  public static String[] a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    String str1 = null;
    if (paramString == null)
    {
      j = 0;
      f2 = 0.0F;
      arrayOfString = null;
      return arrayOfString;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    char[] arrayOfChar = paramString.toCharArray();
    int k = paramString.length();
    int m = 0;
    String str2 = null;
    float f3 = 0.0F;
    int j = 0;
    String[] arrayOfString = null;
    float f2 = 0.0F;
    int n = 0;
    label67:
    int i1;
    int i2;
    Object localObject;
    label280:
    int i3;
    if (n < k)
    {
      i1 = Character.codePointAt(arrayOfChar, n);
      i2 = Character.charCount(i1);
      boolean bool1 = Character.isLetter(i1);
      if (bool1)
      {
        localObject = Character.UnicodeBlock.of(i1);
        Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.BOPOMOFO;
        if (localObject != localUnicodeBlock)
        {
          localUnicodeBlock = Character.UnicodeBlock.BOPOMOFO_EXTENDED;
          if (localObject != localUnicodeBlock)
          {
            localUnicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY;
            if (localObject != localUnicodeBlock)
            {
              localUnicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS;
              if (localObject != localUnicodeBlock)
              {
                localUnicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
                if (localObject != localUnicodeBlock)
                {
                  localUnicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS;
                  if (localObject != localUnicodeBlock)
                  {
                    localUnicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
                    if (localObject != localUnicodeBlock)
                    {
                      localUnicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
                      if (localObject != localUnicodeBlock)
                      {
                        localUnicodeBlock = Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS;
                        if (localObject != localUnicodeBlock)
                        {
                          localUnicodeBlock = Character.UnicodeBlock.HANGUL_JAMO;
                          if (localObject != localUnicodeBlock)
                          {
                            localUnicodeBlock = Character.UnicodeBlock.HANGUL_SYLLABLES;
                            if (localObject != localUnicodeBlock)
                            {
                              localUnicodeBlock = Character.UnicodeBlock.HIRAGANA;
                              if (localObject != localUnicodeBlock)
                              {
                                localUnicodeBlock = Character.UnicodeBlock.KATAKANA;
                                if (localObject != localUnicodeBlock)
                                {
                                  localUnicodeBlock = Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS;
                                  if (localObject != localUnicodeBlock) {
                                    break label447;
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
              }
            }
          }
        }
        bool1 = i;
        if (!bool1)
        {
          i3 = 65382;
          if (i1 >= i3)
          {
            i3 = (char)-99;
            if (i1 <= i3) {}
          }
          else
          {
            i3 = (char)-95;
            if (i1 < i3) {
              break label456;
            }
            i3 = (char)-36;
            if (i1 > i3) {
              break label456;
            }
          }
          i3 = i;
          label335:
          if (i3 == 0) {
            break label465;
          }
        }
        else
        {
          i3 = i;
          label343:
          if (i3 == 0) {
            break label474;
          }
          if (m != 0)
          {
            str2 = new java/lang/String;
            i3 = n - j;
            str2.<init>(arrayOfChar, j, i3);
            localArrayList.add(str2);
          }
          str2 = new java/lang/String;
          str2.<init>(arrayOfChar, n, i2);
          localArrayList.add(str2);
          m = j;
          j = 0;
          arrayOfString = null;
          f2 = 0.0F;
        }
      }
    }
    for (;;)
    {
      n += i2;
      int i5 = j;
      j = m;
      m = i5;
      f3 = f2;
      break label67;
      label447:
      i3 = 0;
      localObject = null;
      break label280;
      label456:
      i3 = 0;
      localObject = null;
      break label335;
      label465:
      i3 = 0;
      localObject = null;
      break label343;
      label474:
      boolean bool2 = Character.isLetterOrDigit(i1);
      int i4;
      if (!bool2)
      {
        i4 = Character.getType(i1);
        int i6 = 6;
        if (i4 != i6)
        {
          i4 = Character.getType(i1);
          i6 = 8;
          if (i4 != i6) {
            break label544;
          }
        }
      }
      if (m == 0) {
        j = n;
      }
      m = j;
      j = i;
      f2 = f1;
      continue;
      label544:
      if (paramBoolean)
      {
        i4 = Character.charCount(i1);
        if (i4 == i)
        {
          localObject = Character.toChars(i1);
          i4 = localObject[0];
          i1 = 39;
          if (i4 == i1)
          {
            if (m == 0) {
              j = n;
            }
            m = j;
            j = i;
            f2 = f1;
            continue;
          }
        }
      }
      if (m != 0)
      {
        str2 = new java/lang/String;
        i4 = n - j;
        str2.<init>(arrayOfChar, j, i4);
        localArrayList.add(str2);
        m = j;
        j = 0;
        arrayOfString = null;
        f2 = 0.0F;
        continue;
        if (m != 0)
        {
          str1 = new java/lang/String;
          n -= j;
          str1.<init>(arrayOfChar, j, n);
          localArrayList.add(str1);
        }
        j = localArrayList.size();
        arrayOfString = new String[j];
        arrayOfString = (String[])localArrayList.toArray(arrayOfString);
        break;
      }
      i5 = m;
      m = j;
      j = i5;
      f2 = f3;
    }
  }
}


/* Location:              com/google/android/gms/b/hm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */