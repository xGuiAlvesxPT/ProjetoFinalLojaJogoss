package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*
import kotlin.time.Duration.Companion.milliseconds

data class Cliente(
    var nome: String,
    var sexo: Char,
    var nif: String,
    var contacto: String,
    var data_de_nascimento: Date,
    val id: Long = -1
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaClientes.NOME_CLIENTE,nome)
        valores.put(TabelaClientes.SEXO,sexo.toString())
        valores.put(TabelaClientes.NIF_CLIENTE,nif)
        valores.put(TabelaClientes.CONTACTO,contacto)
        valores.put(TabelaClientes.DATA_DE_NASCIMENTO,data_de_nascimento.time)
        return valores
    }
}