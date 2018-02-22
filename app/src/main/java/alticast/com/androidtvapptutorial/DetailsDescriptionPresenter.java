package alticast.com.androidtvapptutorial;

import android.support.v17.leanback.widget.AbstractDetailsDescriptionPresenter;

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
class DetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter{
    @Override
    protected void onBindDescription(ViewHolder vh, Object item) {
        Movie movie = (Movie) item;
        if (movie != null) {
            vh.getTitle().setText(movie.getTitle());
            vh.getSubtitle().setText(movie.getStudio());
            vh.getBody().setText(movie.getDescription());
        }
    }
}
