package io.springbatch.springbatchlecture;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component  //JobRunner를 빈 등록
@RequiredArgsConstructor
public class JobRunner implements ApplicationRunner {

    //job을 실행시키는 클래스
    private final JobLauncher jobLauncher;

    //Bean 주입
    private final Job job;

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        JobParameters jobParameters = new JobParametersBuilder()
//                .addString("name", "user1")
//                .toJobParameters();
//
//        jobLauncher.run(job, jobParameters);  //두개의 인자 전달
//
//        /*
//         A job instance already exists and is complete for parameters={name=user1}.  If you want to run this job again, change the parameters
//         이미 실행된 JobInstance 에 대해서 예외처리한다.
//         */
//
//    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("name", "user1")
                .addLong("seq", 2L)
                .addDate("date", new Date())
                .addDouble("age", 16.5)
                .toJobParameters();

        jobLauncher.run(job, jobParameters);  //두개의 인자 전달

        /*
         A job instance already exists and is complete for parameters={name=user1}.  If you want to run this job again, change the parameters
         이미 실행된 JobInstance 에 대해서 예외처리한다.
         */

        /*
        애플리케이션 jar 실행하는 방법
        java -jar .jar name=user1 seq(long)=2L date(date)=2022/01/01 age(double)=16.5
         */

    }
}
