package com.fred.horizontalscrolldemo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.fred.horizontalscrolldemo.SquareFragment;

public class HorizontalViewPagerAdapter extends FragmentPagerAdapter {
  public HorizontalViewPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override public Fragment getItem(int position) {
    return SquareFragment.newInstance();
  }

  @Override public int getCount() {
    return 100;
  }

  @Override public float getPageWidth(int position) {
    // We need this to show 3 pages
    return 0.33f;
  }
}
