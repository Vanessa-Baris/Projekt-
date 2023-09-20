class Spiel() {



    var list = mutableListOf<Spielfeld>(
        Spielfeld(false , false) ,
        Spielfeld(false , true) ,
        Spielfeld(true , true),
        Spielfeld(false , true),
        Spielfeld(true , false)
    )

    fun spielSpielen(){
        for (spielfeld in list) {
            if (spielfeld.wand bb) {
                spielfeld.richtungsauswahl()
                spielfeld.kreuzung1()
            }
        }
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