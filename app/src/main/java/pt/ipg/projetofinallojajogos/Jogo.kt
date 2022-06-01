package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Jogo(

    var nome: String,
    var genero: String,
    var publicadora: String,
    var platadorma: String,
    var preco: Float,
    var data_de_lancamento: Long,
    val id: Long = -1

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