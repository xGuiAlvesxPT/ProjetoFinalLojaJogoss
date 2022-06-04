package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaGeneros(val db: SQLiteDatabase) {

    fun cria (){

        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $NOME_GENERO TEXT NOT NULL) ")
    }

    companion object{
        const val NOME = "Genero"
        const val NOME_GENERO = "Nome"

    }

}