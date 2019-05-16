package formulas.andreea.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btnDreptunghi = (Button) findViewById(R.id.button8);
        btnDreptunghi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText latura = (EditText)findViewById(R.id.editText7);
                EditText Latura = (EditText)findViewById(R.id.editText8);
                float arie = Float.parseFloat(latura.getText().toString())*Float.parseFloat(Latura.getText().toString());
                float perimetru = 2*(Float.parseFloat(latura.getText().toString())+Float.parseFloat(Latura.getText().toString()));
                Toast.makeText(Main4Activity.this, "Aria e " + arie + "\nPerimetrul e " + perimetru,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
