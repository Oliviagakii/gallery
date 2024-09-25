package com.example.boom.ui.theme.screens.signup




import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding


import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.boom.R
import com.example.boom.data.AuthViewModel
import com.example.boom.navigation.ROUT_LOGIN


@Composable
fun SignupScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.homescreen), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,

        ){
        Spacer(modifier = Modifier.height(90.dp))




        Text(
            text ="Sneaker Hub",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
        )

        val name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }




        OutlinedTextField(value = email, onValueChange = {email =it},
            label = { Text("Enter Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            leadingIcon ={ Icon(imageVector = Icons.Default.Email, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


        )

        OutlinedTextField(value = password, onValueChange = {password =it},
            label = { Text("Enter password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            leadingIcon ={ Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()


        )

        OutlinedTextField(value = confpassword, onValueChange = {confpassword =it},
            label = { Text("Confirm password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            leadingIcon ={ Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()



        )
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Button(
            onClick = {authViewModel.signup(name, email, password,confpassword) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            shape = RoundedCornerShape(10.dp)



        ) {

            Text(
                text = "Create an account",
                fontSize = 21.sp

            )

        }

        Spacer(modifier = Modifier.height(10.dp))


        Button(
            onClick = { navController.navigate(ROUT_LOGIN) },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            shape = RoundedCornerShape(10.dp)



        )
        {

            Text(
                text = "login",
                fontSize = 21.sp

            )

        }







    }




}
@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())




}