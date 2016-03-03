//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.caihongcity.com.activity;

import java.io.Serializable;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.caihongcity.com.R.id;
import com.caihongcity.com.R.layout;
import com.caihongcity.com.model.QueryModel;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class BluetoothSelectActivity_
    extends BluetoothSelectActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String TOP_FEE_RATE_EXTRA = "topFeeRate";
    public final static String TRADETYPE_EXTRA = "tradetype";
    public final static String MONEY_EXTRA = "money";
    public final static String QUERY_MODEL_EXTRA = "queryModel";
    public final static String FEE_RATE_EXTRA = "feeRate";
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_bluetooth_select);
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

    public static BluetoothSelectActivity_.IntentBuilder_ intent(Context context) {
        return new BluetoothSelectActivity_.IntentBuilder_(context);
    }

    public static BluetoothSelectActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new BluetoothSelectActivity_.IntentBuilder_(fragment);
    }

    public static BluetoothSelectActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new BluetoothSelectActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv_title_des = ((TextView) hasViews.findViewById(id.tv_title_des));
        lv_bluetooth = ((ListView) hasViews.findViewById(id.lv_bluetooth));
        tv_right = ((TextView) hasViews.findViewById(id.tv_right));
        {
            View view = hasViews.findViewById(id.ll_back);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        BluetoothSelectActivity_.this.onClick(view);
                    }

                }
                );
            }
        }
        if (tv_right!= null) {
            tv_right.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    BluetoothSelectActivity_.this.onClick(view);
                }

            }
            );
        }
        initData();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(TOP_FEE_RATE_EXTRA)) {
                topFeeRate = extras_.getString(TOP_FEE_RATE_EXTRA);
            }
            if (extras_.containsKey(TRADETYPE_EXTRA)) {
                tradetype = extras_.getString(TRADETYPE_EXTRA);
            }
            if (extras_.containsKey(MONEY_EXTRA)) {
                money = extras_.getString(MONEY_EXTRA);
            }
            if (extras_.containsKey(QUERY_MODEL_EXTRA)) {
                queryModel = ((QueryModel) extras_.getSerializable(QUERY_MODEL_EXTRA));
            }
            if (extras_.containsKey(FEE_RATE_EXTRA)) {
                feeRate = extras_.getString(FEE_RATE_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    @Override
    public void toast(final String msg) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                BluetoothSelectActivity_.super.toast(msg);
            }

        }
        );
    }

    @Override
    public void connectedBluetoothDevice(final String address) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    BluetoothSelectActivity_.super.connectedBluetoothDevice(address);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<BluetoothSelectActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, BluetoothSelectActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), BluetoothSelectActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), BluetoothSelectActivity_.class);
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

        public BluetoothSelectActivity_.IntentBuilder_ topFeeRate(String topFeeRate) {
            return super.extra(TOP_FEE_RATE_EXTRA, topFeeRate);
        }

        public BluetoothSelectActivity_.IntentBuilder_ tradetype(String tradetype) {
            return super.extra(TRADETYPE_EXTRA, tradetype);
        }

        public BluetoothSelectActivity_.IntentBuilder_ money(String money) {
            return super.extra(MONEY_EXTRA, money);
        }

        public BluetoothSelectActivity_.IntentBuilder_ queryModel(QueryModel queryModel) {
            return super.extra(QUERY_MODEL_EXTRA, ((Serializable) queryModel));
        }

        public BluetoothSelectActivity_.IntentBuilder_ feeRate(String feeRate) {
            return super.extra(FEE_RATE_EXTRA, feeRate);
        }

    }

}
