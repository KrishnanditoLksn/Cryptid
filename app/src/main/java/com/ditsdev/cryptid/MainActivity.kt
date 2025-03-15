package com.ditsdev.cryptid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ditsdev.cryptid.ui.theme.CryptidTheme
import com.ditsdev.cryptid.ui.theme.components.TopAppBarItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptidTheme {
                CryptidApp()
            }
        }
    }
}

@Composable
fun CryptidApp(modifier: Modifier = Modifier) {
    TopAppBarItem(modifier)
}

@Preview(showBackground = true)
@Composable
fun CryptidPreview() {
    CryptidTheme {
        CryptidApp()
    }
}