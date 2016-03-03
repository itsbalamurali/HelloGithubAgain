//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.caihongcity.com.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.caihongcity.com.R.id;
import com.caihongcity.com.R.layout;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class SwipeWaitBBPoseActivity_
    extends SwipeWaitBBPoseActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String TRADETYPE_EXTRA = "tradetype";
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.swipewait_layout);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static SwipeWaitBBPoseActivity_.IntentBuilder_ intent(Context context) {
        return new SwipeWaitBBPoseActivity_.IntentBuilder_(context);
    }

    public static SwipeWaitBBPoseActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new SwipeWaitBBPoseActivity_.IntentBuilder_(fragment);
    }

    public static SwipeWaitBBPoseActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new SwipeWaitBBPoseActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        swipe_flash = ((ImageView) hasViews.findViewById(id.swipe_flash));
        tv_title_des = ((TextView) hasViews.findViewById(id.tv_title_des));
        initData();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(TRADETYPE_EXTRA)) {
                tradetype = extras_.getString(TRADETYPE_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    @Override
    public void toast(final String paramString) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                SwipeWaitBBPoseActivity_.super.toast(paramString);
            }

        }
        );
    }

    @Override
    public void dialogShow(final String s) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                SwipeWaitBBPoseActivity_.super.dialogShow(s);
            }

        }
        );
    }

    @Override
    public void startSwipe() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    SwipeWaitBBPoseActivity_.super.startSwipe();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<SwipeWaitBBPoseActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, SwipeWaitBBPoseActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), SwipeWaitBBPoseActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), SwipeWaitBBPoseActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode);
                } else {
                    super.startForResult(requestCode);
                }
            }
        }

        public SwipeWaitBBPoseActivity_.IntentBuilder_ tradetype(String tradetype) {
            return super.extra(TRADETYPE_EXTRA, tradetype);
        }

    }

}
