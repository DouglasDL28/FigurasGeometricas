package Figures
import Interfaces.Drawable
import Interfaces.Describable

open class Triangle: Drawable, Describable {
    override var lenght: Int = 0
    override var width: Int = 5

    override fun draw():String{
        var figure = ""
        for (i in 0..this.lenght) {
            for (k in i..lenght) {
                figure += " "
            }
            for (j in 0..i) {
                if (i != lenght - 1)
                    if (j == 0 || j == i)
                        figure +="*"
                    else
                        figure +="*"
                else
                    figure +="*"
                figure +=" "
            }
            figure+="\n"
        }
        return figure
    } //dibuja en triangulo

    override fun requestDescription() {
        print("Ingrese la altura: ")
        this.lenght = readLine()!!.toInt()
    } // pide las dimensiones

}