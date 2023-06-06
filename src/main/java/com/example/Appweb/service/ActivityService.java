package com.example.Appweb.service;
import com.example.Appweb.entities.Activity;

import java.util.List;

public interface ActivityService {
    Activity createActivity(Activity activity);
    Activity updateActivity(Activity activity);
    void deleteActivity(Integer activityId);
    Activity getActivityById(Integer activityId);
    List<Activity> getAllActivities();
}
