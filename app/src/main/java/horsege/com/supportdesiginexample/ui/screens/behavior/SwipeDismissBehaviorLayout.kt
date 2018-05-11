package horsege.com.supportdesiginexample.ui.screens.behavior

import android.widget.TextView
import horsege.com.supportdesiginexample.ui.avtivity.ActivityAnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.dip
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.textView

class SwipeDismissBehaviorLayout : ActivityAnkoComponent<SwipeDismissBehaviorActivity> {
    lateinit var delView: TextView

    override fun createView(ui: AnkoContext<SwipeDismissBehaviorActivity>) = with(ui) {
        coordinatorLayout {
            delView = textView("删除1") { textSize = dip(30).toFloat() }.lparams(width = matchParent)
        }
    }
}