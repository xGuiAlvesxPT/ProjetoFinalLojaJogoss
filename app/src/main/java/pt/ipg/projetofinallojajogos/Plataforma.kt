package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Plataforma(
    var nome: String,
    val id: Long = -1
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaPlataformas.NOME_PLATAFORMA,nome)

        return valores
    }


}