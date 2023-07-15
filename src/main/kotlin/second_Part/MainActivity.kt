package second_Part
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity


class MainActivity {
    enum class Team(val Color: String){
        Mercedes("turquoise"),
        RedBullRacing("Red"),
        Ferrari("Yellow"),
        McLaren("Orange"),
        AstonMartin("Grey"),
        Alpine("Pink"),
        AlphaTauri("Dark blue"),
        AlfaRomeo("Red ruby"),
        Haas("Black"),
        Williams("Blue")
    }

    private fun printTeamDetails(team: Team){
        println("Detalle del equipo\n ----------------------")
        println("El color del equipo es: ${team.Color}")

    }

    fun main(){
        //variable team para completar las tareas
        val team = Team.AstonMartin

        //Task 1: Imprimir los detalles del team elegido
        printTeamDetails(team)
        println()

        //Task 2: Switch Statement
        println("Usando estructura Switch")
        switchStatement(team)
        println()

        //Task 3: Llamar al método OnCreate()
        /**
         * He trabajado este ejercicio en IntelliJ por lo que las herramientas para trabajar con
         * Android no están disponibles, no he podido hacer llamada del método OnCreate().
         */

    }

    fun switchStatement(team: Team){
        when(team){
            Team.Mercedes -> println("Team: Mercedes, Color: ${team.Color}")
            Team.RedBullRacing -> println("Team: Red Bull Racing, Color: ${team.Color}")
            Team.Ferrari -> println("Team: Ferrari, Color: ${team.Color}")
            Team.McLaren -> println("Team: McLaren, Color: ${team.Color}")
            Team.AstonMartin -> println("Team: Aston Martin, Color: ${team.Color}")
            Team.Alpine -> println("Team: Alpine, Color: ${team.Color}")
            Team.AlphaTauri -> println("Team: AlphaTauri, Color: ${team.Color}")
            Team.AlfaRomeo -> println("Team: Alfa Romeo, Color: ${team.Color}")
            Team.Haas -> println("Team: Haas, Color: ${team.Color}")
            Team.Williams -> println("Team: Williams, Color: ${team.Color}")
        }
    }
}

fun main(){
    val mainA = MainActivity()
    mainA.main()
}