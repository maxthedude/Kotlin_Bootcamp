/**
Package:
Created by: Markus
On: 05.10.2019
 **/

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    println( decorations.filter {it[0] == 'p'})
    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: " + eager)
    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    // prints no values at not evaluated
    println("filtered: " + filtered)
    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: " + newList)
}