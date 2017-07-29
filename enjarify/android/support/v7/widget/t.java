package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.d.a.c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class t
{
  private static final int[] b;
  Bitmap a;
  private final ProgressBar c;
  
  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 16843067;
    arrayOfInt[1] = 16843068;
    b = arrayOfInt;
  }
  
  t(ProgressBar paramProgressBar)
  {
    c = paramProgressBar;
  }
  
  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    Object localObject1 = null;
    int i = 1;
    int j = 0;
    Object localObject2 = null;
    boolean bool1 = paramDrawable instanceof c;
    Object localObject3;
    if (bool1)
    {
      localObject3 = paramDrawable;
      localObject3 = ((c)paramDrawable).a();
      if (localObject3 != null)
      {
        localObject2 = a((Drawable)localObject3, paramBoolean);
        localObject3 = paramDrawable;
        localObject3 = (c)paramDrawable;
        ((c)localObject3).a((Drawable)localObject2);
      }
    }
    for (;;)
    {
      return (Drawable)paramDrawable;
      bool1 = paramDrawable instanceof LayerDrawable;
      int i1;
      Object localObject4;
      if (bool1)
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int n = paramDrawable.getNumberOfLayers();
        localObject1 = new Drawable[n];
        i1 = 0;
        localObject4 = null;
        if (i1 < n)
        {
          int k = paramDrawable.getId(i1);
          Drawable localDrawable = paramDrawable.getDrawable(i1);
          int i2 = 16908301;
          if (k != i2)
          {
            int i3 = 16908303;
            if (k != i3) {}
          }
          else
          {
            k = i;
          }
          for (;;)
          {
            localObject3 = a(localDrawable, k);
            localObject1[i1] = localObject3;
            int m = i1 + 1;
            i1 = m;
            break;
            m = 0;
            localObject3 = null;
          }
        }
        localObject3 = new android/graphics/drawable/LayerDrawable;
        ((LayerDrawable)localObject3).<init>((Drawable[])localObject1);
        while (j < n)
        {
          i = paramDrawable.getId(j);
          ((LayerDrawable)localObject3).setId(j, i);
          j += 1;
        }
        paramDrawable = (Drawable)localObject3;
      }
      else
      {
        boolean bool2 = paramDrawable instanceof BitmapDrawable;
        if (bool2)
        {
          paramDrawable = (BitmapDrawable)paramDrawable;
          localObject2 = paramDrawable.getBitmap();
          localObject3 = a;
          if (localObject3 == null) {
            a = ((Bitmap)localObject2);
          }
          localObject3 = new android/graphics/drawable/ShapeDrawable;
          i1 = 8;
          localObject4 = new float[i1];
          Object tmp300_298 = localObject4;
          Object tmp301_300 = tmp300_298;
          Object tmp301_300 = tmp300_298;
          tmp301_300[0] = 5.0F;
          tmp301_300[1] = 5.0F;
          Object tmp310_301 = tmp301_300;
          Object tmp310_301 = tmp301_300;
          tmp310_301[2] = 5.0F;
          tmp310_301[3] = 5.0F;
          Object tmp319_310 = tmp310_301;
          Object tmp319_310 = tmp310_301;
          tmp319_310[4] = 5.0F;
          tmp319_310[5] = 5.0F;
          tmp319_310[6] = 5.0F;
          tmp319_310[7] = 5.0F;
          Object localObject5 = new android/graphics/drawable/shapes/RoundRectShape;
          ((RoundRectShape)localObject5).<init>((float[])localObject4, null, null);
          ((ShapeDrawable)localObject3).<init>((Shape)localObject5);
          localObject4 = new android/graphics/BitmapShader;
          localObject5 = Shader.TileMode.REPEAT;
          localObject1 = Shader.TileMode.CLAMP;
          ((BitmapShader)localObject4).<init>((Bitmap)localObject2, (Shader.TileMode)localObject5, (Shader.TileMode)localObject1);
          ((ShapeDrawable)localObject3).getPaint().setShader((Shader)localObject4);
          localObject2 = ((ShapeDrawable)localObject3).getPaint();
          localObject4 = paramDrawable.getPaint().getColorFilter();
          ((Paint)localObject2).setColorFilter((ColorFilter)localObject4);
          if (paramBoolean)
          {
            paramDrawable = new android/graphics/drawable/ClipDrawable;
            j = 3;
            paramDrawable.<init>((Drawable)localObject3, j, i);
          }
          else
          {
            paramDrawable = (Drawable)localObject3;
          }
        }
      }
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    int i = 10000;
    int j = 1;
    Object localObject1 = c.getContext();
    Object localObject2 = b;
    bf localbf = bf.a((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject1 = localbf.b(0);
    if (localObject1 != null)
    {
      ProgressBar localProgressBar = c;
      boolean bool = localObject1 instanceof AnimationDrawable;
      if (bool)
      {
        localObject1 = (AnimationDrawable)localObject1;
        int k = ((AnimationDrawable)localObject1).getNumberOfFrames();
        localObject2 = new android/graphics/drawable/AnimationDrawable;
        ((AnimationDrawable)localObject2).<init>();
        int m = ((AnimationDrawable)localObject1).isOneShot();
        ((AnimationDrawable)localObject2).setOneShot(m);
        m = 0;
        while (m < k)
        {
          Drawable localDrawable = ((AnimationDrawable)localObject1).getFrame(m);
          localDrawable = a(localDrawable, j);
          localDrawable.setLevel(i);
          int i1 = ((AnimationDrawable)localObject1).getDuration(m);
          ((AnimationDrawable)localObject2).addFrame(localDrawable, i1);
          int n;
          m += 1;
        }
        ((AnimationDrawable)localObject2).setLevel(i);
        localObject1 = localObject2;
      }
      localProgressBar.setIndeterminateDrawable((Drawable)localObject1);
    }
    localObject1 = localbf.b(j);
    if (localObject1 != null)
    {
      localObject2 = c;
      localObject1 = a((Drawable)localObject1, false);
      ((ProgressBar)localObject2).setProgressDrawable((Drawable)localObject1);
    }
    a.recycle();
  }
}


/* Location:              android/support/v7/widget/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */