import com.sun.org.apache.xml.internal.utils.DefaultErrorHandler
import javafx.beans.binding.When
import jdk.nashorn.internal.lookup.Lookup
import java.io.File
import java.lang.ArithmeticException
import java.lang.NumberFormatException
import kotlin.math.roundToInt
import kotlin.math.sqrt

//fun main(args: Array<String>) {


// ##@$@#@#@##@#@ 2

//    var zmienna1: String = "Konrad ";
//    var zmienna2: String;
//    zmienna2 = "moje nazwisko";
//
//    var zmienna3 = "kotlin";
//    var zmienna4 = 4;
//    var wiek: Int = 37;
//    var long1: Long = 234
//    print("witaj $zmienna1, masz  $wiek lat to troche duzo "); // $ dolar oznacza zmienna
//    print("mozna tez tal ${zmienna2}") // lub dolar i klamra
//    var suma: Int = zmienna4 + wiek;
//    println (suma)
//    println(long1)
//
//    var czynnik1: Int = 4
//    var czynnik2: Int = 324
//
//    var iloczyn = czynnik1 * czynnik2
//    print("iloczyn $iloczyn")
//
//    println(2+2*2)
//    println("sdsd")
//    println((2+2)*2)










// ##@$@#@#@##@#@ 4
//    var czySieRusza: String
//    var czyPowinnoSieRuszac: String
//    println("czy cos sie rusza?")
//    // czySieRusza = readLine()!! // jestesmy pewni ze zmienna nie bedzie nulem
//    czySieRusza = readLine()!!.toUpperCase()
//
//    if (czySieRusza == "TAK") {
//        println("a powinno sie ruszac?")
//        czyPowinnoSieRuszac = readLine()!!.toUpperCase()
//        if (czyPowinnoSieRuszac == "NIE") {
//            println("uzyj tasmy")
//        } else {
//            println("to nie bylo probelmu")
//        }
//    }
//    else { // czyli jesli sie nie rusza
//        println("a powinno si eruszac?")
//        czyPowinnoSieRuszac = readLine()!!.toUpperCase()
//        if (czyPowinnoSieRuszac == "NIE") {
//            println("to nie ma problemu")
//        } else {
//            println("to uzyj wd40")
//        }
//
//    }










// ##@$@#@#@##@#@  5
//    val naszaStala: Int = 23 // val to stala a var to zmienna
//    var naszaLiczba: Int = readLine()!!.toInt(); // cast to Int
//    println("podaj liczbe")
//    if (naszaLiczba >= naszaStala) println("wieksza")
//    else if(naszaLiczba%2 == 0) println("podana liczba jest mniejsza niz stala oraz jest parzysta")
//    else println("podana liczba jest mnniejsza nisz stala -> $naszaStala oraz nieparzytsa")


// ##@$@#@#@##@#@  6 petle
/*
    for (i in 1..20) println ("i in 1..20 $i")
    for(i in 5 downTo -23) println ("licznik i in 5 downTo -23 $i")
    for(i in 100 downTo -20 step 5) println("i in 100 downTo -20 step 5 $i")
*/

//    println("ile czasu chcesz odmierzyc?")
//    var czas: Int = readLine()!!.toInt()
//    for (i in czas downTo 0) {
//        if (i != 0) {
//            println(i)
//            Thread.sleep(100) // zatrzymanie watku o 1000 ms
//
//        } else {
//            println("koniec czasu")
//        }
//    }











// ##@$@#@#@##@#@ 7 while i do while and or etukiety petli
/*
//    var x: Int = 0;
//    while (x < 199){
//        println(x)
//        x++
//    }
val password: String = "123"
val user: String = "admin"

var givenUserName: String
var givenPassword: String

while (true) {
    println("podaj login")
    givenUserName = readLine()!!;
    println("podaj haslo")
    givenPassword = readLine()!!;

    if ((user == givenUserName) && (password == givenPassword)){
        print ("czesc $givenUserName z haslem $givenPassword")
        break;

    }else{
        println("bledny login lub haslo sprobuj ponownie")
//            continue; // nie musi byc continue bo jedyna mozliwosc przerwania petli do podanie prawidlowych danych
    }
}


petlaZewnetrzna@ for (i in 1 until 100) { // do 99 wlacznie // etykieta petli zewnetrznej
    petlaWewnetrzna@ for (j in 1..100) { // do 100 wlacznie // etykieta petli wewnetrznej
        println("i $i j $j")
        if (i == 13) {
            break@petlaZewnetrzna // przerwanie petli zewnetrznej
        }

    }
}

*/










