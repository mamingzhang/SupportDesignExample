package horsege.com.supportdesiginexample.ui.utils

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import android.view.animation.LinearInterpolator

object AnimatorUtils {
    fun scaleHide(view: View, viewPropertyAnimatorListener: ViewPropertyAnimatorListener): Unit {
        ViewCompat.animate(view)
                .scaleX(0f).scaleY(0f).alpha(0f)
                .setDuration(800)
                .setInterpolator(LinearInterpolator())
                .setListener(viewPropertyAnimatorListener)
                .start()
    }

    fun scaleShow(view: View, viewPropertyAnimatorListener: ViewPropertyAnimatorListener): Unit {
        ViewCompat.animate(view)
                .scaleX(1f).scaleY(1f).alpha(1f)
                .setDuration(800)
                .setInterpolator(LinearInterpolator())
                .setListener(viewPropertyAnimatorListener)
                .start()
    }
}