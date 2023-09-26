open class Wand(text: String , var damage: Int , nächstesSpielfeld: Spielfeld): Spielfeld(text , nächstesSpielfeld) {

    override var vorherigesSpielfeld: Spielfeld? = null

    fun damage(spieler: Spieler , damage: Int) {
        if (spieler.hp > 0) {
            spieler.hp -= damage
            println("Aktuelle Lebenspunkte: ${spieler.hp}")
        } else {
            println("Du hast kein verfügbares Leben mehr. Du hast verloren.")
        }
    }
}