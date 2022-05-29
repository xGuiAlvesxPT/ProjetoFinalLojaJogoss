package pt.ipg.projetofinallojajogos


import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaFuncionarios(val db: SQLiteDatabase?) {

    fun cria (){

        db?.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,$NOME_FUNCIONARIO TEXT(30) NOT NULL,$CONTACTO NUMBER(9) NOT NULL ,$DATA_DE_NASCIMENTO DATE NOT NULL) ")
    }

    companion object{
        const val NOME = "Funcionarios"
        const val NOME_FUNCIONARIO = "Nome"
        const val CONTACTO= "Contacto"
        const val DATA_DE_NASCIMENTO = "DatadeNascimento"
    }

}