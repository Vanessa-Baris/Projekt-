open class Spiel() {


    var aktuellesSpielfeld: Spielfeld = startSpielfeld


    fun spielSpielen(){
        startSpielfeld.textAusdrucken()
        Thread.sleep(3000)
        Spieler("" , 5).spielerAuswahl()
        Thread.sleep(3000)
        while (true){
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            aktuellesSpielfeld = wand1.nächstesSpielfeld()
            aktuellesSpielfeld = aktuellesSpielfeld.richtungsauswahl()
            //funktioniert das so?:
            aktuellesSpielfeld = wand2.damage(Spieler("" , 5))
        }
    }
}