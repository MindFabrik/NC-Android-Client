
package com.owncloud.android.datamodel;

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
public class DecryptedPushMessage$$Parcelable
    implements Parcelable, ParcelWrapper<com.owncloud.android.datamodel.DecryptedPushMessage>
{

    private com.owncloud.android.datamodel.DecryptedPushMessage decryptedPushMessage$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<DecryptedPushMessage$$Parcelable>CREATOR = new Creator<DecryptedPushMessage$$Parcelable>() {


        @Override
        public DecryptedPushMessage$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new DecryptedPushMessage$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public DecryptedPushMessage$$Parcelable[] newArray(int size) {
            return new DecryptedPushMessage$$Parcelable[size] ;
        }

    }
    ;

    public DecryptedPushMessage$$Parcelable(com.owncloud.android.datamodel.DecryptedPushMessage decryptedPushMessage$$2) {
        decryptedPushMessage$$0 = decryptedPushMessage$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(decryptedPushMessage$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.owncloud.android.datamodel.DecryptedPushMessage decryptedPushMessage$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(decryptedPushMessage$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(decryptedPushMessage$$1));
            parcel$$1 .writeString(decryptedPushMessage$$1 .app);
            parcel$$1 .writeString(decryptedPushMessage$$1 .subject);
            parcel$$1 .writeString(decryptedPushMessage$$1 .id);
            parcel$$1 .writeString(decryptedPushMessage$$1 .type);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.owncloud.android.datamodel.DecryptedPushMessage getParcel() {
        return decryptedPushMessage$$0;
    }

    public static com.owncloud.android.datamodel.DecryptedPushMessage read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.owncloud.android.datamodel.DecryptedPushMessage decryptedPushMessage$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            decryptedPushMessage$$4 = new com.owncloud.android.datamodel.DecryptedPushMessage();
            identityMap$$1 .put(reservation$$0, decryptedPushMessage$$4);
            decryptedPushMessage$$4 .app = parcel$$3 .readString();
            decryptedPushMessage$$4 .subject = parcel$$3 .readString();
            decryptedPushMessage$$4 .id = parcel$$3 .readString();
            decryptedPushMessage$$4 .type = parcel$$3 .readString();
            com.owncloud.android.datamodel.DecryptedPushMessage decryptedPushMessage$$3 = decryptedPushMessage$$4;
            identityMap$$1 .put(identity$$1, decryptedPushMessage$$3);
            return decryptedPushMessage$$3;
        }
    }

}
