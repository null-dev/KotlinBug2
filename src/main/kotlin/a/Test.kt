package a

import java.util.*

interface A : Parent {
    override fun testMethod(i: Random, j: String, k: Double) = true
}

interface B : Parent {
    override fun method() = true
}

interface C : B, A {
    override fun testMethod(i: Random, k: Double) = true
}

class D : C

fun main() {
    D().testMethod(Random(), "", 0.0)
}