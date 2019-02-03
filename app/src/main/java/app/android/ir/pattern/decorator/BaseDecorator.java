package app.android.ir.pattern.decorator;

import app.android.ir.pattern.decorator.strategy.SomeJob;

public abstract class BaseDecorator implements SomeJob {
    private SomeJob job;

    public BaseDecorator(SomeJob job) {
        this.job = job;
    }

    @Override
    public void doTheJob() {
        job.doTheJob();
    }
}
