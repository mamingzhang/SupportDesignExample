package horsege.com.supportdesiginexample.ui.screens.behavior

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.view.View
import android.widget.LinearLayout
import horsege.com.supportdesiginexample.ui.avtivity.BaseActivity
import horsege.com.supportdesiginexample.ui.utils.singleClick

class BottomSheetBehaviorActivity : BaseActivity<BottomSheetBehaviorLayout>() {
    override val ui = BottomSheetBehaviorLayout()

    private lateinit var bottomSheetBehavior : BottomSheetBehavior<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(ui.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        bottomSheetBehavior = BottomSheetBehavior.from(ui.behaviorLayout)

        ui.displayBtn.singleClick {
            when(bottomSheetBehavior.state) {
                BottomSheetBehavior.STATE_EXPANDED ->
                        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                BottomSheetBehavior.STATE_COLLAPSED ->
                        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
    }
}