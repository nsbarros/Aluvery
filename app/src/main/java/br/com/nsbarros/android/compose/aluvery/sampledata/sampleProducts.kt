import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.com.nsbarros.android.compose.aluvery.model.Product
import java.math.BigDecimal


val sampleDrinks = listOf(
    Product(
        name = "Cerveja",
        price = BigDecimal("5.99"),
        image = "https://images.pexels.com/photos/1552630/pexels-photo-1552630.jpeg",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Refrigerante",
        price = BigDecimal("4.99"),
        image = "https://images.pexels.com/photos/2775860/pexels-photo-2775860.jpeg",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Suco",
        price = BigDecimal("7.99"),
        image = "https://images.pexels.com/photos/96974/pexels-photo-96974.jpeg",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Água",
        price = BigDecimal("2.99"),
        image = "https://images.pexels.com/photos/327090/pexels-photo-327090.jpeg",
        description = LoremIpsum(20).values.first()
    )
)

val sampleCandies = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("3.99"),
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Sorvete",
        price = BigDecimal("5.99"),
        image = "https://images.pexels.com/photos/1352278/pexels-photo-1352278.jpeg",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Bolo",
        price = BigDecimal("11.99"),
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
        description = LoremIpsum(20).values.first()
    )
)

val sampleProducts = listOf(

    Product(
        name = "Hamburguer",
        price = BigDecimal("14.99"),
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("10.99"),
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg"
    ),
    Product(
        name = "Batata frita",
        price = BigDecimal("12.99"),
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
        description = LoremIpsum(20).values.first()

    ), *sampleCandies.toTypedArray(),
    *sampleDrinks.toTypedArray()
)