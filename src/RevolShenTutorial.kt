import com.sun.org.apache.xml.internal.utils.DefaultErrorHandler
import jdk.nashorn.internal.lookup.Lookup

fun main(args: Array<String>) {
//2

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

//4
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

// 5
//    val naszaStala: Int = 23
//    var naszaLiczba: Int = readLine()!!.toInt(); // cast to Int
//    println("podaj liczbe")
//    if (naszaLiczba >= naszaStala) println("wieksza")
//    else if(naszaLiczba%2 == 0) println("podana liczba jest mniejsza niz stala oraz jest parzysta")
//    else println("podana liczba jest mnniejsza nisz stala -> $naszaStala oraz nieparzytsa")


    // 6 petle
/*
    for (i in 1..20) println ("i in 1..20 $i")
    for(i in 5 downTo -23) println ("licznik i in 5 downTo -23 $i")
    for(i in 100 downTo -20 step 5) println("i in 100 downTo -20 step 5 $i")
*/

    println("ile czasu chcesz odmierzyc?")
    var czas: Int = readLine()!!.toInt()
    for (i in czas downTo 0) {
        if (i != 0) {
            println(i)
            Thread.sleep(100) // zatrzymanie watku o 1000 ms

        } else {
            println("koniec czasu")
        }
    }
}




