package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns
import java.util.*

data class Funcionario(
    var nome: String,
    var nif: String,
    var contacto: String,
    var data_de_nascimento: String,
    var id: Long = -1

) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaFuncionarios.NOME_FUNCIONARIO,nome)
        valores.put(TabelaFuncionarios.NIF_FUNCIONARIO,nif)
        valores.put(TabelaFuncionarios.CONTACTO,contacto)
        valores.put(TabelaFuncionarios.DATA_DE_NASCIMENTO,data_de_nascimento)
        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Funcionario {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(TabelaFuncionarios.NOME_FUNCIONARIO)
            val posNif = cursor.getColumnIndex(TabelaFuncionarios.NIF_FUNCIONARIO)
            val posContacto = cursor.getColumnIndex(TabelaFuncionarios.CONTACTO)
            val posDataNascimento = cursor.getColumnIndex(TabelaFuncionarios.DATA_DE_NASCIMENTO)

            val id = cursor.getLong(posId)
            val nome = cursor.getString(posNome)
            val nif = cursor.getString(posNif)
            val contacto = cursor.getString(posContacto)
            val dataNascimento = cursor.getString(posDataNascimento)

            return Funcionario(nome,nif,contacto,dataNascimento, id)
        }
    }



}