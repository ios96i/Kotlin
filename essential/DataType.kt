fun main (){

    val name:String="osama"
    val age:Int=24
    val GPA=2.32

    println("===user info ===")
    println("Name: $name")
    println("Age:"+age)
    println("GPA: $GPA")

    var count=1
    println(count)
    count=10
    println(count)

    var department:String?
    department=null
    department="Comm Engineer"
    println("department: ${department!!}")

}