open class Falle(text:String , var damage: Int , var riddle: Boolean): Spielfeld(text) {
    fun damage2(spieler: Spieler) {
        if (spieler.hp > 0) {
            spieler.hp -= damage
            println("Aktuelle Lebenspunkte: ${spieler.hp}")
        } else {
            println("Du hast kein verfügbares Leben mehr. Du hast verloren.")
        }
    }

    fun riddle(){

    }


}