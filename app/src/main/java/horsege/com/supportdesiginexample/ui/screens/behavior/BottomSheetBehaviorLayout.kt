package horsege.com.supportdesiginexample.ui.screens.behavior

import android.support.design.widget.AppBarLayout
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.widget.Toolbar
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import horsege.com.supportdesiginexample.R
import horsege.com.supportdesiginexample.ui.avtivity.ActivityToolBarAnkoComponent
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.themedToolbar
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.themedAppBarLayout

class BottomSheetBehaviorLayout : ActivityToolBarAnkoComponent<BottomSheetBehaviorActivity> {
    lateinit override var toolbar: Toolbar

    lateinit var bottomSheetBehaviorBtn: Button
    lateinit var bottomSheetDialogBtn: Button
    lateinit var behaviorLayout: View

    override fun createView(ui: AnkoContext<BottomSheetBehaviorActivity>) = with(ui) {
        coordinatorLayout {
            themedAppBarLayout(R.style.ThemeOverlay_AppCompat_Dark_ActionBar) {
                toolbar = themedToolbar(R.style.ThemeOverlay_AppCompat_Light) {
                    title = "BottomSheetBehavior"
                }.lparams(width = matchParent, height = dip(50))
            }.lparams(width = matchParent, height = wrapContent)

            linearLayout {
                orientation = VERTICAL

                bottomSheetBehaviorBtn = button("BottomSheet 显示隐藏") {

                }.lparams(width = matchParent, height = wrapContent)

                bottomSheetDialogBtn = button("BottomSheetDialog 显示隐藏") {

                }.lparams(width = matchParent, height = wrapContent)

            }.lparams(width = matchParent, height = wrapContent) {
                behavior = AppBarLayout.ScrollingViewBehavior()
            }

            behaviorLayout = linearLayout {
                button("1") {}.lparams(width = dip(0), height = wrapContent) { weight = 1F }
                button("2") {}.lparams(width = dip(0), height = wrapContent) { weight = 1F }
                button("3") {}.lparams(width = dip(0), height = wrapContent) { weight = 1F }
                button("4") {}.lparams(width = dip(0), height = wrapContent) { weight = 1F }
                button("5") {}.lparams(width = dip(0), height = wrapContent) { weight = 1F }
            }.lparams(width = matchParent, height = dip(50)) {
                behavior = BottomSheetBehavior<LinearLayout>()
            }
        }
    }
}