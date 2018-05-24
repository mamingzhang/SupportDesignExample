package horsege.com.supportdesiginexample.ui.screens.actionbutton

import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.FloatingActionButton
import android.support.v4.view.ViewCompat
import android.view.View
import horsege.com.supportdesiginexample.ui.utils.AnimationListenerBuilder
import horsege.com.supportdesiginexample.ui.utils.AnimatorUtils

class CustomScaleBehavior : FloatingActionButton.Behavior() {

    private val animatorListener = AnimationListenerBuilder();

    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: FloatingActionButton, directTargetChild: View, target: View, axes: Int, type: Int): Boolean {
        return axes == ViewCompat.SCROLL_AXIS_VERTICAL
    }

    override fun onNestedScroll(coordinatorLayout: CoordinatorLayout, child: FloatingActionButton, target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int, type: Int) {
        if ((dyConsumed > 0 || dyUnconsumed > 0) && child.visibility == View.VISIBLE && !animatorListener.isExecuting) {
            AnimatorUtils.scaleHide(child, animatorListener.build())
        } else if ((dyConsumed < 0 || dyUnconsumed < 0) && child.visibility != View.VISIBLE && !animatorListener.isExecuting) {
            AnimatorUtils.scaleShow(child, animatorListener.build())
        }
    }
}