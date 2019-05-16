package formulas.andreea.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btnPatrat = (Button) findViewById(R.id.button7);

        btnPatrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText latura = (EditText)findViewById(R.id.editText6);
                float arie = Float.parseFloat(latura.getText().toString())*Float.parseFloat(latura.getText().toString());
                float perimetru =(Float.parseFloat(latura.getText().toString())*4);
                Toast.makeText(Main3Activity.this, "Aria e " + arie + "\nPerimetrul e " + perimetru,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
