package com.lod.rtviwe.tport.listeners

interface RegisterStepOneListener {

    fun onRegisterStepOneContinue(phoneNumber: String)

    fun savePhoneNumber(phoneNumber: String)
}

interface RegisterStepTwoListener {

    fun onRegisterStepTwoContinue()

    fun saveCode(code: String)
}

interface RegisterStepThreeListener {

    fun onRegisterStepThreeContinue()
}
