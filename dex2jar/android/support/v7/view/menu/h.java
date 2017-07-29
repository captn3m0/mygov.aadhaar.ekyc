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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class h
  implements android.support.v4.e.a.a
{
  private static final int[] m = { 1, 4, 5, 3, 2, 0 };
  protected final Context a;
  public a b;
  ArrayList<j> c;
  public ArrayList<j> d;
  public int e = 0;
  CharSequence f;
  Drawable g;
  View h;
  boolean i = false;
  public CopyOnWriteArrayList<WeakReference<o>> j = new CopyOnWriteArrayList();
  j k;
  public boolean l;
  private final Resources n;
  private boolean o;
  private boolean p;
  private ArrayList<j> q;
  private boolean r;
  private ArrayList<j> s;
  private boolean t;
  private ContextMenu.ContextMenuInfo u;
  private boolean v = false;
  private boolean w = false;
  private boolean x = false;
  private boolean y = false;
  private ArrayList<j> z = new ArrayList();
  
  public h(Context paramContext)
  {
    a = paramContext;
    n = paramContext.getResources();
    c = new ArrayList();
    q = new ArrayList();
    r = true;
    d = new ArrayList();
    s = new ArrayList();
    t = true;
    if ((n.getConfiguration().keyboard != 1) && (n.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent))) {}
    for (;;)
    {
      p = bool;
      return;
      bool = false;
    }
  }
  
  private static int a(ArrayList<j> paramArrayList, int paramInt)
  {
    int i1 = paramArrayList.size() - 1;
    while (i1 >= 0)
    {
      if (geta <= paramInt) {
        return i1 + 1;
      }
      i1 -= 1;
    }
    return 0;
  }
  
  private j a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = z;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty())
    {
      paramKeyEvent = null;
      return paramKeyEvent;
    }
    int i3 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(localKeyData);
    int i4 = localArrayList.size();
    if (i4 == 1) {
      return (j)localArrayList.get(0);
    }
    boolean bool = b();
    int i1 = 0;
    label84:
    if (i1 < i4)
    {
      j localj = (j)localArrayList.get(i1);
      if (bool) {}
      for (int i2 = localj.getAlphabeticShortcut();; i2 = localj.getNumericShortcut())
      {
        if (i2 == meta[0])
        {
          paramKeyEvent = localj;
          if ((i3 & 0x2) == 0) {
            break;
          }
        }
        if (i2 == meta[2])
        {
          paramKeyEvent = localj;
          if ((i3 & 0x2) != 0) {
            break;
          }
        }
        if ((bool) && (i2 == 8))
        {
          paramKeyEvent = localj;
          if (paramInt == 67) {
            break;
          }
        }
        i1 += 1;
        break label84;
      }
    }
    return null;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= c.size())) {}
    do
    {
      return;
      c.remove(paramInt);
    } while (!paramBoolean);
    a(true);
  }
  
  private void a(List<j> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = b();
    int i3 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    int i4 = c.size();
    int i1 = 0;
    label49:
    j localj;
    if (i1 < i4)
    {
      localj = (j)c.get(i1);
      if (localj.hasSubMenu()) {
        ((h)localj.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      }
      if (!bool) {
        break label184;
      }
    }
    label184:
    for (int i2 = localj.getAlphabeticShortcut();; i2 = localj.getNumericShortcut())
    {
      if (((i3 & 0x5) == 0) && (i2 != 0) && ((i2 == meta[0]) || (i2 == meta[2]) || ((bool) && (i2 == 8) && (paramInt == 67))) && (localj.isEnabled())) {
        paramList.add(localj);
      }
      i1 += 1;
      break label49;
      break;
    }
  }
  
  protected final MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = (0xFFFF0000 & paramInt3) >> 16;
    if ((i1 < 0) || (i1 >= m.length)) {
      throw new IllegalArgumentException("order does not contain a valid category.");
    }
    i1 = m[i1] << 16 | 0xFFFF & paramInt3;
    paramCharSequence = new j(this, paramInt1, paramInt2, paramInt3, i1, paramCharSequence, e);
    if (u != null) {
      e = u;
    }
    c.add(a(c, i1), paramCharSequence);
    a(true);
    return paramCharSequence;
  }
  
  protected String a()
  {
    return "android:menu:actionviewstates";
  }
  
  final void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = n;
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
      f = localResources.getText(paramInt1);
      label47:
      if (paramInt2 <= 0) {
        break label83;
      }
      g = android.support.v4.c.a.a(a, paramInt2);
    }
    for (;;)
    {
      h = null;
      break;
      if (paramCharSequence == null) {
        break label47;
      }
      f = paramCharSequence;
      break label47;
      label83:
      if (paramDrawable != null) {
        g = paramDrawable;
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    if (j.isEmpty()) {
      return;
    }
    SparseArray localSparseArray = new SparseArray();
    Iterator localIterator = j.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (WeakReference)localIterator.next();
      o localo = (o)((WeakReference)localObject).get();
      if (localo == null)
      {
        j.remove(localObject);
      }
      else
      {
        int i1 = localo.b();
        if (i1 > 0)
        {
          localObject = localo.c();
          if (localObject != null) {
            localSparseArray.put(i1, localObject);
          }
        }
      }
    }
    paramBundle.putSparseParcelableArray("android:menu:presenters", localSparseArray);
  }
  
  public void a(a parama)
  {
    b = parama;
  }
  
  public final void a(o paramo)
  {
    a(paramo, a);
  }
  
  public final void a(o paramo, Context paramContext)
  {
    j.add(new WeakReference(paramo));
    paramo.a(paramContext, this);
    t = true;
  }
  
  public void a(boolean paramBoolean)
  {
    if (!v)
    {
      if (paramBoolean)
      {
        r = true;
        t = true;
      }
      if (!j.isEmpty())
      {
        d();
        Iterator localIterator = j.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          o localo = (o)localWeakReference.get();
          if (localo == null) {
            j.remove(localWeakReference);
          } else {
            localo.a(paramBoolean);
          }
        }
        e();
      }
    }
    do
    {
      return;
      w = true;
    } while (!paramBoolean);
    x = true;
  }
  
  boolean a(h paramh, MenuItem paramMenuItem)
  {
    return (b != null) && (b.a(paramh, paramMenuItem));
  }
  
  public boolean a(j paramj)
  {
    boolean bool2 = false;
    if (j.isEmpty()) {
      return bool2;
    }
    d();
    Iterator localIterator = j.iterator();
    boolean bool1 = false;
    for (;;)
    {
      label29:
      if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        o localo = (o)localWeakReference.get();
        if (localo == null)
        {
          j.remove(localWeakReference);
        }
        else
        {
          bool1 = localo.a(paramj);
          if (!bool1) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      e();
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      k = paramj;
      return bool1;
      break label29;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, o paramo, int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    paramMenuItem = (j)paramMenuItem;
    if ((paramMenuItem == null) || (!paramMenuItem.isEnabled())) {
      bool1 = false;
    }
    boolean bool3;
    Object localObject;
    label95:
    do
    {
      return bool1;
      bool3 = paramMenuItem.b();
      localObject = d;
      if ((localObject != null) && (((e)localObject).e())) {}
      for (int i1 = 1;; i1 = 0)
      {
        if (!paramMenuItem.i()) {
          break label95;
        }
        bool2 = paramMenuItem.expandActionView() | bool3;
        bool1 = bool2;
        if (!bool2) {
          break;
        }
        b(true);
        return bool2;
      }
      if ((!paramMenuItem.hasSubMenu()) && (i1 == 0)) {
        break label289;
      }
      if ((paramInt & 0x4) == 0) {
        b(false);
      }
      if (!paramMenuItem.hasSubMenu()) {
        paramMenuItem.a(new u(a, this, paramMenuItem));
      }
      paramMenuItem = (u)paramMenuItem.getSubMenu();
      if (i1 != 0) {
        ((e)localObject).a(paramMenuItem);
      }
      if (!j.isEmpty()) {
        break;
      }
      bool2 = bool3 | bool1;
      bool1 = bool2;
    } while (bool2);
    b(true);
    return bool2;
    bool1 = bool2;
    if (paramo != null) {
      bool1 = paramo.a(paramMenuItem);
    }
    paramo = j.iterator();
    label220:
    while (paramo.hasNext())
    {
      localObject = (WeakReference)paramo.next();
      o localo = (o)((WeakReference)localObject).get();
      if (localo == null)
      {
        j.remove(localObject);
      }
      else
      {
        if (bool1) {
          break label303;
        }
        bool1 = localo.a(paramMenuItem);
      }
    }
    label289:
    label303:
    for (;;)
    {
      break label220;
      break;
      if ((paramInt & 0x1) == 0) {
        b(true);
      }
      return bool3;
    }
  }
  
  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, n.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, n.getString(paramInt4));
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
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i1;
    label52:
    ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i1 = localList.size();
      if ((paramInt4 & 0x1) == 0) {
        removeGroup(paramInt1);
      }
      paramInt4 = 0;
      if (paramInt4 >= i1) {
        break label214;
      }
      localResolveInfo = (ResolveInfo)localList.get(paramInt4);
      if (specificIndex >= 0) {
        break label201;
      }
    }
    label201:
    for (paramComponentName = paramIntent;; paramComponentName = paramArrayOfIntent[specificIndex])
    {
      paramComponentName = new Intent(paramComponentName);
      paramComponentName.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
      paramComponentName = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(paramComponentName);
      if ((paramArrayOfMenuItem != null) && (specificIndex >= 0)) {
        paramArrayOfMenuItem[specificIndex] = paramComponentName;
      }
      paramInt4 += 1;
      break label52;
      i1 = 0;
      break;
    }
    label214:
    return i1;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, n.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, n.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = (j)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    u localu = new u(a, this, paramCharSequence);
    paramCharSequence.a(localu);
    return localu;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(Bundle paramBundle)
  {
    int i2 = size();
    int i1 = 0;
    Object localObject3;
    for (Object localObject1 = null; i1 < i2; localObject1 = localObject3)
    {
      MenuItem localMenuItem = getItem(i1);
      View localView = m.a(localMenuItem);
      localObject3 = localObject1;
      if (localView != null)
      {
        localObject3 = localObject1;
        if (localView.getId() != -1)
        {
          Object localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new SparseArray();
          }
          localView.saveHierarchyState((SparseArray)localObject2);
          localObject3 = localObject2;
          if (m.c(localMenuItem))
          {
            paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
            localObject3 = localObject2;
          }
        }
      }
      if (localMenuItem.hasSubMenu()) {
        ((u)localMenuItem.getSubMenu()).b(paramBundle);
      }
      i1 += 1;
    }
    if (localObject1 != null) {
      paramBundle.putSparseParcelableArray(a(), (SparseArray)localObject1);
    }
  }
  
  public final void b(o paramo)
  {
    Iterator localIterator = j.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      o localo = (o)localWeakReference.get();
      if ((localo == null) || (localo == paramo)) {
        j.remove(localWeakReference);
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (y) {
      return;
    }
    y = true;
    Iterator localIterator = j.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      o localo = (o)localWeakReference.get();
      if (localo == null) {
        j.remove(localWeakReference);
      } else {
        localo.a(this, paramBoolean);
      }
    }
    y = false;
  }
  
  boolean b()
  {
    return o;
  }
  
  public boolean b(j paramj)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!j.isEmpty())
    {
      if (k != paramj) {
        bool2 = bool1;
      }
    }
    else {
      return bool2;
    }
    d();
    Iterator localIterator = j.iterator();
    bool1 = false;
    for (;;)
    {
      label41:
      if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        o localo = (o)localWeakReference.get();
        if (localo == null)
        {
          j.remove(localWeakReference);
        }
        else
        {
          bool1 = localo.b(paramj);
          if (!bool1) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      e();
      bool2 = bool1;
      if (!bool1) {
        break;
      }
      k = null;
      return bool1;
      break label41;
    }
  }
  
  public final void c(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    do
    {
      int i1;
      do
      {
        return;
        SparseArray localSparseArray = paramBundle.getSparseParcelableArray(a());
        int i2 = size();
        i1 = 0;
        while (i1 < i2)
        {
          MenuItem localMenuItem = getItem(i1);
          View localView = m.a(localMenuItem);
          if ((localView != null) && (localView.getId() != -1)) {
            localView.restoreHierarchyState(localSparseArray);
          }
          if (localMenuItem.hasSubMenu()) {
            ((u)localMenuItem.getSubMenu()).c(paramBundle);
          }
          i1 += 1;
        }
        i1 = paramBundle.getInt("android:menu:expandedactionview");
      } while (i1 <= 0);
      paramBundle = findItem(i1);
    } while (paramBundle == null);
    m.b(paramBundle);
  }
  
  public boolean c()
  {
    return p;
  }
  
  public void clear()
  {
    if (k != null) {
      b(k);
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
    if (!v)
    {
      v = true;
      w = false;
      x = false;
    }
  }
  
  public final void e()
  {
    v = false;
    if (w)
    {
      w = false;
      a(x);
    }
  }
  
  final void f()
  {
    r = true;
    a(true);
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject = (j)c.get(i1);
      if (((j)localObject).getItemId() == paramInt) {}
      MenuItem localMenuItem;
      do
      {
        return (MenuItem)localObject;
        if (!((j)localObject).hasSubMenu()) {
          break;
        }
        localMenuItem = ((j)localObject).getSubMenu().findItem(paramInt);
        localObject = localMenuItem;
      } while (localMenuItem != null);
      i1 += 1;
    }
    return null;
  }
  
  final void g()
  {
    t = true;
    a(true);
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)c.get(paramInt);
  }
  
  public final ArrayList<j> h()
  {
    if (!r) {
      return q;
    }
    q.clear();
    int i2 = c.size();
    int i1 = 0;
    while (i1 < i2)
    {
      j localj = (j)c.get(i1);
      if (localj.isVisible()) {
        q.add(localj);
      }
      i1 += 1;
    }
    r = false;
    t = true;
    return q;
  }
  
  public boolean hasVisibleItems()
  {
    if (l) {
      return true;
    }
    int i2 = size();
    int i1 = 0;
    while (i1 < i2)
    {
      if (((j)c.get(i1)).isVisible()) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  public final void i()
  {
    ArrayList localArrayList = h();
    if (!t) {
      return;
    }
    Object localObject = j.iterator();
    int i1 = 0;
    while (((Iterator)localObject).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject).next();
      o localo = (o)localWeakReference.get();
      if (localo == null) {
        j.remove(localWeakReference);
      } else {
        i1 = localo.a() | i1;
      }
    }
    if (i1 != 0)
    {
      d.clear();
      s.clear();
      int i3 = localArrayList.size();
      i1 = 0;
      if (i1 < i3)
      {
        localObject = (j)localArrayList.get(i1);
        if (((j)localObject).f()) {
          d.add(localObject);
        }
        for (;;)
        {
          int i2;
          i1 += 1;
          break;
          s.add(localObject);
        }
      }
    }
    else
    {
      d.clear();
      s.clear();
      s.addAll(h());
    }
    t = false;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }
  
  public final ArrayList<j> j()
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
    return a(findItem(paramInt1), null, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (paramKeyEvent != null) {
      bool = a(paramKeyEvent, null, paramInt2);
    }
    if ((paramInt2 & 0x2) != 0) {
      b(true);
    }
    return bool;
  }
  
  public void removeGroup(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    if (i1 < i2) {
      if (((j)c.get(i1)).getGroupId() != paramInt) {}
    }
    for (;;)
    {
      label30:
      if (i1 >= 0)
      {
        int i3 = c.size();
        i2 = 0;
        for (;;)
        {
          if ((i2 < i3 - i1) && (((j)c.get(i1)).getGroupId() == paramInt))
          {
            a(i1, false);
            i2 += 1;
            continue;
            i1 += 1;
            break;
            i1 = -1;
            break label30;
          }
        }
        a(true);
      }
    }
  }
  
  public void removeItem(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    if (i1 < i2) {
      if (((j)c.get(i1)).getItemId() != paramInt) {}
    }
    for (;;)
    {
      a(i1, true);
      return;
      i1 += 1;
      break;
      i1 = -1;
    }
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2 = c.size();
    int i1 = 0;
    while (i1 < i2)
    {
      j localj = (j)c.get(i1);
      if (localj.getGroupId() == paramInt)
      {
        localj.a(paramBoolean2);
        localj.setCheckable(paramBoolean1);
      }
      i1 += 1;
    }
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i2 = c.size();
    int i1 = 0;
    while (i1 < i2)
    {
      j localj = (j)c.get(i1);
      if (localj.getGroupId() == paramInt) {
        localj.setEnabled(paramBoolean);
      }
      i1 += 1;
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i3 = c.size();
    int i2 = 0;
    int i1 = 0;
    if (i2 < i3)
    {
      j localj = (j)c.get(i2);
      if ((localj.getGroupId() != paramInt) || (!localj.b(paramBoolean))) {
        break label74;
      }
      i1 = 1;
    }
    label74:
    for (;;)
    {
      i2 += 1;
      break;
      if (i1 != 0) {
        a(true);
      }
      return;
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
  
  public static abstract interface a
  {
    public abstract void a(h paramh);
    
    public abstract boolean a(h paramh, MenuItem paramMenuItem);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(j paramj);
  }
}


/* Location:              android/support/v7/view/menu/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */