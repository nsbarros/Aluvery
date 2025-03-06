import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.nsbarros.android.compose.aluvery.model.Product

@Composable
fun ProductSection(name: String, products: List<Product>, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(name, Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400),

        )
        LazyRow(contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            items(products){ produto ->
                ProductItem(produto)
            }
        }
    }
}

@Preview(name = "ProductSectionPreview", showBackground = true)
@Composable
private fun ProductSectionPreview() {
        ProductSection("Pizza", sampleProducts)
}