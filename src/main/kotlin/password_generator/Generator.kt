package com.erdemserhat.passwnote.password_generator

class Generator(val passwordParameters: PasswordParameters) {

    private var resString:String = ResourceString.define(passwordParameters)
    private lateinit var candidatePassword:String

    fun generate():String{
        candidatePassword=""

        var randomIx:Int

        while(passwordParameters.passwordLength!=candidatePassword.length){
            randomIx = (Math.random() * resString.length).toInt()
            candidatePassword+= resString[randomIx]
        }
       if(!PasswordValidation.validate(candidatePassword,passwordParameters)){
            generate()
        }

        return candidatePassword

    }




}