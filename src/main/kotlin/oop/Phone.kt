package oop

class Phone {
    var name:String
    var os:String
    var charger:String

    constructor(name: String, os: String, charger: String) {
        this.name = name
        this.os = os
        this.charger = charger
    }
    fun call(phoneNumber:String) {
        println("i can call the number $phoneNumber")
    }
    fun sms(phoneNumber: String){
        println("i can sms the number $phoneNumber")

    }
    fun hungUp(){
        println("i can hung up the call")
    }





}