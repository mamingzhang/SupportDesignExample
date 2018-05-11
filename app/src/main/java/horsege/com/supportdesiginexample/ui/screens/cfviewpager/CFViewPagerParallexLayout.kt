package horsege.com.supportdesiginexample.ui.screens.cfviewpager

import android.graphics.Color
import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout.LayoutParams.COLLAPSE_MODE_PARALLAX
import android.support.design.widget.CollapsingToolbarLayout.LayoutParams.COLLAPSE_MODE_PIN
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import horsege.com.supportdesiginexample.R
import horsege.com.supportdesiginexample.ui.avtivity.ActivityToolBarAnkoComponent
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.themedToolbar
import org.jetbrains.anko.design.collapsingToolbarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.tabLayout
import org.jetbrains.anko.design.themedAppBarLayout
import org.jetbrains.anko.support.v4.viewPager

class CFViewPagerParallexLayout : ActivityToolBarAnkoComponent<CFViewPagerParallexActivity> {
    override lateinit var toolbar: Toolbar

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun createView(ui: AnkoContext<CFViewPagerParallexActivity>) = with(ui) {
        coordinatorLayout {
            fitsSystemWindows = true

            themedAppBarLayout(R.style.ThemeOverlay_AppCompat_Dark_ActionBar) {
                fitsSystemWindows = true

                collapsingToolbarLayout {
                    setContentScrimColor(resources.getColor(R.color.colorPrimary))
                    expandedTitleMarginEnd = dip(64)
                    expandedTitleMarginStart = dip(48)

                    imageView(R.mipmap.titlebkg) {
                        scaleType = ImageView.ScaleType.CENTER_CROP
                        fitsSystemWindows = true
                    }.lparams(width = matchParent, height = matchParent) {
                        collapseMode = COLLAPSE_MODE_PARALLAX
                    }

                    toolbar = themedToolbar(R.style.ThemeOverlay_AppCompat_Light) {
                        title = "ViewPager视差特效"
                    }.lparams(width = matchParent, height = dip(50)) {
                        collapseMode = COLLAPSE_MODE_PIN
                    }
                }.lparams(width = matchParent, height = dip(250)) {
                    scrollFlags = AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL or
                            AppBarLayout.LayoutParams.SCROLL_FLAG_EXIT_UNTIL_COLLAPSED
                }

                tabLayout = tabLayout {
                    setSelectedTabIndicatorHeight(dip(4))
                    setSelectedTabIndicatorColor(resources.getColor(R.color.colorAccent))
                    setTabTextColors(Color.parseColor("#000000"), Color.parseColor("#FFFFFF"))
                }.lparams(width = matchParent, height = wrapContent)
            }.lparams(width = matchParent, height = dip(300))

            viewPager = viewPager {
                id = View.generateViewId()
            }.lparams(width = matchParent, height = matchParent) {
                behavior = AppBarLayout.ScrollingViewBehavior()
            }
        }
    }
}