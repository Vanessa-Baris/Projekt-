import kotlin.concurrent.thread

open class Spielfeld() {

    var spielerPosition = 1

    fun spielfeld1() {
        println("Du befindest dich auf Spielfeld $spielerPosition")
    }

     fun willkommensText (){
        println("Willkommen im Labyrinth! Bist du bereit dieses zu meistern?")
         Thread.sleep(3000)
         println("Aber Vorsicht! Im Labyrinth lauert ein kleines Gespenst und ein großer Drache auf dich.")
         Thread.sleep(3000)
         println("Bei jeder Kreuzung musst du dich für eine der vier Richtungen entscheiden. Wähle weise und bleib am Leben.")
    }
}