// ##@$@#@#@##@#@  8 when i typ any (switch)
/*
var jakisObiekt: Any = 3.14159F// typ Any nadrzedna klasa dla wszytskich jak Obiect w java
//    println("wpisz cos na klawiaturze")
//    jakisObiekt = readLine()!!

when (jakisObiekt) {
    is String -> {
        println("to jest string ${jakisObiekt.toUpperCase()} ")
    }

    is Int -> {
        println("to jest int, ${jakisObiekt + 12}")
    }
    is Float -> {
        println("to jest float $jakisObiekt")
        println("a tu zaokroalony do inta ${jakisObiekt.roundToInt()}")
    }
    is Char -> {
        println("to jest char $jakisObiekt")
    }
    is Long -> {
        println("to jest long $jakisObiekt")
    }
    else -> println ("stworzyles jakis dziwny typ") // to jest wykonyywane jesli zaden powyzszy warunek nie jest spelniony
}

*/











// ##@$@#@#@##@#@  9 tablice i petla for each

//    var stanMagazynuAny = arrayOfNulls<Any>(10); // ale są tablice byteArrayOf booleanArrayOf  intArrayOf
//    var stanMagazynuString = arrayOfNulls<String>(10);
//    var tablicaintow = intArrayOf(23,4,5,6,6,4,3,2,2) // inty
//    var tablicaChar = charArrayOf('d','f','r','f') // chary
//    var tablicaMieszana = arrayOf(3,2,"sfdsd", 3,6,'s') // mieszane typy
//
//    // inputy do tablicy
//    stanMagazynuAny[1] = 23;
//    stanMagazynuAny[2] = "wfwef";
/*
    // z kursu
    var tablica :Array<String> = arrayOf("Artur", "Andrzej", "Blazek", "Gosia")

    for (imie: String in tablica){
        var dlugoscStringa: Int = imie.length
        println (dlugoscStringa)
        while (dlugoscStringa > 0){

            println(imie[dlugoscStringa - 1])
            dlugoscStringa --
        }
    }

*/












// ##@$@#@#@##@#@  10 wlasne funkcje

/*
    fun mnozenieDwochLiczb(czynnik1: Int, czynnik2: Int): Int {
        return czynnik1 * czynnik2
    }




    fun sumaCyfr(liczba: Int): Int {
        var wynik: Int = 0;
        var cyfra: Int;
        var number: Int =
            liczba; // trzeba przechwycic przekazywana liczbe bo nie mozemy na argumencie wykonywac operacji

        while (number > 0) {
            cyfra = number % 10
            wynik += cyfra // wynik = wynik + cyfra
            number /= 10
        }
        return wynik
    }

    fun main(vargs: Array<String>){
        // to jesat funkcja main
        println(mnozenieDwochLiczb(sumaCyfr(12345), sumaCyfr(6789)))
    }
        */

/*
















// ##@$@#@#@##@#@  11 try catch
fun pierwiastek(liczba: Double): Double {
    if (liczba < 0) {
        throw ArithmeticException("podales liczbe ujemna")
    }
    return sqrt(liczba)
}

fun main(vargs: Array<String>) {


    while (true) {
        println("podaj liczbe do sperwiastkowania")
        var liczbaInput: String = readLine()!!;

        try {
            println(pierwiastek(liczbaInput.toDouble()))
        } catch (wyjatek: NumberFormatException) {
            println(wyjatek)
            println("nieprawidlowe dane wejsciowe")
        } catch (wyjatek: ArithmeticException) {
            // przechwycenie wyjatku z funkcji pierwiastek
            println(wyjatek.message)
        } catch (kazdyInnyWyjatek: Exception) {
            // obsluga kazdego innego wyjatku
            println(kazdyInnyWyjatek)
        }
    }
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // zadanie stworz  program ktory pozwoli dostac sie do wybranego elementu tablicy
    // zabezpieczyc program zeby uzytkownik nie mogl
    // odwlac sie do nieistniejacego elementu tablicy

*/






















