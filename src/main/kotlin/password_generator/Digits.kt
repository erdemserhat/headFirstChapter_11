package com.erdemserhat.passwnote.password_generator

enum class Digits(val content: String) {
    NUMERICAL("0123456789"),
    UPPER_CHARACTERISTIC("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    LOWER_CHARACTERISTIC("abcdefghijklmnopqrstuvwxyz"),
    SPECIAL_CHARACTERISTIC("!#\$%&'()*+,-./:;<=>?@[]^_`{|}~")


}