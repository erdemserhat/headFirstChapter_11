package com.erdemserhat.passwnote.password_generator

class ResourceString() {

    companion object{
    private var resDigits:String = ""
    fun define(passwordParameters: PasswordParameters):String{
        if(passwordParameters.isCharacter){
            if(passwordParameters.isUpperCase) resDigits+=Digits.UPPER_CHARACTERISTIC.content
            if(passwordParameters.isLowerCase) resDigits+=Digits.LOWER_CHARACTERISTIC.content
        }

        if(passwordParameters.isNumerical) resDigits+=Digits.NUMERICAL.content
        if (passwordParameters.isSpecialCharacter) resDigits+=Digits.SPECIAL_CHARACTERISTIC.content
        return resDigits
    }
    }
}