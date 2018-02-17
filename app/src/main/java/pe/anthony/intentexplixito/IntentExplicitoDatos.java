package pe.anthony.intentexplixito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentExplicitoDatos extends AppCompatActivity {

    //Create tus variables
    private Button bntNext;
    private String papu="Hola papu ya se paso al segundo activity q loco";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicito_datos);
        bntNext = (Button) findViewById(R.id.btn_next);
        bntNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vamos a acceder al segundo activity
                Intent intent =  new Intent(IntentExplicitoDatos.this,SecondActivity.class);
                intent.putExtra("stringFirst",papu);
                startActivity(intent); //Este metodo es para lanzar el segundo Activity
            }
        });
    }
}
