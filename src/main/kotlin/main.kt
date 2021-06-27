import java.util.*

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

    var items: Array<Int> = arrayOf(5, 6, 12, 9, 1 ,8) // создание дефолтного массива
    var items2 = arrayOf(3, 4, 2) // упрощение
    val items3 = arrayOf(3, 4, 2) // если массив val, его нельза переприсваивать и расширять, но менять элементы можно
    val myArray = arrayOf<Int>(1, 2, 3, 4, 5) // способы указания типа данных в массиве
    val myArray2 = intArrayOf(1, 2, 3, 4, 5)
    val array: Array<Int?> = arrayOfNulls(3) // [null, null, null]
    var array2 = emptyArray<String>()// создание пустого массива
    val array3 = Array(5, { i -> i * 2 }) // пример конструктора массива
    val letters = Array<String>(26) { i -> ('A' + i).toString() } // i - это индекс создаваемого элемента
    val reversedAlphbet = letters.reversedArray() // перевернуть массив без изменения оригинала
    array.reverse() // перевернуть оригинал
    val zeros = IntArray(3) // первый способ создания массива с дефолтным заполнением
    val zeros2 = intArrayOf(0, 0, 0) // второй способ при помощи фабричного метода

    items2 += 5 // пример добавления элемента
    items2 = arrayOf(3, 4) // пересоздание массива
    val myArray3 = items3 + myArray // пример сложения массивов

    items3.sort() // сортировка по возрастанию
    items3.sort(0, 2) // сортировка интервала, последний индекс не учитывается
    items3.sortDescending() // созтировка по убыванию
    val sortedNumbers = items3.sortedArray() // новый отсортированный массив
    val descendingSortedNumber = items3.sortedArrayDescending() // новый отсортированный массив в обратном порядке
    items3.sortWith(Comparator { c1: Int, c2: Int -> c1 - c2 }) // сортировка сложных объектов с компаратором
    items3.sortBy { cat -> cat % 2 } // вместо компаратора можно указать условие сравнения

    println(items[0]) // обращение к элементу по индексу
    println(items.get(1)) // обращение к элементу по индексу
    println(items.set(0, 45)) // изменение элемента по индексу
    println(items.size) // размер массива
    println(items.contains(9)) // содержится ли элемент в массиве
    println(items.average()) // среднее арифметическое элеметов
    println(items.sum()) // сумма элементов
    println(items.min()) // минимум
    println(items.max()) // максимум

    items.onEach {it * 2} // применение действия ко всем элементам массива

    // способы вывода массива
    println(Arrays.toString(array3)) // старый способ
    println(letters.contentToString()) // рекомендуемый способ

    for (elem in items){ // проход по массиву
        print("$elem ")
    }
    println("")

    for ((index, value) in items.withIndex()) { // проход по массиву с индексами
        println("Значение индекса $index равно $value")
    }

    for (index in items.indices) {
        println("Значение индекса $index равно ${items[index]}") // проход только по индексам
    }

    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for(index in numbers.indices - 2) { // особенность поля indices
        println(numbers[index]) // 1 2 4 5
    }

    items.forEach { elem -> // предпочтительный проход по массиву
        print("$elem ")
    }
    println("")

    items.forEachIndexed { index, elem -> // предпочтительный проход по массиву с индексами
        print("($elem, $index) ")
    }
    println("")

    var rubikCube = arrayOf<Array<Array<Int>>>() // создание трехмерного массива
    for (i in 0..2) { // заполнение трехмерного массива
        var piece = arrayOf<Array<Int>>()
        for (j in 0..2) {
            var array = arrayOf<Int>()
            for (k in 0..2) {
                array += 0
            }
            piece += array
        }
        rubikCube += piece
    }

    var mas: List<Int> = listOf<Int>(5, 6, 12, 9, 1 ,8) // создание дефолтного списка (массива с большим количеством методов)
    var mas2: List<Int> = listOf(5, 6, 12, 9, 1 ,8) // упрощение
    var mas3 = listOf(5, 6, 12, 9, 1 ,8) // упрощение
    var mas4 = mutableListOf(5, 6, 12, 9, 1 ,8) // изменяемый список

    var map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three") // создание дефолтного словаря
    var map2: Map<Int, Any> = mapOf(1 to "one", 2 to 2, 3 to true) // Any - общий тип данных
    var map3 = mapOf(1 to "one", 2 to 2, 3 to true) // Упрощение
    var map4 = mutableMapOf(1 to "one", 2 to 2, 3 to true) // Изменяемый словарь

    mas4.add(5)
    mas4.addAll(mas2)

    map.forEach { key, value -> // проход словаря
        print("($key: $value) ")
    }
    println("")
}