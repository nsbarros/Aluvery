package br.com.nsbarros.android.compose.aluvery

import ProductItem
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.nsbarros.android.compose.aluvery.ui.theme.AluveryTheme
import sampleProducts

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AluveryTheme {
                App()
            }
        }
    }
}


@Composable
fun App(modifier: Modifier = Modifier) {
    ProductItem(
        sampleProducts[0],
        Modifier)
}

@Preview(name = "AppPreview", showBackground = true)
@Composable
private fun AppPreview() {
        App()
}