package tw.tasker.babysitter.test;

import tw.tasker.babysitter.MainActivity;
import tw.tasker.babysitter.MainActivity.PlaceholderFragment;
import tw.tasker.babysitter.NavigationDrawerFragment;
import android.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity activity;
	private FragmentManager fragmentManager;
	private NavigationDrawerFragment mNavigationDrawerFragment;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
		fragmentManager = activity.getSupportFragmentManager();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSearchBabysitter() {
		fragmentManager.beginTransaction().replace(R.id.content,
				PlaceholderFragment.newInstance(1)).commit();

		activity.restoreActionBar();
		
		getInstrumentation().waitForIdleSync();
		
		//mNavigationDrawerFragment = (NavigationDrawerFragment) fragmentManager.findFragmentById(tw.tasker.babysitter.R.id.navigation_drawer);
		
		 		
		final String expected = "搜尋保母";
		final String actual = activity.getSupportActionBar().getTitle().toString();
	
		assertEquals(expected, actual);
	}
}
