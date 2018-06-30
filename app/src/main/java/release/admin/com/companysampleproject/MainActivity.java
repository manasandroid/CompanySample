package release.admin.com.companysampleproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import release.admin.com.companysampleproject.newslist.NewsListContract;
import release.admin.com.companysampleproject.newslist.NewsListFragment;

public class MainActivity extends AppCompatActivity{

    private NewsListContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar();
        getSupportFragmentManager().beginTransaction().add(R.id.content_frame, new NewsListFragment()).commit();
    }

    public void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Group Name");
        getSupportActionBar().setSubtitle("Member 1, Member 2, Member 3, Member 4");
    }

}
