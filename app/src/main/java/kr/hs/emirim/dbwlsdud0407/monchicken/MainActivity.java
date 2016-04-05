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
        mButton.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Toast.makeText(this, "맛있는 치킨", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}
