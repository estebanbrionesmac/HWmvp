package ejbm.mac.com.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import ejbm.mac.com.mvp.presenter.PresenterClass;

public class MainActivity extends AppCompatActivity {


    private PresenterClass pc ;

    TextView tv ;

    private static final String TAG = "EJBM" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pc = new PresenterClass ( this ) ;

        tv = (TextView) findViewById( R.id.tv1 ) ;

        ContentMainActivity.ma = this ;
    }

    public void goUp ( ) {
        Log.d( TAG , "Enter ") ;
        pc.goUpV();
    }

    public void increment ( ) {
        Log.d( TAG , "Enter ") ;
        pc.goUpV();
    }

    public void goUpxxx (View view) {
        Log.d( TAG , "Enter v") ;
        pc.goUpV();
    }

    public void showCountonV ( int x ) {

        tv.setText( "" +  x );
    }
}
