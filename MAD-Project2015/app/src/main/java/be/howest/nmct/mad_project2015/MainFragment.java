package be.howest.nmct.mad_project2015;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;

import be.howest.nmct.mad_project2015.admin.McDonaldAdmin;
import be.howest.nmct.mad_project2015.loaders.Contract;
import be.howest.nmct.mad_project2015.loaders.McDonaldsLoader;
import be.howest.nmct.mad_project2015.models.McDonald;

/**
 * Created by Kevin on 17/05/15.
 */
public class MainFragment extends ListFragment implements LoaderManager.LoaderCallbacks<Cursor> {

    static final String ARG_PROVINCIE = "be.howest.nmct.mad_project2015.PROVINCIE";

    McDonaldAdapter mAdapter;
    OnMcDonaldListener mListener;

    String sProvincie;

    public void SetProvincie(String sProvincie){
        this.sProvincie = sProvincie;
        Bundle args = new Bundle();
        args.putString(ARG_PROVINCIE, sProvincie);
        getLoaderManager().restartLoader(0, args, this);
    }

    public interface OnMcDonaldListener{
        public void OnMcDonaldSelected(String sNaam);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mListener = (OnMcDonaldListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }

        String[] columns = new String[]{
                Contract.McDonaldColumns.COLUMN_MCDONALD_NAAM,
                Contract.McDonaldColumns.COLUMN_MCDONALD_ADRES,
                Contract.McDonaldColumns.COLUMN_MCDONALD_POSTCODE,
                Contract.McDonaldColumns.COLUMN_MCDONALD_GEMEENTE
        };

        int[] idViews = new int[]{
                R.id.txvNaam,
                R.id.txvAdres,
                R.id.txvPostcode,
                R.id.txvGemeente
        };

        mAdapter = new McDonaldAdapter(getActivity(), R.layout.row_mcdonald, null, columns, idViews, 0);
        setListAdapter(mAdapter);
        getLoaderManager().initLoader(0, null, this);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        //Vel zonder Provincie
        if(args == null)
            return new McDonaldsLoader(getActivity());
        //Vel met Provincie
        else
            return new McDonaldsLoader(getActivity(), args.getString(ARG_PROVINCIE));
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        mAdapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        mAdapter.swapCursor(null);
    }

    class McDonaldAdapter extends SimpleCursorAdapter {

        public McDonaldAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) {
            super(context, layout, c, from, to, flags);
        }

        @Override
        public void bindView(View view, Context context, Cursor cursor) {
            super.bindView(view, context, cursor);
            int colnr;

            colnr = cursor.getColumnIndex(Contract.McDonaldColumns.COLUMN_MCDONALD_NAAM);
            String sNaam = cursor.getString(colnr);
            TextView txvNaam = (TextView) view.findViewById(R.id.txvNaam);
            txvNaam.setText(sNaam);

            colnr = cursor.getColumnIndex(Contract.McDonaldColumns.COLUMN_MCDONALD_ADRES);
            String sAdres = cursor.getString(colnr);
            TextView txvAdres = (TextView) view.findViewById(R.id.txvAdres);
            txvAdres.setText(sAdres);

            colnr = cursor.getColumnIndex(Contract.McDonaldColumns.COLUMN_MCDONALD_POSTCODE);
            String sPostcode = cursor.getString(colnr);
            TextView txvPostcode = (TextView) view.findViewById(R.id.txvPostcode);
            txvPostcode.setText(sPostcode);

            colnr = cursor.getColumnIndex(Contract.McDonaldColumns.COLUMN_MCDONALD_GEMEENTE);
            String sGemeente = cursor.getString(colnr);
            TextView txvGemeente = (TextView) view.findViewById(R.id.txvGemeente);
            txvGemeente.setText(sGemeente);
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        TextView txvNaam = (TextView) v.findViewById(R.id.txvNaam);
        mListener.OnMcDonaldSelected(txvNaam.getText().toString());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        return v;
    }
}
