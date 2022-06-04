package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Genero(
    var nome: String,
    val id: Long = -1
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaGeneros.NOME_GENERO,nome)

        return valores
    }

}