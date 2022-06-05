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








}