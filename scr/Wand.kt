open class Wand(text: String): Spielfeld(text) {


   open fun wand2(hp: Int){
        val aktuelleHp = hp - 1
        val hp: Int = aktuelleHp
        println("Aktuelle Lebenspunkte: $hp")

    }
}