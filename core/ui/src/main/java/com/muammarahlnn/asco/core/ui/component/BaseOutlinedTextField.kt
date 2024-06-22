package com.muammarahlnn.asco.core.ui.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.muammarahlnn.asco.core.designsystem.theme.Black
import com.muammarahlnn.asco.core.designsystem.theme.Gray
import com.muammarahlnn.asco.core.designsystem.theme.PureWhite

/**
 * @Author Muammar Ahlan Abimanyu
 * @File PurpleOutlinedTextField, 20/06/2024 22.39
 */
@Composable
fun BaseOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    borderColor: Color = Color.Unspecified,
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        shape = RoundedCornerShape(8.dp),
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = imeAction,
        ),
        keyboardActions = keyboardActions,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = borderColor,
            unfocusedBorderColor = borderColor,
            focusedTextColor = Black,
            unfocusedTextColor = Gray,
            focusedContainerColor = PureWhite,
            unfocusedContainerColor = PureWhite,
        ),
        modifier = modifier,
    )
}