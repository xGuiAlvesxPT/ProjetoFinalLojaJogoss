package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Cliente(
    var nome: String,
    var sexo: String,
    var nif: Int,
    var contacto: Int,
    var data_de_nascimento: Long,
    val id: Long = -1
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaClientes.NOME_CLIENTE,nome)
        valores.put(TabelaClientes.SEXO,sexo)
        valores.put(TabelaClientes.NIF_CLIENTE,nif)
        valores.put(TabelaClientes.CONTACTO,contacto)
        valores.put(TabelaClientes.DATA_DE_NASCIMENTO,data_de_nascimento)
        return valores
    }
}