import kotlin.concurrent.thread
open class Spielfeld(var text: String , var nächstesSpielfeld: Spielfeld? = null , var name: String) {


    //ändern noch, das die Klasse nicht mehr angezeigt, sondern der Text
    fun textAusdrucken() {
        println(text)
        println("Das nächste Spielfeld ist $name.")
    }

       open fun nächstesSpielfeld(): Spielfeld{
       return nächstesSpielfeld!!
       }
}
