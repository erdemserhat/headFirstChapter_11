package password_generator

import com.erdemserhat.passwnote.password_generator.Digits
import com.erdemserhat.passwnote.password_generator.Generator
import com.erdemserhat.passwnote.password_generator.PasswordParameters

fun main(){
    val passwordParameters:PasswordParameters= PasswordParameters(
        isCharacter = true,
        isUpperCase = true,
        isLowerCase = true,
        isNumerical = true,
        isSpecialCharacter = true,
        passwordLength = 12
    )
    val generator:Generator= Generator(passwordParameters)
    println(generator.generate())
    //println(Digits.NUMERICAL.content)
}