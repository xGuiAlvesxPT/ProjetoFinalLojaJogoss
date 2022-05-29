package pt.ipg.projetofinallojajogos
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns


class TabelaVendas(val db: SQLiteDatabase? ){

    fun cria (){

        db?.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $DATA_DE_VENDA DATE NOT NULL,$CAMPO_FK_CLIENTE INTEGER NOT NULL,$CAMPO_FK_FUNCIONARIO INTEGER NOT NULL,FOREIGN KEY($CAMPO_FK_CLIENTE) REFERENCES ${TabelaClientes.NOME} (${BaseColumns._ID}) ON DELETE RESTRICT,FOREIGN KEY($CAMPO_FK_FUNCIONARIO) REFERENCES ${TabelaFuncionarios.NOME} (${BaseColumns._ID}) ON DELETE RESTRICT) ")
    }

    companion object{

        const val NOME = "Vendas"
        const val DATA_DE_VENDA = "DatadeVenda"
        const val CAMPO_FK_CLIENTE = "idCliente"
        const val CAMPO_FK_FUNCIONARIO = "idFuncionario"
    }
}