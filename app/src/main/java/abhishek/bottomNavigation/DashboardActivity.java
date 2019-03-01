package abhishek.bottomNavigation;

import android.os.Bundle;

public class DashboardActivity extends BaseActivity {


    @Override
    int getContentViewId() {
        return R.layout.activity_dashboard;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_dashboard;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
