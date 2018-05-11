package horsege.com.supportdesiginexample.ui.screens.behavior

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.BottomSheetDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import horsege.com.supportdesiginexample.ui.adapter.BaseSingleTextAdapter
import horsege.com.supportdesiginexample.ui.avtivity.BaseActivity
import horsege.com.supportdesiginexample.ui.avtivity.ViewAnkoComponent
import horsege.com.supportdesiginexample.ui.utils.singleClick
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.toast

class BottomSheetBehaviorActivity : BaseActivity<BottomSheetBehaviorLayout>() {
    override val ui = BottomSheetBehaviorLayout()

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    private lateinit var bottomSheetDialog: BottomSheetDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(ui.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        bottomSheetBehavior = BottomSheetBehavior.from(ui.behaviorLayout)

        ui.bottomSheetBehaviorBtn.singleClick {
            when (bottomSheetBehavior.state) {
                BottomSheetBehavior.STATE_EXPANDED ->
                    bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                BottomSheetBehavior.STATE_COLLAPSED ->
                    bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }

        ui.bottomSheetDialogBtn.singleClick {
            if (bottomSheetDialog.isShowing()) {
                bottomSheetDialog.dismiss()
            } else {
                bottomSheetDialog.show()
            }
        }

        createBottomSheetDialog()
    }

    private fun createBottomSheetDialog() {
        bottomSheetDialog = BottomSheetDialog(this)

        //TODO: 主动创建了一个父类ViewGroup容器，是否可以取消掉
        val component = BottomSheetDialogComponent(FrameLayout(this))

        bottomSheetDialog.setContentView(component.inflate())

        val adapter = BaseSingleTextAdapter { toast(it) }
        component.recyclerView.layoutManager = LinearLayoutManager(this)
        component.recyclerView.adapter = adapter
        adapter.items = listOf("Item1", "Item2", "Item3",
                "Item4", "Item5", "Item6", "Item7", "Item8",
                "Item9", "Item10", "Item11", "Item12", "Item13",
                "Item14", "Item15", "Item16", "Item17", "Item18",
                "Item19", "Item20", "Item21", "Item22", "Item23")
    }

    class BottomSheetDialogComponent(override val view: ViewGroup) : ViewAnkoComponent<ViewGroup> {
        lateinit var recyclerView: RecyclerView

        override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
            frameLayout {
                recyclerView = recyclerView {}.lparams(width = matchParent, height = matchParent)
            }
        }

    }
}