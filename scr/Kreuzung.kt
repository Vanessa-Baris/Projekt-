class Kreuzung(text: String, nächstesSpielfeld: Spielfeld? , var nächstesSpielfeldLinks: Spielfeld , var nächstesSpielfeldRechts: Spielfeld): Spielfeld(text, nächstesSpielfeld) {


    override fun nächstesSpielfeld(): Spielfeld {
        return this.richtungsauswahl()
    }

    open fun richtungsauswahl(): Spielfeld {
        println("Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach links (l), rechts (r) oder geradeaus (g)? Achte auf Kleinschreibung.")
        val richtung = readln()
        return when (richtung) {
            "l" -> Spielfeld("links", nächstesSpielfeld)
            "r" -> Spielfeld("rechts", nächstesSpielfeld)
            "g" -> Spielfeld("geradeaus", nächstesSpielfeld)
            else -> Spielfeld("", nächstesSpielfeld)
        }
    }
}





