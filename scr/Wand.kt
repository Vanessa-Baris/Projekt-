open class Wand(text: String): Spielfeld(text) {



    fun wand2(hp: Int){
        var aktuelleHp = hp - 1
        println("Du hast Glück! Die Wand ist sehr alt und bröcklig. Du tritts einmal dagegen, verlierst aber einen Lebenspunkt. Du hast jetzt nur noch $aktuelleHp")
       var hp = aktuelleHp

    }
}