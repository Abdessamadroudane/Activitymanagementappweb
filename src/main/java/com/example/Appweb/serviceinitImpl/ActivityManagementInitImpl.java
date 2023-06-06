package com.example.Appweb.serviceinitImpl;


import com.example.Appweb.entities.*;
import com.example.Appweb.repositories.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ActivityManagementInitImpl implements ActivityManagementInitService {

    private final ActivityRepository activityRepository;
    private final ProjectRepository projectRepository;
    private final TaskRepository taskRepository;
    private final TeamRepository teamRepository;
    private final UserRepository userRepository;
    private final KpiRepository kpiRepository;
    private final KpiValueRepository kpiValueRepository;
    private final RetexRepository retexRepository;
    private final SubTeamRepository subTeamRepository;
    private final RoleRepository roleRepository;

    public ActivityManagementInitImpl(ActivityRepository activityRepository, ProjectRepository projectRepository, TaskRepository taskRepository, TeamRepository teamRepository, UserRepository userRepository, KpiRepository kpiRepository, KpiValueRepository kpiValueRepository, RetexRepository retexRepository, SubTeamRepository subTeamRepository, RoleRepository roleRepository) {
        this.activityRepository = activityRepository;
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
        this.teamRepository = teamRepository;
        this.userRepository = userRepository;
        this.kpiRepository = kpiRepository;
        this.kpiValueRepository = kpiValueRepository;
        this.retexRepository = retexRepository;
        this.subTeamRepository = subTeamRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void initUser() {
        Team team1 = new Team();
        team1.setName("Safety");
        teamRepository.save(team1);

        Team team2 = new Team();
        team2.setName("RS");
        teamRepository.save(team2);

        Team team3 = new Team();
        team3.setName("FUSA");
        teamRepository.save(team3);

        Team team4 = new Team();
        team4.setName("BRS");
        teamRepository.save(team4);

        Role role1 = new Role();
        role1.setName("Admin");

        Role role2 = new Role();
        role2.setName("Manager");

        Role role3 = new Role();
        role3.setName("Consultant");

        roleRepository.saveAll(Arrays.asList(role1, role2 ,role3));

        User user1 = new User();
        user1.setName("ABDESSAMAD");
        user1.setLogin("aroudane");
        user1.setPassword("123456");

        User user2 = new User();
        user2.setName("ISMAIL");
        user2.setLogin("iroudane");
        user2.setPassword("654321");

        User user3 = new User();
        user3.setName("KARIM");
        user3.setLogin("rkarim");
        user3.setPassword("654321");

        User user4 = new User();
        user4.setName("YOUSSEF");
        user4.setLogin("tyoussef");
        user4.setPassword("654321");

        Team t = teamRepository.findByName("Safety");
        if (t != null) {
            user1.setTeam(t);
        }
        Team t2 = teamRepository.findByName("RS");
        if (t2 != null) {
            user2.setTeam(t2);
        }
        Team t3 = teamRepository.findByName("FUSA");
        if (t3 != null) {
            user3.setTeam(t3);
        }
        Team t4 = teamRepository.findByName("BRS");
        if (t4 != null) {
            user4.setTeam(t4);
        }

        Role admin = roleRepository.findByName("Admin");
        if (admin != null) {
            user1.setRole(admin);
            user3.setRole(admin);
        }

        Role consultant = roleRepository.findByName("Consultant");
        if (consultant != null) {
            user2.setRole(consultant);
            user4.setRole(consultant);
        }


        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4));
    }

    @Override
    public void initTeam() {

    }

    @Override
    public void initTask() {
        User user1 = userRepository.findById(1).orElse(null);
        User user2 = userRepository.findById(2).orElse(null);

        Project project1 = projectRepository.findById(1).orElse(null);
        Task task1 = new Task();
        task1.setName("Conception et modélisation");
        task1.setStart_date("2023-05-26");
        task1.setEnd_date("2023-06-05");
        task1.setTitle("Web site project");
        task1.setAssign(user1);
        task1.setProject(project1);

        Project project2 = projectRepository.findById(2).orElse(null);
        Task task2 = new Task();
        task2.setName("devloppement app web");
        task2.setStart_date("2023-06-01");
        task2.setEnd_date("2023-06-15");
        task2.setTitle("app web project");
        task2.setAssign(user2);
        task2.setProject(project2);

        taskRepository.saveAll(Arrays.asList(task1, task2));

    }

    @Override
    public void initSubTeam() {
        SubTeam subTeam1 = new SubTeam();
        subTeam1.setMission("Elaborer le cahier de charge");

        SubTeam subTeam2 = new SubTeam();
        subTeam2.setMission("Analyser les besoins");

        Team team = teamRepository.findById(1).orElse(null);
        if (team != null) {
            subTeam1.setTeam(team);
            subTeam2.setTeam(team);
        }

        Activity activity = activityRepository.findById(1);
        if (activity != null) {
            subTeam1.setActivity(activity);
            subTeam2.setActivity(activity);
        }

        subTeamRepository.saveAll(Arrays.asList(subTeam1, subTeam2));
    }

    @Override
    public void initRole() {

    }

    @Override
    public void initRetex() {
        Retex retex1 = new Retex();
        retex1.setDescription("Nice");

        Retex retex2 = new Retex();
        retex2.setDescription("Good");

        User user1 = userRepository.findById(1).orElse(null);
        User user2 = userRepository.findById(2).orElse(null);

        Project project1 = projectRepository.findById(1).orElse(null);
        Project project2 = projectRepository.findById(2).orElse(null);

        retex1.setUser(user1);
        retex1.setProject(project1);

        retex2.setUser(user2);
        retex2.setProject(project2);

        retexRepository.saveAll(Arrays.asList(retex1, retex2));
    }

    @Override
    public void initProject() {
        Project project1 = new Project();
        project1.setName("Renault project");
        project1.setTitle("creation site web achat");
        project1.setStart_date("2023-01-01");
        project1.setEnd_date("2023-12-30");
        projectRepository.save(project1);

        Project project2 = new Project();
        project2.setName("Maserati project");
        project2.setTitle("creation app web suivie commande");
        project2.setStart_date("2022-01-01");
        project2.setEnd_date("2023-10-30");
        projectRepository.save(project2);
    }

    @Override
    public void initKpiValue() {
        KpiValue kpiValue1 = new KpiValue();
        kpiValue1.setRate(80.0);
        kpiValue1.setPeriod("03/2023");

        KpiValue kpiValue2 = new KpiValue();
        kpiValue2.setRate(90.0);
        kpiValue2.setPeriod("02/2023");

        kpiValueRepository.saveAll(Arrays.asList(kpiValue1, kpiValue2));
    }

    @Override
    public void initKpi() {
        Kpi kpi1 = new Kpi();
        kpi1.setName("KPI team FUSA");
        kpi1.setDescription("indicateur cle de performance");
        kpi1.setType("Type du KPI 1");

        Kpi kpi2 = new Kpi();
        kpi2.setName("KPI team RS");
        kpi2.setDescription("indicateur cle de performance");
        kpi2.setType("Type du KPI 2");

        Activity activity = activityRepository.findById(1);
        if (activity != null) {
            kpi1.setActivity(activity);
            kpi2.setActivity(activity);
        }

        kpiRepository.saveAll(Arrays.asList(kpi1, kpi2));
    }


    @Override
    public void initActivity() {

        Activity activity1 = new Activity();
        activity1.setDesc_activity("engineering");
        activity1.setName("safety");
        activity1.setCapitalisation("URL1");

        Activity activity2 = new Activity();
        activity2.setDesc_activity("financial");
        activity2.setName("FUSA");
        activity2.setCapitalisation("URL2");
        activityRepository.saveAll(Arrays.asList(activity1, activity2));


    }


}
