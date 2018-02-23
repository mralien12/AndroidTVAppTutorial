package alticast.com.androidtvapptutorial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

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
public class ErrorFragment extends android.support.v17.leanback.app.ErrorFragment {
    private static final boolean TRANSLUCENT  = true;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        TLog.d(this, "onCreate");
        super.onCreate(savedInstanceState);

        setTitle(getResources().getString(R.string.app_name));
        setErrorContent();
    }

    private void setErrorContent() {
        setImageDrawable(getActivity().getDrawable(R.drawable.lb_ic_sad_cloud));
        setMessage(getResources().getString(R.string.error_fragment_message));
        setDefaultBackground(TRANSLUCENT);

        setButtonText(getResources().getString(R.string.dismiss_error));
        setButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().remove(ErrorFragment.this).commit();
            }
        });
    }
}
