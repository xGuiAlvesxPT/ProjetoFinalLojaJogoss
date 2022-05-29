package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Cliente(
    val id: Long,
    var nome: String,
    var nif: Int,
    var contacto: Int,
    var data_de_nascimento: String
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaClientes.NOME_CLIENTE,nome)
        valores.put(TabelaClientes.NIF_CLIENTE,nif)
        valores.put(TabelaClientes.CONTACTO,contacto)
        valores.put(TabelaClientes.DATA_DE_NASCIMENTO,data_de_nascimento)
        return valores
    }
}