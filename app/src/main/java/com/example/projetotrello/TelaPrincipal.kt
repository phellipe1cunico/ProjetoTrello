package com.example.projetotrello

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class TelaPrinciapl : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        }
    }
}


@Preview
@Composable
fun TelaInicial() {


    Scaffold {
            innerPadding ->
        val context = LocalContext.current

        /*Variavel com nome dos quadros*/
        var listaDeQuadros = listOf("Faculdade", "Trabalho")

        Surface(
            color = Color(28, 28, 28),
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ){

            Column {
                CriarQuadro()
                Spacer(modifier = Modifier.height(30.dp))

                LazyColumn {
                    items(listaDeQuadros) { quadros ->
                        ListaQuadros(quadros)
                    }
                }

            }
        }
    }
}

/*Função para criar os quadros*/
@Composable
fun CriarQuadro() {

    var nomeQuadro by remember {
        mutableStateOf("Nome do Quadro")
    }

    Row(


        modifier = Modifier.fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ){

        TextField(
            value = nomeQuadro,
            onValueChange = { nomeQuadro = it},
            modifier = Modifier.width(250.dp),
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { Log.d("Nome do Quadro", nomeQuadro) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0, 206, 209),
                contentColor = Color.Black
            )
        ) {

            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "",
                modifier = Modifier.size(30.dp)
            )
        }

    }
}

/*Cards com a lista de quadros do usuário*/
@Composable
fun ListaQuadros(quadros: String){
    Card(
        colors = CardDefaults.cardColors(Color(192, 192, 192)),
        modifier = Modifier.fillMaxWidth()
            .padding(5.dp)
    ){

        Row(
            modifier = Modifier.padding(5.dp)
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(15.dp))

            Column{
                Text(quadros, style = MaterialTheme.typography.bodyMedium)

            }

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "",
                modifier = Modifier.size(30.dp)
            )

        }

    }
}