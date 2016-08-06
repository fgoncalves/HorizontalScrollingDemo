package com.fred.horizontalscrolldemo.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import java.util.Random;

public class Square extends View {
  private static final Random random = new Random();
  private static int generator = 0;

  private int number;

  public Square(Context context) {
    super(context);
    number = generator++;
  }

  public Square(Context context, AttributeSet attrs) {
    super(context, attrs);
    number = generator++;
  }

  public Square(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    number = generator++;
  }

  @Override protected void onFinishInflate() {
    super.onFinishInflate();
    setBackgroundColor(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
  }

  @Override public String toString() {
    return "Square{" +
        "number=" + number +
        '}';
  }
}
