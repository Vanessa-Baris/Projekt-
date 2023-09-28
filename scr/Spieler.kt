open class Spieler(name: String , hp: Int) {

    var hp: Int = 5


    fun spielerAuswahl(){
        println("Es wird Zeit, das wir dich kennenlernen. Wie ist dein Name?")
        var name: String = readln()
        println("Dein Name ist also $name. Ein Name wie für einen Helden gemacht.")
        Thread.sleep(3000)
        println("Aber pass auf! Du hast nur 5 Lebenspunkte.")
    }



}

