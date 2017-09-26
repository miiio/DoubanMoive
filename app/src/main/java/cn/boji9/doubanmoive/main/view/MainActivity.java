package cn.boji9.doubanmoive.main.view;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.aitangba.swipeback.SwipeBackActivity;
import com.wyt.searchbox.SearchFragment;
import com.wyt.searchbox.custom.IOnSearchClickListener;

import cn.boji9.doubanmoive.R;
import cn.boji9.doubanmoive.movie.view.impl.SearchMovieActivity;
import cn.boji9.doubanmoive.movie.view.impl.MoviesFragment;

public class MainActivity extends SwipeBackActivity implements
        NavigationView.OnNavigationItemSelectedListener {

    private Toolbar mToolbar;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAppBar();
        searchFragment = SearchFragment.newInstance();
        searchFragment.setOnSearchClickListener(new IOnSearchClickListener() {
            @Override
            public void OnSearchClick(String keyword) {
                Intent intent = new Intent(MainActivity.this, SearchMovieActivity.class);
                intent.putExtra("keyword",keyword);
                startActivity(intent);
            }
        });
    }

    private void initAppBar() {
        mToolbar = (Toolbar)findViewById(R.id.toolbar_view);
        setSupportActionBar(mToolbar);

        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout_layout);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,mToolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        mActionBarDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);
        mNavigationView = (NavigationView)findViewById(R.id.navigation_view);
        mNavigationView.getMenu().getItem(0).setChecked(true);
        mNavigationView.setNavigationItemSelectedListener(this);
        switch2Movie();
    }

    private void switch2Movie() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content,new MoviesFragment()).commit();
        mToolbar.setTitle("电影");
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mDrawerLayout.closeDrawers();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainactivity_toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.movie_toolbar_search:
                searchFragment.show(getSupportFragmentManager(),searchFragment.getTag());
                break;
        }

        return true;
    }
}
