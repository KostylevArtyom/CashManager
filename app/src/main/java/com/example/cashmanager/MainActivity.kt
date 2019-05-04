package com.example.cashmanager

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incomeView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        incomeView.adapter = RecyclerViewAccountAdapter(this, arrayListOf(
            Account("Salary", 300_000, R.drawable.ic_income),
            Account("Interest", 50_000, R.drawable.ic_income),
            Account("Rent", 12_000, R.drawable.ic_income),
            Account("Freelance", 10_000, R.drawable.ic_income),
            Account("Cashback", 5_000, R.drawable.ic_income),
            Account("Inheritance", 1_000_000_000, R.drawable.ic_income)
        ))

        assetView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        assetView.adapter = RecyclerViewAccountAdapter(this, arrayListOf(
            Account("Cash", 1_000_000_000, R.drawable.ic_asset),
            Account("Sberbank", 100_000, R.drawable.ic_asset),
            Account("Tinkoff", 200_000, R.drawable.ic_asset),
            Account("VTB", 50_000, R.drawable.ic_asset),
            Account("AlfaBank", 50_000, R.drawable.ic_asset),
            Account("Real estate", 5_000_000, R.drawable.ic_asset),
            Account("Bitcoin", 1_000, R.drawable.ic_asset)
        ))

        expenseView.layoutManager = GridLayoutManager(this, 5)
        expenseView.adapter = RecyclerViewAccountAdapter(this, arrayListOf(
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense),
            Account("Empty", 0, R.drawable.ic_expense)
        ))
    }
}
