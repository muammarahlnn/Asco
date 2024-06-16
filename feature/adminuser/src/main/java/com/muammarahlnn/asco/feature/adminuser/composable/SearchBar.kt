package com.muammarahlnn.asco.feature.adminuser.composable

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite
import com.muammarahlnn.asco.feature.adminuser.R

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SearchBar, 16/06/2024 01.45
 */
@Composable
internal fun SearchBar(
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Rounded.Search,
                contentDescription = stringResource(id = R.string.search_placeholder),
                tint = DarkerPurple,
            )
        },
        placeholder = {
            Text(
                text = stringResource(id = R.string.search_placeholder),
                style = MaterialTheme.typography.bodySmall,
                color = DarkerPurple,
            )
        },
        shape = RoundedCornerShape(8.dp),
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search,
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = DarkerPurple,
            unfocusedBorderColor = DarkerPurple,
            focusedTextColor = Gray,
            unfocusedTextColor = Gray,
            focusedContainerColor = PureWhite,
            unfocusedContainerColor = PureWhite,
        ),
        modifier = modifier,
    )
}