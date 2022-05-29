package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Funcionario(
    val id: Long,
    var nome: String,
    var nif: Int,
    var contacto: Int,
    var data_de_nascimento: String

) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaFuncionarios.NOME_FUNCIONARIO,nome)
        valores.put(TabelaFuncionarios.NIF_FUNCIONARIO,nif)
        valores.put(TabelaFuncionarios.CONTACTO,contacto)
        valores.put(TabelaFuncionarios.DATA_DE_NASCIMENTO,data_de_nascimento)
        return valores
    }



}