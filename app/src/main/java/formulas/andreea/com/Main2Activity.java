package formulas.andreea.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnTrapez = (Button) findViewById(R.id.button6);

        btnTrapez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText latura1 = (EditText)findViewById(R.id.editText);
                EditText latura2 = (EditText)findViewById(R.id.editText2);
                EditText latBm = (EditText)findViewById(R.id.editText3);
                EditText latBM = (EditText)findViewById(R.id.editText4);
                EditText inaltime = (EditText)findViewById(R.id.editText5);
                float arie = (Float.parseFloat(latBM.getText().toString())+Float.parseFloat(latBm.getText().toString()))*Float.parseFloat(inaltime.getText().toString())/2;
                float perimetru = Float.parseFloat(latura1.getText().toString())+Float.parseFloat(latura2.getText().toString())+Float.parseFloat(latBm.getText().toString())+Float.parseFloat(latBM.getText().toString());
                Toast.makeText(Main2Activity.this, "Aria e " + arie + "\nPerimetrul e " + perimetru,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
