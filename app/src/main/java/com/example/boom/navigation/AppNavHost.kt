package com.example.boom.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.boom.ui.theme.screens.dashboard.DashboardScreen
import com.example.boom.ui.theme.screens.girls.GirlsScreen
import com.example.boom.ui.theme.screens.home.HomeScreen
import com.example.boom.ui.theme.screens.kids.KidsScreen
import com.example.boom.ui.theme.screens.login.LoginScreen
import com.example.boom.ui.theme.screens.men.MenScreen
import com.example.boom.ui.theme.screens.products.AddProductsScreen
import com.example.boom.ui.theme.screens.products.ViewProductsScreen
import com.example.boom.ui.theme.screens.signup.SignupScreen
import com.example.boom.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUT_KIDS) {
            KidsScreen(navController = navController)
        }
        composable(ROUT_GIRLS) {
            GirlsScreen(navController = navController)
        }
        composable(ROUT_MEN) {
            MenScreen(navController = navController)
        }



        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }

    }

}



