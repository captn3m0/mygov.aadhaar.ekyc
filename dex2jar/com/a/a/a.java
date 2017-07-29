package com.a.a;

import android.content.Intent;

public final class a
  extends s
{
  private Intent c;
  
  public a() {}
  
  public a(i parami)
  {
    super(parami);
  }
  
  public final String getMessage()
  {
    if (c != null) {
      return "User needs to (re)enter credentials.";
    }
    return super.getMessage();
  }
}


/* Location:              com/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */