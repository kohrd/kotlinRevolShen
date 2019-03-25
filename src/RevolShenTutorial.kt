import com.sun.org.apache.xml.internal.utils.DefaultErrorHandler
import javafx.beans.binding.When
import jdk.nashorn.internal.lookup.Lookup
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

fun pierwiastek(liczba: Double): Double {
    if (liczba < 0) {
        throw ArithmeticException("podales liczbe ujemna")
    }
    return sqrt(liczba)
}

fun main(vargs: Array<String>) {
    // ##@$@#@#@##@#@  11 try catch

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


}