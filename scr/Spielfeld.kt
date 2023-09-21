import kotlin.concurrent.thread

open class Spielfeld(var text: String , var nächstesSpielfeld: Spielfeld? = null) {

    // var vorherigesSpielfeld: Spielfeld? = null


    fun textAusdrucken() {
        println(text)
        println("Das nächste Spielfeld ist $nächstesSpielfeld.")
       // println("Das vorherige Spielfeld ist $vorherigesSpielfeld.")
    }

   open fun nächstesSpielfeld(): Spielfeld{
        return nächstesSpielfeld!!

    }


    fun richtungsauswahl(): Spielfeld {
       println("Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?")
        var richtung = ""
        richtung = readln()
        println("Deine Wahl ist: $richtung")
        return Spielfeld("" , nächstesSpielfeld)
    }


}
