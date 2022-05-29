package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaClientes(val db: SQLiteDatabase?) {

    fun cria (){

        db?.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINNOME_CLI$NOME_CLIENTE TEXT(30) NOT NULL,$NIF_CLIENTE NUMBER(9) NOT NULL ,$CONTACTO NUMBER(9) NOT NULL ,$DATA_DE_NASCIMENTO DATE NOT NULL) ")
    }

    companion object{
        const val NOME = "Clientes"
        const val NOME_CLIENTE = "Nome"
        const val NIF_CLIENTE = "Nif"
        const val CONTACTO= "Contacto"
        const val DATA_DE_NASCIMENTO = "DatadeNascimento"
    }

}