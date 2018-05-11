package horsege.com.supportdesiginexample.ui.screens.cfviewpager

import android.support.design.widget.AppBarLayout
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import horsege.com.supportdesiginexample.R
import horsege.com.supportdesiginexample.ui.avtivity.ActivityAnkoComponent
import org.jetbrains.anko.*
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.tabLayout
import org.jetbrains.anko.support.v4.viewPager

class CFViewPagerLayout : ActivityAnkoComponent<CFViewPagerActivity> {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun createView(ui: AnkoContext<CFViewPagerActivity>) = with(ui) {
        coordinatorLayout {
            appBarLayout {
                imageView(R.mipmap.titlebkg) {
                    scaleType = ImageView.ScaleType.CENTER_CROP
                    backgroundColor = R.color.colorPrimary
                }.lparams(width = matchParent, height = dip(200)) {
                    scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or
                            AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
                }

                tabLayout = tabLayout {
                    backgroundColor = R.color.colorPrimary
                }.lparams(width = matchParent, height = wrapContent) {
                    gravity = Gravity.BOTTOM
                }
            }.lparams(width = matchParent, height = dip(250))

            viewPager = viewPager {
                id = View.generateViewId()
            }.lparams(width = matchParent, height = matchParent) {
                behavior = AppBarLayout.ScrollingViewBehavior()
            }
        }
    }
}