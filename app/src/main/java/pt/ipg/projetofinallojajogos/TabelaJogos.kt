package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaJogos(val db: SQLiteDatabase) {

    fun cria (){

        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $NOME_JOGO TEXT NOT NULL, $GENERO TEXT NOT NULL,$PUBLICADORA TEXT NOT NULL,$PLATAFORMA TEXT NOT NULL,$PRECO REAL NOT NULL ,$DATA_DE_LANCAMENTO INTEGER NOT NULL) ")
    }

    companion object{
        const val NOME = "Jogos"
        const val NOME_JOGO = "Nome"
        const val GENERO = "Genero"
        const val PUBLICADORA = "Publicadora"
        const val PLATAFORMA= "Plataforma"
        const val PRECO= "Preco"
        const val DATA_DE_LANCAMENTO = "DatadeLancamento"
    }


}