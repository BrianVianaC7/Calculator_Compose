package com.example.calculator_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator_compose.ui.theme.Calculator_ComposeTheme
import com.example.calculator_compose.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculator_ComposeTheme {
                val viewModel = viewModel<ViewModelCalculator>()
                val state = viewModel.state
                val buttonSpacing = 12.dp
                calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier.fillMaxSize().background(MediumGray).padding(19.dp))
            }
        }
    }
}

