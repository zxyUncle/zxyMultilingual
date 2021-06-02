package com.example.multilingual

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.zxy.zxymultilingual.LanguageType
import com.zxy.zxymultilingual.MultiLanguageUtil

class MainActivity : BaseActivity() {
    /**'
     * 跳转activity
     */
    private fun finishStartActiivty() {
        MultiLanguageUtil.getInstance().newIntent(this,Intent(this, MainActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * 系统
     */
    fun onSystem(view: View) {
        MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_FOLLOW_SYSTEM)
        finishStartActiivty()
    }
    /**
     * 中文
     */
    fun onChinese(view: View) {
        MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_CHINESE_SIMPLIFIED)
        finishStartActiivty()
    }

    /**
     * 繁体
     */
    fun onComplex(view: View) {
        MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_CHINESE_TRADITIONAL)
        finishStartActiivty()
    }

    /**
     * 英文
     */
    fun onEnglish(view: View) {
        MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_EN)
        finishStartActiivty()
    }

    /**
     * 日语
     */
    fun onJapanese(view: View) {
        MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_JAPANESS)
        finishStartActiivty()
    }
    /**
     * 日语
     */
    fun onArabic(view: View) {
        MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_ARABIC)
        finishStartActiivty()
    }
    /**
     * 法语
     */
    fun onFrench(view: View) {
        MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_FRENCH)
        finishStartActiivty()
    }



}
