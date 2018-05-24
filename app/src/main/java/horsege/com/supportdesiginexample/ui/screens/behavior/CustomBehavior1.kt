package horsege.com.supportdesiginexample.ui.screens.behavior

import android.support.design.widget.AppBarLayout
import android.support.design.widget.CoordinatorLayout
import android.view.View

class CustomBehavior1 : CoordinatorLayout.Behavior<View>() {

    override fun layoutDependsOn(parent: CoordinatorLayout?, child: View?, dependency: View?): Boolean {
        return dependency is AppBarLayout
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout?, child: View?, dependency: View?): Boolean {
        val translationY = dependency!!.top
        child?.translationY = -translationY.toFloat()
        return true
    }
}