class lateInitClass{

    lateinit var name:String


    fun main(args:Array<String>){
        println(name.toString())
    }
}

lateInitClass().main(arrayOf())