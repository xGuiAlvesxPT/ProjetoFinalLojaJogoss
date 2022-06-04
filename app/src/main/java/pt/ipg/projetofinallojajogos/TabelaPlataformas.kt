package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaPlataformas(val db: SQLiteDatabase) {

    fun cria (){

        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $NOME_PLATAFORMA TEXT NOT NULL) ")
    }

    companion object{
        const val NOME = "Plataformas"
        const val NOME_PLATAFORMA = "Nome"

    }

}