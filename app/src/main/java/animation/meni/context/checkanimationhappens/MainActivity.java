package animation.meni.context.checkanimationhappens;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Handler;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    View tvToanimate;
    int startDelay;
    Button btnAnimate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvToanimate = findViewById(R.id.tvToanimate);
        btnAnimate = (Button) findViewById(R.id.btnAnimate);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        startDelay = 350;

        tvToanimate.setScaleX(0f);
        tvToanimate.setScaleY(0f);


        appearBackButton();

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dissappearBackButton();
            }
        });


    }


    public void dissappearBackButton() {
//dissapear  backbutton
        ViewCompat.animate(tvToanimate)
                .scaleX(0f)
                .scaleY(0f)
                .alpha(0f)
                .setDuration(100)
                .start();
    }


    public void appearBackButton() {
        ViewCompat.animate(tvToanimate)
                .setStartDelay(startDelay)
                .scaleX(1f)
                .scaleY(1f)
                .alpha(1f);
    }
}
