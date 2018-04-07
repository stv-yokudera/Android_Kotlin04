package com.example.yuki.android_kotlin04.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.yuki.android_kotlin04.Models.Account
import com.example.yuki.android_kotlin04.Models.Sex
import com.example.yuki.android_kotlin04.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showAccounts()
    }

    private fun showAccounts() {
        val accounts: MutableList<Account> = mutableListOf()
        val account1 = Account("Taro", 20, Sex.MAN, "Java")
        val account2 = Account("Jiro", 19, Sex.MAN, "Swift")
        val account3 = Account("Saki", 22, Sex.WOMAN, "Kotlin")
        accounts.add(account1)
        accounts.add(account2)
        accounts.add(account3)

        for (account in accounts) {
            account.showAccountInfo()
        }
    }
}
