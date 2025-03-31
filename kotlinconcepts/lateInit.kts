/**
 * Late Init keyword is used in case we need to define non nullable mutable var later in code and we are sure the value
 * will be initialsed before used.
 * lateinit sirf non-nullable var ke liye hota hai, aur isko manually initialize karna padta hai.
 *
 */
class lateInitClass{

    lateinit var name:String
    constructor(name:String){
        this.name = name
    }

    fun main(args:Array<String>){
        println(name.toString())
    }
}

lateInitClass("late Init").main(arrayOf())