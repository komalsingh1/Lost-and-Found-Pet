package com.example.android.pets.data;
import android.provider.BaseColumns;

/**
 * Created by komal on 11/8/2018.
 */

public final class PetContract {

    // To prevent someone from accidentally instantiating the contract class,initialize an empty constructor

    private PetContract() {}
    public static final class PetEntry implements BaseColumns {

        //Name of Database Table
        public final static String TABLE_NAME = "pets";
        //Unique ID Number
        public final  static String _ID=BaseColumns._ID;
        //Name of the pet
        public final static String COLUMN_PET_NAME ="name";
        //breed of the pet
        public final String COLUMN_PET_BREED="breed";
        //Gender of the pet
        public final String COLUMN_PET_Gender="gender";
        //Weight of the pet
        public final String COLUMN_PET_WEIGHT="weight";
        //Possible values for the gender of the pet.

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
