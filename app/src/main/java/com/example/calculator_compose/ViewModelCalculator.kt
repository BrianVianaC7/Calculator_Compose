package com.example.calculator_compose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModelCalculator: ViewModel(){
    var state by mutableStateOf(stateCalculator())
    private set

    fun onAction(action: actionsCalculator) {
        when(action) {
            is actionsCalculator.Number -> enterNumber(action.number)
            is actionsCalculator.Decimal -> enterDecimal()
            is actionsCalculator.Clear -> state = stateCalculator()
            is actionsCalculator.Operation -> enterOperation(action.operation)
            is actionsCalculator.Calculate -> performcalculate()
            is actionsCalculator.Delete -> performdelete()
        }
    }

    private fun performdelete() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.numer1.isNotBlank() -> state = state.copy(
                numer1 = state.numer1.dropLast(1)
            )
        }
    }

    private fun performcalculate() {
        val number1 = state.numer1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = when(state.operation) {
                is operationCalculator.Add -> {
                    number1 + number2
                }
                is operationCalculator.Subtract -> {
                    number1 - number2
                }
                is operationCalculator.Multiply -> {
                    number1 * number2
                }
                is operationCalculator.Divide -> {
                    number1 / number2
                }
                is operationCalculator.porcentaje -> {
                    number1 * number2 / 100
                }
                null -> {
                    return
                }
                else -> {}
            }
            state = state.copy(
                numer1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }

    private fun enterOperation(operation: operationCalculator) {
        if(state.numer1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.numer1.contains(".") && state.numer1.isNotBlank()) {
            state = state.copy(
                numer1 = state.numer1 + "."
            )
            return
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    companion object {
        private const val MAX_NUM_LENGTH = 8
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.numer1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                numer1 = state.numer1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }

}