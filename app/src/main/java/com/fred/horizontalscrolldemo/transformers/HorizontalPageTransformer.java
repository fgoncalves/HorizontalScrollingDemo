package com.fred.horizontalscrolldemo.transformers;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

public class HorizontalPageTransformer implements ViewPager.PageTransformer {
  @Override public void transformPage(View page, float position) {
    float scaleFactor = getScaleFactor(position);
    page.setScaleX(scaleFactor);
    page.setScaleY(scaleFactor);

    Log.d(getClass().getSimpleName(), "" + position);

    Log.d(getClass().getSimpleName(), "" + page);
  }

  /**
   * Make sure the scale factor is always between a given value
   *
   * @param position Page position
   * @return The scale factor
   */
  private float getScaleFactor(float position) {
    // the -0.33 is so we "move" the position to the center. It must be the same as the page width
    return 1 - Math.abs(position - 0.33f);
  }
}
