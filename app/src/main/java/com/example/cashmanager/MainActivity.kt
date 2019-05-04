package com.example.cashmanager

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView.adapter = AccountAdapter(applicationContext, arrayListOf(
            Account("Sberbank", 1_000_000),
            Account("Tinkoff", 2_000_000),
            Account("VTB", 500_000),
            Account("AlfaBank", 300_000),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0),
            Account("Empty", 0)
        ))
    }
}
