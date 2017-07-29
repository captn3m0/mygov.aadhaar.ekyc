package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.c.a;
import android.support.v4.widget.l;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

final class ba
  extends l
  implements View.OnClickListener
{
  int j = 1;
  private final SearchManager k;
  private final SearchView l;
  private final SearchableInfo m;
  private final Context n;
  private final WeakHashMap o;
  private final int p;
  private boolean q = false;
  private ColorStateList r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  
  public ba(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap paramWeakHashMap)
  {
    super(paramContext, i1);
    s = i;
    t = i;
    u = i;
    v = i;
    w = i;
    x = i;
    SearchManager localSearchManager = (SearchManager)d.getSystemService("search");
    k = localSearchManager;
    l = paramSearchView;
    m = paramSearchableInfo;
    i1 = paramSearchView.getSuggestionCommitIconResId();
    p = i1;
    n = paramContext;
    o = paramWeakHashMap;
  }
  
  private Drawable a(ComponentName paramComponentName)
  {
    localObject1 = null;
    PackageManager localPackageManager = d.getPackageManager();
    int i = 128;
    try
    {
      localObject3 = localPackageManager.getActivityInfo(paramComponentName, i);
      i1 = ((ActivityInfo)localObject3).getIconResource();
      if (i1 != 0) {
        break label58;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        int i1;
        Object localObject3 = "SuggestionsAdapter";
        Object localObject2 = localNameNotFoundException.toString();
        Log.w((String)localObject3, (String)localObject2);
        continue;
        String str1 = paramComponentName.getPackageName();
        localObject3 = applicationInfo;
        localObject2 = ((PackageManager)localObject2).getDrawable(str1, i1, (ApplicationInfo)localObject3);
        if (localObject2 == null)
        {
          localObject2 = "SuggestionsAdapter";
          localObject3 = new java/lang/StringBuilder;
          str1 = "Invalid icon resource ";
          ((StringBuilder)localObject3).<init>(str1);
          localObject3 = ((StringBuilder)localObject3).append(i1).append(" for ");
          String str2 = paramComponentName.flattenToShortString();
          localObject3 = str2;
          Log.w((String)localObject2, (String)localObject3);
        }
        else
        {
          localObject1 = localObject2;
        }
      }
    }
    return (Drawable)localObject1;
  }
  
  /* Error */
  private Drawable a(Uri paramUri)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 151	android/net/Uri:getScheme	()Ljava/lang/String;
    //   4: astore_2
    //   5: ldc -103
    //   7: astore_3
    //   8: aload_3
    //   9: aload_2
    //   10: invokevirtual 159	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: istore 4
    //   15: iload 4
    //   17: ifeq +114 -> 131
    //   20: aload_0
    //   21: aload_1
    //   22: invokespecial 163	android/support/v7/widget/ba:b	(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    //   25: astore_2
    //   26: aload_2
    //   27: areturn
    //   28: astore_2
    //   29: new 165	java/io/FileNotFoundException
    //   32: astore_2
    //   33: new 128	java/lang/StringBuilder
    //   36: astore_3
    //   37: ldc -89
    //   39: astore 5
    //   41: aload_3
    //   42: aload 5
    //   44: invokespecial 133	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: aload_3
    //   48: aload_1
    //   49: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   52: astore_3
    //   53: aload_3
    //   54: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: astore_3
    //   58: aload_2
    //   59: aload_3
    //   60: invokespecial 171	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   63: aload_2
    //   64: athrow
    //   65: astore_2
    //   66: ldc 102
    //   68: astore_3
    //   69: new 128	java/lang/StringBuilder
    //   72: astore 5
    //   74: aload 5
    //   76: ldc -83
    //   78: invokespecial 133	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   81: aload 5
    //   83: aload_1
    //   84: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   87: astore 5
    //   89: ldc -81
    //   91: astore 6
    //   93: aload 5
    //   95: aload 6
    //   97: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: astore 5
    //   102: aload_2
    //   103: invokevirtual 178	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   106: astore_2
    //   107: aload 5
    //   109: aload_2
    //   110: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: astore_2
    //   117: aload_3
    //   118: aload_2
    //   119: invokestatic 113	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: iconst_0
    //   124: istore 4
    //   126: aconst_null
    //   127: astore_2
    //   128: goto -102 -> 26
    //   131: aload_0
    //   132: getfield 82	android/support/v7/widget/ba:n	Landroid/content/Context;
    //   135: astore_2
    //   136: aload_2
    //   137: invokevirtual 182	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   140: astore_2
    //   141: aload_2
    //   142: aload_1
    //   143: invokevirtual 188	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   146: astore_3
    //   147: aload_3
    //   148: ifnonnull +39 -> 187
    //   151: new 165	java/io/FileNotFoundException
    //   154: astore_2
    //   155: new 128	java/lang/StringBuilder
    //   158: astore_3
    //   159: ldc -66
    //   161: astore 5
    //   163: aload_3
    //   164: aload 5
    //   166: invokespecial 133	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: aload_3
    //   170: aload_1
    //   171: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   174: astore_3
    //   175: aload_3
    //   176: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: astore_3
    //   180: aload_2
    //   181: aload_3
    //   182: invokespecial 171	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   185: aload_2
    //   186: athrow
    //   187: iconst_0
    //   188: istore 4
    //   190: aconst_null
    //   191: astore_2
    //   192: aload_3
    //   193: aconst_null
    //   194: invokestatic 196	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   197: astore_2
    //   198: aload_3
    //   199: invokevirtual 202	java/io/InputStream:close	()V
    //   202: goto -176 -> 26
    //   205: astore_3
    //   206: ldc 102
    //   208: astore 5
    //   210: new 128	java/lang/StringBuilder
    //   213: astore 6
    //   215: ldc -52
    //   217: astore 7
    //   219: aload 6
    //   221: aload 7
    //   223: invokespecial 133	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   226: aload 6
    //   228: aload_1
    //   229: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   232: astore 6
    //   234: aload 6
    //   236: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   239: astore 6
    //   241: aload 5
    //   243: aload 6
    //   245: aload_3
    //   246: invokestatic 208	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   249: pop
    //   250: goto -224 -> 26
    //   253: astore_2
    //   254: aload_3
    //   255: invokevirtual 202	java/io/InputStream:close	()V
    //   258: aload_2
    //   259: athrow
    //   260: astore_3
    //   261: ldc 102
    //   263: astore 5
    //   265: new 128	java/lang/StringBuilder
    //   268: astore 6
    //   270: ldc -52
    //   272: astore 7
    //   274: aload 6
    //   276: aload 7
    //   278: invokespecial 133	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   281: aload 6
    //   283: aload_1
    //   284: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   287: astore 6
    //   289: aload 6
    //   291: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: astore 6
    //   296: aload 5
    //   298: aload 6
    //   300: aload_3
    //   301: invokestatic 208	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   304: pop
    //   305: goto -47 -> 258
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	308	0	this	ba
    //   0	308	1	paramUri	Uri
    //   4	23	2	localObject1	Object
    //   28	1	2	localNotFoundException	Resources.NotFoundException
    //   32	32	2	localFileNotFoundException1	FileNotFoundException
    //   65	38	2	localFileNotFoundException2	FileNotFoundException
    //   106	92	2	localObject2	Object
    //   253	6	2	localObject3	Object
    //   7	192	3	localObject4	Object
    //   205	50	3	localIOException1	java.io.IOException
    //   260	41	3	localIOException2	java.io.IOException
    //   13	176	4	bool	boolean
    //   39	258	5	localObject5	Object
    //   91	208	6	localObject6	Object
    //   217	60	7	str	String
    // Exception table:
    //   from	to	target	type
    //   21	25	28	android/content/res/Resources$NotFoundException
    //   0	4	65	java/io/FileNotFoundException
    //   9	13	65	java/io/FileNotFoundException
    //   21	25	65	java/io/FileNotFoundException
    //   29	32	65	java/io/FileNotFoundException
    //   33	36	65	java/io/FileNotFoundException
    //   42	47	65	java/io/FileNotFoundException
    //   48	52	65	java/io/FileNotFoundException
    //   53	57	65	java/io/FileNotFoundException
    //   59	63	65	java/io/FileNotFoundException
    //   63	65	65	java/io/FileNotFoundException
    //   131	135	65	java/io/FileNotFoundException
    //   136	140	65	java/io/FileNotFoundException
    //   142	146	65	java/io/FileNotFoundException
    //   151	154	65	java/io/FileNotFoundException
    //   155	158	65	java/io/FileNotFoundException
    //   164	169	65	java/io/FileNotFoundException
    //   170	174	65	java/io/FileNotFoundException
    //   175	179	65	java/io/FileNotFoundException
    //   181	185	65	java/io/FileNotFoundException
    //   185	187	65	java/io/FileNotFoundException
    //   198	202	65	java/io/FileNotFoundException
    //   210	213	65	java/io/FileNotFoundException
    //   221	226	65	java/io/FileNotFoundException
    //   228	232	65	java/io/FileNotFoundException
    //   234	239	65	java/io/FileNotFoundException
    //   245	250	65	java/io/FileNotFoundException
    //   254	258	65	java/io/FileNotFoundException
    //   258	260	65	java/io/FileNotFoundException
    //   265	268	65	java/io/FileNotFoundException
    //   276	281	65	java/io/FileNotFoundException
    //   283	287	65	java/io/FileNotFoundException
    //   289	294	65	java/io/FileNotFoundException
    //   300	305	65	java/io/FileNotFoundException
    //   198	202	205	java/io/IOException
    //   193	197	253	finally
    //   254	258	260	java/io/IOException
  }
  
  private Drawable a(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0)
      {
        localObject1 = "0";
        bool = ((String)localObject1).equals(paramString);
        if (!bool) {
          break label32;
        }
      }
    }
    boolean bool = false;
    Object localObject1 = null;
    for (;;)
    {
      return (Drawable)localObject1;
      try
      {
        label32:
        int i1 = Integer.parseInt(paramString);
        localObject1 = new java/lang/StringBuilder;
        localObject4 = "android.resource://";
        ((StringBuilder)localObject1).<init>((String)localObject4);
        localObject4 = n;
        localObject4 = ((Context)localObject4).getPackageName();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject4 = "/";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject1 = ((StringBuilder)localObject1).append(i1);
        localObject4 = ((StringBuilder)localObject1).toString();
        localObject1 = b((String)localObject4);
        if (localObject1 == null)
        {
          localObject1 = n;
          localObject1 = a.a((Context)localObject1, i1);
          a((String)localObject4, (Drawable)localObject1);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Object localObject2 = b(paramString);
        if (localObject2 == null)
        {
          localObject2 = Uri.parse(paramString);
          localObject2 = a((Uri)localObject2);
          a(paramString, (Drawable)localObject2);
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Object localObject5 = new java/lang/StringBuilder;
        Object localObject4 = "Icon resource not found: ";
        ((StringBuilder)localObject5).<init>((String)localObject4);
        localObject5 = paramString;
        Log.w("SuggestionsAdapter", (String)localObject5);
        bool = false;
        Object localObject3 = null;
      }
    }
  }
  
  private static String a(Cursor paramCursor, int paramInt)
  {
    String str1 = null;
    int i = -1;
    if (paramInt == i) {}
    for (;;)
    {
      return str1;
      try
      {
        str1 = paramCursor.getString(paramInt);
      }
      catch (Exception localException)
      {
        String str2 = "SuggestionsAdapter";
        String str3 = "unexpected error retrieving valid column from cursor, did the remote process die?";
        Log.e(str2, str3, localException);
      }
    }
  }
  
  private static String a(Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex(paramString);
    return a(paramCursor, i);
  }
  
  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null) {
      paramImageView.setVisibility(paramInt);
    }
    for (;;)
    {
      return;
      paramImageView.setVisibility(0);
      paramDrawable.setVisible(false, false);
      boolean bool = true;
      paramDrawable.setVisible(bool, false);
    }
  }
  
  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    int i;
    if (bool)
    {
      i = 8;
      paramTextView.setVisibility(i);
    }
    for (;;)
    {
      return;
      i = 0;
      paramTextView.setVisibility(0);
    }
  }
  
  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      WeakHashMap localWeakHashMap = o;
      Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
      localWeakHashMap.put(paramString, localConstantState);
    }
  }
  
  private Drawable b(Uri paramUri)
  {
    int i = 1;
    String str = paramUri.getAuthority();
    boolean bool = TextUtils.isEmpty(str);
    Object localObject1;
    Object localObject4;
    if (bool)
    {
      localObject1 = new java/io/FileNotFoundException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("No authority: ");
      localObject4 = paramUri;
      ((FileNotFoundException)localObject1).<init>((String)localObject4);
      throw ((Throwable)localObject1);
    }
    Resources localResources;
    Object localObject2;
    try
    {
      localObject1 = d;
      localObject1 = ((Context)localObject1).getPackageManager();
      localResources = ((PackageManager)localObject1).getResourcesForApplication(str);
      localObject4 = paramUri.getPathSegments();
      if (localObject4 == null)
      {
        localObject1 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("No path: ");
        localObject4 = paramUri;
        ((FileNotFoundException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localObject2 = new java/io/FileNotFoundException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("No package found for authority: ");
      localObject4 = paramUri;
      ((FileNotFoundException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
    }
    int i1 = ((List)localObject4).size();
    if (i1 == i)
    {
      i1 = 0;
      localObject2 = null;
    }
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject2 = ((List)localObject4).get(0);
        localObject2 = (String)localObject2;
        i1 = Integer.parseInt((String)localObject2);
        if (i1 != 0) {
          break;
        }
        localObject2 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("No resource found for: ");
        localObject4 = paramUri;
        ((FileNotFoundException)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject3 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("Single path segment is not a resource ID: ");
        localObject4 = paramUri;
        ((FileNotFoundException)localObject3).<init>((String)localObject4);
        throw ((Throwable)localObject3);
      }
      int i2 = 2;
      if (i1 == i2)
      {
        localObject3 = (String)((List)localObject4).get(i);
        localObject4 = (String)((List)localObject4).get(0);
        i1 = localResources.getIdentifier((String)localObject3, (String)localObject4, str);
      }
      else
      {
        localObject3 = new java/io/FileNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("More than two path segments: ");
        localObject4 = paramUri;
        ((FileNotFoundException)localObject3).<init>((String)localObject4);
        throw ((Throwable)localObject3);
      }
    }
    return localResources.getDrawable(i1);
  }
  
  private Drawable b(String paramString)
  {
    Object localObject = (Drawable.ConstantState)o.get(paramString);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((Drawable.ConstantState)localObject).newDrawable()) {
      return (Drawable)localObject;
    }
  }
  
  private static void c(Cursor paramCursor)
  {
    if (paramCursor != null) {}
    for (Bundle localBundle = paramCursor.getExtras();; localBundle = null)
    {
      if (localBundle != null)
      {
        String str = "in_progress";
        bool = localBundle.getBoolean(str);
        if (!bool) {}
      }
      return;
      boolean bool = false;
    }
  }
  
  public final Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {}
    Object localObject2;
    int i;
    for (String str = "";; str = paramCharSequence.toString())
    {
      localObject2 = l;
      i = ((SearchView)localObject2).getVisibility();
      if (i == 0)
      {
        localObject2 = l;
        i = ((SearchView)localObject2).getWindowVisibility();
        if (i == 0) {
          break;
        }
      }
      str = null;
      return str;
    }
    Object localObject1;
    for (;;)
    {
      try
      {
        localObject2 = m;
        if (localObject2 != null) {
          break label101;
        }
        str = null;
        if (str != null) {
          str.getCount();
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        localObject2 = "SuggestionsAdapter";
        localObject3 = "Search suggestions query threw an exception.";
        Log.w((String)localObject2, (String)localObject3, localRuntimeException);
        localObject1 = null;
      }
      break;
      label101:
      localObject3 = ((SearchableInfo)localObject2).getSuggestAuthority();
      if (localObject3 != null) {
        break label117;
      }
      localObject1 = null;
    }
    label117:
    Object localObject4 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject4).<init>();
    Object localObject5 = "content";
    localObject4 = ((Uri.Builder)localObject4).scheme((String)localObject5);
    Object localObject3 = ((Uri.Builder)localObject4).authority((String)localObject3);
    localObject4 = "";
    localObject3 = ((Uri.Builder)localObject3).query((String)localObject4);
    localObject4 = "";
    localObject3 = ((Uri.Builder)localObject3).fragment((String)localObject4);
    localObject4 = ((SearchableInfo)localObject2).getSuggestPath();
    if (localObject4 != null) {
      ((Uri.Builder)localObject3).appendEncodedPath((String)localObject4);
    }
    localObject4 = "search_suggest_query";
    ((Uri.Builder)localObject3).appendPath((String)localObject4);
    localObject4 = ((SearchableInfo)localObject2).getSuggestSelection();
    if (localObject4 != null)
    {
      i = 1;
      localObject5 = new String[i];
      i = 0;
      localObject2 = null;
      localObject5[0] = localObject1;
    }
    for (;;)
    {
      localObject1 = "limit";
      localObject2 = "50";
      ((Uri.Builder)localObject3).appendQueryParameter((String)localObject1, (String)localObject2);
      localObject2 = ((Uri.Builder)localObject3).build();
      localObject1 = d;
      localObject1 = ((Context)localObject1).getContentResolver();
      localObject3 = null;
      localObject1 = ((ContentResolver)localObject1).query((Uri)localObject2, null, (String)localObject4, (String[])localObject5, null);
      break;
      ((Uri.Builder)localObject3).appendPath((String)localObject1);
      localObject5 = null;
    }
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.a(paramContext, paramCursor, paramViewGroup);
    Object localObject = new android/support/v7/widget/ba$a;
    ((ba.a)localObject).<init>(localView);
    localView.setTag(localObject);
    int i = a.f.edit_query;
    localObject = (ImageView)localView.findViewById(i);
    int i1 = p;
    ((ImageView)localObject).setImageResource(i1);
    return localView;
  }
  
  public final void a(Cursor paramCursor)
  {
    boolean bool = q;
    String str1;
    String str2;
    if (bool)
    {
      str1 = "SuggestionsAdapter";
      str2 = "Tried to change cursor after adapter was closed.";
      Log.w(str1, str2);
      if (paramCursor != null) {
        paramCursor.close();
      }
    }
    for (;;)
    {
      return;
      try
      {
        super.a(paramCursor);
        if (paramCursor != null)
        {
          str1 = "suggest_text_1";
          int i = paramCursor.getColumnIndex(str1);
          s = i;
          str1 = "suggest_text_2";
          i = paramCursor.getColumnIndex(str1);
          t = i;
          str1 = "suggest_text_2_url";
          i = paramCursor.getColumnIndex(str1);
          u = i;
          str1 = "suggest_icon_1";
          i = paramCursor.getColumnIndex(str1);
          v = i;
          str1 = "suggest_icon_2";
          i = paramCursor.getColumnIndex(str1);
          w = i;
          str1 = "suggest_flags";
          i = paramCursor.getColumnIndex(str1);
          x = i;
        }
      }
      catch (Exception localException)
      {
        str2 = "SuggestionsAdapter";
        String str3 = "error changing cursor and caching columns";
        Log.e(str2, str3, localException);
      }
    }
  }
  
  public final void a(View paramView, Cursor paramCursor)
  {
    int i = 2;
    int i1 = -1;
    int i2 = 1;
    int i3 = 0;
    Object localObject1 = null;
    Object localObject2 = paramView.getTag();
    Object localObject3 = localObject2;
    localObject3 = (ba.a)localObject2;
    int i4 = x;
    if (i4 != i1)
    {
      i4 = x;
      i4 = paramCursor.getInt(i4);
    }
    label328:
    label380:
    label424:
    label537:
    label576:
    label666:
    label747:
    label759:
    label786:
    int i7;
    for (int i6 = i4;; i7 = 0)
    {
      localObject2 = a;
      Object localObject4;
      if (localObject2 != null)
      {
        i4 = s;
        localObject2 = a(paramCursor, i4);
        localObject4 = a;
        a((TextView)localObject4, (CharSequence)localObject2);
      }
      localObject2 = b;
      Object localObject5;
      Object localObject6;
      String str2;
      int i5;
      if (localObject2 != null)
      {
        i4 = u;
        String str1 = a(paramCursor, i4);
        if (str1 != null)
        {
          localObject2 = r;
          if (localObject2 == null)
          {
            localObject2 = new android/util/TypedValue;
            ((TypedValue)localObject2).<init>();
            localObject4 = d.getTheme();
            i8 = a.a.textColorSearchUrl;
            ((Resources.Theme)localObject4).resolveAttribute(i8, (TypedValue)localObject2, i2);
            localObject4 = d.getResources();
            i4 = resourceId;
            localObject2 = ((Resources)localObject4).getColorStateList(i4);
            r = ((ColorStateList)localObject2);
          }
          localObject5 = new android/text/SpannableString;
          ((SpannableString)localObject5).<init>(str1);
          localObject2 = new android/text/style/TextAppearanceSpan;
          localObject6 = r;
          localObject4 = null;
          str2 = null;
          ((TextAppearanceSpan)localObject2).<init>(null, 0, 0, (ColorStateList)localObject6, null);
          int i9 = str1.length();
          int i8 = 33;
          ((SpannableString)localObject5).setSpan(localObject2, 0, i9, i8);
          localObject2 = localObject5;
          boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
          if (!bool1) {
            break label537;
          }
          localObject4 = a;
          if (localObject4 != null)
          {
            a.setSingleLine(false);
            localObject4 = a;
            ((TextView)localObject4).setMaxLines(i);
          }
          localObject4 = b;
          a((TextView)localObject4, (CharSequence)localObject2);
        }
      }
      else
      {
        localObject2 = c;
        int i10;
        if (localObject2 != null)
        {
          localObject6 = c;
          i4 = v;
          if (i4 != i1) {
            break label576;
          }
          i4 = 0;
          localObject2 = null;
          i10 = 4;
          a((ImageView)localObject6, (Drawable)localObject2, i10);
        }
        localObject2 = d;
        if (localObject2 != null)
        {
          localObject2 = d;
          i10 = w;
          if (i10 != i1) {
            break label759;
          }
          i10 = 8;
          a((ImageView)localObject2, (Drawable)localObject1, i10);
        }
        i4 = j;
        if (i4 != i)
        {
          i4 = j;
          if (i4 != i2) {
            break label786;
          }
          i5 = i6 & 0x1;
          if (i5 == 0) {
            break label786;
          }
        }
        e.setVisibility(0);
        localObject2 = e;
        localObject1 = a.getText();
        ((ImageView)localObject2).setTag(localObject1);
        localObject2 = e;
        ((ImageView)localObject2).setOnClickListener(this);
      }
      for (;;)
      {
        return;
        i5 = t;
        localObject2 = a(paramCursor, i5);
        break;
        localObject4 = a;
        if (localObject4 == null) {
          break label328;
        }
        a.setSingleLine(i2);
        localObject4 = a;
        ((TextView)localObject4).setMaxLines(i2);
        break label328;
        i5 = v;
        localObject2 = paramCursor.getString(i5);
        localObject2 = a((String)localObject2);
        if (localObject2 != null) {
          break label380;
        }
        localObject2 = m.getSearchActivity();
        str2 = ((ComponentName)localObject2).flattenToShortString();
        localObject4 = o;
        boolean bool2 = ((WeakHashMap)localObject4).containsKey(str2);
        if (bool2)
        {
          localObject2 = (Drawable.ConstantState)o.get(str2);
          if (localObject2 == null) {
            i5 = 0;
          }
          for (localObject2 = null;; localObject2 = ((Drawable.ConstantState)localObject2).newDrawable((Resources)localObject4))
          {
            if (localObject2 != null) {
              break label747;
            }
            localObject2 = d.getPackageManager().getDefaultActivityIcon();
            break;
            localObject4 = n.getResources();
          }
        }
        localObject4 = a((ComponentName)localObject2);
        if (localObject4 == null) {
          i5 = 0;
        }
        for (localObject2 = null;; localObject2 = ((Drawable)localObject4).getConstantState())
        {
          localObject5 = o;
          ((WeakHashMap)localObject5).put(str2, localObject2);
          localObject2 = localObject4;
          break label666;
          break;
        }
        i3 = w;
        localObject1 = paramCursor.getString(i3);
        localObject1 = a((String)localObject1);
        break label424;
        localObject2 = e;
        i3 = 8;
        ((ImageView)localObject2).setVisibility(i3);
      }
    }
  }
  
  public final CharSequence b(Cursor paramCursor)
  {
    Object localObject1 = null;
    if (paramCursor == null) {}
    for (;;)
    {
      return (CharSequence)localObject1;
      Object localObject2 = a(paramCursor, "suggest_intent_query");
      if (localObject2 != null)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = m;
        boolean bool = ((SearchableInfo)localObject2).shouldRewriteQueryFromData();
        if (bool)
        {
          localObject2 = a(paramCursor, "suggest_intent_data");
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            continue;
          }
        }
        localObject2 = m;
        bool = ((SearchableInfo)localObject2).shouldRewriteQueryFromText();
        if (bool)
        {
          localObject2 = a(paramCursor, "suggest_text_1");
          if (localObject2 != null) {
            localObject1 = localObject2;
          }
        }
      }
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      localObject1 = super.getView(paramInt, paramView, paramViewGroup);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", localRuntimeException);
        Object localObject1 = d;
        Object localObject2 = c;
        localObject2 = a((Context)localObject1, (Cursor)localObject2, paramViewGroup);
        if (localObject2 != null)
        {
          localObject1 = getTaga;
          String str = localRuntimeException.toString();
          ((TextView)localObject1).setText(str);
        }
        localObject1 = localObject2;
      }
    }
    return (View)localObject1;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
  
  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    c(a());
  }
  
  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    c(a());
  }
  
  public final void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    boolean bool = localObject instanceof CharSequence;
    if (bool)
    {
      SearchView localSearchView = l;
      localObject = (CharSequence)localObject;
      localSearchView.setQuery((CharSequence)localObject);
    }
  }
}


/* Location:              android/support/v7/widget/ba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */