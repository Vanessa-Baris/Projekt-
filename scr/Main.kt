
var kreuzung1 = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?"""",

 //noch wegmachen
 null)

var startSpielfeld: Spielfeld =  Spielfeld("""Willkommen im Labyrinth! Bist du bereit dieses zu meistern?
Aber Vorsicht! Im Labyrinth lauert ein kleines Gespenst und ein großer Drache auf dich.
Bei jeder Kreuzung musst du dich für eine der vier Richtungen entscheiden. Wähle weise und bleib am Leben.""",
 kreuzung1)

var wand1: Wand =Wand("""Wand mit scharfen Dornen. Du musst zurück $startSpielfeld.""" , 1 , startSpielfeld)

var falle1: Falle = Falle("""Du fällst in eine Grube. Um herauszukommen musst du ein Rätsel lösen. Aber Vorsicht, der große Drache hat deinen Geruch bemerkt und schnuppert schon. Beeil dich!"""" , 0 , true , kreuzung1)

var kreuzung3: Kreuzung = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?"""" , falle1 , wand1 , wand2 , falle1)

var wand2: Wand = Wand("Du hast Glück! Die Wand ist sehr alt und bröcklig. Du tritts einmal dagegen, verlierst aber einen Lebenspunkt." , 2 , kreuzung3)

var endSpielfeld: Spielfeld = Spielfeld("Du bist am Ziel angelangt. Herzlichen Glückwunsch!")


var falle2: Falle = Falle("""Du verirrst dich und wirst vom frechen Gespenst am Ärmel zurückgehalten. Du verlierst dabei zwei Lebenspunkte. Schnell! Renn weg!"""" , 2 , false , endSpielfeld)


var wand3: Wand = Wand("""Du hast Glück! Die Wand erzittert vor deinem Anblick und lässt dich durch."""" , 0 , falle2)

var kreuzung2: Kreuzung = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach Osten? Nach Westen? Oder nach Süden?"""", wand2)


fun main() {
 kreuzung1.nächstesSpielfeld = wand1


 Spiel().spielSpielen()





}




