open class Spiel() {


    var aktuellesSpielfeld: Spielfeld = startSpielfeld


    fun spielSpielen() {
        startSpielfeld.textAusdrucken()
        Thread.sleep(3000)
        Spieler("", 5).spielerAuswahl()
        Thread.sleep(3000)
        while (true) {
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung1
            aktuellesSpielfeld = wand1.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung2
            aktuellesSpielfeld = wand2
            wand2.damage(Spieler("", 5))
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung3
            aktuellesSpielfeld = falle1
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung1
            aktuellesSpielfeld = wand3
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = falle2
            aktuellesSpielfeld = endSpielfeld
        }
    }
}

