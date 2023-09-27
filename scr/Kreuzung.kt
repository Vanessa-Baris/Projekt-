class Kreuzung(text: String, nächstesSpielfeld: Spielfeld? , var nächstesSpielfeldLinks: Spielfeld , var nächstesSpielfeldRechts: Spielfeld): Spielfeld(text, nächstesSpielfeld) {


    override fun nächstesSpielfeld(): Spielfeld {
        return this.richtungsauswahl()
    }

    open fun richtungsauswahl(): Spielfeld {
        println("Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach links (l), rechts (r) oder geradeaus (g)?")
        val richtung = readln().lowercase()
        return when (richtung) {
            "l" -> Spielfeld("links", nächstesSpielfeldLinks)
            "r" -> Spielfeld("rechts", nächstesSpielfeldRechts)
            "g" -> Spielfeld("geradeaus", nächstesSpielfeld)
            else -> {
                println("Ungültige Eingabe. Bitte wähle eine der drei Richtungen: links (l), rechts (r) oder geradeaus (g).")
                richtungsauswahl()
            }
        }
    }

}





