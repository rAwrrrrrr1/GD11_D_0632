package com.example.gd11_d_0632


import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewInteraction
import androidx.test.filters.LargeTest
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent

import androidx.test.InstrumentationRegistry.getInstrumentation
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*

import com.example.gd11_d_0632.R

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anything
import org.hamcrest.Matchers.`is`

@LargeTest
@RunWith(AndroidJUnit4::class)
class AddEditActivityTest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(AddEditActivity::class.java)

    @Test
    fun addEditActivityTest() {
        val textInputEditText = onView(
allOf(withId(R.id.et_nama),
childAtPosition(
childAtPosition(
withId(R.id.layout_nama),
0),
0)))
        textInputEditText.perform(scrollTo(), replaceText("a"), closeSoftKeyboard())
        
        val textInputEditText2 = onView(
allOf(withId(R.id.et_npm),
childAtPosition(
childAtPosition(
withId(R.id.layout_npm),
0),
0)))
        textInputEditText2.perform(scrollTo(), click())
        
        val textInputEditText3 = onView(
allOf(withId(R.id.et_npm),
childAtPosition(
childAtPosition(
withId(R.id.layout_npm),
0),
0)))
        textInputEditText3.perform(scrollTo(), replaceText("123456789"), closeSoftKeyboard())
        
        val materialButton = onView(
allOf(withId(R.id.btn_save), withText("Simpan"),
childAtPosition(
allOf(withId(R.id.ll_button),
childAtPosition(
withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
1)),
1),
isDisplayed()))
        materialButton.perform(click())
        
        val materialButton2 = onView(
allOf(withId(R.id.btn_save), withText("Simpan"),
childAtPosition(
allOf(withId(R.id.ll_button),
childAtPosition(
withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
1)),
1),
isDisplayed()))
        materialButton2.perform(click())
        
        val materialAutoCompleteTextView = onView(
allOf(withId(R.id.ed_fakultas),
childAtPosition(
childAtPosition(
withId(R.id.layout_fakultas),
0),
0)))
        materialAutoCompleteTextView.perform(scrollTo(), click())
        
        val materialTextView = onData(anything())
.inAdapterView(childAtPosition(
withClassName(`is`("android.widget.PopupWindow$PopupBackgroundView")),
0))
.atPosition(1)
        materialTextView.perform(click())
        
        val materialAutoCompleteTextView2 = onView(
allOf(withId(R.id.ed_prodi),
childAtPosition(
childAtPosition(
withId(R.id.layout_prodi),
0),
0)))
        materialAutoCompleteTextView2.perform(scrollTo(), click())
        
        val materialTextView2 = onData(anything())
.inAdapterView(childAtPosition(
withClassName(`is`("android.widget.PopupWindow$PopupBackgroundView")),
0))
.atPosition(5)
        materialTextView2.perform(click())
        
        val materialButton3 = onView(
allOf(withId(R.id.btn_save), withText("Simpan"),
childAtPosition(
allOf(withId(R.id.ll_button),
childAtPosition(
withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
1)),
1),
isDisplayed()))
        materialButton3.perform(click())
        
        val materialButton4 = onView(
allOf(withId(R.id.btn_save), withText("Simpan"),
childAtPosition(
allOf(withId(R.id.ll_button),
childAtPosition(
withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
1)),
1),
isDisplayed()))
        materialButton4.perform(click())
        }
    
    private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
    }
