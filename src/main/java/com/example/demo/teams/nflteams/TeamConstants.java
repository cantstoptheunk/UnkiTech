package com.example.demo.teams.nflteams;

import java.util.HashMap;
import java.util.Map;

public class TeamConstants {

    /* AFC EAST */
    public static final String AFC_EAST = "AFC EAST";
    public static final String NEW_ENGLAND = "New England";
    public static final String PATRIOTS = "Patriots";
    public static final String NE = "NE";
    public static final String NEW_YORK = "New York";
    public static final String JETS = "Patriots";
    public static final String NYJ = "NYJ";
    public static final String BUFFALO = "Buffalo";
    public static final String BILLS = "Bills";
    public static final String BUF = "BUF";
    public static final String MIAMI = "Miami";
    public static final String DOLPHINS = "Dolphins";
    public static final String MIA = "MIA";
    public static final Map<String, String> AFC_EAST_MAP = new HashMap<String, String>(){{
        put(PATRIOTS, NEW_ENGLAND);
        put(JETS, NEW_YORK);
        put(BILLS, BUFFALO);
        put(DOLPHINS, MIAMI);
    }};

    /* AFC NORTH */
    public static final String AFC_NORTH = "AFC NORTH";
    public static final String BALTIMORE = "Baltimore";
    public static final String RAVENS = "Ravens";
    public static final String BAL = "BAL";
    public static final String CINCINNATI = "Cincinnati";
    public static final String BENGALS = "Bengals";
    public static final String CIN = "CIN";
    public static final String PITTSBURGH = "Pittsburgh";
    public static final String STEELERS = "Steelers";
    public static final String PIT = "PIT";
    public static final String CLEVELAND = "Cleveland";
    public static final String BROWNS = "Browns";
    public static final String CLE = "CLE";
    public static final Map<String, String> AFC_NORTH_MAP = new HashMap<String, String>(){{
        put(RAVENS, BALTIMORE);
        put(BENGALS, CINCINNATI);
        put(BROWNS, CLEVELAND);
        put(STEELERS, PITTSBURGH);
    }};

    /* AFC SOUTH */
    public static final String AFC_SOUTH = "AFC SOUTH";
    public static final String TENNESSEE = "Tennessee";
    public static final String TITANS = "Titans";
    public static final String TEN = "TEN";
    public static final String HOUSTON = "Houston";
    public static final String TEXANS = "Texans";
    public static final String HOU = "HOU";
    public static final String INDIANAPOLIS = "Indianapolis";
    public static final String COLTS = "Colts";
    public static final String IND = "IND";
    public static final String JACKSONVILLE = "Jacksonville";
    public static final String JAGUARS = "Jaguars";
    public static final String JAX = "CLE";
    public static final Map<String, String> AFC_SOUTH_MAP = new HashMap<String, String>(){{
        put(TITANS, TENNESSEE);
        put(TEXANS, HOUSTON);
        put(COLTS, INDIANAPOLIS);
        put(JAGUARS, JACKSONVILLE);
    }};

    /* AFC WEST */
    public static final String AFC_WEST = "AFC WEST";
    public static final String KANSAS_CITY = "Kansas City";
    public static final String CHIEFS = "Chiefs";
    public static final String KC = "KC";
    public static final String LOS_ANGELES = "Los Angeles";
    public static final String CHARGERS = "Chargers";
    public static final String LAC = "LAC";
    public static final String DENVER = "Denver";
    public static final String BRONCOS = "Broncos";
    public static final String DEN = "DEN";
    public static final String OAKLAND = "Oakland";
    public static final String RAIDERS = "Raiders";
    public static final String OAK = "OAK";
    public static final Map<String, String> AFC_WEST_MAP = new HashMap<String, String>(){{
        put(CHARGERS, LOS_ANGELES);
        put(CHIEFS, KANSAS_CITY);
        put(BRONCOS, DENVER);
        put(RAIDERS, OAKLAND);
    }};

    /* NFC EAST */
    public static final String NFC_EAST = "NFC EAST";
    public static final String GIANTS = "Giants";
    public static final String NYG = "NYG";
    public static final String PHILADELPHIA = "Philadelphia";
    public static final String EAGLES = "Eagles";
    public static final String PHI = "PHI";
    public static final String WASHINGTON = "Washington";
    public static final String REDSKINS = "Redskins";
    public static final String WAS = "WAS";
    public static final String DALLAS = "Dallas";
    public static final String COWBOYS = "Cowboys";
    public static final String DAL = "DAL";
    public static final Map<String, String> NFC_EAST_MAP = new HashMap<String, String>(){{
        put(GIANTS, NEW_YORK);
        put(EAGLES, PHILADELPHIA);
        put(REDSKINS, WASHINGTON);
        put(COWBOYS, DALLAS);
    }};

