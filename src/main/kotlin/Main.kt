fun main(){
//    var x: Int =10
//    var y: Long =100
//    var f: Float = 3.14f
//    var d: Double = 9.8
//    var status: Boolean= true
//    var name: String ="Siam"
//    var c: Char = 'S'
//    var s: Short =100
////    var b: Byte =1
//    println(x.times(5));
//    val a =10
//    val b = 20
//    val sum=a+b
//    println("The sum of $a and $b is $sum")
//    val country="Bangladesh"
//    println("I live in $country and $country is ${country.length} character long");
//    val l = country.length
//    var count=0
//    for(c in country)
//    {
//        if(count%2!=0){
//            print(c.uppercase());
//        }
//        else
//        {
//            print(c.lowercase());
//        }
//        count++;
//
//    }
//    val x = 10
//    val y = 20
//     val result=if(x>y){
//                "$x is highest "
//            }
//            else if(x<y){
//                 "$x is lowest"
//            }
//            else
//            {
//               "$x and $y is same"
//            }
//    println(result)
//    val temperature =27
//    val output= when (temperature) {
//        in 10..15 -> {
//            "Very Cold"
//        }
//        in 16..20 -> {
//            "Cold"
//        }
//        in 21..25 -> {
//            "Warm"
//        }
//        in 26..30 -> {
//            "Pleasant"
//        }
//        in 31..34 -> {
//            "Hot"
//        }
//        else -> {
//            "Very Hot"
//        }
//    }
//    println(output)
//    for(i in 1..10 step 2){
//        println("Siam $i")
//    }
//    for (i in 10 downTo 1){
//        println("$i")
//    }
//    val marks= mutableListOf(1,2,4,5,6,22,34)//immutable
//    print(marks.add(2,100))
//    println(marks)
//    add(2,4)
//    showFullName(firstName = "Rahman", lastName = "Siam")
//        var x: Int =1
//        val f:(String,String)->Unit ={ s1,s2->
//            print("$s1 $s2")
//        }
//    f("HI","Bye")
//   val sum= add(x=10,y=20,action=::action)//reference pass
    val cities = listOf("Dhaka","Chittagong","Rajshahi","Khulna","Barishal","Khulna","Sylhet")
    //foreach takes which element as function
    cities.forEach {
        println(it)
    }
    add(10,20){x,y->
        println(x+y)
    }

}
fun add (x:Int,y:Int, action:(Int,Int)->Unit){
    action(x,y)
}
//fun printElement(element:String):Unit =println(element)
//higher order function
//fun add(x:Int,y:Int,action:(Int,Int)->Int){
//    print(action(x,y))
//
//}
//fun action(a:Int,b:Int):Int=a+b
//fun showFullName(firstName: String,lastName:String)=println("$firstName $lastName")