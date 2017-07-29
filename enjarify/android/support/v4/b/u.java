package android.support.v4.b;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class u
{
  public static Object a(Object paramObject)
  {
    Transition localTransition = null;
    if (paramObject != null)
    {
      paramObject = (Transition)paramObject;
      localTransition = ((Transition)paramObject).clone();
    }
    return localTransition;
  }
  
  public static ArrayList a(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayList.size();
    int j = 0;
    View localView = null;
    for (int k = 0; k < i; k = j)
    {
      localView = (View)paramArrayList.get(k);
      String str = localView.getTransitionName();
      localArrayList.add(str);
      str = null;
      localView.setTransitionName(null);
      j = k + 1;
    }
    return localArrayList;
  }
  
  public static void a(View paramView, Rect paramRect)
  {
    int i = 1;
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int j = arrayOfInt[0];
    int k = arrayOfInt[i];
    int m = arrayOfInt[0];
    int n = paramView.getWidth();
    m += n;
    int i1 = arrayOfInt[i];
    n = paramView.getHeight();
    i1 += n;
    paramRect.set(j, k, m, i1);
  }
  
  public static void a(View paramView, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Map paramMap)
  {
    int i = paramArrayList2.size();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = 0;
    if (j < i)
    {
      localObject1 = (View)paramArrayList1.get(j);
      String str = ((View)localObject1).getTransitionName();
      localArrayList.add(str);
      int k;
      if (str != null)
      {
        ((View)localObject1).setTransitionName(null);
        localObject1 = (String)paramMap.get(str);
        k = 0;
      }
      for (;;)
      {
        if (k < i)
        {
          Object localObject2 = paramArrayList3.get(k);
          boolean bool = ((String)localObject1).equals(localObject2);
          if (bool)
          {
            localObject1 = (View)paramArrayList2.get(k);
            ((View)localObject1).setTransitionName(str);
          }
        }
        else
        {
          int m = j + 1;
          j = m;
          break;
        }
        k += 1;
      }
    }
    Object localObject1 = new android/support/v4/b/u$3;
    ((u.3)localObject1).<init>(i, paramArrayList2, paramArrayList3, paramArrayList1, localArrayList);
    aj.a(paramView, (Runnable)localObject1);
  }
  
  public static void a(ViewGroup paramViewGroup, Object paramObject)
  {
    paramObject = (Transition)paramObject;
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }
  
  public static void a(Object paramObject, Rect paramRect)
  {
    if (paramObject != null)
    {
      paramObject = (Transition)paramObject;
      u.6 local6 = new android/support/v4/b/u$6;
      local6.<init>(paramRect);
      ((Transition)paramObject).setEpicenterCallback(local6);
    }
  }
  
  public static void a(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      paramObject = (Transition)paramObject;
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      a(paramView, localRect);
      u.1 local1 = new android/support/v4/b/u$1;
      local1.<init>(localRect);
      ((Transition)paramObject).setEpicenterCallback(local1);
    }
  }
  
  public static void a(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (TransitionSet)paramObject;
    List localList = ((TransitionSet)paramObject).getTargets();
    localList.clear();
    int i = paramArrayList.size();
    int i1;
    for (int j = 0; j < i; j = i1)
    {
      Object localObject = (View)paramArrayList.get(j);
      int k = localList.size();
      int m = a(localList, (View)localObject, k);
      if (m == 0)
      {
        localList.add(localObject);
        for (m = k;; m = i1)
        {
          int n = localList.size();
          if (m >= n) {
            break;
          }
          localObject = (View)localList.get(m);
          int i2 = localObject instanceof ViewGroup;
          if (i2 != 0)
          {
            localObject = (ViewGroup)localObject;
            int i4 = ((ViewGroup)localObject).getChildCount();
            i2 = 0;
            while (i2 < i4)
            {
              View localView = ((ViewGroup)localObject).getChildAt(i2);
              boolean bool = a(localList, localView, k);
              if (!bool) {
                localList.add(localView);
              }
              int i3;
              i2 += 1;
            }
          }
          i1 = m + 1;
        }
      }
      i1 = j + 1;
    }
    localList.add(paramView);
    paramArrayList.add(paramView);
    a(paramObject, paramArrayList);
  }
  
  public static void a(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2, Object paramObject4, ArrayList paramArrayList3)
  {
    paramObject1 = (Transition)paramObject1;
    u.5 local5 = new android/support/v4/b/u$5;
    local5.<init>(paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3);
    ((Transition)paramObject1).addListener(local5);
  }
  
  public static void a(Object paramObject, ArrayList paramArrayList)
  {
    int i = 0;
    View localView = null;
    paramObject = (Transition)paramObject;
    if (paramObject == null) {}
    for (;;)
    {
      return;
      boolean bool = paramObject instanceof TransitionSet;
      if (bool)
      {
        paramObject = (TransitionSet)paramObject;
        int j = ((TransitionSet)paramObject).getTransitionCount();
        while (i < j)
        {
          Transition localTransition = ((TransitionSet)paramObject).getTransitionAt(i);
          a(localTransition, paramArrayList);
          i += 1;
        }
      }
      else
      {
        int k = a((Transition)paramObject);
        if (k == 0)
        {
          List localList = ((Transition)paramObject).getTargets();
          k = a(localList);
          if (k != 0)
          {
            int m = paramArrayList.size();
            k = 0;
            localList = null;
            while (k < m)
            {
              localView = (View)paramArrayList.get(k);
              ((Transition)paramObject).addTarget(localView);
              i = k + 1;
              k = i;
            }
          }
        }
      }
    }
  }
  
  public static void a(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    paramObject = (TransitionSet)paramObject;
    if (paramObject != null)
    {
      ((TransitionSet)paramObject).getTargets().clear();
      List localList = ((TransitionSet)paramObject).getTargets();
      localList.addAll(paramArrayList2);
      b(paramObject, paramArrayList1, paramArrayList2);
    }
  }
  
  public static void a(ArrayList paramArrayList, View paramView)
  {
    int i = paramView.getVisibility();
    int j;
    if (i == 0)
    {
      j = paramView instanceof ViewGroup;
      if (j == 0) {
        break label71;
      }
      paramView = (ViewGroup)paramView;
      j = paramView.isTransitionGroup();
      if (j == 0) {
        break label39;
      }
      paramArrayList.add(paramView);
    }
    for (;;)
    {
      return;
      label39:
      int m = paramView.getChildCount();
      j = 0;
      while (j < m)
      {
        View localView = paramView.getChildAt(j);
        a(paramArrayList, localView);
        int k;
        j += 1;
      }
      continue;
      label71:
      paramArrayList.add(paramView);
    }
  }
  
  public static void a(Map paramMap, View paramView)
  {
    int i = paramView.getVisibility();
    if (i == 0)
    {
      String str = paramView.getTransitionName();
      if (str != null) {
        paramMap.put(str, paramView);
      }
      int j = paramView instanceof ViewGroup;
      if (j != 0)
      {
        paramView = (ViewGroup)paramView;
        int m = paramView.getChildCount();
        j = 0;
        str = null;
        while (j < m)
        {
          View localView = paramView.getChildAt(j);
          a(paramMap, localView);
          int k;
          j += 1;
        }
      }
    }
  }
  
  private static boolean a(Transition paramTransition)
  {
    List localList = paramTransition.getTargetIds();
    boolean bool = a(localList);
    if (bool)
    {
      localList = paramTransition.getTargetNames();
      bool = a(localList);
      if (bool)
      {
        localList = paramTransition.getTargetTypes();
        bool = a(localList);
        if (bool) {
          break label46;
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label46:
      bool = false;
      localList = null;
    }
  }
  
  private static boolean a(List paramList)
  {
    if (paramList != null)
    {
      bool = paramList.isEmpty();
      if (!bool) {
        break label19;
      }
    }
    label19:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean a(List paramList, View paramView, int paramInt)
  {
    boolean bool = false;
    int i = 0;
    for (;;)
    {
      if (i < paramInt)
      {
        Object localObject = paramList.get(i);
        if (localObject == paramView) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      i += 1;
    }
  }
  
  public static void b(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i = 0;
    View localView = null;
    paramObject = (Transition)paramObject;
    boolean bool = paramObject instanceof TransitionSet;
    Transition localTransition;
    if (bool)
    {
      paramObject = (TransitionSet)paramObject;
      int j = ((TransitionSet)paramObject).getTransitionCount();
      while (i < j)
      {
        localTransition = ((TransitionSet)paramObject).getTransitionAt(i);
        b(localTransition, paramArrayList1, paramArrayList2);
        i += 1;
      }
    }
    int k = a((Transition)paramObject);
    if (k == 0)
    {
      List localList = ((Transition)paramObject).getTargets();
      if (localList != null)
      {
        int n = localList.size();
        int i1 = paramArrayList1.size();
        if (n == i1)
        {
          k = localList.containsAll(paramArrayList1);
          if (k != 0)
          {
            if (paramArrayList2 == null)
            {
              k = 0;
              localList = null;
            }
            for (;;)
            {
              n = 0;
              localTransition = null;
              while (n < k)
              {
                localView = (View)paramArrayList2.get(n);
                ((Transition)paramObject).addTarget(localView);
                i = n + 1;
                n = i;
              }
              m = paramArrayList2.size();
            }
            i = paramArrayList1.size() + -1;
            for (int m = i; m >= 0; m = i)
            {
              localView = (View)paramArrayList1.get(m);
              ((Transition)paramObject).removeTarget(localView);
              i = m + -1;
            }
          }
        }
      }
    }
  }
}


/* Location:              android/support/v4/b/u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */