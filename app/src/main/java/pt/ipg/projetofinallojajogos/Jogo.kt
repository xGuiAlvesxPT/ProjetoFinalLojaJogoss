package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Jogo(
    val id: Long,
    var nome: String,
    var genero: String,
    var publicadora: String,
    var platadorma: String,
    var preco: Int,
    var data_de_lancamento: String

) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaJogos.NOME_JOGO,nome)
        valores.put(TabelaJogos.GENERO,genero)
        valores.put(TabelaJogos.PUBLICADORA,publicadora)
        valores.put(TabelaJogos.PLATAFORMA,platadorma)
        valores.put(TabelaJogos.PRECO,preco)
        valores.put(TabelaJogos.DATA_DE_LANCAMENTO,data_de_lancamento)
        return valores
    }


}