    /* NFC NORTH */
    public static final String NFC_NORTH = "NFC NORTH";
    public static final String GREEN_BAY = "Green Bay";
    public static final String PACKERS = "Packers";
    public static final String GB = "GB";
    public static final String CHICAGO = "Chicago";
    public static final String BEARS = "Bears";
    public static final String CHI = "CHI";
    public static final String DETROIT = "Detroit";
    public static final String LIONS = "Lions";
    public static final String DET = "DET";
    public static final String MINNESOTA = "Minnesota";
    public static final String VIKINGS = "Vikings";
    public static final String MIN = "MIN";
    public static final Map<String, String> NFC_NORTH_MAP = new HashMap<String, String>(){{
        put(PACKERS, GREEN_BAY);
        put(BEARS, CHICAGO);
        put(LIONS, DETROIT);
        put(VIKINGS, MINNESOTA);
    }};


    /* NFC SOUTH */
    public static final String NFC_SOUTH = "NFC SOUTH";
    public static final String ATLANTA = "Atlanta";
    public static final String FALCONS = "Falcons";
    public static final String ATL = "ATL";
    public static final String CAROLINA = "Carolina";
    public static final String PANTHERS = "Panthers";
    public static final String CAR = "CAR";
    public static final String NEW_ORLEANS = "New Orleans";
    public static final String SAINTS = "Saints";
    public static final String NO = "NO";
    public static final String TAMPA_BAY = "Tampa Bay";
    public static final String BUCCANEERS = "Buccaneers";
    public static final String TB = "TB";
    public static final Map<String, String> NFC_SOUTH_MAP = new HashMap<String, String>(){{
        put(FALCONS, ATLANTA);
        put(PANTHERS, CAROLINA);
        put(SAINTS, NEW_ORLEANS);
        put(BUCCANEERS, TAMPA_BAY);
    }};

    /* NFC WEST */
    public static final String NFC_WEST = "NFC WEST";
    public static final String ARIZONA = "Arizona";
    public static final String CARDINALS = "Cardinals";
    public static final String AZ = "AZ";
    public static final String SAN_FRAN = "San Francisco";
    public static final String FORTY_NINERS = "49ers";
    public static final String SF = "SF";
    public static final String RAMS = "Rams";
    public static final String LAR = "LAR";
    public static final String SEATTLE = "Seattle";
    public static final String SEAHAWKS = "Seahawks";
    public static final String SEA = "SEA";
    public static final Map<String, String> NFC_WEST_MAP = new HashMap<String, String>(){{
        put(CARDINALS, ARIZONA);
        put(FORTY_NINERS, SAN_FRAN);
        put(RAMS, LOS_ANGELES);
        put(SEAHAWKS, SEATTLE);
    }};

    public static final Map<String, String> NFL_TEAMS_MAP = new HashMap<String, String>() {{
        put(PATRIOTS, NEW_ENGLAND);
        put(JETS, NEW_YORK);
        put(BILLS, BUFFALO);
        put(DOLPHINS, MIAMI);
        put(RAVENS, BALTIMORE);
        put(BENGALS, CINCINNATI);
        put(BROWNS, CLEVELAND);
        put(STEELERS, PITTSBURGH);
        put(TITANS, TENNESSEE);
        put(TEXANS, HOUSTON);
        put(COLTS, INDIANAPOLIS);
        put(JAGUARS, JACKSONVILLE);
        put(CHARGERS, LOS_ANGELES);
        put(CHIEFS, KANSAS_CITY);
        put(BRONCOS, DENVER);
        put(RAIDERS, OAKLAND);
        put(GIANTS, NEW_YORK);
        put(EAGLES, PHILADELPHIA);
        put(REDSKINS, WASHINGTON);
        put(COWBOYS, DALLAS);
        put(PACKERS, GREEN_BAY);
        put(BEARS, CHICAGO);
        put(LIONS, DETROIT);
        put(VIKINGS, MINNESOTA);
        put(FALCONS, ATLANTA);
        put(PANTHERS, CAROLINA);
        put(SAINTS, NEW_ORLEANS);
        put(BUCCANEERS, TAMPA_BAY);
        put(CARDINALS, ARIZONA);
        put(FORTY_NINERS, SAN_FRAN);
        put(RAMS, LOS_ANGELES);
        put(SEAHAWKS, SEATTLE);
    }};
}
