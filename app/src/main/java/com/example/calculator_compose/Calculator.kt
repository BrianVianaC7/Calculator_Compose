package com.example.calculator_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator_compose.ui.theme.LightGray
import com.example.calculator_compose.ui.theme.Orange
import org.w3c.dom.Text
import java.lang.reflect.Modifier

@Composable
fun calculator(
    state: stateCalculator,
    buttonSpacing: Dp = 8.dp,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier,
    onAction: (actionsCalculator) -> Unit

) {
    Box(modifier = modifier) {
        Column(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.numer1 + (state.operation?.sumbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = androidx.compose.ui.Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                btCalculator(
                    symbol = "AC",
                    modifier = androidx.compose.ui.Modifier.background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                            onAction (actionsCalculator.Clear)

                    }
                )
                btCalculator(
                    symbol = "\u232B",
                    modifier = androidx.compose.ui.Modifier.background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Delete)

                    }
                )
                btCalculator(
                    symbol = "\u0025",
                    modifier = androidx.compose.ui.Modifier.background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Operation(operationCalculator.porcentaje))
                    }
                )
                btCalculator(
                    symbol = "\u00F7",
                    modifier = androidx.compose.ui.Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Operation(operationCalculator.Divide))
                    }
                )
            }
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                btCalculator(
                    symbol = "7",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(7))

                    }
                )
                btCalculator(
                    symbol = "8",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(8))

                    }
                )
                btCalculator(
                    symbol = "9",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(9))

                    }
                )
                btCalculator(
                    symbol = "\u00D7",
                    modifier = androidx.compose.ui.Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Operation(operationCalculator.Multiply))

                    }
                )
            }
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                btCalculator(
                    symbol = "4",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(4))

                    }
                )
                btCalculator(
                    symbol = "5",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(5))

                    }
                )
                btCalculator(
                    symbol = "6",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(6))

                    }
                )
                btCalculator(
                    symbol = "\u2212",
                    modifier = androidx.compose.ui.Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Operation(operationCalculator.Subtract))

                    }
                )
            }
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                btCalculator(
                    symbol = "1",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(1))

                    }
                )
                btCalculator(
                    symbol = "2",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(2))

                    }
                )
                btCalculator(
                    symbol = "3",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Number(3))

                    }
                )
                btCalculator(
                    symbol = "\u002B",
                    modifier = androidx.compose.ui.Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Operation(operationCalculator.Add))

                    }
                )
            }
            Row(
                modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                btCalculator(
                    symbol = "0",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(actionsCalculator.Number(0))
                    },
                    alignStart = true // Alineación personalizada para el texto del botón "0"
                )
                btCalculator(
                    symbol = ".",
                    modifier = androidx.compose.ui.Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Decimal)

                    }
                )
                btCalculator(
                    symbol = "\u003D",
                    modifier = androidx.compose.ui.Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f), onClick = {
                        onAction (actionsCalculator.Calculate)

                    }
                )
            }

        }
    }

}