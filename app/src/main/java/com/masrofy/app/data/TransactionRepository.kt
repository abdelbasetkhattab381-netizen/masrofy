package com.masrofy.app.data

import com.masrofy.app.model.Transaction
import com.masrofy.app.model.TransactionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TransactionRepository {
    private val _transactions = MutableStateFlow<List<Transaction>>(emptyList())
    val transactions: StateFlow<List<Transaction>> = _transactions.asStateFlow()

    fun addTransaction(transaction: Transaction) {
        _transactions.value = (listOf(transaction) + _transactions.value).sortedByDescending { it.timestamp }
    }

    fun deleteTransaction(id: Long) {
        _transactions.value = _transactions.value.filter { it.id != id }
    }

    fun totalIncome(): Double = _transactions.value
        .filter { it.type == TransactionType.INCOME }
        .sumOf { it.amount }

    fun totalExpenses(): Double = _transactions.value
        .filter { it.type == TransactionType.EXPENSE }
        .sumOf { it.amount }

    fun netBalance(): Double = totalIncome() - totalExpenses()

    fun expensePercentage(): Float {
        val income = totalIncome()
        if (income == 0.0) return 0f
        return ((totalExpenses() / income) * 100).toFloat().coerceIn(0f, 100f)
    }

    private var nextId = 1L
    fun nextId(): Long = nextId++
}
