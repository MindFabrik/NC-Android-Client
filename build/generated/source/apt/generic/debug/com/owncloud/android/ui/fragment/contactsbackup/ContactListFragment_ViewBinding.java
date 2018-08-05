// Generated code from Butter Knife. Do not modify!
package com.owncloud.android.ui.fragment.contactsbackup;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.owncloud.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ContactListFragment_ViewBinding implements Unbinder {
  private ContactListFragment target;

  @UiThread
  public ContactListFragment_ViewBinding(ContactListFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.contactlist_recyclerview, "field 'recyclerView'", RecyclerView.class);
    target.restoreContactsContainer = Utils.findRequiredViewAsType(source, R.id.contactlist_restore_selected_container, "field 'restoreContactsContainer'", LinearLayout.class);
    target.restoreContacts = Utils.findRequiredViewAsType(source, R.id.contactlist_restore_selected, "field 'restoreContacts'", Button.class);
    target.emptyContentMessage = Utils.findRequiredViewAsType(source, R.id.empty_list_view_text, "field 'emptyContentMessage'", TextView.class);
    target.emptyContentHeadline = Utils.findRequiredViewAsType(source, R.id.empty_list_view_headline, "field 'emptyContentHeadline'", TextView.class);
    target.emptyContentIcon = Utils.findRequiredViewAsType(source, R.id.empty_list_icon, "field 'emptyContentIcon'", ImageView.class);
    target.emptyContentProgressBar = Utils.findRequiredViewAsType(source, R.id.empty_list_progress, "field 'emptyContentProgressBar'", ProgressBar.class);
    target.emptyListContainer = Utils.findRequiredViewAsType(source, R.id.empty_list_container, "field 'emptyListContainer'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ContactListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.restoreContactsContainer = null;
    target.restoreContacts = null;
    target.emptyContentMessage = null;
    target.emptyContentHeadline = null;
    target.emptyContentIcon = null;
    target.emptyContentProgressBar = null;
    target.emptyListContainer = null;
  }
}
