package com.muammarahlnn.asco.feature.adminpracticumcreate.component

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForwardIos
import androidx.compose.material.icons.rounded.ArrowBackIosNew
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.core.ui.component.AscoDarkCenteredTopAppBar
import com.muammarahlnn.asco.feature.adminpracticumcreate.CurrentPage
import com.muammarahlnn.asco.feature.adminpracticumcreate.CurrentPage.*
import com.muammarahlnn.asco.feature.adminpracticumcreate.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AdminPracticumCreateTopAppBar, 20/06/2024 22.26
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun AdminPracticumCreateTopAppBar(
    currentPage: CurrentPage,
    onCloseClick: () -> Unit,
    onNextClick: () -> Unit,
    onPreviousClick: () -> Unit,
    onDoneCreatePracticumClick: () -> Unit,
    onDoneSelectAssistantClick: () -> Unit,
) {
     AscoDarkCenteredTopAppBar(
         title = when (currentPage) {
             FIRST,
             SECOND -> stringResource(
                 id = R.string.add_practicum,
                 currentPage.ordinal + 1,
             )
             SELECT_ASSISTANT -> stringResource(R.string.assistant)
             CREATE_BADGE -> stringResource(id = R.string.class_badge)
         },
         navigationIcon = {
             AnimatedContent(
                 targetState = currentPage,
                 label = "Navigation icon animation",
             ) {
                 val backIcon = @Composable {
                     Icon(
                         imageVector = Icons.Rounded.ArrowBackIosNew,
                         contentDescription = null,
                         tint = PureWhite,
                     )
                 }

                 when (it) {
                     FIRST -> IconButton(onClick = onCloseClick) {
                         Icon(
                             imageVector = Icons.Rounded.Close,
                             contentDescription = null,
                             tint = PureWhite,
                             modifier = Modifier.size(28.dp),
                         )
                     }

                     SECOND,
                     CREATE_BADGE -> IconButton(onClick = onPreviousClick) {
                         backIcon()
                     }

                     SELECT_ASSISTANT -> IconButton(onClick = onNextClick) {
                         backIcon()
                     }
                 }
             }
         },
         actions = {
             AnimatedContent(
                 targetState = currentPage,
                 label = "Action icon animation",
             ) {
                 val doneIcon = @Composable {
                     Icon(
                         imageVector = Icons.Rounded.Check,
                         contentDescription = null,
                         tint = PureWhite,
                         modifier = Modifier.size(28.dp),
                     )
                 }

                 when (it) {
                     FIRST -> IconButton(onClick = onNextClick) {
                         Icon(
                             imageVector = Icons.AutoMirrored.Rounded.ArrowForwardIos,
                             contentDescription = null,
                             tint = PureWhite,
                         )
                     }

                     SECOND -> IconButton(onClick = onDoneCreatePracticumClick) {
                         doneIcon()
                     }

                     SELECT_ASSISTANT -> IconButton(onClick = onDoneSelectAssistantClick) {
                         doneIcon()
                     }

                     else -> Unit
                 }
             }
         }
     )
}