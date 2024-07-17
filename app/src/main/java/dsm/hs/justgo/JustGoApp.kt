package dsm.hs.justgo

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dsm.hs.justgo.ui.auth.AuthScreen

@Composable
fun JustGoApp(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = JustGoRoutes.AUTH.route,
    ) {
        composable(JustGoRoutes.AUTH.route) {
            AuthScreen()
        }
        composable(JustGoRoutes.LOGIN.route) {

        }
        composable(JustGoRoutes.REGISTER.route) {

        }
        composable(JustGoRoutes.REGISTER_TERMS.route) {

        }
        composable(JustGoRoutes.MAIN.route) {

        }
        composable(JustGoRoutes.ACHIEVEMENT.route) {

        }
        composable(JustGoRoutes.START_TRIP.route) {

        }
        composable(JustGoRoutes.DESTINATION_DETAILS.route) {

        }
        composable(JustGoRoutes.MY_INFO.route) {

        }
        composable(JustGoRoutes.LAST_TRIPS.route) {

        }
        composable(JustGoRoutes.SAVED_TRIPS.route) {

        }
        composable(JustGoRoutes.TRIP_DETAILS.route) {

        }
    }
}

enum class JustGoRoutes(
    val route: String,
) {
    AUTH(
        route = "auth",
    ),
    LOGIN(
        route = "login",
    ),
    REGISTER(
        route = "register",
    ),
    REGISTER_TERMS(
        route = "register_terms",
    ),
    MAIN(
        route = "main",
    ),
    ACHIEVEMENT(
        route = "achievement",
    ),
    START_TRIP(
        route = "start_trip",
    ),
    DESTINATION_DETAILS(
        route = "destination_details",
    ),
    MY_INFO(
        route = "my_info",
    ),
    LAST_TRIPS(
        route = "last_trips",
    ),
    SAVED_TRIPS(
        route = "saved_trips",
    ),
    TRIP_DETAILS(
        route = "trip_details",
    ),
}
