package com.example.cashmanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AccountAdapter(private val context: Context, private val accounts: ArrayList<Account>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.account, parent, false)
        val account: Account = getAccount(position)

        view.findViewById<TextView>(R.id.textTitle)?.text = account.name
        view.findViewById<TextView>(R.id.textAmount)?.text = account.amount.toString()

        return view
    }

    private fun getAccount(position: Int): Account {
        return accounts[position]
    }

    override fun getItem(position: Int): Any {
        return getAccount(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return accounts.size
    }
}