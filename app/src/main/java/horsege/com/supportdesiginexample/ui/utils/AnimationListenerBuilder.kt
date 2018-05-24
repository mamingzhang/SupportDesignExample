package horsege.com.supportdesiginexample.ui.utils

import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View

class AnimationListenerBuilder {

    private var listener : ViewPropertyAnimatorListener

    var isExecuting: Boolean = false
        private set

    init {
        listener = object : ViewPropertyAnimatorListener{
            override fun onAnimationEnd(view: View?) {
                isExecuting = false

                view?.let {
                    if (view.visibility == View.VISIBLE) {
                        view.visibility = View.INVISIBLE
                    } else {
                        view.visibility = View.VISIBLE
                    }
                }
            }

            override fun onAnimationCancel(view: View?) {
                isExecuting = false
            }

            override fun onAnimationStart(view: View?) {
                isExecuting = true
            }

        }
    }

    fun build() = listener

}