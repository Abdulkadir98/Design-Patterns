/* Strategy Pattern
    Through Object delegation in Kotlin
 */

interface FlyBehaviour {
    fun fly()
}

interface QuackBehaviour {
    fun quack()
}

// "object" instantiates only one object of class (Singleton pattern).
object FlyNoWings : FlyBehaviour {
    override fun fly() {
        println("I can't fly!")
    }
}

object Squeak: QuackBehaviour {
    override fun quack() {
        println("Squeak!")
    }
}

object MuteQuack: QuackBehaviour {
    override fun quack() {
        println("Cannot speak!")
    }
}

object FlyRocketPowered: FlyBehaviour {
    override fun fly() {
        println("Flying with a rocket!")
    }
}

class MallardDuck(quackBehaviour: QuackBehaviour, flyBehaviour: FlyBehaviour) :
                    QuackBehaviour by quackBehaviour, FlyBehaviour by flyBehaviour

fun main(args: Array<String>) {
    val duck = MallardDuck(Squeak, FlyNoWings)
    duck.fly()
    duck.quack()

    val md = MallardDuck(MuteQuack, FlyRocketPowered)
    md.quack()
    md.fly()
}