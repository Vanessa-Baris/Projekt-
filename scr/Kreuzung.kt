class Kreuzung(text: String , var nächstesSpielfeldGeradeaus: Spielfeld ,  var nächstesSpielfeldLinks: Spielfeld , var nächstesSpielfeldRechts: Spielfeld , name: String): Spielfeld(text , name) {


    open fun richtungsauswahl(): Spielfeld {
        println("Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach links (l), rechts (r) oder geradeaus (g)?")
        val richtung = readln().lowercase()
        return when (richtung) {
            "l" -> nächstesSpielfeldLinks
            "r" -> nächstesSpielfeldRechts
            "g" -> nächstesSpielfeldGeradeaus
            else -> {
                println("Ungültige Eingabe. Bitte wähle eine der drei Richtungen: links (l), rechts (r) oder geradeaus (g).")
                richtungsauswahl()
            }
        }
    }
}





