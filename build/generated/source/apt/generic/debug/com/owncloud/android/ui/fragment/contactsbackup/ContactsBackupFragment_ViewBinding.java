// Generated code from Butter Knife. Do not modify!
package com.owncloud.android.ui.fragment.contactsbackup;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.owncloud.android.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ContactsBackupFragment_ViewBinding implements Unbinder {
  private ContactsBackupFragment target;

  private View view2131820748;

  private View view2131820747;

  @UiThread
  public ContactsBackupFragment_ViewBinding(final ContactsBackupFragment target, View source) {
    this.target = target;

    View view;
    target.backupSwitch = Utils.findRequiredViewAsType(source, R.id.contacts_automatic_backup, "field 'backupSwitch'", SwitchCompat.class);
    view = Utils.findRequiredView(source, R.id.contacts_datepicker, "field 'contactsDatePickerBtn' and method 'openCleanDate'");
    target.contactsDatePickerBtn = Utils.castView(view, R.id.contacts_datepicker, "field 'contactsDatePickerBtn'", AppCompatButton.class);
    view2131820748 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openCleanDate();
      }
    });
    target.lastBackup = Utils.findRequiredViewAsType(source, R.id.contacts_last_backup_timestamp, "field 'lastBackup'", TextView.class);
    view = Utils.findRequiredView(source, R.id.contacts_backup_now, "method 'backupContacts'");
    view2131820747 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.backupContacts();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ContactsBackupFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.backupSwitch = null;
    target.contactsDatePickerBtn = null;
    target.lastBackup = null;

    view2131820748.setOnClickListener(null);
    view2131820748 = null;
    view2131820747.setOnClickListener(null);
    view2131820747 = null;
  }
}
