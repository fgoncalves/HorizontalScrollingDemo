package com.fred.horizontalscrolldemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.fred.horizontalscrolldemo.adapters.HorizontalViewPagerAdapter;
import com.fred.horizontalscrolldemo.transformers.HorizontalPageTransformer;

public class MainActivity extends AppCompatActivity {
  @BindView(R.id.viewpager) ViewPager viewPager;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    HorizontalViewPagerAdapter adapter =
        new HorizontalViewPagerAdapter(getSupportFragmentManager());
    viewPager.setAdapter(adapter);
    viewPager.setPageMargin(40);
    viewPager.setPageTransformer(false, new HorizontalPageTransformer());
  }
}
