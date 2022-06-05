package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaClientes( db: SQLiteDatabase): TabelaBD(db, NOME) {

   override fun cria (){

        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $NOME_CLIENTE TEXT NOT NULL, $SEXO TEXT NOT NULL,$NIF_CLIENTE TEXT NOT NULL ,$CONTACTO TEXT NOT NULL ,$DATA_DE_NASCIMENTO TEXT NOT NULL) ")
    }

    companion object{
        const val NOME = "Clientes"
        const val NOME_CLIENTE = "Nome"
        const val SEXO = "Sexo"
        const val NIF_CLIENTE = "Nif"
        const val CONTACTO= "Contacto"
        const val DATA_DE_NASCIMENTO = "DatadeNascimento"
    }

}