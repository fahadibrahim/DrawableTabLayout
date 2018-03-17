package com.fib.drawabletablayoutapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.fib.drawabletablayout.TabLayoutWithArrow;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment[] fragments = {
                Fragment.instantiate(this, FragmentB.class.getName()),
                Fragment.instantiate(this, FragmentA.class.getName()),
                Fragment.instantiate(this, FragmentA.class.getName()),
                Fragment.instantiate(this, FragmentB.class.getName()),
                Fragment.instantiate(this, FragmentA.class.getName()),
                Fragment.instantiate(this, FragmentA.class.getName())
        };

        TabLayoutWithArrow tabLayout = (TabLayoutWithArrow) findViewById(R.id.tabLayout);
        tabLayout.setmDrawableHeight(50);
        tabLayout.setmIndicatorLeftMargin(50);
        tabLayout.setmIndicatorRightMargin(50);

//        Drawable d = getResources().getDrawable(R.drawable.semi);
//        d.setTint(getResources().getColor(R.color.colorPrimary));
//        tabLayout.setmDrawableIndicator(d);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(), fragments));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(getResources().getDrawable(R.drawable.ic_triage_star));
    }
}
