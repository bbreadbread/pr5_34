fun main()
{
    print("Введите значение x: ")
    val x = readLine()!!.toDouble()
    when
    {
        x>-3 -> println("F(x) = " + 1/((Math.pow(x,3.0))+1))
        else -> println("F(x) = 9")
    }
}