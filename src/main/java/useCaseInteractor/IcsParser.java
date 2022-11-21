package useCaseInteractor;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.component.CalendarComponent;
import net.fortuna.ical4j.model.component.VEvent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class IcsParser {
    private List<CalendarComponent> components;

    public IcsParser(FileInputStream in){
        CalendarBuilder builder = new CalendarBuilder();
        try{
            Calendar calendar = builder.build(in);
            this.components = calendar.getComponents();
        }
        catch(IOException | ParserException e){
            e.printStackTrace();
        }
    }

    public ArrayList<String> getTitles(){
        ArrayList<String> titles = new ArrayList<>();
        for (CalendarComponent component:this.components) {
            if (component instanceof VEvent) {
                String eventTitle = String.valueOf(component.getProperty(Property.SUMMARY));
                titles.add(eventTitle);
            }
        }
        return titles;
    }

    public ArrayList<String> getStartDates(){
        ArrayList<String> stDates = new ArrayList<>();
        for (CalendarComponent component:this.components) {
            if (component instanceof VEvent) {
                String eventSt = String.valueOf(component.getProperty(Property.DTSTART));
                stDates.add(eventSt);
            }
        }
        return stDates;
    }

    public ArrayList<String> getEndDates(){
        ArrayList<String> endDates = new ArrayList<>();
        for (CalendarComponent component:this.components) {
            if (component instanceof VEvent) {
                String eventEnd = String.valueOf(component.getProperty(Property.DTEND));
                endDates.add(eventEnd);
            }
        }
        return endDates;
    }

}
