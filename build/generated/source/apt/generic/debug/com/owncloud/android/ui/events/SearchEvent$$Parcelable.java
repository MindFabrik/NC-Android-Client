
package com.owncloud.android.ui.events;

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
public class SearchEvent$$Parcelable
    implements Parcelable, ParcelWrapper<com.owncloud.android.ui.events.SearchEvent>
{

    private com.owncloud.android.ui.events.SearchEvent searchEvent$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<SearchEvent$$Parcelable>CREATOR = new Creator<SearchEvent$$Parcelable>() {


        @Override
        public SearchEvent$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new SearchEvent$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public SearchEvent$$Parcelable[] newArray(int size) {
            return new SearchEvent$$Parcelable[size] ;
        }

    }
    ;

    public SearchEvent$$Parcelable(com.owncloud.android.ui.events.SearchEvent searchEvent$$2) {
        searchEvent$$0 = searchEvent$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(searchEvent$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.owncloud.android.ui.events.SearchEvent searchEvent$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(searchEvent$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(searchEvent$$1));
            com.owncloud.android.lib.resources.files.SearchOperation.SearchType searchType$$0 = searchEvent$$1 .searchType;
            parcel$$1 .writeString(((searchType$$0 == null)?null:searchType$$0 .name()));
            parcel$$1 .writeString(searchEvent$$1 .searchQuery);
            com.owncloud.android.ui.events.SearchEvent.UnsetType unsetType$$0 = searchEvent$$1 .unsetType;
            parcel$$1 .writeString(((unsetType$$0 == null)?null:unsetType$$0 .name()));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.owncloud.android.ui.events.SearchEvent getParcel() {
        return searchEvent$$0;
    }

    public static com.owncloud.android.ui.events.SearchEvent read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.owncloud.android.ui.events.SearchEvent searchEvent$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            searchEvent$$4 = new com.owncloud.android.ui.events.SearchEvent();
            identityMap$$1 .put(reservation$$0, searchEvent$$4);
            String searchType$$1 = parcel$$3 .readString();
            searchEvent$$4 .searchType = ((searchType$$1 == null)?null:Enum.valueOf(com.owncloud.android.lib.resources.files.SearchOperation.SearchType.class, searchType$$1));
            searchEvent$$4 .searchQuery = parcel$$3 .readString();
            String unsetType$$1 = parcel$$3 .readString();
            searchEvent$$4 .unsetType = ((unsetType$$1 == null)?null:Enum.valueOf(com.owncloud.android.ui.events.SearchEvent.UnsetType.class, unsetType$$1));
            com.owncloud.android.ui.events.SearchEvent searchEvent$$3 = searchEvent$$4;
            identityMap$$1 .put(identity$$1, searchEvent$$3);
            return searchEvent$$3;
        }
    }

}
