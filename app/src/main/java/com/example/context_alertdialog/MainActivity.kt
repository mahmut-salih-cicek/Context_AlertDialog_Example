package com.example.context_alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"UYGULAMA BASLADI",Toast.LENGTH_LONG).show()

    }

    fun bas(view:View){
        var uyarıMesajı = AlertDialog.Builder(this)
        uyarıMesajı.setTitle("Şifre Hatası")
        uyarıMesajı.setMessage("Lütfen Şifreyi Tekrar Girin")

       uyarıMesajı.setPositiveButton("Evet"){DialogInterface,i ->
           Toast.makeText(this,"Evete basıldı",Toast.LENGTH_LONG).show()
       }

        uyarıMesajı.setNegativeButton("Hayır") {DialogInterface, i ->
            Toast.makeText(this,"Hayıra basıldı",Toast.LENGTH_LONG).show()
        }

        uyarıMesajı.show()

    }
}


