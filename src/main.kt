fun main(vararg arg: String){
    println("Please enter your arithmetic problem...")

    /* Reading user input */
    var input: String? = readLine()

    while ( input!=null && input.isNotBlank() ){

        val values:List<String> = input.split( ' ')

        // Validations
        if (values.size < 3){
            println("Invalid input. Expected: value + value. Received: $input")
        }else {

            /* Inputs from user */
            val operator: String = values[1]
            val lhs = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[0]}")
            val rhs = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[1]}")

            /* Checking operator and performing arithmetic operation */
            val result = when (operator) {
                "+" -> lhs + rhs
                "-" -> lhs - rhs
                "*" -> lhs * rhs
                "/" -> lhs / rhs

                else -> throw IllegalArgumentException("Invalid operator: $operator")
            }
            println(result)
        }
        input = readLine()
    }

    println("Good bye! 👋🏼")
}