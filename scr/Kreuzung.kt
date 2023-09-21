class Kreuzung(text: String): Spielfeld(text) {

    override fun nächstesSpielfeld(): Spielfeld {
        this.richtungsauswahl()
        return super.nächstesSpielfeld()
    }
}



