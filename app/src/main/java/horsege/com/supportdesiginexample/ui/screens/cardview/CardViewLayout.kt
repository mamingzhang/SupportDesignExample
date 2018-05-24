package horsege.com.supportdesiginexample.ui.screens.cardview

import horsege.com.supportdesiginexample.ui.avtivity.ActivityAnkoComponent
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class CardViewLayout : ActivityAnkoComponent<CardViewActivity> {
    override fun createView(ui: AnkoContext<CardViewActivity>) = with(ui) {
        verticalLayout {
            cardView {
                cardElevation = dip(8).toFloat()
                setContentPadding(dip(16), dip(16), dip(16), dip(16))

                textView("文本一") {
                    textSize = sp(18).toFloat()
                }.lparams(width = matchParent, height = wrapContent)
            }.lparams(width = matchParent, height = wrapContent) {
                leftMargin = dip(8)
                rightMargin = dip(8)
                topMargin = dip(8)
                bottomMargin = dip(8)
            }

            cardView {
                cardElevation = dip(8).toFloat()
                setContentPadding(dip(16), dip(16), dip(16), dip(16))
                radius = dip(15).toFloat()

                textView("文本二") {
                    textSize = sp(18).toFloat()
                }.lparams(width = matchParent, height = wrapContent)
            }.lparams(width = matchParent, height = wrapContent) {
                leftMargin = dip(8)
                rightMargin = dip(8)
                topMargin = dip(8)
                bottomMargin = dip(8)
            }
        }
    }
}