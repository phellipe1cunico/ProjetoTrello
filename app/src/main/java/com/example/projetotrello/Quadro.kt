package com.example.projetotrello




import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projetotrello.ui.theme.ProjetoTrelloTheme




class Quadro : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            ProjetoTrelloTheme {
                Tela1()
            }
        }
    }
}

@Preview
@Composable
fun Tela1() {
    Column {
        TelaQuadro1()
        Spacer(modifier = Modifier.height(20.dp))

    }
}


//@Preview(showBackground = true)
@Composable
fun TelaQuadro1() {
    Scaffold { innerPadding ->
        Surface(
            color = Color.White,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color(28, 28, 28)),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                    ) {

                        Text(
                            text = "Desenvolvimento Mobile",
                            style = MaterialTheme.typography.headlineSmall,
                            color = Color.White,
                            modifier = Modifier.padding(bottom = 10.dp)
                        )

                        Card(
                            colors = CardDefaults.cardColors(containerColor = Color(0, 127, 129)),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp)
                        ) {
                            
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp),
                            ){

                                Icon(
                                    imageVector = Icons.Default.Edit,
                                    contentDescription = "",
                                    tint = Color.White,
                                    modifier = Modifier.size(24.dp)
                                )

                                Column {

                                    Text(
                                        "Trabalho A2",
                                        style = MaterialTheme.typography.bodyLarge,
                                        color = Color.White,
                                        modifier = Modifier.padding(horizontal = 8.dp)
                                    )

                                    Row(
                                        modifier = Modifier.padding(vertical = 5.dp)
                                    ){

                                        Icon(
                                            imageVector = Icons.Default.DateRange,
                                            contentDescription = "",
                                            modifier = Modifier
                                                .size(20.dp)
                                            ,
                                            tint = Color.White
                                        )
                                        Text(
                                            "28/08/2025",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = Color.White,
                                            modifier = Modifier.padding(horizontal = 10.dp)
                                        )
                                    }
                                }


                            }
                        }
                    }

                    AddCard()
                }
            }
        }
    }
}

@Composable
fun AddCard() {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "Adicionar Quadro",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White,
        )

    }
}