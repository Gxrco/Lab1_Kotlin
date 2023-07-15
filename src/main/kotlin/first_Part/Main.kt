package first_Part

fun main() {
    //Initializing variables of drivers
    val d1 = Driver("Max Verstappen", "Red Bull Racing", "Netherlands", 1)
    val d2 = Driver("Sergio Perez", "Red Bull Racing", "Mexico", 11)
    val d3 = Driver("Fernando Alonso", "Aston Martin", "Spain", 14)

    val drivers: List<Driver> = listOf(d1, d2, d3)

    //Task 1: Print drivers information
    for (driver in drivers){
        printData(driver)
    }

    //Task 2: Compare drivers
    compareDriver(drivers[0],drivers[1],1)
    println()
    compareDriver(drivers[0], drivers[2], 0)
    println()

    //Task 3: Copy drivers object
    val d4: Driver = d1
    d4.name = "Charles Leclerc"
    d4.team = "Ferrari"

    println("Comparacion")
    printData(d1)
    println()
    printData(d4)

    //Task 4: Destructuring Declarations
    for(i in drivers){
        println()
        printDataUsingVariables(i)
    }

    //Task 5: toString Method()
    for (j in drivers){
        println()
        println(j.toString())
    }
}

fun printData(driver: Driver){
    println("--------------------------------")
    println("Nombre:"+driver.name)
    println("Equipo:"+driver.team)
    println("Pais:"+driver.country)
    println("Number:"+driver.number)
    println("--------------------------------")
}

fun printDataUsingVariables(driver: Driver){
    var name: String = driver.name
    var team: String = driver.team
    var country: String = driver.country
    var number: Int = driver.number

    println("--------------------------------")
    println("Nombre:"+name)
    println("Equipo:"+team)
    println("Pais:"+country)
    println("Number:"+number)
    println("--------------------------------")
}

fun compareDriver(D1: Driver, D2: Driver, Operation: Int){
    if (Operation == 1){
        println(D1.name + " == " + D2.name)
        val result: Boolean = D1 == D2
        println(result)
    }else {
        println(D1.name + " != " + D2.name)
        println(D1 != D2)
    }
}