package abhishek.bottomNavigation;

import android.os.Bundle;

public class MusicActivity extends  BaseActivity{
    @Override
    int getContentViewId() {
        return R.layout.activity_music;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_music;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // do not use setContentView(R.id.activity_home) only pass it in getContentViewId();

    }
}
