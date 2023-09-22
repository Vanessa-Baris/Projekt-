class Kreuzung(text: String): Spielfeld(text) {

    //muss ich mir noch überlegen wie man das geschickter macht:
    override fun nächstesSpielfeld(): Spielfeld {
        this.richtungsauswahl()
        return super.nächstesSpielfeld()

    }



}



