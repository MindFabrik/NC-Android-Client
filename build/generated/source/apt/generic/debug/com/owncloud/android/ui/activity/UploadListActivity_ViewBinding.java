// Generated code from Butter Knife. Do not modify!
package com.owncloud.android.ui.activity;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.owncloud.android.R;
import com.owncloud.android.ui.EmptyRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UploadListActivity_ViewBinding implements Unbinder {
  private UploadListActivity target;

  @UiThread
  public UploadListActivity_ViewBinding(UploadListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public UploadListActivity_ViewBinding(UploadListActivity target, View source) {
    this.target = target;

    target.emptyContentMessage = Utils.findRequiredViewAsType(source, R.id.empty_list_view_text, "field 'emptyContentMessage'", TextView.class);
    target.emptyContentHeadline = Utils.findRequiredViewAsType(source, R.id.empty_list_view_headline, "field 'emptyContentHeadline'", TextView.class);
    target.emptyContentIcon = Utils.findRequiredViewAsType(source, R.id.empty_list_icon, "field 'emptyContentIcon'", ImageView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, android.R.id.list, "field 'recyclerView'", EmptyRecyclerView.class);

    Context context = source.getContext();
    Resources res = context.getResources();
    target.noResultsHeadline = res.getString(R.string.upload_list_empty_headline);
    target.noResultsMessage = res.getString(R.string.upload_list_empty_text_auto_upload);
  }

  @Override
  @CallSuper
  public void unbind() {
    UploadListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emptyContentMessage = null;
    target.emptyContentHeadline = null;
    target.emptyContentIcon = null;
    target.recyclerView = null;
  }
}