/*
// ##@$@#@#@##@#@  12 OOP
class Pies(waga: Int, glos: Int) {
    var waga = waga;
    var glos = glos;

    fun dajGlos() {
        for (i in 1..this.glos) {
            println("$i wuf wuf")
        }
    }

}

fun walkiPsow(pies1: Pies, pies2: Pies){
    if (pies1.glos > pies2.glos){
        println("pies 1 wygral")
    }else if(pies2.glos > pies1.glos){
        println("pies 2 wygral")
    }else{
        println("remis!")
    }
}

//  ##@$@#@#@##@#@  11 try catch
fun main(vargs: Array<String>) {
    var azor: Pies = Pies(1, 14); // podanie typu za nazwa nie jest wymagane jest zbyteczne
    var burek = Pies(2, 3);

    burek.dajGlos()
    azor.dajGlos()

    walkiPsow(azor, burek)

*/


















// ##@$@#@#@##@#@  13 dziedziczenie
/*

open class Postac(imie: String) { // klasa open tzn ze mozna po niej dziedziczyc
    var imie = imie
    var hp = 100
    var sila = 100
    var inteligencja = 10
    var kondycja = 100
    var zrecznosc = 10
    var bystrosc = 10

    fun atakuj(postac: Postac) {
        println("zadales obrazenia przciwnikowi ${postac.imie} rowne ${this.sila} ")
    }

    fun uzyjPotkiHP() {
        println("przywrociles sobie 30hp")
        this.hp = this.hp + 30
    }
}

class Mag(imie: String) : Postac(imie) {

    var mana = 100


    fun rzucZaklecie(postac: Postac) {
        postac.sila = postac.sila - 10

        //  skonczone 14:15
    }
}

class Wojownik(imie: String) : Postac(imie) {

    var wytrzymalosc = 100

    fun uderzMieczem(postac: Postac) {
        postac.kondycja = postac.kondycja -20;
        println("uderzyles przeciwnika mieczem zabrales mu ${postac.kondycja} energii")
    }

}



fun main(vargs: Array<String>) {

    var andrzej: Wojownik = Wojownik("Andrzej");
    var artur: Mag = Mag("Artur")

    println("andrzej.kondycja ${andrzej.kondycja}")
    println("andrzej.sila ${andrzej.sila}")
    println("artur.kondycja ${artur.kondycja}")
    println("artur.sila ${artur.sila}")
    andrzej.uderzMieczem(artur)
    artur.rzucZaklecie(andrzej)
    println("andrzej.kondycja ${andrzej.kondycja}")
    println("andrzej.sila ${andrzej.sila}")
    println("artur.kondycja ${artur.kondycja}")
    println("artur.sila ${artur.sila}")
}
*/
// zadanie prowadzacego
/*
open class Zwierzak(imie: String, waga: Int, szybkosc: Int, glos: Int, sila: Int) {
    var imie = imie;
    var waga = waga
    var szybkosc = szybkosc
    var glos = glos
    var sila = sila
}

class Kot (imie: String, waga: Int, szybkosc: Int, glos: Int, sila: Int) : Zwierzak (imie, waga, szybkosc, glos, sila){

}

class Pies (imie: String, waga: Int, szybkosc: Int, glos: Int, sila: Int) : Zwierzak (imie, waga, szybkosc, glos, sila){

}

fun ktoWygra(pies: Pies, kot: Kot): Zwierzak? { // zwraca Zwierzaka ale moze tez byc null jesli jest remis
    var punktyPsa = 0
    var punktyKota = 0

    if (pies.waga > kot.waga)punktyPsa++
    else if (pies.waga == kot.waga){
        punktyKota++
        punktyPsa++
    }else punktyKota++

    if (pies.sila > kot.sila)punktyPsa++
    else if (pies.sila == kot.sila){
        punktyKota++
        punktyPsa++
    }else punktyKota++


    if (pies.szybkosc > kot.szybkosc)punktyPsa++
    else if (pies.szybkosc == kot.szybkosc){
        punktyKota++
        punktyPsa++
    }else punktyKota++

    if (pies.glos > kot.glos)punktyPsa++
    else if (pies.glos == kot.glos){
        punktyKota++
        punktyPsa++
    }else punktyKota++


    if(punktyKota > punktyPsa) {
        println("ktoWygra wygral ${kot.imie}")
        return kot
    }
    else if (punktyKota < punktyPsa) {
        println("ktoWygra wygral ${pies.imie}")
        return pies
    }else return null // w przypaku remisu




}


fun ktoWygraNaTypachOgolnych(zwierzak1: Zwierzak, zwierzak2: Zwierzak): Zwierzak? { // zwraca Zwierzaka ale moze tez byc null jesli jest remis
    // a to metoda na typach ogolnych nadrzednych
    var punktyPsa = 0
    var punktyKota = 0

    if (zwierzak1.waga > zwierzak2.waga)punktyPsa++
    else if (zwierzak1.waga == zwierzak2.waga){
        punktyKota++
        punktyPsa++
    }else punktyKota++

    if (zwierzak1.sila > zwierzak2.sila)punktyPsa++
    else if (zwierzak1.sila == zwierzak2.sila){
        punktyKota++
        punktyPsa++
    }else punktyKota++


    if (zwierzak1.szybkosc > zwierzak2.szybkosc)punktyPsa++
    else if (zwierzak1.szybkosc == zwierzak2.szybkosc){
        punktyKota++
        punktyPsa++
    }else punktyKota++

    if (zwierzak1.glos > zwierzak2.glos)punktyPsa++
    else if (zwierzak1.glos == zwierzak2.glos){
        punktyKota++
        punktyPsa++
    }else punktyKota++


    if(punktyKota > punktyPsa) {
        println("ktoWygraNaTypachOgolnych wygral ${zwierzak2.imie}")
        return zwierzak2
    }
    else if (punktyKota < punktyPsa) {
        println("ktoWygraNaTypachOgolnych wygral ${zwierzak1.imie}")
        return zwierzak1
    }else return null // w przypaku remisu




}

fun main(vargs: Array<String>) {
    var mruczek: Kot = Kot("mruczek", 20, 100, 20, 20)
    var burek: Pies = Pies("burek", 10, 50, 80, 10)

    ktoWygra(burek, mruczek)
    ktoWygraNaTypachOgolnych(burek, mruczek)

}
*/

















