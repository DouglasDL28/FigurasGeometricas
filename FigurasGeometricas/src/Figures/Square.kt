package Figures
import Interfaces.Drawable
import Interfaces.Describable

open class Square: Drawable, Describable {
    override var lenght: Int = 5
    override var width: Int = 5

    override fun draw (): String {
        var figure: String = ""
        for (x in 1..this.lenght) {
            for (y in 1..this.width) { figure += " * "}
            figure += "\n"
        }
        return figure
    }

    override fun requestDescription() {
        print("Ingrese el largo: ")
        this.lenght = readLine()!!.toInt()
        this.width = this.lenght
    }
}