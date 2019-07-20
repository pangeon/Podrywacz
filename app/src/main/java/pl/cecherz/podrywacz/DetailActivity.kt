package pl.cecherz.podrywacz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        Log.i("Intents", "Action = ${intent.action}")

        val lastPart = intent.data?.lastPathSegment
        if(lastPart!!.equals("view")) {
            val girlID = intent.data?.getQueryParameter("id")
            Log.i("Intents", "Query parameter = $girlID")
        }
        val extraID = intent.extras!!.getInt("girlID")
        Log.i("Intents", "Extra value = $extraID")

        girlImage.setImageResource(extraID)
    }

}
