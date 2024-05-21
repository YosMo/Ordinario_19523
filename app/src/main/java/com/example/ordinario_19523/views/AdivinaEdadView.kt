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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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


@Composable
fun AdivinaEdadView(navController: NavHostController) {
    var edad: Int
    var age by remember { mutableStateOf(0) }
    val edadf= 2023 - age

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),){


        OutlinedTextField(
            value = age.toString(),
            onValueChange = {age = it.toIntOrNull() ?:0},
            label = {Text(text = "Año de Nacimiento")},
            modifier = Modifier.fillMaxWidth()
        )


        Button(
            colors = ButtonDefaults.buttonColors(Color(0xFF487AB6)),
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.popBackStack() })
        {
            Text(text = "Calcular edad",
                color = Color(0xFFFFFFFF)
            )
        }

    }

    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Text(text = "Tu edad es ${edadf}",
                color = Color(0xFF673AB7)
            )
        }
    }

    Column(verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),) {
        Row(modifier = Modifier.fillMaxWidth()){
            Button(
                colors = ButtonDefaults.buttonColors(Color(0xFFFFFFFF)),
                onClick = { navController.popBackStack() })
            {
                Image (
                    painter = painterResource(id = R.drawable.flecha),
                    contentDescription = "Person",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(10.dp, 0.dp)

                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun AdivinaEdadViewPreview() {
    AdivinaEdadView(navController = rememberNavController())
}
