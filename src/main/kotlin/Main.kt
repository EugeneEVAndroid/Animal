
fun main() {

    println("Создать коллекцию плотоядных. Продолжить?  д")
    var cont = readln()
    if (cont=="д") {
        val carn = Carnivores()
        println("Вид")
        carn._name = readln()
        println("Цвет")
        carn._color = readln()
        println("Голос")
        carn._voice = readln()
        println("Прыжок")
        carn._jump = readln().toInt()
        println("Скорость")
        carn._speed = readln().toInt()
        var carnivores: MutableList<Carnivores> = mutableListOf(carn)
        var i = 1
        println("Продолжить? д")
        cont = readln()
        while (cont == "д") {
            var carn1 = Carnivores()
            carn1._name = readln()
            carn1._color = readln()
            carn1._voice = readln();
            carn1._jump = readln().toInt()
            carn1._speed = readln().toInt()
            carnivores.add(carn1)
            println("Продолжить? д")
            cont = readln()
            i++
        }
        println("Плотоядные")
        for (i in 0..(carnivores.count() - 1)) {

            print(" Вид: ${carnivores[i]._name}")
            print("  ")
            print(" Голос: ${carnivores[i]._voice}")
            print("  ")
            print("Цвет: ${carnivores[i]._color}")
            print("  ")
            print(" Прыжок: ${carnivores[i]._jump}")
            print("  ")
            println(" Скорость: ${carnivores[i]._speed}")
        }
    }
    println("Создать коллекцию травоядных. Продолжить?  д")
    cont = readln()
    if (cont=="д"){
    val herb = Herbivores()
        println("Вид")
    herb._name = readln()
        println("Цвет")
    herb._color = readln()
        println("Голос")
    herb._voice = readln()
        println("Вес")
    herb.weight = readln().toInt()
        println("Рост")
    herb.height = readln().toInt()
    var herbivores: MutableList<Herbivores> = mutableListOf(herb)
    var j = 1
    println("Продолжить? д")
    cont = readln()
    while (cont == "д") {
        var herb1 = Herbivores()
        herb1._name = readln()
        herb1._color = readln()
        herb1._voice = readln();
        herb1.weight = readln().toInt()
        herb1.height = readln().toInt()
        herbivores.add(herb1)
        println("Продолжить? д")
        cont = readln()
        j++
    }
        println("Травоядные")
        for (i in 0..(herbivores.count() - 1)) {
            print(" Вид: ${herbivores[i]._name}")
            print("  ")
            print("Голос: ${herbivores[i]._voice}")
            print("  ")
            print("Цвет: ${herbivores[i]._color}")
            print("  ")
            print(" Вес: ${herbivores[i].weight}")
            print("  ")
            println(" Высота: ${herbivores[i].height}")
        }
    }


}




