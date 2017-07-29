package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.h.e;
import android.support.v4.h.m;
import android.support.v7.a.a.b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class h
  implements android.support.v4.e.a.a
{
  private static final int[] m;
  protected final Context a;
  public h.a b;
  ArrayList c;
  public ArrayList d;
  public int e = 0;
  CharSequence f;
  Drawable g;
  View h;
  boolean i = false;
  public CopyOnWriteArrayList j;
  j k;
  public boolean l;
  private final Resources n;
  private boolean o;
  private boolean p;
  private ArrayList q;
  private boolean r;
  private ArrayList s;
  private boolean t;
  private ContextMenu.ContextMenuInfo u;
  private boolean v = false;
  private boolean w = false;
  private boolean x = false;
  private boolean y = false;
  private ArrayList z;
  
  static
  {
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 4;
    arrayOfInt[2] = 5;
    arrayOfInt[3] = 3;
    arrayOfInt[4] = 2;
    arrayOfInt[5] = 0;
    m = arrayOfInt;
  }
  
  public h(Context paramContext)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    z = ((ArrayList)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    j = ((CopyOnWriteArrayList)localObject);
    a = paramContext;
    localObject = paramContext.getResources();
    n = ((Resources)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    q = ((ArrayList)localObject);
    r = i1;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    d = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    s = ((ArrayList)localObject);
    t = i1;
    localObject = n.getConfiguration();
    int i2 = keyboard;
    if (i2 != i1)
    {
      localObject = n;
      int i3 = a.b.abc_config_showMenuShortcutsWhenKeyboardPresent;
      boolean bool = ((Resources)localObject).getBoolean(i3);
      if (!bool) {}
    }
    for (;;)
    {
      p = i1;
      return;
      i1 = 0;
    }
  }
  
  private static int a(ArrayList paramArrayList, int paramInt)
  {
    int i1 = paramArrayList.size() + -1;
    int i2 = i1;
    j localj;
    if (i2 >= 0)
    {
      localj = (j)paramArrayList.get(i2);
      i1 = a;
      if (i1 <= paramInt) {
        i1 = i2 + 1;
      }
    }
    for (;;)
    {
      return i1;
      i1 = i2 + -1;
      i2 = i1;
      break;
      i1 = 0;
      localj = null;
    }
  }
  
  private j a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = z;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    int i1 = localArrayList.isEmpty();
    j localj;
    if (i1 != 0)
    {
      i1 = 0;
      localj = null;
    }
    for (;;)
    {
      return localj;
      int i3 = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new android/view/KeyCharacterMap$KeyData;
      localKeyData.<init>();
      paramKeyEvent.getKeyData(localKeyData);
      int i4 = localArrayList.size();
      i1 = 1;
      if (i4 == i1)
      {
        localj = (j)localArrayList.get(0);
      }
      else
      {
        boolean bool = b();
        int i5 = 0;
        label97:
        if (i5 < i4)
        {
          localj = (j)localArrayList.get(i5);
          if (bool) {}
          for (int i6 = localj.getAlphabeticShortcut();; i6 = localj.getNumericShortcut())
          {
            char[] arrayOfChar = meta;
            int i7 = arrayOfChar[0];
            if (i6 == i7)
            {
              i7 = i3 & 0x2;
              if (i7 == 0) {
                break;
              }
            }
            arrayOfChar = meta;
            int i8 = 2;
            i7 = arrayOfChar[i8];
            if (i6 == i7)
            {
              i7 = i3 & 0x2;
              if (i7 != 0) {
                break;
              }
            }
            if (bool)
            {
              i7 = 8;
              if (i6 == i7)
              {
                i6 = 67;
                if (paramInt == i6) {
                  break;
                }
              }
            }
            i2 = i5 + 1;
            i5 = i2;
            break label97;
          }
        }
        int i2 = 0;
        localj = null;
      }
    }
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList;
    int i1;
    if (paramInt >= 0)
    {
      localArrayList = c;
      i1 = localArrayList.size();
      if (paramInt < i1) {
        break label22;
      }
    }
    for (;;)
    {
      return;
      label22:
      localArrayList = c;
      localArrayList.remove(paramInt);
      if (paramBoolean)
      {
        i1 = 1;
        a(i1);
      }
    }
  }
  
  private void a(List paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    int i1 = 67;
    boolean bool1 = b();
    int i2 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new android/view/KeyCharacterMap$KeyData;
    localKeyData.<init>();
    boolean bool2 = paramKeyEvent.getKeyData(localKeyData);
    if ((!bool2) && (paramInt != i1)) {
      return;
    }
    Object localObject = c;
    int i4 = ((ArrayList)localObject).size();
    int i5 = 0;
    label62:
    if (i5 < i4)
    {
      localObject = (j)c.get(i5);
      boolean bool3 = ((j)localObject).hasSubMenu();
      if (bool3)
      {
        h localh = (h)((j)localObject).getSubMenu();
        localh.a(paramList, paramInt, paramKeyEvent);
      }
      if (!bool1) {
        break label241;
      }
    }
    label228:
    label241:
    int i7;
    for (int i6 = ((j)localObject).getAlphabeticShortcut();; i7 = ((j)localObject).getNumericShortcut())
    {
      int i8 = i2 & 0x5;
      if ((i8 == 0) && (i6 != 0))
      {
        char[] arrayOfChar = meta;
        i8 = arrayOfChar[0];
        if (i6 != i8)
        {
          arrayOfChar = meta;
          int i9 = 2;
          i8 = arrayOfChar[i9];
          if (i6 != i8)
          {
            if (!bool1) {
              break label228;
            }
            i8 = 8;
            if ((i6 != i8) || (paramInt != i1)) {
              break label228;
            }
          }
        }
        boolean bool4 = ((j)localObject).isEnabled();
        if (bool4) {
          paramList.add(localObject);
        }
      }
      int i3 = i5 + 1;
      i5 = i3;
      break label62;
      break;
    }
  }
  
  protected final MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = (0xFFFF0000 & paramInt3) >> 16;
    if (i1 >= 0)
    {
      localObject1 = m;
      i2 = localObject1.length;
      if (i1 < i2) {}
    }
    else
    {
      localObject2 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject2).<init>("order does not contain a valid category.");
      throw ((Throwable)localObject2);
    }
    i1 = m[i1] << 16;
    int i2 = (char)-1 & paramInt3;
    int i3 = i1 | i2;
    int i4 = e;
    Object localObject2 = new android/support/v7/view/menu/j;
    Object localObject1 = this;
    int i5 = paramInt1;
    ((j)localObject2).<init>(this, paramInt1, paramInt2, paramInt3, i3, paramCharSequence, i4);
    localObject1 = u;
    if (localObject1 != null)
    {
      localObject1 = u;
      e = ((ContextMenu.ContextMenuInfo)localObject1);
    }
    localObject1 = c;
    i5 = a(c, i3);
    ((ArrayList)localObject1).add(i5, localObject2);
    a(true);
    return (MenuItem)localObject2;
  }
  
  protected String a()
  {
    return "android:menu:actionviewstates";
  }
  
  final void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Object localObject = n;
    if (paramView != null)
    {
      h = paramView;
      f = null;
      g = null;
      a(false);
      return;
    }
    if (paramInt1 > 0)
    {
      localObject = ((Resources)localObject).getText(paramInt1);
      f = ((CharSequence)localObject);
      label51:
      if (paramInt2 <= 0) {
        break label91;
      }
      localObject = android.support.v4.c.a.a(a, paramInt2);
      g = ((Drawable)localObject);
    }
    for (;;)
    {
      h = null;
      break;
      if (paramCharSequence == null) {
        break label51;
      }
      f = paramCharSequence;
      break label51;
      label91:
      if (paramDrawable != null) {
        g = paramDrawable;
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    Object localObject1 = j;
    boolean bool = ((CopyOnWriteArrayList)localObject1).isEmpty();
    if (bool) {}
    for (;;)
    {
      return;
      SparseArray localSparseArray = new android/util/SparseArray;
      localSparseArray.<init>();
      localObject1 = j;
      Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (WeakReference)localIterator.next();
        Object localObject2 = (o)((WeakReference)localObject1).get();
        if (localObject2 == null)
        {
          localObject2 = j;
          ((CopyOnWriteArrayList)localObject2).remove(localObject1);
        }
        else
        {
          int i1 = ((o)localObject2).b();
          if (i1 > 0)
          {
            localObject2 = ((o)localObject2).c();
            if (localObject2 != null) {
              localSparseArray.put(i1, localObject2);
            }
          }
        }
      }
      localObject1 = "android:menu:presenters";
      paramBundle.putSparseParcelableArray((String)localObject1, localSparseArray);
    }
  }
  
  public void a(h.a parama)
  {
    b = parama;
  }
  
  public final void a(o paramo)
  {
    Context localContext = a;
    a(paramo, localContext);
  }
  
  public final void a(o paramo, Context paramContext)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = j;
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramo);
    localCopyOnWriteArrayList.add(localWeakReference);
    paramo.a(paramContext, this);
    t = true;
  }
  
  public void a(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = v;
    if (!bool2)
    {
      if (paramBoolean)
      {
        r = bool1;
        t = bool1;
      }
      Object localObject1 = j;
      bool2 = ((CopyOnWriteArrayList)localObject1).isEmpty();
      if (!bool2)
      {
        d();
        localObject1 = j;
        Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (WeakReference)localIterator.next();
          Object localObject2 = (o)((WeakReference)localObject1).get();
          if (localObject2 == null)
          {
            localObject2 = j;
            ((CopyOnWriteArrayList)localObject2).remove(localObject1);
          }
          else
          {
            ((o)localObject2).a(paramBoolean);
          }
        }
        e();
      }
    }
    for (;;)
    {
      return;
      w = bool1;
      if (paramBoolean) {
        x = bool1;
      }
    }
  }
  
  boolean a(h paramh, MenuItem paramMenuItem)
  {
    h.a locala = b;
    boolean bool;
    if (locala != null)
    {
      locala = b;
      bool = locala.a(paramh, paramMenuItem);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  public boolean a(j paramj)
  {
    boolean bool1 = false;
    WeakReference localWeakReference = null;
    Object localObject = j;
    boolean bool2 = ((CopyOnWriteArrayList)localObject).isEmpty();
    if (bool2) {
      return bool1;
    }
    d();
    localObject = j;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    boolean bool3 = false;
    for (;;)
    {
      label44:
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break label132;
      }
      localWeakReference = (WeakReference)localIterator.next();
      localObject = (o)localWeakReference.get();
      if (localObject != null) {
        break;
      }
      localObject = j;
      ((CopyOnWriteArrayList)localObject).remove(localWeakReference);
    }
    bool1 = ((o)localObject).a(paramj);
    if (bool1) {}
    for (;;)
    {
      e();
      if (!bool1) {
        break;
      }
      k = paramj;
      break;
      bool3 = bool1;
      break label44;
      label132:
      bool1 = bool3;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, o paramo, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    paramMenuItem = (j)paramMenuItem;
    boolean bool3;
    u localu;
    if (paramMenuItem != null)
    {
      bool3 = paramMenuItem.isEnabled();
      if (bool3) {}
    }
    else
    {
      bool3 = false;
      localu = null;
    }
    int i3;
    boolean bool5;
    for (;;)
    {
      return bool3;
      i3 = paramMenuItem.b();
      e locale = d;
      if (locale != null)
      {
        bool3 = locale.e();
        if (bool3) {
          bool5 = bool1;
        }
      }
      for (;;)
      {
        bool3 = paramMenuItem.i();
        if (!bool3) {
          break label114;
        }
        bool3 = paramMenuItem.expandActionView() | i3;
        if (!bool3) {
          break;
        }
        b(bool1);
        break;
        bool5 = false;
        localObject2 = null;
      }
      label114:
      bool3 = paramMenuItem.hasSubMenu();
      if ((!bool3) && (!bool5)) {
        break label361;
      }
      int i1 = paramInt & 0x4;
      if (i1 == 0) {
        b(false);
      }
      boolean bool4 = paramMenuItem.hasSubMenu();
      if (!bool4)
      {
        localu = new android/support/v7/view/menu/u;
        localObject3 = a;
        localu.<init>((Context)localObject3, this, paramMenuItem);
        paramMenuItem.a(localu);
      }
      localu = (u)paramMenuItem.getSubMenu();
      if (bool5) {
        locale.a(localu);
      }
      localObject2 = j;
      bool5 = ((CopyOnWriteArrayList)localObject2).isEmpty();
      if (!bool5) {
        break;
      }
      label221:
      bool4 = i3 | bool2;
      if (!bool4) {
        b(bool1);
      }
    }
    if (paramo != null) {
      bool2 = paramo.a(localu);
    }
    Object localObject2 = j;
    Object localObject3 = ((CopyOnWriteArrayList)localObject2).iterator();
    boolean bool6 = bool2;
    for (;;)
    {
      label273:
      bool5 = ((Iterator)localObject3).hasNext();
      if (!bool5) {
        break label354;
      }
      localObject2 = (WeakReference)((Iterator)localObject3).next();
      localObject1 = (o)((WeakReference)localObject2).get();
      if (localObject1 != null) {
        break;
      }
      localObject1 = j;
      ((CopyOnWriteArrayList)localObject1).remove(localObject2);
    }
    if (!bool6) {}
    for (bool2 = ((o)localObject1).a(localu);; bool2 = bool6)
    {
      bool6 = bool2;
      break label273;
      label354:
      bool2 = bool6;
      break label221;
      label361:
      int i2 = paramInt & 0x1;
      if (i2 == 0) {
        b(bool1);
      }
      i2 = i3;
      break;
    }
  }
  
  public MenuItem add(int paramInt)
  {
    String str = n.getString(paramInt);
    return a(0, 0, 0, str);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = n.getString(paramInt4);
    return a(paramInt1, paramInt2, paramInt3, str);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = a.getPackageManager();
    int i1 = 0;
    ResolveInfo localResolveInfo = null;
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i2;
    int i3;
    label72:
    Intent localIntent;
    int i4;
    if (localList != null)
    {
      i1 = localList.size();
      i2 = i1;
      i1 = paramInt4 & 0x1;
      if (i1 == 0) {
        removeGroup(paramInt1);
      }
      i1 = 0;
      localResolveInfo = null;
      i3 = 0;
      if (i3 >= i2) {
        break label286;
      }
      localResolveInfo = (ResolveInfo)localList.get(i3);
      localIntent = new android/content/Intent;
      i4 = specificIndex;
      if (i4 >= 0) {
        break label269;
      }
    }
    for (Object localObject1 = paramIntent;; localObject1 = paramArrayOfIntent[i4])
    {
      localIntent.<init>((Intent)localObject1);
      localObject1 = new android/content/ComponentName;
      Object localObject2 = activityInfo.applicationInfo.packageName;
      String str = activityInfo.name;
      ((ComponentName)localObject1).<init>((String)localObject2, str);
      localIntent.setComponent((ComponentName)localObject1);
      localObject1 = localResolveInfo.loadLabel(localPackageManager);
      localObject1 = add(paramInt1, paramInt2, paramInt3, (CharSequence)localObject1);
      localObject2 = localResolveInfo.loadIcon(localPackageManager);
      localObject1 = ((MenuItem)localObject1).setIcon((Drawable)localObject2).setIntent(localIntent);
      if (paramArrayOfMenuItem != null)
      {
        int i5 = specificIndex;
        if (i5 >= 0)
        {
          i1 = specificIndex;
          paramArrayOfMenuItem[i1] = localObject1;
        }
      }
      i1 = i3 + 1;
      i3 = i1;
      break label72;
      i1 = 0;
      localResolveInfo = null;
      i2 = 0;
      break;
      label269:
      i4 = specificIndex;
    }
    label286:
    return i2;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    String str = n.getString(paramInt);
    return addSubMenu(0, 0, 0, str);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = n.getString(paramInt4);
    return addSubMenu(paramInt1, paramInt2, paramInt3, str);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    j localj = (j)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    u localu = new android/support/v7/view/menu/u;
    Context localContext = a;
    localu.<init>(localContext, this, localj);
    localj.a(localu);
    return localu;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(Bundle paramBundle)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i1 = size();
    int i2 = 0;
    boolean bool2 = false;
    for (Object localObject2 = null; i2 < i1; localObject2 = localObject1)
    {
      MenuItem localMenuItem = getItem(i2);
      localObject1 = m.a(localMenuItem);
      if (localObject1 != null)
      {
        int i4 = ((View)localObject1).getId();
        int i5 = -1;
        if (i4 != i5)
        {
          if (localObject2 == null)
          {
            localObject2 = new android/util/SparseArray;
            ((SparseArray)localObject2).<init>();
          }
          ((View)localObject1).saveHierarchyState((SparseArray)localObject2);
          bool1 = m.c(localMenuItem);
          if (bool1)
          {
            localObject1 = "android:menu:expandedactionview";
            i4 = localMenuItem.getItemId();
            paramBundle.putInt((String)localObject1, i4);
          }
        }
      }
      localObject1 = localObject2;
      bool2 = localMenuItem.hasSubMenu();
      if (bool2)
      {
        localObject2 = (u)localMenuItem.getSubMenu();
        ((u)localObject2).b(paramBundle);
      }
      int i3 = i2 + 1;
      i2 = i3;
    }
    if (localObject2 != null)
    {
      localObject1 = a();
      paramBundle.putSparseParcelableArray((String)localObject1, (SparseArray)localObject2);
    }
  }
  
  public final void b(o paramo)
  {
    Object localObject1 = j;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (WeakReference)localIterator.next();
      Object localObject2 = (o)((WeakReference)localObject1).get();
      if ((localObject2 == null) || (localObject2 == paramo))
      {
        localObject2 = j;
        ((CopyOnWriteArrayList)localObject2).remove(localObject1);
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    boolean bool = y;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      y = bool;
      Object localObject1 = j;
      Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (WeakReference)localIterator.next();
        Object localObject2 = (o)((WeakReference)localObject1).get();
        if (localObject2 == null)
        {
          localObject2 = j;
          ((CopyOnWriteArrayList)localObject2).remove(localObject1);
        }
        else
        {
          ((o)localObject2).a(this, paramBoolean);
        }
      }
      bool = false;
      localObject1 = null;
      y = false;
    }
  }
  
  boolean b()
  {
    return o;
  }
  
  public boolean b(j paramj)
  {
    boolean bool1 = false;
    WeakReference localWeakReference = null;
    Object localObject = j;
    boolean bool2 = ((CopyOnWriteArrayList)localObject).isEmpty();
    if (!bool2)
    {
      localObject = k;
      if (localObject == paramj) {}
    }
    else
    {
      return bool1;
    }
    d();
    localObject = j;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    boolean bool3 = false;
    for (;;)
    {
      label56:
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break label150;
      }
      localWeakReference = (WeakReference)localIterator.next();
      localObject = (o)localWeakReference.get();
      if (localObject != null) {
        break;
      }
      localObject = j;
      ((CopyOnWriteArrayList)localObject).remove(localWeakReference);
    }
    bool1 = ((o)localObject).b(paramj);
    if (bool1) {}
    for (;;)
    {
      e();
      if (!bool1) {
        break;
      }
      bool2 = false;
      localObject = null;
      k = null;
      break;
      bool3 = bool1;
      break label56;
      label150:
      bool1 = bool3;
    }
  }
  
  public final void c(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      Object localObject = a();
      SparseArray localSparseArray = paramBundle.getSparseParcelableArray((String)localObject);
      int i1 = size();
      int i2 = 0;
      localObject = null;
      for (int i3 = 0; i3 < i1; i3 = i2)
      {
        localObject = getItem(i3);
        View localView = m.a((MenuItem)localObject);
        if (localView != null)
        {
          int i4 = localView.getId();
          int i5 = -1;
          if (i4 != i5) {
            localView.restoreHierarchyState(localSparseArray);
          }
        }
        boolean bool = ((MenuItem)localObject).hasSubMenu();
        if (bool)
        {
          localObject = (u)((MenuItem)localObject).getSubMenu();
          ((u)localObject).c(paramBundle);
        }
        i2 = i3 + 1;
      }
      localObject = "android:menu:expandedactionview";
      i2 = paramBundle.getInt((String)localObject);
      if (i2 > 0)
      {
        localObject = findItem(i2);
        if (localObject != null) {
          m.b((MenuItem)localObject);
        }
      }
    }
  }
  
  public boolean c()
  {
    return p;
  }
  
  public void clear()
  {
    j localj = k;
    if (localj != null)
    {
      localj = k;
      b(localj);
    }
    c.clear();
    a(true);
  }
  
  public void clearHeader()
  {
    g = null;
    f = null;
    h = null;
    a(false);
  }
  
  public void close()
  {
    b(true);
  }
  
  public final void d()
  {
    boolean bool = v;
    if (!bool)
    {
      bool = true;
      v = bool;
      w = false;
      x = false;
    }
  }
  
  public final void e()
  {
    v = false;
    boolean bool = w;
    if (bool)
    {
      w = false;
      bool = x;
      a(bool);
    }
  }
  
  final void f()
  {
    boolean bool = true;
    r = bool;
    a(bool);
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    Object localObject = null;
    int i3 = 0;
    if (i3 < i1)
    {
      localObject = (j)c.get(i3);
      int i4 = ((j)localObject).getItemId();
      if (i4 != paramInt) {}
    }
    for (;;)
    {
      return (MenuItem)localObject;
      boolean bool = ((j)localObject).hasSubMenu();
      if (bool)
      {
        localObject = ((j)localObject).getSubMenu().findItem(paramInt);
        if (localObject != null) {}
      }
      else
      {
        i2 = i3 + 1;
        i3 = i2;
        break;
        i2 = 0;
        localObject = null;
      }
    }
  }
  
  final void g()
  {
    boolean bool = true;
    t = bool;
    a(bool);
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)c.get(paramInt);
  }
  
  public final ArrayList h()
  {
    boolean bool1 = r;
    if (!bool1) {}
    for (Object localObject = q;; localObject = q)
    {
      return (ArrayList)localObject;
      q.clear();
      localObject = c;
      int i2 = ((ArrayList)localObject).size();
      for (int i3 = 0; i3 < i2; i3 = i1)
      {
        localObject = (j)c.get(i3);
        boolean bool2 = ((j)localObject).isVisible();
        if (bool2)
        {
          ArrayList localArrayList = q;
          localArrayList.add(localObject);
        }
        i1 = i3 + 1;
      }
      r = false;
      int i1 = 1;
      t = i1;
    }
  }
  
  public boolean hasVisibleItems()
  {
    boolean bool1 = true;
    boolean bool2 = l;
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      int i2 = size();
      for (int i3 = 0;; i3 = i1)
      {
        if (i3 >= i2) {
          break label69;
        }
        localj = (j)c.get(i3);
        bool2 = localj.isVisible();
        if (bool2)
        {
          bool2 = bool1;
          break;
        }
        i1 = i3 + 1;
      }
      label69:
      int i1 = 0;
      j localj = null;
    }
  }
  
  public final void i()
  {
    ArrayList localArrayList = h();
    int i1 = t;
    if (i1 == 0) {}
    for (;;)
    {
      return;
      Object localObject1 = j;
      Object localObject2 = ((CopyOnWriteArrayList)localObject1).iterator();
      int i3 = 0;
      Object localObject3;
      for (;;)
      {
        i1 = ((Iterator)localObject2).hasNext();
        if (i1 == 0) {
          break;
        }
        localObject1 = (WeakReference)((Iterator)localObject2).next();
        localObject3 = (o)((WeakReference)localObject1).get();
        if (localObject3 == null)
        {
          localObject3 = j;
          ((CopyOnWriteArrayList)localObject3).remove(localObject1);
        }
        else
        {
          i1 = ((o)localObject3).a() | i3;
          i3 = i1;
        }
      }
      if (i3 != 0)
      {
        d.clear();
        localObject1 = s;
        ((ArrayList)localObject1).clear();
        i3 = localArrayList.size();
        int i4 = 0;
        localObject3 = null;
        if (i4 < i3)
        {
          localObject1 = (j)localArrayList.get(i4);
          boolean bool = ((j)localObject1).f();
          if (bool)
          {
            localObject2 = d;
            ((ArrayList)localObject2).add(localObject1);
          }
          for (;;)
          {
            int i2 = i4 + 1;
            i4 = i2;
            break;
            localObject2 = s;
            ((ArrayList)localObject2).add(localObject1);
          }
        }
      }
      else
      {
        d.clear();
        s.clear();
        localObject1 = s;
        localObject3 = h();
        ((ArrayList)localObject1).addAll((Collection)localObject3);
      }
      t = false;
    }
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    j localj = a(paramInt, paramKeyEvent);
    boolean bool;
    if (localj != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localj = null;
    }
  }
  
  public final ArrayList j()
  {
    i();
    return s;
  }
  
  public h k()
  {
    return this;
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    MenuItem localMenuItem = findItem(paramInt1);
    return a(localMenuItem, null, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    j localj = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (localj != null) {
      bool = a(localj, null, paramInt2);
    }
    int i1 = paramInt2 & 0x2;
    if (i1 != 0)
    {
      i1 = 1;
      b(i1);
    }
    return bool;
  }
  
  public void removeGroup(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    j localj;
    int i3;
    if (i2 < i1)
    {
      localj = (j)c.get(i2);
      i3 = localj.getGroupId();
      if (i3 == paramInt) {
        i1 = i2;
      }
    }
    for (;;)
    {
      if (i1 >= 0)
      {
        int i4 = c.size() - i1;
        i3 = 0;
        localj = null;
        for (;;)
        {
          i2 = i3 + 1;
          if (i3 >= i4) {
            break;
          }
          localj = (j)c.get(i1);
          i3 = localj.getGroupId();
          if (i3 != paramInt) {
            break;
          }
          a(i1, false);
          i3 = i2;
        }
        i2 += 1;
        break;
        i3 = -1;
        i1 = i3;
        continue;
        i3 = 1;
        a(i3);
      }
    }
  }
  
  public void removeItem(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    if (i2 < i1)
    {
      j localj = (j)c.get(i2);
      i3 = localj.getItemId();
      if (i3 != paramInt) {}
    }
    for (int i3 = i2;; i3 = -1)
    {
      a(i3, true);
      return;
      i2 += 1;
      break;
    }
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = c.size();
    int i2 = 0;
    j localj = null;
    for (int i3 = 0; i3 < i1; i3 = i2)
    {
      localj = (j)c.get(i3);
      int i4 = localj.getGroupId();
      if (i4 == paramInt)
      {
        localj.a(paramBoolean2);
        localj.setCheckable(paramBoolean1);
      }
      i2 = i3 + 1;
    }
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = c.size();
    int i2 = 0;
    j localj = null;
    for (int i3 = 0; i3 < i1; i3 = i2)
    {
      localj = (j)c.get(i3);
      int i4 = localj.getGroupId();
      if (i4 == paramInt) {
        localj.setEnabled(paramBoolean);
      }
      i2 = i3 + 1;
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    j localj = null;
    int i1 = c.size();
    int i2 = 0;
    boolean bool3 = false;
    float f3 = 0.0F;
    if (i2 < i1)
    {
      localj = (j)c.get(i2);
      int i3 = localj.getGroupId();
      if (i3 != paramInt) {
        break label115;
      }
      bool2 = localj.b(paramBoolean);
      if (!bool2) {
        break label115;
      }
      bool2 = bool1;
    }
    for (f2 = f1;; f2 = f3)
    {
      i2 += 1;
      bool3 = bool2;
      f3 = f2;
      break;
      if (bool3) {
        a(bool1);
      }
      return;
      label115:
      bool2 = bool3;
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    o = paramBoolean;
    a(false);
  }
  
  public int size()
  {
    return c.size();
  }
}


/* Location:              android/support/v7/view/menu/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */