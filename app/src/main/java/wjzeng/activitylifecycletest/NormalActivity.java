package wjzeng.activitylifecycletest;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by zwj on 2016/5/24.
 */
public class NormalActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);

        Button button = (Button) findViewById(R.id.normal_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog p = new ProgressDialog(NormalActivity.this);
                p.setTitle("Loading...");
                p.setMessage("Please wait for a moment");
                p.setCancelable(true);
                p.show();
            }
        });
    }
}
