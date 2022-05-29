package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Venda(
    val id: Long,
    var data_de_venda: String,
    var idcliente: Long,
    var idfuncionario: Long
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaVendas.DATA_DE_VENDA,data_de_venda)
        valores.put(TabelaVendas.CAMPO_FK_CLIENTE,idcliente)
        valores.put(TabelaVendas.CAMPO_FK_FUNCIONARIO,idfuncionario)
        return valores
    }


}