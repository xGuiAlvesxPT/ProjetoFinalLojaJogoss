package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaJogos(val db: SQLiteDatabase?) {

    fun cria (){

        db?.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $NOME_JOGO TEXT(30) NOT NULL, $GENERO TEXT(30) NOT NULL,$PUBLICADORA TEXT(30) NOT NULL,$PLATAFORMA TEXT(30) NOT NULL,$PRECO INTEGER(9,2) NOT NULL ,$DATA_DE_LANCAMENTO DATE NOT NULL) ")
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