package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText editTextMouse, editTextTeclado, editTextOrdenador, editTextTorre;
    Button buttonFacturar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMouse = findViewById(R.id.editTextMouse);
        editTextTeclado = findViewById(R.id.editTextTeclado);
        editTextOrdenador = findViewById(R.id.editTextOrdenador);
        editTextTorre = findViewById(R.id.editTextTorre);
        buttonFacturar = findViewById(R.id.buttonFacturar);

        buttonFacturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cantidadMouse = Integer.parseInt(editTextMouse.getText().toString());
                int cantidadTeclado = Integer.parseInt(editTextTeclado.getText().toString());
                int cantidadOrdenador = Integer.parseInt(editTextOrdenador.getText().toString());
                int cantidadTorre = Integer.parseInt(editTextTorre.getText().toString());
                Producto producto= new Producto (cantidadMouse,cantidadTeclado,cantidadOrdenador,cantidadTorre);


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("producto",producto);
                startActivity(intent);
            }
        });
    }
}
