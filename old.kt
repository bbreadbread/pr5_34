fun main()
{
print("Введите возраст:")
val a = readLine()!!.toInt()
when(a)
    {
        in 0..2 -> println("Младенец")
        in 3..11 -> println("Ребенок")
        in 12..18-> println("Подросток")
        in 19..35-> println("Молодость")
        in 36..59-> println("Зрелость")
        in 60..130-> println("Старость")
        else -> println("Нереальный возраст")
    }
}