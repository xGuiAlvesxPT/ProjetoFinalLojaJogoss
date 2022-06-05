package pt.ipg.projetofinallojajogos

import android.database.sqlite.SQLiteDatabase
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class BaseDeDadosTest {

   // @Test
    //fun useAppContext() {
        // Context of the app under test.
        //val appContext = InstrumentationRegistry.getInstrumentation().targetContext
       // assertEquals("pt.ipg.projetofinallojajogos", appContext.packageName)
   // }

    private fun appContext() =
        InstrumentationRegistry.getInstrumentation().targetContext


    private fun getWritableDatabase(): SQLiteDatabase {
        val openHelper = BDLojaOpenHelper(appContext())
        return openHelper.writableDatabase
    }

    private fun insereGenero(db: SQLiteDatabase, Genero: Genero) {
        Genero.id = TabelaGeneros(db).insert(Genero.toContentValues())
        assertNotEquals(-1, Genero.id)
    }

    private fun inserePlataforma(db: SQLiteDatabase, Plataforma: Plataforma) {
        Plataforma.id = TabelaPlataformas(db).insert(Plataforma.toContentValues())
        assertNotEquals(-1, Plataforma.id)
    }

    private fun insereCliente(db: SQLiteDatabase, Cliente: Cliente) {
        Cliente.id = TabelaClientes(db).insert(Cliente.toContentValues())
        assertNotEquals(-1, Cliente.id)
    }



    @Before
    fun apagaBaseDados() {
        appContext().deleteDatabase(BDLojaOpenHelper.NOME)
    }

    @Test
    fun consegueAbrirBaseDados() {
        val openHelper = BDLojaOpenHelper(appContext())
        val db = openHelper.readableDatabase

        assertTrue(db.isOpen)

        db.close()
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    fun consegueInserirGenero() {
        val db = getWritableDatabase()

        insereGenero(db, Genero("Aventura"))
        insereGenero(db, Genero("Açao"))
        insereGenero(db, Genero("Estrategia"))

        db.close()
    }

    @Test
    fun consegueInserirPlataforma() {
        val db = getWritableDatabase()

        inserePlataforma(db, Plataforma("Playstation 3"))
        inserePlataforma(db, Plataforma("Xbox 360"))
        inserePlataforma(db, Plataforma("Nintendo 3DS"))

        db.close()
    }

    @Test
    fun consegueInserirCliente() {
        val db = getWritableDatabase()

        insereCliente(db, Cliente("Guilherme Alves",'M',"250116278","963355065","22/10/2000"))
        insereCliente(db, Cliente("Maria Almeida",'F',"258524687","954798855","15/01/1950"))
        insereCliente(db, Cliente("Joao Pires",'M',"254566278","9745354789","03/12/1987"))

        db.close()
    }






}