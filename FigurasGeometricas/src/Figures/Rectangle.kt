package Figures
import Interfaces.Drawable
import Interfaces.Describable

open class Rectangle: Drawable, Describable {

    override var lenght: Int = 10
    override var width: Int = 5

    override fun draw (): String {
        var figure: String = ""
        for (x in 1..this.lenght) {
            for (y in 1..this.width) { figure += " * "}
            figure += "\n"
        }
        return figure
    } // dibuja el rectangulo


    override fun requestDescription() {
        print("Ingrese la altura: ")
        this.lenght = readLine()!!.toInt()
        print("Ingrese el ancho: ")
        this.width = readLine()!!.toInt()
    } // pide las dimensiones

}
