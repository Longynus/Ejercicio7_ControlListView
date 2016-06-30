package happyapps.ejercicio7_controllistviewconunalistadestring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity {

    private String[] paises={"Argentina","Chile","Paraguay","Bolivia","Peru","Ecuador","Brasil","Colombia","Venezuela","Uruguay"};
    private String[] habitantes={"40000000","17000000","65000000","10000000","30000000","1400000","18300000","4400000","2900000","3500000"};

    private TextView tv1;
    private ListView lv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView) findViewById(R.id.tv1);
        lv1=(ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("poblacion de "+lv1.getItemAtPosition(i)+" es "+habitantes[i]);
            }
        });



    }
}
