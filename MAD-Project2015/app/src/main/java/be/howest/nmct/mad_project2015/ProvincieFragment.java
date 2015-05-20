package be.howest.nmct.mad_project2015;


import android.app.Activity;
import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import be.howest.nmct.mad_project2015.admin.McDonaldAdmin;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProvincieFragment extends ListFragment {

    static final String ARG_PROVINCIE = "be.howest.nmct.mad_project2015.PROVINCIE";

    ProvincieAdapter mAdapter;
    OnProvincieListener mListener;

    String sSelectedProvincie; int iSelectedProvincie = 999;

    public ProvincieFragment() {
        // Required empty public constructor
    }

    public static ProvincieFragment newInstance(String sProvincie){
        ProvincieFragment fragment = new ProvincieFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PROVINCIE, sProvincie);
        fragment.setArguments(args);
        return fragment;
    }

    public interface OnProvincieListener{
        public void OnProvincieSelected(String sProvincie);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mListener = (OnProvincieListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null)
            sSelectedProvincie = getArguments().getString(ARG_PROVINCIE);

        mAdapter = new ProvincieAdapter();
        setListAdapter(mAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_provincie, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(iSelectedProvincie != 999) {
            View oldV = l.getChildAt(iSelectedProvincie);
            oldV.setBackgroundColor(Color.parseColor("#E50000"));
        }

        iSelectedProvincie = position; sSelectedProvincie = McDonaldAdmin.getProvincies().get(position);
        v.setBackgroundColor(Color.parseColor("#B20000"));

        mListener.OnProvincieSelected(sSelectedProvincie);
    }

    class ProvincieAdapter extends ArrayAdapter<String> {
        public ProvincieAdapter() {
            super(getActivity(), R.layout.row_provincie, R.id.txvNaamProvincie, McDonaldAdmin.getProvincies());
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = super.getView(position, convertView, parent);

            TextView txvNaamProvincie = (TextView) v.findViewById(R.id.txvNaamProvincie);
            String sNaamProvincie = McDonaldAdmin.getProvincies().get(position);
            txvNaamProvincie.setText(sNaamProvincie);

            ImageView imgProvincie = (ImageView) v.findViewById(R.id.imgProvincie);
            imgProvincie.setImageResource(getResourceId(sNaamProvincie));

            return v;
        }

        private int getResourceId(String sNaamProvincie) {
            switch (sNaamProvincie){
                case "Antwerpen": return R.mipmap.antwerpen;
                case "West-Vlaanderen": return R.mipmap.west_vlaanderen;
                case "Oost-Vlaanderen": return R.mipmap.oost_vlaanderen;
                case "Henegouwen": return R.mipmap.henegouwen;
                case "Luik": return R.mipmap.luik;
                case "Waals-Brabant": return R.mipmap.waals_brabant;
                case "Luxemburg": return R.mipmap.luxemburg;
                case "Brussel": return R.mipmap.brussel;
                case "Vlaams-Brabant": return R.mipmap.vlaams_brabant;
                case "Limburg": return R.mipmap.limburg;
                case "Namen": return R.mipmap.namen;
                default: return 0;
            }
        }
    }
}
