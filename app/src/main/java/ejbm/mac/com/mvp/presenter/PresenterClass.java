package ejbm.mac.com.mvp.presenter;

import android.view.View;

import ejbm.mac.com.mvp.MainActivity;
import ejbm.mac.com.mvp.model.ModelClass;

/**
 * Created by admin on 1/21/2016.
 */
public class PresenterClass {

    private ModelClass mc ;

    private MainActivity view ;


    public PresenterClass ( MainActivity v ) {
        super () ;

        this.view = v ;
        this.mc = new ModelClass() ;

    }


    public void goUpV () {
        this.mc.increment();
        this.view.showCountonV( getValue() );
    }



    public int getValue () { return this.mc.getCounter() ;  }


}
