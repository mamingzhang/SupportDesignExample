package horsege.com.supportdesiginexample.ui.screens.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import butterknife.ButterKnife
import horsege.com.supportdesiginexample.ui.avtivity.BaseActivity
import horsege.com.supportdesiginexample.ui.screens.clayout.CFExampleActivity

class MainActivity : BaseActivity<MainLayout>() {

    private val DATA = mapOf("CFExampleActivity" to CFExampleActivity::class.java)

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
