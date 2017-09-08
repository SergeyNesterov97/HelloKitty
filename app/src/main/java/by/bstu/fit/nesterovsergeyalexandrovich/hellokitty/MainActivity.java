package by.bstu.fit.nesterovsergeyalexandrovich.hellokitty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myBtn=(Button) findViewById(R.id.myBtn);

        OnClickListener oclBtnOk=new OnClickListener(){
            @Override
              public void onClick(View v){
                switch (v.getId()){
                    case R.id.myBtn:
                        myBtn.setText("Чмок");
                        break;
                    case R.id.myBtn2:
                        setContentView(R.layout.second);
                        break;
                }
            }
        };

        myBtn.setOnClickListener(oclBtnOk);


        Button myBtn2= (Button) findViewById(R.id.myBtn2);

        myBtn2.setOnClickListener(oclBtnOk);


    }
}
