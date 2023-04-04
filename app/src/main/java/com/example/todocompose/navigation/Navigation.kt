package com.example.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.todocompose.navigation.destinations.listComposable
import com.example.todocompose.navigation.destinations.taskComposable
import com.example.todocompose.ui.viewmodels.SharedViewModel
import com.example.todocompose.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screens = remember(navController) {
        Screens(navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screens.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screens.list
        )
    }
}