// ##@$@#@#@##@#@  15 wczytywanie danych z pliku

/*
fun wczytjaPlik(path: String): List<String>{
    var plik: File = File(path)

//    println(plik.absolutePath)
//    println(plik.path)
//    println(plik.canonicalPath)

    return plik.readLines()
}

fun policzSredniaPliku(listaStringow: List<String>){
    var listLength: Int = listaStringow.size
    var sumOfItems: Double = 0.0
    var average: Double = 0.0


    for (string: String in listaStringow) {
        println(string)
        sumOfItems = sumOfItems + string.toInt()!!
    }

    println("sumOfItems: $sumOfItems")
    average = sumOfItems / listLength
    println("average: $average")
    println("po zaokragleniu: %.2f".format(average)) // formatowanie
    println("po zaokragleniu: %.2E".format(average)) // notacja naukkowa

}


fun main(vargs: Array<String>) {

    var filePath = "C:\\Users\\Gosia_Konrad\\Desktop\\batteryInventory\\kotlinRevolShen\\wczytywanieDnaychZplikuCwiczenie15.txt"

print(policzSredniaPliku(wczytjaPlik(filePath)))




}
        */



/*
// ##@$@#@#@##@#@  16 tablice dwuwymiarowe

fun main(vargs: Array<String>) {

    var tablica2D = Array(2000, {IntArray(1000)})

    for (i: Int in 0 until 2000){
        for (u: Int in 0 until 1000){
            tablica2D[i][u] = i * u
        }
    }

    for (i: Int in 0 until 2000){
        for (u: Int in 0 until 1000){
            println(tablica2D[i][u])
        }
    }
*/

// ##@$@#@#@##@#@  17 wykoszona tablica i zapis do pliku
fun main(vargs: Array<String>) {


}
