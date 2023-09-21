

var startKreuzung: Kreuzung = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?")
""")

var startSpielfeld: Spielfeld =  Spielfeld("""Willkommen im Labyrinth! Bist du bereit dieses zu meistern?
                        
               Aber Vorsicht! Im Labyrinth lauert ein kleines Gespenst und ein großer Drache auf dich.
                    
               Bei jeder Kreuzung musst du dich für eine der vier Richtungen entscheiden. Wähle weise und bleib am Leben.""",
    startKreuzung)

var wand1: Wand =Wand("""Wand mit scharfen Dornen. Du musst zurück $startSpielfeld.""")

var wand2: Wand = Wand("Du hast Glück! Die Wand ist sehr alt und bröcklig. Du tritts einmal dagegen, verlierst aber einen Lebenspunkt.")

var wand3: Wand = Wand("")

var kreuzung2: Kreuzung = Kreuzung("")

var kreuzung3: Kreuzung = Kreuzung("")

var falle1: Falle = Falle()

var falle2: Falle = Falle()

var endSpielfeld: Spielfeld = Spielfeld("")


class Spiel() {


    var aktuellesSpielfeld: Spielfeld = startSpielfeld


    fun spielSpielen(){

        while (true){
            startSpielfeld.textAusdrucken()
            Thread.sleep(3000)
            Spieler("" , 5).spielerAuswahl()
            Thread.sleep(3000)
            aktuellesSpielfeld = aktuellesSpielfeld.nächstesSpielfeld()
            aktuellesSpielfeld = wand1.nächstesSpielfeld()
            //funktioniert das:
            wand2.wand2(5)
            aktuellesSpielfeld = wand2.nächstesSpielfeld()
        }
    }





}