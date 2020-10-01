package mx.edu.tesoem.isc.ecr.a7s212021prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtNombre);
    }

    public void llamarpantalla(View view) {
        String nombre  = txtnombre.getText().toString();
        Intent intent = new Intent(this, Pantalla2Activity.class);
        intent.putExtra("Nombre",nombre);
        startActivity(intent);
    }
}