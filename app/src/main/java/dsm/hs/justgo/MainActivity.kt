package dsm.hs.justgo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dsm.hs.justgo.ui.home.HomeScreen
import dsm.hs.justgo.ui.theme.JustGoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JustGoTheme {
                JustGoApp()
            }
        }
    }
}