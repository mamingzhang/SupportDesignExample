package horsege.com.supportdesiginexample.ui.screens.main

import android.widget.ListView
import horsege.com.supportdesiginexample.ui.avtivity.ActivityAnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.listView
import org.jetbrains.anko.verticalLayout

class MainLayout : ActivityAnkoComponent<MainActivity> {

    lateinit var listView : ListView

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            listView = listView {
                backgroundResource = android.R.color.transparent
            }
        }
    }
}