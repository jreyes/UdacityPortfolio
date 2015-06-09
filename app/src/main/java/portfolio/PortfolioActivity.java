package portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.portfolio.R;


public class PortfolioActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

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

    private void toast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
