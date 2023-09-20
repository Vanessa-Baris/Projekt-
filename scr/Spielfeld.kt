import kotlin.concurrent.thread

open class Spielfeld(var falle: Boolean , var wand: Boolean, var kreuzung: String) {


    fun willkommensText (){
        println("Willkommen im Labyrinth! Bist du bereit dieses zu meistern?")
         Thread.sleep(3000)
         println("Aber Vorsicht! Im Labyrinth lauert ein kleines Gespenst und ein großer Drache auf dich.")
         Thread.sleep(3000)
         println("Bei jeder Kreuzung musst du dich für eine der vier Richtungen entscheiden. Wähle weise und bleib am Leben.")
    }


    fun richtungsauswahl(): String {
        println("Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?")
        var richtung = ""
        richtung = readln()
        println("Deine Wahl ist: $richtung")
        return richtung
    }


}
