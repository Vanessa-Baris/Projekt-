import kotlin.concurrent.thread
open class Spielfeld(var text: String , var nächstesSpielfeld: Spielfeld? = null) {

   // open var vorherigesSpielfeld: Spielfeld = nächstesSpielfeld()


    fun textAusdrucken() {
        println(text)
        //Geht das so?
        println("Das nächste Spielfeld ist $nächstesSpielfeld.")
       // try {
        //    println("Das vorherige Spielfeld ist $vorherigesSpielfeld.")
       // } catch (e: Exception) {
       //    println("Fehler.")
      //  }
    }

    //und hier auch überlegen:
   open fun nächstesSpielfeld(): Spielfeld{
       return nächstesSpielfeld!!
       }






}
