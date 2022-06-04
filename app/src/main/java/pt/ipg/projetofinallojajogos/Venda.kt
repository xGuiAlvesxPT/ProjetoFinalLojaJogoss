package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Venda(
    var data_de_venda: Date,
    var idcliente: Long,
    var idfuncionario: Long,
    val id: Long,
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaVendas.DATA_DE_VENDA,data_de_venda.time)
        valores.put(TabelaVendas.CAMPO_FK_CLIENTE,idcliente)
        valores.put(TabelaVendas.CAMPO_FK_FUNCIONARIO,idfuncionario)
        return valores
    }


}