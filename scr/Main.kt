var falle1: Falle = Falle("""Du fällst in eine Grube. Um herauszukommen musst du ein Rätsel lösen. Aber Vorsicht, der große Drache hat deinen Geruch bemerkt und schnuppert schon. Beeil dich!"""" , 0 , true , "falle1")

var wand1: Wand =Wand("""Wand mit scharfen Dornen. Du musst zurück .""" , 1 , "wand1")

var wand2: Wand = Wand("Du hast Glück! Die Wand ist sehr alt und bröcklig. Du tritts einmal dagegen, verlierst aber zweita Lebenspunkt." , 2 , "wand2")


var wand3: Wand = Wand("""Du hast Glück! Die Wand erzittert vor deinem Anblick und lässt dich durch."""" , 0 , "wand3")

var falle2: Falle = Falle("""Du verirrst dich und wirst vom frechen Gespenst am Ärmel zurückgehalten. Du verlierst dabei zwei Lebenspunkte. Schnell! Renn weg!"""" , 2 , false , "falle2")


var kreuzung1 = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach links? Nach rechts? Oder geradeaus?"""", wand2 , wand3 , falle1 , "kreuzung1")

var kreuzung2: Kreuzung = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach links? Nach rechts? Oder  geradeaus?"""", wand1 , falle1 , falle2 , "kreuzung2")

var endSpielfeld: Spielfeld = Spielfeld("Du bist am Ziel angelangt. Herzlichen Glückwunsch!" , "endSpielfeld")

var kreuzung3: Kreuzung = Kreuzung("""Du bist an einer Kreuzung angelangt. Jetzt musst du eine der drei Richtungen wählen. Gehst du nach links? Nach rechts? Oder geradeaus?"""", falle1 , wand1 ,  endSpielfeld , "kreuzung3")

var startSpielfeld: Kreuzung =  Kreuzung("""Willkommen im Labyrinth! Bist du bereit dieses zu meistern?
Aber Vorsicht! Im Labyrinth lauert ein kleines Gespenst und ein großer Drache auf dich.
Bei jeder Kreuzung musst du dich für eine der drei Richtungen entscheiden. Wähle weise und bleib am Leben.""" , wand1 , falle1 , wand3 , "startSpielfeld" )

fun main() {

 wand1.text = """Wand mit scharfen Dornen. Du musst zurück $startSpielfeld."""



 Spiel().spielSpielen()





}




