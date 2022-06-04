package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import java.util.*

data class Funcionario(
    var nome: String,
    var nif: String,
    var contacto: String,
    var data_de_nascimento: Date,
    val id: Long = -1

) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaFuncionarios.NOME_FUNCIONARIO,nome)
        valores.put(TabelaFuncionarios.NIF_FUNCIONARIO,nif)
        valores.put(TabelaFuncionarios.CONTACTO,contacto)
        valores.put(TabelaFuncionarios.DATA_DE_NASCIMENTO,data_de_nascimento.time)
        return valores
    }



}