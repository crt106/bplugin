import com.google.gson.Gson
import java.io.*
import java.nio.charset.Charset
import java.util.*

/**
 * @author chaoruitao
 * @date 2019-07-29
 */
class Gensokyo() {
    var gson: Gson = Gson()
    val coorsFile: String = "coors.json"
    var coorList = listOf<CoorModel>()

    init {
        val instream = this.javaClass.classLoader.getResourceAsStream(coorsFile)
        if (instream != null) {
            val breader = instream.bufferedReader(Charsets.UTF_8)
            val jsontext = breader.readText()
            coorList = gson.fromJson(jsontext, arrayListOf<CoorModel>().javaClass)
            print(coorList)
        }
    }


}

fun main() {
    val gensokyo = Gensokyo()
}