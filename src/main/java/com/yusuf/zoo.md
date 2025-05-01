## Zoo
<hr>

### Inzicht

Ik ben op 01/05/2025 om 18:00 van start gegaan met deze opdracht.

Allereerst heb ik de tijd genomen om de opdracht goed te begrijpen.  
Al snel kwam ik erachter dat de dieren veel methodes met elkaar gemeen hebben.

Elk dier heeft een naam en zegt hallo. Daarom heb ik besloten om een hoofdlklasse genaamd `Animal` te maken.  
Elke diersoort extends `Animal` en erft daarmee eigenschappen zoals `name` en de methode `sayHello()`.

Daarnaast viel het op dat elk dier ofwel bladeren eet, vlees eet, of een trucje kan uitvoeren.  
Daarom heb ik voor deze drie gedragingen aparte interfaces gemaakt.

- Vleesetende dieren implementeren de `Carnivore`-interface.
- Planteneters implementeren de `Herbivore`-interface.
- Dieren die een trucje kunnen doen, implementeren de `Tricks`-interface.

Ook heb ik gemerkt dat er nergens gebruik wordt gemaakt van Javadoc, terwijl dit juist erg belangrijk is.  
Met goede documentatie kunnen andere ontwikkelaars de code sneller begrijpen en gebruiken.

<hr>

Na het opzetten van dit plan ben ik begonnen met het maken van de hoofdklasse `Animal`.  
Dat ging soepel. Vervolgens heb ik de interfaces opgesteld.

Daarna heb ik de bestaande dieren aangepast zodat ze allemaal `Animal` extenden en de juiste interfaces implementeren:  
`Herbivore`, `Carnivore`, en/of `Tricks`, afhankelijk van hun gedrag.

Het langste zat ik vast op het ontwerp van de `Tricks`-interface. Ik heb lang nagedacht over hoe ik dat het beste kon aanpakken.  
Uiteindelijk ben ik tot een goede oplossing gekomen: elk dier geeft zijn eigen lijst van trucjes door via `getTricks()`,  
en de interface kiest daar willekeurig één uit. Zo kun je meerdere trucjes per dier hebben, terwijl de methode eenvoudig blijft werken.

Alle bestaande klassen zijn nu opgezet. Ik ga nu twee nieuwe dieren toevoegen.

Na het toevoegen van de twee nieuwe dieren ben ik verder gegaan met het controleren en verbeteren van de documentatie.  
Ik heb ervoor gekozen om alle Javadoc in het Engels te schrijven, zodat het universeel begrijpelijk is.

Het heeft me ongeveer 50 minuten gekost om alles tot dit punt te brengen.  
Nu ga ik aan de slag met de `Zoo.java`-klasse om de applicatie volledig werkend te maken.

<hr>

### Eerste eis: Hello-command

Na het opzetten van de dieren en hun gedrag, heb ik de eerste functionele eis geïmplementeerd:  
Het ondersteunen van het `hello`-commando via de console.

Als de gebruiker `hello` invoert, zeggen **alle dieren hallo**.  
Als de gebruiker `hello <naam>` invoert, zegt alleen **het dier met die naam hallo**.

In plaats van handmatig voor elke dier een `if-else` structuur te maken (zoals `if (input.equals("hello henk"))`),  
heb ik ervoor gekozen om een **generieke for-loop** te gebruiken die door een `animals`-array loopt.  
Hierin controleer ik met `getName().equals(name)` welk dier moet reageren.

Dit is goed omdat:
- De code is **veel korter en overzichtelijker**
- Het is **schaalbaar**: als ik een nieuw dier toevoeg, werkt het automatisch zonder extra `if`-blokken
- Het gebruikt **OOP en polymorfisme**: alle dieren hebben dezelfde methode `sayHello()`, maar die voert per dier ander gedrag uit

Deze eerste eis heb ik binnen ongeveer 20 minuten afgerond.


<hr>

### Tweede eis: Give leaves command

Na het Hello command maken was dit vrij makkelijk sinds ik alleen moest herhalen maar op een andere manier. 
Ik hoefde niet iets lastigers te verzinnen. 

ik was klaar binnen 10 min 