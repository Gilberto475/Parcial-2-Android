package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    TextView textViewResult;
    double precioMouse = 100000;
    double precioTeclado = 250000;
    double precioOrdenador = 500000;
    double precioTorre = 1500000;
    double iva = 0.19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewResult= findViewById(R.id.textViewResult);


        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("producto")) {
            Producto producto = (Producto) intent.getSerializableExtra("producto");
            double precioTotal = calcularPrecioTotal(producto);
            double precioConIva = calcularPrecioConIva(precioTotal);
            textViewResult.setText("Cantidad de Mouses: " + producto.getCantidadMouse() +
                    "\nCantidad de Teclados: " + producto.getCantidadTeclado() +
                    "\nCantidad de Ordenadores: " + producto.getCantidadOrdenador() +
                    "\nCantidad de Torres: " + producto.getCantidadTorre() +
                    "\nPrecio Total: $" + formatearPrecio(precioTotal) +
                    "\nPrecio con IVA: $" + formatearPrecio(precioConIva));
        }
    }

    private double calcularPrecioTotal(Producto producto) {
        double total = (producto.getCantidadMouse() * precioMouse) +
                (producto.getCantidadTeclado() * precioTeclado) +
                (producto.getCantidadOrdenador() * precioOrdenador) +
                (producto.getCantidadTorre() * precioTorre);
        return total;
    }

    private double calcularPrecioConIva(double precioTotal) {
        return precioTotal * (1 + iva);
    }

    private String formatearPrecio(double precio) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(precio);
    }
}
