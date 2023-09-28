open class Wand(text: String , var damage: Int , name: String): Spielfeld(text , name) {


    fun damage(spieler: Spieler) {
        if (spieler.hp > 0) {
            spieler.hp -= damage
            println("Aktuelle Lebenspunkte: ${spieler.hp}")
        } else {
            println("Du hast kein verfügbares Leben mehr. Du hast verloren.")
        }
    }
}