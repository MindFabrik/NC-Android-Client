
package com.owncloud.android.ui.events;

import android.content.Intent;
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
public class SyncEventFinished$$Parcelable
    implements Parcelable, ParcelWrapper<com.owncloud.android.ui.events.SyncEventFinished>
{

    private com.owncloud.android.ui.events.SyncEventFinished syncEventFinished$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<SyncEventFinished$$Parcelable>CREATOR = new Creator<SyncEventFinished$$Parcelable>() {


        @Override
        public SyncEventFinished$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new SyncEventFinished$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public SyncEventFinished$$Parcelable[] newArray(int size) {
            return new SyncEventFinished$$Parcelable[size] ;
        }

    }
    ;

    public SyncEventFinished$$Parcelable(com.owncloud.android.ui.events.SyncEventFinished syncEventFinished$$2) {
        syncEventFinished$$0 = syncEventFinished$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(syncEventFinished$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.owncloud.android.ui.events.SyncEventFinished syncEventFinished$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(syncEventFinished$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(syncEventFinished$$1));
            parcel$$1 .writeParcelable(syncEventFinished$$1 .intent, flags$$0);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.owncloud.android.ui.events.SyncEventFinished getParcel() {
        return syncEventFinished$$0;
    }

    public static com.owncloud.android.ui.events.SyncEventFinished read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.owncloud.android.ui.events.SyncEventFinished syncEventFinished$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            syncEventFinished$$4 = new com.owncloud.android.ui.events.SyncEventFinished();
            identityMap$$1 .put(reservation$$0, syncEventFinished$$4);
            syncEventFinished$$4 .intent = ((Intent) parcel$$3 .readParcelable(SyncEventFinished$$Parcelable.class.getClassLoader()));
            com.owncloud.android.ui.events.SyncEventFinished syncEventFinished$$3 = syncEventFinished$$4;
            identityMap$$1 .put(identity$$1, syncEventFinished$$3);
            return syncEventFinished$$3;
        }
    }

}
