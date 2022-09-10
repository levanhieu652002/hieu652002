package com.example.cuocduakythu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtDiem;
    CheckBox cbOne , cbTwo , cbthree;
     SeekBar sbOne, sbTow, sbthree ;
    ImageButton inPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        CountDownTimer countDownTimer= new CountDownTimer(60000,300 ) {
            @Override
            public void onTick(long l) {
            sbOne.setProgress(sbOne.getProgress()+5);
            sbTow.setProgress(sbTow.getProgress()+5);
            sbthree.setProgress(sbthree.getProgress()+5);


            }

            @Override
            public void onFinish() {

            }
        };
        inPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.start();

            }
        });
    }
    private void anhxa(){
        txtDiem = findViewById(R.id.textViewDiemSo);
         inPlay = findViewById(R.id.buttonplay);
         cbOne = findViewById(R.id.checkboxOne);
        cbTwo = findViewById(R.id.checkboxTwo);
        cbthree  = findViewById(R.id.checkboxThree);
        sbOne = findViewById(R.id.seekbarOne);
        sbTow = findViewById(R.id.seekbarTow);



    }
}