package com.example.cashmanager

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.cashmanager.model.Account
import com.example.cashmanager.model.AccountType
import com.example.cashmanager.view.RecyclerViewAccountAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incomeView.layoutManager = GridLayoutManager(this, 1, LinearLayoutManager.HORIZONTAL, false)
        incomeView.adapter = RecyclerViewAccountAdapter(
            this, arrayListOf(
                Account(AccountType.INCOME, "Salary", 300_000, R.drawable.ic_income),
                Account(AccountType.INCOME, "Interest", 50_000, R.drawable.ic_income),
                Account(AccountType.INCOME, "Rent", 12_000, R.drawable.ic_income),
                Account(AccountType.INCOME, "Freelance", 10_000, R.drawable.ic_income),
                Account(AccountType.INCOME, "Cashback", 5_000, R.drawable.ic_income),
                Account(AccountType.INCOME, "Inheritance", 1_000_000_000, R.drawable.ic_income)
            )
        )

        assetView.layoutManager = GridLayoutManager(this, 1, LinearLayoutManager.HORIZONTAL, false)
        assetView.adapter = RecyclerViewAccountAdapter(
            this, arrayListOf(
                Account(AccountType.ASSET, "Cash", 1_000_000_000, R.drawable.ic_asset),
                Account(AccountType.ASSET, "Sberbank", 100_000, R.drawable.ic_asset),
                Account(AccountType.ASSET, "Tinkoff", 200_000, R.drawable.ic_asset),
                Account(AccountType.ASSET, "VTB", 50_000, R.drawable.ic_asset),
                Account(AccountType.ASSET, "AlfaBank", 50_000, R.drawable.ic_asset),
                Account(AccountType.ASSET, "Real estate", 5_000_000, R.drawable.ic_asset),
                Account(AccountType.ASSET, "Bitcoin", 1_000, R.drawable.ic_asset)
            )
        )

        expenseView.layoutManager = GridLayoutManager(this, 5)
        expenseView.adapter = RecyclerViewAccountAdapter(
            this, arrayListOf(
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense),
                Account(AccountType.EXPENSE, "Empty", 0, R.drawable.ic_expense)
            )
        )
    }
}
