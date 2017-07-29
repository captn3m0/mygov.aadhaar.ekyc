package com.google.android.gms.b;

import java.io.IOException;

public final class ga
  extends IOException
{
  private ga(String paramString)
  {
    super(paramString);
  }
  
  static ga a()
  {
    return new ga("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static ga b()
  {
    return new ga("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static ga c()
  {
    return new ga("CodedInputStream encountered a malformed varint.");
  }
  
  static ga d()
  {
    return new ga("Protocol message contained an invalid tag (zero).");
  }
  
  static ga e()
  {
    return new ga("Protocol message end-group tag did not match expected tag.");
  }
  
  static ga f()
  {
    return new ga("Protocol message tag had invalid wire type.");
  }
  
  static ga g()
  {
    return new ga("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
}


/* Location:              com/google/android/gms/b/ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */