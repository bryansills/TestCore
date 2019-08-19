package ninja.bryansills.testcore

import androidx.fragment.app.testing.FragmentScenario
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import ninja.bryansills.testcore.ui.main.MainFragment
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainFragmentTest {

    @Test
    fun firstTest() {
        val fragmentScenario = FragmentScenario.launch(MainFragment::class.java)
        fragmentScenario.moveToState(Lifecycle.State.RESUMED)

        onView(withId(R.id.message)).check(matches(withText("Hello")))
    }
}