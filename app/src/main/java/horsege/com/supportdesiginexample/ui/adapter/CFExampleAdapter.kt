package horsege.com.supportdesiginexample.ui.adapter

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import horsege.com.supportdesiginexample.ui.avtivity.ViewAnkoComponent
import org.jetbrains.anko.*

class CFExampleAdapter(listener: (String) -> Unit)
    : BaseAdapter<String, CFExampleAdapter.Component>(listener) {

    override val bind: Component.(item: String) -> Unit = { item -> content.text = item }

    override fun onCreateComponent(parent: RecyclerView) = Component(parent)

    class Component(override val view: RecyclerView) : ViewAnkoComponent<RecyclerView> {

        lateinit var content: TextView

        override fun createView(ui: AnkoContext<RecyclerView>) = with(ui) {
            verticalLayout {
                content = textView {
                    padding = dip(6)
                    textColor = Color.BLACK
                    maxLines = 1
                    ellipsize = TextUtils.TruncateAt.END
                }.lparams(width = matchParent)
            }
        }

    }
}