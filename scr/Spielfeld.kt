import kotlin.concurrent.thread

open class Spielfeld(var falle: Boolean , var wand: Boolean) {

    public open var wand: Wand = Wand()

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

    fun kreuzung1(list: mu){

        var richtung = richtungsauswahl()

        if (richtung == "Osten") {
            println("Du gehst nach Osten und kommst zu einer neuen Kreuzung ${spielfeld3()}")
        } else if (richtung == "Westen") {
            println("Du gehst nach Westen und wirst zurück zum Anfang katapultiert. ${spielfeld1()}")
        } else if (richtung == "Süden") {
            println("Du gehst nach Süden und kommst an eine $wand1")
        } else {
            println("Ungültige Eingabe. Bitte wähle 'Osten', 'Westen' oder 'Süden'.")
        }
    }
}
