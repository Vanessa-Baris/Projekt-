open class Spiel() {

    var spieler: Spieler = Spieler("" , 5)


   open var aktuellesSpielfeld: Spielfeld = startSpielfeld


    fun spielSpielen() {
        val durchläufe = 0
        startSpielfeld.textAusdrucken()
        Thread.sleep(3000)
        Spieler("", 5).spielerAuswahl()
        Thread.sleep(3000)
        while (durchläufe < 1) {
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung1
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = kreuzung1.nächstesSpielfeld()
            aktuellesSpielfeld.textAusdrucken()
            wand1.damage(Spieler("" , 5) , 1)
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung2
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = wand2
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = wand2.nächstesSpielfeld()
            wand2.damage(Spieler("", 5) , 2)
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung3
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = kreuzung3.nächstesSpielfeld()
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = falle1
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = falle1.nächstesSpielfeld()
            falle1.riddle()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung1
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = kreuzung1.nächstesSpielfeld()
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = wand3
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = wand3.nächstesSpielfeld()
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = falle2
            aktuellesSpielfeld.textAusdrucken()
            aktuellesSpielfeld = falle2.nächstesSpielfeld()
            falle2.damage2(Spieler("" , 5) , 2)
            aktuellesSpielfeld = endSpielfeld
        }
    }
}

