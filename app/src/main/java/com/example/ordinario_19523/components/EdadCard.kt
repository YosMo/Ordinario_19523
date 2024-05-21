package com.example.ordinario_19523.components
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ordinario_19523.R
import com.example.ordinario_19523.models.Data


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EdadCard(navController: NavHostController, data: Data ) {


    Card(modifier = Modifier
        .padding(20.dp,10.dp,20.dp,10.dp),
        onClick = {
            navController.navigate("AdivinaEdadView" +
                    "/${data.num}" +
                    "/${data.titulo}"+
                    "/${data.imagen}")
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Black.copy(alpha = 0.8f)),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {


            Spacer(modifier = Modifier.width(18.dp))

            Column (modifier = Modifier.padding(10.dp,20.dp,10.dp,20.dp)) {
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "# ${data.num}",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFE43A4E),
                        fontSize = 50.sp
                    )

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Image(
                            painter = painterResource(id = data.imagen),
                            contentDescription = "Imagen",
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(80.dp)
                        )

                        Text(
                            text = "${data.titulo}",
                            color = Color(0xFFFFFFFF),
                            fontSize = 20.sp
                        )


                    }


                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    EdadCard(
        navController = rememberNavController(),
        data = Data(2,"GATO", R.drawable.gato)
    )
}