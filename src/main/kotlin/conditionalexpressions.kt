fun main(args: Array<String>) {
    var marks = 100
    var grade = if (marks <= 40){
        "E"

    }else if (marks <=50){
        "D"

    }else if (marks <= 60){
        "C"

    }else if (marks <=70){
        "D"

    }else {
        "A"
    }
    println(grade)

    var bettingNumber = 0
    var bettingResult = when (bettingNumber){
        1 -> {
            "you won a car"
        }
        2 -> {
            "you won a horse"
        }
        3 -> {
            "you won 3M"
        }
        4 -> {
            "you lost"
        }
        else -> {
            "Enter a number between 1 - 4 to bet"
        }
    }
    println(bettingResult)
}