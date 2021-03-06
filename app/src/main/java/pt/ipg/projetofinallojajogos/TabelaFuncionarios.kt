package pt.ipg.projetofinallojajogos


import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaFuncionarios( db: SQLiteDatabase): TabelaBD(db, NOME) {

   override fun cria (){

        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,$NOME_FUNCIONARIO TEXT NOT NULL,$NIF_FUNCIONARIO TEXT NOT NULL ,$CONTACTO TEXT NOT NULL ,$DATA_DE_NASCIMENTO TEXT NOT NULL) ")
    }

    companion object{
        const val NOME = "Funcionarios"
        const val NOME_FUNCIONARIO = "Nome"
        const val NIF_FUNCIONARIO = "Nif"
        const val CONTACTO= "Contacto"
        const val DATA_DE_NASCIMENTO = "DatadeNascimento"
        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, NIF_FUNCIONARIO, NIF_FUNCIONARIO, CONTACTO,
            DATA_DE_NASCIMENTO)
    }



}