package abhishek.bottomNavigation;

import android.os.Bundle;


// BaseActivity extends AppCompatActivity so do not need to extend here
// you will automatically get parent properties
public class HomeActivity extends BaseActivity {

    //getContentViewId and getNavigationMenuItemId both are abstract method so you must implement them.

    // pass layout.xml file of current activtiy
    @Override
    int getContentViewId() {
        return R.layout.activity_home;
    }

    // action you want to selected - eg. i want home btn to get selected
    @Override
    int getNavigationMenuItemId() {
        return R.id.navigation_home;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // do not use setContentView(R.id.activity_home) only pass it in getContentViewId();

        /* Layout Tips  */
        // make sure element_navigation_bottom.xml is included in your current layout
        // and use Relative layout as parent as it have property for child alignParentBottom so it
        // will easy to set you navigation_bottom to parent bottom
        // also remember to wrap all main data of component in seperate layout put property layout above
        // your navigation_bottom

        /* Java File Tips */
        // perform any other based on Home activity here
        // for eg. getting elements id , click listener
        // at last you only need to pass current xml file in BaseActivity and do not use setContent view here.
        // rest of logic of HomeActivity you can do it as you normally do.
    }


}
