package abhishek.bottomNavigation;

import android.os.Bundle;

public class HomeActivity extends BaseActivity {


    @Override
    int getContentViewId() {
        return R.layout.activity_home;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // do not use setContentView(R.id.activity_home) only pass it in getContentViewId();


    }


}
