package horsege.com.supportdesiginexample.ui.screens.actionbutton

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import horsege.com.supportdesiginexample.ui.adapter.BaseSingleTextAdapter
import horsege.com.supportdesiginexample.ui.avtivity.BaseActivity
import org.jetbrains.anko.contentView
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast

class CFSnackBarActivity : BaseActivity<CFSnackBarLayout>() {

    override val ui = CFSnackBarLayout()

    private val adapter = BaseSingleTextAdapter { toast(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ui.recyclerView.layoutManager = LinearLayoutManager(this)
        ui.recyclerView.adapter = adapter
        adapter.items = listOf("Item1", "Item2", "Item3",
                "Item4", "Item5", "Item6", "Item7", "Item8",
                "Item9", "Item10", "Item11", "Item12", "Item13",
                "Item14", "Item15", "Item16", "Item17", "Item18",
                "Item19", "Item20", "Item21", "Item22", "Item23")

        ui.floatingActionButton.onClick {
            Snackbar.make(contentView!!, "Action Button Click", Snackbar.LENGTH_LONG).show()
        }
    }
}
