package com.erdemserhat.passwnote.password_generator

class PasswordParameters(
    var isCharacter: Boolean = true,
    var isUpperCase: Boolean = true,
    var isLowerCase: Boolean = true,
    var isNumerical: Boolean = true,
    var isSpecialCharacter: Boolean = true,
    var passwordLength: Int = 16
) {

}