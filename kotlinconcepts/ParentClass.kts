open class ParentClass{
  open  var name:String = "Parent"
    constructor(name:String){
        this.name = name
    }
  open  fun printName(){
        println(name)
    }
}

class ChildClass : ParentClass{


    constructor(name:String):super(name){

    }

    override var name:String = "Child"

    override fun printName(){

    }
}