var falle1: Falle = Falle("""Du fällst in eine Grube. Um herauszukommen musst du ein Rätsel lösen. Aber Vorsicht, der große Drache hat deinen Geruch bemerkt und schnuppert schon. Beeil dich!"""" , 0 , true)

var wand1: Wand =Wand("""Wand mit scharfen Dornen. Du musst zurück .""" , 1 , null)

var wand2: Wand = Wand("Du hast Glück! Die Wand ist sehr alt und bröcklig. Du tritts einmal dagegen, verlierst aber einen Lebenspunkt." , 2 , null)


var wand3: Wand = Wand("""Du hast Glück! Die Wand erzittert vor deinem Anblick und lässt dich durch."""" , 0 , )

var falle2: Falle = Falle("""Du verirrst dich und wirst vom frechen Gespenst am Ärmel zurückgehalten. Du verlierst dabei zwei Lebenspunkte. Schnell! Renn weg!"""" , 2 , false)


var kreuzung1 = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?"""", wand2 , wand3 , falle1)

var kreuzung2: Kreuzung = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?"""", wand1 , falle1 , falle2)

var kreuzung3: Kreuzung = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?"""", falle1 , wand )


var endSpielfeld: Spielfeld = Spielfeld("Du bist am Ziel angelangt. Herzlichen Glückwunsch!")

var startSpielfeld: Spielfeld =  Spielfeld("""Willkommen im Labyrinth! Bist du bereit dieses zu meistern?
Aber Vorsicht! Im Labyrinth lauert ein kleines Gespenst und ein großer Drache auf dich.
Bei jeder Kreuzung musst du dich für eine der vier Richtungen entscheiden. Wähle weise und bleib am Leben.""" , kreuzung1 , "Nächstes Spielfeld: Kreuzung1")
//Name noch ändern

fun main() {
 wand1.nächstesSpielfeld = startSpielfeld
 wand1.text = """Wand mit scharfen Dornen. Du musst zurück ${wand1.nächstesSpielfeld}."""

 wand2.nächstesSpielfeld = kreuzung2


 Spiel().spielSpielen()





}




