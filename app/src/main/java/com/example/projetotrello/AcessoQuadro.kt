import androidx.compose.foundation.layout.Column // Importe o Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Cabecalho(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Surface (
            color = Color(0, 127, 129),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ){ }

        Surface(
            color = Color(28,28,28),
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Trabalho A2",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                modifier = Modifier.padding(20.dp)
            )
        }

    }
}