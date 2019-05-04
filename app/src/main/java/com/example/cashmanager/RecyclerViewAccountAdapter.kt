package com.example.cashmanager

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.account.view.*

class RecyclerViewAccountAdapter(private val context: Context, private val accounts: ArrayList<Account>)
    : RecyclerView.Adapter<RecyclerViewAccountAdapter.ViewHolder>() {

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val title = view.title
        val amount = view.amount
        val icon = view.icon
    }

    private fun getAccount(position: Int): Account {
        return accounts[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context)
            .inflate(R.layout.account, parent, false))
    }

    override fun getItemCount(): Int {
        return accounts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val account: Account = getAccount(position)
        holder.title?.text = account.name
        holder.amount?.text = account.amount.toString()
        holder.icon.setBackgroundResource(account.icon)
    }
}