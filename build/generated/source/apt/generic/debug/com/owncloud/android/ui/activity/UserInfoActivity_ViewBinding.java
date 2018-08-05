// Generated code from Butter Knife. Do not modify!
package com.owncloud.android.ui.activity;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
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

public class UserInfoActivity_ViewBinding implements Unbinder {
  private UserInfoActivity target;

  @UiThread
  public UserInfoActivity_ViewBinding(UserInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UserInfoActivity_ViewBinding(UserInfoActivity target, View source) {
    this.target = target;

    target.emptyContentContainer = Utils.findRequiredViewAsType(source, R.id.empty_list_view, "field 'emptyContentContainer'", LinearLayout.class);
    target.emptyContentMessage = Utils.findRequiredViewAsType(source, R.id.empty_list_view_text, "field 'emptyContentMessage'", TextView.class);
    target.emptyContentHeadline = Utils.findRequiredViewAsType(source, R.id.empty_list_view_headline, "field 'emptyContentHeadline'", TextView.class);
    target.emptyContentIcon = Utils.findRequiredViewAsType(source, R.id.empty_list_icon, "field 'emptyContentIcon'", ImageView.class);
    target.userInfoView = Utils.findRequiredViewAsType(source, R.id.user_info_view, "field 'userInfoView'", LinearLayout.class);
    target.avatar = Utils.findRequiredViewAsType(source, R.id.user_icon, "field 'avatar'", ImageView.class);
    target.userName = Utils.findRequiredViewAsType(source, R.id.userinfo_username, "field 'userName'", TextView.class);
    target.fullName = Utils.findRequiredViewAsType(source, R.id.userinfo_username_full, "field 'fullName'", TextView.class);
    target.mUserInfoList = Utils.findRequiredViewAsType(source, R.id.user_info_list, "field 'mUserInfoList'", RecyclerView.class);
    target.multiListProgressBar = Utils.findRequiredViewAsType(source, R.id.empty_list_progress, "field 'multiListProgressBar'", ProgressBar.class);

    Context context = source.getContext();
    Resources res = context.getResources();
    target.sorryMessage = res.getString(R.string.user_information_retrieval_error);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserInfoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emptyContentContainer = null;
    target.emptyContentMessage = null;
    target.emptyContentHeadline = null;
    target.emptyContentIcon = null;
    target.userInfoView = null;
    target.avatar = null;
    target.userName = null;
    target.fullName = null;
    target.mUserInfoList = null;
    target.multiListProgressBar = null;
  }
}
