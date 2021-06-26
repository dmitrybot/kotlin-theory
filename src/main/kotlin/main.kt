fun hello(firstName: String, secondName: String){ // функция, ничего не возвращающая
    println("Hello, $firstName $secondName")
}

fun hello2(firstName: String, secondName: String): Unit{ // Unit - аналог void
    println("Hello, $firstName $secondName")
}

fun hello3(firstName: String, secondName: String) = println("Hello, $firstName $secondName") // короткая запись функции ничего не возвращающей

fun hello4(firstName: String, secondName: String): String = "Hello, $firstName $secondName" // короткая запись функции, что-то возвращающей

fun sum(x: Int, y: Int): Int{ // функция, возвращающая значение
    return x + y
}

fun checkSum(y: Int, z: Int) = // функция, возвращающая резуьтат when с разными типами данных
    when(val x = sum(y, z)){
        in 0..Int.MAX_VALUE -> true
        in Int.MIN_VALUE..0 -> "net"
        else -> 0
    }
fun main(args: Array<String>) { // основная функция
    var age: Int = 18 // создание переменной, var - не константная, дальше название, тип и по желанию инициализация
    val myName: String = "Dima" // val - константа
    var oneLetter: Char? = null // способ присвоить null
    var correct = true // автоматическое определение типа переменной
    var num1: Float = 4.5f; var num2: Double = 4.55555555555555555
    val (name, weight) = Pair("Иван", 24)


    print("Hello World!") // вывод
    println("Hello World!") // вывод и переход на новую строку в конце
    println("My age is $age") // упрощенный вывод нескольких объектов
    println("My age was " + (age - 1)) // классический вывод нескольких объектов

    // if/else как везде
    val number = 10
    var res = if(number > 10) 1 else 0 // сокращенная запись ифа
    if(res == 1) println(1) else println(0)

    val animal = "Собака"
    when (animal) { // when это альтернатива switch/case
        "wolf" -> { // многострочное тело
            println("$animal - Волк.")
            println(".")
        }
        "Кот", "Собака" -> println("$animal - Домашнее животное.") // несколько вариантов
        else -> println("$animal - Дикое животное.") // если ничего не подошло
    }

    val numberName = when (number) { // результат возврата when можно присваивать переменной или выводить как результат функции
        2 -> "два"
        4 -> 4 // можно возвращать разные типы
        6, 7 -> 67
        8 -> 8
        is Int -> "целочисленное" // проверка на принадлежность классу
        in 10..14 -> "десять" // проверка на принадлежность интервалу
        in 14..Int.MAX_VALUE -> "много"
        in age..0 -> "возраст"
        else -> {
            println("Неизвестный номер")
            "Неизвестный"
        }
    }

    when { // можно использовать без аргумента
        number % 2 == 0 -> println("Четный") // если мы не используем аргумент, можно использовать сложные условия
        else -> println("Нечетный")
    }

    hello(myName, "Vasil'ev") // вызов функции
    hello2(myName, "Vasil'ev") // вызов функции
    hello3(myName, "Vasil'ev") // вызов функции
}