package nefersky.svetofor;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private ConstraintLayout mRelativeLayout;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (ConstraintLayout)findViewById(R.id.relativeLayout);
        mTextView = (TextView)findViewById(R.id.textView);
    }

    public void onRedClick(View view) {
        mTextView.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorRed, null));
    }

    public void onYellowClick(View view) {
        mTextView.setText(R.string.yellow);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorYellow, null));
    }

    public void onGreenClick(View view) {
        mTextView.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen, null));
    }
}
