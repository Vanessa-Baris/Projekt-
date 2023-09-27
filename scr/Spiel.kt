open class Spiel() {

    var spieler: Spieler = Spieler("", 5)
    var besuchteSpielfelder: MutableList<Spielfeld> = mutableListOf()


   open var aktuellesSpielfeld: Spielfeld = startSpielfeld


    fun spielSpielen() {
        val durchläufe = 0
        startSpielfeld.textAusdrucken()
        Thread.sleep(3000)
        var spieler: Spieler = Spieler("", 5)
        spieler.spielerAuswahl()
        Thread.sleep(3000)
        while (durchläufe < 1) {
            //aktuellesSpielfeld.textAusdrucken, und was nächstes Spielfeld ist
            aktuellesSpielfeld.textAusdrucken()
            if (aktuellesSpielfeld is Falle){
                (aktuellesSpielfeld as Falle).damage2(spieler)
            }

            if (aktuellesSpielfeld is Wand) {
                (aktuellesSpielfeld as Wand).damage(spieler)
            }

            besuchteSpielfelder.add(aktuellesSpielfeld)
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
        }
        var anzahlBesuchteSpielfelder = besuchteSpielfelder.size
        println("Du hast ${anzahlBesuchteSpielfelder} Spielfelder besucht.")
    }
}

