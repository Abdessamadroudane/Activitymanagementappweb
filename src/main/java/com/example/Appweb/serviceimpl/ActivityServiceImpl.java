package com.example.Appweb.serviceimpl;
import com.example.Appweb.entities.Activity;
import com.example.Appweb.repositories.ActivityRepository;
import com.example.Appweb.service.ActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    private final ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Activity updateActivity(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public void deleteActivity(Integer activityId) {
        activityRepository.deleteById(activityId);
    }

    @Override
    public Activity getActivityById(Integer activityId) {
        return activityRepository.findById(activityId).orElse(null);
    }

    @Override
    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }
}
