package kr.hs.emirim.dbwlsdud0407.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator03 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {
    static String TAG="먼치킨:ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작");
        mResult=(TextView) findViewById(R.id.result);
        mImageView=(ImageView)findViewById(R.id.imageView);
        Log.d(TAG,"결과 액티비티 출력");

        Random r=new Random();
        int result=r.nextInt(3);
        Log.d(TAG,"랜덤값 생성 :" +result);

        mImageView.setImageResource(R.drawable.c01+result);
        /*if(result==0){
            mImageView.setImageResource(R.drawable.c01);
        }else if(result==1){
            mImageView.setImageResource(R.drawable.c02);
        }

        switch(result){
            case 0:
                mImageView.setImageResource(R.drawable.c01);
                break;
            case 1:
                mImageView.setImageResource(R.drawable.c02);
                break;
        }*/

        Intent intent =getIntent();
        String name=intent.getStringExtra("name");
        Log.d(TAG,"인텐트값(name)읽기:" +name);

        int age=intent.getIntExtra("age", -1);
        Log.d(TAG, "인텐트값(age) 읽기:" +name);
        mResult.setText(name + "님, 안녕하세요!");


    }
}