package com.example.yuki.android_kotlin04.Models

import android.util.Log

enum class Sex {
    WOMAN,
    MAN;
}

class Account(name: String, age: Int, sex: Sex, preferredLanguage: String) {

    private var name = name
    private var age = age
    private var sex = sex.toString()
    private var preferredLanguage = preferredLanguage

    fun showAccountInfo() {

        when(sex) {
            Sex.WOMAN.toString() -> Log.d("showAccountInfo", "${name}さんは、${preferredLanguage}が得意な${age}歳です。")
            Sex.MAN.toString() -> Log.d("showAccountInfo", "${name}君は、${preferredLanguage}が得意な${age}歳です。")
        }
    }
}