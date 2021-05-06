fun main() {
    intro("Aluel",22)
    juiceMachine(6)
    juiceMachine(12)
    juiceMachine(20)

}
fun intro(name:String,age:Int){
   println("My name is $name and I am $age years old")
}
fun juiceMachine(age: Int) {
    if (age<6)
        println("milk")
    else if (age>16)
        println("fanta")
    else{
        println("coca cola")
    }
}
fun human(name:String,age:Int,weight:Float











