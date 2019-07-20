package pl.cecherz.podrywacz

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        karolina.setOnClickListener{ (viewGirlImage(R.drawable.karolina)) }
        agnieszka.setOnClickListener{ (viewGirlImage(R.drawable.agnieszka)) }
        malgorzata.setOnClickListener{ (viewGirlImage(R.drawable.malgorzata)) }
        weronika.setOnClickListener{ (viewGirlImage(R.drawable.weronika)) }
    }
    private fun viewGirlImage(girlID: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.setAction(Intent.ACTION_VIEW)

        val uri =
            Uri.parse("http://com.example.myfirstapp/view?id=$girlID")
        intent.data = uri

        intent.putExtra("girlID", girlID)

        startActivity(intent)
    }
}
