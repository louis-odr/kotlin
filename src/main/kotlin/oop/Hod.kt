package oop

class Hod(name:String,
    email:String,
    password:String):Teacher(name,email,password){
        fun suspendTeacher(){
            println("Yeah,i can suspend a teacher")
        }
    fun schedulemeeting(){
        println("Yeah,i can schedule sa meeting")
    }


    }