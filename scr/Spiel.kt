open class Spiel() {

    var spieler: Spieler = Spieler("" , 5)


    var aktuellesSpielfeld: Spielfeld = startSpielfeld


    fun spielSpielen() {
        var durchläufe = 0
        startSpielfeld.textAusdrucken()
        Thread.sleep(3000)
        Spieler("", 5).spielerAuswahl()
        Thread.sleep(3000)
        while (durchläufe < 1) {
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung1
            aktuellesSpielfeld = wand1.nächstesSpielfeld()
            wand1.damage(Spieler("" , 5) , 1)
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung2
            aktuellesSpielfeld = wand2.nächstesSpielfeld()
            wand2.damage(Spieler("", 5) , 2)
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung3
            aktuellesSpielfeld = falle1.nächstesSpielfeld()
            falle1.riddle()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = kreuzung1
            aktuellesSpielfeld = wand3.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = falle2
            falle2.damage2(Spieler("" , 5) , 2)
            aktuellesSpielfeld = endSpielfeld
        }
    }
}

