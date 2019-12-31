# Android多语言切换

# 效果图

[![](https://raw.githubusercontent.com/zxyUncle/zxyMultilingual/master/app/mul.gif)](https://raw.githubusercontent.com/zxyUncle/zxyMultilingual/master/app/mul.gif)

[![](https://jitpack.io/v/zxyUncle/zxyMultilingual.svg)](https://jitpack.io/#zxyUncle/zxyMultilingual)


Gradle
-----
Step 1


     allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency
##### 全部依赖模块

         implementation 'com.github.zxyUncle:zxyMultilingual:Tag'





## 使用：
一、使用依赖库，有局限，只有简体、繁体、英文、日文
二、使用Module，下载项目，将项目的module加入到自己的项目
 1. 在你的Application中使用`  MultiLanguageUtil.init(this);`
 2. 在你的BaseActivity总加入

     @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(MultiLanguageUtil.attachBaseContext(newBase));
    }
 3. 更新本项目本地记录的语言：

    MultiLanguageUtil.getInstance().updateLanguage(LanguageType.LANGUAGE_CHINESE_SIMPLIFIED)
其中：LanguageType.LANGUAGE_CHINESE_SIMPLIFIED在LanguageType类中


public class LanguageType {
    public static final int LANGUAGE_FOLLOW_SYSTEM = 0; //跟随系统
    public static final int LANGUAGE_EN = 1;    //英文
    public static final int LANGUAGE_CHINESE_SIMPLIFIED = 2; //简体
    public static final int LANGUAGE_CHINESE_TRADITIONAL = 3;  //香港台湾繁体
    public static final int LANGUAGE_JAPANESS = 4;  //日语
}






## 提示：

 1. 更换语言之后必须把所有Activity都finish掉，不然有些界面还是之前的语言
 2. 如果需要用其他比如非洲语言，那么只需要把项目下载下来，修改内部module中的两点：       
 1）LanguageType.java中增加类型      
 2）MultiLanguageUtil.java 中，getLanguageLocale()方法跟getLanguageType()方法修改语言类型