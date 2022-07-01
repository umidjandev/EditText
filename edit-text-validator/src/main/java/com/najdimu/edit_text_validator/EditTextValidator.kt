package com.najdimu.edit_text_validator

import android.widget.EditText

class EditTextValidator {

    fun showError(editText: EditText, message: String) {
        editText.setError(message)
        editText.requestFocus()
    }

}