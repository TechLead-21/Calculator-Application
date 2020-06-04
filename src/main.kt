fun main(vararg arg: String){
    println("Please enter your arithmetic problem...")
    var input: String? = readLine()

    while ( input!=null && input.isNotBlank() ){

        val values:List<String> = input.split( ' ')

        val operator: String = values[1]
        val lhs = values[0]
        val rhs = values[2]

        when (operator){
            "+" -> println(lhs.toDouble() + rhs.toDouble())
            "-" -> println(lhs.toDouble() - rhs.toDouble())
            "*" -> println(lhs.toDouble() * rhs.toDouble())
            "/" -> println(lhs.toDouble() / rhs.toDouble())

            else -> throw IllegalArgumentException("Invalid operator: $operator")

        }

        input = readLine()
    }

    println("Good bye!")
}