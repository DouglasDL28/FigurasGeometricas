import Figures.Rectangle
import Figures.Square
import Figures.Triangle
import Interfaces.Describable
import Interfaces.Drawable

fun main (args: Array<String>) {
    val square = Square()
    val rectangle = Rectangle()
    val triangle = Triangle()

    var wantToContinue: Boolean = true

    do {
        println(mainMenu)
        var opcion = readLine()!!.toInt()

        when (opcion){
            1 -> {println(menu)
                var opcion2 = readLine()!!.toInt()
                when (opcion2){
                    1 -> {requestDescription(square)
                        drawFigure(square)}

                    2 -> {requestDescription(rectangle)
                        drawFigure(rectangle)}

                    3 -> {requestDescription(triangle)
                        drawFigure(triangle)}
                }
            }

            2 -> {wantToContinue = false}
        }

    } while (wantToContinue)
}


fun requestDescription (figure: Describable){
    figure.requestDescription()
}
fun drawFigure (figure: Drawable) {
    print(figure.draw())
}

val mainMenu = """
    MENU PRINCIPAL
    1. Dibujar figura
    2. Salir
""".trimIndent()

val menu = """
    MENU
    1. Dibujar un cuadrado.
    2. Dibujar un reactangulo.
    3. Dibujar un triangulo.
""".trimIndent()