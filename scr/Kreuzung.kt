class Kreuzung(text: String, nächstesSpielfeld: Spielfeld?): Spielfeld(text, nächstesSpielfeld) {

     var vorherigesSpielfeld: Spielfeld? = null


    override fun nächstesSpielfeld(): Spielfeld {
        this.richtungsauswahl()
        return super.nächstesSpielfeld()
    }
}



