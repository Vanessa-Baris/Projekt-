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

    fun spielfeld2(){
        println("Du bist an der ersten Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?")

        var richtung = ""
        while (richtung != "Osten" && richtung != "Westen" && richtung != "Süden") {
            print("Deine Wahl: ")
            richtung = readln()

            if (richtung == "Osten") {
                println("Du gehst nach Osten und kommst zu einer neuen Kreuzung ${spielfeld3()}")
            } else if (richtung == "Westen") {
                println("Du gehst nach Westen und wirst zurück zum Anfang katapultiert. ${spielfeld1()}")
            } else if (richtung == "Süden") {
                println("Du gehst nach Süden und ")
            } else {
                println("Ungültige Eingabe. Bitte wähle 'Osten', 'Westen' oder 'Süden'.")
            }
        }
    }


    fun spielfeld3(){

    }
}