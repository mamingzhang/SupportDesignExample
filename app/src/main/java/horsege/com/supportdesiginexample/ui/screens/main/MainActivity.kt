package horsege.com.supportdesiginexample.ui.screens.main

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import butterknife.ButterKnife
import horsege.com.supportdesiginexample.ui.avtivity.BaseActivity
import horsege.com.supportdesiginexample.ui.screens.behavior.BottomSheetBehaviorActivity
import horsege.com.supportdesiginexample.ui.screens.behavior.SwipeDismissBehaviorActivity
import horsege.com.supportdesiginexample.ui.screens.cfviewpager.CFViewPagerActivity
import horsege.com.supportdesiginexample.ui.screens.cfviewpager.CFViewPagerParallexActivity
import horsege.com.supportdesiginexample.ui.screens.clayout.CFSnackBarActivity

/**
 * 参考资料：
 * 1. https://blog.csdn.net/gdutxiaoxu/article/details/52858598
 * 2. https://blog.csdn.net/yanzhenjie1003/article/details/52205665
 */
class MainActivity : BaseActivity<MainLayout>() {

    private val DATA = mapOf("ToolBar效果" to CFSnackBarActivity::class.java,
            "ViewPager效果" to CFViewPagerActivity::class.java,
            "ViewPager视差特效" to CFViewPagerParallexActivity::class.java,
            "BottomSheetBehavior效果测试" to BottomSheetBehaviorActivity::class.java,
            "SwipeDismissBehavior效果测试" to SwipeDismissBehaviorActivity::class.java)

    override val ui = MainLayout()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ButterKnife.bind(this)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DATA.keys.toTypedArray())
        ui.listView.adapter = adapter

        ui.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val key = ui.listView.getItemAtPosition(position)
            val intent = Intent(this, DATA.get(key))
            startActivity(intent)
        }
    }
}
