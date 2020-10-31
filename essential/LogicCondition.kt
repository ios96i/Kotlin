fun main(){
    // And Gate &&
    val grade= readLine()!!.toDouble()
    if(grade>=90){
        println("A")
    }else if(grade in 80.0..90.0){
        println("B")
    }else if (grade in 70.0..80.0){
        println("C")
    }else{
        println("D")
    }
}