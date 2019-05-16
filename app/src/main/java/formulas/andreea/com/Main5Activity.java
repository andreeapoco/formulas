package formulas.andreea.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button btnCerc = (Button) findViewById(R.id.button9);
        btnCerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText raza = (EditText)findViewById(R.id.editText9);
                float arie = (Float.parseFloat(raza.getText().toString())*Float.parseFloat(raza.getText().toString()))*(float)3.14;
                float diametru = 2*(Float.parseFloat(raza.getText().toString()));
                Toast.makeText(Main5Activity.this, "Aria e " + arie + "\nDiametru e " + diametru,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
