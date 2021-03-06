package pt.ipg.projetofinallojajogos
import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Cliente(
    var nome: String,
    var nif: String,
    var contacto: String,
    var data_de_nascimento: String,
    var sexo: Long,
    var id: Long = -1
) {

    fun toContentValues():ContentValues{

        val valores = ContentValues()
        valores.put(TabelaClientes.NOME_CLIENTE,nome)
        valores.put(TabelaClientes.NIF_CLIENTE,nif)
        valores.put(TabelaClientes.CONTACTO,contacto)
        valores.put(TabelaClientes.DATA_DE_NASCIMENTO,data_de_nascimento)
        valores.put(TabelaClientes.CAMPO_FK_SEXO,sexo)
        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Cliente {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(TabelaClientes.NOME_CLIENTE)
            val posNif = cursor.getColumnIndex(TabelaClientes.NIF_CLIENTE)
            val posContacto = cursor.getColumnIndex(TabelaClientes.CONTACTO)
            val posDataNascimento = cursor.getColumnIndex(TabelaClientes.DATA_DE_NASCIMENTO)
            val posSexo = cursor.getColumnIndex(TabelaClientes.CAMPO_FK_SEXO)

            val id = cursor.getLong(posId)
            val nome = cursor.getString(posNome)
            val nif = cursor.getString(posNif)
            val contacto = cursor.getString(posContacto)
            val dataNascimento = cursor.getString(posDataNascimento)
            val sexo = cursor.getLong(posSexo)

            return Cliente(nome,nif,contacto,dataNascimento,sexo, id)
        }
    }
}