package horsege.com.supportdesiginexample.ui.screens.behavior

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.SwipeDismissBehavior
import android.support.design.widget.SwipeDismissBehavior.SWIPE_DIRECTION_ANY
import android.view.View
import horsege.com.supportdesiginexample.ui.avtivity.BaseActivity

class SwipeDismissBehaviorActivity : BaseActivity<SwipeDismissBehaviorLayout>() {
    override val ui = SwipeDismissBehaviorLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val behavior = SwipeDismissBehavior<View>()
        behavior.setSwipeDirection(SWIPE_DIRECTION_ANY)
        behavior.setListener(object : SwipeDismissBehavior.OnDismissListener {
            override fun onDragStateChanged(state: Int) {
            }

            override fun onDismiss(view: View?) {
            }

        })

        val params = ui.delView.layoutParams as CoordinatorLayout.LayoutParams
        params.behavior = behavior
    }
}