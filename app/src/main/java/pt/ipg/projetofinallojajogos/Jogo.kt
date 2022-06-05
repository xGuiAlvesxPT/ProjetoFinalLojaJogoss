package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Jogo(

    var nome: String,
    var publicadora: String,
    var preco: Float,
    var data_de_lancamento: String ,
    var idplataforma: Long,
    var idgenero: Long,
    var id: Long = -1,

    ) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaJogos.NOME_JOGO,nome)
        valores.put(TabelaJogos.PUBLICADORA,publicadora)
        valores.put(TabelaJogos.PRECO,preco)
        valores.put(TabelaJogos.DATA_DE_LANCAMENTO,data_de_lancamento)
        valores.put(TabelaJogos.CAMPO_FK_PLATAFORMA,idplataforma)
        valores.put(TabelaJogos.CAMPO_FK_GENERO,idgenero)
        return valores
    }


}