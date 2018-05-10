package horsege.com.supportdesiginexample.ui.utils

import android.view.View

fun View.singleClick(click: (view: View?) -> Unit) {
    setOnClickListener(SingleClickListener(click))
}