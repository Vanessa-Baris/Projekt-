import kotlin.concurrent.thread
open class Spielfeld(var text: String  , var name: String) {


    fun textAusdrucken() {
        println(text)
        println("Das nächste Spielfeld ist $name.")
    }

}
