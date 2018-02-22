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

package alticast.com.androidtvapptutorial;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v17.leanback.app.BackgroundManager;
import android.util.DisplayMetrics;

public class SimpleBackgroundManager {
    private static final String TAG = SimpleBackgroundManager.class.getSimpleName();
    private final int DEFAULT_BACKGROUND_RES_ID = R.drawable.default_background;

    private Activity mActivity;
    private BackgroundManager mBackgroundManager;
    private static Drawable mDefaultBackground;

    public SimpleBackgroundManager(Activity activity) {
        this.mActivity = mActivity;
        mDefaultBackground = activity.getDrawable(DEFAULT_BACKGROUND_RES_ID);
        mBackgroundManager = BackgroundManager.getInstance(activity);
        mBackgroundManager.attach(activity.getWindow());
        activity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
    }

    public void updateBackground(Drawable drawable) {
        mBackgroundManager.setDrawable(drawable);
    }

    public void clearBackground(){
        mBackgroundManager.setDrawable(mDefaultBackground);
    }
}
