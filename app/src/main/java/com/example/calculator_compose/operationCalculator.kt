package com.example.calculator_compose

sealed class operationCalculator(val sumbol: String){
    object Add: operationCalculator("+")
    object Subtract: operationCalculator("-")
    object Multiply: operationCalculator("x")
    object Divide: operationCalculator("/")
    object porcentaje: operationCalculator("%")
}
