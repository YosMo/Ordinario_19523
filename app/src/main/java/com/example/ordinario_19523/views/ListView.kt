package com.example.ordinario_19523.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ordinario_19523.R
import com.example.ordinario_19523.components.EdadCard
import com.example.ordinario_19523.viewmodels.CardsModels


@Composable
fun ListView(navController: NavHostController) {

    //Variables
    var prompt: String by remember { mutableStateOf("") }
    var switchColor: Boolean = true
    var color: Color = Color(0xFFF9EBCF)
    val GamesViewModel = CardsModels()


    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
    ) {
        Column () {

            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text(text = "LazyColumn Ordinario",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive,
                    color = Color(0xFF000000)
                )

                Button(
                    onClick = { navController.popBackStack() },
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFFFF)),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.edson),
                        contentDescription = "Flecha",
                        modifier = Modifier
                            .width(35.dp)
                            .height(20.dp)

                    )


                }}


                Spacer(modifier = Modifier.height(20.dp))

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn {
                items(GamesViewModel.getCardList()) {
                        data ->
                    val playerString = "${data.titulo} - ${data.num}"

                    if (playerString.contains(prompt, ignoreCase = true)) {
                        EdadCard(navController, data)
                        Spacer(modifier = Modifier.height(10.dp))

                    }}
            }

            }
        }




    }



@Preview(showBackground = true)
@Composable
fun Preview_List() {
    ListView(navController = rememberNavController())
}