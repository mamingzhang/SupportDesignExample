package horsege.com.supportdesiginexample.ui.screens.behavior

import android.graphics.Color
import android.support.design.widget.AppBarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Gravity
import horsege.com.supportdesiginexample.R
import horsege.com.supportdesiginexample.ui.avtivity.ActivityToolBarAnkoComponent
import horsege.com.supportdesiginexample.ui.screens.actionbutton.CFSnackBarActivity
import horsege.com.supportdesiginexample.ui.screens.actionbutton.CustomScaleBehavior
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.themedToolbar
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.floatingActionButton
import org.jetbrains.anko.recyclerview.v7.recyclerView

class CFCustomBehavior1Layout : ActivityToolBarAnkoComponent<CFCustomBehavior1Activity> {
    lateinit override var toolbar: Toolbar

    lateinit var coordinatorLayout: CoordinatorLayout

    lateinit var recyclerView: RecyclerView

    lateinit var floatingActionButton: FloatingActionButton

    override fun createView(ui: AnkoContext<CFCustomBehavior1Activity>) = with(ui) {
        coordinatorLayout {
            appBarLayout {
                toolbar = themedToolbar(R.style.ThemeOverlay_AppCompat_Dark_ActionBar) {
                    backgroundColor = R.color.colorPrimary
                    textView("CFExample")
                }.lparams(width = matchParent) {
                    scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or
                            AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
                }
            }.lparams(width = matchParent)

            recyclerView = recyclerView {

            }.lparams(width = matchParent, height = matchParent) {
                behavior = AppBarLayout.ScrollingViewBehavior()
            }

            textView("BottomBar"){
                backgroundColorResource = R.color.colorPrimary
                textColor = Color.WHITE
                gravity = Gravity.CENTER
            }.lparams(width = matchParent, height = dip(50)) {
                gravity = Gravity.BOTTOM
                behavior = CustomBehavior1()
            }
        }
    }
}