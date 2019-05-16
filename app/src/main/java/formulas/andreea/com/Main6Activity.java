package formulas.andreea.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button btnTriunghi = (Button) findViewById(R.id.button10);
        btnTriunghi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText latura = (EditText)findViewById(R.id.editText7);
                float arie = (Float.parseFloat(latura.getText().toString()))*(Float.parseFloat(latura.getText().toString()))*(float)Math.sqrt(3);
                float perimetru = 3*(Float.parseFloat(latura.getText().toString()));
                Toast.makeText(Main6Activity.this, "Aria e " + arie + "\nPerimetrul e " + perimetru,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
