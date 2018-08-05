
package com.owncloud.android.datamodel;

import android.accounts.Account;
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
public class SignatureVerification$$Parcelable
    implements Parcelable, ParcelWrapper<com.owncloud.android.datamodel.SignatureVerification>
{

    private com.owncloud.android.datamodel.SignatureVerification signatureVerification$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<SignatureVerification$$Parcelable>CREATOR = new Creator<SignatureVerification$$Parcelable>() {


        @Override
        public SignatureVerification$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new SignatureVerification$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public SignatureVerification$$Parcelable[] newArray(int size) {
            return new SignatureVerification$$Parcelable[size] ;
        }

    }
    ;

    public SignatureVerification$$Parcelable(com.owncloud.android.datamodel.SignatureVerification signatureVerification$$2) {
        signatureVerification$$0 = signatureVerification$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(signatureVerification$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.owncloud.android.datamodel.SignatureVerification signatureVerification$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(signatureVerification$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(signatureVerification$$1));
            parcel$$1 .writeInt((signatureVerification$$1 .signatureValid? 1 : 0));
            parcel$$1 .writeParcelable(signatureVerification$$1 .account, flags$$0);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.owncloud.android.datamodel.SignatureVerification getParcel() {
        return signatureVerification$$0;
    }

    public static com.owncloud.android.datamodel.SignatureVerification read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.owncloud.android.datamodel.SignatureVerification signatureVerification$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            signatureVerification$$4 = new com.owncloud.android.datamodel.SignatureVerification();
            identityMap$$1 .put(reservation$$0, signatureVerification$$4);
            signatureVerification$$4 .signatureValid = (parcel$$3 .readInt() == 1);
            signatureVerification$$4 .account = ((Account) parcel$$3 .readParcelable(SignatureVerification$$Parcelable.class.getClassLoader()));
            com.owncloud.android.datamodel.SignatureVerification signatureVerification$$3 = signatureVerification$$4;
            identityMap$$1 .put(identity$$1, signatureVerification$$3);
            return signatureVerification$$3;
        }
    }

}
