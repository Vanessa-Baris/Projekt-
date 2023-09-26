class Kreuzung(text: String, nächstesSpielfeld: Spielfeld?): Spielfeld(text, nächstesSpielfeld) {

    override var vorherigesSpielfeld: Spielfeld? = null


    //muss ich mir noch überlegen wie man das geschickter macht:
    override fun nächstesSpielfeld(): Spielfeld {
        this.richtungsauswahl()
        return super.nächstesSpielfeld()
    }
}



