package cn.boji9.doubanmoive.movie.view.impl;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cn.boji9.doubanmoive.R;

public class MoviesFragment extends Fragment {

    public static final int INTHEATERS = 307;
    public static final int COMINGSOON = 2;
    public static final int TOP250 = 354;

    private TabLayout mTabLayout;
    private ViewPager mViewpager;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_movies,null);
        initTabLayout(view);
        return view;
    }

    private void initTabLayout(View view) {
        mTabLayout = view.findViewById(R.id.tablayout_movies);
        mViewpager = view.findViewById(R.id.viewpager_movies);
        mViewpager.setOffscreenPageLimit(3);

        MoviesPagerAdapter pageradapter = new MoviesPagerAdapter(getChildFragmentManager());

        pageradapter.addFragment(MoviesListFragment.newInstance(INTHEATERS),"正在热映");
        pageradapter.addFragment(MoviesListFragment.newInstance(COMINGSOON),"即将上映");
        pageradapter.addFragment(MoviesListFragment.newInstance(TOP250),"Top250");
        
        mViewpager.setAdapter(pageradapter);

        mTabLayout.addTab(mTabLayout.newTab().setText("正在热映"));
        mTabLayout.addTab(mTabLayout.newTab().setText("即将上映"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Top250"));

        mTabLayout.setupWithViewPager(mViewpager);

    }



    public class MoviesPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public MoviesPagerAdapter(FragmentManager fm){
            super(fm);

        }

        public void addFragment(Fragment fragment,String title){
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitles.get(position);
        }
    }
}
