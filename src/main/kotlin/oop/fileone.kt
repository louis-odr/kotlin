package oop

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstCar = Car("Prado", "v8", "KDM007J")
    var secondCar = Car("mercedes", "C200", "KDJ900K")
    println(secondCar.model)


    var firstFruit = Fruit("mango", "yellow", 35.00)
    var secondFruit = Fruit("apple", "pink", 40.00)
    println(firstFruit.name)

    var firstPhone = Phone("iphone", "IOS", "TypeC")
    var secondPhone = Phone("samsung", "Android", "TypeC")
    firstPhone.call("070099899")

    var firstStudent = Student("Louis", "Louis@test", "pass123")

    firstStudent.register()
    firstStudent.login()
    firstStudent.logout()


    var firstTeacher = Teacher(
        "wanyama",
        "wanyama@test.com", "123pass"
    )

    firstTeacher.register()
    firstTeacher.login()
    firstTeacher.logout()
    firstTeacher.checkAttendance()
    firstTeacher.submitResults()


    var firstHod = Hod(
        "King",
        "King@test.com", "123pass"
    )

    firstHod.register()
    firstHod.login()
    firstHod.logout()
    firstHod.checkAttendance()
    firstHod.submitResults()
    firstHod.suspendTeacher()
    firstHod.schedulemeeting()


    firstStudent.setIdNumber("394949")
    println(firstStudent.getIdNumber())

    var maths = Maths()
    maths.grading()
    maths.standardizeResults()


    var history = History()
    history.grading()
    history.standardizeResults()
}
