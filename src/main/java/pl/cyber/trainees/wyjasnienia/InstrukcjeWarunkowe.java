package pl.cyber.trainees.wyjasnienia;

public class InstrukcjeWarunkowe {
/*
Instrukcja warunkowa if

BUDOWA if'a

CONDITION (boolean) - inaczej warunek sprawdzający np i<0, a+b = 2, 2%2 = 0 itp.

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
}

if(2+2 = 4) {
println("dodawanie równe 4");
}

else - potocznie w przeciwnym wypadku

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {
println("dodawanie równe 4");
} else {
println("dodawanie nie równe 4");
}

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else if(COUNDITION 2) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {<- zostanie wyświetlone
println("dodawanie równe 4");
} else if(2+1 = 3) {
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4");
}


a+b = 4
if(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+1 = 3) { <- true
println("dodawanie równe 3"); <- zostanie wyświetlone
 } else {
println("dodawanie nie równe 4");


a+b = 4
if(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+2 = 3) { <- false
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4"); <- zostanie wyświetlone
}


 */

  //Utworzyć metodę która zwróci true/false
  // jeśli podana liczba w parametrze
  // i zweryfikuje czy nie jest równa 10

  public boolean sprawdzenieRownosci(Integer liczba) {
// != - sprawdzanie czy liczzba nie równa się innej liczbie
// == - sprawdzanie czy liczzba równa się innej liczbie

//dwa równoważne zapisy
//    if(liczba != 10) {
//      return true;
//    } else {
//      return false;
//    }

//    if(liczba == 10) {
//      return false;
//    } else {
//      return true;
//    }

    //trzecie równoważne
    if(liczba != 10) {
      return true;
    }

    return false;
  }
}
