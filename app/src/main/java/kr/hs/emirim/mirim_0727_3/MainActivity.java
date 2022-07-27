package kr.hs.emirim.mirim_0727_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    EditText edittitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rg);
        edittitle = findViewById(R.id.edit_title);
        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(btnStartListener);
    }

    View.OnClickListener btnStartListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Class c = null;
            switch (rg.getCheckedRadioButtonId()){
                case R.id.rd_second:
                    c =SecondActivity.class;
                    break;
                case R.id.rd_third:
                    c =ThirdActivit.class;
                    break;
            }
            Intent intent = new Intent(getApplicationContext(), c);
            intent.putExtra("title",edittitle.getText().toString());
            startActivity(intent);
        }
    };
}