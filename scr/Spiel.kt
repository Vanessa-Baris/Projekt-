open class Spiel() {

    var besuchteSpielfelder: MutableList<Spielfeld> = mutableListOf()

    //Hier nehme ich von Wand / Falle die Kreuzung und jetzt kann ich im Spiel prüfen, ob aktuelles Feld eine Wand ist und wenn ja, geht er eben zur Kreuzung als aktuelles Feld
    var kreuzungen =  mutableMapOf<Spielfeld , Kreuzung>(
    wand1 to startSpielfeld,
    wand2 to kreuzung2,
    wand3 to kreuzung3,
    falle1 to kreuzung1,
    falle2 to kreuzung2)


   open var aktuellesSpielfeld: Spielfeld = startSpielfeld

    fun spielSpielen() {
        val durchläufe = 0
        startSpielfeld.textAusdrucken()
        Thread.sleep(3000)
        var spieler: Spieler = Spieler("", 5)
        spieler.spielerAuswahl()
        Thread.sleep(3000)
        while (aktuellesSpielfeld.name != "endSpielfeld") {
            aktuellesSpielfeld.textAusdrucken()
            if (aktuellesSpielfeld is Falle){
                if ((aktuellesSpielfeld as Falle).riddle) {
                    ((aktuellesSpielfeld as Falle).riddle())
                } else {
                    (aktuellesSpielfeld as Falle).damage2(spieler)
                }
                    aktuellesSpielfeld = kreuzungen[aktuellesSpielfeld]!!

            }

            if (aktuellesSpielfeld is Wand) {
                (aktuellesSpielfeld as Wand).damage(spieler)
                aktuellesSpielfeld = kreuzungen[aktuellesSpielfeld]!!

            }

            if (aktuellesSpielfeld is Kreuzung){
                aktuellesSpielfeld = (aktuellesSpielfeld as Kreuzung).richtungsauswahl()
            }

            besuchteSpielfelder.add(aktuellesSpielfeld)
        }
        var anzahlBesuchteSpielfelder = besuchteSpielfelder.size
        println("Du hast gewonnen. Du hast ${anzahlBesuchteSpielfelder} Spielfelder besucht.")
    }
}

