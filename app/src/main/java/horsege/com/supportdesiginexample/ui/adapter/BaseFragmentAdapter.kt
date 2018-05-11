package horsege.com.supportdesiginexample.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class BaseFragmentAdapter : FragmentPagerAdapter {

    private var fragments: List<Fragment>
    private var titles: List<String>

    constructor(fragmentManager: FragmentManager, fragments: List<Fragment>, titles: List<String>) : super(fragmentManager) {
        this.fragments = fragments
        this.titles = titles
    }

    override fun getItem(position: Int) = fragments[position]

    override fun getCount() = fragments.size

    override fun getPageTitle(position: Int) = titles[position]
}