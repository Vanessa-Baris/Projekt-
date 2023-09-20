open class Wand() {

    fun wand1(){
        println("Wand mit scharfen Dornen. Du musst zurück zu ${spielfeld1()}")
    }

    fun wand2(){
        var aktuelleHp = hp - 1
        println("Du hast Glück! Die Wand ist sehr alt und bröcklig. Du tritts einmal dagegen, verlierst aber einen Lebenspunkt. Du hast jetzt nur noch $aktuelleHp")
        hp = aktuelleHp

    }
}