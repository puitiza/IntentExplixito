package pe.anthony.intentexplixito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    //Aqui estoy declarando las variables que voy a usar
    private TextView txtSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtSecond = (TextView) findViewById(R.id.txtViewSecond);
        //Vas a recibir lo que te mando el intent
        Bundle bundle =  getIntent().getExtras(); //Bundle es como una caja donde tenemos que sacar
        //lo que habiamos mandado
        if(bundle != null){
            String stringSecond = bundle.getString("stringFirst");
            txtSecond.setText(stringSecond);
            Toast.makeText(SecondActivity.this,stringSecond,Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(SecondActivity.this,"esta vacio",Toast.LENGTH_LONG).show();
        }
    }
}
