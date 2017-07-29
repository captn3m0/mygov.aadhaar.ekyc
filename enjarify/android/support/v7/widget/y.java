package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.u;
import android.support.v7.b.a.b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class y
  extends Spinner
  implements u
{
  private static final int[] d;
  y.b a;
  int b;
  final Rect c;
  private h e;
  private Context f;
  private aj g;
  private SpinnerAdapter h;
  private boolean i;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843505;
    d = arrayOfInt;
  }
  
  public y(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, j);
  }
  
  public y(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, (byte)0);
  }
  
  private y(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  /* Error */
  private y(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: iload_3
    //   7: invokespecial 45	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   10: new 47	android/graphics/Rect
    //   13: astore 6
    //   15: aload 6
    //   17: invokespecial 50	android/graphics/Rect:<init>	()V
    //   20: aload_0
    //   21: aload 6
    //   23: putfield 52	android/support/v7/widget/y:c	Landroid/graphics/Rect;
    //   26: getstatic 57	android/support/v7/a/a$j:Spinner	[I
    //   29: astore 6
    //   31: aload_1
    //   32: aload_2
    //   33: aload 6
    //   35: iload_3
    //   36: iconst_0
    //   37: invokestatic 62	android/support/v7/widget/bf:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bf;
    //   40: astore 7
    //   42: new 64	android/support/v7/widget/h
    //   45: astore 6
    //   47: aload 6
    //   49: aload_0
    //   50: invokespecial 67	android/support/v7/widget/h:<init>	(Landroid/view/View;)V
    //   53: aload_0
    //   54: aload 6
    //   56: putfield 69	android/support/v7/widget/y:e	Landroid/support/v7/widget/h;
    //   59: getstatic 72	android/support/v7/a/a$j:Spinner_popupTheme	I
    //   62: istore 8
    //   64: aload 7
    //   66: iload 8
    //   68: iconst_0
    //   69: invokevirtual 75	android/support/v7/widget/bf:g	(II)I
    //   72: istore 9
    //   74: iload 9
    //   76: ifeq +400 -> 476
    //   79: new 77	android/support/v7/view/d
    //   82: astore 6
    //   84: aload 6
    //   86: aload_1
    //   87: iload 9
    //   89: invokespecial 80	android/support/v7/view/d:<init>	(Landroid/content/Context;I)V
    //   92: aload_0
    //   93: astore 10
    //   95: aload 10
    //   97: aload 6
    //   99: putfield 82	android/support/v7/widget/y:f	Landroid/content/Context;
    //   102: aload_0
    //   103: getfield 82	android/support/v7/widget/y:f	Landroid/content/Context;
    //   106: astore 6
    //   108: aload 6
    //   110: ifnull +251 -> 361
    //   113: getstatic 87	android/os/Build$VERSION:SDK_INT	I
    //   116: istore 8
    //   118: bipush 11
    //   120: istore 9
    //   122: iload 8
    //   124: iload 9
    //   126: if_icmplt +447 -> 573
    //   129: getstatic 29	android/support/v7/widget/y:d	[I
    //   132: astore 6
    //   134: iconst_0
    //   135: istore 9
    //   137: aconst_null
    //   138: astore 10
    //   140: aload_1
    //   141: aload_2
    //   142: aload 6
    //   144: iload_3
    //   145: iconst_0
    //   146: invokevirtual 94	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   149: astore 10
    //   151: iconst_0
    //   152: istore 8
    //   154: aconst_null
    //   155: astore 6
    //   157: aload 10
    //   159: iconst_0
    //   160: invokevirtual 100	android/content/res/TypedArray:hasValue	(I)Z
    //   163: istore 8
    //   165: iload 8
    //   167: ifeq +24 -> 191
    //   170: iconst_0
    //   171: istore 8
    //   173: aconst_null
    //   174: astore 6
    //   176: iconst_0
    //   177: istore 11
    //   179: aconst_null
    //   180: astore 12
    //   182: aload 10
    //   184: iconst_0
    //   185: iconst_0
    //   186: invokevirtual 103	android/content/res/TypedArray:getInt	(II)I
    //   189: istore 4
    //   191: aload 10
    //   193: ifnull +8 -> 201
    //   196: aload 10
    //   198: invokevirtual 106	android/content/res/TypedArray:recycle	()V
    //   201: iload 4
    //   203: iload 5
    //   205: if_icmpne +156 -> 361
    //   208: new 108	android/support/v7/widget/y$b
    //   211: astore 6
    //   213: aload_0
    //   214: getfield 82	android/support/v7/widget/y:f	Landroid/content/Context;
    //   217: astore 10
    //   219: aload 6
    //   221: aload_0
    //   222: aload 10
    //   224: aload_2
    //   225: iload_3
    //   226: invokespecial 111	android/support/v7/widget/y$b:<init>	(Landroid/support/v7/widget/y;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   229: aload_0
    //   230: getfield 82	android/support/v7/widget/y:f	Landroid/content/Context;
    //   233: astore 10
    //   235: getstatic 57	android/support/v7/a/a$j:Spinner	[I
    //   238: astore 12
    //   240: aload 10
    //   242: aload_2
    //   243: aload 12
    //   245: iload_3
    //   246: iconst_0
    //   247: invokestatic 62	android/support/v7/widget/bf:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bf;
    //   250: astore 10
    //   252: getstatic 114	android/support/v7/a/a$j:Spinner_android_dropDownWidth	I
    //   255: istore 11
    //   257: bipush -2
    //   259: istore 13
    //   261: aload 10
    //   263: iload 11
    //   265: iload 13
    //   267: invokevirtual 116	android/support/v7/widget/bf:f	(II)I
    //   270: istore 11
    //   272: aload_0
    //   273: iload 11
    //   275: putfield 118	android/support/v7/widget/y:b	I
    //   278: getstatic 121	android/support/v7/a/a$j:Spinner_android_popupBackground	I
    //   281: istore 11
    //   283: aload 10
    //   285: iload 11
    //   287: invokevirtual 124	android/support/v7/widget/bf:a	(I)Landroid/graphics/drawable/Drawable;
    //   290: astore 12
    //   292: aload 6
    //   294: aload 12
    //   296: invokevirtual 127	android/support/v7/widget/y$b:a	(Landroid/graphics/drawable/Drawable;)V
    //   299: getstatic 130	android/support/v7/a/a$j:Spinner_android_prompt	I
    //   302: istore 11
    //   304: aload 7
    //   306: getfield 133	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   309: astore 14
    //   311: aload 14
    //   313: iload 11
    //   315: invokevirtual 137	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   318: astore 12
    //   320: aload 6
    //   322: aload 12
    //   324: putfield 140	android/support/v7/widget/y$b:a	Ljava/lang/CharSequence;
    //   327: aload 10
    //   329: getfield 133	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   332: invokevirtual 106	android/content/res/TypedArray:recycle	()V
    //   335: aload_0
    //   336: aload 6
    //   338: putfield 142	android/support/v7/widget/y:a	Landroid/support/v7/widget/y$b;
    //   341: new 144	android/support/v7/widget/y$1
    //   344: astore 10
    //   346: aload 10
    //   348: aload_0
    //   349: aload_0
    //   350: aload 6
    //   352: invokespecial 147	android/support/v7/widget/y$1:<init>	(Landroid/support/v7/widget/y;Landroid/view/View;Landroid/support/v7/widget/y$b;)V
    //   355: aload_0
    //   356: aload 10
    //   358: putfield 149	android/support/v7/widget/y:g	Landroid/support/v7/widget/aj;
    //   361: getstatic 152	android/support/v7/a/a$j:Spinner_android_entries	I
    //   364: istore 8
    //   366: aload 7
    //   368: getfield 133	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   371: astore 10
    //   373: aload 10
    //   375: iload 8
    //   377: invokevirtual 156	android/content/res/TypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   380: astore 6
    //   382: aload 6
    //   384: ifnull +40 -> 424
    //   387: new 158	android/widget/ArrayAdapter
    //   390: astore 10
    //   392: ldc -97
    //   394: istore 11
    //   396: aload 10
    //   398: aload_1
    //   399: iload 11
    //   401: aload 6
    //   403: invokespecial 163	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   406: getstatic 168	android/support/v7/a/a$g:support_simple_spinner_dropdown_item	I
    //   409: istore 8
    //   411: aload 10
    //   413: iload 8
    //   415: invokevirtual 172	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   418: aload_0
    //   419: aload 10
    //   421: invokevirtual 176	android/support/v7/widget/y:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   424: aload 7
    //   426: getfield 133	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   429: invokevirtual 106	android/content/res/TypedArray:recycle	()V
    //   432: aload_0
    //   433: iload 5
    //   435: putfield 178	android/support/v7/widget/y:i	Z
    //   438: aload_0
    //   439: getfield 180	android/support/v7/widget/y:h	Landroid/widget/SpinnerAdapter;
    //   442: astore 6
    //   444: aload 6
    //   446: ifnull +20 -> 466
    //   449: aload_0
    //   450: getfield 180	android/support/v7/widget/y:h	Landroid/widget/SpinnerAdapter;
    //   453: astore 6
    //   455: aload_0
    //   456: aload 6
    //   458: invokevirtual 176	android/support/v7/widget/y:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   461: aload_0
    //   462: aconst_null
    //   463: putfield 180	android/support/v7/widget/y:h	Landroid/widget/SpinnerAdapter;
    //   466: aload_0
    //   467: getfield 69	android/support/v7/widget/y:e	Landroid/support/v7/widget/h;
    //   470: aload_2
    //   471: iload_3
    //   472: invokevirtual 183	android/support/v7/widget/h:a	(Landroid/util/AttributeSet;I)V
    //   475: return
    //   476: getstatic 87	android/os/Build$VERSION:SDK_INT	I
    //   479: istore 8
    //   481: bipush 23
    //   483: istore 9
    //   485: iload 8
    //   487: iload 9
    //   489: if_icmpge +12 -> 501
    //   492: aload_1
    //   493: astore 6
    //   495: aload_0
    //   496: astore 10
    //   498: goto -403 -> 95
    //   501: iconst_0
    //   502: istore 8
    //   504: aconst_null
    //   505: astore 6
    //   507: aload_0
    //   508: astore 10
    //   510: goto -415 -> 95
    //   513: astore 6
    //   515: iconst_0
    //   516: istore 9
    //   518: aconst_null
    //   519: astore 10
    //   521: ldc -70
    //   523: astore 12
    //   525: ldc -68
    //   527: astore 14
    //   529: aload 12
    //   531: aload 14
    //   533: aload 6
    //   535: invokestatic 193	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   538: pop
    //   539: aload 10
    //   541: ifnull -340 -> 201
    //   544: aload 10
    //   546: invokevirtual 106	android/content/res/TypedArray:recycle	()V
    //   549: goto -348 -> 201
    //   552: astore 6
    //   554: iconst_0
    //   555: istore 9
    //   557: aconst_null
    //   558: astore 10
    //   560: aload 10
    //   562: ifnull +8 -> 570
    //   565: aload 10
    //   567: invokevirtual 106	android/content/res/TypedArray:recycle	()V
    //   570: aload 6
    //   572: athrow
    //   573: iload 5
    //   575: istore 4
    //   577: goto -376 -> 201
    //   580: astore 6
    //   582: goto -22 -> 560
    //   585: astore 6
    //   587: goto -66 -> 521
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	590	0	this	y
    //   0	590	1	paramContext	Context
    //   0	590	2	paramAttributeSet	AttributeSet
    //   0	590	3	paramInt1	int
    //   0	590	4	paramInt2	int
    //   1	573	5	j	int
    //   13	493	6	localObject1	Object
    //   513	21	6	localException1	Exception
    //   552	19	6	localObject2	Object
    //   580	1	6	localObject3	Object
    //   585	1	6	localException2	Exception
    //   40	385	7	localbf	bf
    //   62	91	8	k	int
    //   163	9	8	bool	boolean
    //   364	139	8	m	int
    //   72	484	9	n	int
    //   93	473	10	localObject4	Object
    //   177	223	11	i1	int
    //   180	350	12	localObject5	Object
    //   259	7	13	i2	int
    //   309	223	14	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   129	132	513	java/lang/Exception
    //   145	149	513	java/lang/Exception
    //   129	132	552	finally
    //   145	149	552	finally
    //   159	163	580	finally
    //   185	189	580	finally
    //   533	539	580	finally
    //   159	163	585	java/lang/Exception
    //   185	189	585	java/lang/Exception
  }
  
  final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    int j = -2;
    int k = 0;
    Rect localRect = null;
    if (paramSpinnerAdapter == null) {
      return k;
    }
    int m = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i1 = getSelectedItemPosition();
    i1 = Math.max(0, i1);
    int i2 = paramSpinnerAdapter.getCount();
    int i3 = i1 + 15;
    int i4 = Math.min(i2, i3);
    i2 = i4 - i1;
    i2 = 15 - i2;
    i1 -= i2;
    int i5 = Math.max(0, i1);
    i2 = 0;
    View localView = null;
    i3 = 0;
    i1 = 0;
    Object localObject = null;
    label118:
    if (i5 < i4)
    {
      k = paramSpinnerAdapter.getItemViewType(i5);
      if (k == i1) {
        break label293;
      }
      i1 = 0;
    }
    for (localObject = null;; localObject = localView)
    {
      localView = paramSpinnerAdapter.getView(i5, (View)localObject, this);
      localObject = localView.getLayoutParams();
      if (localObject == null)
      {
        localObject = new android/view/ViewGroup$LayoutParams;
        ((ViewGroup.LayoutParams)localObject).<init>(j, j);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      localView.measure(m, n);
      i1 = localView.getMeasuredWidth();
      i3 = Math.max(i3, i1);
      i5 += 1;
      i1 = k;
      break label118;
      if (paramDrawable != null)
      {
        localRect = c;
        paramDrawable.getPadding(localRect);
        localRect = c;
        k = left;
        localObject = c;
        i1 = right;
        k = k + i1 + i3;
        break;
      }
      k = i3;
      break;
      label293:
      k = i1;
    }
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    h localh = e;
    if (localh != null)
    {
      localh = e;
      localh.d();
    }
  }
  
  public final int getDropDownHorizontalOffset()
  {
    y.b localb = a;
    int j;
    if (localb != null)
    {
      localb = a;
      j = g;
    }
    for (;;)
    {
      return j;
      j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k)
      {
        j = super.getDropDownHorizontalOffset();
      }
      else
      {
        j = 0;
        localb = null;
      }
    }
  }
  
  public final int getDropDownVerticalOffset()
  {
    y.b localb = a;
    int j;
    if (localb != null)
    {
      localb = a;
      j = localb.c();
    }
    for (;;)
    {
      return j;
      j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k)
      {
        j = super.getDropDownVerticalOffset();
      }
      else
      {
        j = 0;
        localb = null;
      }
    }
  }
  
  public final int getDropDownWidth()
  {
    y.b localb = a;
    int j;
    if (localb != null) {
      j = b;
    }
    for (;;)
    {
      return j;
      j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k)
      {
        j = super.getDropDownWidth();
      }
      else
      {
        j = 0;
        localb = null;
      }
    }
  }
  
  public final Drawable getPopupBackground()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = a.q.getBackground();
    }
    for (;;)
    {
      return (Drawable)localObject;
      int j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k)
      {
        localObject = super.getPopupBackground();
      }
      else
      {
        j = 0;
        localObject = null;
      }
    }
  }
  
  public final Context getPopupContext()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = f;
    }
    for (;;)
    {
      return (Context)localObject;
      int j = Build.VERSION.SDK_INT;
      int k = 23;
      if (j >= k)
      {
        localObject = super.getPopupContext();
      }
      else
      {
        j = 0;
        localObject = null;
      }
    }
  }
  
  public final CharSequence getPrompt()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.a;; localObject = super.getPrompt()) {
      return (CharSequence)localObject;
    }
  }
  
  public final ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = e;
    if (localObject != null) {}
    for (localObject = e.b();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = e;
    if (localObject != null) {}
    for (localObject = e.c();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = a;
    if (localObject != null)
    {
      localObject = a.q;
      boolean bool = ((PopupWindow)localObject).isShowing();
      if (bool)
      {
        localObject = a;
        ((y.b)localObject).e();
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    y.b localb = a;
    if (localb != null)
    {
      int j = View.MeasureSpec.getMode(paramInt1);
      int k = -1 << -1;
      if (j == k)
      {
        j = getMeasuredWidth();
        SpinnerAdapter localSpinnerAdapter = getAdapter();
        Drawable localDrawable = getBackground();
        k = a(localSpinnerAdapter, localDrawable);
        j = Math.max(j, k);
        k = View.MeasureSpec.getSize(paramInt1);
        j = Math.min(j, k);
        k = getMeasuredHeight();
        setMeasuredDimension(j, k);
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    aj localaj = g;
    if (localaj != null)
    {
      localaj = g;
      bool = localaj.onTouch(this, paramMotionEvent);
      if (!bool) {}
    }
    for (boolean bool = true;; bool = super.onTouchEvent(paramMotionEvent)) {
      return bool;
    }
  }
  
  public final boolean performClick()
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = a.q;
      bool = ((PopupWindow)localObject).isShowing();
      if (!bool)
      {
        localObject = a;
        ((y.b)localObject).d();
      }
    }
    for (boolean bool = true;; bool = super.performClick()) {
      return bool;
    }
  }
  
  public final void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    boolean bool = i;
    if (!bool) {
      h = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
      localObject = a;
    } while (localObject == null);
    Object localObject = f;
    if (localObject == null) {}
    for (localObject = getContext();; localObject = f)
    {
      y.b localb = a;
      y.a locala = new android/support/v7/widget/y$a;
      localObject = ((Context)localObject).getTheme();
      locala.<init>(paramSpinnerAdapter, (Resources.Theme)localObject);
      localb.a(locala);
      break;
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    h localh = e;
    if (localh != null)
    {
      localh = e;
      localh.a();
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    h localh = e;
    if (localh != null)
    {
      localh = e;
      localh.a(paramInt);
    }
  }
  
  public final void setDropDownHorizontalOffset(int paramInt)
  {
    y.b localb = a;
    if (localb != null)
    {
      localb = a;
      g = paramInt;
    }
    for (;;)
    {
      return;
      int j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k) {
        super.setDropDownHorizontalOffset(paramInt);
      }
    }
  }
  
  public final void setDropDownVerticalOffset(int paramInt)
  {
    y.b localb = a;
    if (localb != null)
    {
      localb = a;
      localb.a(paramInt);
    }
    for (;;)
    {
      return;
      int j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k) {
        super.setDropDownVerticalOffset(paramInt);
      }
    }
  }
  
  public final void setDropDownWidth(int paramInt)
  {
    y.b localb = a;
    if (localb != null) {
      b = paramInt;
    }
    for (;;)
    {
      return;
      int j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k) {
        super.setDropDownWidth(paramInt);
      }
    }
  }
  
  public final void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    y.b localb = a;
    if (localb != null)
    {
      localb = a;
      localb.a(paramDrawable);
    }
    for (;;)
    {
      return;
      int j = Build.VERSION.SDK_INT;
      int k = 16;
      if (j >= k) {
        super.setPopupBackgroundDrawable(paramDrawable);
      }
    }
  }
  
  public final void setPopupBackgroundResource(int paramInt)
  {
    Drawable localDrawable = b.b(getPopupContext(), paramInt);
    setPopupBackgroundDrawable(localDrawable);
  }
  
  public final void setPrompt(CharSequence paramCharSequence)
  {
    y.b localb = a;
    if (localb != null)
    {
      localb = a;
      a = paramCharSequence;
    }
    for (;;)
    {
      return;
      super.setPrompt(paramCharSequence);
    }
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    h localh = e;
    if (localh != null)
    {
      localh = e;
      localh.a(paramColorStateList);
    }
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    h localh = e;
    if (localh != null)
    {
      localh = e;
      localh.a(paramMode);
    }
  }
}


/* Location:              android/support/v7/widget/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */