package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Cliente(
    var nome: String,
    var sexo: String,
    var nif: String,
    var contacto: String,
    var data_de_nascimento: String,
    var id: Long = -1
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

    companion object {
        fun fromCursor(cursor: Cursor): Cliente {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(TabelaClientes.NOME_CLIENTE)
            val posSexo = cursor.getColumnIndex(TabelaClientes.SEXO)
            val posNif = cursor.getColumnIndex(TabelaClientes.NIF_CLIENTE)
            val posContacto = cursor.getColumnIndex(TabelaClientes.CONTACTO)
            val posDataNascimento = cursor.getColumnIndex(TabelaClientes.DATA_DE_NASCIMENTO)

            val id = cursor.getLong(posId)
            val nome = cursor.getString(posNome)
            val sexo = cursor.getString(posSexo)
            val nif = cursor.getString(posNif)
            val contacto = cursor.getString(posContacto)
            val dataNascimento = cursor.getString(posDataNascimento)

            return Cliente(nome,sexo,nif,contacto,dataNascimento, id)
        }
    }
}