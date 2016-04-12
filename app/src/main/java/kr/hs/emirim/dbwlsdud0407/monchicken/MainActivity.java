package kr.hs.emirim.dbwlsdud0407.monchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText mName;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName = (EditText)findViewById(R.id.name);
        mButton=(Button)findViewById(R.id.btn_showmethechicken);
        mButton.setOnClickListener(this);  //버튼이 클릭되었는지 확인하는 메서드

    }

    @Override
    protected void onResume() {  //액티비티가 다시 시작되었을때
        super.onResume();
        mName.setText(null);
        overridePendingTransition(R.anim.slide_in_rigth, R.anim.slide_out_left);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {  //버튼을 클릭했을 때
        String name=mName.getText().toString();
//     if(name==null) {
//            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
//        }else {
//            Toast.makeText(this, name + "씨 배고파요", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }
        try {
            Toast.makeText(this, name + "씨 사랑해요", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("age",10);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_rigth,R.anim.slide_out_left);

        }catch(NullPointerException e){
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Toast.makeText(this, "예외발생삐용삐용삐용", Toast.LENGTH_LONG).show();
        }
    }

}
