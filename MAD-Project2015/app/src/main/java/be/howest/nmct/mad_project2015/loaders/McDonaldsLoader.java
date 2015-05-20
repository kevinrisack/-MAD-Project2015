package be.howest.nmct.mad_project2015.loaders;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.BaseColumns;

import be.howest.nmct.mad_project2015.admin.McDonaldAdmin;
import be.howest.nmct.mad_project2015.models.McDonald;

/**
 * Created by Kevin on 17/05/15.
 */
public class McDonaldsLoader extends AsyncTaskLoader<Cursor> {

    String sProvincie;

    private Cursor mCursor;

    private final String[] mColumnNames = new String[]{
            BaseColumns._ID,
            Contract.McDonaldColumns.COLUMN_MCDONALD_NAAM,
            Contract.McDonaldColumns.COLUMN_MCDONALD_ADRES,
            Contract.McDonaldColumns.COLUMN_MCDONALD_POSTCODE,
            Contract.McDonaldColumns.COLUMN_MCDONALD_GEMEENTE,
            Contract.McDonaldColumns.COLUMN_MCDONALD_PROVINCIE,
            Contract.McDonaldColumns.COLUMN_MCDONALD_POSITION
    };

    private static Object lock = new Object();

    public McDonaldsLoader(Context context){
        super(context);
    }

    public McDonaldsLoader(Context context, String sProvincie){
        super(context);
        this.sProvincie = sProvincie;
    }

    @Override
    protected void onStartLoading() {
        if(mCursor != null){
            deliverResult(mCursor);
        }
        if(takeContentChanged() || mCursor == null) {
            forceLoad();
        }
    }

    @Override
    public Cursor loadInBackground() {
        if(mCursor == null){
            loadCursor();
        }
        return mCursor;
    }

    private void loadCursor(){
        synchronized (lock){
            if (mCursor != null) return;

            MatrixCursor cursor = new MatrixCursor(mColumnNames);
            int id=1;

            if(sProvincie == null)
                for(McDonald mcDonald : McDonaldAdmin.getMcDonalds()) {
                    MatrixCursor.RowBuilder row = cursor.newRow();
                    row.add(id);
                    row.add(mcDonald.getsNaam());
                    row.add(mcDonald.getsAdres());
                    row.add(mcDonald.getsPostcode());
                    row.add(mcDonald.getsGemeente());
                    row.add(mcDonald.getsProvincie());
                    row.add(mcDonald.getlPosition());
                    id++;
            }
            else
                for(McDonald mcDonald : McDonaldAdmin.getMcDonalds(sProvincie)) {
                    MatrixCursor.RowBuilder row = cursor.newRow();
                    row.add(id);
                    row.add(mcDonald.getsNaam());
                    row.add(mcDonald.getsAdres());
                    row.add(mcDonald.getsPostcode());
                    row.add(mcDonald.getsGemeente());
                    row.add(mcDonald.getsProvincie());
                    row.add(mcDonald.getlPosition());
                    id++;
                }

            mCursor = cursor;
        }
    }
}
