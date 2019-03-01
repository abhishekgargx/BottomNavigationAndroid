package abhishek.bottomNavigation;

import android.os.Bundle;

public class NotificationsActivity extends BaseActivity {


    @Override
    int getContentViewId() {
        return R.layout.activity_notifications;
    }

    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_notifications;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
