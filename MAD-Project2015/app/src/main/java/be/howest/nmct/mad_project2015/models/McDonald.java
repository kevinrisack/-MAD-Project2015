package be.howest.nmct.mad_project2015.models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Kevin on 17/05/15.
 */
public class McDonald {
    String sNaam;
    String sAdres;
    String sPostcode;
    String sGemeente;
    String sProvincie;
    LatLng lPosition;

    public String getsNaam() {
        return sNaam;
    }

    public void setsNaam(String sNaam) {
        this.sNaam = sNaam;
    }

    public String getsAdres() {
        return sAdres;
    }

    public void setsAdres(String sAdres) {
        this.sAdres = sAdres;
    }

    public String getsPostcode() {
        return sPostcode;
    }

    public void setsPostcode(String sPostcode) {
        this.sPostcode = sPostcode;
    }

    public String getsGemeente() {
        return sGemeente;
    }

    public void setsGemeente(String sGemeente) {
        this.sGemeente = sGemeente;
    }

    public LatLng getlPosition() {
        return lPosition;
    }

    public void setlPosition(LatLng lPosition) {
        this.lPosition = lPosition;
    }

    public String getsProvincie() {

        return sProvincie;
    }

    public void setsProvincie(String sProvincie) {
        this.sProvincie = sProvincie;
    }

    public McDonald(String sNaam, String sAdres, String sPostcode, String sGemeente, String sProvincie, LatLng lPosition) {

        this.sNaam = sNaam;
        this.sAdres = sAdres;
        this.sPostcode = sPostcode;
        this.sGemeente = sGemeente;
        this.sProvincie = sProvincie;
        this.lPosition = lPosition;
    }
}
