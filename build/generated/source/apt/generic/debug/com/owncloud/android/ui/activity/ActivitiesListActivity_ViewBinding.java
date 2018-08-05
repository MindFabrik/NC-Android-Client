// Generated code from Butter Knife. Do not modify!
package com.owncloud.android.ui.activity;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.owncloud.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivitiesListActivity_ViewBinding implements Unbinder {
  private ActivitiesListActivity target;

  @UiThread
  public ActivitiesListActivity_ViewBinding(ActivitiesListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivitiesListActivity_ViewBinding(ActivitiesListActivity target, View source) {
    this.target = target;

    target.emptyContentContainer = Utils.findRequiredViewAsType(source, R.id.empty_list_view, "field 'emptyContentContainer'", LinearLayout.class);
    target.swipeListRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_containing_list, "field 'swipeListRefreshLayout'", SwipeRefreshLayout.class);
    target.swipeEmptyListRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_containing_empty, "field 'swipeEmptyListRefreshLayout'", SwipeRefreshLayout.class);
    target.emptyContentMessage = Utils.findRequiredViewAsType(source, R.id.empty_list_view_text, "field 'emptyContentMessage'", TextView.class);
    target.emptyContentHeadline = Utils.findRequiredViewAsType(source, R.id.empty_list_view_headline, "field 'emptyContentHeadline'", TextView.class);
    target.emptyContentIcon = Utils.findRequiredViewAsType(source, R.id.empty_list_icon, "field 'emptyContentIcon'", ImageView.class);
    target.emptyContentProgressBar = Utils.findRequiredViewAsType(source, R.id.empty_list_progress, "field 'emptyContentProgressBar'", ProgressBar.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, android.R.id.list, "field 'recyclerView'", RecyclerView.class);
    target.bottomNavigationView = Utils.findRequiredViewAsType(source, R.id.bottom_navigation_view, "field 'bottomNavigationView'", BottomNavigationView.class);

    Context context = source.getContext();
    Resources res = context.getResources();
    target.noResultsHeadline = res.getString(R.string.activities_no_results_headline);
    target.noResultsMessage = res.getString(R.string.activities_no_results_message);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivitiesListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emptyContentContainer = null;
    target.swipeListRefreshLayout = null;
    target.swipeEmptyListRefreshLayout = null;
    target.emptyContentMessage = null;
    target.emptyContentHeadline = null;
    target.emptyContentIcon = null;
    target.emptyContentProgressBar = null;
    target.recyclerView = null;
    target.bottomNavigationView = null;
  }
}
