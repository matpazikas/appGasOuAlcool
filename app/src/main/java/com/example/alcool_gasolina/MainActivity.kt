package com.example.alcool_gasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.alcool_gasolina.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
        lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        // val btnCalculat = findViewById<Button>(R.id.button)
        bind.button.setOnClickListener {
            val intGas = bind.editTextGasolina.text.toString().toDouble()
            val intAlcool = bind.editTextAlcool.text.toString().toDouble()
            val resultado = calculoAG(intGas, intAlcool)

            if (resultado > 0.7) {
                bind.txtResultado.text = "Abasteça com gasolina"
            } else {
                bind.txtResultado.text = "Abasteça com álcool"
            }
        }
        //val editAlcool = findViewById<EditText>(R.id.)
    }
    //fun calculoAG(gasolina:Int, alccol:Int) =  alccol/gasolina
    fun calculoAG(gasolina:Double, alcool:Double):Double{
        val resultado = alcool/gasolina;
        return resultado
    }

}