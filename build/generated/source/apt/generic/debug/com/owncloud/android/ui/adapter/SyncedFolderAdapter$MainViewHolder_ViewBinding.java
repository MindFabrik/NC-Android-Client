// Generated code from Butter Knife. Do not modify!
package com.owncloud.android.ui.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.owncloud.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SyncedFolderAdapter$MainViewHolder_ViewBinding implements Unbinder {
  private SyncedFolderAdapter.MainViewHolder target;

  @UiThread
  public SyncedFolderAdapter$MainViewHolder_ViewBinding(SyncedFolderAdapter.MainViewHolder target,
      View source) {
    this.target = target;

    target.image = Utils.findOptionalViewAsType(source, R.id.thumbnail, "field 'image'", ImageView.class);
    target.title = Utils.findOptionalViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.type = Utils.findOptionalViewAsType(source, R.id.type, "field 'type'", ImageView.class);
    target.menuButton = Utils.findOptionalViewAsType(source, R.id.settingsButton, "field 'menuButton'", ImageButton.class);
    target.syncStatusButton = Utils.findOptionalViewAsType(source, R.id.syncStatusButton, "field 'syncStatusButton'", ImageButton.class);
    target.counterBar = Utils.findOptionalViewAsType(source, R.id.counterLayout, "field 'counterBar'", LinearLayout.class);
    target.counterValue = Utils.findOptionalViewAsType(source, R.id.counter, "field 'counterValue'", TextView.class);
    target.thumbnailDarkener = Utils.findOptionalViewAsType(source, R.id.thumbnailDarkener, "field 'thumbnailDarkener'", ImageView.class);
    target.mainHeaderContainer = Utils.findOptionalViewAsType(source, R.id.header_container, "field 'mainHeaderContainer'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SyncedFolderAdapter.MainViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
    target.title = null;
    target.type = null;
    target.menuButton = null;
    target.syncStatusButton = null;
    target.counterBar = null;
    target.counterValue = null;
    target.thumbnailDarkener = null;
    target.mainHeaderContainer = null;
  }
}
