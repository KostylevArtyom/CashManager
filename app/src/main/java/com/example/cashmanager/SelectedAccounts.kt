package com.example.cashmanager

import com.example.cashmanager.model.AccountType

object SelectedAccounts {
    private val selected: MutableMap<AccountType, Int?> = AccountType.values()
        .map { it to null }
        .toMap()
        .toMutableMap()

    fun getSelected(type: AccountType): Int? {
        return selected[type]
    }

    fun setSelected(type: AccountType, position: Int?) {
        selected[type] = position
        if (type == AccountType.INCOME) {
            selected[AccountType.EXPENSE] = null
        }
        if (type == AccountType.EXPENSE) {
            selected[AccountType.INCOME] = null
        }
    }
}