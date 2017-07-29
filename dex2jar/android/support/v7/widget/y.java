package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.u;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.b.a.b;
import android.support.v7.view.menu.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public final class y
  extends Spinner
  implements u
{
  private static final int[] d = { 16843505 };
  b a;
  int b;
  final Rect c;
  private h e;
  private Context f;
  private aj g;
  private SpinnerAdapter h;
  private boolean i;
  
  public y(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.spinnerStyle);
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
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 61	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 63	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 65	android/graphics/Rect:<init>	()V
    //   15: putfield 67	android/support/v7/widget/y:c	Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic 72	android/support/v7/a/a$j:Spinner	[I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic 77	android/support/v7/widget/bf:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bf;
    //   28: astore 10
    //   30: aload_0
    //   31: new 79	android/support/v7/widget/h
    //   34: dup
    //   35: aload_0
    //   36: invokespecial 82	android/support/v7/widget/h:<init>	(Landroid/view/View;)V
    //   39: putfield 84	android/support/v7/widget/y:e	Landroid/support/v7/widget/h;
    //   42: aload 10
    //   44: getstatic 87	android/support/v7/a/a$j:Spinner_popupTheme	I
    //   47: iconst_0
    //   48: invokevirtual 90	android/support/v7/widget/bf:g	(II)I
    //   51: istore 5
    //   53: iload 5
    //   55: ifeq +299 -> 354
    //   58: new 92	android/support/v7/view/d
    //   61: dup
    //   62: aload_1
    //   63: iload 5
    //   65: invokespecial 95	android/support/v7/view/d:<init>	(Landroid/content/Context;I)V
    //   68: astore 7
    //   70: aload_0
    //   71: aload 7
    //   73: putfield 97	android/support/v7/widget/y:f	Landroid/content/Context;
    //   76: aload_0
    //   77: getfield 97	android/support/v7/widget/y:f	Landroid/content/Context;
    //   80: ifnull +184 -> 264
    //   83: getstatic 102	android/os/Build$VERSION:SDK_INT	I
    //   86: bipush 11
    //   88: if_icmplt +342 -> 430
    //   91: aload_1
    //   92: aload_2
    //   93: getstatic 41	android/support/v7/widget/y:d	[I
    //   96: iload_3
    //   97: iconst_0
    //   98: invokevirtual 108	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   101: astore 8
    //   103: iload 4
    //   105: istore 5
    //   107: aload 8
    //   109: astore 7
    //   111: aload 8
    //   113: iconst_0
    //   114: invokevirtual 114	android/content/res/TypedArray:hasValue	(I)Z
    //   117: ifeq +16 -> 133
    //   120: aload 8
    //   122: astore 7
    //   124: aload 8
    //   126: iconst_0
    //   127: iconst_0
    //   128: invokevirtual 117	android/content/res/TypedArray:getInt	(II)I
    //   131: istore 5
    //   133: iload 5
    //   135: istore 6
    //   137: aload 8
    //   139: ifnull +12 -> 151
    //   142: aload 8
    //   144: invokevirtual 120	android/content/res/TypedArray:recycle	()V
    //   147: iload 5
    //   149: istore 6
    //   151: iload 6
    //   153: iconst_1
    //   154: if_icmpne +110 -> 264
    //   157: new 13	android/support/v7/widget/y$b
    //   160: dup
    //   161: aload_0
    //   162: aload_0
    //   163: getfield 97	android/support/v7/widget/y:f	Landroid/content/Context;
    //   166: aload_2
    //   167: iload_3
    //   168: invokespecial 123	android/support/v7/widget/y$b:<init>	(Landroid/support/v7/widget/y;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   171: astore 7
    //   173: aload_0
    //   174: getfield 97	android/support/v7/widget/y:f	Landroid/content/Context;
    //   177: aload_2
    //   178: getstatic 72	android/support/v7/a/a$j:Spinner	[I
    //   181: iload_3
    //   182: iconst_0
    //   183: invokestatic 77	android/support/v7/widget/bf:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bf;
    //   186: astore 8
    //   188: aload_0
    //   189: aload 8
    //   191: getstatic 126	android/support/v7/a/a$j:Spinner_android_dropDownWidth	I
    //   194: bipush -2
    //   196: invokevirtual 128	android/support/v7/widget/bf:f	(II)I
    //   199: putfield 130	android/support/v7/widget/y:b	I
    //   202: aload 7
    //   204: aload 8
    //   206: getstatic 133	android/support/v7/a/a$j:Spinner_android_popupBackground	I
    //   209: invokevirtual 136	android/support/v7/widget/bf:a	(I)Landroid/graphics/drawable/Drawable;
    //   212: invokevirtual 139	android/support/v7/widget/y$b:a	(Landroid/graphics/drawable/Drawable;)V
    //   215: getstatic 142	android/support/v7/a/a$j:Spinner_android_prompt	I
    //   218: istore 4
    //   220: aload 7
    //   222: aload 10
    //   224: getfield 145	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   227: iload 4
    //   229: invokevirtual 149	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   232: putfield 152	android/support/v7/widget/y$b:a	Ljava/lang/CharSequence;
    //   235: aload 8
    //   237: getfield 145	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   240: invokevirtual 120	android/content/res/TypedArray:recycle	()V
    //   243: aload_0
    //   244: aload 7
    //   246: putfield 154	android/support/v7/widget/y:a	Landroid/support/v7/widget/y$b;
    //   249: aload_0
    //   250: new 8	android/support/v7/widget/y$1
    //   253: dup
    //   254: aload_0
    //   255: aload_0
    //   256: aload 7
    //   258: invokespecial 157	android/support/v7/widget/y$1:<init>	(Landroid/support/v7/widget/y;Landroid/view/View;Landroid/support/v7/widget/y$b;)V
    //   261: putfield 159	android/support/v7/widget/y:g	Landroid/support/v7/widget/aj;
    //   264: getstatic 162	android/support/v7/a/a$j:Spinner_android_entries	I
    //   267: istore 4
    //   269: aload 10
    //   271: getfield 145	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   274: iload 4
    //   276: invokevirtual 166	android/content/res/TypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   279: astore 7
    //   281: aload 7
    //   283: ifnull +28 -> 311
    //   286: new 168	android/widget/ArrayAdapter
    //   289: dup
    //   290: aload_1
    //   291: ldc -87
    //   293: aload 7
    //   295: invokespecial 172	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   298: astore_1
    //   299: aload_1
    //   300: getstatic 177	android/support/v7/a/a$g:support_simple_spinner_dropdown_item	I
    //   303: invokevirtual 181	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   306: aload_0
    //   307: aload_1
    //   308: invokevirtual 185	android/support/v7/widget/y:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   311: aload 10
    //   313: getfield 145	android/support/v7/widget/bf:a	Landroid/content/res/TypedArray;
    //   316: invokevirtual 120	android/content/res/TypedArray:recycle	()V
    //   319: aload_0
    //   320: iconst_1
    //   321: putfield 187	android/support/v7/widget/y:i	Z
    //   324: aload_0
    //   325: getfield 189	android/support/v7/widget/y:h	Landroid/widget/SpinnerAdapter;
    //   328: ifnull +16 -> 344
    //   331: aload_0
    //   332: aload_0
    //   333: getfield 189	android/support/v7/widget/y:h	Landroid/widget/SpinnerAdapter;
    //   336: invokevirtual 185	android/support/v7/widget/y:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   339: aload_0
    //   340: aconst_null
    //   341: putfield 189	android/support/v7/widget/y:h	Landroid/widget/SpinnerAdapter;
    //   344: aload_0
    //   345: getfield 84	android/support/v7/widget/y:e	Landroid/support/v7/widget/h;
    //   348: aload_2
    //   349: iload_3
    //   350: invokevirtual 192	android/support/v7/widget/h:a	(Landroid/util/AttributeSet;I)V
    //   353: return
    //   354: getstatic 102	android/os/Build$VERSION:SDK_INT	I
    //   357: bipush 23
    //   359: if_icmpge +9 -> 368
    //   362: aload_1
    //   363: astore 7
    //   365: goto -295 -> 70
    //   368: aconst_null
    //   369: astore 7
    //   371: goto -301 -> 70
    //   374: astore 9
    //   376: aconst_null
    //   377: astore 8
    //   379: aload 8
    //   381: astore 7
    //   383: ldc -62
    //   385: ldc -60
    //   387: aload 9
    //   389: invokestatic 201	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   392: pop
    //   393: iload 4
    //   395: istore 6
    //   397: aload 8
    //   399: ifnull -248 -> 151
    //   402: aload 8
    //   404: invokevirtual 120	android/content/res/TypedArray:recycle	()V
    //   407: iload 4
    //   409: istore 6
    //   411: goto -260 -> 151
    //   414: astore_1
    //   415: aconst_null
    //   416: astore 7
    //   418: aload 7
    //   420: ifnull +8 -> 428
    //   423: aload 7
    //   425: invokevirtual 120	android/content/res/TypedArray:recycle	()V
    //   428: aload_1
    //   429: athrow
    //   430: iconst_1
    //   431: istore 6
    //   433: goto -282 -> 151
    //   436: astore_1
    //   437: goto -19 -> 418
    //   440: astore 9
    //   442: goto -63 -> 379
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	445	0	this	y
    //   0	445	1	paramContext	Context
    //   0	445	2	paramAttributeSet	AttributeSet
    //   0	445	3	paramInt1	int
    //   0	445	4	paramInt2	int
    //   51	97	5	j	int
    //   135	297	6	k	int
    //   68	356	7	localObject1	Object
    //   101	302	8	localObject2	Object
    //   374	14	9	localException1	Exception
    //   440	1	9	localException2	Exception
    //   28	284	10	localbf	bf
    // Exception table:
    //   from	to	target	type
    //   91	103	374	java/lang/Exception
    //   91	103	414	finally
    //   111	120	436	finally
    //   124	133	436	finally
    //   383	393	436	finally
    //   111	120	440	java/lang/Exception
    //   124	133	440	java/lang/Exception
  }
  
  final int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int j = Math.max(0, getSelectedItemPosition());
    int i3 = Math.min(paramSpinnerAdapter.getCount(), j + 15);
    int k = Math.max(0, j - (15 - (i3 - j)));
    View localView = null;
    int m = 0;
    j = 0;
    if (k < i3)
    {
      int n = paramSpinnerAdapter.getItemViewType(k);
      if (n == j) {
        break label204;
      }
      localView = null;
      j = n;
    }
    label204:
    for (;;)
    {
      localView = paramSpinnerAdapter.getView(k, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(i1, i2);
      m = Math.max(m, localView.getMeasuredWidth());
      k += 1;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(c);
        return c.left + c.right + m;
      }
      return m;
    }
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (e != null) {
      e.d();
    }
  }
  
  public final int getDropDownHorizontalOffset()
  {
    if (a != null) {
      return a.g;
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return super.getDropDownHorizontalOffset();
    }
    return 0;
  }
  
  public final int getDropDownVerticalOffset()
  {
    if (a != null) {
      return a.c();
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return super.getDropDownVerticalOffset();
    }
    return 0;
  }
  
  public final int getDropDownWidth()
  {
    if (a != null) {
      return b;
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return super.getDropDownWidth();
    }
    return 0;
  }
  
  public final Drawable getPopupBackground()
  {
    if (a != null) {
      return a.q.getBackground();
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return super.getPopupBackground();
    }
    return null;
  }
  
  public final Context getPopupContext()
  {
    if (a != null) {
      return f;
    }
    if (Build.VERSION.SDK_INT >= 23) {
      return super.getPopupContext();
    }
    return null;
  }
  
  public final CharSequence getPrompt()
  {
    if (a != null) {
      return a.a;
    }
    return super.getPrompt();
  }
  
  public final ColorStateList getSupportBackgroundTintList()
  {
    if (e != null) {
      return e.b();
    }
    return null;
  }
  
  public final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (e != null) {
      return e.c();
    }
    return null;
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((a != null) && (a.q.isShowing())) {
      a.e();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((a != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((g != null) && (g.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final boolean performClick()
  {
    if (a != null)
    {
      if (!a.q.isShowing()) {
        a.d();
      }
      return true;
    }
    return super.performClick();
  }
  
  public final void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!i) {
      h = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    } while (a == null);
    if (f == null) {}
    for (Context localContext = getContext();; localContext = f)
    {
      a.a(new a(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (e != null) {
      e.a();
    }
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (e != null) {
      e.a(paramInt);
    }
  }
  
  public final void setDropDownHorizontalOffset(int paramInt)
  {
    if (a != null) {
      a.g = paramInt;
    }
    while (Build.VERSION.SDK_INT < 16) {
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public final void setDropDownVerticalOffset(int paramInt)
  {
    if (a != null) {
      a.a(paramInt);
    }
    while (Build.VERSION.SDK_INT < 16) {
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public final void setDropDownWidth(int paramInt)
  {
    if (a != null) {
      b = paramInt;
    }
    while (Build.VERSION.SDK_INT < 16) {
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public final void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (a != null) {
      a.a(paramDrawable);
    }
    while (Build.VERSION.SDK_INT < 16) {
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public final void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(b.b(getPopupContext(), paramInt));
  }
  
  public final void setPrompt(CharSequence paramCharSequence)
  {
    if (a != null)
    {
      a.a = paramCharSequence;
      return;
    }
    super.setPrompt(paramCharSequence);
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (e != null) {
      e.a(paramColorStateList);
    }
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (e != null) {
      e.a(paramMode);
    }
  }
  
  private static final class a
    implements ListAdapter, SpinnerAdapter
  {
    private SpinnerAdapter a;
    private ListAdapter b;
    
    public a(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
    {
      a = paramSpinnerAdapter;
      if ((paramSpinnerAdapter instanceof ListAdapter)) {
        b = ((ListAdapter)paramSpinnerAdapter);
      }
      if ((paramTheme != null) && (Build.VERSION.SDK_INT >= 23) && ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter)))
      {
        paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
        if (paramSpinnerAdapter.getDropDownViewTheme() != paramTheme) {
          paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
        }
      }
    }
    
    public final boolean areAllItemsEnabled()
    {
      ListAdapter localListAdapter = b;
      if (localListAdapter != null) {
        return localListAdapter.areAllItemsEnabled();
      }
      return true;
    }
    
    public final int getCount()
    {
      if (a == null) {
        return 0;
      }
      return a.getCount();
    }
    
    public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (a == null) {
        return null;
      }
      return a.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public final Object getItem(int paramInt)
    {
      if (a == null) {
        return null;
      }
      return a.getItem(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      if (a == null) {
        return -1L;
      }
      return a.getItemId(paramInt);
    }
    
    public final int getItemViewType(int paramInt)
    {
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public final int getViewTypeCount()
    {
      return 1;
    }
    
    public final boolean hasStableIds()
    {
      return (a != null) && (a.hasStableIds());
    }
    
    public final boolean isEmpty()
    {
      return getCount() == 0;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      ListAdapter localListAdapter = b;
      if (localListAdapter != null) {
        return localListAdapter.isEnabled(paramInt);
      }
      return true;
    }
    
    public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (a != null) {
        a.registerDataSetObserver(paramDataSetObserver);
      }
    }
    
    public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (a != null) {
        a.unregisterDataSetObserver(paramDataSetObserver);
      }
    }
  }
  
  private final class b
    extends an
  {
    CharSequence a;
    ListAdapter b;
    final Rect c = new Rect();
    
    public b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
      k = y.this;
      b();
      j = 0;
      l = new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          setSelection(paramAnonymousInt);
          if (getOnItemClickListener() != null) {
            performItemClick(paramAnonymousView, paramAnonymousInt, b.getItemId(paramAnonymousInt));
          }
          e();
        }
      };
    }
    
    final void a()
    {
      Object localObject = q.getBackground();
      int i;
      int m;
      int n;
      int i1;
      int j;
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(c);
        if (bk.a(y.this))
        {
          i = c.right;
          m = getPaddingLeft();
          n = getPaddingRight();
          i1 = getWidth();
          if (b != -2) {
            break label246;
          }
          j = a((SpinnerAdapter)b, q.getBackground());
          int k = getContext().getResources().getDisplayMetrics().widthPixels - c.left - c.right;
          if (j <= k) {
            break label294;
          }
          j = k;
        }
      }
      label171:
      label246:
      label294:
      for (;;)
      {
        b(Math.max(j, i1 - m - n));
        if (bk.a(y.this)) {
          i = i1 - n - f + i;
        }
        for (;;)
        {
          g = i;
          return;
          i = -c.left;
          break;
          localObject = c;
          c.right = 0;
          left = 0;
          i = 0;
          break;
          if (b == -1)
          {
            b(i1 - m - n);
            break label171;
          }
          b(b);
          break label171;
          i += m;
        }
      }
    }
    
    public final void a(ListAdapter paramListAdapter)
    {
      super.a(paramListAdapter);
      b = paramListAdapter;
    }
    
    public final void d()
    {
      boolean bool = q.isShowing();
      a();
      h();
      super.d();
      e.setChoiceMode(1);
      int i = getSelectedItemPosition();
      Object localObject = e;
      if ((q.isShowing()) && (localObject != null))
      {
        ((ah)localObject).setListSelectionHidden(false);
        ((ah)localObject).setSelection(i);
        if ((Build.VERSION.SDK_INT >= 11) && (((ah)localObject).getChoiceMode() != 0)) {
          ((ah)localObject).setItemChecked(i, true);
        }
      }
      if (bool) {}
      do
      {
        return;
        localObject = getViewTreeObserver();
      } while (localObject == null);
      final ViewTreeObserver.OnGlobalLayoutListener local2 = new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          y.b localb = y.b.this;
          y localy = y.this;
          if ((w.H(localy)) && (localy.getGlobalVisibleRect(c))) {}
          for (int i = 1; i == 0; i = 0)
          {
            e();
            return;
          }
          a();
          y.b.a(y.b.this);
        }
      };
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(local2);
      a(new PopupWindow.OnDismissListener()
      {
        public final void onDismiss()
        {
          ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
          if (localViewTreeObserver != null) {
            localViewTreeObserver.removeGlobalOnLayoutListener(local2);
          }
        }
      });
    }
  }
}


/* Location:              android/support/v7/widget/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */