

fun main() {
    var humidity = "humid"
    var humidityLevel=80
    while(humidity=="humid"){
        humidityLevel-=5
        println("humidity decrase")
        if(humidityLevel<60){
            humidity="comfy"
            print("\n its comfy now")
        }
    }
}