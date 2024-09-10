fun main() {
    menu()
}

fun menu() {
    println(
        """
        Choose a number below:
        [1] Convert lbs to kg
        [2] Convert mi to km
        [3] Convert °F to °C
        [4] Calculate the average age of 10 students
        [5] Display a fantasy story
    """.trimIndent()
    )
    
    val options = readLine()?.toIntOrNull()

    when (options) {
        1 -> number1()
        2 -> number2()
        3 -> number3()
        4 -> number4()
        5 -> number5()
        else -> println("Invalid input.")
    }
}

fun number1() {
    println("Enter weight in pounds (lbs):")
    val pounds = readLine()?.toDoubleOrNull()

    if (pounds != null) {
        val kilograms = pounds * 0.453592
        println("$pounds lbs is equal to $kilograms kg")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}

fun number2() {
    println("Enter distance in miles:")
    val milesInput = readLine()?.toDoubleOrNull()

    if (milesInput != null) {
        val kilometers = convertMilesToKilometers(milesInput)
        println("$milesInput miles is equal to $kilometers kilometers.")
    } else {
        println("Invalid input.")
    }
}

fun convertMilesToKilometers(miles: Double): Double {
    return miles * 1.60934
}

fun number3() {
    println("Enter temperature in Fahrenheit:")
    val input = readLine()?.toDoubleOrNull()

    if (input != null) {
        val celsius = fahrenheitToCelsius(input)
        println("$input°F is equal to %.2f°C".format(celsius))
    } else {
        println("Invalid input.")
    }
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

fun number4() {
    val studentAges = mutableListOf<Int>()

    for (i in 1..10) {
        println("Enter the age of student $i:")
        val age = readLine()?.toIntOrNull()

        if (age != null) {
            studentAges.add(age)
        } else {
            println("Invalid input. Please enter a valid number.")
            return
        }
    }
    println("The ages of the students are: $studentAges")

    val totalAge = studentAges.sum()
    val averageAge = totalAge.toDouble() / studentAges.size

    println("The average age of the students is: %.2f".format(averageAge))
}

fun number5() {
    val hero = "Aric"
    val wizard = "Eldran"
    val rogue = "Lira"
    val knight = "Sir Balen"
    val villain = "Dread Lord Zarnok"

    val sword = "Blade of Dawn"
    val staff = "Staff of Eternity"
    val bow = "Whispering Bow"
    val shield = "Aegis of Valor"
    
    val fireball = "Flames of the Phoenix"
    val stealth = "Veil of Shadows"

    val story = """
        In a land where darkness consumed the light, five heroes arose to challenge the reign of the evil sorcerer $villain.
        $hero, a fearless warrior, wielded the legendary $sword, its radiant glow cutting through the shadows.
        
        By his side was the wise wizard $wizard, whose mastery over the $staff granted him the power to summon the $fireball,
        a spell so fierce it could reduce entire armies to ash.
        
        $rogue, the swift and cunning, moved unseen through the enemy ranks, her $bow always ready. With the $stealth, 
        she struck from the shadows without a trace.
        
        Leading the charge was $knight, a noble protector, clad in gleaming armor and bearing the indestructible $shield. 
        His courage was a beacon to all who followed.

        Together, these heroes set forth on a perilous journey to confront $villain and restore peace to the realm.
    """.trimIndent()

    println(story)
}
