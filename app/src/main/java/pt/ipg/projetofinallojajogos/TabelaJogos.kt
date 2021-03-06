package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaJogos( db: SQLiteDatabase): TabelaBD(db, NOME) {

   override fun cria (){

        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $NOME_JOGO TEXT NOT NULL,$PUBLICADORA TEXT NOT NULL,$PRECO REAL NOT NULL ,$DATA_DE_LANCAMENTO INTEGER NOT NULL,$CAMPO_FK_PLATAFORMA INTEGER NOT NULL,$CAMPO_FK_GENERO INTEGER NOT NULL,FOREIGN KEY($CAMPO_FK_PLATAFORMA) REFERENCES ${TabelaPlataformas.NOME} (${BaseColumns._ID}) ON DELETE RESTRICT,FOREIGN KEY($CAMPO_FK_GENERO) REFERENCES ${TabelaGeneros.NOME} (${BaseColumns._ID}) ON DELETE RESTRICT) ")
    }

    companion object{
        const val NOME = "Jogos"
        const val NOME_JOGO = "Nome"
        const val PUBLICADORA = "Publicadora"
        const val PRECO= "Preco"
        const val DATA_DE_LANCAMENTO = "DatadeLancamento"
        const val CAMPO_FK_PLATAFORMA = "idPlataforma"
        const val CAMPO_FK_GENERO = "idGenero"

        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, NOME_JOGO, PUBLICADORA, PRECO, DATA_DE_LANCAMENTO,
            CAMPO_FK_PLATAFORMA, CAMPO_FK_GENERO)
    }



}