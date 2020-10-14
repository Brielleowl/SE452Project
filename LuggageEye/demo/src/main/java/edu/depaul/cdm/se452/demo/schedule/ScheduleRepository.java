package edu.depaul.cdm.se452.demo.schedule;
import org.springframework.data.repository.CrudRepository;


public interface ScheduleRepository extends CrudRepository<Schedule,Long>{
        Schedule findBy(String code);
;}
