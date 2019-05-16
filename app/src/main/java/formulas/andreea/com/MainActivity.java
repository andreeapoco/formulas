package formulas.andreea.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button patrat = (Button) findViewById(R.id.button);
        Button cerc = (Button) findViewById(R.id.button2);
        Button dreptunghi = (Button) findViewById(R.id.button3);
        Button trapez = (Button) findViewById(R.id.button4);
        Button triunghi = (Button) findViewById(R.id.button5);
        patrat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main3Activity.class));
            }
        });
        cerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main5Activity.class));
            }
        });
        triunghi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main6Activity.class));
            }
        });
        trapez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
        dreptunghi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main4Activity.class));
            }
        });
    }
}
