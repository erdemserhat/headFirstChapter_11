package com.erdemserhat.passwnote.password_generator

class PasswordValidation {


    companion object{
        fun validate(candidatePassword:String, passwordParameters: PasswordParameters):Boolean{
            if(passwordParameters.isNumerical && !containChar(candidatePassword,Digits.NUMERICAL.content)) return false
            if(passwordParameters.isCharacter){
                if(passwordParameters.isLowerCase && !containChar(candidatePassword,Digits.LOWER_CHARACTERISTIC.content)) return false
                if(passwordParameters.isUpperCase && !containChar(candidatePassword,Digits.UPPER_CHARACTERISTIC.content)) return  false
            }
            if(passwordParameters.isSpecialCharacter && !containChar(candidatePassword,Digits.SPECIAL_CHARACTERISTIC.content)) return false

            return true
        }

        private fun containChar(password:String, targetStr:String):Boolean{
            for(targetElement in targetStr){
                if(password.contains(targetElement)) return true
            }
            return false
        }

    }
}