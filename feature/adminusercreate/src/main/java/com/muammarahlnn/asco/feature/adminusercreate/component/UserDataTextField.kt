package com.muammarahlnn.asco.feature.adminusercreate.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File TextField, 18/06/2024 19.15
 */
@Composable
internal fun UserDataTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    keyboardType: KeyboardType = KeyboardType.Unspecified,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        shape = RoundedCornerShape(8.dp),
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = ImeAction.Next,
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = DarkerPurple,
            unfocusedBorderColor = DarkerPurple,
            focusedTextColor = Black,
            unfocusedTextColor = Gray,
            focusedContainerColor = PureWhite,
            unfocusedContainerColor = PureWhite,
        ),
        modifier = modifier,
    )
}