package be.howest.nmct.mad_project2015.admin;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import be.howest.nmct.mad_project2015.models.McDonald;

/**
 * Created by Kevin on 17/05/15.
 */
public final class McDonaldAdmin {
    private static List<McDonald> listMcDonalds;
    static{
        listMcDonalds = new ArrayList<McDonald>(); McDonald mc;

        mc = new McDonald("McDo AARTSELAAR (Drive)", "Antwerpsesteenweg 29", "2630", "Aartselaar", "Antwerpen", new LatLng(51.142750,4.378502));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo ANTWERPEN (In-Store)", "De Keyserlei 58-60", "2000", "Antwerpen", "Antwerpen", new LatLng(51.217408,4.419184));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo ANTWERPEN (MEIR) (In-Store)", "Teniersplaats 4", "2018", "Antwerpen", "Antwerpen", new LatLng(51.218008,4.415194));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo ANTWERPEN (GROENPLAATS)", "Groenplaats 17", "2000", "Antwerpen", "Antwerpen", new LatLng(51.219610,4.401140));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo BREDABAAN (Drive)", "Bredabaan 984", "2170", "Merksem", "Antwerpen", new LatLng(51.266116,4.462861));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo BURCHT (Drive)", "Pastoor Coplaan 116", "2070", "Zwijndrecht", "Antwerpen", new LatLng(51.207659,4.337322));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo GEEL (Drive)", "Antwerpseweg 117", "2440", "Geel", "Antwerpen", new LatLng(51.143113,4.949230));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo HERENTALS (Drive)", "Augustijnenlaan 97", "2200", "Herentals", "Antwerpen", new LatLng(51.177223,4.850079));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo MECHELEN (Drive)", "Guido Gezellelaan 4", "2800", "Mechelen", "Antwerpen", new LatLng(51.033679,4.472780));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo MERKSEM I (Drive)", "Lambrechthoekenlaan 0", "2170", "Merksem", "Antwerpen", new LatLng(51.243818,4.429386));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo PUURS (Drive)", "Eikevlietbaan 62", "2870", "Puurs", "Antwerpen", new LatLng(51.082471,4.288372));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo TURNHOUT (Drive)", "Parklaan 70", "2300", "Turnhout", "Antwerpen", new LatLng(51.312382,4.949119));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo WIJNEGEM (Drive)", "Turnhoutsebaan 1", "2110", "Wijnegem", "Antwerpen", new LatLng(51.222695,4.498919));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo BRUGGE (Drive)", "Maalsesteenweg 234", "8310", "Sint-Kruis", "West-Vlaanderen", new LatLng(51.209493,3.253728));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo KNOKKE-HEIST (Drive)", "Natiënlaan 260", "8300", "Knokke-Heist", "West-Vlaanderen", new LatLng(51.317269,3.305309));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo KORTRIJK (Kinepolis)", "President Kennedylaan 100", "8500", "Kortrijk", "West-Vlaanderen", new LatLng(50.805641,3.275271));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo OOSTENDE (In-Store)", "Wapenplein 6A", "8400", "Oostende", "West-Vlaanderen", new LatLng(51.232272,2.917520));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo OOSTENDE II (Drive)", "Torhoutsesteenweg 582", "8400", "Oostende", "West-Vlaanderen", new LatLng(51.205797,2.904233));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo ROESELARE (Drive)", "Brugsesteenweg 507", "8800", "Roeselare", "West-Vlaanderen", new LatLng(50.971868,3.119521));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo KOKSIJDE (Drive)", "Robert Vandammestraat 156", "8670", "Koksijde", "West-Vlaanderen", new LatLng(51.099704,2.631617));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo BRUGGE IS", "Steenstraat 40", "8000", "Brugge", "West-Vlaanderen", new LatLng(51.207393,3.222845));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo AALST (In-Store)", "Grote Markt 15", "9300", "Aalst", "Oost-Vlaanderen", new LatLng(50.938462,4.037396));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo DENDERMONDE (Drive)", "Mechelse Steenweg 83", "9200", "Dendermonde", "Oost-Vlaanderen", new LatLng(51.025487,4.101993));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo GENT (In-Store)", "St. Michielshelling - Korenmarkt 1", "9000", "Gent", "Oost-Vlaanderen", new LatLng(51.054301,3.721718));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo GENT Martelaren ( Drive)", "Martelaarslaan 19", "9000", "Gent", "Oost-Vlaanderen", new LatLng(51.046970,3.710914));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo LOKEREN (Drive)", "Zelebaan 134", "9160", "Lokeren", "Oost-Vlaanderen", new LatLng(51.091383,4.017570));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo MALDEGEM (Drive)", "Koning Leopold Laan 2", "9990", "Maldegem", "Oost-Vlaanderen", new LatLng(51.203778,3.452325));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo NINOVE (Drive)", "Brakelsesteenweg 40", "9400", "Ninove", "Oost-Vlaanderen", new LatLng(50.836879,4.006447));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo SINT-NIKLAAS (Drive)", "Heidebaan 134", "9100", "Sint-Niklaas", "Oost-Vlaanderen", new LatLng(51.176900,4.190937));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo WETTEREN (Drive)", "Brusselsesteenweg 260", "9230", "Wetteren", "Oost-Vlaanderen", new LatLng(50.983054,3.847488));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo WONDELGEM (Drive)", "Waalbrugstraat 3", "9032", "Wondelgem", "Oost-Vlaanderen", new LatLng(51.101871,3.713679));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo ZINGEM (Drive)", "Kruishoutemsesteenweg 269", "9750", "Zingem", "Oost-Vlaanderen", new LatLng(50.909303,3.623668));
        listMcDonalds.add(mc);

        mc = new McDonald("McDo RONSE/RENAIX", "César Snoecklaan 51", "9600", "Ronse", "Oost-Vlaanderen", new LatLng(50.745900,3.586187));
        listMcDonalds.add(mc);
    }

    public static List<McDonald> getMcDonalds() {
        return listMcDonalds;
    }

    public static McDonald getMcDonald(String sNaam) {
        for (McDonald mcDonald : getMcDonalds()) {
            if (mcDonald.getsNaam().equals(sNaam)) return mcDonald;
        }
        return null;
    }
}
