package be.howest.nmct.mad_project2015.loaders;

import android.provider.BaseColumns;

/**
 * Created by Kevin on 17/05/15.
 */
public final class Contract {

    public interface McDonaldColumns extends BaseColumns{
        public static final String COLUMN_MCDONALD_NAAM = "mcdonald_naam";
        public static final String COLUMN_MCDONALD_ADRES = "mcdonald_adres";
        public static final String COLUMN_MCDONALD_POSTCODE = "mcdonald_postcode";
        public static final String COLUMN_MCDONALD_GEMEENTE = "mcdonald_gemeente";
        public static final String COLUMN_MCDONALD_PROVINCIE = "mcdonald_provincie";
        public static final String COLUMN_MCDONALD_POSITION = "mcdonald_position";
    }

}
