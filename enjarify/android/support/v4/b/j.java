package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.c.c;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class j
  extends g
{
  final Handler c;
  final l d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  int k;
  android.support.v4.g.l l;
  
  public j()
  {
    Object localObject = new android/support/v4/b/j$1;
    ((j.1)localObject).<init>(this);
    c = ((Handler)localObject);
    localObject = new android/support/v4/b/j$a;
    ((j.a)localObject).<init>(this);
    l locall = new android/support/v4/b/l;
    locall.<init>((m)localObject);
    d = locall;
    g = bool;
    h = bool;
  }
  
  private static String a(View paramView)
  {
    int m = 86;
    int n = 70;
    char c1 = ',';
    char c2 = ' ';
    int i2 = 46;
    float f1 = 6.4E-44F;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    String str1 = paramView.getClass().getName();
    localStringBuilder.append(str1);
    localStringBuilder.append('{');
    str1 = Integer.toHexString(System.identityHashCode(paramView));
    localStringBuilder.append(str1);
    localStringBuilder.append(c2);
    int i3 = paramView.getVisibility();
    label150:
    label173:
    label196:
    label219:
    label241:
    label264:
    label287:
    label314:
    label336:
    int i7;
    int i1;
    Object localObject;
    switch (i3)
    {
    default: 
      localStringBuilder.append(i2);
      int i4 = paramView.isFocusable();
      if (i4 != 0)
      {
        i4 = n;
        localStringBuilder.append(i4);
        boolean bool1 = paramView.isEnabled();
        if (!bool1) {
          break label689;
        }
        char c3 = 'E';
        localStringBuilder.append(c3);
        int i5 = paramView.willNotDraw();
        if (i5 == 0) {
          break label696;
        }
        i5 = i2;
        localStringBuilder.append(i5);
        boolean bool2 = paramView.isHorizontalScrollBarEnabled();
        if (!bool2) {
          break label703;
        }
        char c4 = 'H';
        localStringBuilder.append(c4);
        int i6 = paramView.isVerticalScrollBarEnabled();
        if (i6 == 0) {
          break label710;
        }
        i6 = m;
        localStringBuilder.append(i6);
        boolean bool3 = paramView.isClickable();
        if (!bool3) {
          break label717;
        }
        char c5 = 'C';
        localStringBuilder.append(c5);
        boolean bool4 = paramView.isLongClickable();
        if (!bool4) {
          break label724;
        }
        char c6 = 'L';
        localStringBuilder.append(c6);
        localStringBuilder.append(c2);
        boolean bool5 = paramView.isFocused();
        if (!bool5) {
          break label731;
        }
        localStringBuilder.append(n);
        bool5 = paramView.isSelected();
        if (!bool5) {
          break label737;
        }
        char c7 = 'S';
        localStringBuilder.append(c7);
        boolean bool6 = paramView.isPressed();
        if (bool6)
        {
          i2 = 80;
          f1 = 1.12E-43F;
        }
        localStringBuilder.append(i2);
        localStringBuilder.append(c2);
        i7 = paramView.getLeft();
        localStringBuilder.append(i7);
        localStringBuilder.append(c1);
        i7 = paramView.getTop();
        localStringBuilder.append(i7);
        localStringBuilder.append('-');
        i7 = paramView.getRight();
        localStringBuilder.append(i7);
        localStringBuilder.append(c1);
        i7 = paramView.getBottom();
        localStringBuilder.append(i7);
        i1 = paramView.getId();
        i7 = -1;
        if (i1 != i7)
        {
          localStringBuilder.append(" #");
          str1 = Integer.toHexString(i1);
          localStringBuilder.append(str1);
          localObject = paramView.getResources();
          if ((i1 != 0) && (localObject != null))
          {
            i7 = 0xFF000000 & i1;
            switch (i7)
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
        str1 = ((Resources)localObject).getResourcePackageName(i1);
        String str2 = ((Resources)localObject).getResourceTypeName(i1);
        String str3 = ((Resources)localObject).getResourceEntryName(i1);
        localObject = " ";
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(str1);
        str1 = ":";
        localStringBuilder.append(str1);
        localStringBuilder.append(str2);
        str1 = "/";
        localStringBuilder.append(str1);
        localStringBuilder.append(str3);
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        char c8;
        label689:
        label696:
        label703:
        label710:
        label717:
        label724:
        label731:
        label737:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append(m);
      break;
      i7 = 73;
      localStringBuilder.append(i7);
      break;
      c8 = 'G';
      localStringBuilder.append(c8);
      break;
      c8 = i2;
      break label150;
      c8 = i2;
      break label173;
      c8 = 'D';
      break label196;
      c8 = i2;
      break label219;
      c8 = i2;
      break label241;
      c8 = i2;
      break label264;
      c8 = i2;
      break label287;
      i1 = i2;
      break label314;
      c8 = i2;
      break label336;
      str1 = "app";
      continue;
      str1 = "android";
    }
  }
  
  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    Object localObject;
    if (paramView == null)
    {
      localObject = "null";
      paramPrintWriter.println((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = a(paramView);
      paramPrintWriter.println((String)localObject);
      int m = paramView instanceof ViewGroup;
      if (m != 0)
      {
        paramView = (ViewGroup)paramView;
        int i1 = paramView.getChildCount();
        if (i1 > 0)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          String str = paramString + "  ";
          m = 0;
          localObject = null;
          while (m < i1)
          {
            View localView = paramView.getChildAt(m);
            a(str, paramPrintWriter, localView);
            int n;
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
    int m = 1;
    boolean bool2 = h;
    Object localObject;
    boolean bool1;
    if (!bool2)
    {
      h = m;
      i = paramBoolean;
      c.removeMessages(m);
      localObject = d;
      bool1 = i;
      ((l)localObject).a(bool1);
      localObject = d.a.f;
      ((o)localObject).m();
    }
    for (;;)
    {
      return;
      if (paramBoolean)
      {
        d.c();
        localObject = d;
        ((l)localObject).a(bool1);
      }
    }
  }
  
  protected final void a_()
  {
    d.a.f.j();
  }
  
  public void b()
  {
    int m = Build.VERSION.SDK_INT;
    int n = 11;
    if (m >= n) {
      invalidateOptionsMenu();
    }
    for (;;)
    {
      return;
      m = 1;
      j = m;
    }
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
    m = System.identityHashCode(this);
    Object localObject1 = Integer.toHexString(m);
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.println(" State:");
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = paramString + "  ";
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print("mCreated=");
    boolean bool1 = e;
    paramPrintWriter.print(bool1);
    paramPrintWriter.print("mResumed=");
    bool1 = f;
    paramPrintWriter.print(bool1);
    paramPrintWriter.print(" mStopped=");
    bool1 = g;
    paramPrintWriter.print(bool1);
    paramPrintWriter.print(" mReallyStopped=");
    bool1 = h;
    paramPrintWriter.println(bool1);
    Object localObject2 = d.a;
    paramPrintWriter.print((String)localObject1);
    paramPrintWriter.print("mLoadersStarted=");
    boolean bool2 = k;
    paramPrintWriter.println(bool2);
    Object localObject3 = i;
    if (localObject3 != null)
    {
      paramPrintWriter.print((String)localObject1);
      paramPrintWriter.print("Loader Manager ");
      int n = System.identityHashCode(i);
      localObject3 = Integer.toHexString(n);
      paramPrintWriter.print((String)localObject3);
      paramPrintWriter.println(":");
      localObject2 = i;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "  ";
      localObject1 = (String)localObject3;
      ((w)localObject2).a((String)localObject1, paramPrintWriter);
    }
    d.a.f.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = paramString + "  ";
    localObject2 = getWindow().getDecorView();
    a((String)localObject1, paramPrintWriter, (View)localObject2);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = d;
    ((l)localObject1).a();
    int m = paramInt1 >> 16;
    Object localObject2;
    Object localObject3;
    if (m != 0)
    {
      int n = m + -1;
      localObject1 = (String)l.a(n);
      localObject2 = l;
      ((android.support.v4.g.l)localObject2).b(n);
      if (localObject1 == null)
      {
        localObject1 = "FragmentActivity";
        localObject3 = "Activity result delivered for unknown Fragment.";
        Log.w((String)localObject1, (String)localObject3);
      }
    }
    for (;;)
    {
      return;
      localObject3 = d.a((String)localObject1);
      if (localObject3 == null)
      {
        localObject3 = "FragmentActivity";
        localObject2 = new java/lang/StringBuilder;
        String str = "Activity result no fragment exists for who: ";
        ((StringBuilder)localObject2).<init>(str);
        localObject1 = (String)localObject1;
        Log.w((String)localObject3, (String)localObject1);
      }
      else
      {
        m = (char)-1 & paramInt1;
        ((i)localObject3).a(m, paramInt2, paramIntent);
        continue;
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
      }
    }
  }
  
  public void onBackPressed()
  {
    o localo = d.a.f;
    boolean bool = localo.b();
    if (!bool) {
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
    Object localObject1 = null;
    Object localObject2 = d;
    Object localObject3 = a.f;
    Object localObject4 = a;
    localObject2 = a;
    ((o)localObject3).a((m)localObject4, (k)localObject2, null);
    super.onCreate(paramBundle);
    localObject2 = (j.b)getLastNonConfigurationInstance();
    m localm;
    if (localObject2 != null)
    {
      localObject3 = d;
      android.support.v4.g.k localk = c;
      localm = a;
      if (localk != null)
      {
        int m = localk.size();
        n = 0;
        localObject4 = null;
        while (n < m)
        {
          localObject3 = (w)localk.c(n);
          g = localm;
          int i1 = n + 1;
          n = i1;
        }
      }
      g = localk;
    }
    if (paramBundle != null)
    {
      localObject3 = paramBundle.getParcelable("android:support:fragments");
      localObject4 = d;
      if (localObject2 == null) {
        break label312;
      }
    }
    for (localObject2 = b;; localObject2 = null)
    {
      localObject1 = a.f;
      ((o)localObject1).a((Parcelable)localObject3, (p)localObject2);
      localObject2 = "android:support:next_request_index";
      boolean bool = paramBundle.containsKey((String)localObject2);
      if (bool)
      {
        i2 = paramBundle.getInt("android:support:next_request_index");
        k = i2;
        localObject3 = paramBundle.getIntArray("android:support:request_indicies");
        localObject2 = "android:support:request_fragment_who";
        localObject1 = paramBundle.getStringArray((String)localObject2);
        if ((localObject3 != null) && (localObject1 != null))
        {
          i2 = localObject3.length;
          n = localObject1.length;
          if (i2 == n) {
            break;
          }
        }
        localObject2 = "FragmentActivity";
        localObject3 = "Invalid requestCode mapping in savedInstanceState.";
        Log.w((String)localObject2, (String)localObject3);
      }
      localObject2 = l;
      if (localObject2 == null)
      {
        localObject2 = new android/support/v4/g/l;
        ((android.support.v4.g.l)localObject2).<init>();
        l = ((android.support.v4.g.l)localObject2);
        k = 0;
      }
      d.a.f.g();
      return;
      label312:
      i2 = 0;
    }
    localObject2 = new android/support/v4/g/l;
    int n = localObject3.length;
    ((android.support.v4.g.l)localObject2).<init>(n);
    l = ((android.support.v4.g.l)localObject2);
    int i2 = 0;
    localObject2 = null;
    for (;;)
    {
      n = localObject3.length;
      if (i2 >= n) {
        break;
      }
      localObject4 = l;
      int i3 = localObject3[i2];
      localm = localObject1[i2];
      ((android.support.v4.g.l)localObject4).a(i3, localm);
      i2 += 1;
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    boolean bool1;
    if (paramInt == 0)
    {
      bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      Object localObject = d;
      MenuInflater localMenuInflater = getMenuInflater();
      localObject = a.f;
      boolean bool2 = ((o)localObject).a(paramMenu, localMenuInflater);
      bool1 |= bool2;
      int m = Build.VERSION.SDK_INT;
      int n = 11;
      if (m < n) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = true;
      continue;
      bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a(false);
    d.a.f.n();
    Object localObject = d.a;
    w localw = i;
    if (localw != null)
    {
      localObject = i;
      ((w)localObject).g();
    }
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    d.a.f.o();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool = super.onMenuItemSelected(paramInt, paramMenuItem);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      o localo;
      switch (paramInt)
      {
      default: 
        bool = false;
        localo = null;
        break;
      case 0: 
        localo = d.a.f;
        bool = localo.a(paramMenuItem);
        break;
      case 6: 
        localo = d.a.f;
        bool = localo.b(paramMenuItem);
      }
    }
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
      o localo = d.a.f;
      localo.b(paramMenu);
    }
  }
  
  protected void onPause()
  {
    int m = 2;
    super.onPause();
    f = false;
    Handler localHandler = c;
    boolean bool = localHandler.hasMessages(m);
    if (bool)
    {
      localHandler = c;
      localHandler.removeMessages(m);
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
    boolean bool1 = false;
    o localo = null;
    boolean bool2;
    if ((paramInt == 0) && (paramMenu != null))
    {
      bool2 = j;
      if (bool2)
      {
        j = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      bool2 = super.onPreparePanel(0, paramView, paramMenu);
      localo = d.a.f;
      bool1 = localo.a(paramMenu);
      bool2 |= bool1;
    }
    for (;;)
    {
      return bool2;
      bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int m = paramInt >> 16;
    int n = (char)-1;
    m &= n;
    String str1;
    Object localObject1;
    Object localObject2;
    if (m != 0)
    {
      n = m + -1;
      str1 = (String)l.a(n);
      localObject1 = l;
      ((android.support.v4.g.l)localObject1).b(n);
      if (str1 != null) {
        break label79;
      }
      str1 = "FragmentActivity";
      localObject2 = "Activity result delivered for unknown Fragment.";
      Log.w(str1, (String)localObject2);
    }
    for (;;)
    {
      return;
      label79:
      localObject2 = d.a(str1);
      if (localObject2 == null)
      {
        localObject2 = "FragmentActivity";
        localObject1 = new java/lang/StringBuilder;
        String str2 = "Activity result no fragment exists for who: ";
        ((StringBuilder)localObject1).<init>(str2);
        str1 = str1;
        Log.w((String)localObject2, str1);
      }
      else
      {
        i.i();
      }
    }
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
    int m = 1;
    int n = 0;
    boolean bool1 = g;
    if (bool1) {
      a(m);
    }
    p localp = d.a.f.e();
    m localm = d.a;
    Object localObject1 = g;
    int i1;
    if (localObject1 != null)
    {
      localObject1 = g;
      int i2 = ((android.support.v4.g.k)localObject1).size();
      w[] arrayOfw = new w[i2];
      i1 = i2 + -1;
      for (int i3 = i1; i3 >= 0; i3 = i1)
      {
        localObject1 = (w)g.c(i3);
        arrayOfw[i3] = localObject1;
        i1 = i3 + -1;
      }
      boolean bool2 = h;
      i1 = 0;
      localObject1 = null;
      if (n < i2)
      {
        Object localObject2 = arrayOfw[n];
        boolean bool3 = f;
        if ((!bool3) && (bool2))
        {
          bool3 = e;
          if (!bool3) {
            ((w)localObject2).b();
          }
          ((w)localObject2).d();
        }
        bool3 = f;
        if (bool3) {
          i1 = m;
        }
        for (;;)
        {
          n += 1;
          break;
          ((w)localObject2).g();
          android.support.v4.g.k localk = g;
          localObject2 = d;
          localk.remove(localObject2);
        }
      }
    }
    else
    {
      i1 = 0;
      localObject1 = null;
    }
    Object localObject3;
    if (i1 != 0)
    {
      localObject1 = g;
      localObject3 = localObject1;
      if ((localp != null) || (localObject3 != null)) {
        break label281;
      }
      i1 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return localObject1;
      m = 0;
      localObject3 = null;
      break;
      label281:
      localObject1 = new android/support/v4/b/j$b;
      ((j.b)localObject1).<init>();
      a = null;
      b = localp;
      c = ((android.support.v4.g.k)localObject3);
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = d.a.f.f();
    String str;
    if (localObject != null)
    {
      str = "android:support:fragments";
      paramBundle.putParcelable(str, (Parcelable)localObject);
    }
    localObject = l;
    int m = ((android.support.v4.g.l)localObject).b();
    if (m > 0)
    {
      int n = k;
      paramBundle.putInt("android:support:next_request_index", n);
      int[] arrayOfInt = new int[l.b()];
      String[] arrayOfString = new String[l.b()];
      m = 0;
      localObject = null;
      n = 0;
      str = null;
      for (;;)
      {
        localObject = l;
        m = ((android.support.v4.g.l)localObject).b();
        if (n >= m) {
          break;
        }
        m = l.c(n);
        arrayOfInt[n] = m;
        localObject = (String)l.d(n);
        arrayOfString[n] = localObject;
        m = n + 1;
        n = m;
      }
      paramBundle.putIntArray("android:support:request_indicies", arrayOfInt);
      localObject = "android:support:request_fragment_who";
      paramBundle.putStringArray((String)localObject, arrayOfString);
    }
  }
  
  protected void onStart()
  {
    int m = 1;
    super.onStart();
    g = false;
    h = false;
    Object localObject1 = c;
    ((Handler)localObject1).removeMessages(m);
    boolean bool1 = e;
    if (!bool1)
    {
      e = m;
      localObject1 = d.a.f;
      ((o)localObject1).h();
    }
    d.a();
    d.b();
    d.c();
    d.a.f.i();
    Object localObject2 = d.a;
    localObject1 = g;
    if (localObject1 != null)
    {
      localObject1 = g;
      int i2 = ((android.support.v4.g.k)localObject1).size();
      w[] arrayOfw = new w[i2];
      int n = i2 + -1;
      for (m = n; m >= 0; m = n)
      {
        localObject1 = (w)g.c(m);
        arrayOfw[m] = localObject1;
        n = m + -1;
      }
      int i1;
      for (m = 0; m < i2; m = i1)
      {
        w localw = arrayOfw[m];
        boolean bool2 = f;
        if (bool2)
        {
          bool2 = w.a;
          Object localObject3;
          if (bool2)
          {
            localObject1 = "LoaderManager";
            localObject2 = new java/lang/StringBuilder;
            localObject3 = "Finished Retaining in ";
            ((StringBuilder)localObject2).<init>((String)localObject3);
            localObject2 = localw;
            Log.v((String)localObject1, (String)localObject2);
          }
          f = false;
          localObject1 = b;
          i1 = ((android.support.v4.g.l)localObject1).b() + -1;
          for (int i3 = i1; i3 >= 0; i3 = i1)
          {
            localObject1 = (w.a)b.d(i3);
            boolean bool3 = i;
            Object localObject4;
            if (bool3)
            {
              bool3 = w.a;
              if (bool3)
              {
                localObject3 = "LoaderManager";
                localObject4 = new java/lang/StringBuilder;
                String str = "  Finished Retaining: ";
                ((StringBuilder)localObject4).<init>(str);
                localObject4 = localObject1;
                Log.v((String)localObject3, (String)localObject4);
              }
              i = false;
              bool3 = h;
              boolean bool4 = j;
              if (bool3 != bool4)
              {
                bool3 = h;
                if (!bool3) {
                  ((w.a)localObject1).a();
                }
              }
            }
            bool3 = h;
            if (bool3)
            {
              bool3 = e;
              if (bool3)
              {
                bool3 = k;
                if (!bool3)
                {
                  localObject3 = d;
                  localObject4 = g;
                  ((w.a)localObject1).a((c)localObject3, localObject4);
                }
              }
            }
            i1 = i3 + -1;
          }
        }
        localw.f();
        i1 = m + 1;
      }
    }
  }
  
  public void onStateNotSaved()
  {
    d.a();
  }
  
  protected void onStop()
  {
    int m = 1;
    super.onStop();
    g = m;
    c.sendEmptyMessage(m);
    d.a.f.l();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    boolean bool = b;
    if (!bool)
    {
      int m = -1;
      if (paramInt != m) {
        a(paramInt);
      }
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              android/support/v4/b/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */