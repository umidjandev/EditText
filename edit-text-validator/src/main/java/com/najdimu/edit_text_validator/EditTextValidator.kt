package com.najdimu.edit_text_validator

import android.widget.EditText

 object EditTextValidator {

    fun showError(editText: EditText, message: String) {
        editText.setError(message)
        editText.requestFocus()
    }

}