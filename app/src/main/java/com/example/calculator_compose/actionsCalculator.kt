package com.example.calculator_compose

sealed class actionsCalculator{
    data class Number (val number: Int): actionsCalculator()
    object Clear : actionsCalculator()
    object Delete : actionsCalculator()
    object Decimal : actionsCalculator()
    object Calculate : actionsCalculator()
    data class Operation (val operation: operationCalculator): actionsCalculator()
}
