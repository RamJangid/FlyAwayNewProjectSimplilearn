package main.java.model;

public abstract class Search {
    public static String date_of_travel;
    public static String source_place;
    public static String destination_place;
    public static int persons;

    public static String getQuery() {
        //return "SELECT * FROM flight_details_done WHERE source_place = 'Bangalore India' AND destination_place='Newyork City' AND date_of_travel='23-10-2022'";
        
    	System.out.println(date_of_travel+" "+source_place+" "+destination_place);
    	//return "SELECT * FROM flight_details_done WHERE source_place = '"+source_place+"' AND destination_place='"+destination_place+"' AND date_of_travel='"+date_of_travel+"'";
    	
    	return "SELECT * FROM flight_details_done WHERE source_place = 'Bangalore India' AND destination_place='Newyork City' AND date_of_travel='2022-10-23'";
    }
}
