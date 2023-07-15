package cl.awakelabs.kotlin13b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
data class Hero(
    val superHero: String,
    val publisher: String,
    val realName: String,
    val photo: String
)

fun main() {
    var cant: Int = 1


    var heros = mutableListOf<Hero>()
    while (cant == 1) {
        println("Nombre")
        var name = readln()
        println("Publisher")
        var publisher = readln()
        println("Nombre Real")
        var realName = readln()
        println("Foto")
        var photo = readln()
        heros.add(Hero(name, publisher, realName, photo))
        println("Ingrese un nuevo heroe")
        var cant: Int = readln().toInt()
    }

    for (h in heros) {
        println(h)
    }

}