package kr.hs.emirim.dbwlsdud0407.monchicken;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by appcreator08 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult=(TextView)findViewById(R.id.result);
        mResult.setText("결과");

    }
}
