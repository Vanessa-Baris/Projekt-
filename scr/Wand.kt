open class Wand(text: String , var damage: Int): Spielfeld(text) {

    fun damage(spieler: Spieler) {
        if (spieler.hp > 0) {
            spieler.hp -= 1
            println("Aktuelle Lebenspunkte: ${spieler.hp}")
        } else {
            println("Du hast kein verfügbares Leben mehr. Du hast verloren.")
        }
    }




}