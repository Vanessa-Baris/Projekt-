open class Spiel() {


    var aktuellesSpielfeld: Spielfeld = startSpielfeld


    fun spielSpielen(){

        while (true){
            startSpielfeld.textAusdrucken()
            Thread.sleep(3000)
            Spieler("" , 5).spielerAuswahl()
            Thread.sleep(3000)
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld = wand1.nächstesSpielfeld()
            //funktioniert das so?:
            wand2.wand2(5)
            aktuellesSpielfeld = wand2.nächstesSpielfeld()
        }
    }
}