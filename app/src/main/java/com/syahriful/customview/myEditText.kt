package com.syahriful.customview

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.res.ResourcesCompat

class myEditText: AppCompatEditText, View.OnTouchListener {
    internal lateinit var mClearButtonImage: Drawable

    constructor(context: Context) : super(context) {

    }
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

    }
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

    }

    private fun init(){
        mClearButtonImage = ResourcesCompat.getDrawable(resources, R.drawable.ic_baseline_close_24, null) as Drawable
        setOnTouchListener(this)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (compoundDrawables[2] != null){
            val clearButtonStart: Float
            val clearButtonEnd: Float
            val isClearButtonClicked = false
            when(layoutDirection){
                View.LAYOUT_DIRECTION_RTL -> {
                    clearButtonEnd = (mClearButtonImage.intrinsicWidth + paddingStart).toFloat()
                }
            }
        }
        return false
    }

    private fun showClearButton(){
        setCompoundDrawablesWithIntrinsicBounds(null, null, mClearButtonImage, null)
    }

    private fun hideClearButton(){
        setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
    }
}