package alticast.com.androidtvapptutorial;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/*
 *  Copyright (c) 2018 Alticast Corp.
 *  All rights reserved. http://www.alticast.com/
 *
 *  This software is the confidential and proprietary information of
 *  Alticast Corp. ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Alticast.
 */
public class ErrorActivity extends Activity{
    private static final String TAG = ErrorActivity.class.getSimpleName();

    private ErrorFragment mEroErrorFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        TLog.i(this, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testError();
    }

    private void testError(){
        mEroErrorFragment = new ErrorFragment();
        getFragmentManager().beginTransaction().add(R.id.main_browse_fragment, mEroErrorFragment).commit();
    }
}
