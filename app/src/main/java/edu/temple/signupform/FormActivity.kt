package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.UserName)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val cpassword = findViewById<EditText>(R.id.confirmPassword)

        findViewById<Button>(R.id.save).setOnClickListener{
            if(name.text.toString()==""){
                name?.error = "Name cannot be empty"
            }
            if(email.text.toString()==""){
                email?.error = "Email cannot be empty"
            }
            if(password.text.toString()==""){
                password?.error = "Password cannot be empty"
            }
            if(cpassword.text.toString()==""){
                cpassword?.error = "Password cannot be empty"
            }
            if(cpassword.text.toString()!=password.text.toString()){
                cpassword?.error = "Password must be the same"
            }
            else{
                toast(name.text.toString())
            }

        }
    }

    fun toast(name: String){
        val text = "Welcome, " + name + ", to the SignUpForm App"
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

}