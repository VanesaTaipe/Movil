package com.example.pc1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pc1.ui.theme.Pc1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pc1Theme {
                presentacion()
            }
        }
    }

    @Composable
    fun presentacion(modifier: Modifier = Modifier) {
        val perfilImage = painterResource(id = R.drawable.perfila)
        val telefIcon = painterResource(id = R.drawable.images)
        val socialIcon = painterResource(id = R.drawable.correo)
        val emailIcon = painterResource(id = R.drawable.correo)
        val context = LocalContext.current
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))

            // Perfil
            Image(
                painter = perfilImage,
                contentDescription = "Perfil",
                modifier = Modifier.size(120.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Full Name", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Text(text = "Title", fontSize = 18.sp)

            Spacer(modifier = Modifier.weight(1f))

            //Telefono
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = telefIcon,
                    contentDescription = "Telefono",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "+00 (00) 000 000", fontSize = 15.sp)
            }

            Spacer(modifier = Modifier.height(8.dp))

            //Correo1
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = socialIcon,
                    contentDescription = "Social",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "@socialmediahandle", fontSize = 15.sp)
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Correo2
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = emailIcon,
                    contentDescription = "Email",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "email@domain.com", fontSize = 15.sp)
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}