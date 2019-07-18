package se.mobility46.tabbar

import android.content.Context
import android.view.MotionEvent
import android.support.v4.view.ViewPager
import android.util.AttributeSet

class TabPager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {

    var isPagingEnabled: Boolean = false

    init {
        this.isPagingEnabled = true
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return isPagingEnabled && super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return isPagingEnabled && super.onInterceptTouchEvent(event)
    }
}