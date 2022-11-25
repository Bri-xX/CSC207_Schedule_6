package database;

import com.mongodb.Mongo;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import entity.CommonScheduleItem;
import entity.CommonTask;
import net.fortuna.ical4j.transform.calendar.CancelTransformer;
import requestModel.ScheduleItemRequestModel;
import requestModel.TaskRequestModel;
import useCaseInteractor.DataAccess;

import java.net.UnknownHostException;
import java.util.ArrayList;

public class MongoDBAccess implements DataAccess {

    private final MongoClient mongoClient;

    public MongoDBAccess(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public void savetoDB(ScheduleItemRequestModel requestModel) {
        // needs to find the user to save to

    }

    @Override
    public ArrayList<CommonScheduleItem> getUserSchedule(ScheduleItemRequestModel requestModel) {
        return null;
    }

    @Override
    public ArrayList<CommonTask> getUserTask(TaskRequestModel requestModel) {
        return null;
    }

    @Override
    public void deleteFromDB(ScheduleItemRequestModel requestModel) {

    }
}