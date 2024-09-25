package com.example.boom.ui.theme.screens.dashboard

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.boom.R
import com.example.boom.navigation.ROUT_GIRLS

import com.example.boom.navigation.ROUT_HOME
import com.example.boom.navigation.ROUT_KIDS
import com.example.boom.navigation.ROUT_MEN


@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text ="Sneaker Hub",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
        )
        Text(
                text ="Your better choice",
        fontSize = 10.sp,
        fontFamily = FontFamily.SansSerif,
        color = Color.Black,
        )
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.dcover) ,
            contentDescription ="home",
            modifier = Modifier
                .clickable {  navController.navigate(
                    ROUT_HOME
                ) }
                .size(400.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(30.dp))

        Column {
            //Start of main Card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(50.dp),
                colors = CardDefaults.cardColors(Color.Black)
            ) {
                //Row1
                Row {
                    //Card1
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(20.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.kids) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .clickable {  navController.navigate(
                                        ROUT_KIDS
                                    ) }
                                        .size(180.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

                        }

                    }
                    //End of card
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(180.dp)
                            .padding(20.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.gents) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .clickable {  navController.navigate(
                                            ROUT_MEN
                                        ) }
                                        .size(180.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

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
                            .padding(20.dp)) {
                        Column {
                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.ladies1) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .clickable {  navController.navigate(
                                            ROUT_GIRLS
                                        ) }
                                        .size(180.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

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
                                    painter = painterResource(id = R.drawable.home) ,
                                    contentDescription ="home",
                                    modifier = Modifier
                                        .size(180.dp),
                                    contentScale = ContentScale.Crop

                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(modifier = Modifier.fillMaxWidth(),
                                text ="Home",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )

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
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}
