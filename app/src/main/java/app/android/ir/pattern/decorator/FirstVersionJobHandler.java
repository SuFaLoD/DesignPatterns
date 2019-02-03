package app.android.ir.pattern.decorator;

import android.util.Log;
import android.widget.Toast;

import app.android.ir.pattern.decorator.strategy.SomeJob;

public class FirstVersionJobHandler extends BaseDecorator {

    private static final String TAG = "FirstVersionJobHandler";
    public FirstVersionJobHandler(SomeJob job) {
        super(job);
    }

    @Override
    public void doTheJob() {
        super.doTheJob();
        Log.d(TAG, "doTheJob: the job is done and extra work is log u see ... :D");
    }
}
