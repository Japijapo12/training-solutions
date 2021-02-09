
Gyakorlat - Absztrakt osztály létrehozása, használata
Feladat egy egyszerű játék logikájának megvalósítása. Ez a játék két konkrét játék
karaktert támogat: a nyilast, és a baltás harcost. Vannak közös viselkedések, azért
bevezetünk egy karakter közös őst. Mivel azonban van olyan viselkedés, amely
különbözik (de minden karakternek van) a második szintű támadás, ezért a közös ős
absztrakt. A megoldások az abstractclass.gamecharacter csomagban legyenek.
Definiálj egy síkpont tárolására képes immutable Point osztályt, x és y long típusú
attribútumokkal. Definiálj egy distance metódust, amely megkap egy másik pontot, és
visszatér a két pont távolságával (Pitagorasz-tétel).



Definiálj egy karakterek modellezését megvalósító Character absztrakt osztályt.
• szükséges attribútumok
– position, hol van a karakter (Point típusú).

– hitPoint, mennyi életereje van még a karakternek (int típus),
alapértelmezett értéke 100.
– random, Random típus, véletlenszámok generálásához.
– Hozz létre még egy isAlive metódust, amely igazzal tér vissza, ha még él a
karakter, azaz a hitPoint nagyobb, mint 0 (egyébként hamis).
• protected getActualPrimaryDamage metódus, amely visszaad egy egy és tíz közötti
véletlen értéket (egész).
• private getActualDefence metódus, amely visszaad egy nulla és 5 közötti véletlen
értéket (egész).
• protected void hit(Character enemy, int damage) metódus,
– amely lekérdezi az aktuális védelmet (használva a getActualDefence
metódust).
– Ha gyengébb a védelem, mint a sebzés (damage paraméter), akkor levonja a
sebzés értékét az életerőből, hívja a decreaseHitPoint private metódust.
• public void primaryAttack(Character enemy), amely csak továbbhívja a hit
metódust a saját enemy paraméterével, és a getActualPrimaryDamage metódus
visszatérési értékével.
• private void decreaseHitPoint(int diff), amely levonja a diff paraméter
értékét az életerő (hitPoint attribútum) értékéből.
• deklarálj egy abstract public void secondaryAttack(Character enemy)
metódust, melyet a leszármazott konkrét osztályok implementálnak majd.


Hozz létre egy Archer osztályt, amely kiterjeszti a Character osztályt a
következőképpen:
• szükséges attribútumok
– numberOfArrow, hány nyíl van még (int típusú).
• hozz létre egy konstruktort, amely megkapja a nyílas pozícióját és erre állítja be a
position örökölt attribútumot. Állítsa be a numberOfArrow attribútum értékét 100-
ra.
• generálj gettert a numberOfArrow attribútumra.
• hozz létre egy privát getActualSecondaryDamage metódust, ami visszaad egy 1 és 5
közötti egész véletlen értéket.
• definiálj egy shootingAnArrow privát metódust, amely megkapja az ellenséges
karakter referenciáját (enemy). Csökkenti a nyílak számát numberOfArrow, és
meghívja a hit örökölt metódusát a kapott ellenséges karakter referenciával, és a
getActualSecondaryDamage metódus visszatérési értékével.
• implementáld az örökölt secondaryAttack metódust úgy, hogy meghívod az
előzőleg definiált privát shootingAnArrow metódust, átadva a kapott enemy
paramétert.



Hozz létre egy AxeWarrior osztályt, amely kiterjeszti a Character osztályt a
következőképpen:
• hozz létre egy konstruktort, amely megkapja a harcos pozícióját és erre állítja be a
position örökölt attribútumot.
• hozz létre egy privát getActualSecondaryDamage metódust, ami visszaad egy
pozitív véletlen egész értéket amely az elsődleges támadás maximum kétszerese.
- 199 -
• implementáld az örökölt secondaryAttack metódust úgy,
– hogy ha az ellenség közelebb van mint két egység (használd a Point
distance metódust), akkor meghívja az örökölt hit() metódust, átadva a
kapott enemy paramétert és a getActualSecondaryDamage() metódus
visszatérési értékét.



Hozz létre egy BattleField osztályt, ami használja a karaktereket.
• szükséges attribútumok
– round, hány kör van még (int típusú).
• generálj egy gettert a round attribútumra.
• hozz létre egy private boolean oneHit(Character attacker, Character
defender) metódust, amely igazzal tér vissza, ha mindkét karakter él. Törzsében
meghívja a támadó (attacker) primaryAttack() majd secondaryAttack()
metódusait, melyeknek paramétere a védekező defender, ha még mindkettő él.
• hozz létre egy public Character fight(Character one, Character other)
metódust, amely visszatér az élve maradt karakterrel. Törzsében
– mindaddig hívja a privát oneHit metódust felváltva a támadó és védekező
szerepeket, amíg valamelyik meg nem hal. Minden körben először a one
támadja az other-t, majd az other a one-t.
– közben növeli a round attribútum értékét.
– végül visszatért az élő karakter referenciával.