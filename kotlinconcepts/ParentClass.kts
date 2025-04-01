/**
 * Classes → open ka matlab hai inheritance allow karna. By default, Kotlin classes final hoti hain, to subclass nahi bana sakte bina open lagaye.
 *
 * Functions → open ka matlab hai function ko override kar sakna subclass me. Agar open nahi hoga, to override nahi kar sakte.
 *
 * Variables (Properties) → open lagane se subclass us property ko override kar sakta hai.
 */
open class Parent {
    open var name: String = "Parent"

    open fun greet() {
        println("Hello from Parent")
    }
}

class Child : Parent() {
    override var name: String = "Child"

    override fun greet() {
        println("Hello from Child")
    }
}

fun main(args: Array<String>) {
    val child = Child()
    println(child.name)
    child.greet()
}