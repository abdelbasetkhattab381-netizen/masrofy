package com.masrofy.app.model

data class Transaction(
    val id: Long = 0,
    val amount: Double,
    val type: TransactionType,
    val category: String,
    val note: String,
    val timestamp: Long
)

enum class TransactionType { INCOME, EXPENSE }
