package com.example.boom.ui.theme.screens.men


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.boom.R
import com.example.boom.navigation.ADD_PRODUCTS_URL
import com.example.boom.navigation.ROUT_HOME


@Composable
fun MenScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text ="Sneakers for men",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )
        Text(
            text ="Your better choice",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter = painterResource(id = R.drawable.mcover2) ,
            contentDescription ="home",
            modifier = Modifier
                .size(300.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text ="Click on product to add to cart",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Black,
        )
        Column {
            //Start of main Card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(50.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                //Row1
                Row {
                    //Card1
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(10.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.m1) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(180.dp).clickable {  ADD_PRODUCTS_URL },
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))


                        }

                    }
                    //End of card
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(10.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.m2) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(180.dp).clickable {  ADD_PRODUCTS_URL },
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))


                        }

                    }
                    //End of card
                }
                //End of Row

                //Row2
                Row {
                    //Card1
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(10.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.m3) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(180.dp).clickable {  ADD_PRODUCTS_URL },
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))


                        }

                    }
                    //End of card
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(20.dp)
                            .clickable { navController.navigate(ROUT_HOME) }) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.m4) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(180.dp).clickable {  ADD_PRODUCTS_URL },
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))


                        }

                    }
                    //End of card
                }
            }


        }
    }


























}
@Composable
@Preview(showBackground = true)
fun MenScreenPreview(){
    MenScreen(rememberNavController())
}



