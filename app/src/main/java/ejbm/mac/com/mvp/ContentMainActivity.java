package ejbm.mac.com.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import ejbm.mac.com.mvp.presenter.PresenterClass;

/**
 * Created by admin on 1/21/2016.
 */
public class ContentMainActivity  extends AppCompatActivity {

    public  static MainActivity ma ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contentmain);


        TextView tv = (TextView) findViewById( R.id.tv1 ) ;

        goUp() ;
    }


    public void goUp (View view) {
        ma.goUp();
    }

    public void goUp() {
        ma.goUp();
    }
}
