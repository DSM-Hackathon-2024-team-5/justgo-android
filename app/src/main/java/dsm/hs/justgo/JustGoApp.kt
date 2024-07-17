package dsm.hs.justgo

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dsm.hs.justgo.ui.achievement.AchievementScreen
import dsm.hs.justgo.ui.auth.AuthScreen
import dsm.hs.justgo.ui.destinationdetails.DestinationDetailsScreen
import dsm.hs.justgo.ui.home.HomeScreen
import dsm.hs.justgo.ui.lasttrips.LastTrips
import dsm.hs.justgo.ui.login.LoginScreen
import dsm.hs.justgo.ui.my.MyScreen
import dsm.hs.justgo.ui.register.RegisterScreen
import dsm.hs.justgo.ui.register.TermsScreen
import dsm.hs.justgo.ui.starttrip.StartTripScreen
import dsm.hs.justgo.ui.tripdetails.TripDetailsScreen

@Composable
fun JustGoApp(
    modifier: Modifier = Modifier,
) {
    val navController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = JustGoRoutes.REGISTER_TERMS.route,
    ) {
        composable(JustGoRoutes.AUTH.route) {
            AuthScreen()
        }
        composable(JustGoRoutes.LOGIN.route) {
            LoginScreen()
        }
        composable(JustGoRoutes.REGISTER.route) {
            RegisterScreen()
        }
        composable(JustGoRoutes.REGISTER_TERMS.route) {
            TermsScreen()
        }
        composable(JustGoRoutes.HOME.route) {
            HomeScreen()
        }
        composable(JustGoRoutes.ACHIEVEMENT.route) {
            AchievementScreen()
        }
        composable(JustGoRoutes.START_TRIP.route) {
            StartTripScreen()
        }
        composable(JustGoRoutes.DESTINATION_DETAILS.route) {
            DestinationDetailsScreen()
        }
        composable(JustGoRoutes.MY_INFO.route) {
            MyScreen()
        }
        composable(JustGoRoutes.LAST_TRIPS.route) {
            LastTrips()
        }
        composable(JustGoRoutes.SAVED_TRIPS.route) {

        }
        composable(JustGoRoutes.TRIP_DETAILS.route) {
            TripDetailsScreen()
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
    HOME(
        route = "home",
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
