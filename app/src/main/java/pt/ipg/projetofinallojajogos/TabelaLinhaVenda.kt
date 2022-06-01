package pt.ipg.projetofinallojajogos
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaLinhaVenda(val db: SQLiteDatabase?) {

    fun cria (){

        db?.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $QUANTIDADE INTEGER NOT NULL,$PRECO REAL NOT NULL, $PERCENTAGEM_IVA REAL NOT NULL,$CAMPO_FK_JOGOS INTEGER NOT NULL,$CAMPO_FK_VENDA INTEGER NOT NULL,FOREIGN KEY $CAMPO_FK_JOGOS) REFERENCES ${TabelaJogos.NOME} (${BaseColumns._ID}) ON DELETE RESTRICT,FOREIGN KEY($CAMPO_FK_VENDA) REFERENCES ${TabelaVendas.NOME} (${BaseColumns._ID}) ON DELETE RESTRICT) ")
    }

    companion object{
        const val NOME = "Linha de Venda "
        const val QUANTIDADE = "Quantidade"
        const val PRECO = "Preco"
        const val PERCENTAGEM_IVA = "Percentagem_iva"
        const val CAMPO_FK_VENDA = "idVenda"
        const val CAMPO_FK_JOGOS = "idJogo"
    }

}