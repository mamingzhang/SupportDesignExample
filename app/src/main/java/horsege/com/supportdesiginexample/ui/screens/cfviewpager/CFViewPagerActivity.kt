package horsege.com.supportdesiginexample.ui.screens.cfviewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import horsege.com.supportdesiginexample.ui.adapter.BaseFragmentAdapter
import horsege.com.supportdesiginexample.ui.avtivity.BaseActivity
import horsege.com.supportdesiginexample.ui.fragment.ListFragment

class CFViewPagerActivity : BaseActivity<CFViewPagerLayout>() {
    override val ui = CFViewPagerLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragments = mutableListOf<Fragment>()
        val titles = mutableListOf<String>()
        for (index in 0..2) {
            titles.add(index, "Fragment$index")
            fragments.add(index, ListFragment.newInstance())
        }

        val adapter = BaseFragmentAdapter(supportFragmentManager, fragments, titles)
        ui.viewPager.adapter = adapter
        ui.tabLayout.setupWithViewPager(ui.viewPager)
    }
}