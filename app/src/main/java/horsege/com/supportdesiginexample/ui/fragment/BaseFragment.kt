package horsege.com.supportdesiginexample.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import horsege.com.supportdesiginexample.ui.avtivity.ViewAnkoComponent

abstract class BaseFragment<Component : ViewAnkoComponent<ViewGroup>> : Fragment() {
    abstract val setup: Component.() -> Unit

    abstract fun onCreateComponent(parent: ViewGroup): Component

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val component = onCreateComponent(container!!)
        val root = component.inflate()
        component.setup()
        return root
    }
}