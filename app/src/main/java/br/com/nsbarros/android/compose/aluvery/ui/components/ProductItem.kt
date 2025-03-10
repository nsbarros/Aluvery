import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.nsbarros.android.compose.aluvery.R
import br.com.nsbarros.android.compose.aluvery.model.Product
import br.com.nsbarros.android.compose.aluvery.ui.theme.Purple40
import br.com.nsbarros.android.compose.aluvery.ui.theme.PurpleGrey40
import coil3.compose.AsyncImage

@Composable
fun ProductItem(product: Product, modifier: Modifier = Modifier) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 5.dp,
        modifier = modifier
    ) {

        Column(
            modifier = Modifier
                .width(200.dp)
                .heightIn(260.dp, 260.dp)
                .verticalScroll(rememberScrollState())
        ) {

            val sizeImage = 100.dp
            Box(
                Modifier
                    .height(100.dp)
                    .width(200.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple40, PurpleGrey40
                            )
                        )
                    )
            ) {
                AsyncImage(
                    model = product.image,
                    contentDescription = stringResource(id = R.string.description_image_product),
                    modifier = Modifier
                        .offset(x = (sizeImage / 2), y = (sizeImage / 2))
                        .size(sizeImage)
                        .clip(shape = CircleShape)
                        .align(Alignment.CenterStart),
                    contentScale = ContentScale.Crop,
                    placeholder = painterResource(R.drawable.placeholder),
                )
            }

            Spacer(Modifier.height(sizeImage / 2))

            Column(Modifier.padding(16.dp)) {
                Text(
                    product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    product.price.toBrazilianCurrency(),
                    Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }

            product.description?.let {
                Box(Modifier.background(color = Purple40).padding(16.dp)) {
                    Text(
                        product.description,
                        Modifier.padding(16.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400)
                    )
                }
            }

        }

    }
}

@Preview(name = "ProductItemPreview", showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        sampleProducts[0],
        Modifier
    )
}