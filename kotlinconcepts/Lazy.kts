class lazyExample{

    var expensiveCalculation = ExpensiveCalculation()
    fun main(args:Array<String>){
        println(expensiveCalculation.mutableList)
    }
}

class ExpensiveCalculation{
    var mutableList = mutableListOf<Int>()
    ExpensiveCalculation(){
        for (1..1000000){
            mutableList.add(1)
        }
    }
}