import java.util.Scanner

/*
Prompt for time
Multiply hours by .5
Remove the decimal
*/

fun main() {
    print("Please enter the hours cycled and I'll tell you how much water Nathan drank__________:")
    
    //Scanner object for reading input
    val reader = Scanner(System.`in`)

    //Double variable from keyboard input
    val hoursCycled:Double = reader.nextDouble()

    //Truncate the decimal -- rounding down to the nearest whole
    val waterConsumed = (hoursCycled * .5).toInt()
    
    //Display output
    print("Nathan drank $waterConsumed liter(s)") 
}
