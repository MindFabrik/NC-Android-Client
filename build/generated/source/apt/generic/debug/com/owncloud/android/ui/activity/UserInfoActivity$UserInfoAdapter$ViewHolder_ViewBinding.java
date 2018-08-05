// Generated code from Butter Knife. Do not modify!
package com.owncloud.android.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.owncloud.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserInfoActivity$UserInfoAdapter$ViewHolder_ViewBinding implements Unbinder {
  private UserInfoActivity.UserInfoAdapter.ViewHolder target;

  @UiThread
  public UserInfoActivity$UserInfoAdapter$ViewHolder_ViewBinding(UserInfoActivity.UserInfoAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.icon = Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
    target.text = Utils.findRequiredViewAsType(source, R.id.text, "field 'text'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UserInfoActivity.UserInfoAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.icon = null;
    target.text = null;
  }
}
