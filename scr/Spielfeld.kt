import kotlin.concurrent.thread
open class Spielfeld(var text: String , var nächstesSpielfeld: Spielfeld? = null) {

   // open var vorherigesSpielfeld: Spielfeld = nächstesSpielfeld()


    fun textAusdrucken() {
        println(text)
        println("Das nächste Spielfeld ist $nächstesSpielfeld.")

    }

       open fun nächstesSpielfeld(): Spielfeld{
       return nächstesSpielfeld!!
       }






}
