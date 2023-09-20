open class Kreuzung(): Spielfeld() {

    fun kreuzung1(){
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
}