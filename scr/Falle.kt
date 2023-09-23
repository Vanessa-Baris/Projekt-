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
        println("Dein Rätsel: Sams Vater hat 3 Töchter. Zwei von ihnen heißen Stephanie und Amanda. Wie lautet der Name der dritten Tochter?")
        var answer: String = readln()
        if (answer == "Sam") {
            println("Richtig geraten! Du darfst weitergehen. ${nächstesSpielfeld()}")
        } else {
            println("Du hast das Rätsel nicht gelöst und musst zurück. $startSpielfeld")
        }
    }
}