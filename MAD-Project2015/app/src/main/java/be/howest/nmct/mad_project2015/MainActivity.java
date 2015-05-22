package be.howest.nmct.mad_project2015;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import be.howest.nmct.mad_project2015.models.McDonald;


public class MainActivity extends Activity implements ProvincieFragment.OnProvincieListener, MainFragment.OnMcDonaldListener {

    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment(), "showFragmentMainFragment")
                    .commit();
        }

        mDrawerLayout = (DrawerLayout) super.findViewById(R.id.drawer_layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void OnProvincieSelected(String sProvincie) {
        MainFragment mainFragment = (MainFragment) getFragmentManager().findFragmentByTag("showFragmentMainFragment");
        mainFragment.SetProvincie(sProvincie);
        mDrawerLayout.closeDrawer(Gravity.LEFT);
    }

    @Override
    public void OnMcDonaldSelected(String sNaam) {
        MapFragment newFragment = MapFragment.newInstance(sNaam);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack so the user can navigate back
        transaction.replace(R.id.container, newFragment);
        //transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }
}
