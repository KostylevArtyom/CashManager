package com.example.cashmanager.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cashmanager.R
import com.example.cashmanager.SelectedAccounts
import com.example.cashmanager.model.Account
import com.example.cashmanager.model.AccountType
import kotlinx.android.synthetic.main.account.view.*

class RecyclerViewAccountAdapter(private val context: Context, private val accounts: ArrayList<Account>)
    : RecyclerView.Adapter<RecyclerViewAccountAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener {
        val title = view.title
        val amount = view.amount
        val icon = view.icon
        val selectedIcon = view.icon_selected

        override fun onClick(view: View?) {
            SelectedAccounts.setSelected(getAccountType(), adapterPosition)
            notifyDataSetChanged()
        }

        init {
            view.setOnClickListener(this)
        }
    }

    private fun getAccount(position: Int): Account {
        return accounts[position]
    }

    private fun getAccountType(): AccountType {
        return accounts[0].type
    }

    override fun getItemCount(): Int {
        return accounts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.account, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val account: Account = getAccount(position)
        holder.title?.text = account.name
        holder.amount?.text = account.amount.toString()
        holder.icon.setBackgroundResource(account.icon)
        if (position != SelectedAccounts.getSelected(getAccountType())) {
            holder.selectedIcon.visibility = View.INVISIBLE
        }
    }
}