package mx.edu.tesoem.isc.ecr.a7s212021prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2Activity extends AppCompatActivity {

    TextView lvlsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        lvlsaludo = findViewById(R.id.lvlsaluda);
        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
        lvlsaludo.setText("Saludos " + nombre + " :)");
    }
}