package com.example.calculator_compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun btCalculator(symbol:String, modifier: androidx.compose.ui.Modifier, onClick: ()-> Unit, alignStart: Boolean = false){

    val plusSymbol = "\u002B" // Símbolo de "más" (+) Unicode
    val minusSymbol = "\u2212" // Símbolo de "menos" más grande
    val multiplicationSymbol = "\u00D7" // Símbolo de "multiplicación" (×) Unicode
    val divisionSymbol = "\u00F7" // Símbolo de "división" (÷) Unicode
    val equalSymbol = "\u003D" // Símbolo de "igual" (=) Unicode
    val percentageSymbol = "\u0025" // Símbolo de "porcentaje" (%) Unicode
    val deleteSymbol = "\u232B" // Símbolo de "borrar" (⌫) Unicode

    val fontSize = when (symbol) {
        ".", minusSymbol, plusSymbol, multiplicationSymbol, divisionSymbol, equalSymbol, percentageSymbol -> 50.sp
        "DEL", "AC" -> 34.sp
        deleteSymbol -> 45.sp
        else -> 45.sp
    }

    Box(
        contentAlignment = if (alignStart) Alignment.CenterStart else Alignment.Center,
        modifier = androidx.compose.ui.Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(text = symbol,
            fontSize = fontSize,
            color = Color.White,
            modifier = androidx.compose.ui.Modifier.padding(start = if (alignStart) 30.dp else 0.dp)
            )

    }

}