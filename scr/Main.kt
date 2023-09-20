fun main() {
 Spielfeld(true , true).willkommensText()
 Spieler("" , 5).spielerAuswahl()

 Spiel().spielSpielen()





}

fun spielfeld1() {
 println("Du befindest dich auf Spielfeld 1 und darfst gleich weiter zum zweiten Spielfeld gehen. ${spielfeld2()}")
}


