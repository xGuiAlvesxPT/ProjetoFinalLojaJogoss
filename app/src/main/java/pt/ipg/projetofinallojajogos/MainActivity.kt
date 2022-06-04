package pt.ipg.projetofinallojajogos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEntrar = findViewById<Button>(R.id.buttonLogin)
        buttonEntrar.setOnClickListener{entraGestao()}

    }

    private fun entraGestao() {

        /*val editTextUser = findViewById<EditText>(R.id.editTextUtilizador)

        val username = editTextUser.text.toString()
        if (username != "admin") {
            editTextUser.error = getString(R.string.userObrigatorio)
            editTextUser.requestFocus()
            return
        }

        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)

        val password = editTextPassword.text.toString()
        if (password != "admin") {
            editTextPassword.error = getString(R.string.passObrigatoria)
            editTextPassword.requestFocus()
            return
        }
        */


        val intent = Intent(this, PaginaGestao::class.java)
        startActivity(intent)


    }


}