package horsege.com.supportdesiginexample.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import horsege.com.supportdesiginexample.ui.adapter.BaseSingleTextAdapter
import horsege.com.supportdesiginexample.ui.avtivity.ViewAnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.support.v4.toast

class ListFragment : BaseFragment<ListFragment.Component>() {

    companion object {
        fun newInstance(): Fragment {
            val fragment = ListFragment()
            val arg = Bundle();
            fragment.arguments = arg
            return fragment
        }
    }

    private val adapter = BaseSingleTextAdapter { toast(it) }

    override val setup: Component.() -> Unit = {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        recyclerView.adapter = adapter
        adapter.items = listOf("Item1", "Item2", "Item3",
                "Item4", "Item5", "Item6", "Item7", "Item8",
                "Item9", "Item10", "Item11", "Item12", "Item13",
                "Item14", "Item15", "Item16", "Item17", "Item18",
                "Item19", "Item20", "Item21", "Item22", "Item23")
    }

    override fun onCreateComponent(parent: ViewGroup) = Component(parent)

    class Component(override val view: ViewGroup) : ViewAnkoComponent<ViewGroup> {
        lateinit var recyclerView: RecyclerView

        override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
            frameLayout {
                recyclerView = recyclerView {

                }.lparams(width = matchParent, height = matchParent)
            }
        }
    }
}