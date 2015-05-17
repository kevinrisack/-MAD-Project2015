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
        
        mc = new McDonald("McDo FROYENNES (Drive)", "Rue de Maire 4", "7503", "Froyennes", "Henegouwen", new LatLng(50.616456,3.375071));
        listMcDonalds.add(mc);
                
        mc = new McDonald("McDo GOSSELIES (Drive)", "Rue Tahon 16", "6041", "Gosselies", "Henegouwen", new LatLng(50.464042,4.436874));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo LA LOUVIERE (Drive)", "Rue de la Franco Belge 0", "7100", "La Louvière", "Henegouwen", new LatLng(50.486259,4.208358));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo MARCINELLE (Drive)", "Route de Philippeville 238", "6001", "Marcinelles", "Henegouwen", new LatLng(50.400396,4.452476));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo MONS (In-Store)", "Grand Place 39", "7000", "Bergen", "Henegouwen", new LatLng(50.453797,3.952336));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo MOUSCRON (Drive)", "Rue (Raymond) Beaucarne 12", "7700", "Moeskroen", "Henegouwen", new LatLng(50.744789,3.238065));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo SOIGNIES (Drive)", "Rue de Steenkerque 32", "7060", "Soignies", "Henegouwen", new LatLng(50.582500,4.071244));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo WASMÜEL-QUAREGNON (Drive)", "Rue Mouzin 133", "7390", "Wasmuel-Quaregnon", "Henegouwen", new LatLng(50.440992,3.848010));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo CHARLEROI (Drive)", "Grand'Rue 48", "6000", "Charleroi", "Henegouwen", new LatLng(50.421744,4.460607));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo ALLEUR (Drive)", "Avenue du Progès 20", "4432", "Alleur", "Luik", new LatLng(50.672047,5.529257));
        listMcDonalds.add(mc);
                
        mc = new McDonald("McDo EUPEN (Drive)", "Herbesthalerstrasse 128", "4700", "Eupen", "Luik", new LatLng(50.638669,6.016708));
        listMcDonalds.add(mc);
                
        mc = new McDonald("McDo FLERON (Drive)", "Rue de la Clef 52", "4620", "Fleron", "Luik", new LatLng(50.617693,5.694958));
        listMcDonalds.add(mc);
                
        mc = new McDonald("McDo JEMEPPE (Drive)", "Rue Renkin Sualem 0", "4101", "Jemeppe", "Luik", new LatLng(50.617323, 5.498547));
        listMcDonalds.add(mc);
                        
        mc = new McDonald("McDo LIEGE (In-Store)", "Place de la Rép. Française 31", "4000", "Luik", "Luik", new LatLng(50.643251, 5.572366));
        listMcDonalds.add(mc);
                        
        mc = new McDonald("McDo VERVIERS (Drive)", "Rue de la Station 8/27", "4800", "Verviers", "Luik", new LatLng(50.588754, 5.849415));
        listMcDonalds.add(mc);
                        
        mc = new McDonald("McDo WAREMME (Drive)", "Rue Hyacinthe Docquier 173", "4300", "Waremme", "Luik", new LatLng(50.695641, 5.276123));
        listMcDonalds.add(mc); 
                        
        mc = new McDonald("McDo WATERLOO (Drive)", "Leuvensesteenweg 2", "1410", "Waterloo", "Waals-Brabant", new LatLng(50.714690, 4.3991));
        listMcDonalds.add(mc);         
                          
        mc = new McDonald("McDo MESSANCY (Drive)", "Route d'Arlon 220", "6780", "Messancy", "Luxemburg", new LatLng(49.609620, 5.813204));
        listMcDonalds.add(mc);
                            
        mc = new McDonald("McDo MARCHE-EN FAMENNE", "Luikse Steenweg 41", "6900", "Marche-en-Famenne", "Luxemburg", new LatLng(50.235333, 5.344518));
        listMcDonalds.add(mc);
                          
        mc = new McDonald("McDo ANDERLECHT (Cora)", "Drève Olympic 15", "1070", "Anderlecht", "Brussel", new LatLng(50.819360, 4.279048));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo BASCULE (In-Store)", "Chaussé de Waterloo 717", "1180", "Brussel", "Brussel", new LatLng(50.815444, 4.366794));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo BRUXELLES/BRUSSEL (In-Store)", "Rue Neuve 124", "1000", "Brussel", "Brussel", new LatLng(50.854381, 4.3574));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo BOURSE (In-Store)", "Place de la Bourse 3", "1000", "Brussel", "Brussel", new LatLng(50.848655, 4.349291));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo IXELLES (In-Store)", "Chaussée d'Ixelles 21", "1050", "Brussel", "Brussel", new LatLng(50.837371, 4.361952));
        listMcDonalds.add(mc);
        
        mc = new McDonald("McDo DIEST (Drive)", "Leuvensesteenweg 86", "3290", "Diest", "Vlaams Brabant", new LatLng(50.975538, 5.041784));
        listMcDonalds.add(mc);        
        
        mc = new McDonald("McDo HALLE (Drive)", "De Maeghtlaan 102", "1500", "Halle", "Vlaams Brabant", new LatLng(50.736977, 4.231634));
        listMcDonalds.add(mc);         
        mc = new McDonald("McDo KAMPENHOUT (Drive)", "Mechelsesteenweg 40", "1910", "Kampenhout", "Vlaams Brabant", new LatLng(50.959433, 4.58719));
        listMcDonalds.add(mc);
                 
        mc = new McDonald("McDo LEUVEN (In-Store)", "Kortestraat 7-9", "3000", "Leuven", "Vlaams Brabant", new LatLng(50.878903, 4.700204));
        listMcDonalds.add(mc);  
               
        mc = new McDonald("McDo OVERIJSE (Drive)", "Brusselsesteenweg 406", "3090", "Overijse", "Vlaams Brabant", new LatLng(50.785848, 4.500371));
        listMcDonalds.add(mc); 
                
        mc = new McDonald("McDo SINT-PIETERS-LEEUW (Drive)", "Bergensesteenweg 65", "1600", "Sint-Pieters-Leeuw", "Vlaams Brabant", new LatLng(50.803385, 4.288906));
        listMcDonalds.add(mc);  
               
        mc = new McDonald("McDo GROOT-BIJGAARDEN (Drive)", "Robert Dansaertlaan 11", "1702", "Groot-Bijgaarden", "Vlaams Brabant", new LatLng(50.867109, 4.274291));
        listMcDonalds.add(mc);       
                       
        mc = new McDonald("McDo HASSELT (Drive)", "Schampbergstraat 22", "3511", "Hasselt", "Limburg", new LatLng(50.938795, 5.302053));
        listMcDonalds.add(mc);   
                               
        mc = new McDonald("McDo HOUTHALEN  (Drive)", "Grote Baan 36", "3530", "Houthalen", "Limburg", new LatLng(51.024472, 5.375363));
        listMcDonalds.add(mc);  
                              
        mc = new McDonald("McDo LOMMEL (Drive)", "Buitensingel 50", "3920", "Lommel", "Limburg", new LatLng(51.221881, 5.315632));
        listMcDonalds.add(mc); 
                               
        mc = new McDonald("McDo MAASMECHELEN  (Drive)", "Layensweg 8", "3630", "Maasmechelen", "Limburg", new LatLng(50.984790, 5.700529));
        listMcDonalds.add(mc);
                                
        mc = new McDonald("McDo BILZEN (Drive)", "Tongersestraat 83", "3740", "Bilzen", "Limburg", new LatLng(50.859567, 5.500802));
        listMcDonalds.add(mc); 
                               
        mc = new McDonald("McDo NAMUR (In-Store)", "Avenue de la Gare 11", "5000", "Namen", "Namen", new LatLng(50.468201, 4.864439));
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
