
package com.owncloud.android.ui.fragment;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class ExtendedListFragment$SearchType$$Parcelable
    implements Parcelable, ParcelWrapper<com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType>
{

    private com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType searchType$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<ExtendedListFragment$SearchType$$Parcelable>CREATOR = new Creator<ExtendedListFragment$SearchType$$Parcelable>() {


        @Override
        public ExtendedListFragment$SearchType$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new ExtendedListFragment$SearchType$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public ExtendedListFragment$SearchType$$Parcelable[] newArray(int size) {
            return new ExtendedListFragment$SearchType$$Parcelable[size] ;
        }

    }
    ;

    public ExtendedListFragment$SearchType$$Parcelable(com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType searchType$$3) {
        searchType$$0 = searchType$$3;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(searchType$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType searchType$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(searchType$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(searchType$$1));
            com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType searchType$$2 = searchType$$1;
            parcel$$1 .writeString(((searchType$$2 == null)?null:searchType$$2 .name()));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType getParcel() {
        return searchType$$0;
    }

    public static com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            String searchType$$5 = parcel$$3 .readString();
            com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType searchType$$4 = ((searchType$$5 == null)?null:Enum.valueOf(com.owncloud.android.ui.fragment.ExtendedListFragment.SearchType.class, searchType$$5));
            identityMap$$1 .put(identity$$1, searchType$$4);
            return searchType$$4;
        }
    }

}
