package jreyes.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.portfolio.R;


public class PortfolioActivity extends Activity implements View.OnClickListener {
// ------------------------------ FIELDS ------------------------------

    private Toast mToast;

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface OnClickListener ---------------------

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify_button:
                toast(getString(R.string.spotify_toast));
                break;
            case R.id.scores_button:
                toast(getString(R.string.scores_toast));
                break;
            case R.id.library_button:
                toast(getString(R.string.library_toast));
                break;
            case R.id.build_it_button:
                toast(getString(R.string.build_it_toast));
                break;
            case R.id.xyz_reader_button:
                toast(getString(R.string.xyz_reader_toast));
                break;
            case R.id.capstone_button:
                toast(getString(R.string.capstone_app));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        findViewById(R.id.spotify_button).setOnClickListener(this);
        findViewById(R.id.scores_button).setOnClickListener(this);
        findViewById(R.id.library_button).setOnClickListener(this);
        findViewById(R.id.build_it_button).setOnClickListener(this);
        findViewById(R.id.xyz_reader_button).setOnClickListener(this);
        findViewById(R.id.capstone_button).setOnClickListener(this);
    }

    private void toast(String message) {
        if (mToast != null) {
            mToast.cancel();
        }

        mToast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        mToast.show();
    }
}
