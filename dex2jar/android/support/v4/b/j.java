package android.support.v4.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.g.c;
import android.support.v4.g.k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class j
  extends g
{
  final Handler c = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (what)
      {
      default: 
        super.handleMessage(paramAnonymousMessage);
      case 1: 
        do
        {
          return;
        } while (!g);
        a(false);
        return;
      }
      a_();
      d.b();
    }
  };
  final l d = new l(new a());
  boolean e;
  boolean f;
  boolean g = true;
  boolean h = true;
  boolean i;
  boolean j;
  int k;
  android.support.v4.g.l<String> l;
  
  private static String a(View paramView)
  {
    char c3 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    char c1;
    label118:
    label135:
    label152:
    label169:
    label186:
    label203:
    label220:
    label244:
    label261:
    int m;
    Object localObject;
    switch (paramView.getVisibility())
    {
    default: 
      localStringBuilder.append('.');
      if (paramView.isFocusable())
      {
        c1 = 'F';
        localStringBuilder.append(c1);
        if (!paramView.isEnabled()) {
          break label562;
        }
        c1 = 'E';
        localStringBuilder.append(c1);
        if (!paramView.willNotDraw()) {
          break label568;
        }
        c1 = '.';
        localStringBuilder.append(c1);
        if (!paramView.isHorizontalScrollBarEnabled()) {
          break label574;
        }
        c1 = 'H';
        localStringBuilder.append(c1);
        if (!paramView.isVerticalScrollBarEnabled()) {
          break label580;
        }
        c1 = 'V';
        localStringBuilder.append(c1);
        if (!paramView.isClickable()) {
          break label586;
        }
        c1 = 'C';
        localStringBuilder.append(c1);
        if (!paramView.isLongClickable()) {
          break label592;
        }
        c1 = 'L';
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        if (!paramView.isFocused()) {
          break label598;
        }
        c1 = c3;
        localStringBuilder.append(c1);
        if (!paramView.isSelected()) {
          break label604;
        }
        c1 = 'S';
        localStringBuilder.append(c1);
        c1 = c2;
        if (paramView.isPressed()) {
          c1 = 'P';
        }
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        m = paramView.getId();
        if (m != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(m));
          localObject = paramView.getResources();
          if ((m != 0) && (localObject != null)) {
            switch (0xFF000000 & m)
            {
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(m);
        String str = ((Resources)localObject).getResourceTypeName(m);
        localObject = ((Resources)localObject).getResourceEntryName(m);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Resources.NotFoundException paramView)
      {
        label562:
        label568:
        label574:
        label580:
        label586:
        label592:
        label598:
        label604:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append('V');
      break;
      localStringBuilder.append('I');
      break;
      localStringBuilder.append('G');
      break;
      c1 = '.';
      break label118;
      c1 = '.';
      break label135;
      c1 = 'D';
      break label152;
      c1 = '.';
      break label169;
      c1 = '.';
      break label186;
      c1 = '.';
      break label203;
      c1 = '.';
      break label220;
      c1 = '.';
      break label244;
      c1 = '.';
      break label261;
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
    }
    for (;;)
    {
      return;
      paramPrintWriter.println(a(paramView));
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int n = paramView.getChildCount();
        if (n > 0)
        {
          paramString = paramString + "  ";
          int m = 0;
          while (m < n)
          {
            a(paramString, paramPrintWriter, paramView.getChildAt(m));
            m += 1;
          }
        }
      }
    }
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return d.a.f.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  final void a(boolean paramBoolean)
  {
    if (!h)
    {
      h = true;
      i = paramBoolean;
      c.removeMessages(1);
      d.a(i);
      d.a.f.m();
    }
    while (!paramBoolean) {
      return;
    }
    d.c();
    d.a(true);
  }
  
  protected final void a_()
  {
    d.a.f.j();
  }
  
  public void b()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    j = true;
  }
  
  public final n b_()
  {
    return d.a.f;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int m = Build.VERSION.SDK_INT;
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(e);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(f);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(g);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(h);
    m localm = d.a;
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(k);
    if (i != null)
    {
      paramPrintWriter.print(str);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(i)));
      paramPrintWriter.println(":");
      i.a(str + "  ", paramPrintWriter);
    }
    d.a.f.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    d.a();
    int m = paramInt1 >> 16;
    if (m != 0)
    {
      m -= 1;
      String str = (String)l.a(m);
      l.b(m);
      if (str == null)
      {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        return;
      }
      i locali = d.a(str);
      if (locali == null)
      {
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
        return;
      }
      locali.a(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    if (!d.a.f.b()) {
      super.onBackPressed();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    d.a.f.a(paramConfiguration);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject1 = d;
    a.f.a(a, a, null);
    super.onCreate(paramBundle);
    localObject1 = (b)getLastNonConfigurationInstance();
    Object localObject3;
    Object localObject2;
    int m;
    if (localObject1 != null)
    {
      localObject3 = d;
      localObject2 = c;
      localObject3 = a;
      if (localObject2 != null)
      {
        int n = ((k)localObject2).size();
        m = 0;
        while (m < n)
        {
          cg = ((m)localObject3);
          m += 1;
        }
      }
      g = ((k)localObject2);
    }
    if (paramBundle != null)
    {
      localObject2 = paramBundle.getParcelable("android:support:fragments");
      localObject3 = d;
      if (localObject1 == null) {
        break label261;
      }
      localObject1 = b;
      a.f.a((Parcelable)localObject2, (p)localObject1);
      if (paramBundle.containsKey("android:support:next_request_index"))
      {
        k = paramBundle.getInt("android:support:next_request_index");
        localObject1 = paramBundle.getIntArray("android:support:request_indicies");
        paramBundle = paramBundle.getStringArray("android:support:request_fragment_who");
        if ((localObject1 != null) && (paramBundle != null) && (localObject1.length == paramBundle.length)) {
          break label267;
        }
        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
      }
    }
    for (;;)
    {
      if (l == null)
      {
        l = new android.support.v4.g.l();
        k = 0;
      }
      d.a.f.g();
      return;
      label261:
      localObject1 = null;
      break;
      label267:
      l = new android.support.v4.g.l(localObject1.length);
      m = 0;
      while (m < localObject1.length)
      {
        l.a(localObject1[m], paramBundle[m]);
        m += 1;
      }
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      l locall = d;
      MenuInflater localMenuInflater = getMenuInflater();
      boolean bool2 = a.f.a(paramMenu, localMenuInflater);
      if (Build.VERSION.SDK_INT >= 11) {
        return bool1 | bool2;
      }
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a(false);
    d.a.f.n();
    m localm = d.a;
    if (i != null) {
      i.g();
    }
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    d.a.f.o();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 0: 
      return d.a.f.a(paramMenuItem);
    }
    return d.a.f.b(paramMenuItem);
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    d.a.f.a(paramBoolean);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    d.a();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      d.a.f.b(paramMenu);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
    f = false;
    if (c.hasMessages(2))
    {
      c.removeMessages(2);
      a_();
    }
    d.a.f.k();
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    d.a.f.b(paramBoolean);
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    c.removeMessages(2);
    a_();
    d.b();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (j)
      {
        j = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return super.onPreparePanel(0, paramView, paramMenu) | d.a.f.a(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    paramInt = paramInt >> 16 & 0xFFFF;
    if (paramInt != 0)
    {
      paramInt -= 1;
      paramArrayOfString = (String)l.a(paramInt);
      l.b(paramInt);
      if (paramArrayOfString == null) {
        Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
      }
    }
    else
    {
      return;
    }
    if (d.a(paramArrayOfString) == null)
    {
      Log.w("FragmentActivity", "Activity result no fragment exists for who: " + paramArrayOfString);
      return;
    }
    i.i();
  }
  
  protected void onResume()
  {
    super.onResume();
    c.sendEmptyMessage(2);
    f = true;
    d.b();
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    int n = 0;
    if (g) {
      a(true);
    }
    p localp = d.a.f.e();
    Object localObject1 = d.a;
    int i1;
    if (g != null)
    {
      int i2 = g.size();
      localObject2 = new w[i2];
      int m = i2 - 1;
      while (m >= 0)
      {
        localObject2[m] = ((w)g.c(m));
        m -= 1;
      }
      boolean bool = h;
      m = 0;
      i1 = m;
      if (n < i2)
      {
        Object localObject3 = localObject2[n];
        if ((!f) && (bool))
        {
          if (!e) {
            ((w)localObject3).b();
          }
          ((w)localObject3).d();
        }
        if (f) {
          m = 1;
        }
        for (;;)
        {
          n += 1;
          break;
          ((w)localObject3).g();
          g.remove(d);
        }
      }
    }
    else
    {
      i1 = 0;
    }
    if (i1 != 0) {}
    for (localObject1 = g; (localp == null) && (localObject1 == null); localObject1 = null) {
      return null;
    }
    Object localObject2 = new b();
    a = null;
    b = localp;
    c = ((k)localObject1);
    return localObject2;
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = d.a.f.f();
    if (localObject != null) {
      paramBundle.putParcelable("android:support:fragments", (Parcelable)localObject);
    }
    if (l.b() > 0)
    {
      paramBundle.putInt("android:support:next_request_index", k);
      localObject = new int[l.b()];
      String[] arrayOfString = new String[l.b()];
      int m = 0;
      while (m < l.b())
      {
        localObject[m] = l.c(m);
        arrayOfString[m] = ((String)l.d(m));
        m += 1;
      }
      paramBundle.putIntArray("android:support:request_indicies", (int[])localObject);
      paramBundle.putStringArray("android:support:request_fragment_who", arrayOfString);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    g = false;
    h = false;
    c.removeMessages(1);
    if (!e)
    {
      e = true;
      d.a.f.h();
    }
    d.a();
    d.b();
    d.c();
    d.a.f.i();
    m localm = d.a;
    if (g != null)
    {
      int i1 = g.size();
      w[] arrayOfw = new w[i1];
      int m = i1 - 1;
      while (m >= 0)
      {
        arrayOfw[m] = ((w)g.c(m));
        m -= 1;
      }
      m = 0;
      while (m < i1)
      {
        localm = arrayOfw[m];
        if (f)
        {
          if (w.a) {
            Log.v("LoaderManager", "Finished Retaining in " + localm);
          }
          f = false;
          int n = b.b() - 1;
          while (n >= 0)
          {
            w.a locala = (w.a)b.d(n);
            if (i)
            {
              if (w.a) {
                Log.v("LoaderManager", "  Finished Retaining: " + locala);
              }
              i = false;
              if ((h != j) && (!h)) {
                locala.a();
              }
            }
            if ((h) && (e) && (!k)) {
              locala.a(d, g);
            }
            n -= 1;
          }
        }
        localm.f();
        m += 1;
      }
    }
  }
  
  public void onStateNotSaved()
  {
    d.a();
  }
  
  protected void onStop()
  {
    super.onStop();
    g = true;
    c.sendEmptyMessage(1);
    d.a.f.l();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((!b) && (paramInt != -1)) {
      a(paramInt);
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  final class a
    extends m<j>
  {
    public a()
    {
      super();
    }
    
    public final View a(int paramInt)
    {
      return findViewById(paramInt);
    }
    
    public final void a(i parami, Intent paramIntent, int paramInt)
    {
      j localj = j.this;
      b = true;
      if (paramInt == -1) {}
      try
      {
        a.a(localj, paramIntent, -1);
        return;
      }
      finally
      {
        b = false;
      }
      j.a(paramInt);
      if (l.b() >= 65534) {
        throw new IllegalStateException("Too many pending Fragment activity results.");
      }
      for (;;)
      {
        android.support.v4.g.l locall = l;
        i = k;
        if (a) {
          locall.a();
        }
        if (c.a(b, c, i) < 0) {
          break;
        }
        k = ((k + 1) % 65534);
      }
      int i = k;
      l.a(i, o);
      k = ((k + 1) % 65534);
      a.a(localj, paramIntent, (i + 1 << 16) + (0xFFFF & paramInt));
      b = false;
    }
    
    @SuppressLint({"NewApi"})
    public final void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      dump(paramString, null, paramPrintWriter, paramArrayOfString);
    }
    
    public final boolean a()
    {
      Window localWindow = getWindow();
      return (localWindow != null) && (localWindow.peekDecorView() != null);
    }
    
    public final boolean b()
    {
      return !isFinishing();
    }
    
    public final LayoutInflater c()
    {
      return getLayoutInflater().cloneInContext(j.this);
    }
    
    public final void d()
    {
      b();
    }
    
    public final boolean e()
    {
      return getWindow() != null;
    }
    
    public final int f()
    {
      Window localWindow = getWindow();
      if (localWindow == null) {
        return 0;
      }
      return getAttributeswindowAnimations;
    }
  }
  
  static final class b
  {
    Object a;
    p b;
    k<String, v> c;
  }
}


/* Location:              android/support/v4/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */