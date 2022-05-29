package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

class LinhaVenda(
    val id: Long,
    var quantidade: Int,
    var preco: Float,
    var percentagemIva: Float,
    var idjogo: Long,
    var idvenda: Long
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaLinhaVenda.QUANTIDADE,quantidade)
        valores.put(TabelaLinhaVenda.PRECO,preco)
        valores.put(TabelaLinhaVenda.PERCENTAGEM_IVA,percentagemIva)
        valores.put(TabelaLinhaVenda.CAMPO_FK_JOGOS,idjogo)
        valores.put(TabelaLinhaVenda.CAMPO_FK_VENDA,idvenda)
        return valores
    }
}