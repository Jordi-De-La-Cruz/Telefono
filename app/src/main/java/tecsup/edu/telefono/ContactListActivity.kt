package tecsup.edu.telefono

import android.R.layout
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContactListActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        val button = findViewById<Button>(R.id.btnLlamar)
        button.setOnClickListener {
            startActivity(Intent(this, CallActivity::class.java))
        }

    }
}

