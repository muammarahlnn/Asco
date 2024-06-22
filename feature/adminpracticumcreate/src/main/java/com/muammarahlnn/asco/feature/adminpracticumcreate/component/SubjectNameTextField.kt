package com.muammarahlnn.asco.feature.adminpracticumcreate.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import com.muammarahlnn.asco.core.designsystem.theme.DarkerPurple
import com.muammarahlnn.asco.core.ui.component.BaseOutlinedTextField

/**
 * @Author Muammar Ahlan Abimanyu
 * @File SubjectNameTextField, 20/06/2024 22.37
 */
@Composable
internal fun SubjectNameTextField(
    subjectName: String,
    onSubjectNameChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    BaseOutlinedTextField(
        value = subjectName,
        onValueChange = onSubjectNameChange,
        borderColor = DarkerPurple,
        imeAction = ImeAction.Next,
        modifier = modifier,
    )
}