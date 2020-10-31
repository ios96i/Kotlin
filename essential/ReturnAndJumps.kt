fun main() {

    for(n in 1..10){
        if(n==6){
            break   //continue: jump and get back to loop , break: stop loop
        }
        print(n)
    }

    //for inner loop and extarnal
    loop@for (num in 1..10) {
        println("num :$num")
        for (i in 1..7) {
            println("inner loop : $i")
            if (i == 6) {
                break@loop
            }
        }
    }
}